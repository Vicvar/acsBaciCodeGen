/**
 */
package baciCodeGen.provider;

import baciCodeGen.util.BaciCodeGenAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BaciCodeGenItemProviderAdapterFactory extends BaciCodeGenAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaciCodeGenItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.CharacteristicComponent} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicComponentItemProvider characteristicComponentItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.CharacteristicComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicComponentAdapter() {
		if (characteristicComponentItemProvider == null) {
			characteristicComponentItemProvider = new CharacteristicComponentItemProvider(this);
		}

		return characteristicComponentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.Characteristic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicItemProvider characteristicItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicAdapter() {
		if (characteristicItemProvider == null) {
			characteristicItemProvider = new CharacteristicItemProvider(this);
		}

		return characteristicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.UsedDevIOs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedDevIOsItemProvider usedDevIOsItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.UsedDevIOs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsedDevIOsAdapter() {
		if (usedDevIOsItemProvider == null) {
			usedDevIOsItemProvider = new UsedDevIOsItemProvider(this);
		}

		return usedDevIOsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.DevIO} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevIOItemProvider devIOItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.DevIO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevIOAdapter() {
		if (devIOItemProvider == null) {
			devIOItemProvider = new DevIOItemProvider(this);
		}

		return devIOItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.ReadArgument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadArgumentItemProvider readArgumentItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.ReadArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadArgumentAdapter() {
		if (readArgumentItemProvider == null) {
			readArgumentItemProvider = new ReadArgumentItemProvider(this);
		}

		return readArgumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.WriteArgument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteArgumentItemProvider writeArgumentItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.WriteArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWriteArgumentAdapter() {
		if (writeArgumentItemProvider == null) {
			writeArgumentItemProvider = new WriteArgumentItemProvider(this);
		}

		return writeArgumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.CommonArgument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonArgumentItemProvider commonArgumentItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.CommonArgument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommonArgumentAdapter() {
		if (commonArgumentItemProvider == null) {
			commonArgumentItemProvider = new CommonArgumentItemProvider(this);
		}

		return commonArgumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.UsedBaciTypes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsedBaciTypesItemProvider usedBaciTypesItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.UsedBaciTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsedBaciTypesAdapter() {
		if (usedBaciTypesItemProvider == null) {
			usedBaciTypesItemProvider = new UsedBaciTypesItemProvider(this);
		}

		return usedBaciTypesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link baciCodeGen.BaciType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaciTypeItemProvider baciTypeItemProvider;

	/**
	 * This creates an adapter for a {@link baciCodeGen.BaciType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaciTypeAdapter() {
		if (baciTypeItemProvider == null) {
			baciTypeItemProvider = new BaciTypeItemProvider(this);
		}

		return baciTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (characteristicComponentItemProvider != null) characteristicComponentItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (characteristicItemProvider != null) characteristicItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (usedDevIOsItemProvider != null) usedDevIOsItemProvider.dispose();
		if (devIOItemProvider != null) devIOItemProvider.dispose();
		if (readArgumentItemProvider != null) readArgumentItemProvider.dispose();
		if (writeArgumentItemProvider != null) writeArgumentItemProvider.dispose();
		if (commonArgumentItemProvider != null) commonArgumentItemProvider.dispose();
		if (usedBaciTypesItemProvider != null) usedBaciTypesItemProvider.dispose();
		if (baciTypeItemProvider != null) baciTypeItemProvider.dispose();
	}

}
