#include <testComp_impl.h>

/*Constructor*/
testComp_impl::testComp_impl(const ACE_CString c_name, maci::ContainerServices * containerServices):
	CharacteristicComponentImpl(c_name, containerServices)
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
	 **Property specific
	 */

	//Start of user code Required Variables
	
	//End of user code
	
	/*Property initialization*/




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

	//Start of user code cleanUp implementation
	
	//End of user code
}

void testComp_impl::aboutToAbort()
{
	//Start of user code aboutToAbort implementation
	
	//End of user code
}

/*Properties implementation*/

/*Actions implementation*/


/* --------------- [ MACI DLL support functions ] -----------------*/
#include <maciACSComponentDefines.h>
MACI_DLL_SUPPORT_FUNCTIONS(testComp_impl)
/* ----------------------------------------------------------------*/
