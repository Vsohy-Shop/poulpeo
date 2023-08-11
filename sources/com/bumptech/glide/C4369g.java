package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p094g1.C7737a;
import p250v1.C9914a;
import p250v1.C9915b;
import p250v1.C9916c;
import p250v1.C9917d;
import p250v1.C9919e;
import p250v1.C9920f;
import p250v1.C9922h;
import p261w1.C10104d;
import p294z1.C10784e;
import p294z1.C10791j;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.g */
/* compiled from: RequestBuilder */
public class C4369g<TranscodeType> extends C9914a<C4369g<TranscodeType>> {

    /* renamed from: c0 */
    protected static final C9920f f3715c0 = ((C9920f) ((C9920f) ((C9920f) new C9920f().mo44457e(C7737a.f10717c)).mo44446M(C4368f.LOW)).mo44450W(true));

    /* renamed from: B */
    private final Context f3716B;

    /* renamed from: C */
    private final C4371h f3717C;

    /* renamed from: D */
    private final Class<TranscodeType> f3718D;

    /* renamed from: E */
    private final C4362b f3719E;

    /* renamed from: F */
    private final C4366d f3720F;
    @NonNull

    /* renamed from: G */
    private C4374i<?, ? super TranscodeType> f3721G;
    @Nullable

    /* renamed from: H */
    private Object f3722H;
    @Nullable

    /* renamed from: I */
    private List<C9919e<TranscodeType>> f3723I;
    @Nullable

    /* renamed from: J */
    private C4369g<TranscodeType> f3724J;
    @Nullable

    /* renamed from: K */
    private C4369g<TranscodeType> f3725K;
    @Nullable

    /* renamed from: M */
    private Float f3726M;

    /* renamed from: X */
    private boolean f3727X = true;

    /* renamed from: Y */
    private boolean f3728Y;

    /* renamed from: Z */
    private boolean f3729Z;

