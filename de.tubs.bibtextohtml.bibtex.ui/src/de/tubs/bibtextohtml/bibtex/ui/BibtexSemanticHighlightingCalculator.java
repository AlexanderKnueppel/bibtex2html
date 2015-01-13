package de.tubs.bibtextohtml.bibtex.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
//import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BibtexSemanticHighlightingCalculator implements ISemanticHighlightingCalculator
{
    @Override
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
    	if (resource == null || resource.getParseResult() == null)
			return;
        // It gets a node model.
        INode root = resource.getParseResult().getRootNode();
        for(INode node : root.getAsTreeIterable()) {   
            EObject grammarElement = node.getGrammarElement(); 
            if(grammarElement instanceof RuleCall) {
				RuleCall ruleCall = (RuleCall)grammarElement;
				String name = ruleCall.getRule().getName();
				if (name.equals("FieldValue") || 
					name.equals("FieldValuePlusInt") || 
					name.equals("FieldValuePlusId") //|| name.equals("Author")
					) {
					acceptor.addPosition(node.getOffset(), node.getLength(), 
							BibtexHighlightingConfiguration.FIELDVALUE_ID);
//				} else if(name.equals("Authors")) {
////					f(r.getName().equals("ID") && c instanceof Assignment && ((Assignment)c).getFeature().equals("name")) {
////	                    INode p = node.getParent();
//					EObject c = grammarElement.eContainer();
//					System.out.println("TEST: " + ((Assignment)c).getFeature());
//
				} else if(name.equals("CiteKey")) {
					acceptor.addPosition(node.getOffset(), node.getLength(), 
							BibtexHighlightingConfiguration.CITEKEY_ID);
				}
            }
        }
    }
}
