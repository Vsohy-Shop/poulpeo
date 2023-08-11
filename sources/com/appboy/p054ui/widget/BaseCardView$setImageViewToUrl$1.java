package com.appboy.p054ui.widget;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.appboy.ui.widget.BaseCardView$setImageViewToUrl$1 */
/* compiled from: BaseCardView.kt */
public final class BaseCardView$setImageViewToUrl$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ float $placeholderAspectRatio;

    BaseCardView$setImageViewToUrl$1(ImageView imageView, float f) {
        this.$imageView = imageView;
        this.$placeholderAspectRatio = f;
    }

    public boolean onPreDraw() {
        this.$imageView.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = this.$imageView.getWidth();
        this.$imageView.setLayoutParams(new RelativeLayout.LayoutParams(width, (int) (((float) width) / this.$placeholderAspectRatio)));
        return true;
    }
}
