package p106h1;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: h1.j */
/* compiled from: LruBitmapPool */
public class C7894j implements C7885d {

    /* renamed from: k */
    private static final Bitmap.Config f11031k = Bitmap.Config.ARGB_8888;

    /* renamed from: a */
    private final C7897k f11032a;

    /* renamed from: b */
    private final Set<Bitmap.Config> f11033b;

    /* renamed from: c */
    private final long f11034c;

    /* renamed from: d */
    private final C7895a f11035d;

    /* renamed from: e */
    private long f11036e;

    /* renamed from: f */
    private long f11037f;

    /* renamed from: g */
    private int f11038g;

    /* renamed from: h */
    private int f11039h;

    /* renamed from: i */
    private int f11040i;

    /* renamed from: j */
    private int f11041j;

    /* renamed from: h1.j$a */
    /* compiled from: LruBitmapPool */
    private interface C7895a {
        /* renamed from: a */
        void mo41623a(Bitmap bitmap);

        /* renamed from: b */
        void mo41624b(Bitmap bitmap);
    }

    C7894j(long j, C7897k kVar, Set<Bitmap.Config> set) {
        this.f11034c = j;
        this.f11036e = j;
        this.f11032a = kVar;
        this.f11033b = set;
        this.f11035d = new C7896b();
    }

    /* renamed from: f */
    private static void m15476f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    @NonNull
    /* renamed from: g */
    private static Bitmap m15477g(int i, int i2, @Nullable Bitmap.Config config) {
        if (config == null) {
            config = f11031k;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m15478h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m15479i();
        }
    }

    /* renamed from: i */
    private void m15479i() {
        Log.v("LruBitmapPool", "Hits=" + this.f11038g + ", misses=" + this.f11039h + ", puts=" + this.f11040i + ", evictions=" + this.f11041j + ", currentSize=" + this.f11037f + ", maxSize=" + this.f11036e + "\nStrategy=" + this.f11032a);
    }

    /* renamed from: j */
    private void m15480j() {
        m15486q(this.f11036e);
    }

    /* renamed from: k */
    private static Set<Bitmap.Config> m15481k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add((Object) null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static C7897k m15482l() {
        return new C7899m();
    }

    @Nullable
    /* renamed from: m */
    private synchronized Bitmap m15483m(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap d;
        m15476f(config);
        C7897k kVar = this.f11032a;
        if (config != null) {
            config2 = config;
        } else {
            config2 = f11031k;
        }
        d = kVar.mo41628d(i, i2, config2);
        if (d == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f11032a.mo41625a(i, i2, config));
            }
            this.f11039h++;
        } else {
            this.f11038g++;
            this.f11037f -= (long) this.f11032a.mo41626b(d);
            this.f11035d.mo41623a(d);
            m15485p(d);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f11032a.mo41625a(i, i2, config));
        }
        m15478h();
        return d;
    }

    /* renamed from: o */
    private static void m15484o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    /* renamed from: p */
    private static void m15485p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m15484o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m15486q(long j) {
        while (this.f11037f > j) {
            Bitmap removeLast = this.f11032a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m15479i();
                }
                this.f11037f = 0;
                return;
            }
            this.f11035d.mo41623a(removeLast);
            this.f11037f -= (long) this.f11032a.mo41626b(removeLast);
            this.f11041j++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f11032a.mo41629e(removeLast));
            }
            m15478h();
            removeLast.recycle();
        }
    }

    /* renamed from: a */
    public void mo41600a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            mo41601b();
        } else if (i >= 20 || i == 15) {
            m15486q(mo41622n() / 2);
        }
    }

    /* renamed from: b */
    public void mo41601b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m15486q(0);
    }

    /* renamed from: c */
    public synchronized void mo31429c(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f11032a.mo41626b(bitmap)) <= this.f11036e) {
                        if (this.f11033b.contains(bitmap.getConfig())) {
                            int b = this.f11032a.mo41626b(bitmap);
                            this.f11032a.mo41627c(bitmap);
                            this.f11035d.mo41624b(bitmap);
                            this.f11040i++;
                            this.f11037f += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f11032a.mo41629e(bitmap));
                            }
                            m15478h();
                            m15480j();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f11032a.mo41629e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f11033b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    @NonNull
    /* renamed from: d */
    public Bitmap mo41602d(int i, int i2, Bitmap.Config config) {
        Bitmap m = m15483m(i, i2, config);
        if (m == null) {
            return m15477g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    @NonNull
    /* renamed from: e */
    public Bitmap mo41603e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m15483m(i, i2, config);
        if (m == null) {
            return m15477g(i, i2, config);
        }
        return m;
    }

    /* renamed from: n */
    public long mo41622n() {
        return this.f11036e;
    }

    public C7894j(long j) {
        this(j, m15482l(), m15481k());
    }

    /* renamed from: h1.j$b */
    /* compiled from: LruBitmapPool */
    private static final class C7896b implements C7895a {
        C7896b() {
        }

        /* renamed from: a */
        public void mo41623a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo41624b(Bitmap bitmap) {
        }
    }
}
