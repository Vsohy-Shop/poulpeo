package com.rmn.api.p322v2.cloud.parsing;

import com.rmn.api.p322v2.main.parser.IResponseParser;
import com.rmn.api.p322v2.main.result.ResponseResult;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.cloud.parsing.ResponseParserCloud */
public class ResponseParserCloud implements IResponseParser {
    private static final String FIELD_DATA = "data";
    private static final String FIELD_ERROR_CODE = "code";
    private static final String FIELD_MESSAGE = "message";
    private static final String FIELD_STATUS = "status";
    private static final String FIELD_USER_MESSAGE = "user_message";
    private static final String VAL_STATUS_ERROR = "error";
    private static final String VAL_STATUS_FAILED = "failed";
    private static final String VAL_STATUS_OK = "ok";

    public void parseMetadata(ResponseResult responseResult, JSONObject jSONObject) {
        if (responseResult == null) {
            throw new IllegalArgumentException();
        } else if (jSONObject != null) {
            String optString = jSONObject.optString("status");
            if (optString == null) {
                responseResult.initWithWellFormedRawDataProblem();
            } else if (optString.equals(VAL_STATUS_FAILED) || optString.equals("error")) {
                responseResult.initWithError(jSONObject.optInt(FIELD_ERROR_CODE, -1), jSONObject.optString(FIELD_MESSAGE), jSONObject.optJSONObject(FIELD_DATA), jSONObject.optString(FIELD_USER_MESSAGE));
            } else if (!optString.equals(VAL_STATUS_OK)) {
                responseResult.initWithWellFormedRawDataProblem();
            } else {
                JSONObject optJSONObject = jSONObject.optJSONObject(FIELD_DATA);
                if (optJSONObject != null) {
                    responseResult.initWithResponseData(optJSONObject);
                    return;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(FIELD_DATA);
                if (optJSONArray != null) {
                    responseResult.initWithResponseDataArray(optJSONArray);
                } else {
                    responseResult.initWithResponseData((JSONObject) null);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
