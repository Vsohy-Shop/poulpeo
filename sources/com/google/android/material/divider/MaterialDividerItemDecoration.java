package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0127Px;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C6372R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

public class MaterialDividerItemDecoration extends RecyclerView.ItemDecoration {
    private static final int DEF_STYLE_RES = C6372R.C6378style.Widget_MaterialComponents_MaterialDivider;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    @ColorInt
    private int color;
    @NonNull
    private Drawable dividerDrawable;
    private int insetEnd;
    private int insetStart;
    private boolean lastItemDecorated;
    private int orientation;
    private final Rect tempRect;
    private int thickness;

    public MaterialDividerItemDecoration(@NonNull Context context, int i) {
        this(context, (AttributeSet) null, i);
    }

    private void drawForHorizontalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int i3 = i2 + this.insetStart;
        int i4 = i - this.insetEnd;
        int childCount = recyclerView.getChildCount();
        if (!this.lastItemDecorated) {
            childCount--;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int round = this.tempRect.right + Math.round(childAt.getTranslationX());
            this.dividerDrawable.setBounds((round - this.dividerDrawable.getIntrinsicWidth()) - this.thickness, i3, round, i4);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private void drawForVerticalOrientation(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        boolean z = true;
        if (ViewCompat.getLayoutDirection(recyclerView) != 1) {
            z = false;
        }
        if (z) {
            i3 = this.insetEnd;
        } else {
            i3 = this.insetStart;
        }
        int i5 = i2 + i3;
        if (z) {
            i4 = this.insetStart;
        } else {
            i4 = this.insetEnd;
        }
        int i6 = i - i4;
        int childCount = recyclerView.getChildCount();
        if (!this.lastItemDecorated) {
            childCount--;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.tempRect);
            int round = this.tempRect.bottom + Math.round(childAt.getTranslationY());
            this.dividerDrawable.setBounds(i5, (round - this.dividerDrawable.getIntrinsicHeight()) - this.thickness, i6, round);
            this.dividerDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @ColorInt
    public int getDividerColor() {
        return this.color;
    }

    @C0127Px
    public int getDividerInsetEnd() {
        return this.insetEnd;
    }

    @C0127Px
    public int getDividerInsetStart() {
        return this.insetStart;
    }

    @C0127Px
    public int getDividerThickness() {
        return this.thickness;
    }

    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        rect.set(0, 0, 0, 0);
        if (!this.lastItemDecorated && recyclerView.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            return;
        }
        if (this.orientation == 1) {
            rect.bottom = this.dividerDrawable.getIntrinsicHeight() + this.thickness;
        } else {
            rect.right = this.dividerDrawable.getIntrinsicWidth() + this.thickness;
        }
    }

    public int getOrientation() {
        return this.orientation;
    }

    public boolean isLastItemDecorated() {
        return this.lastItemDecorated;
    }

    public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        if (recyclerView.getLayoutManager() != null) {
            if (this.orientation == 1) {
                drawForVerticalOrientation(canvas, recyclerView);
            } else {
                drawForHorizontalOrientation(canvas, recyclerView);
            }
        }
    }

    public void setDividerColor(@ColorInt int i) {
        this.color = i;
        Drawable wrap = DrawableCompat.wrap(this.dividerDrawable);
        this.dividerDrawable = wrap;
        DrawableCompat.setTint(wrap, i);
    }

    public void setDividerColorResource(@NonNull Context context, @ColorRes int i) {
        setDividerColor(ContextCompat.getColor(context, i));
    }

    public void setDividerInsetEnd(@C0127Px int i) {
        this.insetEnd = i;
    }

    public void setDividerInsetEndResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetEnd(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@C0127Px int i) {
        this.insetStart = i;
    }

    public void setDividerInsetStartResource(@NonNull Context context, @DimenRes int i) {
        setDividerInsetStart(context.getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@C0127Px int i) {
        this.thickness = i;
    }

    public void setDividerThicknessResource(@NonNull Context context, @DimenRes int i) {
        setDividerThickness(context.getResources().getDimensionPixelSize(i));
    }

    public void setLastItemDecorated(boolean z) {
        this.lastItemDecorated = z;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.orientation = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i + ". It should be either HORIZONTAL or VERTICAL");
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, C6372R.attr.materialDividerStyle, i);
    }

    public MaterialDividerItemDecoration(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this.tempRect = new Rect();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C6372R.styleable.MaterialDivider, i, DEF_STYLE_RES, new int[0]);
        this.color = MaterialResources.getColorStateList(context, obtainStyledAttributes, C6372R.styleable.MaterialDivider_dividerColor).getDefaultColor();
        this.thickness = obtainStyledAttributes.getDimensionPixelSize(C6372R.styleable.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(C6372R.dimen.material_divider_thickness));
        this.insetStart = obtainStyledAttributes.getDimensionPixelOffset(C6372R.styleable.MaterialDivider_dividerInsetStart, 0);
        this.insetEnd = obtainStyledAttributes.getDimensionPixelOffset(C6372R.styleable.MaterialDivider_dividerInsetEnd, 0);
        this.lastItemDecorated = obtainStyledAttributes.getBoolean(C6372R.styleable.MaterialDivider_lastItemDecorated, true);
        obtainStyledAttributes.recycle();
        this.dividerDrawable = new ShapeDrawable();
        setDividerColor(this.color);
        setOrientation(i2);
    }
}
