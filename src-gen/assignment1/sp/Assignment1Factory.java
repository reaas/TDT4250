/**
 */
package assignment1.sp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assignment1.sp.Assignment1Package
 * @generated
 */
public interface Assignment1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment1Factory eINSTANCE = assignment1.sp.impl.Assignment1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Mandatory Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Course Group</em>'.
	 * @generated
	 */
	MandatoryCourseGroup createMandatoryCourseGroup();

	/**
	 * Returns a new object of class '<em>Elective Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elective Course Group</em>'.
	 * @generated
	 */
	ElectiveCourseGroup createElectiveCourseGroup();

	/**
	 * Returns a new object of class '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme</em>'.
	 * @generated
	 */
	Programme createProgramme();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Specialization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialization</em>'.
	 * @generated
	 */
	Specialization createSpecialization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Assignment1Package getAssignment1Package();

} //Assignment1Factory
