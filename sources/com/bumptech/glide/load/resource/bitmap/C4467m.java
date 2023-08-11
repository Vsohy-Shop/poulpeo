package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.C4456i;
import com.bumptech.glide.load.resource.bitmap.C4475r;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import p058d1.C7215b;
import p058d1.C7219f;
import p058d1.C7222g;
import p058d1.C7223h;
import p070e1.C7438m;
import p094g1.C7744c;
import p106h1.C7883b;
import p106h1.C7885d;
import p294z1.C10787f;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.load.resource.bitmap.m */
/* compiled from: Downsampler */
public final class C4467m {

    /* renamed from: f */
    public static final C7219f<C7215b> f4026f = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", C7215b.f9906d);

    /* renamed from: g */
    public static final C7219f<C7223h> f4027g = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", C7223h.SRGB);
    @Deprecated

    /* renamed from: h */
    public static final C7219f<C4456i> f4028h = C4456i.f4021h;

    /* renamed from: i */
    public static final C7219f<Boolean> f4029i;

    /* renamed from: j */
    public static final C7219f<Boolean> f4030j;

    /* renamed from: k */
    private static final Set<String> f4031k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l */
    private static final C4469b f4032l = new C4468a();

    /* renamed from: m */
    private static final Set<ImageHeaderParser.ImageType> f4033m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n */
    private static final Queue<BitmapFactory.Options> f4034n = C10792k.m22954e(0);

    /* renamed from: a */
    private final C7885d f4035a;

    /* renamed from: b */
    private final DisplayMetrics f4036b;

    /* renamed from: c */
    private final C7883b f4037c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f4038d;

    /* renamed from: e */
    private final C4474q f4039e = C4474q.m5438a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$b */
    /* compiled from: Downsampler */
    public interface C4469b {
        /* renamed from: a */
        void mo31427a();

        /* renamed from: b */
        void mo31428b(C7885d dVar, Bitmap bitmap);
    }

    static {
        Boolean bool = Boolean.FALSE;
        f4029i = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f4030j = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C4467m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C7885d dVar, C7883b bVar) {
        this.f4038d = list;
        this.f4036b = (DisplayMetrics) C10791j.m22948d(displayMetrics);
        this.f4035a = (C7885d) C10791j.m22948d(dVar);
        this.f4037c = (C7883b) C10791j.m22948d(bVar);
    }

    /* renamed from: a */
    private static int m5398a(double d) {
        int l = m5406l(d);
        int x = m5415x(((double) l) * d);
        return m5415x((d / ((double) (((float) x) / ((float) l)))) * ((double) x));
    }

