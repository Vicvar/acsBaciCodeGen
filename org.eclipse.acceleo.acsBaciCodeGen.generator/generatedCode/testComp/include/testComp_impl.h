#ifndef _TESTCOMP_IMPL_H_
#define _TESTCOMP_IMPL_H_

#include <testCompS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>
#include <baciROdouble.h>
#include <mqtt_devio.h>
#include <_devio.h>

class testComp_impl : public virtual POA_TEST::testComp, public baci::CharacteristicComponentImpl
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
		ACS::ROdouble_ptr testProp();

		/*Actions*/
	
	private:
		/*Smart Property Pointers*/
		baci::SmartPropertyPointer<baci::ROdouble> m_testProp_sp;

		/*DevIO read*/
		mqtt::mqtt_read * testProp_devio_m;
		
		/*DevIO write*/
		mqtt::mqtt_write * testProp_devio_w;

		std::string component_name; //static variable to initialize smart pointers
		
		/*DevIO: mqtt*/
		/*Aux variables*/
		std::string clientID;

		/*Common Variables*/
		std::string componentBroker;
		/*DevIO: */
		/*Aux variables*/

		/*Common Variables*/

		/*Property Specific Variables*/
		
		std::string r_testProp_componentName;
		std::string w_testProp_componentName;
		std::string r_testProp_clientName;
		std::string w_testProp_clientName;
		
};

#endif //_TESTCOMP_IMPL_H_
