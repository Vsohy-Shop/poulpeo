package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleHostMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* compiled from: RippleContainer.android.kt */
final class RippleHostMap {
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();

    public final RippleHostView get(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        C12775o.m28639i(androidRippleIndicationInstance, "indicationInstance");
        return this.indicationToHostMap.get(androidRippleIndicationInstance);
    }

    public final void remove(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        C12775o.m28639i(androidRippleIndicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.indicationToHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            AndroidRippleIndicationInstance remove = this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(androidRippleIndicationInstance);
    }

    public final void set(AndroidRippleIndicationInstance androidRippleIndicationInstance, RippleHostView rippleHostView) {
        C12775o.m28639i(androidRippleIndicationInstance, "indicationInstance");
        C12775o.m28639i(rippleHostView, "rippleHostView");
        this.indicationToHostMap.put(androidRippleIndicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, androidRippleIndicationInstance);
    }

    public final AndroidRippleIndicationInstance get(RippleHostView rippleHostView) {
        C12775o.m28639i(rippleHostView, "rippleHostView");
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
