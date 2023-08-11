package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6030x3 extends C5955s8<C6046y3, C6030x3> implements C6068z9 {
    private C6030x3() {
        super(C6046y3.zza);
    }

    /* renamed from: r */
    public final int mo34598r() {
        return ((C6046y3) this.f7372c).mo34633x();
    }

    /* renamed from: s */
    public final C6014w3 mo34599s(int i) {
        return ((C6046y3) this.f7372c).mo34635z(i);
    }

    /* renamed from: t */
    public final C6030x3 mo34600t() {
        if (this.f7373d) {
            mo34356n();
            this.f7373d = false;
        }
        ((C6046y3) this.f7372c).zzk = C6003v8.m10154k();
        return this;
    }

    /* renamed from: u */
    public final C6030x3 mo34601u(int i, C5982u3 u3Var) {
        if (this.f7373d) {
            mo34356n();
            this.f7373d = false;
        }
        C6046y3.m10279J((C6046y3) this.f7372c, i, (C6014w3) u3Var.mo34354l());
        return this;
    }

    /* renamed from: v */
    public final List<C5685c3> mo34602v() {
        return Collections.unmodifiableList(((C6046y3) this.f7372c).mo34626F());
    }

    /* synthetic */ C6030x3(C5966t3 t3Var) {
        super(C6046y3.zza);
    }
}
