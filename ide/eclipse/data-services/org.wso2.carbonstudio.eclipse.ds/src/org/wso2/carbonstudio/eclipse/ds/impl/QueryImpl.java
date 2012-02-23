/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.carbonstudio.eclipse.ds.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wso2.carbonstudio.eclipse.ds.DsPackage;
import org.wso2.carbonstudio.eclipse.ds.ExcelQuery;
import org.wso2.carbonstudio.eclipse.ds.GSpreadQuery;
import org.wso2.carbonstudio.eclipse.ds.Query;
import org.wso2.carbonstudio.eclipse.ds.QueryParameter;
import org.wso2.carbonstudio.eclipse.ds.QueryPropertyList;
import org.wso2.carbonstudio.eclipse.ds.ResultMapping;
import org.wso2.carbonstudio.eclipse.ds.Sparql;
import org.wso2.carbonstudio.eclipse.ds.Sql;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getSql <em>Sql</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getSparql <em>Sparql</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getExcel <em>Excel</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getGspread <em>Gspread</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getInputEventTrigger <em>Input Event Trigger</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getOutputEventTrigger <em>Output Event Trigger</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#isReturnGeneratedKeys <em>Return Generated Keys</em>}</li>
 *   <li>{@link org.wso2.carbonstudio.eclipse.ds.impl.QueryImpl#getUseConfig <em>Use Config</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends EObjectImpl implements Query {
	/**
	 * The cached value of the '{@link #getSql() <em>Sql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSql()
	 * @generated
	 * @ordered
	 */
	protected EList<Sql> sql;

	/**
	 * The cached value of the '{@link #getSparql() <em>Sparql</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSparql()
	 * @generated
	 * @ordered
	 */
	protected EList<Sparql> sparql;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryPropertyList> properties;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultMapping> result;

	/**
	 * The cached value of the '{@link #getExcel() <em>Excel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcel()
	 * @generated
	 * @ordered
	 */
	protected EList<ExcelQuery> excel;

	/**
	 * The cached value of the '{@link #getGspread() <em>Gspread</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGspread()
	 * @generated
	 * @ordered
	 */
	protected EList<GSpreadQuery> gspread;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParameter> param;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputEventTrigger() <em>Input Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EVENT_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputEventTrigger() <em>Input Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected String inputEventTrigger = INPUT_EVENT_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputEventTrigger() <em>Output Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EVENT_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputEventTrigger() <em>Output Event Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventTrigger()
	 * @generated
	 * @ordered
	 */
	protected String outputEventTrigger = OUTPUT_EVENT_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnGeneratedKeys() <em>Return Generated Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnGeneratedKeys()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_GENERATED_KEYS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnGeneratedKeys() <em>Return Generated Keys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnGeneratedKeys()
	 * @generated
	 * @ordered
	 */
	protected boolean returnGeneratedKeys = RETURN_GENERATED_KEYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseConfig() <em>Use Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseConfig() <em>Use Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseConfig()
	 * @generated
	 * @ordered
	 */
	protected String useConfig = USE_CONFIG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsPackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sql> getSql() {
		if (sql == null) {
			sql = new EObjectContainmentEList<Sql>(Sql.class, this, DsPackage.QUERY__SQL);
		}
		return sql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sparql> getSparql() {
		if (sparql == null) {
			sparql = new EObjectContainmentEList<Sparql>(Sparql.class, this, DsPackage.QUERY__SPARQL);
		}
		return sparql;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryPropertyList> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<QueryPropertyList>(QueryPropertyList.class, this, DsPackage.QUERY__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultMapping> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<ResultMapping>(ResultMapping.class, this, DsPackage.QUERY__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExcelQuery> getExcel() {
		if (excel == null) {
			excel = new EObjectContainmentEList<ExcelQuery>(ExcelQuery.class, this, DsPackage.QUERY__EXCEL);
		}
		return excel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GSpreadQuery> getGspread() {
		if (gspread == null) {
			gspread = new EObjectContainmentEList<GSpreadQuery>(GSpreadQuery.class, this, DsPackage.QUERY__GSPREAD);
		}
		return gspread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParameter> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<QueryParameter>(QueryParameter.class, this, DsPackage.QUERY__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputEventTrigger() {
		return inputEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEventTrigger(String newInputEventTrigger) {
		String oldInputEventTrigger = inputEventTrigger;
		inputEventTrigger = newInputEventTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__INPUT_EVENT_TRIGGER, oldInputEventTrigger, inputEventTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputEventTrigger() {
		return outputEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEventTrigger(String newOutputEventTrigger) {
		String oldOutputEventTrigger = outputEventTrigger;
		outputEventTrigger = newOutputEventTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__OUTPUT_EVENT_TRIGGER, oldOutputEventTrigger, outputEventTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReturnGeneratedKeys() {
		return returnGeneratedKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnGeneratedKeys(boolean newReturnGeneratedKeys) {
		boolean oldReturnGeneratedKeys = returnGeneratedKeys;
		returnGeneratedKeys = newReturnGeneratedKeys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__RETURN_GENERATED_KEYS, oldReturnGeneratedKeys, returnGeneratedKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseConfig() {
		return useConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseConfig(String newUseConfig) {
		String oldUseConfig = useConfig;
		useConfig = newUseConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsPackage.QUERY__USE_CONFIG, oldUseConfig, useConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsPackage.QUERY__SQL:
				return ((InternalEList<?>)getSql()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__SPARQL:
				return ((InternalEList<?>)getSparql()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__EXCEL:
				return ((InternalEList<?>)getExcel()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__GSPREAD:
				return ((InternalEList<?>)getGspread()).basicRemove(otherEnd, msgs);
			case DsPackage.QUERY__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsPackage.QUERY__SQL:
				return getSql();
			case DsPackage.QUERY__SPARQL:
				return getSparql();
			case DsPackage.QUERY__PROPERTIES:
				return getProperties();
			case DsPackage.QUERY__RESULT:
				return getResult();
			case DsPackage.QUERY__EXCEL:
				return getExcel();
			case DsPackage.QUERY__GSPREAD:
				return getGspread();
			case DsPackage.QUERY__PARAM:
				return getParam();
			case DsPackage.QUERY__ID:
				return getId();
			case DsPackage.QUERY__INPUT_EVENT_TRIGGER:
				return getInputEventTrigger();
			case DsPackage.QUERY__OUTPUT_EVENT_TRIGGER:
				return getOutputEventTrigger();
			case DsPackage.QUERY__RETURN_GENERATED_KEYS:
				return isReturnGeneratedKeys();
			case DsPackage.QUERY__USE_CONFIG:
				return getUseConfig();
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
			case DsPackage.QUERY__SQL:
				getSql().clear();
				getSql().addAll((Collection<? extends Sql>)newValue);
				return;
			case DsPackage.QUERY__SPARQL:
				getSparql().clear();
				getSparql().addAll((Collection<? extends Sparql>)newValue);
				return;
			case DsPackage.QUERY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends QueryPropertyList>)newValue);
				return;
			case DsPackage.QUERY__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends ResultMapping>)newValue);
				return;
			case DsPackage.QUERY__EXCEL:
				getExcel().clear();
				getExcel().addAll((Collection<? extends ExcelQuery>)newValue);
				return;
			case DsPackage.QUERY__GSPREAD:
				getGspread().clear();
				getGspread().addAll((Collection<? extends GSpreadQuery>)newValue);
				return;
			case DsPackage.QUERY__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends QueryParameter>)newValue);
				return;
			case DsPackage.QUERY__ID:
				setId((String)newValue);
				return;
			case DsPackage.QUERY__INPUT_EVENT_TRIGGER:
				setInputEventTrigger((String)newValue);
				return;
			case DsPackage.QUERY__OUTPUT_EVENT_TRIGGER:
				setOutputEventTrigger((String)newValue);
				return;
			case DsPackage.QUERY__RETURN_GENERATED_KEYS:
				setReturnGeneratedKeys((Boolean)newValue);
				return;
			case DsPackage.QUERY__USE_CONFIG:
				setUseConfig((String)newValue);
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
			case DsPackage.QUERY__SQL:
				getSql().clear();
				return;
			case DsPackage.QUERY__SPARQL:
				getSparql().clear();
				return;
			case DsPackage.QUERY__PROPERTIES:
				getProperties().clear();
				return;
			case DsPackage.QUERY__RESULT:
				getResult().clear();
				return;
			case DsPackage.QUERY__EXCEL:
				getExcel().clear();
				return;
			case DsPackage.QUERY__GSPREAD:
				getGspread().clear();
				return;
			case DsPackage.QUERY__PARAM:
				getParam().clear();
				return;
			case DsPackage.QUERY__ID:
				setId(ID_EDEFAULT);
				return;
			case DsPackage.QUERY__INPUT_EVENT_TRIGGER:
				setInputEventTrigger(INPUT_EVENT_TRIGGER_EDEFAULT);
				return;
			case DsPackage.QUERY__OUTPUT_EVENT_TRIGGER:
				setOutputEventTrigger(OUTPUT_EVENT_TRIGGER_EDEFAULT);
				return;
			case DsPackage.QUERY__RETURN_GENERATED_KEYS:
				setReturnGeneratedKeys(RETURN_GENERATED_KEYS_EDEFAULT);
				return;
			case DsPackage.QUERY__USE_CONFIG:
				setUseConfig(USE_CONFIG_EDEFAULT);
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
			case DsPackage.QUERY__SQL:
				return sql != null && !sql.isEmpty();
			case DsPackage.QUERY__SPARQL:
				return sparql != null && !sparql.isEmpty();
			case DsPackage.QUERY__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case DsPackage.QUERY__RESULT:
				return result != null && !result.isEmpty();
			case DsPackage.QUERY__EXCEL:
				return excel != null && !excel.isEmpty();
			case DsPackage.QUERY__GSPREAD:
				return gspread != null && !gspread.isEmpty();
			case DsPackage.QUERY__PARAM:
				return param != null && !param.isEmpty();
			case DsPackage.QUERY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DsPackage.QUERY__INPUT_EVENT_TRIGGER:
				return INPUT_EVENT_TRIGGER_EDEFAULT == null ? inputEventTrigger != null : !INPUT_EVENT_TRIGGER_EDEFAULT.equals(inputEventTrigger);
			case DsPackage.QUERY__OUTPUT_EVENT_TRIGGER:
				return OUTPUT_EVENT_TRIGGER_EDEFAULT == null ? outputEventTrigger != null : !OUTPUT_EVENT_TRIGGER_EDEFAULT.equals(outputEventTrigger);
			case DsPackage.QUERY__RETURN_GENERATED_KEYS:
				return returnGeneratedKeys != RETURN_GENERATED_KEYS_EDEFAULT;
			case DsPackage.QUERY__USE_CONFIG:
				return USE_CONFIG_EDEFAULT == null ? useConfig != null : !USE_CONFIG_EDEFAULT.equals(useConfig);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", inputEventTrigger: ");
		result.append(inputEventTrigger);
		result.append(", outputEventTrigger: ");
		result.append(outputEventTrigger);
		result.append(", returnGeneratedKeys: ");
		result.append(returnGeneratedKeys);
		result.append(", useConfig: ");
		result.append(useConfig);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
