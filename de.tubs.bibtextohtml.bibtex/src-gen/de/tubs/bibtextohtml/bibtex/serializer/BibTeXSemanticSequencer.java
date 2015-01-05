package de.tubs.bibtextohtml.bibtex.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.tubs.bibtextohtml.bibtex.bibTeX.Article;
import de.tubs.bibtextohtml.bibtex.bibTeX.Authors;
import de.tubs.bibtextohtml.bibtex.bibTeX.BibTeXPackage;
import de.tubs.bibtextohtml.bibtex.bibTeX.CiteKey;
import de.tubs.bibtextohtml.bibtex.bibTeX.Fullname;
import de.tubs.bibtextohtml.bibtex.bibTeX.JournalField;
import de.tubs.bibtextohtml.bibtex.bibTeX.Model;
import de.tubs.bibtextohtml.bibtex.bibTeX.MonthField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NoteField;
import de.tubs.bibtextohtml.bibtex.bibTeX.NumberField;
import de.tubs.bibtextohtml.bibtex.bibTeX.PagesField;
import de.tubs.bibtextohtml.bibtex.bibTeX.TitleField;
import de.tubs.bibtextohtml.bibtex.bibTeX.VolumeField;
import de.tubs.bibtextohtml.bibtex.bibTeX.YearField;
import de.tubs.bibtextohtml.bibtex.services.BibTeXGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BibTeXSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BibTeXGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BibTeXPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BibTeXPackage.ARTICLE:
				if(context == grammarAccess.getArticleRule() ||
				   context == grammarAccess.getBibtexEntryTypesRule()) {
					sequence_Article(context, (Article) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.AUTHORS:
				if(context == grammarAccess.getAuthorFieldRule() ||
				   context == grammarAccess.getAuthorsRule()) {
					sequence_Authors(context, (Authors) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.CITE_KEY:
				if(context == grammarAccess.getCiteKeyRule()) {
					sequence_CiteKey(context, (CiteKey) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.FULLNAME:
				if(context == grammarAccess.getFullnameRule()) {
					sequence_Fullname(context, (Fullname) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.JOURNAL_FIELD:
				if(context == grammarAccess.getJournalFieldRule()) {
					sequence_JournalField(context, (JournalField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.MONTH_FIELD:
				if(context == grammarAccess.getMonthFieldRule()) {
					sequence_MonthField(context, (MonthField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.NOTE_FIELD:
				if(context == grammarAccess.getNoteFieldRule()) {
					sequence_NoteField(context, (NoteField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.NUMBER_FIELD:
				if(context == grammarAccess.getNumberFieldRule()) {
					sequence_NumberField(context, (NumberField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.PAGES_FIELD:
				if(context == grammarAccess.getPagesFieldRule()) {
					sequence_PagesField(context, (PagesField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.TITLE_FIELD:
				if(context == grammarAccess.getTitleFieldRule()) {
					sequence_TitleField(context, (TitleField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.VOLUME_FIELD:
				if(context == grammarAccess.getVolumeFieldRule()) {
					sequence_VolumeField(context, (VolumeField) semanticObject); 
					return; 
				}
				else break;
			case BibTeXPackage.YEAR_FIELD:
				if(context == grammarAccess.getYearFieldRule()) {
					sequence_YearField(context, (YearField) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         key=CiteKey 
	 *         author=AuthorField 
	 *         title=TitleField 
	 *         journal=JournalField 
	 *         year=YearField 
	 *         volume=VolumeField? 
	 *         number=NumberField? 
	 *         pages=PagesField? 
	 *         month=MonthField? 
	 *         note=NoteField?
	 *     )
	 */
	protected void sequence_Article(EObject context, Article semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (names+=Fullname names+=Fullname*)
	 */
	protected void sequence_Authors(EObject context, Authors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     key=ID
	 */
	protected void sequence_CiteKey(EObject context, CiteKey semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.CITE_KEY__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.CITE_KEY__KEY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((lastname=ID firstname=ID) | (firstname=ID lastname=ID) | firstname=ID)
	 */
	protected void sequence_Fullname(EObject context, Fullname semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     journal=STRING
	 */
	protected void sequence_JournalField(EObject context, JournalField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.JOURNAL_FIELD__JOURNAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.JOURNAL_FIELD__JOURNAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_1_0(), semanticObject.getJournal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     BibtexEntries+=BibtexEntryTypes*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     month=STRING
	 */
	protected void sequence_MonthField(EObject context, MonthField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.MONTH_FIELD__MONTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.MONTH_FIELD__MONTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_1_0(), semanticObject.getMonth());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     note=STRING
	 */
	protected void sequence_NoteField(EObject context, NoteField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.NOTE_FIELD__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.NOTE_FIELD__NOTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_1_0(), semanticObject.getNote());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     number=STRING
	 */
	protected void sequence_NumberField(EObject context, NumberField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.NUMBER_FIELD__NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.NUMBER_FIELD__NUMBER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_1_0(), semanticObject.getNumber());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     pages=STRING
	 */
	protected void sequence_PagesField(EObject context, PagesField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.PAGES_FIELD__PAGES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.PAGES_FIELD__PAGES));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_1_0(), semanticObject.getPages());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     title=STRING
	 */
	protected void sequence_TitleField(EObject context, TitleField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.TITLE_FIELD__TITLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.TITLE_FIELD__TITLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_1_0(), semanticObject.getTitle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     volume=STRING
	 */
	protected void sequence_VolumeField(EObject context, VolumeField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.VOLUME_FIELD__VOLUME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.VOLUME_FIELD__VOLUME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_1_0(), semanticObject.getVolume());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     year=STRING
	 */
	protected void sequence_YearField(EObject context, YearField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, BibTeXPackage.Literals.YEAR_FIELD__YEAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BibTeXPackage.Literals.YEAR_FIELD__YEAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_1_0(), semanticObject.getYear());
		feeder.finish();
	}
}
