/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CharacteristicComponent;
import baciCodeGen.ComponentInstances;
import baciCodeGen.Instance;

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
 * An implementation of the model object '<em><b>Component Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.ComponentInstancesImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link baciCodeGen.impl.ComponentInstancesImpl#getContainingCaracteristicComponent <em>Containing Caracteristic Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInstancesImpl extends MinimalEObjectImpl.Container implements ComponentInstances {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.COMPONENT_INSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentWithInverseEList<Instance>(Instance.class, this, BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES, BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicComponent getContainingCaracteristicComponent() {
		if (eContainerFeatureID() != BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT) return null;
		return (CharacteristicComponent)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingCaracteristicComponent(CharacteristicComponent newContainingCaracteristicComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingCaracteristicComponent, BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingCaracteristicComponent(CharacteristicComponent newContainingCaracteristicComponent) {
		if (newContainingCaracteristicComponent != eInternalContainer() || (eContainerFeatureID() != BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT && newContainingCaracteristicComponent != null)) {
			if (EcoreUtil.isAncestor(this, newContainingCaracteristicComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingCaracteristicComponent != null)
				msgs = ((InternalEObject)newContainingCaracteristicComponent).eInverseAdd(this, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES, CharacteristicComponent.class, msgs);
			msgs = basicSetContainingCaracteristicComponent(newContainingCaracteristicComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT, newContainingCaracteristicComponent, newContainingCaracteristicComponent));
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingCaracteristicComponent((CharacteristicComponent)otherEnd, msgs);
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				return basicSetContainingCaracteristicComponent(null, msgs);
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				return eInternalContainer().eInverseRemove(this, BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_INSTANCES, CharacteristicComponent.class, msgs);
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				return getInstances();
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				return getContainingCaracteristicComponent();
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends Instance>)newValue);
				return;
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				setContainingCaracteristicComponent((CharacteristicComponent)newValue);
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				getInstances().clear();
				return;
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				setContainingCaracteristicComponent((CharacteristicComponent)null);
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
			case BaciCodeGenPackage.COMPONENT_INSTANCES__INSTANCES:
				return instances != null && !instances.isEmpty();
			case BaciCodeGenPackage.COMPONENT_INSTANCES__CONTAINING_CARACTERISTIC_COMPONENT:
				return getContainingCaracteristicComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstancesImpl
