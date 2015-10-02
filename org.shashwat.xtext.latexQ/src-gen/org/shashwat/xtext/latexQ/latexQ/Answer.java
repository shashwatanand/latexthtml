/**
 */
package org.shashwat.xtext.latexQ.latexQ;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.Answer#getAnswer <em>Answer</em>}</li>
 *   <li>{@link org.shashwat.xtext.latexQ.latexQ.Answer#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends EObject
{
  /**
   * Returns the value of the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Answer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Answer</em>' attribute.
   * @see #setAnswer(String)
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getAnswer_Answer()
   * @model
   * @generated
   */
  String getAnswer();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.latexQ.latexQ.Answer#getAnswer <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Answer</em>' attribute.
   * @see #getAnswer()
   * @generated
   */
  void setAnswer(String value);

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
   * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage#getAnswer_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.shashwat.xtext.latexQ.latexQ.Answer#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // Answer
