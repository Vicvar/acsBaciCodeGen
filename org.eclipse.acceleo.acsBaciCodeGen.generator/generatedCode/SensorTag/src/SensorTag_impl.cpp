#include <SensorTag_impl.h>

/*Constructor*/
SensorTag_impl::SensorTag_impl(const ACE_CString c_name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(c_name, containerServices),
	m_temperature_sp(this),
	m_humidity_sp(this),
	m_light_sp(this)
{
	component_name=c_name.c_str();
	ACS_TRACE("::SensorTag::SensorTag");
}

/*Destructor*/
SensorTag_impl::~SensorTag_impl()
{
}

/*Lyfecycle methods override*/
void SensorTag_impl::initialize() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	/* Property specific variables to be initialized
	 *std::string r_temperature_componentName
	 *std::string r_temperature_clientName
	 *std::string w_temperature_componentName
	 *std::string w_temperature_clientName
	 *std::string r_humidity_componentName
	 *std::string r_humidity_clientName
	 *std::string w_humidity_componentName
	 *std::string w_humidity_clientName
	 *std::string r_light_componentName
	 *std::string r_light_clientName
	 *std::string w_light_componentName
	 *std::string w_light_clientName
	 */

	//Start of user code Required Variables
	//for example
	std::string componentBroker;
	std::string clientName;

	std::string r_temperature_componentName;
	std::string r_temperature_clientName;
	std::string w_temperature_componentName;
	std::string w_temperature_clientName;
	std::string r_humidity_componentName;
	std::string r_humidity_clientName;
	std::string w_humidity_componentName;
	std::string w_humidity_clientName;
	std::string r_light_componentName;
	std::string r_light_clientName;
	std::string w_light_componentName;
	std::string w_light_clientName;

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
		if (!(*characteristic>>=clientName))
		{
			ACS_SHORT_LOG((LM_ERROR,"Error getting client_name by the CORBA::Any object"));
		}
	}
	catch (...)
	{
		ACS_SHORT_LOG((LM_ERROR,"Error reading the characteristic broker by its name"));
	}
	//End of user code
	
	/*Property initialization*/
	
	temperature_devio_m = new mqtt::mqtt_read(componentBroker, r_temperature_componentName, r_temperature_clientName);
	
	humidity_devio_m = new mqtt::mqtt_read(componentBroker, r_humidity_componentName, r_humidity_clientName);
	
	light_devio_m = new mqtt::mqtt_read(componentBroker, r_light_componentName, r_light_clientName);

	
	temperature_devio_w = new mqtt::mqtt_write(componentBroker, w_temperature_componentName, w_temperature_clientName);
	
	humidity_devio_w = new mqtt::mqtt_write(componentBroker, w_humidity_componentName, w_humidity_clientName);
	
	light_devio_w = new mqtt::mqtt_write(componentBroker, w_light_componentName, w_light_clientName);

	
	m_temperature_sp = new baci::ROdouble((component_name+":temperature").c_str(), getComponent(), temperature_devio_m);
	
	m_humidity_sp = new baci::ROdouble((component_name+":humidity").c_str(), getComponent(), humidity_devio_m);
	
	m_light_sp = new baci::ROdouble((component_name+":light").c_str(), getComponent(), light_devio_m);


	//Start of user code initialize implementation
	
	//End of user code
}

void SensorTag_impl::execute() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	//Start of user code execute implementation
	
	//End of user code
}

void SensorTag_impl::cleanUp()
{
	//Start of user code cleanUp implementation
	
	//End of user code
}

void SensorTag_impl::aboutToAbort()
{
	//Start of user code aboutToAbort implementation
	
	//End of user code
}

/*Properties implementation*/

ACS::ROdouble_ptr SensorTag_impl::temperature()
{
	if(m_temperature_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_temperature_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble_ptr SensorTag_impl::humidity()
{
	if(m_humidity_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_humidity_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble_ptr SensorTag_impl::light()
{
	if(m_light_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_light_sp->getCORBAReference());
	return prop._retn();
}

/*Actions implementation*/
void SensorTag_impl::on()
{
	//Start of user code Action implementation
	
	//End of user code
}
void SensorTag_impl::off()
{
	//Start of user code Action implementation
	
	//End of user code
}
void SensorTag_impl::publishTemperature()
{
	//Start of user code Action implementation
	
	//End of user code
}
void SensorTag_impl::publishLight()
{
	//Start of user code Action implementation
	
	//End of user code
}
void SensorTag_impl::publishHumidity()
{
	//Start of user code Action implementation
	
	//End of user code
}


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(SensorTag_impl)
/* ----------------------------------------------------------------*/
