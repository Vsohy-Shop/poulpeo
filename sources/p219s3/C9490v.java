package p219s3;

import java.util.concurrent.Executor;
import p139k3.C8549o;
import p230t3.C9609d;
import p241u3.C9880a;

/* renamed from: s3.v */
/* compiled from: WorkInitializer */
public class C9490v {

    /* renamed from: a */
    private final Executor f14140a;

    /* renamed from: b */
    private final C9609d f14141b;

    /* renamed from: c */
    private final C9492x f14142c;

    /* renamed from: d */
    private final C9880a f14143d;

    C9490v(Executor executor, C9609d dVar, C9492x xVar, C9880a aVar) {
        this.f14140a = executor;
        this.f14141b = dVar;
        this.f14142c = xVar;
        this.f14143d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m19651d() {
        for (C8549o b : this.f14141b.mo44095u()) {
            this.f14142c.mo43920b(b, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19652e() {
        this.f14143d.mo44106a(new C9489u(this));
    }

    /* renamed from: c */
    public void mo43935c() {
        this.f14140a.execute(new C9488t(this));
    }
}
