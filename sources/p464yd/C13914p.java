package p464yd;

import androidx.core.app.NotificationCompat;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import okio.C13121c;
import p111h6.C8012n;
import p306ae.C10870c;

/* renamed from: yd.p */
/* compiled from: OutboundFlowController */
class C13914p {

    /* renamed from: a */
    private final C13896h f22812a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C10870c f22813b;

    /* renamed from: c */
    private int f22814c = 65535;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C13916b f22815d = new C13916b(0, 65535);

    /* renamed from: yd.p$c */
    /* compiled from: OutboundFlowController */
    private static final class C13917c {

        /* renamed from: a */
        int f22823a;

        private C13917c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo53655a() {
            if (this.f22823a > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo53656b() {
            this.f22823a++;
        }
    }

    C13914p(C13896h hVar, C10870c cVar) {
        this.f22812a = (C13896h) C8012n.m15756o(hVar, NotificationCompat.CATEGORY_TRANSPORT);
        this.f22813b = (C10870c) C8012n.m15756o(cVar, "frameWriter");
    }

    /* renamed from: f */
    private C13916b m32144f(C13893g gVar) {
        C13916b bVar = (C13916b) gVar.mo53594M();
        if (bVar != null) {
            return bVar;
        }
        C13916b bVar2 = new C13916b(this, gVar, this.f22814c);
        gVar.mo53597P(bVar2);
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo53638c(boolean z, int i, C13121c cVar, boolean z2) {
        C8012n.m15756o(cVar, APIParams.SOURCE);
        C13893g a0 = this.f22812a.mo53611a0(i);
        if (a0 != null) {
            C13916b f = m32144f(a0);
            int j = f.mo53652j();
            boolean e = f.mo53647e();
            int size = (int) cVar.size();
            if (e || j < size) {
                if (!e && j > 0) {
                    f.mo53653k(cVar, j, false);
                }
                f.mo53646d(cVar, (int) cVar.size(), z);
            } else {
                f.mo53653k(cVar, size, z);
            }
            if (z2) {
                mo53639d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53639d() {
        try {
            this.f22813b.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo53640e(int i) {
        if (i >= 0) {
            int i2 = i - this.f22814c;
            this.f22814c = i;
            for (C13893g gVar : this.f22812a.mo53607V()) {
                C13916b bVar = (C13916b) gVar.mo53594M();
                if (bVar == null) {
                    gVar.mo53597P(new C13916b(this, gVar, this.f22814c));
                } else {
                    bVar.mo53648f(i2);
                }
            }
            if (i2 > 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Invalid initial window size: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo53641g(C13893g gVar, int i) {
        if (gVar == null) {
            int f = this.f22815d.mo53648f(i);
            mo53642h();
            return f;
        }
        C13916b f2 = m32144f(gVar);
        int f3 = f2.mo53648f(i);
        C13917c cVar = new C13917c();
        f2.mo53654l(f2.mo53652j(), cVar);
        if (cVar.mo53655a()) {
            mo53639d();
        }
        return f3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo53642h() {
        int i;
        C13893g[] V = this.f22812a.mo53607V();
        int i2 = this.f22815d.mo53651i();
        int length = V.length;
        while (true) {
            i = 0;
            if (length <= 0 || i2 <= 0) {
                C13917c cVar = new C13917c();
                C13893g[] V2 = this.f22812a.mo53607V();
                int length2 = V2.length;
            } else {
                int ceil = (int) Math.ceil((double) (((float) i2) / ((float) length)));
                for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                    C13893g gVar = V[i3];
                    C13916b f = m32144f(gVar);
                    int min = Math.min(i2, Math.min(f.mo53650h(), ceil));
                    if (min > 0) {
                        f.mo53643a(min);
                        i2 -= min;
                    }
                    if (f.mo53650h() > 0) {
                        V[i] = gVar;
                        i++;
                    }
                }
                length = i;
            }
        }
        C13917c cVar2 = new C13917c();
        C13893g[] V22 = this.f22812a.mo53607V();
        int length22 = V22.length;
        while (i < length22) {
            C13916b f2 = m32144f(V22[i]);
            f2.mo53654l(f2.mo53644b(), cVar2);
            f2.mo53645c();
            i++;
        }
        if (cVar2.mo53655a()) {
            mo53639d();
        }
    }

    /* renamed from: yd.p$b */
    /* compiled from: OutboundFlowController */
    private final class C13916b {

        /* renamed from: a */
        final C13121c f22816a;

        /* renamed from: b */
        final int f22817b;

        /* renamed from: c */
        int f22818c;

        /* renamed from: d */
        int f22819d;

        /* renamed from: e */
        C13893g f22820e;

        /* renamed from: f */
        boolean f22821f;

        C13916b(int i, int i2) {
            this.f22821f = false;
            this.f22817b = i;
            this.f22818c = i2;
            this.f22816a = new C13121c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo53643a(int i) {
            this.f22819d += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo53644b() {
            return this.f22819d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo53645c() {
            this.f22819d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo53646d(C13121c cVar, int i, boolean z) {
            this.f22816a.write(cVar, (long) i);
            this.f22821f |= z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo53647e() {
            if (this.f22816a.size() > 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo53648f(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.f22818c) {
                int i2 = this.f22818c + i;
                this.f22818c = i2;
                return i2;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f22817b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo53649g() {
            return Math.max(0, Math.min(this.f22818c, (int) this.f22816a.size()));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo53650h() {
            return mo53649g() - this.f22819d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo53651i() {
            return this.f22818c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo53652j() {
            return Math.min(this.f22818c, C13914p.this.f22815d.mo53651i());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo53653k(C13121c cVar, int i, boolean z) {
            boolean z2;
            do {
                int min = Math.min(i, C13914p.this.f22813b.maxDataLength());
                int i2 = -min;
                C13914p.this.f22815d.mo53648f(i2);
                mo53648f(i2);
                try {
                    if (cVar.size() != ((long) min) || !z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    C13914p.this.f22813b.data(z2, this.f22817b, cVar, min);
                    this.f22820e.mo49676x().mo49783q(min);
                    i -= min;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } while (i > 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo53654l(int i, C13917c cVar) {
            int min = Math.min(i, mo53652j());
            int i2 = 0;
            while (mo53647e() && min > 0) {
                if (((long) min) >= this.f22816a.size()) {
                    i2 += (int) this.f22816a.size();
                    C13121c cVar2 = this.f22816a;
                    mo53653k(cVar2, (int) cVar2.size(), this.f22821f);
                } else {
                    i2 += min;
                    mo53653k(this.f22816a, min, false);
                }
                cVar.mo53656b();
                min = Math.min(i - i2, mo53652j());
            }
            return i2;
        }

        C13916b(C13914p pVar, C13893g gVar, int i) {
            this(gVar.mo53596O(), i);
            this.f22820e = gVar;
        }
    }
}
