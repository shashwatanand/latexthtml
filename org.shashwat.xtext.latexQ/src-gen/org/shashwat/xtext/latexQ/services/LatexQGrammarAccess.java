/*
 * generated by Xtext
 */
package org.shashwat.xtext.latexQ.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LatexQGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class QuestionPaperElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.QuestionPaper");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPapernameKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPapernameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPapernameIDTerminalRuleCall_1_0 = (RuleCall)cPapernameAssignment_1.eContents().get(0);
		private final Assignment cQuestionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionsQuestionParserRuleCall_2_0 = (RuleCall)cQuestionsAssignment_2.eContents().get(0);
		
		//QuestionPaper:
		//	'papername' papername=ID
		//	questions+=Question*;
		@Override public ParserRule getRule() { return rule; }

		//'papername' papername=ID questions+=Question*
		public Group getGroup() { return cGroup; }

		//'papername'
		public Keyword getPapernameKeyword_0() { return cPapernameKeyword_0; }

		//papername=ID
		public Assignment getPapernameAssignment_1() { return cPapernameAssignment_1; }

		//ID
		public RuleCall getPapernameIDTerminalRuleCall_1_0() { return cPapernameIDTerminalRuleCall_1_0; }

		//questions+=Question*
		public Assignment getQuestionsAssignment_2() { return cQuestionsAssignment_2; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_2_0() { return cQuestionsQuestionParserRuleCall_2_0; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQuestionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQuestionSTRINGTerminalRuleCall_1_0 = (RuleCall)cQuestionAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeTypeParserRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		private final Assignment cAnswersAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnswersAnswerParserRuleCall_4_0 = (RuleCall)cAnswersAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Question:
		//	'Question' question=STRING '{'
		//	type=Type
		//	answers+=Answer+
		//	'}';
		@Override public ParserRule getRule() { return rule; }

		//'Question' question=STRING '{' type=Type answers+=Answer+ '}'
		public Group getGroup() { return cGroup; }

		//'Question'
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }

		//question=STRING
		public Assignment getQuestionAssignment_1() { return cQuestionAssignment_1; }

		//STRING
		public RuleCall getQuestionSTRINGTerminalRuleCall_1_0() { return cQuestionSTRINGTerminalRuleCall_1_0; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//type=Type
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//Type
		public RuleCall getTypeTypeParserRuleCall_3_0() { return cTypeTypeParserRuleCall_3_0; }

		//answers+=Answer+
		public Assignment getAnswersAssignment_4() { return cAnswersAssignment_4; }

		//Answer
		public RuleCall getAnswersAnswerParserRuleCall_4_0() { return cAnswersAnswerParserRuleCall_4_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class AnswerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.Answer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAnswerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAnswerAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAnswerSTRINGTerminalRuleCall_1_0 = (RuleCall)cAnswerAssignment_1.eContents().get(0);
		
		//Answer:
		//	'Answer' answer=STRING
		//	//type=Type
		//;
		@Override public ParserRule getRule() { return rule; }

		//'Answer' answer=STRING
		public Group getGroup() { return cGroup; }

		//'Answer'
		public Keyword getAnswerKeyword_0() { return cAnswerKeyword_0; }

		//answer=STRING
		public Assignment getAnswerAssignment_1() { return cAnswerAssignment_1; }

		//STRING
		public RuleCall getAnswerSTRINGTerminalRuleCall_1_0() { return cAnswerSTRINGTerminalRuleCall_1_0; }
	}

	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCHECKParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRADIOParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//	CHECK | RADIO;
		@Override public ParserRule getRule() { return rule; }

		//CHECK | RADIO
		public Alternatives getAlternatives() { return cAlternatives; }

		//CHECK
		public RuleCall getCHECKParserRuleCall_0() { return cCHECKParserRuleCall_0; }

		//RADIO
		public RuleCall getRADIOParserRuleCall_1() { return cRADIOParserRuleCall_1; }
	}

	public class CHECKElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.CHECK");
		private final Assignment cCheckAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cCheckCheckKeyword_0 = (Keyword)cCheckAssignment.eContents().get(0);
		
		//CHECK:
		//	check?='check';
		@Override public ParserRule getRule() { return rule; }

		//check?='check'
		public Assignment getCheckAssignment() { return cCheckAssignment; }

		//'check'
		public Keyword getCheckCheckKeyword_0() { return cCheckCheckKeyword_0; }
	}

	public class RADIOElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.shashwat.xtext.latexQ.LatexQ.RADIO");
		private final Assignment cRadioAssignment = (Assignment)rule.eContents().get(1);
		private final Keyword cRadioRadioKeyword_0 = (Keyword)cRadioAssignment.eContents().get(0);
		
		//RADIO:
		//	radio?='radio';
		@Override public ParserRule getRule() { return rule; }

		//radio?='radio'
		public Assignment getRadioAssignment() { return cRadioAssignment; }

		//'radio'
		public Keyword getRadioRadioKeyword_0() { return cRadioRadioKeyword_0; }
	}
	
	
	private final QuestionPaperElements pQuestionPaper;
	private final QuestionElements pQuestion;
	private final AnswerElements pAnswer;
	private final TypeElements pType;
	private final CHECKElements pCHECK;
	private final RADIOElements pRADIO;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LatexQGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQuestionPaper = new QuestionPaperElements();
		this.pQuestion = new QuestionElements();
		this.pAnswer = new AnswerElements();
		this.pType = new TypeElements();
		this.pCHECK = new CHECKElements();
		this.pRADIO = new RADIOElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.shashwat.xtext.latexQ.LatexQ".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//QuestionPaper:
	//	'papername' papername=ID
	//	questions+=Question*;
	public QuestionPaperElements getQuestionPaperAccess() {
		return pQuestionPaper;
	}
	
	public ParserRule getQuestionPaperRule() {
		return getQuestionPaperAccess().getRule();
	}

	//Question:
	//	'Question' question=STRING '{'
	//	type=Type
	//	answers+=Answer+
	//	'}';
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//Answer:
	//	'Answer' answer=STRING
	//	//type=Type
	//;
	public AnswerElements getAnswerAccess() {
		return pAnswer;
	}
	
	public ParserRule getAnswerRule() {
		return getAnswerAccess().getRule();
	}

	//Type:
	//	CHECK | RADIO;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}

	//CHECK:
	//	check?='check';
	public CHECKElements getCHECKAccess() {
		return pCHECK;
	}
	
	public ParserRule getCHECKRule() {
		return getCHECKAccess().getRule();
	}

	//RADIO:
	//	radio?='radio';
	public RADIOElements getRADIOAccess() {
		return pRADIO;
	}
	
	public ParserRule getRADIORule() {
		return getRADIOAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
