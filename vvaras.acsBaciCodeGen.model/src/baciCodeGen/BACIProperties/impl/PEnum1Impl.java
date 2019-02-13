/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.PEnum1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PEnum1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getArchiveDelta <em>Archive Delta</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getArchiveDeltaPercent <em>Archive Delta Percent</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getCondition <em>Condition</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getGraphMax <em>Graph Max</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getGraphMin <em>Graph Min</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.PEnum1Impl#getStatesDescription <em>States Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PEnum1Impl extends PEnumImpl implements PEnum1 {
	/**
	 * The default value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected static final int ARCHIVE_DELTA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArchiveDelta() <em>Archive Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveDelta()
	 * @generated
	 * @ordered
	 */
	protected int archiveDelta = ARCHIVE_DELTA_EDEFAULT;

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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * This is true if the Condition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionESet;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected int defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * This is true if the Default Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultValueESet;

	/**
	 * The default value of the '{@link #getGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMax()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGraphMax() <em>Graph Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMax()
	 * @generated
	 * @ordered
	 */
	protected int graphMax = GRAPH_MAX_EDEFAULT;

	/**
	 * This is true if the Graph Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMaxESet;

	/**
	 * The default value of the '{@link #getGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMin()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAPH_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGraphMin() <em>Graph Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphMin()
	 * @generated
	 * @ordered
	 */
	protected int graphMin = GRAPH_MIN_EDEFAULT;

	/**
	 * This is true if the Graph Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean graphMinESet;

	/**
	 * The default value of the '{@link #getStatesDescription() <em>States Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String STATES_DESCRIPTION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getStatesDescription() <em>States Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesDescription()
	 * @generated
	 * @ordered
	 */
	protected String statesDescription = STATES_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the States Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statesDescriptionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PEnum1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.PENUM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArchiveDelta() {
		return archiveDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveDelta(int newArchiveDelta) {
		int oldArchiveDelta = archiveDelta;
		archiveDelta = newArchiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDeltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA, oldArchiveDelta, archiveDelta, !oldArchiveDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveDelta() {
		int oldArchiveDelta = archiveDelta;
		boolean oldArchiveDeltaESet = archiveDeltaESet;
		archiveDelta = ARCHIVE_DELTA_EDEFAULT;
		archiveDeltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA, oldArchiveDelta, ARCHIVE_DELTA_EDEFAULT, oldArchiveDeltaESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, archiveDeltaPercent, !oldArchiveDeltaPercentESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT, oldArchiveDeltaPercent, ARCHIVE_DELTA_PERCENT_EDEFAULT, oldArchiveDeltaPercentESet));
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
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		boolean oldConditionESet = conditionESet;
		conditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__CONDITION, oldCondition, condition, !oldConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCondition() {
		String oldCondition = condition;
		boolean oldConditionESet = conditionESet;
		condition = CONDITION_EDEFAULT;
		conditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__CONDITION, oldCondition, CONDITION_EDEFAULT, oldConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCondition() {
		return conditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(int newDefaultValue) {
		int oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__DEFAULT_VALUE, oldDefaultValue, defaultValue, !oldDefaultValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultValue() {
		int oldDefaultValue = defaultValue;
		boolean oldDefaultValueESet = defaultValueESet;
		defaultValue = DEFAULT_VALUE_EDEFAULT;
		defaultValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__DEFAULT_VALUE, oldDefaultValue, DEFAULT_VALUE_EDEFAULT, oldDefaultValueESet));
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
	public int getGraphMax() {
		return graphMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMax(int newGraphMax) {
		int oldGraphMax = graphMax;
		graphMax = newGraphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__GRAPH_MAX, oldGraphMax, graphMax, !oldGraphMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMax() {
		int oldGraphMax = graphMax;
		boolean oldGraphMaxESet = graphMaxESet;
		graphMax = GRAPH_MAX_EDEFAULT;
		graphMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__GRAPH_MAX, oldGraphMax, GRAPH_MAX_EDEFAULT, oldGraphMaxESet));
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
	public int getGraphMin() {
		return graphMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGraphMin(int newGraphMin) {
		int oldGraphMin = graphMin;
		graphMin = newGraphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__GRAPH_MIN, oldGraphMin, graphMin, !oldGraphMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGraphMin() {
		int oldGraphMin = graphMin;
		boolean oldGraphMinESet = graphMinESet;
		graphMin = GRAPH_MIN_EDEFAULT;
		graphMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__GRAPH_MIN, oldGraphMin, GRAPH_MIN_EDEFAULT, oldGraphMinESet));
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
	public String getStatesDescription() {
		return statesDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatesDescription(String newStatesDescription) {
		String oldStatesDescription = statesDescription;
		statesDescription = newStatesDescription;
		boolean oldStatesDescriptionESet = statesDescriptionESet;
		statesDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION, oldStatesDescription, statesDescription, !oldStatesDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatesDescription() {
		String oldStatesDescription = statesDescription;
		boolean oldStatesDescriptionESet = statesDescriptionESet;
		statesDescription = STATES_DESCRIPTION_EDEFAULT;
		statesDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION, oldStatesDescription, STATES_DESCRIPTION_EDEFAULT, oldStatesDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatesDescription() {
		return statesDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA:
				return getArchiveDelta();
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT:
				return getArchiveDeltaPercent();
			case BACIPropertiesPackage.PENUM1__CONDITION:
				return getCondition();
			case BACIPropertiesPackage.PENUM1__DEFAULT_VALUE:
				return getDefaultValue();
			case BACIPropertiesPackage.PENUM1__GRAPH_MAX:
				return getGraphMax();
			case BACIPropertiesPackage.PENUM1__GRAPH_MIN:
				return getGraphMin();
			case BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION:
				return getStatesDescription();
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
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA:
				setArchiveDelta((Integer)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT:
				setArchiveDeltaPercent((Double)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__CONDITION:
				setCondition((String)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__DEFAULT_VALUE:
				setDefaultValue((Integer)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__GRAPH_MAX:
				setGraphMax((Integer)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__GRAPH_MIN:
				setGraphMin((Integer)newValue);
				return;
			case BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION:
				setStatesDescription((String)newValue);
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
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA:
				unsetArchiveDelta();
				return;
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT:
				unsetArchiveDeltaPercent();
				return;
			case BACIPropertiesPackage.PENUM1__CONDITION:
				unsetCondition();
				return;
			case BACIPropertiesPackage.PENUM1__DEFAULT_VALUE:
				unsetDefaultValue();
				return;
			case BACIPropertiesPackage.PENUM1__GRAPH_MAX:
				unsetGraphMax();
				return;
			case BACIPropertiesPackage.PENUM1__GRAPH_MIN:
				unsetGraphMin();
				return;
			case BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION:
				unsetStatesDescription();
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
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA:
				return isSetArchiveDelta();
			case BACIPropertiesPackage.PENUM1__ARCHIVE_DELTA_PERCENT:
				return isSetArchiveDeltaPercent();
			case BACIPropertiesPackage.PENUM1__CONDITION:
				return isSetCondition();
			case BACIPropertiesPackage.PENUM1__DEFAULT_VALUE:
				return isSetDefaultValue();
			case BACIPropertiesPackage.PENUM1__GRAPH_MAX:
				return isSetGraphMax();
			case BACIPropertiesPackage.PENUM1__GRAPH_MIN:
				return isSetGraphMin();
			case BACIPropertiesPackage.PENUM1__STATES_DESCRIPTION:
				return isSetStatesDescription();
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
		result.append(", condition: ");
		if (conditionESet) result.append(condition); else result.append("<unset>");
		result.append(", defaultValue: ");
		if (defaultValueESet) result.append(defaultValue); else result.append("<unset>");
		result.append(", graphMax: ");
		if (graphMaxESet) result.append(graphMax); else result.append("<unset>");
		result.append(", graphMin: ");
		if (graphMinESet) result.append(graphMin); else result.append("<unset>");
		result.append(", statesDescription: ");
		if (statesDescriptionESet) result.append(statesDescription); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PEnum1Impl
