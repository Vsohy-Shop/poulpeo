package androidx.compose.foundation;

import androidx.compose.p002ui.layout.PinnableContainer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,227:1\n62#2,5:228\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$3$1\n*L\n123#1:228,5\n*E\n"})
/* compiled from: Focusable.kt */
final class FocusableKt$focusable$2$3$1 extends C12777p implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ MutableState<Boolean> $isFocused$delegate;
    final /* synthetic */ MutableState<PinnableContainer.PinnedHandle> $pinHandle$delegate;
    final /* synthetic */ PinnableContainer $pinnableContainer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusableKt$focusable$2$3$1(PinnableContainer pinnableContainer, MutableState<Boolean> mutableState, MutableState<PinnableContainer.PinnedHandle> mutableState2) {
        super(1);
        this.$pinnableContainer = pinnableContainer;
        this.$isFocused$delegate = mutableState;
        this.$pinHandle$delegate = mutableState2;
    }

    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        C12775o.m28639i(disposableEffectScope, "$this$DisposableEffect");
        if (FocusableKt$focusable$2.invoke$lambda$2(this.$isFocused$delegate)) {
            MutableState<PinnableContainer.PinnedHandle> mutableState = this.$pinHandle$delegate;
            PinnableContainer pinnableContainer = this.$pinnableContainer;
            FocusableKt$focusable$2.invoke$lambda$10(mutableState, pinnableContainer != null ? pinnableContainer.pin() : null);
        }
        return new FocusableKt$focusable$2$3$1$invoke$$inlined$onDispose$1(this.$pinHandle$delegate);
    }
}
