/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;
import baciCodeGen.BaciTypeContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baci Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.BaciTypeContainerImpl#getBaciTypes <em>Baci Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaciTypeContainerImpl extends MinimalEObjectImpl.Container implements BaciTypeContainer {
	/**
	 * The cached value of the '{@link #getBaciTypes() <em>Baci Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaciTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<BaciType> baciTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaciTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.BACI_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BaciType> getBaciTypes() {
		if (baciTypes == null) {
			baciTypes = new EObjectContainmentEList<BaciType>(BaciType.class, this, BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES);
		}
		return baciTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES:
				return ((InternalEList<?>)getBaciTypes()).basicRemove(otherEnd, msgs);
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
			case BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES:
				return getBaciTypes();
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
			case BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES:
				getBaciTypes().clear();
				getBaciTypes().addAll((Collection<? extends BaciType>)newValue);
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
			case BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES:
				getBaciTypes().clear();
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
			case BaciCodeGenPackage.BACI_TYPE_CONTAINER__BACI_TYPES:
				return baciTypes != null && !baciTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaciTypeContainerImpl