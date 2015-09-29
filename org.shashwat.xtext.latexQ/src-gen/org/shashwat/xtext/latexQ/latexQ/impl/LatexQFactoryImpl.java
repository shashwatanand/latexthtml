/**
 */
package org.shashwat.xtext.latexQ.latexQ.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.shashwat.xtext.latexQ.latexQ.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LatexQFactoryImpl extends EFactoryImpl implements LatexQFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LatexQFactory init()
  {
    try
    {
      LatexQFactory theLatexQFactory = (LatexQFactory)EPackage.Registry.INSTANCE.getEFactory(LatexQPackage.eNS_URI);
      if (theLatexQFactory != null)
      {
        return theLatexQFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LatexQFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatexQFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LatexQPackage.QUESTION_PAPER: return createQuestionPaper();
      case LatexQPackage.QUESTION: return createQuestion();
      case LatexQPackage.ANSWER: return createAnswer();
      case LatexQPackage.TYPE: return createType();
      case LatexQPackage.CHECK: return createCHECK();
      case LatexQPackage.RADIO: return createRADIO();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionPaper createQuestionPaper()
  {
    QuestionPaperImpl questionPaper = new QuestionPaperImpl();
    return questionPaper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Answer createAnswer()
  {
    AnswerImpl answer = new AnswerImpl();
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CHECK createCHECK()
  {
    CHECKImpl check = new CHECKImpl();
    return check;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RADIO createRADIO()
  {
    RADIOImpl radio = new RADIOImpl();
    return radio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LatexQPackage getLatexQPackage()
  {
    return (LatexQPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LatexQPackage getPackage()
  {
    return LatexQPackage.eINSTANCE;
  }

} //LatexQFactoryImpl
