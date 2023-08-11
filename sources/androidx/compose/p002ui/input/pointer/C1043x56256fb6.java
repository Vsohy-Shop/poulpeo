package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt\n*L\n1#1,170:1\n281#2,5:171\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$$inlined$debugInspectorInfo$2 */
/* compiled from: InspectableValue.kt */
public final class C1043x56256fb6 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ C13088o $block$inlined;
    final /* synthetic */ Object $key1$inlined;
    final /* synthetic */ Object $key2$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1043x56256fb6(Object obj, Object obj2, C13088o oVar) {
        super(1);
        this.$key1$inlined = obj;
        this.$key2$inlined = obj2;
        this.$block$inlined = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerInput");
        inspectorInfo.getProperties().set("key1", this.$key1$inlined);
        inspectorInfo.getProperties().set("key2", this.$key2$inlined);
        inspectorInfo.getProperties().set("block", this.$block$inlined);
    }
}
