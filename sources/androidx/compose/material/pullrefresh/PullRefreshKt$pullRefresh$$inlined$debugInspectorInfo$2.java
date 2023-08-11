package androidx.compose.material.pullrefresh;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshKt\n*L\n1#1,170:1\n83#2,5:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Function1 $onPull$inlined;
    final /* synthetic */ C13088o $onRelease$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PullRefreshKt$pullRefresh$$inlined$debugInspectorInfo$2(Function1 function1, C13088o oVar, boolean z) {
        super(1);
        this.$onPull$inlined = function1;
        this.$onRelease$inlined = oVar;
        this.$enabled$inlined = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pullRefresh");
        inspectorInfo.getProperties().set("onPull", this.$onPull$inlined);
        inspectorInfo.getProperties().set("onRelease", this.$onRelease$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
    }
}
