/**
 */
package baciCodeGen.impl;

import baciCodeGen.AuxiliaryVariable;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CommonVariable;
import baciCodeGen.DevIO;
import baciCodeGen.PropertySpecificVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dev IO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getRequiredLibraries <em>Required Libraries</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getPropertySpecificVariables <em>Property Specific Variables</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getCommonVariables <em>Common Variables</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getAuxiliaryVariables <em>Auxiliary Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevIOImpl extends MinimalEObjectImpl.Container implements DevIO {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequiredLibraries() <em>Required Libraries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLibraries()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_LIBRARIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredLibraries() <em>Required Libraries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredLibraries()
	 * @generated
	 * @ordered
	 */
	protected String requiredLibraries = REQUIRED_LIBRARIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertySpecificVariables() <em>Property Specific Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertySpecificVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertySpecificVariable> propertySpecificVariables;

	/**
	 * The cached value of the '{@link #getCommonVariables() <em>Common Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonVariable> commonVariables;

	/**
	 * The cached value of the '{@link #getAuxiliaryVariables() <em>Auxiliary Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxiliaryVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AuxiliaryVariable> auxiliaryVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevIOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.DEV_IO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredLibraries() {
		return requiredLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredLibraries(String newRequiredLibraries) {
		String oldRequiredLibraries = requiredLibraries;
		requiredLibraries = newRequiredLibraries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO__REQUIRED_LIBRARIES, oldRequiredLibraries, requiredLibraries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertySpecificVariable> getPropertySpecificVariables() {
		if (propertySpecificVariables == null) {
			propertySpecificVariables = new EObjectContainmentEList<PropertySpecificVariable>(PropertySpecificVariable.class, this, BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES);
		}
		return propertySpecificVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommonVariable> getCommonVariables() {
		if (commonVariables == null) {
			commonVariables = new EObjectContainmentEList<CommonVariable>(CommonVariable.class, this, BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES);
		}
		return commonVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuxiliaryVariable> getAuxiliaryVariables() {
		if (auxiliaryVariables == null) {
			auxiliaryVariables = new EObjectContainmentEList<AuxiliaryVariable>(AuxiliaryVariable.class, this, BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES);
		}
		return auxiliaryVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES:
				return ((InternalEList<?>)getPropertySpecificVariables()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES:
				return ((InternalEList<?>)getCommonVariables()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES:
				return ((InternalEList<?>)getAuxiliaryVariables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__NAME:
				return getName();
			case BaciCodeGenPackage.DEV_IO__REQUIRED_LIBRARIES:
				return getRequiredLibraries();
			case BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES:
				return getPropertySpecificVariables();
			case BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES:
				return getCommonVariables();
			case BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES:
				return getAuxiliaryVariables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__REQUIRED_LIBRARIES:
				setRequiredLibraries((String)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES:
				getPropertySpecificVariables().clear();
				getPropertySpecificVariables().addAll((Collection<? extends PropertySpecificVariable>)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES:
				getCommonVariables().clear();
				getCommonVariables().addAll((Collection<? extends CommonVariable>)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES:
				getAuxiliaryVariables().clear();
				getAuxiliaryVariables().addAll((Collection<? extends AuxiliaryVariable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO__REQUIRED_LIBRARIES:
				setRequiredLibraries(REQUIRED_LIBRARIES_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES:
				getPropertySpecificVariables().clear();
				return;
			case BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES:
				getCommonVariables().clear();
				return;
			case BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES:
				getAuxiliaryVariables().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.DEV_IO__REQUIRED_LIBRARIES:
				return REQUIRED_LIBRARIES_EDEFAULT == null ? requiredLibraries != null : !REQUIRED_LIBRARIES_EDEFAULT.equals(requiredLibraries);
			case BaciCodeGenPackage.DEV_IO__PROPERTY_SPECIFIC_VARIABLES:
				return propertySpecificVariables != null && !propertySpecificVariables.isEmpty();
			case BaciCodeGenPackage.DEV_IO__COMMON_VARIABLES:
				return commonVariables != null && !commonVariables.isEmpty();
			case BaciCodeGenPackage.DEV_IO__AUXILIARY_VARIABLES:
				return auxiliaryVariables != null && !auxiliaryVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", requiredLibraries: ");
		result.append(requiredLibraries);
		result.append(')');
		return result.toString();
	}

} //DevIOImpl
