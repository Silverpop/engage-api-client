package com.silverpop.api.client.mailing.command;


import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SOCIAL_NETWORK")
public class AuthorizedSocialNetwork {
    @XStreamAlias("NAME")
    private String name;

    @XStreamAlias("MESSAGE")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
