package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p190p4.C9056e;
import p276x5.C10406g;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4765l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f5010a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C10406g<?>, Boolean> f5011b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m6605h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f5010a) {
            hashMap = new HashMap(this.f5010a);
        }
        synchronized (this.f5011b) {
            hashMap2 = new HashMap(this.f5011b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo32439g(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C10406g) entry2.getKey()).mo45099d(new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo32527c(BasePendingResult<? extends C9056e> basePendingResult, boolean z) {
        this.f5010a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo32435b(new C4761j(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void mo32528d(C10406g<TResult> gVar, boolean z) {
        this.f5011b.put(gVar, Boolean.valueOf(z));
        gVar.mo45096a().mo35452c(new C4763k(this, gVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo32529e(int i, @Nullable String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        m6605h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo32530f() {
        m6605h(false, C4744c.f4946s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo32531g() {
        if (!this.f5010a.isEmpty() || !this.f5011b.isEmpty()) {
            return true;
        }
        return false;
    }
}
