package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;

public class TitlePageIndicator extends View implements PageIndicator {
    private static final float BOLD_FADE_PERCENTAGE = 0.05f;
    private static final String EMPTY_TITLE = "";
    private static final int INVALID_POINTER = -1;
    private static final float SELECTION_FADE_PERCENTAGE = 0.25f;
    private int mActivePointerId;
    private boolean mBoldText;
    private final Rect mBounds;
    private OnCenterItemClickListener mCenterItemClickListener;
    private float mClipPadding;
    private int mColorSelected;
    private int mColorText;
    private int mCurrentPage;
    private float mFooterIndicatorHeight;
    private IndicatorStyle mFooterIndicatorStyle;
    private float mFooterIndicatorUnderlinePadding;
    private float mFooterLineHeight;
    private float mFooterPadding;
    private boolean mIsDragging;
    private float mLastMotionX;
    private LinePosition mLinePosition;
    private ViewPager.OnPageChangeListener mListener;
    private float mPageOffset;
    private final Paint mPaintFooterIndicator;
    private final Paint mPaintFooterLine;
    private final Paint mPaintText;
    private Path mPath;
    private int mScrollState;
    private float mTitlePadding;
    private float mTopPadding;
    private int mTouchSlop;
    private ViewPager mViewPager;

    /* renamed from: com.viewpagerindicator.TitlePageIndicator$1 */
    static /* synthetic */ class C117901 {

        /* renamed from: $SwitchMap$com$viewpagerindicator$TitlePageIndicator$IndicatorStyle */
        static final /* synthetic */ int[] f18412x23f3a60e;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.viewpagerindicator.TitlePageIndicator$IndicatorStyle[] r0 = com.viewpagerindicator.TitlePageIndicator.IndicatorStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18412x23f3a60e = r0
                com.viewpagerindicator.TitlePageIndicator$IndicatorStyle r1 = com.viewpagerindicator.TitlePageIndicator.IndicatorStyle.Triangle     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18412x23f3a60e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.viewpagerindicator.TitlePageIndicator$IndicatorStyle r1 = com.viewpagerindicator.TitlePageIndicator.IndicatorStyle.Underline     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.viewpagerindicator.TitlePageIndicator.C117901.<clinit>():void");
        }
    }

    public enum IndicatorStyle {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int value;

        private IndicatorStyle(int i) {
            this.value = i;
        }

        public static IndicatorStyle fromValue(int i) {
            for (IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == i) {
                    return indicatorStyle;
                }
            }
            return null;
        }
    }

    public enum LinePosition {
        Bottom(0),
        Top(1);
        
        public final int value;

        private LinePosition(int i) {
            this.value = i;
        }

        public static LinePosition fromValue(int i) {
            for (LinePosition linePosition : values()) {
                if (linePosition.value == i) {
                    return linePosition;
                }
            }
            return null;
        }
    }

    public interface OnCenterItemClickListener {
        void onCenterItemClick(int i);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C117901) null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPage;

        /* synthetic */ SavedState(Parcel parcel, C117901 r2) {
            this(parcel);
        }

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

    public TitlePageIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    private Rect calcBounds(int i, Paint paint) {
        Rect rect = new Rect();
        CharSequence title = getTitle(i);
        rect.right = (int) paint.measureText(title, 0, title.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    private ArrayList<Rect> calculateAllBounds(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int count = this.mViewPager.getAdapter().getCount();
        int width = getWidth();
        int i = width / 2;
        for (int i2 = 0; i2 < count; i2++) {
            Rect calcBounds = calcBounds(i2, paint);
            int i3 = calcBounds.right - calcBounds.left;
            int i4 = calcBounds.bottom - calcBounds.top;
            int i5 = (int) ((((float) i) - (((float) i3) / 2.0f)) + ((((float) (i2 - this.mCurrentPage)) - this.mPageOffset) * ((float) width)));
            calcBounds.left = i5;
            calcBounds.right = i5 + i3;
            calcBounds.top = 0;
            calcBounds.bottom = i4;
            arrayList.add(calcBounds);
        }
        return arrayList;
    }

    private void clipViewOnTheLeft(Rect rect, float f, int i) {
        float f2 = this.mClipPadding;
        rect.left = (int) (((float) i) + f2);
        rect.right = (int) (f2 + f);
    }

    private void clipViewOnTheRight(Rect rect, float f, int i) {
        int i2 = (int) (((float) i) - this.mClipPadding);
        rect.right = i2;
        rect.left = (int) (((float) i2) - f);
    }

    private CharSequence getTitle(int i) {
        CharSequence pageTitle = this.mViewPager.getAdapter().getPageTitle(i);
        if (pageTitle == null) {
            return "";
        }
        return pageTitle;
    }

    public float getClipPadding() {
        return this.mClipPadding;
    }

    public int getFooterColor() {
        return this.mPaintFooterLine.getColor();
    }

    public float getFooterIndicatorHeight() {
        return this.mFooterIndicatorHeight;
    }

    public float getFooterIndicatorPadding() {
        return this.mFooterPadding;
    }

    public IndicatorStyle getFooterIndicatorStyle() {
        return this.mFooterIndicatorStyle;
    }

    public float getFooterLineHeight() {
        return this.mFooterLineHeight;
    }

    public LinePosition getLinePosition() {
        return this.mLinePosition;
    }

    public int getSelectedColor() {
        return this.mColorSelected;
    }

    public int getTextColor() {
        return this.mColorText;
    }

    public float getTextSize() {
        return this.mPaintText.getTextSize();
    }

    public float getTitlePadding() {
        return this.mTitlePadding;
    }

    public float getTopPadding() {
        return this.mTopPadding;
    }

    public Typeface getTypeface() {
        return this.mPaintText.getTypeface();
    }

    public boolean isSelectedBold() {
        return this.mBoldText;
    }

    public void notifyDataSetChanged() {
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int count;
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        float f;
        ViewPager viewPager;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (count = viewPager2.getAdapter().getCount()) != 0) {
            if (this.mCurrentPage == -1 && (viewPager = this.mViewPager) != null) {
                this.mCurrentPage = viewPager.getCurrentItem();
            }
            ArrayList<Rect> calculateAllBounds = calculateAllBounds(this.mPaintText);
            int size = calculateAllBounds.size();
            if (this.mCurrentPage >= size) {
                setCurrentItem(size - 1);
                return;
            }
            int i8 = count - 1;
            float width = ((float) getWidth()) / 2.0f;
            int left = getLeft();
            float f2 = ((float) left) + this.mClipPadding;
            int width2 = getWidth();
            int height = getHeight();
            int i9 = left + width2;
            float f3 = ((float) i9) - this.mClipPadding;
            int i10 = this.mCurrentPage;
            float f4 = this.mPageOffset;
            float f5 = width;
            if (((double) f4) <= 0.5d) {
                i = i10;
            } else {
                i = i10 + 1;
                f4 = 1.0f - f4;
            }
            if (f4 <= SELECTION_FADE_PERCENTAGE) {
                z = true;
            } else {
                z = false;
            }
            if (f4 <= BOLD_FADE_PERCENTAGE) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f6 = (SELECTION_FADE_PERCENTAGE - f4) / SELECTION_FADE_PERCENTAGE;
            Rect rect = calculateAllBounds.get(i10);
            int i11 = rect.right;
            int i12 = rect.left;
            float f7 = (float) (i11 - i12);
            if (((float) i12) < f2) {
                clipViewOnTheLeft(rect, f7, left);
            }
            if (((float) rect.right) > f3) {
                clipViewOnTheRight(rect, f7, i9);
            }
            int i13 = this.mCurrentPage;
            if (i13 > 0) {
                int i14 = i13 - 1;
                while (i14 >= 0) {
                    Rect rect2 = calculateAllBounds.get(i14);
                    int i15 = rect2.left;
                    int i16 = width2;
                    if (((float) i15) < f2) {
                        int i17 = rect2.right - i15;
                        clipViewOnTheLeft(rect2, (float) i17, left);
                        f = f2;
                        float f8 = this.mTitlePadding;
                        int i18 = calculateAllBounds.get(i14 + 1).left;
                        i7 = size;
                        if (((float) rect2.right) + f8 > ((float) i18)) {
                            int i19 = (int) (((float) (i18 - i17)) - f8);
                            rect2.left = i19;
                            rect2.right = i19 + i17;
                        }
                    } else {
                        f = f2;
                        i7 = size;
                    }
                    i14--;
                    Canvas canvas3 = canvas;
                    width2 = i16;
                    f2 = f;
                    size = i7;
                }
            }
            int i20 = width2;
            int i21 = size;
            int i22 = this.mCurrentPage;
            if (i22 < i8) {
                for (int i23 = i22 + 1; i23 < count; i23++) {
                    Rect rect3 = calculateAllBounds.get(i23);
                    int i24 = rect3.right;
                    if (((float) i24) > f3) {
                        int i25 = i24 - rect3.left;
                        clipViewOnTheRight(rect3, (float) i25, i9);
                        float f9 = this.mTitlePadding;
                        int i26 = calculateAllBounds.get(i23 - 1).right;
                        if (((float) rect3.left) - f9 < ((float) i26)) {
                            int i27 = (int) (((float) i26) + f9);
                            rect3.left = i27;
                            rect3.right = i27 + i25;
                        }
                    }
                }
            }
            int i28 = this.mColorText >>> 24;
            int i29 = 0;
            while (i29 < count) {
                Rect rect4 = calculateAllBounds.get(i29);
                int i30 = rect4.left;
                if ((i30 <= left || i30 >= i9) && ((i6 = rect4.right) <= left || i6 >= i9)) {
                    i4 = i9;
                    i3 = i28;
                    i5 = i20;
                } else {
                    if (i29 == i) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    CharSequence title = getTitle(i29);
                    Paint paint = this.mPaintText;
                    if (!z3 || !z2 || !this.mBoldText) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    paint.setFakeBoldText(z4);
                    this.mPaintText.setColor(this.mColorText);
                    if (z3 && z) {
                        this.mPaintText.setAlpha(i28 - ((int) (((float) i28) * f6)));
                    }
                    if (i29 < i21 - 1) {
                        int i31 = rect4.right;
                        float f10 = this.mTitlePadding;
                        int i32 = calculateAllBounds.get(i29 + 1).left;
                        if (((float) i31) + f10 > ((float) i32)) {
                            int i33 = i31 - rect4.left;
                            int i34 = (int) (((float) (i32 - i33)) - f10);
                            rect4.left = i34;
                            rect4.right = i34 + i33;
                        }
                    }
                    i4 = i9;
                    i3 = i28;
                    i5 = i20;
                    canvas.drawText(title, 0, title.length(), (float) rect4.left, ((float) rect4.bottom) + this.mTopPadding, this.mPaintText);
                    if (z3 && z) {
                        this.mPaintText.setColor(this.mColorSelected);
                        this.mPaintText.setAlpha((int) (((float) (this.mColorSelected >>> 24)) * f6));
                        canvas.drawText(title, 0, title.length(), (float) rect4.left, ((float) rect4.bottom) + this.mTopPadding, this.mPaintText);
                    }
                }
                i29++;
                i20 = i5;
                i9 = i4;
                i28 = i3;
            }
            int i35 = i20;
            float f11 = this.mFooterLineHeight;
            float f12 = this.mFooterIndicatorHeight;
            if (this.mLinePosition == LinePosition.Top) {
                f11 = -f11;
                f12 = -f12;
                i2 = 0;
            } else {
                i2 = height;
            }
            this.mPath.reset();
            float f13 = (float) i2;
            float f14 = f13 - (f11 / 2.0f);
            this.mPath.moveTo(0.0f, f14);
            this.mPath.lineTo((float) i35, f14);
            this.mPath.close();
            Canvas canvas4 = canvas;
            canvas4.drawPath(this.mPath, this.mPaintFooterLine);
            float f15 = f13 - f11;
            int i36 = C117901.f18412x23f3a60e[this.mFooterIndicatorStyle.ordinal()];
            if (i36 == 1) {
                this.mPath.reset();
                float f16 = f5;
                this.mPath.moveTo(f16, f15 - f12);
                this.mPath.lineTo(f16 + f12, f15);
                this.mPath.lineTo(f16 - f12, f15);
                this.mPath.close();
                canvas4.drawPath(this.mPath, this.mPaintFooterIndicator);
            } else if (i36 == 2 && z && i < i21) {
                Rect rect5 = calculateAllBounds.get(i);
                float f17 = this.mFooterIndicatorUnderlinePadding;
                float f18 = ((float) rect5.right) + f17;
                float f19 = ((float) rect5.left) - f17;
                float f20 = f15 - f12;
                this.mPath.reset();
                this.mPath.moveTo(f19, f15);
                this.mPath.lineTo(f18, f15);
                this.mPath.lineTo(f18, f20);
                this.mPath.lineTo(f19, f20);
                this.mPath.close();
                this.mPaintFooterIndicator.setAlpha((int) (f6 * 255.0f));
                canvas4.drawPath(this.mPath, this.mPaintFooterIndicator);
                this.mPaintFooterIndicator.setAlpha(255);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = (float) View.MeasureSpec.getSize(i2);
        } else {
            this.mBounds.setEmpty();
            this.mBounds.bottom = (int) (this.mPaintText.descent() - this.mPaintText.ascent());
            Rect rect = this.mBounds;
            f = ((float) (rect.bottom - rect.top)) + this.mFooterLineHeight + this.mFooterPadding + this.mTopPadding;
            if (this.mFooterIndicatorStyle != IndicatorStyle.None) {
                f += this.mFooterIndicatorHeight;
            }
        }
        setMeasuredDimension(size, (int) f);
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
        if (this.mScrollState == 0) {
            this.mCurrentPage = i;
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
                float f4 = f2 - f3;
                float f5 = f2 + f3;
                float x2 = motionEvent.getX();
                if (x2 < f4) {
                    int i2 = this.mCurrentPage;
                    if (i2 > 0) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i2 - 1);
                        }
                        return true;
                    }
                } else if (x2 > f5) {
                    int i3 = this.mCurrentPage;
                    if (i3 < count - 1) {
                        if (action != 3) {
                            this.mViewPager.setCurrentItem(i3 + 1);
                        }
                        return true;
                    }
                } else {
                    OnCenterItemClickListener onCenterItemClickListener = this.mCenterItemClickListener;
                    if (!(onCenterItemClickListener == null || action == 3)) {
                        onCenterItemClickListener.onCenterItemClick(this.mCurrentPage);
                    }
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

    public void setClipPadding(float f) {
        this.mClipPadding = f;
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

    public void setFooterColor(int i) {
        this.mPaintFooterLine.setColor(i);
        this.mPaintFooterIndicator.setColor(i);
        invalidate();
    }

    public void setFooterIndicatorHeight(float f) {
        this.mFooterIndicatorHeight = f;
        invalidate();
    }

    public void setFooterIndicatorPadding(float f) {
        this.mFooterPadding = f;
        invalidate();
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorStyle) {
        this.mFooterIndicatorStyle = indicatorStyle;
        invalidate();
    }

    public void setFooterLineHeight(float f) {
        this.mFooterLineHeight = f;
        this.mPaintFooterLine.setStrokeWidth(f);
        invalidate();
    }

    public void setLinePosition(LinePosition linePosition) {
        this.mLinePosition = linePosition;
        invalidate();
    }

    public void setOnCenterItemClickListener(OnCenterItemClickListener onCenterItemClickListener) {
        this.mCenterItemClickListener = onCenterItemClickListener;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.mListener = onPageChangeListener;
    }

    public void setSelectedBold(boolean z) {
        this.mBoldText = z;
        invalidate();
    }

    public void setSelectedColor(int i) {
        this.mColorSelected = i;
        invalidate();
    }

    public void setTextColor(int i) {
        this.mPaintText.setColor(i);
        this.mColorText = i;
        invalidate();
    }

    public void setTextSize(float f) {
        this.mPaintText.setTextSize(f);
        invalidate();
    }

    public void setTitlePadding(float f) {
        this.mTitlePadding = f;
        invalidate();
    }

    public void setTopPadding(float f) {
        this.mTopPadding = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.mPaintText.setTypeface(typeface);
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

    public TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C11783R.attr.vpiTitlePageIndicatorStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurrentPage = -1;
        Paint paint = new Paint();
        this.mPaintText = paint;
        this.mPath = new Path();
        this.mBounds = new Rect();
        Paint paint2 = new Paint();
        this.mPaintFooterLine = paint2;
        Paint paint3 = new Paint();
        this.mPaintFooterIndicator = paint3;
        this.mLastMotionX = -1.0f;
        this.mActivePointerId = -1;
        if (!isInEditMode()) {
            Resources resources = getResources();
            int color = resources.getColor(C11783R.C11784color.default_title_indicator_footer_color);
            float dimension = resources.getDimension(C11783R.dimen.default_title_indicator_footer_line_height);
            int integer = resources.getInteger(C11783R.integer.default_title_indicator_footer_indicator_style);
            float dimension2 = resources.getDimension(C11783R.dimen.default_title_indicator_footer_indicator_height);
            float dimension3 = resources.getDimension(C11783R.dimen.default_title_indicator_footer_indicator_underline_padding);
            float dimension4 = resources.getDimension(C11783R.dimen.default_title_indicator_footer_padding);
            int integer2 = resources.getInteger(C11783R.integer.default_title_indicator_line_position);
            int color2 = resources.getColor(C11783R.C11784color.default_title_indicator_selected_color);
            boolean z = resources.getBoolean(C11783R.bool.default_title_indicator_selected_bold);
            int color3 = resources.getColor(C11783R.C11784color.default_title_indicator_text_color);
            float dimension5 = resources.getDimension(C11783R.dimen.default_title_indicator_text_size);
            Paint paint4 = paint3;
            float dimension6 = resources.getDimension(C11783R.dimen.default_title_indicator_title_padding);
            Paint paint5 = paint2;
            float dimension7 = resources.getDimension(C11783R.dimen.default_title_indicator_clip_padding);
            Paint paint6 = paint;
            float dimension8 = resources.getDimension(C11783R.dimen.default_title_indicator_top_padding);
            boolean z2 = z;
            float f = dimension5;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11783R.styleable.TitlePageIndicator, i, 0);
            this.mFooterLineHeight = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_footerLineHeight, dimension);
            this.mFooterIndicatorStyle = IndicatorStyle.fromValue(obtainStyledAttributes.getInteger(C11783R.styleable.TitlePageIndicator_footerIndicatorStyle, integer));
            this.mFooterIndicatorHeight = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_footerIndicatorHeight, dimension2);
            this.mFooterIndicatorUnderlinePadding = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
            this.mFooterPadding = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_footerPadding, dimension4);
            this.mLinePosition = LinePosition.fromValue(obtainStyledAttributes.getInteger(C11783R.styleable.TitlePageIndicator_linePosition, integer2));
            this.mTopPadding = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_topPadding, dimension8);
            this.mTitlePadding = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_titlePadding, dimension6);
            this.mClipPadding = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_clipPadding, dimension7);
            this.mColorSelected = obtainStyledAttributes.getColor(C11783R.styleable.TitlePageIndicator_selectedColor, color2);
            this.mColorText = obtainStyledAttributes.getColor(C11783R.styleable.TitlePageIndicator_android_textColor, color3);
            this.mBoldText = obtainStyledAttributes.getBoolean(C11783R.styleable.TitlePageIndicator_selectedBold, z2);
            float dimension9 = obtainStyledAttributes.getDimension(C11783R.styleable.TitlePageIndicator_android_textSize, f);
            int color4 = obtainStyledAttributes.getColor(C11783R.styleable.TitlePageIndicator_footerColor, color);
            Paint paint7 = paint6;
            paint7.setTextSize(dimension9);
            paint7.setAntiAlias(true);
            Paint paint8 = paint5;
            paint8.setStyle(Paint.Style.FILL_AND_STROKE);
            paint8.setStrokeWidth(this.mFooterLineHeight);
            paint8.setColor(color4);
            Paint paint9 = paint4;
            paint9.setStyle(Paint.Style.FILL_AND_STROKE);
            paint9.setColor(color4);
            Drawable drawable = obtainStyledAttributes.getDrawable(C11783R.styleable.TitlePageIndicator_android_background);
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
