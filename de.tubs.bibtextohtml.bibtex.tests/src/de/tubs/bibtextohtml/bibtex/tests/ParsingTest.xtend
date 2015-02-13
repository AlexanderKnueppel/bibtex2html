package de.tubs.bibtextohtml.bibtex.tests

import com.google.inject.Inject


import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import de.tubs.bibtextohtml.bibtex.BibTeXInjectorProvider
import de.tubs.bibtextohtml.bibtex.bibTeX.Model
import de.tubs.bibtextohtml.bibtex.bibTeX.AuthorField
import de.tubs.bibtextohtml.bibtex.bibTeX.TitleField
import de.tubs.bibtextohtml.bibtex.bibTeX.BooktitleField
import de.tubs.bibtextohtml.bibtex.bibTeX.NumberField
import de.tubs.bibtextohtml.bibtex.bibTeX.YearField
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

@RunWith(XtextRunner)
@InjectWith(BibTeXInjectorProvider)

class ParsingTest {
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test def void testCorrectParsing() {
		'''
			@inproceedings{GMP81,
			   author = "Mark Goresky and Robert MacPherson",
			    title = "On the topology of complex algebraic maps",
			booktitle = "Algebraic Geometry Proceedings, La R\'abida,
			             Lecture Notes in Mathematics",
			   number = 961,
			     year = 1981}   
		'''.parse.assertNoErrors
	}
	
	
	@Test def void testCorrectSizes() {
		val inp1 = '''
			@inproceedings{GMP81,
			   author = "Mark Goresky and Robert MacPherson",
			    title = "On the topology of complex algebraic maps",
			booktitle = "Algebraic Geometry Proceedings, La R\'abida,
			             Lecture Notes in Mathematics",
			   number = 961,
			     year = 1981}   
		'''.parse		
		assertEquals(inp1.eAllContents.toIterable.filter(typeof(AuthorField)).size, 1)
		assertEquals(inp1.eAllContents.toIterable.filter(typeof(TitleField)).size, 1)
		assertEquals(inp1.eAllContents.toIterable.filter(typeof(BooktitleField)).size, 1)
		assertEquals(inp1.eAllContents.toIterable.filter(typeof(NumberField)).size, 1)
		assertEquals(inp1.eAllContents.toIterable.filter(typeof(YearField)).size, 1)
	}
	
	@Test def void testEqualValues() {
		val inp1 = '''
			@inproceedings{GMP81,
			   author = "Mark Goresky and Robert MacPherson",
			    title = "On the topology of complex algebraic maps",
			booktitle = "Algebraic Geometry Proceedings, La R\'abida,
			             Lecture Notes in Mathematics",
			   number = 961,
			     year = 1981}   
		'''.parse				
		val inp2 = '''
			@inproceedings{GMP81,
			   author = {Mark Goresky and Robert MacPherson},
			    title = {On the {topology} of complex algebraic maps},
			booktitle = {Algebraic Geometry Proceedings, La R\'abida,
			             Lecture Notes in Mathematics},
			   number = 961,
			     year = 1981}   
		'''.parse
		assertEquals((inp1.eAllContents.toIterable.filter(typeof(AuthorField)).get(0) as AuthorField).authors, 
			(inp2.eAllContents.toIterable.filter(typeof(AuthorField)).get(0) as AuthorField).authors)
			
		assertEquals((inp1.eAllContents.toIterable.filter(typeof(TitleField)).get(0) as TitleField).title, 
			(inp2.eAllContents.toIterable.filter(typeof(TitleField)).get(0) as TitleField).title)			
	}
	@Test def void testCorrectValueConversion() {
		val article = '''
		@Article{XXX00,
			Author={Albert-L\'{a}szl\'{o} Barab\'{a}si and M\^{o}nica Ferreira da Silva and F. Patern\`{o} 
			        and Sten-\AA{ke} T\"{a}rnlund and Ketil B{\o} and J. Encarna\c{c}{\~a}o and Alex Kn{\"u}ppel and a\{sz}a t{\"A}},
			Journal="!`Journal of Authors Against ASCII!",
			Title="Cite this Paper",
			Volume={45},
			Number=281,
			Pages="69--77",
			Year=2000
			} 
		'''.parse		
		val parsed = "Albert-L&aacute;szl&oacute; Barab&aacute;si and M&ocirc;nica Ferreira da Silva and "
+ "F. Patern&ograve; and Sten-&Aring;ke T&auml;rnlund and Ketil Bo and J. Encarna&ccedil;&atilde;o and Alex Kn&uuml;ppel and a&szlig;a t&Auml;"		
		assertEquals((article.eAllContents.toIterable.filter(typeof(AuthorField)).get(0) as AuthorField).authors, 
			parsed)		
	}
	
}