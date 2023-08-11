package androidx.compose.animation;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0326x599743f2 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ EnterTransition $enter$inlined;
    final /* synthetic */ ExitTransition $exit$inlined;
    final /* synthetic */ String $label$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0326x599743f2(EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        super(1);
        this.$enter$inlined = enterTransition;
        this.$exit$inlined = exitTransition;
        this.$label$inlined = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("animateEnterExit");
        inspectorInfo.getProperties().set("enter", this.$enter$inlined);
        inspectorInfo.getProperties().set("exit", this.$exit$inlined);
        inspectorInfo.getProperties().set("label", this.$label$inlined);
    }
}
