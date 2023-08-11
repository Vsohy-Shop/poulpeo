package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.C0127Px;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0129R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.C6372R;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;

public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = C6372R.C6378style.Widget_Design_NavigationView;
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;
    @C0127Px
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    @NonNull
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    /* access modifiers changed from: private */
    public final NavigationMenuPresenter presenter;
    private final RectF shapeClipBounds;
    @Nullable
    private Path shapeClipPath;
    /* access modifiers changed from: private */
    public final int[] tmpLocation;
    private boolean topInsetScrimEnabled;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    @Nullable
    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = AppCompatResources.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0129R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @NonNull
    private Drawable createDefaultItemBackground(@NonNull TintTypedArray tintTypedArray) {
        return createDefaultItemDrawable(tintTypedArray, MaterialResources.getColorStateList(getContext(), tintTypedArray, C6372R.styleable.NavigationView_itemShapeFillColor));
    }

    @NonNull
    private Drawable createDefaultItemDrawable(@NonNull TintTypedArray tintTypedArray, @Nullable ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), tintTypedArray.getResourceId(C6372R.styleable.NavigationView_itemShapeAppearance, 0), tintTypedArray.getResourceId(C6372R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable(materialShapeDrawable, tintTypedArray.getDimensionPixelSize(C6372R.styleable.NavigationView_itemShapeInsetStart, 0), tintTypedArray.getDimensionPixelSize(C6372R.styleable.NavigationView_itemShapeInsetTop, 0), tintTypedArray.getDimensionPixelSize(C6372R.styleable.NavigationView_itemShapeInsetEnd, 0), tintTypedArray.getDimensionPixelSize(C6372R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@NonNull TintTypedArray tintTypedArray) {
        if (tintTypedArray.hasValue(C6372R.styleable.NavigationView_itemShapeAppearance) || tintTypedArray.hasValue(C6372R.styleable.NavigationView_itemShapeAppearanceOverlay)) {
            return true;
        }
        return false;
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@C0127Px int i, @C0127Px int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.drawerLayoutCornerSize <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.shapeClipPath = null;
            this.shapeClipBounds.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        if (GravityCompat.getAbsoluteGravity(this.layoutGravity, ViewCompat.getLayoutDirection(this)) == 3) {
            builder.setTopRightCornerSize((float) this.drawerLayoutCornerSize);
            builder.setBottomRightCornerSize((float) this.drawerLayoutCornerSize);
        } else {
            builder.setTopLeftCornerSize((float) this.drawerLayoutCornerSize);
            builder.setBottomLeftCornerSize((float) this.drawerLayoutCornerSize);
        }
        materialShapeDrawable.setShapeAppearanceModel(builder.build());
        if (this.shapeClipPath == null) {
            this.shapeClipPath = new Path();
        }
        this.shapeClipPath.reset();
        this.shapeClipBounds.set(0.0f, 0.0f, (float) i, (float) i2);
        ShapeAppearancePathProvider.getInstance().calculatePath(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.shapeClipBounds, this.shapeClipPath);
        invalidate();
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z5 = true;
                if (NavigationView.this.tmpLocation[1] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                NavigationView.this.presenter.setBehindStatusBar(z);
                NavigationView navigationView2 = NavigationView.this;
                if (!z || !navigationView2.isTopInsetScrimEnabled()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                navigationView2.setDrawTopInsetForeground(z2);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    if (activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    NavigationView navigationView3 = NavigationView.this;
                    if (!z3 || !z4 || !navigationView3.isBottomInsetScrimEnabled()) {
                        z5 = false;
                    }
                    navigationView3.setDrawBottomInsetForeground(z5);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@NonNull View view) {
        this.presenter.addHeaderView(view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.shapeClipPath == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.shapeClipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    @C0127Px
    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    @C0127Px
    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @C0127Px
    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @NonNull
    public Menu getMenu() {
        return this.menu;
    }

    @C0127Px
    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    @C0127Px
    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public View inflateHeaderView(@LayoutRes int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onInsetsChanged(@NonNull WindowInsetsCompat windowInsetsCompat) {
        this.presenter.dispatchApplyWindowInsets(windowInsetsCompat);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), BasicMeasure.EXACTLY);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, BasicMeasure.EXACTLY);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(@NonNull View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem findItem = this.menu.findItem(i);
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
        }
    }

    public void setDividerInsetEnd(@C0127Px int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(@C0127Px int i) {
        this.presenter.setDividerInsetStart(i);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@Dimension int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@Dimension int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@C0127Px int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(@C0127Px int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public void setSubheaderInsetStart(@C0127Px int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        @Nullable
        public Bundle menuState;

        public SavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C6372R.attr.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r17, @androidx.annotation.Nullable android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.google.android.material.internal.NavigationMenuPresenter r10 = new com.google.android.material.internal.NavigationMenuPresenter
            r10.<init>()
            r0.presenter = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpLocation = r1
            r11 = 1
            r0.topInsetScrimEnabled = r11
            r0.bottomInsetScrimEnabled = r11
            r12 = 0
            r0.layoutGravity = r12
            r0.drawerLayoutCornerSize = r12
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.shapeClipBounds = r1
            android.content.Context r13 = r16.getContext()
            com.google.android.material.internal.NavigationMenu r14 = new com.google.android.material.internal.NavigationMenu
            r14.<init>(r13)
            r0.menu = r14
            int[] r3 = com.google.android.material.C6372R.styleable.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            androidx.appcompat.widget.TintTypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_android_background
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0056
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            androidx.core.view.ViewCompat.setBackground(r0, r2)
        L_0x0056:
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_drawerLayoutCornerSize
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.drawerLayoutCornerSize = r2
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_android_layout_gravity
            int r2 = r1.getInt(r2, r12)
            r0.layoutGravity = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0074
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x009c
        L_0x0074:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = com.google.android.material.shape.ShapeAppearanceModel.builder((android.content.Context) r13, (android.util.AttributeSet) r7, (int) r8, (int) r9)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            android.graphics.drawable.Drawable r3 = r16.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            r4.<init>((com.google.android.material.shape.ShapeAppearanceModel) r2)
            boolean r2 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0096
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r2 = r3.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.setFillColor(r2)
        L_0x0096:
            r4.initializeElevationOverlay(r13)
            androidx.core.view.ViewCompat.setBackground(r0, r4)
        L_0x009c:
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_elevation
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x00ac
            int r2 = r1.getDimensionPixelSize(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00ac:
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.getBoolean(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_android_maxWidth
            int r2 = r1.getDimensionPixelSize(r2, r12)
            r0.maxWidth = r2
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_subheaderColor
            boolean r3 = r1.hasValue(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cb
            android.content.res.ColorStateList r2 = r1.getColorStateList(r2)
            goto L_0x00cc
        L_0x00cb:
            r2 = r4
        L_0x00cc:
            int r3 = com.google.android.material.C6372R.styleable.NavigationView_subheaderTextAppearance
            boolean r5 = r1.hasValue(r3)
            if (r5 == 0) goto L_0x00d9
            int r3 = r1.getResourceId(r3, r12)
            goto L_0x00da
        L_0x00d9:
            r3 = r12
        L_0x00da:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
            android.content.res.ColorStateList r2 = r0.createDefaultColorStateList(r5)
        L_0x00e5:
            int r6 = com.google.android.material.C6372R.styleable.NavigationView_itemIconTint
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto L_0x00f2
            android.content.res.ColorStateList r5 = r1.getColorStateList(r6)
            goto L_0x00f6
        L_0x00f2:
            android.content.res.ColorStateList r5 = r0.createDefaultColorStateList(r5)
        L_0x00f6:
            int r6 = com.google.android.material.C6372R.styleable.NavigationView_itemTextAppearance
            boolean r7 = r1.hasValue(r6)
            if (r7 == 0) goto L_0x0103
            int r6 = r1.getResourceId(r6, r12)
            goto L_0x0104
        L_0x0103:
            r6 = r12
        L_0x0104:
            int r7 = com.google.android.material.C6372R.styleable.NavigationView_itemIconSize
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L_0x0113
            int r7 = r1.getDimensionPixelSize(r7, r12)
            r0.setItemIconSize(r7)
        L_0x0113:
            int r7 = com.google.android.material.C6372R.styleable.NavigationView_itemTextColor
            boolean r8 = r1.hasValue(r7)
            if (r8 == 0) goto L_0x0120
            android.content.res.ColorStateList r7 = r1.getColorStateList(r7)
            goto L_0x0121
        L_0x0120:
            r7 = r4
        L_0x0121:
            if (r6 != 0) goto L_0x012c
            if (r7 != 0) goto L_0x012c
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.createDefaultColorStateList(r7)
        L_0x012c:
            int r8 = com.google.android.material.C6372R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r8)
            if (r8 != 0) goto L_0x0156
            boolean r9 = r0.hasShapeAppearance(r1)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r8 = r0.createDefaultItemBackground(r1)
            int r9 = com.google.android.material.C6372R.styleable.NavigationView_itemRippleColor
            android.content.res.ColorStateList r9 = com.google.android.material.resources.MaterialResources.getColorStateList((android.content.Context) r13, (androidx.appcompat.widget.TintTypedArray) r1, (int) r9)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r15 = r0.createDefaultItemDrawable(r1, r4)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = com.google.android.material.ripple.RippleUtils.sanitizeRippleDrawableColor(r9)
            r11.<init>(r9, r4, r15)
            r10.setItemForeground(r11)
        L_0x0156:
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_itemHorizontalPadding
            boolean r9 = r1.hasValue(r4)
            if (r9 == 0) goto L_0x0165
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setItemHorizontalPadding(r4)
        L_0x0165:
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_itemVerticalPadding
            boolean r9 = r1.hasValue(r4)
            if (r9 == 0) goto L_0x0174
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setItemVerticalPadding(r4)
        L_0x0174:
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_dividerInsetStart
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setDividerInsetStart(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_dividerInsetEnd
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setDividerInsetEnd(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_subheaderInsetStart
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setSubheaderInsetStart(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_subheaderInsetEnd
            int r4 = r1.getDimensionPixelSize(r4, r12)
            r0.setSubheaderInsetEnd(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.topInsetScrimEnabled
            boolean r4 = r1.getBoolean(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.bottomInsetScrimEnabled
            boolean r4 = r1.getBoolean(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = com.google.android.material.C6372R.styleable.NavigationView_itemIconPadding
            int r4 = r1.getDimensionPixelSize(r4, r12)
            int r9 = com.google.android.material.C6372R.styleable.NavigationView_itemMaxLines
            r11 = 1
            int r9 = r1.getInt(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.NavigationView$1 r9 = new com.google.android.material.navigation.NavigationView$1
            r9.<init>()
            r14.setCallback(r9)
            r10.setId(r11)
            r10.initForMenu(r13, r14)
            if (r3 == 0) goto L_0x01d1
            r10.setSubheaderTextAppearance(r3)
        L_0x01d1:
            r10.setSubheaderColor(r2)
            r10.setItemIconTintList(r5)
            int r2 = r16.getOverScrollMode()
            r10.setOverScrollMode(r2)
            if (r6 == 0) goto L_0x01e3
            r10.setItemTextAppearance(r6)
        L_0x01e3:
            r10.setItemTextColor(r7)
            r10.setItemBackground(r8)
            r10.setItemIconPadding(r4)
            r14.addMenuPresenter(r10)
            androidx.appcompat.view.menu.MenuView r2 = r10.getMenuView(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_menu
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0207
            int r2 = r1.getResourceId(r2, r12)
            r0.inflateMenu(r2)
        L_0x0207:
            int r2 = com.google.android.material.C6372R.styleable.NavigationView_headerLayout
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0216
            int r2 = r1.getResourceId(r2, r12)
            r0.inflateHeaderView(r2)
        L_0x0216:
            r1.recycle()
            r16.setupInsetScrimsListener()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((MenuItemImpl) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
