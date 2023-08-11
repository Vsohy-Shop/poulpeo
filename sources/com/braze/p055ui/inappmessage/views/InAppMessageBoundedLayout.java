package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageBoundedLayout */
/* compiled from: InAppMessageBoundedLayout.kt */
public class InAppMessageBoundedLayout extends RelativeLayout {
    private int maxDefinedHeightPixels;
    private int maxDefinedWidthPixels;
    private int minDefinedHeightPixels;
    private int minDefinedWidthPixels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.minDefinedWidthPixels;
        if (i3 <= 0 || size >= i3) {
            int i4 = this.maxDefinedWidthPixels;
            if (i4 > 0 && size > i4) {
                i = View.MeasureSpec.makeMeasureSpec(this.maxDefinedWidthPixels, View.MeasureSpec.getMode(i));
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(this.minDefinedWidthPixels, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.minDefinedHeightPixels;
        if (i5 <= 0 || size2 >= i5) {
            int i6 = this.maxDefinedHeightPixels;
            if (i6 > 0 && size2 > i6) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.maxDefinedHeightPixels, View.MeasureSpec.getMode(i2));
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(this.minDefinedHeightPixels, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageBoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4193R.styleable.InAppMessageBoundedLayout);
        C12775o.m28638h(obtainStyledAttributes, "context.obtainStyledAttr…nAppMessageBoundedLayout)");
        this.maxDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(C4193R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxWidth, 0);
        this.minDefinedWidthPixels = obtainStyledAttributes.getDimensionPixelSize(C4193R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinWidth, 0);
        this.maxDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(C4193R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMaxHeight, 0);
        this.minDefinedHeightPixels = obtainStyledAttributes.getDimensionPixelSize(C4193R.styleable.InAppMessageBoundedLayout_inAppMessageBoundedLayoutMinHeight, 0);
        obtainStyledAttributes.recycle();
    }
}
