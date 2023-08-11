package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.C5717e1;
import com.google.android.gms.internal.measurement.C5785i1;
import com.google.android.gms.internal.measurement.C5836l1;
import com.google.android.gms.internal.measurement.C5868n1;
import com.google.android.gms.internal.measurement.C5884o1;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p036b5.C2888a;
import p036b5.C2890b;
import p201q5.C9271r;
import p201q5.C9274u;
import p231t4.C9713p;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
public class AppMeasurementDynamiteService extends C5717e1 {

    /* renamed from: a */
    C6251p4 f7527a = null;
    @GuardedBy("listenerMap")

    /* renamed from: b */
    private final Map<Integer, C9271r> f7528b = new ArrayMap();

    @EnsuresNonNull({"scion"})
    /* renamed from: G */
    private final void m10452G() {
        if (this.f7527a == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    /* renamed from: J */
    private final void m10453J(C5785i1 i1Var, String str) {
        m10452G();
        this.f7527a.mo35191N().mo35123I(i1Var, str);
    }

    public void beginAdUnitExposure(@NonNull String str, long j) {
        m10452G();
        this.f7527a.mo35210y().mo34775l(str, j);
    }

    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        m10452G();
        this.f7527a.mo35186I().mo35250i0(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        m10452G();
        this.f7527a.mo35186I().mo35231J((Boolean) null);
    }

    public void endAdUnitExposure(@NonNull String str, long j) {
        m10452G();
        this.f7527a.mo35210y().mo34776m(str, j);
    }

    public void generateEventId(C5785i1 i1Var) {
        m10452G();
        long r0 = this.f7527a.mo35191N().mo35149r0();
        m10452G();
        this.f7527a.mo35191N().mo35122H(i1Var, r0);
    }

    public void getAppInstanceId(C5785i1 i1Var) {
        m10452G();
        this.f7527a.mo34919a().mo35110z(new C6252p5(this, i1Var));
    }

    public void getCachedAppInstanceId(C5785i1 i1Var) {
        m10452G();
        m10453J(i1Var, this.f7527a.mo35186I().mo35242X());
    }

    public void getConditionalUserProperties(String str, String str2, C5785i1 i1Var) {
        m10452G();
        this.f7527a.mo34919a().mo35110z(new C6245o9(this, i1Var, str, str2));
    }

    public void getCurrentScreenClass(C5785i1 i1Var) {
        m10452G();
        m10453J(i1Var, this.f7527a.mo35186I().mo35243Y());
    }

    public void getCurrentScreenName(C5785i1 i1Var) {
        m10452G();
        m10453J(i1Var, this.f7527a.mo35186I().mo35244Z());
    }

    public void getGmpAppId(C5785i1 i1Var) {
        String str;
        m10452G();
        C6264q6 I = this.f7527a.mo35186I();
        if (I.f7899a.mo35192O() != null) {
            str = I.f7899a.mo35192O();
        } else {
            try {
                str = C9274u.m19050c(I.f7899a.mo34927f(), "google_app_id", I.f7899a.mo35195R());
            } catch (IllegalStateException e) {
                I.f7899a.mo34920b().mo35075r().mo35038b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        m10453J(i1Var, str);
    }

    public void getMaxUserProperties(String str, C5785i1 i1Var) {
        m10452G();
        this.f7527a.mo35186I().mo35237S(str);
        m10452G();
        this.f7527a.mo35191N().mo35121G(i1Var, 25);
    }

    public void getTestFlag(C5785i1 i1Var, int i) {
        m10452G();
        if (i == 0) {
            this.f7527a.mo35191N().mo35123I(i1Var, this.f7527a.mo35186I().mo35245a0());
        } else if (i == 1) {
            this.f7527a.mo35191N().mo35122H(i1Var, this.f7527a.mo35186I().mo35241W().longValue());
        } else if (i == 2) {
            C6234n9 N = this.f7527a.mo35191N();
            double doubleValue = this.f7527a.mo35186I().mo35239U().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                i1Var.mo33691r(bundle);
            } catch (RemoteException e) {
                N.f7899a.mo34920b().mo35080w().mo35038b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f7527a.mo35191N().mo35121G(i1Var, this.f7527a.mo35186I().mo35240V().intValue());
        } else if (i == 4) {
            this.f7527a.mo35191N().mo35117C(i1Var, this.f7527a.mo35186I().mo35238T().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C5785i1 i1Var) {
        m10452G();
        this.f7527a.mo34919a().mo35110z(new C6243o7(this, i1Var, str, str2, z));
    }

    public void initForTests(@NonNull Map map) {
        m10452G();
    }

    public void initialize(C2888a aVar, C5884o1 o1Var, long j) {
        C6251p4 p4Var = this.f7527a;
        if (p4Var == null) {
            this.f7527a = C6251p4.m10988H((Context) C9713p.m20275j((Context) C2890b.m2296J(aVar)), o1Var, Long.valueOf(j));
        } else {
            p4Var.mo34920b().mo35080w().mo35037a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C5785i1 i1Var) {
        m10452G();
        this.f7527a.mo34919a().mo35110z(new C6256p9(this, i1Var));
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) {
        m10452G();
        this.f7527a.mo35186I().mo35255s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C5785i1 i1Var, long j) {
        Bundle bundle2;
        m10452G();
        C9713p.m20271f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f7527a.mo34919a().mo35110z(new C6253p6(this, i1Var, new C6290t(str2, new C6268r(bundle), "app", j), str));
    }

    public void logHealthData(int i, @NonNull String str, @NonNull C2888a aVar, @NonNull C2888a aVar2, @NonNull C2888a aVar3) {
        Object obj;
        Object obj2;
        m10452G();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C2890b.m2296J(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C2890b.m2296J(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C2890b.m2296J(aVar3);
        }
        this.f7527a.mo34920b().mo35073F(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(@NonNull C2888a aVar, @NonNull Bundle bundle, long j) {
        m10452G();
        C6242o6 o6Var = this.f7527a.mo35186I().f8140c;
        if (o6Var != null) {
            this.f7527a.mo35186I().mo35251o();
            o6Var.onActivityCreated((Activity) C2890b.m2296J(aVar), bundle);
        }
    }

    public void onActivityDestroyed(@NonNull C2888a aVar, long j) {
        m10452G();
        C6242o6 o6Var = this.f7527a.mo35186I().f8140c;
        if (o6Var != null) {
            this.f7527a.mo35186I().mo35251o();
            o6Var.onActivityDestroyed((Activity) C2890b.m2296J(aVar));
        }
    }

    public void onActivityPaused(@NonNull C2888a aVar, long j) {
        m10452G();
        C6242o6 o6Var = this.f7527a.mo35186I().f8140c;
        if (o6Var != null) {
            this.f7527a.mo35186I().mo35251o();
            o6Var.onActivityPaused((Activity) C2890b.m2296J(aVar));
        }
    }

    public void onActivityResumed(@NonNull C2888a aVar, long j) {
        m10452G();
        C6242o6 o6Var = this.f7527a.mo35186I().f8140c;
        if (o6Var != null) {
            this.f7527a.mo35186I().mo35251o();
            o6Var.onActivityResumed((Activity) C2890b.m2296J(aVar));
        }
    }

    public void onActivitySaveInstanceState(C2888a aVar, C5785i1 i1Var, long j) {
        m10452G();
        C6242o6 o6Var = this.f7527a.mo35186I().f8140c;
        Bundle bundle = new Bundle();
        if (o6Var != null) {
            this.f7527a.mo35186I().mo35251o();
            o6Var.onActivitySaveInstanceState((Activity) C2890b.m2296J(aVar), bundle);
        }
        try {
            i1Var.mo33691r(bundle);
        } catch (RemoteException e) {
            this.f7527a.mo34920b().mo35080w().mo35038b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@NonNull C2888a aVar, long j) {
        m10452G();
        if (this.f7527a.mo35186I().f8140c != null) {
            this.f7527a.mo35186I().mo35251o();
            Activity activity = (Activity) C2890b.m2296J(aVar);
        }
    }

    public void onActivityStopped(@NonNull C2888a aVar, long j) {
        m10452G();
        if (this.f7527a.mo35186I().f8140c != null) {
            this.f7527a.mo35186I().mo35251o();
            Activity activity = (Activity) C2890b.m2296J(aVar);
        }
    }

    public void performAction(Bundle bundle, C5785i1 i1Var, long j) {
        m10452G();
        i1Var.mo33691r((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C5836l1 l1Var) {
        C9271r rVar;
        m10452G();
        synchronized (this.f7528b) {
            rVar = this.f7528b.get(Integer.valueOf(l1Var.mo34103c()));
            if (rVar == null) {
                rVar = new C6278r9(this, l1Var);
                this.f7528b.put(Integer.valueOf(l1Var.mo34103c()), rVar);
            }
        }
        this.f7527a.mo35186I().mo35260x(rVar);
    }

    public void resetAnalyticsData(long j) {
        m10452G();
        this.f7527a.mo35186I().mo35261y(j);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) {
        m10452G();
        if (bundle == null) {
            this.f7527a.mo34920b().mo35075r().mo35037a("Conditional user property must not be null");
        } else {
            this.f7527a.mo35186I().mo35226E(bundle, j);
        }
    }

    public void setConsent(@NonNull Bundle bundle, long j) {
        m10452G();
        this.f7527a.mo35186I().mo35229H(bundle, j);
    }

    public void setConsentThirdParty(@NonNull Bundle bundle, long j) {
        m10452G();
        this.f7527a.mo35186I().mo35227F(bundle, -20, j);
    }

    public void setCurrentScreen(@NonNull C2888a aVar, @NonNull String str, @NonNull String str2, long j) {
        m10452G();
        this.f7527a.mo35188K().mo34786E((Activity) C2890b.m2296J(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        m10452G();
        C6264q6 I = this.f7527a.mo35186I();
        I.mo35413i();
        I.f7899a.mo34919a().mo35110z(new C6285s5(I, z));
    }

    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        Bundle bundle2;
        m10452G();
        C6264q6 I = this.f7527a.mo35186I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f7899a.mo34919a().mo35110z(new C6263q5(I, bundle2));
    }

    public void setEventInterceptor(C5836l1 l1Var) {
        m10452G();
        C6267q9 q9Var = new C6267q9(this, l1Var);
        if (this.f7527a.mo34919a().mo35105C()) {
            this.f7527a.mo35186I().mo35230I(q9Var);
        } else {
            this.f7527a.mo34919a().mo35110z(new C6244o8(this, q9Var));
        }
    }

    public void setInstanceIdProvider(C5868n1 n1Var) {
        m10452G();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        m10452G();
        this.f7527a.mo35186I().mo35231J(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        m10452G();
    }

    public void setSessionTimeoutDuration(long j) {
        m10452G();
        C6264q6 I = this.f7527a.mo35186I();
        I.f7899a.mo34919a().mo35110z(new C6307u5(I, j));
    }

    public void setUserId(@NonNull String str, long j) {
        m10452G();
        if (str == null || str.length() != 0) {
            this.f7527a.mo35186I().mo35234M((String) null, "_id", str, true, j);
        } else {
            this.f7527a.mo34920b().mo35080w().mo35037a("User ID must be non-empty");
        }
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull C2888a aVar, boolean z, long j) {
        m10452G();
        this.f7527a.mo35186I().mo35234M(str, str2, C2890b.m2296J(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C5836l1 l1Var) {
        C9271r remove;
        m10452G();
        synchronized (this.f7528b) {
            remove = this.f7528b.remove(Integer.valueOf(l1Var.mo34103c()));
        }
        if (remove == null) {
            remove = new C6278r9(this, l1Var);
        }
        this.f7527a.mo35186I().mo35236O(remove);
    }
}
