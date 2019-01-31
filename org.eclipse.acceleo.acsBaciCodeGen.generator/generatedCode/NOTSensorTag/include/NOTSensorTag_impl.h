#ifndef _NOTSENSORTAG_IMPL_H_
#define _NOTSENSORTAG_IMPL_H_

#include <NOTSensorTagS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>
#include <acsThread.h>
#include <baciROdouble.h>
#include <mqtt_devio.h>

class NOTSensorTag_thread;

class NOTSensorTag_impl : public virtual POA_Sensors::NOTSensorTag, public baci::CharacteristicComponentImpl
{
	public:
		
		/*Constructor/Destructor*/
		NOTSensorTag_impl(const ACE_CString c_name, maci::ContainerServices * containerServices);
		virtual ~NOTSensorTag_impl();
		
		/*Lifecycle methods*/
		virtual void initialize(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void execute(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void cleanUp(void);
		virtual void aboutToAbort(void);

		/*Properties*/
		ACS::ROdouble_ptr temperature();
		ACS::ROdouble_ptr humidity();
		ACS::ROdouble_ptr light();

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

		/*DevIO read*/
		mqtt::mqtt_read * temperature_devio_m;
		mqtt::mqtt_read * humidity_devio_m;
		mqtt::mqtt_read * light_devio_m;
		
		/*DevIO write*/
		mqtt::mqtt_write * temperature_devio_w;
		mqtt::mqtt_write * humidity_devio_w;
		mqtt::mqtt_write * light_devio_w;

		/*Aux variables*/
		std::string component_name;
};

#endif //_NOTSENSORTAG_IMPL_H_