    /* renamed from: com.bumptech.glide.g$a */
    /* compiled from: RequestBuilder */
    static /* synthetic */ class C4370a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3730a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3731b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.f[] r0 = com.bumptech.glide.C4368f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3731b = r0
                r1 = 1
                com.bumptech.glide.f r2 = com.bumptech.glide.C4368f.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3731b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.f r3 = com.bumptech.glide.C4368f.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3731b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.f r4 = com.bumptech.glide.C4368f.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3731b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.f r5 = com.bumptech.glide.C4368f.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3730a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f3730a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3730a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C4369g.C4370a.<clinit>():void");
        }
    }

    protected C4369g(@NonNull C4362b bVar, C4371h hVar, Class<TranscodeType> cls, Context context) {
        this.f3719E = bVar;
        this.f3717C = hVar;
        this.f3718D = cls;
        this.f3716B = context;
        this.f3721G = hVar.mo31223q(cls);
        this.f3720F = bVar.mo31180i();
        m5074i0(hVar.mo31216o());
        mo31201a(hVar.mo31222p());
    }

    /* renamed from: d0 */
    private C9916c m5070d0(C10104d<TranscodeType> dVar, @Nullable C9919e<TranscodeType> eVar, C9914a<?> aVar, Executor executor) {
        return m5071e0(new Object(), dVar, eVar, (C9917d) null, this.f3721G, aVar.mo44472s(), aVar.mo44469p(), aVar.mo44468o(), aVar, executor);
    }

    /* renamed from: e0 */
    private C9916c m5071e0(Object obj, C10104d<TranscodeType> dVar, @Nullable C9919e<TranscodeType> eVar, @Nullable C9917d dVar2, C4374i<?, ? super TranscodeType> iVar, C4368f fVar, int i, int i2, C9914a<?> aVar, Executor executor) {
        C9915b bVar;
        C9915b bVar2;
        if (this.f3725K != null) {
            bVar2 = new C9915b(obj, dVar2);
            bVar = bVar2;
        } else {
            Object obj2 = obj;
            bVar = null;
            bVar2 = dVar2;
        }
        C9916c f0 = m5072f0(obj, dVar, eVar, bVar2, iVar, fVar, i, i2, aVar, executor);
        if (bVar == null) {
            return f0;
        }
        int p = this.f3725K.mo44469p();
        int o = this.f3725K.mo44468o();
        if (C10792k.m22967r(i, i2) && !this.f3725K.mo44442I()) {
            p = aVar.mo44469p();
            o = aVar.mo44468o();
        }
        C4369g<TranscodeType> gVar = this.f3725K;
        C9915b bVar3 = bVar;
        bVar3.mo44493o(f0, gVar.m5071e0(obj, dVar, eVar, bVar3, gVar.f3721G, gVar.mo44472s(), p, o, this.f3725K, executor));
        return bVar3;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [v1.a<?>, v1.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p250v1.C9916c m5072f0(java.lang.Object r19, p261w1.C10104d<TranscodeType> r20, p250v1.C9919e<TranscodeType> r21, @androidx.annotation.Nullable p250v1.C9917d r22, com.bumptech.glide.C4374i<?, ? super TranscodeType> r23, com.bumptech.glide.C4368f r24, int r25, int r26, p250v1.C9914a<?> r27, java.util.concurrent.Executor r28) {
        /*
            r18 = this;
            r11 = r18
            r12 = r19
            r5 = r22
            r13 = r24
            com.bumptech.glide.g<TranscodeType> r0 = r11.f3724J
            if (r0 == 0) goto L_0x0094
            boolean r1 = r11.f3729Z
            if (r1 != 0) goto L_0x008c
            com.bumptech.glide.i<?, ? super TranscodeType> r1 = r0.f3721G
            boolean r2 = r0.f3727X
            if (r2 == 0) goto L_0x0019
            r14 = r23
            goto L_0x001a
        L_0x0019:
            r14 = r1
        L_0x001a:
            boolean r0 = r0.mo44439C()
            if (r0 == 0) goto L_0x0027
            com.bumptech.glide.g<TranscodeType> r0 = r11.f3724J
            com.bumptech.glide.f r0 = r0.mo44472s()
            goto L_0x002b
        L_0x0027:
            com.bumptech.glide.f r0 = r11.m5073h0(r13)
        L_0x002b:
            r15 = r0
            com.bumptech.glide.g<TranscodeType> r0 = r11.f3724J
            int r0 = r0.mo44469p()
            com.bumptech.glide.g<TranscodeType> r1 = r11.f3724J
            int r1 = r1.mo44468o()
            boolean r2 = p294z1.C10792k.m22967r(r25, r26)
            if (r2 == 0) goto L_0x004e
            com.bumptech.glide.g<TranscodeType> r2 = r11.f3724J
            boolean r2 = r2.mo44442I()
            if (r2 != 0) goto L_0x004e
            int r0 = r27.mo44469p()
            int r1 = r27.mo44468o()
        L_0x004e:
            r16 = r0
            r17 = r1
            v1.i r10 = new v1.i
            r10.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r10
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r13 = r10
            r10 = r28
            v1.c r10 = r0.m5078p0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 1
            r11.f3729Z = r0
            com.bumptech.glide.g<TranscodeType> r9 = r11.f3724J
            r0 = r9
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r12 = r10
            r10 = r28
            v1.c r0 = r0.m5071e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 0
            r11.f3729Z = r1
            r13.mo44502n(r12, r0)
            return r13
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x0094:
            java.lang.Float r0 = r11.f3726M
            if (r0 == 0) goto L_0x00d4
            v1.i r14 = new v1.i
            r14.<init>(r12, r5)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r14
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            v1.c r15 = r0.m5078p0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            v1.a r0 = r27.clone()
            java.lang.Float r1 = r11.f3726M
            float r1 = r1.floatValue()
            v1.a r4 = r0.mo44449U(r1)
            com.bumptech.glide.f r7 = r11.m5073h0(r13)
            r0 = r18
            r1 = r19
            v1.c r0 = r0.m5078p0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r14.mo44502n(r15, r0)
            return r14
        L_0x00d4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r27
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r28
            v1.c r0 = r0.m5078p0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C4369g.m5072f0(java.lang.Object, w1.d, v1.e, v1.d, com.bumptech.glide.i, com.bumptech.glide.f, int, int, v1.a, java.util.concurrent.Executor):v1.c");
    }

    @NonNull
    /* renamed from: h0 */
    private C4368f m5073h0(@NonNull C4368f fVar) {
        int i = C4370a.f3731b[fVar.ordinal()];
        if (i == 1) {
            return C4368f.NORMAL;
        }
        if (i == 2) {
            return C4368f.HIGH;
        }
        if (i == 3 || i == 4) {
            return C4368f.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo44472s());
    }

    /* renamed from: i0 */
    private void m5074i0(List<C9919e<Object>> list) {
        for (C9919e<Object> b0 : list) {
            mo31202b0(b0);
        }
    }

    /* renamed from: l0 */
    private <Y extends C10104d<TranscodeType>> Y m5075l0(@NonNull Y y, @Nullable C9919e<TranscodeType> eVar, C9914a<?> aVar, Executor executor) {
        C10791j.m22948d(y);
        if (this.f3728Y) {
            C9916c d0 = m5070d0(y, eVar, aVar, executor);
            C9916c a = y.mo44675a();
            if (!d0.mo44485e(a) || m5076m0(aVar, a)) {
                this.f3717C.mo31215n(y);
                y.mo44676b(d0);
                this.f3717C.mo31231x(y, d0);
                return y;
            }
            if (!((C9916c) C10791j.m22948d(a)).isRunning()) {
                a.mo44489h();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: m0 */
    private boolean m5076m0(C9914a<?> aVar, C9916c cVar) {
        if (aVar.mo44438B() || !cVar.mo44492j()) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: o0 */
    private C4369g<TranscodeType> m5077o0(@Nullable Object obj) {
        this.f3722H = obj;
        this.f3728Y = true;
        return this;
    }

    /* renamed from: p0 */
    private C9916c m5078p0(Object obj, C10104d<TranscodeType> dVar, C9919e<TranscodeType> eVar, C9914a<?> aVar, C9917d dVar2, C4374i<?, ? super TranscodeType> iVar, C4368f fVar, int i, int i2, Executor executor) {
        Context context = this.f3716B;
        C4366d dVar3 = this.f3720F;
        return C9922h.m20705x(context, dVar3, obj, this.f3722H, this.f3718D, aVar, i, i2, fVar, dVar, eVar, this.f3723I, dVar2, dVar3.mo31197e(), iVar.mo31236b(), executor);
    }

    @CheckResult
    @NonNull
    /* renamed from: b0 */
    public C4369g<TranscodeType> mo31202b0(@Nullable C9919e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f3723I == null) {
                this.f3723I = new ArrayList();
            }
            this.f3723I.add(eVar);
        }
        return this;
    }

    @CheckResult
    @NonNull
    /* renamed from: c0 */
    public C4369g<TranscodeType> mo31201a(@NonNull C9914a<?> aVar) {
        C10791j.m22948d(aVar);
        return (C4369g) super.mo31201a(aVar);
    }

    @CheckResult
    /* renamed from: g0 */
    public C4369g<TranscodeType> clone() {
        C4369g<TranscodeType> gVar = (C4369g) super.clone();
        gVar.f3721G = gVar.f3721G.clone();
        return gVar;
    }

    @NonNull
    /* renamed from: j0 */
    public <Y extends C10104d<TranscodeType>> Y mo31207j0(@NonNull Y y) {
        return mo31208k0(y, (C9919e) null, C10784e.m22930b());
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: k0 */
    public <Y extends C10104d<TranscodeType>> Y mo31208k0(@NonNull Y y, @Nullable C9919e<TranscodeType> eVar, Executor executor) {
        return m5075l0(y, eVar, this, executor);
    }

    @CheckResult
    @NonNull
    /* renamed from: n0 */
    public C4369g<TranscodeType> mo31209n0(@Nullable Object obj) {
        return m5077o0(obj);
    }
}
