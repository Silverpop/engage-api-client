package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.command.elements.MapFieldElementType;
import com.silverpop.api.client.result.JoinTableResult;
import com.silverpop.api.client.result.LoginResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PeterJLyons on 10/12/2015.
 */
@XmlApiProperties("JoinTable")
public class JoinTableCommand implements ApiCommand {

    @XStreamAlias("TABLE_NAME")
    protected String tablename;
    @XStreamAlias("TABLE_ID")
    protected Long tableid;
    @XStreamAlias("TABLE_VISIBILITY")
    protected Integer tablevisibility;
    @XStreamAlias("LIST_NAME")
    protected String listname;
    @XStreamAlias("LIST_ID")
    protected Long listid;
    @XStreamAlias("LIST_VISIBILITY")
    protected Integer listvisibility;
    @XStreamAlias("REMOVE")
    protected String remove;
    @XStreamAlias("EMAIL")
    protected String email;
    @XStreamImplicit(itemFieldName = "MAP_FIELD")
    protected List<MapFieldElementType> mapfields;

    @Override
    public Class<JoinTableResult> getResultType() {
        return JoinTableResult.class;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Long getTableid() {
        return tableid;
    }

    public void setTableid(Long tableid) {
        this.tableid = tableid;
    }

    public Integer getTablevisibility() {
        return tablevisibility;
    }

    public void setTablevisibility(Integer tablevisibility) {
        this.tablevisibility = tablevisibility;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }

    public Long getListid() {
        return listid;
    }

    public void setListid(Long listid) {
        this.listid = listid;
    }

    public Integer getListvisibility() {
        return listvisibility;
    }

    public void setListvisibility(Integer listvisibility) {
        this.listvisibility = listvisibility;
    }

    public String getRemove() {
        return remove;
    }

    public void setRemove(String remove) {
        this.remove = remove;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<MapFieldElementType> getMapfields() {
        if(this.mapfields == null)
        {
            mapfields = new ArrayList<MapFieldElementType>();
        }

        return mapfields;
    }

    public void setMapfields(List<MapFieldElementType> mapfields) {
        this.mapfields = mapfields;
    }
}
