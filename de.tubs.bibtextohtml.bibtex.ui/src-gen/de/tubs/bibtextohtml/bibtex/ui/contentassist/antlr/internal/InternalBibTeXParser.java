package de.tubs.bibtextohtml.bibtex.ui.contentassist.antlr.internal; 

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

@SuppressWarnings("all")
public class InternalBibTeXParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ARTICLE'", "'Article'", "'article'", "'@'", "'{'", "','", "'}'", "'author = '", "'\"'", "'and'", "'title = '", "'journal = '", "'year = '", "'volume = '", "'number = '", "'pages = '", "'month = '", "'note = '"
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
    public String getGrammarFileName() { return "../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g"; }


     
     	private BibTeXGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(BibTeXGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:61:1: ( ruleModel EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:69:1: ruleModel : ( ( rule__Model__BibtexEntriesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:73:2: ( ( ( rule__Model__BibtexEntriesAssignment )* ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:74:1: ( ( rule__Model__BibtexEntriesAssignment )* )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:74:1: ( ( rule__Model__BibtexEntriesAssignment )* )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:75:1: ( rule__Model__BibtexEntriesAssignment )*
            {
             before(grammarAccess.getModelAccess().getBibtexEntriesAssignment()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:76:1: ( rule__Model__BibtexEntriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:76:2: rule__Model__BibtexEntriesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__BibtexEntriesAssignment_in_ruleModel94);
            	    rule__Model__BibtexEntriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBibtexEntriesAssignment()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:88:1: entryRuleBibtexEntryTypes : ruleBibtexEntryTypes EOF ;
    public final void entryRuleBibtexEntryTypes() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:89:1: ( ruleBibtexEntryTypes EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:90:1: ruleBibtexEntryTypes EOF
            {
             before(grammarAccess.getBibtexEntryTypesRule()); 
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes122);
            ruleBibtexEntryTypes();

            state._fsp--;

             after(grammarAccess.getBibtexEntryTypesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBibtexEntryTypes129); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:97:1: ruleBibtexEntryTypes : ( ruleArticle ) ;
    public final void ruleBibtexEntryTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:101:2: ( ( ruleArticle ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:102:1: ( ruleArticle )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:102:1: ( ruleArticle )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:103:1: ruleArticle
            {
             before(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall()); 
            pushFollow(FOLLOW_ruleArticle_in_ruleBibtexEntryTypes155);
            ruleArticle();

            state._fsp--;

             after(grammarAccess.getBibtexEntryTypesAccess().getArticleParserRuleCall()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:116:1: entryRuleArticle : ruleArticle EOF ;
    public final void entryRuleArticle() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:117:1: ( ruleArticle EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:118:1: ruleArticle EOF
            {
             before(grammarAccess.getArticleRule()); 
            pushFollow(FOLLOW_ruleArticle_in_entryRuleArticle181);
            ruleArticle();

            state._fsp--;

             after(grammarAccess.getArticleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArticle188); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:125:1: ruleArticle : ( ( rule__Article__UnorderedGroup ) ) ;
    public final void ruleArticle() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:129:2: ( ( ( rule__Article__UnorderedGroup ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:130:1: ( ( rule__Article__UnorderedGroup ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:130:1: ( ( rule__Article__UnorderedGroup ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:131:1: ( rule__Article__UnorderedGroup )
            {
             before(grammarAccess.getArticleAccess().getUnorderedGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:132:1: ( rule__Article__UnorderedGroup )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:132:2: rule__Article__UnorderedGroup
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup_in_ruleArticle214);
            rule__Article__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getUnorderedGroup()); 

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


    // $ANTLR start "entryRuleCiteKey"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:144:1: entryRuleCiteKey : ruleCiteKey EOF ;
    public final void entryRuleCiteKey() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:145:1: ( ruleCiteKey EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:146:1: ruleCiteKey EOF
            {
             before(grammarAccess.getCiteKeyRule()); 
            pushFollow(FOLLOW_ruleCiteKey_in_entryRuleCiteKey241);
            ruleCiteKey();

            state._fsp--;

             after(grammarAccess.getCiteKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCiteKey248); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:153:1: ruleCiteKey : ( ( rule__CiteKey__KeyAssignment ) ) ;
    public final void ruleCiteKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:157:2: ( ( ( rule__CiteKey__KeyAssignment ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:158:1: ( ( rule__CiteKey__KeyAssignment ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:158:1: ( ( rule__CiteKey__KeyAssignment ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:159:1: ( rule__CiteKey__KeyAssignment )
            {
             before(grammarAccess.getCiteKeyAccess().getKeyAssignment()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:160:1: ( rule__CiteKey__KeyAssignment )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:160:2: rule__CiteKey__KeyAssignment
            {
            pushFollow(FOLLOW_rule__CiteKey__KeyAssignment_in_ruleCiteKey274);
            rule__CiteKey__KeyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCiteKeyAccess().getKeyAssignment()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:172:1: entryRuleAuthorField : ruleAuthorField EOF ;
    public final void entryRuleAuthorField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:173:1: ( ruleAuthorField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:174:1: ruleAuthorField EOF
            {
             before(grammarAccess.getAuthorFieldRule()); 
            pushFollow(FOLLOW_ruleAuthorField_in_entryRuleAuthorField301);
            ruleAuthorField();

            state._fsp--;

             after(grammarAccess.getAuthorFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthorField308); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:181:1: ruleAuthorField : ( ( rule__AuthorField__Group__0 ) ) ;
    public final void ruleAuthorField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:185:2: ( ( ( rule__AuthorField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:186:1: ( ( rule__AuthorField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:186:1: ( ( rule__AuthorField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:187:1: ( rule__AuthorField__Group__0 )
            {
             before(grammarAccess.getAuthorFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:188:1: ( rule__AuthorField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:188:2: rule__AuthorField__Group__0
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__0_in_ruleAuthorField334);
            rule__AuthorField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:200:1: entryRuleAuthors : ruleAuthors EOF ;
    public final void entryRuleAuthors() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:201:1: ( ruleAuthors EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:202:1: ruleAuthors EOF
            {
             before(grammarAccess.getAuthorsRule()); 
            pushFollow(FOLLOW_ruleAuthors_in_entryRuleAuthors361);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getAuthorsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAuthors368); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:209:1: ruleAuthors : ( ( rule__Authors__Group__0 ) ) ;
    public final void ruleAuthors() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:213:2: ( ( ( rule__Authors__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:214:1: ( ( rule__Authors__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:214:1: ( ( rule__Authors__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:215:1: ( rule__Authors__Group__0 )
            {
             before(grammarAccess.getAuthorsAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:216:1: ( rule__Authors__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:216:2: rule__Authors__Group__0
            {
            pushFollow(FOLLOW_rule__Authors__Group__0_in_ruleAuthors394);
            rule__Authors__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:228:1: entryRuleFullname : ruleFullname EOF ;
    public final void entryRuleFullname() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:229:1: ( ruleFullname EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:230:1: ruleFullname EOF
            {
             before(grammarAccess.getFullnameRule()); 
            pushFollow(FOLLOW_ruleFullname_in_entryRuleFullname421);
            ruleFullname();

            state._fsp--;

             after(grammarAccess.getFullnameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullname428); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:237:1: ruleFullname : ( ( rule__Fullname__Alternatives ) ) ;
    public final void ruleFullname() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:241:2: ( ( ( rule__Fullname__Alternatives ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:242:1: ( ( rule__Fullname__Alternatives ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:242:1: ( ( rule__Fullname__Alternatives ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:243:1: ( rule__Fullname__Alternatives )
            {
             before(grammarAccess.getFullnameAccess().getAlternatives()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:244:1: ( rule__Fullname__Alternatives )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:244:2: rule__Fullname__Alternatives
            {
            pushFollow(FOLLOW_rule__Fullname__Alternatives_in_ruleFullname454);
            rule__Fullname__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFullnameAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleTitleField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:256:1: entryRuleTitleField : ruleTitleField EOF ;
    public final void entryRuleTitleField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:257:1: ( ruleTitleField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:258:1: ruleTitleField EOF
            {
             before(grammarAccess.getTitleFieldRule()); 
            pushFollow(FOLLOW_ruleTitleField_in_entryRuleTitleField481);
            ruleTitleField();

            state._fsp--;

             after(grammarAccess.getTitleFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitleField488); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:265:1: ruleTitleField : ( ( rule__TitleField__Group__0 ) ) ;
    public final void ruleTitleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:269:2: ( ( ( rule__TitleField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:270:1: ( ( rule__TitleField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:270:1: ( ( rule__TitleField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:271:1: ( rule__TitleField__Group__0 )
            {
             before(grammarAccess.getTitleFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:272:1: ( rule__TitleField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:272:2: rule__TitleField__Group__0
            {
            pushFollow(FOLLOW_rule__TitleField__Group__0_in_ruleTitleField514);
            rule__TitleField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleFieldAccess().getGroup()); 

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


    // $ANTLR start "entryRuleJournalField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:284:1: entryRuleJournalField : ruleJournalField EOF ;
    public final void entryRuleJournalField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:285:1: ( ruleJournalField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:286:1: ruleJournalField EOF
            {
             before(grammarAccess.getJournalFieldRule()); 
            pushFollow(FOLLOW_ruleJournalField_in_entryRuleJournalField541);
            ruleJournalField();

            state._fsp--;

             after(grammarAccess.getJournalFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJournalField548); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:293:1: ruleJournalField : ( ( rule__JournalField__Group__0 ) ) ;
    public final void ruleJournalField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:297:2: ( ( ( rule__JournalField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:298:1: ( ( rule__JournalField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:298:1: ( ( rule__JournalField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:299:1: ( rule__JournalField__Group__0 )
            {
             before(grammarAccess.getJournalFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:300:1: ( rule__JournalField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:300:2: rule__JournalField__Group__0
            {
            pushFollow(FOLLOW_rule__JournalField__Group__0_in_ruleJournalField574);
            rule__JournalField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJournalFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:312:1: entryRuleYearField : ruleYearField EOF ;
    public final void entryRuleYearField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:313:1: ( ruleYearField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:314:1: ruleYearField EOF
            {
             before(grammarAccess.getYearFieldRule()); 
            pushFollow(FOLLOW_ruleYearField_in_entryRuleYearField601);
            ruleYearField();

            state._fsp--;

             after(grammarAccess.getYearFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleYearField608); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:321:1: ruleYearField : ( ( rule__YearField__Group__0 ) ) ;
    public final void ruleYearField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:325:2: ( ( ( rule__YearField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:326:1: ( ( rule__YearField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:326:1: ( ( rule__YearField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:327:1: ( rule__YearField__Group__0 )
            {
             before(grammarAccess.getYearFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:328:1: ( rule__YearField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:328:2: rule__YearField__Group__0
            {
            pushFollow(FOLLOW_rule__YearField__Group__0_in_ruleYearField634);
            rule__YearField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getYearFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:340:1: entryRuleVolumeField : ruleVolumeField EOF ;
    public final void entryRuleVolumeField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:341:1: ( ruleVolumeField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:342:1: ruleVolumeField EOF
            {
             before(grammarAccess.getVolumeFieldRule()); 
            pushFollow(FOLLOW_ruleVolumeField_in_entryRuleVolumeField661);
            ruleVolumeField();

            state._fsp--;

             after(grammarAccess.getVolumeFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVolumeField668); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:349:1: ruleVolumeField : ( ( rule__VolumeField__Group__0 ) ) ;
    public final void ruleVolumeField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:353:2: ( ( ( rule__VolumeField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:354:1: ( ( rule__VolumeField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:354:1: ( ( rule__VolumeField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:355:1: ( rule__VolumeField__Group__0 )
            {
             before(grammarAccess.getVolumeFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:356:1: ( rule__VolumeField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:356:2: rule__VolumeField__Group__0
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__0_in_ruleVolumeField694);
            rule__VolumeField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVolumeFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:368:1: entryRuleNumberField : ruleNumberField EOF ;
    public final void entryRuleNumberField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:369:1: ( ruleNumberField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:370:1: ruleNumberField EOF
            {
             before(grammarAccess.getNumberFieldRule()); 
            pushFollow(FOLLOW_ruleNumberField_in_entryRuleNumberField721);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getNumberFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberField728); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:377:1: ruleNumberField : ( ( rule__NumberField__Group__0 ) ) ;
    public final void ruleNumberField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:381:2: ( ( ( rule__NumberField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:382:1: ( ( rule__NumberField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:382:1: ( ( rule__NumberField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:383:1: ( rule__NumberField__Group__0 )
            {
             before(grammarAccess.getNumberFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:384:1: ( rule__NumberField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:384:2: rule__NumberField__Group__0
            {
            pushFollow(FOLLOW_rule__NumberField__Group__0_in_ruleNumberField754);
            rule__NumberField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:396:1: entryRulePagesField : rulePagesField EOF ;
    public final void entryRulePagesField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:397:1: ( rulePagesField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:398:1: rulePagesField EOF
            {
             before(grammarAccess.getPagesFieldRule()); 
            pushFollow(FOLLOW_rulePagesField_in_entryRulePagesField781);
            rulePagesField();

            state._fsp--;

             after(grammarAccess.getPagesFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePagesField788); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:405:1: rulePagesField : ( ( rule__PagesField__Group__0 ) ) ;
    public final void rulePagesField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:409:2: ( ( ( rule__PagesField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:410:1: ( ( rule__PagesField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:410:1: ( ( rule__PagesField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:411:1: ( rule__PagesField__Group__0 )
            {
             before(grammarAccess.getPagesFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:412:1: ( rule__PagesField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:412:2: rule__PagesField__Group__0
            {
            pushFollow(FOLLOW_rule__PagesField__Group__0_in_rulePagesField814);
            rule__PagesField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPagesFieldAccess().getGroup()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:424:1: entryRuleMonthField : ruleMonthField EOF ;
    public final void entryRuleMonthField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:425:1: ( ruleMonthField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:426:1: ruleMonthField EOF
            {
             before(grammarAccess.getMonthFieldRule()); 
            pushFollow(FOLLOW_ruleMonthField_in_entryRuleMonthField841);
            ruleMonthField();

            state._fsp--;

             after(grammarAccess.getMonthFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMonthField848); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:433:1: ruleMonthField : ( ( rule__MonthField__Group__0 ) ) ;
    public final void ruleMonthField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:437:2: ( ( ( rule__MonthField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:438:1: ( ( rule__MonthField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:438:1: ( ( rule__MonthField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:439:1: ( rule__MonthField__Group__0 )
            {
             before(grammarAccess.getMonthFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:440:1: ( rule__MonthField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:440:2: rule__MonthField__Group__0
            {
            pushFollow(FOLLOW_rule__MonthField__Group__0_in_ruleMonthField874);
            rule__MonthField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonthFieldAccess().getGroup()); 

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


    // $ANTLR start "entryRuleNoteField"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:452:1: entryRuleNoteField : ruleNoteField EOF ;
    public final void entryRuleNoteField() throws RecognitionException {
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:453:1: ( ruleNoteField EOF )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:454:1: ruleNoteField EOF
            {
             before(grammarAccess.getNoteFieldRule()); 
            pushFollow(FOLLOW_ruleNoteField_in_entryRuleNoteField901);
            ruleNoteField();

            state._fsp--;

             after(grammarAccess.getNoteFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoteField908); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:461:1: ruleNoteField : ( ( rule__NoteField__Group__0 ) ) ;
    public final void ruleNoteField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:465:2: ( ( ( rule__NoteField__Group__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:466:1: ( ( rule__NoteField__Group__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:466:1: ( ( rule__NoteField__Group__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:467:1: ( rule__NoteField__Group__0 )
            {
             before(grammarAccess.getNoteFieldAccess().getGroup()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:468:1: ( rule__NoteField__Group__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:468:2: rule__NoteField__Group__0
            {
            pushFollow(FOLLOW_rule__NoteField__Group__0_in_ruleNoteField934);
            rule__NoteField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoteFieldAccess().getGroup()); 

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


    // $ANTLR start "rule__Article__Alternatives_0_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:480:1: rule__Article__Alternatives_0_1 : ( ( 'ARTICLE' ) | ( 'Article' ) | ( 'article' ) );
    public final void rule__Article__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:484:1: ( ( 'ARTICLE' ) | ( 'Article' ) | ( 'article' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
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
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:485:1: ( 'ARTICLE' )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:485:1: ( 'ARTICLE' )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:486:1: 'ARTICLE'
                    {
                     before(grammarAccess.getArticleAccess().getARTICLEKeyword_0_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__Article__Alternatives_0_1971); 
                     after(grammarAccess.getArticleAccess().getARTICLEKeyword_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:493:6: ( 'Article' )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:493:6: ( 'Article' )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:494:1: 'Article'
                    {
                     before(grammarAccess.getArticleAccess().getArticleKeyword_0_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__Article__Alternatives_0_1991); 
                     after(grammarAccess.getArticleAccess().getArticleKeyword_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:501:6: ( 'article' )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:501:6: ( 'article' )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:502:1: 'article'
                    {
                     before(grammarAccess.getArticleAccess().getArticleKeyword_0_1_2()); 
                    match(input,13,FOLLOW_13_in_rule__Article__Alternatives_0_11011); 
                     after(grammarAccess.getArticleAccess().getArticleKeyword_0_1_2()); 

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
    // $ANTLR end "rule__Article__Alternatives_0_1"


    // $ANTLR start "rule__AuthorField__Alternatives_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:514:1: rule__AuthorField__Alternatives_1 : ( ( ( rule__AuthorField__Group_1_0__0 ) ) | ( ( rule__AuthorField__Group_1_1__0 ) ) );
    public final void rule__AuthorField__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:518:1: ( ( ( rule__AuthorField__Group_1_0__0 ) ) | ( ( rule__AuthorField__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:519:1: ( ( rule__AuthorField__Group_1_0__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:519:1: ( ( rule__AuthorField__Group_1_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:520:1: ( rule__AuthorField__Group_1_0__0 )
                    {
                     before(grammarAccess.getAuthorFieldAccess().getGroup_1_0()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:521:1: ( rule__AuthorField__Group_1_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:521:2: rule__AuthorField__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__AuthorField__Group_1_0__0_in_rule__AuthorField__Alternatives_11045);
                    rule__AuthorField__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAuthorFieldAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:525:6: ( ( rule__AuthorField__Group_1_1__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:525:6: ( ( rule__AuthorField__Group_1_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:526:1: ( rule__AuthorField__Group_1_1__0 )
                    {
                     before(grammarAccess.getAuthorFieldAccess().getGroup_1_1()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:527:1: ( rule__AuthorField__Group_1_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:527:2: rule__AuthorField__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AuthorField__Group_1_1__0_in_rule__AuthorField__Alternatives_11063);
                    rule__AuthorField__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAuthorFieldAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__AuthorField__Alternatives_1"


    // $ANTLR start "rule__Fullname__Alternatives"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:536:1: rule__Fullname__Alternatives : ( ( ( rule__Fullname__Group_0__0 ) ) | ( ( rule__Fullname__Group_1__0 ) ) | ( ( rule__Fullname__FirstnameAssignment_2 ) ) );
    public final void rule__Fullname__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:540:1: ( ( ( rule__Fullname__Group_0__0 ) ) | ( ( rule__Fullname__Group_1__0 ) ) | ( ( rule__Fullname__FirstnameAssignment_2 ) ) )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 17:
                case 19:
                case 20:
                    {
                    alt4=3;
                    }
                    break;
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:541:1: ( ( rule__Fullname__Group_0__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:541:1: ( ( rule__Fullname__Group_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:542:1: ( rule__Fullname__Group_0__0 )
                    {
                     before(grammarAccess.getFullnameAccess().getGroup_0()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:543:1: ( rule__Fullname__Group_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:543:2: rule__Fullname__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Fullname__Group_0__0_in_rule__Fullname__Alternatives1096);
                    rule__Fullname__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullnameAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:547:6: ( ( rule__Fullname__Group_1__0 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:547:6: ( ( rule__Fullname__Group_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:548:1: ( rule__Fullname__Group_1__0 )
                    {
                     before(grammarAccess.getFullnameAccess().getGroup_1()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:549:1: ( rule__Fullname__Group_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:549:2: rule__Fullname__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Fullname__Group_1__0_in_rule__Fullname__Alternatives1114);
                    rule__Fullname__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullnameAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:553:6: ( ( rule__Fullname__FirstnameAssignment_2 ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:553:6: ( ( rule__Fullname__FirstnameAssignment_2 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:554:1: ( rule__Fullname__FirstnameAssignment_2 )
                    {
                     before(grammarAccess.getFullnameAccess().getFirstnameAssignment_2()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:555:1: ( rule__Fullname__FirstnameAssignment_2 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:555:2: rule__Fullname__FirstnameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_2_in_rule__Fullname__Alternatives1132);
                    rule__Fullname__FirstnameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullnameAccess().getFirstnameAssignment_2()); 

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


    // $ANTLR start "rule__Article__Group_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:566:1: rule__Article__Group_0__0 : rule__Article__Group_0__0__Impl rule__Article__Group_0__1 ;
    public final void rule__Article__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:570:1: ( rule__Article__Group_0__0__Impl rule__Article__Group_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:571:2: rule__Article__Group_0__0__Impl rule__Article__Group_0__1
            {
            pushFollow(FOLLOW_rule__Article__Group_0__0__Impl_in_rule__Article__Group_0__01163);
            rule__Article__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_0__1_in_rule__Article__Group_0__01166);
            rule__Article__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0__0"


    // $ANTLR start "rule__Article__Group_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:578:1: rule__Article__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Article__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:582:1: ( ( '@' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:583:1: ( '@' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:583:1: ( '@' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:584:1: '@'
            {
             before(grammarAccess.getArticleAccess().getCommercialAtKeyword_0_0()); 
            match(input,14,FOLLOW_14_in_rule__Article__Group_0__0__Impl1194); 
             after(grammarAccess.getArticleAccess().getCommercialAtKeyword_0_0()); 

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
    // $ANTLR end "rule__Article__Group_0__0__Impl"


    // $ANTLR start "rule__Article__Group_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:597:1: rule__Article__Group_0__1 : rule__Article__Group_0__1__Impl rule__Article__Group_0__2 ;
    public final void rule__Article__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:601:1: ( rule__Article__Group_0__1__Impl rule__Article__Group_0__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:602:2: rule__Article__Group_0__1__Impl rule__Article__Group_0__2
            {
            pushFollow(FOLLOW_rule__Article__Group_0__1__Impl_in_rule__Article__Group_0__11225);
            rule__Article__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_0__2_in_rule__Article__Group_0__11228);
            rule__Article__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0__1"


    // $ANTLR start "rule__Article__Group_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:609:1: rule__Article__Group_0__1__Impl : ( ( rule__Article__Alternatives_0_1 ) ) ;
    public final void rule__Article__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:613:1: ( ( ( rule__Article__Alternatives_0_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:614:1: ( ( rule__Article__Alternatives_0_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:614:1: ( ( rule__Article__Alternatives_0_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:615:1: ( rule__Article__Alternatives_0_1 )
            {
             before(grammarAccess.getArticleAccess().getAlternatives_0_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:616:1: ( rule__Article__Alternatives_0_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:616:2: rule__Article__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__Article__Alternatives_0_1_in_rule__Article__Group_0__1__Impl1255);
            rule__Article__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__Article__Group_0__1__Impl"


    // $ANTLR start "rule__Article__Group_0__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:626:1: rule__Article__Group_0__2 : rule__Article__Group_0__2__Impl rule__Article__Group_0__3 ;
    public final void rule__Article__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:630:1: ( rule__Article__Group_0__2__Impl rule__Article__Group_0__3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:631:2: rule__Article__Group_0__2__Impl rule__Article__Group_0__3
            {
            pushFollow(FOLLOW_rule__Article__Group_0__2__Impl_in_rule__Article__Group_0__21285);
            rule__Article__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_0__3_in_rule__Article__Group_0__21288);
            rule__Article__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0__2"


    // $ANTLR start "rule__Article__Group_0__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:638:1: rule__Article__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Article__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:642:1: ( ( '{' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:643:1: ( '{' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:643:1: ( '{' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:644:1: '{'
            {
             before(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,15,FOLLOW_15_in_rule__Article__Group_0__2__Impl1316); 
             after(grammarAccess.getArticleAccess().getLeftCurlyBracketKeyword_0_2()); 

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
    // $ANTLR end "rule__Article__Group_0__2__Impl"


    // $ANTLR start "rule__Article__Group_0__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:657:1: rule__Article__Group_0__3 : rule__Article__Group_0__3__Impl rule__Article__Group_0__4 ;
    public final void rule__Article__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:661:1: ( rule__Article__Group_0__3__Impl rule__Article__Group_0__4 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:662:2: rule__Article__Group_0__3__Impl rule__Article__Group_0__4
            {
            pushFollow(FOLLOW_rule__Article__Group_0__3__Impl_in_rule__Article__Group_0__31347);
            rule__Article__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_0__4_in_rule__Article__Group_0__31350);
            rule__Article__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0__3"


    // $ANTLR start "rule__Article__Group_0__3__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:669:1: rule__Article__Group_0__3__Impl : ( ( rule__Article__KeyAssignment_0_3 ) ) ;
    public final void rule__Article__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:673:1: ( ( ( rule__Article__KeyAssignment_0_3 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:674:1: ( ( rule__Article__KeyAssignment_0_3 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:674:1: ( ( rule__Article__KeyAssignment_0_3 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:675:1: ( rule__Article__KeyAssignment_0_3 )
            {
             before(grammarAccess.getArticleAccess().getKeyAssignment_0_3()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:676:1: ( rule__Article__KeyAssignment_0_3 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:676:2: rule__Article__KeyAssignment_0_3
            {
            pushFollow(FOLLOW_rule__Article__KeyAssignment_0_3_in_rule__Article__Group_0__3__Impl1377);
            rule__Article__KeyAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getKeyAssignment_0_3()); 

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
    // $ANTLR end "rule__Article__Group_0__3__Impl"


    // $ANTLR start "rule__Article__Group_0__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:686:1: rule__Article__Group_0__4 : rule__Article__Group_0__4__Impl ;
    public final void rule__Article__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:690:1: ( rule__Article__Group_0__4__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:691:2: rule__Article__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_0__4__Impl_in_rule__Article__Group_0__41407);
            rule__Article__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0__4"


    // $ANTLR start "rule__Article__Group_0__4__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:697:1: rule__Article__Group_0__4__Impl : ( ( rule__Article__Group_0_4__0 ) ) ;
    public final void rule__Article__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:701:1: ( ( ( rule__Article__Group_0_4__0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:702:1: ( ( rule__Article__Group_0_4__0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:702:1: ( ( rule__Article__Group_0_4__0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:703:1: ( rule__Article__Group_0_4__0 )
            {
             before(grammarAccess.getArticleAccess().getGroup_0_4()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:704:1: ( rule__Article__Group_0_4__0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:704:2: rule__Article__Group_0_4__0
            {
            pushFollow(FOLLOW_rule__Article__Group_0_4__0_in_rule__Article__Group_0__4__Impl1434);
            rule__Article__Group_0_4__0();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getGroup_0_4()); 

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
    // $ANTLR end "rule__Article__Group_0__4__Impl"


    // $ANTLR start "rule__Article__Group_0_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:724:1: rule__Article__Group_0_4__0 : rule__Article__Group_0_4__0__Impl rule__Article__Group_0_4__1 ;
    public final void rule__Article__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:728:1: ( rule__Article__Group_0_4__0__Impl rule__Article__Group_0_4__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:729:2: rule__Article__Group_0_4__0__Impl rule__Article__Group_0_4__1
            {
            pushFollow(FOLLOW_rule__Article__Group_0_4__0__Impl_in_rule__Article__Group_0_4__01474);
            rule__Article__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_0_4__1_in_rule__Article__Group_0_4__01477);
            rule__Article__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0_4__0"


    // $ANTLR start "rule__Article__Group_0_4__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:736:1: rule__Article__Group_0_4__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:740:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:741:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:741:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:742:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_0_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_0_4__0__Impl1505); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_0_4_0()); 

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
    // $ANTLR end "rule__Article__Group_0_4__0__Impl"


    // $ANTLR start "rule__Article__Group_0_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:755:1: rule__Article__Group_0_4__1 : rule__Article__Group_0_4__1__Impl ;
    public final void rule__Article__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:759:1: ( rule__Article__Group_0_4__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:760:2: rule__Article__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_0_4__1__Impl_in_rule__Article__Group_0_4__11536);
            rule__Article__Group_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_0_4__1"


    // $ANTLR start "rule__Article__Group_0_4__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:766:1: rule__Article__Group_0_4__1__Impl : ( ( rule__Article__AuthorAssignment_0_4_1 ) ) ;
    public final void rule__Article__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:770:1: ( ( ( rule__Article__AuthorAssignment_0_4_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:771:1: ( ( rule__Article__AuthorAssignment_0_4_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:771:1: ( ( rule__Article__AuthorAssignment_0_4_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:772:1: ( rule__Article__AuthorAssignment_0_4_1 )
            {
             before(grammarAccess.getArticleAccess().getAuthorAssignment_0_4_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:773:1: ( rule__Article__AuthorAssignment_0_4_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:773:2: rule__Article__AuthorAssignment_0_4_1
            {
            pushFollow(FOLLOW_rule__Article__AuthorAssignment_0_4_1_in_rule__Article__Group_0_4__1__Impl1563);
            rule__Article__AuthorAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getAuthorAssignment_0_4_1()); 

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
    // $ANTLR end "rule__Article__Group_0_4__1__Impl"


    // $ANTLR start "rule__Article__Group_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:787:1: rule__Article__Group_1__0 : rule__Article__Group_1__0__Impl rule__Article__Group_1__1 ;
    public final void rule__Article__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:791:1: ( rule__Article__Group_1__0__Impl rule__Article__Group_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:792:2: rule__Article__Group_1__0__Impl rule__Article__Group_1__1
            {
            pushFollow(FOLLOW_rule__Article__Group_1__0__Impl_in_rule__Article__Group_1__01597);
            rule__Article__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_1__1_in_rule__Article__Group_1__01600);
            rule__Article__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_1__0"


    // $ANTLR start "rule__Article__Group_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:799:1: rule__Article__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:803:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:804:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:804:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:805:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_1__0__Impl1628); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Article__Group_1__0__Impl"


    // $ANTLR start "rule__Article__Group_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:818:1: rule__Article__Group_1__1 : rule__Article__Group_1__1__Impl ;
    public final void rule__Article__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:822:1: ( rule__Article__Group_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:823:2: rule__Article__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_1__1__Impl_in_rule__Article__Group_1__11659);
            rule__Article__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_1__1"


    // $ANTLR start "rule__Article__Group_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:829:1: rule__Article__Group_1__1__Impl : ( ( rule__Article__TitleAssignment_1_1 ) ) ;
    public final void rule__Article__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:833:1: ( ( ( rule__Article__TitleAssignment_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:834:1: ( ( rule__Article__TitleAssignment_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:834:1: ( ( rule__Article__TitleAssignment_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:835:1: ( rule__Article__TitleAssignment_1_1 )
            {
             before(grammarAccess.getArticleAccess().getTitleAssignment_1_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:836:1: ( rule__Article__TitleAssignment_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:836:2: rule__Article__TitleAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Article__TitleAssignment_1_1_in_rule__Article__Group_1__1__Impl1686);
            rule__Article__TitleAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getTitleAssignment_1_1()); 

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
    // $ANTLR end "rule__Article__Group_1__1__Impl"


    // $ANTLR start "rule__Article__Group_2__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:850:1: rule__Article__Group_2__0 : rule__Article__Group_2__0__Impl rule__Article__Group_2__1 ;
    public final void rule__Article__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:854:1: ( rule__Article__Group_2__0__Impl rule__Article__Group_2__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:855:2: rule__Article__Group_2__0__Impl rule__Article__Group_2__1
            {
            pushFollow(FOLLOW_rule__Article__Group_2__0__Impl_in_rule__Article__Group_2__01720);
            rule__Article__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_2__1_in_rule__Article__Group_2__01723);
            rule__Article__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_2__0"


    // $ANTLR start "rule__Article__Group_2__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:862:1: rule__Article__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:866:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:867:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:867:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:868:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_2__0__Impl1751); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Article__Group_2__0__Impl"


    // $ANTLR start "rule__Article__Group_2__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:881:1: rule__Article__Group_2__1 : rule__Article__Group_2__1__Impl ;
    public final void rule__Article__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:885:1: ( rule__Article__Group_2__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:886:2: rule__Article__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_2__1__Impl_in_rule__Article__Group_2__11782);
            rule__Article__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_2__1"


    // $ANTLR start "rule__Article__Group_2__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:892:1: rule__Article__Group_2__1__Impl : ( ( rule__Article__JournalAssignment_2_1 ) ) ;
    public final void rule__Article__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:896:1: ( ( ( rule__Article__JournalAssignment_2_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:897:1: ( ( rule__Article__JournalAssignment_2_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:897:1: ( ( rule__Article__JournalAssignment_2_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:898:1: ( rule__Article__JournalAssignment_2_1 )
            {
             before(grammarAccess.getArticleAccess().getJournalAssignment_2_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:899:1: ( rule__Article__JournalAssignment_2_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:899:2: rule__Article__JournalAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Article__JournalAssignment_2_1_in_rule__Article__Group_2__1__Impl1809);
            rule__Article__JournalAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getJournalAssignment_2_1()); 

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
    // $ANTLR end "rule__Article__Group_2__1__Impl"


    // $ANTLR start "rule__Article__Group_3__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:913:1: rule__Article__Group_3__0 : rule__Article__Group_3__0__Impl rule__Article__Group_3__1 ;
    public final void rule__Article__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:917:1: ( rule__Article__Group_3__0__Impl rule__Article__Group_3__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:918:2: rule__Article__Group_3__0__Impl rule__Article__Group_3__1
            {
            pushFollow(FOLLOW_rule__Article__Group_3__0__Impl_in_rule__Article__Group_3__01843);
            rule__Article__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_3__1_in_rule__Article__Group_3__01846);
            rule__Article__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_3__0"


    // $ANTLR start "rule__Article__Group_3__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:925:1: rule__Article__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:929:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:930:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:930:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:931:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_3__0__Impl1874); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__Article__Group_3__0__Impl"


    // $ANTLR start "rule__Article__Group_3__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:944:1: rule__Article__Group_3__1 : rule__Article__Group_3__1__Impl ;
    public final void rule__Article__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:948:1: ( rule__Article__Group_3__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:949:2: rule__Article__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_3__1__Impl_in_rule__Article__Group_3__11905);
            rule__Article__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_3__1"


    // $ANTLR start "rule__Article__Group_3__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:955:1: rule__Article__Group_3__1__Impl : ( ( rule__Article__YearAssignment_3_1 ) ) ;
    public final void rule__Article__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:959:1: ( ( ( rule__Article__YearAssignment_3_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:960:1: ( ( rule__Article__YearAssignment_3_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:960:1: ( ( rule__Article__YearAssignment_3_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:961:1: ( rule__Article__YearAssignment_3_1 )
            {
             before(grammarAccess.getArticleAccess().getYearAssignment_3_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:962:1: ( rule__Article__YearAssignment_3_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:962:2: rule__Article__YearAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Article__YearAssignment_3_1_in_rule__Article__Group_3__1__Impl1932);
            rule__Article__YearAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getYearAssignment_3_1()); 

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
    // $ANTLR end "rule__Article__Group_3__1__Impl"


    // $ANTLR start "rule__Article__Group_4__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:976:1: rule__Article__Group_4__0 : rule__Article__Group_4__0__Impl rule__Article__Group_4__1 ;
    public final void rule__Article__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:980:1: ( rule__Article__Group_4__0__Impl rule__Article__Group_4__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:981:2: rule__Article__Group_4__0__Impl rule__Article__Group_4__1
            {
            pushFollow(FOLLOW_rule__Article__Group_4__0__Impl_in_rule__Article__Group_4__01966);
            rule__Article__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_4__1_in_rule__Article__Group_4__01969);
            rule__Article__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4__0"


    // $ANTLR start "rule__Article__Group_4__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:988:1: rule__Article__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:992:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:993:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:993:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:994:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_4__0__Impl1997); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Article__Group_4__0__Impl"


    // $ANTLR start "rule__Article__Group_4__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1007:1: rule__Article__Group_4__1 : rule__Article__Group_4__1__Impl ;
    public final void rule__Article__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1011:1: ( rule__Article__Group_4__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1012:2: rule__Article__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_4__1__Impl_in_rule__Article__Group_4__12028);
            rule__Article__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_4__1"


    // $ANTLR start "rule__Article__Group_4__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1018:1: rule__Article__Group_4__1__Impl : ( ( rule__Article__VolumeAssignment_4_1 ) ) ;
    public final void rule__Article__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1022:1: ( ( ( rule__Article__VolumeAssignment_4_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1023:1: ( ( rule__Article__VolumeAssignment_4_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1023:1: ( ( rule__Article__VolumeAssignment_4_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1024:1: ( rule__Article__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getArticleAccess().getVolumeAssignment_4_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1025:1: ( rule__Article__VolumeAssignment_4_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1025:2: rule__Article__VolumeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Article__VolumeAssignment_4_1_in_rule__Article__Group_4__1__Impl2055);
            rule__Article__VolumeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getVolumeAssignment_4_1()); 

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
    // $ANTLR end "rule__Article__Group_4__1__Impl"


    // $ANTLR start "rule__Article__Group_5__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1039:1: rule__Article__Group_5__0 : rule__Article__Group_5__0__Impl rule__Article__Group_5__1 ;
    public final void rule__Article__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1043:1: ( rule__Article__Group_5__0__Impl rule__Article__Group_5__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1044:2: rule__Article__Group_5__0__Impl rule__Article__Group_5__1
            {
            pushFollow(FOLLOW_rule__Article__Group_5__0__Impl_in_rule__Article__Group_5__02089);
            rule__Article__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_5__1_in_rule__Article__Group_5__02092);
            rule__Article__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_5__0"


    // $ANTLR start "rule__Article__Group_5__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1051:1: rule__Article__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1055:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1056:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1056:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1057:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_5__0__Impl2120); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Article__Group_5__0__Impl"


    // $ANTLR start "rule__Article__Group_5__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1070:1: rule__Article__Group_5__1 : rule__Article__Group_5__1__Impl ;
    public final void rule__Article__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1074:1: ( rule__Article__Group_5__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1075:2: rule__Article__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_5__1__Impl_in_rule__Article__Group_5__12151);
            rule__Article__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_5__1"


    // $ANTLR start "rule__Article__Group_5__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1081:1: rule__Article__Group_5__1__Impl : ( ( rule__Article__NumberAssignment_5_1 ) ) ;
    public final void rule__Article__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1085:1: ( ( ( rule__Article__NumberAssignment_5_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1086:1: ( ( rule__Article__NumberAssignment_5_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1086:1: ( ( rule__Article__NumberAssignment_5_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1087:1: ( rule__Article__NumberAssignment_5_1 )
            {
             before(grammarAccess.getArticleAccess().getNumberAssignment_5_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1088:1: ( rule__Article__NumberAssignment_5_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1088:2: rule__Article__NumberAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Article__NumberAssignment_5_1_in_rule__Article__Group_5__1__Impl2178);
            rule__Article__NumberAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getNumberAssignment_5_1()); 

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
    // $ANTLR end "rule__Article__Group_5__1__Impl"


    // $ANTLR start "rule__Article__Group_6__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1102:1: rule__Article__Group_6__0 : rule__Article__Group_6__0__Impl rule__Article__Group_6__1 ;
    public final void rule__Article__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1106:1: ( rule__Article__Group_6__0__Impl rule__Article__Group_6__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1107:2: rule__Article__Group_6__0__Impl rule__Article__Group_6__1
            {
            pushFollow(FOLLOW_rule__Article__Group_6__0__Impl_in_rule__Article__Group_6__02212);
            rule__Article__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_6__1_in_rule__Article__Group_6__02215);
            rule__Article__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_6__0"


    // $ANTLR start "rule__Article__Group_6__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1114:1: rule__Article__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1118:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1119:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1119:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1120:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_6__0__Impl2243); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_6_0()); 

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
    // $ANTLR end "rule__Article__Group_6__0__Impl"


    // $ANTLR start "rule__Article__Group_6__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1133:1: rule__Article__Group_6__1 : rule__Article__Group_6__1__Impl ;
    public final void rule__Article__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1137:1: ( rule__Article__Group_6__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1138:2: rule__Article__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_6__1__Impl_in_rule__Article__Group_6__12274);
            rule__Article__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_6__1"


    // $ANTLR start "rule__Article__Group_6__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1144:1: rule__Article__Group_6__1__Impl : ( ( rule__Article__PagesAssignment_6_1 ) ) ;
    public final void rule__Article__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1148:1: ( ( ( rule__Article__PagesAssignment_6_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1149:1: ( ( rule__Article__PagesAssignment_6_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1149:1: ( ( rule__Article__PagesAssignment_6_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1150:1: ( rule__Article__PagesAssignment_6_1 )
            {
             before(grammarAccess.getArticleAccess().getPagesAssignment_6_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1151:1: ( rule__Article__PagesAssignment_6_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1151:2: rule__Article__PagesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Article__PagesAssignment_6_1_in_rule__Article__Group_6__1__Impl2301);
            rule__Article__PagesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getPagesAssignment_6_1()); 

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
    // $ANTLR end "rule__Article__Group_6__1__Impl"


    // $ANTLR start "rule__Article__Group_7__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1165:1: rule__Article__Group_7__0 : rule__Article__Group_7__0__Impl rule__Article__Group_7__1 ;
    public final void rule__Article__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1169:1: ( rule__Article__Group_7__0__Impl rule__Article__Group_7__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1170:2: rule__Article__Group_7__0__Impl rule__Article__Group_7__1
            {
            pushFollow(FOLLOW_rule__Article__Group_7__0__Impl_in_rule__Article__Group_7__02335);
            rule__Article__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_7__1_in_rule__Article__Group_7__02338);
            rule__Article__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_7__0"


    // $ANTLR start "rule__Article__Group_7__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1177:1: rule__Article__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1181:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1182:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1182:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1183:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_7__0__Impl2366); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_7_0()); 

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
    // $ANTLR end "rule__Article__Group_7__0__Impl"


    // $ANTLR start "rule__Article__Group_7__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1196:1: rule__Article__Group_7__1 : rule__Article__Group_7__1__Impl ;
    public final void rule__Article__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1200:1: ( rule__Article__Group_7__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1201:2: rule__Article__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_7__1__Impl_in_rule__Article__Group_7__12397);
            rule__Article__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_7__1"


    // $ANTLR start "rule__Article__Group_7__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1207:1: rule__Article__Group_7__1__Impl : ( ( rule__Article__MonthAssignment_7_1 ) ) ;
    public final void rule__Article__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1211:1: ( ( ( rule__Article__MonthAssignment_7_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1212:1: ( ( rule__Article__MonthAssignment_7_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1212:1: ( ( rule__Article__MonthAssignment_7_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1213:1: ( rule__Article__MonthAssignment_7_1 )
            {
             before(grammarAccess.getArticleAccess().getMonthAssignment_7_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1214:1: ( rule__Article__MonthAssignment_7_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1214:2: rule__Article__MonthAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Article__MonthAssignment_7_1_in_rule__Article__Group_7__1__Impl2424);
            rule__Article__MonthAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getMonthAssignment_7_1()); 

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
    // $ANTLR end "rule__Article__Group_7__1__Impl"


    // $ANTLR start "rule__Article__Group_8__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1228:1: rule__Article__Group_8__0 : rule__Article__Group_8__0__Impl rule__Article__Group_8__1 ;
    public final void rule__Article__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1232:1: ( rule__Article__Group_8__0__Impl rule__Article__Group_8__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1233:2: rule__Article__Group_8__0__Impl rule__Article__Group_8__1
            {
            pushFollow(FOLLOW_rule__Article__Group_8__0__Impl_in_rule__Article__Group_8__02458);
            rule__Article__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_8__1_in_rule__Article__Group_8__02461);
            rule__Article__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_8__0"


    // $ANTLR start "rule__Article__Group_8__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1240:1: rule__Article__Group_8__0__Impl : ( ( rule__Article__Group_8_0__0 )? ) ;
    public final void rule__Article__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1244:1: ( ( ( rule__Article__Group_8_0__0 )? ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1245:1: ( ( rule__Article__Group_8_0__0 )? )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1245:1: ( ( rule__Article__Group_8_0__0 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1246:1: ( rule__Article__Group_8_0__0 )?
            {
             before(grammarAccess.getArticleAccess().getGroup_8_0()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1247:1: ( rule__Article__Group_8_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1247:2: rule__Article__Group_8_0__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_8_0__0_in_rule__Article__Group_8__0__Impl2488);
                    rule__Article__Group_8_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArticleAccess().getGroup_8_0()); 

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
    // $ANTLR end "rule__Article__Group_8__0__Impl"


    // $ANTLR start "rule__Article__Group_8__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1257:1: rule__Article__Group_8__1 : rule__Article__Group_8__1__Impl ;
    public final void rule__Article__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1261:1: ( rule__Article__Group_8__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1262:2: rule__Article__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_8__1__Impl_in_rule__Article__Group_8__12519);
            rule__Article__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_8__1"


    // $ANTLR start "rule__Article__Group_8__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1268:1: rule__Article__Group_8__1__Impl : ( '}' ) ;
    public final void rule__Article__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1272:1: ( ( '}' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1273:1: ( '}' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1273:1: ( '}' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1274:1: '}'
            {
             before(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_8_1()); 
            match(input,17,FOLLOW_17_in_rule__Article__Group_8__1__Impl2547); 
             after(grammarAccess.getArticleAccess().getRightCurlyBracketKeyword_8_1()); 

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
    // $ANTLR end "rule__Article__Group_8__1__Impl"


    // $ANTLR start "rule__Article__Group_8_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1291:1: rule__Article__Group_8_0__0 : rule__Article__Group_8_0__0__Impl rule__Article__Group_8_0__1 ;
    public final void rule__Article__Group_8_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1295:1: ( rule__Article__Group_8_0__0__Impl rule__Article__Group_8_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1296:2: rule__Article__Group_8_0__0__Impl rule__Article__Group_8_0__1
            {
            pushFollow(FOLLOW_rule__Article__Group_8_0__0__Impl_in_rule__Article__Group_8_0__02582);
            rule__Article__Group_8_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Article__Group_8_0__1_in_rule__Article__Group_8_0__02585);
            rule__Article__Group_8_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_8_0__0"


    // $ANTLR start "rule__Article__Group_8_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1303:1: rule__Article__Group_8_0__0__Impl : ( ',' ) ;
    public final void rule__Article__Group_8_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1307:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1308:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1308:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1309:1: ','
            {
             before(grammarAccess.getArticleAccess().getCommaKeyword_8_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Article__Group_8_0__0__Impl2613); 
             after(grammarAccess.getArticleAccess().getCommaKeyword_8_0_0()); 

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
    // $ANTLR end "rule__Article__Group_8_0__0__Impl"


    // $ANTLR start "rule__Article__Group_8_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1322:1: rule__Article__Group_8_0__1 : rule__Article__Group_8_0__1__Impl ;
    public final void rule__Article__Group_8_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1326:1: ( rule__Article__Group_8_0__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1327:2: rule__Article__Group_8_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Article__Group_8_0__1__Impl_in_rule__Article__Group_8_0__12644);
            rule__Article__Group_8_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__Group_8_0__1"


    // $ANTLR start "rule__Article__Group_8_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1333:1: rule__Article__Group_8_0__1__Impl : ( ( rule__Article__NoteAssignment_8_0_1 ) ) ;
    public final void rule__Article__Group_8_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1337:1: ( ( ( rule__Article__NoteAssignment_8_0_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1338:1: ( ( rule__Article__NoteAssignment_8_0_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1338:1: ( ( rule__Article__NoteAssignment_8_0_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1339:1: ( rule__Article__NoteAssignment_8_0_1 )
            {
             before(grammarAccess.getArticleAccess().getNoteAssignment_8_0_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1340:1: ( rule__Article__NoteAssignment_8_0_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1340:2: rule__Article__NoteAssignment_8_0_1
            {
            pushFollow(FOLLOW_rule__Article__NoteAssignment_8_0_1_in_rule__Article__Group_8_0__1__Impl2671);
            rule__Article__NoteAssignment_8_0_1();

            state._fsp--;


            }

             after(grammarAccess.getArticleAccess().getNoteAssignment_8_0_1()); 

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
    // $ANTLR end "rule__Article__Group_8_0__1__Impl"


    // $ANTLR start "rule__AuthorField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1354:1: rule__AuthorField__Group__0 : rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1 ;
    public final void rule__AuthorField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1358:1: ( rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1359:2: rule__AuthorField__Group__0__Impl rule__AuthorField__Group__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__0__Impl_in_rule__AuthorField__Group__02705);
            rule__AuthorField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthorField__Group__1_in_rule__AuthorField__Group__02708);
            rule__AuthorField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1366:1: rule__AuthorField__Group__0__Impl : ( 'author = ' ) ;
    public final void rule__AuthorField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1370:1: ( ( 'author = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1371:1: ( 'author = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1371:1: ( 'author = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1372:1: 'author = '
            {
             before(grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__AuthorField__Group__0__Impl2736); 
             after(grammarAccess.getAuthorFieldAccess().getAuthorKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1385:1: rule__AuthorField__Group__1 : rule__AuthorField__Group__1__Impl ;
    public final void rule__AuthorField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1389:1: ( rule__AuthorField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1390:2: rule__AuthorField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group__1__Impl_in_rule__AuthorField__Group__12767);
            rule__AuthorField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1396:1: rule__AuthorField__Group__1__Impl : ( ( rule__AuthorField__Alternatives_1 ) ) ;
    public final void rule__AuthorField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1400:1: ( ( ( rule__AuthorField__Alternatives_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1401:1: ( ( rule__AuthorField__Alternatives_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1401:1: ( ( rule__AuthorField__Alternatives_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1402:1: ( rule__AuthorField__Alternatives_1 )
            {
             before(grammarAccess.getAuthorFieldAccess().getAlternatives_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1403:1: ( rule__AuthorField__Alternatives_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1403:2: rule__AuthorField__Alternatives_1
            {
            pushFollow(FOLLOW_rule__AuthorField__Alternatives_1_in_rule__AuthorField__Group__1__Impl2794);
            rule__AuthorField__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorFieldAccess().getAlternatives_1()); 

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


    // $ANTLR start "rule__AuthorField__Group_1_0__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1417:1: rule__AuthorField__Group_1_0__0 : rule__AuthorField__Group_1_0__0__Impl rule__AuthorField__Group_1_0__1 ;
    public final void rule__AuthorField__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1421:1: ( rule__AuthorField__Group_1_0__0__Impl rule__AuthorField__Group_1_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1422:2: rule__AuthorField__Group_1_0__0__Impl rule__AuthorField__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_0__0__Impl_in_rule__AuthorField__Group_1_0__02828);
            rule__AuthorField__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthorField__Group_1_0__1_in_rule__AuthorField__Group_1_0__02831);
            rule__AuthorField__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_0__0"


    // $ANTLR start "rule__AuthorField__Group_1_0__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1429:1: rule__AuthorField__Group_1_0__0__Impl : ( '\"' ) ;
    public final void rule__AuthorField__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1433:1: ( ( '\"' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1434:1: ( '\"' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1434:1: ( '\"' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1435:1: '\"'
            {
             before(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_0()); 
            match(input,19,FOLLOW_19_in_rule__AuthorField__Group_1_0__0__Impl2859); 
             after(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_0()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_0__0__Impl"


    // $ANTLR start "rule__AuthorField__Group_1_0__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1448:1: rule__AuthorField__Group_1_0__1 : rule__AuthorField__Group_1_0__1__Impl rule__AuthorField__Group_1_0__2 ;
    public final void rule__AuthorField__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1452:1: ( rule__AuthorField__Group_1_0__1__Impl rule__AuthorField__Group_1_0__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1453:2: rule__AuthorField__Group_1_0__1__Impl rule__AuthorField__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_0__1__Impl_in_rule__AuthorField__Group_1_0__12890);
            rule__AuthorField__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthorField__Group_1_0__2_in_rule__AuthorField__Group_1_0__12893);
            rule__AuthorField__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_0__1"


    // $ANTLR start "rule__AuthorField__Group_1_0__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1460:1: rule__AuthorField__Group_1_0__1__Impl : ( ruleAuthors ) ;
    public final void rule__AuthorField__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1464:1: ( ( ruleAuthors ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1465:1: ( ruleAuthors )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1465:1: ( ruleAuthors )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1466:1: ruleAuthors
            {
             before(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleAuthors_in_rule__AuthorField__Group_1_0__1__Impl2920);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_0__1__Impl"


    // $ANTLR start "rule__AuthorField__Group_1_0__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1477:1: rule__AuthorField__Group_1_0__2 : rule__AuthorField__Group_1_0__2__Impl ;
    public final void rule__AuthorField__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1481:1: ( rule__AuthorField__Group_1_0__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1482:2: rule__AuthorField__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_0__2__Impl_in_rule__AuthorField__Group_1_0__22949);
            rule__AuthorField__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_0__2"


    // $ANTLR start "rule__AuthorField__Group_1_0__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1488:1: rule__AuthorField__Group_1_0__2__Impl : ( '\"' ) ;
    public final void rule__AuthorField__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1492:1: ( ( '\"' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1493:1: ( '\"' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1493:1: ( '\"' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1494:1: '\"'
            {
             before(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_2()); 
            match(input,19,FOLLOW_19_in_rule__AuthorField__Group_1_0__2__Impl2977); 
             after(grammarAccess.getAuthorFieldAccess().getQuotationMarkKeyword_1_0_2()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_0__2__Impl"


    // $ANTLR start "rule__AuthorField__Group_1_1__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1513:1: rule__AuthorField__Group_1_1__0 : rule__AuthorField__Group_1_1__0__Impl rule__AuthorField__Group_1_1__1 ;
    public final void rule__AuthorField__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1517:1: ( rule__AuthorField__Group_1_1__0__Impl rule__AuthorField__Group_1_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1518:2: rule__AuthorField__Group_1_1__0__Impl rule__AuthorField__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_1__0__Impl_in_rule__AuthorField__Group_1_1__03014);
            rule__AuthorField__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthorField__Group_1_1__1_in_rule__AuthorField__Group_1_1__03017);
            rule__AuthorField__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_1__0"


    // $ANTLR start "rule__AuthorField__Group_1_1__0__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1525:1: rule__AuthorField__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__AuthorField__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1529:1: ( ( '{' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1530:1: ( '{' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1530:1: ( '{' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1531:1: '{'
            {
             before(grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__AuthorField__Group_1_1__0__Impl3045); 
             after(grammarAccess.getAuthorFieldAccess().getLeftCurlyBracketKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_1__0__Impl"


    // $ANTLR start "rule__AuthorField__Group_1_1__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1544:1: rule__AuthorField__Group_1_1__1 : rule__AuthorField__Group_1_1__1__Impl rule__AuthorField__Group_1_1__2 ;
    public final void rule__AuthorField__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1548:1: ( rule__AuthorField__Group_1_1__1__Impl rule__AuthorField__Group_1_1__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1549:2: rule__AuthorField__Group_1_1__1__Impl rule__AuthorField__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_1__1__Impl_in_rule__AuthorField__Group_1_1__13076);
            rule__AuthorField__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AuthorField__Group_1_1__2_in_rule__AuthorField__Group_1_1__13079);
            rule__AuthorField__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_1__1"


    // $ANTLR start "rule__AuthorField__Group_1_1__1__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1556:1: rule__AuthorField__Group_1_1__1__Impl : ( ruleAuthors ) ;
    public final void rule__AuthorField__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1560:1: ( ( ruleAuthors ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1561:1: ( ruleAuthors )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1561:1: ( ruleAuthors )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1562:1: ruleAuthors
            {
             before(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_ruleAuthors_in_rule__AuthorField__Group_1_1__1__Impl3106);
            ruleAuthors();

            state._fsp--;

             after(grammarAccess.getAuthorFieldAccess().getAuthorsParserRuleCall_1_1_1()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_1__1__Impl"


    // $ANTLR start "rule__AuthorField__Group_1_1__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1573:1: rule__AuthorField__Group_1_1__2 : rule__AuthorField__Group_1_1__2__Impl ;
    public final void rule__AuthorField__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1577:1: ( rule__AuthorField__Group_1_1__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1578:2: rule__AuthorField__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AuthorField__Group_1_1__2__Impl_in_rule__AuthorField__Group_1_1__23135);
            rule__AuthorField__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthorField__Group_1_1__2"


    // $ANTLR start "rule__AuthorField__Group_1_1__2__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1584:1: rule__AuthorField__Group_1_1__2__Impl : ( '}' ) ;
    public final void rule__AuthorField__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1588:1: ( ( '}' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1589:1: ( '}' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1589:1: ( '}' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1590:1: '}'
            {
             before(grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_1_1_2()); 
            match(input,17,FOLLOW_17_in_rule__AuthorField__Group_1_1__2__Impl3163); 
             after(grammarAccess.getAuthorFieldAccess().getRightCurlyBracketKeyword_1_1_2()); 

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
    // $ANTLR end "rule__AuthorField__Group_1_1__2__Impl"


    // $ANTLR start "rule__Authors__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1609:1: rule__Authors__Group__0 : rule__Authors__Group__0__Impl rule__Authors__Group__1 ;
    public final void rule__Authors__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1613:1: ( rule__Authors__Group__0__Impl rule__Authors__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1614:2: rule__Authors__Group__0__Impl rule__Authors__Group__1
            {
            pushFollow(FOLLOW_rule__Authors__Group__0__Impl_in_rule__Authors__Group__03200);
            rule__Authors__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Authors__Group__1_in_rule__Authors__Group__03203);
            rule__Authors__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1621:1: rule__Authors__Group__0__Impl : ( ( rule__Authors__NamesAssignment_0 ) ) ;
    public final void rule__Authors__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1625:1: ( ( ( rule__Authors__NamesAssignment_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1626:1: ( ( rule__Authors__NamesAssignment_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1626:1: ( ( rule__Authors__NamesAssignment_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1627:1: ( rule__Authors__NamesAssignment_0 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_0()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1628:1: ( rule__Authors__NamesAssignment_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1628:2: rule__Authors__NamesAssignment_0
            {
            pushFollow(FOLLOW_rule__Authors__NamesAssignment_0_in_rule__Authors__Group__0__Impl3230);
            rule__Authors__NamesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getNamesAssignment_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1638:1: rule__Authors__Group__1 : rule__Authors__Group__1__Impl ;
    public final void rule__Authors__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1642:1: ( rule__Authors__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1643:2: rule__Authors__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Authors__Group__1__Impl_in_rule__Authors__Group__13260);
            rule__Authors__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1649:1: rule__Authors__Group__1__Impl : ( ( rule__Authors__Group_1__0 )* ) ;
    public final void rule__Authors__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1653:1: ( ( ( rule__Authors__Group_1__0 )* ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1654:1: ( ( rule__Authors__Group_1__0 )* )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1654:1: ( ( rule__Authors__Group_1__0 )* )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1655:1: ( rule__Authors__Group_1__0 )*
            {
             before(grammarAccess.getAuthorsAccess().getGroup_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1656:1: ( rule__Authors__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1656:2: rule__Authors__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Authors__Group_1__0_in_rule__Authors__Group__1__Impl3287);
            	    rule__Authors__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAuthorsAccess().getGroup_1()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1670:1: rule__Authors__Group_1__0 : rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1 ;
    public final void rule__Authors__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1674:1: ( rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1675:2: rule__Authors__Group_1__0__Impl rule__Authors__Group_1__1
            {
            pushFollow(FOLLOW_rule__Authors__Group_1__0__Impl_in_rule__Authors__Group_1__03322);
            rule__Authors__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Authors__Group_1__1_in_rule__Authors__Group_1__03325);
            rule__Authors__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1682:1: rule__Authors__Group_1__0__Impl : ( 'and' ) ;
    public final void rule__Authors__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1686:1: ( ( 'and' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1687:1: ( 'and' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1687:1: ( 'and' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1688:1: 'and'
            {
             before(grammarAccess.getAuthorsAccess().getAndKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Authors__Group_1__0__Impl3353); 
             after(grammarAccess.getAuthorsAccess().getAndKeyword_1_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1701:1: rule__Authors__Group_1__1 : rule__Authors__Group_1__1__Impl ;
    public final void rule__Authors__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1705:1: ( rule__Authors__Group_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1706:2: rule__Authors__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Authors__Group_1__1__Impl_in_rule__Authors__Group_1__13384);
            rule__Authors__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1712:1: rule__Authors__Group_1__1__Impl : ( ( rule__Authors__NamesAssignment_1_1 ) ) ;
    public final void rule__Authors__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1716:1: ( ( ( rule__Authors__NamesAssignment_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1717:1: ( ( rule__Authors__NamesAssignment_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1717:1: ( ( rule__Authors__NamesAssignment_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1718:1: ( rule__Authors__NamesAssignment_1_1 )
            {
             before(grammarAccess.getAuthorsAccess().getNamesAssignment_1_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1719:1: ( rule__Authors__NamesAssignment_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1719:2: rule__Authors__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Authors__NamesAssignment_1_1_in_rule__Authors__Group_1__1__Impl3411);
            rule__Authors__NamesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAuthorsAccess().getNamesAssignment_1_1()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1733:1: rule__Fullname__Group_0__0 : rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1 ;
    public final void rule__Fullname__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1737:1: ( rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1738:2: rule__Fullname__Group_0__0__Impl rule__Fullname__Group_0__1
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__0__Impl_in_rule__Fullname__Group_0__03445);
            rule__Fullname__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fullname__Group_0__1_in_rule__Fullname__Group_0__03448);
            rule__Fullname__Group_0__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1745:1: rule__Fullname__Group_0__0__Impl : ( ( rule__Fullname__LastnameAssignment_0_0 ) ) ;
    public final void rule__Fullname__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1749:1: ( ( ( rule__Fullname__LastnameAssignment_0_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1750:1: ( ( rule__Fullname__LastnameAssignment_0_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1750:1: ( ( rule__Fullname__LastnameAssignment_0_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1751:1: ( rule__Fullname__LastnameAssignment_0_0 )
            {
             before(grammarAccess.getFullnameAccess().getLastnameAssignment_0_0()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1752:1: ( rule__Fullname__LastnameAssignment_0_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1752:2: rule__Fullname__LastnameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Fullname__LastnameAssignment_0_0_in_rule__Fullname__Group_0__0__Impl3475);
            rule__Fullname__LastnameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFullnameAccess().getLastnameAssignment_0_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1762:1: rule__Fullname__Group_0__1 : rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2 ;
    public final void rule__Fullname__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1766:1: ( rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1767:2: rule__Fullname__Group_0__1__Impl rule__Fullname__Group_0__2
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__1__Impl_in_rule__Fullname__Group_0__13505);
            rule__Fullname__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fullname__Group_0__2_in_rule__Fullname__Group_0__13508);
            rule__Fullname__Group_0__2();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1774:1: rule__Fullname__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Fullname__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1778:1: ( ( ',' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1779:1: ( ',' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1779:1: ( ',' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1780:1: ','
            {
             before(grammarAccess.getFullnameAccess().getCommaKeyword_0_1()); 
            match(input,16,FOLLOW_16_in_rule__Fullname__Group_0__1__Impl3536); 
             after(grammarAccess.getFullnameAccess().getCommaKeyword_0_1()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1793:1: rule__Fullname__Group_0__2 : rule__Fullname__Group_0__2__Impl ;
    public final void rule__Fullname__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1797:1: ( rule__Fullname__Group_0__2__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1798:2: rule__Fullname__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Fullname__Group_0__2__Impl_in_rule__Fullname__Group_0__23567);
            rule__Fullname__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1804:1: rule__Fullname__Group_0__2__Impl : ( ( rule__Fullname__FirstnameAssignment_0_2 ) ) ;
    public final void rule__Fullname__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1808:1: ( ( ( rule__Fullname__FirstnameAssignment_0_2 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1809:1: ( ( rule__Fullname__FirstnameAssignment_0_2 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1809:1: ( ( rule__Fullname__FirstnameAssignment_0_2 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1810:1: ( rule__Fullname__FirstnameAssignment_0_2 )
            {
             before(grammarAccess.getFullnameAccess().getFirstnameAssignment_0_2()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1811:1: ( rule__Fullname__FirstnameAssignment_0_2 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1811:2: rule__Fullname__FirstnameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_0_2_in_rule__Fullname__Group_0__2__Impl3594);
            rule__Fullname__FirstnameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFullnameAccess().getFirstnameAssignment_0_2()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1827:1: rule__Fullname__Group_1__0 : rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1 ;
    public final void rule__Fullname__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1831:1: ( rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1832:2: rule__Fullname__Group_1__0__Impl rule__Fullname__Group_1__1
            {
            pushFollow(FOLLOW_rule__Fullname__Group_1__0__Impl_in_rule__Fullname__Group_1__03630);
            rule__Fullname__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Fullname__Group_1__1_in_rule__Fullname__Group_1__03633);
            rule__Fullname__Group_1__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1839:1: rule__Fullname__Group_1__0__Impl : ( ( rule__Fullname__FirstnameAssignment_1_0 ) ) ;
    public final void rule__Fullname__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1843:1: ( ( ( rule__Fullname__FirstnameAssignment_1_0 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1844:1: ( ( rule__Fullname__FirstnameAssignment_1_0 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1844:1: ( ( rule__Fullname__FirstnameAssignment_1_0 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1845:1: ( rule__Fullname__FirstnameAssignment_1_0 )
            {
             before(grammarAccess.getFullnameAccess().getFirstnameAssignment_1_0()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1846:1: ( rule__Fullname__FirstnameAssignment_1_0 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1846:2: rule__Fullname__FirstnameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Fullname__FirstnameAssignment_1_0_in_rule__Fullname__Group_1__0__Impl3660);
            rule__Fullname__FirstnameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFullnameAccess().getFirstnameAssignment_1_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1856:1: rule__Fullname__Group_1__1 : rule__Fullname__Group_1__1__Impl ;
    public final void rule__Fullname__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1860:1: ( rule__Fullname__Group_1__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1861:2: rule__Fullname__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Fullname__Group_1__1__Impl_in_rule__Fullname__Group_1__13690);
            rule__Fullname__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1867:1: rule__Fullname__Group_1__1__Impl : ( ( rule__Fullname__LastnameAssignment_1_1 ) ) ;
    public final void rule__Fullname__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1871:1: ( ( ( rule__Fullname__LastnameAssignment_1_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1872:1: ( ( rule__Fullname__LastnameAssignment_1_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1872:1: ( ( rule__Fullname__LastnameAssignment_1_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1873:1: ( rule__Fullname__LastnameAssignment_1_1 )
            {
             before(grammarAccess.getFullnameAccess().getLastnameAssignment_1_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1874:1: ( rule__Fullname__LastnameAssignment_1_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1874:2: rule__Fullname__LastnameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Fullname__LastnameAssignment_1_1_in_rule__Fullname__Group_1__1__Impl3717);
            rule__Fullname__LastnameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFullnameAccess().getLastnameAssignment_1_1()); 

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


    // $ANTLR start "rule__TitleField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1888:1: rule__TitleField__Group__0 : rule__TitleField__Group__0__Impl rule__TitleField__Group__1 ;
    public final void rule__TitleField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1892:1: ( rule__TitleField__Group__0__Impl rule__TitleField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1893:2: rule__TitleField__Group__0__Impl rule__TitleField__Group__1
            {
            pushFollow(FOLLOW_rule__TitleField__Group__0__Impl_in_rule__TitleField__Group__03751);
            rule__TitleField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TitleField__Group__1_in_rule__TitleField__Group__03754);
            rule__TitleField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1900:1: rule__TitleField__Group__0__Impl : ( 'title = ' ) ;
    public final void rule__TitleField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1904:1: ( ( 'title = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1905:1: ( 'title = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1905:1: ( 'title = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1906:1: 'title = '
            {
             before(grammarAccess.getTitleFieldAccess().getTitleKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__TitleField__Group__0__Impl3782); 
             after(grammarAccess.getTitleFieldAccess().getTitleKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1919:1: rule__TitleField__Group__1 : rule__TitleField__Group__1__Impl ;
    public final void rule__TitleField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1923:1: ( rule__TitleField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1924:2: rule__TitleField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TitleField__Group__1__Impl_in_rule__TitleField__Group__13813);
            rule__TitleField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1930:1: rule__TitleField__Group__1__Impl : ( ( rule__TitleField__TitleAssignment_1 ) ) ;
    public final void rule__TitleField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1934:1: ( ( ( rule__TitleField__TitleAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1935:1: ( ( rule__TitleField__TitleAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1935:1: ( ( rule__TitleField__TitleAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1936:1: ( rule__TitleField__TitleAssignment_1 )
            {
             before(grammarAccess.getTitleFieldAccess().getTitleAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1937:1: ( rule__TitleField__TitleAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1937:2: rule__TitleField__TitleAssignment_1
            {
            pushFollow(FOLLOW_rule__TitleField__TitleAssignment_1_in_rule__TitleField__Group__1__Impl3840);
            rule__TitleField__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleFieldAccess().getTitleAssignment_1()); 

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


    // $ANTLR start "rule__JournalField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1951:1: rule__JournalField__Group__0 : rule__JournalField__Group__0__Impl rule__JournalField__Group__1 ;
    public final void rule__JournalField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1955:1: ( rule__JournalField__Group__0__Impl rule__JournalField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1956:2: rule__JournalField__Group__0__Impl rule__JournalField__Group__1
            {
            pushFollow(FOLLOW_rule__JournalField__Group__0__Impl_in_rule__JournalField__Group__03874);
            rule__JournalField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JournalField__Group__1_in_rule__JournalField__Group__03877);
            rule__JournalField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1963:1: rule__JournalField__Group__0__Impl : ( 'journal = ' ) ;
    public final void rule__JournalField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1967:1: ( ( 'journal = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1968:1: ( 'journal = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1968:1: ( 'journal = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1969:1: 'journal = '
            {
             before(grammarAccess.getJournalFieldAccess().getJournalKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__JournalField__Group__0__Impl3905); 
             after(grammarAccess.getJournalFieldAccess().getJournalKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1982:1: rule__JournalField__Group__1 : rule__JournalField__Group__1__Impl ;
    public final void rule__JournalField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1986:1: ( rule__JournalField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1987:2: rule__JournalField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JournalField__Group__1__Impl_in_rule__JournalField__Group__13936);
            rule__JournalField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1993:1: rule__JournalField__Group__1__Impl : ( ( rule__JournalField__JournalAssignment_1 ) ) ;
    public final void rule__JournalField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1997:1: ( ( ( rule__JournalField__JournalAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1998:1: ( ( rule__JournalField__JournalAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1998:1: ( ( rule__JournalField__JournalAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:1999:1: ( rule__JournalField__JournalAssignment_1 )
            {
             before(grammarAccess.getJournalFieldAccess().getJournalAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2000:1: ( rule__JournalField__JournalAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2000:2: rule__JournalField__JournalAssignment_1
            {
            pushFollow(FOLLOW_rule__JournalField__JournalAssignment_1_in_rule__JournalField__Group__1__Impl3963);
            rule__JournalField__JournalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJournalFieldAccess().getJournalAssignment_1()); 

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


    // $ANTLR start "rule__YearField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2014:1: rule__YearField__Group__0 : rule__YearField__Group__0__Impl rule__YearField__Group__1 ;
    public final void rule__YearField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2018:1: ( rule__YearField__Group__0__Impl rule__YearField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2019:2: rule__YearField__Group__0__Impl rule__YearField__Group__1
            {
            pushFollow(FOLLOW_rule__YearField__Group__0__Impl_in_rule__YearField__Group__03997);
            rule__YearField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__YearField__Group__1_in_rule__YearField__Group__04000);
            rule__YearField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2026:1: rule__YearField__Group__0__Impl : ( 'year = ' ) ;
    public final void rule__YearField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2030:1: ( ( 'year = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2031:1: ( 'year = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2031:1: ( 'year = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2032:1: 'year = '
            {
             before(grammarAccess.getYearFieldAccess().getYearKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__YearField__Group__0__Impl4028); 
             after(grammarAccess.getYearFieldAccess().getYearKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2045:1: rule__YearField__Group__1 : rule__YearField__Group__1__Impl ;
    public final void rule__YearField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2049:1: ( rule__YearField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2050:2: rule__YearField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__YearField__Group__1__Impl_in_rule__YearField__Group__14059);
            rule__YearField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2056:1: rule__YearField__Group__1__Impl : ( ( rule__YearField__YearAssignment_1 ) ) ;
    public final void rule__YearField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2060:1: ( ( ( rule__YearField__YearAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2061:1: ( ( rule__YearField__YearAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2061:1: ( ( rule__YearField__YearAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2062:1: ( rule__YearField__YearAssignment_1 )
            {
             before(grammarAccess.getYearFieldAccess().getYearAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2063:1: ( rule__YearField__YearAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2063:2: rule__YearField__YearAssignment_1
            {
            pushFollow(FOLLOW_rule__YearField__YearAssignment_1_in_rule__YearField__Group__1__Impl4086);
            rule__YearField__YearAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getYearFieldAccess().getYearAssignment_1()); 

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


    // $ANTLR start "rule__VolumeField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2077:1: rule__VolumeField__Group__0 : rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1 ;
    public final void rule__VolumeField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2081:1: ( rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2082:2: rule__VolumeField__Group__0__Impl rule__VolumeField__Group__1
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__0__Impl_in_rule__VolumeField__Group__04120);
            rule__VolumeField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VolumeField__Group__1_in_rule__VolumeField__Group__04123);
            rule__VolumeField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2089:1: rule__VolumeField__Group__0__Impl : ( 'volume = ' ) ;
    public final void rule__VolumeField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2093:1: ( ( 'volume = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2094:1: ( 'volume = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2094:1: ( 'volume = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2095:1: 'volume = '
            {
             before(grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__VolumeField__Group__0__Impl4151); 
             after(grammarAccess.getVolumeFieldAccess().getVolumeKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2108:1: rule__VolumeField__Group__1 : rule__VolumeField__Group__1__Impl ;
    public final void rule__VolumeField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2112:1: ( rule__VolumeField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2113:2: rule__VolumeField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VolumeField__Group__1__Impl_in_rule__VolumeField__Group__14182);
            rule__VolumeField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2119:1: rule__VolumeField__Group__1__Impl : ( ( rule__VolumeField__VolumeAssignment_1 ) ) ;
    public final void rule__VolumeField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2123:1: ( ( ( rule__VolumeField__VolumeAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2124:1: ( ( rule__VolumeField__VolumeAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2124:1: ( ( rule__VolumeField__VolumeAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2125:1: ( rule__VolumeField__VolumeAssignment_1 )
            {
             before(grammarAccess.getVolumeFieldAccess().getVolumeAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2126:1: ( rule__VolumeField__VolumeAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2126:2: rule__VolumeField__VolumeAssignment_1
            {
            pushFollow(FOLLOW_rule__VolumeField__VolumeAssignment_1_in_rule__VolumeField__Group__1__Impl4209);
            rule__VolumeField__VolumeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVolumeFieldAccess().getVolumeAssignment_1()); 

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


    // $ANTLR start "rule__NumberField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2140:1: rule__NumberField__Group__0 : rule__NumberField__Group__0__Impl rule__NumberField__Group__1 ;
    public final void rule__NumberField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2144:1: ( rule__NumberField__Group__0__Impl rule__NumberField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2145:2: rule__NumberField__Group__0__Impl rule__NumberField__Group__1
            {
            pushFollow(FOLLOW_rule__NumberField__Group__0__Impl_in_rule__NumberField__Group__04243);
            rule__NumberField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NumberField__Group__1_in_rule__NumberField__Group__04246);
            rule__NumberField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2152:1: rule__NumberField__Group__0__Impl : ( 'number = ' ) ;
    public final void rule__NumberField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2156:1: ( ( 'number = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2157:1: ( 'number = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2157:1: ( 'number = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2158:1: 'number = '
            {
             before(grammarAccess.getNumberFieldAccess().getNumberKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__NumberField__Group__0__Impl4274); 
             after(grammarAccess.getNumberFieldAccess().getNumberKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2171:1: rule__NumberField__Group__1 : rule__NumberField__Group__1__Impl ;
    public final void rule__NumberField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2175:1: ( rule__NumberField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2176:2: rule__NumberField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NumberField__Group__1__Impl_in_rule__NumberField__Group__14305);
            rule__NumberField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2182:1: rule__NumberField__Group__1__Impl : ( ( rule__NumberField__NumberAssignment_1 ) ) ;
    public final void rule__NumberField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2186:1: ( ( ( rule__NumberField__NumberAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2187:1: ( ( rule__NumberField__NumberAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2187:1: ( ( rule__NumberField__NumberAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2188:1: ( rule__NumberField__NumberAssignment_1 )
            {
             before(grammarAccess.getNumberFieldAccess().getNumberAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2189:1: ( rule__NumberField__NumberAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2189:2: rule__NumberField__NumberAssignment_1
            {
            pushFollow(FOLLOW_rule__NumberField__NumberAssignment_1_in_rule__NumberField__Group__1__Impl4332);
            rule__NumberField__NumberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberFieldAccess().getNumberAssignment_1()); 

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


    // $ANTLR start "rule__PagesField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2203:1: rule__PagesField__Group__0 : rule__PagesField__Group__0__Impl rule__PagesField__Group__1 ;
    public final void rule__PagesField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2207:1: ( rule__PagesField__Group__0__Impl rule__PagesField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2208:2: rule__PagesField__Group__0__Impl rule__PagesField__Group__1
            {
            pushFollow(FOLLOW_rule__PagesField__Group__0__Impl_in_rule__PagesField__Group__04366);
            rule__PagesField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PagesField__Group__1_in_rule__PagesField__Group__04369);
            rule__PagesField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2215:1: rule__PagesField__Group__0__Impl : ( 'pages = ' ) ;
    public final void rule__PagesField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2219:1: ( ( 'pages = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2220:1: ( 'pages = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2220:1: ( 'pages = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2221:1: 'pages = '
            {
             before(grammarAccess.getPagesFieldAccess().getPagesKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__PagesField__Group__0__Impl4397); 
             after(grammarAccess.getPagesFieldAccess().getPagesKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2234:1: rule__PagesField__Group__1 : rule__PagesField__Group__1__Impl ;
    public final void rule__PagesField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2238:1: ( rule__PagesField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2239:2: rule__PagesField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PagesField__Group__1__Impl_in_rule__PagesField__Group__14428);
            rule__PagesField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2245:1: rule__PagesField__Group__1__Impl : ( ( rule__PagesField__PagesAssignment_1 ) ) ;
    public final void rule__PagesField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2249:1: ( ( ( rule__PagesField__PagesAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2250:1: ( ( rule__PagesField__PagesAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2250:1: ( ( rule__PagesField__PagesAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2251:1: ( rule__PagesField__PagesAssignment_1 )
            {
             before(grammarAccess.getPagesFieldAccess().getPagesAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2252:1: ( rule__PagesField__PagesAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2252:2: rule__PagesField__PagesAssignment_1
            {
            pushFollow(FOLLOW_rule__PagesField__PagesAssignment_1_in_rule__PagesField__Group__1__Impl4455);
            rule__PagesField__PagesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPagesFieldAccess().getPagesAssignment_1()); 

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


    // $ANTLR start "rule__MonthField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2266:1: rule__MonthField__Group__0 : rule__MonthField__Group__0__Impl rule__MonthField__Group__1 ;
    public final void rule__MonthField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2270:1: ( rule__MonthField__Group__0__Impl rule__MonthField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2271:2: rule__MonthField__Group__0__Impl rule__MonthField__Group__1
            {
            pushFollow(FOLLOW_rule__MonthField__Group__0__Impl_in_rule__MonthField__Group__04489);
            rule__MonthField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MonthField__Group__1_in_rule__MonthField__Group__04492);
            rule__MonthField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2278:1: rule__MonthField__Group__0__Impl : ( 'month = ' ) ;
    public final void rule__MonthField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2282:1: ( ( 'month = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2283:1: ( 'month = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2283:1: ( 'month = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2284:1: 'month = '
            {
             before(grammarAccess.getMonthFieldAccess().getMonthKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__MonthField__Group__0__Impl4520); 
             after(grammarAccess.getMonthFieldAccess().getMonthKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2297:1: rule__MonthField__Group__1 : rule__MonthField__Group__1__Impl ;
    public final void rule__MonthField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2301:1: ( rule__MonthField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2302:2: rule__MonthField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MonthField__Group__1__Impl_in_rule__MonthField__Group__14551);
            rule__MonthField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2308:1: rule__MonthField__Group__1__Impl : ( ( rule__MonthField__MonthAssignment_1 ) ) ;
    public final void rule__MonthField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2312:1: ( ( ( rule__MonthField__MonthAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2313:1: ( ( rule__MonthField__MonthAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2313:1: ( ( rule__MonthField__MonthAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2314:1: ( rule__MonthField__MonthAssignment_1 )
            {
             before(grammarAccess.getMonthFieldAccess().getMonthAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2315:1: ( rule__MonthField__MonthAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2315:2: rule__MonthField__MonthAssignment_1
            {
            pushFollow(FOLLOW_rule__MonthField__MonthAssignment_1_in_rule__MonthField__Group__1__Impl4578);
            rule__MonthField__MonthAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMonthFieldAccess().getMonthAssignment_1()); 

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


    // $ANTLR start "rule__NoteField__Group__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2329:1: rule__NoteField__Group__0 : rule__NoteField__Group__0__Impl rule__NoteField__Group__1 ;
    public final void rule__NoteField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2333:1: ( rule__NoteField__Group__0__Impl rule__NoteField__Group__1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2334:2: rule__NoteField__Group__0__Impl rule__NoteField__Group__1
            {
            pushFollow(FOLLOW_rule__NoteField__Group__0__Impl_in_rule__NoteField__Group__04612);
            rule__NoteField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoteField__Group__1_in_rule__NoteField__Group__04615);
            rule__NoteField__Group__1();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2341:1: rule__NoteField__Group__0__Impl : ( 'note = ' ) ;
    public final void rule__NoteField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2345:1: ( ( 'note = ' ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2346:1: ( 'note = ' )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2346:1: ( 'note = ' )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2347:1: 'note = '
            {
             before(grammarAccess.getNoteFieldAccess().getNoteKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__NoteField__Group__0__Impl4643); 
             after(grammarAccess.getNoteFieldAccess().getNoteKeyword_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2360:1: rule__NoteField__Group__1 : rule__NoteField__Group__1__Impl ;
    public final void rule__NoteField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2364:1: ( rule__NoteField__Group__1__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2365:2: rule__NoteField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoteField__Group__1__Impl_in_rule__NoteField__Group__14674);
            rule__NoteField__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2371:1: rule__NoteField__Group__1__Impl : ( ( rule__NoteField__NoteAssignment_1 ) ) ;
    public final void rule__NoteField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2375:1: ( ( ( rule__NoteField__NoteAssignment_1 ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2376:1: ( ( rule__NoteField__NoteAssignment_1 ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2376:1: ( ( rule__NoteField__NoteAssignment_1 ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2377:1: ( rule__NoteField__NoteAssignment_1 )
            {
             before(grammarAccess.getNoteFieldAccess().getNoteAssignment_1()); 
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2378:1: ( rule__NoteField__NoteAssignment_1 )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2378:2: rule__NoteField__NoteAssignment_1
            {
            pushFollow(FOLLOW_rule__NoteField__NoteAssignment_1_in_rule__NoteField__Group__1__Impl4701);
            rule__NoteField__NoteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoteFieldAccess().getNoteAssignment_1()); 

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


    // $ANTLR start "rule__Article__UnorderedGroup"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2393:1: rule__Article__UnorderedGroup : rule__Article__UnorderedGroup__0 {...}?;
    public final void rule__Article__UnorderedGroup() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getArticleAccess().getUnorderedGroup());
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2398:1: ( rule__Article__UnorderedGroup__0 {...}?)
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2399:2: rule__Article__UnorderedGroup__0 {...}?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__0_in_rule__Article__UnorderedGroup4736);
            rule__Article__UnorderedGroup__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "rule__Article__UnorderedGroup", "getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getArticleAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup"


    // $ANTLR start "rule__Article__UnorderedGroup__Impl"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2410:1: rule__Article__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) ) ) ;
    public final void rule__Article__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2415:1: ( ( ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) ) ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2416:3: ( ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) ) )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2416:3: ( ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) ) )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2418:4: ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2418:4: ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2419:5: {...}? => ( ( ( rule__Article__Group_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2419:102: ( ( ( rule__Article__Group_0__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2420:6: ( ( rule__Article__Group_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2426:6: ( ( rule__Article__Group_0__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2428:7: ( rule__Article__Group_0__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_0()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2429:7: ( rule__Article__Group_0__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2429:8: rule__Article__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_0__0_in_rule__Article__UnorderedGroup__Impl4825);
                    rule__Article__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2435:4: ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2435:4: ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2436:5: {...}? => ( ( ( rule__Article__Group_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2436:102: ( ( ( rule__Article__Group_1__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2437:6: ( ( rule__Article__Group_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2443:6: ( ( rule__Article__Group_1__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2445:7: ( rule__Article__Group_1__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_1()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2446:7: ( rule__Article__Group_1__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2446:8: rule__Article__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_1__0_in_rule__Article__UnorderedGroup__Impl4916);
                    rule__Article__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2452:4: ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2452:4: ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2453:5: {...}? => ( ( ( rule__Article__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2453:102: ( ( ( rule__Article__Group_2__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2454:6: ( ( rule__Article__Group_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2460:6: ( ( rule__Article__Group_2__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2462:7: ( rule__Article__Group_2__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_2()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2463:7: ( rule__Article__Group_2__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2463:8: rule__Article__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_2__0_in_rule__Article__UnorderedGroup__Impl5007);
                    rule__Article__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2469:4: ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2469:4: ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2470:5: {...}? => ( ( ( rule__Article__Group_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2470:102: ( ( ( rule__Article__Group_3__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2471:6: ( ( rule__Article__Group_3__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 3);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2477:6: ( ( rule__Article__Group_3__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2479:7: ( rule__Article__Group_3__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_3()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2480:7: ( rule__Article__Group_3__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2480:8: rule__Article__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_3__0_in_rule__Article__UnorderedGroup__Impl5098);
                    rule__Article__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2486:4: ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2486:4: ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2487:5: {...}? => ( ( ( rule__Article__Group_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2487:102: ( ( ( rule__Article__Group_4__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2488:6: ( ( rule__Article__Group_4__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 4);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2494:6: ( ( rule__Article__Group_4__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2496:7: ( rule__Article__Group_4__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_4()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2497:7: ( rule__Article__Group_4__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2497:8: rule__Article__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_4__0_in_rule__Article__UnorderedGroup__Impl5189);
                    rule__Article__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2503:4: ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2503:4: ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2504:5: {...}? => ( ( ( rule__Article__Group_5__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2504:102: ( ( ( rule__Article__Group_5__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2505:6: ( ( rule__Article__Group_5__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 5);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2511:6: ( ( rule__Article__Group_5__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2513:7: ( rule__Article__Group_5__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_5()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2514:7: ( rule__Article__Group_5__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2514:8: rule__Article__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_5__0_in_rule__Article__UnorderedGroup__Impl5280);
                    rule__Article__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_5()); 

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2520:4: ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2520:4: ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2521:5: {...}? => ( ( ( rule__Article__Group_6__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2521:102: ( ( ( rule__Article__Group_6__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2522:6: ( ( rule__Article__Group_6__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 6);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2528:6: ( ( rule__Article__Group_6__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2530:7: ( rule__Article__Group_6__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_6()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2531:7: ( rule__Article__Group_6__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2531:8: rule__Article__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_6__0_in_rule__Article__UnorderedGroup__Impl5371);
                    rule__Article__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_6()); 

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2537:4: ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2537:4: ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2538:5: {...}? => ( ( ( rule__Article__Group_7__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2538:102: ( ( ( rule__Article__Group_7__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2539:6: ( ( rule__Article__Group_7__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 7);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2545:6: ( ( rule__Article__Group_7__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2547:7: ( rule__Article__Group_7__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_7()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2548:7: ( rule__Article__Group_7__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2548:8: rule__Article__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_7__0_in_rule__Article__UnorderedGroup__Impl5462);
                    rule__Article__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_7()); 

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2554:4: ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) )
                    {
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2554:4: ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2555:5: {...}? => ( ( ( rule__Article__Group_8__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {
                        throw new FailedPredicateException(input, "rule__Article__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8)");
                    }
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2555:102: ( ( ( rule__Article__Group_8__0 ) ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2556:6: ( ( rule__Article__Group_8__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getArticleAccess().getUnorderedGroup(), 8);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2562:6: ( ( rule__Article__Group_8__0 ) )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2564:7: ( rule__Article__Group_8__0 )
                    {
                     before(grammarAccess.getArticleAccess().getGroup_8()); 
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2565:7: ( rule__Article__Group_8__0 )
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2565:8: rule__Article__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__Article__Group_8__0_in_rule__Article__UnorderedGroup__Impl5553);
                    rule__Article__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArticleAccess().getGroup_8()); 

                    }


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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getArticleAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup__Impl"


    // $ANTLR start "rule__Article__UnorderedGroup__0"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2580:1: rule__Article__UnorderedGroup__0 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__1 )? ;
    public final void rule__Article__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2584:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__1 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2585:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__05612);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2586:2: ( rule__Article__UnorderedGroup__1 )?
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2586:2: rule__Article__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__1_in_rule__Article__UnorderedGroup__05615);
                    rule__Article__UnorderedGroup__1();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__0"


    // $ANTLR start "rule__Article__UnorderedGroup__1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2593:1: rule__Article__UnorderedGroup__1 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__2 )? ;
    public final void rule__Article__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2597:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__2 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2598:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__15640);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2599:2: ( rule__Article__UnorderedGroup__2 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2599:2: rule__Article__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__2_in_rule__Article__UnorderedGroup__15643);
                    rule__Article__UnorderedGroup__2();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__1"


    // $ANTLR start "rule__Article__UnorderedGroup__2"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2606:1: rule__Article__UnorderedGroup__2 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__3 )? ;
    public final void rule__Article__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2610:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__3 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2611:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__25668);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2612:2: ( rule__Article__UnorderedGroup__3 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2612:2: rule__Article__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__3_in_rule__Article__UnorderedGroup__25671);
                    rule__Article__UnorderedGroup__3();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__2"


    // $ANTLR start "rule__Article__UnorderedGroup__3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2619:1: rule__Article__UnorderedGroup__3 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__4 )? ;
    public final void rule__Article__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2623:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__4 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2624:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__4 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__35696);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2625:2: ( rule__Article__UnorderedGroup__4 )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2625:2: rule__Article__UnorderedGroup__4
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__4_in_rule__Article__UnorderedGroup__35699);
                    rule__Article__UnorderedGroup__4();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__3"


    // $ANTLR start "rule__Article__UnorderedGroup__4"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2632:1: rule__Article__UnorderedGroup__4 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__5 )? ;
    public final void rule__Article__UnorderedGroup__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2636:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__5 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2637:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__5 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__45724);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2638:2: ( rule__Article__UnorderedGroup__5 )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2638:2: rule__Article__UnorderedGroup__5
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__5_in_rule__Article__UnorderedGroup__45727);
                    rule__Article__UnorderedGroup__5();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__4"


    // $ANTLR start "rule__Article__UnorderedGroup__5"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2645:1: rule__Article__UnorderedGroup__5 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__6 )? ;
    public final void rule__Article__UnorderedGroup__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2649:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__6 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2650:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__6 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__55752);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2651:2: ( rule__Article__UnorderedGroup__6 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2651:2: rule__Article__UnorderedGroup__6
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__6_in_rule__Article__UnorderedGroup__55755);
                    rule__Article__UnorderedGroup__6();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__5"


    // $ANTLR start "rule__Article__UnorderedGroup__6"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2658:1: rule__Article__UnorderedGroup__6 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__7 )? ;
    public final void rule__Article__UnorderedGroup__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2662:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__7 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2663:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__7 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__65780);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2664:2: ( rule__Article__UnorderedGroup__7 )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2664:2: rule__Article__UnorderedGroup__7
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__7_in_rule__Article__UnorderedGroup__65783);
                    rule__Article__UnorderedGroup__7();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__6"


    // $ANTLR start "rule__Article__UnorderedGroup__7"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2671:1: rule__Article__UnorderedGroup__7 : rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__8 )? ;
    public final void rule__Article__UnorderedGroup__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2675:1: ( rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__8 )? )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2676:2: rule__Article__UnorderedGroup__Impl ( rule__Article__UnorderedGroup__8 )?
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__75808);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;

            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2677:2: ( rule__Article__UnorderedGroup__8 )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2677:2: rule__Article__UnorderedGroup__8
                    {
                    pushFollow(FOLLOW_rule__Article__UnorderedGroup__8_in_rule__Article__UnorderedGroup__75811);
                    rule__Article__UnorderedGroup__8();

                    state._fsp--;


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
    // $ANTLR end "rule__Article__UnorderedGroup__7"


    // $ANTLR start "rule__Article__UnorderedGroup__8"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2684:1: rule__Article__UnorderedGroup__8 : rule__Article__UnorderedGroup__Impl ;
    public final void rule__Article__UnorderedGroup__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2688:1: ( rule__Article__UnorderedGroup__Impl )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2689:2: rule__Article__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__85836);
            rule__Article__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Article__UnorderedGroup__8"


    // $ANTLR start "rule__Model__BibtexEntriesAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2714:1: rule__Model__BibtexEntriesAssignment : ( ruleBibtexEntryTypes ) ;
    public final void rule__Model__BibtexEntriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2718:1: ( ( ruleBibtexEntryTypes ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2719:1: ( ruleBibtexEntryTypes )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2719:1: ( ruleBibtexEntryTypes )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2720:1: ruleBibtexEntryTypes
            {
             before(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleBibtexEntryTypes_in_rule__Model__BibtexEntriesAssignment5882);
            ruleBibtexEntryTypes();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBibtexEntriesBibtexEntryTypesParserRuleCall_0()); 

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


    // $ANTLR start "rule__Article__KeyAssignment_0_3"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2729:1: rule__Article__KeyAssignment_0_3 : ( ruleCiteKey ) ;
    public final void rule__Article__KeyAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2733:1: ( ( ruleCiteKey ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2734:1: ( ruleCiteKey )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2734:1: ( ruleCiteKey )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2735:1: ruleCiteKey
            {
             before(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleCiteKey_in_rule__Article__KeyAssignment_0_35913);
            ruleCiteKey();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getKeyCiteKeyParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Article__KeyAssignment_0_3"


    // $ANTLR start "rule__Article__AuthorAssignment_0_4_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2744:1: rule__Article__AuthorAssignment_0_4_1 : ( ruleAuthorField ) ;
    public final void rule__Article__AuthorAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2748:1: ( ( ruleAuthorField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2749:1: ( ruleAuthorField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2749:1: ( ruleAuthorField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2750:1: ruleAuthorField
            {
             before(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_ruleAuthorField_in_rule__Article__AuthorAssignment_0_4_15944);
            ruleAuthorField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getAuthorAuthorFieldParserRuleCall_0_4_1_0()); 

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
    // $ANTLR end "rule__Article__AuthorAssignment_0_4_1"


    // $ANTLR start "rule__Article__TitleAssignment_1_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2759:1: rule__Article__TitleAssignment_1_1 : ( ruleTitleField ) ;
    public final void rule__Article__TitleAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2763:1: ( ( ruleTitleField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2764:1: ( ruleTitleField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2764:1: ( ruleTitleField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2765:1: ruleTitleField
            {
             before(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleTitleField_in_rule__Article__TitleAssignment_1_15975);
            ruleTitleField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getTitleTitleFieldParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Article__TitleAssignment_1_1"


    // $ANTLR start "rule__Article__JournalAssignment_2_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2774:1: rule__Article__JournalAssignment_2_1 : ( ruleJournalField ) ;
    public final void rule__Article__JournalAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2778:1: ( ( ruleJournalField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2779:1: ( ruleJournalField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2779:1: ( ruleJournalField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2780:1: ruleJournalField
            {
             before(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleJournalField_in_rule__Article__JournalAssignment_2_16006);
            ruleJournalField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getJournalJournalFieldParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Article__JournalAssignment_2_1"


    // $ANTLR start "rule__Article__YearAssignment_3_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2789:1: rule__Article__YearAssignment_3_1 : ( ruleYearField ) ;
    public final void rule__Article__YearAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2793:1: ( ( ruleYearField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2794:1: ( ruleYearField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2794:1: ( ruleYearField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2795:1: ruleYearField
            {
             before(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleYearField_in_rule__Article__YearAssignment_3_16037);
            ruleYearField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getYearYearFieldParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Article__YearAssignment_3_1"


    // $ANTLR start "rule__Article__VolumeAssignment_4_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2804:1: rule__Article__VolumeAssignment_4_1 : ( ruleVolumeField ) ;
    public final void rule__Article__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2808:1: ( ( ruleVolumeField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2809:1: ( ruleVolumeField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2809:1: ( ruleVolumeField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2810:1: ruleVolumeField
            {
             before(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleVolumeField_in_rule__Article__VolumeAssignment_4_16068);
            ruleVolumeField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getVolumeVolumeFieldParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Article__VolumeAssignment_4_1"


    // $ANTLR start "rule__Article__NumberAssignment_5_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2819:1: rule__Article__NumberAssignment_5_1 : ( ruleNumberField ) ;
    public final void rule__Article__NumberAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2823:1: ( ( ruleNumberField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2824:1: ( ruleNumberField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2824:1: ( ruleNumberField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2825:1: ruleNumberField
            {
             before(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleNumberField_in_rule__Article__NumberAssignment_5_16099);
            ruleNumberField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getNumberNumberFieldParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Article__NumberAssignment_5_1"


    // $ANTLR start "rule__Article__PagesAssignment_6_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2834:1: rule__Article__PagesAssignment_6_1 : ( rulePagesField ) ;
    public final void rule__Article__PagesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2838:1: ( ( rulePagesField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2839:1: ( rulePagesField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2839:1: ( rulePagesField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2840:1: rulePagesField
            {
             before(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_rulePagesField_in_rule__Article__PagesAssignment_6_16130);
            rulePagesField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getPagesPagesFieldParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Article__PagesAssignment_6_1"


    // $ANTLR start "rule__Article__MonthAssignment_7_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2849:1: rule__Article__MonthAssignment_7_1 : ( ruleMonthField ) ;
    public final void rule__Article__MonthAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2853:1: ( ( ruleMonthField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2854:1: ( ruleMonthField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2854:1: ( ruleMonthField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2855:1: ruleMonthField
            {
             before(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleMonthField_in_rule__Article__MonthAssignment_7_16161);
            ruleMonthField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getMonthMonthFieldParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Article__MonthAssignment_7_1"


    // $ANTLR start "rule__Article__NoteAssignment_8_0_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2864:1: rule__Article__NoteAssignment_8_0_1 : ( ruleNoteField ) ;
    public final void rule__Article__NoteAssignment_8_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2868:1: ( ( ruleNoteField ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2869:1: ( ruleNoteField )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2869:1: ( ruleNoteField )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2870:1: ruleNoteField
            {
             before(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_8_0_1_0()); 
            pushFollow(FOLLOW_ruleNoteField_in_rule__Article__NoteAssignment_8_0_16192);
            ruleNoteField();

            state._fsp--;

             after(grammarAccess.getArticleAccess().getNoteNoteFieldParserRuleCall_8_0_1_0()); 

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
    // $ANTLR end "rule__Article__NoteAssignment_8_0_1"


    // $ANTLR start "rule__CiteKey__KeyAssignment"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2879:1: rule__CiteKey__KeyAssignment : ( RULE_ID ) ;
    public final void rule__CiteKey__KeyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2883:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2884:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2884:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2885:1: RULE_ID
            {
             before(grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CiteKey__KeyAssignment6223); 
             after(grammarAccess.getCiteKeyAccess().getKeyIDTerminalRuleCall_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2894:1: rule__Authors__NamesAssignment_0 : ( ruleFullname ) ;
    public final void rule__Authors__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2898:1: ( ( ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2899:1: ( ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2899:1: ( ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2900:1: ruleFullname
            {
             before(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_06254);
            ruleFullname();

            state._fsp--;

             after(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_0_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2909:1: rule__Authors__NamesAssignment_1_1 : ( ruleFullname ) ;
    public final void rule__Authors__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2913:1: ( ( ruleFullname ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2914:1: ( ruleFullname )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2914:1: ( ruleFullname )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2915:1: ruleFullname
            {
             before(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_1_16285);
            ruleFullname();

            state._fsp--;

             after(grammarAccess.getAuthorsAccess().getNamesFullnameParserRuleCall_1_1_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2924:1: rule__Fullname__LastnameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Fullname__LastnameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2928:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2929:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2929:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2930:1: RULE_ID
            {
             before(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_0_06316); 
             after(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_0_0_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2939:1: rule__Fullname__FirstnameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2943:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2944:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2944:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2945:1: RULE_ID
            {
             before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_0_26347); 
             after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_0_2_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2954:1: rule__Fullname__FirstnameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2958:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2959:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2959:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2960:1: RULE_ID
            {
             before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_1_06378); 
             after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_1_0_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2969:1: rule__Fullname__LastnameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Fullname__LastnameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2973:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2974:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2974:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2975:1: RULE_ID
            {
             before(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_1_16409); 
             after(grammarAccess.getFullnameAccess().getLastnameIDTerminalRuleCall_1_1_0()); 

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
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2984:1: rule__Fullname__FirstnameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Fullname__FirstnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2988:1: ( ( RULE_ID ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2989:1: ( RULE_ID )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2989:1: ( RULE_ID )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2990:1: RULE_ID
            {
             before(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_26440); 
             after(grammarAccess.getFullnameAccess().getFirstnameIDTerminalRuleCall_2_0()); 

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


    // $ANTLR start "rule__TitleField__TitleAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:2999:1: rule__TitleField__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TitleField__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3003:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3004:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3004:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3005:1: RULE_STRING
            {
             before(grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TitleField__TitleAssignment_16471); 
             after(grammarAccess.getTitleFieldAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TitleField__TitleAssignment_1"


    // $ANTLR start "rule__JournalField__JournalAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3014:1: rule__JournalField__JournalAssignment_1 : ( RULE_STRING ) ;
    public final void rule__JournalField__JournalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3018:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3019:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3019:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3020:1: RULE_STRING
            {
             before(grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JournalField__JournalAssignment_16502); 
             after(grammarAccess.getJournalFieldAccess().getJournalSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__JournalField__JournalAssignment_1"


    // $ANTLR start "rule__YearField__YearAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3029:1: rule__YearField__YearAssignment_1 : ( RULE_STRING ) ;
    public final void rule__YearField__YearAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3033:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3034:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3034:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3035:1: RULE_STRING
            {
             before(grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__YearField__YearAssignment_16533); 
             after(grammarAccess.getYearFieldAccess().getYearSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__YearField__YearAssignment_1"


    // $ANTLR start "rule__VolumeField__VolumeAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3044:1: rule__VolumeField__VolumeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__VolumeField__VolumeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3048:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3049:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3049:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3050:1: RULE_STRING
            {
             before(grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__VolumeField__VolumeAssignment_16564); 
             after(grammarAccess.getVolumeFieldAccess().getVolumeSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VolumeField__VolumeAssignment_1"


    // $ANTLR start "rule__NumberField__NumberAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3059:1: rule__NumberField__NumberAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NumberField__NumberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3063:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3064:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3064:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3065:1: RULE_STRING
            {
             before(grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NumberField__NumberAssignment_16595); 
             after(grammarAccess.getNumberFieldAccess().getNumberSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberField__NumberAssignment_1"


    // $ANTLR start "rule__PagesField__PagesAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3074:1: rule__PagesField__PagesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PagesField__PagesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3078:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3079:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3079:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3080:1: RULE_STRING
            {
             before(grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PagesField__PagesAssignment_16626); 
             after(grammarAccess.getPagesFieldAccess().getPagesSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PagesField__PagesAssignment_1"


    // $ANTLR start "rule__MonthField__MonthAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3089:1: rule__MonthField__MonthAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MonthField__MonthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3093:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3094:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3094:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3095:1: RULE_STRING
            {
             before(grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MonthField__MonthAssignment_16657); 
             after(grammarAccess.getMonthFieldAccess().getMonthSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MonthField__MonthAssignment_1"


    // $ANTLR start "rule__NoteField__NoteAssignment_1"
    // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3104:1: rule__NoteField__NoteAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NoteField__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3108:1: ( ( RULE_STRING ) )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3109:1: ( RULE_STRING )
            {
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3109:1: ( RULE_STRING )
            // ../de.tubs.bibtextohtml.bibtex.ui/src-gen/de/tubs/bibtextohtml/bibtex/ui/contentassist/antlr/internal/InternalBibTeX.g:3110:1: RULE_STRING
            {
             before(grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NoteField__NoteAssignment_16688); 
             after(grammarAccess.getNoteFieldAccess().getNoteSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NoteField__NoteAssignment_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\16\1\uffff\1\25\10\uffff";
    static final String DFA7_maxS =
        "\1\21\1\uffff\1\34\10\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\uffff\1\11\1\4\1\5\1\6\1\7\1\2\1\10\1\3";
    static final String DFA7_specialS =
        "\1\1\1\uffff\1\0\10\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "",
            "\1\10\1\12\1\4\1\5\1\6\1\7\1\11\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "2416:3: ( ({...}? => ( ( ( rule__Article__Group_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_4__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_5__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_6__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_7__0 ) ) ) ) | ({...}? => ( ( ( rule__Article__Group_8__0 ) ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA7_2 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 4;}

                        else if ( LA7_2 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 5;}

                        else if ( LA7_2 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 6;}

                        else if ( LA7_2 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 7;}

                        else if ( LA7_2 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( LA7_2 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 9;}

                        else if ( LA7_2 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 10;}

                        else if ( LA7_2 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 3;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_0 = input.LA(1);

                         
                        int index7_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA7_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 1;}

                        else if ( LA7_0 ==16 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) || getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) ) {s = 2;}

                        else if ( LA7_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 3;}

                         
                        input.seek(index7_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\63\uffff";
    static final String DFA8_eofS =
        "\1\4\62\uffff";
    static final String DFA8_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\2\0\1\21\5\0"+
        "\1\20\1\22\1\17\5\4\1\23\1\4\1\0\1\21\1\4\1\0\1\4\1\23\2\4\1\21"+
        "\1\4\1\23\1\4\1\21\1\23\1\21";
    static final String DFA8_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\2\0\1\21\5\0"+
        "\1\20\1\22\1\23\2\4\2\24\1\4\1\24\1\4\1\0\1\24\1\4\1\0\1\4\4\24"+
        "\1\4\1\24\1\4\3\24";
    static final String DFA8_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA8_specialS =
        "\3\uffff\1\3\16\uffff\1\5\1\1\1\uffff\1\6\1\2\1\7\1\4\1\0\12\uffff"+
        "\1\11\2\uffff\1\10\13\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\13\1\14\1\15\1\16\1\17\1\10\1\11\1\12",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\13\uffff\1\41\2\uffff\1\44\1\43",
            "\1\45\13\uffff\1\50\1\47\2\uffff\1\46",
            "\1\51",
            "\1\44\1\43",
            "\1\52",
            "\1\uffff",
            "\1\47\2\uffff\1\46",
            "\1\53",
            "\1\uffff",
            "\1\54",
            "\1\44\1\43",
            "\1\56\13\uffff\1\55\2\uffff\1\44\1\43",
            "\1\60\13\uffff\1\57\1\47\2\uffff\1\46",
            "\1\47\2\uffff\1\46",
            "\1\61",
            "\1\44\1\43",
            "\1\62",
            "\1\47\2\uffff\1\46",
            "\1\44\1\43",
            "\1\47\2\uffff\1\46"
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
            return "2586:2: ( rule__Article__UnorderedGroup__1 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_25 = input.LA(1);

                         
                        int index8_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_19 = input.LA(1);

                         
                        int index8_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_22 = input.LA(1);

                         
                        int index8_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_24 = input.LA(1);

                         
                        int index8_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_18 = input.LA(1);

                         
                        int index8_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_21 = input.LA(1);

                         
                        int index8_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_21);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_23 = input.LA(1);

                         
                        int index8_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_39 = input.LA(1);

                         
                        int index8_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_39);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_36 = input.LA(1);

                         
                        int index8_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index8_36);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\63\uffff";
    static final String DFA9_eofS =
        "\1\4\62\uffff";
    static final String DFA9_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\17\5\4\1\23\1\4\1\0\1\21\1\4\1\0\1\4\1\23\2\4\1\21\1\4\1"+
        "\23\1\4\1\21\1\23\1\21";
    static final String DFA9_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\23\2\4\2\24\1\4\1\24\1\4\1\0\1\24\1\4\1\0\1\4\4\24\1\4\1"+
        "\24\1\4\3\24";
    static final String DFA9_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA9_specialS =
        "\3\uffff\1\11\17\uffff\1\1\1\7\1\3\1\10\1\5\1\0\1\6\12\uffff\1"+
        "\2\2\uffff\1\4\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\10",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\13\uffff\1\41\2\uffff\1\44\1\43",
            "\1\45\13\uffff\1\50\1\47\2\uffff\1\46",
            "\1\51",
            "\1\44\1\43",
            "\1\52",
            "\1\uffff",
            "\1\47\2\uffff\1\46",
            "\1\53",
            "\1\uffff",
            "\1\54",
            "\1\44\1\43",
            "\1\56\13\uffff\1\55\2\uffff\1\44\1\43",
            "\1\60\13\uffff\1\57\1\47\2\uffff\1\46",
            "\1\47\2\uffff\1\46",
            "\1\61",
            "\1\44\1\43",
            "\1\62",
            "\1\47\2\uffff\1\46",
            "\1\44\1\43",
            "\1\47\2\uffff\1\46"
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
            return "2599:2: ( rule__Article__UnorderedGroup__2 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_24 = input.LA(1);

                         
                        int index9_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_19 = input.LA(1);

                         
                        int index9_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_36 = input.LA(1);

                         
                        int index9_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_36);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_21 = input.LA(1);

                         
                        int index9_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_21);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_39 = input.LA(1);

                         
                        int index9_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_39);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_23 = input.LA(1);

                         
                        int index9_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_25 = input.LA(1);

                         
                        int index9_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_20 = input.LA(1);

                         
                        int index9_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_20);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_22 = input.LA(1);

                         
                        int index9_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\63\uffff";
    static final String DFA10_eofS =
        "\1\4\62\uffff";
    static final String DFA10_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\3\0\1\21\4\0"+
        "\1\20\1\22\1\17\5\4\1\0\1\4\1\23\1\4\1\21\1\4\1\0\1\4\1\23\1\21"+
        "\2\4\1\23\1\4\1\21\1\23\1\21";
    static final String DFA10_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\3\0\1\21\4\0"+
        "\1\20\1\22\1\23\2\4\2\24\1\4\1\0\1\4\1\24\1\4\1\24\1\4\1\0\4\24"+
        "\1\4\1\24\1\4\3\24";
    static final String DFA10_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA10_specialS =
        "\3\uffff\1\4\16\uffff\1\3\1\0\1\5\1\uffff\1\2\1\6\1\1\1\11\10\uffff"+
        "\1\10\5\uffff\1\7\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\15\1\16\1\17\1\10\1\11\1\12\1\14\1\13",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\44\13\uffff\1\43\2\uffff\1\42\1\41",
            "\1\46\13\uffff\1\45\1\50\2\uffff\1\47",
            "\1\51",
            "\1\uffff",
            "\1\52",
            "\1\42\1\41",
            "\1\53",
            "\1\50\2\uffff\1\47",
            "\1\54",
            "\1\uffff",
            "\1\56\13\uffff\1\55\2\uffff\1\42\1\41",
            "\1\42\1\41",
            "\1\50\2\uffff\1\47",
            "\1\60\13\uffff\1\57\1\50\2\uffff\1\47",
            "\1\61",
            "\1\42\1\41",
            "\1\62",
            "\1\50\2\uffff\1\47",
            "\1\42\1\41",
            "\1\50\2\uffff\1\47"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "2612:2: ( rule__Article__UnorderedGroup__3 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_19 = input.LA(1);

                         
                        int index10_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_24 = input.LA(1);

                         
                        int index10_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_24);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_22 = input.LA(1);

                         
                        int index10_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_18 = input.LA(1);

                         
                        int index10_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_18);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_20 = input.LA(1);

                         
                        int index10_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_23 = input.LA(1);

                         
                        int index10_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_23);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_40 = input.LA(1);

                         
                        int index10_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_40);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_34 = input.LA(1);

                         
                        int index10_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_34);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_25 = input.LA(1);

                         
                        int index10_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index10_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\63\uffff";
    static final String DFA11_eofS =
        "\1\4\62\uffff";
    static final String DFA11_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\17\5\4\1\0\1\4\1\23\1\4\1\21\1\4\1\0\1\4\1\23\1\21\1\4\1"+
        "\23\2\4\1\21\1\23\1\21";
    static final String DFA11_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\23\2\4\2\24\1\4\1\0\1\4\1\24\1\4\1\24\1\4\1\0\5\24\2\4\3"+
        "\24";
    static final String DFA11_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA11_specialS =
        "\3\uffff\1\3\17\uffff\1\4\1\1\1\10\1\2\1\11\1\5\1\0\10\uffff\1"+
        "\7\5\uffff\1\6\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\10",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\44\13\uffff\1\43\2\uffff\1\42\1\41",
            "\1\46\13\uffff\1\45\1\50\2\uffff\1\47",
            "\1\51",
            "\1\uffff",
            "\1\52",
            "\1\42\1\41",
            "\1\53",
            "\1\50\2\uffff\1\47",
            "\1\54",
            "\1\uffff",
            "\1\55\13\uffff\1\56\2\uffff\1\42\1\41",
            "\1\42\1\41",
            "\1\50\2\uffff\1\47",
            "\1\60\13\uffff\1\57\1\50\2\uffff\1\47",
            "\1\42\1\41",
            "\1\61",
            "\1\62",
            "\1\50\2\uffff\1\47",
            "\1\42\1\41",
            "\1\50\2\uffff\1\47"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "2625:2: ( rule__Article__UnorderedGroup__4 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_40 = input.LA(1);

                         
                        int index11_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_40);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_34 = input.LA(1);

                         
                        int index11_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\63\uffff";
    static final String DFA12_eofS =
        "\1\4\62\uffff";
    static final String DFA12_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\3\0\1\21\4\0"+
        "\1\20\1\22\1\17\4\4\1\23\2\4\1\0\1\21\2\4\1\0\1\23\1\4\1\21\1\4"+
        "\1\23\2\4\1\21\1\23\1\21";
    static final String DFA12_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\3\0\1\21\4\0"+
        "\1\20\1\22\1\23\2\4\3\24\2\4\1\0\1\24\2\4\1\0\5\24\2\4\3\24";
    static final String DFA12_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA12_specialS =
        "\3\uffff\1\1\16\uffff\1\11\1\6\1\0\1\uffff\1\7\1\2\1\3\1\10\12"+
        "\uffff\1\5\3\uffff\1\4\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\15\1\10\1\11\1\12\1\14\1\16\1\17\1\13",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41\13\uffff\1\42\2\uffff\1\44\1\43",
            "\1\45\13\uffff\1\46\1\50\2\uffff\1\47",
            "\1\44\1\43",
            "\1\51",
            "\1\52",
            "\1\uffff",
            "\1\50\2\uffff\1\47",
            "\1\53",
            "\1\54",
            "\1\uffff",
            "\1\44\1\43",
            "\1\55\13\uffff\1\56\2\uffff\1\44\1\43",
            "\1\50\2\uffff\1\47",
            "\1\60\13\uffff\1\57\1\50\2\uffff\1\47",
            "\1\44\1\43",
            "\1\61",
            "\1\62",
            "\1\50\2\uffff\1\47",
            "\1\44\1\43",
            "\1\50\2\uffff\1\47"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "2638:2: ( rule__Article__UnorderedGroup__5 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_20 = input.LA(1);

                         
                        int index12_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_20);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_23 = input.LA(1);

                         
                        int index12_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_24 = input.LA(1);

                         
                        int index12_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_40 = input.LA(1);

                         
                        int index12_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_40);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_36 = input.LA(1);

                         
                        int index12_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_36);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_19 = input.LA(1);

                         
                        int index12_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_19);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA12_22 = input.LA(1);

                         
                        int index12_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_22);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA12_25 = input.LA(1);

                         
                        int index12_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_25);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA12_18 = input.LA(1);

                         
                        int index12_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index12_18);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\63\uffff";
    static final String DFA13_eofS =
        "\1\4\62\uffff";
    static final String DFA13_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\17\4\4\1\23\2\4\1\0\1\4\1\0\1\21\1\4\1\23\2\4\1\21\1\23"+
        "\2\4\1\21\1\23\1\21";
    static final String DFA13_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\21\7\0\1\20"+
        "\1\22\1\23\2\4\3\24\2\4\1\0\1\4\1\0\1\24\1\4\5\24\2\4\3\24";
    static final String DFA13_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA13_specialS =
        "\3\uffff\1\1\17\uffff\1\3\1\10\1\6\1\0\1\7\1\2\1\11\12\uffff\1"+
        "\5\1\uffff\1\4\14\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\10",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41\13\uffff\1\42\2\uffff\1\44\1\43",
            "\1\47\13\uffff\1\50\1\46\2\uffff\1\45",
            "\1\44\1\43",
            "\1\51",
            "\1\52",
            "\1\uffff",
            "\1\53",
            "\1\uffff",
            "\1\46\2\uffff\1\45",
            "\1\54",
            "\1\44\1\43",
            "\1\55\13\uffff\1\56\2\uffff\1\44\1\43",
            "\1\60\13\uffff\1\57\1\46\2\uffff\1\45",
            "\1\46\2\uffff\1\45",
            "\1\44\1\43",
            "\1\61",
            "\1\62",
            "\1\46\2\uffff\1\45",
            "\1\44\1\43",
            "\1\46\2\uffff\1\45"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "2651:2: ( rule__Article__UnorderedGroup__6 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_22 = input.LA(1);

                         
                        int index13_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_3 = input.LA(1);

                         
                        int index13_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_24 = input.LA(1);

                         
                        int index13_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_24);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_19 = input.LA(1);

                         
                        int index13_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_38 = input.LA(1);

                         
                        int index13_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_38);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_36 = input.LA(1);

                         
                        int index13_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_36);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_21 = input.LA(1);

                         
                        int index13_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_21);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_23 = input.LA(1);

                         
                        int index13_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_20 = input.LA(1);

                         
                        int index13_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_25 = input.LA(1);

                         
                        int index13_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index13_25);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\63\uffff";
    static final String DFA14_eofS =
        "\1\4\62\uffff";
    static final String DFA14_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\2\0\1\21\5\0"+
        "\1\20\1\22\1\17\5\4\1\23\1\4\1\0\1\4\1\0\1\21\1\4\1\23\2\4\1\21"+
        "\1\4\1\23\1\4\1\21\1\23\1\21";
    static final String DFA14_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\2\0\1\21\5\0"+
        "\1\20\1\22\1\23\2\4\2\24\1\4\1\24\1\4\1\0\1\4\1\0\1\24\1\4\4\24"+
        "\1\4\1\24\1\4\3\24";
    static final String DFA14_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA14_specialS =
        "\3\uffff\1\3\16\uffff\1\5\1\0\1\uffff\1\7\1\2\1\11\1\4\1\1\12\uffff"+
        "\1\10\1\uffff\1\6\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\10\1\11\1\13\1\14\1\15\1\16\1\17\1\12",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\uffff",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\13\uffff\1\41\2\uffff\1\44\1\43",
            "\1\47\13\uffff\1\50\1\46\2\uffff\1\45",
            "\1\51",
            "\1\44\1\43",
            "\1\52",
            "\1\uffff",
            "\1\53",
            "\1\uffff",
            "\1\46\2\uffff\1\45",
            "\1\54",
            "\1\44\1\43",
            "\1\56\13\uffff\1\55\2\uffff\1\44\1\43",
            "\1\60\13\uffff\1\57\1\46\2\uffff\1\45",
            "\1\46\2\uffff\1\45",
            "\1\61",
            "\1\44\1\43",
            "\1\62",
            "\1\46\2\uffff\1\45",
            "\1\44\1\43",
            "\1\46\2\uffff\1\45"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "2664:2: ( rule__Article__UnorderedGroup__7 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_25 = input.LA(1);

                         
                        int index14_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_22 = input.LA(1);

                         
                        int index14_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_22);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_24 = input.LA(1);

                         
                        int index14_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_18 = input.LA(1);

                         
                        int index14_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_38 = input.LA(1);

                         
                        int index14_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_38);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_36 = input.LA(1);

                         
                        int index14_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_36);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_23 = input.LA(1);

                         
                        int index14_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index14_23);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\63\uffff";
    static final String DFA15_eofS =
        "\1\4\62\uffff";
    static final String DFA15_minS =
        "\1\16\1\13\1\25\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\0\1\21\6\0"+
        "\1\20\1\22\1\17\5\4\1\23\1\4\1\0\1\21\1\4\1\0\1\4\1\23\2\4\1\21"+
        "\1\4\1\23\1\4\1\21\1\23\1\21";
    static final String DFA15_maxS =
        "\1\21\1\15\1\34\1\0\1\uffff\3\17\10\5\1\uffff\1\4\1\0\1\21\6\0"+
        "\1\20\1\22\1\23\2\4\2\24\1\4\1\24\1\4\1\0\1\24\1\4\1\0\1\4\4\24"+
        "\1\4\1\24\1\4\3\24";
    static final String DFA15_acceptS =
        "\4\uffff\1\2\13\uffff\1\1\42\uffff";
    static final String DFA15_specialS =
        "\3\uffff\1\4\16\uffff\1\2\1\uffff\1\6\1\1\1\10\1\3\1\0\1\5\12\uffff"+
        "\1\11\2\uffff\1\7\13\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\uffff\1\2\1\3",
            "\1\5\1\6\1\7",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\10\1\11",
            "\1\uffff",
            "",
            "\1\21",
            "\1\21",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "",
            "\1\32",
            "\1\uffff",
            "\1\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\42\13\uffff\1\41\2\uffff\1\44\1\43",
            "\1\45\13\uffff\1\50\1\47\2\uffff\1\46",
            "\1\51",
            "\1\44\1\43",
            "\1\52",
            "\1\uffff",
            "\1\47\2\uffff\1\46",
            "\1\53",
            "\1\uffff",
            "\1\54",
            "\1\44\1\43",
            "\1\56\13\uffff\1\55\2\uffff\1\44\1\43",
            "\1\60\13\uffff\1\57\1\47\2\uffff\1\46",
            "\1\47\2\uffff\1\46",
            "\1\61",
            "\1\44\1\43",
            "\1\62",
            "\1\47\2\uffff\1\46",
            "\1\44\1\43",
            "\1\47\2\uffff\1\46"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "2677:2: ( rule__Article__UnorderedGroup__8 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_24 = input.LA(1);

                         
                        int index15_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 5) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_21 = input.LA(1);

                         
                        int index15_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 2) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_21);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_18 = input.LA(1);

                         
                        int index15_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 7) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_23 = input.LA(1);

                         
                        int index15_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 4) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_23);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_3 = input.LA(1);

                         
                        int index15_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 8) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_3);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_25 = input.LA(1);

                         
                        int index15_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 6) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_25);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 1) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_39 = input.LA(1);

                         
                        int index15_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_39);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_22 = input.LA(1);

                         
                        int index15_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 3) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_22);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_36 = input.LA(1);

                         
                        int index15_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getArticleAccess().getUnorderedGroup(), 0) ) {s = 16;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getArticleAccess().getUnorderedGroup()) ) {s = 4;}

                         
                        input.seek(index15_36);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BibtexEntriesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_entryRuleBibtexEntryTypes122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBibtexEntryTypes129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_ruleBibtexEntryTypes155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArticle_in_entryRuleArticle181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArticle188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup_in_ruleArticle214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_entryRuleCiteKey241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCiteKey248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CiteKey__KeyAssignment_in_ruleCiteKey274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_entryRuleAuthorField301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthorField308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__0_in_ruleAuthorField334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_entryRuleAuthors361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAuthors368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__0_in_ruleAuthors394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_entryRuleFullname421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullname428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Alternatives_in_ruleFullname454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_entryRuleTitleField481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitleField488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__0_in_ruleTitleField514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_entryRuleJournalField541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJournalField548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__0_in_ruleJournalField574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_entryRuleYearField601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleYearField608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__0_in_ruleYearField634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_entryRuleVolumeField661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVolumeField668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__0_in_ruleVolumeField694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_entryRuleNumberField721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberField728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__0_in_ruleNumberField754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_entryRulePagesField781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePagesField788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__0_in_rulePagesField814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_entryRuleMonthField841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMonthField848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__0_in_ruleMonthField874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_entryRuleNoteField901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoteField908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__0_in_ruleNoteField934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Article__Alternatives_0_1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Article__Alternatives_0_1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Article__Alternatives_0_11011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__0_in_rule__AuthorField__Alternatives_11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__0_in_rule__AuthorField__Alternatives_11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__0_in_rule__Fullname__Alternatives1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__0_in_rule__Fullname__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_2_in_rule__Fullname__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__0__Impl_in_rule__Article__Group_0__01163 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_rule__Article__Group_0__1_in_rule__Article__Group_0__01166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Article__Group_0__0__Impl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__1__Impl_in_rule__Article__Group_0__11225 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Article__Group_0__2_in_rule__Article__Group_0__11228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Alternatives_0_1_in_rule__Article__Group_0__1__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__2__Impl_in_rule__Article__Group_0__21285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Article__Group_0__3_in_rule__Article__Group_0__21288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Article__Group_0__2__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__3__Impl_in_rule__Article__Group_0__31347 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Article__Group_0__4_in_rule__Article__Group_0__31350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__KeyAssignment_0_3_in_rule__Article__Group_0__3__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__4__Impl_in_rule__Article__Group_0__41407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0_4__0_in_rule__Article__Group_0__4__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0_4__0__Impl_in_rule__Article__Group_0_4__01474 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Article__Group_0_4__1_in_rule__Article__Group_0_4__01477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_0_4__0__Impl1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0_4__1__Impl_in_rule__Article__Group_0_4__11536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__AuthorAssignment_0_4_1_in_rule__Article__Group_0_4__1__Impl1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_1__0__Impl_in_rule__Article__Group_1__01597 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Article__Group_1__1_in_rule__Article__Group_1__01600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_1__0__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_1__1__Impl_in_rule__Article__Group_1__11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__TitleAssignment_1_1_in_rule__Article__Group_1__1__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_2__0__Impl_in_rule__Article__Group_2__01720 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Article__Group_2__1_in_rule__Article__Group_2__01723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_2__0__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_2__1__Impl_in_rule__Article__Group_2__11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__JournalAssignment_2_1_in_rule__Article__Group_2__1__Impl1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_3__0__Impl_in_rule__Article__Group_3__01843 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Article__Group_3__1_in_rule__Article__Group_3__01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_3__0__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_3__1__Impl_in_rule__Article__Group_3__11905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__YearAssignment_3_1_in_rule__Article__Group_3__1__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4__0__Impl_in_rule__Article__Group_4__01966 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Article__Group_4__1_in_rule__Article__Group_4__01969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_4__0__Impl1997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4__1__Impl_in_rule__Article__Group_4__12028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__VolumeAssignment_4_1_in_rule__Article__Group_4__1__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_5__0__Impl_in_rule__Article__Group_5__02089 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Article__Group_5__1_in_rule__Article__Group_5__02092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_5__0__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_5__1__Impl_in_rule__Article__Group_5__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__NumberAssignment_5_1_in_rule__Article__Group_5__1__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_6__0__Impl_in_rule__Article__Group_6__02212 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Article__Group_6__1_in_rule__Article__Group_6__02215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_6__0__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_6__1__Impl_in_rule__Article__Group_6__12274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__PagesAssignment_6_1_in_rule__Article__Group_6__1__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_7__0__Impl_in_rule__Article__Group_7__02335 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Article__Group_7__1_in_rule__Article__Group_7__02338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_7__0__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_7__1__Impl_in_rule__Article__Group_7__12397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__MonthAssignment_7_1_in_rule__Article__Group_7__1__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8__0__Impl_in_rule__Article__Group_8__02458 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_rule__Article__Group_8__1_in_rule__Article__Group_8__02461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8_0__0_in_rule__Article__Group_8__0__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8__1__Impl_in_rule__Article__Group_8__12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Article__Group_8__1__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8_0__0__Impl_in_rule__Article__Group_8_0__02582 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Article__Group_8_0__1_in_rule__Article__Group_8_0__02585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Article__Group_8_0__0__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8_0__1__Impl_in_rule__Article__Group_8_0__12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__NoteAssignment_8_0_1_in_rule__Article__Group_8_0__1__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__0__Impl_in_rule__AuthorField__Group__02705 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__1_in_rule__AuthorField__Group__02708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AuthorField__Group__0__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group__1__Impl_in_rule__AuthorField__Group__12767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Alternatives_1_in_rule__AuthorField__Group__1__Impl2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__0__Impl_in_rule__AuthorField__Group_1_0__02828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__1_in_rule__AuthorField__Group_1_0__02831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AuthorField__Group_1_0__0__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__1__Impl_in_rule__AuthorField__Group_1_0__12890 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__2_in_rule__AuthorField__Group_1_0__12893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_rule__AuthorField__Group_1_0__1__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_0__2__Impl_in_rule__AuthorField__Group_1_0__22949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__AuthorField__Group_1_0__2__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__0__Impl_in_rule__AuthorField__Group_1_1__03014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__1_in_rule__AuthorField__Group_1_1__03017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AuthorField__Group_1_1__0__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__1__Impl_in_rule__AuthorField__Group_1_1__13076 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__2_in_rule__AuthorField__Group_1_1__13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthors_in_rule__AuthorField__Group_1_1__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AuthorField__Group_1_1__2__Impl_in_rule__AuthorField__Group_1_1__23135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AuthorField__Group_1_1__2__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__0__Impl_in_rule__Authors__Group__03200 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Authors__Group__1_in_rule__Authors__Group__03203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__NamesAssignment_0_in_rule__Authors__Group__0__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group__1__Impl_in_rule__Authors__Group__13260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__0_in_rule__Authors__Group__1__Impl3287 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__0__Impl_in_rule__Authors__Group_1__03322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__1_in_rule__Authors__Group_1__03325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Authors__Group_1__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__Group_1__1__Impl_in_rule__Authors__Group_1__13384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Authors__NamesAssignment_1_1_in_rule__Authors__Group_1__1__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__0__Impl_in_rule__Fullname__Group_0__03445 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__1_in_rule__Fullname__Group_0__03448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__LastnameAssignment_0_0_in_rule__Fullname__Group_0__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__1__Impl_in_rule__Fullname__Group_0__13505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__2_in_rule__Fullname__Group_0__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Fullname__Group_0__1__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_0__2__Impl_in_rule__Fullname__Group_0__23567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_0_2_in_rule__Fullname__Group_0__2__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__0__Impl_in_rule__Fullname__Group_1__03630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__1_in_rule__Fullname__Group_1__03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__FirstnameAssignment_1_0_in_rule__Fullname__Group_1__0__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__Group_1__1__Impl_in_rule__Fullname__Group_1__13690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fullname__LastnameAssignment_1_1_in_rule__Fullname__Group_1__1__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__0__Impl_in_rule__TitleField__Group__03751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TitleField__Group__1_in_rule__TitleField__Group__03754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TitleField__Group__0__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__Group__1__Impl_in_rule__TitleField__Group__13813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TitleField__TitleAssignment_1_in_rule__TitleField__Group__1__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__0__Impl_in_rule__JournalField__Group__03874 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JournalField__Group__1_in_rule__JournalField__Group__03877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__JournalField__Group__0__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__Group__1__Impl_in_rule__JournalField__Group__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JournalField__JournalAssignment_1_in_rule__JournalField__Group__1__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__0__Impl_in_rule__YearField__Group__03997 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__YearField__Group__1_in_rule__YearField__Group__04000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__YearField__Group__0__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__Group__1__Impl_in_rule__YearField__Group__14059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__YearField__YearAssignment_1_in_rule__YearField__Group__1__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__0__Impl_in_rule__VolumeField__Group__04120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__1_in_rule__VolumeField__Group__04123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__VolumeField__Group__0__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__Group__1__Impl_in_rule__VolumeField__Group__14182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VolumeField__VolumeAssignment_1_in_rule__VolumeField__Group__1__Impl4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__0__Impl_in_rule__NumberField__Group__04243 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NumberField__Group__1_in_rule__NumberField__Group__04246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__NumberField__Group__0__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__Group__1__Impl_in_rule__NumberField__Group__14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberField__NumberAssignment_1_in_rule__NumberField__Group__1__Impl4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__0__Impl_in_rule__PagesField__Group__04366 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PagesField__Group__1_in_rule__PagesField__Group__04369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PagesField__Group__0__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__Group__1__Impl_in_rule__PagesField__Group__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PagesField__PagesAssignment_1_in_rule__PagesField__Group__1__Impl4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__0__Impl_in_rule__MonthField__Group__04489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__MonthField__Group__1_in_rule__MonthField__Group__04492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__MonthField__Group__0__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__Group__1__Impl_in_rule__MonthField__Group__14551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MonthField__MonthAssignment_1_in_rule__MonthField__Group__1__Impl4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__0__Impl_in_rule__NoteField__Group__04612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NoteField__Group__1_in_rule__NoteField__Group__04615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NoteField__Group__0__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__Group__1__Impl_in_rule__NoteField__Group__14674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoteField__NoteAssignment_1_in_rule__NoteField__Group__1__Impl4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__0_in_rule__Article__UnorderedGroup4736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_0__0_in_rule__Article__UnorderedGroup__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_1__0_in_rule__Article__UnorderedGroup__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_2__0_in_rule__Article__UnorderedGroup__Impl5007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_3__0_in_rule__Article__UnorderedGroup__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_4__0_in_rule__Article__UnorderedGroup__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_5__0_in_rule__Article__UnorderedGroup__Impl5280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_6__0_in_rule__Article__UnorderedGroup__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_7__0_in_rule__Article__UnorderedGroup__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__Group_8__0_in_rule__Article__UnorderedGroup__Impl5553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__05612 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__1_in_rule__Article__UnorderedGroup__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__15640 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__2_in_rule__Article__UnorderedGroup__15643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__25668 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__3_in_rule__Article__UnorderedGroup__25671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__35696 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__4_in_rule__Article__UnorderedGroup__35699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__45724 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__5_in_rule__Article__UnorderedGroup__45727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__55752 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__6_in_rule__Article__UnorderedGroup__55755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__65780 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__7_in_rule__Article__UnorderedGroup__65783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__75808 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__8_in_rule__Article__UnorderedGroup__75811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Article__UnorderedGroup__Impl_in_rule__Article__UnorderedGroup__85836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBibtexEntryTypes_in_rule__Model__BibtexEntriesAssignment5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCiteKey_in_rule__Article__KeyAssignment_0_35913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAuthorField_in_rule__Article__AuthorAssignment_0_4_15944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTitleField_in_rule__Article__TitleAssignment_1_15975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJournalField_in_rule__Article__JournalAssignment_2_16006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleYearField_in_rule__Article__YearAssignment_3_16037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVolumeField_in_rule__Article__VolumeAssignment_4_16068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberField_in_rule__Article__NumberAssignment_5_16099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePagesField_in_rule__Article__PagesAssignment_6_16130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMonthField_in_rule__Article__MonthAssignment_7_16161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoteField_in_rule__Article__NoteAssignment_8_0_16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CiteKey__KeyAssignment6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_06254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullname_in_rule__Authors__NamesAssignment_1_16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_0_06316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_0_26347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_1_06378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__LastnameAssignment_1_16409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fullname__FirstnameAssignment_26440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TitleField__TitleAssignment_16471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JournalField__JournalAssignment_16502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__YearField__YearAssignment_16533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__VolumeField__VolumeAssignment_16564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NumberField__NumberAssignment_16595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PagesField__PagesAssignment_16626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MonthField__MonthAssignment_16657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NoteField__NoteAssignment_16688 = new BitSet(new long[]{0x0000000000000002L});

}
