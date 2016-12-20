package com.silverpop.api.client;

import com.silverpop.api.client.authentication.oauth.OauthSession;
import com.silverpop.api.client.command.*;
import com.silverpop.api.client.converters.ApiDateConverter;
import com.silverpop.api.client.result.*;
import com.silverpop.api.client.result.elements.ListElementType;
import com.silverpop.api.client.result.elements.MailingElementType;
import com.silverpop.api.client.xmlapi.XmlApiClient;
import com.silverpop.api.client.xmlapi.util.XmlApiClientFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class OAuthClientDemo {

    public static void main(String[] args) throws Exception {
        System.out.println("IBM Marketing Cloud API OAuth Client Demo");
        if (args.length != 4) {
            System.out.println("Usage: url clientId clientSecret refresh");
        }

        XmlApiClient apiClient = new XmlApiClient(new OauthSession(new XmlApiClientFactory(), args[0], args[1], args[2], args[3]));

       // testGetListMetaData(apiClient, 51825);
       // testAMG(apiClient, 531980);
       //  testPrograms(apiClient, 15221);
        testGetMailings(apiClient, 532089, 1805980);

    }

    private static void testGetMailings(XmlApiClient client, long mailingId, long reportId) throws Exception {
        GetSentMailingsForOrgCommand command = new GetSentMailingsForOrgCommand();
     //   mm/dd/yyyy hh:mm:ss
        command.setStartDate("08/01/2016 00:00:00");
        command.setEndDate("08/30/2016 23:59:59");

        GetSentMailingsForOrgResult result = (GetSentMailingsForOrgResult)client.executeCommand(command);

        for (MailingElementType mailing: result.getMailings()) {
            System.out.println("Mailing id: " + mailing.getMailingId());
            System.out.println("Report id: " + mailing.getReportId());
        }

    }

    private static void testPrograms(XmlApiClient client, long programId) throws Exception {
        GetProgramsCommand command = new GetProgramsCommand(true, false);
        GetProgramsResult result = (GetProgramsResult)client.executeCommand(command);
        for (XmlApiProgram p: result.getPrograms()) {
          System.out.println(  p.getListId());
        }
    }

    private static  void testGetListResults(XmlApiClient client) throws Exception {
        GetListsCommand command = new GetListsCommand();
        command.setListType(2);
        GetListsResult result = (GetListsResult)client.executeCommand(command);

        Collection<ListElementType> lists = result.getLists();
        for (ListElementType list : lists) {
            System.out.println(list.getNAME());
        }
    }

    private static void testAMG(XmlApiClient client, long amgId) throws Exception {
        GetMessageGroupDetailsCommand command = new GetMessageGroupDetailsCommand(amgId);
        GetMessageGroupDetailsResult result = (GetMessageGroupDetailsResult)client.executeCommand(command);
        System.out.println(result.getName());

        String modifiedStr = result.getActivationDate();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ENGLISH);
        Date modifed = format.parse(modifiedStr);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        String expected = df.format(modifed);
        System.out.println("Before: " + modifiedStr + " after: " + expected);

    }

    private static void testGetListMetaData(XmlApiClient client, long listId) throws Exception {
        GetListMetaDataCommand command = new GetListMetaDataCommand();
        command.setListId(listId);

        GetListMetaDataResult result = (GetListMetaDataResult)client.executeCommand(command);
        System.out.println(result.getId());
        System.out.println(result.getName());
        System.out.println(result.getParentDatabaseId());

        String modifiedStr = result.getLastconfigured();
        SimpleDateFormat format = new SimpleDateFormat(ApiDateConverter.DEFAULT_FORMAT, Locale.ENGLISH);
        Date modifed = format.parse(modifiedStr);

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(tz);
        String expected = df.format(modifed);
        System.out.println("Before: " + modifiedStr + " after: " + expected);

    }
}
