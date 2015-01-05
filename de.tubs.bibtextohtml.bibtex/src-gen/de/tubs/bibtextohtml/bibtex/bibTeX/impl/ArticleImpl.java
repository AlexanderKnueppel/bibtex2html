/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.Article;
import de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey;
import de.tubs.bibtextohtml.bibtex.bibTeX.JournalField;
import de.tubs.bibtextohtml.bibtex.bibTeX.MonthField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NoteField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NumberField;
import de.tubs.bibtextohtml.bibtex.bibTeX.PagesField;
import de.tubs.bibtextohtml.bibtex.bibTeX.TitleField;
import de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField;
import de.tubs.bibtextohtml.bibtex.bibTeX.YearField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Article</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getYear <em>Year</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getNote <em>Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArticleImpl extends BibtexEntryTypesImpl implements Article
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected CiteKey key;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected AuthorField author;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected TitleField title;

  /**
   * The cached value of the '{@link #getJournal() <em>Journal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJournal()
   * @generated
   * @ordered
   */
  protected JournalField journal;

  /**
   * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYear()
   * @generated
   * @ordered
   */
  protected YearField year;

  /**
   * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected VolumeField volume;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected NumberField number;

  /**
   * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPages()
   * @generated
   * @ordered
   */
  protected PagesField pages;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected MonthField month;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected NoteField note;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArticleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BibTeXPackage.Literals.ARTICLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CiteKey getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(CiteKey newKey, NotificationChain msgs)
  {
    CiteKey oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(CiteKey newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AuthorField getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthor(AuthorField newAuthor, NotificationChain msgs)
  {
    AuthorField oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__AUTHOR, oldAuthor, newAuthor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(AuthorField newAuthor)
  {
    if (newAuthor != author)
    {
      NotificationChain msgs = null;
      if (author != null)
        msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__AUTHOR, null, msgs);
      if (newAuthor != null)
        msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__AUTHOR, null, msgs);
      msgs = basicSetAuthor(newAuthor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__AUTHOR, newAuthor, newAuthor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TitleField getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(TitleField newTitle, NotificationChain msgs)
  {
    TitleField oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(TitleField newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JournalField getJournal()
  {
    return journal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJournal(JournalField newJournal, NotificationChain msgs)
  {
    JournalField oldJournal = journal;
    journal = newJournal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__JOURNAL, oldJournal, newJournal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJournal(JournalField newJournal)
  {
    if (newJournal != journal)
    {
      NotificationChain msgs = null;
      if (journal != null)
        msgs = ((InternalEObject)journal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__JOURNAL, null, msgs);
      if (newJournal != null)
        msgs = ((InternalEObject)newJournal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__JOURNAL, null, msgs);
      msgs = basicSetJournal(newJournal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__JOURNAL, newJournal, newJournal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YearField getYear()
  {
    return year;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYear(YearField newYear, NotificationChain msgs)
  {
    YearField oldYear = year;
    year = newYear;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__YEAR, oldYear, newYear);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYear(YearField newYear)
  {
    if (newYear != year)
    {
      NotificationChain msgs = null;
      if (year != null)
        msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__YEAR, null, msgs);
      if (newYear != null)
        msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__YEAR, null, msgs);
      msgs = basicSetYear(newYear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__YEAR, newYear, newYear));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VolumeField getVolume()
  {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVolume(VolumeField newVolume, NotificationChain msgs)
  {
    VolumeField oldVolume = volume;
    volume = newVolume;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__VOLUME, oldVolume, newVolume);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(VolumeField newVolume)
  {
    if (newVolume != volume)
    {
      NotificationChain msgs = null;
      if (volume != null)
        msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__VOLUME, null, msgs);
      if (newVolume != null)
        msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__VOLUME, null, msgs);
      msgs = basicSetVolume(newVolume, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__VOLUME, newVolume, newVolume));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberField getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(NumberField newNumber, NotificationChain msgs)
  {
    NumberField oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(NumberField newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PagesField getPages()
  {
    return pages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPages(PagesField newPages, NotificationChain msgs)
  {
    PagesField oldPages = pages;
    pages = newPages;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__PAGES, oldPages, newPages);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPages(PagesField newPages)
  {
    if (newPages != pages)
    {
      NotificationChain msgs = null;
      if (pages != null)
        msgs = ((InternalEObject)pages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__PAGES, null, msgs);
      if (newPages != null)
        msgs = ((InternalEObject)newPages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__PAGES, null, msgs);
      msgs = basicSetPages(newPages, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__PAGES, newPages, newPages));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MonthField getMonth()
  {
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMonth(MonthField newMonth, NotificationChain msgs)
  {
    MonthField oldMonth = month;
    month = newMonth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__MONTH, oldMonth, newMonth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonth(MonthField newMonth)
  {
    if (newMonth != month)
    {
      NotificationChain msgs = null;
      if (month != null)
        msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__MONTH, null, msgs);
      if (newMonth != null)
        msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__MONTH, null, msgs);
      msgs = basicSetMonth(newMonth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__MONTH, newMonth, newMonth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NoteField getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNote(NoteField newNote, NotificationChain msgs)
  {
    NoteField oldNote = note;
    note = newNote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__NOTE, oldNote, newNote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(NoteField newNote)
  {
    if (newNote != note)
    {
      NotificationChain msgs = null;
      if (note != null)
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.ARTICLE__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.ARTICLE__NOTE, newNote, newNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__KEY:
        return basicSetKey(null, msgs);
      case BibTeXPackage.ARTICLE__AUTHOR:
        return basicSetAuthor(null, msgs);
      case BibTeXPackage.ARTICLE__TITLE:
        return basicSetTitle(null, msgs);
      case BibTeXPackage.ARTICLE__JOURNAL:
        return basicSetJournal(null, msgs);
      case BibTeXPackage.ARTICLE__YEAR:
        return basicSetYear(null, msgs);
      case BibTeXPackage.ARTICLE__VOLUME:
        return basicSetVolume(null, msgs);
      case BibTeXPackage.ARTICLE__NUMBER:
        return basicSetNumber(null, msgs);
      case BibTeXPackage.ARTICLE__PAGES:
        return basicSetPages(null, msgs);
      case BibTeXPackage.ARTICLE__MONTH:
        return basicSetMonth(null, msgs);
      case BibTeXPackage.ARTICLE__NOTE:
        return basicSetNote(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__KEY:
        return getKey();
      case BibTeXPackage.ARTICLE__AUTHOR:
        return getAuthor();
      case BibTeXPackage.ARTICLE__TITLE:
        return getTitle();
      case BibTeXPackage.ARTICLE__JOURNAL:
        return getJournal();
      case BibTeXPackage.ARTICLE__YEAR:
        return getYear();
      case BibTeXPackage.ARTICLE__VOLUME:
        return getVolume();
      case BibTeXPackage.ARTICLE__NUMBER:
        return getNumber();
      case BibTeXPackage.ARTICLE__PAGES:
        return getPages();
      case BibTeXPackage.ARTICLE__MONTH:
        return getMonth();
      case BibTeXPackage.ARTICLE__NOTE:
        return getNote();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__KEY:
        setKey((CiteKey)newValue);
        return;
      case BibTeXPackage.ARTICLE__AUTHOR:
        setAuthor((AuthorField)newValue);
        return;
      case BibTeXPackage.ARTICLE__TITLE:
        setTitle((TitleField)newValue);
        return;
      case BibTeXPackage.ARTICLE__JOURNAL:
        setJournal((JournalField)newValue);
        return;
      case BibTeXPackage.ARTICLE__YEAR:
        setYear((YearField)newValue);
        return;
      case BibTeXPackage.ARTICLE__VOLUME:
        setVolume((VolumeField)newValue);
        return;
      case BibTeXPackage.ARTICLE__NUMBER:
        setNumber((NumberField)newValue);
        return;
      case BibTeXPackage.ARTICLE__PAGES:
        setPages((PagesField)newValue);
        return;
      case BibTeXPackage.ARTICLE__MONTH:
        setMonth((MonthField)newValue);
        return;
      case BibTeXPackage.ARTICLE__NOTE:
        setNote((NoteField)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__KEY:
        setKey((CiteKey)null);
        return;
      case BibTeXPackage.ARTICLE__AUTHOR:
        setAuthor((AuthorField)null);
        return;
      case BibTeXPackage.ARTICLE__TITLE:
        setTitle((TitleField)null);
        return;
      case BibTeXPackage.ARTICLE__JOURNAL:
        setJournal((JournalField)null);
        return;
      case BibTeXPackage.ARTICLE__YEAR:
        setYear((YearField)null);
        return;
      case BibTeXPackage.ARTICLE__VOLUME:
        setVolume((VolumeField)null);
        return;
      case BibTeXPackage.ARTICLE__NUMBER:
        setNumber((NumberField)null);
        return;
      case BibTeXPackage.ARTICLE__PAGES:
        setPages((PagesField)null);
        return;
      case BibTeXPackage.ARTICLE__MONTH:
        setMonth((MonthField)null);
        return;
      case BibTeXPackage.ARTICLE__NOTE:
        setNote((NoteField)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__KEY:
        return key != null;
      case BibTeXPackage.ARTICLE__AUTHOR:
        return author != null;
      case BibTeXPackage.ARTICLE__TITLE:
        return title != null;
      case BibTeXPackage.ARTICLE__JOURNAL:
        return journal != null;
      case BibTeXPackage.ARTICLE__YEAR:
        return year != null;
      case BibTeXPackage.ARTICLE__VOLUME:
        return volume != null;
      case BibTeXPackage.ARTICLE__NUMBER:
        return number != null;
      case BibTeXPackage.ARTICLE__PAGES:
        return pages != null;
      case BibTeXPackage.ARTICLE__MONTH:
        return month != null;
      case BibTeXPackage.ARTICLE__NOTE:
        return note != null;
    }
    return super.eIsSet(featureID);
  }

} //ArticleImpl
