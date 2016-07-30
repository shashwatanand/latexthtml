/**
 */
package org.shashwat.xtext.latexQ.latexQ.impl;

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

import org.shashwat.xtext.latexQ.latexQ.LatexQPackage;
import org.shashwat.xtext.latexQ.latexQ.Question;
import org.shashwat.xtext.latexQ.latexQ.QuestionPaper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl#getPapername <em>Papername</em>}</li>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionPaperImpl extends MinimalEObjectImpl.Container implements QuestionPaper
{
  /**
   * The default value of the '{@link #getPapername() <em>Papername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPapername()
   * @generated
   * @ordered
   */
  protected static final String PAPERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPapername() <em>Papername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPapername()
   * @generated
   * @ordered
   */
  protected String papername = PAPERNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuestions()
   * @generated
   * @ordered
   */
  protected EList<Question> questions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuestionPaperImpl()
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
    return LatexQPackage.Literals.QUESTION_PAPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPapername()
  {
    return papername;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPapername(String newPapername)
  {
    String oldPapername = papername;
    papername = newPapername;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LatexQPackage.QUESTION_PAPER__PAPERNAME, oldPapername, papername));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Question> getQuestions()
  {
    if (questions == null)
    {
      questions = new EObjectContainmentEList<Question>(Question.class, this, LatexQPackage.QUESTION_PAPER__QUESTIONS);
    }
    return questions;
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
      case LatexQPackage.QUESTION_PAPER__QUESTIONS:
        return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
      case LatexQPackage.QUESTION_PAPER__PAPERNAME:
        return getPapername();
      case LatexQPackage.QUESTION_PAPER__QUESTIONS:
        return getQuestions();
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
      case LatexQPackage.QUESTION_PAPER__PAPERNAME:
        setPapername((String)newValue);
        return;
      case LatexQPackage.QUESTION_PAPER__QUESTIONS:
        getQuestions().clear();
        getQuestions().addAll((Collection<? extends Question>)newValue);
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
      case LatexQPackage.QUESTION_PAPER__PAPERNAME:
        setPapername(PAPERNAME_EDEFAULT);
        return;
      case LatexQPackage.QUESTION_PAPER__QUESTIONS:
        getQuestions().clear();
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
      case LatexQPackage.QUESTION_PAPER__PAPERNAME:
        return PAPERNAME_EDEFAULT == null ? papername != null : !PAPERNAME_EDEFAULT.equals(papername);
      case LatexQPackage.QUESTION_PAPER__QUESTIONS:
        return questions != null && !questions.isEmpty();
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
    result.append(" (papername: ");
    result.append(papername);
    result.append(')');
    return result.toString();
  }

} //QuestionPaperImpl
