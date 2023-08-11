package p364io.grpc;

import java.util.concurrent.TimeoutException;
import p111h6.C8012n;
import p364io.grpc.C12594t;
import p458xd.C13815o;

/* renamed from: io.grpc.d */
/* compiled from: Contexts */
public final class C12166d {
    /* renamed from: a */
    public static C12594t m26554a(C13815o oVar) {
        C8012n.m15756o(oVar, "context must not be null");
        if (!oVar.mo53479h()) {
            return null;
        }
        Throwable c = oVar.mo53476c();
        if (c == null) {
            return C12594t.f20184g.mo50310r("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return C12594t.f20187j.mo50310r(c.getMessage()).mo50309q(c);
        }
        C12594t l = C12594t.m27926l(c);
        if (!C12594t.C12596b.UNKNOWN.equals(l.mo50306n()) || l.mo50305m() != c) {
            return l.mo50309q(c);
        }
        return C12594t.f20184g.mo50310r("Context cancelled").mo50309q(c);
    }
}
