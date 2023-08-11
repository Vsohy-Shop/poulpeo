package androidx.compose.foundation.relocation;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterKt\n*L\n1#1,170:1\n104#2,3:171\n*E\n"})
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterKt$bringIntoViewRequester$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0591xf3bab713 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ BringIntoViewRequester $bringIntoViewRequester$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0591xf3bab713(BringIntoViewRequester bringIntoViewRequester) {
        super(1);
        this.$bringIntoViewRequester$inlined = bringIntoViewRequester;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.$bringIntoViewRequester$inlined);
    }
}
