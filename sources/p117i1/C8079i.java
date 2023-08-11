package p117i1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: i1.i */
/* compiled from: MemorySizeCalculator */
public final class C8079i {

    /* renamed from: a */
    private final int f11336a;

    /* renamed from: b */
    private final int f11337b;

    /* renamed from: c */
    private final Context f11338c;

    /* renamed from: d */
    private final int f11339d;

    /* renamed from: i1.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C8080a {

        /* renamed from: i */
        static final int f11340i;

        /* renamed from: a */
        final Context f11341a;

        /* renamed from: b */
        ActivityManager f11342b;

        /* renamed from: c */
        C8082c f11343c;

        /* renamed from: d */
        float f11344d = 2.0f;

        /* renamed from: e */
        float f11345e = ((float) f11340i);

        /* renamed from: f */
        float f11346f = 0.4f;

        /* renamed from: g */
        float f11347g = 0.33f;

        /* renamed from: h */
        int f11348h = 4194304;

        static {
            int i;
            if (Build.VERSION.SDK_INT < 26) {
                i = 4;
            } else {
                i = 1;
            }
            f11340i = i;
        }

        public C8080a(Context context) {
            this.f11341a = context;
            this.f11342b = (ActivityManager) context.getSystemService("activity");
            this.f11343c = new C8081b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C8079i.m15879e(this.f11342b)) {
                this.f11345e = 0.0f;
            }
        }

        /* renamed from: a */
        public C8079i mo41913a() {
            return new C8079i(this);
        }
    }

    /* renamed from: i1.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C8081b implements C8082c {

        /* renamed from: a */
        private final DisplayMetrics f11349a;

        C8081b(DisplayMetrics displayMetrics) {
            this.f11349a = displayMetrics;
        }

        /* renamed from: a */
        public int mo41914a() {
            return this.f11349a.heightPixels;
        }

        /* renamed from: b */
        public int mo41915b() {
            return this.f11349a.widthPixels;
        }
    }

    /* renamed from: i1.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C8082c {
        /* renamed from: a */
        int mo41914a();

        /* renamed from: b */
        int mo41915b();
    }

    C8079i(C8080a aVar) {
        int i;
        boolean z;
        this.f11338c = aVar.f11341a;
        if (m15879e(aVar.f11342b)) {
            i = aVar.f11348h / 2;
        } else {
            i = aVar.f11348h;
        }
        this.f11339d = i;
        int c = m15878c(aVar.f11342b, aVar.f11346f, aVar.f11347g);
        float b = (float) (aVar.f11343c.mo41915b() * aVar.f11343c.mo41914a() * 4);
        int round = Math.round(aVar.f11345e * b);
        int round2 = Math.round(b * aVar.f11344d);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f11337b = round2;
            this.f11336a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f11345e;
            float f3 = aVar.f11344d;
            float f4 = f / (f2 + f3);
            this.f11337b = Math.round(f3 * f4);
            this.f11336a = Math.round(f4 * aVar.f11345e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m15880f(this.f11337b));
            sb.append(", pool size: ");
            sb.append(m15880f(this.f11336a));
            sb.append(", byte array size: ");
            sb.append(m15880f(i));
            sb.append(", memory class limited? ");
            if (i3 > c) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append(", max size: ");
            sb.append(m15880f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f11342b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m15879e(aVar.f11342b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m15878c(ActivityManager activityManager, float f, float f2) {
        boolean e = m15879e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: e */
    static boolean m15879e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    /* renamed from: f */
    private String m15880f(int i) {
        return Formatter.formatFileSize(this.f11338c, (long) i);
    }

    /* renamed from: a */
    public int mo41910a() {
        return this.f11339d;
    }

    /* renamed from: b */
    public int mo41911b() {
        return this.f11336a;
    }

    /* renamed from: d */
    public int mo41912d() {
        return this.f11337b;
    }
}
