/**
 */
package baciCodeGen.BACI.provider;


import baciCodeGen.BACI.BACIPackage;
import baciCodeGen.BACI.PlongSeq1;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link baciCodeGen.BACI.PlongSeq1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlongSeq1ItemProvider extends PlongSeqItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlongSeq1ItemProvider(AdapterFactory adapterFactory) {
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
			addDefaultValuePropertyDescriptor(object);
			addGraphMaxPropertyDescriptor(object);
			addGraphMinPropertyDescriptor(object);
			addMinDeltaTrigPropertyDescriptor(object);
			addMinStepPropertyDescriptor(object);
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
				 getString("_UI_PlongSeq1_archiveDelta_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_archiveDelta_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__ARCHIVE_DELTA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_PlongSeq1_archiveDeltaPercent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_archiveDeltaPercent_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__ARCHIVE_DELTA_PERCENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
				 getString("_UI_PlongSeq1_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_defaultValue_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Graph Max feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlongSeq1_graphMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_graphMax_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__GRAPH_MAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Graph Min feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGraphMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlongSeq1_graphMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_graphMin_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__GRAPH_MIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Delta Trig feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinDeltaTrigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PlongSeq1_minDeltaTrig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_minDeltaTrig_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__MIN_DELTA_TRIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_PlongSeq1_minStep_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PlongSeq1_minStep_feature", "_UI_PlongSeq1_type"),
				 BACIPackage.Literals.PLONG_SEQ1__MIN_STEP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PlongSeq1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PlongSeq1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		PlongSeq1 plongSeq1 = (PlongSeq1)object;
		return getString("_UI_PlongSeq1_type") + " " + plongSeq1.getArchiveMaxInt();
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

		switch (notification.getFeatureID(PlongSeq1.class)) {
			case BACIPackage.PLONG_SEQ1__ARCHIVE_DELTA:
			case BACIPackage.PLONG_SEQ1__ARCHIVE_DELTA_PERCENT:
			case BACIPackage.PLONG_SEQ1__DEFAULT_VALUE:
			case BACIPackage.PLONG_SEQ1__GRAPH_MAX:
			case BACIPackage.PLONG_SEQ1__GRAPH_MIN:
			case BACIPackage.PLONG_SEQ1__MIN_DELTA_TRIG:
			case BACIPackage.PLONG_SEQ1__MIN_STEP:
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
