package de.tubs.bibtextohtml.bibtex.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.tubs.bibtextohtml.bibtex.services.BibTeXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBibTeXParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'ARTICLE'", "'Article'", "'article'", "'{'", "','", "'}'", "'author = '", "'\"'", "'and'", "'title = '", "'journal = '", "'year = '", "'volume = '", "'number = '", "'pages = '", "'month = '", "'note = '"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBibTeXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBibTeXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBibTeXParser.tokenNames; }
    public String getGrammarFileName() { return "../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g"; }



     	private BibTeXGrammarAccess grammarAccess;
     	
        public InternalBibTeXParser(TokenStream input, BibTeXGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected BibTeXGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:76:1: ruleModel returns [EObject current=null] : ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_BibtexEntries_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:79:28: ( ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )* )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:80:1: ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )*
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:80:1: ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:81:1: (lv_BibtexEntries_0_0= ruleBibtexEntryTypes )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:81:1: (lv_BibtexEntries_0_0= ruleBibtexEntryTypes )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:82:3: lv_BibtexEntries_0_0= ruleBibtexEntryTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBibtexEntryTypes_in_ruleModel130);
            	    lv_BibtexEntries_0_0=ruleBibtexEntryTypes();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"BibtexEntries",
            	            		lv_BibtexEntries_0_0, 
            	            		"BibtexEntryTypes");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBibtexEntryTypes"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:106:1: entryRuleBibtexEntryTypes returns [EObject current=null] : iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF ;
    public final EObject entryRuleBibtexEntryTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBibtexEntryTypes = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:107:2: (iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:108:2: iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF
            {
             newCompositeNode(grammarAccess.getBibtexEntryTypesRule()); 
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes166);
            iv_ruleBibtexEntryTypes=ruleBibtexEntryTypes();

            state._fsp--;

             current =iv_ruleBibtexEntryTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBibtexEntryTypes176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBibtexEntryTypes"


    // $ANTLR start "ruleBibtexEntryTypes"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:115:1: ruleBibtexEntryTypes returns [EObject current=null] : this_Article_0= ruleArticle ;
    public final EObject ruleBibtexEntryTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Article_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:118:28: (this_Article_0= ruleArticle )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:120:5: this_Article_0= ruleArticle
            {
             
                    newCompositeNode(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleArticle_in_ruleBibtexEntryTypes222);
            this_Article_0=ruleArticle();

            state._fsp--;

             
                    current = this_Article_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBibtexEntryTypes"


    // $ANTLR start "entryRuleArticle"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:136:1: entryRuleArticle returns [EObject current=null] : iv_ruleArticle= ruleArticle EOF ;
    public final EObject entryRuleArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticle = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:137:2: (iv_ruleArticle= ruleArticle EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:138:2: iv_ruleArticle= ruleArticle EOF
            {
             newCompositeNode(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_ruleArticle_in_entryRuleArticle256);
            iv_ruleArticle=ruleArticle();

            state._fsp--;

             current =iv_ruleArticle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticle266); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:145:1: ruleArticle returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_key_6_0 = null;

        EObject lv_author_8_0 = null;

        EObject lv_title_10_0 = null;

        EObject lv_journal_12_0 = null;

        EObject lv_year_14_0 = null;

        EObject lv_volume_16_0 = null;

        EObject lv_number_18_0 = null;

        EObject lv_pages_20_0 = null;

        EObject lv_month_22_0 = null;

        EObject lv_note_24_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:148:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:149:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:149:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:151:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:151:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:152:2: ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getArticleAccess().getUnorderedGroup());
            	
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:155:2: ( ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?)
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:156:3: ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+ {...}?
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:156:3: ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=10;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:158:4: ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:158:4: ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:159:5: {...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:159:102: ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:160:6: ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:163:6: ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:163:7: {...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:163:16: (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:163:18: otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleArticle348); 

            	        	newLeafNode(otherlv_1, grammarAccess.getArticleAccess().getCommercialAtKeyword_0_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:167:1: (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' )
            	    int alt2=3;
            	    switch ( input.LA(1) ) {
            	    case 12:
            	        {
            	        alt2=1;
            	        }
            	        break;
            	    case 13:
            	        {
            	        alt2=2;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt2=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:167:3: otherlv_2= 'ARTICLE'
            	            {
            	            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleArticle361); 

            	                	newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getARTICLEKeyword_0_1_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:172:7: otherlv_3= 'Article'
            	            {
            	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleArticle379); 

            	                	newLeafNode(otherlv_3, grammarAccess.getArticleAccess().getArticleKeyword_0_1_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:177:7: otherlv_4= 'article'
            	            {
            	            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleArticle397); 

            	                	newLeafNode(otherlv_4, grammarAccess.getArticleAccess().getArticleKeyword_0_1_2());
            	                

            	            }
            	            break;

            	    }

            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleArticle410); 

            	        	newLeafNode(otherlv_5, grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_0_2());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:185:1: ( (lv_key_6_0= ruleCiteKey ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:186:1: (lv_key_6_0= ruleCiteKey )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:186:1: (lv_key_6_0= ruleCiteKey )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:187:3: lv_key_6_0= ruleCiteKey
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_0_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleCiteKey_in_ruleArticle431);
            	    lv_key_6_0=ruleCiteKey();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"key",
            	            		lv_key_6_0, 
            	            		"CiteKey");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:203:2: (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:203:4: otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleArticle444); 

            	        	newLeafNode(otherlv_7, grammarAccess.getArticleAccess().getCommaKeyword_0_4_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:207:1: ( (lv_author_8_0= ruleAuthorField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:208:1: (lv_author_8_0= ruleAuthorField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:208:1: (lv_author_8_0= ruleAuthorField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:209:3: lv_author_8_0= ruleAuthorField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_0_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAuthorField_in_ruleArticle465);
            	    lv_author_8_0=ruleAuthorField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"author",
            	            		lv_author_8_0, 
            	            		"AuthorField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:232:4: ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:232:4: ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:233:5: {...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:233:102: ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:234:6: ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:237:6: ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:237:7: {...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:237:16: (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:237:18: otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) )
            	    {
            	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleArticle534); 

            	        	newLeafNode(otherlv_9, grammarAccess.getArticleAccess().getCommaKeyword_1_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:241:1: ( (lv_title_10_0= ruleTitleField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:242:1: (lv_title_10_0= ruleTitleField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:242:1: (lv_title_10_0= ruleTitleField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:243:3: lv_title_10_0= ruleTitleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTitleField_in_ruleArticle555);
            	    lv_title_10_0=ruleTitleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_10_0, 
            	            		"TitleField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:266:4: ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:266:4: ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:267:5: {...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:267:102: ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:268:6: ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:271:6: ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:271:7: {...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:271:16: (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:271:18: otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleArticle623); 

            	        	newLeafNode(otherlv_11, grammarAccess.getArticleAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:275:1: ( (lv_journal_12_0= ruleJournalField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:276:1: (lv_journal_12_0= ruleJournalField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:276:1: (lv_journal_12_0= ruleJournalField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:277:3: lv_journal_12_0= ruleJournalField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJournalField_in_ruleArticle644);
            	    lv_journal_12_0=ruleJournalField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"journal",
            	            		lv_journal_12_0, 
            	            		"JournalField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:300:4: ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:300:4: ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:301:5: {...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:301:102: ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:302:6: ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:305:6: ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:305:7: {...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:305:16: (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:305:18: otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_16_in_ruleArticle712); 

            	        	newLeafNode(otherlv_13, grammarAccess.getArticleAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:309:1: ( (lv_year_14_0= ruleYearField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:310:1: (lv_year_14_0= ruleYearField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:310:1: (lv_year_14_0= ruleYearField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:311:3: lv_year_14_0= ruleYearField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleYearField_in_ruleArticle733);
            	    lv_year_14_0=ruleYearField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"year",
            	            		lv_year_14_0, 
            	            		"YearField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:334:4: ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:334:4: ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:335:5: {...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:335:102: ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:336:6: ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:339:6: ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:339:7: {...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:339:16: (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:339:18: otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_16_in_ruleArticle801); 

            	        	newLeafNode(otherlv_15, grammarAccess.getArticleAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:343:1: ( (lv_volume_16_0= ruleVolumeField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:344:1: (lv_volume_16_0= ruleVolumeField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:344:1: (lv_volume_16_0= ruleVolumeField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:345:3: lv_volume_16_0= ruleVolumeField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVolumeField_in_ruleArticle822);
            	    lv_volume_16_0=ruleVolumeField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"volume",
            	            		lv_volume_16_0, 
            	            		"VolumeField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:368:4: ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:368:4: ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:369:5: {...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:369:102: ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:370:6: ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 5);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:373:6: ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:373:7: {...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:373:16: (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:373:18: otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) )
            	    {
            	    otherlv_17=(Token)match(input,16,FOLLOW_16_in_ruleArticle890); 

            	        	newLeafNode(otherlv_17, grammarAccess.getArticleAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:377:1: ( (lv_number_18_0= ruleNumberField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:378:1: (lv_number_18_0= ruleNumberField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:378:1: (lv_number_18_0= ruleNumberField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:379:3: lv_number_18_0= ruleNumberField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNumberField_in_ruleArticle911);
            	    lv_number_18_0=ruleNumberField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"number",
            	            		lv_number_18_0, 
            	            		"NumberField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:402:4: ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:402:4: ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:403:5: {...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:403:102: ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:404:6: ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 6);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:407:6: ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:407:7: {...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:407:16: (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:407:18: otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleArticle979); 

            	        	newLeafNode(otherlv_19, grammarAccess.getArticleAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:411:1: ( (lv_pages_20_0= rulePagesField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:412:1: (lv_pages_20_0= rulePagesField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:412:1: (lv_pages_20_0= rulePagesField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:413:3: lv_pages_20_0= rulePagesField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePagesField_in_ruleArticle1000);
            	    lv_pages_20_0=rulePagesField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pages",
            	            		lv_pages_20_0, 
            	            		"PagesField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:436:4: ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:436:4: ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:437:5: {...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:437:102: ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:438:6: ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 7);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:441:6: ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:441:7: {...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:441:16: (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:441:18: otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_16_in_ruleArticle1068); 

            	        	newLeafNode(otherlv_21, grammarAccess.getArticleAccess().getCommaKeyword_7_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:445:1: ( (lv_month_22_0= ruleMonthField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:446:1: (lv_month_22_0= ruleMonthField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:446:1: (lv_month_22_0= ruleMonthField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:447:3: lv_month_22_0= ruleMonthField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMonthField_in_ruleArticle1089);
            	    lv_month_22_0=ruleMonthField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"month",
            	            		lv_month_22_0, 
            	            		"MonthField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:470:4: ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:470:4: ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:471:5: {...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:471:102: ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:472:6: ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 8);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:6: ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:7: {...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:16: ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:17: (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}'
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:17: (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==16) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:475:19: otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) )
            	            {
            	            otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleArticle1158); 

            	                	newLeafNode(otherlv_23, grammarAccess.getArticleAccess().getCommaKeyword_8_0_0());
            	                
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:479:1: ( (lv_note_24_0= ruleNoteField ) )
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:480:1: (lv_note_24_0= ruleNoteField )
            	            {
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:480:1: (lv_note_24_0= ruleNoteField )
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:481:3: lv_note_24_0= ruleNoteField
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_8_0_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNoteField_in_ruleArticle1179);
            	            lv_note_24_0=ruleNoteField();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"note",
            	                    		lv_note_24_0, 
            	                    		"NoteField");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_25=(Token)match(input,17,FOLLOW_17_in_ruleArticle1193); 

            	        	newLeafNode(otherlv_25, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_8_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getArticleAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:524:1: entryRuleCiteKey returns [EObject current=null] : iv_ruleCiteKey= ruleCiteKey EOF ;
    public final EObject entryRuleCiteKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCiteKey = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:525:2: (iv_ruleCiteKey= ruleCiteKey EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:526:2: iv_ruleCiteKey= ruleCiteKey EOF
            {
             newCompositeNode(grammarAccess.getCiteKeyRule()); 
            pushFollow(FOLLOW_ruleCiteKey_in_entryRuleCiteKey1275);
            iv_ruleCiteKey=ruleCiteKey();

            state._fsp--;

             current =iv_ruleCiteKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCiteKey1285); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCiteKey"


    // $ANTLR start "ruleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:533:1: ruleCiteKey returns [EObject current=null] : ( (lv_key_0_0= RULE_ID ) ) ;
    public final EObject ruleCiteKey() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:536:28: ( ( (lv_key_0_0= RULE_ID ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:537:1: ( (lv_key_0_0= RULE_ID ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:537:1: ( (lv_key_0_0= RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:538:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:538:1: (lv_key_0_0= RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:539:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCiteKey1326); 

            			newLeafNode(lv_key_0_0, grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCiteKeyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCiteKey"


    // $ANTLR start "entryRuleAuthorField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:563:1: entryRuleAuthorField returns [EObject current=null] : iv_ruleAuthorField= ruleAuthorField EOF ;
    public final EObject entryRuleAuthorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:564:2: (iv_ruleAuthorField= ruleAuthorField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:565:2: iv_ruleAuthorField= ruleAuthorField EOF
            {
             newCompositeNode(grammarAccess.getAuthorFieldRule()); 
            pushFollow(FOLLOW_ruleAuthorField_in_entryRuleAuthorField1366);
            iv_ruleAuthorField=ruleAuthorField();

            state._fsp--;

             current =iv_ruleAuthorField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthorField1376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthorField"


    // $ANTLR start "ruleAuthorField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:572:1: ruleAuthorField returns [EObject current=null] : (otherlv_0= 'author = ' ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) ) ) ;
    public final EObject ruleAuthorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Authors_2 = null;

        EObject this_Authors_5 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:575:28: ( (otherlv_0= 'author = ' ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:576:1: (otherlv_0= 'author = ' ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:576:1: (otherlv_0= 'author = ' ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:576:3: otherlv_0= 'author = ' ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAuthorField1413); 

                	newLeafNode(otherlv_0, grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:580:1: ( (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' ) | (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:580:2: (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:580:2: (otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"' )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:580:4: otherlv_1= '\"' this_Authors_2= ruleAuthors otherlv_3= '\"'
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAuthorField1427); 

                        	newLeafNode(otherlv_1, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAuthors_in_ruleAuthorField1449);
                    this_Authors_2=ruleAuthors();

                    state._fsp--;

                     
                            current = this_Authors_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAuthorField1460); 

                        	newLeafNode(otherlv_3, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:598:6: (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:598:6: (otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}' )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:598:8: otherlv_4= '{' this_Authors_5= ruleAuthors otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAuthorField1480); 

                        	newLeafNode(otherlv_4, grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_1_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAuthors_in_ruleAuthorField1502);
                    this_Authors_5=ruleAuthors();

                    state._fsp--;

                     
                            current = this_Authors_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAuthorField1513); 

                        	newLeafNode(otherlv_6, grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_1_1_2());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthorField"


    // $ANTLR start "entryRuleAuthors"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:623:1: entryRuleAuthors returns [EObject current=null] : iv_ruleAuthors= ruleAuthors EOF ;
    public final EObject entryRuleAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthors = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:624:2: (iv_ruleAuthors= ruleAuthors EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:625:2: iv_ruleAuthors= ruleAuthors EOF
            {
             newCompositeNode(grammarAccess.getAuthorsRule()); 
            pushFollow(FOLLOW_ruleAuthors_in_entryRuleAuthors1551);
            iv_ruleAuthors=ruleAuthors();

            state._fsp--;

             current =iv_ruleAuthors; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthors1561); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthors"


    // $ANTLR start "ruleAuthors"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:632:1: ruleAuthors returns [EObject current=null] : ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )* ) ;
    public final EObject ruleAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_names_0_0 = null;

        EObject lv_names_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:635:28: ( ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )* ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:636:1: ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )* )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:636:1: ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )* )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:636:2: ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )*
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:636:2: ( (lv_names_0_0= ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:637:1: (lv_names_0_0= ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:637:1: (lv_names_0_0= ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:638:3: lv_names_0_0= ruleFullname
            {
             
            	        newCompositeNode(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFullname_in_ruleAuthors1607);
            lv_names_0_0=ruleFullname();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAuthorsRule());
            	        }
                   		add(
                   			current, 
                   			"names",
                    		lv_names_0_0, 
                    		"Fullname");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:654:2: (otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:654:4: otherlv_1= 'and' ( (lv_names_2_0= ruleFullname ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleAuthors1620); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAuthorsAccess().getAndKeyword_1_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:658:1: ( (lv_names_2_0= ruleFullname ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:659:1: (lv_names_2_0= ruleFullname )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:659:1: (lv_names_2_0= ruleFullname )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:660:3: lv_names_2_0= ruleFullname
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFullname_in_ruleAuthors1641);
            	    lv_names_2_0=ruleFullname();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAuthorsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"names",
            	            		lv_names_2_0, 
            	            		"Fullname");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthors"


    // $ANTLR start "entryRuleFullname"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:684:1: entryRuleFullname returns [EObject current=null] : iv_ruleFullname= ruleFullname EOF ;
    public final EObject entryRuleFullname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullname = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:685:2: (iv_ruleFullname= ruleFullname EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:686:2: iv_ruleFullname= ruleFullname EOF
            {
             newCompositeNode(grammarAccess.getFullnameRule()); 
            pushFollow(FOLLOW_ruleFullname_in_entryRuleFullname1679);
            iv_ruleFullname=ruleFullname();

            state._fsp--;

             current =iv_ruleFullname; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullname1689); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullname"


    // $ANTLR start "ruleFullname"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:693:1: ruleFullname returns [EObject current=null] : ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) ) ;
    public final EObject ruleFullname() throws RecognitionException {
        EObject current = null;

        Token lv_lastname_0_0=null;
        Token otherlv_1=null;
        Token lv_firstname_2_0=null;
        Token lv_firstname_3_0=null;
        Token lv_lastname_4_0=null;
        Token lv_firstname_5_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:696:28: ( ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:1: ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:1: ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 17:
                case 19:
                case 20:
                    {
                    alt7=3;
                    }
                    break;
                case 16:
                    {
                    alt7=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt7=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:2: ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:2: ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:3: ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= ',' ( (lv_firstname_2_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:697:3: ( (lv_lastname_0_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:698:1: (lv_lastname_0_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:698:1: (lv_lastname_0_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:699:3: lv_lastname_0_0= RULE_ID
                    {
                    lv_lastname_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname1732); 

                    			newLeafNode(lv_lastname_0_0, grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullnameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lastname",
                            		lv_lastname_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFullname1749); 

                        	newLeafNode(otherlv_1, grammarAccess.getFullnameAccess().getCommaKeyword_0_1());
                        
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:719:1: ( (lv_firstname_2_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:720:1: (lv_firstname_2_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:720:1: (lv_firstname_2_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:721:3: lv_firstname_2_0= RULE_ID
                    {
                    lv_firstname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname1766); 

                    			newLeafNode(lv_firstname_2_0, grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullnameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"firstname",
                            		lv_firstname_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:738:6: ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:738:6: ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:738:7: ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:738:7: ( (lv_firstname_3_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:739:1: (lv_firstname_3_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:739:1: (lv_firstname_3_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:740:3: lv_firstname_3_0= RULE_ID
                    {
                    lv_firstname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname1796); 

                    			newLeafNode(lv_firstname_3_0, grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullnameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"firstname",
                            		lv_firstname_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:756:2: ( (lv_lastname_4_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:757:1: (lv_lastname_4_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:757:1: (lv_lastname_4_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:758:3: lv_lastname_4_0= RULE_ID
                    {
                    lv_lastname_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname1818); 

                    			newLeafNode(lv_lastname_4_0, grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullnameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lastname",
                            		lv_lastname_4_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:775:6: ( (lv_firstname_5_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:775:6: ( (lv_firstname_5_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:776:1: (lv_firstname_5_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:776:1: (lv_firstname_5_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:777:3: lv_firstname_5_0= RULE_ID
                    {
                    lv_firstname_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname1847); 

                    			newLeafNode(lv_firstname_5_0, grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFullnameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"firstname",
                            		lv_firstname_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullname"


    // $ANTLR start "entryRuleTitleField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:801:1: entryRuleTitleField returns [EObject current=null] : iv_ruleTitleField= ruleTitleField EOF ;
    public final EObject entryRuleTitleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:802:2: (iv_ruleTitleField= ruleTitleField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:803:2: iv_ruleTitleField= ruleTitleField EOF
            {
             newCompositeNode(grammarAccess.getTitleFieldRule()); 
            pushFollow(FOLLOW_ruleTitleField_in_entryRuleTitleField1888);
            iv_ruleTitleField=ruleTitleField();

            state._fsp--;

             current =iv_ruleTitleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitleField1898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitleField"


    // $ANTLR start "ruleTitleField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:810:1: ruleTitleField returns [EObject current=null] : (otherlv_0= 'title = ' ( (lv_title_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:813:28: ( (otherlv_0= 'title = ' ( (lv_title_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:814:1: (otherlv_0= 'title = ' ( (lv_title_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:814:1: (otherlv_0= 'title = ' ( (lv_title_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:814:3: otherlv_0= 'title = ' ( (lv_title_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleTitleField1935); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleFieldAccess().getTitleKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:818:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:819:1: (lv_title_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:819:1: (lv_title_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:820:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitleField1952); 

            			newLeafNode(lv_title_1_0, grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTitleFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitleField"


    // $ANTLR start "entryRuleJournalField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:844:1: entryRuleJournalField returns [EObject current=null] : iv_ruleJournalField= ruleJournalField EOF ;
    public final EObject entryRuleJournalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:845:2: (iv_ruleJournalField= ruleJournalField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:846:2: iv_ruleJournalField= ruleJournalField EOF
            {
             newCompositeNode(grammarAccess.getJournalFieldRule()); 
            pushFollow(FOLLOW_ruleJournalField_in_entryRuleJournalField1993);
            iv_ruleJournalField=ruleJournalField();

            state._fsp--;

             current =iv_ruleJournalField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJournalField2003); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJournalField"


    // $ANTLR start "ruleJournalField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:853:1: ruleJournalField returns [EObject current=null] : (otherlv_0= 'journal = ' ( (lv_journal_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleJournalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_journal_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:856:28: ( (otherlv_0= 'journal = ' ( (lv_journal_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:857:1: (otherlv_0= 'journal = ' ( (lv_journal_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:857:1: (otherlv_0= 'journal = ' ( (lv_journal_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:857:3: otherlv_0= 'journal = ' ( (lv_journal_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleJournalField2040); 

                	newLeafNode(otherlv_0, grammarAccess.getJournalFieldAccess().getJournalKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:861:1: ( (lv_journal_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:862:1: (lv_journal_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:862:1: (lv_journal_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:863:3: lv_journal_1_0= RULE_STRING
            {
            lv_journal_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJournalField2057); 

            			newLeafNode(lv_journal_1_0, grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJournalFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"journal",
                    		lv_journal_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJournalField"


    // $ANTLR start "entryRuleYearField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:887:1: entryRuleYearField returns [EObject current=null] : iv_ruleYearField= ruleYearField EOF ;
    public final EObject entryRuleYearField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYearField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:888:2: (iv_ruleYearField= ruleYearField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:889:2: iv_ruleYearField= ruleYearField EOF
            {
             newCompositeNode(grammarAccess.getYearFieldRule()); 
            pushFollow(FOLLOW_ruleYearField_in_entryRuleYearField2098);
            iv_ruleYearField=ruleYearField();

            state._fsp--;

             current =iv_ruleYearField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYearField2108); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYearField"


    // $ANTLR start "ruleYearField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:896:1: ruleYearField returns [EObject current=null] : (otherlv_0= 'year = ' ( (lv_year_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleYearField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_year_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:899:28: ( (otherlv_0= 'year = ' ( (lv_year_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:900:1: (otherlv_0= 'year = ' ( (lv_year_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:900:1: (otherlv_0= 'year = ' ( (lv_year_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:900:3: otherlv_0= 'year = ' ( (lv_year_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleYearField2145); 

                	newLeafNode(otherlv_0, grammarAccess.getYearFieldAccess().getYearKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:904:1: ( (lv_year_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:905:1: (lv_year_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:905:1: (lv_year_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:906:3: lv_year_1_0= RULE_STRING
            {
            lv_year_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleYearField2162); 

            			newLeafNode(lv_year_1_0, grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getYearFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYearField"


    // $ANTLR start "entryRuleVolumeField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:930:1: entryRuleVolumeField returns [EObject current=null] : iv_ruleVolumeField= ruleVolumeField EOF ;
    public final EObject entryRuleVolumeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:931:2: (iv_ruleVolumeField= ruleVolumeField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:932:2: iv_ruleVolumeField= ruleVolumeField EOF
            {
             newCompositeNode(grammarAccess.getVolumeFieldRule()); 
            pushFollow(FOLLOW_ruleVolumeField_in_entryRuleVolumeField2203);
            iv_ruleVolumeField=ruleVolumeField();

            state._fsp--;

             current =iv_ruleVolumeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolumeField2213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVolumeField"


    // $ANTLR start "ruleVolumeField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:939:1: ruleVolumeField returns [EObject current=null] : (otherlv_0= 'volume = ' ( (lv_volume_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVolumeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_volume_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:942:28: ( (otherlv_0= 'volume = ' ( (lv_volume_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:943:1: (otherlv_0= 'volume = ' ( (lv_volume_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:943:1: (otherlv_0= 'volume = ' ( (lv_volume_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:943:3: otherlv_0= 'volume = ' ( (lv_volume_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleVolumeField2250); 

                	newLeafNode(otherlv_0, grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:947:1: ( (lv_volume_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:948:1: (lv_volume_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:948:1: (lv_volume_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:949:3: lv_volume_1_0= RULE_STRING
            {
            lv_volume_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVolumeField2267); 

            			newLeafNode(lv_volume_1_0, grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"volume",
                    		lv_volume_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVolumeField"


    // $ANTLR start "entryRuleNumberField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:973:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:974:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:975:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField2308);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField2318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberField"


    // $ANTLR start "ruleNumberField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:982:1: ruleNumberField returns [EObject current=null] : (otherlv_0= 'number = ' ( (lv_number_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_number_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:985:28: ( (otherlv_0= 'number = ' ( (lv_number_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:986:1: (otherlv_0= 'number = ' ( (lv_number_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:986:1: (otherlv_0= 'number = ' ( (lv_number_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:986:3: otherlv_0= 'number = ' ( (lv_number_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleNumberField2355); 

                	newLeafNode(otherlv_0, grammarAccess.getNumberFieldAccess().getNumberKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:990:1: ( (lv_number_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:991:1: (lv_number_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:991:1: (lv_number_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:992:3: lv_number_1_0= RULE_STRING
            {
            lv_number_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberField2372); 

            			newLeafNode(lv_number_1_0, grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberField"


    // $ANTLR start "entryRulePagesField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1016:1: entryRulePagesField returns [EObject current=null] : iv_rulePagesField= rulePagesField EOF ;
    public final EObject entryRulePagesField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagesField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1017:2: (iv_rulePagesField= rulePagesField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1018:2: iv_rulePagesField= rulePagesField EOF
            {
             newCompositeNode(grammarAccess.getPagesFieldRule()); 
            pushFollow(FOLLOW_rulePagesField_in_entryRulePagesField2413);
            iv_rulePagesField=rulePagesField();

            state._fsp--;

             current =iv_rulePagesField; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePagesField2423); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePagesField"


    // $ANTLR start "rulePagesField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1025:1: rulePagesField returns [EObject current=null] : (otherlv_0= 'pages = ' ( (lv_pages_1_0= RULE_STRING ) ) ) ;
    public final EObject rulePagesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pages_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1028:28: ( (otherlv_0= 'pages = ' ( (lv_pages_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1029:1: (otherlv_0= 'pages = ' ( (lv_pages_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1029:1: (otherlv_0= 'pages = ' ( (lv_pages_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1029:3: otherlv_0= 'pages = ' ( (lv_pages_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_rulePagesField2460); 

                	newLeafNode(otherlv_0, grammarAccess.getPagesFieldAccess().getPagesKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1033:1: ( (lv_pages_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1034:1: (lv_pages_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1034:1: (lv_pages_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1035:3: lv_pages_1_0= RULE_STRING
            {
            lv_pages_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePagesField2477); 

            			newLeafNode(lv_pages_1_0, grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPagesFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pages",
                    		lv_pages_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePagesField"


    // $ANTLR start "entryRuleMonthField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1059:1: entryRuleMonthField returns [EObject current=null] : iv_ruleMonthField= ruleMonthField EOF ;
    public final EObject entryRuleMonthField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1060:2: (iv_ruleMonthField= ruleMonthField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1061:2: iv_ruleMonthField= ruleMonthField EOF
            {
             newCompositeNode(grammarAccess.getMonthFieldRule()); 
            pushFollow(FOLLOW_ruleMonthField_in_entryRuleMonthField2518);
            iv_ruleMonthField=ruleMonthField();

            state._fsp--;

             current =iv_ruleMonthField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonthField2528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMonthField"


    // $ANTLR start "ruleMonthField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1068:1: ruleMonthField returns [EObject current=null] : (otherlv_0= 'month = ' ( (lv_month_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMonthField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_month_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1071:28: ( (otherlv_0= 'month = ' ( (lv_month_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1072:1: (otherlv_0= 'month = ' ( (lv_month_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1072:1: (otherlv_0= 'month = ' ( (lv_month_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1072:3: otherlv_0= 'month = ' ( (lv_month_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMonthField2565); 

                	newLeafNode(otherlv_0, grammarAccess.getMonthFieldAccess().getMonthKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1076:1: ( (lv_month_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1077:1: (lv_month_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1077:1: (lv_month_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1078:3: lv_month_1_0= RULE_STRING
            {
            lv_month_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMonthField2582); 

            			newLeafNode(lv_month_1_0, grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonthFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"month",
                    		lv_month_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMonthField"


    // $ANTLR start "entryRuleNoteField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1102:1: entryRuleNoteField returns [EObject current=null] : iv_ruleNoteField= ruleNoteField EOF ;
    public final EObject entryRuleNoteField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1103:2: (iv_ruleNoteField= ruleNoteField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1104:2: iv_ruleNoteField= ruleNoteField EOF
            {
             newCompositeNode(grammarAccess.getNoteFieldRule()); 
            pushFollow(FOLLOW_ruleNoteField_in_entryRuleNoteField2623);
            iv_ruleNoteField=ruleNoteField();

            state._fsp--;

             current =iv_ruleNoteField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteField2633); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoteField"


    // $ANTLR start "ruleNoteField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1111:1: ruleNoteField returns [EObject current=null] : (otherlv_0= 'note = ' ( (lv_note_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleNoteField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_note_1_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1114:28: ( (otherlv_0= 'note = ' ( (lv_note_1_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1115:1: (otherlv_0= 'note = ' ( (lv_note_1_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1115:1: (otherlv_0= 'note = ' ( (lv_note_1_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1115:3: otherlv_0= 'note = ' ( (lv_note_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleNoteField2670); 

                	newLeafNode(otherlv_0, grammarAccess.getNoteFieldAccess().getNoteKeyword_0());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1119:1: ( (lv_note_1_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1120:1: (lv_note_1_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1120:1: (lv_note_1_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeX.g:1121:3: lv_note_1_0= RULE_STRING
            {
            lv_note_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNoteField2687); 

            			newLeafNode(lv_note_1_0, grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoteField"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\16\uffff";
    static final String DFA4_eofS =
        "\1\1\15\uffff";
    static final String DFA4_minS =
        "\1\13\1\uffff\3\0\11\uffff";
    static final String DFA4_maxS =
        "\1\21\1\uffff\3\0\11\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\12\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA4_specialS =
        "\2\uffff\1\2\1\0\1\1\11\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\4\uffff\1\3\1\4",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 156:3: ( ({...}? => ( ({...}? => (otherlv_1= '@' (otherlv_2= 'ARTICLE' | otherlv_3= 'Article' | otherlv_4= 'article' ) otherlv_5= '{' ( (lv_key_6_0= ruleCiteKey ) ) (otherlv_7= ',' ( (lv_author_8_0= ruleAuthorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= ',' ( (lv_title_10_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= ',' ( (lv_journal_12_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= ',' ( (lv_year_14_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= ',' ( (lv_volume_16_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_number_18_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= ',' ( (lv_pages_20_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= ',' ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_23= ',' ( (lv_note_24_0= ruleNoteField ) ) )? otherlv_25= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_3 = input.LA(1);

                         
                        int index4_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 6;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 12;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index4_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_4 = input.LA(1);

                         
                        int index4_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 13;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index4_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 5;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_ruleModel130 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBibtexEntryTypes176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_ruleBibtexEntryTypes222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_entryRuleArticle256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticle266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleArticle348 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_12_in_ruleArticle361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13_in_ruleArticle379 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14_in_ruleArticle397 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArticle410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleCiteKey_in_ruleArticle431 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArticle444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleAuthorField_in_ruleArticle465 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle534 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleTitleField_in_ruleArticle555 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle623 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleJournalField_in_ruleArticle644 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle712 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleYearField_in_ruleArticle733 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle801 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleVolumeField_in_ruleArticle822 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle890 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleArticle911 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle979 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rulePagesField_in_ruleArticle1000 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle1068 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleMonthField_in_ruleArticle1089 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_16_in_ruleArticle1158 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleNoteField_in_ruleArticle1179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArticle1193 = new BitSet(new long[]{0x0000000000030802L});
    public static final BitSet FOLLOW_ruleCiteKey_in_entryRuleCiteKey1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCiteKey1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCiteKey1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_entryRuleAuthorField1366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthorField1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAuthorField1413 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_19_in_ruleAuthorField1427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAuthors_in_ruleAuthorField1449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAuthorField1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAuthorField1480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAuthors_in_ruleAuthorField1502 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAuthorField1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_entryRuleAuthors1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthors1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_ruleAuthors1607 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAuthors1620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFullname_in_ruleAuthors1641 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleFullname_in_entryRuleFullname1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullname1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname1732 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFullname1749 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname1796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_entryRuleTitleField1888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitleField1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTitleField1935 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitleField1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_entryRuleJournalField1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJournalField2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleJournalField2040 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJournalField2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_entryRuleYearField2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYearField2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleYearField2145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleYearField2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_entryRuleVolumeField2203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolumeField2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVolumeField2250 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVolumeField2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleNumberField2355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberField2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_entryRulePagesField2413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePagesField2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePagesField2460 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePagesField2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_entryRuleMonthField2518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonthField2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMonthField2565 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMonthField2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_entryRuleNoteField2623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteField2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNoteField2670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNoteField2687 = new BitSet(new long[]{0x0000000000000002L});

}
