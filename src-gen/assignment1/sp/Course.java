/**
 */
package assignment1.sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.Course#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.sp.Course#getCode <em>Code</em>}</li>
 *   <li>{@link assignment1.sp.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link assignment1.sp.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link assignment1.sp.Course#getSemesterType <em>Semester Type</em>}</li>
 * </ul>
 *
 * @see assignment1.sp.Assignment1Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment1.sp.Assignment1Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment1.sp.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see assignment1.sp.Assignment1Package#getCourse_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link assignment1.sp.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(Float)
	 * @see assignment1.sp.Assignment1Package#getCourse_Credits()
	 * @model dataType="assignment1.sp.Credits"
	 * @generated
	 */
	Float getCredits();

	/**
	 * Sets the value of the '{@link assignment1.sp.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(Float value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment1.sp.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see assignment1.sp.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see assignment1.sp.Assignment1Package#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link assignment1.sp.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see assignment1.sp.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment1.sp.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see assignment1.sp.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see assignment1.sp.Assignment1Package#getCourse_SemesterType()
	 * @model
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link assignment1.sp.Course#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see assignment1.sp.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

} // Course
