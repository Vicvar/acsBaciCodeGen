/**
 */
package baciCodeGen.BACIProperties.util;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BACIPropertiesXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BACIPropertiesXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BACIPropertiesPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BACIPropertiesResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BACIPropertiesResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BACIPropertiesResourceFactoryImpl());
		}
		return registrations;
	}

} //BACIPropertiesXMLProcessor
