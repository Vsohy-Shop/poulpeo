package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;

public class IconPageIndicator extends HorizontalScrollView implements PageIndicator {
    /* access modifiers changed from: private */
    public Runnable mIconSelector;
    private final IcsLinearLayout mIconsLayout;
    private ViewPager.OnPageChangeListener mListener;
    private int mSelectedIndex;
    private ViewPager mViewPager;

    public IconPageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private void animateToIcon(int i) {
        final View childAt = this.mIconsLayout.getChildAt(i);
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C117801 r0 = new Runnable() {
            public void run() {
                IconPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((IconPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                Runnable unused = IconPageIndicator.this.mIconSelector = null;
            }
        };
        this.mIconSelector = r0;
        post(r0);
    }

    public void notifyDataSetChanged() {
        this.mIconsLayout.removeAllViews();
        IconPagerAdapter iconPagerAdapter = (IconPagerAdapter) this.mViewPager.getAdapter();
        int count = iconPagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(getContext(), (AttributeSet) null, C11783R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(iconPagerAdapter.getIconResId(i));
            this.mIconsLayout.addView(imageView);
        }
        if (this.mSelectedIndex > count) {
            this.mSelectedIndex = count - 1;
        }
        setCurrentItem(this.mSelectedIndex);
        requestLayout();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mIconSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onPageScrollStateChanged(int i) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        setCurrentItem(i);
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    public void setCurrentItem(int i) {
        boolean z;
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            this.mSelectedIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mIconsLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mIconsLayout.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (z) {
                    animateToIcon(i);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mListener = onPageChangeListener;
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != viewPager) {
            if (viewPager2 != null) {
                viewPager2.setOnPageChangeListener((ViewPager.OnPageChangeListener) null);
            }
            if (viewPager.getAdapter() != null) {
                this.mViewPager = viewPager;
                viewPager.setOnPageChangeListener(this);
                notifyDataSetChanged();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public IconPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, C11783R.attr.vpiIconPageIndicatorStyle);
        this.mIconsLayout = icsLinearLayout;
        addView(icsLinearLayout, new FrameLayout.LayoutParams(-2, -1, 17));
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
