/**
 */
package baciCodeGen.BACI;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schema for CharacteristicComponents. !!! To be renamed. Obsolete name !!!
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACI.CharacteristicComponent#getActionThreadStackSize <em>Action Thread Stack Size</em>}</li>
 *   <li>{@link baciCodeGen.BACI.CharacteristicComponent#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}</li>
 *   <li>{@link baciCodeGen.BACI.CharacteristicComponent#getRecentCommand <em>Recent Command</em>}</li>
 *   <li>{@link baciCodeGen.BACI.CharacteristicComponent#getRecentTimeStamp <em>Recent Time Stamp</em>}</li>
 * </ul>
 *
 * @see baciCodeGen.BACI.BACIPackage#getCharacteristicComponent()
 * @model extendedMetaData="name='CharacteristicComponent' kind='empty'"
 * @generated
 */
public interface CharacteristicComponent extends CharacteristicModel {
	/**
	 * Returns the value of the '<em><b>Action Thread Stack Size</b></em>' attribute.
	 * The default value is <code>"1024"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stack size of for the action thread in kBytes. If 0 is specified the default OS stack size value will be taken. (just C++).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action Thread Stack Size</em>' attribute.
	 * @see #isSetActionThreadStackSize()
	 * @see #unsetActionThreadStackSize()
	 * @see #setActionThreadStackSize(BigInteger)
	 * @see baciCodeGen.BACI.BACIPackage#getCharacteristicComponent_ActionThreadStackSize()
	 * @model default="1024" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='actionThreadStackSize'"
	 * @generated
	 */
	BigInteger getActionThreadStackSize();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getActionThreadStackSize <em>Action Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Thread Stack Size</em>' attribute.
	 * @see #isSetActionThreadStackSize()
	 * @see #unsetActionThreadStackSize()
	 * @see #getActionThreadStackSize()
	 * @generated
	 */
	void setActionThreadStackSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getActionThreadStackSize <em>Action Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionThreadStackSize()
	 * @see #getActionThreadStackSize()
	 * @see #setActionThreadStackSize(BigInteger)
	 * @generated
	 */
	void unsetActionThreadStackSize();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getActionThreadStackSize <em>Action Thread Stack Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Thread Stack Size</em>' attribute is set.
	 * @see #unsetActionThreadStackSize()
	 * @see #getActionThreadStackSize()
	 * @see #setActionThreadStackSize(BigInteger)
	 * @generated
	 */
	boolean isSetActionThreadStackSize();

	/**
	 * Returns the value of the '<em><b>Monitoring Thread Stack Size</b></em>' attribute.
	 * The default value is <code>"2048"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stack size of for the monitoring thread in kBytes. If 0 is specified the default OS stack size value will be taken. (just C++).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Monitoring Thread Stack Size</em>' attribute.
	 * @see #isSetMonitoringThreadStackSize()
	 * @see #unsetMonitoringThreadStackSize()
	 * @see #setMonitoringThreadStackSize(BigInteger)
	 * @see baciCodeGen.BACI.BACIPackage#getCharacteristicComponent_MonitoringThreadStackSize()
	 * @model default="2048" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='monitoringThreadStackSize'"
	 * @generated
	 */
	BigInteger getMonitoringThreadStackSize();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Thread Stack Size</em>' attribute.
	 * @see #isSetMonitoringThreadStackSize()
	 * @see #unsetMonitoringThreadStackSize()
	 * @see #getMonitoringThreadStackSize()
	 * @generated
	 */
	void setMonitoringThreadStackSize(BigInteger value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMonitoringThreadStackSize()
	 * @see #getMonitoringThreadStackSize()
	 * @see #setMonitoringThreadStackSize(BigInteger)
	 * @generated
	 */
	void unsetMonitoringThreadStackSize();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getMonitoringThreadStackSize <em>Monitoring Thread Stack Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Monitoring Thread Stack Size</em>' attribute is set.
	 * @see #unsetMonitoringThreadStackSize()
	 * @see #getMonitoringThreadStackSize()
	 * @see #setMonitoringThreadStackSize(BigInteger)
	 * @generated
	 */
	boolean isSetMonitoringThreadStackSize();

	/**
	 * Returns the value of the '<em><b>Recent Command</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Placeholder for the of the last command executed.
	 * Note: optionally used, requires write access to the configuration database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recent Command</em>' attribute.
	 * @see #isSetRecentCommand()
	 * @see #unsetRecentCommand()
	 * @see #setRecentCommand(String)
	 * @see baciCodeGen.BACI.BACIPackage#getCharacteristicComponent_RecentCommand()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recentCommand'"
	 * @generated
	 */
	String getRecentCommand();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentCommand <em>Recent Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recent Command</em>' attribute.
	 * @see #isSetRecentCommand()
	 * @see #unsetRecentCommand()
	 * @see #getRecentCommand()
	 * @generated
	 */
	void setRecentCommand(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentCommand <em>Recent Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecentCommand()
	 * @see #getRecentCommand()
	 * @see #setRecentCommand(String)
	 * @generated
	 */
	void unsetRecentCommand();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentCommand <em>Recent Command</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recent Command</em>' attribute is set.
	 * @see #unsetRecentCommand()
	 * @see #getRecentCommand()
	 * @see #setRecentCommand(String)
	 * @generated
	 */
	boolean isSetRecentCommand();

	/**
	 * Returns the value of the '<em><b>Recent Time Stamp</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Placeholder for the timestamp of last command executed.
	 * ISO time format.
	 * Note: optionally used, requires write access to the database.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recent Time Stamp</em>' attribute.
	 * @see #isSetRecentTimeStamp()
	 * @see #unsetRecentTimeStamp()
	 * @see #setRecentTimeStamp(String)
	 * @see baciCodeGen.BACI.BACIPackage#getCharacteristicComponent_RecentTimeStamp()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='recentTimeStamp'"
	 * @generated
	 */
	String getRecentTimeStamp();

	/**
	 * Sets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentTimeStamp <em>Recent Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recent Time Stamp</em>' attribute.
	 * @see #isSetRecentTimeStamp()
	 * @see #unsetRecentTimeStamp()
	 * @see #getRecentTimeStamp()
	 * @generated
	 */
	void setRecentTimeStamp(String value);

	/**
	 * Unsets the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentTimeStamp <em>Recent Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRecentTimeStamp()
	 * @see #getRecentTimeStamp()
	 * @see #setRecentTimeStamp(String)
	 * @generated
	 */
	void unsetRecentTimeStamp();

	/**
	 * Returns whether the value of the '{@link baciCodeGen.BACI.CharacteristicComponent#getRecentTimeStamp <em>Recent Time Stamp</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Recent Time Stamp</em>' attribute is set.
	 * @see #unsetRecentTimeStamp()
	 * @see #getRecentTimeStamp()
	 * @see #setRecentTimeStamp(String)
	 * @generated
	 */
	boolean isSetRecentTimeStamp();

} // CharacteristicComponent
