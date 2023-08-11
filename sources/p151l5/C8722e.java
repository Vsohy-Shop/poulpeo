package p151l5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p204q8.C9330b;

/* renamed from: l5.e */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public abstract class C8722e {

    /* renamed from: a */
    private static final C8741x f12554a;

    static {
        C8740w wVar = new C8740w();
        C8721d.f12553a.mo42339a(wVar);
        f12554a = wVar.mo42879b();
    }

    private C8722e() {
    }

    /* renamed from: b */
    public static byte[] m17650b(Object obj) {
        C8741x xVar = f12554a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            xVar.mo42880a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public abstract C9330b mo42844a();
}
