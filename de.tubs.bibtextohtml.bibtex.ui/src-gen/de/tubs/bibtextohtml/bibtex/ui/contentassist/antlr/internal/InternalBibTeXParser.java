package de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal; 

import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.tubs.bibtextohtml.bibtex.services.BibTeXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBibTeXParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g"; }


     
     	private BibTeXGrammarAccess grammarAccess;
     	
     	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
     	
     	{
    		tokenNameToValue.put("QuotationMark", "'\"'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("CommercialAt", "'@'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("And", "'and'");
    		tokenNameToValue.put("Book", "'book'");
    		tokenNameToValue.put("Isbn", "'isbn'");
    		tokenNameToValue.put("Note", "'note'");
    		tokenNameToValue.put("Year", "'year'");
    		tokenNameToValue.put("Month", "'month'");
    		tokenNameToValue.put("Pages", "'pages'");
    		tokenNameToValue.put("Title", "'title'");
    		tokenNameToValue.put("Author", "'author'");
    		tokenNameToValue.put("Editor", "'editor'");
    		tokenNameToValue.put("Number", "'number'");
    		tokenNameToValue.put("Series", "'series'");
    		tokenNameToValue.put("Volume", "'volume'");
    		tokenNameToValue.put("Address", "'address'");
    		tokenNameToValue.put("Article", "'article'");
    		tokenNameToValue.put("Edition", "'edition'");
    		tokenNameToValue.put("Journal", "'journal'");
    		tokenNameToValue.put("Publisher", "'publisher'");
     	}
     	
        public void setGrammarAccess(BibTeXGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }

    	@Override
        protected String getValueForTokenName(String tokenName) {
        	String result = tokenNameToValue.get(tokenName);
        	if (result == null)
        		result = tokenName;
        	return result;
        }



    // $ANTLR start "entryRuleModel"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:87:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:88:1: ( ruleModel EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:89:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel54);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel61); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:96:1: ruleModel : ( ( rule__Model__BibtexEntriesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:100:5: ( ( ( rule__Model__BibtexEntriesAssignment )* ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:101:1: ( ( rule__Model__BibtexEntriesAssignment )* )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:101:1: ( ( rule__Model__BibtexEntriesAssignment )* )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:102:1: ( rule__Model__BibtexEntriesAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBibtexEntriesAssignment()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:103:1: ( rule__Model__BibtexEntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==CommercialAt) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:103:2: rule__Model__BibtexEntriesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__BibtexEntriesAssignment_in_ruleModel91);
            	    rule__Model__BibtexEntriesAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getBibtexEntriesAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleBibtexEntryTypes"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:115:1: entryRuleBibtexEntryTypes : ruleBibtexEntryTypes EOF ;
    public final void entryRuleBibtexEntryTypes() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:116:1: ( ruleBibtexEntryTypes EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:117:1: ruleBibtexEntryTypes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBibtexEntryTypesRule()); 
            }
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes119);
            ruleBibtexEntryTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBibtexEntryTypesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBibtexEntryTypes126); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBibtexEntryTypes"


    // $ANTLR start "ruleBibtexEntryTypes"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:124:1: ruleBibtexEntryTypes : ( ( rule__BibtexEntryTypes__Alternatives ) ) ;
    public final void ruleBibtexEntryTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:128:5: ( ( ( rule__BibtexEntryTypes__Alternatives ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:129:1: ( ( rule__BibtexEntryTypes__Alternatives ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:129:1: ( ( rule__BibtexEntryTypes__Alternatives ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:130:1: ( rule__BibtexEntryTypes__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBibtexEntryTypesAccess().getAlternatives()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:131:1: ( rule__BibtexEntryTypes__Alternatives )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:131:2: rule__BibtexEntryTypes__Alternatives
            {
            pushFollow(FOLLOW_rule__BibtexEntryTypes__Alternatives_in_ruleBibtexEntryTypes156);
            rule__BibtexEntryTypes__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBibtexEntryTypesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBibtexEntryTypes"


    // $ANTLR start "entryRuleArticle"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:143:1: entryRuleArticle : ruleArticle EOF ;
    public final void entryRuleArticle() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:144:1: ( ruleArticle EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:145:1: ruleArticle EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleRule()); 
            }
            pushFollow(FOLLOW_ruleArticle_in_entryRuleArticle183);
            ruleArticle();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticle190); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArticle"


    // $ANTLR start "ruleArticle"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:152:1: ruleArticle : ( ( rule__Article__Group__0 ) ) ;
    public final void ruleArticle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:156:5: ( ( ( rule__Article__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:157:1: ( ( rule__Article__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:157:1: ( ( rule__Article__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:158:1: ( rule__Article__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:159:1: ( rule__Article__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:159:2: rule__Article__Group__0
            {
            pushFollow(FOLLOW_rule__Article__Group__0_in_ruleArticle220);
            rule__Article__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArticle"


    // $ANTLR start "entryRuleBook"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:171:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:172:1: ( ruleBook EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:173:1: ruleBook EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookRule()); 
            }
            pushFollow(FOLLOW_ruleBook_in_entryRuleBook247);
            ruleBook();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBook254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:180:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:184:5: ( ( ( rule__Book__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:185:1: ( ( rule__Book__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:185:1: ( ( rule__Book__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:186:1: ( rule__Book__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:187:1: ( rule__Book__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:187:2: rule__Book__Group__0
            {
            pushFollow(FOLLOW_rule__Book__Group__0_in_ruleBook284);
            rule__Book__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleUnknownField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:199:1: entryRuleUnknownField : ruleUnknownField EOF ;
    public final void entryRuleUnknownField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:200:1: ( ruleUnknownField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:201:1: ruleUnknownField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldRule()); 
            }
            pushFollow(FOLLOW_ruleUnknownField_in_entryRuleUnknownField311);
            ruleUnknownField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownField318); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnknownField"


    // $ANTLR start "ruleUnknownField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:208:1: ruleUnknownField : ( ( rule__UnknownField__Group__0 ) ) ;
    public final void ruleUnknownField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:212:5: ( ( ( rule__UnknownField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:213:1: ( ( rule__UnknownField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:213:1: ( ( rule__UnknownField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:214:1: ( rule__UnknownField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:215:1: ( rule__UnknownField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:215:2: rule__UnknownField__Group__0
            {
            pushFollow(FOLLOW_rule__UnknownField__Group__0_in_ruleUnknownField348);
            rule__UnknownField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnknownField"


    // $ANTLR start "entryRuleUnknownType"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:227:1: entryRuleUnknownType : ruleUnknownType EOF ;
    public final void entryRuleUnknownType() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:228:1: ( ruleUnknownType EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:229:1: ruleUnknownType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownTypeRule()); 
            }
            pushFollow(FOLLOW_ruleUnknownType_in_entryRuleUnknownType375);
            ruleUnknownType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownType382); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnknownType"


    // $ANTLR start "ruleUnknownType"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:236:1: ruleUnknownType : ( ( rule__UnknownType__TypeAssignment ) ) ;
    public final void ruleUnknownType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:240:5: ( ( ( rule__UnknownType__TypeAssignment ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:241:1: ( ( rule__UnknownType__TypeAssignment ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:241:1: ( ( rule__UnknownType__TypeAssignment ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:242:1: ( rule__UnknownType__TypeAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownTypeAccess().getTypeAssignment()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:243:1: ( rule__UnknownType__TypeAssignment )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:243:2: rule__UnknownType__TypeAssignment
            {
            pushFollow(FOLLOW_rule__UnknownType__TypeAssignment_in_ruleUnknownType412);
            rule__UnknownType__TypeAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownTypeAccess().getTypeAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnknownType"


    // $ANTLR start "entryRuleUnknownValue"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:255:1: entryRuleUnknownValue : ruleUnknownValue EOF ;
    public final void entryRuleUnknownValue() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:256:1: ( ruleUnknownValue EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:257:1: ruleUnknownValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownValueRule()); 
            }
            pushFollow(FOLLOW_ruleUnknownValue_in_entryRuleUnknownValue439);
            ruleUnknownValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknownValue446); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnknownValue"


    // $ANTLR start "ruleUnknownValue"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:264:1: ruleUnknownValue : ( ( rule__UnknownValue__ValueAssignment ) ) ;
    public final void ruleUnknownValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:268:5: ( ( ( rule__UnknownValue__ValueAssignment ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:269:1: ( ( rule__UnknownValue__ValueAssignment ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:269:1: ( ( rule__UnknownValue__ValueAssignment ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:270:1: ( rule__UnknownValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownValueAccess().getValueAssignment()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:271:1: ( rule__UnknownValue__ValueAssignment )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:271:2: rule__UnknownValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__UnknownValue__ValueAssignment_in_ruleUnknownValue476);
            rule__UnknownValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnknownValue"


    // $ANTLR start "entryRuleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:283:1: entryRuleCiteKey : ruleCiteKey EOF ;
    public final void entryRuleCiteKey() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:284:1: ( ruleCiteKey EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:285:1: ruleCiteKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCiteKeyRule()); 
            }
            pushFollow(FOLLOW_ruleCiteKey_in_entryRuleCiteKey503);
            ruleCiteKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCiteKeyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCiteKey510); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCiteKey"


    // $ANTLR start "ruleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:292:1: ruleCiteKey : ( ( rule__CiteKey__KeyAssignment ) ) ;
    public final void ruleCiteKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:296:5: ( ( ( rule__CiteKey__KeyAssignment ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:297:1: ( ( rule__CiteKey__KeyAssignment ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:297:1: ( ( rule__CiteKey__KeyAssignment ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:298:1: ( rule__CiteKey__KeyAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCiteKeyAccess().getKeyAssignment()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:299:1: ( rule__CiteKey__KeyAssignment )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:299:2: rule__CiteKey__KeyAssignment
            {
            pushFollow(FOLLOW_rule__CiteKey__KeyAssignment_in_ruleCiteKey540);
            rule__CiteKey__KeyAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCiteKeyAccess().getKeyAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCiteKey"


    // $ANTLR start "entryRuleAuthorField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:311:1: entryRuleAuthorField : ruleAuthorField EOF ;
    public final void entryRuleAuthorField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:312:1: ( ruleAuthorField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:313:1: ruleAuthorField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldRule()); 
            }
            pushFollow(FOLLOW_ruleAuthorField_in_entryRuleAuthorField567);
            ruleAuthorField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthorField574); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthorField"


    // $ANTLR start "ruleAuthorField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:320:1: ruleAuthorField : ( ( rule__AuthorField__Group__0 ) ) ;
    public final void ruleAuthorField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:324:5: ( ( ( rule__AuthorField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:325:1: ( ( rule__AuthorField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:325:1: ( ( rule__AuthorField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:326:1: ( rule__AuthorField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:327:1: ( rule__AuthorField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:327:2: rule__AuthorField__Group__0
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__0_in_ruleAuthorField604);
            rule__AuthorField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthorField"


    // $ANTLR start "entryRuleAuthors"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:339:1: entryRuleAuthors : ruleAuthors EOF ;
    public final void entryRuleAuthors() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:340:1: ( ruleAuthors EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:341:1: ruleAuthors EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsRule()); 
            }
            pushFollow(FOLLOW_ruleAuthors_in_entryRuleAuthors631);
            ruleAuthors();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthors638); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthors"


    // $ANTLR start "ruleAuthors"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:348:1: ruleAuthors : ( ( rule__Authors__Group__0 ) ) ;
    public final void ruleAuthors() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:352:5: ( ( ( rule__Authors__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:353:1: ( ( rule__Authors__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:353:1: ( ( rule__Authors__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:354:1: ( rule__Authors__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:355:1: ( rule__Authors__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:355:2: rule__Authors__Group__0
            {
            pushFollow(FOLLOW_rule__Authors__Group__0_in_ruleAuthors668);
            rule__Authors__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthors"


    // $ANTLR start "entryRuleFullname"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:367:1: entryRuleFullname : ruleFullname EOF ;
    public final void entryRuleFullname() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:368:1: ( ruleFullname EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:369:1: ruleFullname EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameRule()); 
            }
            pushFollow(FOLLOW_ruleFullname_in_entryRuleFullname695);
            ruleFullname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullname702); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFullname"


    // $ANTLR start "ruleFullname"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:376:1: ruleFullname : ( ( rule__Fullname__Alternatives ) ) ;
    public final void ruleFullname() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:380:5: ( ( ( rule__Fullname__Alternatives ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:381:1: ( ( rule__Fullname__Alternatives ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:381:1: ( ( rule__Fullname__Alternatives ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:382:1: ( rule__Fullname__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getAlternatives()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:383:1: ( rule__Fullname__Alternatives )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:383:2: rule__Fullname__Alternatives
            {
            pushFollow(FOLLOW_rule__Fullname__Alternatives_in_ruleFullname732);
            rule__Fullname__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFullname"


    // $ANTLR start "entryRuleEditorField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:395:1: entryRuleEditorField : ruleEditorField EOF ;
    public final void entryRuleEditorField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:396:1: ( ruleEditorField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:397:1: ruleEditorField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEditorField_in_entryRuleEditorField759);
            ruleEditorField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditorField766); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEditorField"


    // $ANTLR start "ruleEditorField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:404:1: ruleEditorField : ( ( rule__EditorField__Group__0 ) ) ;
    public final void ruleEditorField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:408:5: ( ( ( rule__EditorField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:409:1: ( ( rule__EditorField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:409:1: ( ( rule__EditorField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:410:1: ( rule__EditorField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:411:1: ( rule__EditorField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:411:2: rule__EditorField__Group__0
            {
            pushFollow(FOLLOW_rule__EditorField__Group__0_in_ruleEditorField796);
            rule__EditorField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditorField"


    // $ANTLR start "entryRuleTitleField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:423:1: entryRuleTitleField : ruleTitleField EOF ;
    public final void entryRuleTitleField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:424:1: ( ruleTitleField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:425:1: ruleTitleField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldRule()); 
            }
            pushFollow(FOLLOW_ruleTitleField_in_entryRuleTitleField823);
            ruleTitleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitleField830); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitleField"


    // $ANTLR start "ruleTitleField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:432:1: ruleTitleField : ( ( rule__TitleField__Group__0 ) ) ;
    public final void ruleTitleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:436:5: ( ( ( rule__TitleField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:437:1: ( ( rule__TitleField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:437:1: ( ( rule__TitleField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:438:1: ( rule__TitleField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:439:1: ( rule__TitleField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:439:2: rule__TitleField__Group__0
            {
            pushFollow(FOLLOW_rule__TitleField__Group__0_in_ruleTitleField860);
            rule__TitleField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitleField"


    // $ANTLR start "entryRulePublisherField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:451:1: entryRulePublisherField : rulePublisherField EOF ;
    public final void entryRulePublisherField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:452:1: ( rulePublisherField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:453:1: rulePublisherField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldRule()); 
            }
            pushFollow(FOLLOW_rulePublisherField_in_entryRulePublisherField887);
            rulePublisherField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePublisherField894); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublisherField"


    // $ANTLR start "rulePublisherField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:460:1: rulePublisherField : ( ( rule__PublisherField__Group__0 ) ) ;
    public final void rulePublisherField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:464:5: ( ( ( rule__PublisherField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:465:1: ( ( rule__PublisherField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:465:1: ( ( rule__PublisherField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:466:1: ( rule__PublisherField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:467:1: ( rule__PublisherField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:467:2: rule__PublisherField__Group__0
            {
            pushFollow(FOLLOW_rule__PublisherField__Group__0_in_rulePublisherField924);
            rule__PublisherField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublisherField"


    // $ANTLR start "entryRuleJournalField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:479:1: entryRuleJournalField : ruleJournalField EOF ;
    public final void entryRuleJournalField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:480:1: ( ruleJournalField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:481:1: ruleJournalField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldRule()); 
            }
            pushFollow(FOLLOW_ruleJournalField_in_entryRuleJournalField951);
            ruleJournalField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJournalField958); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJournalField"


    // $ANTLR start "ruleJournalField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:488:1: ruleJournalField : ( ( rule__JournalField__Group__0 ) ) ;
    public final void ruleJournalField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:492:5: ( ( ( rule__JournalField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:493:1: ( ( rule__JournalField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:493:1: ( ( rule__JournalField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:494:1: ( rule__JournalField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:495:1: ( rule__JournalField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:495:2: rule__JournalField__Group__0
            {
            pushFollow(FOLLOW_rule__JournalField__Group__0_in_ruleJournalField988);
            rule__JournalField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJournalField"


    // $ANTLR start "entryRuleYearField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:507:1: entryRuleYearField : ruleYearField EOF ;
    public final void entryRuleYearField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:508:1: ( ruleYearField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:509:1: ruleYearField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldRule()); 
            }
            pushFollow(FOLLOW_ruleYearField_in_entryRuleYearField1015);
            ruleYearField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleYearField1022); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYearField"


    // $ANTLR start "ruleYearField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:516:1: ruleYearField : ( ( rule__YearField__Group__0 ) ) ;
    public final void ruleYearField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:520:5: ( ( ( rule__YearField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:521:1: ( ( rule__YearField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:521:1: ( ( rule__YearField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:522:1: ( rule__YearField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:523:1: ( rule__YearField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:523:2: rule__YearField__Group__0
            {
            pushFollow(FOLLOW_rule__YearField__Group__0_in_ruleYearField1052);
            rule__YearField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYearField"


    // $ANTLR start "entryRuleVolumeField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:535:1: entryRuleVolumeField : ruleVolumeField EOF ;
    public final void entryRuleVolumeField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:536:1: ( ruleVolumeField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:537:1: ruleVolumeField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldRule()); 
            }
            pushFollow(FOLLOW_ruleVolumeField_in_entryRuleVolumeField1079);
            ruleVolumeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolumeField1086); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVolumeField"


    // $ANTLR start "ruleVolumeField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:544:1: ruleVolumeField : ( ( rule__VolumeField__Group__0 ) ) ;
    public final void ruleVolumeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:548:5: ( ( ( rule__VolumeField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:549:1: ( ( rule__VolumeField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:549:1: ( ( rule__VolumeField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:550:1: ( rule__VolumeField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:551:1: ( rule__VolumeField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:551:2: rule__VolumeField__Group__0
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__0_in_ruleVolumeField1116);
            rule__VolumeField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVolumeField"


    // $ANTLR start "entryRuleNumberField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:563:1: entryRuleNumberField : ruleNumberField EOF ;
    public final void entryRuleNumberField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:564:1: ( ruleNumberField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:565:1: ruleNumberField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldRule()); 
            }
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField1143);
            ruleNumberField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField1150); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberField"


    // $ANTLR start "ruleNumberField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:572:1: ruleNumberField : ( ( rule__NumberField__Group__0 ) ) ;
    public final void ruleNumberField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:576:5: ( ( ( rule__NumberField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:577:1: ( ( rule__NumberField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:577:1: ( ( rule__NumberField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:578:1: ( rule__NumberField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:579:1: ( rule__NumberField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:579:2: rule__NumberField__Group__0
            {
            pushFollow(FOLLOW_rule__NumberField__Group__0_in_ruleNumberField1180);
            rule__NumberField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberField"


    // $ANTLR start "entryRulePagesField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:591:1: entryRulePagesField : rulePagesField EOF ;
    public final void entryRulePagesField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:592:1: ( rulePagesField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:593:1: rulePagesField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldRule()); 
            }
            pushFollow(FOLLOW_rulePagesField_in_entryRulePagesField1207);
            rulePagesField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePagesField1214); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePagesField"


    // $ANTLR start "rulePagesField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:600:1: rulePagesField : ( ( rule__PagesField__Group__0 ) ) ;
    public final void rulePagesField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:604:5: ( ( ( rule__PagesField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:605:1: ( ( rule__PagesField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:605:1: ( ( rule__PagesField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:606:1: ( rule__PagesField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:607:1: ( rule__PagesField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:607:2: rule__PagesField__Group__0
            {
            pushFollow(FOLLOW_rule__PagesField__Group__0_in_rulePagesField1244);
            rule__PagesField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePagesField"


    // $ANTLR start "entryRuleMonthField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:619:1: entryRuleMonthField : ruleMonthField EOF ;
    public final void entryRuleMonthField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:620:1: ( ruleMonthField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:621:1: ruleMonthField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldRule()); 
            }
            pushFollow(FOLLOW_ruleMonthField_in_entryRuleMonthField1271);
            ruleMonthField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonthField1278); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMonthField"


    // $ANTLR start "ruleMonthField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:628:1: ruleMonthField : ( ( rule__MonthField__Group__0 ) ) ;
    public final void ruleMonthField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:632:5: ( ( ( rule__MonthField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:633:1: ( ( rule__MonthField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:633:1: ( ( rule__MonthField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:634:1: ( rule__MonthField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:635:1: ( rule__MonthField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:635:2: rule__MonthField__Group__0
            {
            pushFollow(FOLLOW_rule__MonthField__Group__0_in_ruleMonthField1308);
            rule__MonthField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonthField"


    // $ANTLR start "entryRuleAddressField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:647:1: entryRuleAddressField : ruleAddressField EOF ;
    public final void entryRuleAddressField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:648:1: ( ruleAddressField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:649:1: ruleAddressField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldRule()); 
            }
            pushFollow(FOLLOW_ruleAddressField_in_entryRuleAddressField1335);
            ruleAddressField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressField1342); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressField"


    // $ANTLR start "ruleAddressField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:656:1: ruleAddressField : ( ( rule__AddressField__Group__0 ) ) ;
    public final void ruleAddressField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:660:5: ( ( ( rule__AddressField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:661:1: ( ( rule__AddressField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:661:1: ( ( rule__AddressField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:662:1: ( rule__AddressField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:663:1: ( rule__AddressField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:663:2: rule__AddressField__Group__0
            {
            pushFollow(FOLLOW_rule__AddressField__Group__0_in_ruleAddressField1372);
            rule__AddressField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressField"


    // $ANTLR start "entryRuleSeriesField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:675:1: entryRuleSeriesField : ruleSeriesField EOF ;
    public final void entryRuleSeriesField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:676:1: ( ruleSeriesField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:677:1: ruleSeriesField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldRule()); 
            }
            pushFollow(FOLLOW_ruleSeriesField_in_entryRuleSeriesField1399);
            ruleSeriesField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSeriesField1406); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSeriesField"


    // $ANTLR start "ruleSeriesField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:684:1: ruleSeriesField : ( ( rule__SeriesField__Group__0 ) ) ;
    public final void ruleSeriesField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:688:5: ( ( ( rule__SeriesField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:689:1: ( ( rule__SeriesField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:689:1: ( ( rule__SeriesField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:690:1: ( rule__SeriesField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:691:1: ( rule__SeriesField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:691:2: rule__SeriesField__Group__0
            {
            pushFollow(FOLLOW_rule__SeriesField__Group__0_in_ruleSeriesField1436);
            rule__SeriesField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSeriesField"


    // $ANTLR start "entryRuleEditionField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:703:1: entryRuleEditionField : ruleEditionField EOF ;
    public final void entryRuleEditionField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:704:1: ( ruleEditionField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:705:1: ruleEditionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldRule()); 
            }
            pushFollow(FOLLOW_ruleEditionField_in_entryRuleEditionField1463);
            ruleEditionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEditionField1470); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEditionField"


    // $ANTLR start "ruleEditionField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:712:1: ruleEditionField : ( ( rule__EditionField__Group__0 ) ) ;
    public final void ruleEditionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:716:5: ( ( ( rule__EditionField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:717:1: ( ( rule__EditionField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:717:1: ( ( rule__EditionField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:718:1: ( rule__EditionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:719:1: ( rule__EditionField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:719:2: rule__EditionField__Group__0
            {
            pushFollow(FOLLOW_rule__EditionField__Group__0_in_ruleEditionField1500);
            rule__EditionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEditionField"


    // $ANTLR start "entryRuleIsbnField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:731:1: entryRuleIsbnField : ruleIsbnField EOF ;
    public final void entryRuleIsbnField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:732:1: ( ruleIsbnField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:733:1: ruleIsbnField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldRule()); 
            }
            pushFollow(FOLLOW_ruleIsbnField_in_entryRuleIsbnField1527);
            ruleIsbnField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIsbnField1534); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIsbnField"


    // $ANTLR start "ruleIsbnField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:740:1: ruleIsbnField : ( ( rule__IsbnField__Group__0 ) ) ;
    public final void ruleIsbnField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:744:5: ( ( ( rule__IsbnField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:745:1: ( ( rule__IsbnField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:745:1: ( ( rule__IsbnField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:746:1: ( rule__IsbnField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:747:1: ( rule__IsbnField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:747:2: rule__IsbnField__Group__0
            {
            pushFollow(FOLLOW_rule__IsbnField__Group__0_in_ruleIsbnField1564);
            rule__IsbnField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIsbnField"


    // $ANTLR start "entryRuleNoteField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:759:1: entryRuleNoteField : ruleNoteField EOF ;
    public final void entryRuleNoteField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:760:1: ( ruleNoteField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:761:1: ruleNoteField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldRule()); 
            }
            pushFollow(FOLLOW_ruleNoteField_in_entryRuleNoteField1591);
            ruleNoteField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteField1598); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoteField"


    // $ANTLR start "ruleNoteField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:768:1: ruleNoteField : ( ( rule__NoteField__Group__0 ) ) ;
    public final void ruleNoteField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:772:5: ( ( ( rule__NoteField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:773:1: ( ( rule__NoteField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:773:1: ( ( rule__NoteField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:774:1: ( rule__NoteField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldAccess().getGroup()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:775:1: ( rule__NoteField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:775:2: rule__NoteField__Group__0
            {
            pushFollow(FOLLOW_rule__NoteField__Group__0_in_ruleNoteField1628);
            rule__NoteField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoteField"


    // $ANTLR start "rule__BibtexEntryTypes__Alternatives"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:787:1: rule__BibtexEntryTypes__Alternatives : ( ( ruleArticle ) | ( ruleBook ) );
    public final void rule__BibtexEntryTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:791:1: ( ( ruleArticle ) | ( ruleBook ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==CommercialAt) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==Book) ) {
                    alt2=2;
                }
                else if ( (LA2_1==Article) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:792:1: ( ruleArticle )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:792:1: ( ruleArticle )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:793:1: ruleArticle
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleArticle_in_rule__BibtexEntryTypes__Alternatives1664);
                    ruleArticle();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:798:6: ( ruleBook )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:798:6: ( ruleBook )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:799:1: ruleBook
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBibtexEntryTypesAccess().getBookParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBook_in_rule__BibtexEntryTypes__Alternatives1681);
                    ruleBook();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBibtexEntryTypesAccess().getBookParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BibtexEntryTypes__Alternatives"


    // $ANTLR start "rule__Book__Author_editorAlternatives_4_0_1_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:809:1: rule__Book__Author_editorAlternatives_4_0_1_0 : ( ( ruleAuthorField ) | ( ruleEditorField ) );
    public final void rule__Book__Author_editorAlternatives_4_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:813:1: ( ( ruleAuthorField ) | ( ruleEditorField ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Author) ) {
                alt3=1;
            }
            else if ( (LA3_0==Editor) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:814:1: ( ruleAuthorField )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:814:1: ( ruleAuthorField )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:815:1: ruleAuthorField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getAuthor_editorAuthorFieldParserRuleCall_4_0_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleAuthorField_in_rule__Book__Author_editorAlternatives_4_0_1_01713);
                    ruleAuthorField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getAuthor_editorAuthorFieldParserRuleCall_4_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:820:6: ( ruleEditorField )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:820:6: ( ruleEditorField )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:821:1: ruleEditorField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getAuthor_editorEditorFieldParserRuleCall_4_0_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleEditorField_in_rule__Book__Author_editorAlternatives_4_0_1_01730);
                    ruleEditorField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getAuthor_editorEditorFieldParserRuleCall_4_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Author_editorAlternatives_4_0_1_0"


    // $ANTLR start "rule__Book__Volume_numberAlternatives_4_4_1_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:831:1: rule__Book__Volume_numberAlternatives_4_4_1_0 : ( ( ruleVolumeField ) | ( ruleNumberField ) );
    public final void rule__Book__Volume_numberAlternatives_4_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:835:1: ( ( ruleVolumeField ) | ( ruleNumberField ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Volume) ) {
                alt4=1;
            }
            else if ( (LA4_0==Number) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:836:1: ( ruleVolumeField )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:836:1: ( ruleVolumeField )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:837:1: ruleVolumeField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getVolume_numberVolumeFieldParserRuleCall_4_4_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleVolumeField_in_rule__Book__Volume_numberAlternatives_4_4_1_01762);
                    ruleVolumeField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getVolume_numberVolumeFieldParserRuleCall_4_4_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:842:6: ( ruleNumberField )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:842:6: ( ruleNumberField )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:843:1: ruleNumberField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getVolume_numberNumberFieldParserRuleCall_4_4_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberField_in_rule__Book__Volume_numberAlternatives_4_4_1_01779);
                    ruleNumberField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getVolume_numberNumberFieldParserRuleCall_4_4_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Volume_numberAlternatives_4_4_1_0"


    // $ANTLR start "rule__AuthorField__Alternatives_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:853:1: rule__AuthorField__Alternatives_2 : ( ( ( rule__AuthorField__Group_2_0__0 ) ) | ( ( rule__AuthorField__Group_2_1__0 ) ) );
    public final void rule__AuthorField__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:857:1: ( ( ( rule__AuthorField__Group_2_0__0 ) ) | ( ( rule__AuthorField__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==QuotationMark) ) {
                alt5=1;
            }
            else if ( (LA5_0==LeftCurlyBracket) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:858:1: ( ( rule__AuthorField__Group_2_0__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:858:1: ( ( rule__AuthorField__Group_2_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:859:1: ( rule__AuthorField__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAuthorFieldAccess().getGroup_2_0()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:860:1: ( rule__AuthorField__Group_2_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:860:2: rule__AuthorField__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__AuthorField__Group_2_0__0_in_rule__AuthorField__Alternatives_21811);
                    rule__AuthorField__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAuthorFieldAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:864:6: ( ( rule__AuthorField__Group_2_1__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:864:6: ( ( rule__AuthorField__Group_2_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:865:1: ( rule__AuthorField__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAuthorFieldAccess().getGroup_2_1()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:866:1: ( rule__AuthorField__Group_2_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:866:2: rule__AuthorField__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__AuthorField__Group_2_1__0_in_rule__AuthorField__Alternatives_21829);
                    rule__AuthorField__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAuthorFieldAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Alternatives_2"


    // $ANTLR start "rule__Fullname__Alternatives"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:875:1: rule__Fullname__Alternatives : ( ( ( rule__Fullname__Group_0__0 ) ) | ( ( rule__Fullname__Group_1__0 ) ) | ( ( rule__Fullname__FirstnameAssignment_2 ) ) );
    public final void rule__Fullname__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:879:1: ( ( ( rule__Fullname__Group_0__0 ) ) | ( ( rule__Fullname__Group_1__0 ) ) | ( ( rule__Fullname__FirstnameAssignment_2 ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case Comma:
                    {
                    alt6=1;
                    }
                    break;
                case EOF:
                case And:
                case QuotationMark:
                case RightCurlyBracket:
                    {
                    alt6=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt6=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:880:1: ( ( rule__Fullname__Group_0__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:880:1: ( ( rule__Fullname__Group_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:881:1: ( rule__Fullname__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFullnameAccess().getGroup_0()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:882:1: ( rule__Fullname__Group_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:882:2: rule__Fullname__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Fullname__Group_0__0_in_rule__Fullname__Alternatives1862);
                    rule__Fullname__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFullnameAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:886:6: ( ( rule__Fullname__Group_1__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:886:6: ( ( rule__Fullname__Group_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:887:1: ( rule__Fullname__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFullnameAccess().getGroup_1()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:888:1: ( rule__Fullname__Group_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:888:2: rule__Fullname__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Fullname__Group_1__0_in_rule__Fullname__Alternatives1880);
                    rule__Fullname__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFullnameAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:892:6: ( ( rule__Fullname__FirstnameAssignment_2 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:892:6: ( ( rule__Fullname__FirstnameAssignment_2 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:893:1: ( rule__Fullname__FirstnameAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFullnameAccess().getFirstnameAssignment_2()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:894:1: ( rule__Fullname__FirstnameAssignment_2 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:894:2: rule__Fullname__FirstnameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_2_in_rule__Fullname__Alternatives1898);
                    rule__Fullname__FirstnameAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFullnameAccess().getFirstnameAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Alternatives"


    // $ANTLR start "rule__Article__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:905:1: rule__Article__Group__0 : rule__Article__Group__0__Impl rule__Article__Group__1 ;
    public final void rule__Article__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:909:1: ( rule__Article__Group__0__Impl rule__Article__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:910:2: rule__Article__Group__0__Impl rule__Article__Group__1
            {
            pushFollow(FOLLOW_rule__Article__Group__0__Impl_in_rule__Article__Group__01929);
            rule__Article__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group__1_in_rule__Article__Group__01932);
            rule__Article__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0"


    // $ANTLR start "rule__Article__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:917:1: rule__Article__Group__0__Impl : ( CommercialAt ) ;
    public final void rule__Article__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:921:1: ( ( CommercialAt ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:922:1: ( CommercialAt )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:922:1: ( CommercialAt )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:923:1: CommercialAt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommercialAtKeyword_0()); 
            }
            match(input,CommercialAt,FOLLOW_CommercialAt_in_rule__Article__Group__0__Impl1960); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__0__Impl"


    // $ANTLR start "rule__Article__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:936:1: rule__Article__Group__1 : rule__Article__Group__1__Impl rule__Article__Group__2 ;
    public final void rule__Article__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:940:1: ( rule__Article__Group__1__Impl rule__Article__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:941:2: rule__Article__Group__1__Impl rule__Article__Group__2
            {
            pushFollow(FOLLOW_rule__Article__Group__1__Impl_in_rule__Article__Group__11991);
            rule__Article__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group__2_in_rule__Article__Group__11994);
            rule__Article__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1"


    // $ANTLR start "rule__Article__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:948:1: rule__Article__Group__1__Impl : ( Article ) ;
    public final void rule__Article__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:952:1: ( ( Article ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:953:1: ( Article )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:953:1: ( Article )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:954:1: Article
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getArticleKeyword_1()); 
            }
            match(input,Article,FOLLOW_Article_in_rule__Article__Group__1__Impl2022); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getArticleKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__1__Impl"


    // $ANTLR start "rule__Article__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:967:1: rule__Article__Group__2 : rule__Article__Group__2__Impl rule__Article__Group__3 ;
    public final void rule__Article__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:971:1: ( rule__Article__Group__2__Impl rule__Article__Group__3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:972:2: rule__Article__Group__2__Impl rule__Article__Group__3
            {
            pushFollow(FOLLOW_rule__Article__Group__2__Impl_in_rule__Article__Group__22053);
            rule__Article__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group__3_in_rule__Article__Group__22056);
            rule__Article__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2"


    // $ANTLR start "rule__Article__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:979:1: rule__Article__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Article__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:983:1: ( ( LeftCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:984:1: ( LeftCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:984:1: ( LeftCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:985:1: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Article__Group__2__Impl2084); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__2__Impl"


    // $ANTLR start "rule__Article__Group__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:998:1: rule__Article__Group__3 : rule__Article__Group__3__Impl rule__Article__Group__4 ;
    public final void rule__Article__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1002:1: ( rule__Article__Group__3__Impl rule__Article__Group__4 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1003:2: rule__Article__Group__3__Impl rule__Article__Group__4
            {
            pushFollow(FOLLOW_rule__Article__Group__3__Impl_in_rule__Article__Group__32115);
            rule__Article__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group__4_in_rule__Article__Group__32118);
            rule__Article__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__3"


    // $ANTLR start "rule__Article__Group__3__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1010:1: rule__Article__Group__3__Impl : ( ( rule__Article__KeyAssignment_3 ) ) ;
    public final void rule__Article__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1014:1: ( ( ( rule__Article__KeyAssignment_3 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1015:1: ( ( rule__Article__KeyAssignment_3 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1015:1: ( ( rule__Article__KeyAssignment_3 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1016:1: ( rule__Article__KeyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getKeyAssignment_3()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1017:1: ( rule__Article__KeyAssignment_3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1017:2: rule__Article__KeyAssignment_3
            {
            pushFollow(FOLLOW_rule__Article__KeyAssignment_3_in_rule__Article__Group__3__Impl2145);
            rule__Article__KeyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getKeyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__3__Impl"


    // $ANTLR start "rule__Article__Group__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1027:1: rule__Article__Group__4 : rule__Article__Group__4__Impl rule__Article__Group__5 ;
    public final void rule__Article__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1031:1: ( rule__Article__Group__4__Impl rule__Article__Group__5 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1032:2: rule__Article__Group__4__Impl rule__Article__Group__5
            {
            pushFollow(FOLLOW_rule__Article__Group__4__Impl_in_rule__Article__Group__42175);
            rule__Article__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group__5_in_rule__Article__Group__42178);
            rule__Article__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__4"


    // $ANTLR start "rule__Article__Group__4__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1039:1: rule__Article__Group__4__Impl : ( ( rule__Article__UnorderedGroup_4 ) ) ;
    public final void rule__Article__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1043:1: ( ( ( rule__Article__UnorderedGroup_4 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1044:1: ( ( rule__Article__UnorderedGroup_4 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1044:1: ( ( rule__Article__UnorderedGroup_4 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1045:1: ( rule__Article__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getUnorderedGroup_4()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1046:1: ( rule__Article__UnorderedGroup_4 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1046:2: rule__Article__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4_in_rule__Article__Group__4__Impl2205);
            rule__Article__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__4__Impl"


    // $ANTLR start "rule__Article__Group__5"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1056:1: rule__Article__Group__5 : rule__Article__Group__5__Impl ;
    public final void rule__Article__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1060:1: ( rule__Article__Group__5__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1061:2: rule__Article__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group__5__Impl_in_rule__Article__Group__52235);
            rule__Article__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__5"


    // $ANTLR start "rule__Article__Group__5__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1067:1: rule__Article__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Article__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1071:1: ( ( RightCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1072:1: ( RightCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1072:1: ( RightCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1073:1: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Article__Group__5__Impl2263); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group__5__Impl"


    // $ANTLR start "rule__Article__Group_4_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1098:1: rule__Article__Group_4_0__0 : rule__Article__Group_4_0__0__Impl rule__Article__Group_4_0__1 ;
    public final void rule__Article__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1102:1: ( rule__Article__Group_4_0__0__Impl rule__Article__Group_4_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1103:2: rule__Article__Group_4_0__0__Impl rule__Article__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_0__0__Impl_in_rule__Article__Group_4_0__02306);
            rule__Article__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_0__1_in_rule__Article__Group_4_0__02309);
            rule__Article__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_0__0"


    // $ANTLR start "rule__Article__Group_4_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1110:1: rule__Article__Group_4_0__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1114:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1115:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1115:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1116:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_0_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_0__0__Impl2337); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_0__0__Impl"


    // $ANTLR start "rule__Article__Group_4_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1129:1: rule__Article__Group_4_0__1 : rule__Article__Group_4_0__1__Impl ;
    public final void rule__Article__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1133:1: ( rule__Article__Group_4_0__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1134:2: rule__Article__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_0__1__Impl_in_rule__Article__Group_4_0__12368);
            rule__Article__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_0__1"


    // $ANTLR start "rule__Article__Group_4_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1140:1: rule__Article__Group_4_0__1__Impl : ( ( rule__Article__AuthorAssignment_4_0_1 ) ) ;
    public final void rule__Article__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1144:1: ( ( ( rule__Article__AuthorAssignment_4_0_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1145:1: ( ( rule__Article__AuthorAssignment_4_0_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1145:1: ( ( rule__Article__AuthorAssignment_4_0_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1146:1: ( rule__Article__AuthorAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getAuthorAssignment_4_0_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1147:1: ( rule__Article__AuthorAssignment_4_0_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1147:2: rule__Article__AuthorAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Article__AuthorAssignment_4_0_1_in_rule__Article__Group_4_0__1__Impl2395);
            rule__Article__AuthorAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getAuthorAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_0__1__Impl"


    // $ANTLR start "rule__Article__Group_4_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1161:1: rule__Article__Group_4_1__0 : rule__Article__Group_4_1__0__Impl rule__Article__Group_4_1__1 ;
    public final void rule__Article__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1165:1: ( rule__Article__Group_4_1__0__Impl rule__Article__Group_4_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1166:2: rule__Article__Group_4_1__0__Impl rule__Article__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_1__0__Impl_in_rule__Article__Group_4_1__02429);
            rule__Article__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_1__1_in_rule__Article__Group_4_1__02432);
            rule__Article__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_1__0"


    // $ANTLR start "rule__Article__Group_4_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1173:1: rule__Article__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1177:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1178:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1178:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1179:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_1__0__Impl2460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_1__0__Impl"


    // $ANTLR start "rule__Article__Group_4_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1192:1: rule__Article__Group_4_1__1 : rule__Article__Group_4_1__1__Impl ;
    public final void rule__Article__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1196:1: ( rule__Article__Group_4_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1197:2: rule__Article__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_1__1__Impl_in_rule__Article__Group_4_1__12491);
            rule__Article__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_1__1"


    // $ANTLR start "rule__Article__Group_4_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1203:1: rule__Article__Group_4_1__1__Impl : ( ( rule__Article__TitleAssignment_4_1_1 ) ) ;
    public final void rule__Article__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1207:1: ( ( ( rule__Article__TitleAssignment_4_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1208:1: ( ( rule__Article__TitleAssignment_4_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1208:1: ( ( rule__Article__TitleAssignment_4_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1209:1: ( rule__Article__TitleAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getTitleAssignment_4_1_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1210:1: ( rule__Article__TitleAssignment_4_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1210:2: rule__Article__TitleAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Article__TitleAssignment_4_1_1_in_rule__Article__Group_4_1__1__Impl2518);
            rule__Article__TitleAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getTitleAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_1__1__Impl"


    // $ANTLR start "rule__Article__Group_4_2__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1224:1: rule__Article__Group_4_2__0 : rule__Article__Group_4_2__0__Impl rule__Article__Group_4_2__1 ;
    public final void rule__Article__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1228:1: ( rule__Article__Group_4_2__0__Impl rule__Article__Group_4_2__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1229:2: rule__Article__Group_4_2__0__Impl rule__Article__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_2__0__Impl_in_rule__Article__Group_4_2__02552);
            rule__Article__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_2__1_in_rule__Article__Group_4_2__02555);
            rule__Article__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_2__0"


    // $ANTLR start "rule__Article__Group_4_2__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1236:1: rule__Article__Group_4_2__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1240:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1241:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1241:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1242:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_2__0__Impl2583); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_2__0__Impl"


    // $ANTLR start "rule__Article__Group_4_2__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1255:1: rule__Article__Group_4_2__1 : rule__Article__Group_4_2__1__Impl ;
    public final void rule__Article__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1259:1: ( rule__Article__Group_4_2__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1260:2: rule__Article__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_2__1__Impl_in_rule__Article__Group_4_2__12614);
            rule__Article__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_2__1"


    // $ANTLR start "rule__Article__Group_4_2__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1266:1: rule__Article__Group_4_2__1__Impl : ( ( rule__Article__JournalAssignment_4_2_1 ) ) ;
    public final void rule__Article__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1270:1: ( ( ( rule__Article__JournalAssignment_4_2_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1271:1: ( ( rule__Article__JournalAssignment_4_2_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1271:1: ( ( rule__Article__JournalAssignment_4_2_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1272:1: ( rule__Article__JournalAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getJournalAssignment_4_2_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1273:1: ( rule__Article__JournalAssignment_4_2_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1273:2: rule__Article__JournalAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Article__JournalAssignment_4_2_1_in_rule__Article__Group_4_2__1__Impl2641);
            rule__Article__JournalAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getJournalAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_2__1__Impl"


    // $ANTLR start "rule__Article__Group_4_3__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1287:1: rule__Article__Group_4_3__0 : rule__Article__Group_4_3__0__Impl rule__Article__Group_4_3__1 ;
    public final void rule__Article__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1291:1: ( rule__Article__Group_4_3__0__Impl rule__Article__Group_4_3__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1292:2: rule__Article__Group_4_3__0__Impl rule__Article__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_3__0__Impl_in_rule__Article__Group_4_3__02675);
            rule__Article__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_3__1_in_rule__Article__Group_4_3__02678);
            rule__Article__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_3__0"


    // $ANTLR start "rule__Article__Group_4_3__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1299:1: rule__Article__Group_4_3__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1303:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1304:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1304:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1305:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_3_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_3__0__Impl2706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_3__0__Impl"


    // $ANTLR start "rule__Article__Group_4_3__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1318:1: rule__Article__Group_4_3__1 : rule__Article__Group_4_3__1__Impl ;
    public final void rule__Article__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1322:1: ( rule__Article__Group_4_3__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1323:2: rule__Article__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_3__1__Impl_in_rule__Article__Group_4_3__12737);
            rule__Article__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_3__1"


    // $ANTLR start "rule__Article__Group_4_3__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1329:1: rule__Article__Group_4_3__1__Impl : ( ( rule__Article__YearAssignment_4_3_1 ) ) ;
    public final void rule__Article__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1333:1: ( ( ( rule__Article__YearAssignment_4_3_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1334:1: ( ( rule__Article__YearAssignment_4_3_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1334:1: ( ( rule__Article__YearAssignment_4_3_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1335:1: ( rule__Article__YearAssignment_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getYearAssignment_4_3_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1336:1: ( rule__Article__YearAssignment_4_3_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1336:2: rule__Article__YearAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Article__YearAssignment_4_3_1_in_rule__Article__Group_4_3__1__Impl2764);
            rule__Article__YearAssignment_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getYearAssignment_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_3__1__Impl"


    // $ANTLR start "rule__Article__Group_4_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1350:1: rule__Article__Group_4_4__0 : rule__Article__Group_4_4__0__Impl rule__Article__Group_4_4__1 ;
    public final void rule__Article__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1354:1: ( rule__Article__Group_4_4__0__Impl rule__Article__Group_4_4__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1355:2: rule__Article__Group_4_4__0__Impl rule__Article__Group_4_4__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_4__0__Impl_in_rule__Article__Group_4_4__02798);
            rule__Article__Group_4_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_4__1_in_rule__Article__Group_4_4__02801);
            rule__Article__Group_4_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_4__0"


    // $ANTLR start "rule__Article__Group_4_4__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1362:1: rule__Article__Group_4_4__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1366:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1367:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1367:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1368:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_4_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_4__0__Impl2829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_4__0__Impl"


    // $ANTLR start "rule__Article__Group_4_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1381:1: rule__Article__Group_4_4__1 : rule__Article__Group_4_4__1__Impl ;
    public final void rule__Article__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1385:1: ( rule__Article__Group_4_4__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1386:2: rule__Article__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_4__1__Impl_in_rule__Article__Group_4_4__12860);
            rule__Article__Group_4_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_4__1"


    // $ANTLR start "rule__Article__Group_4_4__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1392:1: rule__Article__Group_4_4__1__Impl : ( ( rule__Article__VolumeAssignment_4_4_1 ) ) ;
    public final void rule__Article__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1396:1: ( ( ( rule__Article__VolumeAssignment_4_4_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1397:1: ( ( rule__Article__VolumeAssignment_4_4_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1397:1: ( ( rule__Article__VolumeAssignment_4_4_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1398:1: ( rule__Article__VolumeAssignment_4_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getVolumeAssignment_4_4_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1399:1: ( rule__Article__VolumeAssignment_4_4_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1399:2: rule__Article__VolumeAssignment_4_4_1
            {
            pushFollow(FOLLOW_rule__Article__VolumeAssignment_4_4_1_in_rule__Article__Group_4_4__1__Impl2887);
            rule__Article__VolumeAssignment_4_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getVolumeAssignment_4_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_4__1__Impl"


    // $ANTLR start "rule__Article__Group_4_5__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1413:1: rule__Article__Group_4_5__0 : rule__Article__Group_4_5__0__Impl rule__Article__Group_4_5__1 ;
    public final void rule__Article__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1417:1: ( rule__Article__Group_4_5__0__Impl rule__Article__Group_4_5__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1418:2: rule__Article__Group_4_5__0__Impl rule__Article__Group_4_5__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_5__0__Impl_in_rule__Article__Group_4_5__02921);
            rule__Article__Group_4_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_5__1_in_rule__Article__Group_4_5__02924);
            rule__Article__Group_4_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_5__0"


    // $ANTLR start "rule__Article__Group_4_5__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1425:1: rule__Article__Group_4_5__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1429:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1430:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1430:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1431:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_5_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_5__0__Impl2952); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_5__0__Impl"


    // $ANTLR start "rule__Article__Group_4_5__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1444:1: rule__Article__Group_4_5__1 : rule__Article__Group_4_5__1__Impl ;
    public final void rule__Article__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1448:1: ( rule__Article__Group_4_5__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1449:2: rule__Article__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_5__1__Impl_in_rule__Article__Group_4_5__12983);
            rule__Article__Group_4_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_5__1"


    // $ANTLR start "rule__Article__Group_4_5__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1455:1: rule__Article__Group_4_5__1__Impl : ( ( rule__Article__NumberAssignment_4_5_1 ) ) ;
    public final void rule__Article__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1459:1: ( ( ( rule__Article__NumberAssignment_4_5_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1460:1: ( ( rule__Article__NumberAssignment_4_5_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1460:1: ( ( rule__Article__NumberAssignment_4_5_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1461:1: ( rule__Article__NumberAssignment_4_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getNumberAssignment_4_5_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1462:1: ( rule__Article__NumberAssignment_4_5_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1462:2: rule__Article__NumberAssignment_4_5_1
            {
            pushFollow(FOLLOW_rule__Article__NumberAssignment_4_5_1_in_rule__Article__Group_4_5__1__Impl3010);
            rule__Article__NumberAssignment_4_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getNumberAssignment_4_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_5__1__Impl"


    // $ANTLR start "rule__Article__Group_4_6__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1476:1: rule__Article__Group_4_6__0 : rule__Article__Group_4_6__0__Impl rule__Article__Group_4_6__1 ;
    public final void rule__Article__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1480:1: ( rule__Article__Group_4_6__0__Impl rule__Article__Group_4_6__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1481:2: rule__Article__Group_4_6__0__Impl rule__Article__Group_4_6__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_6__0__Impl_in_rule__Article__Group_4_6__03044);
            rule__Article__Group_4_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_6__1_in_rule__Article__Group_4_6__03047);
            rule__Article__Group_4_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_6__0"


    // $ANTLR start "rule__Article__Group_4_6__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1488:1: rule__Article__Group_4_6__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1492:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1493:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1493:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1494:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_6_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_6__0__Impl3075); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_6__0__Impl"


    // $ANTLR start "rule__Article__Group_4_6__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1507:1: rule__Article__Group_4_6__1 : rule__Article__Group_4_6__1__Impl ;
    public final void rule__Article__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1511:1: ( rule__Article__Group_4_6__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1512:2: rule__Article__Group_4_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_6__1__Impl_in_rule__Article__Group_4_6__13106);
            rule__Article__Group_4_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_6__1"


    // $ANTLR start "rule__Article__Group_4_6__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1518:1: rule__Article__Group_4_6__1__Impl : ( ( rule__Article__PagesAssignment_4_6_1 ) ) ;
    public final void rule__Article__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1522:1: ( ( ( rule__Article__PagesAssignment_4_6_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1523:1: ( ( rule__Article__PagesAssignment_4_6_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1523:1: ( ( rule__Article__PagesAssignment_4_6_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1524:1: ( rule__Article__PagesAssignment_4_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getPagesAssignment_4_6_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1525:1: ( rule__Article__PagesAssignment_4_6_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1525:2: rule__Article__PagesAssignment_4_6_1
            {
            pushFollow(FOLLOW_rule__Article__PagesAssignment_4_6_1_in_rule__Article__Group_4_6__1__Impl3133);
            rule__Article__PagesAssignment_4_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getPagesAssignment_4_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_6__1__Impl"


    // $ANTLR start "rule__Article__Group_4_7__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1539:1: rule__Article__Group_4_7__0 : rule__Article__Group_4_7__0__Impl rule__Article__Group_4_7__1 ;
    public final void rule__Article__Group_4_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1543:1: ( rule__Article__Group_4_7__0__Impl rule__Article__Group_4_7__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1544:2: rule__Article__Group_4_7__0__Impl rule__Article__Group_4_7__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_7__0__Impl_in_rule__Article__Group_4_7__03167);
            rule__Article__Group_4_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_7__1_in_rule__Article__Group_4_7__03170);
            rule__Article__Group_4_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_7__0"


    // $ANTLR start "rule__Article__Group_4_7__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1551:1: rule__Article__Group_4_7__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1555:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1556:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1556:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1557:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_7_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_7__0__Impl3198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_7__0__Impl"


    // $ANTLR start "rule__Article__Group_4_7__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1570:1: rule__Article__Group_4_7__1 : rule__Article__Group_4_7__1__Impl ;
    public final void rule__Article__Group_4_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1574:1: ( rule__Article__Group_4_7__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1575:2: rule__Article__Group_4_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_7__1__Impl_in_rule__Article__Group_4_7__13229);
            rule__Article__Group_4_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_7__1"


    // $ANTLR start "rule__Article__Group_4_7__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1581:1: rule__Article__Group_4_7__1__Impl : ( ( rule__Article__MonthAssignment_4_7_1 ) ) ;
    public final void rule__Article__Group_4_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1585:1: ( ( ( rule__Article__MonthAssignment_4_7_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1586:1: ( ( rule__Article__MonthAssignment_4_7_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1586:1: ( ( rule__Article__MonthAssignment_4_7_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1587:1: ( rule__Article__MonthAssignment_4_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getMonthAssignment_4_7_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1588:1: ( rule__Article__MonthAssignment_4_7_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1588:2: rule__Article__MonthAssignment_4_7_1
            {
            pushFollow(FOLLOW_rule__Article__MonthAssignment_4_7_1_in_rule__Article__Group_4_7__1__Impl3256);
            rule__Article__MonthAssignment_4_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getMonthAssignment_4_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_7__1__Impl"


    // $ANTLR start "rule__Article__Group_4_8__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1602:1: rule__Article__Group_4_8__0 : rule__Article__Group_4_8__0__Impl rule__Article__Group_4_8__1 ;
    public final void rule__Article__Group_4_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1606:1: ( rule__Article__Group_4_8__0__Impl rule__Article__Group_4_8__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1607:2: rule__Article__Group_4_8__0__Impl rule__Article__Group_4_8__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_8__0__Impl_in_rule__Article__Group_4_8__03290);
            rule__Article__Group_4_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_8__1_in_rule__Article__Group_4_8__03293);
            rule__Article__Group_4_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_8__0"


    // $ANTLR start "rule__Article__Group_4_8__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1614:1: rule__Article__Group_4_8__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1618:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1619:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1619:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1620:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_8_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_8__0__Impl3321); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_8__0__Impl"


    // $ANTLR start "rule__Article__Group_4_8__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1633:1: rule__Article__Group_4_8__1 : rule__Article__Group_4_8__1__Impl ;
    public final void rule__Article__Group_4_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1637:1: ( rule__Article__Group_4_8__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1638:2: rule__Article__Group_4_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_8__1__Impl_in_rule__Article__Group_4_8__13352);
            rule__Article__Group_4_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_8__1"


    // $ANTLR start "rule__Article__Group_4_8__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1644:1: rule__Article__Group_4_8__1__Impl : ( ( rule__Article__NoteAssignment_4_8_1 ) ) ;
    public final void rule__Article__Group_4_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1648:1: ( ( ( rule__Article__NoteAssignment_4_8_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1649:1: ( ( rule__Article__NoteAssignment_4_8_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1649:1: ( ( rule__Article__NoteAssignment_4_8_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1650:1: ( rule__Article__NoteAssignment_4_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getNoteAssignment_4_8_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1651:1: ( rule__Article__NoteAssignment_4_8_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1651:2: rule__Article__NoteAssignment_4_8_1
            {
            pushFollow(FOLLOW_rule__Article__NoteAssignment_4_8_1_in_rule__Article__Group_4_8__1__Impl3379);
            rule__Article__NoteAssignment_4_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getNoteAssignment_4_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_8__1__Impl"


    // $ANTLR start "rule__Article__Group_4_9__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1665:1: rule__Article__Group_4_9__0 : rule__Article__Group_4_9__0__Impl rule__Article__Group_4_9__1 ;
    public final void rule__Article__Group_4_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1669:1: ( rule__Article__Group_4_9__0__Impl rule__Article__Group_4_9__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1670:2: rule__Article__Group_4_9__0__Impl rule__Article__Group_4_9__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4_9__0__Impl_in_rule__Article__Group_4_9__03413);
            rule__Article__Group_4_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Article__Group_4_9__1_in_rule__Article__Group_4_9__03416);
            rule__Article__Group_4_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_9__0"


    // $ANTLR start "rule__Article__Group_4_9__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1677:1: rule__Article__Group_4_9__0__Impl : ( Comma ) ;
    public final void rule__Article__Group_4_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1681:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1682:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1682:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1683:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getCommaKeyword_4_9_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Article__Group_4_9__0__Impl3444); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getCommaKeyword_4_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_9__0__Impl"


    // $ANTLR start "rule__Article__Group_4_9__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1696:1: rule__Article__Group_4_9__1 : rule__Article__Group_4_9__1__Impl ;
    public final void rule__Article__Group_4_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1700:1: ( rule__Article__Group_4_9__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1701:2: rule__Article__Group_4_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4_9__1__Impl_in_rule__Article__Group_4_9__13475);
            rule__Article__Group_4_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_9__1"


    // $ANTLR start "rule__Article__Group_4_9__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1707:1: rule__Article__Group_4_9__1__Impl : ( ( rule__Article__UnknownsAssignment_4_9_1 ) ) ;
    public final void rule__Article__Group_4_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1711:1: ( ( ( rule__Article__UnknownsAssignment_4_9_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1712:1: ( ( rule__Article__UnknownsAssignment_4_9_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1712:1: ( ( rule__Article__UnknownsAssignment_4_9_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1713:1: ( rule__Article__UnknownsAssignment_4_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getUnknownsAssignment_4_9_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1714:1: ( rule__Article__UnknownsAssignment_4_9_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1714:2: rule__Article__UnknownsAssignment_4_9_1
            {
            pushFollow(FOLLOW_rule__Article__UnknownsAssignment_4_9_1_in_rule__Article__Group_4_9__1__Impl3502);
            rule__Article__UnknownsAssignment_4_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getUnknownsAssignment_4_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4_9__1__Impl"


    // $ANTLR start "rule__Book__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1728:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1732:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1733:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_rule__Book__Group__0__Impl_in_rule__Book__Group__03536);
            rule__Book__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group__1_in_rule__Book__Group__03539);
            rule__Book__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1740:1: rule__Book__Group__0__Impl : ( CommercialAt ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1744:1: ( ( CommercialAt ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1745:1: ( CommercialAt )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1745:1: ( CommercialAt )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1746:1: CommercialAt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommercialAtKeyword_0()); 
            }
            match(input,CommercialAt,FOLLOW_CommercialAt_in_rule__Book__Group__0__Impl3567); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1759:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1763:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1764:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_rule__Book__Group__1__Impl_in_rule__Book__Group__13598);
            rule__Book__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group__2_in_rule__Book__Group__13601);
            rule__Book__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1771:1: rule__Book__Group__1__Impl : ( Book ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1775:1: ( ( Book ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1776:1: ( Book )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1776:1: ( Book )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1777:1: Book
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getBookKeyword_1()); 
            }
            match(input,Book,FOLLOW_Book_in_rule__Book__Group__1__Impl3629); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getBookKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1790:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1794:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1795:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_rule__Book__Group__2__Impl_in_rule__Book__Group__23660);
            rule__Book__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group__3_in_rule__Book__Group__23663);
            rule__Book__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1802:1: rule__Book__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1806:1: ( ( LeftCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1807:1: ( LeftCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1807:1: ( LeftCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1808:1: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__Book__Group__2__Impl3691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1821:1: rule__Book__Group__3 : rule__Book__Group__3__Impl rule__Book__Group__4 ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1825:1: ( rule__Book__Group__3__Impl rule__Book__Group__4 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1826:2: rule__Book__Group__3__Impl rule__Book__Group__4
            {
            pushFollow(FOLLOW_rule__Book__Group__3__Impl_in_rule__Book__Group__33722);
            rule__Book__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group__4_in_rule__Book__Group__33725);
            rule__Book__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1833:1: rule__Book__Group__3__Impl : ( ( rule__Book__KeyAssignment_3 ) ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1837:1: ( ( ( rule__Book__KeyAssignment_3 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1838:1: ( ( rule__Book__KeyAssignment_3 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1838:1: ( ( rule__Book__KeyAssignment_3 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1839:1: ( rule__Book__KeyAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getKeyAssignment_3()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1840:1: ( rule__Book__KeyAssignment_3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1840:2: rule__Book__KeyAssignment_3
            {
            pushFollow(FOLLOW_rule__Book__KeyAssignment_3_in_rule__Book__Group__3__Impl3752);
            rule__Book__KeyAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getKeyAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__Book__Group__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1850:1: rule__Book__Group__4 : rule__Book__Group__4__Impl rule__Book__Group__5 ;
    public final void rule__Book__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1854:1: ( rule__Book__Group__4__Impl rule__Book__Group__5 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1855:2: rule__Book__Group__4__Impl rule__Book__Group__5
            {
            pushFollow(FOLLOW_rule__Book__Group__4__Impl_in_rule__Book__Group__43782);
            rule__Book__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group__5_in_rule__Book__Group__43785);
            rule__Book__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4"


    // $ANTLR start "rule__Book__Group__4__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1862:1: rule__Book__Group__4__Impl : ( ( rule__Book__UnorderedGroup_4 ) ) ;
    public final void rule__Book__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1866:1: ( ( ( rule__Book__UnorderedGroup_4 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1867:1: ( ( rule__Book__UnorderedGroup_4 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1867:1: ( ( rule__Book__UnorderedGroup_4 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1868:1: ( rule__Book__UnorderedGroup_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getUnorderedGroup_4()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1869:1: ( rule__Book__UnorderedGroup_4 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1869:2: rule__Book__UnorderedGroup_4
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4_in_rule__Book__Group__4__Impl3812);
            rule__Book__UnorderedGroup_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getUnorderedGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__4__Impl"


    // $ANTLR start "rule__Book__Group__5"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1879:1: rule__Book__Group__5 : rule__Book__Group__5__Impl ;
    public final void rule__Book__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1883:1: ( rule__Book__Group__5__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1884:2: rule__Book__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group__5__Impl_in_rule__Book__Group__53842);
            rule__Book__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5"


    // $ANTLR start "rule__Book__Group__5__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1890:1: rule__Book__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Book__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1894:1: ( ( RightCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1895:1: ( RightCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1895:1: ( RightCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1896:1: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__Book__Group__5__Impl3870); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group__5__Impl"


    // $ANTLR start "rule__Book__Group_4_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1921:1: rule__Book__Group_4_0__0 : rule__Book__Group_4_0__0__Impl rule__Book__Group_4_0__1 ;
    public final void rule__Book__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1925:1: ( rule__Book__Group_4_0__0__Impl rule__Book__Group_4_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1926:2: rule__Book__Group_4_0__0__Impl rule__Book__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_0__0__Impl_in_rule__Book__Group_4_0__03913);
            rule__Book__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_0__1_in_rule__Book__Group_4_0__03916);
            rule__Book__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_0__0"


    // $ANTLR start "rule__Book__Group_4_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1933:1: rule__Book__Group_4_0__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1937:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1938:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1938:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1939:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_0_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_0__0__Impl3944); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_0__0__Impl"


    // $ANTLR start "rule__Book__Group_4_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1952:1: rule__Book__Group_4_0__1 : rule__Book__Group_4_0__1__Impl ;
    public final void rule__Book__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1956:1: ( rule__Book__Group_4_0__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1957:2: rule__Book__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_0__1__Impl_in_rule__Book__Group_4_0__13975);
            rule__Book__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_0__1"


    // $ANTLR start "rule__Book__Group_4_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1963:1: rule__Book__Group_4_0__1__Impl : ( ( rule__Book__Author_editorAssignment_4_0_1 ) ) ;
    public final void rule__Book__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1967:1: ( ( ( rule__Book__Author_editorAssignment_4_0_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1968:1: ( ( rule__Book__Author_editorAssignment_4_0_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1968:1: ( ( rule__Book__Author_editorAssignment_4_0_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1969:1: ( rule__Book__Author_editorAssignment_4_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getAuthor_editorAssignment_4_0_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1970:1: ( rule__Book__Author_editorAssignment_4_0_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1970:2: rule__Book__Author_editorAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Book__Author_editorAssignment_4_0_1_in_rule__Book__Group_4_0__1__Impl4002);
            rule__Book__Author_editorAssignment_4_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getAuthor_editorAssignment_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_0__1__Impl"


    // $ANTLR start "rule__Book__Group_4_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1984:1: rule__Book__Group_4_1__0 : rule__Book__Group_4_1__0__Impl rule__Book__Group_4_1__1 ;
    public final void rule__Book__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1988:1: ( rule__Book__Group_4_1__0__Impl rule__Book__Group_4_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1989:2: rule__Book__Group_4_1__0__Impl rule__Book__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_1__0__Impl_in_rule__Book__Group_4_1__04036);
            rule__Book__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_1__1_in_rule__Book__Group_4_1__04039);
            rule__Book__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_1__0"


    // $ANTLR start "rule__Book__Group_4_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:1996:1: rule__Book__Group_4_1__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2000:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2001:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2001:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2002:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_1_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_1__0__Impl4067); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_1__0__Impl"


    // $ANTLR start "rule__Book__Group_4_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2015:1: rule__Book__Group_4_1__1 : rule__Book__Group_4_1__1__Impl ;
    public final void rule__Book__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2019:1: ( rule__Book__Group_4_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2020:2: rule__Book__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_1__1__Impl_in_rule__Book__Group_4_1__14098);
            rule__Book__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_1__1"


    // $ANTLR start "rule__Book__Group_4_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2026:1: rule__Book__Group_4_1__1__Impl : ( ( rule__Book__TitleAssignment_4_1_1 ) ) ;
    public final void rule__Book__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2030:1: ( ( ( rule__Book__TitleAssignment_4_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2031:1: ( ( rule__Book__TitleAssignment_4_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2031:1: ( ( rule__Book__TitleAssignment_4_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2032:1: ( rule__Book__TitleAssignment_4_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getTitleAssignment_4_1_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2033:1: ( rule__Book__TitleAssignment_4_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2033:2: rule__Book__TitleAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Book__TitleAssignment_4_1_1_in_rule__Book__Group_4_1__1__Impl4125);
            rule__Book__TitleAssignment_4_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getTitleAssignment_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_1__1__Impl"


    // $ANTLR start "rule__Book__Group_4_2__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2047:1: rule__Book__Group_4_2__0 : rule__Book__Group_4_2__0__Impl rule__Book__Group_4_2__1 ;
    public final void rule__Book__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2051:1: ( rule__Book__Group_4_2__0__Impl rule__Book__Group_4_2__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2052:2: rule__Book__Group_4_2__0__Impl rule__Book__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_2__0__Impl_in_rule__Book__Group_4_2__04159);
            rule__Book__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_2__1_in_rule__Book__Group_4_2__04162);
            rule__Book__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_2__0"


    // $ANTLR start "rule__Book__Group_4_2__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2059:1: rule__Book__Group_4_2__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2063:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2064:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2064:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2065:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_2__0__Impl4190); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_2__0__Impl"


    // $ANTLR start "rule__Book__Group_4_2__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2078:1: rule__Book__Group_4_2__1 : rule__Book__Group_4_2__1__Impl ;
    public final void rule__Book__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2082:1: ( rule__Book__Group_4_2__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2083:2: rule__Book__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_2__1__Impl_in_rule__Book__Group_4_2__14221);
            rule__Book__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_2__1"


    // $ANTLR start "rule__Book__Group_4_2__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2089:1: rule__Book__Group_4_2__1__Impl : ( ( rule__Book__PublisherAssignment_4_2_1 ) ) ;
    public final void rule__Book__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2093:1: ( ( ( rule__Book__PublisherAssignment_4_2_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2094:1: ( ( rule__Book__PublisherAssignment_4_2_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2094:1: ( ( rule__Book__PublisherAssignment_4_2_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2095:1: ( rule__Book__PublisherAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getPublisherAssignment_4_2_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2096:1: ( rule__Book__PublisherAssignment_4_2_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2096:2: rule__Book__PublisherAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Book__PublisherAssignment_4_2_1_in_rule__Book__Group_4_2__1__Impl4248);
            rule__Book__PublisherAssignment_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getPublisherAssignment_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_2__1__Impl"


    // $ANTLR start "rule__Book__Group_4_3__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2110:1: rule__Book__Group_4_3__0 : rule__Book__Group_4_3__0__Impl rule__Book__Group_4_3__1 ;
    public final void rule__Book__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2114:1: ( rule__Book__Group_4_3__0__Impl rule__Book__Group_4_3__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2115:2: rule__Book__Group_4_3__0__Impl rule__Book__Group_4_3__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_3__0__Impl_in_rule__Book__Group_4_3__04282);
            rule__Book__Group_4_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_3__1_in_rule__Book__Group_4_3__04285);
            rule__Book__Group_4_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_3__0"


    // $ANTLR start "rule__Book__Group_4_3__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2122:1: rule__Book__Group_4_3__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2126:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2127:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2127:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2128:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_3_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_3__0__Impl4313); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_3__0__Impl"


    // $ANTLR start "rule__Book__Group_4_3__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2141:1: rule__Book__Group_4_3__1 : rule__Book__Group_4_3__1__Impl ;
    public final void rule__Book__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2145:1: ( rule__Book__Group_4_3__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2146:2: rule__Book__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_3__1__Impl_in_rule__Book__Group_4_3__14344);
            rule__Book__Group_4_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_3__1"


    // $ANTLR start "rule__Book__Group_4_3__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2152:1: rule__Book__Group_4_3__1__Impl : ( ( rule__Book__YearAssignment_4_3_1 ) ) ;
    public final void rule__Book__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2156:1: ( ( ( rule__Book__YearAssignment_4_3_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2157:1: ( ( rule__Book__YearAssignment_4_3_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2157:1: ( ( rule__Book__YearAssignment_4_3_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2158:1: ( rule__Book__YearAssignment_4_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getYearAssignment_4_3_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2159:1: ( rule__Book__YearAssignment_4_3_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2159:2: rule__Book__YearAssignment_4_3_1
            {
            pushFollow(FOLLOW_rule__Book__YearAssignment_4_3_1_in_rule__Book__Group_4_3__1__Impl4371);
            rule__Book__YearAssignment_4_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getYearAssignment_4_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_3__1__Impl"


    // $ANTLR start "rule__Book__Group_4_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2173:1: rule__Book__Group_4_4__0 : rule__Book__Group_4_4__0__Impl rule__Book__Group_4_4__1 ;
    public final void rule__Book__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2177:1: ( rule__Book__Group_4_4__0__Impl rule__Book__Group_4_4__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2178:2: rule__Book__Group_4_4__0__Impl rule__Book__Group_4_4__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_4__0__Impl_in_rule__Book__Group_4_4__04405);
            rule__Book__Group_4_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_4__1_in_rule__Book__Group_4_4__04408);
            rule__Book__Group_4_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_4__0"


    // $ANTLR start "rule__Book__Group_4_4__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2185:1: rule__Book__Group_4_4__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2189:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2190:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2190:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2191:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_4_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_4__0__Impl4436); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_4__0__Impl"


    // $ANTLR start "rule__Book__Group_4_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2204:1: rule__Book__Group_4_4__1 : rule__Book__Group_4_4__1__Impl ;
    public final void rule__Book__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2208:1: ( rule__Book__Group_4_4__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2209:2: rule__Book__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_4__1__Impl_in_rule__Book__Group_4_4__14467);
            rule__Book__Group_4_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_4__1"


    // $ANTLR start "rule__Book__Group_4_4__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2215:1: rule__Book__Group_4_4__1__Impl : ( ( rule__Book__Volume_numberAssignment_4_4_1 ) ) ;
    public final void rule__Book__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2219:1: ( ( ( rule__Book__Volume_numberAssignment_4_4_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2220:1: ( ( rule__Book__Volume_numberAssignment_4_4_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2220:1: ( ( rule__Book__Volume_numberAssignment_4_4_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2221:1: ( rule__Book__Volume_numberAssignment_4_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getVolume_numberAssignment_4_4_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2222:1: ( rule__Book__Volume_numberAssignment_4_4_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2222:2: rule__Book__Volume_numberAssignment_4_4_1
            {
            pushFollow(FOLLOW_rule__Book__Volume_numberAssignment_4_4_1_in_rule__Book__Group_4_4__1__Impl4494);
            rule__Book__Volume_numberAssignment_4_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getVolume_numberAssignment_4_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_4__1__Impl"


    // $ANTLR start "rule__Book__Group_4_5__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2236:1: rule__Book__Group_4_5__0 : rule__Book__Group_4_5__0__Impl rule__Book__Group_4_5__1 ;
    public final void rule__Book__Group_4_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2240:1: ( rule__Book__Group_4_5__0__Impl rule__Book__Group_4_5__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2241:2: rule__Book__Group_4_5__0__Impl rule__Book__Group_4_5__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_5__0__Impl_in_rule__Book__Group_4_5__04528);
            rule__Book__Group_4_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_5__1_in_rule__Book__Group_4_5__04531);
            rule__Book__Group_4_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_5__0"


    // $ANTLR start "rule__Book__Group_4_5__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2248:1: rule__Book__Group_4_5__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2252:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2253:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2253:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2254:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_5_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_5__0__Impl4559); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_5__0__Impl"


    // $ANTLR start "rule__Book__Group_4_5__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2267:1: rule__Book__Group_4_5__1 : rule__Book__Group_4_5__1__Impl ;
    public final void rule__Book__Group_4_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2271:1: ( rule__Book__Group_4_5__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2272:2: rule__Book__Group_4_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_5__1__Impl_in_rule__Book__Group_4_5__14590);
            rule__Book__Group_4_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_5__1"


    // $ANTLR start "rule__Book__Group_4_5__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2278:1: rule__Book__Group_4_5__1__Impl : ( ( rule__Book__SeriesAssignment_4_5_1 ) ) ;
    public final void rule__Book__Group_4_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2282:1: ( ( ( rule__Book__SeriesAssignment_4_5_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2283:1: ( ( rule__Book__SeriesAssignment_4_5_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2283:1: ( ( rule__Book__SeriesAssignment_4_5_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2284:1: ( rule__Book__SeriesAssignment_4_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getSeriesAssignment_4_5_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2285:1: ( rule__Book__SeriesAssignment_4_5_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2285:2: rule__Book__SeriesAssignment_4_5_1
            {
            pushFollow(FOLLOW_rule__Book__SeriesAssignment_4_5_1_in_rule__Book__Group_4_5__1__Impl4617);
            rule__Book__SeriesAssignment_4_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getSeriesAssignment_4_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_5__1__Impl"


    // $ANTLR start "rule__Book__Group_4_6__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2299:1: rule__Book__Group_4_6__0 : rule__Book__Group_4_6__0__Impl rule__Book__Group_4_6__1 ;
    public final void rule__Book__Group_4_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2303:1: ( rule__Book__Group_4_6__0__Impl rule__Book__Group_4_6__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2304:2: rule__Book__Group_4_6__0__Impl rule__Book__Group_4_6__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_6__0__Impl_in_rule__Book__Group_4_6__04651);
            rule__Book__Group_4_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_6__1_in_rule__Book__Group_4_6__04654);
            rule__Book__Group_4_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_6__0"


    // $ANTLR start "rule__Book__Group_4_6__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2311:1: rule__Book__Group_4_6__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2315:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2316:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2316:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2317:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_6_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_6__0__Impl4682); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_6__0__Impl"


    // $ANTLR start "rule__Book__Group_4_6__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2330:1: rule__Book__Group_4_6__1 : rule__Book__Group_4_6__1__Impl ;
    public final void rule__Book__Group_4_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2334:1: ( rule__Book__Group_4_6__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2335:2: rule__Book__Group_4_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_6__1__Impl_in_rule__Book__Group_4_6__14713);
            rule__Book__Group_4_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_6__1"


    // $ANTLR start "rule__Book__Group_4_6__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2341:1: rule__Book__Group_4_6__1__Impl : ( ( rule__Book__AddressAssignment_4_6_1 ) ) ;
    public final void rule__Book__Group_4_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2345:1: ( ( ( rule__Book__AddressAssignment_4_6_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2346:1: ( ( rule__Book__AddressAssignment_4_6_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2346:1: ( ( rule__Book__AddressAssignment_4_6_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2347:1: ( rule__Book__AddressAssignment_4_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getAddressAssignment_4_6_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2348:1: ( rule__Book__AddressAssignment_4_6_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2348:2: rule__Book__AddressAssignment_4_6_1
            {
            pushFollow(FOLLOW_rule__Book__AddressAssignment_4_6_1_in_rule__Book__Group_4_6__1__Impl4740);
            rule__Book__AddressAssignment_4_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getAddressAssignment_4_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_6__1__Impl"


    // $ANTLR start "rule__Book__Group_4_7__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2362:1: rule__Book__Group_4_7__0 : rule__Book__Group_4_7__0__Impl rule__Book__Group_4_7__1 ;
    public final void rule__Book__Group_4_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2366:1: ( rule__Book__Group_4_7__0__Impl rule__Book__Group_4_7__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2367:2: rule__Book__Group_4_7__0__Impl rule__Book__Group_4_7__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_7__0__Impl_in_rule__Book__Group_4_7__04774);
            rule__Book__Group_4_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_7__1_in_rule__Book__Group_4_7__04777);
            rule__Book__Group_4_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_7__0"


    // $ANTLR start "rule__Book__Group_4_7__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2374:1: rule__Book__Group_4_7__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2378:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2379:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2379:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2380:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_7_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_7__0__Impl4805); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_7__0__Impl"


    // $ANTLR start "rule__Book__Group_4_7__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2393:1: rule__Book__Group_4_7__1 : rule__Book__Group_4_7__1__Impl ;
    public final void rule__Book__Group_4_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2397:1: ( rule__Book__Group_4_7__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2398:2: rule__Book__Group_4_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_7__1__Impl_in_rule__Book__Group_4_7__14836);
            rule__Book__Group_4_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_7__1"


    // $ANTLR start "rule__Book__Group_4_7__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2404:1: rule__Book__Group_4_7__1__Impl : ( ( rule__Book__EditionAssignment_4_7_1 ) ) ;
    public final void rule__Book__Group_4_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2408:1: ( ( ( rule__Book__EditionAssignment_4_7_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2409:1: ( ( rule__Book__EditionAssignment_4_7_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2409:1: ( ( rule__Book__EditionAssignment_4_7_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2410:1: ( rule__Book__EditionAssignment_4_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getEditionAssignment_4_7_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2411:1: ( rule__Book__EditionAssignment_4_7_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2411:2: rule__Book__EditionAssignment_4_7_1
            {
            pushFollow(FOLLOW_rule__Book__EditionAssignment_4_7_1_in_rule__Book__Group_4_7__1__Impl4863);
            rule__Book__EditionAssignment_4_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getEditionAssignment_4_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_7__1__Impl"


    // $ANTLR start "rule__Book__Group_4_8__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2425:1: rule__Book__Group_4_8__0 : rule__Book__Group_4_8__0__Impl rule__Book__Group_4_8__1 ;
    public final void rule__Book__Group_4_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2429:1: ( rule__Book__Group_4_8__0__Impl rule__Book__Group_4_8__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2430:2: rule__Book__Group_4_8__0__Impl rule__Book__Group_4_8__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_8__0__Impl_in_rule__Book__Group_4_8__04897);
            rule__Book__Group_4_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_8__1_in_rule__Book__Group_4_8__04900);
            rule__Book__Group_4_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_8__0"


    // $ANTLR start "rule__Book__Group_4_8__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2437:1: rule__Book__Group_4_8__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2441:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2442:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2442:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2443:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_8_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_8__0__Impl4928); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_8__0__Impl"


    // $ANTLR start "rule__Book__Group_4_8__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2456:1: rule__Book__Group_4_8__1 : rule__Book__Group_4_8__1__Impl ;
    public final void rule__Book__Group_4_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2460:1: ( rule__Book__Group_4_8__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2461:2: rule__Book__Group_4_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_8__1__Impl_in_rule__Book__Group_4_8__14959);
            rule__Book__Group_4_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_8__1"


    // $ANTLR start "rule__Book__Group_4_8__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2467:1: rule__Book__Group_4_8__1__Impl : ( ( rule__Book__MonthAssignment_4_8_1 ) ) ;
    public final void rule__Book__Group_4_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2471:1: ( ( ( rule__Book__MonthAssignment_4_8_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2472:1: ( ( rule__Book__MonthAssignment_4_8_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2472:1: ( ( rule__Book__MonthAssignment_4_8_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2473:1: ( rule__Book__MonthAssignment_4_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getMonthAssignment_4_8_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2474:1: ( rule__Book__MonthAssignment_4_8_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2474:2: rule__Book__MonthAssignment_4_8_1
            {
            pushFollow(FOLLOW_rule__Book__MonthAssignment_4_8_1_in_rule__Book__Group_4_8__1__Impl4986);
            rule__Book__MonthAssignment_4_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getMonthAssignment_4_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_8__1__Impl"


    // $ANTLR start "rule__Book__Group_4_9__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2488:1: rule__Book__Group_4_9__0 : rule__Book__Group_4_9__0__Impl rule__Book__Group_4_9__1 ;
    public final void rule__Book__Group_4_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2492:1: ( rule__Book__Group_4_9__0__Impl rule__Book__Group_4_9__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2493:2: rule__Book__Group_4_9__0__Impl rule__Book__Group_4_9__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_9__0__Impl_in_rule__Book__Group_4_9__05020);
            rule__Book__Group_4_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_9__1_in_rule__Book__Group_4_9__05023);
            rule__Book__Group_4_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_9__0"


    // $ANTLR start "rule__Book__Group_4_9__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2500:1: rule__Book__Group_4_9__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2504:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2505:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2505:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2506:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_9_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_9__0__Impl5051); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_9__0__Impl"


    // $ANTLR start "rule__Book__Group_4_9__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2519:1: rule__Book__Group_4_9__1 : rule__Book__Group_4_9__1__Impl ;
    public final void rule__Book__Group_4_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2523:1: ( rule__Book__Group_4_9__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2524:2: rule__Book__Group_4_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_9__1__Impl_in_rule__Book__Group_4_9__15082);
            rule__Book__Group_4_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_9__1"


    // $ANTLR start "rule__Book__Group_4_9__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2530:1: rule__Book__Group_4_9__1__Impl : ( ( rule__Book__IsbnAssignment_4_9_1 ) ) ;
    public final void rule__Book__Group_4_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2534:1: ( ( ( rule__Book__IsbnAssignment_4_9_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2535:1: ( ( rule__Book__IsbnAssignment_4_9_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2535:1: ( ( rule__Book__IsbnAssignment_4_9_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2536:1: ( rule__Book__IsbnAssignment_4_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getIsbnAssignment_4_9_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2537:1: ( rule__Book__IsbnAssignment_4_9_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2537:2: rule__Book__IsbnAssignment_4_9_1
            {
            pushFollow(FOLLOW_rule__Book__IsbnAssignment_4_9_1_in_rule__Book__Group_4_9__1__Impl5109);
            rule__Book__IsbnAssignment_4_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getIsbnAssignment_4_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_9__1__Impl"


    // $ANTLR start "rule__Book__Group_4_10__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2551:1: rule__Book__Group_4_10__0 : rule__Book__Group_4_10__0__Impl rule__Book__Group_4_10__1 ;
    public final void rule__Book__Group_4_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2555:1: ( rule__Book__Group_4_10__0__Impl rule__Book__Group_4_10__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2556:2: rule__Book__Group_4_10__0__Impl rule__Book__Group_4_10__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_10__0__Impl_in_rule__Book__Group_4_10__05143);
            rule__Book__Group_4_10__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_10__1_in_rule__Book__Group_4_10__05146);
            rule__Book__Group_4_10__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_10__0"


    // $ANTLR start "rule__Book__Group_4_10__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2563:1: rule__Book__Group_4_10__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2567:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2568:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2568:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2569:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_10_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_10__0__Impl5174); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_10__0__Impl"


    // $ANTLR start "rule__Book__Group_4_10__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2582:1: rule__Book__Group_4_10__1 : rule__Book__Group_4_10__1__Impl ;
    public final void rule__Book__Group_4_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2586:1: ( rule__Book__Group_4_10__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2587:2: rule__Book__Group_4_10__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_10__1__Impl_in_rule__Book__Group_4_10__15205);
            rule__Book__Group_4_10__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_10__1"


    // $ANTLR start "rule__Book__Group_4_10__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2593:1: rule__Book__Group_4_10__1__Impl : ( ( rule__Book__NoteAssignment_4_10_1 ) ) ;
    public final void rule__Book__Group_4_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2597:1: ( ( ( rule__Book__NoteAssignment_4_10_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2598:1: ( ( rule__Book__NoteAssignment_4_10_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2598:1: ( ( rule__Book__NoteAssignment_4_10_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2599:1: ( rule__Book__NoteAssignment_4_10_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getNoteAssignment_4_10_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2600:1: ( rule__Book__NoteAssignment_4_10_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2600:2: rule__Book__NoteAssignment_4_10_1
            {
            pushFollow(FOLLOW_rule__Book__NoteAssignment_4_10_1_in_rule__Book__Group_4_10__1__Impl5232);
            rule__Book__NoteAssignment_4_10_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getNoteAssignment_4_10_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_10__1__Impl"


    // $ANTLR start "rule__Book__Group_4_11__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2614:1: rule__Book__Group_4_11__0 : rule__Book__Group_4_11__0__Impl rule__Book__Group_4_11__1 ;
    public final void rule__Book__Group_4_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2618:1: ( rule__Book__Group_4_11__0__Impl rule__Book__Group_4_11__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2619:2: rule__Book__Group_4_11__0__Impl rule__Book__Group_4_11__1
            {
            pushFollow(FOLLOW_rule__Book__Group_4_11__0__Impl_in_rule__Book__Group_4_11__05266);
            rule__Book__Group_4_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Book__Group_4_11__1_in_rule__Book__Group_4_11__05269);
            rule__Book__Group_4_11__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_11__0"


    // $ANTLR start "rule__Book__Group_4_11__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2626:1: rule__Book__Group_4_11__0__Impl : ( Comma ) ;
    public final void rule__Book__Group_4_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2630:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2631:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2631:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2632:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getCommaKeyword_4_11_0()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Book__Group_4_11__0__Impl5297); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getCommaKeyword_4_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_11__0__Impl"


    // $ANTLR start "rule__Book__Group_4_11__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2645:1: rule__Book__Group_4_11__1 : rule__Book__Group_4_11__1__Impl ;
    public final void rule__Book__Group_4_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2649:1: ( rule__Book__Group_4_11__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2650:2: rule__Book__Group_4_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Book__Group_4_11__1__Impl_in_rule__Book__Group_4_11__15328);
            rule__Book__Group_4_11__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_11__1"


    // $ANTLR start "rule__Book__Group_4_11__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2656:1: rule__Book__Group_4_11__1__Impl : ( ( rule__Book__UnknownsAssignment_4_11_1 ) ) ;
    public final void rule__Book__Group_4_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2660:1: ( ( ( rule__Book__UnknownsAssignment_4_11_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2661:1: ( ( rule__Book__UnknownsAssignment_4_11_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2661:1: ( ( rule__Book__UnknownsAssignment_4_11_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2662:1: ( rule__Book__UnknownsAssignment_4_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getUnknownsAssignment_4_11_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2663:1: ( rule__Book__UnknownsAssignment_4_11_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2663:2: rule__Book__UnknownsAssignment_4_11_1
            {
            pushFollow(FOLLOW_rule__Book__UnknownsAssignment_4_11_1_in_rule__Book__Group_4_11__1__Impl5355);
            rule__Book__UnknownsAssignment_4_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getUnknownsAssignment_4_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Group_4_11__1__Impl"


    // $ANTLR start "rule__UnknownField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2677:1: rule__UnknownField__Group__0 : rule__UnknownField__Group__0__Impl rule__UnknownField__Group__1 ;
    public final void rule__UnknownField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2681:1: ( rule__UnknownField__Group__0__Impl rule__UnknownField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2682:2: rule__UnknownField__Group__0__Impl rule__UnknownField__Group__1
            {
            pushFollow(FOLLOW_rule__UnknownField__Group__0__Impl_in_rule__UnknownField__Group__05389);
            rule__UnknownField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnknownField__Group__1_in_rule__UnknownField__Group__05392);
            rule__UnknownField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__0"


    // $ANTLR start "rule__UnknownField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2689:1: rule__UnknownField__Group__0__Impl : ( ( rule__UnknownField__TypeAssignment_0 ) ) ;
    public final void rule__UnknownField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2693:1: ( ( ( rule__UnknownField__TypeAssignment_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2694:1: ( ( rule__UnknownField__TypeAssignment_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2694:1: ( ( rule__UnknownField__TypeAssignment_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2695:1: ( rule__UnknownField__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getTypeAssignment_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2696:1: ( rule__UnknownField__TypeAssignment_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2696:2: rule__UnknownField__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__UnknownField__TypeAssignment_0_in_rule__UnknownField__Group__0__Impl5419);
            rule__UnknownField__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__0__Impl"


    // $ANTLR start "rule__UnknownField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2706:1: rule__UnknownField__Group__1 : rule__UnknownField__Group__1__Impl rule__UnknownField__Group__2 ;
    public final void rule__UnknownField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2710:1: ( rule__UnknownField__Group__1__Impl rule__UnknownField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2711:2: rule__UnknownField__Group__1__Impl rule__UnknownField__Group__2
            {
            pushFollow(FOLLOW_rule__UnknownField__Group__1__Impl_in_rule__UnknownField__Group__15449);
            rule__UnknownField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__UnknownField__Group__2_in_rule__UnknownField__Group__15452);
            rule__UnknownField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__1"


    // $ANTLR start "rule__UnknownField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2718:1: rule__UnknownField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__UnknownField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2722:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2723:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2723:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2724:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__UnknownField__Group__1__Impl5480); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__1__Impl"


    // $ANTLR start "rule__UnknownField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2737:1: rule__UnknownField__Group__2 : rule__UnknownField__Group__2__Impl ;
    public final void rule__UnknownField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2741:1: ( rule__UnknownField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2742:2: rule__UnknownField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UnknownField__Group__2__Impl_in_rule__UnknownField__Group__25511);
            rule__UnknownField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__2"


    // $ANTLR start "rule__UnknownField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2748:1: rule__UnknownField__Group__2__Impl : ( ( rule__UnknownField__ValueAssignment_2 ) ) ;
    public final void rule__UnknownField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2752:1: ( ( ( rule__UnknownField__ValueAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2753:1: ( ( rule__UnknownField__ValueAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2753:1: ( ( rule__UnknownField__ValueAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2754:1: ( rule__UnknownField__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getValueAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2755:1: ( rule__UnknownField__ValueAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2755:2: rule__UnknownField__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__UnknownField__ValueAssignment_2_in_rule__UnknownField__Group__2__Impl5538);
            rule__UnknownField__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__Group__2__Impl"


    // $ANTLR start "rule__AuthorField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2771:1: rule__AuthorField__Group__0 : rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1 ;
    public final void rule__AuthorField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2775:1: ( rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2776:2: rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__0__Impl_in_rule__AuthorField__Group__05574);
            rule__AuthorField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group__1_in_rule__AuthorField__Group__05577);
            rule__AuthorField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__0"


    // $ANTLR start "rule__AuthorField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2783:1: rule__AuthorField__Group__0__Impl : ( Author ) ;
    public final void rule__AuthorField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2787:1: ( ( Author ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2788:1: ( Author )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2788:1: ( Author )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2789:1: Author
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0()); 
            }
            match(input,Author,FOLLOW_Author_in_rule__AuthorField__Group__0__Impl5605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__0__Impl"


    // $ANTLR start "rule__AuthorField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2802:1: rule__AuthorField__Group__1 : rule__AuthorField__Group__1__Impl rule__AuthorField__Group__2 ;
    public final void rule__AuthorField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2806:1: ( rule__AuthorField__Group__1__Impl rule__AuthorField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2807:2: rule__AuthorField__Group__1__Impl rule__AuthorField__Group__2
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__1__Impl_in_rule__AuthorField__Group__15636);
            rule__AuthorField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group__2_in_rule__AuthorField__Group__15639);
            rule__AuthorField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__1"


    // $ANTLR start "rule__AuthorField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2814:1: rule__AuthorField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__AuthorField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2818:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2819:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2819:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2820:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__AuthorField__Group__1__Impl5667); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__1__Impl"


    // $ANTLR start "rule__AuthorField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2833:1: rule__AuthorField__Group__2 : rule__AuthorField__Group__2__Impl ;
    public final void rule__AuthorField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2837:1: ( rule__AuthorField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2838:2: rule__AuthorField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__2__Impl_in_rule__AuthorField__Group__25698);
            rule__AuthorField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__2"


    // $ANTLR start "rule__AuthorField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2844:1: rule__AuthorField__Group__2__Impl : ( ( rule__AuthorField__Alternatives_2 ) ) ;
    public final void rule__AuthorField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2848:1: ( ( ( rule__AuthorField__Alternatives_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2849:1: ( ( rule__AuthorField__Alternatives_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2849:1: ( ( rule__AuthorField__Alternatives_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2850:1: ( rule__AuthorField__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getAlternatives_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2851:1: ( rule__AuthorField__Alternatives_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2851:2: rule__AuthorField__Alternatives_2
            {
            pushFollow(FOLLOW_rule__AuthorField__Alternatives_2_in_rule__AuthorField__Group__2__Impl5725);
            rule__AuthorField__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group__2__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2867:1: rule__AuthorField__Group_2_0__0 : rule__AuthorField__Group_2_0__0__Impl rule__AuthorField__Group_2_0__1 ;
    public final void rule__AuthorField__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2871:1: ( rule__AuthorField__Group_2_0__0__Impl rule__AuthorField__Group_2_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2872:2: rule__AuthorField__Group_2_0__0__Impl rule__AuthorField__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_0__0__Impl_in_rule__AuthorField__Group_2_0__05761);
            rule__AuthorField__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group_2_0__1_in_rule__AuthorField__Group_2_0__05764);
            rule__AuthorField__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__0"


    // $ANTLR start "rule__AuthorField__Group_2_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2879:1: rule__AuthorField__Group_2_0__0__Impl : ( QuotationMark ) ;
    public final void rule__AuthorField__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2883:1: ( ( QuotationMark ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2884:1: ( QuotationMark )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2884:1: ( QuotationMark )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2885:1: QuotationMark
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_0()); 
            }
            match(input,QuotationMark,FOLLOW_QuotationMark_in_rule__AuthorField__Group_2_0__0__Impl5792); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__0__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2898:1: rule__AuthorField__Group_2_0__1 : rule__AuthorField__Group_2_0__1__Impl rule__AuthorField__Group_2_0__2 ;
    public final void rule__AuthorField__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2902:1: ( rule__AuthorField__Group_2_0__1__Impl rule__AuthorField__Group_2_0__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2903:2: rule__AuthorField__Group_2_0__1__Impl rule__AuthorField__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_0__1__Impl_in_rule__AuthorField__Group_2_0__15823);
            rule__AuthorField__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group_2_0__2_in_rule__AuthorField__Group_2_0__15826);
            rule__AuthorField__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__1"


    // $ANTLR start "rule__AuthorField__Group_2_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2910:1: rule__AuthorField__Group_2_0__1__Impl : ( ruleAuthors ) ;
    public final void rule__AuthorField__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2914:1: ( ( ruleAuthors ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2915:1: ( ruleAuthors )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2915:1: ( ruleAuthors )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2916:1: ruleAuthors
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleAuthors_in_rule__AuthorField__Group_2_0__1__Impl5853);
            ruleAuthors();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__1__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_0__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2927:1: rule__AuthorField__Group_2_0__2 : rule__AuthorField__Group_2_0__2__Impl ;
    public final void rule__AuthorField__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2931:1: ( rule__AuthorField__Group_2_0__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2932:2: rule__AuthorField__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_0__2__Impl_in_rule__AuthorField__Group_2_0__25882);
            rule__AuthorField__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__2"


    // $ANTLR start "rule__AuthorField__Group_2_0__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2938:1: rule__AuthorField__Group_2_0__2__Impl : ( QuotationMark ) ;
    public final void rule__AuthorField__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2942:1: ( ( QuotationMark ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2943:1: ( QuotationMark )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2943:1: ( QuotationMark )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2944:1: QuotationMark
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_2()); 
            }
            match(input,QuotationMark,FOLLOW_QuotationMark_in_rule__AuthorField__Group_2_0__2__Impl5910); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_2_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_0__2__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2963:1: rule__AuthorField__Group_2_1__0 : rule__AuthorField__Group_2_1__0__Impl rule__AuthorField__Group_2_1__1 ;
    public final void rule__AuthorField__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2967:1: ( rule__AuthorField__Group_2_1__0__Impl rule__AuthorField__Group_2_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2968:2: rule__AuthorField__Group_2_1__0__Impl rule__AuthorField__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_1__0__Impl_in_rule__AuthorField__Group_2_1__05947);
            rule__AuthorField__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group_2_1__1_in_rule__AuthorField__Group_2_1__05950);
            rule__AuthorField__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__0"


    // $ANTLR start "rule__AuthorField__Group_2_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2975:1: rule__AuthorField__Group_2_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__AuthorField__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2979:1: ( ( LeftCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2980:1: ( LeftCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2980:1: ( LeftCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2981:1: LeftCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }
            match(input,LeftCurlyBracket,FOLLOW_LeftCurlyBracket_in_rule__AuthorField__Group_2_1__0__Impl5978); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__0__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2994:1: rule__AuthorField__Group_2_1__1 : rule__AuthorField__Group_2_1__1__Impl rule__AuthorField__Group_2_1__2 ;
    public final void rule__AuthorField__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2998:1: ( rule__AuthorField__Group_2_1__1__Impl rule__AuthorField__Group_2_1__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:2999:2: rule__AuthorField__Group_2_1__1__Impl rule__AuthorField__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_1__1__Impl_in_rule__AuthorField__Group_2_1__16009);
            rule__AuthorField__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AuthorField__Group_2_1__2_in_rule__AuthorField__Group_2_1__16012);
            rule__AuthorField__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__1"


    // $ANTLR start "rule__AuthorField__Group_2_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3006:1: rule__AuthorField__Group_2_1__1__Impl : ( ruleAuthors ) ;
    public final void rule__AuthorField__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3010:1: ( ( ruleAuthors ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3011:1: ( ruleAuthors )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3011:1: ( ruleAuthors )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3012:1: ruleAuthors
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_1_1()); 
            }
            pushFollow(FOLLOW_ruleAuthors_in_rule__AuthorField__Group_2_1__1__Impl6039);
            ruleAuthors();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__1__Impl"


    // $ANTLR start "rule__AuthorField__Group_2_1__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3023:1: rule__AuthorField__Group_2_1__2 : rule__AuthorField__Group_2_1__2__Impl ;
    public final void rule__AuthorField__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3027:1: ( rule__AuthorField__Group_2_1__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3028:2: rule__AuthorField__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_2_1__2__Impl_in_rule__AuthorField__Group_2_1__26068);
            rule__AuthorField__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__2"


    // $ANTLR start "rule__AuthorField__Group_2_1__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3034:1: rule__AuthorField__Group_2_1__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__AuthorField__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3038:1: ( ( RightCurlyBracket ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3039:1: ( RightCurlyBracket )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3039:1: ( RightCurlyBracket )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3040:1: RightCurlyBracket
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }
            match(input,RightCurlyBracket,FOLLOW_RightCurlyBracket_in_rule__AuthorField__Group_2_1__2__Impl6096); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_2_1__2__Impl"


    // $ANTLR start "rule__Authors__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3059:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3063:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3064:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
            {
            pushFollow(FOLLOW_rule__Authors__Group__0__Impl_in_rule__Authors__Group__06133);
            rule__Authors__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Authors__Group__1_in_rule__Authors__Group__06136);
            rule__Authors__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__0"


    // $ANTLR start "rule__Authors__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3071:1: rule__Authors__Group__0__Impl : ( ( rule__Authors__NamesAssignment_0 ) ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3075:1: ( ( ( rule__Authors__NamesAssignment_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3076:1: ( ( rule__Authors__NamesAssignment_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3076:1: ( ( rule__Authors__NamesAssignment_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3077:1: ( rule__Authors__NamesAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getNamesAssignment_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3078:1: ( rule__Authors__NamesAssignment_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3078:2: rule__Authors__NamesAssignment_0
            {
            pushFollow(FOLLOW_rule__Authors__NamesAssignment_0_in_rule__Authors__Group__0__Impl6163);
            rule__Authors__NamesAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getNamesAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__0__Impl"


    // $ANTLR start "rule__Authors__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3088:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3092:1: ( rule__Authors__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3093:2: rule__Authors__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Authors__Group__1__Impl_in_rule__Authors__Group__16193);
            rule__Authors__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__1"


    // $ANTLR start "rule__Authors__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3099:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__Group_1__0 )* ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3103:1: ( ( ( rule__Authors__Group_1__0 )* ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3104:1: ( ( rule__Authors__Group_1__0 )* )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3104:1: ( ( rule__Authors__Group_1__0 )* )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3105:1: ( rule__Authors__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getGroup_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3106:1: ( rule__Authors__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==And) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3106:2: rule__Authors__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Authors__Group_1__0_in_rule__Authors__Group__1__Impl6220);
            	    rule__Authors__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group__1__Impl"


    // $ANTLR start "rule__Authors__Group_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3120:1: rule__Authors__Group_1__0 : rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1 ;
    public final void rule__Authors__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3124:1: ( rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3125:2: rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1
            {
            pushFollow(FOLLOW_rule__Authors__Group_1__0__Impl_in_rule__Authors__Group_1__06255);
            rule__Authors__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Authors__Group_1__1_in_rule__Authors__Group_1__06258);
            rule__Authors__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_1__0"


    // $ANTLR start "rule__Authors__Group_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3132:1: rule__Authors__Group_1__0__Impl : ( And ) ;
    public final void rule__Authors__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3136:1: ( ( And ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3137:1: ( And )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3137:1: ( And )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3138:1: And
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getAndKeyword_1_0()); 
            }
            match(input,And,FOLLOW_And_in_rule__Authors__Group_1__0__Impl6286); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getAndKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_1__0__Impl"


    // $ANTLR start "rule__Authors__Group_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3151:1: rule__Authors__Group_1__1 : rule__Authors__Group_1__1__Impl ;
    public final void rule__Authors__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3155:1: ( rule__Authors__Group_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3156:2: rule__Authors__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Authors__Group_1__1__Impl_in_rule__Authors__Group_1__16317);
            rule__Authors__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_1__1"


    // $ANTLR start "rule__Authors__Group_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3162:1: rule__Authors__Group_1__1__Impl : ( ( rule__Authors__NamesAssignment_1_1 ) ) ;
    public final void rule__Authors__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3166:1: ( ( ( rule__Authors__NamesAssignment_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3167:1: ( ( rule__Authors__NamesAssignment_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3167:1: ( ( rule__Authors__NamesAssignment_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3168:1: ( rule__Authors__NamesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getNamesAssignment_1_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3169:1: ( rule__Authors__NamesAssignment_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3169:2: rule__Authors__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Authors__NamesAssignment_1_1_in_rule__Authors__Group_1__1__Impl6344);
            rule__Authors__NamesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getNamesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__Group_1__1__Impl"


    // $ANTLR start "rule__Fullname__Group_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3183:1: rule__Fullname__Group_0__0 : rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1 ;
    public final void rule__Fullname__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3187:1: ( rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3188:2: rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__0__Impl_in_rule__Fullname__Group_0__06378);
            rule__Fullname__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fullname__Group_0__1_in_rule__Fullname__Group_0__06381);
            rule__Fullname__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__0"


    // $ANTLR start "rule__Fullname__Group_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3195:1: rule__Fullname__Group_0__0__Impl : ( ( rule__Fullname__LastnameAssignment_0_0 ) ) ;
    public final void rule__Fullname__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3199:1: ( ( ( rule__Fullname__LastnameAssignment_0_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3200:1: ( ( rule__Fullname__LastnameAssignment_0_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3200:1: ( ( rule__Fullname__LastnameAssignment_0_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3201:1: ( rule__Fullname__LastnameAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getLastnameAssignment_0_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3202:1: ( rule__Fullname__LastnameAssignment_0_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3202:2: rule__Fullname__LastnameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Fullname__LastnameAssignment_0_0_in_rule__Fullname__Group_0__0__Impl6408);
            rule__Fullname__LastnameAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getLastnameAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__0__Impl"


    // $ANTLR start "rule__Fullname__Group_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3212:1: rule__Fullname__Group_0__1 : rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2 ;
    public final void rule__Fullname__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3216:1: ( rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3217:2: rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__1__Impl_in_rule__Fullname__Group_0__16438);
            rule__Fullname__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fullname__Group_0__2_in_rule__Fullname__Group_0__16441);
            rule__Fullname__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__1"


    // $ANTLR start "rule__Fullname__Group_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3224:1: rule__Fullname__Group_0__1__Impl : ( Comma ) ;
    public final void rule__Fullname__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3228:1: ( ( Comma ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3229:1: ( Comma )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3229:1: ( Comma )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3230:1: Comma
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getCommaKeyword_0_1()); 
            }
            match(input,Comma,FOLLOW_Comma_in_rule__Fullname__Group_0__1__Impl6469); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__1__Impl"


    // $ANTLR start "rule__Fullname__Group_0__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3243:1: rule__Fullname__Group_0__2 : rule__Fullname__Group_0__2__Impl ;
    public final void rule__Fullname__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3247:1: ( rule__Fullname__Group_0__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3248:2: rule__Fullname__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__2__Impl_in_rule__Fullname__Group_0__26500);
            rule__Fullname__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__2"


    // $ANTLR start "rule__Fullname__Group_0__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3254:1: rule__Fullname__Group_0__2__Impl : ( ( rule__Fullname__FirstnameAssignment_0_2 ) ) ;
    public final void rule__Fullname__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3258:1: ( ( ( rule__Fullname__FirstnameAssignment_0_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3259:1: ( ( rule__Fullname__FirstnameAssignment_0_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3259:1: ( ( rule__Fullname__FirstnameAssignment_0_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3260:1: ( rule__Fullname__FirstnameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getFirstnameAssignment_0_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3261:1: ( rule__Fullname__FirstnameAssignment_0_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3261:2: rule__Fullname__FirstnameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_0_2_in_rule__Fullname__Group_0__2__Impl6527);
            rule__Fullname__FirstnameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getFirstnameAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_0__2__Impl"


    // $ANTLR start "rule__Fullname__Group_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3277:1: rule__Fullname__Group_1__0 : rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1 ;
    public final void rule__Fullname__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3281:1: ( rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3282:2: rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fullname__Group_1__0__Impl_in_rule__Fullname__Group_1__06563);
            rule__Fullname__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Fullname__Group_1__1_in_rule__Fullname__Group_1__06566);
            rule__Fullname__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_1__0"


    // $ANTLR start "rule__Fullname__Group_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3289:1: rule__Fullname__Group_1__0__Impl : ( ( rule__Fullname__FirstnameAssignment_1_0 ) ) ;
    public final void rule__Fullname__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3293:1: ( ( ( rule__Fullname__FirstnameAssignment_1_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3294:1: ( ( rule__Fullname__FirstnameAssignment_1_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3294:1: ( ( rule__Fullname__FirstnameAssignment_1_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3295:1: ( rule__Fullname__FirstnameAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getFirstnameAssignment_1_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3296:1: ( rule__Fullname__FirstnameAssignment_1_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3296:2: rule__Fullname__FirstnameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_1_0_in_rule__Fullname__Group_1__0__Impl6593);
            rule__Fullname__FirstnameAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getFirstnameAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_1__0__Impl"


    // $ANTLR start "rule__Fullname__Group_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3306:1: rule__Fullname__Group_1__1 : rule__Fullname__Group_1__1__Impl ;
    public final void rule__Fullname__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3310:1: ( rule__Fullname__Group_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3311:2: rule__Fullname__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fullname__Group_1__1__Impl_in_rule__Fullname__Group_1__16623);
            rule__Fullname__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_1__1"


    // $ANTLR start "rule__Fullname__Group_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3317:1: rule__Fullname__Group_1__1__Impl : ( ( rule__Fullname__LastnameAssignment_1_1 ) ) ;
    public final void rule__Fullname__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3321:1: ( ( ( rule__Fullname__LastnameAssignment_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3322:1: ( ( rule__Fullname__LastnameAssignment_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3322:1: ( ( rule__Fullname__LastnameAssignment_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3323:1: ( rule__Fullname__LastnameAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getLastnameAssignment_1_1()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3324:1: ( rule__Fullname__LastnameAssignment_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3324:2: rule__Fullname__LastnameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fullname__LastnameAssignment_1_1_in_rule__Fullname__Group_1__1__Impl6650);
            rule__Fullname__LastnameAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getLastnameAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__Group_1__1__Impl"


    // $ANTLR start "rule__EditorField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3338:1: rule__EditorField__Group__0 : rule__EditorField__Group__0__Impl rule__EditorField__Group__1 ;
    public final void rule__EditorField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3342:1: ( rule__EditorField__Group__0__Impl rule__EditorField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3343:2: rule__EditorField__Group__0__Impl rule__EditorField__Group__1
            {
            pushFollow(FOLLOW_rule__EditorField__Group__0__Impl_in_rule__EditorField__Group__06684);
            rule__EditorField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EditorField__Group__1_in_rule__EditorField__Group__06687);
            rule__EditorField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__0"


    // $ANTLR start "rule__EditorField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3350:1: rule__EditorField__Group__0__Impl : ( Editor ) ;
    public final void rule__EditorField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3354:1: ( ( Editor ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3355:1: ( Editor )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3355:1: ( Editor )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3356:1: Editor
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldAccess().getEditorKeyword_0()); 
            }
            match(input,Editor,FOLLOW_Editor_in_rule__EditorField__Group__0__Impl6715); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldAccess().getEditorKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__0__Impl"


    // $ANTLR start "rule__EditorField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3369:1: rule__EditorField__Group__1 : rule__EditorField__Group__1__Impl rule__EditorField__Group__2 ;
    public final void rule__EditorField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3373:1: ( rule__EditorField__Group__1__Impl rule__EditorField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3374:2: rule__EditorField__Group__1__Impl rule__EditorField__Group__2
            {
            pushFollow(FOLLOW_rule__EditorField__Group__1__Impl_in_rule__EditorField__Group__16746);
            rule__EditorField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EditorField__Group__2_in_rule__EditorField__Group__16749);
            rule__EditorField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__1"


    // $ANTLR start "rule__EditorField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3381:1: rule__EditorField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__EditorField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3385:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3386:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3386:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3387:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__EditorField__Group__1__Impl6777); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__1__Impl"


    // $ANTLR start "rule__EditorField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3400:1: rule__EditorField__Group__2 : rule__EditorField__Group__2__Impl ;
    public final void rule__EditorField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3404:1: ( rule__EditorField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3405:2: rule__EditorField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EditorField__Group__2__Impl_in_rule__EditorField__Group__26808);
            rule__EditorField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__2"


    // $ANTLR start "rule__EditorField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3411:1: rule__EditorField__Group__2__Impl : ( ( rule__EditorField__EditorAssignment_2 ) ) ;
    public final void rule__EditorField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3415:1: ( ( ( rule__EditorField__EditorAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3416:1: ( ( rule__EditorField__EditorAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3416:1: ( ( rule__EditorField__EditorAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3417:1: ( rule__EditorField__EditorAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldAccess().getEditorAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3418:1: ( rule__EditorField__EditorAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3418:2: rule__EditorField__EditorAssignment_2
            {
            pushFollow(FOLLOW_rule__EditorField__EditorAssignment_2_in_rule__EditorField__Group__2__Impl6835);
            rule__EditorField__EditorAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldAccess().getEditorAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__Group__2__Impl"


    // $ANTLR start "rule__TitleField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3434:1: rule__TitleField__Group__0 : rule__TitleField__Group__0__Impl rule__TitleField__Group__1 ;
    public final void rule__TitleField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3438:1: ( rule__TitleField__Group__0__Impl rule__TitleField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3439:2: rule__TitleField__Group__0__Impl rule__TitleField__Group__1
            {
            pushFollow(FOLLOW_rule__TitleField__Group__0__Impl_in_rule__TitleField__Group__06871);
            rule__TitleField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TitleField__Group__1_in_rule__TitleField__Group__06874);
            rule__TitleField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__0"


    // $ANTLR start "rule__TitleField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3446:1: rule__TitleField__Group__0__Impl : ( Title ) ;
    public final void rule__TitleField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3450:1: ( ( Title ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3451:1: ( Title )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3451:1: ( Title )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3452:1: Title
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldAccess().getTitleKeyword_0()); 
            }
            match(input,Title,FOLLOW_Title_in_rule__TitleField__Group__0__Impl6902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldAccess().getTitleKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__0__Impl"


    // $ANTLR start "rule__TitleField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3465:1: rule__TitleField__Group__1 : rule__TitleField__Group__1__Impl rule__TitleField__Group__2 ;
    public final void rule__TitleField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3469:1: ( rule__TitleField__Group__1__Impl rule__TitleField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3470:2: rule__TitleField__Group__1__Impl rule__TitleField__Group__2
            {
            pushFollow(FOLLOW_rule__TitleField__Group__1__Impl_in_rule__TitleField__Group__16933);
            rule__TitleField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TitleField__Group__2_in_rule__TitleField__Group__16936);
            rule__TitleField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__1"


    // $ANTLR start "rule__TitleField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3477:1: rule__TitleField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__TitleField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3481:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3482:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3482:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3483:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__TitleField__Group__1__Impl6964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__1__Impl"


    // $ANTLR start "rule__TitleField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3496:1: rule__TitleField__Group__2 : rule__TitleField__Group__2__Impl ;
    public final void rule__TitleField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3500:1: ( rule__TitleField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3501:2: rule__TitleField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TitleField__Group__2__Impl_in_rule__TitleField__Group__26995);
            rule__TitleField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__2"


    // $ANTLR start "rule__TitleField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3507:1: rule__TitleField__Group__2__Impl : ( ( rule__TitleField__TitleAssignment_2 ) ) ;
    public final void rule__TitleField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3511:1: ( ( ( rule__TitleField__TitleAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3512:1: ( ( rule__TitleField__TitleAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3512:1: ( ( rule__TitleField__TitleAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3513:1: ( rule__TitleField__TitleAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldAccess().getTitleAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3514:1: ( rule__TitleField__TitleAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3514:2: rule__TitleField__TitleAssignment_2
            {
            pushFollow(FOLLOW_rule__TitleField__TitleAssignment_2_in_rule__TitleField__Group__2__Impl7022);
            rule__TitleField__TitleAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldAccess().getTitleAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__Group__2__Impl"


    // $ANTLR start "rule__PublisherField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3530:1: rule__PublisherField__Group__0 : rule__PublisherField__Group__0__Impl rule__PublisherField__Group__1 ;
    public final void rule__PublisherField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3534:1: ( rule__PublisherField__Group__0__Impl rule__PublisherField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3535:2: rule__PublisherField__Group__0__Impl rule__PublisherField__Group__1
            {
            pushFollow(FOLLOW_rule__PublisherField__Group__0__Impl_in_rule__PublisherField__Group__07058);
            rule__PublisherField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublisherField__Group__1_in_rule__PublisherField__Group__07061);
            rule__PublisherField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__0"


    // $ANTLR start "rule__PublisherField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3542:1: rule__PublisherField__Group__0__Impl : ( Publisher ) ;
    public final void rule__PublisherField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3546:1: ( ( Publisher ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3547:1: ( Publisher )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3547:1: ( Publisher )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3548:1: Publisher
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldAccess().getPublisherKeyword_0()); 
            }
            match(input,Publisher,FOLLOW_Publisher_in_rule__PublisherField__Group__0__Impl7089); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldAccess().getPublisherKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__0__Impl"


    // $ANTLR start "rule__PublisherField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3561:1: rule__PublisherField__Group__1 : rule__PublisherField__Group__1__Impl rule__PublisherField__Group__2 ;
    public final void rule__PublisherField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3565:1: ( rule__PublisherField__Group__1__Impl rule__PublisherField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3566:2: rule__PublisherField__Group__1__Impl rule__PublisherField__Group__2
            {
            pushFollow(FOLLOW_rule__PublisherField__Group__1__Impl_in_rule__PublisherField__Group__17120);
            rule__PublisherField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PublisherField__Group__2_in_rule__PublisherField__Group__17123);
            rule__PublisherField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__1"


    // $ANTLR start "rule__PublisherField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3573:1: rule__PublisherField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__PublisherField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3577:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3578:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3578:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3579:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__PublisherField__Group__1__Impl7151); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__1__Impl"


    // $ANTLR start "rule__PublisherField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3592:1: rule__PublisherField__Group__2 : rule__PublisherField__Group__2__Impl ;
    public final void rule__PublisherField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3596:1: ( rule__PublisherField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3597:2: rule__PublisherField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PublisherField__Group__2__Impl_in_rule__PublisherField__Group__27182);
            rule__PublisherField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__2"


    // $ANTLR start "rule__PublisherField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3603:1: rule__PublisherField__Group__2__Impl : ( ( rule__PublisherField__PublisherAssignment_2 ) ) ;
    public final void rule__PublisherField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3607:1: ( ( ( rule__PublisherField__PublisherAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3608:1: ( ( rule__PublisherField__PublisherAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3608:1: ( ( rule__PublisherField__PublisherAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3609:1: ( rule__PublisherField__PublisherAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldAccess().getPublisherAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3610:1: ( rule__PublisherField__PublisherAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3610:2: rule__PublisherField__PublisherAssignment_2
            {
            pushFollow(FOLLOW_rule__PublisherField__PublisherAssignment_2_in_rule__PublisherField__Group__2__Impl7209);
            rule__PublisherField__PublisherAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldAccess().getPublisherAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__Group__2__Impl"


    // $ANTLR start "rule__JournalField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3626:1: rule__JournalField__Group__0 : rule__JournalField__Group__0__Impl rule__JournalField__Group__1 ;
    public final void rule__JournalField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3630:1: ( rule__JournalField__Group__0__Impl rule__JournalField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3631:2: rule__JournalField__Group__0__Impl rule__JournalField__Group__1
            {
            pushFollow(FOLLOW_rule__JournalField__Group__0__Impl_in_rule__JournalField__Group__07245);
            rule__JournalField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JournalField__Group__1_in_rule__JournalField__Group__07248);
            rule__JournalField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__0"


    // $ANTLR start "rule__JournalField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3638:1: rule__JournalField__Group__0__Impl : ( Journal ) ;
    public final void rule__JournalField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3642:1: ( ( Journal ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3643:1: ( Journal )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3643:1: ( Journal )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3644:1: Journal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldAccess().getJournalKeyword_0()); 
            }
            match(input,Journal,FOLLOW_Journal_in_rule__JournalField__Group__0__Impl7276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldAccess().getJournalKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__0__Impl"


    // $ANTLR start "rule__JournalField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3657:1: rule__JournalField__Group__1 : rule__JournalField__Group__1__Impl rule__JournalField__Group__2 ;
    public final void rule__JournalField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3661:1: ( rule__JournalField__Group__1__Impl rule__JournalField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3662:2: rule__JournalField__Group__1__Impl rule__JournalField__Group__2
            {
            pushFollow(FOLLOW_rule__JournalField__Group__1__Impl_in_rule__JournalField__Group__17307);
            rule__JournalField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__JournalField__Group__2_in_rule__JournalField__Group__17310);
            rule__JournalField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__1"


    // $ANTLR start "rule__JournalField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3669:1: rule__JournalField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__JournalField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3673:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3674:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3674:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3675:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__JournalField__Group__1__Impl7338); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__1__Impl"


    // $ANTLR start "rule__JournalField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3688:1: rule__JournalField__Group__2 : rule__JournalField__Group__2__Impl ;
    public final void rule__JournalField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3692:1: ( rule__JournalField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3693:2: rule__JournalField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JournalField__Group__2__Impl_in_rule__JournalField__Group__27369);
            rule__JournalField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__2"


    // $ANTLR start "rule__JournalField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3699:1: rule__JournalField__Group__2__Impl : ( ( rule__JournalField__JournalAssignment_2 ) ) ;
    public final void rule__JournalField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3703:1: ( ( ( rule__JournalField__JournalAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3704:1: ( ( rule__JournalField__JournalAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3704:1: ( ( rule__JournalField__JournalAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3705:1: ( rule__JournalField__JournalAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldAccess().getJournalAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3706:1: ( rule__JournalField__JournalAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3706:2: rule__JournalField__JournalAssignment_2
            {
            pushFollow(FOLLOW_rule__JournalField__JournalAssignment_2_in_rule__JournalField__Group__2__Impl7396);
            rule__JournalField__JournalAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldAccess().getJournalAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__Group__2__Impl"


    // $ANTLR start "rule__YearField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3722:1: rule__YearField__Group__0 : rule__YearField__Group__0__Impl rule__YearField__Group__1 ;
    public final void rule__YearField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3726:1: ( rule__YearField__Group__0__Impl rule__YearField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3727:2: rule__YearField__Group__0__Impl rule__YearField__Group__1
            {
            pushFollow(FOLLOW_rule__YearField__Group__0__Impl_in_rule__YearField__Group__07432);
            rule__YearField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__YearField__Group__1_in_rule__YearField__Group__07435);
            rule__YearField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__0"


    // $ANTLR start "rule__YearField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3734:1: rule__YearField__Group__0__Impl : ( Year ) ;
    public final void rule__YearField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3738:1: ( ( Year ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3739:1: ( Year )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3739:1: ( Year )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3740:1: Year
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldAccess().getYearKeyword_0()); 
            }
            match(input,Year,FOLLOW_Year_in_rule__YearField__Group__0__Impl7463); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldAccess().getYearKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__0__Impl"


    // $ANTLR start "rule__YearField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3753:1: rule__YearField__Group__1 : rule__YearField__Group__1__Impl rule__YearField__Group__2 ;
    public final void rule__YearField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3757:1: ( rule__YearField__Group__1__Impl rule__YearField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3758:2: rule__YearField__Group__1__Impl rule__YearField__Group__2
            {
            pushFollow(FOLLOW_rule__YearField__Group__1__Impl_in_rule__YearField__Group__17494);
            rule__YearField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__YearField__Group__2_in_rule__YearField__Group__17497);
            rule__YearField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__1"


    // $ANTLR start "rule__YearField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3765:1: rule__YearField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__YearField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3769:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3770:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3770:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3771:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__YearField__Group__1__Impl7525); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__1__Impl"


    // $ANTLR start "rule__YearField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3784:1: rule__YearField__Group__2 : rule__YearField__Group__2__Impl ;
    public final void rule__YearField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3788:1: ( rule__YearField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3789:2: rule__YearField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__YearField__Group__2__Impl_in_rule__YearField__Group__27556);
            rule__YearField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__2"


    // $ANTLR start "rule__YearField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3795:1: rule__YearField__Group__2__Impl : ( ( rule__YearField__YearAssignment_2 ) ) ;
    public final void rule__YearField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3799:1: ( ( ( rule__YearField__YearAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3800:1: ( ( rule__YearField__YearAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3800:1: ( ( rule__YearField__YearAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3801:1: ( rule__YearField__YearAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldAccess().getYearAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3802:1: ( rule__YearField__YearAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3802:2: rule__YearField__YearAssignment_2
            {
            pushFollow(FOLLOW_rule__YearField__YearAssignment_2_in_rule__YearField__Group__2__Impl7583);
            rule__YearField__YearAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldAccess().getYearAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__Group__2__Impl"


    // $ANTLR start "rule__VolumeField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3818:1: rule__VolumeField__Group__0 : rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1 ;
    public final void rule__VolumeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3822:1: ( rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3823:2: rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__0__Impl_in_rule__VolumeField__Group__07619);
            rule__VolumeField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VolumeField__Group__1_in_rule__VolumeField__Group__07622);
            rule__VolumeField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__0"


    // $ANTLR start "rule__VolumeField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3830:1: rule__VolumeField__Group__0__Impl : ( Volume ) ;
    public final void rule__VolumeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3834:1: ( ( Volume ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3835:1: ( Volume )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3835:1: ( Volume )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3836:1: Volume
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0()); 
            }
            match(input,Volume,FOLLOW_Volume_in_rule__VolumeField__Group__0__Impl7650); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__0__Impl"


    // $ANTLR start "rule__VolumeField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3849:1: rule__VolumeField__Group__1 : rule__VolumeField__Group__1__Impl rule__VolumeField__Group__2 ;
    public final void rule__VolumeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3853:1: ( rule__VolumeField__Group__1__Impl rule__VolumeField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3854:2: rule__VolumeField__Group__1__Impl rule__VolumeField__Group__2
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__1__Impl_in_rule__VolumeField__Group__17681);
            rule__VolumeField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VolumeField__Group__2_in_rule__VolumeField__Group__17684);
            rule__VolumeField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__1"


    // $ANTLR start "rule__VolumeField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3861:1: rule__VolumeField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__VolumeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3865:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3866:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3866:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3867:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__VolumeField__Group__1__Impl7712); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__1__Impl"


    // $ANTLR start "rule__VolumeField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3880:1: rule__VolumeField__Group__2 : rule__VolumeField__Group__2__Impl ;
    public final void rule__VolumeField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3884:1: ( rule__VolumeField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3885:2: rule__VolumeField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__2__Impl_in_rule__VolumeField__Group__27743);
            rule__VolumeField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__2"


    // $ANTLR start "rule__VolumeField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3891:1: rule__VolumeField__Group__2__Impl : ( ( rule__VolumeField__VolumeAssignment_2 ) ) ;
    public final void rule__VolumeField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3895:1: ( ( ( rule__VolumeField__VolumeAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3896:1: ( ( rule__VolumeField__VolumeAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3896:1: ( ( rule__VolumeField__VolumeAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3897:1: ( rule__VolumeField__VolumeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldAccess().getVolumeAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3898:1: ( rule__VolumeField__VolumeAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3898:2: rule__VolumeField__VolumeAssignment_2
            {
            pushFollow(FOLLOW_rule__VolumeField__VolumeAssignment_2_in_rule__VolumeField__Group__2__Impl7770);
            rule__VolumeField__VolumeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldAccess().getVolumeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__Group__2__Impl"


    // $ANTLR start "rule__NumberField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3914:1: rule__NumberField__Group__0 : rule__NumberField__Group__0__Impl rule__NumberField__Group__1 ;
    public final void rule__NumberField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3918:1: ( rule__NumberField__Group__0__Impl rule__NumberField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3919:2: rule__NumberField__Group__0__Impl rule__NumberField__Group__1
            {
            pushFollow(FOLLOW_rule__NumberField__Group__0__Impl_in_rule__NumberField__Group__07806);
            rule__NumberField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumberField__Group__1_in_rule__NumberField__Group__07809);
            rule__NumberField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__0"


    // $ANTLR start "rule__NumberField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3926:1: rule__NumberField__Group__0__Impl : ( Number ) ;
    public final void rule__NumberField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3930:1: ( ( Number ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3931:1: ( Number )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3931:1: ( Number )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3932:1: Number
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldAccess().getNumberKeyword_0()); 
            }
            match(input,Number,FOLLOW_Number_in_rule__NumberField__Group__0__Impl7837); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldAccess().getNumberKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__0__Impl"


    // $ANTLR start "rule__NumberField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3945:1: rule__NumberField__Group__1 : rule__NumberField__Group__1__Impl rule__NumberField__Group__2 ;
    public final void rule__NumberField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3949:1: ( rule__NumberField__Group__1__Impl rule__NumberField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3950:2: rule__NumberField__Group__1__Impl rule__NumberField__Group__2
            {
            pushFollow(FOLLOW_rule__NumberField__Group__1__Impl_in_rule__NumberField__Group__17868);
            rule__NumberField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NumberField__Group__2_in_rule__NumberField__Group__17871);
            rule__NumberField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__1"


    // $ANTLR start "rule__NumberField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3957:1: rule__NumberField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__NumberField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3961:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3962:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3962:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3963:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__NumberField__Group__1__Impl7899); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__1__Impl"


    // $ANTLR start "rule__NumberField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3976:1: rule__NumberField__Group__2 : rule__NumberField__Group__2__Impl ;
    public final void rule__NumberField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3980:1: ( rule__NumberField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3981:2: rule__NumberField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NumberField__Group__2__Impl_in_rule__NumberField__Group__27930);
            rule__NumberField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__2"


    // $ANTLR start "rule__NumberField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3987:1: rule__NumberField__Group__2__Impl : ( ( rule__NumberField__NumberAssignment_2 ) ) ;
    public final void rule__NumberField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3991:1: ( ( ( rule__NumberField__NumberAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3992:1: ( ( rule__NumberField__NumberAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3992:1: ( ( rule__NumberField__NumberAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3993:1: ( rule__NumberField__NumberAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldAccess().getNumberAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3994:1: ( rule__NumberField__NumberAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:3994:2: rule__NumberField__NumberAssignment_2
            {
            pushFollow(FOLLOW_rule__NumberField__NumberAssignment_2_in_rule__NumberField__Group__2__Impl7957);
            rule__NumberField__NumberAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldAccess().getNumberAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__Group__2__Impl"


    // $ANTLR start "rule__PagesField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4010:1: rule__PagesField__Group__0 : rule__PagesField__Group__0__Impl rule__PagesField__Group__1 ;
    public final void rule__PagesField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4014:1: ( rule__PagesField__Group__0__Impl rule__PagesField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4015:2: rule__PagesField__Group__0__Impl rule__PagesField__Group__1
            {
            pushFollow(FOLLOW_rule__PagesField__Group__0__Impl_in_rule__PagesField__Group__07993);
            rule__PagesField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PagesField__Group__1_in_rule__PagesField__Group__07996);
            rule__PagesField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__0"


    // $ANTLR start "rule__PagesField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4022:1: rule__PagesField__Group__0__Impl : ( Pages ) ;
    public final void rule__PagesField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4026:1: ( ( Pages ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4027:1: ( Pages )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4027:1: ( Pages )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4028:1: Pages
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldAccess().getPagesKeyword_0()); 
            }
            match(input,Pages,FOLLOW_Pages_in_rule__PagesField__Group__0__Impl8024); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldAccess().getPagesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__0__Impl"


    // $ANTLR start "rule__PagesField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4041:1: rule__PagesField__Group__1 : rule__PagesField__Group__1__Impl rule__PagesField__Group__2 ;
    public final void rule__PagesField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4045:1: ( rule__PagesField__Group__1__Impl rule__PagesField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4046:2: rule__PagesField__Group__1__Impl rule__PagesField__Group__2
            {
            pushFollow(FOLLOW_rule__PagesField__Group__1__Impl_in_rule__PagesField__Group__18055);
            rule__PagesField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PagesField__Group__2_in_rule__PagesField__Group__18058);
            rule__PagesField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__1"


    // $ANTLR start "rule__PagesField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4053:1: rule__PagesField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__PagesField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4057:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4058:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4058:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4059:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__PagesField__Group__1__Impl8086); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__1__Impl"


    // $ANTLR start "rule__PagesField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4072:1: rule__PagesField__Group__2 : rule__PagesField__Group__2__Impl ;
    public final void rule__PagesField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4076:1: ( rule__PagesField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4077:2: rule__PagesField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PagesField__Group__2__Impl_in_rule__PagesField__Group__28117);
            rule__PagesField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__2"


    // $ANTLR start "rule__PagesField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4083:1: rule__PagesField__Group__2__Impl : ( ( rule__PagesField__PagesAssignment_2 ) ) ;
    public final void rule__PagesField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4087:1: ( ( ( rule__PagesField__PagesAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4088:1: ( ( rule__PagesField__PagesAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4088:1: ( ( rule__PagesField__PagesAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4089:1: ( rule__PagesField__PagesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldAccess().getPagesAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4090:1: ( rule__PagesField__PagesAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4090:2: rule__PagesField__PagesAssignment_2
            {
            pushFollow(FOLLOW_rule__PagesField__PagesAssignment_2_in_rule__PagesField__Group__2__Impl8144);
            rule__PagesField__PagesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldAccess().getPagesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__Group__2__Impl"


    // $ANTLR start "rule__MonthField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4106:1: rule__MonthField__Group__0 : rule__MonthField__Group__0__Impl rule__MonthField__Group__1 ;
    public final void rule__MonthField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4110:1: ( rule__MonthField__Group__0__Impl rule__MonthField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4111:2: rule__MonthField__Group__0__Impl rule__MonthField__Group__1
            {
            pushFollow(FOLLOW_rule__MonthField__Group__0__Impl_in_rule__MonthField__Group__08180);
            rule__MonthField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MonthField__Group__1_in_rule__MonthField__Group__08183);
            rule__MonthField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__0"


    // $ANTLR start "rule__MonthField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4118:1: rule__MonthField__Group__0__Impl : ( Month ) ;
    public final void rule__MonthField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4122:1: ( ( Month ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4123:1: ( Month )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4123:1: ( Month )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4124:1: Month
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldAccess().getMonthKeyword_0()); 
            }
            match(input,Month,FOLLOW_Month_in_rule__MonthField__Group__0__Impl8211); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldAccess().getMonthKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__0__Impl"


    // $ANTLR start "rule__MonthField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4137:1: rule__MonthField__Group__1 : rule__MonthField__Group__1__Impl rule__MonthField__Group__2 ;
    public final void rule__MonthField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4141:1: ( rule__MonthField__Group__1__Impl rule__MonthField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4142:2: rule__MonthField__Group__1__Impl rule__MonthField__Group__2
            {
            pushFollow(FOLLOW_rule__MonthField__Group__1__Impl_in_rule__MonthField__Group__18242);
            rule__MonthField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__MonthField__Group__2_in_rule__MonthField__Group__18245);
            rule__MonthField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__1"


    // $ANTLR start "rule__MonthField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4149:1: rule__MonthField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__MonthField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4153:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4154:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4154:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4155:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__MonthField__Group__1__Impl8273); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__1__Impl"


    // $ANTLR start "rule__MonthField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4168:1: rule__MonthField__Group__2 : rule__MonthField__Group__2__Impl ;
    public final void rule__MonthField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4172:1: ( rule__MonthField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4173:2: rule__MonthField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MonthField__Group__2__Impl_in_rule__MonthField__Group__28304);
            rule__MonthField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__2"


    // $ANTLR start "rule__MonthField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4179:1: rule__MonthField__Group__2__Impl : ( ( rule__MonthField__MonthAssignment_2 ) ) ;
    public final void rule__MonthField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4183:1: ( ( ( rule__MonthField__MonthAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4184:1: ( ( rule__MonthField__MonthAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4184:1: ( ( rule__MonthField__MonthAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4185:1: ( rule__MonthField__MonthAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldAccess().getMonthAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4186:1: ( rule__MonthField__MonthAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4186:2: rule__MonthField__MonthAssignment_2
            {
            pushFollow(FOLLOW_rule__MonthField__MonthAssignment_2_in_rule__MonthField__Group__2__Impl8331);
            rule__MonthField__MonthAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldAccess().getMonthAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__Group__2__Impl"


    // $ANTLR start "rule__AddressField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4202:1: rule__AddressField__Group__0 : rule__AddressField__Group__0__Impl rule__AddressField__Group__1 ;
    public final void rule__AddressField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4206:1: ( rule__AddressField__Group__0__Impl rule__AddressField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4207:2: rule__AddressField__Group__0__Impl rule__AddressField__Group__1
            {
            pushFollow(FOLLOW_rule__AddressField__Group__0__Impl_in_rule__AddressField__Group__08367);
            rule__AddressField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AddressField__Group__1_in_rule__AddressField__Group__08370);
            rule__AddressField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__0"


    // $ANTLR start "rule__AddressField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4214:1: rule__AddressField__Group__0__Impl : ( Address ) ;
    public final void rule__AddressField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4218:1: ( ( Address ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4219:1: ( Address )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4219:1: ( Address )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4220:1: Address
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldAccess().getAddressKeyword_0()); 
            }
            match(input,Address,FOLLOW_Address_in_rule__AddressField__Group__0__Impl8398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldAccess().getAddressKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__0__Impl"


    // $ANTLR start "rule__AddressField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4233:1: rule__AddressField__Group__1 : rule__AddressField__Group__1__Impl rule__AddressField__Group__2 ;
    public final void rule__AddressField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4237:1: ( rule__AddressField__Group__1__Impl rule__AddressField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4238:2: rule__AddressField__Group__1__Impl rule__AddressField__Group__2
            {
            pushFollow(FOLLOW_rule__AddressField__Group__1__Impl_in_rule__AddressField__Group__18429);
            rule__AddressField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AddressField__Group__2_in_rule__AddressField__Group__18432);
            rule__AddressField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__1"


    // $ANTLR start "rule__AddressField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4245:1: rule__AddressField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__AddressField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4249:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4250:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4250:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4251:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__AddressField__Group__1__Impl8460); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__1__Impl"


    // $ANTLR start "rule__AddressField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4264:1: rule__AddressField__Group__2 : rule__AddressField__Group__2__Impl ;
    public final void rule__AddressField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4268:1: ( rule__AddressField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4269:2: rule__AddressField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AddressField__Group__2__Impl_in_rule__AddressField__Group__28491);
            rule__AddressField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__2"


    // $ANTLR start "rule__AddressField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4275:1: rule__AddressField__Group__2__Impl : ( ( rule__AddressField__AddressAssignment_2 ) ) ;
    public final void rule__AddressField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4279:1: ( ( ( rule__AddressField__AddressAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4280:1: ( ( rule__AddressField__AddressAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4280:1: ( ( rule__AddressField__AddressAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4281:1: ( rule__AddressField__AddressAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldAccess().getAddressAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4282:1: ( rule__AddressField__AddressAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4282:2: rule__AddressField__AddressAssignment_2
            {
            pushFollow(FOLLOW_rule__AddressField__AddressAssignment_2_in_rule__AddressField__Group__2__Impl8518);
            rule__AddressField__AddressAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldAccess().getAddressAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__Group__2__Impl"


    // $ANTLR start "rule__SeriesField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4298:1: rule__SeriesField__Group__0 : rule__SeriesField__Group__0__Impl rule__SeriesField__Group__1 ;
    public final void rule__SeriesField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4302:1: ( rule__SeriesField__Group__0__Impl rule__SeriesField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4303:2: rule__SeriesField__Group__0__Impl rule__SeriesField__Group__1
            {
            pushFollow(FOLLOW_rule__SeriesField__Group__0__Impl_in_rule__SeriesField__Group__08554);
            rule__SeriesField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SeriesField__Group__1_in_rule__SeriesField__Group__08557);
            rule__SeriesField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__0"


    // $ANTLR start "rule__SeriesField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4310:1: rule__SeriesField__Group__0__Impl : ( Series ) ;
    public final void rule__SeriesField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4314:1: ( ( Series ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4315:1: ( Series )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4315:1: ( Series )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4316:1: Series
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldAccess().getSeriesKeyword_0()); 
            }
            match(input,Series,FOLLOW_Series_in_rule__SeriesField__Group__0__Impl8585); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldAccess().getSeriesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__0__Impl"


    // $ANTLR start "rule__SeriesField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4329:1: rule__SeriesField__Group__1 : rule__SeriesField__Group__1__Impl rule__SeriesField__Group__2 ;
    public final void rule__SeriesField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4333:1: ( rule__SeriesField__Group__1__Impl rule__SeriesField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4334:2: rule__SeriesField__Group__1__Impl rule__SeriesField__Group__2
            {
            pushFollow(FOLLOW_rule__SeriesField__Group__1__Impl_in_rule__SeriesField__Group__18616);
            rule__SeriesField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SeriesField__Group__2_in_rule__SeriesField__Group__18619);
            rule__SeriesField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__1"


    // $ANTLR start "rule__SeriesField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4341:1: rule__SeriesField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__SeriesField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4345:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4346:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4346:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4347:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__SeriesField__Group__1__Impl8647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__1__Impl"


    // $ANTLR start "rule__SeriesField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4360:1: rule__SeriesField__Group__2 : rule__SeriesField__Group__2__Impl ;
    public final void rule__SeriesField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4364:1: ( rule__SeriesField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4365:2: rule__SeriesField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SeriesField__Group__2__Impl_in_rule__SeriesField__Group__28678);
            rule__SeriesField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__2"


    // $ANTLR start "rule__SeriesField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4371:1: rule__SeriesField__Group__2__Impl : ( ( rule__SeriesField__SeriesAssignment_2 ) ) ;
    public final void rule__SeriesField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4375:1: ( ( ( rule__SeriesField__SeriesAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4376:1: ( ( rule__SeriesField__SeriesAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4376:1: ( ( rule__SeriesField__SeriesAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4377:1: ( rule__SeriesField__SeriesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldAccess().getSeriesAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4378:1: ( rule__SeriesField__SeriesAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4378:2: rule__SeriesField__SeriesAssignment_2
            {
            pushFollow(FOLLOW_rule__SeriesField__SeriesAssignment_2_in_rule__SeriesField__Group__2__Impl8705);
            rule__SeriesField__SeriesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldAccess().getSeriesAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__Group__2__Impl"


    // $ANTLR start "rule__EditionField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4394:1: rule__EditionField__Group__0 : rule__EditionField__Group__0__Impl rule__EditionField__Group__1 ;
    public final void rule__EditionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4398:1: ( rule__EditionField__Group__0__Impl rule__EditionField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4399:2: rule__EditionField__Group__0__Impl rule__EditionField__Group__1
            {
            pushFollow(FOLLOW_rule__EditionField__Group__0__Impl_in_rule__EditionField__Group__08741);
            rule__EditionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EditionField__Group__1_in_rule__EditionField__Group__08744);
            rule__EditionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__0"


    // $ANTLR start "rule__EditionField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4406:1: rule__EditionField__Group__0__Impl : ( Edition ) ;
    public final void rule__EditionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4410:1: ( ( Edition ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4411:1: ( Edition )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4411:1: ( Edition )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4412:1: Edition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldAccess().getEditionKeyword_0()); 
            }
            match(input,Edition,FOLLOW_Edition_in_rule__EditionField__Group__0__Impl8772); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldAccess().getEditionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__0__Impl"


    // $ANTLR start "rule__EditionField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4425:1: rule__EditionField__Group__1 : rule__EditionField__Group__1__Impl rule__EditionField__Group__2 ;
    public final void rule__EditionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4429:1: ( rule__EditionField__Group__1__Impl rule__EditionField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4430:2: rule__EditionField__Group__1__Impl rule__EditionField__Group__2
            {
            pushFollow(FOLLOW_rule__EditionField__Group__1__Impl_in_rule__EditionField__Group__18803);
            rule__EditionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__EditionField__Group__2_in_rule__EditionField__Group__18806);
            rule__EditionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__1"


    // $ANTLR start "rule__EditionField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4437:1: rule__EditionField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__EditionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4441:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4442:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4442:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4443:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__EditionField__Group__1__Impl8834); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__1__Impl"


    // $ANTLR start "rule__EditionField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4456:1: rule__EditionField__Group__2 : rule__EditionField__Group__2__Impl ;
    public final void rule__EditionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4460:1: ( rule__EditionField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4461:2: rule__EditionField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EditionField__Group__2__Impl_in_rule__EditionField__Group__28865);
            rule__EditionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__2"


    // $ANTLR start "rule__EditionField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4467:1: rule__EditionField__Group__2__Impl : ( ( rule__EditionField__EditionAssignment_2 ) ) ;
    public final void rule__EditionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4471:1: ( ( ( rule__EditionField__EditionAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4472:1: ( ( rule__EditionField__EditionAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4472:1: ( ( rule__EditionField__EditionAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4473:1: ( rule__EditionField__EditionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldAccess().getEditionAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4474:1: ( rule__EditionField__EditionAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4474:2: rule__EditionField__EditionAssignment_2
            {
            pushFollow(FOLLOW_rule__EditionField__EditionAssignment_2_in_rule__EditionField__Group__2__Impl8892);
            rule__EditionField__EditionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldAccess().getEditionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__Group__2__Impl"


    // $ANTLR start "rule__IsbnField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4490:1: rule__IsbnField__Group__0 : rule__IsbnField__Group__0__Impl rule__IsbnField__Group__1 ;
    public final void rule__IsbnField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4494:1: ( rule__IsbnField__Group__0__Impl rule__IsbnField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4495:2: rule__IsbnField__Group__0__Impl rule__IsbnField__Group__1
            {
            pushFollow(FOLLOW_rule__IsbnField__Group__0__Impl_in_rule__IsbnField__Group__08928);
            rule__IsbnField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IsbnField__Group__1_in_rule__IsbnField__Group__08931);
            rule__IsbnField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__0"


    // $ANTLR start "rule__IsbnField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4502:1: rule__IsbnField__Group__0__Impl : ( Isbn ) ;
    public final void rule__IsbnField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4506:1: ( ( Isbn ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4507:1: ( Isbn )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4507:1: ( Isbn )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4508:1: Isbn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldAccess().getIsbnKeyword_0()); 
            }
            match(input,Isbn,FOLLOW_Isbn_in_rule__IsbnField__Group__0__Impl8959); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldAccess().getIsbnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__0__Impl"


    // $ANTLR start "rule__IsbnField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4521:1: rule__IsbnField__Group__1 : rule__IsbnField__Group__1__Impl rule__IsbnField__Group__2 ;
    public final void rule__IsbnField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4525:1: ( rule__IsbnField__Group__1__Impl rule__IsbnField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4526:2: rule__IsbnField__Group__1__Impl rule__IsbnField__Group__2
            {
            pushFollow(FOLLOW_rule__IsbnField__Group__1__Impl_in_rule__IsbnField__Group__18990);
            rule__IsbnField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IsbnField__Group__2_in_rule__IsbnField__Group__18993);
            rule__IsbnField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__1"


    // $ANTLR start "rule__IsbnField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4533:1: rule__IsbnField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__IsbnField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4537:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4538:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4538:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4539:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__IsbnField__Group__1__Impl9021); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__1__Impl"


    // $ANTLR start "rule__IsbnField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4552:1: rule__IsbnField__Group__2 : rule__IsbnField__Group__2__Impl ;
    public final void rule__IsbnField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4556:1: ( rule__IsbnField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4557:2: rule__IsbnField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IsbnField__Group__2__Impl_in_rule__IsbnField__Group__29052);
            rule__IsbnField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__2"


    // $ANTLR start "rule__IsbnField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4563:1: rule__IsbnField__Group__2__Impl : ( ( rule__IsbnField__IsbnAssignment_2 ) ) ;
    public final void rule__IsbnField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4567:1: ( ( ( rule__IsbnField__IsbnAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4568:1: ( ( rule__IsbnField__IsbnAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4568:1: ( ( rule__IsbnField__IsbnAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4569:1: ( rule__IsbnField__IsbnAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldAccess().getIsbnAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4570:1: ( rule__IsbnField__IsbnAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4570:2: rule__IsbnField__IsbnAssignment_2
            {
            pushFollow(FOLLOW_rule__IsbnField__IsbnAssignment_2_in_rule__IsbnField__Group__2__Impl9079);
            rule__IsbnField__IsbnAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldAccess().getIsbnAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__Group__2__Impl"


    // $ANTLR start "rule__NoteField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4586:1: rule__NoteField__Group__0 : rule__NoteField__Group__0__Impl rule__NoteField__Group__1 ;
    public final void rule__NoteField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4590:1: ( rule__NoteField__Group__0__Impl rule__NoteField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4591:2: rule__NoteField__Group__0__Impl rule__NoteField__Group__1
            {
            pushFollow(FOLLOW_rule__NoteField__Group__0__Impl_in_rule__NoteField__Group__09115);
            rule__NoteField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NoteField__Group__1_in_rule__NoteField__Group__09118);
            rule__NoteField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__0"


    // $ANTLR start "rule__NoteField__Group__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4598:1: rule__NoteField__Group__0__Impl : ( Note ) ;
    public final void rule__NoteField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4602:1: ( ( Note ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4603:1: ( Note )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4603:1: ( Note )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4604:1: Note
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldAccess().getNoteKeyword_0()); 
            }
            match(input,Note,FOLLOW_Note_in_rule__NoteField__Group__0__Impl9146); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldAccess().getNoteKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__0__Impl"


    // $ANTLR start "rule__NoteField__Group__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4617:1: rule__NoteField__Group__1 : rule__NoteField__Group__1__Impl rule__NoteField__Group__2 ;
    public final void rule__NoteField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4621:1: ( rule__NoteField__Group__1__Impl rule__NoteField__Group__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4622:2: rule__NoteField__Group__1__Impl rule__NoteField__Group__2
            {
            pushFollow(FOLLOW_rule__NoteField__Group__1__Impl_in_rule__NoteField__Group__19177);
            rule__NoteField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NoteField__Group__2_in_rule__NoteField__Group__19180);
            rule__NoteField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__1"


    // $ANTLR start "rule__NoteField__Group__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4629:1: rule__NoteField__Group__1__Impl : ( EqualsSign ) ;
    public final void rule__NoteField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4633:1: ( ( EqualsSign ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4634:1: ( EqualsSign )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4634:1: ( EqualsSign )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4635:1: EqualsSign
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldAccess().getEqualsSignKeyword_1()); 
            }
            match(input,EqualsSign,FOLLOW_EqualsSign_in_rule__NoteField__Group__1__Impl9208); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldAccess().getEqualsSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__1__Impl"


    // $ANTLR start "rule__NoteField__Group__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4648:1: rule__NoteField__Group__2 : rule__NoteField__Group__2__Impl ;
    public final void rule__NoteField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4652:1: ( rule__NoteField__Group__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4653:2: rule__NoteField__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NoteField__Group__2__Impl_in_rule__NoteField__Group__29239);
            rule__NoteField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__2"


    // $ANTLR start "rule__NoteField__Group__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4659:1: rule__NoteField__Group__2__Impl : ( ( rule__NoteField__NoteAssignment_2 ) ) ;
    public final void rule__NoteField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4663:1: ( ( ( rule__NoteField__NoteAssignment_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4664:1: ( ( rule__NoteField__NoteAssignment_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4664:1: ( ( rule__NoteField__NoteAssignment_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4665:1: ( rule__NoteField__NoteAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldAccess().getNoteAssignment_2()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4666:1: ( rule__NoteField__NoteAssignment_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4666:2: rule__NoteField__NoteAssignment_2
            {
            pushFollow(FOLLOW_rule__NoteField__NoteAssignment_2_in_rule__NoteField__Group__2__Impl9266);
            rule__NoteField__NoteAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldAccess().getNoteAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__Group__2__Impl"


    // $ANTLR start "rule__Article__UnorderedGroup_4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4683:1: rule__Article__UnorderedGroup_4 : rule__Article__UnorderedGroup_4__0 {...}?;
    public final void rule__Article__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4688:1: ( rule__Article__UnorderedGroup_4__0 {...}?)
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4689:2: rule__Article__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__0_in_rule__Article__UnorderedGroup_49303);
            rule__Article__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4"


    // $ANTLR start "rule__Article__UnorderedGroup_4__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4700:1: rule__Article__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) ) ) ;
    public final void rule__Article__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4705:1: ( ( ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4706:3: ( ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4706:3: ( ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) ) )
            int alt9=10;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4708:4: ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4708:4: ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4709:5: {...}? => ( ( ( rule__Article__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4709:104: ( ( ( rule__Article__Group_4_0__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4710:6: ( ( rule__Article__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4716:6: ( ( rule__Article__Group_4_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4718:7: ( rule__Article__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_0()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4719:7: ( rule__Article__Group_4_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4719:8: rule__Article__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_0__0_in_rule__Article__UnorderedGroup_4__Impl9392);
                    rule__Article__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_0()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4728:4: ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4728:4: ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4729:5: {...}? => ( ( ( rule__Article__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4729:104: ( ( ( rule__Article__Group_4_1__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4730:6: ( ( rule__Article__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4736:6: ( ( rule__Article__Group_4_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4738:7: ( rule__Article__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_1()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4739:7: ( rule__Article__Group_4_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4739:8: rule__Article__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_1__0_in_rule__Article__UnorderedGroup_4__Impl9490);
                    rule__Article__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_1()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4748:4: ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4748:4: ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4749:5: {...}? => ( ( ( rule__Article__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4749:104: ( ( ( rule__Article__Group_4_2__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4750:6: ( ( rule__Article__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4756:6: ( ( rule__Article__Group_4_2__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4758:7: ( rule__Article__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_2()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4759:7: ( rule__Article__Group_4_2__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4759:8: rule__Article__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_2__0_in_rule__Article__UnorderedGroup_4__Impl9588);
                    rule__Article__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_2()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4768:4: ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4768:4: ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4769:5: {...}? => ( ( ( rule__Article__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4769:104: ( ( ( rule__Article__Group_4_3__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4770:6: ( ( rule__Article__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4776:6: ( ( rule__Article__Group_4_3__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4778:7: ( rule__Article__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_3()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4779:7: ( rule__Article__Group_4_3__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4779:8: rule__Article__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_3__0_in_rule__Article__UnorderedGroup_4__Impl9686);
                    rule__Article__Group_4_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_3()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4788:4: ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4788:4: ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4789:5: {...}? => ( ( ( rule__Article__Group_4_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4789:104: ( ( ( rule__Article__Group_4_4__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4790:6: ( ( rule__Article__Group_4_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4796:6: ( ( rule__Article__Group_4_4__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4798:7: ( rule__Article__Group_4_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_4()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4799:7: ( rule__Article__Group_4_4__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4799:8: rule__Article__Group_4_4__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_4__0_in_rule__Article__UnorderedGroup_4__Impl9784);
                    rule__Article__Group_4_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_4()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4808:4: ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4808:4: ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4809:5: {...}? => ( ( ( rule__Article__Group_4_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4809:104: ( ( ( rule__Article__Group_4_5__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4810:6: ( ( rule__Article__Group_4_5__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4816:6: ( ( rule__Article__Group_4_5__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4818:7: ( rule__Article__Group_4_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_5()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4819:7: ( rule__Article__Group_4_5__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4819:8: rule__Article__Group_4_5__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_5__0_in_rule__Article__UnorderedGroup_4__Impl9882);
                    rule__Article__Group_4_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_5()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4828:4: ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4828:4: ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4829:5: {...}? => ( ( ( rule__Article__Group_4_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4829:104: ( ( ( rule__Article__Group_4_6__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4830:6: ( ( rule__Article__Group_4_6__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4836:6: ( ( rule__Article__Group_4_6__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4838:7: ( rule__Article__Group_4_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_6()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4839:7: ( rule__Article__Group_4_6__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4839:8: rule__Article__Group_4_6__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_6__0_in_rule__Article__UnorderedGroup_4__Impl9980);
                    rule__Article__Group_4_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_6()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4848:4: ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4848:4: ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4849:5: {...}? => ( ( ( rule__Article__Group_4_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4849:104: ( ( ( rule__Article__Group_4_7__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4850:6: ( ( rule__Article__Group_4_7__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4856:6: ( ( rule__Article__Group_4_7__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4858:7: ( rule__Article__Group_4_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_7()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4859:7: ( rule__Article__Group_4_7__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4859:8: rule__Article__Group_4_7__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_7__0_in_rule__Article__UnorderedGroup_4__Impl10078);
                    rule__Article__Group_4_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_7()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4868:4: ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4868:4: ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4869:5: {...}? => ( ( ( rule__Article__Group_4_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4869:104: ( ( ( rule__Article__Group_4_8__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4870:6: ( ( rule__Article__Group_4_8__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4876:6: ( ( rule__Article__Group_4_8__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4878:7: ( rule__Article__Group_4_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_8()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4879:7: ( rule__Article__Group_4_8__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4879:8: rule__Article__Group_4_8__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_8__0_in_rule__Article__UnorderedGroup_4__Impl10176);
                    rule__Article__Group_4_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_8()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4888:4: ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4888:4: ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4889:5: {...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4889:104: ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4890:6: ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4896:6: ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4897:6: ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4897:6: ( ( rule__Article__Group_4_9__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4898:7: ( rule__Article__Group_4_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_9()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4899:7: ( rule__Article__Group_4_9__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4899:8: rule__Article__Group_4_9__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4_9__0_in_rule__Article__UnorderedGroup_4__Impl10275);
                    rule__Article__Group_4_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_9()); 
                    }

                    }

                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4902:6: ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4903:7: ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getArticleAccess().getGroup_4_9()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4904:7: ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            int LA8_1 = input.LA(2);

                            if ( (LA8_1==RULE_ID) ) {
                                int LA8_3 = input.LA(3);

                                if ( (LA8_3==EqualsSign) ) {
                                    int LA8_4 = input.LA(4);

                                    if ( (LA8_4==RULE_STRING) ) {
                                        int LA8_5 = input.LA(5);

                                        if ( (synpred1_InternalBibTeXParser()) ) {
                                            alt8=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4904:8: ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Article__Group_4_9__0_in_rule__Article__UnorderedGroup_4__Impl10319);
                    	    rule__Article__Group_4_9__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getArticleAccess().getGroup_4_9()); 
                    }

                    }


                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Article__UnorderedGroup_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4922:1: rule__Article__UnorderedGroup_4__0 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__1 )? ;
    public final void rule__Article__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4926:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__1 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4927:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__010392);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4928:2: ( rule__Article__UnorderedGroup_4__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( LA10_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4928:2: rule__Article__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__1_in_rule__Article__UnorderedGroup_4__010395);
                    rule__Article__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__0"


    // $ANTLR start "rule__Article__UnorderedGroup_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4935:1: rule__Article__UnorderedGroup_4__1 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__2 )? ;
    public final void rule__Article__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4939:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__2 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4940:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__110420);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4941:2: ( rule__Article__UnorderedGroup_4__2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( LA11_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4941:2: rule__Article__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__2_in_rule__Article__UnorderedGroup_4__110423);
                    rule__Article__UnorderedGroup_4__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__1"


    // $ANTLR start "rule__Article__UnorderedGroup_4__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4948:1: rule__Article__UnorderedGroup_4__2 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__3 )? ;
    public final void rule__Article__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4952:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__3 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4953:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__210448);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4954:2: ( rule__Article__UnorderedGroup_4__3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4954:2: rule__Article__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__3_in_rule__Article__UnorderedGroup_4__210451);
                    rule__Article__UnorderedGroup_4__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__2"


    // $ANTLR start "rule__Article__UnorderedGroup_4__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4961:1: rule__Article__UnorderedGroup_4__3 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__4 )? ;
    public final void rule__Article__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4965:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__4 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4966:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__310476);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4967:2: ( rule__Article__UnorderedGroup_4__4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4967:2: rule__Article__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__4_in_rule__Article__UnorderedGroup_4__310479);
                    rule__Article__UnorderedGroup_4__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__3"


    // $ANTLR start "rule__Article__UnorderedGroup_4__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4974:1: rule__Article__UnorderedGroup_4__4 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__5 )? ;
    public final void rule__Article__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4978:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__5 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4979:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__5 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__410504);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4980:2: ( rule__Article__UnorderedGroup_4__5 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4980:2: rule__Article__UnorderedGroup_4__5
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__5_in_rule__Article__UnorderedGroup_4__410507);
                    rule__Article__UnorderedGroup_4__5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__4"


    // $ANTLR start "rule__Article__UnorderedGroup_4__5"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4987:1: rule__Article__UnorderedGroup_4__5 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__6 )? ;
    public final void rule__Article__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4991:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__6 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4992:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__6 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__510532);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4993:2: ( rule__Article__UnorderedGroup_4__6 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4993:2: rule__Article__UnorderedGroup_4__6
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__6_in_rule__Article__UnorderedGroup_4__510535);
                    rule__Article__UnorderedGroup_4__6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__5"


    // $ANTLR start "rule__Article__UnorderedGroup_4__6"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5000:1: rule__Article__UnorderedGroup_4__6 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__7 )? ;
    public final void rule__Article__UnorderedGroup_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5004:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__7 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5005:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__7 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__610560);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5006:2: ( rule__Article__UnorderedGroup_4__7 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5006:2: rule__Article__UnorderedGroup_4__7
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__7_in_rule__Article__UnorderedGroup_4__610563);
                    rule__Article__UnorderedGroup_4__7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__6"


    // $ANTLR start "rule__Article__UnorderedGroup_4__7"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5013:1: rule__Article__UnorderedGroup_4__7 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__8 )? ;
    public final void rule__Article__UnorderedGroup_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5017:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__8 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5018:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__8 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__710588);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5019:2: ( rule__Article__UnorderedGroup_4__8 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( LA17_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5019:2: rule__Article__UnorderedGroup_4__8
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__8_in_rule__Article__UnorderedGroup_4__710591);
                    rule__Article__UnorderedGroup_4__8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__7"


    // $ANTLR start "rule__Article__UnorderedGroup_4__8"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5026:1: rule__Article__UnorderedGroup_4__8 : rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__9 )? ;
    public final void rule__Article__UnorderedGroup_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5030:1: ( rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__9 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5031:2: rule__Article__UnorderedGroup_4__Impl ( rule__Article__UnorderedGroup_4__9 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__810616);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5032:2: ( rule__Article__UnorderedGroup_4__9 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5032:2: rule__Article__UnorderedGroup_4__9
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__9_in_rule__Article__UnorderedGroup_4__810619);
                    rule__Article__UnorderedGroup_4__9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__8"


    // $ANTLR start "rule__Article__UnorderedGroup_4__9"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5039:1: rule__Article__UnorderedGroup_4__9 : rule__Article__UnorderedGroup_4__Impl ;
    public final void rule__Article__UnorderedGroup_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5043:1: ( rule__Article__UnorderedGroup_4__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5044:2: rule__Article__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__910644);
            rule__Article__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup_4__9"


    // $ANTLR start "rule__Book__UnorderedGroup_4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5071:1: rule__Book__UnorderedGroup_4 : rule__Book__UnorderedGroup_4__0 {...}?;
    public final void rule__Book__UnorderedGroup_4() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBookAccess().getUnorderedGroup_4());
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5076:1: ( rule__Book__UnorderedGroup_4__0 {...}?)
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5077:2: rule__Book__UnorderedGroup_4__0 {...}?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__0_in_rule__Book__UnorderedGroup_410688);
            rule__Book__UnorderedGroup_4__0();

            state._fsp--;
            if (state.failed) return ;
            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getBookAccess().getUnorderedGroup_4()) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4", "getUnorderedGroupHelper().canLeave(grammarAccess.getBookAccess().getUnorderedGroup_4())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4"


    // $ANTLR start "rule__Book__UnorderedGroup_4__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5088:1: rule__Book__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) ) ) ;
    public final void rule__Book__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5093:1: ( ( ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5094:3: ( ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5094:3: ( ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) ) )
            int alt20=12;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5096:4: ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5096:4: ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5097:5: {...}? => ( ( ( rule__Book__Group_4_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5097:101: ( ( ( rule__Book__Group_4_0__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5098:6: ( ( rule__Book__Group_4_0__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5104:6: ( ( rule__Book__Group_4_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5106:7: ( rule__Book__Group_4_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_0()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5107:7: ( rule__Book__Group_4_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5107:8: rule__Book__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_0__0_in_rule__Book__UnorderedGroup_4__Impl10777);
                    rule__Book__Group_4_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_0()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5116:4: ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5116:4: ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5117:5: {...}? => ( ( ( rule__Book__Group_4_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5117:101: ( ( ( rule__Book__Group_4_1__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5118:6: ( ( rule__Book__Group_4_1__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5124:6: ( ( rule__Book__Group_4_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5126:7: ( rule__Book__Group_4_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_1()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5127:7: ( rule__Book__Group_4_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5127:8: rule__Book__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_1__0_in_rule__Book__UnorderedGroup_4__Impl10875);
                    rule__Book__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_1()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5136:4: ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5136:4: ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5137:5: {...}? => ( ( ( rule__Book__Group_4_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5137:101: ( ( ( rule__Book__Group_4_2__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5138:6: ( ( rule__Book__Group_4_2__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5144:6: ( ( rule__Book__Group_4_2__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5146:7: ( rule__Book__Group_4_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_2()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5147:7: ( rule__Book__Group_4_2__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5147:8: rule__Book__Group_4_2__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_2__0_in_rule__Book__UnorderedGroup_4__Impl10973);
                    rule__Book__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_2()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5156:4: ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5156:4: ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5157:5: {...}? => ( ( ( rule__Book__Group_4_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5157:101: ( ( ( rule__Book__Group_4_3__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5158:6: ( ( rule__Book__Group_4_3__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5164:6: ( ( rule__Book__Group_4_3__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5166:7: ( rule__Book__Group_4_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_3()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5167:7: ( rule__Book__Group_4_3__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5167:8: rule__Book__Group_4_3__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_3__0_in_rule__Book__UnorderedGroup_4__Impl11071);
                    rule__Book__Group_4_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_3()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5176:4: ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5176:4: ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5177:5: {...}? => ( ( ( rule__Book__Group_4_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5177:101: ( ( ( rule__Book__Group_4_4__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5178:6: ( ( rule__Book__Group_4_4__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5184:6: ( ( rule__Book__Group_4_4__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5186:7: ( rule__Book__Group_4_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_4()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5187:7: ( rule__Book__Group_4_4__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5187:8: rule__Book__Group_4_4__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_4__0_in_rule__Book__UnorderedGroup_4__Impl11169);
                    rule__Book__Group_4_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_4()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5196:4: ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5196:4: ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5197:5: {...}? => ( ( ( rule__Book__Group_4_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5197:101: ( ( ( rule__Book__Group_4_5__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5198:6: ( ( rule__Book__Group_4_5__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5204:6: ( ( rule__Book__Group_4_5__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5206:7: ( rule__Book__Group_4_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_5()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5207:7: ( rule__Book__Group_4_5__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5207:8: rule__Book__Group_4_5__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_5__0_in_rule__Book__UnorderedGroup_4__Impl11267);
                    rule__Book__Group_4_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_5()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5216:4: ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5216:4: ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5217:5: {...}? => ( ( ( rule__Book__Group_4_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5217:101: ( ( ( rule__Book__Group_4_6__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5218:6: ( ( rule__Book__Group_4_6__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5224:6: ( ( rule__Book__Group_4_6__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5226:7: ( rule__Book__Group_4_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_6()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5227:7: ( rule__Book__Group_4_6__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5227:8: rule__Book__Group_4_6__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_6__0_in_rule__Book__UnorderedGroup_4__Impl11365);
                    rule__Book__Group_4_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_6()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5236:4: ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5236:4: ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5237:5: {...}? => ( ( ( rule__Book__Group_4_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5237:101: ( ( ( rule__Book__Group_4_7__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5238:6: ( ( rule__Book__Group_4_7__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5244:6: ( ( rule__Book__Group_4_7__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5246:7: ( rule__Book__Group_4_7__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_7()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5247:7: ( rule__Book__Group_4_7__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5247:8: rule__Book__Group_4_7__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_7__0_in_rule__Book__UnorderedGroup_4__Impl11463);
                    rule__Book__Group_4_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_7()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5256:4: ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5256:4: ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5257:5: {...}? => ( ( ( rule__Book__Group_4_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5257:101: ( ( ( rule__Book__Group_4_8__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5258:6: ( ( rule__Book__Group_4_8__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5264:6: ( ( rule__Book__Group_4_8__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5266:7: ( rule__Book__Group_4_8__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_8()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5267:7: ( rule__Book__Group_4_8__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5267:8: rule__Book__Group_4_8__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_8__0_in_rule__Book__UnorderedGroup_4__Impl11561);
                    rule__Book__Group_4_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_8()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5276:4: ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5276:4: ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5277:5: {...}? => ( ( ( rule__Book__Group_4_9__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5277:101: ( ( ( rule__Book__Group_4_9__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5278:6: ( ( rule__Book__Group_4_9__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5284:6: ( ( rule__Book__Group_4_9__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5286:7: ( rule__Book__Group_4_9__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_9()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5287:7: ( rule__Book__Group_4_9__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5287:8: rule__Book__Group_4_9__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_9__0_in_rule__Book__UnorderedGroup_4__Impl11659);
                    rule__Book__Group_4_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_9()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5296:4: ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5296:4: ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5297:5: {...}? => ( ( ( rule__Book__Group_4_10__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5297:102: ( ( ( rule__Book__Group_4_10__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5298:6: ( ( rule__Book__Group_4_10__0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5304:6: ( ( rule__Book__Group_4_10__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5306:7: ( rule__Book__Group_4_10__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_10()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5307:7: ( rule__Book__Group_4_10__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5307:8: rule__Book__Group_4_10__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_10__0_in_rule__Book__UnorderedGroup_4__Impl11757);
                    rule__Book__Group_4_10__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_10()); 
                    }

                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5316:4: ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5316:4: ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5317:5: {...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Book__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5317:102: ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5318:6: ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11);
                    selected = true;
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5324:6: ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5325:6: ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5325:6: ( ( rule__Book__Group_4_11__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5326:7: ( rule__Book__Group_4_11__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_11()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5327:7: ( rule__Book__Group_4_11__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5327:8: rule__Book__Group_4_11__0
                    {
                    pushFollow(FOLLOW_rule__Book__Group_4_11__0_in_rule__Book__UnorderedGroup_4__Impl11856);
                    rule__Book__Group_4_11__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_11()); 
                    }

                    }

                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5330:6: ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5331:7: ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBookAccess().getGroup_4_11()); 
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5332:7: ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            int LA19_1 = input.LA(2);

                            if ( (LA19_1==RULE_ID) ) {
                                int LA19_3 = input.LA(3);

                                if ( (LA19_3==EqualsSign) ) {
                                    int LA19_4 = input.LA(4);

                                    if ( (LA19_4==RULE_STRING) ) {
                                        int LA19_5 = input.LA(5);

                                        if ( (synpred2_InternalBibTeXParser()) ) {
                                            alt19=1;
                                        }


                                    }


                                }


                            }


                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5332:8: ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0
                    	    {
                    	    pushFollow(FOLLOW_rule__Book__Group_4_11__0_in_rule__Book__UnorderedGroup_4__Impl11900);
                    	    rule__Book__Group_4_11__0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBookAccess().getGroup_4_11()); 
                    }

                    }


                    }

                    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBookAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__Book__UnorderedGroup_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5350:1: rule__Book__UnorderedGroup_4__0 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__1 )? ;
    public final void rule__Book__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5354:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__1 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5355:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__011973);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5356:2: ( rule__Book__UnorderedGroup_4__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5356:2: rule__Book__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__1_in_rule__Book__UnorderedGroup_4__011976);
                    rule__Book__UnorderedGroup_4__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__0"


    // $ANTLR start "rule__Book__UnorderedGroup_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5363:1: rule__Book__UnorderedGroup_4__1 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__2 )? ;
    public final void rule__Book__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5367:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__2 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5368:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__112001);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5369:2: ( rule__Book__UnorderedGroup_4__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5369:2: rule__Book__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__2_in_rule__Book__UnorderedGroup_4__112004);
                    rule__Book__UnorderedGroup_4__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__1"


    // $ANTLR start "rule__Book__UnorderedGroup_4__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5376:1: rule__Book__UnorderedGroup_4__2 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__3 )? ;
    public final void rule__Book__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5380:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__3 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5381:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__212029);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5382:2: ( rule__Book__UnorderedGroup_4__3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5382:2: rule__Book__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__3_in_rule__Book__UnorderedGroup_4__212032);
                    rule__Book__UnorderedGroup_4__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__2"


    // $ANTLR start "rule__Book__UnorderedGroup_4__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5389:1: rule__Book__UnorderedGroup_4__3 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__4 )? ;
    public final void rule__Book__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5393:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__4 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5394:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__4 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__312057);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5395:2: ( rule__Book__UnorderedGroup_4__4 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5395:2: rule__Book__UnorderedGroup_4__4
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__4_in_rule__Book__UnorderedGroup_4__312060);
                    rule__Book__UnorderedGroup_4__4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__3"


    // $ANTLR start "rule__Book__UnorderedGroup_4__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5402:1: rule__Book__UnorderedGroup_4__4 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__5 )? ;
    public final void rule__Book__UnorderedGroup_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5406:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__5 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5407:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__5 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__412085);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5408:2: ( rule__Book__UnorderedGroup_4__5 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5408:2: rule__Book__UnorderedGroup_4__5
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__5_in_rule__Book__UnorderedGroup_4__412088);
                    rule__Book__UnorderedGroup_4__5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__4"


    // $ANTLR start "rule__Book__UnorderedGroup_4__5"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5415:1: rule__Book__UnorderedGroup_4__5 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__6 )? ;
    public final void rule__Book__UnorderedGroup_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5419:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__6 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5420:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__6 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__512113);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5421:2: ( rule__Book__UnorderedGroup_4__6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5421:2: rule__Book__UnorderedGroup_4__6
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__6_in_rule__Book__UnorderedGroup_4__512116);
                    rule__Book__UnorderedGroup_4__6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__5"


    // $ANTLR start "rule__Book__UnorderedGroup_4__6"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5428:1: rule__Book__UnorderedGroup_4__6 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__7 )? ;
    public final void rule__Book__UnorderedGroup_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5432:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__7 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5433:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__7 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__612141);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5434:2: ( rule__Book__UnorderedGroup_4__7 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5434:2: rule__Book__UnorderedGroup_4__7
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__7_in_rule__Book__UnorderedGroup_4__612144);
                    rule__Book__UnorderedGroup_4__7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__6"


    // $ANTLR start "rule__Book__UnorderedGroup_4__7"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5441:1: rule__Book__UnorderedGroup_4__7 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__8 )? ;
    public final void rule__Book__UnorderedGroup_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5445:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__8 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5446:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__8 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__712169);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5447:2: ( rule__Book__UnorderedGroup_4__8 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5447:2: rule__Book__UnorderedGroup_4__8
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__8_in_rule__Book__UnorderedGroup_4__712172);
                    rule__Book__UnorderedGroup_4__8();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__7"


    // $ANTLR start "rule__Book__UnorderedGroup_4__8"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5454:1: rule__Book__UnorderedGroup_4__8 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__9 )? ;
    public final void rule__Book__UnorderedGroup_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5458:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__9 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5459:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__9 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__812197);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5460:2: ( rule__Book__UnorderedGroup_4__9 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5460:2: rule__Book__UnorderedGroup_4__9
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__9_in_rule__Book__UnorderedGroup_4__812200);
                    rule__Book__UnorderedGroup_4__9();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__8"


    // $ANTLR start "rule__Book__UnorderedGroup_4__9"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5467:1: rule__Book__UnorderedGroup_4__9 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__10 )? ;
    public final void rule__Book__UnorderedGroup_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5471:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__10 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5472:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__10 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__912225);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5473:2: ( rule__Book__UnorderedGroup_4__10 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5473:2: rule__Book__UnorderedGroup_4__10
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__10_in_rule__Book__UnorderedGroup_4__912228);
                    rule__Book__UnorderedGroup_4__10();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__9"


    // $ANTLR start "rule__Book__UnorderedGroup_4__10"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5480:1: rule__Book__UnorderedGroup_4__10 : rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__11 )? ;
    public final void rule__Book__UnorderedGroup_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5484:1: ( rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__11 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5485:2: rule__Book__UnorderedGroup_4__Impl ( rule__Book__UnorderedGroup_4__11 )?
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__1012253);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5486:2: ( rule__Book__UnorderedGroup_4__11 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5486:2: rule__Book__UnorderedGroup_4__11
                    {
                    pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__11_in_rule__Book__UnorderedGroup_4__1012256);
                    rule__Book__UnorderedGroup_4__11();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__10"


    // $ANTLR start "rule__Book__UnorderedGroup_4__11"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5493:1: rule__Book__UnorderedGroup_4__11 : rule__Book__UnorderedGroup_4__Impl ;
    public final void rule__Book__UnorderedGroup_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5497:1: ( rule__Book__UnorderedGroup_4__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5498:2: rule__Book__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__1112281);
            rule__Book__UnorderedGroup_4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnorderedGroup_4__11"


    // $ANTLR start "rule__Model__BibtexEntriesAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5529:1: rule__Model__BibtexEntriesAssignment : ( ruleBibtexEntryTypes ) ;
    public final void rule__Model__BibtexEntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5533:1: ( ( ruleBibtexEntryTypes ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5534:1: ( ruleBibtexEntryTypes )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5534:1: ( ruleBibtexEntryTypes )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5535:1: ruleBibtexEntryTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_rule__Model__BibtexEntriesAssignment12333);
            ruleBibtexEntryTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BibtexEntriesAssignment"


    // $ANTLR start "rule__Article__KeyAssignment_3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5544:1: rule__Article__KeyAssignment_3 : ( ruleCiteKey ) ;
    public final void rule__Article__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5548:1: ( ( ruleCiteKey ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5549:1: ( ruleCiteKey )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5549:1: ( ruleCiteKey )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5550:1: ruleCiteKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCiteKey_in_rule__Article__KeyAssignment_312364);
            ruleCiteKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__KeyAssignment_3"


    // $ANTLR start "rule__Article__AuthorAssignment_4_0_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5559:1: rule__Article__AuthorAssignment_4_0_1 : ( ruleAuthorField ) ;
    public final void rule__Article__AuthorAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5563:1: ( ( ruleAuthorField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5564:1: ( ruleAuthorField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5564:1: ( ruleAuthorField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5565:1: ruleAuthorField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_4_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleAuthorField_in_rule__Article__AuthorAssignment_4_0_112395);
            ruleAuthorField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__AuthorAssignment_4_0_1"


    // $ANTLR start "rule__Article__TitleAssignment_4_1_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5574:1: rule__Article__TitleAssignment_4_1_1 : ( ruleTitleField ) ;
    public final void rule__Article__TitleAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5578:1: ( ( ruleTitleField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5579:1: ( ruleTitleField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5579:1: ( ruleTitleField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5580:1: ruleTitleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTitleField_in_rule__Article__TitleAssignment_4_1_112426);
            ruleTitleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__TitleAssignment_4_1_1"


    // $ANTLR start "rule__Article__JournalAssignment_4_2_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5589:1: rule__Article__JournalAssignment_4_2_1 : ( ruleJournalField ) ;
    public final void rule__Article__JournalAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5593:1: ( ( ruleJournalField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5594:1: ( ruleJournalField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5594:1: ( ruleJournalField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5595:1: ruleJournalField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleJournalField_in_rule__Article__JournalAssignment_4_2_112457);
            ruleJournalField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__JournalAssignment_4_2_1"


    // $ANTLR start "rule__Article__YearAssignment_4_3_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5604:1: rule__Article__YearAssignment_4_3_1 : ( ruleYearField ) ;
    public final void rule__Article__YearAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5608:1: ( ( ruleYearField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5609:1: ( ruleYearField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5609:1: ( ruleYearField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5610:1: ruleYearField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleYearField_in_rule__Article__YearAssignment_4_3_112488);
            ruleYearField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__YearAssignment_4_3_1"


    // $ANTLR start "rule__Article__VolumeAssignment_4_4_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5619:1: rule__Article__VolumeAssignment_4_4_1 : ( ruleVolumeField ) ;
    public final void rule__Article__VolumeAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5623:1: ( ( ruleVolumeField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5624:1: ( ruleVolumeField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5624:1: ( ruleVolumeField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5625:1: ruleVolumeField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleVolumeField_in_rule__Article__VolumeAssignment_4_4_112519);
            ruleVolumeField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__VolumeAssignment_4_4_1"


    // $ANTLR start "rule__Article__NumberAssignment_4_5_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5634:1: rule__Article__NumberAssignment_4_5_1 : ( ruleNumberField ) ;
    public final void rule__Article__NumberAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5638:1: ( ( ruleNumberField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5639:1: ( ruleNumberField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5639:1: ( ruleNumberField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5640:1: ruleNumberField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_4_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleNumberField_in_rule__Article__NumberAssignment_4_5_112550);
            ruleNumberField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_4_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__NumberAssignment_4_5_1"


    // $ANTLR start "rule__Article__PagesAssignment_4_6_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5649:1: rule__Article__PagesAssignment_4_6_1 : ( rulePagesField ) ;
    public final void rule__Article__PagesAssignment_4_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5653:1: ( ( rulePagesField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5654:1: ( rulePagesField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5654:1: ( rulePagesField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5655:1: rulePagesField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_4_6_1_0()); 
            }
            pushFollow(FOLLOW_rulePagesField_in_rule__Article__PagesAssignment_4_6_112581);
            rulePagesField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_4_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__PagesAssignment_4_6_1"


    // $ANTLR start "rule__Article__MonthAssignment_4_7_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5664:1: rule__Article__MonthAssignment_4_7_1 : ( ruleMonthField ) ;
    public final void rule__Article__MonthAssignment_4_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5668:1: ( ( ruleMonthField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5669:1: ( ruleMonthField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5669:1: ( ruleMonthField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5670:1: ruleMonthField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_4_7_1_0()); 
            }
            pushFollow(FOLLOW_ruleMonthField_in_rule__Article__MonthAssignment_4_7_112612);
            ruleMonthField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_4_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__MonthAssignment_4_7_1"


    // $ANTLR start "rule__Article__NoteAssignment_4_8_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5679:1: rule__Article__NoteAssignment_4_8_1 : ( ruleNoteField ) ;
    public final void rule__Article__NoteAssignment_4_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5683:1: ( ( ruleNoteField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5684:1: ( ruleNoteField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5684:1: ( ruleNoteField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5685:1: ruleNoteField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_4_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleNoteField_in_rule__Article__NoteAssignment_4_8_112643);
            ruleNoteField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_4_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__NoteAssignment_4_8_1"


    // $ANTLR start "rule__Article__UnknownsAssignment_4_9_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5694:1: rule__Article__UnknownsAssignment_4_9_1 : ( ruleUnknownField ) ;
    public final void rule__Article__UnknownsAssignment_4_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5698:1: ( ( ruleUnknownField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5699:1: ( ruleUnknownField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5699:1: ( ruleUnknownField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5700:1: ruleUnknownField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArticleAccess().getUnknownsUnknownFieldParserRuleCall_4_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleUnknownField_in_rule__Article__UnknownsAssignment_4_9_112674);
            ruleUnknownField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArticleAccess().getUnknownsUnknownFieldParserRuleCall_4_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnknownsAssignment_4_9_1"


    // $ANTLR start "rule__Book__KeyAssignment_3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5709:1: rule__Book__KeyAssignment_3 : ( ruleCiteKey ) ;
    public final void rule__Book__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5713:1: ( ( ruleCiteKey ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5714:1: ( ruleCiteKey )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5714:1: ( ruleCiteKey )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5715:1: ruleCiteKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleCiteKey_in_rule__Book__KeyAssignment_312705);
            ruleCiteKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getKeyCiteKeyParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__KeyAssignment_3"


    // $ANTLR start "rule__Book__Author_editorAssignment_4_0_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5724:1: rule__Book__Author_editorAssignment_4_0_1 : ( ( rule__Book__Author_editorAlternatives_4_0_1_0 ) ) ;
    public final void rule__Book__Author_editorAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5728:1: ( ( ( rule__Book__Author_editorAlternatives_4_0_1_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5729:1: ( ( rule__Book__Author_editorAlternatives_4_0_1_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5729:1: ( ( rule__Book__Author_editorAlternatives_4_0_1_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5730:1: ( rule__Book__Author_editorAlternatives_4_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getAuthor_editorAlternatives_4_0_1_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5731:1: ( rule__Book__Author_editorAlternatives_4_0_1_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5731:2: rule__Book__Author_editorAlternatives_4_0_1_0
            {
            pushFollow(FOLLOW_rule__Book__Author_editorAlternatives_4_0_1_0_in_rule__Book__Author_editorAssignment_4_0_112736);
            rule__Book__Author_editorAlternatives_4_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getAuthor_editorAlternatives_4_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Author_editorAssignment_4_0_1"


    // $ANTLR start "rule__Book__TitleAssignment_4_1_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5740:1: rule__Book__TitleAssignment_4_1_1 : ( ruleTitleField ) ;
    public final void rule__Book__TitleAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5744:1: ( ( ruleTitleField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5745:1: ( ruleTitleField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5745:1: ( ruleTitleField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5746:1: ruleTitleField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleTitleField_in_rule__Book__TitleAssignment_4_1_112769);
            ruleTitleField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getTitleTitleFieldParserRuleCall_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__TitleAssignment_4_1_1"


    // $ANTLR start "rule__Book__PublisherAssignment_4_2_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5755:1: rule__Book__PublisherAssignment_4_2_1 : ( rulePublisherField ) ;
    public final void rule__Book__PublisherAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5759:1: ( ( rulePublisherField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5760:1: ( rulePublisherField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5760:1: ( rulePublisherField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5761:1: rulePublisherField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getPublisherPublisherFieldParserRuleCall_4_2_1_0()); 
            }
            pushFollow(FOLLOW_rulePublisherField_in_rule__Book__PublisherAssignment_4_2_112800);
            rulePublisherField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getPublisherPublisherFieldParserRuleCall_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__PublisherAssignment_4_2_1"


    // $ANTLR start "rule__Book__YearAssignment_4_3_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5770:1: rule__Book__YearAssignment_4_3_1 : ( ruleYearField ) ;
    public final void rule__Book__YearAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5774:1: ( ( ruleYearField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5775:1: ( ruleYearField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5775:1: ( ruleYearField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5776:1: ruleYearField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleYearField_in_rule__Book__YearAssignment_4_3_112831);
            ruleYearField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getYearYearFieldParserRuleCall_4_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__YearAssignment_4_3_1"


    // $ANTLR start "rule__Book__Volume_numberAssignment_4_4_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5785:1: rule__Book__Volume_numberAssignment_4_4_1 : ( ( rule__Book__Volume_numberAlternatives_4_4_1_0 ) ) ;
    public final void rule__Book__Volume_numberAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5789:1: ( ( ( rule__Book__Volume_numberAlternatives_4_4_1_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5790:1: ( ( rule__Book__Volume_numberAlternatives_4_4_1_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5790:1: ( ( rule__Book__Volume_numberAlternatives_4_4_1_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5791:1: ( rule__Book__Volume_numberAlternatives_4_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getVolume_numberAlternatives_4_4_1_0()); 
            }
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5792:1: ( rule__Book__Volume_numberAlternatives_4_4_1_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5792:2: rule__Book__Volume_numberAlternatives_4_4_1_0
            {
            pushFollow(FOLLOW_rule__Book__Volume_numberAlternatives_4_4_1_0_in_rule__Book__Volume_numberAssignment_4_4_112862);
            rule__Book__Volume_numberAlternatives_4_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getVolume_numberAlternatives_4_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__Volume_numberAssignment_4_4_1"


    // $ANTLR start "rule__Book__SeriesAssignment_4_5_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5801:1: rule__Book__SeriesAssignment_4_5_1 : ( ruleSeriesField ) ;
    public final void rule__Book__SeriesAssignment_4_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5805:1: ( ( ruleSeriesField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5806:1: ( ruleSeriesField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5806:1: ( ruleSeriesField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5807:1: ruleSeriesField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getSeriesSeriesFieldParserRuleCall_4_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleSeriesField_in_rule__Book__SeriesAssignment_4_5_112895);
            ruleSeriesField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getSeriesSeriesFieldParserRuleCall_4_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__SeriesAssignment_4_5_1"


    // $ANTLR start "rule__Book__AddressAssignment_4_6_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5816:1: rule__Book__AddressAssignment_4_6_1 : ( ruleAddressField ) ;
    public final void rule__Book__AddressAssignment_4_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5820:1: ( ( ruleAddressField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5821:1: ( ruleAddressField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5821:1: ( ruleAddressField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5822:1: ruleAddressField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getAddressAddressFieldParserRuleCall_4_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleAddressField_in_rule__Book__AddressAssignment_4_6_112926);
            ruleAddressField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getAddressAddressFieldParserRuleCall_4_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__AddressAssignment_4_6_1"


    // $ANTLR start "rule__Book__EditionAssignment_4_7_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5831:1: rule__Book__EditionAssignment_4_7_1 : ( ruleEditionField ) ;
    public final void rule__Book__EditionAssignment_4_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5835:1: ( ( ruleEditionField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5836:1: ( ruleEditionField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5836:1: ( ruleEditionField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5837:1: ruleEditionField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getEditionEditionFieldParserRuleCall_4_7_1_0()); 
            }
            pushFollow(FOLLOW_ruleEditionField_in_rule__Book__EditionAssignment_4_7_112957);
            ruleEditionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getEditionEditionFieldParserRuleCall_4_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__EditionAssignment_4_7_1"


    // $ANTLR start "rule__Book__MonthAssignment_4_8_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5846:1: rule__Book__MonthAssignment_4_8_1 : ( ruleMonthField ) ;
    public final void rule__Book__MonthAssignment_4_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5850:1: ( ( ruleMonthField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5851:1: ( ruleMonthField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5851:1: ( ruleMonthField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5852:1: ruleMonthField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getMonthMonthFieldParserRuleCall_4_8_1_0()); 
            }
            pushFollow(FOLLOW_ruleMonthField_in_rule__Book__MonthAssignment_4_8_112988);
            ruleMonthField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getMonthMonthFieldParserRuleCall_4_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__MonthAssignment_4_8_1"


    // $ANTLR start "rule__Book__IsbnAssignment_4_9_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5861:1: rule__Book__IsbnAssignment_4_9_1 : ( ruleIsbnField ) ;
    public final void rule__Book__IsbnAssignment_4_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5865:1: ( ( ruleIsbnField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5866:1: ( ruleIsbnField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5866:1: ( ruleIsbnField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5867:1: ruleIsbnField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getIsbnIsbnFieldParserRuleCall_4_9_1_0()); 
            }
            pushFollow(FOLLOW_ruleIsbnField_in_rule__Book__IsbnAssignment_4_9_113019);
            ruleIsbnField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getIsbnIsbnFieldParserRuleCall_4_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__IsbnAssignment_4_9_1"


    // $ANTLR start "rule__Book__NoteAssignment_4_10_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5876:1: rule__Book__NoteAssignment_4_10_1 : ( ruleNoteField ) ;
    public final void rule__Book__NoteAssignment_4_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5880:1: ( ( ruleNoteField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5881:1: ( ruleNoteField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5881:1: ( ruleNoteField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5882:1: ruleNoteField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getNoteNoteFieldParserRuleCall_4_10_1_0()); 
            }
            pushFollow(FOLLOW_ruleNoteField_in_rule__Book__NoteAssignment_4_10_113050);
            ruleNoteField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getNoteNoteFieldParserRuleCall_4_10_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__NoteAssignment_4_10_1"


    // $ANTLR start "rule__Book__UnknownsAssignment_4_11_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5891:1: rule__Book__UnknownsAssignment_4_11_1 : ( ruleUnknownField ) ;
    public final void rule__Book__UnknownsAssignment_4_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5895:1: ( ( ruleUnknownField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5896:1: ( ruleUnknownField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5896:1: ( ruleUnknownField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5897:1: ruleUnknownField
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBookAccess().getUnknownsUnknownFieldParserRuleCall_4_11_1_0()); 
            }
            pushFollow(FOLLOW_ruleUnknownField_in_rule__Book__UnknownsAssignment_4_11_113081);
            ruleUnknownField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBookAccess().getUnknownsUnknownFieldParserRuleCall_4_11_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Book__UnknownsAssignment_4_11_1"


    // $ANTLR start "rule__UnknownField__TypeAssignment_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5906:1: rule__UnknownField__TypeAssignment_0 : ( ruleUnknownType ) ;
    public final void rule__UnknownField__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5910:1: ( ( ruleUnknownType ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5911:1: ( ruleUnknownType )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5911:1: ( ruleUnknownType )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5912:1: ruleUnknownType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getTypeUnknownTypeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleUnknownType_in_rule__UnknownField__TypeAssignment_013112);
            ruleUnknownType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getTypeUnknownTypeParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__TypeAssignment_0"


    // $ANTLR start "rule__UnknownField__ValueAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5921:1: rule__UnknownField__ValueAssignment_2 : ( ruleUnknownValue ) ;
    public final void rule__UnknownField__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5925:1: ( ( ruleUnknownValue ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5926:1: ( ruleUnknownValue )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5926:1: ( ruleUnknownValue )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5927:1: ruleUnknownValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownFieldAccess().getValueUnknownValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnknownValue_in_rule__UnknownField__ValueAssignment_213143);
            ruleUnknownValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownFieldAccess().getValueUnknownValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownField__ValueAssignment_2"


    // $ANTLR start "rule__UnknownType__TypeAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5936:1: rule__UnknownType__TypeAssignment : ( RULE_ID ) ;
    public final void rule__UnknownType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5940:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5941:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5941:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5942:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownTypeAccess().getTypeIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UnknownType__TypeAssignment13174); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownTypeAccess().getTypeIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownType__TypeAssignment"


    // $ANTLR start "rule__UnknownValue__ValueAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5951:1: rule__UnknownValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__UnknownValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5955:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5956:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5956:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5957:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUnknownValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__UnknownValue__ValueAssignment13205); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUnknownValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnknownValue__ValueAssignment"


    // $ANTLR start "rule__CiteKey__KeyAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5966:1: rule__CiteKey__KeyAssignment : ( RULE_ID ) ;
    public final void rule__CiteKey__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5970:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5971:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5971:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5972:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CiteKey__KeyAssignment13236); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CiteKey__KeyAssignment"


    // $ANTLR start "rule__Authors__NamesAssignment_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5981:1: rule__Authors__NamesAssignment_0 : ( ruleFullname ) ;
    public final void rule__Authors__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5985:1: ( ( ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5986:1: ( ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5986:1: ( ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5987:1: ruleFullname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_013267);
            ruleFullname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__NamesAssignment_0"


    // $ANTLR start "rule__Authors__NamesAssignment_1_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5996:1: rule__Authors__NamesAssignment_1_1 : ( ruleFullname ) ;
    public final void rule__Authors__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6000:1: ( ( ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6001:1: ( ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6001:1: ( ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6002:1: ruleFullname
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_1_113298);
            ruleFullname();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authors__NamesAssignment_1_1"


    // $ANTLR start "rule__Fullname__LastnameAssignment_0_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6011:1: rule__Fullname__LastnameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Fullname__LastnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6015:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6016:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6016:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6017:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_0_013329); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__LastnameAssignment_0_0"


    // $ANTLR start "rule__Fullname__FirstnameAssignment_0_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6026:1: rule__Fullname__FirstnameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6030:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6031:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6031:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6032:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_0_213360); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__FirstnameAssignment_0_2"


    // $ANTLR start "rule__Fullname__FirstnameAssignment_1_0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6041:1: rule__Fullname__FirstnameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6045:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6046:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6046:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6047:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_1_013391); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__FirstnameAssignment_1_0"


    // $ANTLR start "rule__Fullname__LastnameAssignment_1_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6056:1: rule__Fullname__LastnameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Fullname__LastnameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6060:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6061:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6061:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6062:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_1_113422); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__LastnameAssignment_1_1"


    // $ANTLR start "rule__Fullname__FirstnameAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6071:1: rule__Fullname__FirstnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6075:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6076:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6076:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6077:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_213453); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fullname__FirstnameAssignment_2"


    // $ANTLR start "rule__EditorField__EditorAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6086:1: rule__EditorField__EditorAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EditorField__EditorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6090:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6091:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6091:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6092:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditorFieldAccess().getEditorSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EditorField__EditorAssignment_213484); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditorFieldAccess().getEditorSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditorField__EditorAssignment_2"


    // $ANTLR start "rule__TitleField__TitleAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6101:1: rule__TitleField__TitleAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TitleField__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6105:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6106:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6106:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6107:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TitleField__TitleAssignment_213515); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TitleField__TitleAssignment_2"


    // $ANTLR start "rule__PublisherField__PublisherAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6116:1: rule__PublisherField__PublisherAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PublisherField__PublisherAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6120:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6121:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6121:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6122:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPublisherFieldAccess().getPublisherSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PublisherField__PublisherAssignment_213546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPublisherFieldAccess().getPublisherSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublisherField__PublisherAssignment_2"


    // $ANTLR start "rule__JournalField__JournalAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6131:1: rule__JournalField__JournalAssignment_2 : ( RULE_STRING ) ;
    public final void rule__JournalField__JournalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6135:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6136:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6136:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6137:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JournalField__JournalAssignment_213577); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JournalField__JournalAssignment_2"


    // $ANTLR start "rule__YearField__YearAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6146:1: rule__YearField__YearAssignment_2 : ( RULE_STRING ) ;
    public final void rule__YearField__YearAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6150:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6151:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6151:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6152:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__YearField__YearAssignment_213608); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YearField__YearAssignment_2"


    // $ANTLR start "rule__VolumeField__VolumeAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6161:1: rule__VolumeField__VolumeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VolumeField__VolumeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6165:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6166:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6166:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6167:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VolumeField__VolumeAssignment_213639); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VolumeField__VolumeAssignment_2"


    // $ANTLR start "rule__NumberField__NumberAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6176:1: rule__NumberField__NumberAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NumberField__NumberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6180:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6181:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6181:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6182:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberField__NumberAssignment_213670); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberField__NumberAssignment_2"


    // $ANTLR start "rule__PagesField__PagesAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6191:1: rule__PagesField__PagesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__PagesField__PagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6195:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6196:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6196:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6197:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PagesField__PagesAssignment_213701); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PagesField__PagesAssignment_2"


    // $ANTLR start "rule__MonthField__MonthAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6206:1: rule__MonthField__MonthAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MonthField__MonthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6210:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6211:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6211:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6212:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MonthField__MonthAssignment_213732); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonthField__MonthAssignment_2"


    // $ANTLR start "rule__AddressField__AddressAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6221:1: rule__AddressField__AddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__AddressField__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6225:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6226:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6226:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6227:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAddressFieldAccess().getAddressSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AddressField__AddressAssignment_213763); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAddressFieldAccess().getAddressSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressField__AddressAssignment_2"


    // $ANTLR start "rule__SeriesField__SeriesAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6236:1: rule__SeriesField__SeriesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SeriesField__SeriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6240:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6241:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6241:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6242:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSeriesFieldAccess().getSeriesSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SeriesField__SeriesAssignment_213794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSeriesFieldAccess().getSeriesSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SeriesField__SeriesAssignment_2"


    // $ANTLR start "rule__EditionField__EditionAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6251:1: rule__EditionField__EditionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__EditionField__EditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6255:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6256:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6256:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6257:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEditionFieldAccess().getEditionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EditionField__EditionAssignment_213825); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEditionFieldAccess().getEditionSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EditionField__EditionAssignment_2"


    // $ANTLR start "rule__IsbnField__IsbnAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6266:1: rule__IsbnField__IsbnAssignment_2 : ( RULE_STRING ) ;
    public final void rule__IsbnField__IsbnAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6270:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6271:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6271:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6272:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIsbnFieldAccess().getIsbnSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__IsbnField__IsbnAssignment_213856); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIsbnFieldAccess().getIsbnSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IsbnField__IsbnAssignment_2"


    // $ANTLR start "rule__NoteField__NoteAssignment_2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6281:1: rule__NoteField__NoteAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NoteField__NoteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6285:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6286:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6286:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:6287:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NoteField__NoteAssignment_213887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoteField__NoteAssignment_2"

    // $ANTLR start synpred1_InternalBibTeXParser
    public final void synpred1_InternalBibTeXParser_fragment() throws RecognitionException {   
        // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4904:8: ( rule__Article__Group_4_9__0 )
        // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:4904:9: rule__Article__Group_4_9__0
        {
        pushFollow(FOLLOW_rule__Article__Group_4_9__0_in_synpred1_InternalBibTeXParser10316);
        rule__Article__Group_4_9__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalBibTeXParser

    // $ANTLR start synpred2_InternalBibTeXParser
    public final void synpred2_InternalBibTeXParser_fragment() throws RecognitionException {   
        // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5332:8: ( rule__Book__Group_4_11__0 )
        // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeXParser.g:5332:9: rule__Book__Group_4_11__0
        {
        pushFollow(FOLLOW_rule__Book__Group_4_11__0_in_synpred2_InternalBibTeXParser11897);
        rule__Book__Group_4_11__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalBibTeXParser

    // Delegated rules

    public final boolean synpred2_InternalBibTeXParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalBibTeXParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalBibTeXParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalBibTeXParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA9_eotS =
        "\14\uffff";
    static final String DFA9_eofS =
        "\14\uffff";
    static final String DFA9_minS =
        "\1\27\1\10\12\uffff";
    static final String DFA9_maxS =
        "\1\27\1\34\12\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\3\1\12\1\7\1\4\1\1\1\10\1\5\1\2\1\11\1\6";
    static final String DFA9_specialS =
        "\1\1\1\0\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2\1\6\1\uffff\1\13\1\uffff\1\10\1\7\1\4\1\11\2\uffff\1"+
            "\12\1\5\7\uffff\1\3",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "4706:3: ( ({...}? => ( ( ( rule__Article__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Article__Group_4_9__0 ) ) ( ( ( rule__Article__Group_4_9__0 )=> rule__Article__Group_4_9__0 )* ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA9_1 ==Journal && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) ) {s = 2;}

                        else if ( LA9_1 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) ) {s = 3;}

                        else if ( LA9_1 ==Pages && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) ) {s = 4;}

                        else if ( LA9_1 ==Year && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) ) {s = 5;}

                        else if ( LA9_1 ==Author && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) {s = 6;}

                        else if ( LA9_1 ==Month && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) ) {s = 7;}

                        else if ( LA9_1 ==Volume && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) ) {s = 8;}

                        else if ( LA9_1 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) ) {s = 9;}

                        else if ( LA9_1 ==Note && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) ) {s = 10;}

                        else if ( LA9_1 ==Number && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) ) {s = 11;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA9_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup_4(), 0) ) ) {s = 1;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\16\uffff";
    static final String DFA20_minS =
        "\1\27\1\4\14\uffff";
    static final String DFA20_maxS =
        "\1\27\1\34\14\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\13\1\10\1\5\1\2\1\14\1\11\1\6\1\3\1\12\1\7\1\4\1\1";
    static final String DFA20_specialS =
        "\1\1\1\0\14\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1",
            "\1\11\1\13\1\uffff\1\3\1\uffff\2\15\1\4\1\10\1\4\1\7\1\uffff"+
            "\1\5\1\uffff\1\12\1\2\1\14\7\uffff\1\6",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "5094:3: ( ({...}? => ( ( ( rule__Book__Group_4_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_8__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_9__0 ) ) ) ) | ({...}? => ( ( ( rule__Book__Group_4_10__0 ) ) ) ) | ({...}? => ( ( ( ( rule__Book__Group_4_11__0 ) ) ( ( ( rule__Book__Group_4_11__0 )=> rule__Book__Group_4_11__0 )* ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_1 = input.LA(1);

                         
                        int index20_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_1 ==Note && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) {s = 2;}

                        else if ( LA20_1 ==Edition && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) ) {s = 3;}

                        else if ( (LA20_1==Number||LA20_1==Volume) && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) ) {s = 4;}

                        else if ( LA20_1 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) ) {s = 5;}

                        else if ( LA20_1 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) ) {s = 6;}

                        else if ( LA20_1 ==Month && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) ) {s = 7;}

                        else if ( LA20_1 ==Series && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) ) {s = 8;}

                        else if ( LA20_1 ==Publisher && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) ) {s = 9;}

                        else if ( LA20_1 ==Isbn && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) ) {s = 10;}

                        else if ( LA20_1 ==Address && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) ) {s = 11;}

                        else if ( LA20_1 ==Year && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) ) {s = 12;}

                        else if ( LA20_1 >=Author && LA20_1<=Editor && getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) ) {s = 13;}

                         
                        input.seek(index20_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_0 = input.LA(1);

                         
                        int index20_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA20_0 ==Comma && ( getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 9) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 11) || getUnorderedGroupHelper().canSelect(grammarAccess.getBookAccess().getUnorderedGroup_4(), 10) ) ) {s = 1;}

                         
                        input.seek(index20_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel54 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BibtexEntriesAssignment_in_ruleModel91 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBibtexEntryTypes126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BibtexEntryTypes__Alternatives_in_ruleBibtexEntryTypes156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_entryRuleArticle183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticle190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__0_in_ruleArticle220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_entryRuleBook247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBook254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__0_in_ruleBook284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownField_in_entryRuleUnknownField311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownField318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__0_in_ruleUnknownField348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownType_in_entryRuleUnknownType375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownType382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownType__TypeAssignment_in_ruleUnknownType412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownValue_in_entryRuleUnknownValue439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknownValue446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownValue__ValueAssignment_in_ruleUnknownValue476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_entryRuleCiteKey503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCiteKey510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CiteKey__KeyAssignment_in_ruleCiteKey540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_entryRuleAuthorField567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthorField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__0_in_ruleAuthorField604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_entryRuleAuthors631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthors638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__0_in_ruleAuthors668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_entryRuleFullname695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullname702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Alternatives_in_ruleFullname732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditorField_in_entryRuleEditorField759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditorField766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditorField__Group__0_in_ruleEditorField796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_entryRuleTitleField823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitleField830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__0_in_ruleTitleField860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublisherField_in_entryRulePublisherField887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePublisherField894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__0_in_rulePublisherField924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_entryRuleJournalField951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJournalField958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__0_in_ruleJournalField988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_entryRuleYearField1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYearField1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__0_in_ruleYearField1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_entryRuleVolumeField1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolumeField1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__0_in_ruleVolumeField1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__0_in_ruleNumberField1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_entryRulePagesField1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePagesField1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__0_in_rulePagesField1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_entryRuleMonthField1271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonthField1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__0_in_ruleMonthField1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressField_in_entryRuleAddressField1335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressField1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressField__Group__0_in_ruleAddressField1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeriesField_in_entryRuleSeriesField1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSeriesField1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__0_in_ruleSeriesField1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionField_in_entryRuleEditionField1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEditionField1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionField__Group__0_in_ruleEditionField1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsbnField_in_entryRuleIsbnField1527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIsbnField1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__0_in_ruleIsbnField1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_entryRuleNoteField1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteField1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__0_in_ruleNoteField1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_rule__BibtexEntryTypes__Alternatives1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBook_in_rule__BibtexEntryTypes__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_rule__Book__Author_editorAlternatives_4_0_1_01713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditorField_in_rule__Book__Author_editorAlternatives_4_0_1_01730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_rule__Book__Volume_numberAlternatives_4_4_1_01762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__Book__Volume_numberAlternatives_4_4_1_01779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__0_in_rule__AuthorField__Alternatives_21811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__0_in_rule__AuthorField__Alternatives_21829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__0_in_rule__Fullname__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__0_in_rule__Fullname__Alternatives1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_2_in_rule__Fullname__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__0__Impl_in_rule__Article__Group__01929 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Article__Group__1_in_rule__Article__Group__01932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CommercialAt_in_rule__Article__Group__0__Impl1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__1__Impl_in_rule__Article__Group__11991 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Article__Group__2_in_rule__Article__Group__11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Article_in_rule__Article__Group__1__Impl2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__2__Impl_in_rule__Article__Group__22053 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Article__Group__3_in_rule__Article__Group__22056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Article__Group__2__Impl2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__3__Impl_in_rule__Article__Group__32115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Article__Group__4_in_rule__Article__Group__32118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__KeyAssignment_3_in_rule__Article__Group__3__Impl2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__4__Impl_in_rule__Article__Group__42175 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Article__Group__5_in_rule__Article__Group__42178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4_in_rule__Article__Group__4__Impl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group__5__Impl_in_rule__Article__Group__52235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Article__Group__5__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_0__0__Impl_in_rule__Article__Group_4_0__02306 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Article__Group_4_0__1_in_rule__Article__Group_4_0__02309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_0__0__Impl2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_0__1__Impl_in_rule__Article__Group_4_0__12368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__AuthorAssignment_4_0_1_in_rule__Article__Group_4_0__1__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_1__0__Impl_in_rule__Article__Group_4_1__02429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_1__1_in_rule__Article__Group_4_1__02432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_1__0__Impl2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_1__1__Impl_in_rule__Article__Group_4_1__12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__TitleAssignment_4_1_1_in_rule__Article__Group_4_1__1__Impl2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_2__0__Impl_in_rule__Article__Group_4_2__02552 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Article__Group_4_2__1_in_rule__Article__Group_4_2__02555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_2__0__Impl2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_2__1__Impl_in_rule__Article__Group_4_2__12614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__JournalAssignment_4_2_1_in_rule__Article__Group_4_2__1__Impl2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_3__0__Impl_in_rule__Article__Group_4_3__02675 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_3__1_in_rule__Article__Group_4_3__02678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_3__0__Impl2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_3__1__Impl_in_rule__Article__Group_4_3__12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__YearAssignment_4_3_1_in_rule__Article__Group_4_3__1__Impl2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_4__0__Impl_in_rule__Article__Group_4_4__02798 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_4__1_in_rule__Article__Group_4_4__02801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_4__0__Impl2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_4__1__Impl_in_rule__Article__Group_4_4__12860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__VolumeAssignment_4_4_1_in_rule__Article__Group_4_4__1__Impl2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_5__0__Impl_in_rule__Article__Group_4_5__02921 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Article__Group_4_5__1_in_rule__Article__Group_4_5__02924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_5__0__Impl2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_5__1__Impl_in_rule__Article__Group_4_5__12983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__NumberAssignment_4_5_1_in_rule__Article__Group_4_5__1__Impl3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_6__0__Impl_in_rule__Article__Group_4_6__03044 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_6__1_in_rule__Article__Group_4_6__03047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_6__0__Impl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_6__1__Impl_in_rule__Article__Group_4_6__13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__PagesAssignment_4_6_1_in_rule__Article__Group_4_6__1__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_7__0__Impl_in_rule__Article__Group_4_7__03167 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_7__1_in_rule__Article__Group_4_7__03170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_7__0__Impl3198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_7__1__Impl_in_rule__Article__Group_4_7__13229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__MonthAssignment_4_7_1_in_rule__Article__Group_4_7__1__Impl3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_8__0__Impl_in_rule__Article__Group_4_8__03290 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_8__1_in_rule__Article__Group_4_8__03293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_8__0__Impl3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_8__1__Impl_in_rule__Article__Group_4_8__13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__NoteAssignment_4_8_1_in_rule__Article__Group_4_8__1__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__0__Impl_in_rule__Article__Group_4_9__03413 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__1_in_rule__Article__Group_4_9__03416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Article__Group_4_9__0__Impl3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__1__Impl_in_rule__Article__Group_4_9__13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnknownsAssignment_4_9_1_in_rule__Article__Group_4_9__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__0__Impl_in_rule__Book__Group__03536 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Book__Group__1_in_rule__Book__Group__03539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CommercialAt_in_rule__Book__Group__0__Impl3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__1__Impl_in_rule__Book__Group__13598 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Book__Group__2_in_rule__Book__Group__13601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Book_in_rule__Book__Group__1__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__2__Impl_in_rule__Book__Group__23660 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Book__Group__3_in_rule__Book__Group__23663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__Book__Group__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__3__Impl_in_rule__Book__Group__33722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Book__Group__4_in_rule__Book__Group__33725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__KeyAssignment_3_in_rule__Book__Group__3__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__4__Impl_in_rule__Book__Group__43782 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Book__Group__5_in_rule__Book__Group__43785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4_in_rule__Book__Group__4__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group__5__Impl_in_rule__Book__Group__53842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__Book__Group__5__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_0__0__Impl_in_rule__Book__Group_4_0__03913 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Book__Group_4_0__1_in_rule__Book__Group_4_0__03916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_0__0__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_0__1__Impl_in_rule__Book__Group_4_0__13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Author_editorAssignment_4_0_1_in_rule__Book__Group_4_0__1__Impl4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_1__0__Impl_in_rule__Book__Group_4_1__04036 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_1__1_in_rule__Book__Group_4_1__04039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_1__0__Impl4067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_1__1__Impl_in_rule__Book__Group_4_1__14098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__TitleAssignment_4_1_1_in_rule__Book__Group_4_1__1__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_2__0__Impl_in_rule__Book__Group_4_2__04159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Book__Group_4_2__1_in_rule__Book__Group_4_2__04162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_2__0__Impl4190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_2__1__Impl_in_rule__Book__Group_4_2__14221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__PublisherAssignment_4_2_1_in_rule__Book__Group_4_2__1__Impl4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_3__0__Impl_in_rule__Book__Group_4_3__04282 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_3__1_in_rule__Book__Group_4_3__04285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_3__0__Impl4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_3__1__Impl_in_rule__Book__Group_4_3__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__YearAssignment_4_3_1_in_rule__Book__Group_4_3__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_4__0__Impl_in_rule__Book__Group_4_4__04405 = new BitSet(new long[]{0x0000000000002800L});
    public static final BitSet FOLLOW_rule__Book__Group_4_4__1_in_rule__Book__Group_4_4__04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_4__0__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_4__1__Impl_in_rule__Book__Group_4_4__14467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Volume_numberAssignment_4_4_1_in_rule__Book__Group_4_4__1__Impl4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_5__0__Impl_in_rule__Book__Group_4_5__04528 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_5__1_in_rule__Book__Group_4_5__04531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_5__0__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_5__1__Impl_in_rule__Book__Group_4_5__14590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__SeriesAssignment_4_5_1_in_rule__Book__Group_4_5__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_6__0__Impl_in_rule__Book__Group_4_6__04651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Book__Group_4_6__1_in_rule__Book__Group_4_6__04654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_6__0__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_6__1__Impl_in_rule__Book__Group_4_6__14713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__AddressAssignment_4_6_1_in_rule__Book__Group_4_6__1__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_7__0__Impl_in_rule__Book__Group_4_7__04774 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Book__Group_4_7__1_in_rule__Book__Group_4_7__04777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_7__0__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_7__1__Impl_in_rule__Book__Group_4_7__14836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__EditionAssignment_4_7_1_in_rule__Book__Group_4_7__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_8__0__Impl_in_rule__Book__Group_4_8__04897 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_8__1_in_rule__Book__Group_4_8__04900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_8__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_8__1__Impl_in_rule__Book__Group_4_8__14959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__MonthAssignment_4_8_1_in_rule__Book__Group_4_8__1__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_9__0__Impl_in_rule__Book__Group_4_9__05020 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_9__1_in_rule__Book__Group_4_9__05023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_9__0__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_9__1__Impl_in_rule__Book__Group_4_9__15082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__IsbnAssignment_4_9_1_in_rule__Book__Group_4_9__1__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_10__0__Impl_in_rule__Book__Group_4_10__05143 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_10__1_in_rule__Book__Group_4_10__05146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_10__0__Impl5174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_10__1__Impl_in_rule__Book__Group_4_10__15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__NoteAssignment_4_10_1_in_rule__Book__Group_4_10__1__Impl5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__0__Impl_in_rule__Book__Group_4_11__05266 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__1_in_rule__Book__Group_4_11__05269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Book__Group_4_11__0__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__1__Impl_in_rule__Book__Group_4_11__15328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnknownsAssignment_4_11_1_in_rule__Book__Group_4_11__1__Impl5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__0__Impl_in_rule__UnknownField__Group__05389 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__1_in_rule__UnknownField__Group__05392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__TypeAssignment_0_in_rule__UnknownField__Group__0__Impl5419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__1__Impl_in_rule__UnknownField__Group__15449 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__2_in_rule__UnknownField__Group__15452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__UnknownField__Group__1__Impl5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__Group__2__Impl_in_rule__UnknownField__Group__25511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnknownField__ValueAssignment_2_in_rule__UnknownField__Group__2__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__0__Impl_in_rule__AuthorField__Group__05574 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__1_in_rule__AuthorField__Group__05577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Author_in_rule__AuthorField__Group__0__Impl5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__1__Impl_in_rule__AuthorField__Group__15636 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__2_in_rule__AuthorField__Group__15639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__AuthorField__Group__1__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__2__Impl_in_rule__AuthorField__Group__25698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Alternatives_2_in_rule__AuthorField__Group__2__Impl5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__0__Impl_in_rule__AuthorField__Group_2_0__05761 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__1_in_rule__AuthorField__Group_2_0__05764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotationMark_in_rule__AuthorField__Group_2_0__0__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__1__Impl_in_rule__AuthorField__Group_2_0__15823 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__2_in_rule__AuthorField__Group_2_0__15826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_rule__AuthorField__Group_2_0__1__Impl5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_0__2__Impl_in_rule__AuthorField__Group_2_0__25882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotationMark_in_rule__AuthorField__Group_2_0__2__Impl5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__0__Impl_in_rule__AuthorField__Group_2_1__05947 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__1_in_rule__AuthorField__Group_2_1__05950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftCurlyBracket_in_rule__AuthorField__Group_2_1__0__Impl5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__1__Impl_in_rule__AuthorField__Group_2_1__16009 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__2_in_rule__AuthorField__Group_2_1__16012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_rule__AuthorField__Group_2_1__1__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_2_1__2__Impl_in_rule__AuthorField__Group_2_1__26068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RightCurlyBracket_in_rule__AuthorField__Group_2_1__2__Impl6096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__0__Impl_in_rule__Authors__Group__06133 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Authors__Group__1_in_rule__Authors__Group__06136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__NamesAssignment_0_in_rule__Authors__Group__0__Impl6163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__1__Impl_in_rule__Authors__Group__16193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__0_in_rule__Authors__Group__1__Impl6220 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__0__Impl_in_rule__Authors__Group_1__06255 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__1_in_rule__Authors__Group_1__06258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_rule__Authors__Group_1__0__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__1__Impl_in_rule__Authors__Group_1__16317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__NamesAssignment_1_1_in_rule__Authors__Group_1__1__Impl6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__0__Impl_in_rule__Fullname__Group_0__06378 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__1_in_rule__Fullname__Group_0__06381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__LastnameAssignment_0_0_in_rule__Fullname__Group_0__0__Impl6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__1__Impl_in_rule__Fullname__Group_0__16438 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__2_in_rule__Fullname__Group_0__16441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_rule__Fullname__Group_0__1__Impl6469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__2__Impl_in_rule__Fullname__Group_0__26500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_0_2_in_rule__Fullname__Group_0__2__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__0__Impl_in_rule__Fullname__Group_1__06563 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__1_in_rule__Fullname__Group_1__06566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_1_0_in_rule__Fullname__Group_1__0__Impl6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__1__Impl_in_rule__Fullname__Group_1__16623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__LastnameAssignment_1_1_in_rule__Fullname__Group_1__1__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditorField__Group__0__Impl_in_rule__EditorField__Group__06684 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EditorField__Group__1_in_rule__EditorField__Group__06687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Editor_in_rule__EditorField__Group__0__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditorField__Group__1__Impl_in_rule__EditorField__Group__16746 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EditorField__Group__2_in_rule__EditorField__Group__16749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__EditorField__Group__1__Impl6777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditorField__Group__2__Impl_in_rule__EditorField__Group__26808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditorField__EditorAssignment_2_in_rule__EditorField__Group__2__Impl6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__0__Impl_in_rule__TitleField__Group__06871 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TitleField__Group__1_in_rule__TitleField__Group__06874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_rule__TitleField__Group__0__Impl6902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__1__Impl_in_rule__TitleField__Group__16933 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TitleField__Group__2_in_rule__TitleField__Group__16936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__TitleField__Group__1__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__2__Impl_in_rule__TitleField__Group__26995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__TitleAssignment_2_in_rule__TitleField__Group__2__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__0__Impl_in_rule__PublisherField__Group__07058 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__1_in_rule__PublisherField__Group__07061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Publisher_in_rule__PublisherField__Group__0__Impl7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__1__Impl_in_rule__PublisherField__Group__17120 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__2_in_rule__PublisherField__Group__17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__PublisherField__Group__1__Impl7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublisherField__Group__2__Impl_in_rule__PublisherField__Group__27182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PublisherField__PublisherAssignment_2_in_rule__PublisherField__Group__2__Impl7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__0__Impl_in_rule__JournalField__Group__07245 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__JournalField__Group__1_in_rule__JournalField__Group__07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Journal_in_rule__JournalField__Group__0__Impl7276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__1__Impl_in_rule__JournalField__Group__17307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__JournalField__Group__2_in_rule__JournalField__Group__17310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__JournalField__Group__1__Impl7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__2__Impl_in_rule__JournalField__Group__27369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__JournalAssignment_2_in_rule__JournalField__Group__2__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__0__Impl_in_rule__YearField__Group__07432 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__YearField__Group__1_in_rule__YearField__Group__07435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Year_in_rule__YearField__Group__0__Impl7463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__1__Impl_in_rule__YearField__Group__17494 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__YearField__Group__2_in_rule__YearField__Group__17497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__YearField__Group__1__Impl7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__2__Impl_in_rule__YearField__Group__27556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__YearAssignment_2_in_rule__YearField__Group__2__Impl7583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__0__Impl_in_rule__VolumeField__Group__07619 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__1_in_rule__VolumeField__Group__07622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Volume_in_rule__VolumeField__Group__0__Impl7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__1__Impl_in_rule__VolumeField__Group__17681 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__2_in_rule__VolumeField__Group__17684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__VolumeField__Group__1__Impl7712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__2__Impl_in_rule__VolumeField__Group__27743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__VolumeAssignment_2_in_rule__VolumeField__Group__2__Impl7770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__0__Impl_in_rule__NumberField__Group__07806 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NumberField__Group__1_in_rule__NumberField__Group__07809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_rule__NumberField__Group__0__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__1__Impl_in_rule__NumberField__Group__17868 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__NumberField__Group__2_in_rule__NumberField__Group__17871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__NumberField__Group__1__Impl7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__2__Impl_in_rule__NumberField__Group__27930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__NumberAssignment_2_in_rule__NumberField__Group__2__Impl7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__0__Impl_in_rule__PagesField__Group__07993 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PagesField__Group__1_in_rule__PagesField__Group__07996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pages_in_rule__PagesField__Group__0__Impl8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__1__Impl_in_rule__PagesField__Group__18055 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PagesField__Group__2_in_rule__PagesField__Group__18058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__PagesField__Group__1__Impl8086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__2__Impl_in_rule__PagesField__Group__28117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__PagesAssignment_2_in_rule__PagesField__Group__2__Impl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__0__Impl_in_rule__MonthField__Group__08180 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MonthField__Group__1_in_rule__MonthField__Group__08183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Month_in_rule__MonthField__Group__0__Impl8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__1__Impl_in_rule__MonthField__Group__18242 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MonthField__Group__2_in_rule__MonthField__Group__18245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__MonthField__Group__1__Impl8273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__2__Impl_in_rule__MonthField__Group__28304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__MonthAssignment_2_in_rule__MonthField__Group__2__Impl8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressField__Group__0__Impl_in_rule__AddressField__Group__08367 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AddressField__Group__1_in_rule__AddressField__Group__08370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Address_in_rule__AddressField__Group__0__Impl8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressField__Group__1__Impl_in_rule__AddressField__Group__18429 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AddressField__Group__2_in_rule__AddressField__Group__18432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__AddressField__Group__1__Impl8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressField__Group__2__Impl_in_rule__AddressField__Group__28491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressField__AddressAssignment_2_in_rule__AddressField__Group__2__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__0__Impl_in_rule__SeriesField__Group__08554 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__1_in_rule__SeriesField__Group__08557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Series_in_rule__SeriesField__Group__0__Impl8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__1__Impl_in_rule__SeriesField__Group__18616 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__2_in_rule__SeriesField__Group__18619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__SeriesField__Group__1__Impl8647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeriesField__Group__2__Impl_in_rule__SeriesField__Group__28678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SeriesField__SeriesAssignment_2_in_rule__SeriesField__Group__2__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionField__Group__0__Impl_in_rule__EditionField__Group__08741 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__EditionField__Group__1_in_rule__EditionField__Group__08744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Edition_in_rule__EditionField__Group__0__Impl8772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionField__Group__1__Impl_in_rule__EditionField__Group__18803 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__EditionField__Group__2_in_rule__EditionField__Group__18806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__EditionField__Group__1__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionField__Group__2__Impl_in_rule__EditionField__Group__28865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EditionField__EditionAssignment_2_in_rule__EditionField__Group__2__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__0__Impl_in_rule__IsbnField__Group__08928 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__1_in_rule__IsbnField__Group__08931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Isbn_in_rule__IsbnField__Group__0__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__1__Impl_in_rule__IsbnField__Group__18990 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__2_in_rule__IsbnField__Group__18993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__IsbnField__Group__1__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsbnField__Group__2__Impl_in_rule__IsbnField__Group__29052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IsbnField__IsbnAssignment_2_in_rule__IsbnField__Group__2__Impl9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__0__Impl_in_rule__NoteField__Group__09115 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NoteField__Group__1_in_rule__NoteField__Group__09118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Note_in_rule__NoteField__Group__0__Impl9146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__1__Impl_in_rule__NoteField__Group__19177 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__NoteField__Group__2_in_rule__NoteField__Group__19180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSign_in_rule__NoteField__Group__1__Impl9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__2__Impl_in_rule__NoteField__Group__29239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__NoteAssignment_2_in_rule__NoteField__Group__2__Impl9266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__0_in_rule__Article__UnorderedGroup_49303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_0__0_in_rule__Article__UnorderedGroup_4__Impl9392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_1__0_in_rule__Article__UnorderedGroup_4__Impl9490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_2__0_in_rule__Article__UnorderedGroup_4__Impl9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_3__0_in_rule__Article__UnorderedGroup_4__Impl9686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_4__0_in_rule__Article__UnorderedGroup_4__Impl9784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_5__0_in_rule__Article__UnorderedGroup_4__Impl9882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_6__0_in_rule__Article__UnorderedGroup_4__Impl9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_7__0_in_rule__Article__UnorderedGroup_4__Impl10078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_8__0_in_rule__Article__UnorderedGroup_4__Impl10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__0_in_rule__Article__UnorderedGroup_4__Impl10275 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__0_in_rule__Article__UnorderedGroup_4__Impl10319 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__010392 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__1_in_rule__Article__UnorderedGroup_4__010395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__110420 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__2_in_rule__Article__UnorderedGroup_4__110423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__210448 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__3_in_rule__Article__UnorderedGroup_4__210451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__310476 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__4_in_rule__Article__UnorderedGroup_4__310479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__410504 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__5_in_rule__Article__UnorderedGroup_4__410507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__510532 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__6_in_rule__Article__UnorderedGroup_4__510535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__610560 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__7_in_rule__Article__UnorderedGroup_4__610563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__710588 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__8_in_rule__Article__UnorderedGroup_4__710591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__810616 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__9_in_rule__Article__UnorderedGroup_4__810619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_4__Impl_in_rule__Article__UnorderedGroup_4__910644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__0_in_rule__Book__UnorderedGroup_410688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_0__0_in_rule__Book__UnorderedGroup_4__Impl10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_1__0_in_rule__Book__UnorderedGroup_4__Impl10875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_2__0_in_rule__Book__UnorderedGroup_4__Impl10973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_3__0_in_rule__Book__UnorderedGroup_4__Impl11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_4__0_in_rule__Book__UnorderedGroup_4__Impl11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_5__0_in_rule__Book__UnorderedGroup_4__Impl11267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_6__0_in_rule__Book__UnorderedGroup_4__Impl11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_7__0_in_rule__Book__UnorderedGroup_4__Impl11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_8__0_in_rule__Book__UnorderedGroup_4__Impl11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_9__0_in_rule__Book__UnorderedGroup_4__Impl11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_10__0_in_rule__Book__UnorderedGroup_4__Impl11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__0_in_rule__Book__UnorderedGroup_4__Impl11856 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__0_in_rule__Book__UnorderedGroup_4__Impl11900 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__011973 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__1_in_rule__Book__UnorderedGroup_4__011976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__112001 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__2_in_rule__Book__UnorderedGroup_4__112004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__212029 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__3_in_rule__Book__UnorderedGroup_4__212032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__312057 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__4_in_rule__Book__UnorderedGroup_4__312060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__412085 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__5_in_rule__Book__UnorderedGroup_4__412088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__512113 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__6_in_rule__Book__UnorderedGroup_4__512116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__612141 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__7_in_rule__Book__UnorderedGroup_4__612144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__712169 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__8_in_rule__Book__UnorderedGroup_4__712172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__812197 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__9_in_rule__Book__UnorderedGroup_4__812200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__912225 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__10_in_rule__Book__UnorderedGroup_4__912228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__1012253 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__11_in_rule__Book__UnorderedGroup_4__1012256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__UnorderedGroup_4__Impl_in_rule__Book__UnorderedGroup_4__1112281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_rule__Model__BibtexEntriesAssignment12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_rule__Article__KeyAssignment_312364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_rule__Article__AuthorAssignment_4_0_112395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_rule__Article__TitleAssignment_4_1_112426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_rule__Article__JournalAssignment_4_2_112457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_rule__Article__YearAssignment_4_3_112488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_rule__Article__VolumeAssignment_4_4_112519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__Article__NumberAssignment_4_5_112550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_rule__Article__PagesAssignment_4_6_112581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_rule__Article__MonthAssignment_4_7_112612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_rule__Article__NoteAssignment_4_8_112643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownField_in_rule__Article__UnknownsAssignment_4_9_112674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_rule__Book__KeyAssignment_312705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Author_editorAlternatives_4_0_1_0_in_rule__Book__Author_editorAssignment_4_0_112736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_rule__Book__TitleAssignment_4_1_112769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePublisherField_in_rule__Book__PublisherAssignment_4_2_112800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_rule__Book__YearAssignment_4_3_112831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Volume_numberAlternatives_4_4_1_0_in_rule__Book__Volume_numberAssignment_4_4_112862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSeriesField_in_rule__Book__SeriesAssignment_4_5_112895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressField_in_rule__Book__AddressAssignment_4_6_112926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEditionField_in_rule__Book__EditionAssignment_4_7_112957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_rule__Book__MonthAssignment_4_8_112988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIsbnField_in_rule__Book__IsbnAssignment_4_9_113019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_rule__Book__NoteAssignment_4_10_113050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownField_in_rule__Book__UnknownsAssignment_4_11_113081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownType_in_rule__UnknownField__TypeAssignment_013112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknownValue_in_rule__UnknownField__ValueAssignment_213143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UnknownType__TypeAssignment13174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__UnknownValue__ValueAssignment13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CiteKey__KeyAssignment13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_013267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_1_113298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_0_013329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_0_213360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_1_013391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_1_113422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_213453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EditorField__EditorAssignment_213484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TitleField__TitleAssignment_213515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PublisherField__PublisherAssignment_213546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JournalField__JournalAssignment_213577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__YearField__YearAssignment_213608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VolumeField__VolumeAssignment_213639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberField__NumberAssignment_213670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PagesField__PagesAssignment_213701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MonthField__MonthAssignment_213732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AddressField__AddressAssignment_213763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SeriesField__SeriesAssignment_213794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EditionField__EditionAssignment_213825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__IsbnField__IsbnAssignment_213856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NoteField__NoteAssignment_213887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4_9__0_in_synpred1_InternalBibTeXParser10316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Book__Group_4_11__0_in_synpred2_InternalBibTeXParser11897 = new BitSet(new long[]{0x0000000000000002L});

}
