package de.tubs.bibtextohtml.bibtex.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class BibtexHighlightingConfiguration extends DefaultHighlightingConfiguration {

	// provide an id string for the highlighting calculator
	public static final String FIELDVALUE_ID = "fieldvalue";
	public static final String CITEKEY_ID = "citekey";
	// default fonts used by this specific highlighting (defaults)
//	private static FontData defaultAnnotationBlockFont = new FontData("Courier New", 12);

	// configure the acceptor providing the id, the description string
	// that will appear in the preference page and the initial text style
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(FIELDVALUE_ID, "Field Value", fieldValueStyle());
		acceptor.acceptDefaultHighlighting(CITEKEY_ID, "Cite Key", citeKeyStyle());
	}

	// method for calculating an actual text styles
	public TextStyle fieldValueStyle() {
		TextStyle textStyle = new TextStyle();
		//textStyle.setBackgroundColor(new RGB(155, 55, 255));
		textStyle.setColor(new RGB(100, 149, 237));
		textStyle.setStyle(SWT.ITALIC);
//		textStyle.setFontData(defaultCommentFont);
		return textStyle;
	}
	
	public TextStyle citeKeyStyle() {
		TextStyle textStyle = new TextStyle();
		//textStyle.setBackgroundColor(new RGB(255, 165, 0));
		textStyle.setColor(new RGB(255, 140, 0));
		textStyle.setStyle(SWT.BOLD);
//		textStyle.setFontData(defaultCommentFont);
		return textStyle;
	}
}
