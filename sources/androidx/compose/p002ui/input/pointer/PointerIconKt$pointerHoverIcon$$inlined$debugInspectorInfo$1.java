package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt\n*L\n1#1,170:1\n75#2,4:171\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ PointerIcon $icon$inlined;
    final /* synthetic */ boolean $overrideDescendants$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$$inlined$debugInspectorInfo$1(PointerIcon pointerIcon, boolean z) {
        super(1);
        this.$icon$inlined = pointerIcon;
        this.$overrideDescendants$inlined = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.$icon$inlined);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.$overrideDescendants$inlined));
    }
}
