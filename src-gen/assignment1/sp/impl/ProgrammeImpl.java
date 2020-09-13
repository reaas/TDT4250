/**
 */
package assignment1.sp.impl;

import assignment1.sp.Assignment1Package;
import assignment1.sp.ElectiveCourseGroup;
import assignment1.sp.MandatoryCourseGroup;
import assignment1.sp.Programme;
import assignment1.sp.ProgrammeLevel;
import assignment1.sp.Semester;
import assignment1.sp.Specialization;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link assignment1.sp.impl.ProgrammeImpl#getElectiveCourseGroup <em>Elective Course Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeLevel DURATION_EDEFAULT = ProgrammeLevel.BACHELOR;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeLevel duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization specialization;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected MandatoryCourseGroup mandatoryCourses;

	/**
	 * The cached value of the '{@link #getElectiveCourseGroup() <em>Elective Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected ElectiveCourseGroup electiveCourseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment1Package.Literals.PROGRAMME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeLevel getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(ProgrammeLevel newDuration) {
		ProgrammeLevel oldDuration = duration;
		duration = newDuration == null ? DURATION_EDEFAULT : newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAMME__DURATION, oldDuration,
					duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this,
					Assignment1Package.PROGRAMME__SEMESTERS, Assignment1Package.SEMESTER__PROGRAMME);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Specialization newSpecialization, NotificationChain msgs) {
		Specialization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assignment1Package.PROGRAMME__SPECIALIZATION, oldSpecialization, newSpecialization);
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
	public void setSpecialization(Specialization newSpecialization) {
		if (newSpecialization != specialization) {
			NotificationChain msgs = null;
			if (specialization != null)
				msgs = ((InternalEObject) specialization).eInverseRemove(this,
						Assignment1Package.SPECIALIZATION__PROGRAMME, Specialization.class, msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject) newSpecialization).eInverseAdd(this,
						Assignment1Package.SPECIALIZATION__PROGRAMME, Specialization.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAMME__SPECIALIZATION,
					newSpecialization, newSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryCourseGroup getMandatoryCourses() {
		if (mandatoryCourses != null && mandatoryCourses.eIsProxy()) {
			InternalEObject oldMandatoryCourses = (InternalEObject) mandatoryCourses;
			mandatoryCourses = (MandatoryCourseGroup) eResolveProxy(oldMandatoryCourses);
			if (mandatoryCourses != oldMandatoryCourses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assignment1Package.PROGRAMME__MANDATORY_COURSES, oldMandatoryCourses, mandatoryCourses));
			}
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCourseGroup basicGetMandatoryCourses() {
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryCourses(MandatoryCourseGroup newMandatoryCourses,
			NotificationChain msgs) {
		MandatoryCourseGroup oldMandatoryCourses = mandatoryCourses;
		mandatoryCourses = newMandatoryCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assignment1Package.PROGRAMME__MANDATORY_COURSES, oldMandatoryCourses, newMandatoryCourses);
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
	public void setMandatoryCourses(MandatoryCourseGroup newMandatoryCourses) {
		if (newMandatoryCourses != mandatoryCourses) {
			NotificationChain msgs = null;
			if (mandatoryCourses != null)
				msgs = ((InternalEObject) mandatoryCourses).eInverseRemove(this,
						Assignment1Package.MANDATORY_COURSE_GROUP__PROGRAMME, MandatoryCourseGroup.class, msgs);
			if (newMandatoryCourses != null)
				msgs = ((InternalEObject) newMandatoryCourses).eInverseAdd(this,
						Assignment1Package.MANDATORY_COURSE_GROUP__PROGRAMME, MandatoryCourseGroup.class, msgs);
			msgs = basicSetMandatoryCourses(newMandatoryCourses, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAMME__MANDATORY_COURSES,
					newMandatoryCourses, newMandatoryCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCourseGroup getElectiveCourseGroup() {
		if (electiveCourseGroup != null && electiveCourseGroup.eIsProxy()) {
			InternalEObject oldElectiveCourseGroup = (InternalEObject) electiveCourseGroup;
			electiveCourseGroup = (ElectiveCourseGroup) eResolveProxy(oldElectiveCourseGroup);
			if (electiveCourseGroup != oldElectiveCourseGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP, oldElectiveCourseGroup,
							electiveCourseGroup));
			}
		}
		return electiveCourseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourseGroup basicGetElectiveCourseGroup() {
		return electiveCourseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectiveCourseGroup(ElectiveCourseGroup newElectiveCourseGroup,
			NotificationChain msgs) {
		ElectiveCourseGroup oldElectiveCourseGroup = electiveCourseGroup;
		electiveCourseGroup = newElectiveCourseGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP, oldElectiveCourseGroup,
					newElectiveCourseGroup);
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
	public void setElectiveCourseGroup(ElectiveCourseGroup newElectiveCourseGroup) {
		if (newElectiveCourseGroup != electiveCourseGroup) {
			NotificationChain msgs = null;
			if (electiveCourseGroup != null)
				msgs = ((InternalEObject) electiveCourseGroup).eInverseRemove(this,
						Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME, ElectiveCourseGroup.class, msgs);
			if (newElectiveCourseGroup != null)
				msgs = ((InternalEObject) newElectiveCourseGroup).eInverseAdd(this,
						Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME, ElectiveCourseGroup.class, msgs);
			msgs = basicSetElectiveCourseGroup(newElectiveCourseGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP,
					newElectiveCourseGroup, newElectiveCourseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCredits() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		case Assignment1Package.PROGRAMME__SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesters()).basicAdd(otherEnd, msgs);
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			if (specialization != null)
				msgs = ((InternalEObject) specialization).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Assignment1Package.PROGRAMME__SPECIALIZATION, null, msgs);
			return basicSetSpecialization((Specialization) otherEnd, msgs);
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			if (mandatoryCourses != null)
				msgs = ((InternalEObject) mandatoryCourses).eInverseRemove(this,
						Assignment1Package.MANDATORY_COURSE_GROUP__PROGRAMME, MandatoryCourseGroup.class, msgs);
			return basicSetMandatoryCourses((MandatoryCourseGroup) otherEnd, msgs);
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			if (electiveCourseGroup != null)
				msgs = ((InternalEObject) electiveCourseGroup).eInverseRemove(this,
						Assignment1Package.ELECTIVE_COURSE_GROUP__PROGRAMME, ElectiveCourseGroup.class, msgs);
			return basicSetElectiveCourseGroup((ElectiveCourseGroup) otherEnd, msgs);
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
		case Assignment1Package.PROGRAMME__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			return basicSetSpecialization(null, msgs);
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			return basicSetMandatoryCourses(null, msgs);
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			return basicSetElectiveCourseGroup(null, msgs);
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
		case Assignment1Package.PROGRAMME__NAME:
			return getName();
		case Assignment1Package.PROGRAMME__DURATION:
			return getDuration();
		case Assignment1Package.PROGRAMME__SEMESTERS:
			return getSemesters();
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			return getSpecialization();
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			if (resolve)
				return getMandatoryCourses();
			return basicGetMandatoryCourses();
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			if (resolve)
				return getElectiveCourseGroup();
			return basicGetElectiveCourseGroup();
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
		case Assignment1Package.PROGRAMME__NAME:
			setName((String) newValue);
			return;
		case Assignment1Package.PROGRAMME__DURATION:
			setDuration((ProgrammeLevel) newValue);
			return;
		case Assignment1Package.PROGRAMME__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends Semester>) newValue);
			return;
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			setSpecialization((Specialization) newValue);
			return;
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			setMandatoryCourses((MandatoryCourseGroup) newValue);
			return;
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			setElectiveCourseGroup((ElectiveCourseGroup) newValue);
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
		case Assignment1Package.PROGRAMME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assignment1Package.PROGRAMME__DURATION:
			setDuration(DURATION_EDEFAULT);
			return;
		case Assignment1Package.PROGRAMME__SEMESTERS:
			getSemesters().clear();
			return;
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			setSpecialization((Specialization) null);
			return;
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			setMandatoryCourses((MandatoryCourseGroup) null);
			return;
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			setElectiveCourseGroup((ElectiveCourseGroup) null);
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
		case Assignment1Package.PROGRAMME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assignment1Package.PROGRAMME__DURATION:
			return duration != DURATION_EDEFAULT;
		case Assignment1Package.PROGRAMME__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case Assignment1Package.PROGRAMME__SPECIALIZATION:
			return specialization != null;
		case Assignment1Package.PROGRAMME__MANDATORY_COURSES:
			return mandatoryCourses != null;
		case Assignment1Package.PROGRAMME__ELECTIVE_COURSE_GROUP:
			return electiveCourseGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Assignment1Package.PROGRAMME___GET_CREDITS:
			return getCredits();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
