package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt\n*L\n1#1,170:1\n332#2,4:171\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C1033xb158771c extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ NestedScrollConnection $connection$inlined;
    final /* synthetic */ NestedScrollDispatcher $dispatcher$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1033xb158771c(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        super(1);
        this.$connection$inlined = nestedScrollConnection;
        this.$dispatcher$inlined = nestedScrollDispatcher;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("nestedScroll");
        inspectorInfo.getProperties().set("connection", this.$connection$inlined);
        inspectorInfo.getProperties().set("dispatcher", this.$dispatcher$inlined);
    }
}
