/**
 */
package assignment1.sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.MandatoryCourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link assignment1.sp.MandatoryCourseGroup#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see assignment1.sp.Assignment1Package#getMandatoryCourseGroup()
 * @model
 * @generated
 */
public interface MandatoryCourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link assignment1.sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see assignment1.sp.Assignment1Package#getMandatoryCourseGroup_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.Programme#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' reference.
	 * @see #setProgramme(Programme)
	 * @see assignment1.sp.Assignment1Package#getMandatoryCourseGroup_Programme()
	 * @see assignment1.sp.Programme#getMandatoryCourses
	 * @model opposite="mandatoryCourses"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link assignment1.sp.MandatoryCourseGroup#getProgramme <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

} // MandatoryCourseGroup
