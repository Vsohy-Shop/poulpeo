package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
class InnerZoneDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f4617a;

    /* renamed from: b */
    private final Paint f4618b;

    /* renamed from: c */
    private final int f4619c;

    /* renamed from: d */
    private float f4620d;

    /* renamed from: e */
    private float f4621e;

    /* renamed from: f */
    private float f4622f;

    /* renamed from: g */
    private float f4623g;

    /* renamed from: h */
    private float f4624h;

    /* renamed from: i */
    private float f4625i;

    public final void draw(Canvas canvas) {
        float f = this.f4625i;
        if (f > 0.0f) {
            float f2 = this.f4620d;
            float f3 = this.f4624h;
            this.f4618b.setAlpha((int) (((float) this.f4619c) * f));
            canvas.drawCircle(this.f4622f, this.f4623g, f2 * f3, this.f4618b);
        }
        canvas.drawCircle(this.f4622f, this.f4623g, this.f4620d * this.f4621e, this.f4617a);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f4617a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f4617a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setPulseAlpha(float f) {
        this.f4625i = f;
        invalidateSelf();
    }

    @Keep
    public void setPulseScale(float f) {
        this.f4624h = f;
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f4621e = f;
        invalidateSelf();
    }
}
