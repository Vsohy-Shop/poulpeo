package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 */
/* compiled from: ObserverNode.kt */
final class ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 extends C12777p implements Function1<ModifierNodeOwnerScope, C11921v> {
    public static final ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1 INSTANCE = new ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1();

    ModifierNodeOwnerScope$Companion$OnObserveReadsChanged$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ModifierNodeOwnerScope) obj);
        return C11921v.f18618a;
    }

    public final void invoke(ModifierNodeOwnerScope modifierNodeOwnerScope) {
        C12775o.m28639i(modifierNodeOwnerScope, "it");
        if (modifierNodeOwnerScope.isValidOwnerScope()) {
            modifierNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
        }
    }
}
