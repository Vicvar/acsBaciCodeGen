/**
 */
package baciCodeGen.impl;

import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;
import baciCodeGen.Characteristic;
import baciCodeGen.ComponentInstances;
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
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getContainingComponentInstances <em>Containing Component Instances</em>}</li>
 *   <li>{@link baciCodeGen.impl.InstanceImpl#getInstanceCharacteristics <em>Instance Characteristics</em>}</li>
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
	 * The cached value of the '{@link #getInstanceCharacteristics() <em>Instance Characteristics</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<Characteristic> instanceCharacteristics;

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
	public EList<Characteristic> getInstanceCharacteristics() {
		if (instanceCharacteristics == null) {
			instanceCharacteristics = new EObjectContainmentEList.Unsettable<Characteristic>(Characteristic.class, this, BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS);
		}
		else if(!isSetInstanceCharacteristics()){
			EList<Property> properties = this.getContainingComponentInstances().getContainingCaracteristicComponent().getProperties();
			PropertyDefinition pd;
			BaciType bt;
			Characteristic c;
			for (Property p : properties){
				bt = p.getBaciType();
				pd = getBaciTypePropertyDefinition(bt.getAccessType().getValue(),bt.getBasicType().getValue(), bt.getSeqType().getValue());
				for (EAttribute attr : pd.eClass().getEAllAttributes()){
					c = new CharacteristicImpl();
					c.setID(p.getName()+"_"+attr.getName());
					c.setName(attr.getName());
					c.setValue(attr.getDefaultValueLiteral());
					instanceCharacteristics.add(c);
				}
			}
		}
		return instanceCharacteristics;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private PropertyDefinition getBaciTypePropertyDefinition(int accessType, int seqType, int basicType){
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaciCodeGenPackage.INSTANCE__CONTAINING_COMPONENT_INSTANCES:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainingComponentInstances((ComponentInstances)otherEnd, msgs);
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
			case BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS:
				return ((InternalEList<?>)getInstanceCharacteristics()).basicRemove(otherEnd, msgs);
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
			case BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS:
				return getInstanceCharacteristics();
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
			case BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS:
				getInstanceCharacteristics().clear();
				getInstanceCharacteristics().addAll((Collection<? extends Characteristic>)newValue);
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
			case BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS:
				unsetInstanceCharacteristics();
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
			case BaciCodeGenPackage.INSTANCE__INSTANCE_CHARACTERISTICS:
				return isSetInstanceCharacteristics();
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
