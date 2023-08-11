package p209r3;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p119i3.C8115h;
import p139k3.C8539i;
import p139k3.C8549o;
import p139k3.C8555t;
import p149l3.C8661e;
import p149l3.C8672m;
import p219s3.C9492x;
import p230t3.C9609d;
import p241u3.C9880a;

/* renamed from: r3.c */
/* compiled from: DefaultScheduler */
public class C9372c implements C9374e {

    /* renamed from: f */
    private static final Logger f13939f = Logger.getLogger(C8555t.class.getName());

    /* renamed from: a */
    private final C9492x f13940a;

    /* renamed from: b */
    private final Executor f13941b;

    /* renamed from: c */
    private final C8661e f13942c;

    /* renamed from: d */
    private final C9609d f13943d;

    /* renamed from: e */
    private final C9880a f13944e;

    public C9372c(Executor executor, C8661e eVar, C9492x xVar, C9609d dVar, C9880a aVar) {
        this.f13941b = executor;
        this.f13942c = eVar;
        this.f13940a = xVar;
        this.f13943d = dVar;
        this.f13944e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m19390d(C8549o oVar, C8539i iVar) {
        this.f13943d.mo44094n(oVar, iVar);
        this.f13940a.mo43920b(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m19391e(C8549o oVar, C8115h hVar, C8539i iVar) {
        try {
            C8672m mVar = this.f13942c.get(oVar.mo42580b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.mo42580b()});
                f13939f.warning(format);
                hVar.mo28477a(new IllegalArgumentException(format));
                return;
            }
            this.f13944e.mo44106a(new C9371b(this, oVar, mVar.mo31826a(iVar)));
            hVar.mo28477a((Exception) null);
        } catch (Exception e) {
            Logger logger = f13939f;
            logger.warning("Error scheduling event " + e.getMessage());
            hVar.mo28477a(e);
        }
    }

    /* renamed from: a */
    public void mo43801a(C8549o oVar, C8539i iVar, C8115h hVar) {
        this.f13941b.execute(new C9370a(this, oVar, hVar, iVar));
    }
}
