package com.adjust.sdk.network;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.adjust.sdk.ActivityKind;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.TrackingState;
import com.adjust.sdk.Util;
import com.adjust.sdk.network.IActivityPackageSender;
import com.adjust.sdk.network.UtilNetworking;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;
import com.adjust.sdk.scheduler.ThreadExecutor;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import org.json.JSONException;
import org.json.JSONObject;

public class ActivityPackageSender implements IActivityPackageSender {
    private String basePath;
    private String clientSdk;
    private UtilNetworking.IConnectionOptions connectionOptions;
    private ThreadExecutor executor = new SingleThreadCachedScheduler("ActivityPackageSender");
    private String gdprPath;
    private UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider;
    private ILogger logger = AdjustFactory.getLogger();
    private String subscriptionPath;
    private UrlStrategy urlStrategy;

    public ActivityPackageSender(String str, String str2, String str3, String str4, String str5) {
        this.basePath = str2;
        this.gdprPath = str3;
        this.subscriptionPath = str4;
        this.clientSdk = str5;
        this.urlStrategy = new UrlStrategy(AdjustFactory.getBaseUrl(), AdjustFactory.getGdprUrl(), AdjustFactory.getSubscriptionUrl(), str);
        this.httpsURLConnectionProvider = AdjustFactory.getHttpsURLConnectionProvider();
        this.connectionOptions = AdjustFactory.getConnectionOptions();
    }

    private String buildAuthorizationHeader(ActivityPackage activityPackage) {
        Map<String, String> parameters = activityPackage.getParameters();
        String activityKind = activityPackage.getActivityKind().toString();
        String extractSecretId = extractSecretId(parameters);
        String str = extractSecretId;
        String buildAuthorizationHeaderV2 = buildAuthorizationHeaderV2(extractSignature(parameters), str, extractHeadersId(parameters), extractAlgorithm(parameters), extractNativeVersion(parameters));
        if (buildAuthorizationHeaderV2 != null) {
            return buildAuthorizationHeaderV2;
        }
        return buildAuthorizationHeaderV1(parameters, extractAppSecret(parameters), extractSecretId, activityKind);
    }

