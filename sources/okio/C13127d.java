package okio;

import java.nio.channels.WritableByteChannel;

/* renamed from: okio.d */
/* compiled from: BufferedSink.kt */
public interface C13127d extends C13175w0, WritableByteChannel {
    /* renamed from: F */
    C13127d mo52486F(String str);

    /* renamed from: K */
    long mo52494K(C13179y0 y0Var);

    /* renamed from: L */
    C13127d mo52496L(long j);

    /* renamed from: b0 */
    C13127d mo52517b0(C13133f fVar);

    /* renamed from: d */
    C13121c mo52521d();

    /* renamed from: f */
    C13121c mo52524f();

    void flush();

    /* renamed from: o0 */
    C13127d mo52535o0(long j);

    /* renamed from: p */
    C13127d mo52536p();

    C13127d write(byte[] bArr);

    C13127d write(byte[] bArr, int i, int i2);

    C13127d writeByte(int i);

    C13127d writeInt(int i);

    C13127d writeShort(int i);

    /* renamed from: y */
    C13127d mo52566y();
}
