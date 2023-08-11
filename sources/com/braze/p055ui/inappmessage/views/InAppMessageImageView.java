package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2103b;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageImageView */
/* compiled from: InAppMessageImageView.kt */
public final class InAppMessageImageView extends ImageView implements C4336a {

    /* renamed from: b */
    private Path f3619b = new Path();

    /* renamed from: c */
    private RectF f3620c = new RectF();

    /* renamed from: d */
    private float[] f3621d;

    /* renamed from: e */
    private float f3622e = -1.0f;

    /* renamed from: f */
    private boolean f3623f;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageImageView$a */
    /* compiled from: InAppMessageImageView.kt */
    static final class C4332a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4332a f3624g = new C4332a();

        C4332a() {
            super(0);
        }

        public final String invoke() {
            return "In-app message radii is uninitialized, not clipping path.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageImageView$b */
    /* compiled from: InAppMessageImageView.kt */
    static final class C4333b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4333b f3625g = new C4333b();

        C4333b() {
            super(0);
        }

        public final String invoke() {
            return "Encountered exception while trying to clip in-app message image";
        }
    }

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAdjustViewBounds(true);
    }

    /* renamed from: a */
    public void mo31097a(float f, float f2, float f3, float f4) {
        this.f3621d = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    /* renamed from: b */
    public final boolean mo31098b(Canvas canvas, int i, int i2) {
        C12775o.m28639i(canvas, "canvas");
        if (this.f3621d == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4332a.f3624g, 7, (Object) null);
            return false;
        }
        try {
            this.f3619b.reset();
            this.f3620c.set(0.0f, 0.0f, (float) i, (float) i2);
            this.f3619b.addRoundRect(this.f3620c, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.f3619b);
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4333b.f3625g, 4, (Object) null);
            return false;
        }
    }

    public final Path getClipPath() {
        return this.f3619b;
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.f3621d;
        if (fArr != null) {
            return fArr;
        }
        C12775o.m28656z("inAppRadii");
        return null;
    }

    public final RectF getRectf() {
        return this.f3620c;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        mo31098b(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.f3622e == -1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z || getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (((float) measuredWidth) / this.f3622e)) + 1);
        }
        if (this.f3623f) {
            ViewParent parent = getParent();
            if (parent != null) {
                setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) parent).getHeight()) * 0.5d));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    public void setAspectRatio(float f) {
        this.f3622e = f;
        requestLayout();
    }

    public final void setClipPath(Path path) {
        C12775o.m28639i(path, "<set-?>");
        this.f3619b = path;
    }

    public void setCornersRadiusPx(float f) {
        mo31097a(f, f, f, f);
    }

    public void setInAppMessageImageCropType(C2103b bVar) {
        if (bVar == C2103b.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (bVar == C2103b.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(RectF rectF) {
        C12775o.m28639i(rectF, "<set-?>");
        this.f3620c = rectF;
    }

    public void setToHalfParentHeight(boolean z) {
        this.f3623f = z;
        requestLayout();
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }
}
