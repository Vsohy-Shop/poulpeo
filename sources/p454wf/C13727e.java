package p454wf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;
import p404of.C13088o;
import p412pf.C13212a;
import p436tf.C13528f;
import p448vf.C13650g;

/* renamed from: wf.e */
/* compiled from: Strings.kt */
final class C13727e implements C13650g<C13528f> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f22160a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f22161b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f22162c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C13088o<CharSequence, Integer, C11906l<Integer, Integer>> f22163d;

    /* renamed from: wf.e$a */
    /* compiled from: Strings.kt */
    public static final class C13728a implements Iterator<C13528f>, C13212a {

        /* renamed from: b */
        private int f22164b = -1;

        /* renamed from: c */
        private int f22165c;

        /* renamed from: d */
        private int f22166d;

        /* renamed from: e */
        private C13528f f22167e;

        /* renamed from: f */
        private int f22168f;

        /* renamed from: g */
        final /* synthetic */ C13727e f22169g;

        C13728a(C13727e eVar) {
            this.f22169g = eVar;
            int m = C13537l.m30886m(eVar.f22161b, 0, eVar.f22160a.length());
            this.f22165c = m;
            this.f22166d = m;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p454wf.C13727e.m31427e(r6.f22169g)) goto L_0x0023;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m31429a() {
            /*
                r6 = this;
                int r0 = r6.f22166d
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f22164b = r1
                r0 = 0
                r6.f22167e = r0
                goto L_0x009e
            L_0x000c:
                wf.e r0 = r6.f22169g
                int r0 = r0.f22162c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f22168f
                int r0 = r0 + r3
                r6.f22168f = r0
                wf.e r4 = r6.f22169g
                int r4 = r4.f22162c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f22166d
                wf.e r4 = r6.f22169g
                java.lang.CharSequence r4 = r4.f22160a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                tf.f r0 = new tf.f
                int r1 = r6.f22165c
                wf.e r4 = r6.f22169g
                java.lang.CharSequence r4 = r4.f22160a
                int r4 = p454wf.C13755w.m31565Q(r4)
                r0.<init>(r1, r4)
                r6.f22167e = r0
                r6.f22166d = r2
                goto L_0x009c
            L_0x0047:
                wf.e r0 = r6.f22169g
                of.o r0 = r0.f22163d
                wf.e r4 = r6.f22169g
                java.lang.CharSequence r4 = r4.f22160a
                int r5 = r6.f22166d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                ef.l r0 = (p336ef.C11906l) r0
                if (r0 != 0) goto L_0x0077
                tf.f r0 = new tf.f
                int r1 = r6.f22165c
                wf.e r4 = r6.f22169g
                java.lang.CharSequence r4 = r4.f22160a
                int r4 = p454wf.C13755w.m31565Q(r4)
                r0.<init>(r1, r4)
                r6.f22167e = r0
                r6.f22166d = r2
                goto L_0x009c
            L_0x0077:
                java.lang.Object r2 = r0.mo49109a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo49110b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f22165c
                tf.f r4 = p436tf.C13537l.m30893t(r4, r2)
                r6.f22167e = r4
                int r2 = r2 + r0
                r6.f22165c = r2
                if (r0 != 0) goto L_0x0099
                r1 = r3
            L_0x0099:
                int r2 = r2 + r1
                r6.f22166d = r2
            L_0x009c:
                r6.f22164b = r3
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p454wf.C13727e.C13728a.m31429a():void");
        }

        /* renamed from: c */
        public C13528f next() {
            if (this.f22164b == -1) {
                m31429a();
            }
            if (this.f22164b != 0) {
                C13528f fVar = this.f22167e;
                C12775o.m28637g(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f22167e = null;
                this.f22164b = -1;
                return fVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f22164b == -1) {
                m31429a();
            }
            if (this.f22164b == 1) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13727e(CharSequence charSequence, int i, int i2, C13088o<? super CharSequence, ? super Integer, C11906l<Integer, Integer>> oVar) {
        C12775o.m28639i(charSequence, "input");
        C12775o.m28639i(oVar, "getNextMatch");
        this.f22160a = charSequence;
        this.f22161b = i;
        this.f22162c = i2;
        this.f22163d = oVar;
    }

    public Iterator<C13528f> iterator() {
        return new C13728a(this);
    }
}
