package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
import androidx.annotation.C0127Px;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.core.view.ViewCompat;
import p084f3.C7570a;

/* renamed from: com.facebook.shimmer.a */
/* compiled from: Shimmer */
public class C4584a {

    /* renamed from: a */
    final float[] f4321a = new float[4];

    /* renamed from: b */
    final int[] f4322b = new int[4];

    /* renamed from: c */
    final RectF f4323c = new RectF();

    /* renamed from: d */
    int f4324d = 0;
    @ColorInt

    /* renamed from: e */
    int f4325e = -1;
    @ColorInt

    /* renamed from: f */
    int f4326f = 1291845631;

    /* renamed from: g */
    int f4327g = 0;

    /* renamed from: h */
    int f4328h = 0;

    /* renamed from: i */
    int f4329i = 0;

    /* renamed from: j */
    float f4330j = 1.0f;

    /* renamed from: k */
    float f4331k = 1.0f;

    /* renamed from: l */
    float f4332l = 0.0f;

    /* renamed from: m */
    float f4333m = 0.5f;

    /* renamed from: n */
    float f4334n = 20.0f;

    /* renamed from: o */
    boolean f4335o = true;

    /* renamed from: p */
    boolean f4336p = true;

    /* renamed from: q */
    boolean f4337q = true;

    /* renamed from: r */
    int f4338r = -1;

    /* renamed from: s */
    int f4339s = 1;

    /* renamed from: t */
    long f4340t = 1000;

    /* renamed from: u */
    long f4341u;

    /* renamed from: com.facebook.shimmer.a$b */
    /* compiled from: Shimmer */
    public static abstract class C4586b<T extends C4586b<T>> {

        /* renamed from: a */
        final C4584a f4342a = new C4584a();

