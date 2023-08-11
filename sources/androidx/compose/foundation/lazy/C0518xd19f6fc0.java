package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LazyItemScopeImpl.kt\nandroidx/compose/foundation/lazy/LazyItemScopeImpl\n*L\n1#1,170:1\n85#2,3:171\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.LazyItemScopeImpl$animateItemPlacement$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0518xd19f6fc0 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ FiniteAnimationSpec $animationSpec$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0518xd19f6fc0(FiniteAnimationSpec finiteAnimationSpec) {
        super(1);
        this.$animationSpec$inlined = finiteAnimationSpec;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateItemPlacement");
        inspectorInfo.setValue(this.$animationSpec$inlined);
    }
}
