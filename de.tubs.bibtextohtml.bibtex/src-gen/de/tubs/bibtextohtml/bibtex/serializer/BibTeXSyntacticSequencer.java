package de.tubs.bibtextohtml.bibtex.serializer;

import com.google.inject.Inject;
import de.tubs.bibtextohtml.bibtex.services.BibTeXGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class BibTeXSyntacticSequencer extends AbstractSyntacticSequencer {

	protected BibTeXGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Article_ARTICLEKeyword_0_1_0_or_ArticleKeyword_0_1_1_or_ArticleKeyword_0_1_2;
	protected AbstractElementAlias match_Article_RightCurlyBracketKeyword_8_1_a;
	protected AbstractElementAlias match_Article_RightCurlyBracketKeyword_8_1_p;
	protected AbstractElementAlias match_AuthorField_LeftCurlyBracketKeyword_1_1_0_or_QuotationMarkKeyword_1_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BibTeXGrammarAccess) access;
		match_Article_ARTICLEKeyword_0_1_0_or_ArticleKeyword_0_1_1_or_ArticleKeyword_0_1_2 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArticleAccess().getARTICLEKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getArticleAccess().getArticleKeyword_0_1_1()), new TokenAlias(false, false, grammarAccess.getArticleAccess().getArticleKeyword_0_1_2()));
		match_Article_RightCurlyBracketKeyword_8_1_a = new TokenAlias(true, true, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_8_1());
		match_Article_RightCurlyBracketKeyword_8_1_p = new TokenAlias(true, false, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_8_1());
		match_AuthorField_LeftCurlyBracketKeyword_1_1_0_or_QuotationMarkKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Article_ARTICLEKeyword_0_1_0_or_ArticleKeyword_0_1_1_or_ArticleKeyword_0_1_2.equals(syntax))
				emit_Article_ARTICLEKeyword_0_1_0_or_ArticleKeyword_0_1_1_or_ArticleKeyword_0_1_2(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Article_RightCurlyBracketKeyword_8_1_a.equals(syntax))
				emit_Article_RightCurlyBracketKeyword_8_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Article_RightCurlyBracketKeyword_8_1_p.equals(syntax))
				emit_Article_RightCurlyBracketKeyword_8_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AuthorField_LeftCurlyBracketKeyword_1_1_0_or_QuotationMarkKeyword_1_0_0.equals(syntax))
				emit_AuthorField_LeftCurlyBracketKeyword_1_1_0_or_QuotationMarkKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'ARTICLE' | 'Article' | 'article'
	 */
	protected void emit_Article_ARTICLEKeyword_0_1_0_or_ArticleKeyword_0_1_1_or_ArticleKeyword_0_1_2(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'*
	 */
	protected void emit_Article_RightCurlyBracketKeyword_8_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '}'+
	 */
	protected void emit_Article_RightCurlyBracketKeyword_8_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '"' | '{'
	 */
	protected void emit_AuthorField_LeftCurlyBracketKeyword_1_1_0_or_QuotationMarkKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
