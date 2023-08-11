package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n1#1,170:1\n210#2,11:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class DraggableKt$draggable$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ Function1 $canDrag$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ C13089p $onDragStarted$inlined;
    final /* synthetic */ C13089p $onDragStopped$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ C13074a $startDragImmediately$inlined;
    final /* synthetic */ DraggableState $state$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$$inlined$debugInspectorInfo$1(Function1 function1, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, C13074a aVar, C13089p pVar, C13089p pVar2, DraggableState draggableState) {
        super(1);
        this.$canDrag$inlined = function1;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z;
        this.$reverseDirection$inlined = z2;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$startDragImmediately$inlined = aVar;
        this.$onDragStarted$inlined = pVar;
        this.$onDragStopped$inlined = pVar2;
        this.$state$inlined = draggableState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("draggable");
        inspectorInfo.getProperties().set("canDrag", this.$canDrag$inlined);
        inspectorInfo.getProperties().set("orientation", this.$orientation$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("startDragImmediately", this.$startDragImmediately$inlined);
        inspectorInfo.getProperties().set("onDragStarted", this.$onDragStarted$inlined);
        inspectorInfo.getProperties().set("onDragStopped", this.$onDragStopped$inlined);
        inspectorInfo.getProperties().set("state", this.$state$inlined);
    }
}
