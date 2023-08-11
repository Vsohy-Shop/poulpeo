package androidx.compose.p002ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
final class InspectableValueKt$NoInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    public static final InspectableValueKt$NoInspectorInfo$1 INSTANCE = new InspectableValueKt$NoInspectorInfo$1();

    InspectableValueKt$NoInspectorInfo$1() {
        super(1);
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }
}
