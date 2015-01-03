/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.util;

import de.tubs.bibtextohtml.bibtex.bibTeX.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage
 * @generated
 */
public class BibTeXAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BibTeXPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibTeXAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BibTeXPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BibTeXSwitch<Adapter> modelSwitch =
    new BibTeXSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseBibtexEntryTypes(BibtexEntryTypes object)
      {
        return createBibtexEntryTypesAdapter();
      }
      @Override
      public Adapter caseArticle(Article object)
      {
        return createArticleAdapter();
      }
      @Override
      public Adapter caseCiteKey(CiteKey object)
      {
        return createCiteKeyAdapter();
      }
      @Override
      public Adapter caseAuthorField(AuthorField object)
      {
        return createAuthorFieldAdapter();
      }
      @Override
      public Adapter caseAuthors(Authors object)
      {
        return createAuthorsAdapter();
      }
      @Override
      public Adapter caseFullname(Fullname object)
      {
        return createFullnameAdapter();
      }
      @Override
      public Adapter caseTitleField(TitleField object)
      {
        return createTitleFieldAdapter();
      }
      @Override
      public Adapter caseJournalField(JournalField object)
      {
        return createJournalFieldAdapter();
      }
      @Override
      public Adapter caseYearField(YearField object)
      {
        return createYearFieldAdapter();
      }
      @Override
      public Adapter caseVolumeField(VolumeField object)
      {
        return createVolumeFieldAdapter();
      }
      @Override
      public Adapter caseNumberField(NumberField object)
      {
        return createNumberFieldAdapter();
      }
      @Override
      public Adapter casePagesField(PagesField object)
      {
        return createPagesFieldAdapter();
      }
      @Override
      public Adapter caseMonthField(MonthField object)
      {
        return createMonthFieldAdapter();
      }
      @Override
      public Adapter caseNoteField(NoteField object)
      {
        return createNoteFieldAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes <em>Bibtex Entry Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes
   * @generated
   */
  public Adapter createBibtexEntryTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article <em>Article</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Article
   * @generated
   */
  public Adapter createArticleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey <em>Cite Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey
   * @generated
   */
  public Adapter createCiteKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField <em>Author Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField
   * @generated
   */
  public Adapter createAuthorFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Authors <em>Authors</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Authors
   * @generated
   */
  public Adapter createAuthorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Fullname <em>Fullname</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.Fullname
   * @generated
   */
  public Adapter createFullnameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.TitleField <em>Title Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.TitleField
   * @generated
   */
  public Adapter createTitleFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.JournalField <em>Journal Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.JournalField
   * @generated
   */
  public Adapter createJournalFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.YearField <em>Year Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.YearField
   * @generated
   */
  public Adapter createYearFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField <em>Volume Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField
   * @generated
   */
  public Adapter createVolumeFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NumberField <em>Number Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NumberField
   * @generated
   */
  public Adapter createNumberFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.PagesField <em>Pages Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.PagesField
   * @generated
   */
  public Adapter createPagesFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.MonthField <em>Month Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.MonthField
   * @generated
   */
  public Adapter createMonthFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.tubs.bibtextohtml.bibtex.bibTeX.NoteField <em>Note Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.NoteField
   * @generated
   */
  public Adapter createNoteFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BibTeXAdapterFactory
