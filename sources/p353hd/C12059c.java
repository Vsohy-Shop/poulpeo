package p353hd;

import androidx.annotation.NonNull;

/* renamed from: hd.c */
/* compiled from: EasingProvider */
class C12059c {

    /* renamed from: hd.c$a */
    /* compiled from: EasingProvider */
    static /* synthetic */ class C12060a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18895a;

        /* JADX WARNING: Can't wrap try/catch for region: R(64:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|64) */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                hd.a[] r0 = p353hd.C12057a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18895a = r0
                hd.a r1 = p353hd.C12057a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x001d }
                hd.a r1 = p353hd.C12057a.QUAD_IN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0028 }
                hd.a r1 = p353hd.C12057a.QUAD_OUT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0033 }
                hd.a r1 = p353hd.C12057a.QUAD_IN_OUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x003e }
                hd.a r1 = p353hd.C12057a.CUBIC_IN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0049 }
                hd.a r1 = p353hd.C12057a.CUBIC_OUT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0054 }
                hd.a r1 = p353hd.C12057a.CUBIC_IN_OUT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0060 }
                hd.a r1 = p353hd.C12057a.QUART_IN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x006c }
                hd.a r1 = p353hd.C12057a.QUART_OUT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0078 }
                hd.a r1 = p353hd.C12057a.QUART_IN_OUT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0084 }
                hd.a r1 = p353hd.C12057a.QUINT_IN     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0090 }
                hd.a r1 = p353hd.C12057a.QUINT_OUT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x009c }
                hd.a r1 = p353hd.C12057a.QUINT_IN_OUT     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                hd.a r1 = p353hd.C12057a.SINE_IN     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                hd.a r1 = p353hd.C12057a.SINE_OUT     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                hd.a r1 = p353hd.C12057a.SINE_IN_OUT     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00cc }
                hd.a r1 = p353hd.C12057a.BACK_IN     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                hd.a r1 = p353hd.C12057a.BACK_OUT     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                hd.a r1 = p353hd.C12057a.BACK_IN_OUT     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                hd.a r1 = p353hd.C12057a.CIRC_IN     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x00fc }
                hd.a r1 = p353hd.C12057a.CIRC_OUT     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0108 }
                hd.a r1 = p353hd.C12057a.CIRC_IN_OUT     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0114 }
                hd.a r1 = p353hd.C12057a.BOUNCE_IN     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0120 }
                hd.a r1 = p353hd.C12057a.BOUNCE_OUT     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x012c }
                hd.a r1 = p353hd.C12057a.BOUNCE_IN_OUT     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0138 }
                hd.a r1 = p353hd.C12057a.ELASTIC_IN     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0144 }
                hd.a r1 = p353hd.C12057a.ELASTIC_OUT     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0150 }
                hd.a r1 = p353hd.C12057a.ELASTIC_IN_OUT     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x015c }
                hd.a r1 = p353hd.C12057a.EASE_IN_EXPO     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0168 }
                hd.a r1 = p353hd.C12057a.EASE_OUT_EXPO     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = f18895a     // Catch:{ NoSuchFieldError -> 0x0174 }
                hd.a r1 = p353hd.C12057a.EASE_IN_OUT_EXPO     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p353hd.C12059c.C12060a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static float m26234a(@NonNull C12057a aVar, float f) {
        float f2 = f;
        switch (C12060a.f18895a[aVar.ordinal()]) {
            case 2:
                return m26241h(f2, 2.0d);
            case 3:
                return m26243j(f2, 2.0d);
            case 4:
                return m26242i(f2, 2.0d);
            case 5:
                return m26241h(f2, 3.0d);
            case 6:
                return m26243j(f2, 3.0d);
            case 7:
                return m26242i(f2, 3.0d);
            case 8:
                return m26241h(f2, 4.0d);
            case 9:
                return m26243j(f2, 4.0d);
            case 10:
                return m26242i(f2, 4.0d);
            case 11:
                return m26241h(f2, 5.0d);
            case 12:
                return m26243j(f2, 5.0d);
            case 13:
                return m26242i(f2, 5.0d);
            case 14:
                return (float) (1.0d - Math.cos((((double) f2) * 3.141592653589793d) / 2.0d));
            case 15:
                return (float) Math.sin((((double) f2) * 3.141592653589793d) / 2.0d);
            case 16:
                return (float) ((Math.cos(((double) f2) * 3.141592653589793d) - 1.0d) * -0.5d);
            case 17:
                return (float) (((double) (f2 * f2)) * ((((double) f2) * 2.7d) - 1.7d));
            case 18:
                float f3 = f2 - 1.0f;
                return (float) ((((double) (f3 * f3)) * ((((double) f3) * 2.7d) + 1.7d)) + 1.0d);
            case 19:
                return m26235b(f2, 1.7f);
            case 20:
                return (float) (-(Math.sqrt((double) (1.0f - (f2 * f2))) - 1.0d));
            case 21:
                float f4 = f2 - 1.0f;
                return (float) Math.sqrt((double) (1.0f - (f4 * f4)));
            case 22:
                float f5 = f2 * 2.0f;
                if (f5 < 1.0f) {
                    return (float) ((Math.sqrt((double) (1.0f - (f5 * f5))) - 1.0d) * -0.5d);
                }
                float f6 = f5 - 2.0f;
                return (float) ((Math.sqrt((double) (1.0f - (f6 * f6))) + 1.0d) * 0.5d);
            case 23:
                return m26236c(f);
            case 24:
                return m26237d(f);
            case 25:
                if (f2 < 0.5f) {
                    return m26236c(f2 * 2.0f) * 0.5f;
                }
                return (m26237d((f2 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
            case 26:
                return m26238e(f2, 1.0d, 0.3d);
            case 27:
                return m26240g(f2, 1.0d, 0.3d);
            case 28:
                return m26239f(f2, 1.0d, 0.45d);
            case 29:
                return (float) Math.pow(2.0d, (double) ((f2 - 1.0f) * 10.0f));
            case 30:
                return ((float) (-Math.pow(2.0d, (double) (f2 * -10.0f)))) + 1.0f;
            case 31:
                float f7 = f2 * 2.0f;
                if (f7 < 1.0f) {
                    return ((float) Math.pow(2.0d, (double) ((f7 - 1.0f) * 10.0f))) * 0.5f;
                }
                return ((float) ((-Math.pow(2.0d, (double) ((f7 - 1.0f) * -10.0f))) + 2.0d)) * 0.5f;
            default:
                return f2;
        }
    }

    /* renamed from: b */
    private static float m26235b(float f, float f2) {
        double d;
        float f3 = (float) (((double) f2) * 1.525d);
        float f4 = f * 2.0f;
        if (f4 < 1.0f) {
            d = (double) (f4 * f4 * (((1.0f + f3) * f4) - f3));
        } else {
            float f5 = f4 - 2.0f;
            d = (double) ((f5 * f5 * (((1.0f + f3) * f5) + f3)) + 2.0f);
        }
        return (float) (d * 0.5d);
    }

    /* renamed from: c */
    private static float m26236c(float f) {
        return 1.0f - m26237d(1.0f - f);
    }

    /* renamed from: d */
    private static float m26237d(float f) {
        double d;
        double d2;
        double d3;
        double d4 = (double) f;
        if (d4 < 0.36363636363636365d) {
            d3 = 7.5625d * d4 * d4;
        } else {
            if (d4 < 0.7272727272727273d) {
                double d5 = (double) ((float) (d4 - 0.5454545454545454d));
                d = 7.5625d * d5 * d5;
                d2 = 0.75d;
            } else if (d4 < 0.9090909090909091d) {
                double d6 = (double) ((float) (d4 - 0.8181818181818182d));
                d = 7.5625d * d6 * d6;
                d2 = 0.9375d;
            } else {
                double d7 = (double) ((float) (d4 - 0.9545454545454546d));
                d = 7.5625d * d7 * d7;
                d2 = 0.984375d;
            }
            d3 = d + d2;
        }
        return (float) d3;
    }

    /* renamed from: e */
    private static float m26238e(float f, double d, double d2) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float f2 = f - 1.0f;
        return (float) (-(d * Math.pow(2.0d, (double) (10.0f * f2)) * Math.sin(((((double) f2) - ((d2 / 6.283185307179586d) * Math.asin(1.0d / d))) * 6.283185307179586d) / d2)));
    }

    /* renamed from: f */
    private static float m26239f(float f, double d, double d2) {
        double pow;
        double asin = (d2 / 6.283185307179586d) * Math.asin(1.0d / d);
        float f2 = f * 2.0f;
        if (f2 < 1.0f) {
            float f3 = f2 - 1.0f;
            pow = d * Math.pow(2.0d, (double) (10.0f * f3)) * Math.sin(((((double) f3) - asin) * 6.283185307179586d) / d2) * -0.5d;
        } else {
            float f4 = f2 - 1.0f;
            pow = (d * Math.pow(2.0d, (double) (-10.0f * f4)) * Math.sin(((((double) f4) - asin) * 6.283185307179586d) / d2) * 0.5d) + 1.0d;
        }
        return (float) pow;
    }

    /* renamed from: g */
    private static float m26240g(float f, double d, double d2) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        return (float) ((d * Math.pow(2.0d, (double) (-10.0f * f)) * Math.sin(((((double) f) - ((d2 / 6.283185307179586d) * Math.asin(1.0d / d))) * 6.283185307179586d) / d2)) + 1.0d);
    }

    /* renamed from: h */
    private static float m26241h(float f, double d) {
        return (float) Math.pow((double) f, d);
    }

    /* renamed from: i */
    private static float m26242i(float f, double d) {
        float f2 = f * 2.0f;
        if (f2 < 1.0f) {
            return (float) (Math.pow((double) f2, d) * 0.5d);
        }
        return (float) (1.0d - (Math.abs(Math.pow((double) (2.0f - f2), d)) * 0.5d));
    }

    /* renamed from: j */
    private static float m26243j(float f, double d) {
        return (float) (1.0d - Math.pow((double) (1.0f - f), d));
    }
}
