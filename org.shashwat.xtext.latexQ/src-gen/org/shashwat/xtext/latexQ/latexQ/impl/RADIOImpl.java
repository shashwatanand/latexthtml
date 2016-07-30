/**
 */
package org.shashwat.xtext.latexQ.latexQ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shashwat.xtext.latexQ.latexQ.LatexQPackage;
import org.shashwat.xtext.latexQ.latexQ.RADIO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RADIO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.impl.RADIOImpl#isRadio <em>Radio</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RADIOImpl extends TypeImpl implements RADIO
{
  /**
   * The default value of the '{@link #isRadio() <em>Radio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRadio()
   * @generated
   * @ordered
   */
  protected static final boolean RADIO_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isRadio() <em>Radio</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isRadio()
   * @generated
   * @ordered
   */
  protected boolean radio = RADIO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RADIOImpl()
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
    return LatexQPackage.Literals.RADIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isRadio()
  {
    return radio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadio(boolean newRadio)
  {
    boolean oldRadio = radio;
    radio = newRadio;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LatexQPackage.RADIO__RADIO, oldRadio, radio));
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
      case LatexQPackage.RADIO__RADIO:
        return isRadio();
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
      case LatexQPackage.RADIO__RADIO:
        setRadio((Boolean)newValue);
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
      case LatexQPackage.RADIO__RADIO:
        setRadio(RADIO_EDEFAULT);
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
      case LatexQPackage.RADIO__RADIO:
        return radio != RADIO_EDEFAULT;
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
    result.append(" (radio: ");
    result.append(radio);
    result.append(')');
    return result.toString();
  }

} //RADIOImpl
