package de.tubs.bibtextohtml.bibtex;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class BibTeXTerminalConverters extends DefaultTerminalConverters {
    @Inject
    private FIELD_VALUEValueConverter fieldValueConverter;
    
    @ValueConverter(rule = "FIELD_VALUE")
    public IValueConverter<String> FIELD_VALUE() {
            return fieldValueConverter;
    }

}
