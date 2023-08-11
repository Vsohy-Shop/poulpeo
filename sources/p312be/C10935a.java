package p312be;

import com.google.protobuf.C7149p0;
import com.google.protobuf.C7193x0;
import com.google.protobuf.CodedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import p458xd.C13778b0;
import p458xd.C13826s;

/* renamed from: be.a */
/* compiled from: ProtoInputStream */
final class C10935a extends InputStream implements C13826s, C13778b0 {

    /* renamed from: b */
    private C7149p0 f16870b;

    /* renamed from: c */
    private final C7193x0<?> f16871c;

    /* renamed from: d */
    private ByteArrayInputStream f16872d;

    C10935a(C7149p0 p0Var, C7193x0<?> x0Var) {
        this.f16870b = p0Var;
        this.f16871c = x0Var;
    }

    /* renamed from: a */
    public int mo45998a(OutputStream outputStream) {
        C7149p0 p0Var = this.f16870b;
        if (p0Var != null) {
            int f = p0Var.mo40627f();
            this.f16870b.mo40149c(outputStream);
            this.f16870b = null;
            return f;
        }
        ByteArrayInputStream byteArrayInputStream = this.f16872d;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) C10936b.m23558a(byteArrayInputStream, outputStream);
        this.f16872d = null;
        return a;
    }

    public int available() {
        C7149p0 p0Var = this.f16870b;
        if (p0Var != null) {
            return p0Var.mo40627f();
        }
        ByteArrayInputStream byteArrayInputStream = this.f16872d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7149p0 mo46000b() {
        C7149p0 p0Var = this.f16870b;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("message not available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C7193x0<?> mo46001c() {
        return this.f16871c;
    }

    public int read() {
        if (this.f16870b != null) {
            this.f16872d = new ByteArrayInputStream(this.f16870b.mo40151g());
            this.f16870b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f16872d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        C7149p0 p0Var = this.f16870b;
        if (p0Var != null) {
            int f = p0Var.mo40627f();
            if (f == 0) {
                this.f16870b = null;
                this.f16872d = null;
                return -1;
            } else if (i2 >= f) {
                CodedOutputStream h0 = CodedOutputStream.m12619h0(bArr, i, f);
                this.f16870b.mo40626d(h0);
                h0.mo40112c0();
                h0.mo40111c();
                this.f16870b = null;
                this.f16872d = null;
                return f;
            } else {
                this.f16872d = new ByteArrayInputStream(this.f16870b.mo40151g());
                this.f16870b = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f16872d;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
