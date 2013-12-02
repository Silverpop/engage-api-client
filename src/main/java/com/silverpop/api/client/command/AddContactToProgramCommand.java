package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.AddContactToProgramResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("AddContactToProgram")
public class AddContactToProgramCommand implements ApiCommand{
	
    @XStreamAlias("PROGRAM_ID")
    private String programId;
    	
	@XStreamAlias("CONTACT_ID")
	private String contactId;
	

   public String getProgramId() {
        return programId;
    }


    public void setProgramId(String programId) {
        this.programId = programId;
    }


    public String getContactId() {
        return contactId;
    }


    public void setContactId(String contactId) {
        this.contactId = contactId;
    }


@Override
    public Class<AddContactToProgramResult> getResultType() {
        return AddContactToProgramResult.class;
    }


}
