package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nRipple.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,253:1\n76#2:254\n102#2,2:255\n76#2:257\n102#2,2:258\n138#3:260\n245#4:261\n*S KotlinDebug\n*F\n+ 1 Ripple.android.kt\nandroidx/compose/material/ripple/AndroidRippleIndicationInstance\n*L\n139#1:254\n139#1:255,2\n147#1:257\n147#1:258,2\n172#1:260\n186#1:261\n*E\n"})
/* compiled from: Ripple.android.kt */
public final class AndroidRippleIndicationInstance extends RippleIndicationInstance implements RememberObserver {
    private final boolean bounded;
    private final State<Color> color;
    private final MutableState invalidateTick$delegate;
    private final C13074a<C11921v> onInvalidateRipple;
    private final float radius;
    private final State<RippleAlpha> rippleAlpha;
    private final RippleContainer rippleContainer;
    private final MutableState rippleHostView$delegate;
    private int rippleRadius;
    private long rippleSize;

    public /* synthetic */ AndroidRippleIndicationInstance(boolean z, float f, State state, State state2, RippleContainer rippleContainer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, f, state, state2, rippleContainer2);
    }

    private final void dispose() {
        this.rippleContainer.disposeRippleIfNeeded(this);
    }

    /* access modifiers changed from: private */
    public final boolean getInvalidateTick() {
        return ((Boolean) this.invalidateTick$delegate.getValue()).booleanValue();
    }

    private final RippleHostView getRippleHostView() {
        return (RippleHostView) this.rippleHostView$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void setInvalidateTick(boolean z) {
        this.invalidateTick$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setRippleHostView(RippleHostView rippleHostView) {
        this.rippleHostView$delegate.setValue(rippleHostView);
    }

    public void addRipple(PressInteraction.Press press, C13995l0 l0Var) {
        C12775o.m28639i(press, "interaction");
        C12775o.m28639i(l0Var, "scope");
        RippleHostView rippleHostView = this.rippleContainer.getRippleHostView(this);
        rippleHostView.m34232addRippleKOepWvA(press, this.bounded, this.rippleSize, this.rippleRadius, this.color.getValue().m35681unboximpl(), this.rippleAlpha.getValue().getPressedAlpha(), this.onInvalidateRipple);
        setRippleHostView(rippleHostView);
    }

    public void drawIndication(ContentDrawScope contentDrawScope) {
        int i;
        C12775o.m28639i(contentDrawScope, "<this>");
        this.rippleSize = contentDrawScope.m36274getSizeNHjbRc();
        if (Float.isNaN(this.radius)) {
            i = C13265c.m30134c(RippleAnimationKt.m34230getRippleEndRadiuscSwnlzA(contentDrawScope, this.bounded, contentDrawScope.m36274getSizeNHjbRc()));
        } else {
            i = contentDrawScope.m38443roundToPx0680j_4(this.radius);
        }
        this.rippleRadius = i;
        long r5 = this.color.getValue().m35681unboximpl();
        float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
        contentDrawScope.drawContent();
        m34234drawStateLayerH2RKhps(contentDrawScope, this.radius, r5);
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        getInvalidateTick();
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.m34233updateRipplePropertiesbiQXAtU(contentDrawScope.m36274getSizeNHjbRc(), this.rippleRadius, r5, pressedAlpha);
            rippleHostView.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    public void onAbandoned() {
        dispose();
    }

    public void onForgotten() {
        dispose();
    }

    public void removeRipple(PressInteraction.Press press) {
        C12775o.m28639i(press, "interaction");
        RippleHostView rippleHostView = getRippleHostView();
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    public final void resetHostView() {
        setRippleHostView((RippleHostView) null);
    }

    private AndroidRippleIndicationInstance(boolean z, float f, State<Color> state, State<RippleAlpha> state2, RippleContainer rippleContainer2) {
        super(z, state2);
        this.bounded = z;
        this.radius = f;
        this.color = state;
        this.rippleAlpha = state2;
        this.rippleContainer = rippleContainer2;
        this.rippleHostView$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.invalidateTick$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.rippleSize = Size.Companion.m35500getZeroNHjbRc();
        this.rippleRadius = -1;
        this.onInvalidateRipple = new AndroidRippleIndicationInstance$onInvalidateRipple$1(this);
    }

    public void onRemembered() {
    }
}
