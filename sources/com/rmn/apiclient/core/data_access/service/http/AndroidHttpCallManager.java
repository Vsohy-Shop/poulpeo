package com.rmn.apiclient.core.data_access.service.http;

import com.rmn.apiclient.core.config.IAPIConfig;
import com.rmn.apiclient.core.data.descriptor.IDocumentDescriptor;
import com.rmn.apiclient.core.data.serializer.IDocumentSerializer;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.APIParam;
import com.rmn.apiclient.core.data_access.base.call.MethodVerb;
import com.rmn.apiclient.core.data_access.base.call.ParamType;
import com.rmn.apiclient.core.data_access.service.call.ServiceCallListener;
import com.rmn.apiclient.core.data_access.service.call.ServiceInput;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p446vd.C13633n;

/* compiled from: AndroidHttpCallManager.kt */
public final class AndroidHttpCallManager implements IHttpCallManager {
    private final OkHttpClient client;
    private final IAPIConfig config;
    private final Map<String, String> defaultHeaders;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MethodVerb.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MethodVerb.GET.ordinal()] = 1;
            iArr[MethodVerb.POST.ordinal()] = 2;
        }
    }

    public AndroidHttpCallManager(ContextContainer contextContainer, IAPIConfig iAPIConfig, Map<String, String> map) {
        C12775o.m28640j(contextContainer, "contextContainer");
        C12775o.m28640j(iAPIConfig, "config");
        this.config = iAPIConfig;
        this.client = new AndroidHttpClientGenerator().generate(contextContainer, iAPIConfig).callTimeout(iAPIConfig.getMaxTimeoutSec(), TimeUnit.SECONDS).protocols(C12726w.m28527n(Protocol.HTTP_2, Protocol.HTTP_1_1)).build();
        if (map == null) {
            this.defaultHeaders = new HashMap();
        } else {
            this.defaultHeaders = new HashMap(map);
        }
    }

    private final Request buildGetRequest(ServiceInput serviceInput, HttpUrl.Builder builder) {
        for (APIParam next : serviceInput.getParamsForParamType(ParamType.DEFAULT)) {
            if (next.hasValue()) {
                String str = next.name;
                C12775o.m28635e(str, "param.name");
                C12775o.m28635e(next, "param");
                builder.addQueryParameter(str, next.getStringValue());
            }
        }
        return newRequestBuilder(serviceInput.getHeaders()).url(builder.build()).get().build();
    }

    private final Request buildPostRequest(ServiceInput serviceInput, HttpUrl.Builder builder) {
        RequestBody requestBody;
        String str;
        if (!serviceInput.getBody().hasBody() || !serviceInput.getMethodDescriptor().hasDocumentDescriptor()) {
            FormBody.Builder builder2 = new FormBody.Builder((Charset) null, 1, (DefaultConstructorMarker) null);
            for (APIParam next : serviceInput.getParamsForParamType(ParamType.DEFAULT)) {
                if (next.hasValue()) {
                    String str2 = next.name;
                    C12775o.m28635e(str2, "param.name");
                    C12775o.m28635e(next, "param");
                    String stringValue = next.getStringValue();
                    C12775o.m28635e(stringValue, "param.stringValue");
                    builder2.add(str2, stringValue);
                }
            }
            requestBody = builder2.build();
        } else {
            IDocumentDescriptor iDocumentDescriptor = serviceInput.getMethodDescriptor().documentDescriptor;
            if (iDocumentDescriptor == null) {
                C12775o.m28650t();
            }
            C12775o.m28635e(iDocumentDescriptor, "input.methodDescriptor\n …    .documentDescriptor!!");
            IDocumentSerializer serializer = iDocumentDescriptor.getSerializer();
            T t = serviceInput.getBody().body;
            if (t != null) {
                JSONObject serialize = serializer.serialize((IDocument) t);
                if (serialize == null || (str = serialize.toString()) == null) {
                    str = "";
                }
                C12775o.m28635e(str, "serializedBody?.toString() ?: \"\"");
                requestBody = RequestBody.Companion.create(str, MediaType.Companion.parse("application/json"));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.rmn.apiclient.core.data.structure.IDocument");
            }
        }
        return newRequestBuilder(serviceInput.getHeaders()).url(builder.build()).post(requestBody).build();
    }

    private final Request.Builder newRequestBuilder(Map<String, String> map) {
        Request.Builder builder = new Request.Builder();
        for (Map.Entry next : this.defaultHeaders.entrySet()) {
            builder.addHeader((String) next.getKey(), (String) next.getValue());
        }
        if (map == null) {
            return builder;
        }
        for (Map.Entry next2 : map.entrySet()) {
            builder.addHeader((String) next2.getKey(), (String) next2.getValue());
        }
        return builder;
    }

    public void call(ServiceInput serviceInput, ServiceCallListener serviceCallListener) {
        String str;
        Request request;
        C12775o.m28640j(serviceInput, "input");
        C12775o.m28640j(serviceCallListener, "listener");
        C13633n.m31166v("CALL OKHTTP");
        HttpUrl.Companion companion = HttpUrl.Companion;
        String aPIUrl = this.config.getAPIUrl();
        C12775o.m28635e(aPIUrl, "config.apiUrl");
        HttpUrl.Builder newBuilder = companion.get(aPIUrl).newBuilder();
        String str2 = serviceInput.getMethodDescriptor().name;
        C12775o.m28635e(str2, "input.methodDescriptor.name");
        loop0:
        while (true) {
            str = str2;
            for (APIParam next : serviceInput.getParamsForParamType(ParamType.PATH)) {
                T t = next.value;
                if (t != null) {
                    str2 = C13754v.m31521A(str, "{" + next.name + "}", t.toString(), false, 4, (Object) null);
                }
            }
            break loop0;
        }
        newBuilder.addPathSegments(str);
        int i = WhenMappings.$EnumSwitchMapping$0[serviceInput.getMethodDescriptor().verb.ordinal()];
        if (i == 1) {
            request = buildGetRequest(serviceInput, newBuilder);
        } else if (i != 2) {
            serviceCallListener.onError(new Exception("Http Verb not managed : " + serviceInput.getMethodDescriptor().verb));
            return;
        } else {
            request = buildPostRequest(serviceInput, newBuilder);
        }
        C13633n.m31162r("Call HTTP request : " + request);
        this.client.newCall(request).enqueue(new AndroidHttpCallManager$call$2(serviceCallListener));
    }
}
