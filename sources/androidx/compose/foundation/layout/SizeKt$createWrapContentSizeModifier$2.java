package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Size.kt */
final class SizeKt$createWrapContentSizeModifier$2 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ Alignment $align;
    final /* synthetic */ boolean $unbounded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeKt$createWrapContentSizeModifier$2(Alignment alignment, boolean z) {
        super(1);
        this.$align = alignment;
        this.$unbounded = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$$receiver");
        inspectorInfo.setName("wrapContentSize");
        inspectorInfo.getProperties().set("align", this.$align);
        inspectorInfo.getProperties().set("unbounded", Boolean.valueOf(this.$unbounded));
    }
}
