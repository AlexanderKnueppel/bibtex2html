/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.Fullname;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fullname</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.FullnameImpl#getFirstname <em>Firstname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FullnameImpl extends MinimalEObjectImpl.Container implements Fullname
{
  /**
   * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected static final String LASTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastname()
   * @generated
   * @ordered
   */
  protected String lastname = LASTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected static final String FIRSTNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstname()
   * @generated
   * @ordered
   */
  protected String firstname = FIRSTNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FullnameImpl()
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
    return BibTeXPackage.Literals.FULLNAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastname()
  {
    return lastname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastname(String newLastname)
  {
    String oldLastname = lastname;
    lastname = newLastname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.FULLNAME__LASTNAME, oldLastname, lastname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstname()
  {
    return firstname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstname(String newFirstname)
  {
    String oldFirstname = firstname;
    firstname = newFirstname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.FULLNAME__FIRSTNAME, oldFirstname, firstname));
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
      case BibTeXPackage.FULLNAME__LASTNAME:
        return getLastname();
      case BibTeXPackage.FULLNAME__FIRSTNAME:
        return getFirstname();
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
      case BibTeXPackage.FULLNAME__LASTNAME:
        setLastname((String)newValue);
        return;
      case BibTeXPackage.FULLNAME__FIRSTNAME:
        setFirstname((String)newValue);
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
      case BibTeXPackage.FULLNAME__LASTNAME:
        setLastname(LASTNAME_EDEFAULT);
        return;
      case BibTeXPackage.FULLNAME__FIRSTNAME:
        setFirstname(FIRSTNAME_EDEFAULT);
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
      case BibTeXPackage.FULLNAME__LASTNAME:
        return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
      case BibTeXPackage.FULLNAME__FIRSTNAME:
        return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
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
    result.append(" (lastname: ");
    result.append(lastname);
    result.append(", firstname: ");
    result.append(firstname);
    result.append(')');
    return result.toString();
  }

} //FullnameImpl
