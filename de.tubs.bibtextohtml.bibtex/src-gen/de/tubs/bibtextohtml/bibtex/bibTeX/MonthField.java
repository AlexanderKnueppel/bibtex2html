/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Month Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.MonthField#getMonth <em>Month</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getMonthField()
 * @model
 * @generated
 */
public interface MonthField extends EObject
{
  /**
   * Returns the value of the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' attribute.
   * @see #setMonth(String)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getMonthField_Month()
   * @model
   * @generated
   */
  String getMonth();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.MonthField#getMonth <em>Month</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' attribute.
   * @see #getMonth()
   * @generated
   */
  void setMonth(String value);

} // MonthField
