package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.compose.animation.core.C0344a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;
import p121i5.C8185f;
import p200q4.C9226f;

/* renamed from: com.google.android.gms.common.api.internal.m0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C4768m0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: c */
    protected volatile boolean f5016c;

    /* renamed from: d */
    protected final AtomicReference<C4762j0> f5017d = new AtomicReference<>((Object) null);

    /* renamed from: e */
    private final Handler f5018e = new C8185f(Looper.getMainLooper());

    /* renamed from: f */
    protected final GoogleApiAvailability f5019f;

    C4768m0(C9226f fVar, GoogleApiAvailability googleApiAvailability) {
        super(fVar);
        this.f5019f = googleApiAvailability;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m6619l(ConnectionResult connectionResult, int i) {
        this.f5017d.set((Object) null);
        mo32533m(connectionResult, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m6620o() {
        this.f5017d.set((Object) null);
        mo32534n();
    }

    /* renamed from: p */
    private static final int m6621p(@Nullable C4762j0 j0Var) {
        if (j0Var == null) {
            return -1;
        }
        return j0Var.mo32524a();
    }

    /* renamed from: e */
    public final void mo32448e(int i, int i2, Intent intent) {
        C4762j0 j0Var = this.f5017d.get();
        if (i != 1) {
            if (i == 2) {
                int g = this.f5019f.mo32346g(mo32447b());
                if (g == 0) {
                    m6620o();
                    return;
                } else if (j0Var != null) {
                    if (j0Var.mo32525b().mo32334A() == 18 && g == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            m6620o();
            return;
        } else if (i2 == 0) {
            if (j0Var != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                m6619l(new ConnectionResult(i3, (PendingIntent) null, j0Var.mo32525b().toString()), m6621p(j0Var));
                return;
            }
            return;
        }
        if (j0Var != null) {
            m6619l(j0Var.mo32525b(), j0Var.mo32524a());
        }
    }

    /* renamed from: f */
    public final void mo32449f(@Nullable Bundle bundle) {
        C4762j0 j0Var;
        super.mo32449f(bundle);
        if (bundle != null) {
            AtomicReference<C4762j0> atomicReference = this.f5017d;
            if (bundle.getBoolean("resolving_error", false)) {
                j0Var = new C4762j0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                j0Var = null;
            }
            atomicReference.set(j0Var);
        }
    }

    /* renamed from: i */
    public final void mo32452i(Bundle bundle) {
        super.mo32452i(bundle);
        C4762j0 j0Var = this.f5017d.get();
        if (j0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", j0Var.mo32524a());
            bundle.putInt("failed_status", j0Var.mo32525b().mo32334A());
            bundle.putParcelable("failed_resolution", j0Var.mo32525b().mo32336G());
        }
    }

    /* renamed from: j */
    public void mo32453j() {
        super.mo32453j();
        this.f5016c = true;
    }

    /* renamed from: k */
    public void mo32454k() {
        super.mo32454k();
        this.f5016c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo32533m(ConnectionResult connectionResult, int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract void mo32534n();

    public final void onCancel(DialogInterface dialogInterface) {
        m6619l(new ConnectionResult(13, (PendingIntent) null), m6621p(this.f5017d.get()));
    }

    /* renamed from: s */
    public final void mo32537s(ConnectionResult connectionResult, int i) {
        C4762j0 j0Var = new C4762j0(connectionResult, i);
        if (C0344a.m496a(this.f5017d, (Object) null, j0Var)) {
            this.f5018e.post(new C4766l0(this, j0Var));
        }
    }
}
