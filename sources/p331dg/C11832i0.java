package p331dg;

/* renamed from: dg.i0 */
/* compiled from: SystemProps.kt */
final /* synthetic */ class C11832i0 {

    /* renamed from: a */
    private static final int f18481a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m25479a() {
        return f18481a;
    }

    /* renamed from: b */
    public static final String m25480b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
