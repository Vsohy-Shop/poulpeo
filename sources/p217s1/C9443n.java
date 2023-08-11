package p217s1;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p250v1.C9916c;
import p294z1.C10792k;

/* renamed from: s1.n */
/* compiled from: RequestTracker */
public class C9443n {

    /* renamed from: a */
    private final Set<C9916c> f14034a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C9916c> f14035b = new ArrayList();

    /* renamed from: c */
    private boolean f14036c;

    /* renamed from: a */
    public boolean mo43873a(@Nullable C9916c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean remove = this.f14034a.remove(cVar);
        if (!this.f14035b.remove(cVar) && !remove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo43874b() {
        for (T a : C10792k.m22958i(this.f14034a)) {
            mo43873a(a);
        }
        this.f14035b.clear();
    }

    /* renamed from: c */
    public void mo43875c() {
        this.f14036c = true;
        for (T t : C10792k.m22958i(this.f14034a)) {
            if (t.isRunning() || t.mo44492j()) {
                t.clear();
                this.f14035b.add(t);
            }
        }
    }

    /* renamed from: d */
    public void mo43876d() {
        this.f14036c = true;
        for (T t : C10792k.m22958i(this.f14034a)) {
            if (t.isRunning()) {
                t.pause();
                this.f14035b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo43877e() {
        for (T t : C10792k.m22958i(this.f14034a)) {
            if (!t.mo44492j() && !t.mo44487g()) {
                t.clear();
                if (!this.f14036c) {
                    t.mo44489h();
                } else {
                    this.f14035b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo43878f() {
        this.f14036c = false;
        for (T t : C10792k.m22958i(this.f14034a)) {
            if (!t.mo44492j() && !t.isRunning()) {
                t.mo44489h();
            }
        }
        this.f14035b.clear();
    }

    /* renamed from: g */
    public void mo43879g(@NonNull C9916c cVar) {
        this.f14034a.add(cVar);
        if (!this.f14036c) {
            cVar.mo44489h();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f14035b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f14034a.size() + ", isPaused=" + this.f14036c + "}";
    }
}
