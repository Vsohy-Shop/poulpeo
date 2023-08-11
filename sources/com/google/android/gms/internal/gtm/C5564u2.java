package com.google.android.gms.internal.gtm;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.util.Date;
import java.util.Map;
import p254v5.C9951l;
import p286y4.C10671e;

/* renamed from: com.google.android.gms.internal.gtm.u2 */
public final class C5564u2 implements C10671e {

    /* renamed from: a */
    private final Bundle f6350a;

    /* renamed from: b */
    private final String f6351b;

    /* renamed from: c */
    private final Date f6352c;

    /* renamed from: d */
    private final String f6353d;

    /* renamed from: e */
    private Map<String, Object> f6354e;

    /* renamed from: f */
    private boolean f6355f;

    /* renamed from: g */
    private final C9951l f6356g;

    public C5564u2(@Nullable String str, @Nullable Bundle bundle, String str2, Date date, boolean z, C9951l lVar) {
        this.f6351b = str;
        this.f6350a = bundle == null ? new Bundle() : bundle;
        this.f6352c = date;
        this.f6353d = str2;
        this.f6355f = z;
        this.f6356g = lVar;
    }

    /* renamed from: a */
    public final long mo33547a() {
        return this.f6352c.getTime();
    }

    /* renamed from: b */
    public final long mo33548b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo33549c(boolean z) {
        this.f6355f = false;
    }

    @WorkerThread
    /* renamed from: d */
    public final Map<String, Object> mo33550d() {
        String str;
        if (this.f6354e == null) {
            try {
                this.f6354e = this.f6356g.mo35445S1();
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    str = "Error calling measurement proxy:".concat(valueOf);
                } else {
                    str = new String("Error calling measurement proxy:");
                }
                C5426l3.m8135e(str);
            }
        }
        return this.f6354e;
    }

    /* renamed from: e */
    public final String mo33551e() {
        return this.f6351b;
    }

    /* renamed from: f */
    public final Bundle mo33552f() {
        return this.f6350a;
    }

    /* renamed from: g */
    public final String mo33553g() {
        return this.f6353d;
    }

    /* renamed from: h */
    public final boolean mo33554h() {
        return this.f6355f;
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
