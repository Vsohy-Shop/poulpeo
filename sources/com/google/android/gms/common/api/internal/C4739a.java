package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p286y4.C10680n;

/* renamed from: com.google.android.gms.common.api.internal.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C4739a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f */
    private static final C4739a f4937f = new C4739a();

    /* renamed from: b */
    private final AtomicBoolean f4938b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f4939c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList<C4740a> f4940d = new ArrayList<>();

    /* renamed from: e */
    private boolean f4941e = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public interface C4740a {
        /* renamed from: a */
        void mo32468a(boolean z);
    }

    private C4739a() {
    }

    @NonNull
    /* renamed from: b */
    public static C4739a m6489b() {
        return f4937f;
    }

    /* renamed from: c */
    public static void m6490c(@NonNull Application application) {
        C4739a aVar = f4937f;
        synchronized (aVar) {
            if (!aVar.f4941e) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f4941e = true;
            }
        }
    }

    /* renamed from: f */
    private final void m6491f(boolean z) {
        synchronized (f4937f) {
            Iterator<C4740a> it = this.f4940d.iterator();
            while (it.hasNext()) {
                it.next().mo32468a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo32455a(@NonNull C4740a aVar) {
        synchronized (f4937f) {
            this.f4940d.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo32456d() {
        return this.f4938b.get();
    }

    /* renamed from: e */
    public boolean mo32457e(boolean z) {
        if (!this.f4939c.get()) {
            if (!C10680n.m22698b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4939c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4938b.set(true);
            }
        }
        return mo32456d();
    }

    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        boolean compareAndSet = this.f4938b.compareAndSet(true, false);
        this.f4939c.set(true);
        if (compareAndSet) {
            m6491f(false);
        }
    }

    public final void onActivityResumed(@NonNull Activity activity) {
        boolean compareAndSet = this.f4938b.compareAndSet(true, false);
        this.f4939c.set(true);
        if (compareAndSet) {
            m6491f(false);
        }
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f4938b.compareAndSet(false, true)) {
            this.f4939c.set(true);
            m6491f(true);
        }
    }

    public final void onLowMemory() {
    }

    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    public final void onActivityPaused(@NonNull Activity activity) {
    }

    public final void onActivityStarted(@NonNull Activity activity) {
    }

    public final void onActivityStopped(@NonNull Activity activity) {
    }

    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }
}
