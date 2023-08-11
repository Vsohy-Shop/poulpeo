package p306ae;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13179y0;

/* renamed from: ae.f */
/* compiled from: Hpack */
final class C10873f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C13133f f16697a = C13133f.m29652e(":");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C10871d[] f16698b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<C13133f, Integer> f16699c = m23179f();

    /* renamed from: ae.f$a */
    /* compiled from: Hpack */
    static final class C10874a {

        /* renamed from: a */
        private final List<C10871d> f16700a;

        /* renamed from: b */
        private final C13130e f16701b;

        /* renamed from: c */
        private int f16702c;

        /* renamed from: d */
        private int f16703d;

        /* renamed from: e */
        C10871d[] f16704e;

        /* renamed from: f */
        int f16705f;

        /* renamed from: g */
        int f16706g;

        /* renamed from: h */
        int f16707h;

        C10874a(int i, C13179y0 y0Var) {
            this(i, i, y0Var);
        }

        /* renamed from: a */
        private void m23180a() {
            int i = this.f16703d;
            int i2 = this.f16707h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23181b();
            } else {
                m23183d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m23181b() {
            Arrays.fill(this.f16704e, (Object) null);
            this.f16705f = this.f16704e.length - 1;
            this.f16706g = 0;
            this.f16707h = 0;
        }

        /* renamed from: c */
        private int m23182c(int i) {
            return this.f16705f + 1 + i;
        }

        /* renamed from: d */
        private int m23183d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f16704e.length;
                while (true) {
                    length--;
                    i2 = this.f16705f;
                    if (length < i2 || i <= 0) {
                        C10871d[] dVarArr = this.f16704e;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f16706g);
                        this.f16705f += i3;
                    } else {
                        int i4 = this.f16704e[length].f16691c;
                        i -= i4;
                        this.f16707h -= i4;
                        this.f16706g--;
                        i3++;
                    }
                }
                C10871d[] dVarArr2 = this.f16704e;
                System.arraycopy(dVarArr2, i2 + 1, dVarArr2, i2 + 1 + i3, this.f16706g);
                this.f16705f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private C13133f m23184f(int i) {
            if (m23186i(i)) {
                return C10873f.f16698b[i].f16689a;
            }
            int c = m23182c(i - C10873f.f16698b.length);
            if (c >= 0) {
                C10871d[] dVarArr = this.f16704e;
                if (c < dVarArr.length) {
                    return dVarArr[c].f16689a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: h */
        private void m23185h(int i, C10871d dVar) {
            this.f16700a.add(dVar);
            int i2 = dVar.f16691c;
            if (i != -1) {
                i2 -= this.f16704e[m23182c(i)].f16691c;
            }
            int i3 = this.f16703d;
            if (i2 > i3) {
                m23181b();
                return;
            }
            int d = m23183d((this.f16707h + i2) - i3);
            if (i == -1) {
                int i4 = this.f16706g + 1;
                C10871d[] dVarArr = this.f16704e;
                if (i4 > dVarArr.length) {
                    C10871d[] dVarArr2 = new C10871d[(dVarArr.length * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f16705f = this.f16704e.length - 1;
                    this.f16704e = dVarArr2;
                }
                int i5 = this.f16705f;
                this.f16705f = i5 - 1;
                this.f16704e[i5] = dVar;
                this.f16706g++;
            } else {
                this.f16704e[i + m23182c(i) + d] = dVar;
            }
            this.f16707h += i2;
        }

        /* renamed from: i */
        private boolean m23186i(int i) {
            if (i < 0 || i > C10873f.f16698b.length - 1) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        private int m23187j() {
            return this.f16701b.readByte() & 255;
        }

        /* renamed from: m */
        private void m23188m(int i) {
            if (m23186i(i)) {
                this.f16700a.add(C10873f.f16698b[i]);
                return;
            }
            int c = m23182c(i - C10873f.f16698b.length);
            if (c >= 0) {
                C10871d[] dVarArr = this.f16704e;
                if (c <= dVarArr.length - 1) {
                    this.f16700a.add(dVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m23189o(int i) {
            m23185h(-1, new C10871d(m23184f(i), mo45850k()));
        }

        /* renamed from: p */
        private void m23190p() {
            m23185h(-1, new C10871d(C10873f.m23178e(mo45850k()), mo45850k()));
        }

        /* renamed from: q */
        private void m23191q(int i) {
            this.f16700a.add(new C10871d(m23184f(i), mo45850k()));
        }

        /* renamed from: r */
        private void m23192r() {
            this.f16700a.add(new C10871d(C10873f.m23178e(mo45850k()), mo45850k()));
        }

        /* renamed from: e */
        public List<C10871d> mo45848e() {
            ArrayList arrayList = new ArrayList(this.f16700a);
            this.f16700a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo45849g(int i) {
            this.f16702c = i;
            this.f16703d = i;
            m23180a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C13133f mo45850k() {
            boolean z;
            int j = m23187j();
            if ((j & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int n = mo45852n(j, 127);
            if (z) {
                return C13133f.m29655v(C10881h.m23241f().mo45865c(this.f16701b.mo52513Z((long) n)));
            }
            return this.f16701b.mo52534o((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo45851l() {
            while (!this.f16701b.mo52552t()) {
                byte readByte = this.f16701b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m23188m(mo45852n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m23190p();
                } else if ((readByte & 64) == 64) {
                    m23189o(mo45852n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo45852n(readByte, 31);
                    this.f16703d = n;
                    if (n < 0 || n > this.f16702c) {
                        throw new IOException("Invalid dynamic table size update " + this.f16703d);
                    }
                    m23180a();
                } else if (readByte == 16 || readByte == 0) {
                    m23192r();
                } else {
                    m23191q(mo45852n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo45852n(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m23187j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }

        C10874a(int i, int i2, C13179y0 y0Var) {
            this.f16700a = new ArrayList();
            C10871d[] dVarArr = new C10871d[8];
            this.f16704e = dVarArr;
            this.f16705f = dVarArr.length - 1;
            this.f16706g = 0;
            this.f16707h = 0;
            this.f16702c = i;
            this.f16703d = i2;
            this.f16701b = C13145j0.m29739d(y0Var);
        }
    }

    /* renamed from: ae.f$b */
    /* compiled from: Hpack */
    static final class C10875b {

        /* renamed from: a */
        private final C13121c f16708a;

        /* renamed from: b */
        private boolean f16709b;

        /* renamed from: c */
        int f16710c;

        /* renamed from: d */
        private int f16711d;

        /* renamed from: e */
        private boolean f16712e;

        /* renamed from: f */
        private int f16713f;

        /* renamed from: g */
        C10871d[] f16714g;

        /* renamed from: h */
        int f16715h;

        /* renamed from: i */
        private int f16716i;

        /* renamed from: j */
        private int f16717j;

        C10875b(C13121c cVar) {
            this(4096, false, cVar);
        }

        /* renamed from: a */
        private void m23198a() {
            Arrays.fill(this.f16714g, (Object) null);
            this.f16716i = this.f16714g.length - 1;
            this.f16715h = 0;
            this.f16717j = 0;
        }

        /* renamed from: b */
        private int m23199b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f16714g.length;
                while (true) {
                    length--;
                    i2 = this.f16716i;
                    if (length < i2 || i <= 0) {
                        C10871d[] dVarArr = this.f16714g;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f16715h);
                        this.f16716i += i3;
                    } else {
                        int i4 = this.f16714g[length].f16691c;
                        i -= i4;
                        this.f16717j -= i4;
                        this.f16715h--;
                        i3++;
                    }
                }
                C10871d[] dVarArr2 = this.f16714g;
                System.arraycopy(dVarArr2, i2 + 1, dVarArr2, i2 + 1 + i3, this.f16715h);
                this.f16716i += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private void m23200c(C10871d dVar) {
            int i = dVar.f16691c;
            int i2 = this.f16713f;
            if (i > i2) {
                m23198a();
                return;
            }
            m23199b((this.f16717j + i) - i2);
            int i3 = this.f16715h + 1;
            C10871d[] dVarArr = this.f16714g;
            if (i3 > dVarArr.length) {
                C10871d[] dVarArr2 = new C10871d[(dVarArr.length * 2)];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f16716i = this.f16714g.length - 1;
                this.f16714g = dVarArr2;
            }
            int i4 = this.f16716i;
            this.f16716i = i4 - 1;
            this.f16714g[i4] = dVar;
            this.f16715h++;
            this.f16717j += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo45853d(C13133f fVar) {
            if (!this.f16709b || C10881h.m23241f().mo45867e(fVar.mo52594M()) >= fVar.mo52590H()) {
                mo45855f(fVar.mo52590H(), 127, 0);
                this.f16708a.mo52517b0(fVar);
                return;
            }
            C13121c cVar = new C13121c();
            C10881h.m23241f().mo45866d(fVar.mo52594M(), cVar.mo52557w0());
            C13133f M = cVar.mo52498M();
            mo45855f(M.mo52590H(), 127, 128);
            this.f16708a.mo52517b0(M);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo45854e(java.util.List<p306ae.C10871d> r14) {
            /*
                r13 = this;
                boolean r0 = r13.f16712e
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.f16711d
                int r2 = r13.f16713f
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.mo45855f(r0, r4, r3)
            L_0x0012:
                r13.f16712e = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f16711d = r0
                int r0 = r13.f16713f
                r13.mo45855f(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00f5
                java.lang.Object r3 = r14.get(r2)
                ae.d r3 = (p306ae.C10871d) r3
                okio.f r4 = r3.f16689a
                okio.f r4 = r4.mo52593L()
                okio.f r5 = r3.f16690b
                java.util.Map r6 = p306ae.C10873f.f16699c
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                if (r6 == 0) goto L_0x0074
                int r6 = r6.intValue()
                int r6 = r6 + 1
                r8 = 2
                if (r6 < r8) goto L_0x0071
                r8 = 7
                if (r6 > r8) goto L_0x0071
                ae.d[] r8 = p306ae.C10873f.f16698b
                int r9 = r6 + -1
                r8 = r8[r9]
                okio.f r8 = r8.f16690b
                boolean r8 = r8.equals(r5)
                if (r8 == 0) goto L_0x005d
                goto L_0x0075
            L_0x005d:
                ae.d[] r8 = p306ae.C10873f.f16698b
                r8 = r8[r6]
                okio.f r8 = r8.f16690b
                boolean r8 = r8.equals(r5)
                if (r8 == 0) goto L_0x0071
                int r8 = r6 + 1
                r12 = r8
                r8 = r6
                r6 = r12
                goto L_0x0076
            L_0x0071:
                r8 = r6
                r6 = r7
                goto L_0x0076
            L_0x0074:
                r6 = r7
            L_0x0075:
                r8 = r6
            L_0x0076:
                if (r6 != r7) goto L_0x00ae
                int r9 = r13.f16716i
            L_0x007a:
                int r9 = r9 + 1
                ae.d[] r10 = r13.f16714g
                int r11 = r10.length
                if (r9 >= r11) goto L_0x00ae
                r10 = r10[r9]
                okio.f r10 = r10.f16689a
                boolean r10 = r10.equals(r4)
                if (r10 == 0) goto L_0x00ad
                ae.d[] r10 = r13.f16714g
                r10 = r10[r9]
                okio.f r10 = r10.f16690b
                boolean r10 = r10.equals(r5)
                if (r10 == 0) goto L_0x00a1
                int r6 = r13.f16716i
                int r9 = r9 - r6
                ae.d[] r6 = p306ae.C10873f.f16698b
                int r6 = r6.length
                int r6 = r6 + r9
                goto L_0x00ae
            L_0x00a1:
                if (r8 != r7) goto L_0x00ad
                int r8 = r13.f16716i
                int r8 = r9 - r8
                ae.d[] r10 = p306ae.C10873f.f16698b
                int r10 = r10.length
                int r8 = r8 + r10
            L_0x00ad:
                goto L_0x007a
            L_0x00ae:
                if (r6 == r7) goto L_0x00b8
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.mo45855f(r6, r3, r4)
                goto L_0x00f1
            L_0x00b8:
                r6 = 64
                if (r8 != r7) goto L_0x00cb
                okio.c r7 = r13.f16708a
                r7.writeByte(r6)
                r13.mo45853d(r4)
                r13.mo45853d(r5)
                r13.m23200c(r3)
                goto L_0x00f1
            L_0x00cb:
                okio.f r7 = p306ae.C10873f.f16697a
                boolean r7 = r4.mo52591I(r7)
                if (r7 == 0) goto L_0x00e6
                okio.f r7 = p306ae.C10871d.f16686h
                boolean r4 = r7.equals(r4)
                if (r4 != 0) goto L_0x00e6
                r3 = 15
                r13.mo45855f(r8, r3, r1)
                r13.mo45853d(r5)
                goto L_0x00f1
            L_0x00e6:
                r4 = 63
                r13.mo45855f(r8, r4, r6)
                r13.mo45853d(r5)
                r13.m23200c(r3)
            L_0x00f1:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00f5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p306ae.C10873f.C10875b.mo45854e(java.util.List):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo45855f(int i, int i2, int i3) {
            if (i < i2) {
                this.f16708a.writeByte(i | i3);
                return;
            }
            this.f16708a.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f16708a.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f16708a.writeByte(i4);
        }

        C10875b(int i, boolean z, C13121c cVar) {
            this.f16711d = Integer.MAX_VALUE;
            C10871d[] dVarArr = new C10871d[8];
            this.f16714g = dVarArr;
            this.f16716i = dVarArr.length - 1;
            this.f16710c = i;
            this.f16713f = i;
            this.f16709b = z;
            this.f16708a = cVar;
        }
    }

    static {
        C13133f fVar = C10871d.f16683e;
        C13133f fVar2 = C10871d.f16684f;
        C13133f fVar3 = C10871d.f16685g;
        C13133f fVar4 = C10871d.f16682d;
        f16698b = new C10871d[]{new C10871d(C10871d.f16686h, ""), new C10871d(fVar, (String) ShareTarget.METHOD_GET), new C10871d(fVar, (String) ShareTarget.METHOD_POST), new C10871d(fVar2, "/"), new C10871d(fVar2, "/index.html"), new C10871d(fVar3, (String) ProxyConfig.MATCH_HTTP), new C10871d(fVar3, "https"), new C10871d(fVar4, "200"), new C10871d(fVar4, "204"), new C10871d(fVar4, "206"), new C10871d(fVar4, "304"), new C10871d(fVar4, "400"), new C10871d(fVar4, "404"), new C10871d(fVar4, "500"), new C10871d("accept-charset", ""), new C10871d("accept-encoding", "gzip, deflate"), new C10871d("accept-language", ""), new C10871d("accept-ranges", ""), new C10871d("accept", ""), new C10871d("access-control-allow-origin", ""), new C10871d("age", ""), new C10871d("allow", ""), new C10871d("authorization", ""), new C10871d("cache-control", ""), new C10871d("content-disposition", ""), new C10871d("content-encoding", ""), new C10871d("content-language", ""), new C10871d("content-length", ""), new C10871d("content-location", ""), new C10871d("content-range", ""), new C10871d("content-type", ""), new C10871d("cookie", ""), new C10871d("date", ""), new C10871d("etag", ""), new C10871d("expect", ""), new C10871d("expires", ""), new C10871d((String) TypedValues.TransitionType.S_FROM, ""), new C10871d("host", ""), new C10871d("if-match", ""), new C10871d("if-modified-since", ""), new C10871d("if-none-match", ""), new C10871d("if-range", ""), new C10871d("if-unmodified-since", ""), new C10871d("last-modified", ""), new C10871d("link", ""), new C10871d("location", ""), new C10871d("max-forwards", ""), new C10871d("proxy-authenticate", ""), new C10871d("proxy-authorization", ""), new C10871d("range", ""), new C10871d("referer", ""), new C10871d("refresh", ""), new C10871d("retry-after", ""), new C10871d("server", ""), new C10871d("set-cookie", ""), new C10871d("strict-transport-security", ""), new C10871d("transfer-encoding", ""), new C10871d("user-agent", ""), new C10871d("vary", ""), new C10871d("via", ""), new C10871d("www-authenticate", "")};
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C13133f m23178e(C13133f fVar) {
        int H = fVar.mo52590H();
        int i = 0;
        while (i < H) {
            byte g = fVar.mo52603g(i);
            if (g < 65 || g > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.mo52595N());
            }
        }
        return fVar;
    }

    /* renamed from: f */
    private static Map<C13133f, Integer> m23179f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f16698b.length);
        int i = 0;
        while (true) {
            C10871d[] dVarArr = f16698b;
            if (i >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i].f16689a)) {
                linkedHashMap.put(dVarArr[i].f16689a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
