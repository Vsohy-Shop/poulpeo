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

@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1189:1\n76#2:1190\n76#2:1191\n25#3:1192\n25#3:1199\n25#3:1210\n83#3,3:1221\n50#3:1230\n49#3:1231\n50#3:1238\n49#3:1239\n1114#4,6:1193\n1114#4,6:1200\n1114#4,3:1211\n1117#4,3:1217\n1114#4,6:1224\n1114#4,6:1232\n1114#4,6:1240\n474#5,4:1206\n478#5,2:1214\n482#5:1220\n474#6:1216\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n315#1:1190\n320#1:1191\n331#1:1192\n332#1:1199\n349#1:1210\n374#1:1221,3\n416#1:1230\n416#1:1231\n424#1:1238\n424#1:1239\n331#1:1193,6\n332#1:1200,6\n349#1:1211,3\n349#1:1217,3\n374#1:1224,6\n416#1:1232,6\n424#1:1240,6\n349#1:1206,4\n349#1:1214,2\n349#1:1220\n349#1:1216\n*E\n"})
/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$2 extends C12777p implements C13089p<BoxWithConstraintsScope, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;
    final /* synthetic */ State<Function1<C13522b<Float>, C11921v>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ C13522b<Float> $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2(C13522b<Float> bVar, C13522b<Float> bVar2, int i, State<? extends Function1<? super C13522b<Float>, C11921v>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i2, C13074a<C11921v> aVar, List<Float> list, SliderColors sliderColors) {
        super(3);
        this.$valueRange = bVar;
        this.$value = bVar2;
        this.$$dirty = i;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$steps = i2;
        this.$onValueChangeFinished = aVar;
        this.$tickFractions = list;
        this.$colors = sliderColors;
    }

    /* access modifiers changed from: private */
    public static final float invoke$scaleToOffset(C13522b<Float> bVar, C12757e0 e0Var, C12757e0 e0Var2, float f) {
        return SliderKt.scale(bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue(), f, e0Var.f20408b, e0Var2.f20408b);
    }

    /* access modifiers changed from: private */
    public static final C13522b<Float> invoke$scaleToUserValue(C12757e0 e0Var, C12757e0 e0Var2, C13522b<Float> bVar, C13522b<Float> bVar2) {
        return SliderKt.scale(e0Var.f20408b, e0Var2.f20408b, bVar2, bVar.getStart().floatValue(), bVar.getEndInclusive().floatValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01e2, code lost:
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x01e4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r12 = r32
            r2 = r33
            java.lang.String r3 = "$this$BoxWithConstraints"
            kotlin.jvm.internal.C12775o.m28639i(r1, r3)
            r3 = r2 & 14
            r9 = 2
            if (r3 != 0) goto L_0x001d
            boolean r3 = r12.changed((java.lang.Object) r1)
            if (r3 == 0) goto L_0x001a
            r3 = 4
            goto L_0x001b
        L_0x001a:
            r3 = r9
        L_0x001b:
            r3 = r3 | r2
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            r3 = r3 & 91
            r4 = 18
            if (r3 != r4) goto L_0x0030
            boolean r3 = r32.getSkipping()
            if (r3 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r32.skipToGroupEnd()
            goto L_0x03a6
        L_0x0030:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x003f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:313)"
            r5 = 652589923(0x26e5bb63, float:1.5940858E-15)
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r2, r3, r4)
        L_0x003f:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r2 = r12.consume(r2)
            androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r10 = 1
            r11 = 0
            if (r2 != r3) goto L_0x0050
            r19 = r10
            goto L_0x0052
        L_0x0050:
            r19 = r11
        L_0x0052:
            long r1 = r31.m33222getConstraintsmsEJaDk()
            int r1 = androidx.compose.p002ui.unit.Constraints.m38412getMaxWidthimpl(r1)
            float r15 = (float) r1
            kotlin.jvm.internal.e0 r14 = new kotlin.jvm.internal.e0
            r14.<init>()
            kotlin.jvm.internal.e0 r13 = new kotlin.jvm.internal.e0
            r13.<init>()
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r1 = r12.consume(r1)
            androidx.compose.ui.unit.Density r1 = (androidx.compose.p002ui.unit.Density) r1
            float r2 = androidx.compose.material.SliderKt.getThumbRadius()
            float r2 = r1.m38449toPx0680j_4(r2)
            float r2 = r15 - r2
            r14.f20408b = r2
            float r2 = androidx.compose.material.SliderKt.getThumbRadius()
            float r1 = r1.m38449toPx0680j_4(r2)
            r13.f20408b = r1
            tf.b<java.lang.Float> r1 = r0.$value
            tf.b<java.lang.Float> r2 = r0.$valueRange
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r7)
            java.lang.Object r3 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r16.getEmpty()
            r5 = 0
            if (r3 != r4) goto L_0x00b5
            java.lang.Comparable r1 = r1.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = invoke$scaleToOffset(r2, r13, r14, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r5, r9, r5)
            r12.updateRememberedValue(r3)
        L_0x00b5:
            r32.endReplaceableGroup()
            r17 = r3
            androidx.compose.runtime.MutableState r17 = (androidx.compose.runtime.MutableState) r17
            tf.b<java.lang.Float> r1 = r0.$value
            tf.b<java.lang.Float> r2 = r0.$valueRange
            r12.startReplaceableGroup(r7)
            java.lang.Object r3 = r32.rememberedValue()
            java.lang.Object r4 = r16.getEmpty()
            if (r3 != r4) goto L_0x00e6
            java.lang.Comparable r1 = r1.getEndInclusive()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r1 = invoke$scaleToOffset(r2, r13, r14, r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.MutableState r3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r1, r5, r9, r5)
            r12.updateRememberedValue(r3)
        L_0x00e6:
            r32.endReplaceableGroup()
            r18 = r3
            androidx.compose.runtime.MutableState r18 = (androidx.compose.runtime.MutableState) r18
            androidx.compose.material.SliderKt$RangeSlider$2$2 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$2
            tf.b<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            tf.b<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.f20408b
            float r4 = r14.f20408b
            tf.b r3 = p436tf.C13536k.m30875b(r3, r4)
            tf.b<java.lang.Float> r4 = r0.$value
            java.lang.Comparable r4 = r4.getStart()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            int r4 = r0.$$dirty
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r6 = r4 | 3072(0xc00, float:4.305E-42)
            r4 = r17
            r20 = r6
            r6 = r32
            r8 = r7
            r7 = r20
            androidx.compose.material.SliderKt.CorrectValueSideEffect(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.SliderKt$RangeSlider$2$3 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$3
            tf.b<java.lang.Float> r2 = r0.$valueRange
            r1.<init>(r2, r13, r14)
            tf.b<java.lang.Float> r2 = r0.$valueRange
            float r3 = r13.f20408b
            float r4 = r14.f20408b
            tf.b r3 = p436tf.C13536k.m30875b(r3, r4)
            tf.b<java.lang.Float> r4 = r0.$value
            java.lang.Comparable r4 = r4.getEndInclusive()
            java.lang.Number r4 = (java.lang.Number) r4
            float r5 = r4.floatValue()
            int r4 = r0.$$dirty
            int r4 = r4 >> 9
            r4 = r4 & 112(0x70, float:1.57E-43)
            r7 = r4 | 3072(0xc00, float:4.305E-42)
            r4 = r18
            androidx.compose.material.SliderKt.CorrectValueSideEffect(r1, r2, r3, r4, r5, r6, r7)
            r1 = 773894976(0x2e20b340, float:3.6538994E-11)
            r12.startReplaceableGroup(r1)
            r12.startReplaceableGroup(r8)
            java.lang.Object r1 = r32.rememberedValue()
            java.lang.Object r2 = r16.getEmpty()
            if (r1 != r2) goto L_0x016a
            hf.h r1 = p355hf.C12085h.f18916b
            yf.l0 r1 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r1, r12)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r2 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r2.<init>(r1)
            r12.updateRememberedValue(r2)
            r1 = r2
        L_0x016a:
            r32.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r1 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r1
            yf.l0 r27 = r1.getCoroutineScope()
            r32.endReplaceableGroup()
            androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1 r1 = new androidx.compose.material.SliderKt$RangeSlider$2$gestureEndAction$1
            java.util.List<java.lang.Float> r2 = r0.$tickFractions
            of.a<ef.v> r3 = r0.$onValueChangeFinished
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r4 = r0.$onValueChangeState
            tf.b<java.lang.Float> r5 = r0.$valueRange
            r20 = r1
            r21 = r17
            r22 = r18
            r23 = r2
            r24 = r13
            r25 = r14
            r26 = r3
            r28 = r4
            r29 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.runtime.State r1 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r1, r12, r11)
            r2 = 7
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r11] = r17
            r3[r10] = r18
            tf.b<java.lang.Float> r4 = r0.$valueRange
            r3[r9] = r4
            float r4 = r13.f20408b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            float r4 = r14.f20408b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r5 = 4
            r3[r5] = r4
            tf.b<java.lang.Float> r4 = r0.$value
            r5 = 5
            r3[r5] = r4
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r5 = r0.$onValueChangeState
            r6 = 6
            r3[r6] = r5
            tf.b<java.lang.Float> r6 = r0.$valueRange
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.startReplaceableGroup(r7)
            r7 = r11
            r8 = r7
        L_0x01ca:
            if (r7 >= r2) goto L_0x01d6
            r9 = r3[r7]
            boolean r9 = r12.changed((java.lang.Object) r9)
            r8 = r8 | r9
            int r7 = r7 + 1
            goto L_0x01ca
        L_0x01d6:
            java.lang.Object r2 = r32.rememberedValue()
            if (r8 != 0) goto L_0x01e4
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r3 = r3.getEmpty()
            if (r2 != r3) goto L_0x01fc
        L_0x01e4:
            androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1 r2 = new androidx.compose.material.SliderKt$RangeSlider$2$onDrag$1$1
            r20 = r2
            r21 = r17
            r22 = r18
            r23 = r4
            r24 = r13
            r25 = r14
            r26 = r5
            r27 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r12.updateRememberedValue(r2)
        L_0x01fc:
            r32.endReplaceableGroup()
            androidx.compose.runtime.State r23 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r12, r11)
            androidx.compose.ui.Modifier$Companion r9 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.$endInteractionSource
            boolean r4 = r0.$enabled
            tf.b<java.lang.Float> r5 = r0.$valueRange
            r10 = r13
            r13 = r9
            r11 = r14
            r14 = r2
            r2 = r15
            r15 = r3
            r16 = r17
            r17 = r18
            r18 = r4
            r20 = r2
            r21 = r5
            r22 = r1
            androidx.compose.ui.Modifier r13 = androidx.compose.material.SliderKt.rangeSliderPressDragModifier(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            tf.b<java.lang.Float> r1 = r0.$value
            java.lang.Comparable r1 = r1.getStart()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            tf.b<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b<java.lang.Float> r3 = r0.$value
            java.lang.Comparable r3 = r3.getEndInclusive()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r1 = p436tf.C13537l.m30885l(r1, r2, r3)
            tf.b<java.lang.Float> r2 = r0.$value
            java.lang.Comparable r2 = r2.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b<java.lang.Float> r3 = r0.$value
            java.lang.Comparable r3 = r3.getStart()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            tf.b<java.lang.Float> r4 = r0.$valueRange
            java.lang.Comparable r4 = r4.getEndInclusive()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r14 = p436tf.C13537l.m30885l(r2, r3, r4)
            tf.b<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b<java.lang.Float> r3 = r0.$valueRange
            java.lang.Comparable r3 = r3.getEndInclusive()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r15 = androidx.compose.material.SliderKt.calcFraction(r2, r3, r1)
            tf.b<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b<java.lang.Float> r3 = r0.$valueRange
            java.lang.Comparable r3 = r3.getEndInclusive()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r16 = androidx.compose.material.SliderKt.calcFraction(r2, r3, r14)
            int r2 = r0.$steps
            float r2 = (float) r2
            float r2 = r2 * r16
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r8 = (int) r2
            int r2 = r0.$steps
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r15
            float r2 = r2 * r3
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            int r7 = (int) r2
            boolean r4 = r0.$enabled
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r2 = r0.$onValueChangeState
            java.lang.Float r3 = java.lang.Float.valueOf(r14)
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r5 = r0.$onValueChangeState
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r6)
            boolean r2 = r12.changed((java.lang.Object) r2)
            boolean r3 = r12.changed((java.lang.Object) r3)
            r2 = r2 | r3
            java.lang.Object r3 = r32.rememberedValue()
            if (r2 != 0) goto L_0x02ec
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x02f4
        L_0x02ec:
            androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$startThumbSemantics$1$1
            r3.<init>(r5, r14)
            r12.updateRememberedValue(r3)
        L_0x02f4:
            r32.endReplaceableGroup()
            r5 = r3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            of.a<ef.v> r3 = r0.$onValueChangeFinished
            tf.b<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getStart()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b r17 = p436tf.C13536k.m30875b(r2, r14)
            r2 = r9
            r18 = r3
            r3 = r1
            r31 = r13
            r13 = r6
            r6 = r18
            r18 = r7
            r7 = r17
            androidx.compose.ui.Modifier r17 = androidx.compose.material.SliderKt.sliderSemantics(r2, r3, r4, r5, r6, r7, r8)
            boolean r4 = r0.$enabled
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r2 = r0.$onValueChangeState
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<tf.b<java.lang.Float>, ef.v>> r5 = r0.$onValueChangeState
            r12.startReplaceableGroup(r13)
            boolean r2 = r12.changed((java.lang.Object) r2)
            boolean r3 = r12.changed((java.lang.Object) r3)
            r2 = r2 | r3
            java.lang.Object r3 = r32.rememberedValue()
            if (r2 != 0) goto L_0x0341
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x0349
        L_0x0341:
            androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1 r3 = new androidx.compose.material.SliderKt$RangeSlider$2$endThumbSemantics$1$1
            r3.<init>(r5, r1)
            r12.updateRememberedValue(r3)
        L_0x0349:
            r32.endReplaceableGroup()
            r5 = r3
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            of.a<ef.v> r6 = r0.$onValueChangeFinished
            tf.b<java.lang.Float> r2 = r0.$valueRange
            java.lang.Comparable r2 = r2.getEndInclusive()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            tf.b r7 = p436tf.C13536k.m30875b(r1, r2)
            r2 = r9
            r3 = r14
            r8 = r18
            androidx.compose.ui.Modifier r13 = androidx.compose.material.SliderKt.sliderSemantics(r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.$enabled
            java.util.List<java.lang.Float> r4 = r0.$tickFractions
            androidx.compose.material.SliderColors r5 = r0.$colors
            float r2 = r11.f20408b
            float r3 = r10.f20408b
            float r6 = r2 - r3
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r0.$startInteractionSource
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = r0.$endInteractionSource
            int r2 = r0.$$dirty
            int r3 = r2 >> 9
            r3 = r3 & 14
            r9 = 14159872(0xd81000, float:1.9842207E-38)
            r3 = r3 | r9
            r9 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 >> 9
            r2 = r2 & r9
            r14 = r3 | r2
            r18 = 0
            r2 = r15
            r3 = r16
            r9 = r31
            r10 = r17
            r11 = r13
            r12 = r32
            r13 = r14
            r14 = r18
            androidx.compose.material.SliderKt.RangeSliderImpl(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x03a6
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x03a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$RangeSlider$2.invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }
}
