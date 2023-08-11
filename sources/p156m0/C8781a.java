package p156m0;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p166n0.C8838a;
import p166n0.C8846d;
import p166n0.C8849e;
import p166n0.C8850f;
import p166n0.C8851g;
import p166n0.C8852h;
import p166n0.C8853i;
import p166n0.C8854j;
import p166n0.C8856k;
import p166n0.C8857l;
import p166n0.C8859m;
import p166n0.C8862n;
import p166n0.C8865o;
import p336ef.C11906l;
import p370jf.C12624c;
import p404of.C13074a;

/* renamed from: m0.a */
/* compiled from: BrazeActionParser.kt */
public final class C8781a {

    /* renamed from: a */
    public static final C8781a f12718a = new C8781a();

    /* renamed from: m0.a$a */
    /* compiled from: BrazeActionParser.kt */
    public enum C8782a {
        CONTAINER(APIResourceDescriptors.RESOURCE_TYPE_CONTAINER, C8846d.f12814b),
        LOG_CUSTOM_EVENT("logCustomEvent", C8850f.f12817b),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", C8857l.f12824b),
        REQUEST_PUSH_PERMISSION("requestPushPermission", C8856k.f12823b),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", r1),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", r1),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", C8838a.f12806b),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", C8854j.f12821b),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", C8859m.f12828b),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", C8862n.f12832b),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", C8853i.f12820b),
        OPEN_LINK_EXTERNALLY("openLink", C8852h.f12819b),
        INVALID("", C8851g.f12818a);
        

        /* renamed from: d */
        public static final C8783a f12719d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public static final Map<String, C8782a> f12720e = null;

        /* renamed from: b */
        private final String f12735b;

        /* renamed from: c */
        private final C8849e f12736c;

        /* renamed from: m0.a$a$a */
        /* compiled from: BrazeActionParser.kt */
        public static final class C8783a {
            private C8783a() {
            }

            public /* synthetic */ C8783a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C8782a mo42945a(String str) {
                Map b = C8782a.f12720e;
                if (str == null) {
                    str = "";
                }
                Object obj = b.get(str);
                if (obj == null) {
                    obj = C8782a.INVALID;
                }
                return (C8782a) obj;
            }
        }

        static {
            int i;
            f12719d = new C8783a((DefaultConstructorMarker) null);
            C8782a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C13537l.m30877d(C12714q0.m28413d(values.length), 16));
            int length = values.length;
            while (i < length) {
                C8782a aVar = values[i];
                i++;
                linkedHashMap.put(aVar.mo42944d(), aVar);
            }
            f12720e = linkedHashMap;
        }

        private C8782a(String str, C8849e eVar) {
            this.f12735b = str;
            this.f12736c = eVar;
        }

        /* renamed from: c */
        public final C8849e mo42943c() {
            return this.f12736c;
        }

        /* renamed from: d */
        public final String mo42944d() {
            return this.f12735b;
        }
    }

    /* renamed from: m0.a$b */
    /* compiled from: BrazeActionParser.kt */
    static final class C8784b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Channel f12737g;

        /* renamed from: h */
        final /* synthetic */ Uri f12738h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8784b(Channel channel, Uri uri) {
            super(0);
            this.f12737g = channel;
            this.f12738h = uri;
        }

        public final String invoke() {
            return "Attempting to parse Braze Action with channel " + this.f12737g + " and uri:\n'" + this.f12738h + '\'';
        }
    }

    /* renamed from: m0.a$c */
    /* compiled from: BrazeActionParser.kt */
    static final class C8785c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8785c f12739g = new C8785c();

        C8785c() {
            super(0);
        }

        public final String invoke() {
            return "Failed to decode Braze Action into both version and json components. Doing nothing.";
        }
    }

    /* renamed from: m0.a$d */
    /* compiled from: BrazeActionParser.kt */
    static final class C8786d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f12740g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8786d(String str) {
            super(0);
            this.f12740g = str;
        }

        public final String invoke() {
            return "Braze Actions version " + this.f12740g + " is unsupported. Version must be v1";
        }
    }

    /* renamed from: m0.a$e */
    /* compiled from: BrazeActionParser.kt */
    static final class C8787e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f12741g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8787e(Uri uri) {
            super(0);
            this.f12741g = uri;
        }

        public final String invoke() {
            return "Failed to parse uri as a Braze Action.\n'" + this.f12741g + '\'';
        }
    }

    /* renamed from: m0.a$f */
    /* compiled from: BrazeActionParser.kt */
    static final class C8788f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f12742g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8788f(Uri uri) {
            super(0);
            this.f12742g = uri;
        }

        public final String invoke() {
            return "Done handling Braze uri\n'" + this.f12742g + '\'';
        }
    }

    /* renamed from: m0.a$g */
    /* compiled from: BrazeActionParser.kt */
    static final class C8789g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8782a f12743g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12744h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8789g(C8782a aVar, C8865o oVar) {
            super(0);
            this.f12743g = aVar;
            this.f12744h = oVar;
        }

        public final String invoke() {
            return "Cannot parse invalid action of type " + this.f12743g + " and data " + this.f12744h;
        }
    }

    /* renamed from: m0.a$h */
    /* compiled from: BrazeActionParser.kt */
    static final class C8790h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f12745g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8790h(Uri uri) {
            super(0);
            this.f12745g = uri;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to parse version and encoded action from uri: ", this.f12745g);
        }
    }

    /* renamed from: m0.a$i */
    /* compiled from: BrazeActionParser.kt */
    static final class C8791i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f12746g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8791i(String str) {
            super(0);
            this.f12746g = str;
        }

        public final String invoke() {
            return "Failed to decode action into json. Action:\n'" + this.f12746g + '\'';
        }
    }

    /* renamed from: m0.a$j */
    /* compiled from: BrazeActionParser.kt */
    static final class C8792j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8782a f12747g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12748h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8792j(C8782a aVar, C8865o oVar) {
            super(0);
            this.f12747g = aVar;
            this.f12748h = oVar;
        }

        public final String invoke() {
            return "Performing Braze Action type " + this.f12747g + " with data " + this.f12748h;
        }
    }

    /* renamed from: m0.a$k */
    /* compiled from: BrazeActionParser.kt */
    static final class C8793k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12749g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8793k(C8865o oVar) {
            super(0);
            this.f12749g = oVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Failed to run with data ", this.f12749g);
        }
    }

    private C8781a() {
    }

    /* renamed from: a */
    public final void mo42937a(Context context, Uri uri, Channel channel) {
        Context context2 = context;
        Uri uri2 = uri;
        Channel channel2 = channel;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C12775o.m28639i(channel2, "channel");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C8784b(channel2, uri), 6, (Object) null);
        try {
            C11906l c = mo42939c(uri);
            if (c == null) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, C8785c.f12739g, 6, (Object) null);
                return;
            }
            String str = (String) c.mo49109a();
            JSONObject jSONObject = (JSONObject) c.mo49110b();
            if (!C12775o.m28634d(str, "v1")) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C8786d(str), 7, (Object) null);
                return;
            }
            mo42941e(context, new C8865o(jSONObject, channel2));
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C8788f(uri), 6, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C8787e(uri), 4, (Object) null);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ C8782a mo42938b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        C8782a a = C8782a.f12719d.mo42945a(C8278g.m16455i(oVar.mo42993j(), JSONAPIResourceIdSerializer.FIELD_TYPE));
        if (a.mo42943c().mo42973b(oVar)) {
            return a;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8789g(a, oVar), 7, (Object) null);
        return C8782a.INVALID;
    }

    /* renamed from: c */
    public final /* synthetic */ C11906l mo42939c(Uri uri) {
        JSONObject jSONObject;
        C12775o.m28639i(uri, "<this>");
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            C8266c.m16396e(C8266c.f11641a, uri, (C8266c.C8267a) null, (Throwable) null, false, new C8790h(uri), 7, (Object) null);
            return null;
        }
        try {
            jSONObject = mo42942f(lastPathSegment);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, uri, C8266c.C8267a.f11649e, e, false, new C8791i(lastPathSegment), 4, (Object) null);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return new C11906l(host, jSONObject);
    }

    /* renamed from: d */
    public final boolean mo42940d(Uri uri) {
        String str;
        if (uri == null) {
            str = null;
        } else {
            str = uri.getScheme();
        }
        return C12775o.m28634d(str, "brazeActions");
    }

    /* renamed from: e */
    public final /* synthetic */ void mo42941e(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        try {
            C8782a b = mo42938b(oVar);
            if (b != C8782a.INVALID) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C8792j(b, oVar), 6, (Object) null);
                b.mo42943c().mo42972a(context, oVar);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C8793k(oVar), 4, (Object) null);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ JSONObject mo42942f(String str) {
        C12775o.m28639i(str, "action");
        byte[] decode = Base64.decode(str, 8);
        C12775o.m28638h(decode, "decode(action, Base64.URL_SAFE)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int i = 0;
        int c = C12624c.m28013c(0, decode.length - 1, 2);
        if (c >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                iArr[i2 / 2] = (decode[i2] & 255) | ((decode[i2 + 1] & 255) << 8);
                if (i2 == c) {
                    break;
                }
                i2 = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int i4 = iArr[i];
            i++;
            if (i4 < 0 || i4 > 65535) {
                throw new IllegalArgumentException(C12775o.m28647q("Invalid Char code: ", Integer.valueOf(i4)));
            }
            sb.append((char) i4);
        }
        return new JSONObject(sb.toString());
    }
}
