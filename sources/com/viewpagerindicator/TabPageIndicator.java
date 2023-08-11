package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class TabPageIndicator extends HorizontalScrollView implements PageIndicator {
    private static final CharSequence EMPTY_TITLE = "";
    private ViewPager.OnPageChangeListener mListener;
    /* access modifiers changed from: private */
    public int mMaxTabWidth;
    private int mSelectedTabIndex;
    private final View.OnClickListener mTabClickListener;
    private final IcsLinearLayout mTabLayout;
    /* access modifiers changed from: private */
    public OnTabReselectedListener mTabReselectedListener;
    /* access modifiers changed from: private */
    public Runnable mTabSelector;
    /* access modifiers changed from: private */
    public ViewPager mViewPager;

    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    private class TabView extends TextView {
        /* access modifiers changed from: private */
        public int mIndex;

        public TabView(Context context) {
            super(context, (AttributeSet) null, C11783R.attr.vpiTabPageIndicatorStyle);
        }

        public int getIndex() {
            return this.mIndex;
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (TabPageIndicator.this.mMaxTabWidth > 0 && getMeasuredWidth() > TabPageIndicator.this.mMaxTabWidth) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.mMaxTabWidth, BasicMeasure.EXACTLY), i2);
            }
        }
    }

    public TabPageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addTab(int i, CharSequence charSequence, int i2) {
        TabView tabView = new TabView(getContext());
        int unused = tabView.mIndex = i;
        tabView.setFocusable(true);
        tabView.setOnClickListener(this.mTabClickListener);
        tabView.setText(charSequence);
        if (i2 != 0) {
            tabView.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        this.mTabLayout.addView(tabView, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    private void animateToTab(int i) {
        final View childAt = this.mTabLayout.getChildAt(i);
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        C117892 r0 = new Runnable() {
            public void run() {
                TabPageIndicator.this.smoothScrollTo(childAt.getLeft() - ((TabPageIndicator.this.getWidth() - childAt.getWidth()) / 2), 0);
                Runnable unused = TabPageIndicator.this.mTabSelector = null;
            }
        };
        this.mTabSelector = r0;
        post(r0);
    }

    public void notifyDataSetChanged() {
        IconPagerAdapter iconPagerAdapter;
        int i;
        this.mTabLayout.removeAllViews();
        PagerAdapter adapter = this.mViewPager.getAdapter();
        if (adapter instanceof IconPagerAdapter) {
            iconPagerAdapter = (IconPagerAdapter) adapter;
        } else {
            iconPagerAdapter = null;
        }
        int count = adapter.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            CharSequence pageTitle = adapter.getPageTitle(i2);
            if (pageTitle == null) {
                pageTitle = EMPTY_TITLE;
            }
            if (iconPagerAdapter != null) {
                i = iconPagerAdapter.getIconResId(i2);
            } else {
                i = 0;
            }
            addTab(i2, pageTitle, i);
        }
        if (this.mSelectedTabIndex > count) {
            this.mSelectedTabIndex = count - 1;
        }
        setCurrentItem(this.mSelectedTabIndex);
        requestLayout();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.mTabSelector;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.mTabLayout.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.mMaxTabWidth = -1;
        } else if (childCount > 2) {
            this.mMaxTabWidth = (int) (((float) View.MeasureSpec.getSize(i)) * 0.4f);
        } else {
            this.mMaxTabWidth = View.MeasureSpec.getSize(i) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setCurrentItem(this.mSelectedTabIndex);
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
            this.mSelectedTabIndex = i;
            viewPager.setCurrentItem(i);
            int childCount = this.mTabLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mTabLayout.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (z) {
                    animateToTab(i);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mListener = onPageChangeListener;
    }

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.mTabReselectedListener = onTabReselectedListener;
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

    public TabPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTabClickListener = new View.OnClickListener() {
            public void onClick(View view) {
                int currentItem = TabPageIndicator.this.mViewPager.getCurrentItem();
                int index = ((TabView) view).getIndex();
                TabPageIndicator.this.mViewPager.setCurrentItem(index);
                if (currentItem == index && TabPageIndicator.this.mTabReselectedListener != null) {
                    TabPageIndicator.this.mTabReselectedListener.onTabReselected(index);
                }
            }
        };
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, C11783R.attr.vpiTabPageIndicatorStyle);
        this.mTabLayout = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
