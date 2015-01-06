/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.AddressField;
import de.tubs.bibtextohtml.bibtex.bibTeX.Article;
import de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField;
import de.tubs.bibtextohtml.bibtex.bibTeX.Authors;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXFactory;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes;
import de.tubs.bibtextohtml.bibtex.bibTeX.Book;
import de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey;
import de.tubs.bibtextohtml.bibtex.bibTeX.EditionField;
import de.tubs.bibtextohtml.bibtex.bibTeX.EditorField;
import de.tubs.bibtextohtml.bibtex.bibTeX.Fullname;
import de.tubs.bibtextohtml.bibtex.bibTeX.IsbnField;
import de.tubs.bibtextohtml.bibtex.bibTeX.JournalField;
import de.tubs.bibtextohtml.bibtex.bibTeX.Model;
import de.tubs.bibtextohtml.bibtex.bibTeX.MonthField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NoteField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NumberField;
import de.tubs.bibtextohtml.bibtex.bibTeX.PagesField;
import de.tubs.bibtextohtml.bibtex.bibTeX.PublisherField;
import de.tubs.bibtextohtml.bibtex.bibTeX.SeriesField;
import de.tubs.bibtextohtml.bibtex.bibTeX.TitleField;
import de.tubs.bibtextohtml.bibtex.bibTeX.UnknownField;
import de.tubs.bibtextohtml.bibtex.bibTeX.UnknownType;
import de.tubs.bibtextohtml.bibtex.bibTeX.UnknownValue;
import de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField;
import de.tubs.bibtextohtml.bibtex.bibTeX.YearField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibTeXPackageImpl extends EPackageImpl implements BibTeXPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bibtexEntryTypesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass articleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bookEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass citeKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass authorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullnameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editorFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass titleFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass publisherFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass journalFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yearFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass volumeFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pagesFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass monthFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass addressFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass seriesFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass editionFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass isbnFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noteFieldEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BibTeXPackageImpl()
  {
    super(eNS_URI, BibTeXFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BibTeXPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BibTeXPackage init()
  {
    if (isInited) return (BibTeXPackage)EPackage.Registry.INSTANCE.getEPackage(BibTeXPackage.eNS_URI);

    // Obtain or create and register package
    BibTeXPackageImpl theBibTeXPackage = (BibTeXPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BibTeXPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BibTeXPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBibTeXPackage.createPackageContents();

    // Initialize created meta-data
    theBibTeXPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBibTeXPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BibTeXPackage.eNS_URI, theBibTeXPackage);
    return theBibTeXPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_BibtexEntries()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBibtexEntryTypes()
  {
    return bibtexEntryTypesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Key()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Title()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Year()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Month()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Note()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBibtexEntryTypes_Unknowns()
  {
    return (EReference)bibtexEntryTypesEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArticle()
  {
    return articleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArticle_Author()
  {
    return (EReference)articleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArticle_Journal()
  {
    return (EReference)articleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArticle_Volume()
  {
    return (EReference)articleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArticle_Number()
  {
    return (EReference)articleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArticle_Pages()
  {
    return (EReference)articleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBook()
  {
    return bookEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Author_editor()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Publisher()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Volume_number()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Series()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Address()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Edition()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBook_Isbn()
  {
    return (EReference)bookEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownField()
  {
    return unknownFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnknownField_Type()
  {
    return (EReference)unknownFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnknownField_Value()
  {
    return (EReference)unknownFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownType()
  {
    return unknownTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownType_Type()
  {
    return (EAttribute)unknownTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownValue()
  {
    return unknownValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownValue_Value()
  {
    return (EAttribute)unknownValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCiteKey()
  {
    return citeKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCiteKey_Key()
  {
    return (EAttribute)citeKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthorField()
  {
    return authorFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAuthors()
  {
    return authorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAuthors_Names()
  {
    return (EReference)authorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullname()
  {
    return fullnameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFullname_Lastname()
  {
    return (EAttribute)fullnameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFullname_Firstname()
  {
    return (EAttribute)fullnameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditorField()
  {
    return editorFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditorField_Editor()
  {
    return (EAttribute)editorFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTitleField()
  {
    return titleFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTitleField_Title()
  {
    return (EAttribute)titleFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPublisherField()
  {
    return publisherFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPublisherField_Publisher()
  {
    return (EAttribute)publisherFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJournalField()
  {
    return journalFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJournalField_Journal()
  {
    return (EAttribute)journalFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYearField()
  {
    return yearFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYearField_Year()
  {
    return (EAttribute)yearFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVolumeField()
  {
    return volumeFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolumeField_Volume()
  {
    return (EAttribute)volumeFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberField()
  {
    return numberFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberField_Number()
  {
    return (EAttribute)numberFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPagesField()
  {
    return pagesFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPagesField_Pages()
  {
    return (EAttribute)pagesFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMonthField()
  {
    return monthFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMonthField_Month()
  {
    return (EAttribute)monthFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAddressField()
  {
    return addressFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAddressField_Address()
  {
    return (EAttribute)addressFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSeriesField()
  {
    return seriesFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSeriesField_Series()
  {
    return (EAttribute)seriesFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEditionField()
  {
    return editionFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEditionField_Edition()
  {
    return (EAttribute)editionFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIsbnField()
  {
    return isbnFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIsbnField_Isbn()
  {
    return (EAttribute)isbnFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNoteField()
  {
    return noteFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNoteField_Note()
  {
    return (EAttribute)noteFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibTeXFactory getBibTeXFactory()
  {
    return (BibTeXFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__BIBTEX_ENTRIES);

    bibtexEntryTypesEClass = createEClass(BIBTEX_ENTRY_TYPES);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__KEY);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__TITLE);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__YEAR);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__MONTH);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__NOTE);
    createEReference(bibtexEntryTypesEClass, BIBTEX_ENTRY_TYPES__UNKNOWNS);

    articleEClass = createEClass(ARTICLE);
    createEReference(articleEClass, ARTICLE__AUTHOR);
    createEReference(articleEClass, ARTICLE__JOURNAL);
    createEReference(articleEClass, ARTICLE__VOLUME);
    createEReference(articleEClass, ARTICLE__NUMBER);
    createEReference(articleEClass, ARTICLE__PAGES);

    bookEClass = createEClass(BOOK);
    createEReference(bookEClass, BOOK__AUTHOR_EDITOR);
    createEReference(bookEClass, BOOK__PUBLISHER);
    createEReference(bookEClass, BOOK__VOLUME_NUMBER);
    createEReference(bookEClass, BOOK__SERIES);
    createEReference(bookEClass, BOOK__ADDRESS);
    createEReference(bookEClass, BOOK__EDITION);
    createEReference(bookEClass, BOOK__ISBN);

    unknownFieldEClass = createEClass(UNKNOWN_FIELD);
    createEReference(unknownFieldEClass, UNKNOWN_FIELD__TYPE);
    createEReference(unknownFieldEClass, UNKNOWN_FIELD__VALUE);

    unknownTypeEClass = createEClass(UNKNOWN_TYPE);
    createEAttribute(unknownTypeEClass, UNKNOWN_TYPE__TYPE);

    unknownValueEClass = createEClass(UNKNOWN_VALUE);
    createEAttribute(unknownValueEClass, UNKNOWN_VALUE__VALUE);

    citeKeyEClass = createEClass(CITE_KEY);
    createEAttribute(citeKeyEClass, CITE_KEY__KEY);

    authorFieldEClass = createEClass(AUTHOR_FIELD);

    authorsEClass = createEClass(AUTHORS);
    createEReference(authorsEClass, AUTHORS__NAMES);

    fullnameEClass = createEClass(FULLNAME);
    createEAttribute(fullnameEClass, FULLNAME__LASTNAME);
    createEAttribute(fullnameEClass, FULLNAME__FIRSTNAME);

    editorFieldEClass = createEClass(EDITOR_FIELD);
    createEAttribute(editorFieldEClass, EDITOR_FIELD__EDITOR);

    titleFieldEClass = createEClass(TITLE_FIELD);
    createEAttribute(titleFieldEClass, TITLE_FIELD__TITLE);

    publisherFieldEClass = createEClass(PUBLISHER_FIELD);
    createEAttribute(publisherFieldEClass, PUBLISHER_FIELD__PUBLISHER);

    journalFieldEClass = createEClass(JOURNAL_FIELD);
    createEAttribute(journalFieldEClass, JOURNAL_FIELD__JOURNAL);

    yearFieldEClass = createEClass(YEAR_FIELD);
    createEAttribute(yearFieldEClass, YEAR_FIELD__YEAR);

    volumeFieldEClass = createEClass(VOLUME_FIELD);
    createEAttribute(volumeFieldEClass, VOLUME_FIELD__VOLUME);

    numberFieldEClass = createEClass(NUMBER_FIELD);
    createEAttribute(numberFieldEClass, NUMBER_FIELD__NUMBER);

    pagesFieldEClass = createEClass(PAGES_FIELD);
    createEAttribute(pagesFieldEClass, PAGES_FIELD__PAGES);

    monthFieldEClass = createEClass(MONTH_FIELD);
    createEAttribute(monthFieldEClass, MONTH_FIELD__MONTH);

    addressFieldEClass = createEClass(ADDRESS_FIELD);
    createEAttribute(addressFieldEClass, ADDRESS_FIELD__ADDRESS);

    seriesFieldEClass = createEClass(SERIES_FIELD);
    createEAttribute(seriesFieldEClass, SERIES_FIELD__SERIES);

    editionFieldEClass = createEClass(EDITION_FIELD);
    createEAttribute(editionFieldEClass, EDITION_FIELD__EDITION);

    isbnFieldEClass = createEClass(ISBN_FIELD);
    createEAttribute(isbnFieldEClass, ISBN_FIELD__ISBN);

    noteFieldEClass = createEClass(NOTE_FIELD);
    createEAttribute(noteFieldEClass, NOTE_FIELD__NOTE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    articleEClass.getESuperTypes().add(this.getBibtexEntryTypes());
    bookEClass.getESuperTypes().add(this.getBibtexEntryTypes());
    authorsEClass.getESuperTypes().add(this.getAuthorField());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_BibtexEntries(), this.getBibtexEntryTypes(), null, "BibtexEntries", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bibtexEntryTypesEClass, BibtexEntryTypes.class, "BibtexEntryTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBibtexEntryTypes_Key(), this.getCiteKey(), null, "key", null, 0, 1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBibtexEntryTypes_Title(), this.getTitleField(), null, "title", null, 0, 1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBibtexEntryTypes_Year(), this.getYearField(), null, "year", null, 0, 1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBibtexEntryTypes_Month(), this.getMonthField(), null, "month", null, 0, 1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBibtexEntryTypes_Note(), this.getNoteField(), null, "note", null, 0, 1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBibtexEntryTypes_Unknowns(), this.getUnknownField(), null, "unknowns", null, 0, -1, BibtexEntryTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(articleEClass, Article.class, "Article", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArticle_Author(), this.getAuthorField(), null, "author", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArticle_Journal(), this.getJournalField(), null, "journal", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArticle_Volume(), this.getVolumeField(), null, "volume", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArticle_Number(), this.getNumberField(), null, "number", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArticle_Pages(), this.getPagesField(), null, "pages", null, 0, 1, Article.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bookEClass, Book.class, "Book", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBook_Author_editor(), ecorePackage.getEObject(), null, "author_editor", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Publisher(), this.getPublisherField(), null, "publisher", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Volume_number(), ecorePackage.getEObject(), null, "volume_number", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Series(), this.getSeriesField(), null, "series", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Address(), this.getAddressField(), null, "address", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Edition(), this.getEditionField(), null, "edition", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBook_Isbn(), this.getIsbnField(), null, "isbn", null, 0, 1, Book.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownFieldEClass, UnknownField.class, "UnknownField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUnknownField_Type(), this.getUnknownType(), null, "type", null, 0, 1, UnknownField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnknownField_Value(), this.getUnknownValue(), null, "value", null, 0, 1, UnknownField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownTypeEClass, UnknownType.class, "UnknownType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnknownType_Type(), ecorePackage.getEString(), "type", null, 0, 1, UnknownType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownValueEClass, UnknownValue.class, "UnknownValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnknownValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, UnknownValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(citeKeyEClass, CiteKey.class, "CiteKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCiteKey_Key(), ecorePackage.getEString(), "key", null, 0, 1, CiteKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(authorFieldEClass, AuthorField.class, "AuthorField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(authorsEClass, Authors.class, "Authors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAuthors_Names(), this.getFullname(), null, "names", null, 0, -1, Authors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fullnameEClass, Fullname.class, "Fullname", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFullname_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Fullname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFullname_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Fullname.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editorFieldEClass, EditorField.class, "EditorField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditorField_Editor(), ecorePackage.getEString(), "editor", null, 0, 1, EditorField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(titleFieldEClass, TitleField.class, "TitleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTitleField_Title(), ecorePackage.getEString(), "title", null, 0, 1, TitleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(publisherFieldEClass, PublisherField.class, "PublisherField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPublisherField_Publisher(), ecorePackage.getEString(), "publisher", null, 0, 1, PublisherField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(journalFieldEClass, JournalField.class, "JournalField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJournalField_Journal(), ecorePackage.getEString(), "journal", null, 0, 1, JournalField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(yearFieldEClass, YearField.class, "YearField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getYearField_Year(), ecorePackage.getEString(), "year", null, 0, 1, YearField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(volumeFieldEClass, VolumeField.class, "VolumeField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVolumeField_Volume(), ecorePackage.getEString(), "volume", null, 0, 1, VolumeField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberFieldEClass, NumberField.class, "NumberField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberField_Number(), ecorePackage.getEString(), "number", null, 0, 1, NumberField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pagesFieldEClass, PagesField.class, "PagesField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPagesField_Pages(), ecorePackage.getEString(), "pages", null, 0, 1, PagesField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(monthFieldEClass, MonthField.class, "MonthField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMonthField_Month(), ecorePackage.getEString(), "month", null, 0, 1, MonthField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(addressFieldEClass, AddressField.class, "AddressField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAddressField_Address(), ecorePackage.getEString(), "address", null, 0, 1, AddressField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(seriesFieldEClass, SeriesField.class, "SeriesField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSeriesField_Series(), ecorePackage.getEString(), "series", null, 0, 1, SeriesField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(editionFieldEClass, EditionField.class, "EditionField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEditionField_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, EditionField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(isbnFieldEClass, IsbnField.class, "IsbnField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIsbnField_Isbn(), ecorePackage.getEString(), "isbn", null, 0, 1, IsbnField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(noteFieldEClass, NoteField.class, "NoteField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNoteField_Note(), ecorePackage.getEString(), "note", null, 0, 1, NoteField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BibTeXPackageImpl