    private String buildAuthorizationHeaderV1(Map<String, String> map, String str, String str2, String str3) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Map<String, String> signature = getSignature(map, str3, str);
        String sha256 = Util.sha256(signature.get("clear_signature"));
        String formatString = Util.formatString("Signature %s,%s,%s,%s", Util.formatString("secret_id=\"%s\"", str2), Util.formatString("signature=\"%s\"", sha256), Util.formatString("algorithm=\"%s\"", "sha256"), Util.formatString("headers=\"%s\"", signature.get("fields")));
        this.logger.verbose("authorizationHeader: %s", formatString);
        return formatString;
    }

    private String buildAuthorizationHeaderV2(String str, String str2, String str3, String str4, String str5) {
        if (str2 == null || str == null || str3 == null) {
            return null;
        }
        String formatString = Util.formatString("signature=\"%s\"", str);
        String formatString2 = Util.formatString("secret_id=\"%s\"", str2);
        String formatString3 = Util.formatString("headers_id=\"%s\"", str3);
        Object[] objArr = new Object[1];
        if (str4 == null) {
            str4 = "adj1";
        }
        objArr[0] = str4;
        String formatString4 = Util.formatString("algorithm=\"%s\"", objArr);
        Object[] objArr2 = new Object[1];
        if (str5 == null) {
            str5 = "";
        }
        objArr2[0] = str5;
        String formatString5 = Util.formatString("Signature %s,%s,%s,%s,%s", formatString, formatString2, formatString4, formatString3, Util.formatString("native_version=\"%s\"", objArr2));
        this.logger.verbose("authorizationHeader: %s", formatString5);
        return formatString5;
    }

    private DataOutputStream configConnectionForGET(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        return null;
    }

    private DataOutputStream configConnectionForPOST(HttpsURLConnection httpsURLConnection, ActivityPackage activityPackage, Map<String, String> map) {
        httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        String generatePOSTBodyString = generatePOSTBodyString(activityPackage.getParameters(), map);
        if (generatePOSTBodyString == null) {
            return null;
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(generatePOSTBodyString);
        return dataOutputStream;
    }

    private String errorMessage(Throwable th, String str, ActivityPackage activityPackage) {
        return Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), Util.getReasonString(str, th));
    }

    private static String extractAlgorithm(Map<String, String> map) {
        return map.remove("algorithm");
    }

    private static String extractAppSecret(Map<String, String> map) {
        return map.remove("app_secret");
    }

    private static void extractEventCallbackId(Map<String, String> map) {
        map.remove("event_callback_id");
    }

    private static String extractHeadersId(Map<String, String> map) {
        return map.remove("headers_id");
    }

    private static String extractNativeVersion(Map<String, String> map) {
        return map.remove("native_version");
    }

    private static String extractSecretId(Map<String, String> map) {
        return map.remove("secret_id");
    }

    private static String extractSignature(Map<String, String> map) {
        return map.remove("signature");
    }

    private String generatePOSTBodyString(Map<String, String> map, Map<String, String> map2) {
        if (map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        injectParametersToPOSTStringBuilder(map, sb);
        injectParametersToPOSTStringBuilder(map2, sb);
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private String generateUrlStringForGET(ActivityPackage activityPackage, Map<String, String> map) {
        URL url = new URL(urlWithExtraPathByActivityKind(activityPackage.getActivityKind(), this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind())));
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(activityPackage.getPath());
        this.logger.debug("Making request to url: %s", builder.toString());
        for (Map.Entry next : activityPackage.getParameters().entrySet()) {
            builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        if (map != null) {
            for (Map.Entry next2 : map.entrySet()) {
                builder.appendQueryParameter((String) next2.getKey(), (String) next2.getValue());
            }
        }
        return builder.build().toString();
    }

    private String generateUrlStringForPOST(ActivityPackage activityPackage) {
        String formatString = Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityPackage.getActivityKind(), this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind())), activityPackage.getPath());
        this.logger.debug("Making request to url : %s", formatString);
        return formatString;
    }

    private Map<String, String> getSignature(Map<String, String> map, String str, String str2) {
        String validIdentifier = getValidIdentifier(map);
        String str3 = map.get(APIParams.SOURCE);
        String str4 = map.get("payload");
        HashMap hashMap = new HashMap();
        hashMap.put("app_secret", str2);
        hashMap.put("created_at", map.get("created_at"));
        hashMap.put("activity_kind", str);
        hashMap.put(validIdentifier, map.get(validIdentifier));
        if (str3 != null) {
            hashMap.put(APIParams.SOURCE, str3);
        }
        if (str4 != null) {
            hashMap.put("payload", str4);
        }
        String str5 = "";
        String str6 = str5;
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() != null) {
                str5 = str5 + ((String) entry.getKey()) + " ";
                str6 = str6 + ((String) entry.getValue());
            }
        }
        String substring = str5.substring(0, str5.length() - 1);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("clear_signature", str6);
        hashMap2.put("fields", substring);
        return hashMap2;
    }

    private String getValidIdentifier(Map<String, String> map) {
        if (map.get("gps_adid") != null) {
            return "gps_adid";
        }
        if (map.get("fire_adid") != null) {
            return "fire_adid";
        }
        if (map.get("android_id") != null) {
            return "android_id";
        }
        if (map.get("mac_sha1") != null) {
            return "mac_sha1";
        }
        if (map.get("mac_md5") != null) {
            return "mac_md5";
        }
        if (map.get("android_uuid") != null) {
            return "android_uuid";
        }
        return null;
    }

    private void injectParametersToPOSTStringBuilder(Map<String, String> map, StringBuilder sb) {
        String str;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                String encode = URLEncoder.encode((String) next.getKey(), Constants.ENCODING);
                String str2 = (String) next.getValue();
                if (str2 != null) {
                    str = URLEncoder.encode(str2, Constants.ENCODING);
                } else {
                    str = "";
                }
                sb.append(encode);
                sb.append("=");
                sb.append(str);
                sb.append("&");
            }
        }
    }

    private void localError(Throwable th, String str, ResponseData responseData) {
        String errorMessage = errorMessage(th, str, responseData.activityPackage);
        this.logger.error(errorMessage, new Object[0]);
        responseData.message = errorMessage;
        responseData.willRetry = false;
    }

    private void parseResponse(ResponseData responseData, String str) {
        JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new Object[0]);
            return;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            this.logger.error(errorMessage(e, "Failed to parse JSON response", responseData.activityPackage), new Object[0]);
            jSONObject = null;
        }
        if (jSONObject != null) {
            responseData.jsonResponse = jSONObject;
            responseData.message = UtilNetworking.extractJsonString(jSONObject, "message");
            responseData.adid = UtilNetworking.extractJsonString(jSONObject, "adid");
            responseData.timestamp = UtilNetworking.extractJsonString(jSONObject, "timestamp");
            String extractJsonString = UtilNetworking.extractJsonString(jSONObject, "tracking_state");
            if (extractJsonString != null && extractJsonString.equals("opted_out")) {
                responseData.trackingState = TrackingState.OPTED_OUT;
            }
            responseData.askIn = UtilNetworking.extractJsonLong(jSONObject, "ask_in");
            responseData.retryIn = UtilNetworking.extractJsonLong(jSONObject, "retry_in");
            responseData.continueIn = UtilNetworking.extractJsonLong(jSONObject, "continue_in");
            responseData.attribution = AdjustAttribution.fromJson(jSONObject.optJSONObject("attribution"), responseData.adid, Util.getSdkPrefixPlatform(this.clientSdk));
        }
    }

    private void remoteError(Throwable th, String str, ResponseData responseData) {
        String str2 = errorMessage(th, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
    }

    private boolean shouldRetryToSend(ResponseData responseData) {
        if (!responseData.willRetry) {
            this.logger.debug("Will not retry with current url strategy", new Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        } else if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new Object[0]);
            return true;
        } else {
            this.logger.error("Failed with current url strategy and it will not retry", new Object[0]);
            return false;
        }
    }

    private void tryToGetResponse(ResponseData responseData) {
        boolean z;
        String str;
        DataOutputStream dataOutputStream;
        boolean z2;
        DataOutputStream dataOutputStream2 = null;
        try {
            ActivityPackage activityPackage = responseData.activityPackage;
            Map<String, String> map = responseData.sendingParameters;
            boolean z3 = true;
            if (activityPackage.getActivityKind() == ActivityKind.ATTRIBUTION) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                extractEventCallbackId(activityPackage.getParameters());
                str = generateUrlStringForGET(activityPackage, map);
            } else {
                str = generateUrlStringForPOST(activityPackage);
            }
            HttpsURLConnection generateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new URL(str));
            this.connectionOptions.applyConnectionOptions(generateHttpsURLConnection, activityPackage.getClientSdk());
            String buildAuthorizationHeader = buildAuthorizationHeader(activityPackage);
            if (buildAuthorizationHeader != null) {
                generateHttpsURLConnection.setRequestProperty("Authorization", buildAuthorizationHeader);
            }
            if (z) {
                dataOutputStream = configConnectionForGET(generateHttpsURLConnection);
            } else {
                extractEventCallbackId(activityPackage.getParameters());
                dataOutputStream = configConnectionForPOST(generateHttpsURLConnection, activityPackage, map);
            }
            Integer readConnectionResponse = readConnectionResponse(generateHttpsURLConnection, responseData);
            if (responseData.jsonResponse == null || responseData.retryIn != null || readConnectionResponse == null || readConnectionResponse.intValue() != 200) {
                z2 = false;
            } else {
                z2 = true;
            }
            responseData.success = z2;
            if (responseData.jsonResponse != null) {
                if (responseData.retryIn == null) {
                    z3 = false;
                }
            }
            responseData.willRetry = z3;
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (IOException e) {
                    this.logger.error(errorMessage(e, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (UnsupportedEncodingException e2) {
            localError(e2, "Failed to encode parameters", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e3) {
                    this.logger.error(errorMessage(e3, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (MalformedURLException e4) {
            localError(e4, "Malformed URL", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e5) {
                    this.logger.error(errorMessage(e5, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (ProtocolException e6) {
            localError(e6, "Protocol Error", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e7) {
                    this.logger.error(errorMessage(e7, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SocketTimeoutException e8) {
            remoteError(e8, "Request timed out", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e9) {
                    this.logger.error(errorMessage(e9, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (SSLHandshakeException e10) {
            remoteError(e10, "Certificate failed", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e11) {
                    this.logger.error(errorMessage(e11, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (IOException e12) {
            remoteError(e12, "Request failed", responseData);
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e13) {
                    this.logger.error(errorMessage(e13, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                } catch (IOException e14) {
                    this.logger.error(errorMessage(e14, "Flushing and closing connection output stream", responseData.activityPackage), new Object[0]);
                }
            }
            throw th;
        }
    }

    private String urlWithExtraPathByActivityKind(ActivityKind activityKind, String str) {
        if (activityKind == ActivityKind.GDPR) {
            if (this.gdprPath == null) {
                return str;
            }
            return str + this.gdprPath;
        } else if (activityKind == ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath == null) {
                return str;
            }
            return str + this.subscriptionPath;
        } else if (this.basePath == null) {
            return str;
        } else {
            return str + this.basePath;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r7 == null) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer readConnectionResponse(javax.net.ssl.HttpsURLConnection r7, com.adjust.sdk.ResponseData r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
            r7.connect()     // Catch:{ IOException -> 0x003d }
            int r3 = r7.getResponseCode()     // Catch:{ IOException -> 0x003d }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x003d }
            int r3 = r2.intValue()     // Catch:{ IOException -> 0x003d }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x001f
            java.io.InputStream r3 = r7.getErrorStream()     // Catch:{ IOException -> 0x003d }
            goto L_0x0023
        L_0x001f:
            java.io.InputStream r3 = r7.getInputStream()     // Catch:{ IOException -> 0x003d }
        L_0x0023:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x003d }
            r4.<init>(r3)     // Catch:{ IOException -> 0x003d }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003d }
            r3.<init>(r4)     // Catch:{ IOException -> 0x003d }
        L_0x002d:
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x003d }
            if (r4 == 0) goto L_0x0037
            r0.append(r4)     // Catch:{ IOException -> 0x003d }
            goto L_0x002d
        L_0x0037:
            r7.disconnect()
            goto L_0x0050
        L_0x003b:
            r8 = move-exception
            goto L_0x00a8
        L_0x003d:
            r3 = move-exception
            java.lang.String r4 = "Connecting and reading response"
            com.adjust.sdk.ActivityPackage r5 = r8.activityPackage     // Catch:{ all -> 0x003b }
            java.lang.String r3 = r6.errorMessage(r3, r4, r5)     // Catch:{ all -> 0x003b }
            com.adjust.sdk.ILogger r4 = r6.logger     // Catch:{ all -> 0x003b }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x003b }
            r4.error(r3, r5)     // Catch:{ all -> 0x003b }
            if (r7 == 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            int r7 = r0.length()
            if (r7 != 0) goto L_0x0060
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.String r8 = "Empty response string buffer"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.error(r8, r0)
            return r2
        L_0x0060:
            int r7 = r2.intValue()
            r3 = 429(0x1ad, float:6.01E-43)
            if (r7 != r3) goto L_0x0072
            com.adjust.sdk.ILogger r7 = r6.logger
            java.lang.String r8 = "Too frequent requests to the endpoint (429)"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r7.error(r8, r0)
            return r2
        L_0x0072:
            java.lang.String r7 = r0.toString()
            com.adjust.sdk.ILogger r0 = r6.logger
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r7
            java.lang.String r5 = "Response string: %s"
            r0.debug(r5, r4)
            r6.parseResponse(r8, r7)
            java.lang.String r7 = r8.message
            if (r7 != 0) goto L_0x008a
            return r2
        L_0x008a:
            int r8 = r2.intValue()
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.String r4 = "Response message: %s"
            if (r8 != r0) goto L_0x009e
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.info(r4, r0)
            goto L_0x00a7
        L_0x009e:
            com.adjust.sdk.ILogger r8 = r6.logger
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r7
            r8.error(r4, r0)
        L_0x00a7:
            return r2
        L_0x00a8:
            if (r7 == 0) goto L_0x00ad
            r7.disconnect()
        L_0x00ad:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.network.ActivityPackageSender.readConnectionResponse(javax.net.ssl.HttpsURLConnection, com.adjust.sdk.ResponseData):java.lang.Integer");
    }

    public void sendActivityPackage(final ActivityPackage activityPackage, final Map<String, String> map, final IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new Runnable() {
            public void run() {
                responseDataCallbackSubscriber.onResponseDataCallback(ActivityPackageSender.this.sendActivityPackageSync(activityPackage, map));
            }
        });
    }

    public ResponseData sendActivityPackageSync(ActivityPackage activityPackage, Map<String, String> map) {
        ResponseData buildResponseData;
        do {
            buildResponseData = ResponseData.buildResponseData(activityPackage, map);
            tryToGetResponse(buildResponseData);
        } while (shouldRetryToSend(buildResponseData));
        return buildResponseData;
    }
}
