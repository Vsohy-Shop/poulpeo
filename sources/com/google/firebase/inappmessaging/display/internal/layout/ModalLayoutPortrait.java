package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p039b8.C2941b;
import p039b8.C2942c;
import p039b8.C2944d;
import p256v7.C10044f;
import p278x7.C10584m;

public class ModalLayoutPortrait extends C6938a {

    /* renamed from: f */
    private C2942c f9184f = new C2942c();

    /* renamed from: g */
    private int f9185g;

    public ModalLayoutPortrait(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: k */
    private boolean m12105k(View view) {
        if (view.getId() == C10044f.body_scroll || view.getId() == C10044f.image_view) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = getVisibleChildren().get(i7);
            FrameLayout.LayoutParams g = mo39812g(view);
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i8 = measuredHeight + paddingTop;
            if ((g.gravity & 1) == 1) {
                int i9 = (i3 - i) / 2;
                int i10 = measuredWidth / 2;
                i5 = i9 - i10;
                i6 = i9 + i10;
            } else {
                i6 = paddingLeft + measuredWidth;
                i5 = paddingLeft;
            }
            C10584m.m22515a("Layout child " + i7);
            C10584m.m22518d("\t(top, bottom)", (float) paddingTop, (float) i8);
            C10584m.m22518d("\t(left, right)", (float) i5, (float) i6);
            view.layout(i5, paddingTop, i6, i8);
            paddingTop += view.getMeasuredHeight();
            if (i7 < size - 1) {
                paddingTop += this.f9185g;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9185g = mo39808c(24);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int b = mo39807b(i);
        int a = mo39806a(i2);
        boolean z = true;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((getVisibleChildren().size() - 1) * this.f9185g);
        this.f9184f.mo28485f(b, a);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            this.f9184f.mo28480a(childAt, m12105k(childAt));
        }
        C10584m.m22515a("Screen dimens: " + getDisplayMetrics());
        C10584m.m22518d("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f = (float) b;
        C10584m.m22518d("Base dimens", f, (float) a);
        for (C2944d e : this.f9184f.mo28484e()) {
            C10584m.m22515a("Pre-measure child");
            e.mo28492e(b, a);
        }
        int d = this.f9184f.mo28483d() + paddingBottom;
        C10584m.m22517c("Total reserved height", (float) paddingBottom);
        C10584m.m22517c("Total desired height", (float) d);
        if (d <= a) {
            z = false;
        }
        C10584m.m22515a("Total height constrained: " + z);
        if (z) {
            this.f9184f.mo28481b((a - paddingBottom) - this.f9184f.mo28482c());
        }
        int i4 = b - paddingRight;
        for (C2944d next : this.f9184f.mo28484e()) {
            C10584m.m22515a("Measuring child");
            C2941b.m2422b(next.mo28490c(), i4, next.mo28489b());
            paddingBottom += mo39810e(next.mo28490c());
        }
        C10584m.m22518d("Measured dims", f, (float) paddingBottom);
        setMeasuredDimension(b, paddingBottom);
    }
}
