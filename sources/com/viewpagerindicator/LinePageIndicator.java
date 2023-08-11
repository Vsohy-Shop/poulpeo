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

public class LinePageIndicator extends View implements PageIndicator {
    private static final int INVALID_POINTER = -1;
    private int mActivePointerId;
    private boolean mCentered;
    private int mCurrentPage;
    private float mGapWidth;
    private boolean mIsDragging;
    private float mLastMotionX;
    private float mLineWidth;
    private ViewPager.OnPageChangeListener mListener;
    private final Paint mPaintSelected;
    private final Paint mPaintUnselected;
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

    public LinePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private int measureHeight(int i) {
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            f = (float) size;
        } else {
            float strokeWidth = this.mPaintSelected.getStrokeWidth() + ((float) getPaddingTop()) + ((float) getPaddingBottom());
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(strokeWidth, (float) size);
            } else {
                f = strokeWidth;
            }
        }
        return (int) Math.ceil((double) f);
    }

    private int measureWidth(int i) {
        float f;
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || (viewPager = this.mViewPager) == null) {
            f = (float) size;
        } else {
            int count = viewPager.getAdapter().getCount();
            f = ((float) (getPaddingLeft() + getPaddingRight())) + (((float) count) * this.mLineWidth) + (((float) (count - 1)) * this.mGapWidth);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, (float) size);
            }
        }
        return (int) Math.ceil((double) f);
    }

    public float getGapWidth() {
        return this.mGapWidth;
    }

    public float getLineWidth() {
        return this.mLineWidth;
    }

    public int getSelectedColor() {
        return this.mPaintSelected.getColor();
    }

    public float getStrokeWidth() {
        return this.mPaintSelected.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.mPaintUnselected.getColor();
    }

    public boolean isCentered() {
        return this.mCentered;
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int count;
        Paint paint;
        super.onDraw(canvas);
        ViewPager viewPager = this.mViewPager;
        if (viewPager != null && (count = viewPager.getAdapter().getCount()) != 0) {
            if (this.mCurrentPage >= count) {
                setCurrentItem(count - 1);
                return;
            }
            float f = this.mLineWidth;
            float f2 = this.mGapWidth;
            float f3 = f + f2;
            float f4 = (((float) count) * f3) - f2;
            float paddingTop = (float) getPaddingTop();
            float paddingLeft = (float) getPaddingLeft();
            float paddingRight = (float) getPaddingRight();
            float height = paddingTop + (((((float) getHeight()) - paddingTop) - ((float) getPaddingBottom())) / 2.0f);
            if (this.mCentered) {
                paddingLeft += (((((float) getWidth()) - paddingLeft) - paddingRight) / 2.0f) - (f4 / 2.0f);
            }
            for (int i = 0; i < count; i++) {
                float f5 = paddingLeft + (((float) i) * f3);
                float f6 = f5 + this.mLineWidth;
                if (i == this.mCurrentPage) {
                    paint = this.mPaintSelected;
                } else {
                    paint = this.mPaintUnselected;
                }
                canvas.drawLine(f5, height, f6, height, paint);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(measureWidth(i), measureHeight(i2));
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
        this.mCurrentPage = i;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.mListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mCurrentPage = savedState.currentPage;
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

    public void setGapWidth(float f) {
        this.mGapWidth = f;
        invalidate();
    }

    public void setLineWidth(float f) {
        this.mLineWidth = f;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mListener = onPageChangeListener;
    }

    public void setSelectedColor(int i) {
        this.mPaintSelected.setColor(i);
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mPaintSelected.setStrokeWidth(f);
        this.mPaintUnselected.setStrokeWidth(f);
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.mPaintUnselected.setColor(i);
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

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11783R.attr.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.mPaintUnselected = paint;
        Paint paint2 = new Paint(1);
        this.mPaintSelected = paint2;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C11783R.C11784color.default_line_indicator_selected_color);
            int color2 = resources.getColor(C11783R.C11784color.default_line_indicator_unselected_color);
            float dimension = resources.getDimension(C11783R.dimen.default_line_indicator_line_width);
            float dimension2 = resources.getDimension(C11783R.dimen.default_line_indicator_gap_width);
            float dimension3 = resources.getDimension(C11783R.dimen.default_line_indicator_stroke_width);
            boolean z = resources.getBoolean(C11783R.bool.default_line_indicator_centered);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11783R.styleable.LinePageIndicator, i, 0);
            this.mCentered = obtainStyledAttributes.getBoolean(C11783R.styleable.LinePageIndicator_centered, z);
            this.mLineWidth = obtainStyledAttributes.getDimension(C11783R.styleable.LinePageIndicator_lineWidth, dimension);
            this.mGapWidth = obtainStyledAttributes.getDimension(C11783R.styleable.LinePageIndicator_gapWidth, dimension2);
            setStrokeWidth(obtainStyledAttributes.getDimension(C11783R.styleable.LinePageIndicator_strokeWidth, dimension3));
            paint.setColor(obtainStyledAttributes.getColor(C11783R.styleable.LinePageIndicator_unselectedColor, color2));
            paint2.setColor(obtainStyledAttributes.getColor(C11783R.styleable.LinePageIndicator_selectedColor, color));
            Drawable drawable = obtainStyledAttributes.getDrawable(C11783R.styleable.LinePageIndicator_android_background);
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
