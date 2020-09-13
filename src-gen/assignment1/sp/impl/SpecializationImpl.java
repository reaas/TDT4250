/**
 */
package assignment1.sp.impl;

import assignment1.sp.Assignment1Package;
import assignment1.sp.Programme;
import assignment1.sp.Semester;
import assignment1.sp.Specialization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.sp.impl.SpecializationImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link assignment1.sp.impl.SpecializationImpl#getSelectableIn <em>Selectable In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectableIn() <em>Selectable In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableIn()
	 * @generated
	 * @ordered
	 */
	protected Semester selectableIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment1Package.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.SPECIALIZATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (eContainerFeatureID() != Assignment1Package.SPECIALIZATION__PROGRAMME)
			return null;
		return (Programme) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProgramme, Assignment1Package.SPECIALIZATION__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != eInternalContainer()
				|| (eContainerFeatureID() != Assignment1Package.SPECIALIZATION__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject) newProgramme).eInverseAdd(this, Assignment1Package.PROGRAMME__SPECIALIZATION,
						Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.SPECIALIZATION__PROGRAMME,
					newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSelectableIn() {
		if (selectableIn != null && selectableIn.eIsProxy()) {
			InternalEObject oldSelectableIn = (InternalEObject) selectableIn;
			selectableIn = (Semester) eResolveProxy(oldSelectableIn);
			if (selectableIn != oldSelectableIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assignment1Package.SPECIALIZATION__SELECTABLE_IN, oldSelectableIn, selectableIn));
			}
		}
		return selectableIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSelectableIn() {
		return selectableIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelectableIn(Semester newSelectableIn) {
		Semester oldSelectableIn = selectableIn;
		selectableIn = newSelectableIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.SPECIALIZATION__SELECTABLE_IN,
					oldSelectableIn, selectableIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProgramme((Programme) otherEnd, msgs);
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
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			return basicSetProgramme(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			return eInternalContainer().eInverseRemove(this, Assignment1Package.PROGRAMME__SPECIALIZATION,
					Programme.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment1Package.SPECIALIZATION__NAME:
			return getName();
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			return getProgramme();
		case Assignment1Package.SPECIALIZATION__SELECTABLE_IN:
			if (resolve)
				return getSelectableIn();
			return basicGetSelectableIn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assignment1Package.SPECIALIZATION__NAME:
			setName((String) newValue);
			return;
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			setProgramme((Programme) newValue);
			return;
		case Assignment1Package.SPECIALIZATION__SELECTABLE_IN:
			setSelectableIn((Semester) newValue);
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
		case Assignment1Package.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			setProgramme((Programme) null);
			return;
		case Assignment1Package.SPECIALIZATION__SELECTABLE_IN:
			setSelectableIn((Semester) null);
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
		case Assignment1Package.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment1Package.SPECIALIZATION__PROGRAMME:
			return getProgramme() != null;
		case Assignment1Package.SPECIALIZATION__SELECTABLE_IN:
			return selectableIn != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
