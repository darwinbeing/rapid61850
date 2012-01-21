/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ch.iec._61850._2006.scl.impl;

import ch.iec._61850._2006.scl.SclPackage;
import ch.iec._61850._2006.scl.TDA;
import ch.iec._61850._2006.scl.TDOType;
import ch.iec._61850._2006.scl.TExtRef;
import ch.iec._61850._2006.scl.TFCDA;
import ch.iec._61850._2006.scl.TSDO;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDO Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getSDO <em>SDO</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getDA <em>DA</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getCdc <em>Cdc</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getIedType <em>Ied Type</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getExtRef <em>Ext Ref</em>}</li>
 *   <li>{@link ch.iec._61850._2006.scl.impl.TDOTypeImpl#getFcda <em>Fcda</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TDOTypeImpl extends TIDNamingImpl implements TDOType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdc()
	 * @generated
	 * @ordered
	 */
	protected static final Object CDC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCdc() <em>Cdc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCdc()
	 * @generated
	 * @ordered
	 */
	protected Object cdc = CDC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected static final String IED_TYPE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getIedType() <em>Ied Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIedType()
	 * @generated
	 * @ordered
	 */
	protected String iedType = IED_TYPE_EDEFAULT;

	/**
	 * This is true if the Ied Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iedTypeESet;

	/**
	 * The cached value of the '{@link #getExtRef() <em>Ext Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtRef()
	 * @generated
	 * @ordered
	 */
	protected EList<TExtRef> extRef;

	/**
	 * The cached value of the '{@link #getFcda() <em>Fcda</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFcda()
	 * @generated
	 * @ordered
	 */
	protected EList<TFCDA> fcda;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDOTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SclPackage.eINSTANCE.getTDOType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, SclPackage.TDO_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TSDO> getSDO() {
		return getGroup().list(SclPackage.eINSTANCE.getTDOType_SDO());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TDA> getDA() {
		return getGroup().list(SclPackage.eINSTANCE.getTDOType_DA());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCdc() {
		return cdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCdc(Object newCdc) {
		Object oldCdc = cdc;
		cdc = newCdc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDO_TYPE__CDC, oldCdc, cdc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIedType() {
		return iedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIedType(String newIedType) {
		String oldIedType = iedType;
		iedType = newIedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SclPackage.TDO_TYPE__IED_TYPE, oldIedType, iedType, !oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIedType() {
		String oldIedType = iedType;
		boolean oldIedTypeESet = iedTypeESet;
		iedType = IED_TYPE_EDEFAULT;
		iedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SclPackage.TDO_TYPE__IED_TYPE, oldIedType, IED_TYPE_EDEFAULT, oldIedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIedType() {
		return iedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TExtRef> getExtRef() {
		if (extRef == null) {
			extRef = new EObjectWithInverseResolvingEList<TExtRef>(TExtRef.class, this, SclPackage.TDO_TYPE__EXT_REF, SclPackage.TEXT_REF__DO_TYPE);
		}
		return extRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TFCDA> getFcda() {
		if (fcda == null) {
			fcda = new EObjectResolvingEList<TFCDA>(TFCDA.class, this, SclPackage.TDO_TYPE__FCDA);
		}
		return fcda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDO_TYPE__EXT_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtRef()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SclPackage.TDO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case SclPackage.TDO_TYPE__SDO:
				return ((InternalEList<?>)getSDO()).basicRemove(otherEnd, msgs);
			case SclPackage.TDO_TYPE__DA:
				return ((InternalEList<?>)getDA()).basicRemove(otherEnd, msgs);
			case SclPackage.TDO_TYPE__EXT_REF:
				return ((InternalEList<?>)getExtRef()).basicRemove(otherEnd, msgs);
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
			case SclPackage.TDO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case SclPackage.TDO_TYPE__SDO:
				return getSDO();
			case SclPackage.TDO_TYPE__DA:
				return getDA();
			case SclPackage.TDO_TYPE__CDC:
				return getCdc();
			case SclPackage.TDO_TYPE__IED_TYPE:
				return getIedType();
			case SclPackage.TDO_TYPE__EXT_REF:
				return getExtRef();
			case SclPackage.TDO_TYPE__FCDA:
				return getFcda();
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
			case SclPackage.TDO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case SclPackage.TDO_TYPE__SDO:
				getSDO().clear();
				getSDO().addAll((Collection<? extends TSDO>)newValue);
				return;
			case SclPackage.TDO_TYPE__DA:
				getDA().clear();
				getDA().addAll((Collection<? extends TDA>)newValue);
				return;
			case SclPackage.TDO_TYPE__CDC:
				setCdc(newValue);
				return;
			case SclPackage.TDO_TYPE__IED_TYPE:
				setIedType((String)newValue);
				return;
			case SclPackage.TDO_TYPE__EXT_REF:
				getExtRef().clear();
				getExtRef().addAll((Collection<? extends TExtRef>)newValue);
				return;
			case SclPackage.TDO_TYPE__FCDA:
				getFcda().clear();
				getFcda().addAll((Collection<? extends TFCDA>)newValue);
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
			case SclPackage.TDO_TYPE__GROUP:
				getGroup().clear();
				return;
			case SclPackage.TDO_TYPE__SDO:
				getSDO().clear();
				return;
			case SclPackage.TDO_TYPE__DA:
				getDA().clear();
				return;
			case SclPackage.TDO_TYPE__CDC:
				setCdc(CDC_EDEFAULT);
				return;
			case SclPackage.TDO_TYPE__IED_TYPE:
				unsetIedType();
				return;
			case SclPackage.TDO_TYPE__EXT_REF:
				getExtRef().clear();
				return;
			case SclPackage.TDO_TYPE__FCDA:
				getFcda().clear();
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
			case SclPackage.TDO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case SclPackage.TDO_TYPE__SDO:
				return !getSDO().isEmpty();
			case SclPackage.TDO_TYPE__DA:
				return !getDA().isEmpty();
			case SclPackage.TDO_TYPE__CDC:
				return CDC_EDEFAULT == null ? cdc != null : !CDC_EDEFAULT.equals(cdc);
			case SclPackage.TDO_TYPE__IED_TYPE:
				return isSetIedType();
			case SclPackage.TDO_TYPE__EXT_REF:
				return extRef != null && !extRef.isEmpty();
			case SclPackage.TDO_TYPE__FCDA:
				return fcda != null && !fcda.isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", cdc: ");
		result.append(cdc);
		result.append(", iedType: ");
		if (iedTypeESet) result.append(iedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDOTypeImpl
