package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;

public class CirclePageIndicator extends View implements PageIndicator {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private boolean mIsDragging;
    private float mLastMotionX;
    private ViewPager.OnPageChangeListener mListener;
    private int mOrientation;
    private float mPageOffset;
    private final Paint mPaintFill;
    private final Paint mPaintPageFill;
    private final Paint mPaintStroke;
    private float mRadius;
    private int mScrollState;
    private boolean mSnap;
    private int mSnapPage;
    private int mTouchSlop;
    private ViewPager mViewPager;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPage;

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPage);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPage = parcel.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private int measureLong(int i) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.mViewPager) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float f = this.mRadius;
        int paddingLeft = (int) (((float) (getPaddingLeft() + getPaddingRight())) + (((float) (count * 2)) * f) + (((float) (count - 1)) * f) + 1.0f);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingLeft, size);
        }
        return paddingLeft;
    }

    private int measureShort(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.mRadius * 2.0f) + ((float) getPaddingTop()) + ((float) getPaddingBottom()) + 1.0f);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    public int getFillColor() {
        return this.mPaintFill.getColor();
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getPageColor() {
        return this.mPaintPageFill.getColor();
    }

    public float getRadius() {
        return this.mRadius;
    }

    public int getStrokeColor() {
        return this.mPaintStroke.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintStroke.getStrokeWidth();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public boolean isSnap() {
        return this.mSnap;
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int count;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        float f2;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null && (count = viewPager.getAdapter().getCount()) != 0) {
            if (this.mCurrentPage >= count) {
                setCurrentItem(count - 1);
                return;
            }
            if (this.mOrientation == 0) {
                i4 = getWidth();
                i3 = getPaddingLeft();
                i2 = getPaddingRight();
                i = getPaddingTop();
            } else {
                i4 = getHeight();
                i3 = getPaddingTop();
                i2 = getPaddingBottom();
                i = getPaddingLeft();
            }
            float f3 = this.mRadius;
            float f4 = 3.0f * f3;
            float f5 = ((float) i) + f3;
            float f6 = ((float) i3) + f3;
            if (this.mCentered) {
                f6 += (((float) ((i4 - i3) - i2)) / 2.0f) - ((((float) count) * f4) / 2.0f);
            }
            if (this.mPaintStroke.getStrokeWidth() > 0.0f) {
                f3 -= this.mPaintStroke.getStrokeWidth() / 2.0f;
            }
            for (int i6 = 0; i6 < count; i6++) {
                float f7 = (((float) i6) * f4) + f6;
                if (this.mOrientation == 0) {
                    f2 = f5;
                } else {
                    f2 = f7;
                    f7 = f5;
                }
                if (this.mPaintPageFill.getAlpha() > 0) {
                    canvas.drawCircle(f7, f2, f3, this.mPaintPageFill);
                }
                float f8 = this.mRadius;
                if (f3 != f8) {
                    canvas.drawCircle(f7, f2, f8, this.mPaintStroke);
                }
            }
            boolean z = this.mSnap;
            if (z) {
                i5 = this.mSnapPage;
            } else {
                i5 = this.mCurrentPage;
            }
            float f9 = ((float) i5) * f4;
            if (!z) {
                f9 += this.mPageOffset * f4;
            }
            if (this.mOrientation == 0) {
                float f10 = f6 + f9;
                f = f5;
                f5 = f10;
            } else {
                f = f6 + f9;
            }
            canvas.drawCircle(f5, f, this.mRadius, this.mPaintFill);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 0) {
            setMeasuredDimension(measureLong(i), measureShort(i2));
        } else {
            setMeasuredDimension(measureShort(i), measureLong(i2));
        }
    }

    public void onPageScrollStateChanged(int i) {
        this.mScrollState = i;
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.mCurrentPage = i;
        this.mPageOffset = f;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
    }

    public void onPageSelected(int i) {
        if (this.mSnap || this.mScrollState == 0) {
            this.mCurrentPage = i;
            this.mSnapPage = i;
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPage;
        this.mCurrentPage = i;
        this.mSnapPage = i;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPage = this.mCurrentPage;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.mViewPager;
        int i = 0;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    float f = x - this.mLastMotionX;
                    if (!this.mIsDragging && Math.abs(f) > ((float) this.mTouchSlop)) {
                        this.mIsDragging = true;
                    }
                    if (this.mIsDragging) {
                        this.mLastMotionX = x;
                        if (this.mViewPager.isFakeDragging() || this.mViewPager.beginFakeDrag()) {
                            this.mViewPager.fakeDragBy(f);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.mLastMotionX = MotionEventCompat.getX(motionEvent, actionIndex);
                        this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                        if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.mActivePointerId) {
                            if (actionIndex2 == 0) {
                                i = 1;
                            }
                            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, i);
                        }
                        this.mLastMotionX = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.mActivePointerId));
                    }
                }
            }
            if (!this.mIsDragging) {
                int count = this.mViewPager.getAdapter().getCount();
                float width = (float) getWidth();
                float f2 = width / 2.0f;
                float f3 = width / 6.0f;
                if (this.mCurrentPage > 0 && motionEvent.getX() < f2 - f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage - 1);
                    }
                    return true;
                } else if (this.mCurrentPage < count - 1 && motionEvent.getX() > f2 + f3) {
                    if (action != 3) {
                        this.mViewPager.setCurrentItem(this.mCurrentPage + 1);
                    }
                    return true;
                }
            }
            this.mIsDragging = false;
            this.mActivePointerId = -1;
            if (this.mViewPager.isFakeDragging()) {
                this.mViewPager.endFakeDrag();
            }
        } else {
            this.mActivePointerId = MotionEventCompat.getPointerId(motionEvent, 0);
            this.mLastMotionX = motionEvent.getX();
        }
        return true;
    }

    public void setCentered(boolean z) {
        this.mCentered = z;
        invalidate();
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null) {
            viewPager.setCurrentItem(i);
            this.mCurrentPage = i;
            invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }

    public void setFillColor(int i) {
        this.mPaintFill.setColor(i);
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mListener = onPageChangeListener;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.mOrientation = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
    }

    public void setPageColor(int i) {
        this.mPaintPageFill.setColor(i);
        invalidate();
    }

    public void setRadius(float f) {
        this.mRadius = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        this.mSnap = z;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.mPaintStroke.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mPaintStroke.setStrokeWidth(f);
        invalidate();
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
                invalidate();
                return;
            }
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11783R.attr.vpiCirclePageIndicatorStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaintPageFill = paint;
        Paint paint2 = new Paint(1);
        this.mPaintStroke = paint2;
        Paint paint3 = new Paint(1);
        this.mPaintFill = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C11783R.C11784color.default_circle_indicator_page_color);
            int color2 = resources.getColor(C11783R.C11784color.default_circle_indicator_fill_color);
            int integer = resources.getInteger(C11783R.integer.default_circle_indicator_orientation);
            int color3 = resources.getColor(C11783R.C11784color.default_circle_indicator_stroke_color);
            float dimension = resources.getDimension(C11783R.dimen.default_circle_indicator_stroke_width);
            float dimension2 = resources.getDimension(C11783R.dimen.default_circle_indicator_radius);
            boolean z = resources.getBoolean(C11783R.bool.default_circle_indicator_centered);
            boolean z2 = resources.getBoolean(C11783R.bool.default_circle_indicator_snap);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11783R.styleable.CirclePageIndicator, i, 0);
            this.mCentered = obtainStyledAttributes.getBoolean(C11783R.styleable.CirclePageIndicator_centered, z);
            this.mOrientation = obtainStyledAttributes.getInt(C11783R.styleable.CirclePageIndicator_android_orientation, integer);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(obtainStyledAttributes.getColor(C11783R.styleable.CirclePageIndicator_pageColor, color));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(obtainStyledAttributes.getColor(C11783R.styleable.CirclePageIndicator_strokeColor, color3));
            paint2.setStrokeWidth(obtainStyledAttributes.getDimension(C11783R.styleable.CirclePageIndicator_strokeWidth, dimension));
            paint3.setStyle(Paint.Style.FILL);
            paint3.setColor(obtainStyledAttributes.getColor(C11783R.styleable.CirclePageIndicator_fillColor, color2));
            this.mRadius = obtainStyledAttributes.getDimension(C11783R.styleable.CirclePageIndicator_radius, dimension2);
            this.mSnap = obtainStyledAttributes.getBoolean(C11783R.styleable.CirclePageIndicator_snap, z2);
            Drawable drawable = obtainStyledAttributes.getDrawable(C11783R.styleable.CirclePageIndicator_android_background);
            if (drawable != null) {
                setBackgroundDrawable(drawable);
            }
            obtainStyledAttributes.recycle();
            this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
        }
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }
}
