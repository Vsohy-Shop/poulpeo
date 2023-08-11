package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.NetworkInfo;
import com.squareup.picasso.C11747n;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.C13130e;
import okio.C13145j0;
import okio.C13179y0;
import p452wd.C13694a;
import p452wd.C13697d;

/* renamed from: com.squareup.picasso.c */
/* compiled from: BitmapHunter */
class C11723c implements Runnable {

    /* renamed from: u */
    private static final Object f18202u = new Object();

    /* renamed from: v */
    private static final ThreadLocal<StringBuilder> f18203v = new C11724a();

    /* renamed from: w */
    private static final AtomicInteger f18204w = new AtomicInteger();

    /* renamed from: x */
    private static final C11768u f18205x = new C11725b();

    /* renamed from: b */
    final int f18206b = f18204w.incrementAndGet();

    /* renamed from: c */
    final C11751p f18207c;

    /* renamed from: d */
    final C11733g f18208d;

    /* renamed from: e */
    final C13694a f18209e;

    /* renamed from: f */
    final C11771w f18210f;

    /* renamed from: g */
    final String f18211g;

    /* renamed from: h */
    final C11764s f18212h;

    /* renamed from: i */
    final int f18213i;

    /* renamed from: j */
    int f18214j;

    /* renamed from: k */
    final C11768u f18215k;

    /* renamed from: l */
    C11720a f18216l;

    /* renamed from: m */
    List<C11720a> f18217m;

    /* renamed from: n */
    Bitmap f18218n;

    /* renamed from: o */
    Future<?> f18219o;

    /* renamed from: p */
    C11751p.C11757e f18220p;

    /* renamed from: q */
    Exception f18221q;

    /* renamed from: r */
    int f18222r;

    /* renamed from: s */
    int f18223s;

    /* renamed from: t */
    C11751p.C11758f f18224t;

    /* renamed from: com.squareup.picasso.c$a */
    /* compiled from: BitmapHunter */
    static class C11724a extends ThreadLocal<StringBuilder> {
        C11724a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b */
    /* compiled from: BitmapHunter */
    static class C11725b extends C11768u {
        C11725b() {
        }

        /* renamed from: c */
        public boolean mo48661c(C11764s sVar) {
            return true;
        }

        /* renamed from: f */
        public C11768u.C11769a mo48662f(C11764s sVar, int i) {
            throw new IllegalStateException("Unrecognized type of request: " + sVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    /* compiled from: BitmapHunter */
    static class C11726c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13697d f18225b;

        /* renamed from: c */
        final /* synthetic */ RuntimeException f18226c;

        C11726c(C13697d dVar, RuntimeException runtimeException) {
            this.f18225b = dVar;
            this.f18226c = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f18225b.key() + " crashed with exception.", this.f18226c);
        }
    }

    /* renamed from: com.squareup.picasso.c$d */
    /* compiled from: BitmapHunter */
    static class C11727d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ StringBuilder f18227b;

        C11727d(StringBuilder sb) {
            this.f18227b = sb;
        }

        public void run() {
            throw new NullPointerException(this.f18227b.toString());
        }
    }

    /* renamed from: com.squareup.picasso.c$e */
    /* compiled from: BitmapHunter */
    static class C11728e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13697d f18228b;

