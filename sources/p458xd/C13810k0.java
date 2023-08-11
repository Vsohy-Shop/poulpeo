package p458xd;

import java.util.logging.Level;
import java.util.logging.Logger;
import p458xd.C13815o;

/* renamed from: xd.k0 */
/* compiled from: ThreadLocalContextStorage */
final class C13810k0 extends C13815o.C13818c {

    /* renamed from: a */
    private static final Logger f22263a = Logger.getLogger(C13810k0.class.getName());

    /* renamed from: b */
    static final ThreadLocal<C13815o> f22264b = new ThreadLocal<>();

    C13810k0() {
    }

    /* renamed from: b */
    public C13815o mo53465b() {
        C13815o oVar = f22264b.get();
        if (oVar == null) {
            return C13815o.f22280c;
        }
        return oVar;
    }

    /* renamed from: c */
    public void mo53466c(C13815o oVar, C13815o oVar2) {
        if (mo53465b() != oVar) {
            f22263a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (oVar2 != C13815o.f22280c) {
            f22264b.set(oVar2);
        } else {
            f22264b.set((Object) null);
        }
    }

    /* renamed from: d */
    public C13815o mo53467d(C13815o oVar) {
        C13815o b = mo53465b();
        f22264b.set(oVar);
        return b;
    }
}
