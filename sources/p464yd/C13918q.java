package p464yd;

import java.util.List;
import java.util.logging.Logger;
import p306ae.C10871d;
import p364io.grpc.C12173h;
import p364io.grpc.C12564o;
import p364io.grpc.internal.C12367m2;

/* renamed from: yd.q */
/* compiled from: Utils */
class C13918q {

    /* renamed from: a */
    private static final Logger f22824a = Logger.getLogger(C13918q.class.getName());

    private C13918q() {
    }

    /* renamed from: a */
    public static C12564o m32164a(List<C10871d> list) {
        return C12173h.m26566c(m32165b(list));
    }

    /* renamed from: b */
    private static byte[][] m32165b(List<C10871d> list) {
        byte[][] bArr = new byte[(list.size() * 2)][];
        int i = 0;
        for (C10871d next : list) {
            int i2 = i + 1;
            bArr[i] = next.f16689a.mo52594M();
            i = i2 + 1;
            bArr[i2] = next.f16690b.mo52594M();
        }
        return C12367m2.m27194e(bArr);
    }

    /* renamed from: c */
    public static C12564o m32166c(List<C10871d> list) {
        return C12173h.m26566c(m32165b(list));
    }
}
