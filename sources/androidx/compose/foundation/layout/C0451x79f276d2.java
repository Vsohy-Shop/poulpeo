package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.unit.TextUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n122#2,5:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0451x79f276d2 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ long $after$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;
    final /* synthetic */ long $before$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0451x79f276d2(AlignmentLine alignmentLine, long j, long j2) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.$before$inlined = j;
        this.$after$inlined = j2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set("before", TextUnit.m38639boximpl(this.$before$inlined));
        inspectorInfo.getProperties().set("after", TextUnit.m38639boximpl(this.$after$inlined));
    }
}
