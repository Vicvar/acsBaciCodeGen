#include <SensorTag_impl.h>

/*Constructor*/
SensorTag_impl::SensorTag_impl(const ACE_CString name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(name, containerServices),
	m_temperature_sp(new ROdouble(name+":temperature",getComponent()),this),
	m_humidity_sp(new ROdouble(name+":humidity",getComponent()),this),
	m_light_sp(new ROdouble(name+":light",getComponent()),this),
	m_testProp_sp(new ROdouble(name+":testProp",getComponent()),this)
{
	ACS_TRACE("::SensorTag::SensorTag");
}

/*Destructor*/
SensorTag::~SensorTag()
{
}

/*Lyfecycle methods override*/
void SensorTag::initialize() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	// Start of user code user.initializeBehaviour
	wat= ;
	// End of user code
}

void SensorTag::execute() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
}

void SensorTag::cleanUp()
{
}

void SensorTag::aboutToAbort()
{
}

/*Properties implementation*/

ACS::ROdouble SensorTag::temperature()
{
	if(m_temperature_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_temperature_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble SensorTag::humidity()
{
	if(m_humidity_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_humidity_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble SensorTag::light()
{
	if(m_light_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_light_sp->getCORBAReference());
	return prop._retn();
}

ACS::ROdouble SensorTag::testProp()
{
	if(m_testProp_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_testProp_sp->getCORBAReference());
	return prop._retn();
}

/*Actions implementation*/
void SensorTag_impl::on()
{
	//TBI by user
}
void SensorTag_impl::off()
{
	//TBI by user
}
void SensorTag_impl::publishTemperature()
{
	//TBI by user
}
void SensorTag_impl::publishLight()
{
	//TBI by user
}
void SensorTag_impl::publishHumidity()
{
	//TBI by user
}


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(SensorTag_impl)
/* ----------------------------------------------------------------*/
