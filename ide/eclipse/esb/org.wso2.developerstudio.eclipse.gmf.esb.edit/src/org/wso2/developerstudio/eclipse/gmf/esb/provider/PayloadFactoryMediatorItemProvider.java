/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.gmf.esb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbFactory;
import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator;

/**
 * This is the item provider adapter for a {@link org.wso2.developerstudio.eclipse.gmf.esb.PayloadFactoryMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PayloadFactoryMediatorItemProvider
	extends MediatorItemProvider
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
	public PayloadFactoryMediatorItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors != null) {
			itemPropertyDescriptors.clear();
		}
		super.getPropertyDescriptors(object);

		addFormatPropertyDescriptor(object);
		addArgsPropertyDescriptor(object);
		addMediaTypePropertyDescriptor(object);

		return itemPropertyDescriptors;
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
				 getString("_UI_PayloadFactoryMediator_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PayloadFactoryMediator_format_feature", "_UI_PayloadFactoryMediator_type"),
				 EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__FORMAT,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PayloadFactoryMediator_args_feature"),
				 "Arguments",
				 EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__ARGS,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Media Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMediaTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PayloadFactoryMediator_mediaType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PayloadFactoryMediator_mediaType_feature", "_UI_PayloadFactoryMediator_type"),
				 EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__MEDIA_TYPE,
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
			childrenFeatures.add(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__ARGS);
			childrenFeatures.add(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__INPUT_CONNECTOR);
			childrenFeatures.add(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__OUTPUT_CONNECTOR);
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
	 * This returns PayloadFactoryMediator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PayloadFactoryMediator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_PayloadFactoryMediator_type");
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

		switch (notification.getFeatureID(PayloadFactoryMediator.class)) {
			case EsbPackage.PAYLOAD_FACTORY_MEDIATOR__FORMAT:
			case EsbPackage.PAYLOAD_FACTORY_MEDIATOR__MEDIA_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EsbPackage.PAYLOAD_FACTORY_MEDIATOR__ARGS:
			case EsbPackage.PAYLOAD_FACTORY_MEDIATOR__INPUT_CONNECTOR:
			case EsbPackage.PAYLOAD_FACTORY_MEDIATOR__OUTPUT_CONNECTOR:
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
				(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__ARGS,
				 EsbFactory.eINSTANCE.createPayloadFactoryArgument()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__INPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createPayloadFactoryMediatorInputConnector()));

		newChildDescriptors.add
			(createChildParameter
				(EsbPackage.Literals.PAYLOAD_FACTORY_MEDIATOR__OUTPUT_CONNECTOR,
				 EsbFactory.eINSTANCE.createPayloadFactoryMediatorOutputConnector()));
	}

}
