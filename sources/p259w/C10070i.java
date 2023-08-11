package p259w;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p080f.C7533c;
import p125j.C8216a;
import p155m.C8777b;
import p155m.C8779c;
import p205r.C9346l;
import p205r.C9353p;
import p215s.C9406c;
import p215s.C9413h;

@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dimension.kt\ncoil/size/-Dimensions\n+ 4 Contexts.kt\ncoil/util/-Contexts\n+ 5 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,302:1\n1#2:303\n57#3:304\n78#4:305\n78#4:307\n31#5:306\n31#5:308\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-Utils\n*L\n226#1:304\n258#1:305\n270#1:307\n258#1:306\n270#1:308\n*E\n"})
/* renamed from: w.i */
/* compiled from: Utils.kt */
public final class C10070i {

    /* renamed from: a */
    private static final Bitmap.Config[] f15214a;

    /* renamed from: b */
    private static final Bitmap.Config f15215b;

    /* renamed from: c */
    private static final Headers f15216c = new Headers.Builder().build();

    /* renamed from: w.i$a */
    /* compiled from: Utils.kt */
    public /* synthetic */ class C10071a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15217a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15218b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f15219c;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0065 */
        static {
            /*
                i.f[] r0 = p115i.C8042f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                i.f r2 = p115i.C8042f.MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                i.f r3 = p115i.C8042f.MEMORY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                i.f r4 = p115i.C8042f.DISK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                i.f r5 = p115i.C8042f.NETWORK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f15217a = r0
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f15218b = r0
                s.h[] r0 = p215s.C9413h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                s.h r3 = p215s.C9413h.FILL     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                s.h r1 = p215s.C9413h.FIT     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                f15219c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p259w.C10070i.C10071a.<clinit>():void");
        }
    }

    static {
        Bitmap.Config config;
        int i = Build.VERSION.SDK_INT;
        f15214a = i >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f15215b = config;
    }

    /* renamed from: A */
    public static final int m21140A(C9406c cVar, C9413h hVar) {
        if (cVar instanceof C9406c.C9407a) {
            return ((C9406c.C9407a) cVar).f13981a;
        }
        int i = C10071a.f15219c[hVar.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: a */
    public static final void m21141a(C8216a.C8218b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static final Headers.Builder m21142b(Headers.Builder builder, String str) {
        boolean z;
        int V = C13755w.m31570V(str, ':', 0, false, 6, (Object) null);
        if (V != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            String substring = str.substring(0, V);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = C13755w.m31561N0(substring).toString();
            String substring2 = str.substring(V + 1);
            C12775o.m28638h(substring2, "this as java.lang.String).substring(startIndex)");
            builder.addUnsafeNonAscii(obj, substring2);
            return builder;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    /* renamed from: c */
    public static final int m21143c(Context context, double d) {
        int i;
        boolean z;
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            C12775o.m28636f(systemService);
            ActivityManager activityManager = (ActivityManager) systemService;
            if ((context.getApplicationInfo().flags & 1048576) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = activityManager.getLargeMemoryClass();
            } else {
                i = activityManager.getMemoryClass();
            }
        } catch (Exception unused) {
            i = 256;
        }
        double d2 = (double) 1024;
        return (int) (d * ((double) i) * d2 * d2);
    }

    /* renamed from: d */
    public static final void m21144d(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public static final double m21145e(Context context) {
        try {
            Object systemService = ContextCompat.getSystemService(context, ActivityManager.class);
            C12775o.m28636f(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                return 0.15d;
            }
            return 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    /* renamed from: f */
    public static final Bitmap.Config m21146f() {
        return f15215b;
    }

    /* renamed from: g */
    public static final C7533c m21147g(C8777b.C8778a aVar) {
        if (aVar instanceof C8779c) {
            return ((C8779c) aVar).mo42934e();
        }
        return C7533c.f10443b;
    }

    /* renamed from: h */
    public static final String m21148h(Uri uri) {
        return (String) C12686e0.m28223b0(uri.getPathSegments());
    }

    /* renamed from: i */
    public static final int m21149i(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return drawable.getIntrinsicHeight();
        }
        return bitmap.getHeight();
    }

    /* renamed from: j */
    public static final String m21150j(MimeTypeMap mimeTypeMap, String str) {
        boolean z;
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(C13755w.m31545F0(C13755w.m31547G0(C13755w.m31559M0(C13755w.m31559M0(str, '#', (String) null, 2, (Object) null), '?', (String) null, 2, (Object) null), '/', (String) null, 2, (Object) null), '.', ""));
    }

    /* renamed from: k */
    public static final int m21151k(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: r.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p205r.C9356r m21152l(android.view.View r4) {
        /*
            int r0 = p092g.C7618a.coil_request_manager
            java.lang.Object r1 = r4.getTag(r0)
            boolean r2 = r1 instanceof p205r.C9356r
            r3 = 0
            if (r2 == 0) goto L_0x000e
            r.r r1 = (p205r.C9356r) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 != 0) goto L_0x0031
            monitor-enter(r4)
            java.lang.Object r1 = r4.getTag(r0)     // Catch:{ all -> 0x002e }
            boolean r2 = r1 instanceof p205r.C9356r     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x001d
            r3 = r1
            r.r r3 = (p205r.C9356r) r3     // Catch:{ all -> 0x002e }
        L_0x001d:
            if (r3 == 0) goto L_0x0021
            r1 = r3
            goto L_0x002c
        L_0x0021:
            r.r r1 = new r.r     // Catch:{ all -> 0x002e }
            r1.<init>(r4)     // Catch:{ all -> 0x002e }
            r4.addOnAttachStateChangeListener(r1)     // Catch:{ all -> 0x002e }
            r4.setTag(r0, r1)     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r4)
            goto L_0x0031
        L_0x002e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p259w.C10070i.m21152l(android.view.View):r.r");
    }

    /* renamed from: m */
    public static final File m21153m(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    /* renamed from: n */
    public static final C9413h m21154n(ImageView imageView) {
        int i;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i = -1;
        } else {
            i = C10071a.f15218b[scaleType.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return C9413h.FIT;
        }
        return C9413h.FILL;
    }

    /* renamed from: o */
    public static final Bitmap.Config[] m21155o() {
        return f15214a;
    }

    /* renamed from: p */
    public static final int m21156p(Drawable drawable) {
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            bitmapDrawable = null;
        }
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return drawable.getIntrinsicWidth();
        }
        return bitmap.getWidth();
    }

    /* renamed from: q */
    public static final boolean m21157q(Uri uri) {
        if (!C12775o.m28634d(uri.getScheme(), "file") || !C12775o.m28634d(m21148h(uri), "android_asset")) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static final boolean m21158r() {
        return C12775o.m28634d(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: s */
    public static final boolean m21159s(int i) {
        if (i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static final boolean m21160t(C8777b.C8778a aVar) {
        if (!(aVar instanceof C8779c) || !((C8779c) aVar).mo42935f()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static final boolean m21161u(Drawable drawable) {
        if ((drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static final Headers m21162v(Headers headers) {
        if (headers == null) {
            return f15216c;
        }
        return headers;
    }

    /* renamed from: w */
    public static final C9346l m21163w(C9346l lVar) {
        if (lVar == null) {
            return C9346l.f13891d;
        }
        return lVar;
    }

    /* renamed from: x */
    public static final C9353p m21164x(C9353p pVar) {
        if (pVar == null) {
            return C9353p.f13907c;
        }
        return pVar;
    }

    /* renamed from: y */
    public static final ResponseBody m21165y(Response response) {
        ResponseBody body = response.body();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null".toString());
    }

    /* renamed from: z */
    public static final int m21166z(String str, int i) {
        Long l = C13753u.m31519l(str);
        if (l == null) {
            return i;
        }
        long longValue = l.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }
}
