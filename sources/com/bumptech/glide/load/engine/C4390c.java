package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.C4393f;
import java.io.File;
import java.util.List;
import p058d1.C7214a;
import p058d1.C7218e;
import p070e1.C7422d;
import p137k1.C8476n;

/* renamed from: com.bumptech.glide.load.engine.c */
/* compiled from: DataCacheGenerator */
class C4390c implements C4393f, C7422d.C7423a<Object> {

    /* renamed from: b */
    private final List<C7218e> f3782b;

    /* renamed from: c */
    private final C4395g<?> f3783c;

    /* renamed from: d */
    private final C4393f.C4394a f3784d;

    /* renamed from: e */
    private int f3785e;

    /* renamed from: f */
    private C7218e f3786f;

    /* renamed from: g */
    private List<C8476n<File, ?>> f3787g;

    /* renamed from: h */
    private int f3788h;

    /* renamed from: i */
    private volatile C8476n.C8477a<?> f3789i;

    /* renamed from: j */
    private File f3790j;

    C4390c(C4395g<?> gVar, C4393f.C4394a aVar) {
        this(gVar.mo31282c(), gVar, aVar);
    }

    /* renamed from: a */
    private boolean m5144a() {
        if (this.f3788h < this.f3787g.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo31268b() {
        while (true) {
            boolean z = false;
            if (this.f3787g == null || !m5144a()) {
                int i = this.f3785e + 1;
                this.f3785e = i;
                if (i >= this.f3782b.size()) {
                    return false;
                }
                C7218e eVar = this.f3782b.get(this.f3785e);
                File b = this.f3783c.mo31283d().mo41894b(new C4391d(eVar, this.f3783c.mo31294o()));
                this.f3790j = b;
                if (b != null) {
                    this.f3786f = eVar;
                    this.f3787g = this.f3783c.mo31289j(b);
                    this.f3788h = 0;
                }
            } else {
                this.f3789i = null;
                while (!z && m5144a()) {
                    List<C8476n<File, ?>> list = this.f3787g;
                    int i2 = this.f3788h;
                    this.f3788h = i2 + 1;
                    this.f3789i = list.get(i2).mo42458b(this.f3790j, this.f3783c.mo31298s(), this.f3783c.mo31285f(), this.f3783c.mo31290k());
                    if (this.f3789i != null && this.f3783c.mo31299t(this.f3789i.f12073c.mo41069a())) {
                        this.f3789i.f12073c.mo41078e(this.f3783c.mo31291l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    /* renamed from: c */
    public void mo31269c(@NonNull Exception exc) {
        this.f3784d.mo31277a(this.f3786f, exc, this.f3789i.f12073c, C7214a.DATA_DISK_CACHE);
    }

    public void cancel() {
        C8476n.C8477a<?> aVar = this.f3789i;
        if (aVar != null) {
            aVar.f12073c.cancel();
        }
    }

    /* renamed from: f */
    public void mo31271f(Object obj) {
        this.f3784d.mo31279e(this.f3786f, obj, this.f3789i.f12073c, C7214a.DATA_DISK_CACHE, this.f3786f);
    }

    C4390c(List<C7218e> list, C4395g<?> gVar, C4393f.C4394a aVar) {
        this.f3785e = -1;
        this.f3782b = list;
        this.f3783c = gVar;
        this.f3784d = aVar;
    }
}
