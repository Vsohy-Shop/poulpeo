package androidx.compose.foundation.layout;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Size.kt */
final class SizeKt$createFillHeightModifier$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ float $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createFillHeightModifier$1(float f) {
        super(1);
        this.$fraction = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$$receiver");
        inspectorInfo.setName("fillMaxHeight");
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.$fraction));
    }
}
