package com.bumptech.glide.load.resource.bitmap;

import p058d1.C7219f;

/* renamed from: com.bumptech.glide.load.resource.bitmap.i */
/* compiled from: DownsampleStrategy */
public abstract class C4456i {

    /* renamed from: a */
    public static final C4456i f4014a = new C4457a();

    /* renamed from: b */
    public static final C4456i f4015b = new C4458b();

    /* renamed from: c */
    public static final C4456i f4016c = new C4461e();

    /* renamed from: d */
    public static final C4456i f4017d = new C4459c();

    /* renamed from: e */
    public static final C4456i f4018e;

    /* renamed from: f */
    public static final C4456i f4019f = new C4462f();

    /* renamed from: g */
    public static final C4456i f4020g;

    /* renamed from: h */
    public static final C7219f<C4456i> f4021h;

    /* renamed from: i */
    static final boolean f4022i = true;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$a */
    /* compiled from: DownsampleStrategy */
    private static class C4457a extends C4456i {
        C4457a() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            return C4463g.QUALITY;
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$b */
    /* compiled from: DownsampleStrategy */
    private static class C4458b extends C4456i {
        C4458b() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            return C4463g.MEMORY;
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$c */
    /* compiled from: DownsampleStrategy */
    private static class C4459c extends C4456i {
        C4459c() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            if (mo31420b(i, i2, i3, i4) == 1.0f) {
                return C4463g.QUALITY;
            }
            return C4456i.f4016c.mo31419a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C4456i.f4016c.mo31420b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$d */
    /* compiled from: DownsampleStrategy */
    private static class C4460d extends C4456i {
        C4460d() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            return C4463g.QUALITY;
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$e */
    /* compiled from: DownsampleStrategy */
    private static class C4461e extends C4456i {
        C4461e() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            if (C4456i.f4022i) {
                return C4463g.QUALITY;
            }
            return C4463g.MEMORY;
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            if (C4456i.f4022i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$f */
    /* compiled from: DownsampleStrategy */
    private static class C4462f extends C4456i {
        C4462f() {
        }

        /* renamed from: a */
        public C4463g mo31419a(int i, int i2, int i3, int i4) {
            return C4463g.QUALITY;
        }

        /* renamed from: b */
        public float mo31420b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.i$g */
    /* compiled from: DownsampleStrategy */
    public enum C4463g {
        MEMORY,
        QUALITY
    }

    static {
        C4460d dVar = new C4460d();
        f4018e = dVar;
        f4020g = dVar;
        f4021h = C7219f.m13988f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract C4463g mo31419a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo31420b(int i, int i2, int i3, int i4);
}
