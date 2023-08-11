package com.rmn.api.p322v2.main.parser;

import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.general.responseobject.RMNResponseObjectImmutable;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.proxy.ProxyResponseObject;
import com.rmn.api.p322v2.main.result.ResponseResult;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.rmn.api.v2.main.parser.ProxyMethodParserDefault */
public class ProxyMethodParserDefault implements IProxyMethodParser {
    public final Map<RMNMethodReturnType, RMNResponseObjectImmutable> parseResponseString(ContextContainer contextContainer, ProxyBundleOutput proxyBundleOutput, String str) {
        IProxyMethodType methodType = proxyBundleOutput.getMethodType();
        Set<RMNMethodReturnType> returns = methodType.getReturns(contextContainer);
        if (returns != null) {
            HashMap hashMap = new HashMap(returns.size());
            ResponseResult responseResult = new ResponseResult(methodType.getApiType(), str);
            if (!responseResult.hasWellFormedRawData()) {
                proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.PARSING_FAILED);
                throw new Exception("Wrong JSON meta data structure");
            } else if (responseResult.hasNoError()) {
                try {
                    JSONObject responseData = responseResult.getResponseData();
                    for (RMNMethodReturnType next : returns) {
                        ProxyResponseObject proxyResponseObject = new ProxyResponseObject(next);
                        if (proxyResponseObject.setJSONObject(responseData)) {
                            hashMap.put(next, proxyResponseObject);
                        } else if (next.isRequired()) {
                            proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.PARSING_FAILED);
                            throw new Exception("Parsing failed in output");
                        }
                    }
                    proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.OK);
                    return hashMap;
                } catch (Exception e) {
                    proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.PARSING_FAILED);
                    throw new Exception("Parsing failed in output : " + e);
                }
            } else {
                proxyBundleOutput.setStatus(ProxyBundleOutput.ProxyOutputStatus.ERROR);
                proxyBundleOutput.setErrorCode(responseResult.getErrorCode());
                proxyBundleOutput.setErrorData(responseResult.getResponseData());
                proxyBundleOutput.setUserMessage(responseResult.getUserMessage());
                throw new Exception("Server returned a personnalised error code");
            }
        } else {
            throw new IllegalStateException("The returnTypesSet is null");
        }
    }
}
