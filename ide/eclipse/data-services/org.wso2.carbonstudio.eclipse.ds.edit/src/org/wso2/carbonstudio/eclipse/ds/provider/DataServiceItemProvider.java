/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.provider;


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

import org.wso2.carbonstudio.eclipse.ds.DataService;
import org.wso2.carbonstudio.eclipse.ds.DsFactory;
import org.wso2.carbonstudio.eclipse.ds.DsPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.carbonstudio.eclipse.ds.DataService} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataServiceItemProvider
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
	public DataServiceItemProvider(AdapterFactory adapterFactory) {
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

			addBaseURIPropertyDescriptor(object);
			addEnableBatchRequestsPropertyDescriptor(object);
			addEnableBoxcarringPropertyDescriptor(object);
			addEnableDTPPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addServiceGroupPropertyDescriptor(object);
			addServiceStatusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Base URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_baseURI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_baseURI_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__BASE_URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Batch Requests feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableBatchRequestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_enableBatchRequests_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_enableBatchRequests_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__ENABLE_BATCH_REQUESTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable Boxcarring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableBoxcarringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_enableBoxcarring_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_enableBoxcarring_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__ENABLE_BOXCARRING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enable DTP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableDTPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_enableDTP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_enableDTP_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__ENABLE_DTP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_DataService_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_name_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceGroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_serviceGroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_serviceGroup_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__SERVICE_GROUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataService_serviceStatus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataService_serviceStatus_feature", "_UI_DataService_type"),
				 DsPackage.Literals.DATA_SERVICE__SERVICE_STATUS,
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
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__DESCRIPTION);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__CONFIG);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__QUERY);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__EVENT_TRIGGER);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__OPERATION);
			childrenFeatures.add(DsPackage.Literals.DATA_SERVICE__RESOURCE);
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
	 * This returns DataService.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("wso2/data"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DataService)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DataService_type") :
			getString("_UI_DataService_type") + " " + label;
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

		switch (notification.getFeatureID(DataService.class)) {
			case DsPackage.DATA_SERVICE__BASE_URI:
			case DsPackage.DATA_SERVICE__ENABLE_BATCH_REQUESTS:
			case DsPackage.DATA_SERVICE__ENABLE_BOXCARRING:
			case DsPackage.DATA_SERVICE__ENABLE_DTP:
			case DsPackage.DATA_SERVICE__NAME:
			case DsPackage.DATA_SERVICE__SERVICE_GROUP:
			case DsPackage.DATA_SERVICE__SERVICE_STATUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DsPackage.DATA_SERVICE__DESCRIPTION:
			case DsPackage.DATA_SERVICE__CONFIG:
			case DsPackage.DATA_SERVICE__QUERY:
			case DsPackage.DATA_SERVICE__EVENT_TRIGGER:
			case DsPackage.DATA_SERVICE__OPERATION:
			case DsPackage.DATA_SERVICE__RESOURCE:
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
				(DsPackage.Literals.DATA_SERVICE__DESCRIPTION,
				 DsFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.DATA_SERVICE__CONFIG,
				 DsFactory.eINSTANCE.createDataSourceConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.DATA_SERVICE__QUERY,
				 DsFactory.eINSTANCE.createQuery()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.DATA_SERVICE__EVENT_TRIGGER,
				 DsFactory.eINSTANCE.createEventTrigger()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.DATA_SERVICE__OPERATION,
				 DsFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(DsPackage.Literals.DATA_SERVICE__RESOURCE,
				 DsFactory.eINSTANCE.createResource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DsEditPlugin.INSTANCE;
	}

}
