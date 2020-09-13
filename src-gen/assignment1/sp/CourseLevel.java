/**
 */
package assignment1.sp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see assignment1.sp.Assignment1Package#getCourseLevel()
 * @model
 * @generated
 */
public enum CourseLevel implements Enumerator {
	/**
	 * The '<em><b>Foundation Course</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUNDATION_COURSE_VALUE
	 * @generated
	 * @ordered
	 */
	FOUNDATION_COURSE(0, "FoundationCourse", "FoundationCourse"),

	/**
	 * The '<em><b>Intermediate Course</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_COURSE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE_COURSE(1, "IntermediateCourse", "IntermediateCourse"),

	/**
	 * The '<em><b>Third Year Course</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_COURSE_VALUE
	 * @generated
	 * @ordered
	 */
	THIRD_YEAR_COURSE(2, "ThirdYearCourse", "ThirdYearCourse"),

	/**
	 * The '<em><b>Higher Level Course</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_LEVEL_COURSE_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHER_LEVEL_COURSE(3, "HigherLevelCourse", "HigherLevelCourse");

	/**
	 * The '<em><b>Foundation Course</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOUNDATION_COURSE
	 * @model name="FoundationCourse"
	 * @generated
	 * @ordered
	 */
	public static final int FOUNDATION_COURSE_VALUE = 0;

	/**
	 * The '<em><b>Intermediate Course</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_COURSE
	 * @model name="IntermediateCourse"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_COURSE_VALUE = 1;

	/**
	 * The '<em><b>Third Year Course</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRD_YEAR_COURSE
	 * @model name="ThirdYearCourse"
	 * @generated
	 * @ordered
	 */
	public static final int THIRD_YEAR_COURSE_VALUE = 2;

	/**
	 * The '<em><b>Higher Level Course</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHER_LEVEL_COURSE
	 * @model name="HigherLevelCourse"
	 * @generated
	 * @ordered
	 */
	public static final int HIGHER_LEVEL_COURSE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseLevel[] VALUES_ARRAY = new CourseLevel[] { FOUNDATION_COURSE, INTERMEDIATE_COURSE,
			THIRD_YEAR_COURSE, HIGHER_LEVEL_COURSE, };

	/**
	 * A public read-only list of all the '<em><b>Course Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseLevel get(int value) {
		switch (value) {
		case FOUNDATION_COURSE_VALUE:
			return FOUNDATION_COURSE;
		case INTERMEDIATE_COURSE_VALUE:
			return INTERMEDIATE_COURSE;
		case THIRD_YEAR_COURSE_VALUE:
			return THIRD_YEAR_COURSE;
		case HIGHER_LEVEL_COURSE_VALUE:
			return HIGHER_LEVEL_COURSE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CourseLevel(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //CourseLevel
