package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import com.adjust.sdk.Constants;
import p201q5.C9272s;

@MainThread
/* renamed from: com.google.android.gms.measurement.internal.o6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6242o6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    final /* synthetic */ C6264q6 f8054b;

    /* synthetic */ C6242o6(C6264q6 q6Var, C9272s sVar) {
        this.f8054b = q6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6251p4 p4Var;
        boolean z;
        String str;
        try {
            this.f8054b.f7899a.mo34920b().mo35079v().mo35037a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                p4Var = this.f8054b.f7899a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f8054b.f7899a.mo35191N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z2 = true;
                        if ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (true != z) {
                            str = "auto";
                        } else {
                            str = "gs";
                        }
                        String str2 = str;
                        String queryParameter = data.getQueryParameter(Constants.REFERRER);
                        if (bundle != null) {
                            z2 = false;
                        }
                        this.f8054b.f7899a.mo34919a().mo35110z(new C6231n6(this, z2, data, str2, queryParameter));
                        p4Var = this.f8054b.f7899a;
                    }
                }
                p4Var = this.f8054b.f7899a;
            }
        } catch (RuntimeException e) {
            this.f8054b.f7899a.mo34920b().mo35075r().mo35038b("Throwable caught in onActivityCreated", e);
            p4Var = this.f8054b.f7899a;
        } catch (Throwable th) {
            this.f8054b.f7899a.mo35188K().mo34793z(activity, bundle);
            throw th;
        }
        p4Var.mo35188K().mo34793z(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f8054b.f7899a.mo35188K().mo34782A(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f8054b.f7899a.mo35188K().mo34783B(activity);
        C6288s8 M = this.f8054b.f7899a.mo35190M();
        M.f7899a.mo34919a().mo35110z(new C6200k8(M, M.f7899a.mo34922c().mo33548b()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        C6288s8 M = this.f8054b.f7899a.mo35190M();
        M.f7899a.mo34919a().mo35110z(new C6189j8(M, M.f7899a.mo34922c().mo33548b()));
        this.f8054b.f7899a.mo35188K().mo34784C(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f8054b.f7899a.mo35188K().mo34785D(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
