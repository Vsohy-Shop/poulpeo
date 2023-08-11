package p364io.grpc;

import com.google.common.p056io.BaseEncoding;
import java.nio.charset.Charset;
import p364io.grpc.C12564o;

/* renamed from: io.grpc.h */
/* compiled from: InternalMetadata */
public final class C12173h {

    /* renamed from: a */
    public static final Charset f19086a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final BaseEncoding f19087b = C12564o.f20136e;

    /* renamed from: io.grpc.h$a */
    /* compiled from: InternalMetadata */
    public interface C12174a<T> extends C12564o.C12574j<T> {
    }

    /* renamed from: a */
    public static int m26564a(C12564o oVar) {
        return oVar.mo50242g();
    }

    /* renamed from: b */
    public static <T> C12564o.C12571g<T> m26565b(String str, C12174a<T> aVar) {
        boolean z = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z = true;
        }
        return C12564o.C12571g.m27838g(str, z, aVar);
    }

    /* renamed from: c */
    public static C12564o m26566c(byte[]... bArr) {
        return new C12564o(bArr);
    }

    /* renamed from: d */
    public static byte[][] m26567d(C12564o oVar) {
        return oVar.mo50245o();
    }
}
