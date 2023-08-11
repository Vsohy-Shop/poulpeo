package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.animation.AnimationModifierKt$animateContentSize$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0327x5f44a391 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ FiniteAnimationSpec $animationSpec$inlined;
    final /* synthetic */ C13088o $finishedListener$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0327x5f44a391(FiniteAnimationSpec finiteAnimationSpec, C13088o oVar) {
        super(1);
        this.$animationSpec$inlined = finiteAnimationSpec;
        this.$finishedListener$inlined = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.$animationSpec$inlined);
        inspectorInfo.getProperties().set("finishedListener", this.$finishedListener$inlined);
    }
}
