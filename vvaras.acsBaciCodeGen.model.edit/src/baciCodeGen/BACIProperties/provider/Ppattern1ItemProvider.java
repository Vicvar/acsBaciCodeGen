/**
 */
package baciCodeGen.BACIProperties.provider;


import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.Ppattern1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link baciCodeGen.BACIProperties.Ppattern1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ppattern1ItemProvider extends PpatternItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ppattern1ItemProvider(AdapterFactory adapterFactory) {
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

			addArchiveDeltaPropertyDescriptor(object);
			addArchiveDeltaPercentPropertyDescriptor(object);
			addBitDescriptionPropertyDescriptor(object);
			addDefaultValuePropertyDescriptor(object);
			addMinStepPropertyDescriptor(object);
			addWhenClearedPropertyDescriptor(object);
			addWhenSetPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Archive Delta feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveDeltaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_archiveDelta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_archiveDelta_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__ARCHIVE_DELTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archive Delta Percent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveDeltaPercentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_archiveDeltaPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_archiveDeltaPercent_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__ARCHIVE_DELTA_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bit Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBitDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_bitDescription_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_bitDescription_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__BIT_DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_defaultValue_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Step feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinStepPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_minStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_minStep_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__MIN_STEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the When Cleared feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenClearedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_whenCleared_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_whenCleared_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__WHEN_CLEARED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the When Set feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWhenSetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Ppattern1_whenSet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Ppattern1_whenSet_feature", "_UI_Ppattern1_type"),
				 BACIPropertiesPackage.Literals.PPATTERN1__WHEN_SET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns Ppattern1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Ppattern1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Ppattern1 ppattern1 = (Ppattern1)object;
		return getString("_UI_Ppattern1_type") + " " + ppattern1.getArchiveMaxInt();
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

		switch (notification.getFeatureID(Ppattern1.class)) {
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA:
			case BACIPropertiesPackage.PPATTERN1__ARCHIVE_DELTA_PERCENT:
			case BACIPropertiesPackage.PPATTERN1__BIT_DESCRIPTION:
			case BACIPropertiesPackage.PPATTERN1__DEFAULT_VALUE:
			case BACIPropertiesPackage.PPATTERN1__MIN_STEP:
			case BACIPropertiesPackage.PPATTERN1__WHEN_CLEARED:
			case BACIPropertiesPackage.PPATTERN1__WHEN_SET:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
