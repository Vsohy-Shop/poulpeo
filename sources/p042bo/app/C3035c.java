package p042bo.app;

import java.util.List;

/* renamed from: bo.app.c */
public final class C3035c extends C3464n3 {
    public C3035c(List<C3116e2> list) {
        super(list);
    }

    /* renamed from: a */
    public boolean mo28678a(C3766w2 w2Var) {
        boolean z = false;
        for (C3116e2 a : this.f2237b) {
            if (!a.mo28678a(w2Var)) {
                return false;
            }
            z = true;
        }
        return z;
    }
}
