/**
 */
package assignment1.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.Programme#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.sp.Programme#getDuration <em>Duration</em>}</li>
 *   <li>{@link assignment1.sp.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link assignment1.sp.Programme#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link assignment1.sp.Programme#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link assignment1.sp.Programme#getElectiveCourseGroup <em>Elective Course Group</em>}</li>
 * </ul>
 *
 * @see assignment1.sp.Assignment1Package#getProgramme()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='needsEnoughCredits needsEnoughSemesters'"
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment1.sp.Assignment1Package#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment1.sp.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment1.sp.ProgrammeLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see assignment1.sp.ProgrammeLevel
	 * @see #setDuration(ProgrammeLevel)
	 * @see assignment1.sp.Assignment1Package#getProgramme_Duration()
	 * @model
	 * @generated
	 */
	ProgrammeLevel getDuration();

	/**
	 * Sets the value of the '{@link assignment1.sp.Programme#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see assignment1.sp.ProgrammeLevel
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(ProgrammeLevel value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link assignment1.sp.Semester}.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see assignment1.sp.Assignment1Package#getProgramme_Semesters()
	 * @see assignment1.sp.Semester#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference.
	 * @see #setSpecialization(Specialization)
	 * @see assignment1.sp.Assignment1Package#getProgramme_Specialization()
	 * @see assignment1.sp.Specialization#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link assignment1.sp.Programme#getSpecialization <em>Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' containment reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.MandatoryCourseGroup#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference.
	 * @see #setMandatoryCourses(MandatoryCourseGroup)
	 * @see assignment1.sp.Assignment1Package#getProgramme_MandatoryCourses()
	 * @see assignment1.sp.MandatoryCourseGroup#getProgramme
	 * @model opposite="programme"
	 * @generated
	 */
	MandatoryCourseGroup getMandatoryCourses();

	/**
	 * Sets the value of the '{@link assignment1.sp.Programme#getMandatoryCourses <em>Mandatory Courses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Courses</em>' reference.
	 * @see #getMandatoryCourses()
	 * @generated
	 */
	void setMandatoryCourses(MandatoryCourseGroup value);

	/**
	 * Returns the value of the '<em><b>Elective Course Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.ElectiveCourseGroup#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Course Group</em>' reference.
	 * @see #setElectiveCourseGroup(ElectiveCourseGroup)
	 * @see assignment1.sp.Assignment1Package#getProgramme_ElectiveCourseGroup()
	 * @see assignment1.sp.ElectiveCourseGroup#getProgramme
	 * @model opposite="programme"
	 * @generated
	 */
	ElectiveCourseGroup getElectiveCourseGroup();

	/**
	 * Sets the value of the '{@link assignment1.sp.Programme#getElectiveCourseGroup <em>Elective Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elective Course Group</em>' reference.
	 * @see #getElectiveCourseGroup()
	 * @generated
	 */
	void setElectiveCourseGroup(ElectiveCourseGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	float getCredits();

} // Programme
