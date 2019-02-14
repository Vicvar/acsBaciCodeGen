/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;
import baciCodeGen.CharacteristicValue;
import baciCodeGen.CharacteristicValues;
import baciCodeGen.Instance;
import baciCodeGen.Property;
import baciCodeGen.PropertyDefinition;
import baciCodeGen.BACIProperties.impl.BACIPropertiesFactoryImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.CharacteristicValuesImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicValuesImpl#getInstanceCharacteristics <em>Instance Characteristics</em>}</li>
 *   <li>{@link baciCodeGen.impl.CharacteristicValuesImpl#getContainingInstance <em>Containing Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicValuesImpl extends MinimalEObjectImpl.Container implements CharacteristicValues {
	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstanceCharacteristics() <em>Instance Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CharacteristicValue> instanceCharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaciCodeGenPackage.Literals.CHARACTERISTIC_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_VALUES__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CharacteristicValue> getInstanceCharacteristics() {
		if (instanceCharacteristics == null) {
			instanceCharacteristics = new EObjectContainmentEList.Unsettable<CharacteristicValue>(CharacteristicValue.class, this, BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS);
		}
		return instanceCharacteristics;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CharacteristicValue> setInstanceCharacteristics(Property p){

			PropertyDefinition pd;
			BaciType bt;
			CharacteristicValue c;
			bt = p.getBaciType();
			pd = getBaciTypePropertyDefinition(bt.getAccessType().getValue(),bt.getBasicType().getValue(), bt.getSeqType().getValue());
			for (EAttribute attr : pd.eClass().getEAllAttributes()){
				c = new CharacteristicValueImpl();
				c.setName(attr.getName());
				c.setValue(attr.getDefaultValueLiteral());
				instanceCharacteristics.add(c);
			}
		
		return instanceCharacteristics;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PropertyDefinition getBaciTypePropertyDefinition(int accessType, int seqType, int basicType){
		PropertyDefinition propertyDefinition;
		BACIPropertiesFactoryImpl propertyFactory = new BACIPropertiesFactoryImpl();
		switch (accessType){
			case 0:
				switch (seqType){
					case 0:
						switch (basicType){
							case 0:
								propertyDefinition = propertyFactory.createROboolean();
								break;
							case 1:
								propertyDefinition = propertyFactory.createROdouble();
								break;
							case 2:
								propertyDefinition = propertyFactory.createROfloat();
								break;
							case 3:
								propertyDefinition = propertyFactory.createROlong();
								break;
							case 4:
								propertyDefinition = propertyFactory.createROlongLong();
								break;
							case 5:
								propertyDefinition = propertyFactory.createROuLong();
								break;
							case 6:
								propertyDefinition = propertyFactory.createROuLongLong();
								break;
							case 7:
								propertyDefinition = propertyFactory.createROpattern();
								break;
							case 8:
								propertyDefinition = propertyFactory.createROstring();
								break;
							default:
								throw new IllegalStateException("Undefined BACIType");
						}
						break;
					case 1:
						switch (basicType){
							case 0:
								propertyDefinition = propertyFactory.createRObooleanSeq();
								break;
							case 1:
								propertyDefinition = propertyFactory.createROdoubleSeq();
								break;
							case 2:
								propertyDefinition = propertyFactory.createROfloatSeq();
								break;
							case 3:
								propertyDefinition = propertyFactory.createROlongSeq();
								break;
							case 4:
								//propertyDefinition = propertyFactory.createROlongLongSeq();
								throw new UnsupportedOperationException("ROlongLongSeq can't be constructed. It's not a supported BACIType");
							case 5:
								propertyDefinition = propertyFactory.createROuLongSeq();
								break;
							case 6:
								//propertyDefinition = propertyFactory.createROuLongLongSeq();
								throw new UnsupportedOperationException("ROuLongLongSeq can't be constructed. It's not a supported BACIType");
							case 7:
								//propertyDefinition = propertyFactory.createROpatternSeq();
								throw new UnsupportedOperationException("ROpatternSeq can't be constructed. It's not a supported BACIType");
							case 8:
								propertyDefinition = propertyFactory.createROstringSeq();
								break;
							default:
								throw new IllegalStateException("Undefined BACIType");
						}
						break;
					default:
						throw new IllegalStateException("Undefined BACIType");
				}
				break;
			case 1:
				switch (seqType){
					case 0:
						switch (basicType){
							case 0:
								propertyDefinition = propertyFactory.createRWboolean();
								break;
							case 1:
								propertyDefinition = propertyFactory.createRWdouble();
								break;
							case 2:
								propertyDefinition = propertyFactory.createRWfloat();
								break;
							case 3:
								propertyDefinition = propertyFactory.createRWlong();
								break;
							case 4:
								propertyDefinition = propertyFactory.createRWlongLong();
								break;
							case 5:
								propertyDefinition = propertyFactory.createRWuLong();
								break;
							case 6:
								propertyDefinition = propertyFactory.createRWuLongLong();
								break;
							case 7:
								propertyDefinition = propertyFactory.createRWpattern();
								break;
							case 8:
								propertyDefinition = propertyFactory.createRWstring();
								break;
							default:
								throw new IllegalStateException("Undefined BACIType");
						}
						break;
					case 1:
						switch (basicType){
							case 0:
								propertyDefinition = propertyFactory.createRWbooleanSeq();
								break;
							case 1:
								propertyDefinition = propertyFactory.createRWdoubleSeq();
								break;
							case 2:
								propertyDefinition = propertyFactory.createRWfloatSeq();
								break;
							case 3:
								propertyDefinition = propertyFactory.createRWlongSeq();
								break;
							case 4:
								//propertyDefinition = propertyFactory.createRWlongLongSeq();
								throw new UnsupportedOperationException("RWlongLongSeq can't be constructed. It's not a supported BACIType");
							case 5:
								propertyDefinition = propertyFactory.createRWuLongSeq();
								break;
							case 6:
								//propertyDefinition = propertyFactory.createRWuLongLongSeq();
								throw new UnsupportedOperationException("RWuLongLongSeq can't be constructed. It's not a supported BACIType");
							case 7:
								//propertyDefinition = propertyFactory.createRWpatternSeq();
								throw new UnsupportedOperationException("RWpatternSeq can't be constructed. It's not a supported BACIType");
							case 8:
								//propertyDefinition = propertyFactory.createRWstringSeq();
								throw new UnsupportedOperationException("RWstringSeq can't be constructed. It's not a supported BACIType");
							default:
								throw new IllegalStateException("Undefined BACIType");
						}
						break;
					default:
						throw new IllegalStateException("Undefined BACIType");
				}
				break;
			default:
				throw new IllegalStateException("Undefined BACIType");
		}
		return propertyDefinition;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInstanceCharacteristics() {
		if (instanceCharacteristics != null) ((InternalEList.Unsettable<?>)instanceCharacteristics).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInstanceCharacteristics() {
		return instanceCharacteristics != null && ((InternalEList.Unsettable<?>)instanceCharacteristics).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance getContainingInstance() {
		if (eContainerFeatureID() != BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE) return null;
		return (Instance)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingInstance(Instance newContainingInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainingInstance, BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainingInstance(Instance newContainingInstance) {
		if (newContainingInstance != eInternalContainer() || (eContainerFeatureID() != BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE && newContainingInstance != null)) {
			if (EcoreUtil.isAncestor(this, newContainingInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainingInstance != null)
				msgs = ((InternalEObject)newContainingInstance).eInverseAdd(this, BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER, Instance.class, msgs);
			msgs = basicSetContainingInstance(newContainingInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE, newContainingInstance, newContainingInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS:
				return ((InternalEList<?>)getInstanceCharacteristics()).basicRemove(otherEnd, msgs);
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
				return eInternalContainer().eInverseRemove(this, BaciCodeGenPackage.INSTANCE__CHARACTERISTIC_VALUES_CONTAINER, Instance.class, msgs);
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__PROPERTY_NAME:
				return getPropertyName();
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS:
				return getInstanceCharacteristics();
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS:
				getInstanceCharacteristics().clear();
				getInstanceCharacteristics().addAll((Collection<? extends CharacteristicValue>)newValue);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS:
				unsetInstanceCharacteristics();
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
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
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__INSTANCE_CHARACTERISTICS:
				return isSetInstanceCharacteristics();
			case BaciCodeGenPackage.CHARACTERISTIC_VALUES__CONTAINING_INSTANCE:
				return getContainingInstance() != null;
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(')');
		return result.toString();
	}

} //CharacteristicValuesImpl
