package androidx.compose.p002ui.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.compose.p002ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/DialogLayout\n*L\n216#1:457\n216#1:458,2\n*E\n"})
/* renamed from: androidx.compose.ui.window.DialogLayout */
/* compiled from: AndroidDialog.android.kt */
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private final MutableState content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m38714getLambda1$ui_release(), (SnapshotMutationPolicy) null, 2, (Object) null);
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogLayout(Context context, Window window2) {
        super(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(window2, "window");
        this.window = window2;
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

    private final void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        this.content$delegate.setValue(oVar);
    }

    @Composable
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:266)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i));
        }
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public Window getWindow() {
        return this.window;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setUsePlatformDefaultWidth(boolean z) {
        this.usePlatformDefaultWidth = z;
    }

    public final void setContent(CompositionContext compositionContext, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(compositionContext, "parent");
        C12775o.m28639i(oVar, "content");
        setParentCompositionContext(compositionContext);
        setContent(oVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
