/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.DevIOVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dev IO Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.DevIOVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOVariableImpl#isIsRead <em>Is Read</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOVariableImpl#isIsWrite <em>Is Write</em>}</li>
 *   <li>{@link baciCodeGen.impl.DevIOVariableImpl#isIsPropertySpecific <em>Is Property Specific</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevIOVariableImpl extends MinimalEObjectImpl.Container implements DevIOVariable {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsRead() <em>Is Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRead() <em>Is Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRead()
	 * @generated
	 * @ordered
	 */
	protected boolean isRead = IS_READ_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWrite() <em>Is Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsWrite() <em>Is Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWrite()
	 * @generated
	 * @ordered
	 */
	protected boolean isWrite = IS_WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPropertySpecific() <em>Is Property Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropertySpecific()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROPERTY_SPECIFIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPropertySpecific() <em>Is Property Specific</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPropertySpecific()
	 * @generated
	 * @ordered
	 */
	protected boolean isPropertySpecific = IS_PROPERTY_SPECIFIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevIOVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.DEV_IO_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO_VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRead() {
		return isRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRead(boolean newIsRead) {
		boolean oldIsRead = isRead;
		isRead = newIsRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO_VARIABLE__IS_READ, oldIsRead, isRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsWrite() {
		return isWrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsWrite(boolean newIsWrite) {
		boolean oldIsWrite = isWrite;
		isWrite = newIsWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO_VARIABLE__IS_WRITE, oldIsWrite, isWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPropertySpecific() {
		return isPropertySpecific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPropertySpecific(boolean newIsPropertySpecific) {
		boolean oldIsPropertySpecific = isPropertySpecific;
		isPropertySpecific = newIsPropertySpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.DEV_IO_VARIABLE__IS_PROPERTY_SPECIFIC, oldIsPropertySpecific, isPropertySpecific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO_VARIABLE__NAME:
				return getName();
			case BaciCodeGenPackage.DEV_IO_VARIABLE__TYPE:
				return getType();
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_READ:
				return isIsRead();
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_WRITE:
				return isIsWrite();
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_PROPERTY_SPECIFIC:
				return isIsPropertySpecific();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BaciCodeGenPackage.DEV_IO_VARIABLE__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_READ:
				setIsRead((Boolean)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_WRITE:
				setIsWrite((Boolean)newValue);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_PROPERTY_SPECIFIC:
				setIsPropertySpecific((Boolean)newValue);
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
			case BaciCodeGenPackage.DEV_IO_VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_READ:
				setIsRead(IS_READ_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_WRITE:
				setIsWrite(IS_WRITE_EDEFAULT);
				return;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_PROPERTY_SPECIFIC:
				setIsPropertySpecific(IS_PROPERTY_SPECIFIC_EDEFAULT);
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
			case BaciCodeGenPackage.DEV_IO_VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.DEV_IO_VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_READ:
				return isRead != IS_READ_EDEFAULT;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_WRITE:
				return isWrite != IS_WRITE_EDEFAULT;
			case BaciCodeGenPackage.DEV_IO_VARIABLE__IS_PROPERTY_SPECIFIC:
				return isPropertySpecific != IS_PROPERTY_SPECIFIC_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", isRead: ");
		result.append(isRead);
		result.append(", isWrite: ");
		result.append(isWrite);
		result.append(", isPropertySpecific: ");
		result.append(isPropertySpecific);
		result.append(')');
		return result.toString();
	}

} //DevIOVariableImpl
