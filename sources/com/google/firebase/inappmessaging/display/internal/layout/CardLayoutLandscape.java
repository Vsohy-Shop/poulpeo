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

public class CardLayoutLandscape extends C6938a {

    /* renamed from: j */
    private static double f9163j = 0.6d;

    /* renamed from: f */
    private View f9164f;

    /* renamed from: g */
    private View f9165g;

    /* renamed from: h */
    private View f9166h;

    /* renamed from: i */
    private View f9167i;

    public CardLayoutLandscape(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        C10584m.m22515a("Layout image");
        int f = mo39811f(this.f9164f);
        mo39818i(this.f9164f, 0, 0, f, mo39810e(this.f9164f));
        C10584m.m22515a("Layout title");
        int e = mo39810e(this.f9165g);
        int i5 = f;
        int i6 = measuredWidth;
        mo39818i(this.f9165g, i5, 0, i6, e);
        C10584m.m22515a("Layout scroll");
        mo39818i(this.f9166h, i5, e, i6, e + mo39810e(this.f9166h));
        C10584m.m22515a("Layout action bar");
        mo39818i(this.f9167i, i5, measuredHeight - mo39810e(this.f9167i), i6, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9164f = mo39809d(C10044f.image_view);
        this.f9165g = mo39809d(C10044f.message_title);
        this.f9166h = mo39809d(C10044f.body_scroll);
        View d = mo39809d(C10044f.f15146a);
        this.f9167i = d;
        int i3 = 0;
        List<View> asList = Arrays.asList(new View[]{this.f9165g, this.f9166h, d});
        int b = mo39807b(i);
        int a = mo39806a(i2);
        int j = mo39819j((int) (f9163j * ((double) b)), 4);
        C10584m.m22515a("Measuring image");
        C2941b.m2423c(this.f9164f, b, a);
        if (mo39811f(this.f9164f) > j) {
            C10584m.m22515a("Image exceeded maximum width, remeasuring image");
            C2941b.m2424d(this.f9164f, j, a);
        }
        int e = mo39810e(this.f9164f);
        int f = mo39811f(this.f9164f);
        int i4 = b - f;
        float f2 = (float) f;
        C10584m.m22518d("Max col widths (l, r)", f2, (float) i4);
        C10584m.m22515a("Measuring title");
        C2941b.m2422b(this.f9165g, i4, e);
        C10584m.m22515a("Measuring action bar");
        C2941b.m2422b(this.f9167i, i4, e);
        C10584m.m22515a("Measuring scroll view");
        C2941b.m2423c(this.f9166h, i4, (e - mo39810e(this.f9165g)) - mo39810e(this.f9167i));
        for (View f3 : asList) {
            i3 = Math.max(mo39811f(f3), i3);
        }
        C10584m.m22518d("Measured columns (l, r)", f2, (float) i3);
        int i5 = f + i3;
        C10584m.m22518d("Measured dims", (float) i5, (float) e);
        setMeasuredDimension(i5, e);
    }
}
