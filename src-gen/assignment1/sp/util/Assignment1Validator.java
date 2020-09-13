/**
 */
package assignment1.sp.util;

import assignment1.sp.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment1.sp.Assignment1Package
 * @generated
 */
public class Assignment1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment1Validator INSTANCE = new Assignment1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment1.sp";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Assignment1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Assignment1Package.COURSE:
			return validateCourse((Course) value, diagnostics, context);
		case Assignment1Package.MANDATORY_COURSE_GROUP:
			return validateMandatoryCourseGroup((MandatoryCourseGroup) value, diagnostics, context);
		case Assignment1Package.ELECTIVE_COURSE_GROUP:
			return validateElectiveCourseGroup((ElectiveCourseGroup) value, diagnostics, context);
		case Assignment1Package.PROGRAMME:
			return validateProgramme((Programme) value, diagnostics, context);
		case Assignment1Package.SEMESTER:
			return validateSemester((Semester) value, diagnostics, context);
		case Assignment1Package.SPECIALIZATION:
			return validateSpecialization((Specialization) value, diagnostics, context);
		case Assignment1Package.COURSE_LEVEL:
			return validateCourseLevel((CourseLevel) value, diagnostics, context);
		case Assignment1Package.SEMESTER_TYPE:
			return validateSemesterType((SemesterType) value, diagnostics, context);
		case Assignment1Package.PROGRAMME_LEVEL:
			return validateProgrammeLevel((ProgrammeLevel) value, diagnostics, context);
		case Assignment1Package.CREDITS:
			return validateCredits((Float) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMandatoryCourseGroup(MandatoryCourseGroup mandatoryCourseGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mandatoryCourseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElectiveCourseGroup(ElectiveCourseGroup electiveCourseGroup, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(electiveCourseGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programme, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProgramme_needsEnoughCredits(programme, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProgramme_needsEnoughSemesters(programme, diagnostics, context);
		return result;
	}

	/**
	 * Validates the needsEnoughCredits constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme_needsEnoughCredits(Programme programme, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "needsEnoughCredits", getObjectLabel(programme, context) },
								new Object[] { programme }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the needsEnoughSemesters constraint of '<em>Programme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme_needsEnoughSemesters(Programme programme, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "needsEnoughSemesters", getObjectLabel(programme, context) },
								new Object[] { programme }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSemester_needsEnoughCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the needsEnoughCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester_needsEnoughCredits(Semester semester, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "needsEnoughCredits", getObjectLabel(semester, context) },
								new Object[] { semester }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeLevel(ProgrammeLevel programmeLevel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits(Float credits, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCredits_cannotBeNegative(credits, diagnostics, context);
		return result;
	}

	/**
	 * Validates the cannotBeNegative constraint of '<em>Credits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCredits_cannotBeNegative(Float credits, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "cannotBeNegative",
										getValueLabel(Assignment1Package.Literals.CREDITS, credits, context) },
								new Object[] { credits }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Assignment1Validator
