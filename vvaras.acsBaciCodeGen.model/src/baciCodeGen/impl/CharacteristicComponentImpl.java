/**
 */
package baciCodeGen.impl;

import baciCodeGen.Action;
import baciCodeGen.Attribute;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CharacteristicComponent;
import baciCodeGen.Property;

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
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getModule <em>Module</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getComponentNumber <em>Component Number</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicComponentImpl#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicComponentImpl extends MinimalEObjectImpl.Container implements CharacteristicComponent {
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
	 * The default value of the '{@link #getComponentNumber() <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPONENT_NUMBER_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getComponentNumber() <em>Component Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNumber()
	 * @generated
	 * @ordered
	 */
	protected int componentNumber = COMPONENT_NUMBER_EDEFAULT;

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
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected baciCodeGen.Container container;

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
	public int getComponentNumber() {
		return componentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentNumber(int newComponentNumber) {
		int oldComponentNumber = componentNumber;
		componentNumber = newComponentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER, oldComponentNumber, componentNumber));
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
	public baciCodeGen.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (baciCodeGen.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public baciCodeGen.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(baciCodeGen.Container newContainer) {
		baciCodeGen.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER, oldContainer, container));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				return getModule();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				return getName();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				return getPrefix();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER:
				return getComponentNumber();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return getAttributes();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return getProperties();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return getActions();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				setModule((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				setPrefix((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER:
				setComponentNumber((Integer)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				setContainer((baciCodeGen.Container)newValue);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER:
				setComponentNumber(COMPONENT_NUMBER_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				getAttributes().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				getProperties().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				getActions().clear();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				setContainer((baciCodeGen.Container)null);
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
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER:
				return componentNumber != COMPONENT_NUMBER_EDEFAULT;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				return actions != null && !actions.isEmpty();
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__CONTAINER:
				return container != null;
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
		result.append(" (module: ");
		result.append(module);
		result.append(", name: ");
		result.append(name);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", componentNumber: ");
		result.append(componentNumber);
		result.append(')');
		return result.toString();
	}

} //CharacteristicComponentImpl
