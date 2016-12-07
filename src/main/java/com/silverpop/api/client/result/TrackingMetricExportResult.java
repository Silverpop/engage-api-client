package com.silverpop.api.client.result;

import com.silverpop.api.client.ApiResult;
import com.silverpop.api.client.command.elements.TrackingMetricMailingElementType;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PeterJLyons on 10/15/2015.
 */
public class TrackingMetricExportResult implements ApiResult {

    @XStreamAlias("SUCCESS")
    private boolean success;

    @XStreamImplicit(itemFieldName = "MAILING")
    private List<TrackingMetricMailingElementType> mailings;

    public boolean isSuccess() {
        return success;
    }

    public List<TrackingMetricMailingElementType> getMailings() {
        if(this.mailings == null)
        {
            this.mailings = new ArrayList<TrackingMetricMailingElementType>();
        }

        return mailings;
    }


}
