package com.facebook;

import android.os.Handler;
import com.facebook.C4570n;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: com.facebook.w */
/* compiled from: ProgressOutputStream.kt */
public final class C4595w extends FilterOutputStream implements C4597x {

    /* renamed from: b */
    private final long f4362b = FacebookSdk.getOnProgressThreshold();

    /* renamed from: c */
    private long f4363c;

    /* renamed from: d */
    private long f4364d;

    /* renamed from: e */
    private C4598y f4365e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4570n f4366f;

    /* renamed from: g */
    private final Map<C4555l, C4598y> f4367g;

    /* renamed from: h */
    private final long f4368h;

    /* renamed from: com.facebook.w$a */
    /* compiled from: ProgressOutputStream.kt */
    static final class C4596a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C4595w f4369b;

        /* renamed from: c */
        final /* synthetic */ C4570n.C4571a f4370c;

        C4596a(C4595w wVar, C4570n.C4571a aVar) {
            this.f4369b = wVar;
            this.f4370c = aVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        ((C4570n.C4573c) this.f4370c).mo31708b(this.f4369b.f4366f, this.f4369b.mo31800k(), this.f4369b.mo31798A());
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4595w(OutputStream outputStream, C4570n nVar, Map<C4555l, C4598y> map, long j) {
        super(outputStream);
        C12775o.m28639i(outputStream, "out");
        C12775o.m28639i(nVar, "requests");
        C12775o.m28639i(map, "progressMap");
        this.f4366f = nVar;
        this.f4367g = map;
        this.f4368h = j;
    }

    /* renamed from: G */
    private final void m5830G() {
        if (this.f4363c > this.f4364d) {
            for (C4570n.C4571a next : this.f4366f.mo31677A()) {
                if (next instanceof C4570n.C4573c) {
                    Handler z = this.f4366f.mo31707z();
                    if (z != null) {
                        z.post(new C4596a(this, next));
                    } else {
                        ((C4570n.C4573c) next).mo31708b(this.f4366f, this.f4363c, this.f4368h);
                    }
                }
            }
            this.f4364d = this.f4363c;
        }
    }

    /* renamed from: c */
    private final void m5832c(long j) {
        C4598y yVar = this.f4365e;
        if (yVar != null) {
            yVar.mo31805a(j);
        }
        long j2 = this.f4363c + j;
        this.f4363c = j2;
        if (j2 >= this.f4364d + this.f4362b || j2 >= this.f4368h) {
            m5830G();
        }
    }

    /* renamed from: A */
    public final long mo31798A() {
        return this.f4368h;
    }

    /* renamed from: a */
    public void mo31791a(C4555l lVar) {
        C4598y yVar;
        if (lVar != null) {
            yVar = this.f4367g.get(lVar);
        } else {
            yVar = null;
        }
        this.f4365e = yVar;
    }

    public void close() {
        super.close();
        for (C4598y c : this.f4367g.values()) {
            c.mo31807c();
        }
        m5830G();
    }

    /* renamed from: k */
    public final long mo31800k() {
        return this.f4363c;
    }

    public void write(byte[] bArr) {
        C12775o.m28639i(bArr, "buffer");
        this.out.write(bArr);
        m5832c((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        C12775o.m28639i(bArr, "buffer");
        this.out.write(bArr, i, i2);
        m5832c((long) i2);
    }

    public void write(int i) {
        this.out.write(i);
        m5832c(1);
    }
}
