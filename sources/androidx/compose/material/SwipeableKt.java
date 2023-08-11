package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,890:1\n25#2:891\n25#2:898\n1114#3,6:892\n1114#3,6:899\n135#4:905\n766#5:906\n857#5,2:907\n766#5:909\n857#5,2:910\n288#5,2:912\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n502#1:891\n509#1:898\n502#1:892,6\n509#1:899,6\n574#1:905\n739#1:906\n739#1:907,2\n740#1:909\n740#1:910,2\n797#1:912,2\n*E\n"})
/* compiled from: Swipeable.kt */
public final class SwipeableKt {
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r3 < r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5)).floatValue()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r3 > r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0)).floatValue()) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float computeTarget(float r3, float r4, java.util.Set<java.lang.Float> r5, p404of.C13088o<? super java.lang.Float, ? super java.lang.Float, java.lang.Float> r6, float r7, float r8) {
        /*
            java.util.List r5 = findBounds(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L_0x006c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0062
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L_0x0042
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x002b
            return r5
        L_0x002b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x005e
            goto L_0x0060
        L_0x0042:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0060
        L_0x005e:
            r4 = r5
            goto L_0x006c
        L_0x0060:
            r4 = r0
            goto L_0x006c
        L_0x0062:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.computeTarget(float, float, java.util.Set, of.o, float, float):float");
    }

    /* access modifiers changed from: private */
    public static final List<Float> findBounds(float f, Set<Float> set) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((double) ((Number) next).floatValue()) > ((double) f) + 0.001d) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        Float l0 = C12686e0.m28233l0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : set) {
            if (((double) ((Number) next2).floatValue()) >= ((double) f) - 0.001d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        Float n0 = C12686e0.m28235n0(arrayList2);
        if (l0 == null) {
            return C12726w.m28528o(n0);
        }
        if (n0 == null) {
            return C12723v.m28509d(l0);
        }
        if (C12775o.m28633c(l0, n0)) {
            return C12723v.m28509d(l0);
        }
        return C12726w.m28527n(l0, n0);
    }

    /* access modifiers changed from: private */
    public static final <T> Float getOffset(Map<Float, ? extends T> map, T t) {
        T t2;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (C12775o.m28634d(((Map.Entry) t2).getValue(), t)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) t2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final <T> NestedScrollConnection getPreUpPostDownNestedScrollConnection(SwipeableState<T> swipeableState) {
        C12775o.m28639i(swipeableState, "<this>");
        return new SwipeableKt$PreUpPostDownNestedScrollConnection$1(swipeableState);
    }

    @ExperimentalMaterialApi
    @Composable
    public static final <T> SwipeableState<T> rememberSwipeableState(T t, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function1, Composer composer, int i, int i2) {
        C12775o.m28639i(t, "initialValue");
        composer.startReplaceableGroup(-1237755169);
        AnimationSpec animationSpec2 = animationSpec;
        if ((i2 & 2) != 0) {
            animationSpec2 = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        Function1 function12 = function1;
        if ((i2 & 4) != 0) {
            function12 = SwipeableKt$rememberSwipeableState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237755169, i, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:467)");
        }
        SwipeableState<T> swipeableState = (SwipeableState) RememberSaveableKt.rememberSaveable(new Object[0], SwipeableState.Companion.Saver(animationSpec2, function12), (String) null, new SwipeableKt$rememberSwipeableState$2(t, animationSpec2, function12), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    @ExperimentalMaterialApi
    @Composable
    public static final <T> SwipeableState<T> rememberSwipeableStateFor(T t, Function1<? super T, C11921v> function1, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        C12775o.m28639i(t, "value");
        C12775o.m28639i(function1, "onValueChange");
        composer.startReplaceableGroup(1156387078);
        if ((i2 & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1156387078, i, -1, "androidx.compose.material.rememberSwipeableStateFor (Swipeable.kt:496)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new SwipeableState(t, animationSpec, SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1.INSTANCE);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SwipeableState<T> swipeableState = (SwipeableState) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue2;
        int i3 = i & 8;
        EffectsKt.LaunchedEffect(t, mutableState.getValue(), new SwipeableKt$rememberSwipeableStateFor$1(t, swipeableState, (C12074d<? super SwipeableKt$rememberSwipeableStateFor$1>) null), composer, (i & 14) | i3 | 512);
        EffectsKt.DisposableEffect((Object) swipeableState.getCurrentValue(), (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new SwipeableKt$rememberSwipeableStateFor$2(t, swipeableState, function1, mutableState), composer, i3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return swipeableState;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.material.ExperimentalMaterialApi
    /* renamed from: swipeable-pPrIpRY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> androidx.compose.p002ui.Modifier m34139swipeablepPrIpRY(androidx.compose.p002ui.Modifier r16, androidx.compose.material.SwipeableState<T> r17, java.util.Map<java.lang.Float, ? extends T> r18, androidx.compose.foundation.gestures.Orientation r19, boolean r20, boolean r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, p404of.C13088o<? super T, ? super T, ? extends androidx.compose.material.ThresholdConfig> r23, androidx.compose.material.ResistanceConfig r24, float r25) {
        /*
            r0 = r16
            java.lang.String r1 = "$this$swipeable"
            kotlin.jvm.internal.C12775o.m28639i(r0, r1)
            java.lang.String r1 = "state"
            r12 = r17
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)
            java.lang.String r1 = "anchors"
            r13 = r18
            kotlin.jvm.internal.C12775o.m28639i(r13, r1)
            java.lang.String r1 = "orientation"
            r14 = r19
            kotlin.jvm.internal.C12775o.m28639i(r14, r1)
            java.lang.String r1 = "thresholds"
            r15 = r23
            kotlin.jvm.internal.C12775o.m28639i(r15, r1)
            boolean r1 = androidx.compose.p002ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled()
            if (r1 == 0) goto L_0x0042
            androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0046
        L_0x0042:
            kotlin.jvm.functions.Function1 r1 = androidx.compose.p002ui.platform.InspectableValueKt.getNoInspectorInfo()
        L_0x0046:
            androidx.compose.material.SwipeableKt$swipeable$3 r11 = new androidx.compose.material.SwipeableKt$swipeable$3
            r2 = r11
            r3 = r18
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r22
            r8 = r21
            r9 = r24
            r10 = r23
            r12 = r11
            r11 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            androidx.compose.ui.Modifier r0 = androidx.compose.p002ui.ComposedModifierKt.composed(r0, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.m34139swipeablepPrIpRY(androidx.compose.ui.Modifier, androidx.compose.material.SwipeableState, java.util.Map, androidx.compose.foundation.gestures.Orientation, boolean, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, of.o, androidx.compose.material.ResistanceConfig, float):androidx.compose.ui.Modifier");
    }

    /* renamed from: swipeable-pPrIpRY$default  reason: not valid java name */
    public static /* synthetic */ Modifier m34140swipeablepPrIpRY$default(Modifier modifier, SwipeableState swipeableState, Map map, Orientation orientation, boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, C13088o oVar, ResistanceConfig resistanceConfig, float f, int i, Object obj) {
        boolean z3;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        SwipeableKt$swipeable$1 swipeableKt$swipeable$1;
        ResistanceConfig resistanceConfig2;
        float f2;
        int i2 = i;
        if ((i2 & 8) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            z4 = false;
        } else {
            z4 = z2;
        }
        if ((i2 & 32) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i2 & 64) != 0) {
            swipeableKt$swipeable$1 = SwipeableKt$swipeable$1.INSTANCE;
        } else {
            swipeableKt$swipeable$1 = oVar;
        }
        if ((i2 & 128) != 0) {
            resistanceConfig2 = SwipeableDefaults.resistanceConfig$default(SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, (Object) null);
        } else {
            resistanceConfig2 = resistanceConfig;
        }
        if ((i2 & 256) != 0) {
            f2 = SwipeableDefaults.INSTANCE.m34138getVelocityThresholdD9Ej5fM();
        } else {
            f2 = f;
        }
        return m34139swipeablepPrIpRY(modifier, swipeableState, map, orientation, z3, z4, mutableInteractionSource2, swipeableKt$swipeable$1, resistanceConfig2, f2);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPreUpPostDownNestedScrollConnection$annotations(SwipeableState swipeableState) {
    }
}
