package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import java.util.Map;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Swipeable.kt */
final class SwipeableKt$swipeable$3 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Map<Float, T> $anchors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ ResistanceConfig $resistance;
    final /* synthetic */ boolean $reverseDirection;
    final /* synthetic */ SwipeableState<T> $state;
    final /* synthetic */ C13088o<T, T, ThresholdConfig> $thresholds;
    final /* synthetic */ float $velocityThreshold;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableKt$swipeable$3(Map<Float, ? extends T> map, SwipeableState<T> swipeableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, ResistanceConfig resistanceConfig, C13088o<? super T, ? super T, ? extends ThresholdConfig> oVar, float f) {
        super(3);
        this.$anchors = map;
        this.$state = swipeableState;
        this.$orientation = orientation;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$reverseDirection = z2;
        this.$resistance = resistanceConfig;
        this.$thresholds = oVar;
        this.$velocityThreshold = f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: of.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r25, androidx.compose.runtime.Composer r26, int r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            java.lang.String r2 = "$this$composed"
            r3 = r25
            kotlin.jvm.internal.C12775o.m28639i(r3, r2)
            r2 = 1169892884(0x45bb2614, float:5988.76)
            r1.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.swipeable.<anonymous> (Swipeable.kt:581)"
            r5 = r27
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x001f:
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00da
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.C12686e0.m28215T(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            java.util.Map<java.lang.Float, T> r4 = r0.$anchors
            int r4 = r4.size()
            if (r2 != r4) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == 0) goto L_0x00ce
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r2 = r1.consume(r2)
            r7 = r2
            androidx.compose.ui.unit.Density r7 = (androidx.compose.p002ui.unit.Density) r7
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            java.util.Map<java.lang.Float, T> r3 = r0.$anchors
            r2.ensureInit$material3_release(r3)
            java.util.Map<java.lang.Float, T> r2 = r0.$anchors
            androidx.compose.material3.SwipeableState<T> r11 = r0.$state
            androidx.compose.material3.SwipeableKt$swipeable$3$3 r12 = new androidx.compose.material3.SwipeableKt$swipeable$3$3
            androidx.compose.material3.ResistanceConfig r6 = r0.$resistance
            of.o<T, T, androidx.compose.material3.ThresholdConfig> r8 = r0.$thresholds
            float r9 = r0.$velocityThreshold
            r10 = 0
            r3 = r12
            r4 = r11
            r5 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r3 = 520(0x208, float:7.29E-43)
            androidx.compose.runtime.EffectsKt.LaunchedEffect(r2, r11, r12, r1, r3)
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            boolean r18 = r2.isAnimationRunning()
            androidx.compose.material3.SwipeableState<T> r2 = r0.$state
            androidx.compose.foundation.gestures.DraggableState r14 = r2.getDraggableState$material3_release()
            androidx.compose.foundation.gestures.Orientation r15 = r0.$orientation
            boolean r2 = r0.$enabled
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.$interactionSource
            r19 = 0
            androidx.compose.material3.SwipeableState<T> r4 = r0.$state
            r5 = 1157296644(0x44faf204, float:2007.563)
            r1.startReplaceableGroup(r5)
            boolean r5 = r1.changed((java.lang.Object) r4)
            java.lang.Object r6 = r26.rememberedValue()
            if (r5 != 0) goto L_0x00a1
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r5.getEmpty()
            if (r6 != r5) goto L_0x00aa
        L_0x00a1:
            androidx.compose.material3.SwipeableKt$swipeable$3$4$1 r6 = new androidx.compose.material3.SwipeableKt$swipeable$3$4$1
            r5 = 0
            r6.<init>(r4, r5)
            r1.updateRememberedValue(r6)
        L_0x00aa:
            r26.endReplaceableGroup()
            r20 = r6
            of.p r20 = (p404of.C13089p) r20
            boolean r4 = r0.$reverseDirection
            r22 = 32
            r23 = 0
            r16 = r2
            r17 = r3
            r21 = r4
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x00ca
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00ca:
            r26.endReplaceableGroup()
            return r2
        L_0x00ce:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You cannot have two anchors mapped to the same state."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x00da:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "You must have at least one anchor."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwipeableKt$swipeable$3.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
