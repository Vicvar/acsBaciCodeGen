#include <testComp_impl.h>

/*Constructor*/
testComp_impl::testComp_impl(const ACE_CString c_name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(c_name, containerServices),
	m_testProp_sp(this)
{
	component_name=c_name.c_str();
	ACS_TRACE("::testComp::testComp");
}

/*Destructor*/
testComp_impl::~testComp_impl()
{
}

/*Lyfecycle methods override*/
void testComp_impl::initialize() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	/*Suggested variables to be initialized
	 ***DevIO: mqtt****
	 **Auxiliary variables:**
	 **Common Variables:**
	 ***DevIO: ****
	 **Auxiliary variables:**
	 **Common Variables:**
	 ***Property Specific Variables:***
	
	 *(std::string) r_testProp_componentName;
	 *(std::string) w_testProp_componentName;
	 *(std::string) r_testProp_clientName;
	 *(std::string) w_testProp_clientName;
	 */
	
	/**DevIO: mqtt**/
	/*Aux variables*/
	clientID= "0";
	/*Common Variables*/
	componentBroker= "tcp://localhost:1883";
	/**DevIO: **/
	/*Aux variables*/
	/*Common Variables*/

	//Start of user code Required Variables
	 r_testProp_componentName=(component_name + "/testProp").c_str();
	 w_testProp_componentName=("w/"+component_name + "/testProp").c_str();
	 r_testProp_clientName=clientID + "/testProp/r";
	 w_testProp_clientName=clientID + "/testProp/w";
	//End of user code
	
	/*Property initialization*/
	
	testProp_devio_m = new mqtt::mqtt_read(componentBroker, r_testProp_componentName, r_testProp_clientName);

	
	testProp_devio_w = new mqtt::mqtt_write(componentBroker, w_testProp_componentName, w_testProp_clientName);

	
	m_testProp_sp = new baci::ROdouble((component_name+":testProp").c_str(), getComponent(), testProp_devio_m);


	//Start of user code initialize implementation
	
	//End of user code
}

void testComp_impl::execute() throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl)
{
	//Start of user code execute implementation
	
	//End of user code
}

void testComp_impl::cleanUp()
{
	delete testProp_devio_m;
	delete testProp_devio_w;

	//Start of user code cleanUp implementation
	
	//End of user code
}

void testComp_impl::aboutToAbort()
{
	//Start of user code aboutToAbort implementation
	
	//End of user code
}

/*Properties implementation*/

ACS::ROdouble_ptr testComp_impl::testProp()
{
	if(m_testProp_sp == 0)
		return ACS::ROdouble::_nil();
	ACS::ROdouble_var prop = ACS::ROdouble::_narrow(m_testProp_sp->getCORBAReference());
	return prop._retn();
}

/*Actions implementation*/


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(testComp_impl)
/* ----------------------------------------------------------------*/
