/**
 */
package baciCodeGen.provider;


import baciCodeGen.BACI.BACIFactory;
import baciCodeGen.BaciCodeGenPackage;
import baciCodeGen.BaciType;

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
 * This is the item provider adapter for a {@link baciCodeGen.BaciType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaciTypeItemProvider 
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
	public BaciTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addAccessTypePropertyDescriptor(object);
			addBasicTypePropertyDescriptor(object);
			addSeqTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_BaciType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BaciType_name_feature", "_UI_BaciType_type"),
				 BaciCodeGenPackage.Literals.BACI_TYPE__NAME,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BaciType_accessType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BaciType_accessType_feature", "_UI_BaciType_type"),
				 BaciCodeGenPackage.Literals.BACI_TYPE__ACCESS_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Basic Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasicTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BaciType_basicType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BaciType_basicType_feature", "_UI_BaciType_type"),
				 BaciCodeGenPackage.Literals.BACI_TYPE__BASIC_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seq Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeqTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BaciType_seqType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BaciType_seqType_feature", "_UI_BaciType_type"),
				 BaciCodeGenPackage.Literals.BACI_TYPE__SEQ_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS);
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
	 * This returns BaciType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BaciType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BaciType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BaciType_type") :
			getString("_UI_BaciType_type") + " " + label;
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

		switch (notification.getFeatureID(BaciType.class)) {
			case BaciCodeGenPackage.BACI_TYPE__NAME:
			case BaciCodeGenPackage.BACI_TYPE__ACCESS_TYPE:
			case BaciCodeGenPackage.BACI_TYPE__BASIC_TYPE:
			case BaciCodeGenPackage.BACI_TYPE__SEQ_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BaciCodeGenPackage.BACI_TYPE__BACI_CHARACTERISTICS:
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
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROboolean()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRObooleanSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROdouble()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROdoubleSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROfloat()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROfloatSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROlong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROlongLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROlongSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROpattern()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROstring()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROstringSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROuLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROuLongLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createROuLongSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWboolean()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWbooleanSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWdouble()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWdoubleSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWfloat()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWfloatSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWlong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWlongLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWlongSeq()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWpattern()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWstring()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWuLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWuLongLong()));

		newChildDescriptors.add
			(createChildParameter
				(BaciCodeGenPackage.Literals.BACI_TYPE__BACI_CHARACTERISTICS,
				 BACIFactory.eINSTANCE.createRWuLongSeq()));
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
