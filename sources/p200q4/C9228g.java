package p200q4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p180o4.C8974c;
import p231t4.C9665c;
import p231t4.C9686h;
import p231t4.C9692j;
import p231t4.C9713p;

/* renamed from: q4.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9228g implements C4719a.C4728f, ServiceConnection {
    @Nullable

    /* renamed from: b */
    private final String f13555b;
    @Nullable

    /* renamed from: c */
    private final String f13556c;
    @Nullable

    /* renamed from: d */
    private final ComponentName f13557d;

    /* renamed from: e */
    private final Context f13558e;

    /* renamed from: f */
    private final C9222d f13559f;

    /* renamed from: g */
    private final Handler f13560g;

    /* renamed from: h */
    private final C9230h f13561h;
    @Nullable

    /* renamed from: i */
    private IBinder f13562i;

    /* renamed from: j */
    private boolean f13563j;
    @Nullable

    /* renamed from: k */
    private String f13564k;
    @Nullable

    /* renamed from: l */
    private String f13565l;

    @WorkerThread
    /* renamed from: s */
    private final void m18943s() {
        if (Thread.currentThread() != this.f13560g.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m18944t(String str) {
        String.valueOf(this.f13562i);
    }

    @NonNull
    /* renamed from: a */
    public final Set<Scope> mo32394a() {
        return Collections.emptySet();
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo32395b(@NonNull String str) {
        m18943s();
        this.f13564k = str;
        mo32396c();
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo32396c() {
        m18943s();
        m18944t("Disconnect called.");
        try {
            this.f13558e.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f13563j = false;
        this.f13562i = null;
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo32397d() {
        m18943s();
        return this.f13563j;
    }

    @NonNull
    /* renamed from: e */
    public final String mo32398e() {
        String str = this.f13555b;
        if (str != null) {
            return str;
        }
        C9713p.m20275j(this.f13557d);
        return this.f13557d.getPackageName();
    }

    @WorkerThread
    /* renamed from: g */
    public final boolean mo32399g() {
        m18943s();
        if (this.f13562i != null) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo32400h(@NonNull C9665c.C9668c cVar) {
        m18943s();
        m18944t("Connect started.");
        if (mo32399g()) {
            try {
                mo32395b("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f13557d;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f13555b).setAction(this.f13556c);
            }
            boolean bindService = this.f13558e.bindService(intent, this, C9686h.m20227a());
            this.f13563j = bindService;
            if (!bindService) {
                this.f13562i = null;
                this.f13561h.mo32552G(new ConnectionResult(16));
            }
            m18944t("Finished connect.");
        } catch (SecurityException e) {
            this.f13563j = false;
            this.f13562i = null;
            throw e;
        }
    }

    /* renamed from: j */
    public final boolean mo32402j() {
        return false;
    }

    /* renamed from: k */
    public final int mo32403k() {
        return 0;
    }

    @NonNull
    /* renamed from: l */
    public final C8974c[] mo32404l() {
        return new C8974c[0];
    }

    @Nullable
    /* renamed from: m */
    public final String mo32405m() {
        return this.f13564k;
    }

    /* renamed from: o */
    public final boolean mo32407o() {
        return false;
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f13560g.post(new C9249v(this, iBinder));
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f13560g.post(new C9248u(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo43524p() {
        this.f13563j = false;
        this.f13562i = null;
        m18944t("Disconnected.");
        this.f13559f.mo32550E(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo43525q(IBinder iBinder) {
        this.f13563j = false;
        this.f13562i = iBinder;
        m18944t("Connected.");
        this.f13559f.mo32555J(new Bundle());
    }

    /* renamed from: r */
    public final void mo43526r(@Nullable String str) {
        this.f13565l = str;
    }

    /* renamed from: i */
    public final void mo32401i(@NonNull C9665c.C9670e eVar) {
    }

    /* renamed from: n */
    public final void mo32406n(@Nullable C9692j jVar, @Nullable Set<Scope> set) {
    }
}
