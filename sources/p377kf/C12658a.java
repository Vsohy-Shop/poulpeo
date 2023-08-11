package p377kf;

import kotlin.jvm.internal.C12775o;
import p370jf.C12621a;

/* renamed from: kf.a */
/* compiled from: JDK7PlatformImplementations.kt */
public class C12658a extends C12621a {

    /* renamed from: kf.a$a */
    /* compiled from: JDK7PlatformImplementations.kt */
    private static final class C12659a {

        /* renamed from: a */
        public static final C12659a f20331a = new C12659a();

        /* renamed from: b */
        public static final Integer f20332b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                kf.a$a r0 = new kf.a$a
                r0.<init>()
                f20331a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f20332b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p377kf.C12658a.C12659a.<clinit>():void");
        }

        private C12659a() {
        }
    }

    /* renamed from: c */
    private final boolean m28160c(int i) {
        Integer num = C12659a.f20332b;
        if (num == null || num.intValue() >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo50362a(Throwable th, Throwable th2) {
        C12775o.m28639i(th, "cause");
        C12775o.m28639i(th2, "exception");
        if (m28160c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo50362a(th, th2);
        }
    }
}
