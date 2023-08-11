package androidx.compose.foundation.text;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.text.TextStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n1#1,170:1\n54#2,5:171\n*E\n"})
/* renamed from: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0616x3f87673a extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ int $maxLines$inlined;
    final /* synthetic */ int $minLines$inlined;
    final /* synthetic */ TextStyle $textStyle$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0616x3f87673a(int i, int i2, TextStyle textStyle) {
        super(1);
        this.$minLines$inlined = i;
        this.$maxLines$inlined = i2;
        this.$textStyle$inlined = textStyle;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("heightInLines");
        inspectorInfo.getProperties().set("minLines", Integer.valueOf(this.$minLines$inlined));
        inspectorInfo.getProperties().set("maxLines", Integer.valueOf(this.$maxLines$inlined));
        inspectorInfo.getProperties().set("textStyle", this.$textStyle$inlined);
    }
}
