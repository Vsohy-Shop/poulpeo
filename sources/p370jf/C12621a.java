package p370jf;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C12775o;
import p424rf.C13362b;
import p424rf.C13364c;

/* renamed from: jf.a */
/* compiled from: PlatformImplementations.kt */
public class C12621a {

    /* renamed from: jf.a$a */
    /* compiled from: PlatformImplementations.kt */
    private static final class C12622a {

        /* renamed from: a */
        public static final C12622a f20269a = new C12622a();

        /* renamed from: b */
        public static final Method f20270b;

        /* renamed from: c */
        public static final Method f20271c;

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:1:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[EDGE_INSN: B:21:0x0043->B:12:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            /*
                jf.a$a r0 = new jf.a$a
                r0.<init>()
                f20269a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.jvm.internal.C12775o.m28638h(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L_0x0015:
                r5 = 0
                if (r4 >= r2) goto L_0x0042
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r8)
                if (r7 == 0) goto L_0x003b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                kotlin.jvm.internal.C12775o.m28638h(r7, r8)
                java.lang.Object r7 = kotlin.collections.C12710p.m28398Z(r7)
                boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r0)
                if (r7 == 0) goto L_0x003b
                r7 = 1
                goto L_0x003c
            L_0x003b:
                r7 = r3
            L_0x003c:
                if (r7 == 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0042:
                r6 = r5
            L_0x0043:
                f20270b = r6
                int r0 = r1.length
            L_0x0046:
                if (r3 >= r0) goto L_0x005b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r4, r6)
                if (r4 == 0) goto L_0x0058
                r5 = r2
                goto L_0x005b
            L_0x0058:
                int r3 = r3 + 1
                goto L_0x0046
            L_0x005b:
                f20271c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p370jf.C12621a.C12622a.<clinit>():void");
        }

        private C12622a() {
        }
    }

    /* renamed from: a */
    public void mo50362a(Throwable th, Throwable th2) {
        C12775o.m28639i(th, "cause");
        C12775o.m28639i(th2, "exception");
        Method method = C12622a.f20270b;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: b */
    public C13364c mo50363b() {
        return new C13362b();
    }
}
