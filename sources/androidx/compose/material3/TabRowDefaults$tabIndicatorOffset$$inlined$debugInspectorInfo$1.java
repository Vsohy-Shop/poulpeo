package androidx.compose.material3;

import androidx.compose.p002ui.platform.InspectorInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: InspectableValue.kt */
public final class TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1 extends C12777p implements Function1<InspectorInfo, C11921v> {
    final /* synthetic */ TabPosition $currentTabPosition$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(TabPosition tabPosition) {
        super(1);
        this.$currentTabPosition$inlined = tabPosition;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InspectorInfo) obj);
        return C11921v.f18618a;
    }

    public final void invoke(InspectorInfo inspectorInfo) {
        C12775o.m28639i(inspectorInfo, "$this$null");
        inspectorInfo.setName("tabIndicatorOffset");
        inspectorInfo.setValue(this.$currentTabPosition$inlined);
    }
}
