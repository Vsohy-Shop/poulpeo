package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.util.MathHelpersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13999m0;
import p466yf.C14044w;
import p466yf.C14052y;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nRippleAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,194:1\n76#2:195\n102#2,2:196\n76#2:198\n102#2,2:199\n138#3:201\n214#4,8:202\n261#4,11:210\n*S KotlinDebug\n*F\n+ 1 RippleAnimation.kt\nandroidx/compose/material/ripple/RippleAnimation\n*L\n76#1:195\n76#1:196,2\n77#1:198\n77#1:199,2\n130#1:201\n158#1:202,8\n158#1:210,11\n*E\n"})
/* compiled from: RippleAnimation.kt */
public final class RippleAnimation {
    /* access modifiers changed from: private */
    public final Animatable<Float, AnimationVector1D> animatedAlpha;
    /* access modifiers changed from: private */
    public final Animatable<Float, AnimationVector1D> animatedCenterPercent;
    /* access modifiers changed from: private */
    public final Animatable<Float, AnimationVector1D> animatedRadiusPercent;
    private final boolean bounded;
    private final MutableState finishRequested$delegate;
    private final C14044w<C11921v> finishSignalDeferred;
    private final MutableState finishedFadingIn$delegate;
    private Offset origin;
    private final float radius;
    private Float startRadius;
    private Offset targetCenter;
    private Float targetRadius;

    public /* synthetic */ RippleAnimation(Offset offset, float f, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(offset, f, z);
    }

    /* access modifiers changed from: private */
    public final Object fadeIn(C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new RippleAnimation$fadeIn$2(this, (C12074d<? super RippleAnimation$fadeIn$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    /* access modifiers changed from: private */
    public final Object fadeOut(C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new RippleAnimation$fadeOut$2(this, (C12074d<? super RippleAnimation$fadeOut$2>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    private final boolean getFinishRequested() {
        return ((Boolean) this.finishRequested$delegate.getValue()).booleanValue();
    }

    private final boolean getFinishedFadingIn() {
        return ((Boolean) this.finishedFadingIn$delegate.getValue()).booleanValue();
    }

    private final void setFinishRequested(boolean z) {
        this.finishRequested$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setFinishedFadingIn(boolean z) {
        this.finishedFadingIn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animate(p355hf.C12074d<? super p336ef.C11921v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof androidx.compose.material.ripple.RippleAnimation$animate$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = (androidx.compose.material.ripple.RippleAnimation$animate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.ripple.RippleAnimation$animate$1 r0 = new androidx.compose.material.ripple.RippleAnimation$animate$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            p336ef.C11910n.m25701b(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            p336ef.C11910n.m25701b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.L$0
            androidx.compose.material.ripple.RippleAnimation r2 = (androidx.compose.material.ripple.RippleAnimation) r2
            p336ef.C11910n.m25701b(r7)
            goto L_0x0056
        L_0x0047:
            p336ef.C11910n.m25701b(r7)
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r6.fadeIn(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.setFinishedFadingIn(r5)
            yf.w<ef.v> r7 = r2.finishSignalDeferred
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r7 = r7.mo53806Y(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r7 = r2.fadeOut(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            ef.v r7 = p336ef.C11921v.f18618a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.RippleAnimation.animate(hf.d):java.lang.Object");
    }

    /* renamed from: draw-4WTKRHQ  reason: not valid java name */
    public final void m34229draw4WTKRHQ(DrawScope drawScope, long j) {
        float f;
        Float f2;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope2, "$this$draw");
        if (this.startRadius == null) {
            this.startRadius = Float.valueOf(RippleAnimationKt.m34231getRippleStartRadiusuvyYCjk(drawScope.m36274getSizeNHjbRc()));
        }
        if (this.targetRadius == null) {
            if (Float.isNaN(this.radius)) {
                f2 = Float.valueOf(RippleAnimationKt.m34230getRippleEndRadiuscSwnlzA(drawScope2, this.bounded, drawScope.m36274getSizeNHjbRc()));
            } else {
                f2 = Float.valueOf(drawScope2.m38449toPx0680j_4(this.radius));
            }
            this.targetRadius = f2;
        }
        if (this.origin == null) {
            this.origin = Offset.m35411boximpl(drawScope.m36273getCenterF1C5BW0());
        }
        if (this.targetCenter == null) {
            this.targetCenter = Offset.m35411boximpl(OffsetKt.Offset(Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc()) / 2.0f, Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc()) / 2.0f));
        }
        if (!getFinishRequested() || getFinishedFadingIn()) {
            f = this.animatedAlpha.getValue().floatValue();
        } else {
            f = 1.0f;
        }
        Float f3 = this.startRadius;
        C12775o.m28636f(f3);
        float floatValue = f3.floatValue();
        Float f4 = this.targetRadius;
        C12775o.m28636f(f4);
        float lerp = MathHelpersKt.lerp(floatValue, f4.floatValue(), this.animatedRadiusPercent.getValue().floatValue());
        Offset offset = this.origin;
        C12775o.m28636f(offset);
        float r3 = Offset.m35422getXimpl(offset.m35432unboximpl());
        Offset offset2 = this.targetCenter;
        C12775o.m28636f(offset2);
        float lerp2 = MathHelpersKt.lerp(r3, Offset.m35422getXimpl(offset2.m35432unboximpl()), this.animatedCenterPercent.getValue().floatValue());
        Offset offset3 = this.origin;
        C12775o.m28636f(offset3);
        float r5 = Offset.m35423getYimpl(offset3.m35432unboximpl());
        Offset offset4 = this.targetCenter;
        C12775o.m28636f(offset4);
        long Offset = OffsetKt.Offset(lerp2, MathHelpersKt.lerp(r5, Offset.m35423getYimpl(offset4.m35432unboximpl()), this.animatedCenterPercent.getValue().floatValue()));
        long r2 = Color.m35670copywmQWz5c$default(j, Color.m35673getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.bounded) {
            float r11 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc());
            float r12 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
            int r13 = ClipOp.Companion.m35660getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long r7 = drawContext.m36217getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().m36329clipRectN_I0leg(0.0f, 0.0f, r11, r12, r13);
            DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, r2, lerp, Offset, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
            drawContext.getCanvas().restore();
            drawContext.m36218setSizeuvyYCjk(r7);
            return;
        }
        DrawScope.m36237drawCircleVaOC9Bg$default(drawScope, r2, lerp, Offset, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 120, (Object) null);
    }

    public final void finish() {
        setFinishRequested(true);
        this.finishSignalDeferred.mo53809X(C11921v.f18618a);
    }

    private RippleAnimation(Offset offset, float f, boolean z) {
        this.origin = offset;
        this.radius = f;
        this.bounded = z;
        this.animatedAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, (Object) null);
        this.animatedRadiusPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, (Object) null);
        this.animatedCenterPercent = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, (Object) null);
        this.finishSignalDeferred = C14052y.m32586a((C14054y1) null);
        Boolean bool = Boolean.FALSE;
        this.finishedFadingIn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.finishRequested$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, (SnapshotMutationPolicy) null, 2, (Object) null);
    }
}
