/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.Pboolean1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pboolean1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isMinDeltaTrig <em>Min Delta Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.Pboolean1Impl#isMinStep <em>Min Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pboolean1Impl extends PbooleanImpl implements Pboolean1 {
	/**
	 * The default value of the '{@link #isArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVE_DELTA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected boolean archiveDelta = ARCHIVE_DELTA_EDEFAULT;

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
	 * The default value of the '{@link #isDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * This is true if the Default Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

	/**
	 * The default value of the '{@link #isGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphMax()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAPH_MAX_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphMax()
	 * @generated
	 * @ordered
	 */
	protected boolean graphMax = GRAPH_MAX_EDEFAULT;

	/**
	 * This is true if the Graph Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMaxESet;

	/**
	 * The default value of the '{@link #isGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphMin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRAPH_MIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGraphMin()
	 * @generated
	 * @ordered
	 */
	protected boolean graphMin = GRAPH_MIN_EDEFAULT;

	/**
	 * This is true if the Graph Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMinESet;

	/**
	 * The default value of the '{@link #isMinDeltaTrig() <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinDeltaTrig()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_DELTA_TRIG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinDeltaTrig() <em>Min Delta Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinDeltaTrig()
	 * @generated
	 * @ordered
	 */
	protected boolean minDeltaTrig = MIN_DELTA_TRIG_EDEFAULT;

	/**
	 * This is true if the Min Delta Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minDeltaTrigESet;

	/**
	 * The default value of the '{@link #isMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinStep()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_STEP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinStep() <em>Min Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinStep()
	 * @generated
	 * @ordered
	 */
	protected boolean minStep = MIN_STEP_EDEFAULT;

	/**
	 * This is true if the Min Step attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minStepESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pboolean1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.PBOOLEAN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchiveDelta() {
		return archiveDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDelta(boolean newArchiveDelta) {
		boolean oldArchiveDelta = archiveDelta;
		archiveDelta = newArchiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDeltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA, oldArchiveDelta, archiveDelta, !oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDelta() {
		boolean oldArchiveDelta = archiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDelta = ARCHIVE_DELTA_EDEFAULT;
		archiveDeltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA, oldArchiveDelta, ARCHIVE_DELTA_EDEFAULT, oldArchiveDeltaESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, archiveDeltaPercent, !oldArchiveDeltaPercentESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, ARCHIVE_DELTA_PERCENT_EDEFAULT, oldArchiveDeltaPercentESet));
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
	public boolean isDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(boolean newDefaultValue) {
		boolean oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		boolean oldDefaultValue = defaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValue = DEFAULT_VALUE_EDEFAULT;
		defaultValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
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
	public boolean isGraphMax() {
		return graphMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMax(boolean newGraphMax) {
		boolean oldGraphMax = graphMax;
		graphMax = newGraphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX, oldGraphMax, graphMax, !oldGraphMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMax() {
		boolean oldGraphMax = graphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMax = GRAPH_MAX_EDEFAULT;
		graphMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX, oldGraphMax, GRAPH_MAX_EDEFAULT, oldGraphMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGraphMax() {
		return graphMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGraphMin() {
		return graphMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMin(boolean newGraphMin) {
		boolean oldGraphMin = graphMin;
		graphMin = newGraphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN, oldGraphMin, graphMin, !oldGraphMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMin() {
		boolean oldGraphMin = graphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMin = GRAPH_MIN_EDEFAULT;
		graphMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN, oldGraphMin, GRAPH_MIN_EDEFAULT, oldGraphMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGraphMin() {
		return graphMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinDeltaTrig() {
		return minDeltaTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinDeltaTrig(boolean newMinDeltaTrig) {
		boolean oldMinDeltaTrig = minDeltaTrig;
		minDeltaTrig = newMinDeltaTrig;
		boolean oldMinDeltaTrigESet = minDeltaTrigESet;
		minDeltaTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG, oldMinDeltaTrig, minDeltaTrig, !oldMinDeltaTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinDeltaTrig() {
		boolean oldMinDeltaTrig = minDeltaTrig;
		boolean oldMinDeltaTrigESet = minDeltaTrigESet;
		minDeltaTrig = MIN_DELTA_TRIG_EDEFAULT;
		minDeltaTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG, oldMinDeltaTrig, MIN_DELTA_TRIG_EDEFAULT, oldMinDeltaTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinDeltaTrig() {
		return minDeltaTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinStep() {
		return minStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStep(boolean newMinStep) {
		boolean oldMinStep = minStep;
		minStep = newMinStep;
		boolean oldMinStepESet = minStepESet;
		minStepESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PBOOLEAN1__MIN_STEP, oldMinStep, minStep, !oldMinStepESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinStep() {
		boolean oldMinStep = minStep;
		boolean oldMinStepESet = minStepESet;
		minStep = MIN_STEP_EDEFAULT;
		minStepESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PBOOLEAN1__MIN_STEP, oldMinStep, MIN_STEP_EDEFAULT, oldMinStepESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA:
				return isArchiveDelta();
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT:
				return getArchiveDeltaPercent();
			case BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE:
				return isDefaultValue();
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX:
				return isGraphMax();
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN:
				return isGraphMin();
			case BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG:
				return isMinDeltaTrig();
			case BACIPropertiesPackage.PBOOLEAN1__MIN_STEP:
				return isMinStep();
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
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA:
				setArchiveDelta((Boolean)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT:
				setArchiveDeltaPercent((Double)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE:
				setDefaultValue((Boolean)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX:
				setGraphMax((Boolean)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN:
				setGraphMin((Boolean)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG:
				setMinDeltaTrig((Boolean)newValue);
				return;
			case BACIPropertiesPackage.PBOOLEAN1__MIN_STEP:
				setMinStep((Boolean)newValue);
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
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA:
				unsetArchiveDelta();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT:
				unsetArchiveDeltaPercent();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE:
				unsetDefaultValue();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX:
				unsetGraphMax();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN:
				unsetGraphMin();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG:
				unsetMinDeltaTrig();
				return;
			case BACIPropertiesPackage.PBOOLEAN1__MIN_STEP:
				unsetMinStep();
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
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA:
				return isSetArchiveDelta();
			case BACIPropertiesPackage.PBOOLEAN1__ARCHIVE_DELTA_PERCENT:
				return isSetArchiveDeltaPercent();
			case BACIPropertiesPackage.PBOOLEAN1__DEFAULT_VALUE:
				return isSetDefaultValue();
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MAX:
				return isSetGraphMax();
			case BACIPropertiesPackage.PBOOLEAN1__GRAPH_MIN:
				return isSetGraphMin();
			case BACIPropertiesPackage.PBOOLEAN1__MIN_DELTA_TRIG:
				return isSetMinDeltaTrig();
			case BACIPropertiesPackage.PBOOLEAN1__MIN_STEP:
				return isSetMinStep();
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
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", graphMax: ");
		if (graphMaxESet) result.append(graphMax); else result.append("<unset>");
		result.append(", graphMin: ");
		if (graphMinESet) result.append(graphMin); else result.append("<unset>");
		result.append(", minDeltaTrig: ");
		if (minDeltaTrigESet) result.append(minDeltaTrig); else result.append("<unset>");
		result.append(", minStep: ");
		if (minStepESet) result.append(minStep); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Pboolean1Impl
