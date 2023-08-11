package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n1#1,170:1\n56#2,4:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.OffsetKt$offset-VpY3zN4$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* compiled from: InspectableValue.kt */
public final class OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ float $x$inlined;
    final /* synthetic */ float $y$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetKt$offsetVpY3zN4$$inlined$debugInspectorInfo$1(float f, float f2) {
        super(1);
        this.$x$inlined = f;
        this.$y$inlined = f2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("offset");
        inspectorInfo.getProperties().set("x", C1232Dp.m38466boximpl(this.$x$inlined));
        inspectorInfo.getProperties().set("y", C1232Dp.m38466boximpl(this.$y$inlined));
    }
}
