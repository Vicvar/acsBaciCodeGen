#include <CosmeFulanito_impl.h>

/*Constructor*/
CosmeFulanito_impl::CosmeFulanito_impl(const ACE_CString c_name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(c_name, containerServices),
	m_temperature_sp(this),
	m_humidity_sp(this),
	m_light_sp(this),
	m_lala_sp(this)
{
	component_name=c_name.c_str();
	ACS_TRACE("::CosmeFulanito::CosmeFulanito");
}

/*Destructor*/
CosmeFulanito_impl::~CosmeFulanito_impl()
{
}

/*Lyfecycle methods override*/
void CosmeFulanito_impl::initialize() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	/*Suggested variables to be initialized
	 ***DevIO: mqtt****
	 **Auxiliary variables:**
	 *(std::string) clientID;
	 **Common Variables:**
	 *(std::string) componentBroker;
	 ***Property Specific Variables:***
	
	 *r_temperature_componentName;
	 *w_temperature_componentName;
	 *r_temperature_clientName;
	 *w_temperature_clientName;
	 *r_humidity_componentName;
	 *w_humidity_componentName;
	 *r_humidity_clientName;
	 *w_humidity_clientName;
	 *r_light_componentName;
	 *w_light_componentName;
	 *r_light_clientName;
	 *w_light_clientName;
	 *r_lala_componentName;
	 *w_lala_componentName;
	 *r_lala_clientName;
	 *w_lala_clientName;
	 */
	
	/**DevIO: mqtt**/
	/*Aux variables*/
	/*Common Variables*/

	//Start of user code Required Variables
	try
	{
		CORBA::Any* characteristic = get_characteristic_by_name("broker");
		if (!(*characteristic>>=componentBroker))
		{
			ACS_SHORT_LOG((LM_ERROR,"Error getting broker by the CORBA::Any object"));
		}
	}
	catch (...)
	{
		ACS_SHORT_LOG((LM_ERROR,"Error reading the characteristic broker by its name"));
	}
	/* get client_id from CDB */
	try
	{
		CORBA::Any* characteristic = get_characteristic_by_name("client_id");
		if (!(*characteristic>>=clientID))
		{
			ACS_SHORT_LOG((LM_ERROR,"Error getting client_name by the CORBA::Any object"));
		}
	}
	catch (...)
	{
		ACS_SHORT_LOG((LM_ERROR,"Error reading the characteristic broker by its name"));
	}

	r_temperature_componentName=(component_name + "/temperature").c_str();
	r_temperature_clientName=clientID + "/temperature/r";
	w_temperature_componentName=("w/" + component_name + "/temperature").c_str();
	w_temperature_clientName=clientID + "/temperature/w";
	r_humidity_componentName=(component_name  + "/humidity").c_str();
	r_humidity_clientName=clientID + "/humidity/r";
	w_humidity_componentName=("w/" + component_name + "/humidity").c_str();
	w_humidity_clientName=clientID + "/humidity/w";
	r_light_componentName=(component_name +  "/light").c_str();
	r_light_clientName=clientID + "/light/r";
	w_light_componentName=("w/" + component_name + "/light").c_str();
	w_light_clientName=clientID + "/light/w";
	r_lala_componentName=("w/" + component_name + "/light").c_str();
	w_lala_componentName=("w/" + component_name + "/light").c_str();
	r_lala_clientName=clientID + "/lala/r";
	w_lala_clientName=clientID + "/lala/w";

	//End of user code
	
	/*Property initialization*/
	
	temperature_devio_m = new mqtt::mqtt_read(componentBroker, r_temperature_componentName, r_temperature_clientName);
	
	humidity_devio_m = new mqtt::mqtt_read(componentBroker, r_humidity_componentName, r_humidity_clientName);
	
	light_devio_m = new mqtt::mqtt_read(componentBroker, r_light_componentName, r_light_clientName);
	
	lala_devio_m = new mqtt::mqtt_read(componentBroker, r_lala_componentName, r_lala_clientName);

	
	temperature_devio_w = new mqtt::mqtt_write(componentBroker, w_temperature_componentName, w_temperature_clientName);
	
	humidity_devio_w = new mqtt::mqtt_write(componentBroker, w_humidity_componentName, w_humidity_clientName);
	
	light_devio_w = new mqtt::mqtt_write(componentBroker, w_light_componentName, w_light_clientName);
	
	lala_devio_w = new mqtt::mqtt_write(componentBroker, w_lala_componentName, w_lala_clientName);

	
	m_temperature_sp = new baci::ROdouble((component_name+":temperature").c_str(), getComponent(), temperature_devio_m);
	
	m_humidity_sp = new baci::ROdouble((component_name+":humidity").c_str(), getComponent(), humidity_devio_m);
	
	m_light_sp = new baci::ROdouble((component_name+":light").c_str(), getComponent(), light_devio_m);
	
	m_lala_sp = new baci::ROdouble((component_name+":lala").c_str(), getComponent(), lala_devio_m);


	//Start of user code initialize implementation
	
	//End of user code
}

void CosmeFulanito_impl::execute() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	//Start of user code execute implementation
	
	//End of user code
}

void CosmeFulanito_impl::cleanUp()
{
	delete temperature_devio_m;
	delete temperature_devio_w;
	delete humidity_devio_m;
	delete humidity_devio_w;
	delete light_devio_m;
	delete light_devio_w;
	delete lala_devio_m;
	delete lala_devio_w;

	//Start of user code cleanUp implementation
	
	//End of user code
}

void CosmeFulanito_impl::aboutToAbort()
{
	//Start of user code aboutToAbort implementation
	
	//End of user code
}

/*Properties implementation*/

ACS::ROdouble_ptr CosmeFulanito_impl::temperature()
{
	if(m_temperature_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_temperature_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble_ptr CosmeFulanito_impl::humidity()
{
	if(m_humidity_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_humidity_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble_ptr CosmeFulanito_impl::light()
{
	if(m_light_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_light_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble_ptr CosmeFulanito_impl::lala()
{
	if(m_lala_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_lala_sp->getCORBAReference());
	return prop._retn();
}

/*Actions implementation*/
void CosmeFulanito_impl::on()
{
	//Start of user code on Action implementation

	//End of user code
}
void CosmeFulanito_impl::off()
{
	//Start of user code off Action implementation

	//End of user code
}
void CosmeFulanito_impl::publishTemperature()
{
	//Start of user code publishTemperature Action implementation
	temperature_devio_w->publish("Temperature message");
	//End of user code
}
void CosmeFulanito_impl::publishLight()
{
	//Start of user code publishLight Action implementation
	light_devio_w->publish("Light message");
	//End of user code
}
void CosmeFulanito_impl::publishHumidity()
{
	//Start of user code publishHumidity Action implementation
	humidity_devio_w->publish("Humidity message");
	//End of user code
}


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(CosmeFulanito_impl)
/* ----------------------------------------------------------------*/
