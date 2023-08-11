package androidx.compose.p002ui.modifier;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.modifier.ModifierLocalManager$invalidate$1 */
/* compiled from: ModifierLocalManager.kt */
final class ModifierLocalManager$invalidate$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ ModifierLocalManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModifierLocalManager$invalidate$1(ModifierLocalManager modifierLocalManager) {
        super(0);
        this.this$0 = modifierLocalManager;
    }

    public final void invoke() {
        this.this$0.triggerUpdates();
    }
}
