package p259w;

import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C13143j;
import okio.C13158p0;

/* renamed from: w.e */
/* compiled from: FileSystems.kt */
public final class C10065e {
    /* renamed from: a */
    public static final void m21133a(C13143j jVar, C13158p0 p0Var) {
        if (!jVar.mo52648j(p0Var)) {
            C10070i.m21144d(jVar.mo52650o(p0Var));
        }
    }

    /* renamed from: b */
    public static final void m21134b(C13143j jVar, C13158p0 p0Var) {
        try {
            IOException iOException = null;
            for (C13158p0 next : jVar.mo50371k(p0Var)) {
                try {
                    if (jVar.mo52649l(next).mo52639f()) {
                        m21134b(jVar, next);
                    }
                    jVar.mo52647h(next);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
