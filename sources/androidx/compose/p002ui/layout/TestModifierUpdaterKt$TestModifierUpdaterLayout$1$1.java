package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 */
/* compiled from: TestModifierUpdater.kt */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1 extends C12777p implements Function1<LayoutNode, C11921v> {
    final /* synthetic */ Function1<TestModifierUpdater, C11921v> $onAttached;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1(Function1<? super TestModifierUpdater, C11921v> function1) {
        super(1);
        this.$onAttached = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "$this$init");
        this.$onAttached.invoke(new TestModifierUpdater(layoutNode));
    }
}
