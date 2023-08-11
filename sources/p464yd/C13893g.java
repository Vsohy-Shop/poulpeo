package p464yd;

import com.google.common.p056io.BaseEncoding;
import java.util.List;
import okio.C13121c;
import p111h6.C8012n;
import p306ae.C10867a;
import p306ae.C10871d;
import p335ee.C11891c;
import p335ee.C11892d;
import p364io.grpc.C12155a;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12176a;
import p364io.grpc.internal.C12324i2;
import p364io.grpc.internal.C12397p2;
import p364io.grpc.internal.C12402r;
import p364io.grpc.internal.C12441u0;
import p458xd.C13783d0;

/* renamed from: yd.g */
/* compiled from: OkHttpClientStream */
class C13893g extends C12176a {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C13121c f22686r = new C13121c();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C13783d0<?, ?> f22687h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f22688i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C12324i2 f22689j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f22690k;

    /* renamed from: l */
    private Object f22691l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile int f22692m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C13895b f22693n;

    /* renamed from: o */
    private final C13894a f22694o;

    /* renamed from: p */
    private final C12155a f22695p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f22696q;

    /* renamed from: yd.g$a */
    /* compiled from: OkHttpClientStream */
    class C13894a implements C12176a.C12178b {
        C13894a() {
        }

