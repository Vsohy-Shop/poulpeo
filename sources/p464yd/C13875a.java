package p464yd;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.net.Socket;
import okio.C13121c;
import okio.C13175w0;
import okio.C13181z0;
import p111h6.C8012n;
import p335ee.C11890b;
import p335ee.C11891c;
import p364io.grpc.internal.C12236d2;
import p464yd.C13880b;

/* renamed from: yd.a */
/* compiled from: AsyncSink */
final class C13875a implements C13175w0 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f22608b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C13121c f22609c = new C13121c();

    /* renamed from: d */
    private final C12236d2 f22610d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C13880b.C13881a f22611e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f22612f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f22613g = false;

    /* renamed from: h */
    private boolean f22614h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C13175w0 f22615i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Socket f22616j;

    /* renamed from: yd.a$a */
    /* compiled from: AsyncSink */
    class C13876a extends C13879d {

        /* renamed from: c */
        final C11890b f22617c = C11891c.m25677e();

        C13876a() {
            super(C13875a.this, (C13876a) null);
        }

        /* renamed from: a */
        public void mo53582a() {
            C11891c.m25678f("WriteRunnable.runWrite");
            C11891c.m25676d(this.f22617c);
            C13121c cVar = new C13121c();
            try {
                synchronized (C13875a.this.f22608b) {
                    cVar.write(C13875a.this.f22609c, C13875a.this.f22609c.mo52518c());
                    boolean unused = C13875a.this.f22612f = false;
                }
                C13875a.this.f22615i.write(cVar, cVar.size());
                C11891c.m25680h("WriteRunnable.runWrite");
            } catch (Throwable th) {
                C11891c.m25680h("WriteRunnable.runWrite");
                throw th;
            }
        }
    }

    /* renamed from: yd.a$b */
    /* compiled from: AsyncSink */
    class C13877b extends C13879d {

        /* renamed from: c */
        final C11890b f22619c = C11891c.m25677e();

        C13877b() {
            super(C13875a.this, (C13876a) null);
        }

        /* renamed from: a */
        public void mo53582a() {
            C11891c.m25678f("WriteRunnable.runFlush");
            C11891c.m25676d(this.f22619c);
            C13121c cVar = new C13121c();
            try {
                synchronized (C13875a.this.f22608b) {
                    cVar.write(C13875a.this.f22609c, C13875a.this.f22609c.size());
                    boolean unused = C13875a.this.f22613g = false;
                }
                C13875a.this.f22615i.write(cVar, cVar.size());
                C13875a.this.f22615i.flush();
                C11891c.m25680h("WriteRunnable.runFlush");
            } catch (Throwable th) {
                C11891c.m25680h("WriteRunnable.runFlush");
                throw th;
            }
        }
    }

    /* renamed from: yd.a$c */
    /* compiled from: AsyncSink */
    class C13878c implements Runnable {
        C13878c() {
        }

        public void run() {
            C13875a.this.f22609c.close();
            try {
                if (C13875a.this.f22615i != null) {
                    C13875a.this.f22615i.close();
                }
            } catch (IOException e) {
                C13875a.this.f22611e.mo53586a(e);
            }
            try {
                if (C13875a.this.f22616j != null) {
                    C13875a.this.f22616j.close();
                }
            } catch (IOException e2) {
                C13875a.this.f22611e.mo53586a(e2);
            }
        }
    }

    /* renamed from: yd.a$d */
    /* compiled from: AsyncSink */
    private abstract class C13879d implements Runnable {
        private C13879d() {
        }

        /* renamed from: a */
        public abstract void mo53582a();

        public final void run() {
            try {
                if (C13875a.this.f22615i != null) {
                    mo53582a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable sink.");
            } catch (Exception e) {
                C13875a.this.f22611e.mo53586a(e);
            }
        }

        /* synthetic */ C13879d(C13875a aVar, C13876a aVar2) {
            this();
        }
    }

    private C13875a(C12236d2 d2Var, C13880b.C13881a aVar) {
        this.f22610d = (C12236d2) C8012n.m15756o(d2Var, "executor");
        this.f22611e = (C13880b.C13881a) C8012n.m15756o(aVar, "exceptionHandler");
    }

    /* renamed from: R */
    static C13875a m31943R(C12236d2 d2Var, C13880b.C13881a aVar) {
        return new C13875a(d2Var, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo53581Q(C13175w0 w0Var, Socket socket) {
        boolean z;
        if (this.f22615i == null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15762u(z, "AsyncSink's becomeConnected should only be called once.");
        this.f22615i = (C13175w0) C8012n.m15756o(w0Var, "sink");
        this.f22616j = (Socket) C8012n.m15756o(socket, "socket");
    }

    public void close() {
        if (!this.f22614h) {
            this.f22614h = true;
            this.f22610d.execute(new C13878c());
        }
    }

    public void flush() {
        if (!this.f22614h) {
            C11891c.m25678f("AsyncSink.flush");
            try {
                synchronized (this.f22608b) {
                    if (this.f22613g) {
                        C11891c.m25680h("AsyncSink.flush");
                        return;
                    }
                    this.f22613g = true;
                    this.f22610d.execute(new C13877b());
                    C11891c.m25680h("AsyncSink.flush");
                }
            } catch (Throwable th) {
                C11891c.m25680h("AsyncSink.flush");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }

    public C13181z0 timeout() {
        return C13181z0.NONE;
    }

    public void write(C13121c cVar, long j) {
        C8012n.m15756o(cVar, APIParams.SOURCE);
        if (!this.f22614h) {
            C11891c.m25678f("AsyncSink.write");
            try {
                synchronized (this.f22608b) {
                    this.f22609c.write(cVar, j);
                    if (!this.f22612f && !this.f22613g) {
                        if (this.f22609c.mo52518c() > 0) {
                            this.f22612f = true;
                            this.f22610d.execute(new C13876a());
                            C11891c.m25680h("AsyncSink.write");
                            return;
                        }
                    }
                    C11891c.m25680h("AsyncSink.write");
                }
            } catch (Throwable th) {
                C11891c.m25680h("AsyncSink.write");
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
