package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import com.google.android.gms.measurement.internal.C6251p4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p201q5.C9266m;
import p201q5.C9270q;
import p201q5.C9271r;
import p201q5.C9273t;
import p231t4.C9713p;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public class AppMeasurement {

    /* renamed from: b */
    private static volatile AppMeasurement f7519b;

    /* renamed from: a */
    private final C6079d f7520a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @NonNull
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @NonNull
        @Keep
        public String mExpiredEventName;
        @NonNull
        @Keep
        public Bundle mExpiredEventParams;
        @NonNull
        @Keep
        public String mName;
        @NonNull
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @NonNull
        @Keep
        public String mTimedOutEventName;
        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @NonNull
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @NonNull
        @Keep
        public String mTriggeredEventName;
        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(@NonNull Bundle bundle) {
            C9713p.m20275j(bundle);
            Class cls = String.class;
            this.mAppId = (String) C9266m.m19027a(bundle, "app_id", cls, null);
            this.mOrigin = (String) C9266m.m19027a(bundle, "origin", cls, null);
            this.mName = (String) C9266m.m19027a(bundle, HintConstants.AUTOFILL_HINT_NAME, cls, null);
            this.mValue = C9266m.m19027a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C9266m.m19027a(bundle, "trigger_event_name", cls, null);
            Class cls2 = Long.class;
            this.mTriggerTimeout = ((Long) C9266m.m19027a(bundle, "trigger_timeout", cls2, 0L)).longValue();
            this.mTimedOutEventName = (String) C9266m.m19027a(bundle, "timed_out_event_name", cls, null);
            Class cls3 = Bundle.class;
            this.mTimedOutEventParams = (Bundle) C9266m.m19027a(bundle, "timed_out_event_params", cls3, null);
            this.mTriggeredEventName = (String) C9266m.m19027a(bundle, "triggered_event_name", cls, null);
            this.mTriggeredEventParams = (Bundle) C9266m.m19027a(bundle, "triggered_event_params", cls3, null);
            this.mTimeToLive = ((Long) C9266m.m19027a(bundle, "time_to_live", cls2, 0L)).longValue();
            this.mExpiredEventName = (String) C9266m.m19027a(bundle, "expired_event_name", cls, null);
            this.mExpiredEventParams = (Bundle) C9266m.m19027a(bundle, "expired_event_params", cls3, null);
            this.mActive = ((Boolean) C9266m.m19027a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C9266m.m19027a(bundle, "creation_timestamp", cls2, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C9266m.m19027a(bundle, "triggered_timestamp", cls2, 0L)).longValue();
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
    public interface C6074a extends C9270q {
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$b */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
    public interface C6075b extends C9271r {
    }

    public AppMeasurement(C6251p4 p4Var) {
        this.f7520a = new C6076a(p4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.Keep
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @androidx.annotation.NonNull
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.NonNull android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f7519b
            if (r0 != 0) goto L_0x0059
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f7519b     // Catch:{ all -> 0x0056 }
            if (r1 != 0) goto L_0x0054
            r1 = 0
            java.lang.Class<com.google.firebase.analytics.FirebaseAnalytics> r2 = com.google.firebase.analytics.FirebaseAnalytics.class
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            q5.t r2 = (p201q5.C9273t) r2     // Catch:{  }
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r14.<init>((p201q5.C9273t) r2)     // Catch:{ all -> 0x0056 }
            f7519b = r14     // Catch:{ all -> 0x0056 }
            goto L_0x0054
        L_0x0039:
            com.google.android.gms.internal.measurement.o1 r13 = new com.google.android.gms.internal.measurement.o1     // Catch:{ all -> 0x0056 }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.internal.p4 r14 = com.google.android.gms.measurement.internal.C6251p4.m10988H(r14, r13, r1)     // Catch:{ all -> 0x0056 }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x0056 }
            r1.<init>((com.google.android.gms.measurement.internal.C6251p4) r14)     // Catch:{ all -> 0x0056 }
            f7519b = r1     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r14
        L_0x0059:
            com.google.android.gms.measurement.AppMeasurement r14 = f7519b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @WorkerThread
    @NonNull
    /* renamed from: a */
    public Map<String, Object> mo34689a(boolean z) {
        return this.f7520a.mo34736m(z);
    }

    /* renamed from: b */
    public void mo34690b(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j) {
        this.f7520a.mo34728e(str, str2, bundle, j);
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f7520a.mo34731h(str);
    }

    /* renamed from: c */
    public void mo34692c(@NonNull C6075b bVar) {
        this.f7520a.mo34732i(bVar);
    }

    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f7520a.mo34733j(str, str2, bundle);
    }

    @WorkerThread
    /* renamed from: d */
    public void mo34694d(@NonNull C6074a aVar) {
        this.f7520a.mo34735l(aVar);
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f7520a.mo34734k(str);
    }

    @Keep
    public long generateEventId() {
        return this.f7520a.zzb();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f7520a.mo34738y();
    }

    @WorkerThread
    @Keep
    @NonNull
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Size(max = 23, min = 1) @NonNull String str2) {
        int i;
        List<Bundle> c = this.f7520a.mo34726c(str, str2);
        if (c == null) {
            i = 0;
        } else {
            i = c.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : c) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f7520a.mo34725b();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f7520a.mo34737n();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f7520a.mo34723A();
    }

    @WorkerThread
    @Keep
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        return this.f7520a.mo34724a(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Keep
    @NonNull
    public Map<String, Object> getUserProperties(@NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, boolean z) {
        return this.f7520a.mo34727d(str, str2, z);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f7520a.mo34730g(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C9713p.m20275j(conditionalUserProperty);
        C6079d dVar = this.f7520a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString(HintConstants.AUTOFILL_HINT_NAME, str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C9266m.m19028b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        dVar.mo34729f(bundle);
    }

    public AppMeasurement(C9273t tVar) {
        this.f7520a = new C6077b(tVar);
    }
}
