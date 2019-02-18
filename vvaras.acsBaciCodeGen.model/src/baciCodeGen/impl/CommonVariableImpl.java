/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CommonVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.CommonVariableImpl#isIsRead <em>Is Read</em>}</li>
 *   <li>{@link baciCodeGen.impl.CommonVariableImpl#isIsWrite <em>Is Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonVariableImpl extends DevIOVariableImpl implements CommonVariable {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.COMMON_VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.COMMON_VARIABLE__IS_READ, oldIsRead, isRead));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.COMMON_VARIABLE__IS_WRITE, oldIsWrite, isWrite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_READ:
				return isIsRead();
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_WRITE:
				return isIsWrite();
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
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_READ:
				setIsRead((Boolean)newValue);
				return;
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_WRITE:
				setIsWrite((Boolean)newValue);
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
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_READ:
				setIsRead(IS_READ_EDEFAULT);
				return;
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_WRITE:
				setIsWrite(IS_WRITE_EDEFAULT);
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
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_READ:
				return isRead != IS_READ_EDEFAULT;
			case BaciCodeGenPackage.COMMON_VARIABLE__IS_WRITE:
				return isWrite != IS_WRITE_EDEFAULT;
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
		result.append(" (isRead: ");
		result.append(isRead);
		result.append(", isWrite: ");
		result.append(isWrite);
		result.append(')');
		return result.toString();
	}

} //CommonVariableImpl
