package androidx.compose.p002ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifierKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p002ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p002ui.platform.WindowRecomposer_androidKt;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.p002ui.unit.VelocityKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder */
/* compiled from: AndroidViewHolder.android.kt */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback {
    private Density density;
    /* access modifiers changed from: private */
    public final NestedScrollDispatcher dispatcher;
    /* access modifiers changed from: private */
    public boolean hasUpdateBlock;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    /* access modifiers changed from: private */
    public final Function1<AndroidViewHolder, C11921v> onCommitAffectingUpdate;
    private Function1<? super Density, C11921v> onDensityChanged;
    private Function1<? super Modifier, C11921v> onModifierChanged;
    private Function1<? super Boolean, C11921v> onRequestDisallowInterceptTouchEvent;
    private C13074a<C11921v> release;
    private C13074a<C11921v> reset;
    /* access modifiers changed from: private */
    public final C13074a<C11921v> runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    /* access modifiers changed from: private */
    public final SnapshotStateObserver snapshotObserver;
    private C13074a<C11921v> update;
    private View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, NestedScrollDispatcher nestedScrollDispatcher) {
        super(context);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(nestedScrollDispatcher, "dispatcher");
        this.dispatcher = nestedScrollDispatcher;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null);
        this.snapshotObserver = new SnapshotStateObserver(new AndroidViewHolder$snapshotObserver$1(this));
        this.onCommitAffectingUpdate = new AndroidViewHolder$onCommitAffectingUpdate$1(this);
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        LayoutNode layoutNode2 = new LayoutNode(false, 0, 3, (DefaultConstructorMarker) null);
        layoutNode2.setInteropViewFactoryHolder$ui_release(this);
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(companion, true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(layoutNode2, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode2));
        layoutNode2.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode2, onGloballyPositioned);
        layoutNode2.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        layoutNode2.setOnAttach$ui_release(new AndroidViewHolder$layoutNode$1$3(this, layoutNode2, ref$ObjectRef));
        layoutNode2.setOnDetach$ui_release(new AndroidViewHolder$layoutNode$1$4(this, ref$ObjectRef));
        layoutNode2.setMeasurePolicy(new AndroidViewHolder$layoutNode$1$5(this, layoutNode2));
        this.layoutNode = layoutNode2;
    }

    /* access modifiers changed from: private */
    public final int obtainMeasureSpec(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(C13537l.m30886m(i3, i, i2), BasicMeasure.EXACTLY);
        }
        if (i3 == -2 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
        }
        if (i3 != -1 || i2 == Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, BasicMeasure.EXACTLY);
    }

    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view2 = this.view;
        if (view2 == null || (layoutParams = view2.getLayoutParams()) == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final Function1<Density, C11921v> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, C11921v> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, C11921v> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final C13074a<C11921v> getRelease() {
        return this.release;
    }

    public final C13074a<C11921v> getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final C13074a<C11921v> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        this.layoutNode.invalidateLayer$ui_release();
        return null;
    }

    public boolean isNestedScrollingEnabled() {
        View view2 = this.view;
        if (view2 != null) {
            return view2.isNestedScrollingEnabled();
        }
        return super.isNestedScrollingEnabled();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.start();
    }

    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    public void onDescendantInvalidated(View view2, View view3) {
        C12775o.m28639i(view2, "child");
        C12775o.m28639i(view3, TypedValues.AttributesType.S_TARGET);
        super.onDescendantInvalidated(view2, view3);
        this.layoutNode.invalidateLayer$ui_release();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotObserver.stop();
        this.snapshotObserver.clear();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view2 = this.view;
        if (view2 != null) {
            view2.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        ViewParent viewParent;
        int i3;
        View view2 = this.view;
        if (view2 != null) {
            viewParent = view2.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        View view3 = this.view;
        if (view3 != null) {
            view3.measure(i, i2);
        }
        View view4 = this.view;
        int i4 = 0;
        if (view4 != null) {
            i3 = view4.getMeasuredWidth();
        } else {
            i3 = 0;
        }
        View view5 = this.view;
        if (view5 != null) {
            i4 = view5.getMeasuredHeight();
        }
        setMeasuredDimension(i3, i4);
        this.lastWidthMeasureSpec = i;
        this.lastHeightMeasureSpec = i2;
    }

    public boolean onNestedFling(View view2, float f, float f2, boolean z) {
        View view3 = view2;
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        long Velocity = VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f), AndroidViewHolder_androidKt.toComposeVelocity(f2));
        C14054y1 unused = C13985j.m32422d(this.dispatcher.getCoroutineScope(), (C12079g) null, (C14004n0) null, new AndroidViewHolder$onNestedFling$1(z, this, Velocity, (C12074d<? super AndroidViewHolder$onNestedFling$1>) null), 3, (Object) null);
        return false;
    }

    public boolean onNestedPreFling(View view2, float f, float f2) {
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C14054y1 unused = C13985j.m32422d(this.dispatcher.getCoroutineScope(), (C12079g) null, (C14004n0) null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(f), AndroidViewHolder_androidKt.toComposeVelocity(f2)), (C12074d<? super AndroidViewHolder$onNestedPreFling$1>) null), 3, (Object) null);
        return false;
    }

    public void onNestedPreScroll(View view2, int i, int i2, int[] iArr, int i3) {
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        C12775o.m28639i(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long r2 = this.dispatcher.m37055dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i), AndroidViewHolder_androidKt.toComposeOffset(i2)), AndroidViewHolder_androidKt.toNestedScrollSource(i3));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35422getXimpl(r2));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35423getYimpl(r2));
        }
    }

    public void onNestedScroll(View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        C12775o.m28639i(iArr, "consumed");
        if (isNestedScrollingEnabled()) {
            long r7 = this.dispatcher.m37053dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i), AndroidViewHolder_androidKt.toComposeOffset(i2)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i3), AndroidViewHolder_androidKt.toComposeOffset(i4)), AndroidViewHolder_androidKt.toNestedScrollSource(i5));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35422getXimpl(r7));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m35423getYimpl(r7));
        }
    }

    public void onNestedScrollAccepted(View view2, View view3, int i, int i2) {
        C12775o.m28639i(view2, "child");
        C12775o.m28639i(view3, TypedValues.AttributesType.S_TARGET);
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view2, view3, i, i2);
    }

    public void onRelease() {
        this.release.invoke();
    }

    public void onReuse() {
        View view2 = this.view;
        C12775o.m28636f(view2);
        if (view2.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    public boolean onStartNestedScroll(View view2, View view3, int i, int i2) {
        C12775o.m28639i(view2, "child");
        C12775o.m28639i(view3, TypedValues.AttributesType.S_TARGET);
        if ((i & 2) == 0 && (i & 1) == 0) {
            return false;
        }
        return true;
    }

    public void onStopNestedScroll(View view2, int i) {
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        this.nestedScrollingParentHelper.onStopNestedScroll(view2, i);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public final void remeasure() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 != Integer.MIN_VALUE && (i = this.lastHeightMeasureSpec) != Integer.MIN_VALUE) {
            measure(i2, i);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1<? super Boolean, C11921v> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density2) {
        C12775o.m28639i(density2, "value");
        if (density2 != this.density) {
            this.density = density2;
            Function1<? super Density, C11921v> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density2);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner2) {
        if (lifecycleOwner2 != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner2;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner2);
        }
    }

    public final void setModifier(Modifier modifier2) {
        C12775o.m28639i(modifier2, "value");
        if (modifier2 != this.modifier) {
            this.modifier = modifier2;
            Function1<? super Modifier, C11921v> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier2);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, C11921v> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, C11921v> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, C11921v> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    /* access modifiers changed from: protected */
    public final void setRelease(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "<set-?>");
        this.release = aVar;
    }

    /* access modifiers changed from: protected */
    public final void setReset(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "<set-?>");
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner2) {
        if (savedStateRegistryOwner2 != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner2;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner2);
        }
    }

    /* access modifiers changed from: protected */
    public final void setUpdate(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "value");
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setView$ui_release(View view2) {
        if (view2 != this.view) {
            this.view = view2;
            removeAllViewsInLayout();
            if (view2 != null) {
                addView(view2);
                this.runUpdate.invoke();
            }
        }
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public void onNestedScroll(View view2, int i, int i2, int i3, int i4, int i5) {
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m37053dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i), AndroidViewHolder_androidKt.toComposeOffset(i2)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(i3), AndroidViewHolder_androidKt.toComposeOffset(i4)), AndroidViewHolder_androidKt.toNestedScrollSource(i5));
        }
    }
}
