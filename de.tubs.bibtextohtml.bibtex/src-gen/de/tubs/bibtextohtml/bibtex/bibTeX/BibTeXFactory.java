/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage
 * @generated
 */
public interface BibTeXFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BibTeXFactory eINSTANCE = de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Bibtex Entry Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bibtex Entry Types</em>'.
   * @generated
   */
  BibtexEntryTypes createBibtexEntryTypes();

  /**
   * Returns a new object of class '<em>Article</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Article</em>'.
   * @generated
   */
  Article createArticle();

  /**
   * Returns a new object of class '<em>Cite Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cite Key</em>'.
   * @generated
   */
  CiteKey createCiteKey();

  /**
   * Returns a new object of class '<em>Author Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Author Field</em>'.
   * @generated
   */
  AuthorField createAuthorField();

  /**
   * Returns a new object of class '<em>Authors</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Authors</em>'.
   * @generated
   */
  Authors createAuthors();

  /**
   * Returns a new object of class '<em>Fullname</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fullname</em>'.
   * @generated
   */
  Fullname createFullname();

  /**
   * Returns a new object of class '<em>Title Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Title Field</em>'.
   * @generated
   */
  TitleField createTitleField();

  /**
   * Returns a new object of class '<em>Journal Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Journal Field</em>'.
   * @generated
   */
  JournalField createJournalField();

  /**
   * Returns a new object of class '<em>Year Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Year Field</em>'.
   * @generated
   */
  YearField createYearField();

  /**
   * Returns a new object of class '<em>Volume Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Volume Field</em>'.
   * @generated
   */
  VolumeField createVolumeField();

  /**
   * Returns a new object of class '<em>Number Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Field</em>'.
   * @generated
   */
  NumberField createNumberField();

  /**
   * Returns a new object of class '<em>Pages Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pages Field</em>'.
   * @generated
   */
  PagesField createPagesField();

  /**
   * Returns a new object of class '<em>Month Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Month Field</em>'.
   * @generated
   */
  MonthField createMonthField();

  /**
   * Returns a new object of class '<em>Note Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note Field</em>'.
   * @generated
   */
  NoteField createNoteField();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BibTeXPackage getBibTeXPackage();

} //BibTeXFactory
