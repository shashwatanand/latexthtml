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
    public String getGrammarFileName() { return "InternalLatexQ.g"; }



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
    // InternalLatexQ.g:67:1: entryRuleQuestionPaper returns [EObject current=null] : iv_ruleQuestionPaper= ruleQuestionPaper EOF ;
    public final EObject entryRuleQuestionPaper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestionPaper = null;


        try {
            // InternalLatexQ.g:68:2: (iv_ruleQuestionPaper= ruleQuestionPaper EOF )
            // InternalLatexQ.g:69:2: iv_ruleQuestionPaper= ruleQuestionPaper EOF
            {
             newCompositeNode(grammarAccess.getQuestionPaperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestionPaper=ruleQuestionPaper();

            state._fsp--;

             current =iv_ruleQuestionPaper; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:76:1: ruleQuestionPaper returns [EObject current=null] : (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) ;
    public final EObject ruleQuestionPaper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_papername_1_0=null;
        EObject lv_questions_2_0 = null;


         enterRule(); 
            
        try {
            // InternalLatexQ.g:79:28: ( (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* ) )
            // InternalLatexQ.g:80:1: (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            {
            // InternalLatexQ.g:80:1: (otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )* )
            // InternalLatexQ.g:80:3: otherlv_0= 'papername' ( (lv_papername_1_0= RULE_ID ) ) ( (lv_questions_2_0= ruleQuestion ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionPaperAccess().getPapernameKeyword_0());
                
            // InternalLatexQ.g:84:1: ( (lv_papername_1_0= RULE_ID ) )
            // InternalLatexQ.g:85:1: (lv_papername_1_0= RULE_ID )
            {
            // InternalLatexQ.g:85:1: (lv_papername_1_0= RULE_ID )
            // InternalLatexQ.g:86:3: lv_papername_1_0= RULE_ID
            {
            lv_papername_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			newLeafNode(lv_papername_1_0, grammarAccess.getQuestionPaperAccess().getPapernameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionPaperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"papername",
                    		lv_papername_1_0, 
                    		"org.eclipse.xtext.common.Terminals.ID");
            	    

            }


            }

            // InternalLatexQ.g:102:2: ( (lv_questions_2_0= ruleQuestion ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLatexQ.g:103:1: (lv_questions_2_0= ruleQuestion )
            	    {
            	    // InternalLatexQ.g:103:1: (lv_questions_2_0= ruleQuestion )
            	    // InternalLatexQ.g:104:3: lv_questions_2_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionPaperAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_4);
            	    lv_questions_2_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionPaperRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_2_0, 
            	            		"org.shashwat.xtext.latexQ.LatexQ.Question");
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
    // InternalLatexQ.g:128:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalLatexQ.g:129:2: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalLatexQ.g:130:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:137:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_type_3_0= ruleType ) ) ( (lv_answers_4_0= ruleAnswer ) )+ otherlv_5= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_question_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_type_3_0 = null;

        EObject lv_answers_4_0 = null;


         enterRule(); 
            
        try {
            // InternalLatexQ.g:140:28: ( (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_type_3_0= ruleType ) ) ( (lv_answers_4_0= ruleAnswer ) )+ otherlv_5= '}' ) )
            // InternalLatexQ.g:141:1: (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_type_3_0= ruleType ) ) ( (lv_answers_4_0= ruleAnswer ) )+ otherlv_5= '}' )
            {
            // InternalLatexQ.g:141:1: (otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_type_3_0= ruleType ) ) ( (lv_answers_4_0= ruleAnswer ) )+ otherlv_5= '}' )
            // InternalLatexQ.g:141:3: otherlv_0= 'Question' ( (lv_question_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_type_3_0= ruleType ) ) ( (lv_answers_4_0= ruleAnswer ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // InternalLatexQ.g:145:1: ( (lv_question_1_0= RULE_STRING ) )
            // InternalLatexQ.g:146:1: (lv_question_1_0= RULE_STRING )
            {
            // InternalLatexQ.g:146:1: (lv_question_1_0= RULE_STRING )
            // InternalLatexQ.g:147:3: lv_question_1_0= RULE_STRING
            {
            lv_question_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            			newLeafNode(lv_question_1_0, grammarAccess.getQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"question",
                    		lv_question_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            // InternalLatexQ.g:167:1: ( (lv_type_3_0= ruleType ) )
            // InternalLatexQ.g:168:1: (lv_type_3_0= ruleType )
            {
            // InternalLatexQ.g:168:1: (lv_type_3_0= ruleType )
            // InternalLatexQ.g:169:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"org.shashwat.xtext.latexQ.LatexQ.Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalLatexQ.g:185:2: ( (lv_answers_4_0= ruleAnswer ) )+
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
            	    // InternalLatexQ.g:186:1: (lv_answers_4_0= ruleAnswer )
            	    {
            	    // InternalLatexQ.g:186:1: (lv_answers_4_0= ruleAnswer )
            	    // InternalLatexQ.g:187:3: lv_answers_4_0= ruleAnswer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_9);
            	    lv_answers_4_0=ruleAnswer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"answers",
            	            		lv_answers_4_0, 
            	            		"org.shashwat.xtext.latexQ.LatexQ.Answer");
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5());
                

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
    // InternalLatexQ.g:215:1: entryRuleAnswer returns [EObject current=null] : iv_ruleAnswer= ruleAnswer EOF ;
    public final EObject entryRuleAnswer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnswer = null;


        try {
            // InternalLatexQ.g:216:2: (iv_ruleAnswer= ruleAnswer EOF )
            // InternalLatexQ.g:217:2: iv_ruleAnswer= ruleAnswer EOF
            {
             newCompositeNode(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnswer=ruleAnswer();

            state._fsp--;

             current =iv_ruleAnswer; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:224:1: ruleAnswer returns [EObject current=null] : (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnswer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_answer_1_0=null;

         enterRule(); 
            
        try {
            // InternalLatexQ.g:227:28: ( (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) ) )
            // InternalLatexQ.g:228:1: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) )
            {
            // InternalLatexQ.g:228:1: (otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) ) )
            // InternalLatexQ.g:228:3: otherlv_0= 'Answer' ( (lv_answer_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

                	newLeafNode(otherlv_0, grammarAccess.getAnswerAccess().getAnswerKeyword_0());
                
            // InternalLatexQ.g:232:1: ( (lv_answer_1_0= RULE_STRING ) )
            // InternalLatexQ.g:233:1: (lv_answer_1_0= RULE_STRING )
            {
            // InternalLatexQ.g:233:1: (lv_answer_1_0= RULE_STRING )
            // InternalLatexQ.g:234:3: lv_answer_1_0= RULE_STRING
            {
            lv_answer_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(lv_answer_1_0, grammarAccess.getAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnswerRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"answer",
                    		lv_answer_1_0, 
                    		"org.eclipse.xtext.common.Terminals.STRING");
            	    

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
    // InternalLatexQ.g:258:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalLatexQ.g:259:2: (iv_ruleType= ruleType EOF )
            // InternalLatexQ.g:260:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:267:1: ruleType returns [EObject current=null] : (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_CHECK_0 = null;

        EObject this_RADIO_1 = null;


         enterRule(); 
            
        try {
            // InternalLatexQ.g:270:28: ( (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO ) )
            // InternalLatexQ.g:271:1: (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO )
            {
            // InternalLatexQ.g:271:1: (this_CHECK_0= ruleCHECK | this_RADIO_1= ruleRADIO )
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
                    // InternalLatexQ.g:272:5: this_CHECK_0= ruleCHECK
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_CHECK_0=ruleCHECK();

                    state._fsp--;

                     
                            current = this_CHECK_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalLatexQ.g:282:5: this_RADIO_1= ruleRADIO
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRADIOParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
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
    // InternalLatexQ.g:298:1: entryRuleCHECK returns [EObject current=null] : iv_ruleCHECK= ruleCHECK EOF ;
    public final EObject entryRuleCHECK() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCHECK = null;


        try {
            // InternalLatexQ.g:299:2: (iv_ruleCHECK= ruleCHECK EOF )
            // InternalLatexQ.g:300:2: iv_ruleCHECK= ruleCHECK EOF
            {
             newCompositeNode(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHECK=ruleCHECK();

            state._fsp--;

             current =iv_ruleCHECK; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:307:1: ruleCHECK returns [EObject current=null] : ( (lv_check_0_0= 'check' ) ) ;
    public final EObject ruleCHECK() throws RecognitionException {
        EObject current = null;

        Token lv_check_0_0=null;

         enterRule(); 
            
        try {
            // InternalLatexQ.g:310:28: ( ( (lv_check_0_0= 'check' ) ) )
            // InternalLatexQ.g:311:1: ( (lv_check_0_0= 'check' ) )
            {
            // InternalLatexQ.g:311:1: ( (lv_check_0_0= 'check' ) )
            // InternalLatexQ.g:312:1: (lv_check_0_0= 'check' )
            {
            // InternalLatexQ.g:312:1: (lv_check_0_0= 'check' )
            // InternalLatexQ.g:313:3: lv_check_0_0= 'check'
            {
            lv_check_0_0=(Token)match(input,16,FOLLOW_2); 

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
    // InternalLatexQ.g:334:1: entryRuleRADIO returns [EObject current=null] : iv_ruleRADIO= ruleRADIO EOF ;
    public final EObject entryRuleRADIO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRADIO = null;


        try {
            // InternalLatexQ.g:335:2: (iv_ruleRADIO= ruleRADIO EOF )
            // InternalLatexQ.g:336:2: iv_ruleRADIO= ruleRADIO EOF
            {
             newCompositeNode(grammarAccess.getRADIORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRADIO=ruleRADIO();

            state._fsp--;

             current =iv_ruleRADIO; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalLatexQ.g:343:1: ruleRADIO returns [EObject current=null] : ( (lv_radio_0_0= 'radio' ) ) ;
    public final EObject ruleRADIO() throws RecognitionException {
        EObject current = null;

        Token lv_radio_0_0=null;

         enterRule(); 
            
        try {
            // InternalLatexQ.g:346:28: ( ( (lv_radio_0_0= 'radio' ) ) )
            // InternalLatexQ.g:347:1: ( (lv_radio_0_0= 'radio' ) )
            {
            // InternalLatexQ.g:347:1: ( (lv_radio_0_0= 'radio' ) )
            // InternalLatexQ.g:348:1: (lv_radio_0_0= 'radio' )
            {
            // InternalLatexQ.g:348:1: (lv_radio_0_0= 'radio' )
            // InternalLatexQ.g:349:3: lv_radio_0_0= 'radio'
            {
            lv_radio_0_0=(Token)match(input,17,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000000C000L});

}