/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CommonArgument;
import baciCodeGen.DevIO;
import baciCodeGen.ReadArgument;
import baciCodeGen.WriteArgument;
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
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getReadArguments <em>Read Arguments</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getWriteArguments <em>Write Arguments</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOImpl#getCommonArguments <em>Common Arguments</em>}</li>
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
	 * The cached value of the '{@link #getReadArguments() <em>Read Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ReadArgument> readArguments;

	/**
	 * The cached value of the '{@link #getWriteArguments() <em>Write Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<WriteArgument> writeArguments;

	/**
	 * The cached value of the '{@link #getCommonArguments() <em>Common Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonArgument> commonArguments;

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
	public EList<ReadArgument> getReadArguments() {
		if (readArguments == null) {
			readArguments = new EObjectContainmentEList<ReadArgument>(ReadArgument.class, this, BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS);
		}
		return readArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WriteArgument> getWriteArguments() {
		if (writeArguments == null) {
			writeArguments = new EObjectContainmentEList<WriteArgument>(WriteArgument.class, this, BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS);
		}
		return writeArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommonArgument> getCommonArguments() {
		if (commonArguments == null) {
			commonArguments = new EObjectContainmentEList<CommonArgument>(CommonArgument.class, this, BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS);
		}
		return commonArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS:
				return ((InternalEList<?>)getReadArguments()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS:
				return ((InternalEList<?>)getWriteArguments()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS:
				return ((InternalEList<?>)getCommonArguments()).basicRemove(otherEnd, msgs);
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
			case BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS:
				return getReadArguments();
			case BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS:
				return getWriteArguments();
			case BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS:
				return getCommonArguments();
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
			case BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS:
				getReadArguments().clear();
				getReadArguments().addAll((Collection<? extends ReadArgument>)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS:
				getWriteArguments().clear();
				getWriteArguments().addAll((Collection<? extends WriteArgument>)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS:
				getCommonArguments().clear();
				getCommonArguments().addAll((Collection<? extends CommonArgument>)newValue);
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
			case BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS:
				getReadArguments().clear();
				return;
			case BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS:
				getWriteArguments().clear();
				return;
			case BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS:
				getCommonArguments().clear();
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
			case BaciCodeGenPackage.DEV_IO__READ_ARGUMENTS:
				return readArguments != null && !readArguments.isEmpty();
			case BaciCodeGenPackage.DEV_IO__WRITE_ARGUMENTS:
				return writeArguments != null && !writeArguments.isEmpty();
			case BaciCodeGenPackage.DEV_IO__COMMON_ARGUMENTS:
				return commonArguments != null && !commonArguments.isEmpty();
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
