package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.C4393f;
import java.util.Collections;
import java.util.List;
import p058d1.C7214a;
import p058d1.C7217d;
import p058d1.C7218e;
import p070e1.C7422d;
import p094g1.C7737a;
import p137k1.C8476n;
import p294z1.C10787f;

/* renamed from: com.bumptech.glide.load.engine.v */
/* compiled from: SourceGenerator */
class C4433v implements C4393f, C4393f.C4394a {

    /* renamed from: b */
    private final C4395g<?> f3978b;

    /* renamed from: c */
    private final C4393f.C4394a f3979c;

    /* renamed from: d */
    private int f3980d;

    /* renamed from: e */
    private C4390c f3981e;

    /* renamed from: f */
    private Object f3982f;

    /* renamed from: g */
    private volatile C8476n.C8477a<?> f3983g;

    /* renamed from: h */
    private C4391d f3984h;

    /* renamed from: com.bumptech.glide.load.engine.v$a */
    /* compiled from: SourceGenerator */
    class C4434a implements C7422d.C7423a<Object> {

        /* renamed from: b */
        final /* synthetic */ C8476n.C8477a f3985b;

        C4434a(C8476n.C8477a aVar) {
            this.f3985b = aVar;
        }

        /* renamed from: c */
        public void mo31269c(@NonNull Exception exc) {
            if (C4433v.this.mo31384g(this.f3985b)) {
                C4433v.this.mo31386i(this.f3985b, exc);
            }
        }

        /* renamed from: f */
        public void mo31271f(@Nullable Object obj) {
            if (C4433v.this.mo31384g(this.f3985b)) {
                C4433v.this.mo31385h(this.f3985b, obj);
            }
        }
    }

    C4433v(C4395g<?> gVar, C4393f.C4394a aVar) {
        this.f3978b = gVar;
        this.f3979c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private void m5301d(Object obj) {
        long b = C10787f.m22932b();
        try {
            C7217d<X> p = this.f3978b.mo31295p(obj);
            C4392e eVar = new C4392e(p, obj, this.f3978b.mo31290k());
            this.f3984h = new C4391d(this.f3983g.f12071a, this.f3978b.mo31294o());
            this.f3978b.mo31283d().mo41893a(this.f3984h, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f3984h + ", data: " + obj + ", encoder: " + p + ", duration: " + C10787f.m22931a(b));
            }
            this.f3983g.f12073c.mo41074b();
            this.f3981e = new C4390c(Collections.singletonList(this.f3983g.f12071a), this.f3978b, this);
        } catch (Throwable th) {
            this.f3983g.f12073c.mo41074b();
            throw th;
        }
    }

    /* renamed from: f */
    private boolean m5302f() {
        if (this.f3980d < this.f3978b.mo31286g().size()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m5303j(C8476n.C8477a<?> aVar) {
        this.f3983g.f12073c.mo41078e(this.f3978b.mo31291l(), new C4434a(aVar));
    }

    /* renamed from: a */
    public void mo31277a(C7218e eVar, Exception exc, C7422d<?> dVar, C7214a aVar) {
        this.f3979c.mo31277a(eVar, exc, dVar, this.f3983g.f12073c.mo41077d());
    }

    /* renamed from: b */
    public boolean mo31268b() {
        Object obj = this.f3982f;
        if (obj != null) {
            this.f3982f = null;
            m5301d(obj);
        }
        C4390c cVar = this.f3981e;
        if (cVar != null && cVar.mo31268b()) {
            return true;
        }
        this.f3981e = null;
        this.f3983g = null;
        boolean z = false;
        while (!z && m5302f()) {
            List<C8476n.C8477a<?>> g = this.f3978b.mo31286g();
            int i = this.f3980d;
            this.f3980d = i + 1;
            this.f3983g = g.get(i);
            if (this.f3983g != null && (this.f3978b.mo31284e().mo41379c(this.f3983g.f12073c.mo41077d()) || this.f3978b.mo31299t(this.f3983g.f12073c.mo41069a()))) {
                m5303j(this.f3983g);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public void mo31278c() {
        throw new UnsupportedOperationException();
    }

    public void cancel() {
        C8476n.C8477a<?> aVar = this.f3983g;
        if (aVar != null) {
            aVar.f12073c.cancel();
        }
    }

    /* renamed from: e */
    public void mo31279e(C7218e eVar, Object obj, C7422d<?> dVar, C7214a aVar, C7218e eVar2) {
        this.f3979c.mo31279e(eVar, obj, dVar, this.f3983g.f12073c.mo41077d(), eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo31384g(C8476n.C8477a<?> aVar) {
        C8476n.C8477a<?> aVar2 = this.f3983g;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo31385h(C8476n.C8477a<?> aVar, Object obj) {
        C7737a e = this.f3978b.mo31284e();
        if (obj == null || !e.mo41379c(aVar.f12073c.mo41077d())) {
            C4393f.C4394a aVar2 = this.f3979c;
            C7218e eVar = aVar.f12071a;
            C7422d<Data> dVar = aVar.f12073c;
            aVar2.mo31279e(eVar, obj, dVar, dVar.mo41077d(), this.f3984h);
            return;
        }
        this.f3982f = obj;
        this.f3979c.mo31278c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo31386i(C8476n.C8477a<?> aVar, @NonNull Exception exc) {
        C4393f.C4394a aVar2 = this.f3979c;
        C4391d dVar = this.f3984h;
        C7422d<Data> dVar2 = aVar.f12073c;
        aVar2.mo31277a(dVar, exc, dVar2, dVar2.mo41077d());
    }
}
