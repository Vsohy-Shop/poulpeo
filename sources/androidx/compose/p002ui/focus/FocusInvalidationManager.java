package androidx.compose.p002ui.focus;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager */
/* compiled from: FocusInvalidationManager.kt */
public final class FocusInvalidationManager {
    /* access modifiers changed from: private */
    public Set<FocusEventModifierNode> focusEventNodes = new LinkedHashSet();
    /* access modifiers changed from: private */
    public Set<FocusPropertiesModifierNode> focusPropertiesNodes = new LinkedHashSet();
    /* access modifiers changed from: private */
    public Set<FocusTargetModifierNode> focusTargetNodes = new LinkedHashSet();
    private final C13074a<C11921v> invalidateNodes = new FocusInvalidationManager$invalidateNodes$1(this);
    private final Function1<C13074a<C11921v>, C11921v> onRequestApplyChangesListener;

    public FocusInvalidationManager(Function1<? super C13074a<C11921v>, C11921v> function1) {
        C12775o.m28639i(function1, "onRequestApplyChangesListener");
        this.onRequestApplyChangesListener = function1;
    }

    public final void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "node");
        scheduleInvalidation(this.focusTargetNodes, focusTargetModifierNode);
    }

    public final void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        C12775o.m28639i(focusEventModifierNode, "node");
        scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        C12775o.m28639i(focusPropertiesModifierNode, "node");
        scheduleInvalidation(this.focusPropertiesNodes, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(Set<T> set, T t) {
        if (!set.contains(t)) {
            set.add(t);
            if (this.focusTargetNodes.size() + this.focusEventNodes.size() + this.focusPropertiesNodes.size() == 1) {
                this.onRequestApplyChangesListener.invoke(this.invalidateNodes);
            }
        }
    }
}
