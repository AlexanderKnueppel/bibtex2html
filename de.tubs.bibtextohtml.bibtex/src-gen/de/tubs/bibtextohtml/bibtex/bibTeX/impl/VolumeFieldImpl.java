/**
 */
package de.tubs.bibtextohtml.bibtex.bibTeX.impl;

import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.tubs.bibtextohtml.bibtex.bibTeX.impl.VolumeFieldImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VolumeFieldImpl extends MinimalEObjectImpl.Container implements VolumeField
{
  /**
   * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected static final String VOLUME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolume()
   * @generated
   * @ordered
   */
  protected String volume = VOLUME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VolumeFieldImpl()
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
    return BibTeXPackage.Literals.VOLUME_FIELD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVolume()
  {
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolume(String newVolume)
  {
    String oldVolume = volume;
    volume = newVolume;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BibTeXPackage.VOLUME_FIELD__VOLUME, oldVolume, volume));
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
      case BibTeXPackage.VOLUME_FIELD__VOLUME:
        return getVolume();
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
      case BibTeXPackage.VOLUME_FIELD__VOLUME:
        setVolume((String)newValue);
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
      case BibTeXPackage.VOLUME_FIELD__VOLUME:
        setVolume(VOLUME_EDEFAULT);
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
      case BibTeXPackage.VOLUME_FIELD__VOLUME:
        return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
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
    result.append(" (volume: ");
    result.append(volume);
    result.append(')');
    return result.toString();
  }

} //VolumeFieldImpl
