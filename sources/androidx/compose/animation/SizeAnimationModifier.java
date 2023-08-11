package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: AnimationModifier.kt */
final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {
    private AnimData animData;
    private final AnimationSpec<IntSize> animSpec;
    private C13088o<? super IntSize, ? super IntSize, C11921v> listener;
    private final C13995l0 scope;

    @StabilityInferred(parameters = 0)
    /* compiled from: AnimationModifier.kt */
    public static final class AnimData {
        public static final int $stable = 8;
        private final Animatable<IntSize, AnimationVector2D> anim;
        private long startSize;

        public /* synthetic */ AnimData(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        /* renamed from: copy-O0kMr_c$default  reason: not valid java name */
        public static /* synthetic */ AnimData m32875copyO0kMr_c$default(AnimData animData, Animatable<IntSize, AnimationVector2D> animatable, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i & 2) != 0) {
                j = animData.startSize;
            }
            return animData.m32877copyO0kMr_c(animatable, j);
        }

        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* renamed from: component2-YbymL2g  reason: not valid java name */
        public final long m32876component2YbymL2g() {
            return this.startSize;
        }

        /* renamed from: copy-O0kMr_c  reason: not valid java name */
        public final AnimData m32877copyO0kMr_c(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            C12775o.m28639i(animatable, "anim");
            return new AnimData(animatable, j, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) obj;
            if (C12775o.m28634d(this.anim, animData.anim) && IntSize.m38626equalsimpl0(this.startSize, animData.startSize)) {
                return true;
            }
            return false;
        }

        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* renamed from: getStartSize-YbymL2g  reason: not valid java name */
        public final long m32878getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return (this.anim.hashCode() * 31) + IntSize.m38629hashCodeimpl(this.startSize);
        }

        /* renamed from: setStartSize-ozmzZPI  reason: not valid java name */
        public final void m32879setStartSizeozmzZPI(long j) {
            this.startSize = j;
        }

        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + IntSize.m38631toStringimpl(this.startSize) + ')';
        }

        private AnimData(Animatable<IntSize, AnimationVector2D> animatable, long j) {
            this.anim = animatable;
            this.startSize = j;
        }
    }

    public SizeAnimationModifier(AnimationSpec<IntSize> animationSpec, C13995l0 l0Var) {
        C12775o.m28639i(animationSpec, "animSpec");
        C12775o.m28639i(l0Var, "scope");
        this.animSpec = animationSpec;
        this.scope = l0Var;
    }

    /* renamed from: animateTo-mzRDjE0  reason: not valid java name */
    public final long m32873animateTomzRDjE0(long j) {
        AnimData animData2 = this.animData;
        if (animData2 == null) {
            animData2 = new AnimData(new Animatable(IntSize.m38620boximpl(j), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.m38620boximpl(IntSizeKt.IntSize(1, 1))), j, (DefaultConstructorMarker) null);
        } else if (!IntSize.m38626equalsimpl0(j, animData2.getAnim().getTargetValue().m38632unboximpl())) {
            animData2.m32879setStartSizeozmzZPI(animData2.getAnim().getValue().m38632unboximpl());
            C14054y1 unused = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, new SizeAnimationModifier$animateTo$data$1$1(animData2, j, this, (C12074d<? super SizeAnimationModifier$animateTo$data$1$1>) null), 3, (Object) null);
        }
        this.animData = animData2;
        return animData2.getAnim().getValue().m38632unboximpl();
    }

    public final AnimData getAnimData() {
        return this.animData;
    }

    public final AnimationSpec<IntSize> getAnimSpec() {
        return this.animSpec;
    }

    public final C13088o<IntSize, IntSize, C11921v> getListener() {
        return this.listener;
    }

    public final C13995l0 getScope() {
        return this.scope;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m32874measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Placeable r9 = measurable.m37365measureBRTryo0(j);
        long r10 = m32873animateTomzRDjE0(IntSizeKt.IntSize(r9.getWidth(), r9.getHeight()));
        return MeasureScope.layout$default(measureScope, IntSize.m38628getWidthimpl(r10), IntSize.m38627getHeightimpl(r10), (Map) null, new SizeAnimationModifier$measure$1(r9), 4, (Object) null);
    }

    public final void setAnimData(AnimData animData2) {
        this.animData = animData2;
    }

    public final void setListener(C13088o<? super IntSize, ? super IntSize, C11921v> oVar) {
        this.listener = oVar;
    }
}
