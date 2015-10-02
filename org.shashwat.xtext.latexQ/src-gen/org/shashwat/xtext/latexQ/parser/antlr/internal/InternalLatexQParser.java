package org.shashwat.xtext.latexQ.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.latexQ.services.LatexQGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLatexQParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'papername'", "'Question'", "'{'", "'}'", "'Answer'", "'check'", "'radio'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalLatexQParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLatexQParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLatexQParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g"; }



     	private LatexQGrammarAccess grammarAccess;
     	
        public InternalLatexQParser(TokenStream input, LatexQGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "QuestionPaper";	
       	}
       	
       	@Override
       	protected LatexQGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleQuestionPaper"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:67:1: entryRuleQuestionPaper returns [EObject current=null] : iv_ruleQuestionPaper= ruleQuestionPaper EOF ;
    public final EObject entryRuleQuestionPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPaper = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:68:2: (iv_ruleQuestionPaper= ruleQuestionPaper EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:69:2: iv_ruleQuestionPaper= ruleQuestionPaper EOF
            {
             newCompositeNode(grammarAccess.getQuestionPaperRule()); 
            pushFollow(FOLLOW_ruleQuestionPaper_in_entryRuleQuestionPaper75);
            iv_ruleQuestionPaper=ruleQuestionPaper();

            state._fsp--;

             current =iv_ruleQuestionPaper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionPaper85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestionPaper"


    // $ANTLR start "ruleQuestionPaper"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:76:1: ruleQuestionPaper returns [EObject current=null] : (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) ;
    public final EObject ruleQuestionPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_papername_1_0=null;
        EObject lv_questions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:79:28: ( (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:80:1: (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:80:1: (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:80:3: otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleQuestionPaper122); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPaperAccess().getPapernameKeyword_0());
                
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:84:1: ( (lv_papername_1_0= RULE_ID ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:85:1: (lv_papername_1_0= RULE_ID )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:85:1: (lv_papername_1_0= RULE_ID )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:86:3: lv_papername_1_0= RULE_ID
            {
            lv_papername_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestionPaper139); 

            			newLeafNode(lv_papername_1_0, grammarAccess.getQuestionPaperAccess().getPapernameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionPaperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"papername",
                    		lv_papername_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:102:2: ( (lv_questions_2_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:103:1: (lv_questions_2_0= ruleQuestion )
            	    {
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:103:1: (lv_questions_2_0= ruleQuestion )
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:104:3: lv_questions_2_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPaperAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_ruleQuestionPaper165);
            	    lv_questions_2_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionPaperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_2_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestionPaper"


    // $ANTLR start "entryRuleQuestion"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:128:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:129:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:130:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion202);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:137:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleAnswer ) )+ otherlv_4= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_answers_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:140:28: ( (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleAnswer ) )+ otherlv_4= '}' ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:141:1: (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleAnswer ) )+ otherlv_4= '}' )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:141:1: (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleAnswer ) )+ otherlv_4= '}' )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:141:3: otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_answers_3_0= ruleAnswer ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleQuestion249); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:145:1: ( (lv_question_1_0= RULE_STRING ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:146:1: (lv_question_1_0= RULE_STRING )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:146:1: (lv_question_1_0= RULE_STRING )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:147:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion266); 

            			newLeafNode(lv_question_1_0, grammarAccess.getQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleQuestion283); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:167:1: ( (lv_answers_3_0= ruleAnswer ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:168:1: (lv_answers_3_0= ruleAnswer )
            	    {
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:168:1: (lv_answers_3_0= ruleAnswer )
            	    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:169:3: lv_answers_3_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnswer_in_ruleQuestion304);
            	    lv_answers_3_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_3_0, 
            	            		"Answer");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleQuestion317); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnswer"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:197:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:198:2: (iv_ruleAnswer= ruleAnswer EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:199:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer353);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:206:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_answer_1_0=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:209:28: ( (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:210:1: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:210:1: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleType ) ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:210:3: otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ( (lv_type_2_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAnswer400); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:214:1: ( (lv_answer_1_0= RULE_STRING ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:215:1: (lv_answer_1_0= RULE_STRING )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:215:1: (lv_answer_1_0= RULE_STRING )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:216:3: lv_answer_1_0= RULE_STRING
            {
            lv_answer_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnswer417); 

            			newLeafNode(lv_answer_1_0, grammarAccess.getAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:232:2: ( (lv_type_2_0= ruleType ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:233:1: (lv_type_2_0= ruleType )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:233:1: (lv_type_2_0= ruleType )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:234:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAnswerAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAnswer443);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnswerRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleType"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:258:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:259:2: (iv_ruleType= ruleType EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:260:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType479);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType489); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:267:1: ruleType returns [EObject current=null] : (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_CHECK_0 = null;

        EObject this_RADIO_1 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:270:28: ( (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:271:1: (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:271:1: (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:272:5: this_CHECK_0= ruleCHECK
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCHECK_in_ruleType536);
                    this_CHECK_0=ruleCHECK();

                    state._fsp--;

                     
                            current = this_CHECK_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:282:5: this_RADIO_1= ruleRADIO
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRADIOParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRADIO_in_ruleType563);
                    this_RADIO_1=ruleRADIO();

                    state._fsp--;

                     
                            current = this_RADIO_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCHECK"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:298:1: entryRuleCHECK returns [EObject current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final EObject entryRuleCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:299:2: (iv_ruleCHECK= ruleCHECK EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:300:2: iv_ruleCHECK= ruleCHECK EOF
            {
             newCompositeNode(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_ruleCHECK_in_entryRuleCHECK598);
            iv_ruleCHECK=ruleCHECK();

            state._fsp--;

             current =iv_ruleCHECK; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHECK608); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCHECK"


    // $ANTLR start "ruleCHECK"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:307:1: ruleCHECK returns [EObject current=null] : ( (lv_check_0_0= 'check' ) ) ;
    public final EObject ruleCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_check_0_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:310:28: ( ( (lv_check_0_0= 'check' ) ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:311:1: ( (lv_check_0_0= 'check' ) )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:311:1: ( (lv_check_0_0= 'check' ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:312:1: (lv_check_0_0= 'check' )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:312:1: (lv_check_0_0= 'check' )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:313:3: lv_check_0_0= 'check'
            {
            lv_check_0_0=(Token)match(input,16,FOLLOW_16_in_ruleCHECK650); 

                    newLeafNode(lv_check_0_0, grammarAccess.getCHECKAccess().getCheckCheckKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCHECKRule());
            	        }
                   		setWithLastConsumed(current, "check", true, "check");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCHECK"


    // $ANTLR start "entryRuleRADIO"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:334:1: entryRuleRADIO returns [EObject current=null] : iv_ruleRADIO= ruleRADIO EOF ;
    public final EObject entryRuleRADIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRADIO = null;


        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:335:2: (iv_ruleRADIO= ruleRADIO EOF )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:336:2: iv_ruleRADIO= ruleRADIO EOF
            {
             newCompositeNode(grammarAccess.getRADIORule()); 
            pushFollow(FOLLOW_ruleRADIO_in_entryRuleRADIO698);
            iv_ruleRADIO=ruleRADIO();

            state._fsp--;

             current =iv_ruleRADIO; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRADIO708); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRADIO"


    // $ANTLR start "ruleRADIO"
    // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:343:1: ruleRADIO returns [EObject current=null] : ( (lv_radio_0_0= 'radio' ) ) ;
    public final EObject ruleRADIO() throws RecognitionException {
        EObject current = null;

        Token lv_radio_0_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:346:28: ( ( (lv_radio_0_0= 'radio' ) ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:347:1: ( (lv_radio_0_0= 'radio' ) )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:347:1: ( (lv_radio_0_0= 'radio' ) )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:348:1: (lv_radio_0_0= 'radio' )
            {
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:348:1: (lv_radio_0_0= 'radio' )
            // ../org.shashwat.xtext.latexQ/src-gen/org/shashwat/xtext/latexQ/parser/antlr/internal/InternalLatexQ.g:349:3: lv_radio_0_0= 'radio'
            {
            lv_radio_0_0=(Token)match(input,17,FOLLOW_17_in_ruleRADIO750); 

                    newLeafNode(lv_radio_0_0, grammarAccess.getRADIOAccess().getRadioRadioKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRADIORule());
            	        }
                   		setWithLastConsumed(current, "radio", true, "radio");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRADIO"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleQuestionPaper_in_entryRuleQuestionPaper75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPaper85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleQuestionPaper122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestionPaper139 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQuestion_in_ruleQuestionPaper165 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleQuestion249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion266 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleQuestion283 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleAnswer_in_ruleQuestion304 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleQuestion317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAnswer400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnswer417 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAnswer443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHECK_in_ruleType536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRADIO_in_ruleType563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHECK_in_entryRuleCHECK598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHECK608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCHECK650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRADIO_in_entryRuleRADIO698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRADIO708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRADIO750 = new BitSet(new long[]{0x0000000000000002L});

}