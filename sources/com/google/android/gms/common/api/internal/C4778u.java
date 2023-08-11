package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import p180o4.C8974c;
import p200q4.C9218b;
import p200q4.C9243p;
import p231t4.C9705n;

/* renamed from: com.google.android.gms.common.api.internal.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C4778u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9218b<?> f5042a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8974c f5043b;

    /* synthetic */ C4778u(C9218b bVar, C8974c cVar, C9243p pVar) {
        this.f5042a = bVar;
        this.f5043b = cVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof C4778u)) {
            C4778u uVar = (C4778u) obj;
            if (!C9705n.m20259b(this.f5042a, uVar.f5042a) || !C9705n.m20259b(this.f5043b, uVar.f5043b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(this.f5042a, this.f5043b);
    }

    public final String toString() {
        return C9705n.m20261d(this).mo44228a("key", this.f5042a).mo44228a("feature", this.f5043b).toString();
    }
}
