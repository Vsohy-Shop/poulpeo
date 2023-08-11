package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.internal.measurement.C6061z2;
import com.google.firebase.installations.C6944c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201q5.C9273t;
import p231t4.C9713p;
import p276x5.C10410i;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f9111b;

    /* renamed from: a */
    private final C6061z2 f9112a;

    public FirebaseAnalytics(C6061z2 z2Var) {
        C9713p.m20275j(z2Var);
        this.f9112a = z2Var;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f9111b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f9111b == null) {
                    f9111b = new FirebaseAnalytics(C6061z2.m10346v(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f9111b;
    }

    @Keep
    @Nullable
    public static C9273t getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C6061z2 v = C6061z2.m10346v(context, (String) null, (String) null, (String) null, bundle);
        if (v == null) {
            return null;
        }
        return new C6913a(v);
    }

    /* renamed from: a */
    public void mo39755a(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        this.f9112a.mo34656J(str, bundle);
    }

    /* renamed from: b */
    public void mo39756b(boolean z) {
        this.f9112a.mo34665g(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public void mo39757c(@Nullable String str) {
        this.f9112a.mo34666h(str);
    }

    /* renamed from: d */
    public void mo39758d(@Size(max = 24, min = 1) @NonNull String str, @Size(max = 36) @Nullable String str2) {
        this.f9112a.mo34667i((String) null, str, str2, false);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C10410i.m21828b(C6944c.m12139n().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.f9112a.mo34662d(activity, str, str2);
    }
}
