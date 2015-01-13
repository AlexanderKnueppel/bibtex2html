package de.tubs.bibtextohtml.bibtex;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class FIELD_VALUEValueConverter extends AbstractLexerBasedConverter<String> {
    @Override
    protected void assertValidValue(String value) {
            super.assertValidValue(value);
//            if (value < 0)
//                    throw new ValueConverterException(getRuleName() + "-value may not be negative (value: " + value + ").", null, null);
    }
    
//    public Integer toValue(String string, INode node) {
//            if (Strings.isEmpty(string))
//                    throw new ValueConverterException("Couldn't convert empty string to an binary value.", node, null);
//            try {
//                    int intValue = Integer.parseInt(string.substring(0, string.length() - 1), 2);
//                    return Integer.valueOf(intValue);
//            } catch (NumberFormatException e) {
//                    throw new ValueConverterException("Couldn't convert '" + string + "' to an binary value.", node, e);
//            }
//    }

	@Override
	public String toValue(String string, INode node)
			throws ValueConverterException {
		if (Strings.isEmpty(string))
			throw new ValueConverterException("Empty strings are not allowed", node, null);
		
//		if(string.startsWith("{")) {
//			if(!string.endsWith("}")) {
//				throw new ValueConverterException("Corrupted! Watch yor brackets!", node, null);
//			}
//			return string.substring(1, string.length() - 1);
//		}
		
		//parse this string in some fancy way...
		return string;
	}

}