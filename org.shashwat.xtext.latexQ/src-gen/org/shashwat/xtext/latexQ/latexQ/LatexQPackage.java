/**
 */
package org.shashwat.xtext.latexQ.latexQ;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.shashwat.xtext.latexQ.latexQ.LatexQFactory
 * @model kind="package"
 * @generated
 */
public interface LatexQPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "latexQ";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.shashwat.org/xtext/latexQ/LatexQ";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "latexQ";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LatexQPackage eINSTANCE = org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl.init();

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl <em>Question Paper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getQuestionPaper()
   * @generated
   */
  int QUESTION_PAPER = 0;

  /**
   * The feature id for the '<em><b>Papername</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_PAPER__PAPERNAME = 0;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_PAPER__QUESTIONS = 1;

  /**
   * The number of structural features of the '<em>Question Paper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_PAPER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.QuestionImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 1;

  /**
   * The feature id for the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__QUESTION = 0;

  /**
   * The feature id for the '<em><b>Answers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__ANSWERS = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.AnswerImpl <em>Answer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.AnswerImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getAnswer()
   * @generated
   */
  int ANSWER = 2;

  /**
   * The feature id for the '<em><b>Answer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__ANSWER = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Answer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANSWER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.TypeImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.CHECKImpl <em>CHECK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.CHECKImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getCHECK()
   * @generated
   */
  int CHECK = 4;

  /**
   * The feature id for the '<em><b>Check</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK__CHECK = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CHECK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHECK_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.RADIOImpl <em>RADIO</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.shashwat.xtext.latexQ.latexQ.impl.RADIOImpl
   * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getRADIO()
   * @generated
   */
  int RADIO = 5;

  /**
   * The feature id for the '<em><b>Radio</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO__RADIO = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>RADIO</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RADIO_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper <em>Question Paper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question Paper</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.QuestionPaper
   * @generated
   */
  EClass getQuestionPaper();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getPapername <em>Papername</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Papername</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getPapername()
   * @see #getQuestionPaper()
   * @generated
   */
  EAttribute getQuestionPaper_Papername();

  /**
   * Returns the meta object for the containment reference list '{@link org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.QuestionPaper#getQuestions()
   * @see #getQuestionPaper()
   * @generated
   */
  EReference getQuestionPaper_Questions();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.latexQ.latexQ.Question#getQuestion <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Question</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Question#getQuestion()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Question();

  /**
   * Returns the meta object for the containment reference list '{@link org.shashwat.xtext.latexQ.latexQ.Question#getAnswers <em>Answers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Answers</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Question#getAnswers()
   * @see #getQuestion()
   * @generated
   */
  EReference getQuestion_Answers();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.Answer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Answer</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Answer
   * @generated
   */
  EClass getAnswer();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.latexQ.latexQ.Answer#getAnswer <em>Answer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Answer</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Answer#getAnswer()
   * @see #getAnswer()
   * @generated
   */
  EAttribute getAnswer_Answer();

  /**
   * Returns the meta object for the containment reference '{@link org.shashwat.xtext.latexQ.latexQ.Answer#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Answer#getType()
   * @see #getAnswer()
   * @generated
   */
  EReference getAnswer_Type();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.CHECK <em>CHECK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CHECK</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.CHECK
   * @generated
   */
  EClass getCHECK();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.latexQ.latexQ.CHECK#isCheck <em>Check</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Check</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.CHECK#isCheck()
   * @see #getCHECK()
   * @generated
   */
  EAttribute getCHECK_Check();

  /**
   * Returns the meta object for class '{@link org.shashwat.xtext.latexQ.latexQ.RADIO <em>RADIO</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RADIO</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.RADIO
   * @generated
   */
  EClass getRADIO();

  /**
   * Returns the meta object for the attribute '{@link org.shashwat.xtext.latexQ.latexQ.RADIO#isRadio <em>Radio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radio</em>'.
   * @see org.shashwat.xtext.latexQ.latexQ.RADIO#isRadio()
   * @see #getRADIO()
   * @generated
   */
  EAttribute getRADIO_Radio();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LatexQFactory getLatexQFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl <em>Question Paper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.QuestionPaperImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getQuestionPaper()
     * @generated
     */
    EClass QUESTION_PAPER = eINSTANCE.getQuestionPaper();

    /**
     * The meta object literal for the '<em><b>Papername</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_PAPER__PAPERNAME = eINSTANCE.getQuestionPaper_Papername();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION_PAPER__QUESTIONS = eINSTANCE.getQuestionPaper_Questions();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.QuestionImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

    /**
     * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.AnswerImpl <em>Answer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.AnswerImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getAnswer()
     * @generated
     */
    EClass ANSWER = eINSTANCE.getAnswer();

    /**
     * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANSWER__ANSWER = eINSTANCE.getAnswer_Answer();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANSWER__TYPE = eINSTANCE.getAnswer_Type();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.TypeImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.CHECKImpl <em>CHECK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.CHECKImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getCHECK()
     * @generated
     */
    EClass CHECK = eINSTANCE.getCHECK();

    /**
     * The meta object literal for the '<em><b>Check</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHECK__CHECK = eINSTANCE.getCHECK_Check();

    /**
     * The meta object literal for the '{@link org.shashwat.xtext.latexQ.latexQ.impl.RADIOImpl <em>RADIO</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.shashwat.xtext.latexQ.latexQ.impl.RADIOImpl
     * @see org.shashwat.xtext.latexQ.latexQ.impl.LatexQPackageImpl#getRADIO()
     * @generated
     */
    EClass RADIO = eINSTANCE.getRADIO();

    /**
     * The meta object literal for the '<em><b>Radio</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RADIO__RADIO = eINSTANCE.getRADIO_Radio();

  }

} //LatexQPackage
