package com.silverpop.api.client.xmlapi.util;

import static org.mockito.Mockito.*;
import static org.testng.Assert.*;
import static com.silverpop.api.client.xmlapi.util.XmlApiPrintWriter.*;

import java.io.Writer;
import java.util.regex.Pattern;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XmlApiPrintWriterTest {

	private com.silverpop.api.client.xmlapi.util.XmlApiPrintWriter printWriter;
	@Mock private Writer writer;
	@Mock QuickWriter quickWriter;
	@Mock XmlFriendlyNameCoder xmlFriendlyNameCoder;
	
	@BeforeMethod
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		printWriter = new com.silverpop.api.client.xmlapi.util.XmlApiPrintWriter(writer, xmlFriendlyNameCoder);
	}
		
	@Test
	public void writeTextAddsCDataToTextWithSpecialCharacters() {
		verifyPrintWriterIsOutputtingCData("<html><body/><html>");
		verifyPrintWriterIsOutputtingCData("1<2");
		verifyPrintWriterIsOutputtingCData("3 > 2");
		verifyPrintWriterIsOutputtingCData("air \"quotes\"");
		verifyPrintWriterIsOutputtingCData("you're out");
		verifyPrintWriterIsOutputtingCData("done & done");
	}

	private void verifyPrintWriterIsOutputtingCData(String text) {
		printWriter.writeText(quickWriter, text);
		verify(quickWriter).write(CDATA_START + text + CDATA_END);
	}
	
	@Test
	public void hasInvalidCharactersReturnsTrueIfAnyTextCharacterIsInvalid() {
		verifyPrintWriterIsNotOutputtingCData("a normal string");
		verifyPrintWriterIsNotOutputtingCData("a string with | pipes");
		verifyPrintWriterIsNotOutputtingCData("other wierd \\ and // chars");
		verifyPrintWriterIsNotOutputtingCData("123,456,789,000");
		verifyPrintWriterIsNotOutputtingCData("");
	}

	private void verifyPrintWriterIsNotOutputtingCData(String text) {
		printWriter.writeText(quickWriter, text);
		verify(quickWriter, never()).write(CDATA_START + text + CDATA_END);
	}
	
	@Test
	public void regexTest() {
		String header = "x??|!!";
		Pattern regexMethodPattern = Pattern.compile("(.+)(?:\\?\\?|!!)");
		assertTrue(regexMethodPattern.matcher(header).find());
	}
}