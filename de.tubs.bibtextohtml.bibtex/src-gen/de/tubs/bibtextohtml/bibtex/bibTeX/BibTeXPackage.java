/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXFactory
 * @model kind="package"
 * @generated
 */
public interface BibTeXPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bibTeX";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tubs.de/bibtextohtml/bibtex/BibTeX";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bibTeX";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BibTeXPackage eINSTANCE = de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl.init();

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.ModelImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Bibtex Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__BIBTEX_ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl <em>Bibtex Entry Types</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getBibtexEntryTypes()
   * @generated
   */
  int BIBTEX_ENTRY_TYPES = 1;

  /**
   * The number of structural features of the '<em>Bibtex Entry Types</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIBTEX_ENTRY_TYPES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl <em>Article</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getArticle()
   * @generated
   */
  int ARTICLE = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__KEY = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__AUTHOR = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__TITLE = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Journal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__JOURNAL = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Year</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__YEAR = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Volume</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__VOLUME = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__NUMBER = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Pages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__PAGES = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Month</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__MONTH = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Note</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE__NOTE = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Article</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTICLE_FEATURE_COUNT = BIBTEX_ENTRY_TYPES_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.CiteKeyImpl <em>Cite Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.CiteKeyImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getCiteKey()
   * @generated
   */
  int CITE_KEY = 3;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITE_KEY__KEY = 0;

  /**
   * The number of structural features of the '<em>Cite Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CITE_KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorFieldImpl <em>Author Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getAuthorField()
   * @generated
   */
  int AUTHOR_FIELD = 4;

  /**
   * The number of structural features of the '<em>Author Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FIELD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorsImpl <em>Authors</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorsImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getAuthors()
   * @generated
   */
  int AUTHORS = 5;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHORS__NAMES = AUTHOR_FIELD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Authors</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHORS_FEATURE_COUNT = AUTHOR_FIELD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl <em>Fullname</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getFullname()
   * @generated
   */
  int FULLNAME = 6;

  /**
   * The feature id for the '<em><b>Lastname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLNAME__LASTNAME = 0;

  /**
   * The feature id for the '<em><b>Firstname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLNAME__FIRSTNAME = 1;

  /**
   * The number of structural features of the '<em>Fullname</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FULLNAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.TitleFieldImpl <em>Title Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.TitleFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getTitleField()
   * @generated
   */
  int TITLE_FIELD = 7;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FIELD__TITLE = 0;

  /**
   * The number of structural features of the '<em>Title Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TITLE_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.JournalFieldImpl <em>Journal Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.JournalFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getJournalField()
   * @generated
   */
  int JOURNAL_FIELD = 8;

  /**
   * The feature id for the '<em><b>Journal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_FIELD__JOURNAL = 0;

  /**
   * The number of structural features of the '<em>Journal Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOURNAL_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.YearFieldImpl <em>Year Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.YearFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getYearField()
   * @generated
   */
  int YEAR_FIELD = 9;

  /**
   * The feature id for the '<em><b>Year</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR_FIELD__YEAR = 0;

  /**
   * The number of structural features of the '<em>Year Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YEAR_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.VolumeFieldImpl <em>Volume Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.VolumeFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getVolumeField()
   * @generated
   */
  int VOLUME_FIELD = 10;

  /**
   * The feature id for the '<em><b>Volume</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME_FIELD__VOLUME = 0;

  /**
   * The number of structural features of the '<em>Volume Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.NumberFieldImpl <em>Number Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.NumberFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getNumberField()
   * @generated
   */
  int NUMBER_FIELD = 11;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD__NUMBER = 0;

  /**
   * The number of structural features of the '<em>Number Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.PagesFieldImpl <em>Pages Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.PagesFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getPagesField()
   * @generated
   */
  int PAGES_FIELD = 12;

  /**
   * The feature id for the '<em><b>Pages</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGES_FIELD__PAGES = 0;

  /**
   * The number of structural features of the '<em>Pages Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGES_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.MonthFieldImpl <em>Month Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.MonthFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getMonthField()
   * @generated
   */
  int MONTH_FIELD = 13;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH_FIELD__MONTH = 0;

  /**
   * The number of structural features of the '<em>Month Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MONTH_FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.NoteFieldImpl <em>Note Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.NoteFieldImpl
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getNoteField()
   * @generated
   */
  int NOTE_FIELD = 14;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FIELD__NOTE = 0;

  /**
   * The number of structural features of the '<em>Note Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FIELD_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Model#getBibtexEntries <em>Bibtex Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bibtex Entries</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Model#getBibtexEntries()
   * @see #getModel()
   * @generated
   */
  EReference getModel_BibtexEntries();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes <em>Bibtex Entry Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bibtex Entry Types</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes
   * @generated
   */
  EClass getBibtexEntryTypes();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article <em>Article</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Article</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article
   * @generated
   */
  EClass getArticle();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getKey()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Key();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getAuthor()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Author();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Title</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getTitle()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Title();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getJournal <em>Journal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Journal</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getJournal()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Journal();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Year</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getYear()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Year();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getVolume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Volume</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getVolume()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Volume();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Number</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNumber()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Number();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pages</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getPages()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Pages();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Month</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getMonth()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Month();

  /**
   * Returns the meta object for the containment reference '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Note</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNote()
   * @see #getArticle()
   * @generated
   */
  EReference getArticle_Note();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey <em>Cite Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cite Key</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey
   * @generated
   */
  EClass getCiteKey();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey#getKey()
   * @see #getCiteKey()
   * @generated
   */
  EAttribute getCiteKey_Key();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField <em>Author Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField
   * @generated
   */
  EClass getAuthorField();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Authors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Authors</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Authors
   * @generated
   */
  EClass getAuthors();

  /**
   * Returns the meta object for the containment reference list '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Authors#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Authors#getNames()
   * @see #getAuthors()
   * @generated
   */
  EReference getAuthors_Names();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname <em>Fullname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fullname</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Fullname
   * @generated
   */
  EClass getFullname();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getLastname <em>Lastname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lastname</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getLastname()
   * @see #getFullname()
   * @generated
   */
  EAttribute getFullname_Lastname();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getFirstname <em>Firstname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Firstname</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Fullname#getFirstname()
   * @see #getFullname()
   * @generated
   */
  EAttribute getFullname_Firstname();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.TitleField <em>Title Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Title Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.TitleField
   * @generated
   */
  EClass getTitleField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.TitleField#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.TitleField#getTitle()
   * @see #getTitleField()
   * @generated
   */
  EAttribute getTitleField_Title();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.JournalField <em>Journal Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Journal Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.JournalField
   * @generated
   */
  EClass getJournalField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.JournalField#getJournal <em>Journal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Journal</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.JournalField#getJournal()
   * @see #getJournalField()
   * @generated
   */
  EAttribute getJournalField_Journal();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.YearField <em>Year Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Year Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.YearField
   * @generated
   */
  EClass getYearField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.YearField#getYear <em>Year</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Year</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.YearField#getYear()
   * @see #getYearField()
   * @generated
   */
  EAttribute getYearField_Year();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField <em>Volume Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Volume Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField
   * @generated
   */
  EClass getVolumeField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField#getVolume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volume</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField#getVolume()
   * @see #getVolumeField()
   * @generated
   */
  EAttribute getVolumeField_Volume();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NumberField <em>Number Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NumberField
   * @generated
   */
  EClass getNumberField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NumberField#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NumberField#getNumber()
   * @see #getNumberField()
   * @generated
   */
  EAttribute getNumberField_Number();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.PagesField <em>Pages Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pages Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.PagesField
   * @generated
   */
  EClass getPagesField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.PagesField#getPages <em>Pages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pages</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.PagesField#getPages()
   * @see #getPagesField()
   * @generated
   */
  EAttribute getPagesField_Pages();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.MonthField <em>Month Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Month Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.MonthField
   * @generated
   */
  EClass getMonthField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.MonthField#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.MonthField#getMonth()
   * @see #getMonthField()
   * @generated
   */
  EAttribute getMonthField_Month();

  /**
   * Returns the meta object for class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NoteField <em>Note Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note Field</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NoteField
   * @generated
   */
  EClass getNoteField();

  /**
   * Returns the meta object for the attribute '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NoteField#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NoteField#getNote()
   * @see #getNoteField()
   * @generated
   */
  EAttribute getNoteField_Note();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BibTeXFactory getBibTeXFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.ModelImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Bibtex Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__BIBTEX_ENTRIES = eINSTANCE.getModel_BibtexEntries();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl <em>Bibtex Entry Types</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getBibtexEntryTypes()
     * @generated
     */
    EClass BIBTEX_ENTRY_TYPES = eINSTANCE.getBibtexEntryTypes();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl <em>Article</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getArticle()
     * @generated
     */
    EClass ARTICLE = eINSTANCE.getArticle();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__KEY = eINSTANCE.getArticle_Key();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__AUTHOR = eINSTANCE.getArticle_Author();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__TITLE = eINSTANCE.getArticle_Title();

    /**
     * The meta object literal for the '<em><b>Journal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__JOURNAL = eINSTANCE.getArticle_Journal();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__YEAR = eINSTANCE.getArticle_Year();

    /**
     * The meta object literal for the '<em><b>Volume</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__VOLUME = eINSTANCE.getArticle_Volume();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__NUMBER = eINSTANCE.getArticle_Number();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__PAGES = eINSTANCE.getArticle_Pages();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__MONTH = eINSTANCE.getArticle_Month();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTICLE__NOTE = eINSTANCE.getArticle_Note();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.CiteKeyImpl <em>Cite Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.CiteKeyImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getCiteKey()
     * @generated
     */
    EClass CITE_KEY = eINSTANCE.getCiteKey();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CITE_KEY__KEY = eINSTANCE.getCiteKey_Key();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorFieldImpl <em>Author Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getAuthorField()
     * @generated
     */
    EClass AUTHOR_FIELD = eINSTANCE.getAuthorField();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorsImpl <em>Authors</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.AuthorsImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getAuthors()
     * @generated
     */
    EClass AUTHORS = eINSTANCE.getAuthors();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTHORS__NAMES = eINSTANCE.getAuthors_Names();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl <em>Fullname</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getFullname()
     * @generated
     */
    EClass FULLNAME = eINSTANCE.getFullname();

    /**
     * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULLNAME__LASTNAME = eINSTANCE.getFullname_Lastname();

    /**
     * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FULLNAME__FIRSTNAME = eINSTANCE.getFullname_Firstname();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.TitleFieldImpl <em>Title Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.TitleFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getTitleField()
     * @generated
     */
    EClass TITLE_FIELD = eINSTANCE.getTitleField();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TITLE_FIELD__TITLE = eINSTANCE.getTitleField_Title();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.JournalFieldImpl <em>Journal Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.JournalFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getJournalField()
     * @generated
     */
    EClass JOURNAL_FIELD = eINSTANCE.getJournalField();

    /**
     * The meta object literal for the '<em><b>Journal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JOURNAL_FIELD__JOURNAL = eINSTANCE.getJournalField_Journal();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.YearFieldImpl <em>Year Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.YearFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getYearField()
     * @generated
     */
    EClass YEAR_FIELD = eINSTANCE.getYearField();

    /**
     * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute YEAR_FIELD__YEAR = eINSTANCE.getYearField_Year();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.VolumeFieldImpl <em>Volume Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.VolumeFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getVolumeField()
     * @generated
     */
    EClass VOLUME_FIELD = eINSTANCE.getVolumeField();

    /**
     * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME_FIELD__VOLUME = eINSTANCE.getVolumeField_Volume();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.NumberFieldImpl <em>Number Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.NumberFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getNumberField()
     * @generated
     */
    EClass NUMBER_FIELD = eINSTANCE.getNumberField();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_FIELD__NUMBER = eINSTANCE.getNumberField_Number();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.PagesFieldImpl <em>Pages Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.PagesFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getPagesField()
     * @generated
     */
    EClass PAGES_FIELD = eINSTANCE.getPagesField();

    /**
     * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGES_FIELD__PAGES = eINSTANCE.getPagesField_Pages();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.MonthFieldImpl <em>Month Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.MonthFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getMonthField()
     * @generated
     */
    EClass MONTH_FIELD = eINSTANCE.getMonthField();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MONTH_FIELD__MONTH = eINSTANCE.getMonthField_Month();

    /**
     * The meta object literal for the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.NoteFieldImpl <em>Note Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.NoteFieldImpl
     * @see de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibTeXPackageImpl#getNoteField()
     * @generated
     */
    EClass NOTE_FIELD = eINSTANCE.getNoteField();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE_FIELD__NOTE = eINSTANCE.getNoteField_Note();

  }

} //BibTeXPackage
