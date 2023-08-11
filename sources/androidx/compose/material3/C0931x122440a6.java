package androidx.compose.material3;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.material3.TouchTargetKt$minimumTouchTargetSize$$inlined$debugInspectorInfo$1 */
/* compiled from: InspectableValue.kt */
public final class C0931x122440a6 extends C12777p implements Function1<InspectorInfo, C11921v> {
    public C0931x122440a6() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("minimumTouchTargetSize");
        inspectorInfo.getProperties().set("README", "Adds outer padding to measure at least 48.dp (default) in size to disambiguate touch interactions if the element would measure smaller");
    }
}
