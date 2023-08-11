package p126j0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.ImageView;
import com.appboy.Constants;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p292z.C10734d;
import p336ef.C11906l;
import p404of.C13074a;

/* renamed from: j0.b */
public final class C8242b {

    /* renamed from: a */
    private static final String f11607a = C8266c.f11641a.mo42215o("BrazeImageUtils");

    /* renamed from: j0.b$a */
    static final class C8243a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8243a f11608g = new C8243a();

        C8243a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    /* renamed from: j0.b$b */
    static final class C8244b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ BitmapFactory.Options f11609g;

        /* renamed from: h */
        final /* synthetic */ int f11610h;

        /* renamed from: i */
        final /* synthetic */ int f11611i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8244b(BitmapFactory.Options options, int i, int i2) {
            super(0);
            this.f11609g = options;
            this.f11610h = i;
            this.f11611i = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Calculating sample size for source image bounds: (width " + this.f11609g.outWidth + " height " + this.f11609g.outHeight + ") and destination image bounds: (width " + this.f11610h + " height " + this.f11611i + ')';
        }
    }

    /* renamed from: j0.b$c */
    static final class C8245c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C12760f0 f11612g;

        /* renamed from: h */
        final /* synthetic */ int f11613h;

        /* renamed from: i */
        final /* synthetic */ int f11614i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8245c(C12760f0 f0Var, int i, int i2) {
            super(0);
            this.f11612g = f0Var;
            this.f11613h = i;
            this.f11614i = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Using image sample size of " + this.f11612g.f20416b + ". Image will be scaled to width: " + (this.f11613h / this.f11612g.f20416b) + " and height: " + (this.f11614i / this.f11612g.f20416b);
        }
    }

    /* renamed from: j0.b$d */
    static final class C8246d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f11615g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8246d(Uri uri) {
            super(0);
            this.f11615g = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Uri with unknown scheme received. Not getting image. Uri: ", this.f11615g);
        }
    }

    /* renamed from: j0.b$e */
    static final class C8247e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f11616g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8247e(Uri uri) {
            super(0);
            this.f11616g = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Local bitmap path is null. URI: ", this.f11616g);
        }
    }

    /* renamed from: j0.b$f */
    static final class C8248f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f11617g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8248f(Uri uri) {
            super(0);
            this.f11617g = uri;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Local bitmap file does not exist. URI: ", this.f11617g);
        }
    }

    /* renamed from: j0.b$g */
    static final class C8249g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ File f11618g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8249g(File file) {
            super(0);
            this.f11618g = file;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Retrieving image from local path: ", this.f11618g.getAbsolutePath());
        }
    }

    /* renamed from: j0.b$h */
    static final class C8250h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8250h f11619g = new C8250h();

        C8250h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    /* renamed from: j0.b$i */
    static final class C8251i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11620g;

        /* renamed from: h */
        final /* synthetic */ int f11621h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8251i(int i, int i2) {
            super(0);
            this.f11620g = i;
            this.f11621h = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (height " + this.f11620g + " width " + this.f11621h + ')';
        }
    }

    /* renamed from: j0.b$j */
    static final class C8252j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f11622g;

        /* renamed from: h */
        final /* synthetic */ BitmapFactory.Options f11623h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8252j(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.f11622g = uri;
            this.f11623h = options;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The bitmap metadata with image uri " + this.f11622g + " had bounds: (height " + this.f11623h.outHeight + " width " + this.f11623h.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    /* renamed from: j0.b$k */
    static final class C8253k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8253k f11624g = new C8253k();

        C8253k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    /* renamed from: j0.b$l */
    static final class C8254l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Exception f11625g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8254l(Exception exc) {
            super(0);
            this.f11625g = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Exception occurred when attempting to retrieve local bitmap. ", this.f11625g.getMessage());
        }
    }

    /* renamed from: j0.b$m */
    static final class C8255m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8255m f11626g = new C8255m();

        C8255m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    /* renamed from: j0.b$n */
    static final class C8256n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11627g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8256n(String str) {
            super(0);
            this.f11627g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("SDK is in offline mode, not downloading remote bitmap with uri: ", this.f11627g);
        }
    }

    /* renamed from: j0.b$o */
    static final class C8257o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11628g;

        /* renamed from: h */
        final /* synthetic */ URL f11629h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8257o(int i, URL url) {
            super(0);
            this.f11628g = i;
            this.f11629h = url;
        }

        /* renamed from: a */
        public final String invoke() {
            return "HTTP response code was " + this.f11628g + ". Bitmap with url " + this.f11629h + " could not be downloaded.";
        }
    }

    /* renamed from: j0.b$p */
    static final class C8258p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11630g;

        /* renamed from: h */
        final /* synthetic */ int f11631h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8258p(int i, int i2) {
            super(0);
            this.f11630g = i;
            this.f11631h = i2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (height " + this.f11630g + " width " + this.f11631h + ')';
        }
    }

    /* renamed from: j0.b$q */
    static final class C8259q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ URL f11632g;

        /* renamed from: h */
        final /* synthetic */ BitmapFactory.Options f11633h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8259q(URL url, BitmapFactory.Options options) {
            super(0);
            this.f11632g = url;
            this.f11633h = options;
        }

        /* renamed from: a */
        public final String invoke() {
            return "The bitmap metadata with image url " + this.f11632g + " had bounds: (height " + this.f11633h.outHeight + " width " + this.f11633h.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    /* renamed from: j0.b$r */
    static final class C8260r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11634g;

        /* renamed from: h */
        final /* synthetic */ Exception f11635h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8260r(String str, Exception exc) {
            super(0);
            this.f11634g = str;
            this.f11635h = exc;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception in image bitmap download for Uri: " + this.f11634g + ' ' + this.f11635h.getMessage();
        }
    }

    /* renamed from: j0.b$s */
    static final class C8261s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8261s f11636g = new C8261s();

        C8261s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    /* renamed from: j0.b$t */
    static final class C8262t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8262t f11637g = new C8262t();

        C8262t() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    /* renamed from: j0.b$u */
    static final class C8263u extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8263u f11638g = new C8263u();

        C8263u() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* renamed from: j0.b$v */
    static final class C8264v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8264v f11639g = new C8264v();

        C8264v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* renamed from: j0.b$w */
    static final class C8265w extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ float f11640g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8265w(float f) {
            super(0);
            this.f11640g = f;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Resizing ImageView to aspect ratio: ", Float.valueOf(this.f11640g));
        }
    }

    /* renamed from: a */
    public static final int m16353a(BitmapFactory.Options options, int i, int i2) {
        C12775o.m28639i(options, "options");
        if (i2 == 0 || i == 0) {
            C8266c.m16397f(C8266c.f11641a, f11607a, (C8266c.C8267a) null, (Throwable) null, false, C8243a.f11608g, 14, (Object) null);
            return 1;
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        C8266c.m16397f(C8266c.f11641a, f11607a, (C8266c.C8267a) null, (Throwable) null, false, new C8244b(options, i, i2), 14, (Object) null);
        C12760f0 f0Var = new C12760f0();
        f0Var.f20416b = 1;
        if (i3 > i2 || i4 > i) {
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            while (true) {
                int i7 = f0Var.f20416b;
                if (i5 / i7 < i2 || i6 / i7 < i) {
                    break;
                }
                f0Var.f20416b = i7 * 2;
            }
        }
        C8266c.m16397f(C8266c.f11641a, f11607a, (C8266c.C8267a) null, (Throwable) null, false, new C8245c(f0Var, i4, i3), 14, (Object) null);
        return f0Var.f20416b;
    }

    /* renamed from: b */
    private static final Bitmap m16354b(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = m16353a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
    }

    /* renamed from: c */
    public static final Bitmap m16355c(Context context, Uri uri, C10734d dVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C12775o.m28639i(dVar, "viewBounds");
        C11906l<Integer, Integer> f = m16358f(context, dVar);
        int intValue = f.mo49109a().intValue();
        int intValue2 = f.mo49110b().intValue();
        if (C8233a.m16343e(uri)) {
            return m16362j(uri, intValue2, intValue);
        }
        if (C8233a.m16344f(uri)) {
            return m16364l(uri, intValue2, intValue);
        }
        C8266c.m16397f(C8266c.f11641a, f11607a, C8266c.C8267a.f11651g, (Throwable) null, false, new C8246d(uri), 12, (Object) null);
        return null;
    }

    /* renamed from: d */
    public static final BitmapFactory.Options m16356d(InputStream inputStream) {
        C12775o.m28639i(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        return options;
    }

    /* renamed from: e */
    public static final int m16357e(Context context) {
        C12775o.m28639i(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    /* renamed from: f */
    private static final C11906l<Integer, Integer> m16358f(Context context, C10734d dVar) {
        C11906l<Integer, Integer> g = m16359g(context);
        int intValue = g.mo49109a().intValue();
        int intValue2 = g.mo49110b().intValue();
        if (C10734d.NO_BOUNDS == dVar) {
            return new C11906l<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int e = m16357e(context);
        return new C11906l<>(Integer.valueOf(Math.min(intValue, m16363k(e, dVar.mo45659b()))), Integer.valueOf(Math.min(intValue2, m16363k(e, dVar.mo45660c()))));
    }

    /* renamed from: g */
    private static final C11906l<Integer, Integer> m16359g(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                Rect a = windowManager.getCurrentWindowMetrics().getBounds();
                C12775o.m28638h(a, "windowManager.currentWindowMetrics.bounds");
                return new C11906l<>(Integer.valueOf(a.height()), Integer.valueOf(a.width()));
            }
            DisplayMetrics m = m16365m(context);
            return new C11906l<>(Integer.valueOf(m.heightPixels), Integer.valueOf(m.widthPixels));
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: h */
    public static final int m16360h(Context context) {
        C12775o.m28639i(context, "context");
        return m16359g(context).mo49112d().intValue();
    }

    /* renamed from: i */
    public static final int m16361i() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / ((long) 8), 2147483647L), 33554432));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ Exception -> 0x0119, all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[Catch:{ Exception -> 0x0119, all -> 0x0117 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0131 A[SYNTHETIC, Splitter:B:56:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0151 A[SYNTHETIC, Splitter:B:65:0x0151] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap m16362j(android.net.Uri r22, int r23, int r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "uri"
            kotlin.jvm.internal.C12775o.m28639i(r0, r3)
            r3 = 0
            java.lang.String r4 = r22.getPath()     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            if (r4 == 0) goto L_0x001b
            int r5 = r4.length()     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            if (r5 != 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r5 = 0
            goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            if (r5 == 0) goto L_0x0031
            j0.c r6 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            java.lang.String r7 = f11607a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r8 = 0
            r9 = 0
            r10 = 0
            j0.b$e r11 = new j0.b$e     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r12 = 14
            r13 = 0
            p126j0.C8266c.m16397f(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            return r3
        L_0x0031:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            boolean r4 = r5.exists()     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            if (r4 != 0) goto L_0x004f
            j0.c r6 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            java.lang.String r7 = f11607a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r8 = 0
            r9 = 0
            r10 = 0
            j0.b$f r11 = new j0.b$f     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r12 = 14
            r13 = 0
            p126j0.C8266c.m16397f(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            return r3
        L_0x004f:
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            java.lang.String r6 = f11607a     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            j0.c$a r16 = p126j0.C8266c.C8267a.I     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r17 = 0
            r18 = 0
            j0.b$g r7 = new j0.b$g     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r20 = 12
            r21 = 0
            r14 = r4
            r15 = r6
            r19 = r7
            p126j0.C8266c.m16397f(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            if (r1 <= 0) goto L_0x00fd
            if (r2 > 0) goto L_0x006f
            goto L_0x00fd
        L_0x006f:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r16 = 0
            r17 = 0
            r18 = 0
            j0.b$i r8 = new j0.b$i     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r8.<init>(r2, r1)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r20 = 14
            r21 = 0
            r14 = r4
            r15 = r6
            r19 = r8
            p126j0.C8266c.m16397f(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            android.graphics.BitmapFactory$Options r8 = m16356d(r7)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r7.close()     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x00f9, all -> 0x00f6 }
            int r7 = r8.outHeight     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            if (r7 == 0) goto L_0x00b6
            int r7 = r8.outWidth     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            if (r7 != 0) goto L_0x009f
            goto L_0x00b6
        L_0x009f:
            r16 = 0
            r17 = 0
            r18 = 0
            j0.b$k r19 = p126j0.C8242b.C8253k.f11624g     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            r20 = 14
            r21 = 0
            r14 = r4
            r15 = r6
            p126j0.C8266c.m16397f(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            android.graphics.Bitmap r0 = m16354b(r9, r8, r1, r2)     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
        L_0x00b4:
            r1 = r0
            goto L_0x00d5
        L_0x00b6:
            j0.c$a r16 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            r17 = 0
            r18 = 0
            j0.b$j r1 = new j0.b$j     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            r1.<init>(r0, r8)     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            r20 = 12
            r21 = 0
            r14 = r4
            r15 = r6
            r19 = r1
            p126j0.C8266c.m16397f(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ Exception -> 0x00f2, all -> 0x00ed }
            goto L_0x00b4
        L_0x00d5:
            r9.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00ec
        L_0x00d9:
            r0 = move-exception
            r2 = r0
            j0.c r10 = p126j0.C8266c.f11641a
            java.lang.String r11 = f11607a
            j0.c$a r12 = p126j0.C8266c.C8267a.f11649e
            j0.b$m r15 = p126j0.C8242b.C8255m.f11626g
            r14 = 0
            r16 = 8
            r17 = 0
            r13 = r2
            p126j0.C8266c.m16397f(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00ec:
            return r1
        L_0x00ed:
            r0 = move-exception
            r1 = r0
            r7 = r9
            goto L_0x014e
        L_0x00f2:
            r0 = move-exception
            r7 = r0
            r1 = r9
            goto L_0x011c
        L_0x00f6:
            r0 = move-exception
            r1 = r0
            goto L_0x014e
        L_0x00f9:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L_0x011c
        L_0x00fd:
            r16 = 0
            r17 = 0
            r18 = 0
            j0.b$h r19 = p126j0.C8242b.C8250h.f11619g     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            r20 = 14
            r21 = 0
            r14 = r4
            r15 = r6
            p126j0.C8266c.m16397f(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ Exception -> 0x0119, all -> 0x0117 }
            return r0
        L_0x0117:
            r0 = move-exception
            goto L_0x014c
        L_0x0119:
            r0 = move-exception
            r7 = r0
            r1 = r3
        L_0x011c:
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ all -> 0x014a }
            java.lang.String r5 = f11607a     // Catch:{ all -> 0x014a }
            j0.c$a r6 = p126j0.C8266c.C8267a.f11649e     // Catch:{ all -> 0x014a }
            r8 = 0
            j0.b$l r9 = new j0.b$l     // Catch:{ all -> 0x014a }
            r9.<init>(r7)     // Catch:{ all -> 0x014a }
            r10 = 8
            r11 = 0
            p126j0.C8266c.m16397f(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x014a }
            if (r1 != 0) goto L_0x0131
            goto L_0x0149
        L_0x0131:
            r1.close()     // Catch:{ IOException -> 0x0135 }
            goto L_0x0149
        L_0x0135:
            r0 = move-exception
            r1 = r0
            j0.c r12 = p126j0.C8266c.f11641a
            java.lang.String r13 = f11607a
            j0.c$a r14 = p126j0.C8266c.C8267a.f11649e
            j0.b$m r17 = p126j0.C8242b.C8255m.f11626g
            r16 = 0
            r18 = 8
            r19 = 0
            r15 = r1
            p126j0.C8266c.m16397f(r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0149:
            return r3
        L_0x014a:
            r0 = move-exception
            r3 = r1
        L_0x014c:
            r1 = r0
            r7 = r3
        L_0x014e:
            if (r7 != 0) goto L_0x0151
            goto L_0x0167
        L_0x0151:
            r7.close()     // Catch:{ IOException -> 0x0155 }
            goto L_0x0167
        L_0x0155:
            r0 = move-exception
            r2 = r0
            j0.c r8 = p126j0.C8266c.f11641a
            java.lang.String r9 = f11607a
            j0.c$a r10 = p126j0.C8266c.C8267a.f11649e
            j0.b$m r13 = p126j0.C8242b.C8255m.f11626g
            r12 = 0
            r14 = 8
            r15 = 0
            r11 = r2
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0167:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p126j0.C8242b.m16362j(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* renamed from: k */
    public static final int m16363k(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fd A[SYNTHETIC, Splitter:B:47:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123 A[SYNTHETIC, Splitter:B:58:0x0123] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.graphics.Bitmap m16364l(android.net.Uri r24, int r25, int r26) {
        /*
            r0 = r25
            r1 = r26
            r2 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r2)
            java.lang.String r2 = r24.toString()
            java.lang.String r3 = "uri.toString()"
            kotlin.jvm.internal.C12775o.m28638h(r2, r3)
            x.b$a r3 = p270x.C10156b.f15345m
            boolean r3 = r3.mo44812h()
            r4 = 0
            if (r3 == 0) goto L_0x002f
            j0.c r5 = p126j0.C8266c.f11641a
            java.lang.String r6 = f11607a
            j0.c$a r7 = p126j0.C8266c.C8267a.I
            j0.b$n r10 = new j0.b$n
            r10.<init>(r2)
            r8 = 0
            r9 = 0
            r11 = 12
            r12 = 0
            p126j0.C8266c.m16397f(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L_0x002f:
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            r3.<init>(r2)     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            bo.app.s6 r5 = p042bo.app.C3672s6.f2557a     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            java.net.HttpURLConnection r6 = r5.mo29643a(r3)     // Catch:{ Exception -> 0x00de, all -> 0x00da }
            int r7 = r6.getResponseCode()     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == r8) goto L_0x005a
            j0.c r9 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            java.lang.String r10 = f11607a     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            j0.c$a r11 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r12 = 0
            r13 = 0
            j0.b$o r14 = new j0.b$o     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r14.<init>(r7, r3)     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r15 = 12
            r16 = 0
            p126j0.C8266c.m16397f(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r6.disconnect()
            return r4
        L_0x005a:
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            if (r0 == 0) goto L_0x00ad
            if (r1 == 0) goto L_0x00ad
            j0.c r16 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00cf }
            java.lang.String r17 = f11607a     // Catch:{ Exception -> 0x00cf }
            r10 = 0
            r11 = 0
            r12 = 0
            j0.b$p r13 = new j0.b$p     // Catch:{ Exception -> 0x00cf }
            r13.<init>(r1, r0)     // Catch:{ Exception -> 0x00cf }
            r14 = 14
            r15 = 0
            r8 = r16
            r9 = r17
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00cf }
            android.graphics.BitmapFactory$Options r8 = m16356d(r7)     // Catch:{ Exception -> 0x00cf }
            r6.disconnect()     // Catch:{ Exception -> 0x00cf }
            java.net.HttpURLConnection r6 = r5.mo29643a(r3)     // Catch:{ Exception -> 0x00cf }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ Exception -> 0x00cf }
            int r5 = r8.outHeight     // Catch:{ Exception -> 0x00cf }
            if (r5 == 0) goto L_0x0095
            int r5 = r8.outWidth     // Catch:{ Exception -> 0x00cf }
            if (r5 != 0) goto L_0x0090
            goto L_0x0095
        L_0x0090:
            android.graphics.Bitmap r0 = m16354b(r7, r8, r0, r1)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00b1
        L_0x0095:
            j0.c$a r10 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x00cf }
            r11 = 0
            r12 = 0
            j0.b$q r13 = new j0.b$q     // Catch:{ Exception -> 0x00cf }
            r13.<init>(r3, r8)     // Catch:{ Exception -> 0x00cf }
            r14 = 12
            r15 = 0
            r8 = r16
            r9 = r17
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00cf }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x00cf }
            goto L_0x00b1
        L_0x00ad:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch:{ Exception -> 0x00cf }
        L_0x00b1:
            r1 = r0
            r6.disconnect()
            if (r7 != 0) goto L_0x00b8
            goto L_0x00ce
        L_0x00b8:
            r7.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00ce
        L_0x00bc:
            r0 = move-exception
            r2 = r0
            j0.c r8 = p126j0.C8266c.f11641a
            java.lang.String r9 = f11607a
            j0.c$a r10 = p126j0.C8266c.C8267a.f11649e
            j0.b$s r13 = p126j0.C8242b.C8261s.f11636g
            r12 = 0
            r14 = 8
            r15 = 0
            r11 = r2
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x00ce:
            return r1
        L_0x00cf:
            r0 = move-exception
            r11 = r0
            goto L_0x00e2
        L_0x00d2:
            r0 = move-exception
            r1 = r0
            r7 = r4
            goto L_0x0119
        L_0x00d6:
            r0 = move-exception
            r11 = r0
            r7 = r4
            goto L_0x00e2
        L_0x00da:
            r0 = move-exception
            r1 = r0
            r7 = r4
            goto L_0x011a
        L_0x00de:
            r0 = move-exception
            r11 = r0
            r6 = r4
            r7 = r6
        L_0x00e2:
            j0.c r8 = p126j0.C8266c.f11641a     // Catch:{ all -> 0x0117 }
            java.lang.String r9 = f11607a     // Catch:{ all -> 0x0117 }
            j0.c$a r10 = p126j0.C8266c.C8267a.f11649e     // Catch:{ all -> 0x0117 }
            r12 = 0
            j0.b$r r13 = new j0.b$r     // Catch:{ all -> 0x0117 }
            r13.<init>(r2, r11)     // Catch:{ all -> 0x0117 }
            r14 = 8
            r15 = 0
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0117 }
            if (r6 != 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            r6.disconnect()
        L_0x00fa:
            if (r7 != 0) goto L_0x00fd
            goto L_0x0116
        L_0x00fd:
            r7.close()     // Catch:{ IOException -> 0x0101 }
            goto L_0x0116
        L_0x0101:
            r0 = move-exception
            r1 = r0
            j0.c r16 = p126j0.C8266c.f11641a
            java.lang.String r17 = f11607a
            j0.c$a r18 = p126j0.C8266c.C8267a.f11649e
            j0.b$s r21 = p126j0.C8242b.C8261s.f11636g
            r20 = 0
            r22 = 8
            r23 = 0
            r19 = r1
            p126j0.C8266c.m16397f(r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0116:
            return r4
        L_0x0117:
            r0 = move-exception
            r1 = r0
        L_0x0119:
            r4 = r6
        L_0x011a:
            if (r4 != 0) goto L_0x011d
            goto L_0x0120
        L_0x011d:
            r4.disconnect()
        L_0x0120:
            if (r7 != 0) goto L_0x0123
            goto L_0x0139
        L_0x0123:
            r7.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x0139
        L_0x0127:
            r0 = move-exception
            r2 = r0
            j0.c r8 = p126j0.C8266c.f11641a
            java.lang.String r9 = f11607a
            j0.c$a r10 = p126j0.C8266c.C8267a.f11649e
            j0.b$s r13 = p126j0.C8242b.C8261s.f11636g
            r12 = 0
            r14 = 8
            r15 = 0
            r11 = r2
            p126j0.C8266c.m16397f(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0139:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p126j0.C8242b.m16364l(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    /* renamed from: m */
    private static final DisplayMetrics m16365m(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: n */
    public static final void m16366n(Bitmap bitmap, ImageView imageView) {
        C12775o.m28639i(imageView, "imageView");
        m16367o(imageView, bitmap);
    }

    /* renamed from: o */
    public static final void m16367o(ImageView imageView, Bitmap bitmap) {
        C12775o.m28639i(imageView, "<this>");
        if (bitmap == null) {
            C8266c.m16397f(C8266c.f11641a, f11607a, C8266c.C8267a.f11651g, (Throwable) null, false, C8262t.f11637g, 12, (Object) null);
        } else if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            C8266c.m16397f(C8266c.f11641a, f11607a, C8266c.C8267a.f11651g, (Throwable) null, false, C8263u.f11638g, 12, (Object) null);
        } else if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            C8266c.m16397f(C8266c.f11641a, f11607a, C8266c.C8267a.f11651g, (Throwable) null, false, C8264v.f11639g, 12, (Object) null);
        } else {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            C8266c.m16397f(C8266c.f11641a, f11607a, (C8266c.C8267a) null, (Throwable) null, false, new C8265w(width), 14, (Object) null);
            imageView.getLayoutParams().height = (int) (((float) imageView.getWidth()) / width);
        }
    }
}
