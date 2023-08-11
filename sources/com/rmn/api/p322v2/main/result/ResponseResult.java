package com.rmn.api.p322v2.main.result;

import com.rmn.api.p322v2.main.general.IApiType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.main.result.ResponseResult */
public class ResponseResult {
    private int errorCode;
    private boolean hasNoError;
    private boolean hasWellFormedRawData;
    private boolean isJSONArray;
    private String message = "";
    private String rawJSON;
    private JSONObject responseData;
    private JSONArray responseDataArray;
    private final IApiType type;
    private String userMessage;

    public ResponseResult(IApiType iApiType, String str) {
        if (iApiType == null) {
            throw new IllegalArgumentException();
        } else if (str != null) {
            this.type = iApiType;
            this.rawJSON = str;
            if (str.equals("")) {
                initWithWellFormedRawDataProblem();
                return;
            }
            try {
                iApiType.getResultParser().parseMetadata(this, new JSONObject(str));
            } catch (JSONException unused) {
                initWithWellFormedRawDataProblem();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getErrorCode() {
        if (!this.hasWellFormedRawData) {
            throw new IllegalStateException("getErrorCode has been called but the result has not well formed raw data");
        } else if (!this.hasNoError) {
            return this.errorCode;
        } else {
            throw new IllegalStateException("getErrorCode has been called but the result has no error");
        }
    }

    public String getMessage() {
        if (this.hasWellFormedRawData) {
            return this.message;
        }
        throw new IllegalStateException("getMessage has been called but the result has not well formed raw data");
    }

    public String getRawJSON() {
        return this.rawJSON;
    }

    public JSONObject getResponseData() {
        if (!this.hasWellFormedRawData) {
            throw new IllegalStateException("getResponseData has been called but the result has not well formed raw data");
        } else if (!this.isJSONArray) {
            return this.responseData;
        } else {
            throw new WrongResultDataTypeException("Response data type is not a JSONObject");
        }
    }

    public JSONArray getResponseDataArray() {
        if (!this.hasWellFormedRawData) {
            throw new IllegalStateException("getResponseDataArray has been called but the result has not well formed raw data");
        } else if (!this.hasNoError) {
            throw new IllegalStateException("getResponseDataArray has been called but the result has an error");
        } else if (this.isJSONArray) {
            return this.responseDataArray;
        } else {
            throw new WrongResultDataTypeException("Response data type is not a JSONArray");
        }
    }

    public IApiType getType() {
        return this.type;
    }

    public String getUserMessage() {
        if (this.hasWellFormedRawData) {
            return this.userMessage;
        }
        throw new IllegalStateException("getUserMessage has been called ut the result has not well formed raw data");
    }

    public boolean hasNoError() {
        if (this.hasWellFormedRawData) {
            return this.hasNoError;
        }
        throw new IllegalStateException("hasNoError has been called but the result has not well formed raw data");
    }

    public boolean hasWellFormedRawData() {
        return this.hasWellFormedRawData;
    }

    public void initWithError(int i, String str, JSONObject jSONObject, String str2) {
        if (i < 0) {
            initWithWellFormedRawDataProblem();
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.hasWellFormedRawData = true;
        this.hasNoError = false;
        this.errorCode = i;
        if (str == null) {
            this.message = "";
        } else {
            this.message = str;
        }
        this.isJSONArray = false;
        this.responseData = jSONObject;
        this.responseDataArray = null;
        this.userMessage = str2;
    }

    public void initWithResponseData(JSONObject jSONObject) {
        initWithResponseData(jSONObject, (String) null);
    }

    public void initWithResponseDataArray(JSONArray jSONArray) {
        initWithResponseDataArray(jSONArray, (String) null);
    }

    public void initWithWellFormedRawDataProblem() {
        this.hasWellFormedRawData = false;
        this.hasNoError = false;
        this.errorCode = -1;
        this.message = "";
        this.isJSONArray = false;
        this.responseData = null;
        this.responseDataArray = null;
    }

    public boolean isJSONArray() {
        return this.isJSONArray;
    }

    public void initWithResponseData(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.hasWellFormedRawData = true;
        this.hasNoError = true;
        this.errorCode = -1;
        if (str == null) {
            this.message = "";
        } else {
            this.message = str;
        }
        this.isJSONArray = false;
        this.responseData = jSONObject;
        this.responseDataArray = null;
    }

    public void initWithResponseDataArray(JSONArray jSONArray, String str) {
        if (jSONArray == null) {
            initWithWellFormedRawDataProblem();
            return;
        }
        this.hasWellFormedRawData = true;
        this.hasNoError = true;
        this.errorCode = -1;
        if (str == null) {
            this.message = "";
        } else {
            this.message = str;
        }
        this.isJSONArray = true;
        this.responseData = null;
        this.responseDataArray = jSONArray;
    }
}
