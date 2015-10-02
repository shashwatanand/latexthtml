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
    public String getGrammarFileName() { return "../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g"; }


     
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:60:1: entryRuleQuestionPaper : ruleQuestionPaper EOF ;
    public final void entryRuleQuestionPaper() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:61:1: ( ruleQuestionPaper EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:62:1: ruleQuestionPaper EOF
            {
             before(grammarAccess.getQuestionPaperRule()); 
            pushFollow(FOLLOW_ruleQuestionPaper_in_entryRuleQuestionPaper61);
            ruleQuestionPaper();

            state._fsp--;

             after(grammarAccess.getQuestionPaperRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestionPaper68); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:69:1: ruleQuestionPaper : ( ( rule__QuestionPaper__Group__0 ) ) ;
    public final void ruleQuestionPaper() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:73:2: ( ( ( rule__QuestionPaper__Group__0 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:74:1: ( ( rule__QuestionPaper__Group__0 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:74:1: ( ( rule__QuestionPaper__Group__0 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:75:1: ( rule__QuestionPaper__Group__0 )
            {
             before(grammarAccess.getQuestionPaperAccess().getGroup()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:76:1: ( rule__QuestionPaper__Group__0 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:76:2: rule__QuestionPaper__Group__0
            {
            pushFollow(FOLLOW_rule__QuestionPaper__Group__0_in_ruleQuestionPaper94);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:88:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:89:1: ( ruleQuestion EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:90:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion121);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion128); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:97:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:101:2: ( ( ( rule__Question__Group__0 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:102:1: ( ( rule__Question__Group__0 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:102:1: ( ( rule__Question__Group__0 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:103:1: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:104:1: ( rule__Question__Group__0 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:104:2: rule__Question__Group__0
            {
            pushFollow(FOLLOW_rule__Question__Group__0_in_ruleQuestion154);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:116:1: entryRuleAnswer : ruleAnswer EOF ;
    public final void entryRuleAnswer() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:117:1: ( ruleAnswer EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:118:1: ruleAnswer EOF
            {
             before(grammarAccess.getAnswerRule()); 
            pushFollow(FOLLOW_ruleAnswer_in_entryRuleAnswer181);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnswer188); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:125:1: ruleAnswer : ( ( rule__Answer__Group__0 ) ) ;
    public final void ruleAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:129:2: ( ( ( rule__Answer__Group__0 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:130:1: ( ( rule__Answer__Group__0 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:130:1: ( ( rule__Answer__Group__0 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:131:1: ( rule__Answer__Group__0 )
            {
             before(grammarAccess.getAnswerAccess().getGroup()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:132:1: ( rule__Answer__Group__0 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:132:2: rule__Answer__Group__0
            {
            pushFollow(FOLLOW_rule__Answer__Group__0_in_ruleAnswer214);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:144:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:145:1: ( ruleType EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:146:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType241);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType248); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:153:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:157:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:158:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:158:1: ( ( rule__Type__Alternatives ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:159:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:160:1: ( rule__Type__Alternatives )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:160:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType274);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:172:1: entryRuleCHECK : ruleCHECK EOF ;
    public final void entryRuleCHECK() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:173:1: ( ruleCHECK EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:174:1: ruleCHECK EOF
            {
             before(grammarAccess.getCHECKRule()); 
            pushFollow(FOLLOW_ruleCHECK_in_entryRuleCHECK301);
            ruleCHECK();

            state._fsp--;

             after(grammarAccess.getCHECKRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCHECK308); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:181:1: ruleCHECK : ( ( rule__CHECK__CheckAssignment ) ) ;
    public final void ruleCHECK() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:185:2: ( ( ( rule__CHECK__CheckAssignment ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:186:1: ( ( rule__CHECK__CheckAssignment ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:186:1: ( ( rule__CHECK__CheckAssignment ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:187:1: ( rule__CHECK__CheckAssignment )
            {
             before(grammarAccess.getCHECKAccess().getCheckAssignment()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:188:1: ( rule__CHECK__CheckAssignment )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:188:2: rule__CHECK__CheckAssignment
            {
            pushFollow(FOLLOW_rule__CHECK__CheckAssignment_in_ruleCHECK334);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:200:1: entryRuleRADIO : ruleRADIO EOF ;
    public final void entryRuleRADIO() throws RecognitionException {
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:201:1: ( ruleRADIO EOF )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:202:1: ruleRADIO EOF
            {
             before(grammarAccess.getRADIORule()); 
            pushFollow(FOLLOW_ruleRADIO_in_entryRuleRADIO361);
            ruleRADIO();

            state._fsp--;

             after(grammarAccess.getRADIORule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRADIO368); 

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:209:1: ruleRADIO : ( ( rule__RADIO__RadioAssignment ) ) ;
    public final void ruleRADIO() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:213:2: ( ( ( rule__RADIO__RadioAssignment ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:214:1: ( ( rule__RADIO__RadioAssignment ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:214:1: ( ( rule__RADIO__RadioAssignment ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:215:1: ( rule__RADIO__RadioAssignment )
            {
             before(grammarAccess.getRADIOAccess().getRadioAssignment()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:216:1: ( rule__RADIO__RadioAssignment )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:216:2: rule__RADIO__RadioAssignment
            {
            pushFollow(FOLLOW_rule__RADIO__RadioAssignment_in_ruleRADIO394);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:228:1: rule__Type__Alternatives : ( ( ruleCHECK ) | ( ruleRADIO ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:232:1: ( ( ruleCHECK ) | ( ruleRADIO ) )
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
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:233:1: ( ruleCHECK )
                    {
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:233:1: ( ruleCHECK )
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:234:1: ruleCHECK
                    {
                     before(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCHECK_in_rule__Type__Alternatives430);
                    ruleCHECK();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getCHECKParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:239:6: ( ruleRADIO )
                    {
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:239:6: ( ruleRADIO )
                    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:240:1: ruleRADIO
                    {
                     before(grammarAccess.getTypeAccess().getRADIOParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRADIO_in_rule__Type__Alternatives447);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:252:1: rule__QuestionPaper__Group__0 : rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1 ;
    public final void rule__QuestionPaper__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:256:1: ( rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:257:2: rule__QuestionPaper__Group__0__Impl rule__QuestionPaper__Group__1
            {
            pushFollow(FOLLOW_rule__QuestionPaper__Group__0__Impl_in_rule__QuestionPaper__Group__0477);
            rule__QuestionPaper__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionPaper__Group__1_in_rule__QuestionPaper__Group__0480);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:264:1: rule__QuestionPaper__Group__0__Impl : ( 'papername' ) ;
    public final void rule__QuestionPaper__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:268:1: ( ( 'papername' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:269:1: ( 'papername' )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:269:1: ( 'papername' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:270:1: 'papername'
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__QuestionPaper__Group__0__Impl508); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:283:1: rule__QuestionPaper__Group__1 : rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2 ;
    public final void rule__QuestionPaper__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:287:1: ( rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:288:2: rule__QuestionPaper__Group__1__Impl rule__QuestionPaper__Group__2
            {
            pushFollow(FOLLOW_rule__QuestionPaper__Group__1__Impl_in_rule__QuestionPaper__Group__1539);
            rule__QuestionPaper__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuestionPaper__Group__2_in_rule__QuestionPaper__Group__1542);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:295:1: rule__QuestionPaper__Group__1__Impl : ( ( rule__QuestionPaper__PapernameAssignment_1 ) ) ;
    public final void rule__QuestionPaper__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:299:1: ( ( ( rule__QuestionPaper__PapernameAssignment_1 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:300:1: ( ( rule__QuestionPaper__PapernameAssignment_1 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:300:1: ( ( rule__QuestionPaper__PapernameAssignment_1 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:301:1: ( rule__QuestionPaper__PapernameAssignment_1 )
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameAssignment_1()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:302:1: ( rule__QuestionPaper__PapernameAssignment_1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:302:2: rule__QuestionPaper__PapernameAssignment_1
            {
            pushFollow(FOLLOW_rule__QuestionPaper__PapernameAssignment_1_in_rule__QuestionPaper__Group__1__Impl569);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:312:1: rule__QuestionPaper__Group__2 : rule__QuestionPaper__Group__2__Impl ;
    public final void rule__QuestionPaper__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:316:1: ( rule__QuestionPaper__Group__2__Impl )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:317:2: rule__QuestionPaper__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QuestionPaper__Group__2__Impl_in_rule__QuestionPaper__Group__2599);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:323:1: rule__QuestionPaper__Group__2__Impl : ( ( rule__QuestionPaper__QuestionsAssignment_2 )* ) ;
    public final void rule__QuestionPaper__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:327:1: ( ( ( rule__QuestionPaper__QuestionsAssignment_2 )* ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:328:1: ( ( rule__QuestionPaper__QuestionsAssignment_2 )* )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:328:1: ( ( rule__QuestionPaper__QuestionsAssignment_2 )* )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:329:1: ( rule__QuestionPaper__QuestionsAssignment_2 )*
            {
             before(grammarAccess.getQuestionPaperAccess().getQuestionsAssignment_2()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:330:1: ( rule__QuestionPaper__QuestionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:330:2: rule__QuestionPaper__QuestionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__QuestionPaper__QuestionsAssignment_2_in_rule__QuestionPaper__Group__2__Impl626);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:346:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:350:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:351:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0663);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0666);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:358:1: rule__Question__Group__0__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:362:1: ( ( 'Question' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:363:1: ( 'Question' )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:363:1: ( 'Question' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:364:1: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Question__Group__0__Impl694); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:377:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:381:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:382:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1725);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1728);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:389:1: rule__Question__Group__1__Impl : ( ( rule__Question__QuestionAssignment_1 ) ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:393:1: ( ( ( rule__Question__QuestionAssignment_1 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:394:1: ( ( rule__Question__QuestionAssignment_1 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:394:1: ( ( rule__Question__QuestionAssignment_1 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:395:1: ( rule__Question__QuestionAssignment_1 )
            {
             before(grammarAccess.getQuestionAccess().getQuestionAssignment_1()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:396:1: ( rule__Question__QuestionAssignment_1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:396:2: rule__Question__QuestionAssignment_1
            {
            pushFollow(FOLLOW_rule__Question__QuestionAssignment_1_in_rule__Question__Group__1__Impl755);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:406:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:410:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:411:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2785);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2788);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:418:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:422:1: ( ( '{' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:423:1: ( '{' )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:423:1: ( '{' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:424:1: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Question__Group__2__Impl816); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:437:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:441:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:442:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3847);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3850);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:449:1: rule__Question__Group__3__Impl : ( ( ( rule__Question__AnswersAssignment_3 ) ) ( ( rule__Question__AnswersAssignment_3 )* ) ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:453:1: ( ( ( ( rule__Question__AnswersAssignment_3 ) ) ( ( rule__Question__AnswersAssignment_3 )* ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:454:1: ( ( ( rule__Question__AnswersAssignment_3 ) ) ( ( rule__Question__AnswersAssignment_3 )* ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:454:1: ( ( ( rule__Question__AnswersAssignment_3 ) ) ( ( rule__Question__AnswersAssignment_3 )* ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:455:1: ( ( rule__Question__AnswersAssignment_3 ) ) ( ( rule__Question__AnswersAssignment_3 )* )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:455:1: ( ( rule__Question__AnswersAssignment_3 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:456:1: ( rule__Question__AnswersAssignment_3 )
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_3()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:457:1: ( rule__Question__AnswersAssignment_3 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:457:2: rule__Question__AnswersAssignment_3
            {
            pushFollow(FOLLOW_rule__Question__AnswersAssignment_3_in_rule__Question__Group__3__Impl879);
            rule__Question__AnswersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_3()); 

            }

            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:460:1: ( ( rule__Question__AnswersAssignment_3 )* )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:461:1: ( rule__Question__AnswersAssignment_3 )*
            {
             before(grammarAccess.getQuestionAccess().getAnswersAssignment_3()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:462:1: ( rule__Question__AnswersAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:462:2: rule__Question__AnswersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Question__AnswersAssignment_3_in_rule__Question__Group__3__Impl891);
            	    rule__Question__AnswersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQuestionAccess().getAnswersAssignment_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:473:1: rule__Question__Group__4 : rule__Question__Group__4__Impl ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:477:1: ( rule__Question__Group__4__Impl )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:478:2: rule__Question__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__4924);
            rule__Question__Group__4__Impl();

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:484:1: rule__Question__Group__4__Impl : ( '}' ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:488:1: ( ( '}' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:489:1: ( '}' )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:489:1: ( '}' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:490:1: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Question__Group__4__Impl952); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_4()); 

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


    // $ANTLR start "rule__Answer__Group__0"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:513:1: rule__Answer__Group__0 : rule__Answer__Group__0__Impl rule__Answer__Group__1 ;
    public final void rule__Answer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:517:1: ( rule__Answer__Group__0__Impl rule__Answer__Group__1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:518:2: rule__Answer__Group__0__Impl rule__Answer__Group__1
            {
            pushFollow(FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__0993);
            rule__Answer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__0996);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:525:1: rule__Answer__Group__0__Impl : ( 'Answer' ) ;
    public final void rule__Answer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:529:1: ( ( 'Answer' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:530:1: ( 'Answer' )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:530:1: ( 'Answer' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:531:1: 'Answer'
            {
             before(grammarAccess.getAnswerAccess().getAnswerKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Answer__Group__0__Impl1024); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:544:1: rule__Answer__Group__1 : rule__Answer__Group__1__Impl rule__Answer__Group__2 ;
    public final void rule__Answer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:548:1: ( rule__Answer__Group__1__Impl rule__Answer__Group__2 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:549:2: rule__Answer__Group__1__Impl rule__Answer__Group__2
            {
            pushFollow(FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11055);
            rule__Answer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11058);
            rule__Answer__Group__2();

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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:556:1: rule__Answer__Group__1__Impl : ( ( rule__Answer__AnswerAssignment_1 ) ) ;
    public final void rule__Answer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:560:1: ( ( ( rule__Answer__AnswerAssignment_1 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:561:1: ( ( rule__Answer__AnswerAssignment_1 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:561:1: ( ( rule__Answer__AnswerAssignment_1 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:562:1: ( rule__Answer__AnswerAssignment_1 )
            {
             before(grammarAccess.getAnswerAccess().getAnswerAssignment_1()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:563:1: ( rule__Answer__AnswerAssignment_1 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:563:2: rule__Answer__AnswerAssignment_1
            {
            pushFollow(FOLLOW_rule__Answer__AnswerAssignment_1_in_rule__Answer__Group__1__Impl1085);
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


    // $ANTLR start "rule__Answer__Group__2"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:573:1: rule__Answer__Group__2 : rule__Answer__Group__2__Impl ;
    public final void rule__Answer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:577:1: ( rule__Answer__Group__2__Impl )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:578:2: rule__Answer__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21115);
            rule__Answer__Group__2__Impl();

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
    // $ANTLR end "rule__Answer__Group__2"


    // $ANTLR start "rule__Answer__Group__2__Impl"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:584:1: rule__Answer__Group__2__Impl : ( ( rule__Answer__TypeAssignment_2 ) ) ;
    public final void rule__Answer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:588:1: ( ( ( rule__Answer__TypeAssignment_2 ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:589:1: ( ( rule__Answer__TypeAssignment_2 ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:589:1: ( ( rule__Answer__TypeAssignment_2 ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:590:1: ( rule__Answer__TypeAssignment_2 )
            {
             before(grammarAccess.getAnswerAccess().getTypeAssignment_2()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:591:1: ( rule__Answer__TypeAssignment_2 )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:591:2: rule__Answer__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Answer__TypeAssignment_2_in_rule__Answer__Group__2__Impl1142);
            rule__Answer__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswerAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Answer__Group__2__Impl"


    // $ANTLR start "rule__QuestionPaper__PapernameAssignment_1"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:608:1: rule__QuestionPaper__PapernameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QuestionPaper__PapernameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:612:1: ( ( RULE_ID ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:613:1: ( RULE_ID )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:613:1: ( RULE_ID )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:614:1: RULE_ID
            {
             before(grammarAccess.getQuestionPaperAccess().getPapernameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QuestionPaper__PapernameAssignment_11183); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:623:1: rule__QuestionPaper__QuestionsAssignment_2 : ( ruleQuestion ) ;
    public final void rule__QuestionPaper__QuestionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:627:1: ( ( ruleQuestion ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:628:1: ( ruleQuestion )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:628:1: ( ruleQuestion )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:629:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPaperAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQuestion_in_rule__QuestionPaper__QuestionsAssignment_21214);
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:638:1: rule__Question__QuestionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Question__QuestionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:642:1: ( ( RULE_STRING ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:643:1: ( RULE_STRING )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:643:1: ( RULE_STRING )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:644:1: RULE_STRING
            {
             before(grammarAccess.getQuestionAccess().getQuestionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Question__QuestionAssignment_11245); 
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


    // $ANTLR start "rule__Question__AnswersAssignment_3"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:653:1: rule__Question__AnswersAssignment_3 : ( ruleAnswer ) ;
    public final void rule__Question__AnswersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:657:1: ( ( ruleAnswer ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:658:1: ( ruleAnswer )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:658:1: ( ruleAnswer )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:659:1: ruleAnswer
            {
             before(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_31276);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getAnswersAnswerParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Question__AnswersAssignment_3"


    // $ANTLR start "rule__Answer__AnswerAssignment_1"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:668:1: rule__Answer__AnswerAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Answer__AnswerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:672:1: ( ( RULE_STRING ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:673:1: ( RULE_STRING )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:673:1: ( RULE_STRING )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:674:1: RULE_STRING
            {
             before(grammarAccess.getAnswerAccess().getAnswerSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Answer__AnswerAssignment_11307); 
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


    // $ANTLR start "rule__Answer__TypeAssignment_2"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:683:1: rule__Answer__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Answer__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:687:1: ( ( ruleType ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:688:1: ( ruleType )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:688:1: ( ruleType )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:689:1: ruleType
            {
             before(grammarAccess.getAnswerAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Answer__TypeAssignment_21338);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAnswerAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Answer__TypeAssignment_2"


    // $ANTLR start "rule__CHECK__CheckAssignment"
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:698:1: rule__CHECK__CheckAssignment : ( ( 'check' ) ) ;
    public final void rule__CHECK__CheckAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:702:1: ( ( ( 'check' ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:703:1: ( ( 'check' ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:703:1: ( ( 'check' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:704:1: ( 'check' )
            {
             before(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:705:1: ( 'check' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:706:1: 'check'
            {
             before(grammarAccess.getCHECKAccess().getCheckCheckKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__CHECK__CheckAssignment1374); 
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
    // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:721:1: rule__RADIO__RadioAssignment : ( ( 'radio' ) ) ;
    public final void rule__RADIO__RadioAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:725:1: ( ( ( 'radio' ) ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:726:1: ( ( 'radio' ) )
            {
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:726:1: ( ( 'radio' ) )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:727:1: ( 'radio' )
            {
             before(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:728:1: ( 'radio' )
            // ../org.shashwat.xtext.latexQ.ui/src-gen/org/shashwat/xtext/latexQ/ui/contentassist/antlr/internal/InternalLatexQ.g:729:1: 'radio'
            {
             before(grammarAccess.getRADIOAccess().getRadioRadioKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__RADIO__RadioAssignment1418); 
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


 

    public static final BitSet FOLLOW_ruleQuestionPaper_in_entryRuleQuestionPaper61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPaper68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__0_in_ruleQuestionPaper94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__0_in_ruleQuestion154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnswer188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0_in_ruleAnswer214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHECK_in_entryRuleCHECK301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCHECK308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CHECK__CheckAssignment_in_ruleCHECK334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRADIO_in_entryRuleRADIO361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRADIO368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RADIO__RadioAssignment_in_ruleRADIO394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCHECK_in_rule__Type__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRADIO_in_rule__Type__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__0__Impl_in_rule__QuestionPaper__Group__0477 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__1_in_rule__QuestionPaper__Group__0480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__QuestionPaper__Group__0__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__1__Impl_in_rule__QuestionPaper__Group__1539 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__2_in_rule__QuestionPaper__Group__1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__PapernameAssignment_1_in_rule__QuestionPaper__Group__1__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__Group__2__Impl_in_rule__QuestionPaper__Group__2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuestionPaper__QuestionsAssignment_2_in_rule__QuestionPaper__Group__2__Impl626 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Question__Group__0__Impl_in_rule__Question__Group__0663 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Question__Group__1_in_rule__Question__Group__0666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Question__Group__0__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__1__Impl_in_rule__Question__Group__1725 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Question__Group__2_in_rule__Question__Group__1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__QuestionAssignment_1_in_rule__Question__Group__1__Impl755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__2__Impl_in_rule__Question__Group__2785 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Question__Group__3_in_rule__Question__Group__2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Question__Group__2__Impl816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__Group__3__Impl_in_rule__Question__Group__3847 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Question__Group__4_in_rule__Question__Group__3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Question__AnswersAssignment_3_in_rule__Question__Group__3__Impl879 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Question__AnswersAssignment_3_in_rule__Question__Group__3__Impl891 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Question__Group__4__Impl_in_rule__Question__Group__4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Question__Group__4__Impl952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__0__Impl_in_rule__Answer__Group__0993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Answer__Group__1_in_rule__Answer__Group__0996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Answer__Group__0__Impl1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__1__Impl_in_rule__Answer__Group__11055 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Answer__Group__2_in_rule__Answer__Group__11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__AnswerAssignment_1_in_rule__Answer__Group__1__Impl1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__Group__2__Impl_in_rule__Answer__Group__21115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Answer__TypeAssignment_2_in_rule__Answer__Group__2__Impl1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QuestionPaper__PapernameAssignment_11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPaper__QuestionsAssignment_21214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Question__QuestionAssignment_11245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnswer_in_rule__Question__AnswersAssignment_31276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Answer__AnswerAssignment_11307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Answer__TypeAssignment_21338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__CHECK__CheckAssignment1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RADIO__RadioAssignment1418 = new BitSet(new long[]{0x0000000000000002L});

}