package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import p278x7.C10584m;

public class ResizableImageView extends AppCompatImageView {

    /* renamed from: b */
    private int f9160b;

    /* renamed from: com.google.firebase.inappmessaging.display.internal.ResizableImageView$b */
    private static class C6937b {

        /* renamed from: a */
        final int f9161a;

        /* renamed from: b */
        final int f9162b;

        private C6937b(int i, int i2) {
            this.f9161a = i;
            this.f9162b = i2;
        }
    }

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m12103c(context);
    }

    /* renamed from: a */
    private C6937b m12101a(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            C10584m.m22517c("Image: capping width", (float) maxWidth);
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            C10584m.m22517c("Image: capping height", (float) maxHeight);
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new C6937b(i, maxHeight);
    }

    /* renamed from: b */
    private void m12102b() {
        float f;
        int max = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int max2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = (float) max;
        float f3 = (float) max2;
        C10584m.m22518d("Image: min width, height", f2, f3);
        float f4 = (float) measuredWidth;
        float f5 = (float) measuredHeight;
        C10584m.m22518d("Image: actual width, height", f4, f5);
        float f6 = 1.0f;
        if (measuredWidth < max) {
            f = f2 / f4;
        } else {
            f = 1.0f;
        }
        if (measuredHeight < max2) {
            f6 = f3 / f5;
        }
        if (f <= f6) {
            f = f6;
        }
        if (((double) f) > 1.0d) {
            int ceil = (int) Math.ceil((double) (f4 * f));
            int ceil2 = (int) Math.ceil((double) (f5 * f));
            C10584m.m22515a("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + ceil + "x" + ceil2);
            C6937b a = m12101a(ceil, ceil2);
            setMeasuredDimension(a.f9161a, a.f9162b);
        }
    }

    /* renamed from: c */
    private void m12103c(@NonNull Context context) {
        this.f9160b = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    /* renamed from: d */
    private void m12104d(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        C10584m.m22518d("Image: intrinsic width, height", (float) intrinsicWidth, (float) intrinsicHeight);
        C6937b a = m12101a((int) Math.ceil((double) ((intrinsicWidth * this.f9160b) / 160)), (int) Math.ceil((double) ((intrinsicHeight * this.f9160b) / 160)));
        C10584m.m22518d("Image: new target dimensions", (float) a.f9161a, (float) a.f9162b);
        setMeasuredDimension(a.f9161a, a.f9162b);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable != null && adjustViewBounds) {
            m12104d(drawable);
            m12102b();
        }
    }
}
