/*
* generated by Xtext
*/
package de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.tubs.bibtextohtml.bibtex.services.BibTeXGrammarAccess;

public class BibTeXParser extends AbstractContentAssistParser {
	
	@Inject
	private BibTeXGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal.InternalBibTeXParser createParser() {
		de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal.InternalBibTeXParser result = new de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal.InternalBibTeXParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBibtexEntryTypesAccess().getAlternatives(), "rule__BibtexEntryTypes__Alternatives");
					put(grammarAccess.getBookAccess().getAuthor_editorAlternatives_4_0_1_0(), "rule__Book__Author_editorAlternatives_4_0_1_0");
					put(grammarAccess.getBookAccess().getVolume_numberAlternatives_4_4_1_0(), "rule__Book__Volume_numberAlternatives_4_4_1_0");
					put(grammarAccess.getAuthorFieldAccess().getAlternatives_2(), "rule__AuthorField__Alternatives_2");
					put(grammarAccess.getFullnameAccess().getAlternatives(), "rule__Fullname__Alternatives");
					put(grammarAccess.getArticleAccess().getGroup(), "rule__Article__Group__0");
					put(grammarAccess.getArticleAccess().getGroup_4_0(), "rule__Article__Group_4_0__0");
					put(grammarAccess.getArticleAccess().getGroup_4_1(), "rule__Article__Group_4_1__0");
					put(grammarAccess.getArticleAccess().getGroup_4_2(), "rule__Article__Group_4_2__0");
					put(grammarAccess.getArticleAccess().getGroup_4_3(), "rule__Article__Group_4_3__0");
					put(grammarAccess.getArticleAccess().getGroup_4_4(), "rule__Article__Group_4_4__0");
					put(grammarAccess.getArticleAccess().getGroup_4_5(), "rule__Article__Group_4_5__0");
					put(grammarAccess.getArticleAccess().getGroup_4_6(), "rule__Article__Group_4_6__0");
					put(grammarAccess.getArticleAccess().getGroup_4_7(), "rule__Article__Group_4_7__0");
					put(grammarAccess.getArticleAccess().getGroup_4_8(), "rule__Article__Group_4_8__0");
					put(grammarAccess.getArticleAccess().getGroup_4_9(), "rule__Article__Group_4_9__0");
					put(grammarAccess.getBookAccess().getGroup(), "rule__Book__Group__0");
					put(grammarAccess.getBookAccess().getGroup_4_0(), "rule__Book__Group_4_0__0");
					put(grammarAccess.getBookAccess().getGroup_4_1(), "rule__Book__Group_4_1__0");
					put(grammarAccess.getBookAccess().getGroup_4_2(), "rule__Book__Group_4_2__0");
					put(grammarAccess.getBookAccess().getGroup_4_3(), "rule__Book__Group_4_3__0");
					put(grammarAccess.getBookAccess().getGroup_4_4(), "rule__Book__Group_4_4__0");
					put(grammarAccess.getBookAccess().getGroup_4_5(), "rule__Book__Group_4_5__0");
					put(grammarAccess.getBookAccess().getGroup_4_6(), "rule__Book__Group_4_6__0");
					put(grammarAccess.getBookAccess().getGroup_4_7(), "rule__Book__Group_4_7__0");
					put(grammarAccess.getBookAccess().getGroup_4_8(), "rule__Book__Group_4_8__0");
					put(grammarAccess.getBookAccess().getGroup_4_9(), "rule__Book__Group_4_9__0");
					put(grammarAccess.getBookAccess().getGroup_4_10(), "rule__Book__Group_4_10__0");
					put(grammarAccess.getBookAccess().getGroup_4_11(), "rule__Book__Group_4_11__0");
					put(grammarAccess.getUnknownFieldAccess().getGroup(), "rule__UnknownField__Group__0");
					put(grammarAccess.getAuthorFieldAccess().getGroup(), "rule__AuthorField__Group__0");
					put(grammarAccess.getAuthorFieldAccess().getGroup_2_0(), "rule__AuthorField__Group_2_0__0");
					put(grammarAccess.getAuthorFieldAccess().getGroup_2_1(), "rule__AuthorField__Group_2_1__0");
					put(grammarAccess.getAuthorsAccess().getGroup(), "rule__Authors__Group__0");
					put(grammarAccess.getAuthorsAccess().getGroup_1(), "rule__Authors__Group_1__0");
					put(grammarAccess.getFullnameAccess().getGroup_0(), "rule__Fullname__Group_0__0");
					put(grammarAccess.getFullnameAccess().getGroup_1(), "rule__Fullname__Group_1__0");
					put(grammarAccess.getEditorFieldAccess().getGroup(), "rule__EditorField__Group__0");
					put(grammarAccess.getTitleFieldAccess().getGroup(), "rule__TitleField__Group__0");
					put(grammarAccess.getPublisherFieldAccess().getGroup(), "rule__PublisherField__Group__0");
					put(grammarAccess.getJournalFieldAccess().getGroup(), "rule__JournalField__Group__0");
					put(grammarAccess.getYearFieldAccess().getGroup(), "rule__YearField__Group__0");
					put(grammarAccess.getVolumeFieldAccess().getGroup(), "rule__VolumeField__Group__0");
					put(grammarAccess.getNumberFieldAccess().getGroup(), "rule__NumberField__Group__0");
					put(grammarAccess.getPagesFieldAccess().getGroup(), "rule__PagesField__Group__0");
					put(grammarAccess.getMonthFieldAccess().getGroup(), "rule__MonthField__Group__0");
					put(grammarAccess.getAddressFieldAccess().getGroup(), "rule__AddressField__Group__0");
					put(grammarAccess.getSeriesFieldAccess().getGroup(), "rule__SeriesField__Group__0");
					put(grammarAccess.getEditionFieldAccess().getGroup(), "rule__EditionField__Group__0");
					put(grammarAccess.getIsbnFieldAccess().getGroup(), "rule__IsbnField__Group__0");
					put(grammarAccess.getNoteFieldAccess().getGroup(), "rule__NoteField__Group__0");
					put(grammarAccess.getModelAccess().getBibtexEntriesAssignment(), "rule__Model__BibtexEntriesAssignment");
					put(grammarAccess.getArticleAccess().getKeyAssignment_3(), "rule__Article__KeyAssignment_3");
					put(grammarAccess.getArticleAccess().getAuthorAssignment_4_0_1(), "rule__Article__AuthorAssignment_4_0_1");
					put(grammarAccess.getArticleAccess().getTitleAssignment_4_1_1(), "rule__Article__TitleAssignment_4_1_1");
					put(grammarAccess.getArticleAccess().getJournalAssignment_4_2_1(), "rule__Article__JournalAssignment_4_2_1");
					put(grammarAccess.getArticleAccess().getYearAssignment_4_3_1(), "rule__Article__YearAssignment_4_3_1");
					put(grammarAccess.getArticleAccess().getVolumeAssignment_4_4_1(), "rule__Article__VolumeAssignment_4_4_1");
					put(grammarAccess.getArticleAccess().getNumberAssignment_4_5_1(), "rule__Article__NumberAssignment_4_5_1");
					put(grammarAccess.getArticleAccess().getPagesAssignment_4_6_1(), "rule__Article__PagesAssignment_4_6_1");
					put(grammarAccess.getArticleAccess().getMonthAssignment_4_7_1(), "rule__Article__MonthAssignment_4_7_1");
					put(grammarAccess.getArticleAccess().getNoteAssignment_4_8_1(), "rule__Article__NoteAssignment_4_8_1");
					put(grammarAccess.getArticleAccess().getUnknownsAssignment_4_9_1(), "rule__Article__UnknownsAssignment_4_9_1");
					put(grammarAccess.getBookAccess().getKeyAssignment_3(), "rule__Book__KeyAssignment_3");
					put(grammarAccess.getBookAccess().getAuthor_editorAssignment_4_0_1(), "rule__Book__Author_editorAssignment_4_0_1");
					put(grammarAccess.getBookAccess().getTitleAssignment_4_1_1(), "rule__Book__TitleAssignment_4_1_1");
					put(grammarAccess.getBookAccess().getPublisherAssignment_4_2_1(), "rule__Book__PublisherAssignment_4_2_1");
					put(grammarAccess.getBookAccess().getYearAssignment_4_3_1(), "rule__Book__YearAssignment_4_3_1");
					put(grammarAccess.getBookAccess().getVolume_numberAssignment_4_4_1(), "rule__Book__Volume_numberAssignment_4_4_1");
					put(grammarAccess.getBookAccess().getSeriesAssignment_4_5_1(), "rule__Book__SeriesAssignment_4_5_1");
					put(grammarAccess.getBookAccess().getAddressAssignment_4_6_1(), "rule__Book__AddressAssignment_4_6_1");
					put(grammarAccess.getBookAccess().getEditionAssignment_4_7_1(), "rule__Book__EditionAssignment_4_7_1");
					put(grammarAccess.getBookAccess().getMonthAssignment_4_8_1(), "rule__Book__MonthAssignment_4_8_1");
					put(grammarAccess.getBookAccess().getIsbnAssignment_4_9_1(), "rule__Book__IsbnAssignment_4_9_1");
					put(grammarAccess.getBookAccess().getNoteAssignment_4_10_1(), "rule__Book__NoteAssignment_4_10_1");
					put(grammarAccess.getBookAccess().getUnknownsAssignment_4_11_1(), "rule__Book__UnknownsAssignment_4_11_1");
					put(grammarAccess.getUnknownFieldAccess().getTypeAssignment_0(), "rule__UnknownField__TypeAssignment_0");
					put(grammarAccess.getUnknownFieldAccess().getValueAssignment_2(), "rule__UnknownField__ValueAssignment_2");
					put(grammarAccess.getUnknownTypeAccess().getTypeAssignment(), "rule__UnknownType__TypeAssignment");
					put(grammarAccess.getUnknownValueAccess().getValueAssignment(), "rule__UnknownValue__ValueAssignment");
					put(grammarAccess.getCiteKeyAccess().getKeyAssignment(), "rule__CiteKey__KeyAssignment");
					put(grammarAccess.getAuthorsAccess().getNamesAssignment_0(), "rule__Authors__NamesAssignment_0");
					put(grammarAccess.getAuthorsAccess().getNamesAssignment_1_1(), "rule__Authors__NamesAssignment_1_1");
					put(grammarAccess.getFullnameAccess().getLastnameAssignment_0_0(), "rule__Fullname__LastnameAssignment_0_0");
					put(grammarAccess.getFullnameAccess().getFirstnameAssignment_0_2(), "rule__Fullname__FirstnameAssignment_0_2");
					put(grammarAccess.getFullnameAccess().getFirstnameAssignment_1_0(), "rule__Fullname__FirstnameAssignment_1_0");
					put(grammarAccess.getFullnameAccess().getLastnameAssignment_1_1(), "rule__Fullname__LastnameAssignment_1_1");
					put(grammarAccess.getFullnameAccess().getFirstnameAssignment_2(), "rule__Fullname__FirstnameAssignment_2");
					put(grammarAccess.getEditorFieldAccess().getEditorAssignment_2(), "rule__EditorField__EditorAssignment_2");
					put(grammarAccess.getTitleFieldAccess().getTitleAssignment_2(), "rule__TitleField__TitleAssignment_2");
					put(grammarAccess.getPublisherFieldAccess().getPublisherAssignment_2(), "rule__PublisherField__PublisherAssignment_2");
					put(grammarAccess.getJournalFieldAccess().getJournalAssignment_2(), "rule__JournalField__JournalAssignment_2");
					put(grammarAccess.getYearFieldAccess().getYearAssignment_2(), "rule__YearField__YearAssignment_2");
					put(grammarAccess.getVolumeFieldAccess().getVolumeAssignment_2(), "rule__VolumeField__VolumeAssignment_2");
					put(grammarAccess.getNumberFieldAccess().getNumberAssignment_2(), "rule__NumberField__NumberAssignment_2");
					put(grammarAccess.getPagesFieldAccess().getPagesAssignment_2(), "rule__PagesField__PagesAssignment_2");
					put(grammarAccess.getMonthFieldAccess().getMonthAssignment_2(), "rule__MonthField__MonthAssignment_2");
					put(grammarAccess.getAddressFieldAccess().getAddressAssignment_2(), "rule__AddressField__AddressAssignment_2");
					put(grammarAccess.getSeriesFieldAccess().getSeriesAssignment_2(), "rule__SeriesField__SeriesAssignment_2");
					put(grammarAccess.getEditionFieldAccess().getEditionAssignment_2(), "rule__EditionField__EditionAssignment_2");
					put(grammarAccess.getIsbnFieldAccess().getIsbnAssignment_2(), "rule__IsbnField__IsbnAssignment_2");
					put(grammarAccess.getNoteFieldAccess().getNoteAssignment_2(), "rule__NoteField__NoteAssignment_2");
					put(grammarAccess.getArticleAccess().getUnorderedGroup_4(), "rule__Article__UnorderedGroup_4");
					put(grammarAccess.getBookAccess().getUnorderedGroup_4(), "rule__Book__UnorderedGroup_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal.InternalBibTeXParser typedParser = (de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal.InternalBibTeXParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public BibTeXGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BibTeXGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
