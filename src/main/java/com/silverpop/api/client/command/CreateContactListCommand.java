package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.CreateContactListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XmlApiProperties("CreateContactList")
public class CreateContactListCommand implements ApiCommand{

    @XStreamAlias("DATABASE_ID")
    private long databaseid;

    @XStreamAlias("CONTACT_LIST_NAME")
    private String contactlistname;

    @XStreamAlias("VISIBILITY")
    private int visibility;


   public long getDatabaseId() {
        return databaseid;
    }


    public void setDatabaseId(long databaseId) {
        this.databaseid = databaseId;
    }


    public String getContactListName() {
        return contactlistname;
    }


    public void setContactListName(String name) {
        this.contactlistname = name;
    }

    public int getVisibility()
    {
      return visibility;
    }

    public void setVisibility(int visibility)
    {
      this.visibility = visibility;
    }


    @Override
    public Class<CreateContactListResult> getResultType() {
        return CreateContactListResult.class;
    }


}
