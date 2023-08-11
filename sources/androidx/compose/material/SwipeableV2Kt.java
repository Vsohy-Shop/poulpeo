package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.SwipeableV2State;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.InspectableValueKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,655:1\n135#2:656\n1#3:657\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n127#1:656\n*E\n"})
/* compiled from: SwipeableV2.kt */
public final class SwipeableV2Kt {
    /* access modifiers changed from: private */
    public static final <T> T closestAnchor(Map<T, Float> map, float f, boolean z) {
        float f2;
        float f3;
        if (!map.isEmpty()) {
            Iterator<T> it = map.entrySet().iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                    if (z) {
                        f2 = floatValue - f;
                    } else {
                        f2 = f - floatValue;
                    }
                    if (f2 < 0.0f) {
                        f2 = Float.POSITIVE_INFINITY;
                    }
                    do {
                        T next2 = it.next();
                        float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                        if (z) {
                            f3 = floatValue2 - f;
                        } else {
                            f3 = f - floatValue2;
                        }
                        if (f3 < 0.0f) {
                            f3 = Float.POSITIVE_INFINITY;
                        }
                        if (Float.compare(f2, f3) > 0) {
                            next = next2;
                            f2 = f3;
                        }
                    } while (it.hasNext());
                }
                return ((Map.Entry) next).getKey();
            }
            throw new NoSuchElementException();
        }
        throw new IllegalArgumentException("The anchors were empty when trying to find the closest anchor".toString());
    }

    static /* synthetic */ Object closestAnchor$default(Map map, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return closestAnchor(map, f, z);
    }

    @ExperimentalMaterialApi
    /* renamed from: fixedPositionalThreshold-0680j_4  reason: not valid java name */
    public static final C13088o<Density, Float, Float> m34147fixedPositionalThreshold0680j_4(float f) {
        return new SwipeableV2Kt$fixedPositionalThreshold$1(f);
    }

    @ExperimentalMaterialApi
    public static final C13088o<Density, Float, Float> fractionalPositionalThreshold(float f) {
        return new SwipeableV2Kt$fractionalPositionalThreshold$1(f);
    }

    /* access modifiers changed from: private */
    public static final <T> Float maxOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* access modifiers changed from: private */
    public static final <T> Float minOrNull(Map<T, Float> map) {
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) ((Map.Entry) it.next()).getValue()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) ((Map.Entry) it.next()).getValue()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @ExperimentalMaterialApi
    @Composable
    public static final <T> SwipeableV2State<T> rememberSwipeableV2State(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Composer composer, int i, int i2) {
        C12775o.m28639i(t, "initialValue");
        composer.startReplaceableGroup(-1791789117);
        SpringSpec<Float> springSpec = animationSpec;
        if ((i2 & 2) != 0) {
            springSpec = SwipeableV2Defaults.INSTANCE.getAnimationSpec();
        }
        SwipeableV2Kt$rememberSwipeableV2State$1 swipeableV2Kt$rememberSwipeableV2State$1 = function1;
        if ((i2 & 4) != 0) {
            swipeableV2Kt$rememberSwipeableV2State$1 = SwipeableV2Kt$rememberSwipeableV2State$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1791789117, i, -1, "androidx.compose.material.rememberSwipeableV2State (SwipeableV2.kt:477)");
        }
        SwipeableV2State.Companion companion = SwipeableV2State.Companion;
        SwipeableV2Defaults swipeableV2Defaults = SwipeableV2Defaults.INSTANCE;
        SwipeableV2State<T> swipeableV2State = (SwipeableV2State) RememberSaveableKt.rememberSaveable(new Object[]{t, springSpec, swipeableV2Kt$rememberSwipeableV2State$1}, companion.m34150SavereqLRuRQ(springSpec, swipeableV2Kt$rememberSwipeableV2State$1, swipeableV2Defaults.getPositionalThreshold(), swipeableV2Defaults.m34146getVelocityThresholdD9Ej5fM()), (String) null, new SwipeableV2Kt$rememberSwipeableV2State$2(t, springSpec, swipeableV2Kt$rememberSwipeableV2State$1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableV2State;
    }

    private static final <T> float requireAnchor(Map<T, Float> map, T t) {
        Float f = map.get(t);
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalArgumentException(("Required anchor " + t + " was not found in anchors. Current anchors: " + C12716r0.m28427r(map)).toString());
    }

    @ExperimentalMaterialApi
    public static final <T> Modifier swipeAnchors(Modifier modifier, SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, C13088o<? super T, ? super IntSize, Float> oVar) {
        Function1 function1;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(swipeableV2State, "state");
        C12775o.m28639i(set, "possibleValues");
        C12775o.m28639i(oVar, "calculateAnchor");
        SwipeableV2Kt$swipeAnchors$1 swipeableV2Kt$swipeAnchors$1 = new SwipeableV2Kt$swipeAnchors$1(swipeableV2State);
        SwipeableV2Kt$swipeAnchors$2 swipeableV2Kt$swipeAnchors$2 = new SwipeableV2Kt$swipeAnchors$2(swipeableV2State, set, anchorChangeHandler, oVar);
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new SwipeableV2Kt$swipeAnchors$$inlined$debugInspectorInfo$1(swipeableV2State, set, anchorChangeHandler, oVar);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new SwipeAnchorsModifier(swipeableV2Kt$swipeAnchors$1, swipeableV2Kt$swipeAnchors$2, function1));
    }

    public static /* synthetic */ Modifier swipeAnchors$default(Modifier modifier, SwipeableV2State swipeableV2State, Set set, AnchorChangeHandler anchorChangeHandler, C13088o oVar, int i, Object obj) {
        if ((i & 4) != 0) {
            anchorChangeHandler = null;
        }
        return swipeAnchors(modifier, swipeableV2State, set, anchorChangeHandler, oVar);
    }

    @ExperimentalMaterialApi
    public static final <T> Modifier swipeableV2(Modifier modifier, SwipeableV2State<T> swipeableV2State, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource) {
        SwipeableV2State<T> swipeableV2State2 = swipeableV2State;
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(swipeableV2State, "state");
        C12775o.m28639i(orientation, "orientation");
        return DraggableKt.draggable$default(modifier, swipeableV2State.getDraggableState$material_release(), orientation, z, mutableInteractionSource, swipeableV2State.isAnimationRunning(), (C13089p) null, new SwipeableV2Kt$swipeableV2$1(swipeableV2State, (C12074d<? super SwipeableV2Kt$swipeableV2$1>) null), z2, 32, (Object) null);
    }

    public static /* synthetic */ Modifier swipeableV2$default(Modifier modifier, SwipeableV2State swipeableV2State, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            mutableInteractionSource = null;
        }
        return swipeableV2(modifier, swipeableV2State, orientation, z3, z4, mutableInteractionSource);
    }
}
