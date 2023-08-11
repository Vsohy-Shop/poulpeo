package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12745k;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p448vf.C13652i;

/* renamed from: kotlin.collections.a1 */
/* compiled from: SlidingWindow.kt */
public final class C12665a1 {

    @C12739f(mo50609c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", mo50610f = "SlidingWindow.kt", mo50611l = {34, 40, 49, 55, 58}, mo50612m = "invokeSuspend")
    /* renamed from: kotlin.collections.a1$a */
    /* compiled from: SlidingWindow.kt */
    static final class C12666a extends C12745k implements C13088o<C13652i<? super List<? extends T>>, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        Object f20335h;

        /* renamed from: i */
        Object f20336i;

        /* renamed from: j */
        int f20337j;

        /* renamed from: k */
        int f20338k;

        /* renamed from: l */
        private /* synthetic */ Object f20339l;

        /* renamed from: m */
        final /* synthetic */ int f20340m;

        /* renamed from: n */
        final /* synthetic */ int f20341n;

        /* renamed from: o */
        final /* synthetic */ Iterator<T> f20342o;

        /* renamed from: p */
        final /* synthetic */ boolean f20343p;

        /* renamed from: q */
        final /* synthetic */ boolean f20344q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12666a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, C12074d<? super C12666a> dVar) {
            super(2, dVar);
            this.f20340m = i;
            this.f20341n = i2;
            this.f20342o = it;
            this.f20343p = z;
            this.f20344q = z2;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C12666a aVar = new C12666a(this.f20340m, this.f20341n, this.f20342o, this.f20343p, this.f20344q, dVar);
            aVar.f20339l = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x012a  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0126 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p362if.C12150d.m26492c()
                int r1 = r11.f20338k
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x005a
                if (r1 == r6) goto L_0x0046
                if (r1 == r5) goto L_0x0041
                if (r1 == r4) goto L_0x002f
                if (r1 == r3) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                goto L_0x0041
            L_0x0019:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0021:
                java.lang.Object r1 = r11.f20335h
                kotlin.collections.v0 r1 = (kotlin.collections.C12724v0) r1
                java.lang.Object r4 = r11.f20339l
                vf.i r4 = (p448vf.C13652i) r4
                p336ef.C11910n.m25701b(r12)
                r12 = r11
                goto L_0x014e
            L_0x002f:
                java.lang.Object r1 = r11.f20336i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r5 = r11.f20335h
                kotlin.collections.v0 r5 = (kotlin.collections.C12724v0) r5
                java.lang.Object r8 = r11.f20339l
                vf.i r8 = (p448vf.C13652i) r8
                p336ef.C11910n.m25701b(r12)
                r12 = r11
                goto L_0x0120
            L_0x0041:
                p336ef.C11910n.m25701b(r12)
                goto L_0x016a
            L_0x0046:
                int r1 = r11.f20337j
                java.lang.Object r2 = r11.f20336i
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r11.f20335h
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r4 = r11.f20339l
                vf.i r4 = (p448vf.C13652i) r4
                p336ef.C11910n.m25701b(r12)
                r8 = r11
            L_0x0058:
                r12 = r1
                goto L_0x00a9
            L_0x005a:
                p336ef.C11910n.m25701b(r12)
                java.lang.Object r12 = r11.f20339l
                vf.i r12 = (p448vf.C13652i) r12
                int r1 = r11.f20340m
                r8 = 1024(0x400, float:1.435E-42)
                int r1 = p436tf.C13537l.m30882i(r1, r8)
                int r8 = r11.f20341n
                int r9 = r11.f20340m
                int r8 = r8 - r9
                if (r8 < 0) goto L_0x00dd
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r1)
                java.util.Iterator<T> r1 = r11.f20342o
                r3 = 0
                r4 = r12
                r12 = r3
                r3 = r2
                r2 = r1
                r1 = r8
                r8 = r11
            L_0x007e:
                boolean r9 = r2.hasNext()
                if (r9 == 0) goto L_0x00bb
                java.lang.Object r9 = r2.next()
                if (r12 <= 0) goto L_0x008d
                int r12 = r12 + -1
                goto L_0x007e
            L_0x008d:
                r3.add(r9)
                int r9 = r3.size()
                int r10 = r8.f20340m
                if (r9 != r10) goto L_0x007e
                r8.f20339l = r4
                r8.f20335h = r3
                r8.f20336i = r2
                r8.f20337j = r1
                r8.f20338k = r6
                java.lang.Object r12 = r4.mo53327e(r3, r8)
                if (r12 != r0) goto L_0x0058
                return r0
            L_0x00a9:
                boolean r1 = r8.f20343p
                if (r1 == 0) goto L_0x00b1
                r3.clear()
                goto L_0x00b9
            L_0x00b1:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r3 = r8.f20340m
                r1.<init>(r3)
                r3 = r1
            L_0x00b9:
                r1 = r12
                goto L_0x007e
            L_0x00bb:
                boolean r12 = r3.isEmpty()
                r12 = r12 ^ r6
                if (r12 == 0) goto L_0x016a
                boolean r12 = r8.f20344q
                if (r12 != 0) goto L_0x00ce
                int r12 = r3.size()
                int r1 = r8.f20340m
                if (r12 != r1) goto L_0x016a
            L_0x00ce:
                r8.f20339l = r7
                r8.f20335h = r7
                r8.f20336i = r7
                r8.f20338k = r5
                java.lang.Object r12 = r4.mo53327e(r3, r8)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x00dd:
                kotlin.collections.v0 r5 = new kotlin.collections.v0
                r5.<init>(r1)
                java.util.Iterator<T> r1 = r11.f20342o
                r8 = r12
                r12 = r11
            L_0x00e6:
                boolean r9 = r1.hasNext()
                if (r9 == 0) goto L_0x0126
                java.lang.Object r9 = r1.next()
                r5.mo50601q(r9)
                boolean r9 = r5.mo50603s()
                if (r9 == 0) goto L_0x00e6
                int r9 = r5.size()
                int r10 = r12.f20340m
                if (r9 >= r10) goto L_0x0106
                kotlin.collections.v0 r5 = r5.mo50602r(r10)
                goto L_0x00e6
            L_0x0106:
                boolean r9 = r12.f20343p
                if (r9 == 0) goto L_0x010c
                r9 = r5
                goto L_0x0111
            L_0x010c:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r5)
            L_0x0111:
                r12.f20339l = r8
                r12.f20335h = r5
                r12.f20336i = r1
                r12.f20338k = r4
                java.lang.Object r9 = r8.mo53327e(r9, r12)
                if (r9 != r0) goto L_0x0120
                return r0
            L_0x0120:
                int r9 = r12.f20341n
                r5.mo50604t(r9)
                goto L_0x00e6
            L_0x0126:
                boolean r1 = r12.f20344q
                if (r1 == 0) goto L_0x016a
                r1 = r5
                r4 = r8
            L_0x012c:
                int r5 = r1.size()
                int r8 = r12.f20341n
                if (r5 <= r8) goto L_0x0154
                boolean r5 = r12.f20343p
                if (r5 == 0) goto L_0x013a
                r5 = r1
                goto L_0x013f
            L_0x013a:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L_0x013f:
                r12.f20339l = r4
                r12.f20335h = r1
                r12.f20336i = r7
                r12.f20338k = r3
                java.lang.Object r5 = r4.mo53327e(r5, r12)
                if (r5 != r0) goto L_0x014e
                return r0
            L_0x014e:
                int r5 = r12.f20341n
                r1.mo50604t(r5)
                goto L_0x012c
            L_0x0154:
                boolean r3 = r1.isEmpty()
                r3 = r3 ^ r6
                if (r3 == 0) goto L_0x016a
                r12.f20339l = r7
                r12.f20335h = r7
                r12.f20336i = r7
                r12.f20338k = r2
                java.lang.Object r12 = r4.mo53327e(r1, r12)
                if (r12 != r0) goto L_0x016a
                return r0
            L_0x016a:
                ef.v r12 = p336ef.C11921v.f18618a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C12665a1.C12666a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invoke(C13652i<? super List<? extends T>> iVar, C12074d<? super C11921v> dVar) {
            return ((C12666a) create(iVar, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: a */
    public static final void m28172a(int i, int i2) {
        boolean z;
        String str;
        if (i <= 0 || i2 <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    /* renamed from: b */
    public static final <T> Iterator<List<T>> m28173b(Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        C12775o.m28639i(it, "iterator");
        if (!it.hasNext()) {
            return C12689f0.f20365b;
        }
        return C13654k.m31267a(new C12666a(i, i2, it, z2, z, (C12074d<? super C12666a>) null));
    }
}
