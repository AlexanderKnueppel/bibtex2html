/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.Article;
import de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.JournalField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NumberField;
import de.tubs.bibtextohtml.bibtex.bibTeX.PagesField;
import de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField;

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
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getJournal <em>Journal</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.ArticleImpl#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArticleImpl extends BibtexEntryTypesImpl implements Article
{
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
   * The cached value of the '{@link #getJournal() <em>Journal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJournal()
   * @generated
   * @ordered
   */
  protected JournalField journal;

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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BibTeXPackage.ARTICLE__AUTHOR:
        return basicSetAuthor(null, msgs);
      case BibTeXPackage.ARTICLE__JOURNAL:
        return basicSetJournal(null, msgs);
      case BibTeXPackage.ARTICLE__VOLUME:
        return basicSetVolume(null, msgs);
      case BibTeXPackage.ARTICLE__NUMBER:
        return basicSetNumber(null, msgs);
      case BibTeXPackage.ARTICLE__PAGES:
        return basicSetPages(null, msgs);
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
      case BibTeXPackage.ARTICLE__AUTHOR:
        return getAuthor();
      case BibTeXPackage.ARTICLE__JOURNAL:
        return getJournal();
      case BibTeXPackage.ARTICLE__VOLUME:
        return getVolume();
      case BibTeXPackage.ARTICLE__NUMBER:
        return getNumber();
      case BibTeXPackage.ARTICLE__PAGES:
        return getPages();
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
      case BibTeXPackage.ARTICLE__AUTHOR:
        setAuthor((AuthorField)newValue);
        return;
      case BibTeXPackage.ARTICLE__JOURNAL:
        setJournal((JournalField)newValue);
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
      case BibTeXPackage.ARTICLE__AUTHOR:
        setAuthor((AuthorField)null);
        return;
      case BibTeXPackage.ARTICLE__JOURNAL:
        setJournal((JournalField)null);
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
      case BibTeXPackage.ARTICLE__AUTHOR:
        return author != null;
      case BibTeXPackage.ARTICLE__JOURNAL:
        return journal != null;
      case BibTeXPackage.ARTICLE__VOLUME:
        return volume != null;
      case BibTeXPackage.ARTICLE__NUMBER:
        return number != null;
      case BibTeXPackage.ARTICLE__PAGES:
        return pages != null;
    }
    return super.eIsSet(featureID);
  }

} //ArticleImpl
