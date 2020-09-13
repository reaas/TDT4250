/**
 */
package assignment1.sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.sp.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.sp.Specialization#getProgramme <em>Programme</em>}</li>
 *   <li>{@link assignment1.sp.Specialization#getSelectableIn <em>Selectable In</em>}</li>
 * </ul>
 *
 * @see assignment1.sp.Assignment1Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment1.sp.Assignment1Package#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment1.sp.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link assignment1.sp.Programme#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programme)
	 * @see assignment1.sp.Assignment1Package#getSpecialization_Programme()
	 * @see assignment1.sp.Programme#getSpecialization
	 * @model opposite="specialization" transient="false"
	 * @generated
	 */
	Programme getProgramme();

	/**
	 * Sets the value of the '{@link assignment1.sp.Specialization#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programme value);

	/**
	 * Returns the value of the '<em><b>Selectable In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable In</em>' reference.
	 * @see #setSelectableIn(Semester)
	 * @see assignment1.sp.Assignment1Package#getSpecialization_SelectableIn()
	 * @model
	 * @generated
	 */
	Semester getSelectableIn();

	/**
	 * Sets the value of the '{@link assignment1.sp.Specialization#getSelectableIn <em>Selectable In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable In</em>' reference.
	 * @see #getSelectableIn()
	 * @generated
	 */
	void setSelectableIn(Semester value);

} // Specialization
