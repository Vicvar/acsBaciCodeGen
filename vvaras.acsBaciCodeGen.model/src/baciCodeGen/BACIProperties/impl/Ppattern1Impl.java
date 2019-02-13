/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.Ppattern1;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ppattern1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getBitDescription <em>Bit Description</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getMinStep <em>Min Step</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getWhenCleared <em>When Cleared</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Ppattern1Impl#getWhenSet <em>When Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ppattern1Impl extends PpatternImpl implements Ppattern1 {
	/**
	 * The default value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ARCHIVE_DELTA_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected BigInteger archiveDelta = ARCHIVE_DELTA_EDEFAULT;

	/**
	 * This is true if the Archive Delta attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveDeltaESet;

	/**
	 * The default value of the '{@link #getArchiveDeltaPercent() <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDeltaPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double ARCHIVE_DELTA_PERCENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArchiveDeltaPercent() <em>Archive Delta Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDeltaPercent()
	 * @generated
	 * @ordered
	 */
	protected double archiveDeltaPercent = ARCHIVE_DELTA_PERCENT_EDEFAULT;

	/**
	 * This is true if the Archive Delta Percent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveDeltaPercentESet;

	/**
	 * The default value of the '{@link #getBitDescription() <em>Bit Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BIT_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getBitDescription() <em>Bit Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitDescription()
	 * @generated
	 * @ordered
	 */
	protected String bitDescription = BIT_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Bit Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bitDescriptionESet;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEFAULT_VALUE_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * This is true if the Default Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

	/**
	 * The default value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_STEP_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStep()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minStep = MIN_STEP_EDEFAULT;

	/**
	 * This is true if the Min Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minStepESet;

	/**
	 * The default value of the '{@link #getWhenCleared() <em>When Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenCleared()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_CLEARED_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWhenCleared() <em>When Cleared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenCleared()
	 * @generated
	 * @ordered
	 */
	protected String whenCleared = WHEN_CLEARED_EDEFAULT;

	/**
	 * This is true if the When Cleared attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whenClearedESet;

	/**
	 * The default value of the '{@link #getWhenSet() <em>When Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSet()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_SET_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWhenSet() <em>When Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSet()
	 * @generated
	 * @ordered
	 */
	protected String whenSet = WHEN_SET_EDEFAULT;

	/**
	 * This is true if the When Set attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean whenSetESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ppattern1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.PPATTERN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getArchiveDelta() {
		return archiveDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDelta(BigInteger newArchiveDelta) {
		BigInteger oldArchiveDelta = archiveDelta;
		archiveDelta = newArchiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDeltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA, oldArchiveDelta, archiveDelta, !oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDelta() {
		BigInteger oldArchiveDelta = archiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDelta = ARCHIVE_DELTA_EDEFAULT;
		archiveDeltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA, oldArchiveDelta, ARCHIVE_DELTA_EDEFAULT, oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveDelta() {
		return archiveDeltaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArchiveDeltaPercent() {
		return archiveDeltaPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDeltaPercent(double newArchiveDeltaPercent) {
		double oldArchiveDeltaPercent = archiveDeltaPercent;
		archiveDeltaPercent = newArchiveDeltaPercent;
		boolean oldArchiveDeltaPercentESet = archiveDeltaPercentESet;
		archiveDeltaPercentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, archiveDeltaPercent, !oldArchiveDeltaPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDeltaPercent() {
		double oldArchiveDeltaPercent = archiveDeltaPercent;
		boolean oldArchiveDeltaPercentESet = archiveDeltaPercentESet;
		archiveDeltaPercent = ARCHIVE_DELTA_PERCENT_EDEFAULT;
		archiveDeltaPercentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, ARCHIVE_DELTA_PERCENT_EDEFAULT, oldArchiveDeltaPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveDeltaPercent() {
		return archiveDeltaPercentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBitDescription() {
		return bitDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitDescription(String newBitDescription) {
		String oldBitDescription = bitDescription;
		bitDescription = newBitDescription;
		boolean oldBitDescriptionESet = bitDescriptionESet;
		bitDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION, oldBitDescription, bitDescription, !oldBitDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBitDescription() {
		String oldBitDescription = bitDescription;
		boolean oldBitDescriptionESet = bitDescriptionESet;
		bitDescription = BIT_DESCRIPTION_EDEFAULT;
		bitDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION, oldBitDescription, BIT_DESCRIPTION_EDEFAULT, oldBitDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBitDescription() {
		return bitDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(BigInteger newDefaultValue) {
		BigInteger oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		BigInteger oldDefaultValue = defaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValue = DEFAULT_VALUE_EDEFAULT;
		defaultValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultValue() {
		return defaultValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinStep() {
		return minStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStep(BigInteger newMinStep) {
		BigInteger oldMinStep = minStep;
		minStep = newMinStep;
		boolean oldMinStepESet = minStepESet;
		minStepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__MIN_STEP, oldMinStep, minStep, !oldMinStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinStep() {
		BigInteger oldMinStep = minStep;
		boolean oldMinStepESet = minStepESet;
		minStep = MIN_STEP_EDEFAULT;
		minStepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__MIN_STEP, oldMinStep, MIN_STEP_EDEFAULT, oldMinStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinStep() {
		return minStepESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhenCleared() {
		return whenCleared;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenCleared(String newWhenCleared) {
		String oldWhenCleared = whenCleared;
		whenCleared = newWhenCleared;
		boolean oldWhenClearedESet = whenClearedESet;
		whenClearedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED, oldWhenCleared, whenCleared, !oldWhenClearedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhenCleared() {
		String oldWhenCleared = whenCleared;
		boolean oldWhenClearedESet = whenClearedESet;
		whenCleared = WHEN_CLEARED_EDEFAULT;
		whenClearedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED, oldWhenCleared, WHEN_CLEARED_EDEFAULT, oldWhenClearedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhenCleared() {
		return whenClearedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWhenSet() {
		return whenSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenSet(String newWhenSet) {
		String oldWhenSet = whenSet;
		whenSet = newWhenSet;
		boolean oldWhenSetESet = whenSetESet;
		whenSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PPATTERN1__WHEN_SET, oldWhenSet, whenSet, !oldWhenSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWhenSet() {
		String oldWhenSet = whenSet;
		boolean oldWhenSetESet = whenSetESet;
		whenSet = WHEN_SET_EDEFAULT;
		whenSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PPATTERN1__WHEN_SET, oldWhenSet, WHEN_SET_EDEFAULT, oldWhenSetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWhenSet() {
		return whenSetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA:
				return getArchiveDelta();
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT:
				return getArchiveDeltaPercent();
			case BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION:
				return getBitDescription();
			case BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE:
				return getDefaultValue();
			case BACIPropertiesPackage.PPATTERN1__MIN_STEP:
				return getMinStep();
			case BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED:
				return getWhenCleared();
			case BACIPropertiesPackage.PPATTERN1__WHEN_SET:
				return getWhenSet();
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
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA:
				setArchiveDelta((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT:
				setArchiveDeltaPercent((Double)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION:
				setBitDescription((String)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE:
				setDefaultValue((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__MIN_STEP:
				setMinStep((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED:
				setWhenCleared((String)newValue);
				return;
			case BACIPropertiesPackage.PPATTERN1__WHEN_SET:
				setWhenSet((String)newValue);
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
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA:
				unsetArchiveDelta();
				return;
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT:
				unsetArchiveDeltaPercent();
				return;
			case BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION:
				unsetBitDescription();
				return;
			case BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE:
				unsetDefaultValue();
				return;
			case BACIPropertiesPackage.PPATTERN1__MIN_STEP:
				unsetMinStep();
				return;
			case BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED:
				unsetWhenCleared();
				return;
			case BACIPropertiesPackage.PPATTERN1__WHEN_SET:
				unsetWhenSet();
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
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA:
				return isSetArchiveDelta();
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT:
				return isSetArchiveDeltaPercent();
			case BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION:
				return isSetBitDescription();
			case BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE:
				return isSetDefaultValue();
			case BACIPropertiesPackage.PPATTERN1__MIN_STEP:
				return isSetMinStep();
			case BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED:
				return isSetWhenCleared();
			case BACIPropertiesPackage.PPATTERN1__WHEN_SET:
				return isSetWhenSet();
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
		result.append(" (archiveDelta: ");
		if (archiveDeltaESet) result.append(archiveDelta); else result.append("<unset>");
		result.append(", archiveDeltaPercent: ");
		if (archiveDeltaPercentESet) result.append(archiveDeltaPercent); else result.append("<unset>");
		result.append(", bitDescription: ");
		if (bitDescriptionESet) result.append(bitDescription); else result.append("<unset>");
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", minStep: ");
		if (minStepESet) result.append(minStep); else result.append("<unset>");
		result.append(", whenCleared: ");
		if (whenClearedESet) result.append(whenCleared); else result.append("<unset>");
		result.append(", whenSet: ");
		if (whenSetESet) result.append(whenSet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Ppattern1Impl
