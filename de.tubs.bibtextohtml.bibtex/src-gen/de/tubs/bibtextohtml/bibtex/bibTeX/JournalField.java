/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.JournalField#getJournal <em>Journal</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getJournalField()
 * @model
 * @generated
 */
public interface JournalField extends EObject
{
  /**
   * Returns the value of the '<em><b>Journal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Journal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Journal</em>' attribute.
   * @see #setJournal(String)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getJournalField_Journal()
   * @model
   * @generated
   */
  String getJournal();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.JournalField#getJournal <em>Journal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Journal</em>' attribute.
   * @see #getJournal()
   * @generated
   */
  void setJournal(String value);

} // JournalField
