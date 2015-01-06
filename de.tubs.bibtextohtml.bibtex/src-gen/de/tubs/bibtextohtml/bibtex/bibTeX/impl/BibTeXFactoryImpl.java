/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibTeXFactoryImpl extends EFactoryImpl implements BibTeXFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BibTeXFactory init()
  {
    try
    {
      BibTeXFactory theBibTeXFactory = (BibTeXFactory)EPackage.Registry.INSTANCE.getEFactory(BibTeXPackage.eNS_URI);
      if (theBibTeXFactory != null)
      {
        return theBibTeXFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BibTeXFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibTeXFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BibTeXPackage.MODEL: return createModel();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES: return createBibtexEntryTypes();
      case BibTeXPackage.ARTICLE: return createArticle();
      case BibTeXPackage.BOOK: return createBook();
      case BibTeXPackage.UNKNOWN_FIELD: return createUnknownField();
      case BibTeXPackage.UNKNOWN_TYPE: return createUnknownType();
      case BibTeXPackage.UNKNOWN_VALUE: return createUnknownValue();
      case BibTeXPackage.CITE_KEY: return createCiteKey();
      case BibTeXPackage.AUTHOR_FIELD: return createAuthorField();
      case BibTeXPackage.AUTHORS: return createAuthors();
      case BibTeXPackage.FULLNAME: return createFullname();
      case BibTeXPackage.EDITOR_FIELD: return createEditorField();
      case BibTeXPackage.TITLE_FIELD: return createTitleField();
      case BibTeXPackage.PUBLISHER_FIELD: return createPublisherField();
      case BibTeXPackage.JOURNAL_FIELD: return createJournalField();
      case BibTeXPackage.YEAR_FIELD: return createYearField();
      case BibTeXPackage.VOLUME_FIELD: return createVolumeField();
      case BibTeXPackage.NUMBER_FIELD: return createNumberField();
      case BibTeXPackage.PAGES_FIELD: return createPagesField();
      case BibTeXPackage.MONTH_FIELD: return createMonthField();
      case BibTeXPackage.ADDRESS_FIELD: return createAddressField();
      case BibTeXPackage.SERIES_FIELD: return createSeriesField();
      case BibTeXPackage.EDITION_FIELD: return createEditionField();
      case BibTeXPackage.ISBN_FIELD: return createIsbnField();
      case BibTeXPackage.NOTE_FIELD: return createNoteField();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibtexEntryTypes createBibtexEntryTypes()
  {
    BibtexEntryTypesImpl bibtexEntryTypes = new BibtexEntryTypesImpl();
    return bibtexEntryTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Article createArticle()
  {
    ArticleImpl article = new ArticleImpl();
    return article;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Book createBook()
  {
    BookImpl book = new BookImpl();
    return book;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownField createUnknownField()
  {
    UnknownFieldImpl unknownField = new UnknownFieldImpl();
    return unknownField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownType createUnknownType()
  {
    UnknownTypeImpl unknownType = new UnknownTypeImpl();
    return unknownType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownValue createUnknownValue()
  {
    UnknownValueImpl unknownValue = new UnknownValueImpl();
    return unknownValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CiteKey createCiteKey()
  {
    CiteKeyImpl citeKey = new CiteKeyImpl();
    return citeKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthorField createAuthorField()
  {
    AuthorFieldImpl authorField = new AuthorFieldImpl();
    return authorField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Authors createAuthors()
  {
    AuthorsImpl authors = new AuthorsImpl();
    return authors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fullname createFullname()
  {
    FullnameImpl fullname = new FullnameImpl();
    return fullname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditorField createEditorField()
  {
    EditorFieldImpl editorField = new EditorFieldImpl();
    return editorField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitleField createTitleField()
  {
    TitleFieldImpl titleField = new TitleFieldImpl();
    return titleField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PublisherField createPublisherField()
  {
    PublisherFieldImpl publisherField = new PublisherFieldImpl();
    return publisherField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalField createJournalField()
  {
    JournalFieldImpl journalField = new JournalFieldImpl();
    return journalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YearField createYearField()
  {
    YearFieldImpl yearField = new YearFieldImpl();
    return yearField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VolumeField createVolumeField()
  {
    VolumeFieldImpl volumeField = new VolumeFieldImpl();
    return volumeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberField createNumberField()
  {
    NumberFieldImpl numberField = new NumberFieldImpl();
    return numberField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PagesField createPagesField()
  {
    PagesFieldImpl pagesField = new PagesFieldImpl();
    return pagesField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthField createMonthField()
  {
    MonthFieldImpl monthField = new MonthFieldImpl();
    return monthField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressField createAddressField()
  {
    AddressFieldImpl addressField = new AddressFieldImpl();
    return addressField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SeriesField createSeriesField()
  {
    SeriesFieldImpl seriesField = new SeriesFieldImpl();
    return seriesField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EditionField createEditionField()
  {
    EditionFieldImpl editionField = new EditionFieldImpl();
    return editionField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsbnField createIsbnField()
  {
    IsbnFieldImpl isbnField = new IsbnFieldImpl();
    return isbnField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteField createNoteField()
  {
    NoteFieldImpl noteField = new NoteFieldImpl();
    return noteField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibTeXPackage getBibTeXPackage()
  {
    return (BibTeXPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BibTeXPackage getPackage()
  {
    return BibTeXPackage.eINSTANCE;
  }

} //BibTeXFactoryImpl
