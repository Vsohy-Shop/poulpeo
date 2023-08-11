package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import p200q4.C9218b;
import p231t4.C9665c;
import p231t4.C9677e;
import p231t4.C9702m;
import p231t4.C9716q;
import p231t4.C9719r;
import p276x5.C10398c;
import p286y4.C10668b;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4781x<T> implements C10398c<T> {

    /* renamed from: a */
    private final C4744c f5052a;

    /* renamed from: b */
    private final int f5053b;

    /* renamed from: c */
    private final C9218b<?> f5054c;

    /* renamed from: d */
    private final long f5055d;

    /* renamed from: e */
    private final long f5056e;

    C4781x(C4744c cVar, int i, C9218b<?> bVar, long j, long j2, @Nullable String str, @Nullable String str2) {
        this.f5052a = cVar;
        this.f5053b = i;
        this.f5054c = bVar;
        this.f5055d = j;
        this.f5056e = j2;
    }

    @Nullable
    /* renamed from: b */
    static <T> C4781x<T> m6688b(C4744c cVar, int i, C9218b<?> bVar) {
        boolean z;
        long j;
        long j2;
        if (!cVar.mo32486g()) {
            return null;
        }
        C9719r a = C9716q.m20289b().mo44238a();
        if (a == null) {
            z = true;
        } else if (!a.mo44244G()) {
            return null;
        } else {
            z = a.mo44245H();
            C4777t x = cVar.mo32490x(bVar);
            if (x != null) {
                if (!(x.mo32565s() instanceof C9665c)) {
                    return null;
                }
                C9665c cVar2 = (C9665c) x.mo32565s();
                if (cVar2.mo44129K() && !cVar2.mo44138d()) {
                    C9677e c = m6689c(x, cVar2, i);
                    if (c == null) {
                        return null;
                    }
                    x.mo32549D();
                    z = c.mo44181I();
                }
            }
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new C4781x(cVar, i, bVar, j, j2, (String) null, (String) null);
    }

    @Nullable
    /* renamed from: c */
    private static C9677e m6689c(C4777t<?> tVar, C9665c<?> cVar, int i) {
        int[] F;
        int[] G;
        C9677e I = cVar.mo44127I();
        if (I == null || !I.mo44180H() || ((F = I.mo44178F()) != null ? !C10668b.m22667b(F, i) : !((G = I.mo44179G()) == null || !C10668b.m22667b(G, i))) || tVar.mo32563p() >= I.mo44177A()) {
            return null;
        }
        return I;
    }

    @WorkerThread
    /* renamed from: a */
    public final void mo28794a(@NonNull Task<T> task) {
        C4777t x;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.f5052a.mo32486g()) {
            C9719r a = C9716q.m20289b().mo44238a();
            if ((a == null || a.mo44244G()) && (x = this.f5052a.mo32490x(this.f5054c)) != null && (x.mo32565s() instanceof C9665c)) {
                C9665c cVar = (C9665c) x.mo32565s();
                boolean z2 = true;
                int i7 = 0;
                if (this.f5055d > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int z3 = cVar.mo44154z();
                if (a != null) {
                    boolean H = z & a.mo44245H();
                    int A = a.mo44242A();
                    int F = a.mo44243F();
                    i3 = a.mo44246I();
                    if (cVar.mo44129K() && !cVar.mo44138d()) {
                        C9677e c = m6689c(x, cVar, this.f5053b);
                        if (c != null) {
                            if (!c.mo44181I() || this.f5055d <= 0) {
                                z2 = false;
                            }
                            F = c.mo44177A();
                            H = z2;
                        } else {
                            return;
                        }
                    }
                    i2 = A;
                    i = F;
                } else {
                    i3 = 0;
                    i = 100;
                    i2 = 5000;
                }
                C4744c cVar2 = this.f5052a;
                if (task.mo35465p()) {
                    i4 = 0;
                } else {
                    if (task.mo35463n()) {
                        i7 = 100;
                    } else {
                        Exception k = task.mo35460k();
                        if (k instanceof ApiException) {
                            Status a2 = ((ApiException) k).mo32365a();
                            int F2 = a2.mo32378F();
                            ConnectionResult A2 = a2.mo32377A();
                            if (A2 == null) {
                                i6 = -1;
                            } else {
                                i6 = A2.mo32334A();
                            }
                            i4 = i6;
                            i7 = F2;
                        } else {
                            i7 = 101;
                        }
                    }
                    i4 = -1;
                }
                if (z) {
                    long j3 = this.f5055d;
                    long currentTimeMillis = System.currentTimeMillis();
                    i5 = (int) (SystemClock.elapsedRealtime() - this.f5056e);
                    j2 = j3;
                    j = currentTimeMillis;
                } else {
                    j2 = 0;
                    j = 0;
                    i5 = -1;
                }
                cVar2.mo32480I(new C9702m(this.f5053b, i7, i4, j2, j, (String) null, (String) null, z3, i5), i3, (long) i2, i);
            }
        }
    }
}
