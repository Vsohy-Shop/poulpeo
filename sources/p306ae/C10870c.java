package p306ae;

import java.io.Closeable;
import java.util.List;
import okio.C13121c;

/* renamed from: ae.c */
/* compiled from: FrameWriter */
public interface C10870c extends Closeable {
    /* renamed from: C */
    void mo45834C(int i, C10867a aVar, byte[] bArr);

    /* renamed from: S */
    void mo45835S(C10883i iVar);

    void connectionPreface();

    void data(boolean z, int i, C13121c cVar, int i2);

    /* renamed from: f0 */
    void mo45838f0(C10883i iVar);

    void flush();

    /* renamed from: i */
    void mo45840i(int i, C10867a aVar);

    int maxDataLength();

    void ping(boolean z, int i, int i2);

    void synStream(boolean z, boolean z2, int i, int i2, List<C10871d> list);

    void windowUpdate(int i, long j);
}
