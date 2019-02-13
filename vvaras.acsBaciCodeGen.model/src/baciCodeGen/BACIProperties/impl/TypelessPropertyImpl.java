/**
 */
package baciCodeGen.BACIProperties.impl;

import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.TypelessProperty;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typeless Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getArchiveMaxInt <em>Archive Max Int</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getArchiveMechanism <em>Archive Mechanism</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getArchiveMinInt <em>Archive Min Int</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getArchivePriority <em>Archive Priority</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#isArchiveSuppress <em>Archive Suppress</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getDefaultTimerTrig <em>Default Timer Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#isInitializeDevio <em>Initialize Devio</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getMinTimerTrig <em>Min Timer Trig</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link baciCodeGen.BACIProperties.impl.TypelessPropertyImpl#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypelessPropertyImpl extends PropertyImpl implements TypelessProperty {
	/**
	 * The default value of the '{@link #getArchiveMaxInt() <em>Archive Max Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMaxInt()
	 * @generated
	 * @ordered
	 */
	protected static final double ARCHIVE_MAX_INT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArchiveMaxInt() <em>Archive Max Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMaxInt()
	 * @generated
	 * @ordered
	 */
	protected double archiveMaxInt = ARCHIVE_MAX_INT_EDEFAULT;

	/**
	 * This is true if the Archive Max Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveMaxIntESet;

	/**
	 * The default value of the '{@link #getArchiveMechanism() <em>Archive Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVE_MECHANISM_EDEFAULT = "monitor_collector";

	/**
	 * The cached value of the '{@link #getArchiveMechanism() <em>Archive Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMechanism()
	 * @generated
	 * @ordered
	 */
	protected String archiveMechanism = ARCHIVE_MECHANISM_EDEFAULT;

	/**
	 * This is true if the Archive Mechanism attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveMechanismESet;

	/**
	 * The default value of the '{@link #getArchiveMinInt() <em>Archive Min Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMinInt()
	 * @generated
	 * @ordered
	 */
	protected static final double ARCHIVE_MIN_INT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getArchiveMinInt() <em>Archive Min Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveMinInt()
	 * @generated
	 * @ordered
	 */
	protected double archiveMinInt = ARCHIVE_MIN_INT_EDEFAULT;

	/**
	 * This is true if the Archive Min Int attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveMinIntESet;

	/**
	 * The default value of the '{@link #getArchivePriority() <em>Archive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchivePriority()
	 * @generated
	 * @ordered
	 */
	protected static final int ARCHIVE_PRIORITY_EDEFAULT = 3;

	/**
	 * The cached value of the '{@link #getArchivePriority() <em>Archive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchivePriority()
	 * @generated
	 * @ordered
	 */
	protected int archivePriority = ARCHIVE_PRIORITY_EDEFAULT;

	/**
	 * This is true if the Archive Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archivePriorityESet;

	/**
	 * The default value of the '{@link #isArchiveSuppress() <em>Archive Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchiveSuppress()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVE_SUPPRESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchiveSuppress() <em>Archive Suppress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchiveSuppress()
	 * @generated
	 * @ordered
	 */
	protected boolean archiveSuppress = ARCHIVE_SUPPRESS_EDEFAULT;

	/**
	 * This is true if the Archive Suppress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean archiveSuppressESet;

	/**
	 * The default value of the '{@link #getDefaultTimerTrig() <em>Default Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_TIMER_TRIG_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDefaultTimerTrig() <em>Default Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected double defaultTimerTrig = DEFAULT_TIMER_TRIG_EDEFAULT;

	/**
	 * This is true if the Default Timer Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultTimerTrigESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean descriptionESet;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The default value of the '{@link #isInitializeDevio() <em>Initialize Devio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitializeDevio()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZE_DEVIO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitializeDevio() <em>Initialize Devio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitializeDevio()
	 * @generated
	 * @ordered
	 */
	protected boolean initializeDevio = INITIALIZE_DEVIO_EDEFAULT;

	/**
	 * This is true if the Initialize Devio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean initializeDevioESet;

	/**
	 * The default value of the '{@link #getMinTimerTrig() <em>Min Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_TIMER_TRIG_EDEFAULT = 0.001;

	/**
	 * The cached value of the '{@link #getMinTimerTrig() <em>Min Timer Trig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimerTrig()
	 * @generated
	 * @ordered
	 */
	protected double minTimerTrig = MIN_TIMER_TRIG_EDEFAULT;

	/**
	 * This is true if the Min Timer Trig attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minTimerTrigESet;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESOLUTION_EDEFAULT = new BigInteger("65535");

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resolution = RESOLUTION_EDEFAULT;

	/**
	 * This is true if the Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolutionESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = "-";

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * This is true if the Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypelessPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BACIPropertiesPackage.Literals.TYPELESS_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArchiveMaxInt() {
		return archiveMaxInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveMaxInt(double newArchiveMaxInt) {
		double oldArchiveMaxInt = archiveMaxInt;
		archiveMaxInt = newArchiveMaxInt;
		boolean oldArchiveMaxIntESet = archiveMaxIntESet;
		archiveMaxIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT, oldArchiveMaxInt, archiveMaxInt, !oldArchiveMaxIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveMaxInt() {
		double oldArchiveMaxInt = archiveMaxInt;
		boolean oldArchiveMaxIntESet = archiveMaxIntESet;
		archiveMaxInt = ARCHIVE_MAX_INT_EDEFAULT;
		archiveMaxIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT, oldArchiveMaxInt, ARCHIVE_MAX_INT_EDEFAULT, oldArchiveMaxIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveMaxInt() {
		return archiveMaxIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchiveMechanism() {
		return archiveMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveMechanism(String newArchiveMechanism) {
		String oldArchiveMechanism = archiveMechanism;
		archiveMechanism = newArchiveMechanism;
		boolean oldArchiveMechanismESet = archiveMechanismESet;
		archiveMechanismESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM, oldArchiveMechanism, archiveMechanism, !oldArchiveMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveMechanism() {
		String oldArchiveMechanism = archiveMechanism;
		boolean oldArchiveMechanismESet = archiveMechanismESet;
		archiveMechanism = ARCHIVE_MECHANISM_EDEFAULT;
		archiveMechanismESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM, oldArchiveMechanism, ARCHIVE_MECHANISM_EDEFAULT, oldArchiveMechanismESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveMechanism() {
		return archiveMechanismESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getArchiveMinInt() {
		return archiveMinInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveMinInt(double newArchiveMinInt) {
		double oldArchiveMinInt = archiveMinInt;
		archiveMinInt = newArchiveMinInt;
		boolean oldArchiveMinIntESet = archiveMinIntESet;
		archiveMinIntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT, oldArchiveMinInt, archiveMinInt, !oldArchiveMinIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveMinInt() {
		double oldArchiveMinInt = archiveMinInt;
		boolean oldArchiveMinIntESet = archiveMinIntESet;
		archiveMinInt = ARCHIVE_MIN_INT_EDEFAULT;
		archiveMinIntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT, oldArchiveMinInt, ARCHIVE_MIN_INT_EDEFAULT, oldArchiveMinIntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveMinInt() {
		return archiveMinIntESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getArchivePriority() {
		return archivePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchivePriority(int newArchivePriority) {
		int oldArchivePriority = archivePriority;
		archivePriority = newArchivePriority;
		boolean oldArchivePriorityESet = archivePriorityESet;
		archivePriorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY, oldArchivePriority, archivePriority, !oldArchivePriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchivePriority() {
		int oldArchivePriority = archivePriority;
		boolean oldArchivePriorityESet = archivePriorityESet;
		archivePriority = ARCHIVE_PRIORITY_EDEFAULT;
		archivePriorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY, oldArchivePriority, ARCHIVE_PRIORITY_EDEFAULT, oldArchivePriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchivePriority() {
		return archivePriorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchiveSuppress() {
		return archiveSuppress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveSuppress(boolean newArchiveSuppress) {
		boolean oldArchiveSuppress = archiveSuppress;
		archiveSuppress = newArchiveSuppress;
		boolean oldArchiveSuppressESet = archiveSuppressESet;
		archiveSuppressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS, oldArchiveSuppress, archiveSuppress, !oldArchiveSuppressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArchiveSuppress() {
		boolean oldArchiveSuppress = archiveSuppress;
		boolean oldArchiveSuppressESet = archiveSuppressESet;
		archiveSuppress = ARCHIVE_SUPPRESS_EDEFAULT;
		archiveSuppressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS, oldArchiveSuppress, ARCHIVE_SUPPRESS_EDEFAULT, oldArchiveSuppressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArchiveSuppress() {
		return archiveSuppressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultTimerTrig() {
		return defaultTimerTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTimerTrig(double newDefaultTimerTrig) {
		double oldDefaultTimerTrig = defaultTimerTrig;
		defaultTimerTrig = newDefaultTimerTrig;
		boolean oldDefaultTimerTrigESet = defaultTimerTrigESet;
		defaultTimerTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG, oldDefaultTimerTrig, defaultTimerTrig, !oldDefaultTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultTimerTrig() {
		double oldDefaultTimerTrig = defaultTimerTrig;
		boolean oldDefaultTimerTrigESet = defaultTimerTrigESet;
		defaultTimerTrig = DEFAULT_TIMER_TRIG_EDEFAULT;
		defaultTimerTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG, oldDefaultTimerTrig, DEFAULT_TIMER_TRIG_EDEFAULT, oldDefaultTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultTimerTrig() {
		return defaultTimerTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		boolean oldDescriptionESet = descriptionESet;
		descriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION, oldDescription, description, !oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		String oldDescription = description;
		boolean oldDescriptionESet = descriptionESet;
		description = DESCRIPTION_EDEFAULT;
		descriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION, oldDescription, DESCRIPTION_EDEFAULT, oldDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return descriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		String oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitializeDevio() {
		return initializeDevio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializeDevio(boolean newInitializeDevio) {
		boolean oldInitializeDevio = initializeDevio;
		initializeDevio = newInitializeDevio;
		boolean oldInitializeDevioESet = initializeDevioESet;
		initializeDevioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO, oldInitializeDevio, initializeDevio, !oldInitializeDevioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInitializeDevio() {
		boolean oldInitializeDevio = initializeDevio;
		boolean oldInitializeDevioESet = initializeDevioESet;
		initializeDevio = INITIALIZE_DEVIO_EDEFAULT;
		initializeDevioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO, oldInitializeDevio, INITIALIZE_DEVIO_EDEFAULT, oldInitializeDevioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInitializeDevio() {
		return initializeDevioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinTimerTrig() {
		return minTimerTrig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTimerTrig(double newMinTimerTrig) {
		double oldMinTimerTrig = minTimerTrig;
		minTimerTrig = newMinTimerTrig;
		boolean oldMinTimerTrigESet = minTimerTrigESet;
		minTimerTrigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG, oldMinTimerTrig, minTimerTrig, !oldMinTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinTimerTrig() {
		double oldMinTimerTrig = minTimerTrig;
		boolean oldMinTimerTrigESet = minTimerTrigESet;
		minTimerTrig = MIN_TIMER_TRIG_EDEFAULT;
		minTimerTrigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG, oldMinTimerTrig, MIN_TIMER_TRIG_EDEFAULT, oldMinTimerTrigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinTimerTrig() {
		return minTimerTrigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(BigInteger newResolution) {
		BigInteger oldResolution = resolution;
		resolution = newResolution;
		boolean oldResolutionESet = resolutionESet;
		resolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION, oldResolution, resolution, !oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResolution() {
		BigInteger oldResolution = resolution;
		boolean oldResolutionESet = resolutionESet;
		resolution = RESOLUTION_EDEFAULT;
		resolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION, oldResolution, RESOLUTION_EDEFAULT, oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResolution() {
		return resolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		boolean oldUnitsESet = unitsESet;
		unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS, oldUnits, units, !oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnits() {
		String oldUnits = units;
		boolean oldUnitsESet = unitsESet;
		units = UNITS_EDEFAULT;
		unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnits() {
		return unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT:
				return getArchiveMaxInt();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM:
				return getArchiveMechanism();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT:
				return getArchiveMinInt();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY:
				return getArchivePriority();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS:
				return isArchiveSuppress();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG:
				return getDefaultTimerTrig();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION:
				return getDescription();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT:
				return getFormat();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO:
				return isInitializeDevio();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG:
				return getMinTimerTrig();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION:
				return getResolution();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS:
				return getUnits();
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
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT:
				setArchiveMaxInt((Double)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM:
				setArchiveMechanism((String)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT:
				setArchiveMinInt((Double)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY:
				setArchivePriority((Integer)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS:
				setArchiveSuppress((Boolean)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG:
				setDefaultTimerTrig((Double)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT:
				setFormat((String)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO:
				setInitializeDevio((Boolean)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG:
				setMinTimerTrig((Double)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION:
				setResolution((BigInteger)newValue);
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS:
				setUnits((String)newValue);
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
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT:
				unsetArchiveMaxInt();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM:
				unsetArchiveMechanism();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT:
				unsetArchiveMinInt();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY:
				unsetArchivePriority();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS:
				unsetArchiveSuppress();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG:
				unsetDefaultTimerTrig();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION:
				unsetDescription();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT:
				unsetFormat();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO:
				unsetInitializeDevio();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG:
				unsetMinTimerTrig();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION:
				unsetResolution();
				return;
			case BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS:
				unsetUnits();
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
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT:
				return isSetArchiveMaxInt();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM:
				return isSetArchiveMechanism();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT:
				return isSetArchiveMinInt();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY:
				return isSetArchivePriority();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS:
				return isSetArchiveSuppress();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG:
				return isSetDefaultTimerTrig();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION:
				return isSetDescription();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT:
				return isSetFormat();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO:
				return isSetInitializeDevio();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG:
				return isSetMinTimerTrig();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION:
				return isSetResolution();
			case BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS:
				return isSetUnits();
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
		result.append(" (archiveMaxInt: ");
		if (archiveMaxIntESet) result.append(archiveMaxInt); else result.append("<unset>");
		result.append(", archiveMechanism: ");
		if (archiveMechanismESet) result.append(archiveMechanism); else result.append("<unset>");
		result.append(", archiveMinInt: ");
		if (archiveMinIntESet) result.append(archiveMinInt); else result.append("<unset>");
		result.append(", archivePriority: ");
		if (archivePriorityESet) result.append(archivePriority); else result.append("<unset>");
		result.append(", archiveSuppress: ");
		if (archiveSuppressESet) result.append(archiveSuppress); else result.append("<unset>");
		result.append(", defaultTimerTrig: ");
		if (defaultTimerTrigESet) result.append(defaultTimerTrig); else result.append("<unset>");
		result.append(", description: ");
		if (descriptionESet) result.append(description); else result.append("<unset>");
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(", initializeDevio: ");
		if (initializeDevioESet) result.append(initializeDevio); else result.append("<unset>");
		result.append(", minTimerTrig: ");
		if (minTimerTrigESet) result.append(minTimerTrig); else result.append("<unset>");
		result.append(", resolution: ");
		if (resolutionESet) result.append(resolution); else result.append("<unset>");
		result.append(", units: ");
		if (unitsESet) result.append(units); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypelessPropertyImpl
