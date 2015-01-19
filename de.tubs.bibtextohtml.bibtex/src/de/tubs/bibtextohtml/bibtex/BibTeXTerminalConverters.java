package de.tubs.bibtextohtml.bibtex;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class BibTeXTerminalConverters extends DefaultTerminalConverters {
    @Inject
    private FieldValueConverter fieldValueConverter;
    
    @ValueConverter(rule = "FieldValue")
    public IValueConverter<String> FieldValue() {
            return fieldValueConverter;
    }
    @ValueConverter(rule = "FieldValuePlusInt")
    public IValueConverter<String> FieldValuePlusInt() {
            return fieldValueConverter;
    }
    @ValueConverter(rule = "FieldValuePlusId")
    public IValueConverter<String> FieldValuePlusId() {
            return fieldValueConverter;
    }
    
//    @ValueConverter(rule = "NameValue")
//    public IValueConverter<String> NameValue() {
//            return fieldValueConverter; // use the same converter that is used for other fields
//    }

}
