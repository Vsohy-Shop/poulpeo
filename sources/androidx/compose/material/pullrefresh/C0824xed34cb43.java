package androidx.compose.material.pullrefresh;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefreshIndicatorTransform.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorTransformKt\n*L\n1#1,170:1\n43#2,4:171\n*E\n"})
/* renamed from: androidx.compose.material.pullrefresh.PullRefreshIndicatorTransformKt$pullRefreshIndicatorTransform$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0824xed34cb43 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ boolean $scale$inlined;
    final /* synthetic */ PullRefreshState $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0824xed34cb43(PullRefreshState pullRefreshState, boolean z) {
        super(1);
        this.$state$inlined = pullRefreshState;
        this.$scale$inlined = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pullRefreshIndicatorTransform");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("scale", Boolean.valueOf(this.$scale$inlined));
    }
}
