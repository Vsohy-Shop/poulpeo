package p364io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import p111h6.C8003j;
import p111h6.C8012n;

/* renamed from: io.grpc.internal.o0 */
/* compiled from: ForwardingReadableBuffer */
public abstract class C12377o0 implements C12451v1 {

    /* renamed from: b */
    private final C12451v1 f19669b;

    protected C12377o0(C12451v1 v1Var) {
        this.f19669b = (C12451v1) C8012n.m15756o(v1Var, "buf");
    }

    /* renamed from: J */
    public void mo50015J(byte[] bArr, int i, int i2) {
        this.f19669b.mo50015J(bArr, i, i2);
    }

    /* renamed from: N */
    public void mo49747N() {
        this.f19669b.mo49747N();
    }

    /* renamed from: e */
    public int mo50016e() {
        return this.f19669b.mo50016e();
    }

    /* renamed from: e0 */
    public void mo50017e0(OutputStream outputStream, int i) {
        this.f19669b.mo50017e0(outputStream, i);
    }

    public boolean markSupported() {
        return this.f19669b.markSupported();
    }

    /* renamed from: n0 */
    public void mo50018n0(ByteBuffer byteBuffer) {
        this.f19669b.mo50018n0(byteBuffer);
    }

    /* renamed from: q */
    public C12451v1 mo50019q(int i) {
        return this.f19669b.mo50019q(i);
    }

    public int readUnsignedByte() {
        return this.f19669b.readUnsignedByte();
    }

    public void reset() {
        this.f19669b.reset();
    }

    public void skipBytes(int i) {
        this.f19669b.skipBytes(i);
    }

    public String toString() {
        return C8003j.m15723c(this).mo41840d("delegate", this.f19669b).toString();
    }
}
