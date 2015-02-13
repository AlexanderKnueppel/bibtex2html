package de.tubs.bibtextohtml.bibtex;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.Maps;

public class FieldValueConverter extends AbstractLexerBasedConverter<String> {
	
	public static final Map<String, String> charToHTMLCode;
	static {
		charToHTMLCode = new HashMap<String, String>();
		charToHTMLCode.put("\\\\\'e", "&eacute;"); charToHTMLCode.put("\\\\\'E", "&Eacute;");
		charToHTMLCode.put("\\\\\'a", "&aacute;"); charToHTMLCode.put("\\\\\'A", "&Aacute;");
		charToHTMLCode.put("\\\\\'o", "&oacute;"); charToHTMLCode.put("\\\\\'O", "&Oacute;");
		charToHTMLCode.put("\\\\\'i", "&iacute;"); charToHTMLCode.put("\\\\\'I", "&Iacute;");
		charToHTMLCode.put("\\\\\'u", "&uacute;"); charToHTMLCode.put("\\\\\'U", "&Uacute;");
		
		charToHTMLCode.put("\\\\`e", "&egrave;"); charToHTMLCode.put("\\\\`E", "&Egrave;");
		charToHTMLCode.put("\\\\`a", "&agrave;"); charToHTMLCode.put("\\\\`A", "&Agrave;");
		charToHTMLCode.put("\\\\`o", "&ograve;"); charToHTMLCode.put("\\\\`O", "&Ograve;");
		charToHTMLCode.put("\\\\`i", "&igrave;"); charToHTMLCode.put("\\\\`I", "&Igrave;");
		charToHTMLCode.put("\\\\`u", "&ugrave;"); charToHTMLCode.put("\\\\`U", "&Ugrave;");
		
		// Needs additional slash escaping because in regular expressions, circumflex has to be escaped, but in strings it has not
		charToHTMLCode.put("\\\\\\^e", "&ecirc;"); charToHTMLCode.put("\\\\\\^E", "&Ecirc;");
		charToHTMLCode.put("\\\\\\^a", "&acirc;"); charToHTMLCode.put("\\\\\\^A", "&Acirc;");
		charToHTMLCode.put("\\\\\\^o", "&ocirc;"); charToHTMLCode.put("\\\\\\^O", "&Ocirc;");
		charToHTMLCode.put("\\\\\\^i", "&icirc;"); charToHTMLCode.put("\\\\\\^I", "&Icirc;");
		charToHTMLCode.put("\\\\\\^u", "&ucirc;"); charToHTMLCode.put("\\\\\\^U", "&Ucirc;");
		
		charToHTMLCode.put("\\\\\"e", "&euml;"); charToHTMLCode.put("\\\\\"E", "&Euml;");
		charToHTMLCode.put("\\\\\"a", "&auml;"); charToHTMLCode.put("\\\\\"A", "&Auml;");
		charToHTMLCode.put("\\\\\"o", "&ouml;"); charToHTMLCode.put("\\\\\"O", "&Ouml;");
		charToHTMLCode.put("\\\\\"i", "&iuml;"); charToHTMLCode.put("\\\\\"I", "&Iuml;");
		charToHTMLCode.put("\\\\\"u", "&uuml;"); charToHTMLCode.put("\\\\\"U", "&Uuml;");
		
		charToHTMLCode.put("\\\\AA", "&Aring;"); charToHTMLCode.put("\\\\aa", "&aring;");
		
		charToHTMLCode.put("\\\\~a", "&atilde;"); charToHTMLCode.put("\\\\~A", "&Atilde;");
		charToHTMLCode.put("\\\\~o", "&otilde;"); charToHTMLCode.put("\\\\~O", "&Otilde;");
		charToHTMLCode.put("\\\\~n", "&ntilde;"); charToHTMLCode.put("\\\\~N", "&Ntilde;");
		
		charToHTMLCode.put("\\\\cc", "&ccedil;"); charToHTMLCode.put("\\\\cC", "&Ccedil;");
		
		charToHTMLCode.put("\\\\sz", "&szlig;"); 
		
//		
//		charToHTMLCode.put("<", "&lt;"); charToHTMLCode.put(">", "&gt;");
//		
//		charToHTMLCode.put("\\o", "&oslash;"); charToHTMLCode.put("\\O", "&Oslash;");
	}
			
    @Override
    protected void assertValidValue(String value) {
            super.assertValidValue(value);
//            if (value < 0)
//                    throw new ValueConverterException(getRuleName() + "-value may not be negative (value: " + value + ").", null, null);
    }

	@Override
	public String toValue(String string, INode node) //test for author and parse it
			throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Empty strings are not allowed", node, null);
		
		if(string.startsWith("{") || string.startsWith("\"")) {
			string = string.substring(1, string.length() - 1);
		}
		
		//parse this string in some fancy way...
		string = string.replaceAll("[{}]", "");
		
		//Charset.forName("UTF-8").encode(string);
		for(Entry<String, String> e : charToHTMLCode.entrySet()) {
			string = string.replaceAll(e.getKey(), e.getValue());
		}

		
		// replace remaining slashes
		string = string.replaceAll("\\\\", "");

		return string;
	}

}