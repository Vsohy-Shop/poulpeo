package androidx.compose.p002ui.window;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.p002ui.platform.ViewRootForInspector;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.core.app.NotificationCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,456:1\n154#2:457\n1#3:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogWrapper\n*L\n300#1:457\n*E\n"})
/* renamed from: androidx.compose.ui.window.DialogWrapper */
/* compiled from: AndroidDialog.android.kt */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {
    private final View composeView;
    private final int defaultSoftInputMode;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    /* access modifiers changed from: private */
    public C13074a<C11921v> onDismissRequest;
    /* access modifiers changed from: private */
    public DialogProperties properties;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$WhenMappings */
    /* compiled from: AndroidDialog.android.kt */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.DialogWrapper.WhenMappings.<clinit>():void");
        }
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [android.view.View] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DialogWrapper(p404of.C13074a<p336ef.C11921v> r7, androidx.compose.p002ui.window.DialogProperties r8, android.view.View r9, androidx.compose.p002ui.unit.LayoutDirection r10, androidx.compose.p002ui.unit.Density r11, java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "onDismissRequest"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r0 = "layoutDirection"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            java.lang.String r0 = "dialogId"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r9.getContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 >= r3) goto L_0x0034
            boolean r2 = r8.getDecorFitsSystemWindows()
            if (r2 == 0) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            int r2 = androidx.compose.p002ui.C0954R.C0957style.FloatingDialogWindowTheme
            goto L_0x0036
        L_0x0034:
            int r2 = androidx.compose.p002ui.C0954R.C0957style.DialogWindowTheme
        L_0x0036:
            r0.<init>(r1, r2)
            r1 = 2
            r2 = 0
            r3 = 0
            r6.<init>(r0, r2, r1, r3)
            r6.onDismissRequest = r7
            r6.properties = r8
            r6.composeView = r9
            r7 = 8
            float r7 = (float) r7
            float r7 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r7)
            r6.maxSupportedElevation = r7
            android.view.Window r8 = r6.getWindow()
            if (r8 == 0) goto L_0x00e9
            android.view.WindowManager$LayoutParams r0 = r8.getAttributes()
            int r0 = r0.softInputMode
            r0 = r0 & 240(0xf0, float:3.36E-43)
            r6.defaultSoftInputMode = r0
            r0 = 1
            r8.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r8.setBackgroundDrawableResource(r0)
            androidx.compose.ui.window.DialogProperties r0 = r6.properties
            boolean r0 = r0.getDecorFitsSystemWindows()
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r8, r0)
            androidx.compose.ui.window.DialogLayout r0 = new androidx.compose.ui.window.DialogLayout
            android.content.Context r1 = r6.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.C12775o.m28638h(r1, r4)
            r0.<init>(r1, r8)
            int r1 = androidx.compose.p002ui.C0954R.C0956id.compose_view_saveable_id_tag
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Dialog:"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            r0.setTag(r1, r12)
            r0.setClipChildren(r2)
            float r7 = r11.m38449toPx0680j_4(r7)
            r0.setElevation(r7)
            androidx.compose.ui.window.DialogWrapper$1$2 r7 = new androidx.compose.ui.window.DialogWrapper$1$2
            r7.<init>()
            r0.setOutlineProvider(r7)
            r6.dialogLayout = r0
            android.view.View r7 = r8.getDecorView()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00b4
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            _init_$disableClipping(r3)
        L_0x00b9:
            r6.setContentView((android.view.View) r0)
            androidx.lifecycle.LifecycleOwner r7 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r9)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r7)
            androidx.lifecycle.ViewModelStoreOwner r7 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r9)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r7)
            androidx.savedstate.SavedStateRegistryOwner r7 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r7)
            of.a<ef.v> r7 = r6.onDismissRequest
            androidx.compose.ui.window.DialogProperties r8 = r6.properties
            r6.updateParameters(r7, r8, r10)
            androidx.activity.OnBackPressedDispatcher r0 = r6.getOnBackPressedDispatcher()
            r2 = 0
            androidx.compose.ui.window.DialogWrapper$2 r3 = new androidx.compose.ui.window.DialogWrapper$2
            r3.<init>(r6)
            r4 = 2
            r5 = 0
            r1 = r6
            androidx.activity.OnBackPressedDispatcherKt.addCallback$default(r0, r1, r2, r3, r4, r5)
            return
        L_0x00e9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Dialog has no window"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.window.DialogWrapper.<init>(of.a, androidx.compose.ui.window.DialogProperties, android.view.View, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, java.util.UUID):void");
    }

    private static final void _init_$disableClipping(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof DialogLayout)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    _init_$disableClipping(viewGroup2);
                }
            }
        }
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection) {
        DialogLayout dialogLayout2 = this.dialogLayout;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout2.setLayoutDirection(i2);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        int i;
        boolean shouldApplySecureFlag = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window = getWindow();
        C12775o.m28636f(window);
        if (shouldApplySecureFlag) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C12775o.m28639i(motionEvent, NotificationCompat.CATEGORY_EVENT);
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return onTouchEvent;
    }

    public final void setContent(CompositionContext compositionContext, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(compositionContext, "parentComposition");
        C12775o.m28639i(oVar, "children");
        this.dialogLayout.setContent(compositionContext, oVar);
    }

    public final void updateParameters(C13074a<C11921v> aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        C12775o.m28639i(aVar, "onDismissRequest");
        C12775o.m28639i(dialogProperties, "properties");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        this.onDismissRequest = aVar;
        this.properties = dialogProperties;
        setSecurePolicy(dialogProperties.getSecurePolicy());
        setLayoutDirection(layoutDirection);
        this.dialogLayout.setUsePlatformDefaultWidth(dialogProperties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT >= 31) {
            return;
        }
        if (dialogProperties.getDecorFitsSystemWindows()) {
            Window window = getWindow();
            if (window != null) {
                window.setSoftInputMode(this.defaultSoftInputMode);
                return;
            }
            return;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
    }

    public void cancel() {
    }
}
