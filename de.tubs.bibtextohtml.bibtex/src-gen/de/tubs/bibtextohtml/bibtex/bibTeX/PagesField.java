/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pages Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.PagesField#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getPagesField()
 * @model
 * @generated
 */
public interface PagesField extends EObject
{
  /**
   * Returns the value of the '<em><b>Pages</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' attribute.
   * @see #setPages(String)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getPagesField_Pages()
   * @model
   * @generated
   */
  String getPages();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.PagesField#getPages <em>Pages</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pages</em>' attribute.
   * @see #getPages()
   * @generated
   */
  void setPages(String value);

} // PagesField
