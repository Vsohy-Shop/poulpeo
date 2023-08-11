package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p314bg.C10962f;
import p314bg.C10971h;
import p336ef.C11906l;
import p336ef.C11915r;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@ExperimentalMaterial3Api
@Stable
/* compiled from: Swipeable.kt */
public class SwipeableState<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final MutableState<Float> absoluteOffset;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    /* access modifiers changed from: private */
    public final MutableState<Float> animationTarget;
    private final Function1<T, Boolean> confirmStateChange;
    private final MutableState currentValue$delegate;
    private final DraggableState draggableState;
    private final MutableState isAnimationRunning$delegate;
    private final C10962f<Map<Float, T>> latestNonEmptyAnchorsFlow;
    private float maxBound;
    private float minBound;
    /* access modifiers changed from: private */
    public final MutableState<Float> offsetState;
    /* access modifiers changed from: private */
    public final MutableState<Float> overflowState;
    private final MutableState resistance$delegate;
    private final MutableState thresholds$delegate;
    private final MutableState velocityThreshold$delegate;

    /* compiled from: Swipeable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> Saver<SwipeableState<T>, T> Saver(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmStateChange");
            return SaverKt.Saver(SwipeableState$Companion$Saver$1.INSTANCE, new SwipeableState$Companion$Saver$2(animationSpec, function1));
        }
    }

    public SwipeableState(T t, AnimationSpec<Float> animationSpec2, Function1<? super T, Boolean> function1) {
        C12775o.m28639i(animationSpec2, "animationSpec");
        C12775o.m28639i(function1, "confirmStateChange");
        this.animationSpec = animationSpec2;
        this.confirmStateChange = function1;
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.isAnimationRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
        Float valueOf = Float.valueOf(0.0f);
        this.offsetState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.overflowState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.absoluteOffset = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.animationTarget = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C12716r0.m28416g(), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.latestNonEmptyAnchorsFlow = C10971h.m23614u(new SwipeableState$special$$inlined$filter$1(SnapshotStateKt.snapshotFlow(new SwipeableState$latestNonEmptyAnchorsFlow$1(this))), 1);
        this.minBound = Float.NEGATIVE_INFINITY;
        this.maxBound = Float.POSITIVE_INFINITY;
        this.thresholds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SwipeableState$thresholds$2.INSTANCE, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.velocityThreshold$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(valueOf, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.resistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.draggableState = DraggableKt.DraggableState(new SwipeableState$draggableState$1(this));
    }

    /* access modifiers changed from: private */
    public final Object animateInternalToOffset(float f, AnimationSpec<Float> animationSpec2, C12074d<? super C11921v> dVar) {
        Object drag$default = DraggableState.drag$default(this.draggableState, (MutatePriority) null, new SwipeableState$animateInternalToOffset$2(this, f, animationSpec2, (C12074d<? super SwipeableState$animateInternalToOffset$2>) null), dVar, 1, (Object) null);
        if (drag$default == C12150d.m26492c()) {
            return drag$default;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SwipeableState swipeableState, Object obj, AnimationSpec<Float> animationSpec2, C12074d dVar, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                animationSpec2 = swipeableState.animationSpec;
            }
            return swipeableState.animateTo$material3_release(obj, animationSpec2, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
    }

    /* access modifiers changed from: private */
    public final void setAnimationRunning(boolean z) {
        this.isAnimationRunning$delegate.setValue(Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    public final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    /* access modifiers changed from: private */
    public final Object snapInternalToOffset(float f, C12074d<? super C11921v> dVar) {
        Object drag$default = DraggableState.drag$default(this.draggableState, (MutatePriority) null, new SwipeableState$snapInternalToOffset$2(f, this, (C12074d<? super SwipeableState$snapInternalToOffset$2>) null), dVar, 1, (Object) null);
        if (drag$default == C12150d.m26492c()) {
            return drag$default;
        }
        return C11921v.f18618a;
    }

    @ExperimentalMaterial3Api
    public final Object animateTo$material3_release(T t, AnimationSpec<Float> animationSpec2, C12074d<? super C11921v> dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$animateTo$2(t, this, animationSpec2), dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    public final void ensureInit$material3_release(Map<Float, ? extends T> map) {
        C12775o.m28639i(map, "newAnchors");
        if (getAnchors$material3_release().isEmpty()) {
            Float access$getOffset = SwipeableKt.getOffset(map, getCurrentValue());
            if (access$getOffset != null) {
                this.offsetState.setValue(access$getOffset);
                this.absoluteOffset.setValue(access$getOffset);
                return;
            }
            throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
        }
    }

    public final Map<Float, T> getAnchors$material3_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material3_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmStateChange$material3_release() {
        return this.confirmStateChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final float getDirection$material3_release() {
        Float access$getOffset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
        if (access$getOffset == null) {
            return 0.0f;
        }
        return Math.signum(getOffset().getValue().floatValue() - access$getOffset.floatValue());
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    public final float getMaxBound$material3_release() {
        return this.maxBound;
    }

    public final float getMinBound$material3_release() {
        return this.minBound;
    }

    public final State<Float> getOffset() {
        return this.offsetState;
    }

    public final State<Float> getOverflow() {
        return this.overflowState;
    }

    public final SwipeProgress<T> getProgress$material3_release() {
        Object obj;
        Object obj2;
        float f;
        C11906l lVar;
        List access$findBounds = SwipeableKt.findBounds(getOffset().getValue().floatValue(), getAnchors$material3_release().keySet());
        int size = access$findBounds.size();
        if (size == 0) {
            Object currentValue = getCurrentValue();
            obj = getCurrentValue();
            obj2 = currentValue;
            f = 1.0f;
        } else if (size != 1) {
            if (getDirection$material3_release() > 0.0f) {
                lVar = C11915r.m25707a(access$findBounds.get(0), access$findBounds.get(1));
            } else {
                lVar = C11915r.m25707a(access$findBounds.get(1), access$findBounds.get(0));
            }
            float floatValue = ((Number) lVar.mo49109a()).floatValue();
            float floatValue2 = ((Number) lVar.mo49110b()).floatValue();
            obj2 = C12716r0.m28417h(getAnchors$material3_release(), Float.valueOf(floatValue));
            obj = C12716r0.m28417h(getAnchors$material3_release(), Float.valueOf(floatValue2));
            f = (getOffset().getValue().floatValue() - floatValue) / (floatValue2 - floatValue);
        } else {
            Object h = C12716r0.m28417h(getAnchors$material3_release(), access$findBounds.get(0));
            obj = C12716r0.m28417h(getAnchors$material3_release(), access$findBounds.get(0));
            f = 1.0f;
            obj2 = h;
        }
        return new SwipeProgress<>(obj2, obj, f);
    }

    public final ResistanceConfig getResistance$material3_release() {
        return (ResistanceConfig) this.resistance$delegate.getValue();
    }

    public final T getTargetValue$material3_release() {
        float f;
        float f2;
        Float value = this.animationTarget.getValue();
        if (value != null) {
            f = value.floatValue();
        } else {
            float floatValue = getOffset().getValue().floatValue();
            Float access$getOffset = SwipeableKt.getOffset(getAnchors$material3_release(), getCurrentValue());
            if (access$getOffset != null) {
                f2 = access$getOffset.floatValue();
            } else {
                f2 = getOffset().getValue().floatValue();
            }
            f = SwipeableKt.computeTarget(floatValue, f2, getAnchors$material3_release().keySet(), getThresholds$material3_release(), 0.0f, Float.POSITIVE_INFINITY);
        }
        T t = getAnchors$material3_release().get(Float.valueOf(f));
        if (t == null) {
            return getCurrentValue();
        }
        return t;
    }

    public final C13088o<Float, Float, Float> getThresholds$material3_release() {
        return (C13088o) this.thresholds$delegate.getValue();
    }

    public final float getVelocityThreshold$material3_release() {
        return ((Number) this.velocityThreshold$delegate.getValue()).floatValue();
    }

    public final boolean isAnimationRunning() {
        return ((Boolean) this.isAnimationRunning$delegate.getValue()).booleanValue();
    }

    public final float performDrag$material3_release(float f) {
        float l = C13537l.m30885l(this.absoluteOffset.getValue().floatValue() + f, this.minBound, this.maxBound) - this.absoluteOffset.getValue().floatValue();
        if (Math.abs(l) > 0.0f) {
            this.draggableState.dispatchRawDelta(l);
        }
        return l;
    }

    public final Object performFling$material3_release(float f, C12074d<? super C11921v> dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$performFling$2(this, f), dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|79|80|(1:82)(4:83|84|87|88)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01ff */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x020d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object processNewAnchors$material3_release(java.util.Map<java.lang.Float, ? extends T> r10, java.util.Map<java.lang.Float, ? extends T> r11, p355hf.C12074d<? super p336ef.C11921v> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof androidx.compose.material3.SwipeableState$processNewAnchors$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material3.SwipeableState$processNewAnchors$1 r0 = (androidx.compose.material3.SwipeableState$processNewAnchors$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SwipeableState$processNewAnchors$1 r0 = new androidx.compose.material3.SwipeableState$processNewAnchors$1
            r0.<init>(r9, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x0058
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            float r10 = r0.F$0
            java.lang.Object r11 = r0.L$1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SwipeableState r0 = (androidx.compose.material3.SwipeableState) r0
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x003a }
            goto L_0x020f
        L_0x003a:
            r12 = move-exception
            goto L_0x023d
        L_0x003d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0045:
            float r10 = r0.F$0
            java.lang.Object r11 = r0.L$1
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r2 = r0.L$0
            androidx.compose.material3.SwipeableState r2 = (androidx.compose.material3.SwipeableState) r2
            p336ef.C11910n.m25701b(r12)     // Catch:{ CancellationException -> 0x01ff }
            goto L_0x01cd
        L_0x0054:
            r12 = move-exception
            r0 = r2
            goto L_0x023d
        L_0x0058:
            p336ef.C11910n.m25701b(r12)
            goto L_0x009e
        L_0x005c:
            p336ef.C11910n.m25701b(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x00ad
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28235n0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r9.minBound = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28233l0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r9.maxBound = r10
            java.lang.Object r10 = r9.getCurrentValue()
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.getOffset(r11, r10)
            if (r10 == 0) goto L_0x00a1
            float r10 = r10.floatValue()
            r0.label = r5
            java.lang.Object r10 = r9.snapInternalToOffset(r10, r0)
            if (r10 != r1) goto L_0x009e
            return r1
        L_0x009e:
            ef.v r10 = p336ef.C11921v.f18618a
            return r10
        L_0x00a1:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "The initial value must have an associated anchor."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ad:
            boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r11, r10)
            if (r12 != 0) goto L_0x026b
            r12 = -8388608(0xffffffffff800000, float:-Infinity)
            r9.minBound = r12
            r12 = 2139095040(0x7f800000, float:Infinity)
            r9.maxBound = r12
            androidx.compose.runtime.MutableState<java.lang.Float> r12 = r9.animationTarget
            java.lang.Object r12 = r12.getValue()
            java.lang.Float r12 = (java.lang.Float) r12
            r2 = 0
            if (r12 == 0) goto L_0x012d
            java.lang.Object r10 = r10.get(r12)
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.getOffset(r11, r10)
            if (r10 == 0) goto L_0x00d6
            float r10 = r10.floatValue()
            goto L_0x01bb
        L_0x00d6:
            java.util.Set r10 = r11.keySet()
            java.util.Iterator r5 = r10.iterator()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00e5
            goto L_0x0122
        L_0x00e5:
            java.lang.Object r2 = r5.next()
            boolean r10 = r5.hasNext()
            if (r10 != 0) goto L_0x00f0
            goto L_0x0122
        L_0x00f0:
            r10 = r2
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r6 = r12.floatValue()
            float r10 = r10 - r6
            float r10 = java.lang.Math.abs(r10)
        L_0x0100:
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r8 = r12.floatValue()
            float r7 = r7 - r8
            float r7 = java.lang.Math.abs(r7)
            int r8 = java.lang.Float.compare(r10, r7)
            if (r8 <= 0) goto L_0x011c
            r2 = r6
            r10 = r7
        L_0x011c:
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0100
        L_0x0122:
            kotlin.jvm.internal.C12775o.m28636f(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
            goto L_0x01bb
        L_0x012d:
            androidx.compose.runtime.State r12 = r9.getOffset()
            java.lang.Object r12 = r12.getValue()
            java.lang.Object r10 = r10.get(r12)
            java.lang.Object r12 = r9.getCurrentValue()
            boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r10, r12)
            if (r12 == 0) goto L_0x0147
            java.lang.Object r10 = r9.getCurrentValue()
        L_0x0147:
            java.lang.Float r10 = androidx.compose.material3.SwipeableKt.getOffset(r11, r10)
            if (r10 == 0) goto L_0x0152
            float r10 = r10.floatValue()
            goto L_0x01bb
        L_0x0152:
            java.util.Set r10 = r11.keySet()
            java.util.Iterator r10 = r10.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x0161
            goto L_0x01b2
        L_0x0161:
            java.lang.Object r2 = r10.next()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto L_0x016c
            goto L_0x01b2
        L_0x016c:
            r12 = r2
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            androidx.compose.runtime.State r5 = r9.getOffset()
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
        L_0x0186:
            java.lang.Object r5 = r10.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            androidx.compose.runtime.State r7 = r9.getOffset()
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r7 = java.lang.Float.compare(r12, r6)
            if (r7 <= 0) goto L_0x01ac
            r2 = r5
            r12 = r6
        L_0x01ac:
            boolean r5 = r10.hasNext()
            if (r5 != 0) goto L_0x0186
        L_0x01b2:
            kotlin.jvm.internal.C12775o.m28636f(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r10 = r2.floatValue()
        L_0x01bb:
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r12 = r9.animationSpec     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            r0.L$0 = r9     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            r0.L$1 = r11     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            r0.F$0 = r10     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            r0.label = r4     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            java.lang.Object r12 = r9.animateInternalToOffset(r10, r12, r0)     // Catch:{ CancellationException -> 0x01fe, all -> 0x01fb }
            if (r12 != r1) goto L_0x01cc
            return r1
        L_0x01cc:
            r2 = r9
        L_0x01cd:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r10)
            java.lang.Object r10 = kotlin.collections.C12716r0.m28417h(r11, r10)
            r2.setCurrentValue(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28235n0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r2.minBound = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28233l0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r2.maxBound = r10
            goto L_0x026b
        L_0x01fb:
            r12 = move-exception
            r0 = r9
            goto L_0x023d
        L_0x01fe:
            r2 = r9
        L_0x01ff:
            r0.L$0 = r2     // Catch:{ all -> 0x0054 }
            r0.L$1 = r11     // Catch:{ all -> 0x0054 }
            r0.F$0 = r10     // Catch:{ all -> 0x0054 }
            r0.label = r3     // Catch:{ all -> 0x0054 }
            java.lang.Object r12 = r2.snapInternalToOffset(r10, r0)     // Catch:{ all -> 0x0054 }
            if (r12 != r1) goto L_0x020e
            return r1
        L_0x020e:
            r0 = r2
        L_0x020f:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r10)
            java.lang.Object r10 = kotlin.collections.C12716r0.m28417h(r11, r10)
            r0.setCurrentValue(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28235n0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r0.minBound = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28233l0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r0.maxBound = r10
            goto L_0x026b
        L_0x023d:
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r10)
            java.lang.Object r10 = kotlin.collections.C12716r0.m28417h(r11, r10)
            r0.setCurrentValue(r10)
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28235n0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r0.minBound = r10
            java.util.Set r10 = r11.keySet()
            java.lang.Float r10 = kotlin.collections.C12686e0.m28233l0(r10)
            kotlin.jvm.internal.C12775o.m28636f(r10)
            float r10 = r10.floatValue()
            r0.maxBound = r10
            throw r12
        L_0x026b:
            ef.v r10 = p336ef.C11921v.f18618a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableState.processNewAnchors$material3_release(java.util.Map, java.util.Map, hf.d):java.lang.Object");
    }

    public final void setAnchors$material3_release(Map<Float, ? extends T> map) {
        C12775o.m28639i(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void setMaxBound$material3_release(float f) {
        this.maxBound = f;
    }

    public final void setMinBound$material3_release(float f) {
        this.minBound = f;
    }

    public final void setResistance$material3_release(ResistanceConfig resistanceConfig) {
        this.resistance$delegate.setValue(resistanceConfig);
    }

    public final void setThresholds$material3_release(C13088o<? super Float, ? super Float, Float> oVar) {
        C12775o.m28639i(oVar, "<set-?>");
        this.thresholds$delegate.setValue(oVar);
    }

    public final void setVelocityThreshold$material3_release(float f) {
        this.velocityThreshold$delegate.setValue(Float.valueOf(f));
    }

    @ExperimentalMaterial3Api
    public final Object snapTo$material3_release(T t, C12074d<? super C11921v> dVar) {
        Object collect = this.latestNonEmptyAnchorsFlow.collect(new SwipeableState$snapTo$2(t, this), dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getDirection$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getProgress$material3_release$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getTargetValue$material3_release$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableState(Object obj, AnimationSpec animationSpec2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec$material3_release() : animationSpec2, (i & 4) != 0 ? C09181.INSTANCE : function1);
    }
}
