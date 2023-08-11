package androidx.compose.material.internal;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.ViewRootForInspector;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntRect;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.window.PopupPositionProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/PopupLayout\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,475:1\n154#2:476\n1#3:477\n76#4:478\n102#4,2:479\n76#4:481\n102#4,2:482\n76#4:484\n76#4:485\n102#4,2:486\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.kt\nandroidx/compose/material/internal/PopupLayout\n*L\n241#1:476\n233#1:478\n233#1:479,2\n234#1:481\n234#1:482,2\n237#1:484\n286#1:485\n286#1:486,2\n*E\n"})
/* compiled from: ExposedDropdownMenuPopup.kt */
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final C13088o<Offset, IntRect, Boolean> dismissOnOutsideClick;
    private final float maxSupportedElevation;
    private C13074a<C11921v> onDismissRequest;
    private final WindowManager.LayoutParams params = createLayoutParams();
    private final MutableState parentBounds$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final Rect tmpWindowVisibleFrame;
    private final WindowManager windowManager;

    /* compiled from: ExposedDropdownMenuPopup.kt */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(p404of.C13074a<p336ef.C11921v> r8, java.lang.String r9, android.view.View r10, androidx.compose.p002ui.unit.Density r11, androidx.compose.p002ui.window.PopupPositionProvider r12, java.util.UUID r13) {
        /*
            r7 = this;
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            android.content.Context r2 = r10.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.C12775o.m28638h(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.onDismissRequest = r8
            r7.testTag = r9
            r7.composeView = r10
            android.content.Context r8 = r10.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.C12775o.m28637g(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.windowManager = r8
            android.view.WindowManager$LayoutParams r8 = r7.createLayoutParams()
            r7.params = r8
            r7.positionProvider = r12
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p002ui.unit.LayoutDirection.Ltr
            r7.parentLayoutDirection = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.parentBounds$delegate = r12
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.popupContentSize$delegate = r12
            androidx.compose.material.internal.PopupLayout$canCalculatePosition$2 r12 = new androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            r12.<init>(r7)
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r12)
            r7.canCalculatePosition$delegate = r12
            r12 = 8
            float r12 = (float) r12
            float r12 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r12)
            r7.maxSupportedElevation = r12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.previousWindowVisibleFrame = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.tmpWindowVisibleFrame = r0
            androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1 r0 = androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1.INSTANCE
            r7.dismissOnOutsideClick = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r0)
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r10)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r10)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r10)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r0)
            android.view.ViewTreeObserver r10 = r10.getViewTreeObserver()
            r10.addOnGlobalLayoutListener(r7)
            int r10 = androidx.compose.p002ui.C0954R.C0956id.compose_view_saveable_id_tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Popup:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r7.setTag(r10, r13)
            r10 = 0
            r7.setClipChildren(r10)
            float r10 = r11.m38449toPx0680j_4(r12)
            r7.setElevation(r10)
            androidx.compose.material.internal.PopupLayout$2 r10 = new androidx.compose.material.internal.PopupLayout$2
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt r10 = androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.INSTANCE
            of.o r10 = r10.m34206getLambda1$material_release()
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r10, r8, r9, r8)
            r7.content$delegate = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.<init>(of.a, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID):void");
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
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

    private final void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        this.content$delegate.setValue(oVar);
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

    private final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Composable
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1288867704);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288867704, i, -1, "androidx.compose.material.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:301)");
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
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (keyEvent.getKeyCode() == 4) {
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

    public final IntRect getParentBounds() {
        return (IntRect) this.parentBounds$delegate.getValue();
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final IntSize m34210getPopupContentSizebOM6tXw() {
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

    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (!C12775o.m28634d(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            updatePosition();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r3.invoke(r1, r0).booleanValue() == false) goto L_0x008f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0007
            boolean r9 = super.onTouchEvent(r9)
            return r9
        L_0x0007:
            int r0 = r9.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            float r0 = r9.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r9.getX()
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            float r0 = r9.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r9.getY()
            int r2 = r8.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
        L_0x0038:
            int r0 = r9.getAction()
            r2 = 4
            if (r0 != r2) goto L_0x0099
        L_0x003f:
            androidx.compose.ui.unit.IntRect r0 = r8.getParentBounds()
            r2 = 1
            if (r0 == 0) goto L_0x008e
            of.o<androidx.compose.ui.geometry.Offset, androidx.compose.ui.unit.IntRect, java.lang.Boolean> r3 = r8.dismissOnOutsideClick
            float r4 = r9.getX()
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L_0x0053
            r4 = r2
            goto L_0x0054
        L_0x0053:
            r4 = r5
        L_0x0054:
            if (r4 == 0) goto L_0x0066
            float r4 = r9.getY()
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0060
            r1 = r2
            goto L_0x0061
        L_0x0060:
            r1 = r5
        L_0x0061:
            if (r1 != 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r1 = 0
            goto L_0x0082
        L_0x0066:
            android.view.WindowManager$LayoutParams r1 = r8.params
            int r1 = r1.x
            float r1 = (float) r1
            float r4 = r9.getX()
            float r1 = r1 + r4
            android.view.WindowManager$LayoutParams r4 = r8.params
            int r4 = r4.y
            float r4 = (float) r4
            float r6 = r9.getY()
            float r4 = r4 + r6
            long r6 = androidx.compose.p002ui.geometry.OffsetKt.Offset(r1, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r6)
        L_0x0082:
            java.lang.Object r0 = r3.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r5 = r2
        L_0x008f:
            if (r5 == 0) goto L_0x0099
            of.a<ef.v> r9 = r8.onDismissRequest
            if (r9 == 0) goto L_0x0098
            r9.invoke()
        L_0x0098:
            return r2
        L_0x0099:
            boolean r9 = super.onTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setParentBounds(IntRect intRect) {
        this.parentBounds$delegate.setValue(intRect);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        C12775o.m28639i(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m34211setPopupContentSizefhxjrPA(IntSize intSize) {
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

    public final void updateParameters(C13074a<C11921v> aVar, String str, LayoutDirection layoutDirection) {
        C12775o.m28639i(str, "testTag");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        this.onDismissRequest = aVar;
        this.testTag = str;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        IntSize r0;
        IntRect parentBounds = getParentBounds();
        if (parentBounds != null && (r0 = m34210getPopupContentSizebOM6tXw()) != null) {
            long r5 = r0.m38632unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.composeView.getWindowVisibleDisplayFrame(rect);
            IntRect intBounds = toIntBounds(rect);
            long r02 = this.positionProvider.m38718calculatePositionllwVHH4(parentBounds, IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight()), this.parentLayoutDirection, r5);
            this.params.x = IntOffset.m38586getXimpl(r02);
            this.params.y = IntOffset.m38587getYimpl(r02);
            this.windowManager.updateViewLayout(this, this.params);
        }
    }

    public final void setContent(CompositionContext compositionContext, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(oVar, "content");
        setParentCompositionContext(compositionContext);
        setContent(oVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public void setLayoutDirection(int i) {
    }
}
