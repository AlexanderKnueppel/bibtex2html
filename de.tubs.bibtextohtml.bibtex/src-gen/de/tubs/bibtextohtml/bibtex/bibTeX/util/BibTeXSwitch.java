/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.util;

import de.tubs.bibtextohtml.bibtex.bibTeX.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage
 * @generated
 */
public class BibTeXSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BibTeXPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BibTeXSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BibTeXPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BibTeXPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.BIBTEX_ENTRY_TYPES:
      {
        BibtexEntryTypes bibtexEntryTypes = (BibtexEntryTypes)theEObject;
        T result = caseBibtexEntryTypes(bibtexEntryTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.ARTICLE:
      {
        Article article = (Article)theEObject;
        T result = caseArticle(article);
        if (result == null) result = caseBibtexEntryTypes(article);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.CITE_KEY:
      {
        CiteKey citeKey = (CiteKey)theEObject;
        T result = caseCiteKey(citeKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.AUTHOR_FIELD:
      {
        AuthorField authorField = (AuthorField)theEObject;
        T result = caseAuthorField(authorField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.AUTHORS:
      {
        Authors authors = (Authors)theEObject;
        T result = caseAuthors(authors);
        if (result == null) result = caseAuthorField(authors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.FULLNAME:
      {
        Fullname fullname = (Fullname)theEObject;
        T result = caseFullname(fullname);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.TITLE_FIELD:
      {
        TitleField titleField = (TitleField)theEObject;
        T result = caseTitleField(titleField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.JOURNAL_FIELD:
      {
        JournalField journalField = (JournalField)theEObject;
        T result = caseJournalField(journalField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.YEAR_FIELD:
      {
        YearField yearField = (YearField)theEObject;
        T result = caseYearField(yearField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.VOLUME_FIELD:
      {
        VolumeField volumeField = (VolumeField)theEObject;
        T result = caseVolumeField(volumeField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.NUMBER_FIELD:
      {
        NumberField numberField = (NumberField)theEObject;
        T result = caseNumberField(numberField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.PAGES_FIELD:
      {
        PagesField pagesField = (PagesField)theEObject;
        T result = casePagesField(pagesField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.MONTH_FIELD:
      {
        MonthField monthField = (MonthField)theEObject;
        T result = caseMonthField(monthField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BibTeXPackage.NOTE_FIELD:
      {
        NoteField noteField = (NoteField)theEObject;
        T result = caseNoteField(noteField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bibtex Entry Types</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bibtex Entry Types</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBibtexEntryTypes(BibtexEntryTypes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Article</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Article</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArticle(Article object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cite Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cite Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCiteKey(CiteKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Author Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Author Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthorField(AuthorField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Authors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Authors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthors(Authors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fullname</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fullname</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFullname(Fullname object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Title Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Title Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTitleField(TitleField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Journal Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Journal Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJournalField(JournalField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Year Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Year Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYearField(YearField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Volume Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Volume Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVolumeField(VolumeField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberField(NumberField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pages Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pages Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePagesField(PagesField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Month Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Month Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMonthField(MonthField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Note Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNoteField(NoteField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BibTeXSwitch