        C11728e(C13697d dVar) {
            this.f18228b = dVar;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f18228b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* renamed from: com.squareup.picasso.c$f */
    /* compiled from: BitmapHunter */
    static class C11729f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C13697d f18229b;

        C11729f(C13697d dVar) {
            this.f18229b = dVar;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f18229b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    C11723c(C11751p pVar, C11733g gVar, C13694a aVar, C11771w wVar, C11720a aVar2, C11768u uVar) {
        this.f18207c = pVar;
        this.f18208d = gVar;
        this.f18209e = aVar;
        this.f18210f = wVar;
        this.f18216l = aVar2;
        this.f18211g = aVar2.mo48651d();
        this.f18212h = aVar2.mo48656i();
        this.f18224t = aVar2.mo48655h();
        this.f18213i = aVar2.mo48652e();
        this.f18214j = aVar2.mo48653f();
        this.f18215k = uVar;
        this.f18223s = uVar.mo48732e();
    }

    /* renamed from: a */
    static Bitmap m25137a(List<C13697d> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C13697d dVar = list.get(i);
            try {
                Bitmap a = dVar.mo53363a(bitmap);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(dVar.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C13697d key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    C11751p.f18287o.post(new C11727d(sb));
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C11751p.f18287o.post(new C11728e(dVar));
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C11751p.f18287o.post(new C11729f(dVar));
                    return null;
                }
            } catch (RuntimeException e) {
                C11751p.f18287o.post(new C11726c(dVar, e));
                return null;
            }
        }
        return bitmap;
    }

    /* renamed from: d */
    private C11751p.C11758f m25138d() {
        boolean z;
        C11751p.C11758f fVar = C11751p.C11758f.LOW;
        List<C11720a> list = this.f18217m;
        boolean z2 = true;
        if (list == null || list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        C11720a aVar = this.f18216l;
        if (aVar == null && !z) {
            z2 = false;
        }
        if (!z2) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.mo48655h();
        }
        if (z) {
            int size = this.f18217m.size();
            for (int i = 0; i < size; i++) {
                C11751p.C11758f h = this.f18217m.get(i).mo48655h();
                if (h.ordinal() > fVar.ordinal()) {
                    fVar = h;
                }
            }
        }
        return fVar;
    }

    /* renamed from: e */
    static Bitmap m25139e(C13179y0 y0Var, C11764s sVar) {
        C13130e d = C13145j0.m29739d(y0Var);
        boolean r = C11774x.m25312r(d);
        boolean z = sVar.f18353r;
        BitmapFactory.Options d2 = C11768u.m25268d(sVar);
        boolean g = C11768u.m25269g(d2);
        if (!r) {
            InputStream r0 = d.mo52540r0();
            if (g) {
                C11743k kVar = new C11743k(r0);
                kVar.mo48720a(false);
                long c = kVar.mo48723c(1024);
                BitmapFactory.decodeStream(kVar, (Rect) null, d2);
                C11768u.m25267b(sVar.f18343h, sVar.f18344i, d2, sVar);
                kVar.mo48722b(c);
                kVar.mo48720a(true);
                r0 = kVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(r0, (Rect) null, d2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] s = d.mo52548s();
        if (g) {
            BitmapFactory.decodeByteArray(s, 0, s.length, d2);
            C11768u.m25267b(sVar.f18343h, sVar.f18344i, d2, sVar);
        }
        return BitmapFactory.decodeByteArray(s, 0, s.length, d2);
    }

    /* renamed from: g */
    static C11723c m25140g(C11751p pVar, C11733g gVar, C13694a aVar, C11771w wVar, C11720a aVar2) {
        C11764s i = aVar2.mo48656i();
        List<C11768u> h = pVar.mo48741h();
        int size = h.size();
        for (int i2 = 0; i2 < size; i2++) {
            C11768u uVar = h.get(i2);
            if (uVar.mo48661c(i)) {
                return new C11723c(pVar, gVar, aVar, wVar, aVar2, uVar);
            }
        }
        return new C11723c(pVar, gVar, aVar, wVar, aVar2, f18205x);
    }

    /* renamed from: l */
    static int m25141l(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: m */
    static int m25142m(int i) {
        if (i == 2 || i == 7 || i == 4 || i == 5) {
            return -1;
        }
        return 1;
    }

    /* renamed from: v */
    private static boolean m25143v(boolean z, int i, int i2, int i3, int i4) {
        if (!z || ((i3 != 0 && i > i3) || (i4 != 0 && i2 > i4))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024f  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m25144y(com.squareup.picasso.C11764s r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            int r1 = r27.getWidth()
            int r2 = r27.getHeight()
            boolean r3 = r0.f18348m
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            boolean r4 = r26.mo48765e()
            if (r4 != 0) goto L_0x001f
            if (r28 == 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            r3 = r1
            r5 = r2
            r0 = r9
            goto L_0x023b
        L_0x001f:
            int r4 = r0.f18343h
            int r6 = r0.f18344i
            float r7 = r0.f18349n
            r8 = 0
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0130
            double r10 = (double) r7
            double r12 = java.lang.Math.toRadians(r10)
            double r12 = java.lang.Math.cos(r12)
            double r10 = java.lang.Math.toRadians(r10)
            double r10 = java.lang.Math.sin(r10)
            boolean r4 = r0.f18352q
            if (r4 == 0) goto L_0x00c9
            float r4 = r0.f18350o
            float r6 = r0.f18351p
            r9.setRotate(r7, r4, r6)
            float r4 = r0.f18350o
            double r6 = (double) r4
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 - r12
            double r6 = r6 * r14
            float r8 = r0.f18351p
            r16 = r2
            r17 = r3
            double r2 = (double) r8
            double r2 = r2 * r10
            double r6 = r6 + r2
            double r2 = (double) r8
            double r2 = r2 * r14
            double r14 = (double) r4
            double r14 = r14 * r10
            double r2 = r2 - r14
            int r4 = r0.f18343h
            double r14 = (double) r4
            double r14 = r14 * r12
            double r14 = r14 + r6
            r18 = r6
            double r5 = (double) r4
            double r5 = r5 * r10
            double r5 = r5 + r2
            r20 = r9
            double r8 = (double) r4
            double r8 = r8 * r12
            double r7 = r18 + r8
            int r9 = r0.f18344i
            r22 = r1
            double r0 = (double) r9
            double r0 = r0 * r10
            double r7 = r7 - r0
            double r0 = (double) r4
            double r0 = r0 * r10
            double r0 = r0 + r2
            r23 = r5
            double r4 = (double) r9
            double r4 = r4 * r12
            double r0 = r0 + r4
            double r4 = (double) r9
            double r4 = r4 * r10
            double r4 = r18 - r4
            double r9 = (double) r9
            double r9 = r9 * r12
            double r9 = r9 + r2
            r11 = r18
            r18 = r9
            double r9 = java.lang.Math.max(r11, r14)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r4, r9)
            double r11 = java.lang.Math.min(r11, r14)
            double r6 = java.lang.Math.min(r7, r11)
            double r4 = java.lang.Math.min(r4, r6)
            r6 = r23
            double r11 = java.lang.Math.max(r2, r6)
            double r11 = java.lang.Math.max(r0, r11)
            r13 = r18
            double r11 = java.lang.Math.max(r13, r11)
            double r2 = java.lang.Math.min(r2, r6)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r9 = r9 - r4
            double r2 = java.lang.Math.floor(r9)
            int r4 = (int) r2
            double r11 = r11 - r0
            double r0 = java.lang.Math.floor(r11)
            int r6 = (int) r0
            r0 = r20
            goto L_0x0137
        L_0x00c9:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
            r0.setRotate(r7)
            r1 = r26
            int r2 = r1.f18343h
            double r3 = (double) r2
            double r3 = r3 * r12
            double r5 = (double) r2
            double r5 = r5 * r10
            double r7 = (double) r2
            double r7 = r7 * r12
            int r9 = r1.f18344i
            double r14 = (double) r9
            double r14 = r14 * r10
            double r7 = r7 - r14
            double r14 = (double) r2
            double r14 = r14 * r10
            double r1 = (double) r9
            double r1 = r1 * r12
            double r14 = r14 + r1
            double r1 = (double) r9
            double r1 = r1 * r10
            double r1 = -r1
            double r9 = (double) r9
            double r9 = r9 * r12
            r11 = 0
            r18 = r9
            double r9 = java.lang.Math.max(r11, r3)
            double r9 = java.lang.Math.max(r7, r9)
            double r9 = java.lang.Math.max(r1, r9)
            double r3 = java.lang.Math.min(r11, r3)
            double r3 = java.lang.Math.min(r7, r3)
            double r1 = java.lang.Math.min(r1, r3)
            double r3 = java.lang.Math.max(r11, r5)
            double r3 = java.lang.Math.max(r14, r3)
            r7 = r18
            double r3 = java.lang.Math.max(r7, r3)
            double r5 = java.lang.Math.min(r11, r5)
            double r5 = java.lang.Math.min(r14, r5)
            double r5 = java.lang.Math.min(r7, r5)
            double r9 = r9 - r1
            double r1 = java.lang.Math.floor(r9)
            int r1 = (int) r1
            double r3 = r3 - r5
            double r2 = java.lang.Math.floor(r3)
            int r6 = (int) r2
            r4 = r1
            goto L_0x0137
        L_0x0130:
            r22 = r1
            r16 = r2
            r17 = r3
            r0 = r9
        L_0x0137:
            if (r28 == 0) goto L_0x015d
            int r1 = m25141l(r28)
            int r2 = m25142m(r28)
            if (r1 == 0) goto L_0x0154
            float r3 = (float) r1
            r0.preRotate(r3)
            r3 = 90
            if (r1 == r3) goto L_0x014f
            r3 = 270(0x10e, float:3.78E-43)
            if (r1 != r3) goto L_0x0154
        L_0x014f:
            r25 = r6
            r6 = r4
            r4 = r25
        L_0x0154:
            r1 = 1
            if (r2 == r1) goto L_0x015d
            float r1 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r1, r2)
        L_0x015d:
            r1 = r26
            boolean r2 = r1.f18345j
            if (r2 == 0) goto L_0x01f0
            if (r4 == 0) goto L_0x016d
            float r2 = (float) r4
            r3 = r22
            float r5 = (float) r3
            float r2 = r2 / r5
            r5 = r16
            goto L_0x0174
        L_0x016d:
            r3 = r22
            float r2 = (float) r6
            r5 = r16
            float r7 = (float) r5
            float r2 = r2 / r7
        L_0x0174:
            if (r6 == 0) goto L_0x0179
            float r7 = (float) r6
            float r8 = (float) r5
            goto L_0x017b
        L_0x0179:
            float r7 = (float) r4
            float r8 = (float) r3
        L_0x017b:
            float r7 = r7 / r8
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x01aa
            float r8 = (float) r5
            float r7 = r7 / r2
            float r8 = r8 * r7
            double r7 = (double) r8
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r1 = r1.f18346k
            r8 = r1 & 48
            r9 = 48
            if (r8 != r9) goto L_0x0193
            r1 = 0
            goto L_0x019f
        L_0x0193:
            r8 = 80
            r1 = r1 & r8
            if (r1 != r8) goto L_0x019b
            int r1 = r5 - r7
            goto L_0x019f
        L_0x019b:
            int r1 = r5 - r7
            int r1 = r1 / 2
        L_0x019f:
            float r8 = (float) r6
            float r9 = (float) r7
            float r8 = r8 / r9
            r9 = r7
            r10 = r17
            r21 = 0
            r7 = r1
            r1 = r3
            goto L_0x01e1
        L_0x01aa:
            int r8 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x01d8
            float r8 = (float) r3
            float r2 = r2 / r7
            float r8 = r8 * r2
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r2 = (int) r8
            int r1 = r1.f18346k
            r8 = r1 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01c0
            r1 = 0
            goto L_0x01cb
        L_0x01c0:
            r8 = 5
            r1 = r1 & r8
            if (r1 != r8) goto L_0x01c7
            int r1 = r3 - r2
            goto L_0x01cb
        L_0x01c7:
            int r1 = r3 - r2
            int r1 = r1 / 2
        L_0x01cb:
            float r8 = (float) r4
            float r9 = (float) r2
            float r8 = r8 / r9
            r21 = r1
            r1 = r2
            r9 = r5
            r2 = r8
            r10 = r17
            r8 = r7
            r7 = 0
            goto L_0x01e1
        L_0x01d8:
            r1 = r3
            r9 = r5
            r2 = r7
            r8 = r2
            r10 = r17
            r7 = 0
            r21 = 0
        L_0x01e1:
            boolean r3 = m25143v(r10, r3, r5, r4, r6)
            if (r3 == 0) goto L_0x01ea
            r0.preScale(r2, r8)
        L_0x01ea:
            r6 = r7
            r8 = r9
            r5 = r21
            r7 = r1
            goto L_0x023f
        L_0x01f0:
            r5 = r16
            r10 = r17
            r3 = r22
            boolean r1 = r1.f18347l
            if (r1 == 0) goto L_0x021a
            if (r4 == 0) goto L_0x01ff
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0201
        L_0x01ff:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0201:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x0207
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0209
        L_0x0207:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0209:
            float r2 = r2 / r7
            int r7 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x020f
            goto L_0x0210
        L_0x020f:
            r1 = r2
        L_0x0210:
            boolean r2 = m25143v(r10, r3, r5, r4, r6)
            if (r2 == 0) goto L_0x023b
            r0.preScale(r1, r1)
            goto L_0x023b
        L_0x021a:
            if (r4 != 0) goto L_0x021e
            if (r6 == 0) goto L_0x023b
        L_0x021e:
            if (r4 != r3) goto L_0x0222
            if (r6 == r5) goto L_0x023b
        L_0x0222:
            if (r4 == 0) goto L_0x0227
            float r1 = (float) r4
            float r2 = (float) r3
            goto L_0x0229
        L_0x0227:
            float r1 = (float) r6
            float r2 = (float) r5
        L_0x0229:
            float r1 = r1 / r2
            if (r6 == 0) goto L_0x022f
            float r2 = (float) r6
            float r7 = (float) r5
            goto L_0x0231
        L_0x022f:
            float r2 = (float) r4
            float r7 = (float) r3
        L_0x0231:
            float r2 = r2 / r7
            boolean r4 = m25143v(r10, r3, r5, r4, r6)
            if (r4 == 0) goto L_0x023b
            r0.preScale(r1, r2)
        L_0x023b:
            r7 = r3
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x023f:
            r10 = 1
            r4 = r27
            r9 = r0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)
            r1 = r27
            if (r0 == r1) goto L_0x024f
            r27.recycle()
            goto L_0x0250
        L_0x024f:
            r0 = r1
        L_0x0250:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C11723c.m25144y(com.squareup.picasso.s, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: z */
    static void m25145z(C11764s sVar) {
        String a = sVar.mo48761a();
        StringBuilder sb = f18203v.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo48663b(C11720a aVar) {
        boolean z = this.f18207c.f18301m;
        C11764s sVar = aVar.f18186b;
        if (this.f18216l == null) {
            this.f18216l = aVar;
            if (z) {
                List<C11720a> list = this.f18217m;
                if (list == null || list.isEmpty()) {
                    C11774x.m25314t("Hunter", "joined", sVar.mo48764d(), "to empty hunter");
                } else {
                    C11774x.m25314t("Hunter", "joined", sVar.mo48764d(), C11774x.m25305k(this, "to "));
                }
            }
        } else {
            if (this.f18217m == null) {
                this.f18217m = new ArrayList(3);
            }
            this.f18217m.add(aVar);
            if (z) {
                C11774x.m25314t("Hunter", "joined", sVar.mo48764d(), C11774x.m25305k(this, "to "));
            }
            C11751p.C11758f h = aVar.mo48655h();
            if (h.ordinal() > this.f18224t.ordinal()) {
                this.f18224t = h;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo48664c() {
        Future<?> future;
        if (this.f18216l != null) {
            return false;
        }
        List<C11720a> list = this.f18217m;
        if ((list == null || list.isEmpty()) && (future = this.f18219o) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo48665f(C11720a aVar) {
        boolean z;
        if (this.f18216l == aVar) {
            this.f18216l = null;
            z = true;
        } else {
            List<C11720a> list = this.f18217m;
            if (list != null) {
                z = list.remove(aVar);
            } else {
                z = false;
            }
        }
        if (z && aVar.mo48655h() == this.f18224t) {
            this.f18224t = m25138d();
        }
        if (this.f18207c.f18301m) {
            C11774x.m25314t("Hunter", "removed", aVar.f18186b.mo48764d(), C11774x.m25305k(this, "from "));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C11720a mo48666h() {
        return this.f18216l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public List<C11720a> mo48667i() {
        return this.f18217m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C11764s mo48668j() {
        return this.f18212h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Exception mo48669k() {
        return this.f18221q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public String mo48670n() {
        return this.f18211g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C11751p.C11757e mo48671o() {
        return this.f18220p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo48672p() {
        return this.f18213i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C11751p mo48673q() {
        return this.f18207c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C11751p.C11758f mo48674r() {
        return this.f18224t;
    }

    public void run() {
        try {
            m25145z(this.f18212h);
            if (this.f18207c.f18301m) {
                C11774x.m25313s("Hunter", "executing", C11774x.m25304j(this));
            }
            Bitmap t = mo48677t();
            this.f18218n = t;
            if (t == null) {
                this.f18208d.mo48695e(this);
            } else {
                this.f18208d.mo48694d(this);
            }
        } catch (C11747n.C11749b e) {
            if (!NetworkPolicy.m25118a(e.f18283c) || e.f18282b != 504) {
                this.f18221q = e;
            }
            this.f18208d.mo48695e(this);
        } catch (IOException e2) {
            this.f18221q = e2;
            this.f18208d.mo48697g(this);
        } catch (OutOfMemoryError e3) {
            StringWriter stringWriter = new StringWriter();
            this.f18210f.mo48782a().mo53361a(new PrintWriter(stringWriter));
            this.f18221q = new RuntimeException(stringWriter.toString(), e3);
            this.f18208d.mo48695e(this);
        } catch (Exception e4) {
            this.f18221q = e4;
            this.f18208d.mo48695e(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Bitmap mo48676s() {
        return this.f18218n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public Bitmap mo48677t() {
        Bitmap bitmap;
        int i;
        if (C11746m.m25215a(this.f18213i)) {
            bitmap = this.f18209e.get(this.f18211g);
            if (bitmap != null) {
                this.f18210f.mo48785d();
                this.f18220p = C11751p.C11757e.MEMORY;
                if (this.f18207c.f18301m) {
                    C11774x.m25314t("Hunter", "decoded", this.f18212h.mo48764d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        if (this.f18223s == 0) {
            i = NetworkPolicy.OFFLINE.f18183b;
        } else {
            i = this.f18214j;
        }
        this.f18214j = i;
        C11768u.C11769a f = this.f18215k.mo48662f(this.f18212h, i);
        if (f != null) {
            this.f18220p = f.mo48780c();
            this.f18222r = f.mo48779b();
            bitmap = f.mo48778a();
            if (bitmap == null) {
                C13179y0 d = f.mo48781d();
                try {
                    bitmap = m25139e(d, this.f18212h);
                } finally {
                    try {
                        d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f18207c.f18301m) {
                C11774x.m25313s("Hunter", "decoded", this.f18212h.mo48764d());
            }
            this.f18210f.mo48783b(bitmap);
            if (this.f18212h.mo48766f() || this.f18222r != 0) {
                synchronized (f18202u) {
                    if (this.f18212h.mo48765e() || this.f18222r != 0) {
                        bitmap = m25144y(this.f18212h, bitmap, this.f18222r);
                        if (this.f18207c.f18301m) {
                            C11774x.m25313s("Hunter", "transformed", this.f18212h.mo48764d());
                        }
                    }
                    if (this.f18212h.mo48762b()) {
                        bitmap = m25137a(this.f18212h.f18342g, bitmap);
                        if (this.f18207c.f18301m) {
                            C11774x.m25314t("Hunter", "transformed", this.f18212h.mo48764d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f18210f.mo48784c(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo48678u() {
        Future<?> future = this.f18219o;
        if (future == null || !future.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo48679w(boolean z, NetworkInfo networkInfo) {
        boolean z2;
        int i = this.f18223s;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        this.f18223s = i - 1;
        return this.f18215k.mo48733h(z, networkInfo);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo48680x() {
        return this.f18215k.mo48734i();
    }
}
