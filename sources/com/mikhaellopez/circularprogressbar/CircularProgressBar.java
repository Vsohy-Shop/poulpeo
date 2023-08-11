package com.mikhaellopez.circularprogressbar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.ViewCompat;
import p279x8.C10596a;
import p279x8.C10597b;

public class CircularProgressBar extends View {

    /* renamed from: b */
    private float f9868b = 0.0f;

    /* renamed from: c */
    private float f9869c = getResources().getDimension(C10596a.default_stroke_width);

    /* renamed from: d */
    private float f9870d = getResources().getDimension(C10596a.default_background_stroke_width);

    /* renamed from: e */
    private int f9871e = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: f */
    private int f9872f = -7829368;

    /* renamed from: g */
    private int f9873g = -90;

    /* renamed from: h */
    private RectF f9874h;

    /* renamed from: i */
    private Paint f9875i;

    /* renamed from: j */
    private Paint f9876j;

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13960a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m13960a(Context context, AttributeSet attributeSet) {
        this.f9874h = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10597b.f16146a, 0, 0);
        try {
            this.f9868b = obtainStyledAttributes.getFloat(C10597b.f16149d, this.f9868b);
            this.f9869c = obtainStyledAttributes.getDimension(C10597b.f16151f, this.f9869c);
            this.f9870d = obtainStyledAttributes.getDimension(C10597b.f16148c, this.f9870d);
            this.f9871e = obtainStyledAttributes.getInt(C10597b.f16150e, this.f9871e);
            this.f9872f = obtainStyledAttributes.getInt(C10597b.f16147b, this.f9872f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f9875i = paint;
            paint.setColor(this.f9872f);
            this.f9875i.setStyle(Paint.Style.STROKE);
            this.f9875i.setStrokeWidth(this.f9870d);
            Paint paint2 = new Paint(1);
            this.f9876j = paint2;
            paint2.setColor(this.f9871e);
            this.f9876j.setStyle(Paint.Style.STROKE);
            this.f9876j.setStrokeWidth(this.f9869c);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo40730b(float f, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", new float[]{f});
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }

    public int getBackgroundColor() {
        return this.f9872f;
    }

    public float getBackgroundProgressBarWidth() {
        return this.f9870d;
    }

    public int getColor() {
        return this.f9871e;
    }

    public float getProgress() {
        return this.f9868b;
    }

    public float getProgressBarWidth() {
        return this.f9869c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f9874h, this.f9875i);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f9874h, (float) this.f9873g, (this.f9868b * 360.0f) / 100.0f, false, this.f9876j);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.f9869c;
        float f2 = this.f9870d;
        if (f <= f2) {
            f = f2;
        }
        float f3 = f / 2.0f;
        float f4 = 0.0f + f3;
        float f5 = ((float) min) - f3;
        this.f9874h.set(f4, f4, f5, f5);
    }

    public void setBackgroundColor(int i) {
        this.f9872f = i;
        this.f9875i.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setBackgroundProgressBarWidth(float f) {
        this.f9870d = f;
        this.f9875i.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public void setColor(int i) {
        this.f9871e = i;
        this.f9876j.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setProgress(float f) {
        if (f > 100.0f) {
            f = 100.0f;
        }
        this.f9868b = f;
        invalidate();
    }

    public void setProgressBarWidth(float f) {
        this.f9869c = f;
        this.f9876j.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        mo40730b(f, 1500);
    }
}
