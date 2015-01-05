/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getKey <em>Key</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getJournal <em>Journal</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getYear <em>Year</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNumber <em>Number</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getPages <em>Pages</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getMonth <em>Month</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle()
 * @model
 * @generated
 */
public interface Article extends BibtexEntryTypes
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
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Key()
   * @model containment="true"
   * @generated
   */
  CiteKey getKey();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(CiteKey value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' containment reference.
   * @see #setAuthor(AuthorField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Author()
   * @model containment="true"
   * @generated
   */
  AuthorField getAuthor();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getAuthor <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' containment reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(AuthorField value);

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
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Title()
   * @model containment="true"
   * @generated
   */
  TitleField getTitle();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(TitleField value);

  /**
   * Returns the value of the '<em><b>Journal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Journal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Journal</em>' containment reference.
   * @see #setJournal(JournalField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Journal()
   * @model containment="true"
   * @generated
   */
  JournalField getJournal();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getJournal <em>Journal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Journal</em>' containment reference.
   * @see #getJournal()
   * @generated
   */
  void setJournal(JournalField value);

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
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Year()
   * @model containment="true"
   * @generated
   */
  YearField getYear();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getYear <em>Year</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Year</em>' containment reference.
   * @see #getYear()
   * @generated
   */
  void setYear(YearField value);

  /**
   * Returns the value of the '<em><b>Volume</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Volume</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Volume</em>' containment reference.
   * @see #setVolume(VolumeField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Volume()
   * @model containment="true"
   * @generated
   */
  VolumeField getVolume();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getVolume <em>Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Volume</em>' containment reference.
   * @see #getVolume()
   * @generated
   */
  void setVolume(VolumeField value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(NumberField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Number()
   * @model containment="true"
   * @generated
   */
  NumberField getNumber();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(NumberField value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pages</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference.
   * @see #setPages(PagesField)
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Pages()
   * @model containment="true"
   * @generated
   */
  PagesField getPages();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getPages <em>Pages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pages</em>' containment reference.
   * @see #getPages()
   * @generated
   */
  void setPages(PagesField value);

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
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Month()
   * @model containment="true"
   * @generated
   */
  MonthField getMonth();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getMonth <em>Month</em>}' containment reference.
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
   * @see de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage#getArticle_Note()
   * @model containment="true"
   * @generated
   */
  NoteField getNote();

  /**
   * Sets the value of the '{@link de.tubs.bibtextohtml.bibtex.bibTeX.Article#getNote <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Note</em>' containment reference.
   * @see #getNote()
   * @generated
   */
  void setNote(NoteField value);

} // Article
