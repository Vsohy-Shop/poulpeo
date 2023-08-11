package p115i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13121c;
import okio.C13150m;
import okio.C13179y0;
import p080f.C7539e;
import p115i.C8046i;
import p115i.C8056p;
import p145l.C8618m;
import p205r.C9345k;
import p215s.C9405b;
import p215s.C9413h;
import p215s.C9414i;
import p259w.C10061a;
import p259w.C10070i;
import p355hf.C12074d;
import p356hg.C12097d;
import p356hg.C12102f;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nBitmapFactoryDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 5 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 6 Utils.kt\ncoil/util/-Utils\n*L\n1#1,227:1\n82#2,9:228\n1#3:237\n45#4:238\n28#5:239\n219#6:240\n223#6:241\n*S KotlinDebug\n*F\n+ 1 BitmapFactoryDecoder.kt\ncoil/decode/BitmapFactoryDecoder\n*L\n45#1:228,9\n92#1:238\n92#1:239\n144#1:240\n145#1:241\n*E\n"})
/* renamed from: i.d */
/* compiled from: BitmapFactoryDecoder.kt */
public final class C8035d implements C8046i {

    /* renamed from: e */
    public static final C8036a f11266e = new C8036a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C8056p f11267a;

    /* renamed from: b */
    private final C9345k f11268b;

    /* renamed from: c */
    private final C12097d f11269c;

    /* renamed from: d */
    private final C8051l f11270d;

