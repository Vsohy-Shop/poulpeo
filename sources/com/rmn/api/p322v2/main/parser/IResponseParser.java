package com.rmn.api.p322v2.main.parser;

import com.rmn.api.p322v2.main.result.ResponseResult;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.main.parser.IResponseParser */
public interface IResponseParser {
    void parseMetadata(ResponseResult responseResult, JSONObject jSONObject);
}
