/**
 */
package org.shashwat.xtext.latexQ.latexQ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.Question#getType <em>Type</em>}</li>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.Question#getAnswers <em>Answers</em>}</li>
 * </ul>
 *
 * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(String)
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestion_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.latexQ.latexQ.Question#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestion_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.latexQ.latexQ.Question#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
   * The list contents are of type {@link org.shashwat.xtext.latexQ.latexQ.Answer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answers</em>' containment reference list.
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestion_Answers()
   * @model containment="true"
   * @generated
   */
  EList<Answer> getAnswers();

} // Question
