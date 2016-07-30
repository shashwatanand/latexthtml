/**
 */
package org.shashwat.xtext.latexQ.latexQ.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.shashwat.xtext.latexQ.latexQ.CHECK;
import org.shashwat.xtext.latexQ.latexQ.LatexQPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CHECK</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.impl.CHECKImpl#isCheck <em>Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CHECKImpl extends TypeImpl implements CHECK
{
  /**
   * The default value of the '{@link #isCheck() <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCheck()
   * @generated
   * @ordered
   */
  protected static final boolean CHECK_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCheck() <em>Check</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCheck()
   * @generated
   * @ordered
   */
  protected boolean check = CHECK_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CHECKImpl()
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
    return LatexQPackage.Literals.CHECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCheck()
  {
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCheck(boolean newCheck)
  {
    boolean oldCheck = check;
    check = newCheck;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LatexQPackage.CHECK__CHECK, oldCheck, check));
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
      case LatexQPackage.CHECK__CHECK:
        return isCheck();
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
      case LatexQPackage.CHECK__CHECK:
        setCheck((Boolean)newValue);
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
      case LatexQPackage.CHECK__CHECK:
        setCheck(CHECK_EDEFAULT);
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
      case LatexQPackage.CHECK__CHECK:
        return check != CHECK_EDEFAULT;
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
    result.append(" (check: ");
    result.append(check);
    result.append(')');
    return result.toString();
  }

} //CHECKImpl