    /* renamed from: b */
    private void m5399b(C4475r rVar, C7215b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (!this.f4039e.mo31433e(i, i2, options, z, z2)) {
            if (bVar != C7215b.PREFER_ARGB_8888) {
                try {
                    z3 = rVar.mo31437d().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                    }
                    z3 = false;
                }
                if (z3) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    /* renamed from: c */
    private static void m5400c(ImageHeaderParser.ImageType imageType, C4475r rVar, C4469b bVar, C7885d dVar, C4456i iVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ImageHeaderParser.ImageType imageType2 = imageType;
        C4456i iVar2 = iVar;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 > 0 && i12 > 0) {
            if (m5409r(i)) {
                i6 = i11;
                i7 = i12;
            } else {
                i7 = i11;
                i6 = i12;
            }
            float b = iVar2.mo31420b(i7, i6, i13, i14);
            if (b > 0.0f) {
                C4456i.C4463g a = iVar2.mo31419a(i7, i6, i13, i14);
                if (a != null) {
                    float f = (float) i7;
                    float f2 = (float) i6;
                    int x = i7 / m5415x((double) (b * f));
                    int x2 = i6 / m5415x((double) (b * f2));
                    C4456i.C4463g gVar = C4456i.C4463g.MEMORY;
                    if (a == gVar) {
                        i8 = Math.max(x, x2);
                    } else {
                        i8 = Math.min(x, x2);
                    }
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == gVar && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    options2.inSampleSize = max;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(max, 8);
                        i9 = (int) Math.ceil((double) (f / min));
                        i10 = (int) Math.ceil((double) (f2 / min));
                        int i15 = max / 8;
                        if (i15 > 0) {
                            i9 /= i15;
                            i10 /= i15;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) max;
                        i9 = (int) Math.floor((double) (f / f3));
                        i10 = (int) Math.floor((double) (f2 / f3));
                    } else if (imageType2 == ImageHeaderParser.ImageType.WEBP || imageType2 == ImageHeaderParser.ImageType.WEBP_A) {
                        float f4 = (float) max;
                        i9 = Math.round(f / f4);
                        i10 = Math.round(f2 / f4);
                    } else if (i7 % max == 0 && i6 % max == 0) {
                        i9 = i7 / max;
                        i10 = i6 / max;
                    } else {
                        int[] m = m5407m(rVar, options2, bVar, dVar);
                        i9 = m[0];
                        i10 = m[1];
                    }
                    double b2 = (double) iVar2.mo31420b(i9, i10, i13, i14);
                    options2.inTargetDensity = m5398a(b2);
                    options2.inDensity = m5406l(b2);
                    if (m5410s(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i13 + "x" + i14 + "], power of two scaled: [" + i9 + "x" + i10 + "], exact scale factor: " + b + ", power of 2 sample size: " + max + ", adjusted scale factor: " + b2 + ", target density: " + options2.inTargetDensity + ", density: " + options2.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i16 = i12;
            int i17 = i11;
            throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + iVar2 + ", source: [" + i17 + "x" + i16 + "], target: [" + i13 + "x" + i14 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType2 + " with target [" + i13 + "x" + i14 + "]");
        }
    }

    /* renamed from: e */
    private C7744c<Bitmap> m5401e(C4475r rVar, int i, int i2, C7222g gVar, C4469b bVar) {
        boolean z;
        C7222g gVar2 = gVar;
        byte[] bArr = (byte[]) this.f4037c.mo41595d(65536, byte[].class);
        BitmapFactory.Options k = m5405k();
        k.inTempStorage = bArr;
        C7215b bVar2 = (C7215b) gVar2.mo40779c(f4026f);
        C7223h hVar = (C7223h) gVar2.mo40779c(f4027g);
        C4456i iVar = (C4456i) gVar2.mo40779c(C4456i.f4021h);
        boolean booleanValue = ((Boolean) gVar2.mo40779c(f4029i)).booleanValue();
        C7219f fVar = f4030j;
        if (gVar2.mo40779c(fVar) == null || !((Boolean) gVar2.mo40779c(fVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return C4452e.m5369c(m5402h(rVar, k, iVar, bVar2, hVar, z, i, i2, booleanValue, bVar), this.f4035a);
        } finally {
            m5413v(k);
            this.f4037c.put(bArr);
        }
    }

    /* renamed from: h */
    private Bitmap m5402h(C4475r rVar, BitmapFactory.Options options, C4456i iVar, C7215b bVar, C7223h hVar, boolean z, int i, int i2, boolean z2, C4469b bVar2) {
        boolean z3;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        ColorSpace.Named named;
        int i7;
        int i8;
        float f;
        BitmapFactory.Options options2 = options;
        C4469b bVar3 = bVar2;
        long b = C10787f.m22932b();
        int[] m = m5407m(rVar, options2, bVar3, this.f4035a);
        boolean z4 = false;
        int i9 = m[0];
        int i10 = m[1];
        String str2 = options2.outMimeType;
        if (i9 == -1 || i10 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int a = rVar.mo31434a();
        int d = C4486y.m5483d(a);
        boolean g = C4486y.m5486g(a);
        int i11 = i;
        if (i11 == Integer.MIN_VALUE) {
            i4 = i2;
            if (m5409r(d)) {
                i3 = i10;
            } else {
                i3 = i9;
            }
        } else {
            i4 = i2;
            i3 = i11;
        }
        if (i4 != Integer.MIN_VALUE) {
            i5 = i4;
        } else if (m5409r(d)) {
            i5 = i9;
        } else {
            i5 = i10;
        }
        ImageHeaderParser.ImageType d2 = rVar.mo31437d();
        ImageHeaderParser.ImageType imageType = d2;
        m5400c(d2, rVar, bVar2, this.f4035a, iVar, d, i9, i10, i3, i5, options);
        int i12 = a;
        String str3 = str2;
        int i13 = i10;
        int i14 = i9;
        C4469b bVar4 = bVar3;
        BitmapFactory.Options options3 = options2;
        m5399b(rVar, bVar, z3, g, options, i3, i5);
        int i15 = Build.VERSION.SDK_INT;
        int i16 = options3.inSampleSize;
        if (m5417z(imageType)) {
            if (i14 < 0 || i13 < 0 || !z2) {
                if (m5410s(options)) {
                    f = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f = 1.0f;
                }
                int i17 = options3.inSampleSize;
                float f2 = (float) i17;
                i8 = Math.round(((float) ((int) Math.ceil((double) (((float) i14) / f2)))) * f);
                i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + i8 + "x" + i7 + "] for source [" + i14 + "x" + i13 + "], sampleSize: " + i17 + ", targetDensity: " + options3.inTargetDensity + ", density: " + options3.inDensity + ", density multiplier: " + f);
                }
            } else {
                str = "Downsampler";
                i8 = i3;
                i7 = i5;
            }
            if (i8 > 0 && i7 > 0) {
                m5416y(options3, this.f4035a, i8, i7);
            }
        } else {
            str = "Downsampler";
        }
        if (i15 >= 28) {
            if (hVar == C7223h.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                z4 = true;
            }
            if (z4) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else {
                named = ColorSpace.Named.SRGB;
            }
            options3.inPreferredColorSpace = ColorSpace.get(named);
        } else if (i15 >= 26) {
            options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap i18 = m5403i(rVar, options3, bVar4, this.f4035a);
        bVar4.mo31428b(this.f4035a, i18);
        if (Log.isLoggable(str, 2)) {
            i6 = i12;
            m5411t(i14, i13, str3, options, i18, i, i2, b);
        } else {
            i6 = i12;
        }
        if (i18 == null) {
            return null;
        }
        i18.setDensity(this.f4036b.densityDpi);
        Bitmap h = C4486y.m5487h(this.f4035a, i18, i6);
        if (i18.equals(h)) {
            return h;
        }
        this.f4035a.mo31429c(i18);
        return h;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004e */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap m5403i(com.bumptech.glide.load.resource.bitmap.C4475r r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.C4467m.C4469b r7, p106h1.C7885d r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L_0x000c
            r7.mo31427a()
            r5.mo31436c()
        L_0x000c:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = com.bumptech.glide.load.resource.bitmap.C4486y.m5482c()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo31435b(r6)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C4486y.m5482c()
            r6.unlock()
            return r5
        L_0x0025:
            r5 = move-exception
            goto L_0x0050
        L_0x0027:
            r4 = move-exception
            java.io.IOException r1 = m5412u(r4, r1, r2, r3, r6)     // Catch:{ all -> 0x0025 }
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch:{ all -> 0x0025 }
        L_0x0038:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x004f
            r8.mo31429c(r0)     // Catch:{ IOException -> 0x004e }
            r0 = 0
            r6.inBitmap = r0     // Catch:{ IOException -> 0x004e }
            android.graphics.Bitmap r5 = m5403i(r5, r6, r7, r8)     // Catch:{ IOException -> 0x004e }
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C4486y.m5482c()
            r6.unlock()
            return r5
        L_0x004e:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x004f:
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0050:
            java.util.concurrent.locks.Lock r6 = com.bumptech.glide.load.resource.bitmap.C4486y.m5482c()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C4467m.m5403i(com.bumptech.glide.load.resource.bitmap.r, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.m$b, h1.d):android.graphics.Bitmap");
    }

    @Nullable
    /* renamed from: j */
    private static String m5404j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m5405k() {
        BitmapFactory.Options poll;
        synchronized (C4467m.class) {
            Queue<BitmapFactory.Options> queue = f4034n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m5414w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m5406l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m5407m(C4475r rVar, BitmapFactory.Options options, C4469b bVar, C7885d dVar) {
        options.inJustDecodeBounds = true;
        m5403i(rVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m5408n(BitmapFactory.Options options) {
        return m5404j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m5409r(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private static boolean m5410s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        if (i2 <= 0 || (i = options.inDensity) <= 0 || i2 == i) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private static void m5411t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m5404j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m5408n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C10787f.m22931a(j));
    }

    /* renamed from: u */
    private static IOException m5412u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m5408n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m5413v(BitmapFactory.Options options) {
        m5414w(options);
        Queue<BitmapFactory.Options> queue = f4034n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m5414w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m5415x(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: y */
    private static void m5416y(BitmapFactory.Options options, C7885d dVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.mo41603e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m5417z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @RequiresApi(21)
    /* renamed from: d */
    public C7744c<Bitmap> mo31421d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C7222g gVar) {
        return m5401e(new C4475r.C4477b(parcelFileDescriptor, this.f4038d, this.f4037c), i, i2, gVar, f4032l);
    }

    /* renamed from: f */
    public C7744c<Bitmap> mo31422f(InputStream inputStream, int i, int i2, C7222g gVar) {
        return mo31423g(inputStream, i, i2, gVar, f4032l);
    }

    /* renamed from: g */
    public C7744c<Bitmap> mo31423g(InputStream inputStream, int i, int i2, C7222g gVar, C4469b bVar) {
        return m5401e(new C4475r.C4476a(inputStream, this.f4038d, this.f4037c), i, i2, gVar, bVar);
    }

    /* renamed from: o */
    public boolean mo31424o(ParcelFileDescriptor parcelFileDescriptor) {
        return C7438m.m14548c();
    }

    /* renamed from: p */
    public boolean mo31425p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo31426q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.m$a */
    /* compiled from: Downsampler */
    class C4468a implements C4469b {
        C4468a() {
        }

        /* renamed from: a */
        public void mo31427a() {
        }

        /* renamed from: b */
        public void mo31428b(C7885d dVar, Bitmap bitmap) {
        }
    }
}
