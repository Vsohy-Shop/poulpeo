package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableKt\n*L\n1#1,170:1\n107#2,5:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class TransformableKt$transformable$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ boolean $lockRotationOnZoomPan$inlined;
    final /* synthetic */ TransformableState $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformableKt$transformable$$inlined$debugInspectorInfo$1(TransformableState transformableState, boolean z, boolean z2) {
        super(1);
        this.$state$inlined = transformableState;
        this.$enabled$inlined = z;
        this.$lockRotationOnZoomPan$inlined = z2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("transformable");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("lockRotationOnZoomPan", Boolean.valueOf(this.$lockRotationOnZoomPan$inlined));
    }
}
