package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class GetMessageGroupDetailsResult implements ApiResult {
    @XStreamAlias("SUCCESS")
    protected Boolean success;
    @XStreamAlias("ID")
    protected Long id;
    @XStreamAlias("NAME")
    protected String name;


    @XStreamAlias("USER_ID")
    protected String userId;

    @XStreamAlias("STATUS")
    protected String status;

    @XStreamAlias("NOTES")
    protected String notes;

    @XStreamAlias("LIST_ID")
    protected Long listId;

    @XStreamAlias("EVENT_TRIGGER")
    protected String eventTrigger;

    @XStreamAlias("TRACKING_LEVEL")
    protected String trackingLevel;

    @XStreamAlias("CUSTOM_EVENT_DATE_COLUMN")
    protected String customEventDateColumn;

    @XStreamAlias("SEND_PREVIOUS")
    protected Boolean sendPrevious;

    @XStreamAlias("ACTIVATION_DATE")
    protected  String activationDate;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
    }

    public String getEventTrigger() {
        return eventTrigger;
    }

    public void setEventTrigger(String eventTrigger) {
        this.eventTrigger = eventTrigger;
    }

    public String getTrackingLevel() {
        return trackingLevel;
    }

    public void setTrackingLevel(String trackingLevel) {
        this.trackingLevel = trackingLevel;
    }

    public String getCustomEventDateColumn() {
        return customEventDateColumn;
    }

    public void setCustomEventDateColumn(String customEventDateColumn) {
        this.customEventDateColumn = customEventDateColumn;
    }

    public Boolean getSendPrevious() {
        return sendPrevious;
    }

    public void setSendPrevious(Boolean sendPrevious) {
        this.sendPrevious = sendPrevious;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

}


