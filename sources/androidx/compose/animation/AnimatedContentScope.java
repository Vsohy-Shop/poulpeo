package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.ClipKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@ExperimentalAnimationApi
/* compiled from: AnimatedContent.kt */
public final class AnimatedContentScope<S> implements Transition.Segment<S> {
    public static final int $stable = 8;
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m38620boximpl(IntSize.Companion.m38633getZeroYbymL2g()), (SnapshotMutationPolicy) null, 2, (Object) null);
    private final Map<S, State<IntSize>> targetSizeMap = new LinkedHashMap();
    private final Transition<S> transition;

    /* compiled from: AnimatedContent.kt */
    public static final class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = childData.isTarget;
            }
            return childData.copy(z);
        }

        public final boolean component1() {
            return this.isTarget;
        }

        public final ChildData copy(boolean z) {
            return new ChildData(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z = this.isTarget;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        public Object modifyParentData(Density density, Object obj) {
            C12775o.m28639i(density, "<this>");
            return this;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }
    }

    @ExperimentalAnimationApi
    /* compiled from: AnimatedContent.kt */
    private final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentScope<S> this$0;

        public SizeModifier(AnimatedContentScope animatedContentScope, Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> deferredAnimation, State<? extends SizeTransform> state) {
            C12775o.m28639i(deferredAnimation, "sizeAnimation");
            C12775o.m28639i(state, "sizeTransform");
            this.this$0 = animatedContentScope;
            this.sizeAnimation = deferredAnimation;
            this.sizeTransform = state;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public MeasureResult m32811measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
            C12775o.m28639i(measureScope, "$this$measure");
            C12775o.m28639i(measurable, "measurable");
            Placeable r13 = measurable.m37365measureBRTryo0(j);
            State<IntSize> animate = this.sizeAnimation.animate(new AnimatedContentScope$SizeModifier$measure$size$1(this.this$0, this), new AnimatedContentScope$SizeModifier$measure$size$2(this.this$0));
            this.this$0.setAnimatedSize$animation_release(animate);
            return MeasureScope.layout$default(measureScope, IntSize.m38628getWidthimpl(animate.getValue().m38632unboximpl()), IntSize.m38627getHeightimpl(animate.getValue().m38632unboximpl()), (Map) null, new AnimatedContentScope$SizeModifier$measure$1(r13, this.this$0.getContentAlignment$animation_release().m35310alignKFBX0sM(IntSizeKt.IntSize(r13.getWidth(), r13.getHeight()), animate.getValue().m38632unboximpl(), LayoutDirection.Ltr)), 4, (Object) null);
        }
    }

    public AnimatedContentScope(Transition<S> transition2, Alignment alignment, LayoutDirection layoutDirection2) {
        C12775o.m28639i(transition2, "transition");
        C12775o.m28639i(alignment, "contentAlignment");
        C12775o.m28639i(layoutDirection2, "layoutDirection");
        this.transition = transition2;
        this.contentAlignment = alignment;
        this.layoutDirection = layoutDirection2;
    }

    /* access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE  reason: not valid java name */
    public final long m32799calculateOffsetemnUabE(long j, long j2) {
        return this.contentAlignment.m35310alignKFBX0sM(j, j2, LayoutDirection.Ltr);
    }

    /* renamed from: createSizeAnimationModifier$lambda-2  reason: not valid java name */
    private static final boolean m32800createSizeAnimationModifier$lambda2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* renamed from: createSizeAnimationModifier$lambda-3  reason: not valid java name */
    private static final void m32801createSizeAnimationModifier$lambda3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g  reason: not valid java name */
    public final long m32802getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        if (state != null) {
            return state.getValue().m38632unboximpl();
        }
        return m32807getMeasuredSizeYbymL2g$animation_release();
    }

    /* renamed from: isLeft-9jb1Dl8  reason: not valid java name */
    private final boolean m32803isLeft9jb1Dl8(int i) {
        SlideDirection.Companion companion = SlideDirection.Companion;
        if (SlideDirection.m32816equalsimpl0(i, companion.m32822getLeftaUPqQNE()) || ((SlideDirection.m32816equalsimpl0(i, companion.m32824getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr) || (SlideDirection.m32816equalsimpl0(i, companion.m32821getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl))) {
            return true;
        }
        return false;
    }

    /* renamed from: isRight-9jb1Dl8  reason: not valid java name */
    private final boolean m32804isRight9jb1Dl8(int i) {
        SlideDirection.Companion companion = SlideDirection.Companion;
        if (SlideDirection.m32816equalsimpl0(i, companion.m32823getRightaUPqQNE()) || ((SlideDirection.m32816equalsimpl0(i, companion.m32824getStartaUPqQNE()) && this.layoutDirection == LayoutDirection.Rtl) || (SlideDirection.m32816equalsimpl0(i, companion.m32821getEndaUPqQNE()) && this.layoutDirection == LayoutDirection.Ltr))) {
            return true;
        }
        return false;
    }

    /* renamed from: slideIntoContainer-HTTW7Ok$default  reason: not valid java name */
    public static /* synthetic */ EnterTransition m32805slideIntoContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, (Object) null);
        }
        if ((i2 & 4) != 0) {
            function1 = AnimatedContentScope$slideIntoContainer$1.INSTANCE;
        }
        return animatedContentScope.m32809slideIntoContainerHTTW7Ok(i, finiteAnimationSpec, function1);
    }

    /* renamed from: slideOutOfContainer-HTTW7Ok$default  reason: not valid java name */
    public static /* synthetic */ ExitTransition m32806slideOutOfContainerHTTW7Ok$default(AnimatedContentScope animatedContentScope, int i, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m38577boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, (Object) null);
        }
        if ((i2 & 4) != 0) {
            function1 = AnimatedContentScope$slideOutOfContainer$1.INSTANCE;
        }
        return animatedContentScope.m32810slideOutOfContainerHTTW7Ok(i, finiteAnimationSpec, function1);
    }

    @Composable
    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i) {
        Modifier modifier;
        C12775o.m28639i(contentTransform, "contentTransform");
        composer.startReplaceableGroup(-1349251863);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed((Object) this);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        boolean z = false;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (C12775o.m28634d(this.transition.getCurrentState(), this.transition.getTargetState())) {
            m32801createSizeAnimationModifier$lambda3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            m32801createSizeAnimationModifier$lambda3(mutableState, true);
        }
        if (m32800createSizeAnimationModifier$lambda2(mutableState)) {
            Transition.DeferredAnimation<IntSize, AnimationVector2D> createDeferredAnimation = TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), (String) null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            boolean changed2 = composer.changed((Object) createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    z = true;
                }
                Modifier modifier2 = Modifier.Companion;
                if (!z) {
                    modifier2 = ClipKt.clipToBounds(modifier2);
                }
                rememberedValue2 = modifier2.then(new SizeModifier(this, createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            modifier = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            modifier = Modifier.Companion;
        }
        composer.endReplaceableGroup();
        return modifier;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final Alignment getContentAlignment$animation_release() {
        return this.contentAlignment;
    }

    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    /* renamed from: getMeasuredSize-YbymL2g$animation_release  reason: not valid java name */
    public final long m32807getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m38632unboximpl();
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        C12775o.m28639i(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection2) {
        C12775o.m28639i(layoutDirection2, "<set-?>");
        this.layoutDirection = layoutDirection2;
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release  reason: not valid java name */
    public final void m32808setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize$delegate.setValue(IntSize.m38620boximpl(j));
    }

    /* renamed from: slideIntoContainer-HTTW7Ok  reason: not valid java name */
    public final EnterTransition m32809slideIntoContainerHTTW7Ok(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "initialOffset");
        if (m32803isLeft9jb1Dl8(i)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentScope$slideIntoContainer$2(function1, this));
        }
        if (m32804isRight9jb1Dl8(i)) {
            return EnterExitTransitionKt.slideInHorizontally(finiteAnimationSpec, new AnimatedContentScope$slideIntoContainer$3(function1, this));
        }
        SlideDirection.Companion companion = SlideDirection.Companion;
        if (SlideDirection.m32816equalsimpl0(i, companion.m32825getUpaUPqQNE())) {
            return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentScope$slideIntoContainer$4(function1, this));
        }
        if (SlideDirection.m32816equalsimpl0(i, companion.m32820getDownaUPqQNE())) {
            return EnterExitTransitionKt.slideInVertically(finiteAnimationSpec, new AnimatedContentScope$slideIntoContainer$5(function1, this));
        }
        return EnterTransition.Companion.getNone();
    }

    /* renamed from: slideOutOfContainer-HTTW7Ok  reason: not valid java name */
    public final ExitTransition m32810slideOutOfContainerHTTW7Ok(int i, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Function1<? super Integer, Integer> function1) {
        C12775o.m28639i(finiteAnimationSpec, "animationSpec");
        C12775o.m28639i(function1, "targetOffset");
        if (m32803isLeft9jb1Dl8(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentScope$slideOutOfContainer$2(this, function1));
        }
        if (m32804isRight9jb1Dl8(i)) {
            return EnterExitTransitionKt.slideOutHorizontally(finiteAnimationSpec, new AnimatedContentScope$slideOutOfContainer$3(this, function1));
        }
        SlideDirection.Companion companion = SlideDirection.Companion;
        if (SlideDirection.m32816equalsimpl0(i, companion.m32825getUpaUPqQNE())) {
            return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentScope$slideOutOfContainer$4(this, function1));
        }
        if (SlideDirection.m32816equalsimpl0(i, companion.m32820getDownaUPqQNE())) {
            return EnterExitTransitionKt.slideOutVertically(finiteAnimationSpec, new AnimatedContentScope$slideOutOfContainer$5(this, function1));
        }
        return ExitTransition.Companion.getNone();
    }

    @ExperimentalAnimationApi
    public final ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        C12775o.m28639i(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    @Immutable
    /* compiled from: AnimatedContent.kt */
    public static final class SlideDirection {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int Down = m32814constructorimpl(3);
        /* access modifiers changed from: private */
        public static final int End = m32814constructorimpl(5);
        /* access modifiers changed from: private */
        public static final int Left = m32814constructorimpl(0);
        /* access modifiers changed from: private */
        public static final int Right = m32814constructorimpl(1);
        /* access modifiers changed from: private */
        public static final int Start = m32814constructorimpl(4);
        /* access modifiers changed from: private */

        /* renamed from: Up */
        public static final int f210Up = m32814constructorimpl(2);
        private final int value;

        /* compiled from: AnimatedContent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDown-aUPqQNE  reason: not valid java name */
            public final int m32820getDownaUPqQNE() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-aUPqQNE  reason: not valid java name */
            public final int m32821getEndaUPqQNE() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-aUPqQNE  reason: not valid java name */
            public final int m32822getLeftaUPqQNE() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-aUPqQNE  reason: not valid java name */
            public final int m32823getRightaUPqQNE() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-aUPqQNE  reason: not valid java name */
            public final int m32824getStartaUPqQNE() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-aUPqQNE  reason: not valid java name */
            public final int m32825getUpaUPqQNE() {
                return SlideDirection.f210Up;
            }
        }

        private /* synthetic */ SlideDirection(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ SlideDirection m32813boximpl(int i) {
            return new SlideDirection(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m32815equalsimpl(int i, Object obj) {
            if ((obj instanceof SlideDirection) && i == ((SlideDirection) obj).m32819unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m32816equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m32817hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m32818toStringimpl(int i) {
            if (m32816equalsimpl0(i, Left)) {
                return "Left";
            }
            if (m32816equalsimpl0(i, Right)) {
                return "Right";
            }
            if (m32816equalsimpl0(i, f210Up)) {
                return "Up";
            }
            if (m32816equalsimpl0(i, Down)) {
                return "Down";
            }
            if (m32816equalsimpl0(i, Start)) {
                return "Start";
            }
            if (m32816equalsimpl0(i, End)) {
                return "End";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m32815equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m32817hashCodeimpl(this.value);
        }

        public String toString() {
            return m32818toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m32819unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m32814constructorimpl(int i) {
            return i;
        }
    }
}
