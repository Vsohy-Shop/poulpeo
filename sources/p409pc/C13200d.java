package p409pc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustConfig;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.URL;
import kotlin.jvm.internal.C12775o;
import p409pc.C13202e;
import p445vc.C13618g;
import p446vd.C13633n;

/* renamed from: pc.d */
/* compiled from: AdjustManager.kt */
public final class C13200d {

    /* renamed from: a */
    public static final C13200d f21007a = new C13200d();

    /* renamed from: pc.d$a */
    /* compiled from: AdjustManager.kt */
    private static final class C13201a implements Application.ActivityLifecycleCallbacks {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C12775o.m28639i(activity, "activity");
            Adjust.onPause();
        }

        public void onActivityResumed(Activity activity) {
            C12775o.m28639i(activity, "activity");
            Adjust.onResume();
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
            C12775o.m28639i(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }
    }

    private C13200d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m29955g(Uri uri) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m29956h(AdjustAttribution adjustAttribution) {
        if (adjustAttribution != null) {
            C13618g gVar = C13618g.f21930b;
            String str = adjustAttribution.network;
            String str2 = "";
            if (str == null) {
                str = str2;
            } else {
                C12775o.m28638h(str, "it.network ?: \"\"");
            }
            String str3 = adjustAttribution.trackerName;
            if (str3 != null) {
                C12775o.m28638h(str3, "it.trackerName ?: \"\"");
                str2 = str3;
            }
            gVar.mo53279c("external-campaign", str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x003e, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo52827c(android.app.Activity r12) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.net.URL r12 = r11.mo52828d(r12)
            r0 = 0
            if (r12 != 0) goto L_0x000d
            return r0
        L_0x000d:
            java.lang.String r1 = r12.getProtocol()
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            java.lang.String r2 = "http"
            r3 = 0
            r4 = 2
            boolean r1 = p454wf.C13754v.m31525E(r1, r2, r3, r4, r0)
            if (r1 != 0) goto L_0x0023
            java.lang.String r12 = r12.toString()
            return r12
        L_0x0023:
            java.lang.String r5 = r12.getQuery()
            if (r5 == 0) goto L_0x009f
            java.lang.String r12 = "&"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r12 = p454wf.C13755w.m31594t0(r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L_0x003a
            goto L_0x009f
        L_0x003a:
            java.util.Iterator r12 = r12.iterator()
        L_0x003e:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x009f
            java.lang.Object r1 = r12.next()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r1 = "="
            java.lang.String[] r6 = new java.lang.String[]{r1}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            java.util.List r1 = p454wf.C13755w.m31594t0(r5, r6, r7, r8, r9, r10)
            int r2 = r1.size()
            if (r2 == r4) goto L_0x0060
            goto L_0x003e
        L_0x0060:
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            int r5 = r2.hashCode()
            switch(r5) {
                case -1980522643: goto L_0x0089;
                case 629233382: goto L_0x0080;
                case 955297237: goto L_0x0077;
                case 1277256086: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x003e
        L_0x006e:
            java.lang.String r5 = "adjust_deeplink"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0091
            goto L_0x003e
        L_0x0077:
            java.lang.String r5 = "adj_deep_link"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0091
            goto L_0x003e
        L_0x0080:
            java.lang.String r5 = "deeplink"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0091
            goto L_0x003e
        L_0x0089:
            java.lang.String r5 = "deep_link"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x003e
        L_0x0091:
            r12 = 1
            java.lang.Object r12 = r1.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r0 = "UTF-8"
            java.lang.String r12 = java.net.URLDecoder.decode(r12, r0)
            return r12
        L_0x009f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p409pc.C13200d.mo52827c(android.app.Activity):java.lang.String");
    }

    /* renamed from: d */
    public final URL mo52828d(Activity activity) {
        Uri data;
        String uri;
        C12775o.m28639i(activity, "activity");
        Intent intent = activity.getIntent();
        if (!(intent == null || (data = intent.getData()) == null || (uri = data.toString()) == null)) {
            try {
                return new URL(uri);
            } catch (Exception e) {
                C13633n.m31165u(this, e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo52829e(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        if (intent != null) {
            Adjust.appWillOpenUrl(intent.getData(), context.getApplicationContext());
        }
    }

    /* renamed from: f */
    public final void mo52830f(Application application, String str, long j, long j2, long j3, long j4, long j5) {
        Application application2 = application;
        String str2 = str;
        C12775o.m28639i(application, APIResourceDescriptors.RESOURCE_TYPE_APPLICATION);
        C12775o.m28639i(str2, "adjustAppToken");
        AdjustConfig adjustConfig = new AdjustConfig(application, str2, AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setAppSecret(j, j2, j3, j4, j5);
        adjustConfig.setOnDeeplinkResponseListener(new C13198b());
        adjustConfig.setOnAttributionChangedListener(new C13199c());
        Adjust.onCreate(adjustConfig);
        application.registerActivityLifecycleCallbacks(new C13201a());
    }

    /* renamed from: i */
    public final void mo52831i(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "token");
        Adjust.setPushToken(str, context);
    }

    /* renamed from: j */
    public final void mo52832j(String str) {
        C13202e.f21008b.f21009a = str;
    }

    /* renamed from: k */
    public final void mo52833k(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, "merchantId");
        C12775o.m28639i(str2, "merchantName");
        new C13202e.C13203a("59dqj7").mo52848a("merchantId", str).mo52848a("merchantName", str2).mo52849b().mo52850c(new ContextContainer(context));
    }

    /* renamed from: l */
    public final void mo52834l(Context context) {
        C12775o.m28639i(context, "context");
        new C13202e.C13203a("h6c92o").mo52850c(new ContextContainer(context));
    }

    /* renamed from: m */
    public final void mo52835m(Context context) {
        C12775o.m28639i(context, "context");
        new C13202e.C13203a("931g58").mo52849b().mo52850c(new ContextContainer(context));
    }

    /* renamed from: n */
    public final void mo52836n(Context context) {
        C12775o.m28639i(context, "context");
        new C13202e.C13203a("lfy3c9").mo52849b().mo52850c(new ContextContainer(context));
    }

    /* renamed from: o */
    public final void mo52837o(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, JSONAPIResourceIdSerializer.FIELD_TYPE);
        new C13202e.C13203a("lgsvzw").mo52848a(JSONAPIResourceIdSerializer.FIELD_TYPE, str).mo52849b().mo52850c(new ContextContainer(context));
    }

    /* renamed from: p */
    public final void mo52838p(Context context, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(str, JSONAPIResourceIdSerializer.FIELD_TYPE);
        new C13202e.C13203a("3lmhsj").mo52848a(JSONAPIResourceIdSerializer.FIELD_TYPE, str).mo52849b().mo52850c(new ContextContainer(context));
    }

    /* renamed from: q */
    public final void mo52839q(Context context) {
        C12775o.m28639i(context, "context");
        new C13202e.C13203a("d68ek8").mo52849b().mo52850c(new ContextContainer(context));
    }
}
