package p364io.grpc.internal;

import java.nio.charset.Charset;
import okhttp3.internal.http2.Header;
import p111h6.C7994c;
import p111h6.C8012n;
import p364io.grpc.C12173h;
import p364io.grpc.C12545j;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12176a;

/* renamed from: io.grpc.internal.u0 */
/* compiled from: Http2ClientStreamTransportState */
public abstract class C12441u0 extends C12176a.C12179c {

    /* renamed from: w */
    private static final C12173h.C12174a<Integer> f19847w;

    /* renamed from: x */
    private static final C12564o.C12571g<Integer> f19848x;

    /* renamed from: s */
    private C12594t f19849s;

    /* renamed from: t */
    private C12564o f19850t;

    /* renamed from: u */
    private Charset f19851u = C7994c.f11229c;

    /* renamed from: v */
    private boolean f19852v;

    /* renamed from: io.grpc.internal.u0$a */
    /* compiled from: Http2ClientStreamTransportState */
    class C12442a implements C12173h.C12174a<Integer> {
        C12442a() {
        }

        /* renamed from: c */
        public Integer mo50054b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, C12173h.f19086a));
        }

        /* renamed from: d */
        public byte[] mo50053a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        C12442a aVar = new C12442a();
        f19847w = aVar;
        f19848x = C12173h.m26565b(Header.RESPONSE_STATUS_UTF8, aVar);
    }

    protected C12441u0(int i, C12324i2 i2Var, C12379o2 o2Var) {
        super(i, i2Var, o2Var);
    }

    /* renamed from: O */
    private static Charset m27456O(C12564o oVar) {
        String str = (String) oVar.mo50241f(C12404r0.f19749h);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return C7994c.f11229c;
    }

    /* renamed from: Q */
    private C12594t m27457Q(C12564o oVar) {
        C12594t tVar;
        C12594t tVar2 = (C12594t) oVar.mo50241f(C12545j.f20109b);
        if (tVar2 != null) {
            return tVar2.mo50310r((String) oVar.mo50241f(C12545j.f20108a));
        }
        if (this.f19852v) {
            return C12594t.f20185h.mo50310r("missing GRPC status in response");
        }
        Integer num = (Integer) oVar.mo50241f(f19848x);
        if (num != null) {
            tVar = C12404r0.m27333l(num.intValue());
        } else {
            tVar = C12594t.f20197t.mo50310r("missing HTTP status code");
        }
        return tVar.mo50303f("missing GRPC status, inferred error from HTTP status code");
    }

    /* renamed from: R */
    private static void m27458R(C12564o oVar) {
        oVar.mo50240d(f19848x);
        oVar.mo50240d(C12545j.f20109b);
        oVar.mo50240d(C12545j.f20108a);
    }

    /* renamed from: V */
    private C12594t m27459V(C12564o oVar) {
        Integer num = (Integer) oVar.mo50241f(f19848x);
        if (num == null) {
            return C12594t.f20197t.mo50310r("Missing HTTP status code");
        }
        String str = (String) oVar.mo50241f(C12404r0.f19749h);
        if (C12404r0.m27334m(str)) {
            return null;
        }
        C12594t l = C12404r0.m27333l(num.intValue());
        return l.mo50303f("invalid content-type: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public abstract void mo50098P(C12594t tVar, boolean z, C12564o oVar);

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo50099S(C12451v1 v1Var, boolean z) {
        C12594t tVar = this.f19849s;
        if (tVar != null) {
            this.f19849s = tVar.mo50303f("DATA-----------------------------\n" + C12455w1.m27501e(v1Var, this.f19851u));
            v1Var.close();
            if (this.f19849s.mo50307o().length() > 1000 || z) {
                mo50098P(this.f19849s, false, this.f19850t);
            }
        } else if (!this.f19852v) {
            mo50098P(C12594t.f20197t.mo50310r("headers not received before payload"), false, new C12564o());
        } else {
            int e = v1Var.mo50016e();
            mo49686D(v1Var);
            if (z) {
                if (e > 0) {
                    this.f19849s = C12594t.f20197t.mo50310r("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f19849s = C12594t.f20197t.mo50310r("Received unexpected EOS on empty DATA frame from server");
                }
                C12564o oVar = new C12564o();
                this.f19850t = oVar;
                mo49693N(this.f19849s, false, oVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo50100T(C12564o oVar) {
        C8012n.m15756o(oVar, "headers");
        C12594t tVar = this.f19849s;
        if (tVar != null) {
            this.f19849s = tVar.mo50303f("headers: " + oVar);
            return;
        }
        try {
            if (this.f19852v) {
                C12594t r = C12594t.f20197t.mo50310r("Received headers twice");
                this.f19849s = r;
                if (r != null) {
                    this.f19849s = r.mo50303f("headers: " + oVar);
                    this.f19850t = oVar;
                    this.f19851u = m27456O(oVar);
                    return;
                }
                return;
            }
            Integer num = (Integer) oVar.mo50241f(f19848x);
            if (num == null || num.intValue() < 100 || num.intValue() >= 200) {
                this.f19852v = true;
                C12594t V = m27459V(oVar);
                this.f19849s = V;
                if (V == null) {
                    m27458R(oVar);
                    mo49687E(oVar);
                    C12594t tVar2 = this.f19849s;
                    if (tVar2 != null) {
                        this.f19849s = tVar2.mo50303f("headers: " + oVar);
                        this.f19850t = oVar;
                        this.f19851u = m27456O(oVar);
                    }
                } else if (V != null) {
                    this.f19849s = V.mo50303f("headers: " + oVar);
                    this.f19850t = oVar;
                    this.f19851u = m27456O(oVar);
                }
            }
        } finally {
            C12594t tVar3 = this.f19849s;
            if (tVar3 != null) {
                this.f19849s = tVar3.mo50303f("headers: " + oVar);
                this.f19850t = oVar;
                this.f19851u = m27456O(oVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo50101U(C12564o oVar) {
        C8012n.m15756o(oVar, "trailers");
        if (this.f19849s == null && !this.f19852v) {
            C12594t V = m27459V(oVar);
            this.f19849s = V;
            if (V != null) {
                this.f19850t = oVar;
            }
        }
        C12594t tVar = this.f19849s;
        if (tVar != null) {
            C12594t f = tVar.mo50303f("trailers: " + oVar);
            this.f19849s = f;
            mo50098P(f, false, this.f19850t);
            return;
        }
        C12594t Q = m27457Q(oVar);
        m27458R(oVar);
        mo49688F(oVar, Q);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo49694b(boolean z) {
        super.mo49694b(z);
    }
}
