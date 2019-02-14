/**
 */
package baciCodeGen.impl;

import baciCodeGen.Action;
import baciCodeGen.Attribute;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CharacteristicComponent;
import baciCodeGen.ComponentInstances;
import baciCodeGen.Property;
import baciCodeGen.UsedBaciTypes;
import baciCodeGen.UsedDevIOs;

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
 * An implementation of the model object '<em><b>Characteristic Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getModule <em>Module</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getUsedBaciTypes <em>Used Baci Types</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getUsedDevIOs <em>Used Dev IOs</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getComponentInstances <em>Component Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicComponentImpl extends MinimalEObjectImpl.Container implements CharacteristicComponent {
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
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected String container = CONTAINER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The cached value of the '{@link #getUsedBaciTypes() <em>Used Baci Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedBaciTypes()
	 * @generated
	 * @ordered
	 */
	protected UsedBaciTypes usedBaciTypes;

	/**
	 * The cached value of the '{@link #getUsedDevIOs() <em>Used Dev IOs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedDevIOs()
	 * @generated
	 * @ordered
	 */
	protected UsedDevIOs usedDevIOs;

	/**
	 * The cached value of the '{@link #getComponentInstances() <em>Component Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstances()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstances componentInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(String newContainer) {
		String oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedBaciTypes getUsedBaciTypes() {
		return usedBaciTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedBaciTypes(UsedBaciTypes newUsedBaciTypes, NotificationChain msgs) {
		UsedBaciTypes oldUsedBaciTypes = usedBaciTypes;
		usedBaciTypes = newUsedBaciTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES, oldUsedBaciTypes, newUsedBaciTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedBaciTypes(UsedBaciTypes newUsedBaciTypes) {
		if (newUsedBaciTypes != usedBaciTypes) {
			NotificationChain msgs = null;
			if (usedBaciTypes != null)
				msgs = ((InternalEObject)usedBaciTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES, null, msgs);
			if (newUsedBaciTypes != null)
				msgs = ((InternalEObject)newUsedBaciTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES, null, msgs);
			msgs = basicSetUsedBaciTypes(newUsedBaciTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES, newUsedBaciTypes, newUsedBaciTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsedDevIOs getUsedDevIOs() {
		return usedDevIOs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsedDevIOs(UsedDevIOs newUsedDevIOs, NotificationChain msgs) {
		UsedDevIOs oldUsedDevIOs = usedDevIOs;
		usedDevIOs = newUsedDevIOs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS, oldUsedDevIOs, newUsedDevIOs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedDevIOs(UsedDevIOs newUsedDevIOs) {
		if (newUsedDevIOs != usedDevIOs) {
			NotificationChain msgs = null;
			if (usedDevIOs != null)
				msgs = ((InternalEObject)usedDevIOs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS, null, msgs);
			if (newUsedDevIOs != null)
				msgs = ((InternalEObject)newUsedDevIOs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS, null, msgs);
			msgs = basicSetUsedDevIOs(newUsedDevIOs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS, newUsedDevIOs, newUsedDevIOs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstances getComponentInstances() {
		return componentInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstances(ComponentInstances newComponentInstances, NotificationChain msgs) {
		ComponentInstances oldComponentInstances = componentInstances;
		componentInstances = newComponentInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES, oldComponentInstances, newComponentInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstances(ComponentInstances newComponentInstances) {
		if (newComponentInstances != componentInstances) {
			NotificationChain msgs = null;
			if (componentInstances != null)
				msgs = ((InternalEObject)componentInstances).eInverseRemove(this, BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT, ComponentInstances.class, msgs);
			if (newComponentInstances != null)
				msgs = ((InternalEObject)newComponentInstances).eInverseAdd(this, BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT, ComponentInstances.class, msgs);
			msgs = basicSetComponentInstances(newComponentInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES, newComponentInstances, newComponentInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				if (componentInstances != null)
					msgs = ((InternalEObject)componentInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES, null, msgs);
				return basicSetComponentInstances((ComponentInstances)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES:
				return basicSetUsedBaciTypes(null, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS:
				return basicSetUsedDevIOs(null, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				return basicSetComponentInstances(null, msgs);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				return getName();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				return getModule();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				return getPrefix();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				return getContainer();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return getActions();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return getAttributes();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return getProperties();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES:
				return getUsedBaciTypes();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS:
				return getUsedDevIOs();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				return getComponentInstances();
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				setModule((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				setPrefix((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				setContainer((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES:
				setUsedBaciTypes((UsedBaciTypes)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS:
				setUsedDevIOs((UsedDevIOs)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstances)newValue);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				getActions().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				getProperties().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES:
				setUsedBaciTypes((UsedBaciTypes)null);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS:
				setUsedDevIOs((UsedDevIOs)null);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				setComponentInstances((ComponentInstances)null);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				return CONTAINER_EDEFAULT == null ? container != null : !CONTAINER_EDEFAULT.equals(container);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_BACI_TYPES:
				return usedBaciTypes != null;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__USED_DEV_IOS:
				return usedDevIOs != null;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES:
				return componentInstances != null;
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
		result.append(", module: ");
		result.append(module);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", container: ");
		result.append(container);
		result.append(')');
		return result.toString();
	}

} //CharacteristicComponentImpl
