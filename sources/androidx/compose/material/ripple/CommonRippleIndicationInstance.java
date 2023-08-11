package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p355hf.C12079g;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,119:1\n215#2,2:120\n215#2,2:122\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleIndicationInstance\n*L\n77#1:120,2\n99#1:122,2\n*E\n"})
/* compiled from: CommonRipple.kt */
public final class CommonRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    /* access modifiers changed from: private */
    public final SnapshotStateMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleIndicationInstance(boolean z, float f, State state, State state2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2);
    }

    /* renamed from: drawRipples-4WTKRHQ  reason: not valid java name */
    private final void m34225drawRipples4WTKRHQ(DrawScope drawScope, long j) {
        boolean z;
        for (Map.Entry<PressInteraction.Press, RippleAnimation> value : this.ripples.entrySet()) {
            RippleAnimation rippleAnimation = (RippleAnimation) value.getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (pressedAlpha == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                rippleAnimation.m34229draw4WTKRHQ(drawScope, Color.m35670copywmQWz5c$default(j, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            }
        }
    }

    public void addRipple(PressInteraction.Press press, C13995l0 l0Var) {
        Offset offset;
        C12775o.m28639i(press, "interaction");
        C12775o.m28639i(l0Var, "scope");
        for (Map.Entry<PressInteraction.Press, RippleAnimation> value : this.ripples.entrySet()) {
            ((RippleAnimation) value.getValue()).finish();
        }
        if (this.bounded) {
            offset = Offset.m35411boximpl(press.m33158getPressPositionF1C5BW0());
        } else {
            offset = null;
        }
        RippleAnimation rippleAnimation = new RippleAnimation(offset, this.radius, this.bounded, (DefaultConstructorMarker) null);
        this.ripples.put(press, rippleAnimation);
        C14054y1 unused = C13985j.m32422d(l0Var, (C12079g) null, (C14004n0) null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, press, (C12074d<? super CommonRippleIndicationInstance$addRipple$2>) null), 3, (Object) null);
    }

    public void drawIndication(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        long r0 = this.color.getValue().m35681unboximpl();
        contentDrawScope.drawContent();
        m34234drawStateLayerH2RKhps(contentDrawScope, this.radius, r0);
        m34225drawRipples4WTKRHQ(contentDrawScope, r0);
    }

    public void onAbandoned() {
        this.ripples.clear();
    }

    public void onForgotten() {
        this.ripples.clear();
    }

    public void removeRipple(PressInteraction.Press press) {
        C12775o.m28639i(press, "interaction");
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.ripples = SnapshotStateKt.mutableStateMapOf();
    }

    public void onRemembered() {
    }
}
