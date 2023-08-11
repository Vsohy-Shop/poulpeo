package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n1#1,170:1\n103#2,3:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2 */
/* compiled from: InspectableValue.kt */
public final class C0478x7feb0d2b extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ PaddingValues $paddingValues$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0478x7feb0d2b(PaddingValues paddingValues) {
        super(1);
        this.$paddingValues$inlined = paddingValues;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("consumeWindowInsets");
        inspectorInfo.getProperties().set("paddingValues", this.$paddingValues$inlined);
    }
}
