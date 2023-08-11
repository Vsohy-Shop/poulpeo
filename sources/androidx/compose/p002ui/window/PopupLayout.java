package androidx.compose.p002ui.window;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.UiComposable;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.ViewRootForInspector;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.unit.IntRectKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.core.app.NotificationCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n154#2:825\n1#3:826\n76#4:827\n102#4,2:828\n76#4:830\n102#4,2:831\n76#4:833\n76#4:834\n102#4,2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/PopupLayout\n*L\n413#1:825\n402#1:827\n402#1:828,2\n403#1:830\n403#1:831,2\n407#1:833\n447#1:834\n447#1:835,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
/* compiled from: AndroidPopup.android.kt */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private C13074a<C11921v> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final MutableState parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final WindowManager windowManager;

    /* renamed from: androidx.compose.ui.window.PopupLayout$WhenMappings */
    /* compiled from: AndroidPopup.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p002ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.PopupLayout.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(p404of.C13074a r11, androidx.compose.p002ui.window.PopupProperties r12, java.lang.String r13, android.view.View r14, androidx.compose.p002ui.unit.Density r15, androidx.compose.p002ui.window.PopupPositionProvider r16, java.util.UUID r17, androidx.compose.p002ui.window.PopupLayoutHelper r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.PopupLayoutHelperImpl29 r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl29
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            androidx.compose.ui.window.PopupLayoutHelperImpl r0 = new androidx.compose.ui.window.PopupLayoutHelperImpl
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.PopupLayout.<init>(of.a, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void applyNewFlags(int i) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = i;
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, layoutParams);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & -8552473) | 262144;
        layoutParams.type = PointerIconCompat.TYPE_HAND;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(C0954R.string.default_popup_window_title));
        return layoutParams;
    }

    private final C13088o<Composer, Integer, C11921v> getContent() {
        return (C13088o) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        return C13265c.m30134c(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return C13265c.m30134c(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    /* access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        if (z) {
            i = this.params.flags & -513;
        } else {
            i = this.params.flags | 512;
        }
        applyNewFlags(i);
    }

    private final void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        this.content$delegate.setValue(oVar);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        if (!z) {
            i = this.params.flags | 8;
        } else {
            i = this.params.flags & -9;
        }
        applyNewFlags(i);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        if (SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView))) {
            i = this.params.flags | 8192;
        } else {
            i = this.params.flags & -8193;
        }
        applyNewFlags(i);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    @Composable
    @UiComposable
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PopupLayout$Content$4(this, i));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, (LifecycleOwner) null);
        this.windowManager.removeViewImmediate(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (keyEvent.getKeyCode() == 4 && this.properties.getDismissOnBackPress()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C13074a<C11921v> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m38716getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.params.width = childAt.getMeasuredWidth();
            this.params.height = childAt.getMeasuredHeight();
            this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z2 = false;
        if (motionEvent == null || motionEvent.getAction() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z2 = true;
            }
            if (!z2) {
                return super.onTouchEvent(motionEvent);
            }
            C13074a<C11921v> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        C13074a<C11921v> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i = iArr[0];
        int i2 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            updateParentBounds$ui_release();
        }
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m38717setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        C12775o.m28639i(popupPositionProvider, "<set-?>");
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        C12775o.m28639i(str, "<set-?>");
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(C13074a<C11921v> aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        C12775o.m28639i(popupProperties, "properties");
        C12775o.m28639i(str, "testTag");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        this.onDismissRequest = aVar;
        this.properties = popupProperties;
        this.testTag = str;
        setIsFocusable(popupProperties.getFocusable());
        setSecurePolicy(popupProperties.getSecurePolicy());
        setClippingEnabled(popupProperties.getClippingEnabled());
        superSetLayoutDirection(layoutDirection);
    }

    @VisibleForTesting(otherwise = 2)
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long r1 = parentLayoutCoordinates.m37341getSizeYbymL2g();
            long positionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect r0 = IntRectKt.m38618IntRectVbeCjmY(IntOffsetKt.IntOffset(C13265c.m30134c(Offset.m35422getXimpl(positionInWindow)), C13265c.m30134c(Offset.m35423getYimpl(positionInWindow))), r1);
            if (!C12775o.m28634d(r0, this.parentBounds)) {
                this.parentBounds = r0;
                updatePosition();
            }
        }
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "parentLayoutCoordinates");
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize r0;
        IntRect intRect = this.parentBounds;
        if (intRect != null && (r0 = m38716getPopupContentSizebOM6tXw()) != null) {
            long r5 = r0.m38632unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
            IntRect access$toIntBounds = AndroidPopup_androidKt.toIntBounds(rect);
            long IntSize = IntSizeKt.IntSize(access$toIntBounds.getWidth(), access$toIntBounds.getHeight());
            long r02 = this.positionProvider.m38718calculatePositionllwVHH4(intRect, IntSize, this.parentLayoutDirection, r5);
            this.params.x = IntOffset.m38586getXimpl(r02);
            this.params.y = IntOffset.m38587getYimpl(r02);
            if (this.properties.getExcludeFromSystemGesture()) {
                this.popupLayoutHelper.setGestureExclusionRects(this, IntSize.m38628getWidthimpl(IntSize), IntSize.m38627getHeightimpl(IntSize));
            }
            this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
        }
    }

    public final void setContent(CompositionContext compositionContext, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(oVar, "content");
        setParentCompositionContext(compositionContext);
        setContent(oVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(p404of.C13074a<p336ef.C11921v> r8, androidx.compose.p002ui.window.PopupProperties r9, java.lang.String r10, android.view.View r11, androidx.compose.p002ui.unit.Density r12, androidx.compose.p002ui.window.PopupPositionProvider r13, java.util.UUID r14, androidx.compose.p002ui.window.PopupLayoutHelper r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.C12775o.m28639i(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.C12775o.m28638h(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.onDismissRequest = r8
            r7.properties = r9
            r7.testTag = r10
            r7.composeView = r11
            r7.popupLayoutHelper = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.C12775o.m28637g(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.windowManager = r8
            android.view.WindowManager$LayoutParams r8 = r7.createLayoutParams()
            r7.params = r8
            r7.positionProvider = r13
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p002ui.unit.LayoutDirection.Ltr
            r7.parentLayoutDirection = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r10 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.popupContentSize$delegate = r10
            androidx.compose.runtime.MutableState r10 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.parentLayoutCoordinates$delegate = r10
            androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 r10 = new androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            r10.<init>(r7)
            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r10)
            r7.canCalculatePosition$delegate = r10
            r10 = 8
            float r10 = (float) r10
            float r10 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r10)
            r7.maxSupportedElevation = r10
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.previousWindowVisibleFrame = r13
            r13 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r13)
            androidx.lifecycle.LifecycleOwner r13 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r11)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r13)
            androidx.lifecycle.ViewModelStoreOwner r13 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r11)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r13)
            androidx.savedstate.SavedStateRegistryOwner r11 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r11)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r11)
            int r11 = androidx.compose.p002ui.C0954R.C0956id.compose_view_saveable_id_tag
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "Popup:"
            r13.append(r15)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r7.setTag(r11, r13)
            r11 = 0
            r7.setClipChildren(r11)
            float r10 = r12.m38449toPx0680j_4(r10)
            r7.setElevation(r10)
            androidx.compose.ui.window.PopupLayout$2 r10 = new androidx.compose.ui.window.PopupLayout$2
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt r10 = androidx.compose.p002ui.window.ComposableSingletons$AndroidPopup_androidKt.INSTANCE
            of.o r10 = r10.m38715getLambda1$ui_release()
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r10, r8, r9, r8)
            r7.content$delegate = r8
            int[] r8 = new int[r9]
            r7.locationOnScreen = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.PopupLayout.<init>(of.a, androidx.compose.ui.window.PopupProperties, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID, androidx.compose.ui.window.PopupLayoutHelper):void");
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public void setLayoutDirection(int i) {
    }
}
