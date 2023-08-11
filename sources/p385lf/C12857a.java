package p385lf;

import p377kf.C12658a;
import p424rf.C13364c;
import p430sf.C13446a;

/* renamed from: lf.a */
/* compiled from: JDK8PlatformImplementations.kt */
public class C12857a extends C12658a {

    /* renamed from: lf.a$a */
    /* compiled from: JDK8PlatformImplementations.kt */
    private static final class C12858a {

        /* renamed from: a */
        public static final C12858a f20564a = new C12858a();

        /* renamed from: b */
        public static final Integer f20565b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                lf.a$a r0 = new lf.a$a
                r0.<init>()
                f20564a = r0
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
                f20565b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p385lf.C12857a.C12858a.<clinit>():void");
        }

        private C12858a() {
        }
    }

    /* renamed from: c */
    private final boolean m28882c(int i) {
        Integer num = C12858a.f20565b;
        if (num == null || num.intValue() >= i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C13364c mo50363b() {
        if (m28882c(34)) {
            return new C13446a();
        }
        return super.mo50363b();
    }
}
