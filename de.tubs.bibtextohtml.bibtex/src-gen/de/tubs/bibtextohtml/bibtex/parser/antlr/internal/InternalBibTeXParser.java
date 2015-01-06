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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Publisher", "Address", "Article", "Edition", "Journal", "Author", "Editor", "Number", "Series", "Volume", "Month", "Pages", "Title", "Book", "Isbn", "Note", "Year", "And", "QuotationMark", "Comma", "EqualsSign", "CommercialAt", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Address=5;
    public static final int Article=6;
    public static final int Journal=8;
    public static final int RULE_STRING=30;
    public static final int QuotationMark=22;
    public static final int RULE_SL_COMMENT=32;
    public static final int Month=14;
    public static final int Comma=23;
    public static final int EqualsSign=24;
    public static final int Number=11;
    public static final int Book=17;
    public static final int RightCurlyBracket=27;
    public static final int EOF=-1;
    public static final int RULE_ID=28;
    public static final int RULE_WS=33;
    public static final int LeftCurlyBracket=26;
    public static final int Title=16;
    public static final int Publisher=4;
    public static final int RULE_ANY_OTHER=34;
    public static final int Edition=7;
    public static final int CommercialAt=25;
    public static final int Pages=15;
    public static final int Series=12;
    public static final int Isbn=18;
    public static final int Year=20;
    public static final int Volume=13;
    public static final int And=21;
    public static final int RULE_INT=29;
    public static final int Note=19;
    public static final int RULE_ML_COMMENT=31;
    public static final int Author=9;
    public static final int Editor=10;

    // delegates
    // delegators


        public InternalBibTeXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBibTeXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBibTeXParser.tokenNames; }
    public String getGrammarFileName() { return "../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g"; }




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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:70:1: ruleModel returns [EObject current=null] : ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_BibtexEntries_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:73:28: ( ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )* )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:74:1: ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )*
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:74:1: ( (lv_BibtexEntries_0_0= ruleBibtexEntryTypes ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CommercialAt) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:75:1: (lv_BibtexEntries_0_0= ruleBibtexEntryTypes )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:75:1: (lv_BibtexEntries_0_0= ruleBibtexEntryTypes )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:76:3: lv_BibtexEntries_0_0= ruleBibtexEntryTypes
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBibtexEntryTypes_in_ruleModel122);
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:100:1: entryRuleBibtexEntryTypes returns [EObject current=null] : iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF ;
    public final EObject entryRuleBibtexEntryTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBibtexEntryTypes = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:101:2: (iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:102:2: iv_ruleBibtexEntryTypes= ruleBibtexEntryTypes EOF
            {
             newCompositeNode(grammarAccess.getBibtexEntryTypesRule()); 
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes157);
            iv_ruleBibtexEntryTypes=ruleBibtexEntryTypes();

            state._fsp--;

             current =iv_ruleBibtexEntryTypes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBibtexEntryTypes167); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:109:1: ruleBibtexEntryTypes returns [EObject current=null] : (this_Article_0= ruleArticle | this_Book_1= ruleBook ) ;
    public final EObject ruleBibtexEntryTypes() throws RecognitionException {
        EObject current = null;

        EObject this_Article_0 = null;

        EObject this_Book_1 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:112:28: ( (this_Article_0= ruleArticle | this_Book_1= ruleBook ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:113:1: (this_Article_0= ruleArticle | this_Book_1= ruleBook )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:113:1: (this_Article_0= ruleArticle | this_Book_1= ruleBook )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CommercialAt) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Article) ) {
                    alt2=1;
                }
                else if ( (LA2_1==Book) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:114:5: this_Article_0= ruleArticle
                    {
                     
                            newCompositeNode(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleArticle_in_ruleBibtexEntryTypes214);
                    this_Article_0=ruleArticle();

                    state._fsp--;


                            current = this_Article_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:124:5: this_Book_1= ruleBook
                    {
                     
                            newCompositeNode(grammarAccess.getBibtexEntryTypesAccess().getBookParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBook_in_ruleBibtexEntryTypes241);
                    this_Book_1=ruleBook();

                    state._fsp--;


                            current = this_Book_1;
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleBibtexEntryTypes"


    // $ANTLR start "entryRuleArticle"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:140:1: entryRuleArticle returns [EObject current=null] : iv_ruleArticle= ruleArticle EOF ;
    public final EObject entryRuleArticle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArticle = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:141:2: (iv_ruleArticle= ruleArticle EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:142:2: iv_ruleArticle= ruleArticle EOF
            {
             newCompositeNode(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_ruleArticle_in_entryRuleArticle275);
            iv_ruleArticle=ruleArticle();

            state._fsp--;

             current =iv_ruleArticle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticle285); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:149:1: ruleArticle returns [EObject current=null] : (otherlv_0= CommercialAt otherlv_1= Article otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_25= RightCurlyBracket ) ;
    public final EObject ruleArticle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        EObject lv_key_3_0 = null;

        EObject lv_author_6_0 = null;

        EObject lv_title_8_0 = null;

        EObject lv_journal_10_0 = null;

        EObject lv_year_12_0 = null;

        EObject lv_volume_14_0 = null;

        EObject lv_number_16_0 = null;

        EObject lv_pages_18_0 = null;

        EObject lv_month_20_0 = null;

        EObject lv_note_22_0 = null;

        EObject lv_unknowns_24_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:152:28: ( (otherlv_0= CommercialAt otherlv_1= Article otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_25= RightCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:153:1: (otherlv_0= CommercialAt otherlv_1= Article otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_25= RightCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:153:1: (otherlv_0= CommercialAt otherlv_1= Article otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_25= RightCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:154:2: otherlv_0= CommercialAt otherlv_1= Article otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_25= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,CommercialAt,FOLLOW_CommercialAt_in_ruleArticle323); 

                	newLeafNode(otherlv_0, grammarAccess.getArticleAccess().getCommercialAtKeyword_0());
                
            otherlv_1=(Token)match(input,Article,FOLLOW_Article_in_ruleArticle335); 

                	newLeafNode(otherlv_1, grammarAccess.getArticleAccess().getArticleKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleArticle347); 

                	newLeafNode(otherlv_2, grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:168:1: ( (lv_key_3_0= ruleCiteKey ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:169:1: (lv_key_3_0= ruleCiteKey )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:169:1: (lv_key_3_0= ruleCiteKey )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:170:3: lv_key_3_0= ruleCiteKey
            {
             
            	        newCompositeNode(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCiteKey_in_ruleArticle367);
            lv_key_3_0=ruleCiteKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_3_0, 
                    		"CiteKey");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:186:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:188:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:188:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:189:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:192:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?)
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:193:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:193:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=11;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:195:4: ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:195:4: ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:196:5: {...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:196:104: ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:197:6: ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:200:6: ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:200:7: {...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:200:16: (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:201:2: otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle426); 

            	        	newLeafNode(otherlv_5, grammarAccess.getArticleAccess().getCommaKeyword_4_0_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:205:1: ( (lv_author_6_0= ruleAuthorField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:206:1: (lv_author_6_0= ruleAuthorField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:206:1: (lv_author_6_0= ruleAuthorField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:207:3: lv_author_6_0= ruleAuthorField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_4_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAuthorField_in_ruleArticle446);
            	    lv_author_6_0=ruleAuthorField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"author",
            	            		lv_author_6_0, 
            	            		"AuthorField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:230:4: ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:230:4: ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:231:5: {...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:231:104: ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:232:6: ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:235:6: ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:235:7: {...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:235:16: (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:236:2: otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) )
            	    {
            	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle515); 

            	        	newLeafNode(otherlv_7, grammarAccess.getArticleAccess().getCommaKeyword_4_1_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:240:1: ( (lv_title_8_0= ruleTitleField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:241:1: (lv_title_8_0= ruleTitleField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:241:1: (lv_title_8_0= ruleTitleField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:242:3: lv_title_8_0= ruleTitleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTitleField_in_ruleArticle535);
            	    lv_title_8_0=ruleTitleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_8_0, 
            	            		"TitleField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:265:4: ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:265:4: ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:266:5: {...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:266:104: ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:267:6: ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:270:6: ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:270:7: {...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:270:16: (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:271:2: otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) )
            	    {
            	    otherlv_9=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle604); 

            	        	newLeafNode(otherlv_9, grammarAccess.getArticleAccess().getCommaKeyword_4_2_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:275:1: ( (lv_journal_10_0= ruleJournalField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:276:1: (lv_journal_10_0= ruleJournalField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:276:1: (lv_journal_10_0= ruleJournalField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:277:3: lv_journal_10_0= ruleJournalField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_4_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJournalField_in_ruleArticle624);
            	    lv_journal_10_0=ruleJournalField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"journal",
            	            		lv_journal_10_0, 
            	            		"JournalField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:300:4: ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:300:4: ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:301:5: {...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:301:104: ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:302:6: ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:305:6: ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:305:7: {...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:305:16: (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:306:2: otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) )
            	    {
            	    otherlv_11=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle693); 

            	        	newLeafNode(otherlv_11, grammarAccess.getArticleAccess().getCommaKeyword_4_3_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:310:1: ( (lv_year_12_0= ruleYearField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:311:1: (lv_year_12_0= ruleYearField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:311:1: (lv_year_12_0= ruleYearField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:312:3: lv_year_12_0= ruleYearField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleYearField_in_ruleArticle713);
            	    lv_year_12_0=ruleYearField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"year",
            	            		lv_year_12_0, 
            	            		"YearField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:335:4: ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:335:4: ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:336:5: {...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:336:104: ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:337:6: ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:340:6: ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:340:7: {...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:340:16: (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:341:2: otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) )
            	    {
            	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle782); 

            	        	newLeafNode(otherlv_13, grammarAccess.getArticleAccess().getCommaKeyword_4_4_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:345:1: ( (lv_volume_14_0= ruleVolumeField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:346:1: (lv_volume_14_0= ruleVolumeField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:346:1: (lv_volume_14_0= ruleVolumeField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:347:3: lv_volume_14_0= ruleVolumeField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleVolumeField_in_ruleArticle802);
            	    lv_volume_14_0=ruleVolumeField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"volume",
            	            		lv_volume_14_0, 
            	            		"VolumeField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:370:4: ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:370:4: ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:371:5: {...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:371:104: ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:372:6: ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:375:6: ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:375:7: {...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:375:16: (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:376:2: otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) )
            	    {
            	    otherlv_15=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle871); 

            	        	newLeafNode(otherlv_15, grammarAccess.getArticleAccess().getCommaKeyword_4_5_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:380:1: ( (lv_number_16_0= ruleNumberField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:381:1: (lv_number_16_0= ruleNumberField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:381:1: (lv_number_16_0= ruleNumberField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:382:3: lv_number_16_0= ruleNumberField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_4_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNumberField_in_ruleArticle891);
            	    lv_number_16_0=ruleNumberField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"number",
            	            		lv_number_16_0, 
            	            		"NumberField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:405:4: ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:405:4: ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:406:5: {...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:406:104: ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:407:6: ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:410:6: ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:410:7: {...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:410:16: (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:411:2: otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) )
            	    {
            	    otherlv_17=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle960); 

            	        	newLeafNode(otherlv_17, grammarAccess.getArticleAccess().getCommaKeyword_4_6_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:415:1: ( (lv_pages_18_0= rulePagesField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:416:1: (lv_pages_18_0= rulePagesField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:416:1: (lv_pages_18_0= rulePagesField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:417:3: lv_pages_18_0= rulePagesField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_4_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePagesField_in_ruleArticle980);
            	    lv_pages_18_0=rulePagesField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"pages",
            	            		lv_pages_18_0, 
            	            		"PagesField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:440:4: ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:440:4: ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:441:5: {...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:441:104: ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:442:6: ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:445:6: ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:445:7: {...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:445:16: (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:446:2: otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) )
            	    {
            	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle1049); 

            	        	newLeafNode(otherlv_19, grammarAccess.getArticleAccess().getCommaKeyword_4_7_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:450:1: ( (lv_month_20_0= ruleMonthField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:451:1: (lv_month_20_0= ruleMonthField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:451:1: (lv_month_20_0= ruleMonthField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:452:3: lv_month_20_0= ruleMonthField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_4_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMonthField_in_ruleArticle1069);
            	    lv_month_20_0=ruleMonthField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"month",
            	            		lv_month_20_0, 
            	            		"MonthField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:475:4: ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:475:4: ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:476:5: {...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:476:104: ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:477:6: ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:480:6: ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:480:7: {...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:480:16: (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:481:2: otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) )
            	    {
            	    otherlv_21=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle1138); 

            	        	newLeafNode(otherlv_21, grammarAccess.getArticleAccess().getCommaKeyword_4_8_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:485:1: ( (lv_note_22_0= ruleNoteField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:486:1: (lv_note_22_0= ruleNoteField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:486:1: (lv_note_22_0= ruleNoteField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:487:3: lv_note_22_0= ruleNoteField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_4_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoteField_in_ruleArticle1158);
            	    lv_note_22_0=ruleNoteField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"note",
            	            		lv_note_22_0, 
            	            		"NoteField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:510:4: ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:510:4: ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:511:5: {...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:511:104: ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:512:6: ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:515:6: ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==Comma) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:515:7: {...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleArticle", "true");
            	    	    }
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:515:16: (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:516:2: otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleArticle1227); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getArticleAccess().getCommaKeyword_4_9_0());
            	    	        
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:520:1: ( (lv_unknowns_24_0= ruleUnknownField ) )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:521:1: (lv_unknowns_24_0= ruleUnknownField )
            	    	    {
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:521:1: (lv_unknowns_24_0= ruleUnknownField )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:522:3: lv_unknowns_24_0= ruleUnknownField
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getArticleAccess().getUnknownsUnknownFieldParserRuleCall_4_9_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUnknownField_in_ruleArticle1247);
            	    	    lv_unknowns_24_0=ruleUnknownField();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getArticleRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"unknowns",
            	    	            		lv_unknowns_24_0, 
            	    	            		"UnknownField");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleArticle", "getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	

            }

            otherlv_25=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleArticle1308); 

                	newLeafNode(otherlv_25, grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleBook"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:566:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:567:2: (iv_ruleBook= ruleBook EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:568:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_ruleBook_in_entryRuleBook1342);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBook1352); 

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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:575:1: ruleBook returns [EObject current=null] : (otherlv_0= CommercialAt otherlv_1= Book otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_29= RightCurlyBracket ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        Token otherlv_27=null;
        Token otherlv_29=null;
        EObject lv_key_3_0 = null;

        EObject lv_author_editor_6_1 = null;

        EObject lv_author_editor_6_2 = null;

        EObject lv_title_8_0 = null;

        EObject lv_publisher_10_0 = null;

        EObject lv_year_12_0 = null;

        EObject lv_volume_number_14_1 = null;

        EObject lv_volume_number_14_2 = null;

        EObject lv_series_16_0 = null;

        EObject lv_address_18_0 = null;

        EObject lv_edition_20_0 = null;

        EObject lv_month_22_0 = null;

        EObject lv_isbn_24_0 = null;

        EObject lv_note_26_0 = null;

        EObject lv_unknowns_28_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:578:28: ( (otherlv_0= CommercialAt otherlv_1= Book otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_29= RightCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:579:1: (otherlv_0= CommercialAt otherlv_1= Book otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_29= RightCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:579:1: (otherlv_0= CommercialAt otherlv_1= Book otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_29= RightCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:580:2: otherlv_0= CommercialAt otherlv_1= Book otherlv_2= LeftCurlyBracket ( (lv_key_3_0= ruleCiteKey ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_29= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,CommercialAt,FOLLOW_CommercialAt_in_ruleBook1390); 

                	newLeafNode(otherlv_0, grammarAccess.getBookAccess().getCommercialAtKeyword_0());
                
            otherlv_1=(Token)match(input,Book,FOLLOW_Book_in_ruleBook1402); 

                	newLeafNode(otherlv_1, grammarAccess.getBookAccess().getBookKeyword_1());
                
            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleBook1414); 

                	newLeafNode(otherlv_2, grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:594:1: ( (lv_key_3_0= ruleCiteKey ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:595:1: (lv_key_3_0= ruleCiteKey )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:595:1: (lv_key_3_0= ruleCiteKey )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:596:3: lv_key_3_0= ruleCiteKey
            {
             
            	        newCompositeNode(grammarAccess.getBookAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCiteKey_in_ruleBook1434);
            lv_key_3_0=ruleCiteKey();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_3_0, 
                    		"CiteKey");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:612:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:614:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:614:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:615:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:618:2: ( ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?)
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:619:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+ {...}?
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:619:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=13;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:621:4: ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:621:4: ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:622:5: {...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:622:101: ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:623:6: ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:626:6: ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:626:7: {...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:626:16: (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:627:2: otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1493); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBookAccess().getCommaKeyword_4_0_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:631:1: ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:632:1: ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:632:1: ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:633:1: (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:633:1: (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==Author) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==Editor) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:634:3: lv_author_editor_6_1= ruleAuthorField
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBookAccess().getAuthor_editorAuthorFieldParserRuleCall_4_0_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAuthorField_in_ruleBook1515);
            	            lv_author_editor_6_1=ruleAuthorField();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"author_editor",
            	                    		lv_author_editor_6_1, 
            	                    		"AuthorField");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:649:8: lv_author_editor_6_2= ruleEditorField
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBookAccess().getAuthor_editorEditorFieldParserRuleCall_4_0_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleEditorField_in_ruleBook1534);
            	            lv_author_editor_6_2=ruleEditorField();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"author_editor",
            	                    		lv_author_editor_6_2, 
            	                    		"EditorField");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:674:4: ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:674:4: ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:675:5: {...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:675:101: ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:676:6: ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:679:6: ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:679:7: {...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:679:16: (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:680:2: otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) )
            	    {
            	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1606); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBookAccess().getCommaKeyword_4_1_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:684:1: ( (lv_title_8_0= ruleTitleField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:685:1: (lv_title_8_0= ruleTitleField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:685:1: (lv_title_8_0= ruleTitleField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:686:3: lv_title_8_0= ruleTitleField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTitleField_in_ruleBook1626);
            	    lv_title_8_0=ruleTitleField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_8_0, 
            	            		"TitleField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:709:4: ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:709:4: ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:710:5: {...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:710:101: ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:711:6: ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:714:6: ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:714:7: {...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:714:16: (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:715:2: otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) )
            	    {
            	    otherlv_9=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1695); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBookAccess().getCommaKeyword_4_2_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:719:1: ( (lv_publisher_10_0= rulePublisherField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:720:1: (lv_publisher_10_0= rulePublisherField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:720:1: (lv_publisher_10_0= rulePublisherField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:721:3: lv_publisher_10_0= rulePublisherField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getPublisherPublisherFieldParserRuleCall_4_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePublisherField_in_ruleBook1715);
            	    lv_publisher_10_0=rulePublisherField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"publisher",
            	            		lv_publisher_10_0, 
            	            		"PublisherField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:744:4: ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:744:4: ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:745:5: {...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:745:101: ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:746:6: ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:749:6: ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:749:7: {...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:749:16: (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:750:2: otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) )
            	    {
            	    otherlv_11=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1784); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBookAccess().getCommaKeyword_4_3_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:754:1: ( (lv_year_12_0= ruleYearField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:755:1: (lv_year_12_0= ruleYearField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:755:1: (lv_year_12_0= ruleYearField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:756:3: lv_year_12_0= ruleYearField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleYearField_in_ruleBook1804);
            	    lv_year_12_0=ruleYearField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"year",
            	            		lv_year_12_0, 
            	            		"YearField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:779:4: ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:779:4: ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:780:5: {...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:780:101: ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:781:6: ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:784:6: ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:784:7: {...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:784:16: (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:785:2: otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) )
            	    {
            	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1873); 

            	        	newLeafNode(otherlv_13, grammarAccess.getBookAccess().getCommaKeyword_4_4_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:789:1: ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:790:1: ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:790:1: ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:791:1: (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:791:1: (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==Volume) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==Number) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:792:3: lv_volume_number_14_1= ruleVolumeField
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBookAccess().getVolume_numberVolumeFieldParserRuleCall_4_4_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleVolumeField_in_ruleBook1895);
            	            lv_volume_number_14_1=ruleVolumeField();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"volume_number",
            	                    		lv_volume_number_14_1, 
            	                    		"VolumeField");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:807:8: lv_volume_number_14_2= ruleNumberField
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBookAccess().getVolume_numberNumberFieldParserRuleCall_4_4_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNumberField_in_ruleBook1914);
            	            lv_volume_number_14_2=ruleNumberField();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBookRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"volume_number",
            	                    		lv_volume_number_14_2, 
            	                    		"NumberField");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:832:4: ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:832:4: ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:833:5: {...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:833:101: ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:834:6: ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:837:6: ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:837:7: {...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:837:16: (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:838:2: otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) )
            	    {
            	    otherlv_15=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook1986); 

            	        	newLeafNode(otherlv_15, grammarAccess.getBookAccess().getCommaKeyword_4_5_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:842:1: ( (lv_series_16_0= ruleSeriesField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:843:1: (lv_series_16_0= ruleSeriesField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:843:1: (lv_series_16_0= ruleSeriesField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:844:3: lv_series_16_0= ruleSeriesField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getSeriesSeriesFieldParserRuleCall_4_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSeriesField_in_ruleBook2006);
            	    lv_series_16_0=ruleSeriesField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"series",
            	            		lv_series_16_0, 
            	            		"SeriesField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:867:4: ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:867:4: ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:868:5: {...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:868:101: ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:869:6: ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:872:6: ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:872:7: {...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:872:16: (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:873:2: otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) )
            	    {
            	    otherlv_17=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2075); 

            	        	newLeafNode(otherlv_17, grammarAccess.getBookAccess().getCommaKeyword_4_6_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:877:1: ( (lv_address_18_0= ruleAddressField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:878:1: (lv_address_18_0= ruleAddressField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:878:1: (lv_address_18_0= ruleAddressField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:879:3: lv_address_18_0= ruleAddressField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getAddressAddressFieldParserRuleCall_4_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAddressField_in_ruleBook2095);
            	    lv_address_18_0=ruleAddressField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"address",
            	            		lv_address_18_0, 
            	            		"AddressField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:902:4: ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:902:4: ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:903:5: {...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:903:101: ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:904:6: ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:907:6: ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:907:7: {...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:907:16: (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:908:2: otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) )
            	    {
            	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2164); 

            	        	newLeafNode(otherlv_19, grammarAccess.getBookAccess().getCommaKeyword_4_7_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:912:1: ( (lv_edition_20_0= ruleEditionField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:913:1: (lv_edition_20_0= ruleEditionField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:913:1: (lv_edition_20_0= ruleEditionField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:914:3: lv_edition_20_0= ruleEditionField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getEditionEditionFieldParserRuleCall_4_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEditionField_in_ruleBook2184);
            	    lv_edition_20_0=ruleEditionField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"edition",
            	            		lv_edition_20_0, 
            	            		"EditionField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:937:4: ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:937:4: ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:938:5: {...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:938:101: ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:939:6: ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:942:6: ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:942:7: {...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:942:16: (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:943:2: otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) )
            	    {
            	    otherlv_21=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2253); 

            	        	newLeafNode(otherlv_21, grammarAccess.getBookAccess().getCommaKeyword_4_8_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:947:1: ( (lv_month_22_0= ruleMonthField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:948:1: (lv_month_22_0= ruleMonthField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:948:1: (lv_month_22_0= ruleMonthField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:949:3: lv_month_22_0= ruleMonthField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getMonthMonthFieldParserRuleCall_4_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMonthField_in_ruleBook2273);
            	    lv_month_22_0=ruleMonthField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:972:4: ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:972:4: ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:973:5: {...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:973:101: ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:974:6: ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:977:6: ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:977:7: {...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:977:16: (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:978:2: otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) )
            	    {
            	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2342); 

            	        	newLeafNode(otherlv_23, grammarAccess.getBookAccess().getCommaKeyword_4_9_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:982:1: ( (lv_isbn_24_0= ruleIsbnField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:983:1: (lv_isbn_24_0= ruleIsbnField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:983:1: (lv_isbn_24_0= ruleIsbnField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:984:3: lv_isbn_24_0= ruleIsbnField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getIsbnIsbnFieldParserRuleCall_4_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIsbnField_in_ruleBook2362);
            	    lv_isbn_24_0=ruleIsbnField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"isbn",
            	            		lv_isbn_24_0, 
            	            		"IsbnField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1007:4: ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1007:4: ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1008:5: {...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1008:102: ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1009:6: ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1012:6: ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1012:7: {...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1012:16: (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1013:2: otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) )
            	    {
            	    otherlv_25=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2431); 

            	        	newLeafNode(otherlv_25, grammarAccess.getBookAccess().getCommaKeyword_4_10_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1017:1: ( (lv_note_26_0= ruleNoteField ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1018:1: (lv_note_26_0= ruleNoteField )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1018:1: (lv_note_26_0= ruleNoteField )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1019:3: lv_note_26_0= ruleNoteField
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBookAccess().getNoteNoteFieldParserRuleCall_4_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoteField_in_ruleBook2451);
            	    lv_note_26_0=ruleNoteField();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"note",
            	            		lv_note_26_0, 
            	            		"NoteField");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1042:4: ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1042:4: ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1043:5: {...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11)");
            	    }
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1043:102: ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1044:6: ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11);
            	    	 				
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1047:6: ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==Comma) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1047:7: {...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleBook", "true");
            	    	    }
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1047:16: (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1048:2: otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleBook2520); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getBookAccess().getCommaKeyword_4_11_0());
            	    	        
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1052:1: ( (lv_unknowns_28_0= ruleUnknownField ) )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1053:1: (lv_unknowns_28_0= ruleUnknownField )
            	    	    {
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1053:1: (lv_unknowns_28_0= ruleUnknownField )
            	    	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1054:3: lv_unknowns_28_0= ruleUnknownField
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBookAccess().getUnknownsUnknownFieldParserRuleCall_4_11_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleUnknownField_in_ruleBook2540);
            	    	    lv_unknowns_28_0=ruleUnknownField();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBookRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"unknowns",
            	    	            		lv_unknowns_28_0, 
            	    	            		"UnknownField");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBookAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleBook", "getUnorderedGroupHelper().canLeave(grammarAccess.getBookAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	

            }

            otherlv_29=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleBook2601); 

                	newLeafNode(otherlv_29, grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleUnknownField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1098:1: entryRuleUnknownField returns [EObject current=null] : iv_ruleUnknownField= ruleUnknownField EOF ;
    public final EObject entryRuleUnknownField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnknownField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1099:2: (iv_ruleUnknownField= ruleUnknownField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1100:2: iv_ruleUnknownField= ruleUnknownField EOF
            {
             newCompositeNode(grammarAccess.getUnknownFieldRule()); 
            pushFollow(FOLLOW_ruleUnknownField_in_entryRuleUnknownField2635);
            iv_ruleUnknownField=ruleUnknownField();

            state._fsp--;

             current =iv_ruleUnknownField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownField2645); 

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
    // $ANTLR end "entryRuleUnknownField"


    // $ANTLR start "ruleUnknownField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1107:1: ruleUnknownField returns [EObject current=null] : ( ( (lv_type_0_0= ruleUnknownType ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleUnknownValue ) ) ) ;
    public final EObject ruleUnknownField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1110:28: ( ( ( (lv_type_0_0= ruleUnknownType ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleUnknownValue ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1111:1: ( ( (lv_type_0_0= ruleUnknownType ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleUnknownValue ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1111:1: ( ( (lv_type_0_0= ruleUnknownType ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleUnknownValue ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1111:2: ( (lv_type_0_0= ruleUnknownType ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleUnknownValue ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1111:2: ( (lv_type_0_0= ruleUnknownType ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1112:1: (lv_type_0_0= ruleUnknownType )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1112:1: (lv_type_0_0= ruleUnknownType )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1113:3: lv_type_0_0= ruleUnknownType
            {
             
            	        newCompositeNode(grammarAccess.getUnknownFieldAccess().getTypeUnknownTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnknownType_in_ruleUnknownField2691);
            lv_type_0_0=ruleUnknownType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnknownFieldRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"UnknownType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleUnknownField2704); 

                	newLeafNode(otherlv_1, grammarAccess.getUnknownFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1134:1: ( (lv_value_2_0= ruleUnknownValue ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1135:1: (lv_value_2_0= ruleUnknownValue )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1135:1: (lv_value_2_0= ruleUnknownValue )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1136:3: lv_value_2_0= ruleUnknownValue
            {
             
            	        newCompositeNode(grammarAccess.getUnknownFieldAccess().getValueUnknownValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleUnknownValue_in_ruleUnknownField2724);
            lv_value_2_0=ruleUnknownValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnknownFieldRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"UnknownValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleUnknownField"


    // $ANTLR start "entryRuleUnknownType"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1160:1: entryRuleUnknownType returns [EObject current=null] : iv_ruleUnknownType= ruleUnknownType EOF ;
    public final EObject entryRuleUnknownType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnknownType = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1161:2: (iv_ruleUnknownType= ruleUnknownType EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1162:2: iv_ruleUnknownType= ruleUnknownType EOF
            {
             newCompositeNode(grammarAccess.getUnknownTypeRule()); 
            pushFollow(FOLLOW_ruleUnknownType_in_entryRuleUnknownType2759);
            iv_ruleUnknownType=ruleUnknownType();

            state._fsp--;

             current =iv_ruleUnknownType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownType2769); 

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
    // $ANTLR end "entryRuleUnknownType"


    // $ANTLR start "ruleUnknownType"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1169:1: ruleUnknownType returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleUnknownType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1172:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1173:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1173:1: ( (lv_type_0_0= RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1174:1: (lv_type_0_0= RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1174:1: (lv_type_0_0= RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1175:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnknownType2810); 

            			newLeafNode(lv_type_0_0, grammarAccess.getUnknownTypeAccess().getTypeIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnknownTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
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
    // $ANTLR end "ruleUnknownType"


    // $ANTLR start "entryRuleUnknownValue"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1199:1: entryRuleUnknownValue returns [EObject current=null] : iv_ruleUnknownValue= ruleUnknownValue EOF ;
    public final EObject entryRuleUnknownValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnknownValue = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1200:2: (iv_ruleUnknownValue= ruleUnknownValue EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1201:2: iv_ruleUnknownValue= ruleUnknownValue EOF
            {
             newCompositeNode(grammarAccess.getUnknownValueRule()); 
            pushFollow(FOLLOW_ruleUnknownValue_in_entryRuleUnknownValue2849);
            iv_ruleUnknownValue=ruleUnknownValue();

            state._fsp--;

             current =iv_ruleUnknownValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownValue2859); 

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
    // $ANTLR end "entryRuleUnknownValue"


    // $ANTLR start "ruleUnknownValue"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1208:1: ruleUnknownValue returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleUnknownValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1211:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1212:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1212:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1213:1: (lv_value_0_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1213:1: (lv_value_0_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1214:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUnknownValue2900); 

            			newLeafNode(lv_value_0_0, grammarAccess.getUnknownValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnknownValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleUnknownValue"


    // $ANTLR start "entryRuleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1238:1: entryRuleCiteKey returns [EObject current=null] : iv_ruleCiteKey= ruleCiteKey EOF ;
    public final EObject entryRuleCiteKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCiteKey = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1239:2: (iv_ruleCiteKey= ruleCiteKey EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1240:2: iv_ruleCiteKey= ruleCiteKey EOF
            {
             newCompositeNode(grammarAccess.getCiteKeyRule()); 
            pushFollow(FOLLOW_ruleCiteKey_in_entryRuleCiteKey2939);
            iv_ruleCiteKey=ruleCiteKey();

            state._fsp--;

             current =iv_ruleCiteKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCiteKey2949); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1247:1: ruleCiteKey returns [EObject current=null] : ( (lv_key_0_0= RULE_ID ) ) ;
    public final EObject ruleCiteKey() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1250:28: ( ( (lv_key_0_0= RULE_ID ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1251:1: ( (lv_key_0_0= RULE_ID ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1251:1: ( (lv_key_0_0= RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1252:1: (lv_key_0_0= RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1252:1: (lv_key_0_0= RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1253:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCiteKey2990); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1277:1: entryRuleAuthorField returns [EObject current=null] : iv_ruleAuthorField= ruleAuthorField EOF ;
    public final EObject entryRuleAuthorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthorField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1278:2: (iv_ruleAuthorField= ruleAuthorField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1279:2: iv_ruleAuthorField= ruleAuthorField EOF
            {
             newCompositeNode(grammarAccess.getAuthorFieldRule()); 
            pushFollow(FOLLOW_ruleAuthorField_in_entryRuleAuthorField3029);
            iv_ruleAuthorField=ruleAuthorField();

            state._fsp--;

             current =iv_ruleAuthorField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthorField3039); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1286:1: ruleAuthorField returns [EObject current=null] : (otherlv_0= Author otherlv_1= EqualsSign ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) ) ) ;
    public final EObject ruleAuthorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Authors_3 = null;

        EObject this_Authors_6 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1289:28: ( (otherlv_0= Author otherlv_1= EqualsSign ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1290:1: (otherlv_0= Author otherlv_1= EqualsSign ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1290:1: (otherlv_0= Author otherlv_1= EqualsSign ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1291:2: otherlv_0= Author otherlv_1= EqualsSign ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) )
            {
            otherlv_0=(Token)match(input,Author,FOLLOW_Author_in_ruleAuthorField3077); 

                	newLeafNode(otherlv_0, grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleAuthorField3089); 

                	newLeafNode(otherlv_1, grammarAccess.getAuthorFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1300:1: ( (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark ) | (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QuotationMark) ) {
                alt9=1;
            }
            else if ( (LA9_0==LeftCurlyBracket) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1300:2: (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1300:2: (otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1301:2: otherlv_2= QuotationMark this_Authors_3= ruleAuthors otherlv_4= QuotationMark
                    {
                    otherlv_2=(Token)match(input,QuotationMark,FOLLOW_QuotationMark_in_ruleAuthorField3103); 

                        	newLeafNode(otherlv_2, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAuthors_in_ruleAuthorField3124);
                    this_Authors_3=ruleAuthors();

                    state._fsp--;


                            current = this_Authors_3;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,QuotationMark,FOLLOW_QuotationMark_in_ruleAuthorField3136); 

                        	newLeafNode(otherlv_4, grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1320:6: (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1320:6: (otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1321:2: otherlv_5= LeftCurlyBracket this_Authors_6= ruleAuthors otherlv_7= RightCurlyBracket
                    {
                    otherlv_5=(Token)match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_ruleAuthorField3156); 

                        	newLeafNode(otherlv_5, grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_1_1()); 
                        
                    pushFollow(FOLLOW_ruleAuthors_in_ruleAuthorField3177);
                    this_Authors_6=ruleAuthors();

                    state._fsp--;


                            current = this_Authors_6;
                            afterParserOrEnumRuleCall();
                        
                    otherlv_7=(Token)match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_ruleAuthorField3189); 

                        	newLeafNode(otherlv_7, grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1347:1: entryRuleAuthors returns [EObject current=null] : iv_ruleAuthors= ruleAuthors EOF ;
    public final EObject entryRuleAuthors() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthors = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1348:2: (iv_ruleAuthors= ruleAuthors EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1349:2: iv_ruleAuthors= ruleAuthors EOF
            {
             newCompositeNode(grammarAccess.getAuthorsRule()); 
            pushFollow(FOLLOW_ruleAuthors_in_entryRuleAuthors3225);
            iv_ruleAuthors=ruleAuthors();

            state._fsp--;

             current =iv_ruleAuthors; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthors3235); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1356:1: ruleAuthors returns [EObject current=null] : ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )* ) ;
    public final EObject ruleAuthors() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_names_0_0 = null;

        EObject lv_names_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1359:28: ( ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )* ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1360:1: ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )* )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1360:1: ( ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )* )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1360:2: ( (lv_names_0_0= ruleFullname ) ) (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )*
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1360:2: ( (lv_names_0_0= ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1361:1: (lv_names_0_0= ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1361:1: (lv_names_0_0= ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1362:3: lv_names_0_0= ruleFullname
            {
             
            	        newCompositeNode(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFullname_in_ruleAuthors3281);
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

            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1378:2: (otherlv_1= And ( (lv_names_2_0= ruleFullname ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==And) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1379:2: otherlv_1= And ( (lv_names_2_0= ruleFullname ) )
            	    {
            	    otherlv_1=(Token)match(input,And,FOLLOW_And_in_ruleAuthors3295); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAuthorsAccess().getAndKeyword_1_0());
            	        
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1383:1: ( (lv_names_2_0= ruleFullname ) )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1384:1: (lv_names_2_0= ruleFullname )
            	    {
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1384:1: (lv_names_2_0= ruleFullname )
            	    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1385:3: lv_names_2_0= ruleFullname
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFullname_in_ruleAuthors3315);
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
            	    break loop10;
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1409:1: entryRuleFullname returns [EObject current=null] : iv_ruleFullname= ruleFullname EOF ;
    public final EObject entryRuleFullname() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullname = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1410:2: (iv_ruleFullname= ruleFullname EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1411:2: iv_ruleFullname= ruleFullname EOF
            {
             newCompositeNode(grammarAccess.getFullnameRule()); 
            pushFollow(FOLLOW_ruleFullname_in_entryRuleFullname3352);
            iv_ruleFullname=ruleFullname();

            state._fsp--;

             current =iv_ruleFullname; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullname3362); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1418:1: ruleFullname returns [EObject current=null] : ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) ) ;
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
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1421:28: ( ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:1: ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:1: ( ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) ) | ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) ) | ( (lv_firstname_5_0= RULE_ID ) ) )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case And:
                case QuotationMark:
                case RightCurlyBracket:
                    {
                    alt11=3;
                    }
                    break;
                case Comma:
                    {
                    alt11=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:2: ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:2: ( ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:3: ( (lv_lastname_0_0= RULE_ID ) ) otherlv_1= Comma ( (lv_firstname_2_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1422:3: ( (lv_lastname_0_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1423:1: (lv_lastname_0_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1423:1: (lv_lastname_0_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1424:3: lv_lastname_0_0= RULE_ID
                    {
                    lv_lastname_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname3405); 

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

                    otherlv_1=(Token)match(input,Comma,FOLLOW_Comma_in_ruleFullname3423); 

                        	newLeafNode(otherlv_1, grammarAccess.getFullnameAccess().getCommaKeyword_0_1());
                        
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1445:1: ( (lv_firstname_2_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1446:1: (lv_firstname_2_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1446:1: (lv_firstname_2_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1447:3: lv_firstname_2_0= RULE_ID
                    {
                    lv_firstname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname3439); 

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
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1464:6: ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1464:6: ( ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1464:7: ( (lv_firstname_3_0= RULE_ID ) ) ( (lv_lastname_4_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1464:7: ( (lv_firstname_3_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1465:1: (lv_firstname_3_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1465:1: (lv_firstname_3_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1466:3: lv_firstname_3_0= RULE_ID
                    {
                    lv_firstname_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname3469); 

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

                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1482:2: ( (lv_lastname_4_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1483:1: (lv_lastname_4_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1483:1: (lv_lastname_4_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1484:3: lv_lastname_4_0= RULE_ID
                    {
                    lv_lastname_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname3491); 

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
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1501:6: ( (lv_firstname_5_0= RULE_ID ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1501:6: ( (lv_firstname_5_0= RULE_ID ) )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1502:1: (lv_firstname_5_0= RULE_ID )
                    {
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1502:1: (lv_firstname_5_0= RULE_ID )
                    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1503:3: lv_firstname_5_0= RULE_ID
                    {
                    lv_firstname_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFullname3520); 

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


    // $ANTLR start "entryRuleEditorField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1527:1: entryRuleEditorField returns [EObject current=null] : iv_ruleEditorField= ruleEditorField EOF ;
    public final EObject entryRuleEditorField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditorField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1528:2: (iv_ruleEditorField= ruleEditorField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1529:2: iv_ruleEditorField= ruleEditorField EOF
            {
             newCompositeNode(grammarAccess.getEditorFieldRule()); 
            pushFollow(FOLLOW_ruleEditorField_in_entryRuleEditorField3560);
            iv_ruleEditorField=ruleEditorField();

            state._fsp--;

             current =iv_ruleEditorField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditorField3570); 

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
    // $ANTLR end "entryRuleEditorField"


    // $ANTLR start "ruleEditorField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1536:1: ruleEditorField returns [EObject current=null] : (otherlv_0= Editor otherlv_1= EqualsSign ( (lv_editor_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEditorField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_editor_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1539:28: ( (otherlv_0= Editor otherlv_1= EqualsSign ( (lv_editor_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1540:1: (otherlv_0= Editor otherlv_1= EqualsSign ( (lv_editor_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1540:1: (otherlv_0= Editor otherlv_1= EqualsSign ( (lv_editor_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1541:2: otherlv_0= Editor otherlv_1= EqualsSign ( (lv_editor_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Editor,FOLLOW_Editor_in_ruleEditorField3608); 

                	newLeafNode(otherlv_0, grammarAccess.getEditorFieldAccess().getEditorKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleEditorField3620); 

                	newLeafNode(otherlv_1, grammarAccess.getEditorFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1550:1: ( (lv_editor_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1551:1: (lv_editor_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1551:1: (lv_editor_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1552:3: lv_editor_2_0= RULE_STRING
            {
            lv_editor_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditorField3636); 

            			newLeafNode(lv_editor_2_0, grammarAccess.getEditorFieldAccess().getEditorSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditorFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"editor",
                    		lv_editor_2_0, 
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
    // $ANTLR end "ruleEditorField"


    // $ANTLR start "entryRuleTitleField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1576:1: entryRuleTitleField returns [EObject current=null] : iv_ruleTitleField= ruleTitleField EOF ;
    public final EObject entryRuleTitleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitleField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1577:2: (iv_ruleTitleField= ruleTitleField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1578:2: iv_ruleTitleField= ruleTitleField EOF
            {
             newCompositeNode(grammarAccess.getTitleFieldRule()); 
            pushFollow(FOLLOW_ruleTitleField_in_entryRuleTitleField3676);
            iv_ruleTitleField=ruleTitleField();

            state._fsp--;

             current =iv_ruleTitleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitleField3686); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1585:1: ruleTitleField returns [EObject current=null] : (otherlv_0= Title otherlv_1= EqualsSign ( (lv_title_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_title_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1588:28: ( (otherlv_0= Title otherlv_1= EqualsSign ( (lv_title_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1589:1: (otherlv_0= Title otherlv_1= EqualsSign ( (lv_title_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1589:1: (otherlv_0= Title otherlv_1= EqualsSign ( (lv_title_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1590:2: otherlv_0= Title otherlv_1= EqualsSign ( (lv_title_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Title,FOLLOW_Title_in_ruleTitleField3724); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleFieldAccess().getTitleKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleTitleField3736); 

                	newLeafNode(otherlv_1, grammarAccess.getTitleFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1599:1: ( (lv_title_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1600:1: (lv_title_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1600:1: (lv_title_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1601:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitleField3752); 

            			newLeafNode(lv_title_2_0, grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTitleFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"title",
                    		lv_title_2_0, 
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


    // $ANTLR start "entryRulePublisherField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1625:1: entryRulePublisherField returns [EObject current=null] : iv_rulePublisherField= rulePublisherField EOF ;
    public final EObject entryRulePublisherField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisherField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1626:2: (iv_rulePublisherField= rulePublisherField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1627:2: iv_rulePublisherField= rulePublisherField EOF
            {
             newCompositeNode(grammarAccess.getPublisherFieldRule()); 
            pushFollow(FOLLOW_rulePublisherField_in_entryRulePublisherField3792);
            iv_rulePublisherField=rulePublisherField();

            state._fsp--;

             current =iv_rulePublisherField; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePublisherField3802); 

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
    // $ANTLR end "entryRulePublisherField"


    // $ANTLR start "rulePublisherField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1634:1: rulePublisherField returns [EObject current=null] : (otherlv_0= Publisher otherlv_1= EqualsSign ( (lv_publisher_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePublisherField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_publisher_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1637:28: ( (otherlv_0= Publisher otherlv_1= EqualsSign ( (lv_publisher_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1638:1: (otherlv_0= Publisher otherlv_1= EqualsSign ( (lv_publisher_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1638:1: (otherlv_0= Publisher otherlv_1= EqualsSign ( (lv_publisher_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1639:2: otherlv_0= Publisher otherlv_1= EqualsSign ( (lv_publisher_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Publisher,FOLLOW_Publisher_in_rulePublisherField3840); 

                	newLeafNode(otherlv_0, grammarAccess.getPublisherFieldAccess().getPublisherKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_rulePublisherField3852); 

                	newLeafNode(otherlv_1, grammarAccess.getPublisherFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1648:1: ( (lv_publisher_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1649:1: (lv_publisher_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1649:1: (lv_publisher_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1650:3: lv_publisher_2_0= RULE_STRING
            {
            lv_publisher_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePublisherField3868); 

            			newLeafNode(lv_publisher_2_0, grammarAccess.getPublisherFieldAccess().getPublisherSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPublisherFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"publisher",
                    		lv_publisher_2_0, 
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
    // $ANTLR end "rulePublisherField"


    // $ANTLR start "entryRuleJournalField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1674:1: entryRuleJournalField returns [EObject current=null] : iv_ruleJournalField= ruleJournalField EOF ;
    public final EObject entryRuleJournalField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJournalField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1675:2: (iv_ruleJournalField= ruleJournalField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1676:2: iv_ruleJournalField= ruleJournalField EOF
            {
             newCompositeNode(grammarAccess.getJournalFieldRule()); 
            pushFollow(FOLLOW_ruleJournalField_in_entryRuleJournalField3908);
            iv_ruleJournalField=ruleJournalField();

            state._fsp--;

             current =iv_ruleJournalField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJournalField3918); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1683:1: ruleJournalField returns [EObject current=null] : (otherlv_0= Journal otherlv_1= EqualsSign ( (lv_journal_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleJournalField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_journal_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1686:28: ( (otherlv_0= Journal otherlv_1= EqualsSign ( (lv_journal_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1687:1: (otherlv_0= Journal otherlv_1= EqualsSign ( (lv_journal_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1687:1: (otherlv_0= Journal otherlv_1= EqualsSign ( (lv_journal_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1688:2: otherlv_0= Journal otherlv_1= EqualsSign ( (lv_journal_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Journal,FOLLOW_Journal_in_ruleJournalField3956); 

                	newLeafNode(otherlv_0, grammarAccess.getJournalFieldAccess().getJournalKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleJournalField3968); 

                	newLeafNode(otherlv_1, grammarAccess.getJournalFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1697:1: ( (lv_journal_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1698:1: (lv_journal_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1698:1: (lv_journal_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1699:3: lv_journal_2_0= RULE_STRING
            {
            lv_journal_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJournalField3984); 

            			newLeafNode(lv_journal_2_0, grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJournalFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"journal",
                    		lv_journal_2_0, 
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1723:1: entryRuleYearField returns [EObject current=null] : iv_ruleYearField= ruleYearField EOF ;
    public final EObject entryRuleYearField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYearField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1724:2: (iv_ruleYearField= ruleYearField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1725:2: iv_ruleYearField= ruleYearField EOF
            {
             newCompositeNode(grammarAccess.getYearFieldRule()); 
            pushFollow(FOLLOW_ruleYearField_in_entryRuleYearField4024);
            iv_ruleYearField=ruleYearField();

            state._fsp--;

             current =iv_ruleYearField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYearField4034); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1732:1: ruleYearField returns [EObject current=null] : (otherlv_0= Year otherlv_1= EqualsSign ( (lv_year_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleYearField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_year_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1735:28: ( (otherlv_0= Year otherlv_1= EqualsSign ( (lv_year_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1736:1: (otherlv_0= Year otherlv_1= EqualsSign ( (lv_year_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1736:1: (otherlv_0= Year otherlv_1= EqualsSign ( (lv_year_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1737:2: otherlv_0= Year otherlv_1= EqualsSign ( (lv_year_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Year,FOLLOW_Year_in_ruleYearField4072); 

                	newLeafNode(otherlv_0, grammarAccess.getYearFieldAccess().getYearKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleYearField4084); 

                	newLeafNode(otherlv_1, grammarAccess.getYearFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1746:1: ( (lv_year_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1747:1: (lv_year_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1747:1: (lv_year_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1748:3: lv_year_2_0= RULE_STRING
            {
            lv_year_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleYearField4100); 

            			newLeafNode(lv_year_2_0, grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getYearFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"year",
                    		lv_year_2_0, 
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1772:1: entryRuleVolumeField returns [EObject current=null] : iv_ruleVolumeField= ruleVolumeField EOF ;
    public final EObject entryRuleVolumeField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVolumeField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1773:2: (iv_ruleVolumeField= ruleVolumeField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1774:2: iv_ruleVolumeField= ruleVolumeField EOF
            {
             newCompositeNode(grammarAccess.getVolumeFieldRule()); 
            pushFollow(FOLLOW_ruleVolumeField_in_entryRuleVolumeField4140);
            iv_ruleVolumeField=ruleVolumeField();

            state._fsp--;

             current =iv_ruleVolumeField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolumeField4150); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1781:1: ruleVolumeField returns [EObject current=null] : (otherlv_0= Volume otherlv_1= EqualsSign ( (lv_volume_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleVolumeField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_volume_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1784:28: ( (otherlv_0= Volume otherlv_1= EqualsSign ( (lv_volume_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1785:1: (otherlv_0= Volume otherlv_1= EqualsSign ( (lv_volume_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1785:1: (otherlv_0= Volume otherlv_1= EqualsSign ( (lv_volume_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1786:2: otherlv_0= Volume otherlv_1= EqualsSign ( (lv_volume_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Volume,FOLLOW_Volume_in_ruleVolumeField4188); 

                	newLeafNode(otherlv_0, grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleVolumeField4200); 

                	newLeafNode(otherlv_1, grammarAccess.getVolumeFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1795:1: ( (lv_volume_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1796:1: (lv_volume_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1796:1: (lv_volume_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1797:3: lv_volume_2_0= RULE_STRING
            {
            lv_volume_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleVolumeField4216); 

            			newLeafNode(lv_volume_2_0, grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVolumeFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"volume",
                    		lv_volume_2_0, 
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1821:1: entryRuleNumberField returns [EObject current=null] : iv_ruleNumberField= ruleNumberField EOF ;
    public final EObject entryRuleNumberField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1822:2: (iv_ruleNumberField= ruleNumberField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1823:2: iv_ruleNumberField= ruleNumberField EOF
            {
             newCompositeNode(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField4256);
            iv_ruleNumberField=ruleNumberField();

            state._fsp--;

             current =iv_ruleNumberField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField4266); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1830:1: ruleNumberField returns [EObject current=null] : (otherlv_0= Number otherlv_1= EqualsSign ( (lv_number_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNumberField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_number_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1833:28: ( (otherlv_0= Number otherlv_1= EqualsSign ( (lv_number_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1834:1: (otherlv_0= Number otherlv_1= EqualsSign ( (lv_number_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1834:1: (otherlv_0= Number otherlv_1= EqualsSign ( (lv_number_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1835:2: otherlv_0= Number otherlv_1= EqualsSign ( (lv_number_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Number,FOLLOW_Number_in_ruleNumberField4304); 

                	newLeafNode(otherlv_0, grammarAccess.getNumberFieldAccess().getNumberKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleNumberField4316); 

                	newLeafNode(otherlv_1, grammarAccess.getNumberFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1844:1: ( (lv_number_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1845:1: (lv_number_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1845:1: (lv_number_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1846:3: lv_number_2_0= RULE_STRING
            {
            lv_number_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberField4332); 

            			newLeafNode(lv_number_2_0, grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNumberFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"number",
                    		lv_number_2_0, 
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1870:1: entryRulePagesField returns [EObject current=null] : iv_rulePagesField= rulePagesField EOF ;
    public final EObject entryRulePagesField() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePagesField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1871:2: (iv_rulePagesField= rulePagesField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1872:2: iv_rulePagesField= rulePagesField EOF
            {
             newCompositeNode(grammarAccess.getPagesFieldRule()); 
            pushFollow(FOLLOW_rulePagesField_in_entryRulePagesField4372);
            iv_rulePagesField=rulePagesField();

            state._fsp--;

             current =iv_rulePagesField; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePagesField4382); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1879:1: rulePagesField returns [EObject current=null] : (otherlv_0= Pages otherlv_1= EqualsSign ( (lv_pages_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePagesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_pages_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1882:28: ( (otherlv_0= Pages otherlv_1= EqualsSign ( (lv_pages_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1883:1: (otherlv_0= Pages otherlv_1= EqualsSign ( (lv_pages_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1883:1: (otherlv_0= Pages otherlv_1= EqualsSign ( (lv_pages_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1884:2: otherlv_0= Pages otherlv_1= EqualsSign ( (lv_pages_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Pages,FOLLOW_Pages_in_rulePagesField4420); 

                	newLeafNode(otherlv_0, grammarAccess.getPagesFieldAccess().getPagesKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_rulePagesField4432); 

                	newLeafNode(otherlv_1, grammarAccess.getPagesFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1893:1: ( (lv_pages_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1894:1: (lv_pages_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1894:1: (lv_pages_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1895:3: lv_pages_2_0= RULE_STRING
            {
            lv_pages_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePagesField4448); 

            			newLeafNode(lv_pages_2_0, grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPagesFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"pages",
                    		lv_pages_2_0, 
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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1919:1: entryRuleMonthField returns [EObject current=null] : iv_ruleMonthField= ruleMonthField EOF ;
    public final EObject entryRuleMonthField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonthField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1920:2: (iv_ruleMonthField= ruleMonthField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1921:2: iv_ruleMonthField= ruleMonthField EOF
            {
             newCompositeNode(grammarAccess.getMonthFieldRule()); 
            pushFollow(FOLLOW_ruleMonthField_in_entryRuleMonthField4488);
            iv_ruleMonthField=ruleMonthField();

            state._fsp--;

             current =iv_ruleMonthField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonthField4498); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1928:1: ruleMonthField returns [EObject current=null] : (otherlv_0= Month otherlv_1= EqualsSign ( (lv_month_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMonthField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_month_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1931:28: ( (otherlv_0= Month otherlv_1= EqualsSign ( (lv_month_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1932:1: (otherlv_0= Month otherlv_1= EqualsSign ( (lv_month_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1932:1: (otherlv_0= Month otherlv_1= EqualsSign ( (lv_month_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1933:2: otherlv_0= Month otherlv_1= EqualsSign ( (lv_month_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Month,FOLLOW_Month_in_ruleMonthField4536); 

                	newLeafNode(otherlv_0, grammarAccess.getMonthFieldAccess().getMonthKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleMonthField4548); 

                	newLeafNode(otherlv_1, grammarAccess.getMonthFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1942:1: ( (lv_month_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1943:1: (lv_month_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1943:1: (lv_month_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1944:3: lv_month_2_0= RULE_STRING
            {
            lv_month_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMonthField4564); 

            			newLeafNode(lv_month_2_0, grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMonthFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"month",
                    		lv_month_2_0, 
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


    // $ANTLR start "entryRuleAddressField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1968:1: entryRuleAddressField returns [EObject current=null] : iv_ruleAddressField= ruleAddressField EOF ;
    public final EObject entryRuleAddressField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1969:2: (iv_ruleAddressField= ruleAddressField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1970:2: iv_ruleAddressField= ruleAddressField EOF
            {
             newCompositeNode(grammarAccess.getAddressFieldRule()); 
            pushFollow(FOLLOW_ruleAddressField_in_entryRuleAddressField4604);
            iv_ruleAddressField=ruleAddressField();

            state._fsp--;

             current =iv_ruleAddressField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressField4614); 

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
    // $ANTLR end "entryRuleAddressField"


    // $ANTLR start "ruleAddressField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1977:1: ruleAddressField returns [EObject current=null] : (otherlv_0= Address otherlv_1= EqualsSign ( (lv_address_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAddressField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1980:28: ( (otherlv_0= Address otherlv_1= EqualsSign ( (lv_address_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1981:1: (otherlv_0= Address otherlv_1= EqualsSign ( (lv_address_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1981:1: (otherlv_0= Address otherlv_1= EqualsSign ( (lv_address_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1982:2: otherlv_0= Address otherlv_1= EqualsSign ( (lv_address_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Address,FOLLOW_Address_in_ruleAddressField4652); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressFieldAccess().getAddressKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleAddressField4664); 

                	newLeafNode(otherlv_1, grammarAccess.getAddressFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1991:1: ( (lv_address_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1992:1: (lv_address_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1992:1: (lv_address_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:1993:3: lv_address_2_0= RULE_STRING
            {
            lv_address_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAddressField4680); 

            			newLeafNode(lv_address_2_0, grammarAccess.getAddressFieldAccess().getAddressSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_2_0, 
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
    // $ANTLR end "ruleAddressField"


    // $ANTLR start "entryRuleSeriesField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2017:1: entryRuleSeriesField returns [EObject current=null] : iv_ruleSeriesField= ruleSeriesField EOF ;
    public final EObject entryRuleSeriesField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeriesField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2018:2: (iv_ruleSeriesField= ruleSeriesField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2019:2: iv_ruleSeriesField= ruleSeriesField EOF
            {
             newCompositeNode(grammarAccess.getSeriesFieldRule()); 
            pushFollow(FOLLOW_ruleSeriesField_in_entryRuleSeriesField4720);
            iv_ruleSeriesField=ruleSeriesField();

            state._fsp--;

             current =iv_ruleSeriesField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeriesField4730); 

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
    // $ANTLR end "entryRuleSeriesField"


    // $ANTLR start "ruleSeriesField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2026:1: ruleSeriesField returns [EObject current=null] : (otherlv_0= Series otherlv_1= EqualsSign ( (lv_series_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSeriesField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_series_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2029:28: ( (otherlv_0= Series otherlv_1= EqualsSign ( (lv_series_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2030:1: (otherlv_0= Series otherlv_1= EqualsSign ( (lv_series_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2030:1: (otherlv_0= Series otherlv_1= EqualsSign ( (lv_series_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2031:2: otherlv_0= Series otherlv_1= EqualsSign ( (lv_series_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Series,FOLLOW_Series_in_ruleSeriesField4768); 

                	newLeafNode(otherlv_0, grammarAccess.getSeriesFieldAccess().getSeriesKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleSeriesField4780); 

                	newLeafNode(otherlv_1, grammarAccess.getSeriesFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2040:1: ( (lv_series_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2041:1: (lv_series_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2041:1: (lv_series_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2042:3: lv_series_2_0= RULE_STRING
            {
            lv_series_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSeriesField4796); 

            			newLeafNode(lv_series_2_0, grammarAccess.getSeriesFieldAccess().getSeriesSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSeriesFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"series",
                    		lv_series_2_0, 
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
    // $ANTLR end "ruleSeriesField"


    // $ANTLR start "entryRuleEditionField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2066:1: entryRuleEditionField returns [EObject current=null] : iv_ruleEditionField= ruleEditionField EOF ;
    public final EObject entryRuleEditionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditionField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2067:2: (iv_ruleEditionField= ruleEditionField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2068:2: iv_ruleEditionField= ruleEditionField EOF
            {
             newCompositeNode(grammarAccess.getEditionFieldRule()); 
            pushFollow(FOLLOW_ruleEditionField_in_entryRuleEditionField4836);
            iv_ruleEditionField=ruleEditionField();

            state._fsp--;

             current =iv_ruleEditionField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionField4846); 

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
    // $ANTLR end "entryRuleEditionField"


    // $ANTLR start "ruleEditionField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2075:1: ruleEditionField returns [EObject current=null] : (otherlv_0= Edition otherlv_1= EqualsSign ( (lv_edition_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEditionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_edition_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2078:28: ( (otherlv_0= Edition otherlv_1= EqualsSign ( (lv_edition_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2079:1: (otherlv_0= Edition otherlv_1= EqualsSign ( (lv_edition_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2079:1: (otherlv_0= Edition otherlv_1= EqualsSign ( (lv_edition_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2080:2: otherlv_0= Edition otherlv_1= EqualsSign ( (lv_edition_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Edition,FOLLOW_Edition_in_ruleEditionField4884); 

                	newLeafNode(otherlv_0, grammarAccess.getEditionFieldAccess().getEditionKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleEditionField4896); 

                	newLeafNode(otherlv_1, grammarAccess.getEditionFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2089:1: ( (lv_edition_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2090:1: (lv_edition_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2090:1: (lv_edition_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2091:3: lv_edition_2_0= RULE_STRING
            {
            lv_edition_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEditionField4912); 

            			newLeafNode(lv_edition_2_0, grammarAccess.getEditionFieldAccess().getEditionSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEditionFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"edition",
                    		lv_edition_2_0, 
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
    // $ANTLR end "ruleEditionField"


    // $ANTLR start "entryRuleIsbnField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2115:1: entryRuleIsbnField returns [EObject current=null] : iv_ruleIsbnField= ruleIsbnField EOF ;
    public final EObject entryRuleIsbnField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsbnField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2116:2: (iv_ruleIsbnField= ruleIsbnField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2117:2: iv_ruleIsbnField= ruleIsbnField EOF
            {
             newCompositeNode(grammarAccess.getIsbnFieldRule()); 
            pushFollow(FOLLOW_ruleIsbnField_in_entryRuleIsbnField4952);
            iv_ruleIsbnField=ruleIsbnField();

            state._fsp--;

             current =iv_ruleIsbnField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsbnField4962); 

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
    // $ANTLR end "entryRuleIsbnField"


    // $ANTLR start "ruleIsbnField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2124:1: ruleIsbnField returns [EObject current=null] : (otherlv_0= Isbn otherlv_1= EqualsSign ( (lv_isbn_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleIsbnField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_isbn_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2127:28: ( (otherlv_0= Isbn otherlv_1= EqualsSign ( (lv_isbn_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2128:1: (otherlv_0= Isbn otherlv_1= EqualsSign ( (lv_isbn_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2128:1: (otherlv_0= Isbn otherlv_1= EqualsSign ( (lv_isbn_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2129:2: otherlv_0= Isbn otherlv_1= EqualsSign ( (lv_isbn_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Isbn,FOLLOW_Isbn_in_ruleIsbnField5000); 

                	newLeafNode(otherlv_0, grammarAccess.getIsbnFieldAccess().getIsbnKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleIsbnField5012); 

                	newLeafNode(otherlv_1, grammarAccess.getIsbnFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2138:1: ( (lv_isbn_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2139:1: (lv_isbn_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2139:1: (lv_isbn_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2140:3: lv_isbn_2_0= RULE_STRING
            {
            lv_isbn_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIsbnField5028); 

            			newLeafNode(lv_isbn_2_0, grammarAccess.getIsbnFieldAccess().getIsbnSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIsbnFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"isbn",
                    		lv_isbn_2_0, 
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
    // $ANTLR end "ruleIsbnField"


    // $ANTLR start "entryRuleNoteField"
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2164:1: entryRuleNoteField returns [EObject current=null] : iv_ruleNoteField= ruleNoteField EOF ;
    public final EObject entryRuleNoteField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoteField = null;


        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2165:2: (iv_ruleNoteField= ruleNoteField EOF )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2166:2: iv_ruleNoteField= ruleNoteField EOF
            {
             newCompositeNode(grammarAccess.getNoteFieldRule()); 
            pushFollow(FOLLOW_ruleNoteField_in_entryRuleNoteField5068);
            iv_ruleNoteField=ruleNoteField();

            state._fsp--;

             current =iv_ruleNoteField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteField5078); 

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
    // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2173:1: ruleNoteField returns [EObject current=null] : (otherlv_0= Note otherlv_1= EqualsSign ( (lv_note_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleNoteField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_note_2_0=null;

         enterRule(); 
            
        try {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2176:28: ( (otherlv_0= Note otherlv_1= EqualsSign ( (lv_note_2_0= RULE_STRING ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2177:1: (otherlv_0= Note otherlv_1= EqualsSign ( (lv_note_2_0= RULE_STRING ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2177:1: (otherlv_0= Note otherlv_1= EqualsSign ( (lv_note_2_0= RULE_STRING ) ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2178:2: otherlv_0= Note otherlv_1= EqualsSign ( (lv_note_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Note,FOLLOW_Note_in_ruleNoteField5116); 

                	newLeafNode(otherlv_0, grammarAccess.getNoteFieldAccess().getNoteKeyword_0());
                
            otherlv_1=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleNoteField5128); 

                	newLeafNode(otherlv_1, grammarAccess.getNoteFieldAccess().getEqualsSignKeyword_1());
                
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2187:1: ( (lv_note_2_0= RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2188:1: (lv_note_2_0= RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2188:1: (lv_note_2_0= RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex/src-gen/de/tubs/bibtextohtml/bibtex/parser/antlr/internal/InternalBibTeXParser.g:2189:3: lv_note_2_0= RULE_STRING
            {
            lv_note_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNoteField5144); 

            			newLeafNode(lv_note_2_0, grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNoteFieldRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"note",
                    		lv_note_2_0, 
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
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA4_eotS =
        "\15\uffff";
    static final String DFA4_eofS =
        "\15\uffff";
    static final String DFA4_minS =
        "\1\27\1\uffff\1\10\12\uffff";
    static final String DFA4_maxS =
        "\1\33\1\uffff\1\34\12\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\13\1\uffff\1\7\1\11\1\2\1\4\1\6\1\10\1\1\1\12\1\3\1"+
        "\5";
    static final String DFA4_specialS =
        "\1\1\1\uffff\1\0\12\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\3\uffff\1\1",
            "",
            "\1\13\1\11\1\uffff\1\7\1\uffff\1\14\1\10\1\3\1\5\2\uffff\1"+
            "\4\1\6\7\uffff\1\12",
            "",
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
            return "()+ loopback of 193:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( (lv_author_6_0= ruleAuthorField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_journal_10_0= ruleJournalField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( (lv_volume_14_0= ruleVolumeField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_number_16_0= ruleNumberField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_pages_18_0= rulePagesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_month_20_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_note_22_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_unknowns_24_0= ruleUnknownField ) ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_2 = input.LA(1);

                         
                        int index4_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA4_2 ==Pages && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) ) {s = 3;}

                        else if ( LA4_2 ==Note && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) ) {s = 4;}

                        else if ( LA4_2 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) ) {s = 5;}

                        else if ( LA4_2 ==Year && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) ) {s = 6;}

                        else if ( LA4_2 ==Number && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) ) {s = 7;}

                        else if ( LA4_2 ==Month && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) ) {s = 8;}

                        else if ( LA4_2 ==Author && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) {s = 9;}

                        else if ( LA4_2 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) ) {s = 10;}

                        else if ( LA4_2 ==Journal && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) ) {s = 11;}

                        else if ( LA4_2 ==Volume && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) ) {s = 12;}

                         
                        input.seek(index4_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_0 = input.LA(1);

                         
                        int index4_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA4_0==RightCurlyBracket) ) {s = 1;}

                        else if ( LA4_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {s = 2;}

                         
                        input.seek(index4_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\17\uffff";
    static final String DFA8_minS =
        "\1\27\1\uffff\1\4\14\uffff";
    static final String DFA8_maxS =
        "\1\33\1\uffff\1\34\14\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\15\1\uffff\1\12\1\14\1\3\1\7\1\11\1\1\1\5\1\13\1\2\1"+
        "\6\1\4\1\10";
    static final String DFA8_specialS =
        "\1\1\1\uffff\1\0\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\3\uffff\1\1",
            "",
            "\1\5\1\6\1\uffff\1\16\1\uffff\2\10\1\11\1\14\1\11\1\7\1\uffff"+
            "\1\13\1\uffff\1\3\1\12\1\15\7\uffff\1\4",
            "",
            "",
            "",
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

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()+ loopback of 619:3: ( ({...}? => ( ({...}? => (otherlv_5= Comma ( ( (lv_author_editor_6_1= ruleAuthorField | lv_author_editor_6_2= ruleEditorField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Comma ( (lv_title_8_0= ruleTitleField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Comma ( (lv_publisher_10_0= rulePublisherField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Comma ( (lv_year_12_0= ruleYearField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Comma ( ( (lv_volume_number_14_1= ruleVolumeField | lv_volume_number_14_2= ruleNumberField ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Comma ( (lv_series_16_0= ruleSeriesField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Comma ( (lv_address_18_0= ruleAddressField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Comma ( (lv_edition_20_0= ruleEditionField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Comma ( (lv_month_22_0= ruleMonthField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= Comma ( (lv_isbn_24_0= ruleIsbnField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Comma ( (lv_note_26_0= ruleNoteField ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= Comma ( (lv_unknowns_28_0= ruleUnknownField ) ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA8_2 ==Isbn && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) ) {s = 3;}

                        else if ( LA8_2 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) ) {s = 4;}

                        else if ( LA8_2 ==Publisher && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) ) {s = 5;}

                        else if ( LA8_2 ==Address && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) ) {s = 6;}

                        else if ( LA8_2 ==Month && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) ) {s = 7;}

                        else if ( LA8_2 >=Author && LA8_2<=Editor && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) ) {s = 8;}

                        else if ( (LA8_2==Number||LA8_2==Volume) && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) ) {s = 9;}

                        else if ( LA8_2 ==Note && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) {s = 10;}

                        else if ( LA8_2 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) ) {s = 11;}

                        else if ( LA8_2 ==Series && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) ) {s = 12;}

                        else if ( LA8_2 ==Year && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) ) {s = 13;}

                        else if ( LA8_2 ==Edition && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) ) {s = 14;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_0 = input.LA(1);

                         
                        int index8_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA8_0==RightCurlyBracket) ) {s = 1;}

                        else if ( LA8_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {s = 2;}

                         
                        input.seek(index8_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_ruleModel122 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBibtexEntryTypes167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_ruleBibtexEntryTypes214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_ruleBibtexEntryTypes241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_entryRuleArticle275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticle285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CommercialAt_in_ruleArticle323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Article_in_ruleArticle335 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleArticle347 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleCiteKey_in_ruleArticle367 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle426 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAuthorField_in_ruleArticle446 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTitleField_in_ruleArticle535 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle604 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleJournalField_in_ruleArticle624 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle693 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleYearField_in_ruleArticle713 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle782 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleVolumeField_in_ruleArticle802 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle871 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleArticle891 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle960 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rulePagesField_in_ruleArticle980 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle1049 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleMonthField_in_ruleArticle1069 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle1138 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleNoteField_in_ruleArticle1158 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleArticle1227 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleUnknownField_in_ruleArticle1247 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleArticle1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_entryRuleBook1342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBook1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CommercialAt_in_ruleBook1390 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Book_in_ruleBook1402 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleBook1414 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleCiteKey_in_ruleBook1434 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1493 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleAuthorField_in_ruleBook1515 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_ruleEditorField_in_ruleBook1534 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1606 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleTitleField_in_ruleBook1626 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1695 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePublisherField_in_ruleBook1715 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1784 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleYearField_in_ruleBook1804 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1873 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_ruleVolumeField_in_ruleBook1895 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_ruleNumberField_in_ruleBook1914 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook1986 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleSeriesField_in_ruleBook2006 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleAddressField_in_ruleBook2095 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2164 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ruleEditionField_in_ruleBook2184 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2253 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleMonthField_in_ruleBook2273 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2342 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleIsbnField_in_ruleBook2362 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleNoteField_in_ruleBook2451 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_Comma_in_ruleBook2520 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleUnknownField_in_ruleBook2540 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleBook2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownField_in_entryRuleUnknownField2635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownField2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownType_in_ruleUnknownField2691 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleUnknownField2704 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleUnknownValue_in_ruleUnknownField2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownType_in_entryRuleUnknownType2759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownType2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnknownType2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownValue_in_entryRuleUnknownValue2849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownValue2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUnknownValue2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_entryRuleCiteKey2939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCiteKey2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCiteKey2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_entryRuleAuthorField3029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthorField3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Author_in_ruleAuthorField3077 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleAuthorField3089 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_QuotationMark_in_ruleAuthorField3103 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleAuthors_in_ruleAuthorField3124 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_QuotationMark_in_ruleAuthorField3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_ruleAuthorField3156 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleAuthors_in_ruleAuthorField3177 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_ruleAuthorField3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_entryRuleAuthors3225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthors3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_ruleAuthors3281 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_And_in_ruleAuthors3295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleFullname_in_ruleAuthors3315 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleFullname_in_entryRuleFullname3352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullname3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname3405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Comma_in_ruleFullname3423 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname3469 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFullname3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditorField_in_entryRuleEditorField3560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditorField3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Editor_in_ruleEditorField3608 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleEditorField3620 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditorField3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_entryRuleTitleField3676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitleField3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleTitleField3724 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleTitleField3736 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitleField3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublisherField_in_entryRulePublisherField3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublisherField3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Publisher_in_rulePublisherField3840 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_rulePublisherField3852 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePublisherField3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_entryRuleJournalField3908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJournalField3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Journal_in_ruleJournalField3956 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleJournalField3968 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJournalField3984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_entryRuleYearField4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYearField4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Year_in_ruleYearField4072 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleYearField4084 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleYearField4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_entryRuleVolumeField4140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolumeField4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Volume_in_ruleVolumeField4188 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleVolumeField4200 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleVolumeField4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_ruleNumberField4304 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleNumberField4316 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberField4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_entryRulePagesField4372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePagesField4382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pages_in_rulePagesField4420 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_rulePagesField4432 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePagesField4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_entryRuleMonthField4488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonthField4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Month_in_ruleMonthField4536 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleMonthField4548 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMonthField4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressField_in_entryRuleAddressField4604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressField4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Address_in_ruleAddressField4652 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleAddressField4664 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAddressField4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeriesField_in_entryRuleSeriesField4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeriesField4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Series_in_ruleSeriesField4768 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleSeriesField4780 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSeriesField4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionField_in_entryRuleEditionField4836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionField4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edition_in_ruleEditionField4884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleEditionField4896 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEditionField4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsbnField_in_entryRuleIsbnField4952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsbnField4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Isbn_in_ruleIsbnField5000 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleIsbnField5012 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIsbnField5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_entryRuleNoteField5068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteField5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Note_in_ruleNoteField5116 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleNoteField5128 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNoteField5144 = new BitSet(new long[]{0x0000000000000002L});

}
