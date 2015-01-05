/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fullname</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getLastname <em>Lastname</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getFirstname <em>Firstname</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getFullname()
 * @model
 * @generated
 */
public interface Fullname extends EObject
{
  /**
   * Returns the value of the '<em><b>Lastname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lastname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lastname</em>' attribute.
   * @see #setLastname(String)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getFullname_Lastname()
   * @model
   * @generated
   */
  String getLastname();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getLastname <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lastname</em>' attribute.
   * @see #getLastname()
   * @generated
   */
  void setLastname(String value);

  /**
   * Returns the value of the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Firstname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Firstname</em>' attribute.
   * @see #setFirstname(String)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getFullname_Firstname()
   * @model
   * @generated
   */
  String getFirstname();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getFirstname <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Firstname</em>' attribute.
   * @see #getFirstname()
   * @generated
   */
  void setFirstname(String value);

} // Fullname
