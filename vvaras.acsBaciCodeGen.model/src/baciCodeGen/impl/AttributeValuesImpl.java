/**
 */
package baciCodeGen.impl;

import baciCodeGen.Attribute;
import baciCodeGen.AttributeValue;
import baciCodeGen.AttributeValues;
import baciCodeGen.BaciCodeGenPackage;

import baciCodeGen.Instance;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.AttributeValuesImpl#getInstanceAttributes <em>Instance Attributes</em>}</li>
 *   <li>{@link baciCodeGen.impl.AttributeValuesImpl#getContainingInstance <em>Containing Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeValuesImpl extends MinimalEObjectImpl.Container implements AttributeValues {
	/**
	 * The cached value of the '{@link #getInstanceAttributes() <em>Instance Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> instanceAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.ATTRIBUTE_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AttributeValue> getInstanceAttributes() {
		if (instanceAttributes == null) {
			instanceAttributes = new EObjectContainmentEList.Unsettable<AttributeValue>(AttributeValue.class, this, BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES);
		}
		else if(!isSetInstanceAttributes()){
			EList<Attribute> attributes = this.getContainingInstance().getContainingComponentInstances().getContainingCaracteristicComponent().getAttributes();
			AttributeValue av;
			for (Attribute a : attributes){
				av = new AttributeValueImpl();
				av.setName(a.getName());
				av.setValue(a.getDefaultValue());
				instanceAttributes.add(av);
			}
		}
		return instanceAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceAttributes() {
		if (instanceAttributes != null) ((InternalEList.Unsettable<?>)instanceAttributes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceAttributes() {
		return instanceAttributes != null && ((InternalEList.Unsettable<?>)instanceAttributes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getContainingInstance() {
		if (eContainerFeatureID() != BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE) return null;
		return (Instance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingInstance(Instance newContainingInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingInstance, BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingInstance(Instance newContainingInstance) {
		if (newContainingInstance != eInternalContainer() || (eContainerFeatureID() != BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE && newContainingInstance != null)) {
			if (EcoreUtil.isAncestor(this, newContainingInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingInstance != null)
				msgs = ((InternalEObject)newContainingInstance).eInverseAdd(this, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, Instance.class, msgs);
			msgs = basicSetContainingInstance(newContainingInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE, newContainingInstance, newContainingInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingInstance((Instance)otherEnd, msgs);
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES:
				return ((InternalEList<?>)getInstanceAttributes()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				return basicSetContainingInstance(null, msgs);
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				return eInternalContainer().eInverseRemove(this, BaciCodeGenPackage.INSTANCE__ATTRIBUTE_VALUES_CONTAINER, Instance.class, msgs);
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES:
				return getInstanceAttributes();
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				return getContainingInstance();
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES:
				getInstanceAttributes().clear();
				getInstanceAttributes().addAll((Collection<? extends AttributeValue>)newValue);
				return;
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				setContainingInstance((Instance)newValue);
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES:
				unsetInstanceAttributes();
				return;
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				setContainingInstance((Instance)null);
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
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__INSTANCE_ATTRIBUTES:
				return isSetInstanceAttributes();
			case BaciCodeGenPackage.ATTRIBUTE_VALUES__CONTAINING_INSTANCE:
				return getContainingInstance() != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValuesImpl
