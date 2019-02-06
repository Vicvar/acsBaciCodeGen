#ifndef _TESTCOMP_IMPL_H_
#define _TESTCOMP_IMPL_H_

#include <testCompS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>

class testComp_impl : public virtual POA_::testComp, public baci::CharacteristicComponentImpl
{
	public:
		
		/*Constructor/Destructor*/
		testComp_impl(const ACE_CString c_name, maci::ContainerServices * containerServices);
		virtual ~testComp_impl();
		
		/*Lifecycle methods*/
		virtual void initialize(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void execute(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void cleanUp(void);
		virtual void aboutToAbort(void);

		/*Properties*/

		/*Actions*/
	
	private:
		/*Smart Property Pointers*/

		/*DevIO read*/
		
		/*DevIO write*/

		/*Aux variables*/
		std::string component_name;
};

#endif //_TESTCOMP_IMPL_H_
