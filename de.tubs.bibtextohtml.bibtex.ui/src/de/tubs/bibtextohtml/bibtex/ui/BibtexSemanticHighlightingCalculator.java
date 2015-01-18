package de.tubs.bibtextohtml.bibtex.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Assignment;
//import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class BibtexSemanticHighlightingCalculator implements ISemanticHighlightingCalculator
{
	private void printDebugInformation(INode node) {
	    EObject grammarElement = node.getGrammarElement();
	    System.out.println("TEXT: " + node.getText());
	    System.out.println("GRAMMAR: " + grammarElement.getClass().getName());
	    if (node.getSemanticElement().eContainer() != null) System.out.println("SEMANTIC CONTAINER: " + node.getSemanticElement().eContainer().getClass().getName());
	    if (node.getSemanticElement().eContainmentFeature() != null) System.out.println("SEMANTIC CONTAINMENT: " + node.getSemanticElement().eContainmentFeature().getName());
	    System.out.println("SEMANTIC RESOURCE: " + node.getSemanticElement().eResource().getClass().getName());
	    System.out.println("SEMANTIC: " + node.getSemanticElement().getClass().getName());
	    if (grammarElement != null)
	      System.out.println("GRAMMAR ELEMENT CLASS:" + grammarElement.getClass().getName());
	    if (grammarElement instanceof RuleCall) {
	      System.out.println("RULE: " + ((RuleCall) grammarElement).getRule().getName());
	      System.out.println("CLASS: " + ((RuleCall) grammarElement).getRule().eClass().getName());
	    } else if (grammarElement instanceof Action) {
	      System.out.println("CARDINALITY: " + ((Action) grammarElement).getCardinality());
	      System.out.println("FEATURE: " + ((Action) grammarElement).getFeature());
	      System.out.println("OPERATOR: " + ((Action) grammarElement).getOperator());
	    }
	    System.out.println("");    
	  }
	
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
				if ((name.equals("FieldValue") || 
					name.equals("FieldValuePlusInt") || 
					name.equals("FieldValuePlusId")) //|| name.equals("Author")
					) {
					INode parent = node.getParent();
					if(parent.getGrammarElement() instanceof RuleCall &&
					  ((RuleCall)parent.getGrammarElement()).getRule().getName().equals("AuthorField")) {
						String str = node.getText().trim();
//						if((str.startsWith("{") && str.endsWith("}"))  
//						|| (str.startsWith("\"") && str.endsWith("\"")) )
//							str = str.subSequence(1, str.length()-1).toString();
						String[] parts = str.split(" and ");
						
						int offset = node.getOffset();
						for(int i = 0; i < parts.length; ++i) {
							acceptor.addPosition(offset, parts[i].length(), 
									BibtexHighlightingConfiguration.AUTHOR_ID);
							
							offset +=  parts[i].length();
							if(i != parts.length-1) {
								acceptor.addPosition(offset, 5, 
										BibtexHighlightingConfiguration.AUTHOR_AND_ID);
								offset +=  5;
							}
						}
						
						//printDebugInformation(node);

					} else {
						acceptor.addPosition(node.getOffset(), node.getLength(), 
								BibtexHighlightingConfiguration.FIELDVALUE_ID);
					}
					
					
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
