package com.silverpop.api.client.xmlapi.util;

import java.io.Writer;
import java.util.regex.Pattern;

import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XmlApiPrintWriter extends PrettyPrintWriter {

	public static final Pattern SPECIAL_CHARACTERS = Pattern.compile("[&<>\"']");
	
	public static final String CDATA_START = "<![CDATA[";
	public static final String CDATA_END = "]]>";
	
    public XmlApiPrintWriter(Writer writer, XmlFriendlyNameCoder replacer) {
		super(writer, replacer);
	}

	
	@Override
	protected void writeText(QuickWriter writer, String text) {
		if(hasSpecialCharacters(text)) {
			writer.write(String.format("%s%s%s", CDATA_START, text, CDATA_END));
		} else {
			super.writeText(writer, text);
		}
	}

	private boolean hasSpecialCharacters(String text) {
		return SPECIAL_CHARACTERS.matcher(text).find();
	}
}
