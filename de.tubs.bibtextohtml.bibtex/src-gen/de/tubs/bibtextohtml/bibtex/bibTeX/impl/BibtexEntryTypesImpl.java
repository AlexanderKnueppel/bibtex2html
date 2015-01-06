/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes;
import de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey;
import de.tubs.bibtextohtml.bibtex.bibTeX.MonthField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NoteField;
import de.tubs.bibtextohtml.bibtex.bibTeX.TitleField;
import de.tubs.bibtextohtml.bibtex.bibTeX.UnknownField;
import de.tubs.bibtextohtml.bibtex.bibTeX.YearField;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibtex Entry Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getYear <em>Year</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getNote <em>Note</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.BibtexEntryTypesImpl#getUnknowns <em>Unknowns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibtexEntryTypesImpl extends MinimalEObjectImpl.Container implements BibtexEntryTypes
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
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected TitleField title;

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
   * The cached value of the '{@link #getUnknowns() <em>Unknowns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnknowns()
   * @generated
   * @ordered
   */
  protected EList<UnknownField> unknowns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BibtexEntryTypesImpl()
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
    return BibTeXPackage.Literals.BIBTEX_ENTRY_TYPES;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY, oldKey, newKey);
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
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY, newKey, newKey));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE, oldTitle, newTitle);
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
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE, newTitle, newTitle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR, oldYear, newYear);
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
        msgs = ((InternalEObject)year).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR, null, msgs);
      if (newYear != null)
        msgs = ((InternalEObject)newYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR, null, msgs);
      msgs = basicSetYear(newYear, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR, newYear, newYear));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH, oldMonth, newMonth);
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
        msgs = ((InternalEObject)month).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH, null, msgs);
      if (newMonth != null)
        msgs = ((InternalEObject)newMonth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH, null, msgs);
      msgs = basicSetMonth(newMonth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH, newMonth, newMonth));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE, oldNote, newNote);
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
        msgs = ((InternalEObject)note).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE, null, msgs);
      if (newNote != null)
        msgs = ((InternalEObject)newNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE, null, msgs);
      msgs = basicSetNote(newNote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE, newNote, newNote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownField> getUnknowns()
  {
    if (unknowns == null)
    {
      unknowns = new EObjectContainmentEList<UnknownField>(UnknownField.class, this, BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS);
    }
    return unknowns;
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
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY:
        return basicSetKey(null, msgs);
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE:
        return basicSetTitle(null, msgs);
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR:
        return basicSetYear(null, msgs);
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH:
        return basicSetMonth(null, msgs);
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE:
        return basicSetNote(null, msgs);
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS:
        return ((InternalEList<?>)getUnknowns()).basicRemove(otherEnd, msgs);
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
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY:
        return getKey();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE:
        return getTitle();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR:
        return getYear();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH:
        return getMonth();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE:
        return getNote();
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS:
        return getUnknowns();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY:
        setKey((CiteKey)newValue);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE:
        setTitle((TitleField)newValue);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR:
        setYear((YearField)newValue);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH:
        setMonth((MonthField)newValue);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE:
        setNote((NoteField)newValue);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS:
        getUnknowns().clear();
        getUnknowns().addAll((Collection<? extends UnknownField>)newValue);
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
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY:
        setKey((CiteKey)null);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE:
        setTitle((TitleField)null);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR:
        setYear((YearField)null);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH:
        setMonth((MonthField)null);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE:
        setNote((NoteField)null);
        return;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS:
        getUnknowns().clear();
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
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__KEY:
        return key != null;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__TITLE:
        return title != null;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__YEAR:
        return year != null;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__MONTH:
        return month != null;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__NOTE:
        return note != null;
      case BibTeXPackage.BIBTEX_ENTRY_TYPES__UNKNOWNS:
        return unknowns != null && !unknowns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BibtexEntryTypesImpl
