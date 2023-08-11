package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;
import p436tf.C13522b;

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n76#2:1190\n76#2:1191\n474#3,4:1192\n478#3,2:1200\n482#3:1206\n25#4:1196\n25#4:1207\n25#4:1214\n67#4,3:1221\n66#4:1224\n36#4:1231\n1114#5,3:1197\n1117#5,3:1203\n1114#5,6:1208\n1114#5,6:1215\n1114#5,6:1225\n1114#5,6:1232\n474#6:1202\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n176#1:1190\n181#1:1191\n192#1:1192,4\n192#1:1200,2\n192#1:1206\n192#1:1196\n193#1:1207\n194#1:1214\n196#1:1221,3\n196#1:1224\n236#1:1231\n192#1:1197,3\n192#1:1203,3\n193#1:1208,6\n194#1:1215,6\n196#1:1225,6\n236#1:1232,6\n192#1:1202\n*E\n"})
/* compiled from: Slider.kt */
final class SliderKt$Slider$3 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ State<Function1<Float, C11921v>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$3(C13522b<Float> bVar, int i, float f, MutableInteractionSource mutableInteractionSource, boolean z, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, C11921v>> state, C13074a<C11921v> aVar) {
        super(3);
        this.$valueRange = bVar;
        this.$$dirty = i;
        this.$value = f;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$tickFractions = list;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
        this.$onValueChangeFinished = aVar;
    }

    /* access modifiers changed from: private */
    public static final float invoke$scaleToOffset(C13522b<Float> bVar, C12757e0 e0Var, C12757e0 e0Var2, float f) {
        return SliderKt.scale(bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue(), f, e0Var.f20408b, e0Var2.f20408b);
    }

    /* access modifiers changed from: private */
    public static final float invoke$scaleToUserValue(C12757e0 e0Var, C12757e0 e0Var2, C13522b<Float> bVar, float f) {
        return SliderKt.scale(e0Var.f20408b, e0Var2.f20408b, f, bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: androidx.compose.material.SliderDraggableState} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: of.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r8 = r32
            r2 = r33
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            r3 = r2 & 14
            r4 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r8.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r4
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r5 = 18
            if (r3 != r5) goto L_0x0030
            boolean r3 = r32.getSkipping()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r32.skipToGroupEnd()
            goto L_0x0270
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r5 = "androidx.compose.material.Slider.<anonymous> (Slider.kt:174)"
            r6 = 2085116814(0x7c485b8e, float:4.1612653E36)
            androidx.compose.runtime.ComposerKt.traceEventStart(r6, r2, r3, r5)
        L_0x003f:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r8.consume(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r9 = 0
            if (r2 != r3) goto L_0x0050
            r2 = 1
            r19 = r2
            goto L_0x0052
        L_0x0050:
            r19 = r9
        L_0x0052:
            long r1 = r31.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r1)
            float r13 = (float) r1
            kotlin.jvm.internal.e0 r15 = new kotlin.jvm.internal.e0
            r15.<init>()
            kotlin.jvm.internal.e0 r14 = new kotlin.jvm.internal.e0
            r14.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r8.consume(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.p002ui.unit.Density) r1
            float r2 = androidx.compose.material.SliderKt.getThumbRadius()
            float r2 = r1.m38449toPx0680j_4(r2)
            float r2 = r13 - r2
            r3 = 0
            float r2 = java.lang.Math.max(r2, r3)
            r15.f20408b = r2
            float r2 = androidx.compose.material.SliderKt.getThumbRadius()
            float r1 = r1.m38449toPx0680j_4(r2)
            float r2 = r15.f20408b
            float r1 = java.lang.Math.min(r1, r2)
            r14.f20408b = r1
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r8.startReplaceableGroup(r1)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.startReplaceableGroup(r1)
            java.lang.Object r2 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r28 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r28.getEmpty()
            if (r2 != r5) goto L_0x00b7
            hf.h r2 = p355hf.C12085h.f18916b
            yf.l0 r2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r2, r8)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r5.<init>(r2)
            r8.updateRememberedValue(r5)
            r2 = r5
        L_0x00b7:
            r32.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r2
            yf.l0 r10 = r2.getCoroutineScope()
            r32.endReplaceableGroup()
            float r2 = r0.$value
            tf.b<java.lang.Float> r5 = r0.$valueRange
            r8.startReplaceableGroup(r1)
            java.lang.Object r6 = r32.rememberedValue()
            java.lang.Object r7 = r28.getEmpty()
            r12 = 0
            if (r6 != r7) goto L_0x00e4
            float r2 = invoke$scaleToOffset(r5, r14, r15, r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.runtime.MutableState r6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r12, r4, r12)
            r8.updateRememberedValue(r6)
        L_0x00e4:
            r32.endReplaceableGroup()
            r16 = r6
            androidx.compose.runtime.MutableState r16 = (androidx.compose.runtime.MutableState) r16
            r8.startReplaceableGroup(r1)
            java.lang.Object r1 = r32.rememberedValue()
            java.lang.Object r2 = r28.getEmpty()
            if (r1 != r2) goto L_0x0103
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r12, r4, r12)
            r8.updateRememberedValue(r1)
        L_0x0103:
            r32.endReplaceableGroup()
            r17 = r1
            androidx.compose.runtime.MutableState r17 = (androidx.compose.runtime.MutableState) r17
            float r1 = r14.f20408b
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            float r2 = r15.f20408b
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            tf.b<java.lang.Float> r3 = r0.$valueRange
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, ef.v>> r4 = r0.$onValueChangeState
            r5 = 1618982084(0x607fb4c4, float:7.370227E19)
            r8.startReplaceableGroup(r5)
            boolean r1 = r8.changed((java.lang.Object) r1)
            boolean r2 = r8.changed((java.lang.Object) r2)
            r1 = r1 | r2
            boolean r2 = r8.changed((java.lang.Object) r3)
            r1 = r1 | r2
            java.lang.Object r2 = r32.rememberedValue()
            if (r1 != 0) goto L_0x013a
            java.lang.Object r1 = r28.getEmpty()
            if (r2 != r1) goto L_0x0155
        L_0x013a:
            androidx.compose.material.SliderDraggableState r2 = new androidx.compose.material.SliderDraggableState
            androidx.compose.material.SliderKt$Slider$3$draggableState$1$1 r1 = new androidx.compose.material.SliderKt$Slider$3$draggableState$1$1
            r20 = r1
            r21 = r16
            r22 = r17
            r23 = r14
            r24 = r15
            r25 = r4
            r26 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r2.<init>(r1)
            r8.updateRememberedValue(r2)
        L_0x0155:
            r32.endReplaceableGroup()
            r29 = r2
            androidx.compose.material.SliderDraggableState r29 = (androidx.compose.material.SliderDraggableState) r29
            androidx.compose.material.SliderKt$Slider$3$2 r1 = new androidx.compose.material.SliderKt$Slider$3$2
            tf.b<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r14, r15)
            tf.b<java.lang.Float> r2 = r0.$valueRange
            float r3 = r14.f20408b
            float r4 = r15.f20408b
            tf.b r3 = p436tf.C13536k.m30875b(r3, r4)
            float r5 = r0.$value
            int r4 = r0.$$dirty
            int r6 = r4 >> 9
            r6 = r6 & 112(0x70, float:1.57E-43)
            r6 = r6 | 3072(0xc00, float:4.305E-42)
            int r4 = r4 << 12
            r7 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r7
            r7 = r6 | r4
            r4 = r16
            r6 = r32
            androidx.compose.material.SliderKt.CorrectValueSideEffect(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1 r1 = new androidx.compose.material.SliderKt$Slider$3$gestureEndAction$1
            java.util.List<java.lang.Float> r2 = r0.$tickFractions
            of.a<ef.v> r3 = r0.$onValueChangeFinished
            r20 = r1
            r21 = r16
            r22 = r2
            r23 = r14
            r24 = r15
            r25 = r10
            r26 = r29
            r27 = r3
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r8, r9)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.$interactionSource
            boolean r4 = r0.$enabled
            r10 = r2
            r11 = r29
            r5 = r12
            r12 = r3
            r3 = r14
            r14 = r19
            r6 = r15
            r15 = r16
            r16 = r1
            r18 = r4
            androidx.compose.ui.Modifier r4 = androidx.compose.material.SliderKt.sliderTapModifier(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.foundation.gestures.Orientation r12 = androidx.compose.foundation.gestures.Orientation.Horizontal
            boolean r15 = r29.isDragging()
            boolean r13 = r0.$enabled
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.$interactionSource
            r16 = 0
            r7 = 1157296644(0x44faf204, float:2007.563)
            r8.startReplaceableGroup(r7)
            boolean r7 = r8.changed((java.lang.Object) r1)
            java.lang.Object r9 = r32.rememberedValue()
            if (r7 != 0) goto L_0x01de
            java.lang.Object r7 = r28.getEmpty()
            if (r9 != r7) goto L_0x01e6
        L_0x01de:
            androidx.compose.material.SliderKt$Slider$3$drag$1$1 r9 = new androidx.compose.material.SliderKt$Slider$3$drag$1$1
            r9.<init>(r1, r5)
            r8.updateRememberedValue(r9)
        L_0x01e6:
            r32.endReplaceableGroup()
            r17 = r9
            of.p r17 = (p404of.C13089p) r17
            r1 = 32
            r20 = 0
            r10 = r2
            r11 = r29
            r18 = r19
            r19 = r1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.gestures.DraggableKt.draggable$default(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            float r2 = r0.$value
            tf.b<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.getStart()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            tf.b<java.lang.Float> r7 = r0.$valueRange
            java.lang.Comparable r7 = r7.getEndInclusive()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = p436tf.C13537l.m30885l(r2, r5, r7)
            tf.b<java.lang.Float> r5 = r0.$valueRange
            java.lang.Comparable r5 = r5.getStart()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            tf.b<java.lang.Float> r7 = r0.$valueRange
            java.lang.Comparable r7 = r7.getEndInclusive()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = androidx.compose.material.SliderKt.calcFraction(r5, r7, r2)
            boolean r5 = r0.$enabled
            java.util.List<java.lang.Float> r7 = r0.$tickFractions
            androidx.compose.material.SliderColors r9 = r0.$colors
            float r6 = r6.f20408b
            float r3 = r3.f20408b
            float r6 = r6 - r3
            androidx.compose.foundation.interaction.MutableInteractionSource r10 = r0.$interactionSource
            androidx.compose.ui.Modifier r11 = r4.then(r1)
            int r1 = r0.$$dirty
            int r3 = r1 >> 9
            r3 = r3 & 14
            r3 = r3 | 512(0x200, float:7.175E-43)
            int r4 = r1 >> 15
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            int r1 = r1 >> 6
            r4 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r4
            r12 = r3 | r1
            r1 = r5
            r3 = r7
            r4 = r9
            r5 = r6
            r6 = r10
            r7 = r11
            r8 = r32
            r9 = r12
            androidx.compose.material.SliderKt.SliderImpl(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0270
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0270:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$Slider$3.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
