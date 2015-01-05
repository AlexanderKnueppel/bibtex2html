/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.JournalField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Journal Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.JournalFieldImpl#getJournal <em>Journal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JournalFieldImpl extends MinimalEObjectImpl.Container implements JournalField
{
  /**
   * The default value of the '{@link #getJournal() <em>Journal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJournal()
   * @generated
   * @ordered
   */
  protected static final String JOURNAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJournal() <em>Journal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJournal()
   * @generated
   * @ordered
   */
  protected String journal = JOURNAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JournalFieldImpl()
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
    return BibTeXPackage.Literals.JOURNAL_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJournal()
  {
    return journal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJournal(String newJournal)
  {
    String oldJournal = journal;
    journal = newJournal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.JOURNAL_FIELD__JOURNAL, oldJournal, journal));
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
      case BibTeXPackage.JOURNAL_FIELD__JOURNAL:
        return getJournal();
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
      case BibTeXPackage.JOURNAL_FIELD__JOURNAL:
        setJournal((String)newValue);
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
      case BibTeXPackage.JOURNAL_FIELD__JOURNAL:
        setJournal(JOURNAL_EDEFAULT);
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
      case BibTeXPackage.JOURNAL_FIELD__JOURNAL:
        return JOURNAL_EDEFAULT == null ? journal != null : !JOURNAL_EDEFAULT.equals(journal);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (journal: ");
    result.append(journal);
    result.append(')');
    return result.toString();
  }

} //JournalFieldImpl
