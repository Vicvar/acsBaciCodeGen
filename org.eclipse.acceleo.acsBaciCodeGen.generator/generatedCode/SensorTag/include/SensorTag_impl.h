#ifndef _SENSORTAG_IMPL_H_
#define _SENSORTAG_IMPL_H_

#include <SensorTagS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>
#include <acsThread.h>
#include <baciROdouble>
#include <baciROdouble>
#include <baciROdouble>

class SensorTag_thread;

class SensorTag_impl : public virtual POA_Sensors::SensorTag, public baci::CharacteristicComponentImpl
{
	public:
		
		/*Constructor/Destructor*/
		SensorTag_impl(const ACE_CString name, maci::ContainerServices * containerServices);
		virtual ~SensorTag_impl();
		
		/*Properties*/
		ACS::ROdouble_ptr temperature()
		ACS::ROdouble_ptr humidity()
		ACS::ROdouble_ptr light()

		/*Actions*/
		void on();
		void off();
		void publishTemperature();
		void publishLight();
		void publishHumidity();

		/*Lifecycle methods*/
		virtual void initialize(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void execute(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void cleanUp(void);
		virtual void aboutToAbort(void);
	
	private:
		/*Smart Property Pointers*/
		baci::SmartPropertyPointer<baci::ROdouble> m_temperature_sp;
		baci::SmartPropertyPointer<baci::ROdouble> m_humidity_sp;
		baci::SmartPropertyPointer<baci::ROdouble> m_light_sp;

		/*DevIO read*/
		//TBI
		
		/*DevIO write*/
		//TBI

		/*DevIO variables*/

		SensorTag_thread * refresh_thread;
};

#endif //_SENSORTAG_IMPL_H_
