package p464yd;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.C13121c;
import okio.C13133f;
import p111h6.C8012n;
import p306ae.C10867a;
import p306ae.C10870c;
import p306ae.C10871d;
import p306ae.C10883i;
import p464yd.C13904i;

/* renamed from: yd.b */
/* compiled from: ExceptionHandlingFrameWriter */
final class C13880b implements C10870c {

    /* renamed from: e */
    private static final Logger f22623e = Logger.getLogger(C13896h.class.getName());

    /* renamed from: b */
    private final C13881a f22624b;

    /* renamed from: c */
    private final C10870c f22625c;

    /* renamed from: d */
    private final C13904i f22626d;

    /* renamed from: yd.b$a */
    /* compiled from: ExceptionHandlingFrameWriter */
    interface C13881a {
        /* renamed from: a */
        void mo53586a(Throwable th);
    }

    C13880b(C13881a aVar, C10870c cVar) {
        this(aVar, cVar, new C13904i(Level.FINE, (Class<?>) C13896h.class));
    }

    /* renamed from: a */
    static Level m31952a(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    /* renamed from: C */
    public void mo45834C(int i, C10867a aVar, byte[] bArr) {
        this.f22626d.mo53624c(C13904i.C13905a.OUTBOUND, i, aVar, C13133f.m29655v(bArr));
        try {
            this.f22625c.mo45834C(i, aVar, bArr);
            this.f22625c.flush();
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    /* renamed from: S */
    public void mo45835S(C10883i iVar) {
        this.f22626d.mo53631j(C13904i.C13905a.OUTBOUND);
        try {
            this.f22625c.mo45835S(iVar);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public void close() {
        try {
            this.f22625c.close();
        } catch (IOException e) {
            f22623e.log(m31952a(e), "Failed closing connection", e);
        }
    }

    public void connectionPreface() {
        try {
            this.f22625c.connectionPreface();
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public void data(boolean z, int i, C13121c cVar, int i2) {
        this.f22626d.mo53623b(C13904i.C13905a.OUTBOUND, i, cVar.mo52521d(), i2, z);
        try {
            this.f22625c.data(z, i, cVar, i2);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    /* renamed from: f0 */
    public void mo45838f0(C10883i iVar) {
        this.f22626d.mo53630i(C13904i.C13905a.OUTBOUND, iVar);
        try {
            this.f22625c.mo45838f0(iVar);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public void flush() {
        try {
            this.f22625c.flush();
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    /* renamed from: i */
    public void mo45840i(int i, C10867a aVar) {
        this.f22626d.mo53629h(C13904i.C13905a.OUTBOUND, i, aVar);
        try {
            this.f22625c.mo45840i(i, aVar);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public int maxDataLength() {
        return this.f22625c.maxDataLength();
    }

    public void ping(boolean z, int i, int i2) {
        if (z) {
            this.f22626d.mo53627f(C13904i.C13905a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        } else {
            this.f22626d.mo53626e(C13904i.C13905a.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f22625c.ping(z, i, i2);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public void synStream(boolean z, boolean z2, int i, int i2, List<C10871d> list) {
        try {
            this.f22625c.synStream(z, z2, i, i2, list);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    public void windowUpdate(int i, long j) {
        this.f22626d.mo53632k(C13904i.C13905a.OUTBOUND, i, j);
        try {
            this.f22625c.windowUpdate(i, j);
        } catch (IOException e) {
            this.f22624b.mo53586a(e);
        }
    }

    C13880b(C13881a aVar, C10870c cVar, C13904i iVar) {
        this.f22624b = (C13881a) C8012n.m15756o(aVar, "transportExceptionHandler");
        this.f22625c = (C10870c) C8012n.m15756o(cVar, "frameWriter");
        this.f22626d = (C13904i) C8012n.m15756o(iVar, "frameLogger");
    }
}
