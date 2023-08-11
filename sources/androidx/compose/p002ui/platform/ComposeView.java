package androidx.compose.p002ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.platform.ComposeView */
/* compiled from: ComposeView.android.kt */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final MutableState<C13088o<Composer, Integer, C11921v>> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C12775o.m28639i(context, "context");
    }

    @Composable
    public void Content(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(420213850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(420213850, i, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        C13088o value = this.content.getValue();
        if (value != null) {
            value.invoke(startRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposeView$Content$1(this, i));
        }
    }

    public CharSequence getAccessibilityClassName() {
        String name = ComposeView.class.getName();
        C12775o.m28638h(name, "javaClass.name");
        return name;
    }

    /* access modifiers changed from: protected */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        C12775o.m28639i(oVar, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(oVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C12775o.m28639i(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12775o.m28639i(context, "context");
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
