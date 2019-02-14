/**
 */
package baciCodeGen.impl;

import baciCodeGen.AttributeValues;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CharacteristicValues;
import baciCodeGen.ComponentInstances;
import baciCodeGen.Instance;
import baciCodeGen.Property;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getContainingComponentInstances <em>Containing Component Instances</em>}</li>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getAttributeValuesContainer <em>Attribute Values Container</em>}</li>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getCharacteristicValuesContainer <em>Characteristic Values Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends MinimalEObjectImpl.Container implements Instance {
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
	 * The cached value of the '{@link #getAttributeValuesContainer() <em>Attribute Values Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValuesContainer()
	 * @generated
	 * @ordered
	 */
	protected AttributeValues attributeValuesContainer;

	/**
	 * This is true if the Attribute Values Container containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeValuesContainerESet;

	/**
	 * The cached value of the '{@link #getCharacteristicValuesContainer() <em>Characteristic Values Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicValuesContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacteristicValues> characteristicValuesContainer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.INSTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstances getContainingComponentInstances() {
		if (eContainerFeatureID() != BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES) return null;
		return (ComponentInstances)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingComponentInstances(ComponentInstances newContainingComponentInstances, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingComponentInstances, BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingComponentInstances(ComponentInstances newContainingComponentInstances) {
		if (newContainingComponentInstances != eInternalContainer() || (eContainerFeatureID() != BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES && newContainingComponentInstances != null)) {
			if (EcoreUtil.isAncestor(this, newContainingComponentInstances))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingComponentInstances != null)
				msgs = ((InternalEObject)newContainingComponentInstances).eInverseAdd(this, BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES, ComponentInstances.class, msgs);
			msgs = basicSetContainingComponentInstances(newContainingComponentInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES, newContainingComponentInstances, newContainingComponentInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AttributeValues getAttributeValuesContainer() {
		if(!isSetAttributeValuesContainer()){
			attributeValuesContainer = new AttributeValuesImpl();
			attributeValuesContainer.setContainingInstance(this);
			attributeValuesContainer.getInstanceAttributes();
		}
		return attributeValuesContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeValuesContainer(AttributeValues newAttributeValuesContainer, NotificationChain msgs) {
		AttributeValues oldAttributeValuesContainer = attributeValuesContainer;
		attributeValuesContainer = newAttributeValuesContainer;
		boolean oldAttributeValuesContainerESet = attributeValuesContainerESet;
		attributeValuesContainerESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, oldAttributeValuesContainer, newAttributeValuesContainer, !oldAttributeValuesContainerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeValuesContainer(AttributeValues newAttributeValuesContainer) {
		if (newAttributeValuesContainer != attributeValuesContainer) {
			NotificationChain msgs = null;
			if (attributeValuesContainer != null)
				msgs = ((InternalEObject)attributeValuesContainer).eInverseRemove(this, BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE, AttributeValues.class, msgs);
			if (newAttributeValuesContainer != null)
				msgs = ((InternalEObject)newAttributeValuesContainer).eInverseAdd(this, BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE, AttributeValues.class, msgs);
			msgs = basicSetAttributeValuesContainer(newAttributeValuesContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAttributeValuesContainerESet = attributeValuesContainerESet;
			attributeValuesContainerESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, newAttributeValuesContainer, newAttributeValuesContainer, !oldAttributeValuesContainerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetAttributeValuesContainer(NotificationChain msgs) {
		AttributeValues oldAttributeValuesContainer = attributeValuesContainer;
		attributeValuesContainer = null;
		boolean oldAttributeValuesContainerESet = attributeValuesContainerESet;
		attributeValuesContainerESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, oldAttributeValuesContainer, null, oldAttributeValuesContainerESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeValuesContainer() {
		if (attributeValuesContainer != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)attributeValuesContainer).eInverseRemove(this, BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE, AttributeValues.class, msgs);
			msgs = basicUnsetAttributeValuesContainer(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldAttributeValuesContainerESet = attributeValuesContainerESet;
			attributeValuesContainerESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, null, null, oldAttributeValuesContainerESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeValuesContainer() {
		return attributeValuesContainerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CharacteristicValues> getCharacteristicValuesContainer() {
		if (characteristicValuesContainer == null) {
			characteristicValuesContainer = new EObjectContainmentWithInverseEList.Unsettable<CharacteristicValues>(CharacteristicValues.class, this, BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER, BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE);
		}
		else if(!isSetCharacteristicValuesContainer()){
			EList<Property> properties = this.getContainingComponentInstances().getContainingCaracteristicComponent().getProperties();
			System.out.println(properties);
			CharacteristicValues c;
			for (Property p : properties){
				c = new CharacteristicValuesImpl();
				c.setPropertyName(p.getName());
				c.getInstanceCharacteristics();
				c.setInstanceCharacteristics(p);
				characteristicValuesContainer.add(c);
			}
		}
		return characteristicValuesContainer;
}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCharacteristicValuesContainer() {
		if (characteristicValuesContainer != null) ((InternalEList.Unsettable<?>)characteristicValuesContainer).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCharacteristicValuesContainer() {
		return characteristicValuesContainer != null && ((InternalEList.Unsettable<?>)characteristicValuesContainer).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingComponentInstances((ComponentInstances)otherEnd, msgs);
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				if (attributeValuesContainer != null)
					msgs = ((InternalEObject)attributeValuesContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, null, msgs);
				return basicSetAttributeValuesContainer((AttributeValues)otherEnd, msgs);
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCharacteristicValuesContainer()).basicAdd(otherEnd, msgs);
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
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				return basicSetContainingComponentInstances(null, msgs);
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				return basicUnsetAttributeValuesContainer(msgs);
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				return ((InternalEList<?>)getCharacteristicValuesContainer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				return eInternalContainer().eInverseRemove(this, BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES, ComponentInstances.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaciCodeGenPackage.INSTANCE__NAME:
				return getName();
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				return getContainingComponentInstances();
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				return getAttributeValuesContainer();
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				return getCharacteristicValuesContainer();
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
			case BaciCodeGenPackage.INSTANCE__NAME:
				setName((String)newValue);
				return;
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				setContainingComponentInstances((ComponentInstances)newValue);
				return;
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				setAttributeValuesContainer((AttributeValues)newValue);
				return;
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				getCharacteristicValuesContainer().clear();
				getCharacteristicValuesContainer().addAll((Collection<? extends CharacteristicValues>)newValue);
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
			case BaciCodeGenPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				setContainingComponentInstances((ComponentInstances)null);
				return;
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				unsetAttributeValuesContainer();
				return;
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				unsetCharacteristicValuesContainer();
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
			case BaciCodeGenPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				return getContainingComponentInstances() != null;
			case BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER:
				return isSetAttributeValuesContainer();
			case BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER:
				return isSetCharacteristicValuesContainer();
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
		result.append(')');
		return result.toString();
	}

} //InstanceImpl
