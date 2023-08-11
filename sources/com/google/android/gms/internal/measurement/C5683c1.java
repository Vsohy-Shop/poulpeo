package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C5683c1 {

    /* renamed from: a */
    final C5998v3 f6816a;

    /* renamed from: b */
    C6015w4 f6817b;

    /* renamed from: c */
    final C5681c f6818c = new C5681c();

    /* renamed from: d */
    private final C5833kf f6819d = new C5833kf();

    public C5683c1() {
        C5998v3 v3Var = new C5998v3();
        this.f6816a = v3Var;
        this.f6817b = v3Var.f7426b.mo34572a();
        v3Var.f7428d.mo34687a("internal.registerCallback", new C5647a(this));
        v3Var.f7428d.mo34687a("internal.eventLogger", new C5665b0(this));
    }

    /* renamed from: a */
    public final C5681c mo33731a() {
        return this.f6818c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C5800j mo33732b() {
        return new C5765gf(this.f6819d);
    }

    /* renamed from: c */
    public final void mo33733c(C5840l5 l5Var) {
        C5800j jVar;
        String str;
        String str2;
        try {
            this.f6817b = this.f6816a.f7426b.mo34572a();
            if (!(this.f6816a.mo34543a(this.f6817b, (C5920q5[]) l5Var.mo34163y().toArray(new C5920q5[0])) instanceof C5766h)) {
                for (C5806j5 next : l5Var.mo34162w().mo34071z()) {
                    List<C5920q5> y = next.mo34122y();
                    String x = next.mo34121x();
                    Iterator<C5920q5> it = y.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C5914q a = this.f6816a.mo34543a(this.f6817b, it.next());
                            if (a instanceof C5866n) {
                                C6015w4 w4Var = this.f6817b;
                                if (!w4Var.mo34579h(x)) {
                                    jVar = null;
                                } else {
                                    C5914q d = w4Var.mo34575d(x);
                                    if (!(d instanceof C5800j)) {
                                        String valueOf = String.valueOf(x);
                                        if (valueOf.length() != 0) {
                                            str2 = "Invalid function name: ".concat(valueOf);
                                        } else {
                                            str2 = new String("Invalid function name: ");
                                        }
                                        throw new IllegalStateException(str2);
                                    }
                                    jVar = (C5800j) d;
                                }
                                if (jVar == null) {
                                    String valueOf2 = String.valueOf(x);
                                    if (valueOf2.length() != 0) {
                                        str = "Rule function is undefined: ".concat(valueOf2);
                                    } else {
                                        str = new String("Rule function is undefined: ");
                                    }
                                    throw new IllegalStateException(str);
                                }
                                jVar.mo33875a(this.f6817b, Collections.singletonList(a));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo33734d(String str, Callable<? extends C5800j> callable) {
        this.f6816a.f7428d.mo34687a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo33735e(C5664b bVar) {
        try {
            this.f6818c.mo33727d(bVar);
            this.f6816a.f7427c.mo34578g("runtime.counter", new C5783i(Double.valueOf(0.0d)));
            this.f6819d.mo34147b(this.f6817b.mo34572a(), this.f6818c);
            if (mo33737g() || mo33736f()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo33736f() {
        if (!this.f6818c.mo33725c().isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo33737g() {
        if (!this.f6818c.mo33724b().equals(this.f6818c.mo33723a())) {
            return true;
        }
        return false;
    }
}
