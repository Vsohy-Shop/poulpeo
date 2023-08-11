package p464yd;

import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import okio.C13121c;
import p364io.grpc.internal.C12213c;
import p364io.grpc.internal.C12451v1;

/* renamed from: yd.k */
/* compiled from: OkHttpReadableBuffer */
class C13909k extends C12213c {

    /* renamed from: b */
    private final C13121c f22807b;

    C13909k(C13121c cVar) {
        this.f22807b = cVar;
    }

    /* renamed from: J */
    public void mo50015J(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.f22807b.read(bArr, i, i2);
            if (read != -1) {
                i2 -= read;
                i += read;
            } else {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
        }
    }

    public void close() {
        this.f22807b.mo52514a();
    }

    /* renamed from: e */
    public int mo50016e() {
        return (int) this.f22807b.size();
    }

    /* renamed from: e0 */
    public void mo50017e0(OutputStream outputStream, int i) {
        this.f22807b.mo52505S0(outputStream, (long) i);
    }

    /* renamed from: n0 */
    public void mo50018n0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public C12451v1 mo50019q(int i) {
        C13121c cVar = new C13121c();
        cVar.write(this.f22807b, (long) i);
        return new C13909k(cVar);
    }

    public int readUnsignedByte() {
        try {
            m32126b();
            return this.f22807b.readByte() & 255;
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    public void skipBytes(int i) {
        try {
            this.f22807b.skip((long) i);
        } catch (EOFException e) {
            throw new IndexOutOfBoundsException(e.getMessage());
        }
    }

    /* renamed from: b */
    private void m32126b() {
    }
}
