/**
 */
package baciCodeGen.provider;


import baciCodeGen.BaciCodeGenFactory;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.CharacteristicComponent;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link baciCodeGen.CharacteristicComponent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CharacteristicComponentItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addModulePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPrefixPropertyDescriptor(object);
			addComponentNumberPropertyDescriptor(object);
			addContainerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Module feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CharacteristicComponent_module_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CharacteristicComponent_module_feature", "_UI_CharacteristicComponent_type"),
				 BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__MODULE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CharacteristicComponent_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CharacteristicComponent_name_feature", "_UI_CharacteristicComponent_type"),
				 BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Prefix feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrefixPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CharacteristicComponent_prefix_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CharacteristicComponent_prefix_feature", "_UI_CharacteristicComponent_type"),
				 BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__PREFIX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CharacteristicComponent_componentNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CharacteristicComponent_componentNumber_feature", "_UI_CharacteristicComponent_type"),
				 BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CharacteristicComponent_container_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CharacteristicComponent_container_feature", "_UI_CharacteristicComponent_type"),
				 BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__CONTAINER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__ATTRIBUTES);
			childrenFeatures.add(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__PROPERTIES);
			childrenFeatures.add(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__ACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CharacteristicComponent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CharacteristicComponent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CharacteristicComponent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CharacteristicComponent_type") :
			getString("_UI_CharacteristicComponent_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CharacteristicComponent.class)) {
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__MODULE:
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__NAME:
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PREFIX:
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__COMPONENT_NUMBER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ATTRIBUTES:
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__PROPERTIES:
			case BaciCodeGenPackage.CHARACTERISTIC_COMPONENT__ACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__ATTRIBUTES,
				 BaciCodeGenFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__PROPERTIES,
				 BaciCodeGenFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.CHARACTERISTIC_COMPONENT__ACTIONS,
				 BaciCodeGenFactory.eINSTANCE.createAction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BaciCodeGenModelEditPlugin.INSTANCE;
	}

}
