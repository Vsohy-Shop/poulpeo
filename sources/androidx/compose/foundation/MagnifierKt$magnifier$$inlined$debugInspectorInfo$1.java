package androidx.compose.foundation;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Magnifier.kt\nandroidx/compose/foundation/MagnifierKt\n*L\n1#1,170:1\n234#2,6:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class MagnifierKt$magnifier$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ Function1 $magnifierCenter$inlined;
    final /* synthetic */ Function1 $sourceCenter$inlined;
    final /* synthetic */ MagnifierStyle $style$inlined;
    final /* synthetic */ float $zoom$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(Function1 function1, Function1 function12, float f, MagnifierStyle magnifierStyle) {
        super(1);
        this.$sourceCenter$inlined = function1;
        this.$magnifierCenter$inlined = function12;
        this.$zoom$inlined = f;
        this.$style$inlined = magnifierStyle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName(MagnifierKt.isPlatformMagnifierSupported$default(0, 1, (Object) null) ? "magnifier" : "magnifier (not supported)");
        inspectorInfo.getProperties().set("sourceCenter", this.$sourceCenter$inlined);
        inspectorInfo.getProperties().set("magnifierCenter", this.$magnifierCenter$inlined);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.$zoom$inlined));
        inspectorInfo.getProperties().set("style", this.$style$inlined);
    }
}
