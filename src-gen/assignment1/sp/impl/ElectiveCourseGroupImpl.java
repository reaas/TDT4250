/**
 */
package assignment1.sp.impl;

import assignment1.sp.Assignment1Package;
import assignment1.sp.Course;
import assignment1.sp.ElectiveCourseGroup;
import assignment1.sp.Programme;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.impl.ElectiveCourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link assignment1.sp.impl.ElectiveCourseGroupImpl#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveCourseGroupImpl extends MinimalEObjectImpl.Container implements ElectiveCourseGroup {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programme programme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment1Package.Literals.ELECTIVE_COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this,
					Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programme getProgramme() {
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject) programme;
			programme = (Programme) eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programme newProgramme, NotificationChain msgs) {
		Programme oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME, oldProgramme, newProgramme);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programme newProgramme) {
		if (newProgramme != programme) {
			NotificationChain msgs = null;
			if (programme != null)
				msgs = ((InternalEObject) programme).eInverseRemove(this,
						Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP, Programme.class, msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject) newProgramme).eInverseAdd(this,
						Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP, Programme.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME,
					newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
			if (programme != null)
				msgs = ((InternalEObject) programme).eInverseRemove(this,
						Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP, Programme.class, msgs);
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
		case Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES:
			return getCourses();
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
			if (resolve)
				return getProgramme();
			return basicGetProgramme();
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
		case Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends Course>) newValue);
			return;
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
			setProgramme((Programme) newValue);
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
		case Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES:
			getCourses().clear();
			return;
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
			setProgramme((Programme) null);
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
		case Assignment1Package.ELECTIVE_COURSE_GROUP__COURSES:
			return courses != null && !courses.isEmpty();
		case Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME:
			return programme != null;
		}
		return super.eIsSet(featureID);
	}

} //ElectiveCourseGroupImpl
