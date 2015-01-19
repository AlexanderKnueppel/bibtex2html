package de.tubs.bibtextohtml.htmlgenerator.generator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.EList;

import de.tubs.bibtextohtml.bibtex.bibTeX.BibtexEntryTypes;
import de.tubs.bibtextohtml.bibtex.bibTeX.Model;


public class HTMLParserHelper {
	static public class Author {
		public Author(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}
		
		public Author(String lastname) {
			this("", lastname);
		}
		
		public Author() {
			this("");
		}
		public String firstname;
		public String lastname;
	}
	static public List<Author> parseAuthors(String str) {
		List<Author> parsed = new ArrayList<Author>();
		
		String[] authors = str.split(" and ");
		for(String author : authors) {
			String[] name = author.split(",");
			if(name.length>1) {
				parsed.add(new Author(name[1].trim(), name[0].trim()));
			} else if(name.length == 1) {
				name = author.replaceAll("\\s+", " ").trim().split(" ", 2);
				if(name.length>1) {
					parsed.add(new Author(name[0].trim(), name[1].trim()));
				} else {
					parsed.add(new Author(name[0].trim()));
				}
			} else {
				// error; 
			}
		}
		return parsed;
	}
	
//	public enum Sorting {
//	    AUTHOR_TITLE_YEAR, AUTHOR_YEAR_TITLE, 
//	    TITLE_AUTHOR_YEAR, TITLE_YEAR_AUTHOR,
//	    YEAR_TITLE_AUTHOR, YEAR_AUTHOR_TITLE, 
//	    KEY
//	}
//	
//	public enum Category {
//	    AUTHOR, YEAR, ENTRY_TYPE, NONE
//	}
	
//	static public EList<BibtexEntryTypes> sortedEntrySet(Model model, Sorting criteria, boolean asc, Category cat) {
//		EList<BibtexEntryTypes> sortingList = model.getBibtexEntries();//new BasicEList<BibtexEntryTypes>();
		
//		sortingList.sort(new Comparator<BibtexEntryTypes>() {
//		    public int compare(BibtexEntryTypes e1, BibtexEntryTypes e2) {
//		    	if(cat == Category.NONE)
//		    		return 0;
//		       switch(cat) {
//		       case AUTHOR: 
//		    	   return e1.eContents().
//		    	   break;
//		       case YEAR:
//		    	   break;
//		       case ENTRY_TYPE:
//		    	   break;
//		       }
//		    }
//		});
//		
//		model.
//		
//		return sortingList;
//	}
	

	
}
