package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import p039b8.C2941b;
import p256v7.C10044f;
import p278x7.C10584m;

public class ModalLayoutLandscape extends C6938a {

    /* renamed from: f */
    private View f9176f;

    /* renamed from: g */
    private View f9177g;

    /* renamed from: h */
    private View f9178h;

    /* renamed from: i */
    private View f9179i;

    /* renamed from: j */
    private int f9180j;

    /* renamed from: k */
    private int f9181k;

    /* renamed from: l */
    private int f9182l;

    /* renamed from: m */
    private int f9183m;

    public ModalLayoutLandscape(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i8 = this.f9182l;
        int i9 = this.f9183m;
        int i10 = 0;
        if (i8 < i9) {
            i5 = (i9 - i8) / 2;
            i6 = 0;
        } else {
            i6 = (i8 - i9) / 2;
            i5 = 0;
        }
        C10584m.m22515a("Layout image");
        int i11 = paddingTop + i5;
        int f = mo39811f(this.f9176f) + paddingLeft;
        mo39818i(this.f9176f, paddingLeft, i11, f, i11 + mo39810e(this.f9176f));
        int i12 = f + this.f9180j;
        C10584m.m22515a("Layout getTitle");
        int i13 = paddingTop + i6;
        int e = mo39810e(this.f9177g) + i13;
        mo39818i(this.f9177g, i12, i13, measuredWidth, e);
        C10584m.m22515a("Layout getBody");
        if (this.f9177g.getVisibility() == 8) {
            i7 = 0;
        } else {
            i7 = this.f9181k;
        }
        int i14 = e + i7;
        int e2 = mo39810e(this.f9178h) + i14;
        mo39818i(this.f9178h, i12, i14, measuredWidth, e2);
        C10584m.m22515a("Layout button");
        if (this.f9178h.getVisibility() != 8) {
            i10 = this.f9181k;
        }
        mo39817h(this.f9179i, i12, e2 + i10);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        this.f9176f = mo39809d(C10044f.image_view);
        this.f9177g = mo39809d(C10044f.message_title);
        this.f9178h = mo39809d(C10044f.body_scroll);
        this.f9179i = mo39809d(C10044f.f15147h);
        int i4 = 0;
        if (this.f9176f.getVisibility() == 8) {
            i3 = 0;
        } else {
            i3 = mo39808c(24);
        }
        this.f9180j = i3;
        this.f9181k = mo39808c(24);
        List<View> asList = Arrays.asList(new View[]{this.f9177g, this.f9178h, this.f9179i});
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int b = mo39807b(i);
        int a = mo39806a(i2) - paddingBottom;
        int i5 = b - paddingLeft;
        C10584m.m22515a("Measuring image");
        C2941b.m2422b(this.f9176f, (int) (((float) i5) * 0.4f), a);
        int f = mo39811f(this.f9176f);
        int i6 = i5 - (this.f9180j + f);
        float f2 = (float) f;
        C10584m.m22518d("Max col widths (l, r)", f2, (float) i6);
        int i7 = 0;
        for (View visibility : asList) {
            if (visibility.getVisibility() != 8) {
                i7++;
            }
        }
        int max = Math.max(0, (i7 - 1) * this.f9181k);
        int i8 = a - max;
        C10584m.m22515a("Measuring getTitle");
        C2941b.m2422b(this.f9177g, i6, i8);
        C10584m.m22515a("Measuring button");
        C2941b.m2422b(this.f9179i, i6, i8);
        C10584m.m22515a("Measuring scroll view");
        C2941b.m2422b(this.f9178h, i6, (i8 - mo39810e(this.f9177g)) - mo39810e(this.f9179i));
        this.f9182l = mo39810e(this.f9176f);
        this.f9183m = max;
        for (View e : asList) {
            this.f9183m += mo39810e(e);
        }
        int max2 = Math.max(this.f9182l + paddingBottom, this.f9183m + paddingBottom);
        for (View f3 : asList) {
            i4 = Math.max(mo39811f(f3), i4);
        }
        C10584m.m22518d("Measured columns (l, r)", f2, (float) i4);
        int i9 = f + i4 + this.f9180j + paddingLeft;
        C10584m.m22518d("Measured dims", (float) i9, (float) max2);
        setMeasuredDimension(i9, max2);
    }
}
