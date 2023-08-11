package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n76#2:656\n102#2,2:657\n76#2:659\n76#2:660\n102#2,2:661\n76#2:663\n76#2:664\n102#2,2:665\n76#2:667\n76#2:668\n76#2:669\n102#2,2:670\n76#2:672\n102#2,2:673\n288#3,2:675\n1#4:677\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2State\n*L\n169#1:656\n169#1:657,2\n177#1:659\n200#1:660\n200#1:661,2\n223#1:663\n240#1:664\n240#1:665,2\n247#1:667\n253#1:668\n255#1:669\n255#1:670,2\n260#1:672\n260#1:673,2\n354#1:675,2\n*E\n"})
@Stable
@ExperimentalMaterialApi
/* compiled from: SwipeableV2.kt */
public final class SwipeableV2State<T> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final MutableState animationTarget$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private Density density;
    private final DraggableState draggableState;
    private final MutableState lastVelocity$delegate;
    private final State maxOffset$delegate;
    private final State minOffset$delegate;
    private final MutableState offset$delegate;
    private final C13088o<Density, Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final float velocityThreshold;

    /* compiled from: SwipeableV2.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalMaterialApi
        /* renamed from: Saver-eqLRuRQ  reason: not valid java name */
        public final <T> Saver<SwipeableV2State<T>, T> m34150SavereqLRuRQ(AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, C13088o<? super Density, ? super Float, Float> oVar, float f) {
            C12775o.m28639i(animationSpec, "animationSpec");
            C12775o.m28639i(function1, "confirmValueChange");
            C12775o.m28639i(oVar, "positionalThreshold");
            return SaverKt.Saver(SwipeableV2State$Companion$Saver$1.INSTANCE, new SwipeableV2State$Companion$Saver$2(animationSpec, function1, oVar, f));
        }
    }

    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec2, Function1 function1, C13088o oVar, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, animationSpec2, function1, oVar, f);
    }

    public static /* synthetic */ Object animateTo$default(SwipeableV2State swipeableV2State, Object obj, float f, C12074d dVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = swipeableV2State.getLastVelocity();
        }
        return swipeableV2State.animateTo(obj, f, dVar);
    }

    /* access modifiers changed from: private */
    public final T computeTarget(float f, T t, float f2) {
        T access$closestAnchor;
        Map anchors$material_release = getAnchors$material_release();
        Float f3 = (Float) anchors$material_release.get(t);
        Density requireDensity = requireDensity();
        float r3 = requireDensity.m38449toPx0680j_4(this.velocityThreshold);
        if (C12775o.m28632b(f3, f) || f3 == null) {
            return t;
        }
        if (f3.floatValue() < f) {
            if (f2 >= r3) {
                return SwipeableV2Kt.closestAnchor(anchors$material_release, f, true);
            }
            access$closestAnchor = SwipeableV2Kt.closestAnchor(anchors$material_release, f, true);
            if (f < Math.abs(f3.floatValue() + Math.abs(this.positionalThreshold.invoke(requireDensity, Float.valueOf(Math.abs(((Number) C12716r0.m28417h(anchors$material_release, access$closestAnchor)).floatValue() - f3.floatValue()))).floatValue()))) {
                return t;
            }
        } else if (f2 <= (-r3)) {
            return SwipeableV2Kt.closestAnchor(anchors$material_release, f, false);
        } else {
            access$closestAnchor = SwipeableV2Kt.closestAnchor(anchors$material_release, f, false);
            float abs = Math.abs(f3.floatValue() - Math.abs(this.positionalThreshold.invoke(requireDensity, Float.valueOf(Math.abs(f3.floatValue() - ((Number) C12716r0.m28417h(anchors$material_release, access$closestAnchor)).floatValue()))).floatValue()));
            if (f < 0.0f) {
                if (Math.abs(f) < abs) {
                    return t;
                }
            } else if (f > abs) {
                return t;
            }
        }
        return access$closestAnchor;
    }

    /* access modifiers changed from: private */
    public final T getAnimationTarget() {
        return this.animationTarget$delegate.getValue();
    }

    private final Density requireDensity() {
        Density density2 = this.density;
        if (density2 != null) {
            return density2;
        }
        throw new IllegalArgumentException(("SwipeableState did not have a density attached. Are you using Modifier.swipeable with this=" + this + " SwipeableState?").toString());
    }

    /* access modifiers changed from: private */
    public final void setAnimationTarget(T t) {
        this.animationTarget$delegate.setValue(t);
    }

    private final void setCurrentValue(T t) {
        this.currentValue$delegate.setValue(t);
    }

    /* access modifiers changed from: private */
    public final void setLastVelocity(float f) {
        this.lastVelocity$delegate.setValue(Float.valueOf(f));
    }

    /* access modifiers changed from: private */
    public final void setOffset(Float f) {
        this.offset$delegate.setValue(f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0106 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object animateTo(T r18, float r19, p355hf.C12074d<? super p336ef.C11921v> r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            boolean r1 = r0 instanceof androidx.compose.material.SwipeableV2State$animateTo$1
            if (r1 == 0) goto L_0x0017
            r1 = r0
            androidx.compose.material.SwipeableV2State$animateTo$1 r1 = (androidx.compose.material.SwipeableV2State$animateTo$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.label = r2
            goto L_0x001c
        L_0x0017:
            androidx.compose.material.SwipeableV2State$animateTo$1 r1 = new androidx.compose.material.SwipeableV2State$animateTo$1
            r1.<init>(r7, r0)
        L_0x001c:
            r11 = r1
            java.lang.Object r0 = r11.result
            java.lang.Object r14 = p362if.C12150d.m26492c()
            int r1 = r11.label
            r15 = 0
            r16 = 1056964608(0x3f000000, float:0.5)
            r13 = 1
            r12 = 0
            if (r1 == 0) goto L_0x0045
            if (r1 != r13) goto L_0x003d
            java.lang.Object r1 = r11.L$0
            androidx.compose.material.SwipeableV2State r1 = (androidx.compose.material.SwipeableV2State) r1
            p336ef.C11910n.m25701b(r0)     // Catch:{ all -> 0x0038 }
            r2 = r12
            r3 = r13
            goto L_0x0079
        L_0x0038:
            r0 = move-exception
            r2 = r12
            r3 = r13
            goto L_0x00cd
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            p336ef.C11910n.m25701b(r0)
            java.util.Map r0 = r17.getAnchors$material_release()
            r3 = r18
            java.lang.Object r0 = r0.get(r3)
            r4 = r0
            java.lang.Float r4 = (java.lang.Float) r4
            if (r4 == 0) goto L_0x011b
            androidx.compose.foundation.gestures.DraggableState r8 = r7.draggableState     // Catch:{ all -> 0x00c9 }
            r9 = 0
            androidx.compose.material.SwipeableV2State$animateTo$2 r10 = new androidx.compose.material.SwipeableV2State$animateTo$2     // Catch:{ all -> 0x00c9 }
            r6 = 0
            r1 = r10
            r2 = r17
            r3 = r18
            r5 = r19
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00c9 }
            r0 = 1
            r1 = 0
            r11.L$0 = r7     // Catch:{ all -> 0x00c9 }
            r11.label = r13     // Catch:{ all -> 0x00c9 }
            r2 = r12
            r12 = r0
            r3 = r13
            r13 = r1
            java.lang.Object r0 = androidx.compose.foundation.gestures.DraggableState.drag$default(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00c7 }
            if (r0 != r14) goto L_0x0078
            return r14
        L_0x0078:
            r1 = r7
        L_0x0079:
            r1.setAnimationTarget(r2)
            float r0 = r1.requireOffset()
            java.util.Map r4 = r1.getAnchors$material_release()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x008c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r12 = r4.next()
            r5 = r12
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ae
            r13 = r3
            goto L_0x00af
        L_0x00ae:
            r13 = r15
        L_0x00af:
            if (r13 == 0) goto L_0x008c
            goto L_0x00b3
        L_0x00b2:
            r12 = r2
        L_0x00b3:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            if (r12 == 0) goto L_0x00bc
            java.lang.Object r12 = r12.getKey()
            goto L_0x00bd
        L_0x00bc:
            r12 = r2
        L_0x00bd:
            if (r12 != 0) goto L_0x00c3
            java.lang.Object r12 = r1.getCurrentValue()
        L_0x00c3:
            r1.setCurrentValue(r12)
            goto L_0x011e
        L_0x00c7:
            r0 = move-exception
            goto L_0x00cc
        L_0x00c9:
            r0 = move-exception
            r2 = r12
            r3 = r13
        L_0x00cc:
            r1 = r7
        L_0x00cd:
            r1.setAnimationTarget(r2)
            float r4 = r1.requireOffset()
            java.util.Map r5 = r1.getAnchors$material_release()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00e0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0106
            java.lang.Object r12 = r5.next()
            r6 = r12
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r6 = r6 - r4
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 >= 0) goto L_0x0102
            r13 = r3
            goto L_0x0103
        L_0x0102:
            r13 = r15
        L_0x0103:
            if (r13 == 0) goto L_0x00e0
            goto L_0x0107
        L_0x0106:
            r12 = r2
        L_0x0107:
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            if (r12 == 0) goto L_0x0110
            java.lang.Object r12 = r12.getKey()
            goto L_0x0111
        L_0x0110:
            r12 = r2
        L_0x0111:
            if (r12 != 0) goto L_0x0117
            java.lang.Object r12 = r1.getCurrentValue()
        L_0x0117:
            r1.setCurrentValue(r12)
            throw r0
        L_0x011b:
            r17.setCurrentValue(r18)
        L_0x011e:
            ef.v r0 = p336ef.C11921v.f18618a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.animateTo(java.lang.Object, float, hf.d):java.lang.Object");
    }

    public final float dispatchRawDelta(float f) {
        float f2;
        Float offset = getOffset();
        if (offset != null) {
            f2 = offset.floatValue();
        } else {
            f2 = 0.0f;
        }
        float l = C13537l.m30885l(f + f2, getMinOffset(), getMaxOffset()) - f2;
        if (Math.abs(l) > 0.0f) {
            this.draggableState.dispatchRawDelta(l);
        }
        return l;
    }

    public final Map<T, Float> getAnchors$material_release() {
        return (Map) this.anchors$delegate.getValue();
    }

    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.animationSpec;
    }

    public final Function1<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final Density getDensity$material_release() {
        return this.density;
    }

    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return ((Number) this.lastVelocity$delegate.getValue()).floatValue();
    }

    public final float getMaxOffset() {
        return ((Number) this.maxOffset$delegate.getValue()).floatValue();
    }

    public final float getMinOffset() {
        return ((Number) this.minOffset$delegate.getValue()).floatValue();
    }

    public final Float getOffset() {
        return (Float) this.offset$delegate.getValue();
    }

    public final C13088o<Density, Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return this.targetValue$delegate.getValue();
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material_release  reason: not valid java name */
    public final float m34149getVelocityThresholdD9Ej5fM$material_release() {
        return this.velocityThreshold;
    }

    public final boolean hasAnchorForValue(T t) {
        return getAnchors$material_release().containsKey(t);
    }

    public final boolean isAnimationRunning() {
        if (getAnimationTarget() != null) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        Float offset = getOffset();
        if (offset != null) {
            return offset.floatValue();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    public final void setAnchors$material_release(Map<T, Float> map) {
        C12775o.m28639i(map, "<set-?>");
        this.anchors$delegate.setValue(map);
    }

    public final void setDensity$material_release(Density density2) {
        this.density = density2;
    }

    public final Object settle(float f, C12074d<? super C11921v> dVar) {
        Object currentValue = getCurrentValue();
        Object computeTarget = computeTarget(requireOffset(), currentValue, f);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = animateTo(computeTarget, f, dVar);
            if (animateTo == C12150d.m26492c()) {
                return animateTo;
            }
            return C11921v.f18618a;
        }
        Object animateTo2 = animateTo(currentValue, f, dVar);
        if (animateTo2 == C12150d.m26492c()) {
            return animateTo2;
        }
        return C11921v.f18618a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object snapTo(T r9, p355hf.C12074d<? super p336ef.C11921v> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material.SwipeableV2State$snapTo$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = (androidx.compose.material.SwipeableV2State$snapTo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SwipeableV2State$snapTo$1 r0 = new androidx.compose.material.SwipeableV2State$snapTo$1
            r0.<init>(r8, r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.result
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r4.label
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L_0x003b
            if (r1 != r2) goto L_0x0033
            java.lang.Object r9 = r4.L$1
            java.lang.Object r0 = r4.L$0
            androidx.compose.material.SwipeableV2State r0 = (androidx.compose.material.SwipeableV2State) r0
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x0031 }
            goto L_0x0065
        L_0x0031:
            r9 = move-exception
            goto L_0x006e
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003b:
            p336ef.C11910n.m25701b(r10)
            java.util.Map r10 = r8.getAnchors$material_release()
            java.lang.Object r10 = r10.get(r9)
            java.lang.Float r10 = (java.lang.Float) r10
            if (r10 == 0) goto L_0x0072
            androidx.compose.foundation.gestures.DraggableState r1 = r8.draggableState     // Catch:{ all -> 0x006c }
            r3 = 0
            androidx.compose.material.SwipeableV2State$snapTo$2 r5 = new androidx.compose.material.SwipeableV2State$snapTo$2     // Catch:{ all -> 0x006c }
            r5.<init>(r8, r9, r10, r7)     // Catch:{ all -> 0x006c }
            r10 = 1
            r6 = 0
            r4.L$0 = r8     // Catch:{ all -> 0x006c }
            r4.L$1 = r9     // Catch:{ all -> 0x006c }
            r4.label = r2     // Catch:{ all -> 0x006c }
            r2 = r3
            r3 = r5
            r5 = r10
            java.lang.Object r10 = androidx.compose.foundation.gestures.DraggableState.drag$default(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x006c }
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r0 = r8
        L_0x0065:
            r0.setCurrentValue(r9)     // Catch:{ all -> 0x0031 }
            r0.setAnimationTarget(r7)
            goto L_0x0075
        L_0x006c:
            r9 = move-exception
            r0 = r8
        L_0x006e:
            r0.setAnimationTarget(r7)
            throw r9
        L_0x0072:
            r8.setCurrentValue(r9)
        L_0x0075:
            ef.v r9 = p336ef.C11921v.f18618a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableV2State.snapTo(java.lang.Object, hf.d):java.lang.Object");
    }

    public final boolean updateAnchors$material_release(Map<T, Float> map) {
        boolean z;
        C12775o.m28639i(map, "newAnchors");
        boolean isEmpty = getAnchors$material_release().isEmpty();
        setAnchors$material_release(map);
        if (isEmpty) {
            Float f = (Float) getAnchors$material_release().get(getCurrentValue());
            if (f != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setOffset(f);
            }
        } else {
            z = true;
        }
        if (!z || !isEmpty) {
            return true;
        }
        return false;
    }

    private SwipeableV2State(T t, AnimationSpec<Float> animationSpec2, Function1<? super T, Boolean> function1, C13088o<? super Density, ? super Float, Float> oVar, float f) {
        this.animationSpec = animationSpec2;
        this.confirmValueChange = function1;
        this.positionalThreshold = oVar;
        this.velocityThreshold = f;
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$targetValue$2(this));
        this.offset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$progress$2(this));
        this.lastVelocity$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.minOffset$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$minOffset$2(this));
        this.maxOffset$delegate = SnapshotStateKt.derivedStateOf(new SwipeableV2State$maxOffset$2(this));
        this.animationTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
        this.draggableState = DraggableKt.DraggableState(new SwipeableV2State$draggableState$1(this));
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(C12716r0.m28416g(), (SnapshotMutationPolicy) null, 2, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwipeableV2State(Object obj, AnimationSpec animationSpec2, Function1 function1, C13088o<Density, Float, Float> oVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? SwipeableV2Defaults.INSTANCE.getAnimationSpec() : animationSpec2, (i & 4) != 0 ? C08051.INSTANCE : function1, (i & 8) != 0 ? SwipeableV2Defaults.INSTANCE.getPositionalThreshold() : oVar, (i & 16) != 0 ? SwipeableV2Defaults.INSTANCE.m34146getVelocityThresholdD9Ej5fM() : f, (DefaultConstructorMarker) null);
    }
}
