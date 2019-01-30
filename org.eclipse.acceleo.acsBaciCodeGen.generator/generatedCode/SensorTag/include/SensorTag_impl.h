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
#include <baciROdouble>
#include <mqtt_devio.h>

class SensorTag_thread;

class SensorTag_impl : public virtual POA_Sensors::SensorTag, public baci::CharacteristicComponentImpl
{
	public:
		
		/*Constructor/Destructor*/
		SensorTag_impl(const ACE_CString name, maci::ContainerServices * containerServices);
		virtual ~SensorTag_impl();
		
		/*Lifecycle methods*/
		virtual void initialize(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void execute(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void cleanUp(void);
		virtual void aboutToAbort(void);

		/*Properties*/
		ACS::ROdouble_ptr temperature()
		ACS::ROdouble_ptr humidity()
		ACS::ROdouble_ptr light()
		ACS::ROdouble_ptr testProp()

		/*Actions*/
		void on();
		void off();
		void publishTemperature();
		void publishLight();
		void publishHumidity();
	
	private:
		/*Smart Property Pointers*/
		baci::SmartPropertyPointer<baci::ROdouble> m_temperature_sp;
		baci::SmartPropertyPointer<baci::ROdouble> m_humidity_sp;
		baci::SmartPropertyPointer<baci::ROdouble> m_light_sp;
		baci::SmartPropertyPointer<baci::ROdouble> m_testProp_sp;

		/*DevIO read*/
		mqtt::mqtt_read * temperature_devio_m;
		mqtt::mqtt_read * humidity_devio_m;
		mqtt::mqtt_read * light_devio_m;
		mqtt::mqtt_read * testProp_devio_m;
		
		/*DevIO write*/
		mqtt::mqtt_write * temperature_devio_w;
		mqtt::mqtt_write * humidity_devio_w;
		mqtt::mqtt_write * light_devio_w;
		mqtt::mqtt_write * testProp_devio_w;

		/*DevIO variables*/
		
};

#endif //_SENSORTAG_IMPL_H_
