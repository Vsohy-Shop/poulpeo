package p294z1;

import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import p137k1.C8472l;

/* renamed from: z1.k */
/* compiled from: Util */
public final class C10792k {

    /* renamed from: a */
    private static final char[] f16510a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f16511b = new char[64];

    /* renamed from: z1.k$a */
    /* compiled from: Util */
    static /* synthetic */ class C10793a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16512a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16512a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16512a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16512a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16512a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f16512a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p294z1.C10792k.C10793a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m22950a() {
        if (!m22965p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m22951b(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof C8472l) {
            return ((C8472l) obj).mo42504a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: c */
    public static boolean m22952c(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: d */
    private static String m22953d(@NonNull byte[] bArr, @NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f16510a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @NonNull
    /* renamed from: e */
    public static <T> Queue<T> m22954e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m22955f(int i, int i2, @Nullable Bitmap.Config config) {
        return i * i2 * m22957h(config);
    }

    /* renamed from: g */
    public static int m22956g(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: h */
    private static int m22957h(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C10793a.f16512a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    @NonNull
    /* renamed from: i */
    public static <T> List<T> m22958i(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m22959j(float f) {
        return m22960k(f, 17);
    }

    /* renamed from: k */
    public static int m22960k(float f, int i) {
        return m22961l(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m22961l(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: m */
    public static int m22962m(@Nullable Object obj, int i) {
        int i2;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        return m22961l(i2, i);
    }

    /* renamed from: n */
    public static int m22963n(boolean z, int i) {
        return m22961l(z ? 1 : 0, i);
    }

    /* renamed from: o */
    public static boolean m22964o() {
        return !m22965p();
    }

    /* renamed from: p */
    public static boolean m22965p() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private static boolean m22966q(int i) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m22967r(int i, int i2) {
        if (!m22966q(i) || !m22966q(i2)) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: s */
    public static String m22968s(@NonNull byte[] bArr) {
        String d;
        char[] cArr = f16511b;
        synchronized (cArr) {
            d = m22953d(bArr, cArr);
        }
        return d;
    }
}
