package com.adjust.sdk;

import org.json.JSONObject;

public class AdjustEventFailure {
    public String adid;
    public String callbackId;
    public String eventToken;
    public JSONObject jsonResponse;
    public String message;
    public String timestamp;
    public boolean willRetry;

    public String toString() {
        return Util.formatString("Event Failure msg:%s time:%s adid:%s event:%s cid:%s retry:%b json:%s", this.message, this.timestamp, this.adid, this.eventToken, this.callbackId, Boolean.valueOf(this.willRetry), this.jsonResponse);
    }
}
