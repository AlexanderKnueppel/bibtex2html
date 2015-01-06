/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibtex Entry Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getKey <em>Key</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getYear <em>Year</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getMonth <em>Month</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getNote <em>Note</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getUnknowns <em>Unknowns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes()
 * @model
 * @generated
 */
public interface BibtexEntryTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(CiteKey)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Key()
   * @model containment="true"
   * @generated
   */
  CiteKey getKey();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(CiteKey value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(TitleField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Title()
   * @model containment="true"
   * @generated
   */
  TitleField getTitle();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(TitleField value);

  /**
   * Returns the value of the '<em><b>Year</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Year</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Year</em>' containment reference.
   * @see #setYear(YearField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Year()
   * @model containment="true"
   * @generated
   */
  YearField getYear();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getYear <em>Year</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' containment reference.
   * @see #getYear()
   * @generated
   */
  void setYear(YearField value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' containment reference.
   * @see #setMonth(MonthField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Month()
   * @model containment="true"
   * @generated
   */
  MonthField getMonth();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getMonth <em>Month</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month</em>' containment reference.
   * @see #getMonth()
   * @generated
   */
  void setMonth(MonthField value);

  /**
   * Returns the value of the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Note</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Note</em>' containment reference.
   * @see #setNote(NoteField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Note()
   * @model containment="true"
   * @generated
   */
  NoteField getNote();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(NoteField value);

  /**
   * Returns the value of the '<em><b>Unknowns</b></em>' containment reference list.
   * The list contents are of type {@link de.tubs.bibtextohtml.bibtex.bibTeX.UnknownField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unknowns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unknowns</em>' containment reference list.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getBibtexEntryTypes_Unknowns()
   * @model containment="true"
   * @generated
   */
  EList<UnknownField> getUnknowns();

} // BibtexEntryTypes
