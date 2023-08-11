package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import p275x4.C10393b;

/* renamed from: com.google.android.gms.internal.gtm.j5 */
public final class C5398j5 implements ServiceConnection {

    /* renamed from: b */
    private final Context f6061b;

    /* renamed from: c */
    private final C10393b f6062c;

    /* renamed from: d */
    private volatile boolean f6063d;

    /* renamed from: e */
    private volatile boolean f6064e;

    /* renamed from: f */
    private C5366h3 f6065f;

    public C5398j5(Context context) {
        this(context, C10393b.m21775b());
    }

    @WorkerThread
    /* renamed from: b */
    private static void m8088b(@Nullable C5320e3 e3Var, String str) {
        if (e3Var != null) {
            try {
                e3Var.mo33185Y(false, str);
            } catch (RemoteException e) {
                C5426l3.m8132b("Error - local callback should not throw RemoteException", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: e */
    private final boolean m8089e() {
        if (this.f6063d) {
            return true;
        }
        synchronized (this) {
            if (this.f6063d) {
                return true;
            }
            if (!this.f6064e) {
                Intent intent = new Intent("ignored");
                intent.setAction((String) null);
                intent.setClassName(this.f6061b.getPackageName(), "com.google.android.gms.tagmanager.TagManagerService");
                if (!this.f6062c.mo45087a(this.f6061b, intent, this, 1)) {
                    return false;
                }
                this.f6064e = true;
            }
            while (this.f6064e) {
                try {
                    wait();
                    this.f6064e = false;
                } catch (InterruptedException e) {
                    C5426l3.m8137g("Error connecting to TagManagerService", e);
                    this.f6064e = false;
                }
            }
            boolean z = this.f6063d;
            return z;
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo33295a() {
        if (m8089e()) {
            try {
                this.f6065f.mo33131k();
            } catch (RemoteException e) {
                C5426l3.m8137g("Error calling service to dispatch pending events", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo33296c(String str, Bundle bundle, String str2, long j, boolean z) {
        if (m8089e()) {
            try {
                this.f6065f.mo33127H2(str, bundle, str2, j, z);
            } catch (RemoteException e) {
                C5426l3.m8137g("Error calling service to emit event", e);
            }
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo33297d(String str, @Nullable String str2, @Nullable String str3, @Nullable C5320e3 e3Var) {
        if (m8089e()) {
            try {
                this.f6065f.mo33129R2(str, str2, str3, e3Var);
            } catch (RemoteException e) {
                C5426l3.m8137g("Error calling service to load container", e);
                m8088b(e3Var, str);
            }
        } else {
            m8088b(e3Var, str);
        }
    }

    @WorkerThread
    /* renamed from: f */
    public final boolean mo33298f() {
        if (!m8089e()) {
            return false;
        }
        try {
            this.f6065f.mo33128O();
            return true;
        } catch (RemoteException e) {
            C5426l3.m8137g("Error in resetting service", e);
            return false;
        }
    }

    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C5366h3 h3Var;
        synchronized (this) {
            if (iBinder == null) {
                h3Var = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.internal.ITagManagerService");
                if (queryLocalInterface instanceof C5366h3) {
                    h3Var = (C5366h3) queryLocalInterface;
                } else {
                    h3Var = new C5396j3(iBinder);
                }
            }
            this.f6065f = h3Var;
            this.f6063d = true;
            this.f6064e = false;
            notifyAll();
        }
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this) {
            this.f6065f = null;
            this.f6063d = false;
            this.f6064e = false;
        }
    }

    private C5398j5(Context context, C10393b bVar) {
        this.f6063d = false;
        this.f6064e = false;
        this.f6061b = context;
        this.f6062c = bVar;
    }
}
