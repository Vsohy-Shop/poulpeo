package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p200q4.C9224e;
import p200q4.C9226f;
import p200q4.C9235j0;
import p200q4.C9239l0;
import p231t4.C9713p;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class LifecycleCallback {
    @NonNull

    /* renamed from: b */
    protected final C9226f f4936b;

    protected LifecycleCallback(@NonNull C9226f fVar) {
        this.f4936b = fVar;
    }

    @NonNull
    /* renamed from: c */
    public static C9226f m6478c(@NonNull Activity activity) {
        return m6479d(new C9224e(activity));
    }

    @NonNull
    /* renamed from: d */
    protected static C9226f m6479d(@NonNull C9224e eVar) {
        if (eVar.mo43514d()) {
            return C9239l0.m18975R0(eVar.mo43512b());
        }
        if (eVar.mo43513c()) {
            return C9235j0.m18967c(eVar.mo43511a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C9226f getChimeraLifecycleFragmentImpl(C9224e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @NonNull
    /* renamed from: b */
    public Activity mo32447b() {
        Activity t0 = this.f4936b.mo43520t0();
        C9713p.m20275j(t0);
        return t0;
    }

    @MainThread
    /* renamed from: g */
    public void mo32450g() {
    }

    @MainThread
    /* renamed from: h */
    public void mo32451h() {
    }

    @MainThread
    /* renamed from: j */
    public void mo32453j() {
    }

    @MainThread
    /* renamed from: k */
    public void mo32454k() {
    }

    @MainThread
    /* renamed from: f */
    public void mo32449f(@Nullable Bundle bundle) {
    }

    @MainThread
    /* renamed from: i */
    public void mo32452i(@NonNull Bundle bundle) {
    }

    @MainThread
    /* renamed from: e */
    public void mo32448e(int i, int i2, @NonNull Intent intent) {
    }

    @MainThread
    /* renamed from: a */
    public void mo32446a(@NonNull String str, @NonNull FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @NonNull String[] strArr) {
    }
}
