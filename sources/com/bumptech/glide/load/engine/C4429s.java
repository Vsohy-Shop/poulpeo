package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C4393f;
import java.io.File;
import java.util.List;
import p058d1.C7214a;
import p058d1.C7218e;
import p070e1.C7422d;
import p137k1.C8476n;

/* renamed from: com.bumptech.glide.load.engine.s */
/* compiled from: ResourceCacheGenerator */
class C4429s implements C4393f, C7422d.C7423a<Object> {

    /* renamed from: b */
    private final C4393f.C4394a f3957b;

    /* renamed from: c */
    private final C4395g<?> f3958c;

    /* renamed from: d */
    private int f3959d;

    /* renamed from: e */
    private int f3960e = -1;

    /* renamed from: f */
    private C7218e f3961f;

    /* renamed from: g */
    private List<C8476n<File, ?>> f3962g;

    /* renamed from: h */
    private int f3963h;

    /* renamed from: i */
    private volatile C8476n.C8477a<?> f3964i;

    /* renamed from: j */
    private File f3965j;

    /* renamed from: k */
    private C4430t f3966k;

    C4429s(C4395g<?> gVar, C4393f.C4394a aVar) {
        this.f3958c = gVar;
        this.f3957b = aVar;
    }

    /* renamed from: a */
    private boolean m5294a() {
        if (this.f3963h < this.f3962g.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo31268b() {
        List<C7218e> c = this.f3958c.mo31282c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f3958c.mo31292m();
        if (m.isEmpty()) {
            if (File.class.equals(this.f3958c.mo31296q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f3958c.mo31288i() + " to " + this.f3958c.mo31296q());
        }
        while (true) {
            if (this.f3962g == null || !m5294a()) {
                int i = this.f3960e + 1;
                this.f3960e = i;
                if (i >= m.size()) {
                    int i2 = this.f3959d + 1;
                    this.f3959d = i2;
                    if (i2 >= c.size()) {
                        return false;
                    }
                    this.f3960e = 0;
                }
                C7218e eVar = c.get(this.f3959d);
                Class cls = m.get(this.f3960e);
                this.f3966k = new C4430t(this.f3958c.mo31281b(), eVar, this.f3958c.mo31294o(), this.f3958c.mo31298s(), this.f3958c.mo31285f(), this.f3958c.mo31297r(cls), cls, this.f3958c.mo31290k());
                File b = this.f3958c.mo31283d().mo41894b(this.f3966k);
                this.f3965j = b;
                if (b != null) {
                    this.f3961f = eVar;
                    this.f3962g = this.f3958c.mo31289j(b);
                    this.f3963h = 0;
                }
            } else {
                this.f3964i = null;
                while (!z && m5294a()) {
                    List<C8476n<File, ?>> list = this.f3962g;
                    int i3 = this.f3963h;
                    this.f3963h = i3 + 1;
                    this.f3964i = list.get(i3).mo42458b(this.f3965j, this.f3958c.mo31298s(), this.f3958c.mo31285f(), this.f3958c.mo31290k());
                    if (this.f3964i != null && this.f3958c.mo31299t(this.f3964i.f12073c.mo41069a())) {
                        this.f3964i.f12073c.mo41078e(this.f3958c.mo31291l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo31269c(@NonNull Exception exc) {
        this.f3957b.mo31277a(this.f3966k, exc, this.f3964i.f12073c, C7214a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        C8476n.C8477a<?> aVar = this.f3964i;
        if (aVar != null) {
            aVar.f12073c.cancel();
        }
    }

    /* renamed from: f */
    public void mo31271f(Object obj) {
        this.f3957b.mo31279e(this.f3961f, obj, this.f3964i.f12073c, C7214a.RESOURCE_DISK_CACHE, this.f3966k);
    }
}
