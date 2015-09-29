/**
 */
package org.shashwat.xtext.latexQ.latexQ;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.shashwat.xtext.latexQ.latexQ.LatexQPackage
 * @generated
 */
public interface LatexQFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LatexQFactory eINSTANCE = org.shashwat.xtext.latexQ.latexQ.impl.LatexQFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Question Paper</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question Paper</em>'.
   * @generated
   */
  QuestionPaper createQuestionPaper();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Answer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Answer</em>'.
   * @generated
   */
  Answer createAnswer();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>CHECK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CHECK</em>'.
   * @generated
   */
  CHECK createCHECK();

  /**
   * Returns a new object of class '<em>RADIO</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>RADIO</em>'.
   * @generated
   */
  RADIO createRADIO();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LatexQPackage getLatexQPackage();

} //LatexQFactory