        /* renamed from: a */
        public void mo49683a(C12594t tVar) {
            C11891c.m25678f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C13893g.this.f22693n.f22712z) {
                    C13893g.this.f22693n.m32009a0(tVar, true, (C12564o) null);
                }
                C11891c.m25680h("OkHttpClientStream$Sink.cancel");
            } catch (Throwable th) {
                C11891c.m25680h("OkHttpClientStream$Sink.cancel");
                throw th;
            }
        }

        /* renamed from: b */
        public void mo49684b(C12397p2 p2Var, boolean z, boolean z2, int i) {
            C13121c cVar;
            C11891c.m25678f("OkHttpClientStream$Sink.writeFrame");
            if (p2Var == null) {
                cVar = C13893g.f22686r;
            } else {
                cVar = ((C13912n) p2Var).mo53637c();
                int size = (int) cVar.size();
                if (size > 0) {
                    C13893g.this.mo49778r(size);
                }
            }
            try {
                synchronized (C13893g.this.f22693n.f22712z) {
                    C13893g.this.f22693n.m32011c0(cVar, z, z2);
                    C13893g.this.mo49674v().mo50026e(i);
                }
                C11891c.m25680h("OkHttpClientStream$Sink.writeFrame");
            } catch (Throwable th) {
                C11891c.m25680h("OkHttpClientStream$Sink.writeFrame");
                throw th;
            }
        }

        /* renamed from: c */
        public void mo49685c(C12564o oVar, byte[] bArr) {
            C11891c.m25678f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C13893g.this.f22687h.mo53437c();
            if (bArr != null) {
                boolean unused = C13893g.this.f22696q = true;
                str = str + "?" + BaseEncoding.m11900b().mo39699f(bArr);
            }
            try {
                synchronized (C13893g.this.f22693n.f22712z) {
                    C13893g.this.f22693n.m32012e0(oVar, str);
                }
                C11891c.m25680h("OkHttpClientStream$Sink.writeHeaders");
            } catch (Throwable th) {
                C11891c.m25680h("OkHttpClientStream$Sink.writeHeaders");
                throw th;
            }
        }
    }

    /* renamed from: yd.g$b */
    /* compiled from: OkHttpClientStream */
    class C13895b extends C12441u0 {

        /* renamed from: A */
        private List<C10871d> f22698A;

        /* renamed from: B */
        private C13121c f22699B = new C13121c();

        /* renamed from: C */
        private boolean f22700C = false;

        /* renamed from: D */
        private boolean f22701D = false;

        /* renamed from: E */
        private boolean f22702E = false;

        /* renamed from: F */
        private int f22703F;

        /* renamed from: G */
        private int f22704G;

        /* renamed from: H */
        private final C13880b f22705H;

        /* renamed from: I */
        private final C13914p f22706I;

        /* renamed from: J */
        private final C13896h f22707J;

        /* renamed from: K */
        private boolean f22708K = true;

        /* renamed from: L */
        private final C11892d f22709L;

        /* renamed from: y */
        private final int f22711y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public final Object f22712z;

        public C13895b(int i, C12324i2 i2Var, Object obj, C13880b bVar, C13914p pVar, C13896h hVar, int i2, String str) {
            super(i, i2Var, C13893g.this.mo49674v());
            this.f22712z = C8012n.m15756o(obj, "lock");
            this.f22705H = bVar;
            this.f22706I = pVar;
            this.f22707J = hVar;
            this.f22703F = i2;
            this.f22704G = i2;
            this.f22711y = i2;
            this.f22709L = C11891c.m25673a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m32009a0(C12594t tVar, boolean z, C12564o oVar) {
            if (!this.f22702E) {
                this.f22702E = true;
                if (this.f22708K) {
                    this.f22707J.mo53615j0(C13893g.this);
                    this.f22698A = null;
                    this.f22699B.mo52514a();
                    this.f22708K = false;
                    if (oVar == null) {
                        oVar = new C12564o();
                    }
                    mo49693N(tVar, true, oVar);
                    return;
                }
                this.f22707J.mo53606U(C13893g.this.mo53596O(), tVar, C12402r.C12403a.PROCESSED, z, C10867a.CANCEL, oVar);
            }
        }

        /* renamed from: b0 */
        private void m32010b0() {
            if (!mo49689G()) {
                this.f22707J.mo53606U(C13893g.this.mo53596O(), (C12594t) null, C12402r.C12403a.PROCESSED, false, C10867a.CANCEL, (C12564o) null);
            } else {
                this.f22707J.mo53606U(C13893g.this.mo53596O(), (C12594t) null, C12402r.C12403a.PROCESSED, false, (C10867a) null, (C12564o) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c0 */
        public void m32011c0(C13121c cVar, boolean z, boolean z2) {
            boolean z3;
            if (!this.f22702E) {
                if (this.f22708K) {
                    this.f22699B.write(cVar, (long) ((int) cVar.size()));
                    this.f22700C |= z;
                    this.f22701D |= z2;
                    return;
                }
                if (C13893g.this.mo53596O() != -1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C8012n.m15762u(z3, "streamId should be set");
                this.f22706I.mo53638c(z, C13893g.this.mo53596O(), cVar, z2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m32012e0(C12564o oVar, String str) {
            this.f22698A = C13882c.m31958a(oVar, str, C13893g.this.f22690k, C13893g.this.f22688i, C13893g.this.f22696q, this.f22707J.mo53612d0());
            this.f22707J.mo53617q0(C13893g.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo50098P(C12594t tVar, boolean z, C12564o oVar) {
            m32009a0(tVar, z, oVar);
        }

        /* renamed from: b */
        public void mo49694b(boolean z) {
            m32010b0();
            super.mo49694b(z);
        }

        /* renamed from: c */
        public void mo49832c(int i) {
            int i2 = this.f22704G - i;
            this.f22704G = i2;
            int i3 = this.f22711y;
            if (((float) i2) <= ((float) i3) * 0.5f) {
                int i4 = i3 - i2;
                this.f22703F += i4;
                this.f22704G = i2 + i4;
                this.f22705H.windowUpdate(C13893g.this.mo53596O(), (long) i4);
            }
        }

        /* renamed from: d */
        public void mo49833d(Throwable th) {
            mo50098P(C12594t.m27926l(th), true, new C12564o());
        }

        /* renamed from: d0 */
        public void mo53601d0(int i) {
            boolean z;
            if (C13893g.this.f22692m == -1) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15763v(z, "the stream has been started with id %s", i);
            int unused = C13893g.this.f22692m = i;
            C13893g.this.f22693n.mo49784r();
            if (this.f22708K) {
                this.f22705H.synStream(C13893g.this.f22696q, false, C13893g.this.f22692m, 0, this.f22698A);
                C13893g.this.f22689j.mo49939c();
                this.f22698A = null;
                if (this.f22699B.size() > 0) {
                    this.f22706I.mo53638c(this.f22700C, C13893g.this.f22692m, this.f22699B, this.f22701D);
                }
                this.f22708K = false;
            }
        }

        /* renamed from: e */
        public void mo49838e(Runnable runnable) {
            synchronized (this.f22712z) {
                runnable.run();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f0 */
        public C11892d mo53602f0() {
            return this.f22709L;
        }

        /* renamed from: g0 */
        public void mo53603g0(C13121c cVar, boolean z) {
            int size = this.f22703F - ((int) cVar.size());
            this.f22703F = size;
            if (size < 0) {
                this.f22705H.mo45840i(C13893g.this.mo53596O(), C10867a.FLOW_CONTROL_ERROR);
                this.f22707J.mo53606U(C13893g.this.mo53596O(), C12594t.f20197t.mo50310r("Received data size exceeded our receiving window size"), C12402r.C12403a.PROCESSED, false, (C10867a) null, (C12564o) null);
                return;
            }
            super.mo50099S(new C13909k(cVar), z);
        }

        /* renamed from: h0 */
        public void mo53604h0(List<C10871d> list, boolean z) {
            if (z) {
                mo50101U(C13918q.m32166c(list));
            } else {
                mo50100T(C13918q.m32164a(list));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo49784r() {
            super.mo49784r();
            mo49782l().mo50024c();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C13893g(p458xd.C13783d0<?, ?> r13, p364io.grpc.C12564o r14, p464yd.C13880b r15, p464yd.C13896h r16, p464yd.C13914p r17, java.lang.Object r18, int r19, int r20, java.lang.String r21, java.lang.String r22, p364io.grpc.internal.C12324i2 r23, p364io.grpc.internal.C12379o2 r24, p364io.grpc.C12159b r25, boolean r26) {
        /*
            r12 = this;
            r10 = r12
            yd.o r1 = new yd.o
            r1.<init>()
            r7 = 0
            if (r26 == 0) goto L_0x0012
            boolean r0 = r13.mo53440f()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            r6 = r0
            goto L_0x0013
        L_0x0012:
            r6 = r7
        L_0x0013:
            r0 = r12
            r2 = r23
            r3 = r24
            r4 = r14
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r10.f22692m = r0
            yd.g$a r0 = new yd.g$a
            r0.<init>()
            r10.f22694o = r0
            r10.f22696q = r7
            java.lang.String r0 = "statsTraceCtx"
            r3 = r23
            java.lang.Object r0 = p111h6.C8012n.m15756o(r3, r0)
            io.grpc.internal.i2 r0 = (p364io.grpc.internal.C12324i2) r0
            r10.f22689j = r0
            r0 = r13
            r10.f22687h = r0
            r1 = r21
            r10.f22690k = r1
            r1 = r22
            r10.f22688i = r1
            io.grpc.a r1 = r16.mo53608W()
            r10.f22695p = r1
            yd.g$b r11 = new yd.g$b
            java.lang.String r9 = r13.mo53437c()
            r0 = r11
            r1 = r12
            r2 = r19
            r4 = r18
            r5 = r15
            r6 = r17
            r7 = r16
            r8 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f22693n = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p464yd.C13893g.<init>(xd.d0, io.grpc.o, yd.b, yd.h, yd.p, java.lang.Object, int, int, java.lang.String, java.lang.String, io.grpc.internal.i2, io.grpc.internal.o2, io.grpc.b, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public Object mo53594M() {
        return this.f22691l;
    }

    /* renamed from: N */
    public C13783d0.C13787d mo53595N() {
        return this.f22687h.mo53439e();
    }

    /* renamed from: O */
    public int mo53596O() {
        return this.f22692m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo53597P(Object obj) {
        this.f22691l = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public C13895b mo49676x() {
        return this.f22693n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public boolean mo53599R() {
        return this.f22696q;
    }

    /* renamed from: g */
    public void mo49719g(String str) {
        this.f22690k = (String) C8012n.m15756o(str, "authority");
    }

    public C12155a getAttributes() {
        return this.f22695p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C13894a mo49673t() {
        return this.f22694o;
    }
}
