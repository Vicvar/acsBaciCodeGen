/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.DevIO;
import baciCodeGen.DevIOVariable;
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
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getDevIOVariables <em>Dev IO Variables</em>}</li>
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
	 * The cached value of the '{@link #getDevIOVariables() <em>Dev IO Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevIOVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<DevIOVariable> devIOVariables;

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
	public EList<DevIOVariable> getDevIOVariables() {
		if (devIOVariables == null) {
			devIOVariables = new EObjectContainmentEList<DevIOVariable>(DevIOVariable.class, this, BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES);
		}
		return devIOVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES:
				return ((InternalEList<?>)getDevIOVariables()).basicRemove(otherEnd, msgs);
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
			case BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES:
				return getDevIOVariables();
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
			case BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES:
				getDevIOVariables().clear();
				getDevIOVariables().addAll((Collection<? extends DevIOVariable>)newValue);
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
			case BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES:
				getDevIOVariables().clear();
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
			case BaciCodeGenPackage.DEV_IO__DEV_IO_VARIABLES:
				return devIOVariables != null && !devIOVariables.isEmpty();
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
