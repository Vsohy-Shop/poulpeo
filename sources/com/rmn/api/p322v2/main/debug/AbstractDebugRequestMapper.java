package com.rmn.api.p322v2.main.debug;

import com.rmn.api.p322v2.main.oauth.BundleRequest;
import java.util.List;
import java.util.Map;

/* renamed from: com.rmn.api.v2.main.debug.AbstractDebugRequestMapper */
public abstract class AbstractDebugRequestMapper {
    public static final String QUOTE = "\"";

    protected static String createJSONArray(List<String> list) {
        String str = "";
        int i = 0;
        for (String next : list) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + next;
            i++;
        }
        return "[" + str + "]";
    }

    protected static String createJSONObject(Map<String, String> map) {
        String str = "";
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getKey();
            String str3 = (String) next.getValue();
            if (i > 0) {
                str = str + ",";
            }
            str = str + QUOTE + str2 + QUOTE + ":" + str3;
            i++;
        }
        return "{" + str + "}";
    }

    protected static String createJSONValue(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (obj instanceof Map) {
                return createJSONObject((Map) obj);
            }
            if (obj instanceof List) {
                return createJSONArray((List) obj);
            }
            if (obj.getClass() != String.class) {
                return obj.toString();
            }
            return QUOTE + obj + QUOTE;
        } catch (Exception unused) {
            throw new IllegalStateException("Should use createJSONObject or createJSONArray in place of createJSONValue");
        }
    }

    public abstract String getFakeResponse(BundleRequest bundleRequest);
}
