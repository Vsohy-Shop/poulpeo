package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.shimmer.b */
/* compiled from: ShimmerDrawable */
public final class C4588b extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f4343a = new C4589a();

    /* renamed from: b */
    private final Paint f4344b;

    /* renamed from: c */
    private final Rect f4345c;

    /* renamed from: d */
    private final Matrix f4346d;
    @Nullable

    /* renamed from: e */
    private ValueAnimator f4347e;
    @Nullable

    /* renamed from: f */
    private C4584a f4348f;

    /* renamed from: com.facebook.shimmer.b$a */
    /* compiled from: ShimmerDrawable */
    class C4589a implements ValueAnimator.AnimatorUpdateListener {
        C4589a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C4588b.this.invalidateSelf();
        }
    }

    public C4588b() {
        Paint paint = new Paint();
        this.f4344b = paint;
        this.f4345c = new Rect();
        this.f4346d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: c */
    private float m5808c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5809f() {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Rect r1 = r19.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.facebook.shimmer.a r3 = r0.f4348f
            if (r3 != 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            int r2 = r3.mo31748d(r2)
            com.facebook.shimmer.a r3 = r0.f4348f
            int r1 = r3.mo31745a(r1)
            com.facebook.shimmer.a r3 = r0.f4348f
            int r4 = r3.f4327g
            r5 = 1
            if (r4 == r5) goto L_0x004c
            int r3 = r3.f4324d
            r4 = 0
            if (r3 == r5) goto L_0x0032
            r6 = 3
            if (r3 != r6) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r5 == 0) goto L_0x0035
            r2 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r4
        L_0x0039:
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r4 = 0
            r5 = 0
            float r6 = (float) r2
            float r7 = (float) r1
            com.facebook.shimmer.a r1 = r0.f4348f
            int[] r8 = r1.f4322b
            float[] r9 = r1.f4321a
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0073
        L_0x004c:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r3 / r4
            float r3 = (float) r1
            float r14 = r3 / r4
            int r1 = java.lang.Math.max(r2, r1)
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 / r3
            float r15 = (float) r1
            com.facebook.shimmer.a r1 = r0.f4348f
            int[] r2 = r1.f4322b
            float[] r1 = r1.f4321a
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r12 = r11
            r16 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0073:
            android.graphics.Paint r1 = r0.f4344b
            r1.setShader(r11)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.C4588b.m5809f():void");
    }

    /* renamed from: g */
    private void m5810g() {
        boolean z;
        if (this.f4348f != null) {
            ValueAnimator valueAnimator = this.f4347e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.f4347e.cancel();
                this.f4347e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C4584a aVar = this.f4348f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (aVar.f4341u / aVar.f4340t)) + 1.0f});
            this.f4347e = ofFloat;
            ofFloat.setRepeatMode(this.f4348f.f4339s);
            this.f4347e.setRepeatCount(this.f4348f.f4338r);
            ValueAnimator valueAnimator2 = this.f4347e;
            C4584a aVar2 = this.f4348f;
            valueAnimator2.setDuration(aVar2.f4340t + aVar2.f4341u);
            this.f4347e.addUpdateListener(this.f4343a);
            if (z) {
                this.f4347e.start();
            }
        }
    }

    /* renamed from: a */
    public boolean mo31774a() {
        ValueAnimator valueAnimator = this.f4347e;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo31775b() {
        C4584a aVar;
        ValueAnimator valueAnimator = this.f4347e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f4348f) != null && aVar.f4336p && getCallback() != null) {
            this.f4347e.start();
        }
    }

    /* renamed from: d */
    public void mo31776d(@Nullable C4584a aVar) {
        PorterDuff.Mode mode;
        this.f4348f = aVar;
        if (aVar != null) {
            Paint paint = this.f4344b;
            if (this.f4348f.f4337q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        m5809f();
        m5810g();
        invalidateSelf();
    }

    public void draw(@NonNull Canvas canvas) {
        float f;
        float f2;
        float c;
        if (this.f4348f != null && this.f4344b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f4348f.f4334n));
            float height = ((float) this.f4345c.height()) + (((float) this.f4345c.width()) * tan);
            float width = ((float) this.f4345c.width()) + (tan * ((float) this.f4345c.height()));
            ValueAnimator valueAnimator = this.f4347e;
            float f3 = 0.0f;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f4348f.f4324d;
            if (i != 1) {
                if (i == 2) {
                    c = m5808c(width, -width, f);
                } else if (i != 3) {
                    c = m5808c(-width, width, f);
                } else {
                    f2 = m5808c(height, -height, f);
                }
                f3 = c;
                f2 = 0.0f;
            } else {
                f2 = m5808c(-height, height, f);
            }
            this.f4346d.reset();
            this.f4346d.setRotate(this.f4348f.f4334n, ((float) this.f4345c.width()) / 2.0f, ((float) this.f4345c.height()) / 2.0f);
            this.f4346d.postTranslate(f3, f2);
            this.f4344b.getShader().setLocalMatrix(this.f4346d);
            canvas.drawRect(this.f4345c, this.f4344b);
        }
    }

    /* renamed from: e */
    public void mo31778e() {
        if (this.f4347e != null && mo31774a()) {
            this.f4347e.cancel();
        }
    }

    public int getOpacity() {
        C4584a aVar = this.f4348f;
        if (aVar == null || (!aVar.f4335o && !aVar.f4337q)) {
            return -1;
        }
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4345c.set(0, 0, rect.width(), rect.height());
        m5809f();
        mo31775b();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
