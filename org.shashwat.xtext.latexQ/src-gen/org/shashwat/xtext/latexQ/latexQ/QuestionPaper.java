/**
 */
package org.shashwat.xtext.latexQ.latexQ;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Paper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getPapername <em>Papername</em>}</li>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestionPaper()
 * @model
 * @generated
 */
public interface QuestionPaper extends EObject
{
  /**
   * Returns the value of the '<em><b>Papername</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Papername</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Papername</em>' attribute.
   * @see #setPapername(String)
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestionPaper_Papername()
   * @model
   * @generated
   */
  String getPapername();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getPapername <em>Papername</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Papername</em>' attribute.
   * @see #getPapername()
   * @generated
   */
  void setPapername(String value);

  /**
   * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
   * The list contents are of type {@link org.shashwat.xtext.latexQ.latexQ.Question}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Questions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Questions</em>' containment reference list.
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getQuestionPaper_Questions()
   * @model containment="true"
   * @generated
   */
  EList<Question> getQuestions();

} // QuestionPaper
