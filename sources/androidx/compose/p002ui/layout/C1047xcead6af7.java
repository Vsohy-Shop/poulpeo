package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 LookaheadLayout.kt\nandroidx/compose/ui/layout/LookaheadLayoutScopeImpl\n*L\n1#1,170:1\n195#2,3:171\n*E\n"})
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$intermediateLayout$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C1047xcead6af7 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ C13090q $measure$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1047xcead6af7(C13090q qVar) {
        super(1);
        this.$measure$inlined = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("intermediateLayout");
        inspectorInfo.getProperties().set("measure", this.$measure$inlined);
    }
}
