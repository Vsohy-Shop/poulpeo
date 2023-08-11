package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
class OuterHighlightDrawable extends Drawable {

    /* renamed from: a */
    private final Paint f4626a;

    /* renamed from: b */
    private float f4627b;

    /* renamed from: c */
    private float f4628c;

    /* renamed from: d */
    private float f4629d;

    /* renamed from: e */
    private float f4630e;

    /* renamed from: f */
    private float f4631f;

    /* renamed from: g */
    private float f4632g;

    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f4629d + this.f4631f, this.f4630e + this.f4632g, this.f4627b * this.f4628c, this.f4626a);
    }

    public final int getAlpha() {
        return this.f4626a.getAlpha();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f4626a.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f4626a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Keep
    public void setScale(float f) {
        this.f4628c = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationX(float f) {
        this.f4631f = f;
        invalidateSelf();
    }

    @Keep
    public void setTranslationY(float f) {
        this.f4632g = f;
        invalidateSelf();
    }
}
