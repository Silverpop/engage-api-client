package com.silverpop.api.client.command;

import java.util.List;
import java.util.ArrayList;


import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.ColumnElementType;
import com.silverpop.api.client.result.AddContactToContactListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XmlApiProperties("AddContactToContactList")
public class AddContactToContactListCommand implements ApiCommand{


  @XStreamAlias("CONTACT_LIST_ID")
  private long contactlistid;

  @XStreamAlias("CONTACT_ID")
  private String contactid;

  @XStreamImplicit(itemFieldName="COLUMN")
  private List<ColumnElementType> columnElementTypes;

  public AddContactToContactListCommand()
  {
    columnElementTypes = new ArrayList<ColumnElementType>();
  }

  public long getContactListId()
  {
    return contactlistid;
  }

  public void setContactListId(long id)
  {
    this.contactlistid = id;
  }

  public String getContactId()
  {
    return contactid;
  }

  public void setContactId(String id)
  {
    this.contactid = id;
  }

  public void setColumns(List<ColumnElementType> columns) {
      this.columnElementTypes = columns;
  }

  public List<ColumnElementType> getColumns() {
      return columnElementTypes;
  }

  public void addColumn(final ColumnElementType column) {
      this.columnElementTypes.add(column);
  }

  @Override
  public Class<AddContactToContactListResult> getResultType() {
      return AddContactToContactListResult.class;
  }
}
