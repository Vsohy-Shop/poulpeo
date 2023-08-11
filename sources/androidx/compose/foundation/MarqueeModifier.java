package androidx.compose.foundation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.focus.FocusEventModifier;
import androidx.compose.p002ui.focus.FocusState;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13970h;

@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,417:1\n76#2:418\n102#2,2:419\n76#2:421\n102#2,2:422\n76#2:424\n102#2,2:425\n76#2:427\n102#2,2:428\n76#2:430\n102#2,2:431\n76#2:433\n214#3,8:434\n261#3,8:442\n115#3,9:450\n269#3,3:459\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeModifier\n*L\n191#1:418\n191#1:419,2\n192#1:421\n192#1:422,2\n193#1:424\n193#1:425,2\n194#1:427\n194#1:428,2\n195#1:430\n195#1:431,2\n199#1:433\n235#1:434,8\n235#1:442,8\n245#1:450,9\n235#1:459,3\n*E\n"})
/* compiled from: BasicMarquee.kt */
final class MarqueeModifier implements Modifier.Element, LayoutModifier, DrawModifier, FocusEventModifier {
    private final MutableState animationMode$delegate;
    private final MutableState containerWidth$delegate;
    private final MutableState contentWidth$delegate;
    /* access modifiers changed from: private */
    public final int delayMillis;
    /* access modifiers changed from: private */
    public final Density density;
    /* access modifiers changed from: private */
    public final float direction;
    private final MutableState hasFocus$delegate;
    /* access modifiers changed from: private */
    public final int initialDelayMillis;
    /* access modifiers changed from: private */
    public final int iterations;
    /* access modifiers changed from: private */
    public final Animatable<Float, AnimationVector1D> offset;
    private final MutableState spacing$delegate;
    private final State spacingPx$delegate;
    /* access modifiers changed from: private */
    public final float velocity;

    public /* synthetic */ MarqueeModifier(int i, int i2, int i3, float f, Density density2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, f, density2);
    }

    /* access modifiers changed from: private */
    public final int getContainerWidth() {
        return ((Number) this.containerWidth$delegate.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final int getContentWidth() {
        return ((Number) this.contentWidth$delegate.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx$delegate.getValue()).intValue();
    }

    private final void setContainerWidth(int i) {
        this.containerWidth$delegate.setValue(Integer.valueOf(i));
    }

    private final void setContentWidth(int i) {
        this.contentWidth$delegate.setValue(Integer.valueOf(i));
    }

    private final void setHasFocus(boolean z) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z));
    }

    public void draw(ContentDrawScope contentDrawScope) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        C12775o.m28639i(contentDrawScope, "<this>");
        float floatValue = this.offset.getValue().floatValue();
        float f = this.direction;
        float f2 = floatValue * f;
        boolean z5 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? this.offset.getValue().floatValue() >= ((float) getContainerWidth()) : this.offset.getValue().floatValue() >= ((float) getContentWidth())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.direction == 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 ? this.offset.getValue().floatValue() <= ((float) getSpacingPx()) : this.offset.getValue().floatValue() <= ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()))) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (this.direction != 1.0f) {
            z5 = false;
        }
        if (z5) {
            i = getContentWidth() + getSpacingPx();
        } else {
            i = (-getContentWidth()) - getSpacingPx();
        }
        float f3 = (float) i;
        float containerWidth = f2 + ((float) getContainerWidth());
        float r6 = Size.m35488getHeightimpl(contentDrawScope.m36274getSizeNHjbRc());
        int r7 = ClipOp.Companion.m35660getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long r10 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36329clipRectN_I0leg(f2, 0.0f, containerWidth, r6, r7);
        if (z2) {
            contentDrawScope.drawContent();
        }
        if (z4) {
            contentDrawScope.getDrawContext().getTransform().translate(f3, 0.0f);
            contentDrawScope.drawContent();
            contentDrawScope.getDrawContext().getTransform().translate(-f3, -0.0f);
        }
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r10);
    }

    /* renamed from: getAnimationMode-ZbEOnfQ  reason: not valid java name */
    public final int m33020getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode$delegate.getValue()).m33015unboximpl();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing$delegate.getValue();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33021measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r11 = measurable.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, (Object) null));
        setContainerWidth(ConstraintsKt.m38426constrainWidthK40F9xA(j, r11.getWidth()));
        setContentWidth(r11.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), r11.getHeight(), (Map) null, new MarqueeModifier$measure$1(r11, this), 4, (Object) null);
    }

    public void onFocusEvent(FocusState focusState) {
        C12775o.m28639i(focusState, "focusState");
        setHasFocus(focusState.getHasFocus());
    }

    public final Object runAnimation(C12074d<? super C11921v> dVar) {
        if (this.iterations <= 0) {
            return C11921v.f18618a;
        }
        Object g = C13970h.m32378g(FixedMotionDurationScale.INSTANCE, new MarqueeModifier$runAnimation$2(this, (C12074d<? super MarqueeModifier$runAnimation$2>) null), dVar);
        if (g == C12150d.m26492c()) {
            return g;
        }
        return C11921v.f18618a;
    }

    /* renamed from: setAnimationMode-97h66l8  reason: not valid java name */
    public final void m33022setAnimationMode97h66l8(int i) {
        this.animationMode$delegate.setValue(MarqueeAnimationMode.m33009boximpl(i));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        C12775o.m28639i(marqueeSpacing, "<set-?>");
        this.spacing$delegate.setValue(marqueeSpacing);
    }

    private MarqueeModifier(int i, int i2, int i3, float f, Density density2) {
        this.iterations = i;
        this.delayMillis = i2;
        this.initialDelayMillis = i3;
        this.velocity = f;
        this.density = density2;
        this.contentWidth$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.containerWidth$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.spacing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(BasicMarqueeKt.getDefaultMarqueeSpacing(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.animationMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m33009boximpl(MarqueeAnimationMode.Companion.m33018getImmediatelyZbEOnfQ()), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, (Object) null);
        this.direction = Math.signum(f);
        this.spacingPx$delegate = SnapshotStateKt.derivedStateOf(new MarqueeModifier$spacingPx$2(this));
    }
}
