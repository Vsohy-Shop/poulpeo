package androidx.compose.material;

import androidx.compose.p002ui.platform.InspectorInfo;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n1#1,170:1\n128#2,6:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ AnchorChangeHandler $anchorChangeHandler$inlined;
    final /* synthetic */ C13088o $calculateAnchor$inlined;
    final /* synthetic */ Set $possibleValues$inlined;
    final /* synthetic */ SwipeableV2State $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, C13088o oVar) {
        super(1);
        this.$state$inlined = swipeableV2State;
        this.$possibleValues$inlined = set;
        this.$anchorChangeHandler$inlined = anchorChangeHandler;
        this.$calculateAnchor$inlined = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("swipeAnchors");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("possibleValues", this.$possibleValues$inlined);
        inspectorInfo.getProperties().set("anchorChangeHandler", this.$anchorChangeHandler$inlined);
        inspectorInfo.getProperties().set("calculateAnchor", this.$calculateAnchor$inlined);
    }
}
