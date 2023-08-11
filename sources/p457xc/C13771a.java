package p457xc;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p440ud.C13564j;

/* renamed from: xc.a */
/* compiled from: ActionCellManager */
public class C13771a<T> {

    /* renamed from: a */
    private ArrayList<WeakReference<C13772b>> f22203a = new ArrayList<>();

    /* renamed from: b */
    private HashSet<T> f22204b = new HashSet<>();

    /* renamed from: c */
    private boolean f22205c;

    /* renamed from: d */
    private boolean f22206d;

    /* renamed from: e */
    private C13564j f22207e;

    public C13771a(boolean z, boolean z2, C13564j jVar) {
        this.f22205c = z;
        this.f22206d = z2;
        this.f22207e = jVar;
    }

    /* renamed from: a */
    public void mo53426a(C13772b bVar) {
        this.f22203a.add(new WeakReference(bVar));
    }

    /* renamed from: b */
    public void mo53427b(T t) {
        this.f22204b.add(t);
    }

    /* renamed from: c */
    public boolean mo53428c() {
        return this.f22206d;
    }

    /* renamed from: d */
    public boolean mo53429d() {
        return this.f22205c;
    }

    /* renamed from: e */
    public C13564j mo53430e() {
        return this.f22207e;
    }

    /* renamed from: f */
    public HashSet<T> mo53431f() {
        return new HashSet<>(this.f22204b);
    }

    /* renamed from: g */
    public int mo53432g() {
        return this.f22204b.size();
    }

    /* renamed from: h */
    public boolean mo53433h(T t) {
        return this.f22204b.contains(t);
    }

    /* renamed from: i */
    public void mo53434i(T t) {
        this.f22204b.remove(t);
    }

    /* renamed from: j */
    public void mo53435j(boolean z) {
        C13772b bVar;
        Iterator<WeakReference<C13772b>> it = this.f22203a.iterator();
        while (it.hasNext() && (bVar = (C13772b) it.next().get()) != null) {
            bVar.mo23257v(z);
        }
    }
}
