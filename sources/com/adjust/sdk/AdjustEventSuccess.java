package com.adjust.sdk;

import org.json.JSONObject;

public class AdjustEventSuccess {
    public String adid;
    public String callbackId;
    public String eventToken;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;

    public String toString() {
        return Util.formatString("Event Success msg:%s time:%s adid:%s event:%s cid:%s json:%s", this.message, this.timestamp, this.adid, this.eventToken, this.callbackId, this.jsonResponse);
    }
}
