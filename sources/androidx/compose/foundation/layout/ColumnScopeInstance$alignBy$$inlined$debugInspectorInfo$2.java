package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n244#2,3:171\n*E\n"})
/* compiled from: InspectableValue.kt */
public final class ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$2 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ Function1 $alignmentLineBlock$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ColumnScopeInstance$alignBy$$inlined$debugInspectorInfo$2(Function1 function1) {
        super(1);
        this.$alignmentLineBlock$inlined = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.$alignmentLineBlock$inlined);
    }
}