    /* renamed from: i.d$a */
    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class C8036a {
        private C8036a() {
        }

        public /* synthetic */ C8036a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: i.d$b */
    /* compiled from: BitmapFactoryDecoder.kt */
    private static final class C8037b extends C13150m {

        /* renamed from: b */
        private Exception f11271b;

        public C8037b(C13179y0 y0Var) {
            super(y0Var);
        }

        /* renamed from: a */
        public final Exception mo41863a() {
            return this.f11271b;
        }

        public long read(C13121c cVar, long j) {
            try {
                return super.read(cVar, j);
            } catch (Exception e) {
                this.f11271b = e;
                throw e;
            }
        }
    }

    /* renamed from: i.d$c */
    /* compiled from: BitmapFactoryDecoder.kt */
    public static final class C8038c implements C8046i.C8047a {

        /* renamed from: a */
        private final C8051l f11272a;

        /* renamed from: b */
        private final C12097d f11273b;

        public C8038c(int i, C8051l lVar) {
            this.f11272a = lVar;
            this.f11273b = C12102f.m26316b(i, 0, 2, (Object) null);
        }

        /* renamed from: a */
        public C8046i mo41865a(C8618m mVar, C9345k kVar, C7539e eVar) {
            return new C8035d(mVar.mo42699b(), kVar, this.f11273b, this.f11272a);
        }

        public boolean equals(Object obj) {
            return obj instanceof C8038c;
        }

        public int hashCode() {
            return C8038c.class.hashCode();
        }
    }

    @C12739f(mo50609c = "coil.decode.BitmapFactoryDecoder", mo50610f = "BitmapFactoryDecoder.kt", mo50611l = {232, 46}, mo50612m = "decode")
    /* renamed from: i.d$d */
    /* compiled from: BitmapFactoryDecoder.kt */
    static final class C8039d extends C12737d {

        /* renamed from: h */
        Object f11274h;

        /* renamed from: i */
        Object f11275i;

        /* renamed from: j */
        /* synthetic */ Object f11276j;

        /* renamed from: k */
        final /* synthetic */ C8035d f11277k;

        /* renamed from: l */
        int f11278l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8039d(C8035d dVar, C12074d<? super C8039d> dVar2) {
            super(dVar2);
            this.f11277k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11276j = obj;
            this.f11278l |= Integer.MIN_VALUE;
            return this.f11277k.mo41862a(this);
        }
    }

    /* renamed from: i.d$e */
    /* compiled from: BitmapFactoryDecoder.kt */
    static final class C8040e extends C12777p implements C13074a<C8043g> {

        /* renamed from: g */
        final /* synthetic */ C8035d f11279g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8040e(C8035d dVar) {
            super(0);
            this.f11279g = dVar;
        }

        /* renamed from: b */
        public final C8043g invoke() {
            return this.f11279g.m15809e(new BitmapFactory.Options());
        }
    }

    public C8035d(C8056p pVar, C9345k kVar, C12097d dVar, C8051l lVar) {
        this.f11267a = pVar;
        this.f11268b = kVar;
        this.f11269c = dVar;
        this.f11270d = lVar;
    }

    /* renamed from: c */
    private final void m15807c(BitmapFactory.Options options, C8048j jVar) {
        Bitmap.Config f = this.f11268b.mo43741f();
        if (jVar.mo41874b() || C8053n.m15828a(jVar)) {
            f = C10061a.m21124e(f);
        }
        if (this.f11268b.mo43738d() && f == Bitmap.Config.ARGB_8888 && C12775o.m28634d(options.outMimeType, "image/jpeg")) {
            f = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && f != Bitmap.Config.HARDWARE) {
            f = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = f;
    }

    /* renamed from: d */
    private final void m15808d(BitmapFactory.Options options, C8048j jVar) {
        int i;
        int i2;
        int i3;
        int i4;
        BitmapFactory.Options options2 = options;
        C8056p.C8057a a = this.f11267a.mo41884a();
        if (!(a instanceof C8061r) || !C9405b.m19458a(this.f11268b.mo43750n())) {
            boolean z = false;
            if (options2.outWidth <= 0 || options2.outHeight <= 0) {
                options2.inSampleSize = 1;
                options2.inScaled = false;
                return;
            }
            if (C8053n.m15829b(jVar)) {
                i = options2.outHeight;
            } else {
                i = options2.outWidth;
            }
            if (C8053n.m15829b(jVar)) {
                i2 = options2.outWidth;
            } else {
                i2 = options2.outHeight;
            }
            C9414i n = this.f11268b.mo43750n();
            C9413h m = this.f11268b.mo43749m();
            if (C9405b.m19458a(n)) {
                i3 = i;
            } else {
                i3 = C10070i.m21140A(n.mo43835b(), m);
            }
            C9414i n2 = this.f11268b.mo43750n();
            C9413h m2 = this.f11268b.mo43749m();
            if (C9405b.m19458a(n2)) {
                i4 = i2;
            } else {
                i4 = C10070i.m21140A(n2.mo43834a(), m2);
            }
            int a2 = C8044h.m15817a(i, i2, i3, i4, this.f11268b.mo43749m());
            options2.inSampleSize = a2;
            double b = C8044h.m15818b(((double) i) / ((double) a2), ((double) i2) / ((double) a2), (double) i3, (double) i4, this.f11268b.mo43749m());
            if (this.f11268b.mo43737c()) {
                b = C13537l.m30880g(b, 1.0d);
            }
            if (b == 1.0d) {
                z = true;
            }
            boolean z2 = !z;
            options2.inScaled = z2;
            if (!z2) {
                return;
            }
            if (b > 1.0d) {
                options2.inDensity = C13265c.m30133b(((double) Integer.MAX_VALUE) / b);
                options2.inTargetDensity = Integer.MAX_VALUE;
                return;
            }
            options2.inDensity = Integer.MAX_VALUE;
            options2.inTargetDensity = C13265c.m30133b(((double) Integer.MAX_VALUE) * b);
            return;
        }
        options2.inSampleSize = 1;
        options2.inScaled = true;
        options2.inDensity = ((C8061r) a).mo41890a();
        options2.inTargetDensity = this.f11268b.mo43742g().getResources().getDisplayMetrics().densityDpi;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        p392mf.C12941b.m29245a(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ba, code lost:
        throw r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p115i.C8043g m15809e(android.graphics.BitmapFactory.Options r10) {
        /*
            r9 = this;
            i.d$b r0 = new i.d$b
            i.p r1 = r9.f11267a
            okio.e r1 = r1.mo41885b()
            r0.<init>(r1)
            okio.e r1 = okio.C13145j0.m29739d(r0)
            r2 = 1
            r10.inJustDecodeBounds = r2
            okio.e r3 = r1.peek()
            java.io.InputStream r3 = r3.mo52540r0()
            r4 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r4, r10)
            java.lang.Exception r3 = r0.mo41863a()
            if (r3 != 0) goto L_0x00bc
            r3 = 0
            r10.inJustDecodeBounds = r3
            i.m r5 = p115i.C8052m.f11300a
            java.lang.String r6 = r10.outMimeType
            i.l r7 = r9.f11270d
            i.j r6 = r5.mo41881a(r6, r1, r7)
            java.lang.Exception r7 = r0.mo41863a()
            if (r7 != 0) goto L_0x00bb
            r10.inMutable = r3
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 26
            if (r7 < r8) goto L_0x0050
            r.k r7 = r9.f11268b
            android.graphics.ColorSpace r7 = r7.mo43739e()
            if (r7 == 0) goto L_0x0050
            r.k r7 = r9.f11268b
            android.graphics.ColorSpace r7 = r7.mo43739e()
            r10.inPreferredColorSpace = r7
        L_0x0050:
            r.k r7 = r9.f11268b
            boolean r7 = r7.mo43748l()
            r10.inPremultiplied = r7
            r9.m15807c(r10, r6)
            r9.m15808d(r10, r6)
            java.io.InputStream r7 = r1.mo52540r0()     // Catch:{ all -> 0x00b4 }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r4, r10)     // Catch:{ all -> 0x00b4 }
            p392mf.C12941b.m29245a(r1, r4)
            java.lang.Exception r0 = r0.mo41863a()
            if (r0 != 0) goto L_0x00b3
            if (r7 == 0) goto L_0x00a7
            r.k r0 = r9.f11268b
            android.content.Context r0 = r0.mo43742g()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r7.setDensity(r0)
            android.graphics.Bitmap r0 = r5.mo41882b(r7, r6)
            i.g r1 = new i.g
            r.k r4 = r9.f11268b
            android.content.Context r4 = r4.mo43742g()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r0)
            int r0 = r10.inSampleSize
            if (r0 > r2) goto L_0x00a3
            boolean r10 = r10.inScaled
            if (r10 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r2 = r3
        L_0x00a3:
            r1.<init>(r5, r2)
            return r1
        L_0x00a7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L_0x00b3:
            throw r0
        L_0x00b4:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            p392mf.C12941b.m29245a(r1, r10)
            throw r0
        L_0x00bb:
            throw r7
        L_0x00bc:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i.C8035d.m15809e(android.graphics.BitmapFactory$Options):i.g");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo41862a(p355hf.C12074d<? super p115i.C8043g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p115i.C8035d.C8039d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            i.d$d r0 = (p115i.C8035d.C8039d) r0
            int r1 = r0.f11278l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11278l = r1
            goto L_0x0018
        L_0x0013:
            i.d$d r0 = new i.d$d
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f11276j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f11278l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.f11274h
            hg.d r0 = (p356hg.C12097d) r0
            p336ef.C11910n.m25701b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r8 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.f11275i
            hg.d r2 = (p356hg.C12097d) r2
            java.lang.Object r5 = r0.f11274h
            i.d r5 = (p115i.C8035d) r5
            p336ef.C11910n.m25701b(r8)
            r8 = r2
            goto L_0x005a
        L_0x0047:
            p336ef.C11910n.m25701b(r8)
            hg.d r8 = r7.f11269c
            r0.f11274h = r7
            r0.f11275i = r8
            r0.f11278l = r4
            java.lang.Object r2 = r8.mo49537c(r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r7
        L_0x005a:
            i.d$e r2 = new i.d$e     // Catch:{ all -> 0x0076 }
            r2.<init>(r5)     // Catch:{ all -> 0x0076 }
            r0.f11274h = r8     // Catch:{ all -> 0x0076 }
            r5 = 0
            r0.f11275i = r5     // Catch:{ all -> 0x0076 }
            r0.f11278l = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = p466yf.C14037u1.m32558c(r5, r2, r0, r4, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0070:
            i.g r8 = (p115i.C8043g) r8     // Catch:{ all -> 0x0030 }
            r0.release()
            return r8
        L_0x0076:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x007a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i.C8035d.mo41862a(hf.d):java.lang.Object");
    }
}
