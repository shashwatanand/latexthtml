package org.shashwat.xtext.latexQ.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.shashwat.xtext.latexQ.services.LatexQGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLatexQParser extends AbstractInternalContentAssistParser {
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
     	
        public void setGrammarAccess(LatexQGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleQuestionPaper"
    // InternalLatexQ.g:60:1: entryRuleQuestionPaper : ruleQuestionPaper EOF ;
    public final void entryRuleQuestionPaper() throws RecognitionException {
        try {
            // InternalLatexQ.g:61:1: ( ruleQuestionPaper EOF )
            // InternalLatexQ.g:62:1: ruleQuestionPaper EOF
            {
             before(grammarAccess.getQuestionPaperRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestionPaper();

            state._fsp--;

             after(grammarAccess.getQuestionPaperRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestionPaper"


    // $ANTLR start "ruleQuestionPaper"
    // InternalLatexQ.g:69:1: ruleQuestionPaper : ( ( rule__QuestionPaper__Group__0 ) ) ;
    public final void ruleQuestionPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:73:2: ( ( ( rule__QuestionPaper__Group__0 ) ) )
            // InternalLatexQ.g:74:1: ( ( rule__QuestionPaper__Group__0 ) )
            {
            // InternalLatexQ.g:74:1: ( ( rule__QuestionPaper__Group__0 ) )
            // InternalLatexQ.g:75:1: ( rule__QuestionPaper__Group__0 )
            {
             before(grammarAccess.getQuestionPaperAccess().getGroup()); 
            // InternalLatexQ.g:76:1: ( rule__QuestionPaper__Group__0 )
            // InternalLatexQ.g:76:2: rule__QuestionPaper__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuestionPaper__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPaperAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestionPaper"


    // $ANTLR start "entryRuleQuestion"
    // InternalLatexQ.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalLatexQ.g:89:1: ( ruleQuestion EOF )
            // InternalLatexQ.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalLatexQ.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalLatexQ.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // InternalLatexQ.g:102:1: ( ( rule__Question__Group__0 ) )
            // InternalLatexQ.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalLatexQ.g:104:1: ( rule__Question__Group__0 )
            // InternalLatexQ.g:104:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleAnswer"
    // InternalLatexQ.g:116:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // InternalLatexQ.g:117:1: ( ruleAnswer EOF )
            // InternalLatexQ.g:118:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_1);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnswer"


    // $ANTLR start "ruleAnswer"
    // InternalLatexQ.g:125:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:129:2: ( ( ( rule__Answer__Group__0 ) ) )
            // InternalLatexQ.g:130:1: ( ( rule__Answer__Group__0 ) )
            {
            // InternalLatexQ.g:130:1: ( ( rule__Answer__Group__0 ) )
            // InternalLatexQ.g:131:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // InternalLatexQ.g:132:1: ( rule__Answer__Group__0 )
            // InternalLatexQ.g:132:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswer"


    // $ANTLR start "entryRuleType"
    // InternalLatexQ.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalLatexQ.g:145:1: ( ruleType EOF )
            // InternalLatexQ.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalLatexQ.g:153:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:157:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalLatexQ.g:158:1: ( ( rule__Type__Alternatives ) )
            {
            // InternalLatexQ.g:158:1: ( ( rule__Type__Alternatives ) )
            // InternalLatexQ.g:159:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalLatexQ.g:160:1: ( rule__Type__Alternatives )
            // InternalLatexQ.g:160:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleCHECK"
    // InternalLatexQ.g:172:1: entryRuleCHECK : ruleCHECK EOF ;
    public final void entryRuleCHECK() throws RecognitionException {
        try {
            // InternalLatexQ.g:173:1: ( ruleCHECK EOF )
            // InternalLatexQ.g:174:1: ruleCHECK EOF
            {
             before(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_1);
            ruleCHECK();

            state._fsp--;

             after(grammarAccess.getCHECKRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCHECK"


    // $ANTLR start "ruleCHECK"
    // InternalLatexQ.g:181:1: ruleCHECK : ( ( rule__CHECK__CheckAssignment ) ) ;
    public final void ruleCHECK() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:185:2: ( ( ( rule__CHECK__CheckAssignment ) ) )
            // InternalLatexQ.g:186:1: ( ( rule__CHECK__CheckAssignment ) )
            {
            // InternalLatexQ.g:186:1: ( ( rule__CHECK__CheckAssignment ) )
            // InternalLatexQ.g:187:1: ( rule__CHECK__CheckAssignment )
            {
             before(grammarAccess.getCHECKAccess().getCheckAssignment()); 
            // InternalLatexQ.g:188:1: ( rule__CHECK__CheckAssignment )
            // InternalLatexQ.g:188:2: rule__CHECK__CheckAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CHECK__CheckAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCHECKAccess().getCheckAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCHECK"


    // $ANTLR start "entryRuleRADIO"
    // InternalLatexQ.g:200:1: entryRuleRADIO : ruleRADIO EOF ;
    public final void entryRuleRADIO() throws RecognitionException {
        try {
            // InternalLatexQ.g:201:1: ( ruleRADIO EOF )
            // InternalLatexQ.g:202:1: ruleRADIO EOF
            {
             before(grammarAccess.getRADIORule()); 
            pushFollow(FOLLOW_1);
            ruleRADIO();

            state._fsp--;

             after(grammarAccess.getRADIORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRADIO"


    // $ANTLR start "ruleRADIO"
    // InternalLatexQ.g:209:1: ruleRADIO : ( ( rule__RADIO__RadioAssignment ) ) ;
    public final void ruleRADIO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:213:2: ( ( ( rule__RADIO__RadioAssignment ) ) )
            // InternalLatexQ.g:214:1: ( ( rule__RADIO__RadioAssignment ) )
            {
            // InternalLatexQ.g:214:1: ( ( rule__RADIO__RadioAssignment ) )
            // InternalLatexQ.g:215:1: ( rule__RADIO__RadioAssignment )
            {
             before(grammarAccess.getRADIOAccess().getRadioAssignment()); 
            // InternalLatexQ.g:216:1: ( rule__RADIO__RadioAssignment )
            // InternalLatexQ.g:216:2: rule__RADIO__RadioAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RADIO__RadioAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRADIOAccess().getRadioAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRADIO"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalLatexQ.g:228:1: rule__Type__Alternatives : ( ( ruleCHECK ) | ( ruleRADIO ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:232:1: ( ( ruleCHECK ) | ( ruleRADIO ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLatexQ.g:233:1: ( ruleCHECK )
                    {
                    // InternalLatexQ.g:233:1: ( ruleCHECK )
                    // InternalLatexQ.g:234:1: ruleCHECK
                    {
                     before(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCHECK();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLatexQ.g:239:6: ( ruleRADIO )
                    {
                    // InternalLatexQ.g:239:6: ( ruleRADIO )
                    // InternalLatexQ.g:240:1: ruleRADIO
                    {
                     before(grammarAccess.getTypeAccess().getRADIOParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRADIO();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRADIOParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__QuestionPaper__Group__0"
    // InternalLatexQ.g:252:1: rule__QuestionPaper__Group__0 : rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1 ;
    public final void rule__QuestionPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:256:1: ( rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1 )
            // InternalLatexQ.g:257:2: rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QuestionPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionPaper__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__0"


    // $ANTLR start "rule__QuestionPaper__Group__0__Impl"
    // InternalLatexQ.g:264:1: rule__QuestionPaper__Group__0__Impl : ( 'papername' ) ;
    public final void rule__QuestionPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:268:1: ( ( 'papername' ) )
            // InternalLatexQ.g:269:1: ( 'papername' )
            {
            // InternalLatexQ.g:269:1: ( 'papername' )
            // InternalLatexQ.g:270:1: 'papername'
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getQuestionPaperAccess().getPapernameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__0__Impl"


    // $ANTLR start "rule__QuestionPaper__Group__1"
    // InternalLatexQ.g:283:1: rule__QuestionPaper__Group__1 : rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2 ;
    public final void rule__QuestionPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:287:1: ( rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2 )
            // InternalLatexQ.g:288:2: rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QuestionPaper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuestionPaper__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__1"


    // $ANTLR start "rule__QuestionPaper__Group__1__Impl"
    // InternalLatexQ.g:295:1: rule__QuestionPaper__Group__1__Impl : ( ( rule__QuestionPaper__PapernameAssignment_1 ) ) ;
    public final void rule__QuestionPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:299:1: ( ( ( rule__QuestionPaper__PapernameAssignment_1 ) ) )
            // InternalLatexQ.g:300:1: ( ( rule__QuestionPaper__PapernameAssignment_1 ) )
            {
            // InternalLatexQ.g:300:1: ( ( rule__QuestionPaper__PapernameAssignment_1 ) )
            // InternalLatexQ.g:301:1: ( rule__QuestionPaper__PapernameAssignment_1 )
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameAssignment_1()); 
            // InternalLatexQ.g:302:1: ( rule__QuestionPaper__PapernameAssignment_1 )
            // InternalLatexQ.g:302:2: rule__QuestionPaper__PapernameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuestionPaper__PapernameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPaperAccess().getPapernameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__1__Impl"


    // $ANTLR start "rule__QuestionPaper__Group__2"
    // InternalLatexQ.g:312:1: rule__QuestionPaper__Group__2 : rule__QuestionPaper__Group__2__Impl ;
    public final void rule__QuestionPaper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:316:1: ( rule__QuestionPaper__Group__2__Impl )
            // InternalLatexQ.g:317:2: rule__QuestionPaper__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuestionPaper__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__2"


    // $ANTLR start "rule__QuestionPaper__Group__2__Impl"
    // InternalLatexQ.g:323:1: rule__QuestionPaper__Group__2__Impl : ( ( rule__QuestionPaper__QuestionsAssignment_2 )* ) ;
    public final void rule__QuestionPaper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:327:1: ( ( ( rule__QuestionPaper__QuestionsAssignment_2 )* ) )
            // InternalLatexQ.g:328:1: ( ( rule__QuestionPaper__QuestionsAssignment_2 )* )
            {
            // InternalLatexQ.g:328:1: ( ( rule__QuestionPaper__QuestionsAssignment_2 )* )
            // InternalLatexQ.g:329:1: ( rule__QuestionPaper__QuestionsAssignment_2 )*
            {
             before(grammarAccess.getQuestionPaperAccess().getQuestionsAssignment_2()); 
            // InternalLatexQ.g:330:1: ( rule__QuestionPaper__QuestionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLatexQ.g:330:2: rule__QuestionPaper__QuestionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__QuestionPaper__QuestionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getQuestionPaperAccess().getQuestionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalLatexQ.g:346:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:350:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalLatexQ.g:351:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalLatexQ.g:358:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:362:1: ( ( 'Question' ) )
            // InternalLatexQ.g:363:1: ( 'Question' )
            {
            // InternalLatexQ.g:363:1: ( 'Question' )
            // InternalLatexQ.g:364:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalLatexQ.g:377:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:381:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalLatexQ.g:382:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalLatexQ.g:389:1: rule__Question__Group__1__Impl : ( ( rule__Question__QuestionAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:393:1: ( ( ( rule__Question__QuestionAssignment_1 ) ) )
            // InternalLatexQ.g:394:1: ( ( rule__Question__QuestionAssignment_1 ) )
            {
            // InternalLatexQ.g:394:1: ( ( rule__Question__QuestionAssignment_1 ) )
            // InternalLatexQ.g:395:1: ( rule__Question__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionAssignment_1()); 
            // InternalLatexQ.g:396:1: ( rule__Question__QuestionAssignment_1 )
            // InternalLatexQ.g:396:2: rule__Question__QuestionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__QuestionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getQuestionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalLatexQ.g:406:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:410:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalLatexQ.g:411:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalLatexQ.g:418:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:422:1: ( ( '{' ) )
            // InternalLatexQ.g:423:1: ( '{' )
            {
            // InternalLatexQ.g:423:1: ( '{' )
            // InternalLatexQ.g:424:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalLatexQ.g:437:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:441:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalLatexQ.g:442:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalLatexQ.g:449:1: rule__Question__Group__3__Impl : ( ( rule__Question__TypeAssignment_3 ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:453:1: ( ( ( rule__Question__TypeAssignment_3 ) ) )
            // InternalLatexQ.g:454:1: ( ( rule__Question__TypeAssignment_3 ) )
            {
            // InternalLatexQ.g:454:1: ( ( rule__Question__TypeAssignment_3 ) )
            // InternalLatexQ.g:455:1: ( rule__Question__TypeAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getTypeAssignment_3()); 
            // InternalLatexQ.g:456:1: ( rule__Question__TypeAssignment_3 )
            // InternalLatexQ.g:456:2: rule__Question__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Question__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalLatexQ.g:466:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:470:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalLatexQ.g:471:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalLatexQ.g:478:1: rule__Question__Group__4__Impl : ( ( ( rule__Question__AnswersAssignment_4 ) ) ( ( rule__Question__AnswersAssignment_4 )* ) ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:482:1: ( ( ( ( rule__Question__AnswersAssignment_4 ) ) ( ( rule__Question__AnswersAssignment_4 )* ) ) )
            // InternalLatexQ.g:483:1: ( ( ( rule__Question__AnswersAssignment_4 ) ) ( ( rule__Question__AnswersAssignment_4 )* ) )
            {
            // InternalLatexQ.g:483:1: ( ( ( rule__Question__AnswersAssignment_4 ) ) ( ( rule__Question__AnswersAssignment_4 )* ) )
            // InternalLatexQ.g:484:1: ( ( rule__Question__AnswersAssignment_4 ) ) ( ( rule__Question__AnswersAssignment_4 )* )
            {
            // InternalLatexQ.g:484:1: ( ( rule__Question__AnswersAssignment_4 ) )
            // InternalLatexQ.g:485:1: ( rule__Question__AnswersAssignment_4 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_4()); 
            // InternalLatexQ.g:486:1: ( rule__Question__AnswersAssignment_4 )
            // InternalLatexQ.g:486:2: rule__Question__AnswersAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__Question__AnswersAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_4()); 

            }

            // InternalLatexQ.g:489:1: ( ( rule__Question__AnswersAssignment_4 )* )
            // InternalLatexQ.g:490:1: ( rule__Question__AnswersAssignment_4 )*
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_4()); 
            // InternalLatexQ.g:491:1: ( rule__Question__AnswersAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLatexQ.g:491:2: rule__Question__AnswersAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Question__AnswersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalLatexQ.g:502:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:506:1: ( rule__Question__Group__5__Impl )
            // InternalLatexQ.g:507:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalLatexQ.g:513:1: rule__Question__Group__5__Impl : ( '}' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:517:1: ( ( '}' ) )
            // InternalLatexQ.g:518:1: ( '}' )
            {
            // InternalLatexQ.g:518:1: ( '}' )
            // InternalLatexQ.g:519:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Answer__Group__0"
    // InternalLatexQ.g:544:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:548:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // InternalLatexQ.g:549:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Answer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0"


    // $ANTLR start "rule__Answer__Group__0__Impl"
    // InternalLatexQ.g:556:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:560:1: ( ( 'Answer' ) )
            // InternalLatexQ.g:561:1: ( 'Answer' )
            {
            // InternalLatexQ.g:561:1: ( 'Answer' )
            // InternalLatexQ.g:562:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__0__Impl"


    // $ANTLR start "rule__Answer__Group__1"
    // InternalLatexQ.g:575:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:579:1: ( rule__Answer__Group__1__Impl )
            // InternalLatexQ.g:580:2: rule__Answer__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Answer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1"


    // $ANTLR start "rule__Answer__Group__1__Impl"
    // InternalLatexQ.g:586:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__AnswerAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:590:1: ( ( ( rule__Answer__AnswerAssignment_1 ) ) )
            // InternalLatexQ.g:591:1: ( ( rule__Answer__AnswerAssignment_1 ) )
            {
            // InternalLatexQ.g:591:1: ( ( rule__Answer__AnswerAssignment_1 ) )
            // InternalLatexQ.g:592:1: ( rule__Answer__AnswerAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getAnswerAssignment_1()); 
            // InternalLatexQ.g:593:1: ( rule__Answer__AnswerAssignment_1 )
            // InternalLatexQ.g:593:2: rule__Answer__AnswerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Answer__AnswerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getAnswerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__Group__1__Impl"


    // $ANTLR start "rule__QuestionPaper__PapernameAssignment_1"
    // InternalLatexQ.g:608:1: rule__QuestionPaper__PapernameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QuestionPaper__PapernameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:612:1: ( ( RULE_ID ) )
            // InternalLatexQ.g:613:1: ( RULE_ID )
            {
            // InternalLatexQ.g:613:1: ( RULE_ID )
            // InternalLatexQ.g:614:1: RULE_ID
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQuestionPaperAccess().getPapernameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__PapernameAssignment_1"


    // $ANTLR start "rule__QuestionPaper__QuestionsAssignment_2"
    // InternalLatexQ.g:623:1: rule__QuestionPaper__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__QuestionPaper__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:627:1: ( ( ruleQuestion ) )
            // InternalLatexQ.g:628:1: ( ruleQuestion )
            {
            // InternalLatexQ.g:628:1: ( ruleQuestion )
            // InternalLatexQ.g:629:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPaperAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionPaperAccess().getQuestionsQuestionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPaper__QuestionsAssignment_2"


    // $ANTLR start "rule__Question__QuestionAssignment_1"
    // InternalLatexQ.g:638:1: rule__Question__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:642:1: ( ( RULE_STRING ) )
            // InternalLatexQ.g:643:1: ( RULE_STRING )
            {
            // InternalLatexQ.g:643:1: ( RULE_STRING )
            // InternalLatexQ.g:644:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__QuestionAssignment_1"


    // $ANTLR start "rule__Question__TypeAssignment_3"
    // InternalLatexQ.g:653:1: rule__Question__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Question__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:657:1: ( ( ruleType ) )
            // InternalLatexQ.g:658:1: ( ruleType )
            {
            // InternalLatexQ.g:658:1: ( ruleType )
            // InternalLatexQ.g:659:1: ruleType
            {
             before(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTypeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__TypeAssignment_3"


    // $ANTLR start "rule__Question__AnswersAssignment_4"
    // InternalLatexQ.g:668:1: rule__Question__AnswersAssignment_4 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:672:1: ( ( ruleAnswer ) )
            // InternalLatexQ.g:673:1: ( ruleAnswer )
            {
            // InternalLatexQ.g:673:1: ( ruleAnswer )
            // InternalLatexQ.g:674:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__AnswersAssignment_4"


    // $ANTLR start "rule__Answer__AnswerAssignment_1"
    // InternalLatexQ.g:683:1: rule__Answer__AnswerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Answer__AnswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:687:1: ( ( RULE_STRING ) )
            // InternalLatexQ.g:688:1: ( RULE_STRING )
            {
            // InternalLatexQ.g:688:1: ( RULE_STRING )
            // InternalLatexQ.g:689:1: RULE_STRING
            {
             before(grammarAccess.getAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Answer__AnswerAssignment_1"


    // $ANTLR start "rule__CHECK__CheckAssignment"
    // InternalLatexQ.g:698:1: rule__CHECK__CheckAssignment : ( ( 'check' ) ) ;
    public final void rule__CHECK__CheckAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:702:1: ( ( ( 'check' ) ) )
            // InternalLatexQ.g:703:1: ( ( 'check' ) )
            {
            // InternalLatexQ.g:703:1: ( ( 'check' ) )
            // InternalLatexQ.g:704:1: ( 'check' )
            {
             before(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 
            // InternalLatexQ.g:705:1: ( 'check' )
            // InternalLatexQ.g:706:1: 'check'
            {
             before(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 

            }

             after(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CHECK__CheckAssignment"


    // $ANTLR start "rule__RADIO__RadioAssignment"
    // InternalLatexQ.g:721:1: rule__RADIO__RadioAssignment : ( ( 'radio' ) ) ;
    public final void rule__RADIO__RadioAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLatexQ.g:725:1: ( ( ( 'radio' ) ) )
            // InternalLatexQ.g:726:1: ( ( 'radio' ) )
            {
            // InternalLatexQ.g:726:1: ( ( 'radio' ) )
            // InternalLatexQ.g:727:1: ( 'radio' )
            {
             before(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 
            // InternalLatexQ.g:728:1: ( 'radio' )
            // InternalLatexQ.g:729:1: 'radio'
            {
             before(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 

            }

             after(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RADIO__RadioAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});

}