/**
 */
package baciCodeGen.util;

import baciCodeGen.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see baciCodeGen.BaciCodeGenPackage
 * @generated
 */
public class BaciCodeGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BaciCodeGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciCodeGenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BaciCodeGenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaciCodeGenSwitch<Adapter> modelSwitch =
		new BaciCodeGenSwitch<Adapter>() {
			@Override
			public Adapter caseCharacteristicComponent(CharacteristicComponent object) {
				return createCharacteristicComponentAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseUsedDevIOs(UsedDevIOs object) {
				return createUsedDevIOsAdapter();
			}
			@Override
			public Adapter caseDevIO(DevIO object) {
				return createDevIOAdapter();
			}
			@Override
			public Adapter caseDevIOVariable(DevIOVariable object) {
				return createDevIOVariableAdapter();
			}
			@Override
			public Adapter casePropertySpecificVariable(PropertySpecificVariable object) {
				return createPropertySpecificVariableAdapter();
			}
			@Override
			public Adapter caseCommonVariable(CommonVariable object) {
				return createCommonVariableAdapter();
			}
			@Override
			public Adapter caseAuxiliaryVariable(AuxiliaryVariable object) {
				return createAuxiliaryVariableAdapter();
			}
			@Override
			public Adapter caseUsedBaciTypes(UsedBaciTypes object) {
				return createUsedBaciTypesAdapter();
			}
			@Override
			public Adapter caseBaciType(BaciType object) {
				return createBaciTypeAdapter();
			}
			@Override
			public Adapter caseComponentInstances(ComponentInstances object) {
				return createComponentInstancesAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseAttributeValues(AttributeValues object) {
				return createAttributeValuesAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseCharacteristicValues(CharacteristicValues object) {
				return createCharacteristicValuesAdapter();
			}
			@Override
			public Adapter caseCharacteristicValue(CharacteristicValue object) {
				return createCharacteristicValueAdapter();
			}
			@Override
			public Adapter casePropertyDefinition(PropertyDefinition object) {
				return createPropertyDefinitionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.CharacteristicComponent <em>Characteristic Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.CharacteristicComponent
	 * @generated
	 */
	public Adapter createCharacteristicComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.UsedDevIOs <em>Used Dev IOs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.UsedDevIOs
	 * @generated
	 */
	public Adapter createUsedDevIOsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.DevIO <em>Dev IO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.DevIO
	 * @generated
	 */
	public Adapter createDevIOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.DevIOVariable <em>Dev IO Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.DevIOVariable
	 * @generated
	 */
	public Adapter createDevIOVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.PropertySpecificVariable <em>Property Specific Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.PropertySpecificVariable
	 * @generated
	 */
	public Adapter createPropertySpecificVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.CommonVariable <em>Common Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.CommonVariable
	 * @generated
	 */
	public Adapter createCommonVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.AuxiliaryVariable <em>Auxiliary Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.AuxiliaryVariable
	 * @generated
	 */
	public Adapter createAuxiliaryVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.UsedBaciTypes <em>Used Baci Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.UsedBaciTypes
	 * @generated
	 */
	public Adapter createUsedBaciTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.BaciType <em>Baci Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.BaciType
	 * @generated
	 */
	public Adapter createBaciTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.ComponentInstances <em>Component Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.ComponentInstances
	 * @generated
	 */
	public Adapter createComponentInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.AttributeValues <em>Attribute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.AttributeValues
	 * @generated
	 */
	public Adapter createAttributeValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.CharacteristicValues <em>Characteristic Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.CharacteristicValues
	 * @generated
	 */
	public Adapter createCharacteristicValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.CharacteristicValue <em>Characteristic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.CharacteristicValue
	 * @generated
	 */
	public Adapter createCharacteristicValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link baciCodeGen.PropertyDefinition <em>Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see baciCodeGen.PropertyDefinition
	 * @generated
	 */
	public Adapter createPropertyDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BaciCodeGenAdapterFactory
