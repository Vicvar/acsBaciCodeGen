#ifndef _COSMEFULANITO_IMPL_H_
#define _COSMEFULANITO_IMPL_H_

#include <CosmeFulanitoS.h>

#include <baciCharacteristicComponentImpl.h>
#include <baciSmartPropertyPointer.h>
#include <baciDevIO.h>
#include <baciROdouble.h>
#include <mqtt_devio.h>

class CosmeFulanito_impl : public virtual POA_Sensors::CosmeFulanito, public baci::CharacteristicComponentImpl
{
	public:
		
		/*Constructor/Destructor*/
		CosmeFulanito_impl(const ACE_CString c_name, maci::ContainerServices * containerServices);
		virtual ~CosmeFulanito_impl();
		
		/*Lifecycle methods*/
		virtual void initialize(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void execute(void) throw (acsErrTypeLifeCycle::acsErrTypeLifeCycleExImpl);
		virtual void cleanUp(void);
		virtual void aboutToAbort(void);

		/*Properties*/
		ACS::ROdouble_ptr temperature();
		ACS::ROdouble_ptr humidity();
		ACS::ROdouble_ptr light();
		ACS::ROdouble_ptr lala();

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
		baci::SmartPropertyPointer<baci::ROdouble> m_lala_sp;

		/*DevIO read*/
		mqtt::mqtt_read * temperature_devio_m;
		mqtt::mqtt_read * humidity_devio_m;
		mqtt::mqtt_read * light_devio_m;
		mqtt::mqtt_read * lala_devio_m;
		
		/*DevIO write*/
		mqtt::mqtt_write * temperature_devio_w;
		mqtt::mqtt_write * humidity_devio_w;
		mqtt::mqtt_write * light_devio_w;
		mqtt::mqtt_write * lala_devio_w;

		std::string component_name; //static variable to initialize smart pointers
		
		/*DevIO: mqtt*/
		/*Aux variables*/
		std::string clientID;

		/*Common Variables*/
		std::string componentBroker;

		/*Property Specific Variables*/
		
		std::string r_temperature_componentName;
		std::string w_temperature_componentName;
		std::string r_temperature_clientName;
		std::string w_temperature_clientName;
		
		std::string r_humidity_componentName;
		std::string w_humidity_componentName;
		std::string r_humidity_clientName;
		std::string w_humidity_clientName;
		
		std::string r_light_componentName;
		std::string w_light_componentName;
		std::string r_light_clientName;
		std::string w_light_clientName;
		
		std::string r_lala_componentName;
		std::string w_lala_componentName;
		std::string r_lala_clientName;
		std::string w_lala_clientName;
		
};

#endif //_COSMEFULANITO_IMPL_H_
