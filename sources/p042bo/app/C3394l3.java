package p042bo.app;

/* renamed from: bo.app.l3 */
public final class C3394l3 {

    /* renamed from: a */
    public static final C3394l3 f2104a = new C3394l3();

    private C3394l3() {
    }

    /* renamed from: a */
    public static final double m3360a(double d, double d2, double d3, double d4) {
        double radians = Math.toRadians(d3 - d);
        double radians2 = Math.toRadians(d4 - d2);
        double d5 = (double) 2;
        return 6371000.0d * d5 * Math.asin(Math.sqrt(Math.pow(Math.sin(radians / d5), 2.0d) + (Math.pow(Math.sin(radians2 / d5), 2.0d) * Math.cos(Math.toRadians(d)) * Math.cos(Math.toRadians(d3)))));
    }
}
