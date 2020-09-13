/**
 */
package assignment1.sp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment1.sp.Assignment1Factory
 * @model kind="package"
 * @generated
 */
public interface Assignment1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/assignment1.sp.model/sp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment1Package eINSTANCE = assignment1.sp.impl.Assignment1PackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.CourseImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.MandatoryCourseGroupImpl <em>Mandatory Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.MandatoryCourseGroupImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getMandatoryCourseGroup()
	 * @generated
	 */
	int MANDATORY_COURSE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_GROUP__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_GROUP__PROGRAMME = 1;

	/**
	 * The number of structural features of the '<em>Mandatory Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mandatory Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.ElectiveCourseGroupImpl <em>Elective Course Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.ElectiveCourseGroupImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getElectiveCourseGroup()
	 * @generated
	 */
	int ELECTIVE_COURSE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_GROUP__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_GROUP__PROGRAMME = 1;

	/**
	 * The number of structural features of the '<em>Elective Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Elective Course Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.ProgrammeImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__MANDATORY_COURSES = 4;

	/**
	 * The feature id for the '<em><b>Elective Course Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__ELECTIVE_COURSE_GROUP = 5;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME___GET_CREDITS = 0;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.SemesterImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEASON = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COURSES = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment1.sp.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.impl.SpecializationImpl
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Selectable In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SELECTABLE_IN = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment1.sp.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.CourseLevel
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 6;

	/**
	 * The meta object id for the '{@link assignment1.sp.SemesterType <em>Semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.SemesterType
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getSemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 7;

	/**
	 * The meta object id for the '{@link assignment1.sp.ProgrammeLevel <em>Programme Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment1.sp.ProgrammeLevel
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getProgrammeLevel()
	 * @generated
	 */
	int PROGRAMME_LEVEL = 8;

	/**
	 * The meta object id for the '<em>Credits</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see assignment1.sp.impl.Assignment1PackageImpl#getCredits()
	 * @generated
	 */
	int CREDITS = 9;

	/**
	 * Returns the meta object for class '{@link assignment1.sp.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see assignment1.sp.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment1.sp.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see assignment1.sp.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see assignment1.sp.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see assignment1.sp.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Course#getSemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Type</em>'.
	 * @see assignment1.sp.Course#getSemesterType()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_SemesterType();

	/**
	 * Returns the meta object for class '{@link assignment1.sp.MandatoryCourseGroup <em>Mandatory Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Course Group</em>'.
	 * @see assignment1.sp.MandatoryCourseGroup
	 * @generated
	 */
	EClass getMandatoryCourseGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment1.sp.MandatoryCourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see assignment1.sp.MandatoryCourseGroup#getCourses()
	 * @see #getMandatoryCourseGroup()
	 * @generated
	 */
	EReference getMandatoryCourseGroup_Courses();

	/**
	 * Returns the meta object for the reference '{@link assignment1.sp.MandatoryCourseGroup#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see assignment1.sp.MandatoryCourseGroup#getProgramme()
	 * @see #getMandatoryCourseGroup()
	 * @generated
	 */
	EReference getMandatoryCourseGroup_Programme();

	/**
	 * Returns the meta object for class '{@link assignment1.sp.ElectiveCourseGroup <em>Elective Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Course Group</em>'.
	 * @see assignment1.sp.ElectiveCourseGroup
	 * @generated
	 */
	EClass getElectiveCourseGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment1.sp.ElectiveCourseGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see assignment1.sp.ElectiveCourseGroup#getCourses()
	 * @see #getElectiveCourseGroup()
	 * @generated
	 */
	EReference getElectiveCourseGroup_Courses();

	/**
	 * Returns the meta object for the reference '{@link assignment1.sp.ElectiveCourseGroup#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see assignment1.sp.ElectiveCourseGroup#getProgramme()
	 * @see #getElectiveCourseGroup()
	 * @generated
	 */
	EReference getElectiveCourseGroup_Programme();

	/**
	 * Returns the meta object for class '{@link assignment1.sp.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see assignment1.sp.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment1.sp.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Programme#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see assignment1.sp.Programme#getDuration()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment1.sp.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see assignment1.sp.Programme#getSemesters()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Semesters();

	/**
	 * Returns the meta object for the containment reference '{@link assignment1.sp.Programme#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specialization</em>'.
	 * @see assignment1.sp.Programme#getSpecialization()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specialization();

	/**
	 * Returns the meta object for the reference '{@link assignment1.sp.Programme#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mandatory Courses</em>'.
	 * @see assignment1.sp.Programme#getMandatoryCourses()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_MandatoryCourses();

	/**
	 * Returns the meta object for the reference '{@link assignment1.sp.Programme#getElectiveCourseGroup <em>Elective Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elective Course Group</em>'.
	 * @see assignment1.sp.Programme#getElectiveCourseGroup()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_ElectiveCourseGroup();

	/**
	 * Returns the meta object for the '{@link assignment1.sp.Programme#getCredits() <em>Get Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Credits</em>' operation.
	 * @see assignment1.sp.Programme#getCredits()
	 * @generated
	 */
	EOperation getProgramme__GetCredits();

	/**
	 * Returns the meta object for class '{@link assignment1.sp.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see assignment1.sp.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Semester#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see assignment1.sp.Semester#getSeason()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Season();

	/**
	 * Returns the meta object for the container reference '{@link assignment1.sp.Semester#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see assignment1.sp.Semester#getProgramme()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Programme();

	/**
	 * Returns the meta object for the reference list '{@link assignment1.sp.Semester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see assignment1.sp.Semester#getCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Courses();

	/**
	 * Returns the meta object for class '{@link assignment1.sp.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see assignment1.sp.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link assignment1.sp.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment1.sp.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the container reference '{@link assignment1.sp.Specialization#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see assignment1.sp.Specialization#getProgramme()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Programme();

	/**
	 * Returns the meta object for the reference '{@link assignment1.sp.Specialization#getSelectableIn <em>Selectable In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selectable In</em>'.
	 * @see assignment1.sp.Specialization#getSelectableIn()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_SelectableIn();

	/**
	 * Returns the meta object for enum '{@link assignment1.sp.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see assignment1.sp.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the meta object for enum '{@link assignment1.sp.SemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Type</em>'.
	 * @see assignment1.sp.SemesterType
	 * @generated
	 */
	EEnum getSemesterType();

	/**
	 * Returns the meta object for enum '{@link assignment1.sp.ProgrammeLevel <em>Programme Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programme Level</em>'.
	 * @see assignment1.sp.ProgrammeLevel
	 * @generated
	 */
	EEnum getProgrammeLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Credits</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannotBeNegative'"
	 * @generated
	 */
	EDataType getCredits();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment1Factory getAssignment1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.CourseImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Semester Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__SEMESTER_TYPE = eINSTANCE.getCourse_SemesterType();

		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.MandatoryCourseGroupImpl <em>Mandatory Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.MandatoryCourseGroupImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getMandatoryCourseGroup()
		 * @generated
		 */
		EClass MANDATORY_COURSE_GROUP = eINSTANCE.getMandatoryCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY_COURSE_GROUP__COURSES = eINSTANCE.getMandatoryCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANDATORY_COURSE_GROUP__PROGRAMME = eINSTANCE.getMandatoryCourseGroup_Programme();

		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.ElectiveCourseGroupImpl <em>Elective Course Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.ElectiveCourseGroupImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getElectiveCourseGroup()
		 * @generated
		 */
		EClass ELECTIVE_COURSE_GROUP = eINSTANCE.getElectiveCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_GROUP__COURSES = eINSTANCE.getElectiveCourseGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSE_GROUP__PROGRAMME = eINSTANCE.getElectiveCourseGroup_Programme();

		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.ProgrammeImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__DURATION = eINSTANCE.getProgramme_Duration();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTERS = eINSTANCE.getProgramme_Semesters();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALIZATION = eINSTANCE.getProgramme_Specialization();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__MANDATORY_COURSES = eINSTANCE.getProgramme_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Elective Course Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__ELECTIVE_COURSE_GROUP = eINSTANCE.getProgramme_ElectiveCourseGroup();

		/**
		 * The meta object literal for the '<em><b>Get Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMME___GET_CREDITS = eINSTANCE.getProgramme__GetCredits();

		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.SemesterImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEASON = eINSTANCE.getSemester_Season();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__PROGRAMME = eINSTANCE.getSemester_Programme();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COURSES = eINSTANCE.getSemester_Courses();

		/**
		 * The meta object literal for the '{@link assignment1.sp.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.impl.SpecializationImpl
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAMME = eINSTANCE.getSpecialization_Programme();

		/**
		 * The meta object literal for the '<em><b>Selectable In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SELECTABLE_IN = eINSTANCE.getSpecialization_SelectableIn();

		/**
		 * The meta object literal for the '{@link assignment1.sp.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.CourseLevel
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

		/**
		 * The meta object literal for the '{@link assignment1.sp.SemesterType <em>Semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.SemesterType
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getSemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getSemesterType();

		/**
		 * The meta object literal for the '{@link assignment1.sp.ProgrammeLevel <em>Programme Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment1.sp.ProgrammeLevel
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getProgrammeLevel()
		 * @generated
		 */
		EEnum PROGRAMME_LEVEL = eINSTANCE.getProgrammeLevel();

		/**
		 * The meta object literal for the '<em>Credits</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see assignment1.sp.impl.Assignment1PackageImpl#getCredits()
		 * @generated
		 */
		EDataType CREDITS = eINSTANCE.getCredits();

	}

} //Assignment1Package
