package com.adjust.sdk.network;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

public class UtilNetworking {
    /* access modifiers changed from: private */
    public static String userAgent;

    public interface IConnectionOptions {
        void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str);
    }

    public interface IHttpsURLConnectionProvider {
        HttpsURLConnection generateHttpsURLConnection(URL url);
    }

    public static IConnectionOptions createDefaultConnectionOptions() {
        return new IConnectionOptions() {
            public void applyConnectionOptions(HttpsURLConnection httpsURLConnection, String str) {
                httpsURLConnection.setRequestProperty("Client-SDK", str);
                httpsURLConnection.setConnectTimeout(60000);
                httpsURLConnection.setReadTimeout(60000);
                if (UtilNetworking.userAgent != null) {
                    httpsURLConnection.setRequestProperty("User-Agent", UtilNetworking.userAgent);
                }
            }
        };
    }

    public static IHttpsURLConnectionProvider createDefaultHttpsURLConnectionProvider() {
        return new IHttpsURLConnectionProvider() {
            public HttpsURLConnection generateHttpsURLConnection(URL url) {
                return (HttpsURLConnection) url.openConnection();
            }
        };
    }

    public static Long extractJsonLong(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof Long) {
            return (Long) opt;
        }
        if (opt instanceof Number) {
            return Long.valueOf(((Number) opt).longValue());
        }
        if (!(opt instanceof String)) {
            return null;
        }
        try {
            return Long.valueOf((long) Double.parseDouble((String) opt));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String extractJsonString(JSONObject jSONObject, String str) {
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return (String) opt;
        }
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static void setUserAgent(String str) {
        userAgent = str;
    }
}
