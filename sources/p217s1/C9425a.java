package p217s1;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p294z1.C10792k;

/* renamed from: s1.a */
/* compiled from: ActivityFragmentLifecycle */
class C9425a implements C9434h {

    /* renamed from: a */
    private final Set<C9435i> f14009a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f14010b;

    /* renamed from: c */
    private boolean f14011c;

    C9425a() {
    }

    /* renamed from: a */
    public void mo43844a(@NonNull C9435i iVar) {
        this.f14009a.remove(iVar);
    }

    /* renamed from: b */
    public void mo43845b(@NonNull C9435i iVar) {
        this.f14009a.add(iVar);
        if (this.f14011c) {
            iVar.mo31210e();
        } else if (this.f14010b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo43846c() {
        this.f14011c = true;
        for (T e : C10792k.m22958i(this.f14009a)) {
            e.mo31210e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo43847d() {
        this.f14010b = true;
        for (T onStart : C10792k.m22958i(this.f14009a)) {
            onStart.onStart();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo43848e() {
        this.f14010b = false;
        for (T onStop : C10792k.m22958i(this.f14009a)) {
            onStop.onStop();
        }
    }
}
