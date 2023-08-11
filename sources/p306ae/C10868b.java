package p306ae;

import java.io.Closeable;
import java.util.List;
import okio.C13130e;
import okio.C13133f;

/* renamed from: ae.b */
/* compiled from: FrameReader */
public interface C10868b extends Closeable {

    /* renamed from: ae.b$a */
    /* compiled from: FrameReader */
    public interface C10869a {
        void ackSettings();

        void data(boolean z, int i, C13130e eVar, int i2);

        /* renamed from: i */
        void mo45826i(int i, C10867a aVar);

        /* renamed from: j */
        void mo45827j(boolean z, boolean z2, int i, int i2, List<C10871d> list, C10872e eVar);

        /* renamed from: k */
        void mo45828k(boolean z, C10883i iVar);

        /* renamed from: l */
        void mo45829l(int i, C10867a aVar, C13133f fVar);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List<C10871d> list);

        void windowUpdate(int i, long j);
    }

    /* renamed from: T */
    boolean mo45823T(C10869a aVar);
}
