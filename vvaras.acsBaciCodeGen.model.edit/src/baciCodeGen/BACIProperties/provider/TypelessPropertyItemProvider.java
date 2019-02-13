/**
 */
package baciCodeGen.BACIProperties.provider;


import baciCodeGen.BACIProperties.BACIPropertiesPackage;
import baciCodeGen.BACIProperties.TypelessProperty;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link baciCodeGen.BACIProperties.TypelessProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypelessPropertyItemProvider extends PropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypelessPropertyItemProvider(AdapterFactory adapterFactory) {
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

			addArchiveMaxIntPropertyDescriptor(object);
			addArchiveMechanismPropertyDescriptor(object);
			addArchiveMinIntPropertyDescriptor(object);
			addArchivePriorityPropertyDescriptor(object);
			addArchiveSuppressPropertyDescriptor(object);
			addDefaultTimerTrigPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
			addInitializeDevioPropertyDescriptor(object);
			addMinTimerTrigPropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
			addUnitsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Archive Max Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveMaxIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_archiveMaxInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_archiveMaxInt_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__ARCHIVE_MAX_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archive Mechanism feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveMechanismPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_archiveMechanism_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_archiveMechanism_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__ARCHIVE_MECHANISM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archive Min Int feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveMinIntPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_archiveMinInt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_archiveMinInt_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__ARCHIVE_MIN_INT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archive Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchivePriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_archivePriority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_archivePriority_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__ARCHIVE_PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Archive Suppress feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchiveSuppressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_archiveSuppress_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_archiveSuppress_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Timer Trig feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTimerTrigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_defaultTimerTrig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_defaultTimerTrig_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_description_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_format_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Initialize Devio feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializeDevioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_initializeDevio_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_initializeDevio_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__INITIALIZE_DEVIO,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Timer Trig feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinTimerTrigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_minTimerTrig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_minTimerTrig_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__MIN_TIMER_TRIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_resolution_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TypelessProperty_units_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TypelessProperty_units_feature", "_UI_TypelessProperty_type"),
				 BACIPropertiesPackage.Literals.TYPELESS_PROPERTY__UNITS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TypelessProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TypelessProperty"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TypelessProperty typelessProperty = (TypelessProperty)object;
		return getString("_UI_TypelessProperty_type") + " " + typelessProperty.getArchiveMaxInt();
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

		switch (notification.getFeatureID(TypelessProperty.class)) {
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MAX_INT:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MECHANISM:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_MIN_INT:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_PRIORITY:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__ARCHIVE_SUPPRESS:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DEFAULT_TIMER_TRIG:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__DESCRIPTION:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__FORMAT:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__INITIALIZE_DEVIO:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__MIN_TIMER_TRIG:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__RESOLUTION:
			case BACIPropertiesPackage.TYPELESS_PROPERTY__UNITS:
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
