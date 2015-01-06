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
	protected AbstractElementAlias match_AuthorField_LeftCurlyBracketKeyword_2_1_0_or_QuotationMarkKeyword_2_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (BibTeXGrammarAccess) access;
		match_AuthorField_LeftCurlyBracketKeyword_2_1_0_or_QuotationMarkKeyword_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_0()));
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
			if(match_AuthorField_LeftCurlyBracketKeyword_2_1_0_or_QuotationMarkKeyword_2_0_0.equals(syntax))
				emit_AuthorField_LeftCurlyBracketKeyword_2_1_0_or_QuotationMarkKeyword_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '"' | '{'
	 */
	protected void emit_AuthorField_LeftCurlyBracketKeyword_2_1_0_or_QuotationMarkKeyword_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
