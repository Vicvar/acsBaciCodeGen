#ifndef _TESTCOMP_IMPL_H_
#define _TESTCOMP_IMPL_H_

#include <testCompS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>
#include <baciROboolean.h>
#include <testDevIO_devio.h>

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
		ACS::ROboolean_ptr p1();

		/*Actions*/
	
	private:
		/*Smart Property Pointers*/
		baci::SmartPropertyPointer<baci::ROboolean> m_p1_sp;

		/*DevIO read*/
		testDevIO::testDevIO_read * p1_devio_m;
		
		/*DevIO write*/
		testDevIO::testDevIO_write * p1_devio_w;

		std::string component_name; //static variable to initialize smart pointers
		
		/*DevIO: testDevIO*/
		/*Aux variables*/
		std::string av1;

		/*Common Variables*/
		std::string v1;

		/*Property Specific Variables*/
		
		std::string r_p1_clientName;
		someNs::node w_p1_somethingElse;
		
};

#endif //_TESTCOMP_IMPL_H_
