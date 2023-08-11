package p217s1;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p261w1.C10104d;
import p294z1.C10792k;

/* renamed from: s1.p */
/* compiled from: TargetTracker */
public final class C9446p implements C9435i {

    /* renamed from: b */
    private final Set<C10104d<?>> f14044b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e */
    public void mo31210e() {
        for (T e : C10792k.m22958i(this.f14044b)) {
            e.mo31210e();
        }
    }

    /* renamed from: j */
    public void mo43888j() {
        this.f14044b.clear();
    }

    @NonNull
    /* renamed from: k */
    public List<C10104d<?>> mo43889k() {
        return C10792k.m22958i(this.f14044b);
    }

    /* renamed from: l */
    public void mo43890l(@NonNull C10104d<?> dVar) {
        this.f14044b.add(dVar);
    }

    /* renamed from: m */
    public void mo43891m(@NonNull C10104d<?> dVar) {
        this.f14044b.remove(dVar);
    }

    public void onStart() {
        for (T onStart : C10792k.m22958i(this.f14044b)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        for (T onStop : C10792k.m22958i(this.f14044b)) {
            onStop.onStop();
        }
    }
}
