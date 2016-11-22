package com.silverpop.api.client.command;

import com.silverpop.api.client.ApiCommand;
import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.XmlApiProperties;
import com.silverpop.api.client.result.DeleteListResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;


@XmlApiProperties("DeleteList")
public class DeleteListCommand implements ApiCommand {

	@XStreamAlias("LIST_ID")
	private Long listId;

    @XStreamAlias("LIST_NAME")
    private String listName;

    @XStreamAlias("LIST_VISIBILITY")
    private String listVisibility;

    @XStreamAlias("EMAIL")
	private String email;

    @XStreamAlias("KEEP_DETAILS")
    private boolean keepListDetails;

    @XStreamAlias("RECURSIVE")
    private boolean isRecursive;


    @Override
    public Class<? extends ApiResult> getResultType() {
        return DeleteListResult.class;
    }


    public boolean isRecursive() {
        return isRecursive;
    }

    public void setRecursive(boolean isRecursive) {
        this.isRecursive = isRecursive;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListVisibility() {
        return listVisibility;
    }

    public void setListVisibility(String listVisibility) {
        this.listVisibility = listVisibility;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean keepListDetails() {
        return keepListDetails;
    }

    public void setKeepListDetails(boolean keepListDetails) {
        this.keepListDetails = keepListDetails;
    }
}
