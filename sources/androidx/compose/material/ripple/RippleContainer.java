package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.p002ui.C0954R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
/* compiled from: RippleContainer.android.kt */
public final class RippleContainer extends ViewGroup {
    private final int MaxRippleHosts = 5;
    private int nextHostIndex;
    private final RippleHostMap rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(C0954R.C0956id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        C12775o.m28639i(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.resetHostView();
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(androidRippleIndicationInstance);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        C12775o.m28639i(androidRippleIndicationInstance, "<this>");
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) C12669b0.m28189M(this.unusedRippleHosts);
        if (rippleHostView2 == null) {
            if (this.nextHostIndex > C12726w.m28526m(this.rippleHosts)) {
                Context context = getContext();
                C12775o.m28638h(context, "context");
                rippleHostView2 = new RippleHostView(context);
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                AndroidRippleIndicationInstance androidRippleIndicationInstance2 = this.rippleHostMap.get(rippleHostView2);
                if (androidRippleIndicationInstance2 != null) {
                    androidRippleIndicationInstance2.resetHostView();
                    this.rippleHostMap.remove(androidRippleIndicationInstance2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i = this.nextHostIndex;
            if (i < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(androidRippleIndicationInstance, rippleHostView2);
        return rippleHostView2;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
