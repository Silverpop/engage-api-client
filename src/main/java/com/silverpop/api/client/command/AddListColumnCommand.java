package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.AddListColumnResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.silverpop.api.client.command.elements.SelectionValuesElementType;

@XmlApiProperties("AddListColumn")
public class AddListColumnCommand implements ApiCommand
{
  @XStreamAlias("LIST_ID")
  protected long listid;

  @XStreamAlias("COLUMN_NAME")
  protected String columnName;

  @XStreamAlias("COLUMN_TYPE")
  protected int columnType;

  public String get_default() {
    return _default;
  }

  public void set_default(String _default) {
    this._default = _default;
  }

  public SelectionValuesElementType getSelVals() {
    return selVals;
  }

  public void setSelVals(SelectionValuesElementType selVals) {
    this.selVals = selVals;
  }

  @XStreamAlias("DEFAULT")
  protected String _default;

  @XStreamAlias("SELECTION_VALUES")
  protected SelectionValuesElementType selVals;

  public long getListId()
  {
    return listid;
  }

  public void setListId(long listid)
  {
    this.listid = listid;
  }

  public String getColumnName()
  {
    return columnName;
  }

  public void setColumnName(String columnName)
  {
    this.columnName = columnName;
  }

  public int getColumnType()
  {
    return columnType;
  }

  public void setColumnType(int columnType)
  {
    this.columnType = columnType;
  }

  public SelectionValuesElementType getSelectionValues()
  {
    return selVals;
  }

  public void setSelectionValues(SelectionValuesElementType selVals)
  {
    this.selVals = selVals;
  }

  public Class<AddListColumnResult> getResultType() {
    return AddListColumnResult.class;
  }

}
