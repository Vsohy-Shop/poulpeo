package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Padding.kt\nandroidx/compose/foundation/layout/PaddingKt\n*L\n1#1,170:1\n96#2,4:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.PaddingKt$padding-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ float $horizontal$inlined;
    final /* synthetic */ float $vertical$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingKt$paddingVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.$horizontal$inlined = f;
        this.$vertical$inlined = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("padding");
        inspectorInfo.getProperties().set("horizontal", C1232Dp.m38466boximpl(this.$horizontal$inlined));
        inspectorInfo.getProperties().set("vertical", C1232Dp.m38466boximpl(this.$vertical$inlined));
    }
}
