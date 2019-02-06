#include <testComp_impl.h>

/*Constructor*/
testComp_impl::testComp_impl(const ACE_CString c_name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(c_name, containerServices),
	m_p1_sp(this)
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
	/***DevIO: testDevIO
	/**Auxiliary variables
	 *(std::string) av1;
	/**Common Variables
	 *(std::string) v1;
	/***Property Specific Variables
	 *(std::string) r_p1_clientName;
	 *(someNs::node) w_p1_somethingElse;
	 */
	
	/**DevIO: testDevIO**/
	/*Aux variables*/
	av1= "we";
	/*Common Variables*/
	v1= "123";

	//Start of user code Required Variables
	
	//End of user code
	
	/*Property initialization*/
	
	p1_devio_m = new testDevIO::testDevIO_read(v1, r_clientName_p1);

	
	p1_devio_w = new testDevIO::testDevIO_write(v1, w_somethingElse_p1);

	
	m_p1_sp = new baci::ROboolean((component_name+":p1").c_str(), getComponent(), p1_devio_m);


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
	delete p1_devio_m;
	delete p1_devio_w;

	//Start of user code cleanUp implementation
	
	//End of user code
}

void testComp_impl::aboutToAbort()
{
	//Start of user code aboutToAbort implementation
	
	//End of user code
}

/*Properties implementation*/

ACS::ROboolean_ptr testComp_impl::p1()
{
	if(m_p1_sp == 0)
		return ACS::ROboolean::_nil();
	ACS::ROboolean_var prop = ACS::ROboolean::_narrow(m_p1_sp->getCORBAReference());
	return prop._retn();
}

/*Actions implementation*/


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(testComp_impl)
/* ----------------------------------------------------------------*/