        /* renamed from: b */
        private static float m5781b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        /* renamed from: a */
        public C4584a mo31751a() {
            this.f4342a.mo31746b();
            this.f4342a.mo31747c();
            return this.f4342a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public T mo31752c(TypedArray typedArray) {
            int i = C7570a.f10529e;
            if (typedArray.hasValue(i)) {
                mo31755g(typedArray.getBoolean(i, this.f4342a.f4335o));
            }
            int i2 = C7570a.f10526b;
            if (typedArray.hasValue(i2)) {
                mo31753e(typedArray.getBoolean(i2, this.f4342a.f4336p));
            }
            int i3 = C7570a.f10527c;
            if (typedArray.hasValue(i3)) {
                mo31754f(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = C7570a.f10537m;
            if (typedArray.hasValue(i4)) {
                mo31762n(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = C7570a.f10533i;
            if (typedArray.hasValue(i5)) {
                mo31758j((long) typedArray.getInt(i5, (int) this.f4342a.f4340t));
            }
            int i6 = C7570a.f10540p;
            if (typedArray.hasValue(i6)) {
                mo31764p(typedArray.getInt(i6, this.f4342a.f4338r));
            }
            int i7 = C7570a.f10541q;
            if (typedArray.hasValue(i7)) {
                mo31765q((long) typedArray.getInt(i7, (int) this.f4342a.f4341u));
            }
            int i8 = C7570a.f10542r;
            if (typedArray.hasValue(i8)) {
                mo31766r(typedArray.getInt(i8, this.f4342a.f4339s));
            }
            int i9 = C7570a.f10531g;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.f4342a.f4324d);
                if (i10 == 1) {
                    mo31756h(1);
                } else if (i10 == 2) {
                    mo31756h(2);
                } else if (i10 != 3) {
                    mo31756h(0);
                } else {
                    mo31756h(3);
                }
            }
            int i11 = C7570a.f10543s;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.f4342a.f4327g) != 1) {
                    mo31767s(0);
                } else {
                    mo31767s(1);
                }
            }
            int i12 = C7570a.f10532h;
            if (typedArray.hasValue(i12)) {
                mo31757i(typedArray.getFloat(i12, this.f4342a.f4333m));
            }
            int i13 = C7570a.f10535k;
            if (typedArray.hasValue(i13)) {
                mo31760l(typedArray.getDimensionPixelSize(i13, this.f4342a.f4328h));
            }
            int i14 = C7570a.f10534j;
            if (typedArray.hasValue(i14)) {
                mo31759k(typedArray.getDimensionPixelSize(i14, this.f4342a.f4329i));
            }
            int i15 = C7570a.f10539o;
            if (typedArray.hasValue(i15)) {
                mo31763o(typedArray.getFloat(i15, this.f4342a.f4332l));
            }
            int i16 = C7570a.f10545u;
            if (typedArray.hasValue(i16)) {
                mo31769u(typedArray.getFloat(i16, this.f4342a.f4330j));
            }
            int i17 = C7570a.f10536l;
            if (typedArray.hasValue(i17)) {
                mo31761m(typedArray.getFloat(i17, this.f4342a.f4331k));
            }
            int i18 = C7570a.f10544t;
            if (typedArray.hasValue(i18)) {
                mo31768t(typedArray.getFloat(i18, this.f4342a.f4334n));
            }
            return mo31749d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract T mo31749d();

        /* renamed from: e */
        public T mo31753e(boolean z) {
            this.f4342a.f4336p = z;
            return mo31749d();
        }

        /* renamed from: f */
        public T mo31754f(@FloatRange(from = 0.0d, mo636to = 1.0d) float f) {
            C4584a aVar = this.f4342a;
            aVar.f4326f = (((int) (m5781b(0.0f, 1.0f, f) * 255.0f)) << 24) | (aVar.f4326f & ViewCompat.MEASURED_SIZE_MASK);
            return mo31749d();
        }

        /* renamed from: g */
        public T mo31755g(boolean z) {
            this.f4342a.f4335o = z;
            return mo31749d();
        }

        /* renamed from: h */
        public T mo31756h(int i) {
            this.f4342a.f4324d = i;
            return mo31749d();
        }

        /* renamed from: i */
        public T mo31757i(float f) {
            if (f >= 0.0f) {
                this.f4342a.f4333m = f;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        /* renamed from: j */
        public T mo31758j(long j) {
            if (j >= 0) {
                this.f4342a.f4340t = j;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given a negative duration: " + j);
        }

        /* renamed from: k */
        public T mo31759k(@C0127Px int i) {
            if (i >= 0) {
                this.f4342a.f4329i = i;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid height: " + i);
        }

        /* renamed from: l */
        public T mo31760l(@C0127Px int i) {
            if (i >= 0) {
                this.f4342a.f4328h = i;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid width: " + i);
        }

        /* renamed from: m */
        public T mo31761m(float f) {
            if (f >= 0.0f) {
                this.f4342a.f4331k = f;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        /* renamed from: n */
        public T mo31762n(@FloatRange(from = 0.0d, mo636to = 1.0d) float f) {
            C4584a aVar = this.f4342a;
            aVar.f4325e = (((int) (m5781b(0.0f, 1.0f, f) * 255.0f)) << 24) | (aVar.f4325e & ViewCompat.MEASURED_SIZE_MASK);
            return mo31749d();
        }

        /* renamed from: o */
        public T mo31763o(float f) {
            if (f >= 0.0f) {
                this.f4342a.f4332l = f;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        /* renamed from: p */
        public T mo31764p(int i) {
            this.f4342a.f4338r = i;
            return mo31749d();
        }

        /* renamed from: q */
        public T mo31765q(long j) {
            if (j >= 0) {
                this.f4342a.f4341u = j;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given a negative repeat delay: " + j);
        }

        /* renamed from: r */
        public T mo31766r(int i) {
            this.f4342a.f4339s = i;
            return mo31749d();
        }

        /* renamed from: s */
        public T mo31767s(int i) {
            this.f4342a.f4327g = i;
            return mo31749d();
        }

        /* renamed from: t */
        public T mo31768t(float f) {
            this.f4342a.f4334n = f;
            return mo31749d();
        }

        /* renamed from: u */
        public T mo31769u(float f) {
            if (f >= 0.0f) {
                this.f4342a.f4330j = f;
                return mo31749d();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    C4584a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31745a(int i) {
        int i2 = this.f4329i;
        if (i2 > 0) {
            return i2;
        }
        return Math.round(this.f4331k * ((float) i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31746b() {
        if (this.f4327g != 1) {
            int[] iArr = this.f4322b;
            int i = this.f4326f;
            iArr[0] = i;
            int i2 = this.f4325e;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.f4322b;
        int i3 = this.f4325e;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.f4326f;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo31747c() {
        if (this.f4327g != 1) {
            this.f4321a[0] = Math.max(((1.0f - this.f4332l) - this.f4333m) / 2.0f, 0.0f);
            this.f4321a[1] = Math.max(((1.0f - this.f4332l) - 0.001f) / 2.0f, 0.0f);
            this.f4321a[2] = Math.min(((this.f4332l + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.f4321a[3] = Math.min(((this.f4332l + 1.0f) + this.f4333m) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.f4321a;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.f4332l, 1.0f);
        this.f4321a[2] = Math.min(this.f4332l + this.f4333m, 1.0f);
        this.f4321a[3] = 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo31748d(int i) {
        int i2 = this.f4328h;
        if (i2 > 0) {
            return i2;
        }
        return Math.round(this.f4330j * ((float) i));
    }

    /* renamed from: com.facebook.shimmer.a$a */
    /* compiled from: Shimmer */
    public static class C4585a extends C4586b<C4585a> {
        public C4585a() {
            this.f4342a.f4337q = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public C4585a mo31749d() {
            return this;
        }
    }

    /* renamed from: com.facebook.shimmer.a$c */
    /* compiled from: Shimmer */
    public static class C4587c extends C4586b<C4587c> {
        public C4587c() {
            this.f4342a.f4337q = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public C4587c mo31752c(TypedArray typedArray) {
            super.mo31752c(typedArray);
            int i = C7570a.f10528d;
            if (typedArray.hasValue(i)) {
                mo31772x(typedArray.getColor(i, this.f4342a.f4326f));
            }
            int i2 = C7570a.f10538n;
            if (typedArray.hasValue(i2)) {
                mo31773y(typedArray.getColor(i2, this.f4342a.f4325e));
            }
            return mo31749d();
        }

        /* renamed from: x */
        public C4587c mo31772x(@ColorInt int i) {
            C4584a aVar = this.f4342a;
            aVar.f4326f = (i & ViewCompat.MEASURED_SIZE_MASK) | (aVar.f4326f & ViewCompat.MEASURED_STATE_MASK);
            return mo31749d();
        }

        /* renamed from: y */
        public C4587c mo31773y(@ColorInt int i) {
            this.f4342a.f4325e = i;
            return mo31749d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public C4587c mo31749d() {
            return this;
        }
    }
}
