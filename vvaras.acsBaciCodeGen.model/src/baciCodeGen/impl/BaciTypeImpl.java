/**
 */
package baciCodeGen.impl;

import baciCodeGen.AccessType;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;
import baciCodeGen.BasicType;
import baciCodeGen.PropertyDefinition;
import baciCodeGen.SeqType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baci Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.BaciTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.BaciTypeImpl#getAccessType <em>Access Type</em>}</li>
 *   <li>{@link baciCodeGen.impl.BaciTypeImpl#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link baciCodeGen.impl.BaciTypeImpl#getSeqType <em>Seq Type</em>}</li>
 *   <li>{@link baciCodeGen.impl.BaciTypeImpl#getBaciCharacteristics <em>Baci Characteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaciTypeImpl extends MinimalEObjectImpl.Container implements BaciType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected static final AccessType ACCESS_TYPE_EDEFAULT = AccessType.RO;

	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessType = ACCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicType()
	 * @generated
	 * @ordered
	 */
	protected static final BasicType BASIC_TYPE_EDEFAULT = BasicType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicType()
	 * @generated
	 * @ordered
	 */
	protected BasicType basicType = BASIC_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeqType() <em>Seq Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqType()
	 * @generated
	 * @ordered
	 */
	protected static final SeqType SEQ_TYPE_EDEFAULT = SeqType.NOT_SEQ;

	/**
	 * The cached value of the '{@link #getSeqType() <em>Seq Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqType()
	 * @generated
	 * @ordered
	 */
	protected SeqType seqType = SEQ_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaciCharacteristics() <em>Baci Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaciCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected PropertyDefinition baciCharacteristics;

	/**
	 * This is true if the Baci Characteristics containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean baciCharacteristicsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaciTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.BACI_TYPE;
	}

	/**
     * <!-- begin-user-doc -->
     * Creates the name for the BaciType that is derived from its sub-types
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public String getName() {
            String res = accessType.getLiteral() + basicType.getLiteral();
            if(seqType.getValue()==1)
                    res+= "Seq";
            return res;
    }


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessType() {
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessType(AccessType newAccessType) {
		AccessType oldAccessType = accessType;
		accessType = newAccessType == null ? ACCESS_TYPE_EDEFAULT : newAccessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE, oldAccessType, accessType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicType getBasicType() {
		return basicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicType(BasicType newBasicType) {
		BasicType oldBasicType = basicType;
		basicType = newBasicType == null ? BASIC_TYPE_EDEFAULT : newBasicType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE, oldBasicType, basicType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeqType getSeqType() {
		return seqType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqType(SeqType newSeqType) {
		SeqType oldSeqType = seqType;
		seqType = newSeqType == null ? SEQ_TYPE_EDEFAULT : newSeqType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE, oldSeqType, seqType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyDefinition getBaciCharacteristics() {
		return baciCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaciCharacteristics(PropertyDefinition newBaciCharacteristics, NotificationChain msgs) {
		PropertyDefinition oldBaciCharacteristics = baciCharacteristics;
		baciCharacteristics = newBaciCharacteristics;
		boolean oldBaciCharacteristicsESet = baciCharacteristicsESet;
		baciCharacteristicsESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, oldBaciCharacteristics, newBaciCharacteristics, !oldBaciCharacteristicsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaciCharacteristics(PropertyDefinition newBaciCharacteristics) {
		if (newBaciCharacteristics != baciCharacteristics) {
			NotificationChain msgs = null;
			if (baciCharacteristics != null)
				msgs = ((InternalEObject)baciCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, null, msgs);
			if (newBaciCharacteristics != null)
				msgs = ((InternalEObject)newBaciCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, null, msgs);
			msgs = basicSetBaciCharacteristics(newBaciCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaciCharacteristicsESet = baciCharacteristicsESet;
			baciCharacteristicsESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, newBaciCharacteristics, newBaciCharacteristics, !oldBaciCharacteristicsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetBaciCharacteristics(NotificationChain msgs) {
		PropertyDefinition oldBaciCharacteristics = baciCharacteristics;
		baciCharacteristics = null;
		boolean oldBaciCharacteristicsESet = baciCharacteristicsESet;
		baciCharacteristicsESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, oldBaciCharacteristics, null, oldBaciCharacteristicsESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBaciCharacteristics() {
		if (baciCharacteristics != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)baciCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, null, msgs);
			msgs = basicUnsetBaciCharacteristics(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldBaciCharacteristicsESet = baciCharacteristicsESet;
			baciCharacteristicsESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS, null, null, oldBaciCharacteristicsESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBaciCharacteristics() {
		return baciCharacteristicsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
				return basicUnsetBaciCharacteristics(msgs);
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
			case BaciCodeGenPackage.BACI_TYPE__NAME:
				return getName();
			case BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE:
				return getAccessType();
			case BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE:
				return getBasicType();
			case BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE:
				return getSeqType();
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
				return getBaciCharacteristics();
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
			case BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE:
				setAccessType((AccessType)newValue);
				return;
			case BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE:
				setBasicType((BasicType)newValue);
				return;
			case BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE:
				setSeqType((SeqType)newValue);
				return;
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
				setBaciCharacteristics((PropertyDefinition)newValue);
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
			case BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE:
				setAccessType(ACCESS_TYPE_EDEFAULT);
				return;
			case BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE:
				setBasicType(BASIC_TYPE_EDEFAULT);
				return;
			case BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE:
				setSeqType(SEQ_TYPE_EDEFAULT);
				return;
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
				unsetBaciCharacteristics();
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
			case BaciCodeGenPackage.BACI_TYPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE:
				return accessType != ACCESS_TYPE_EDEFAULT;
			case BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE:
				return basicType != BASIC_TYPE_EDEFAULT;
			case BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE:
				return seqType != SEQ_TYPE_EDEFAULT;
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
				return isSetBaciCharacteristics();
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
		result.append(" (accessType: ");
		result.append(accessType);
		result.append(", basicType: ");
		result.append(basicType);
		result.append(", seqType: ");
		result.append(seqType);
		result.append(')');
		return result.toString();
	}

} //BaciTypeImpl
