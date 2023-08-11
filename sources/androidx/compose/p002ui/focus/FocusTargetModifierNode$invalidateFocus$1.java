package androidx.compose.p002ui.focus;

import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.Ref$ObjectRef;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$invalidateFocus$1 */
/* compiled from: FocusTargetModifierNode.kt */
final class FocusTargetModifierNode$invalidateFocus$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ Ref$ObjectRef<FocusProperties> $focusProperties;
    final /* synthetic */ FocusTargetModifierNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusTargetModifierNode$invalidateFocus$1(Ref$ObjectRef<FocusProperties> ref$ObjectRef, FocusTargetModifierNode focusTargetModifierNode) {
        super(0);
        this.$focusProperties = ref$ObjectRef;
        this.this$0 = focusTargetModifierNode;
    }

    public final void invoke() {
        this.$focusProperties.f20403b = this.this$0.fetchFocusProperties$ui_release();
    }
}
