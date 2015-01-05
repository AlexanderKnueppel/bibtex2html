/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Model#getBibtexEntries <em>Bibtex Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Bibtex Entries</b></em>' containment reference list.
   * The list contents are of type {@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bibtex Entries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bibtex Entries</em>' containment reference list.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getModel_BibtexEntries()
   * @model containment="true"
   * @generated
   */
  EList<BibtexEntryTypes> getBibtexEntries();

} // Model
