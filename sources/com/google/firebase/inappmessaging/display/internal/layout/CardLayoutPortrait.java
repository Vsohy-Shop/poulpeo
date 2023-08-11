package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p039b8.C2941b;
import p256v7.C10044f;
import p278x7.C10584m;

public class CardLayoutPortrait extends C6938a {

    /* renamed from: j */
    private static double f9168j = 0.8d;

    /* renamed from: f */
    private View f9169f;

    /* renamed from: g */
    private View f9170g;

    /* renamed from: h */
    private View f9171h;

    /* renamed from: i */
    private View f9172i;

    public CardLayoutPortrait(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int size = getVisibleChildren().size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            View view = getVisibleChildren().get(i6);
            int measuredHeight = view.getMeasuredHeight() + i5;
            int measuredWidth = view.getMeasuredWidth() + 0;
            C10584m.m22515a("Layout child " + i6);
            C10584m.m22518d("\t(top, bottom)", (float) i5, (float) measuredHeight);
            C10584m.m22518d("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, i5, measuredWidth, measuredHeight);
            C10584m.m22518d("Child " + i6 + " wants to be ", (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight());
            i5 += view.getMeasuredHeight();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9169f = mo39809d(C10044f.image_view);
        this.f9170g = mo39809d(C10044f.message_title);
        this.f9171h = mo39809d(C10044f.body_scroll);
        this.f9172i = mo39809d(C10044f.f15146a);
        int b = mo39807b(i);
        int a = mo39806a(i2);
        int j = mo39819j((int) (f9168j * ((double) a)), 4);
        C10584m.m22515a("Measuring image");
        C2941b.m2424d(this.f9169f, b, a);
        if (mo39810e(this.f9169f) > j) {
            C10584m.m22515a("Image exceeded maximum height, remeasuring image");
            C2941b.m2423c(this.f9169f, b, j);
        }
        int f = mo39811f(this.f9169f);
        C10584m.m22515a("Measuring title");
        C2941b.m2424d(this.f9170g, f, a);
        C10584m.m22515a("Measuring action bar");
        C2941b.m2424d(this.f9172i, f, a);
        C10584m.m22515a("Measuring scroll view");
        C2941b.m2424d(this.f9171h, f, ((a - mo39810e(this.f9169f)) - mo39810e(this.f9170g)) - mo39810e(this.f9172i));
        int size = getVisibleChildren().size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += mo39810e(getVisibleChildren().get(i4));
        }
        setMeasuredDimension(f, i3);
    }
}
