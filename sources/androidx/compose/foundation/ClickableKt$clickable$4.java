package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.semantics.Role;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n25#2:580\n50#2:587\n49#2:588\n25#2:595\n83#2,3:602\n25#2:611\n25#2:622\n1114#3,6:567\n1114#3,6:574\n1114#3,6:581\n1114#3,6:589\n1114#3,6:596\n1114#3,6:605\n1114#3,6:612\n1114#3,3:623\n1117#3,3:629\n474#4,4:618\n478#4,2:626\n482#4:632\n474#5:628\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$clickable$4\n*L\n138#1:566\n139#1:573\n148#1:580\n149#1:587\n149#1:588\n152#1:595\n154#1:602,3\n172#1:611\n187#1:622\n138#1:567,6\n139#1:574,6\n148#1:581,6\n149#1:589,6\n152#1:596,6\n154#1:605,6\n172#1:612,6\n187#1:623,3\n187#1:629,3\n187#1:618,4\n187#1:626,2\n187#1:632\n187#1:628\n*E\n"})
/* compiled from: Clickable.kt */
final class ClickableKt$clickable$4 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Indication $indication;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$clickable$4(C13074a<C11921v> aVar, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, String str, Role role) {
        super(3);
        this.$onClick = aVar;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$onClickLabel = str;
        this.$role = role;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1} */
    /* JADX WARNING: type inference failed for: r3v7 */
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
            r2 = 92076020(0x57cf7f4, float:1.1894525E-35)
            r1.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)"
            r5 = r27
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x001f:
            of.a<ef.v> r2 = r0.$onClick
            r3 = 0
            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r1, r3)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r2)
            java.lang.Object r4 = r26.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r5.getEmpty()
            r7 = 2
            r8 = 0
            if (r4 != r6) goto L_0x0041
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r8, r8, r7, r8)
            r1.updateRememberedValue(r4)
        L_0x0041:
            r26.endReplaceableGroup()
            r9 = r4
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            r1.startReplaceableGroup(r2)
            java.lang.Object r4 = r26.rememberedValue()
            java.lang.Object r6 = r5.getEmpty()
            if (r4 != r6) goto L_0x005c
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r1.updateRememberedValue(r4)
        L_0x005c:
            r26.endReplaceableGroup()
            r15 = r4
            java.util.Map r15 = (java.util.Map) r15
            r4 = 1841981561(0x6dca6879, float:7.830284E27)
            r1.startReplaceableGroup(r4)
            boolean r4 = r0.$enabled
            if (r4 == 0) goto L_0x0073
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r0.$interactionSource
            r6 = 560(0x230, float:7.85E-43)
            androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect(r4, r9, r15, r1, r6)
        L_0x0073:
            r26.endReplaceableGroup()
            of.a r4 = androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer(r1, r3)
            r1.startReplaceableGroup(r2)
            java.lang.Object r6 = r26.rememberedValue()
            java.lang.Object r11 = r5.getEmpty()
            if (r6 != r11) goto L_0x0090
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            androidx.compose.runtime.MutableState r6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r6, r8, r7, r8)
            r1.updateRememberedValue(r6)
        L_0x0090:
            r26.endReplaceableGroup()
            r12 = r6
            androidx.compose.runtime.MutableState r12 = (androidx.compose.runtime.MutableState) r12
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r6)
            boolean r6 = r1.changed((java.lang.Object) r12)
            boolean r11 = r1.changed((java.lang.Object) r4)
            r6 = r6 | r11
            java.lang.Object r11 = r26.rememberedValue()
            if (r6 != 0) goto L_0x00b1
            java.lang.Object r6 = r5.getEmpty()
            if (r11 != r6) goto L_0x00b9
        L_0x00b1:
            androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1 r11 = new androidx.compose.foundation.ClickableKt$clickable$4$delayPressInteraction$1$1
            r11.<init>(r12, r4)
            r1.updateRememberedValue(r11)
        L_0x00b9:
            r26.endReplaceableGroup()
            androidx.compose.runtime.State r11 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r11, r1, r3)
            r1.startReplaceableGroup(r2)
            java.lang.Object r4 = r26.rememberedValue()
            java.lang.Object r5 = r5.getEmpty()
            if (r4 != r5) goto L_0x00de
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p002ui.geometry.Offset.Companion
            long r4 = r4.m35438getZeroF1C5BW0()
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r8, r7, r8)
            r1.updateRememberedValue(r4)
        L_0x00de:
            r26.endReplaceableGroup()
            r17 = r4
            androidx.compose.runtime.MutableState r17 = (androidx.compose.runtime.MutableState) r17
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.interaction.MutableInteractionSource r14 = r0.$interactionSource
            boolean r4 = r0.$enabled
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r4 = 6
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r17
            boolean r6 = r0.$enabled
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r16 = 1
            r5[r16] = r6
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r0.$interactionSource
            r5[r7] = r6
            r7 = 3
            r5[r7] = r9
            r7 = 4
            r5[r7] = r11
            r7 = 5
            r5[r7] = r10
            boolean r7 = r0.$enabled
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.startReplaceableGroup(r3)
            r3 = 0
            r16 = 0
        L_0x0116:
            if (r3 >= r4) goto L_0x0124
            r4 = r5[r3]
            boolean r4 = r1.changed((java.lang.Object) r4)
            r16 = r16 | r4
            int r3 = r3 + 1
            r4 = 6
            goto L_0x0116
        L_0x0124:
            java.lang.Object r3 = r26.rememberedValue()
            if (r16 != 0) goto L_0x0135
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r3 != r4) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r2 = r8
            goto L_0x014c
        L_0x0135:
            androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1 r3 = new androidx.compose.foundation.ClickableKt$clickable$4$gesture$1$1
            r16 = 0
            r4 = r3
            r5 = r17
            r18 = r6
            r6 = r7
            r7 = r18
            r2 = r8
            r8 = r9
            r9 = r11
            r11 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.updateRememberedValue(r3)
        L_0x014c:
            r26.endReplaceableGroup()
            of.o r3 = (p404of.C13088o) r3
            androidx.compose.ui.Modifier r2 = androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(r13, r14, r2, r3)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r4)
            java.lang.Object r4 = r26.rememberedValue()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r6 = r5.getEmpty()
            if (r4 != r6) goto L_0x0171
            androidx.compose.foundation.ClickableKt$clickable$4$1$1 r4 = new androidx.compose.foundation.ClickableKt$clickable$4$1$1
            r4.<init>(r12)
            r1.updateRememberedValue(r4)
        L_0x0171:
            r26.endReplaceableGroup()
            androidx.compose.ui.Modifier r4 = (androidx.compose.p002ui.Modifier) r4
            androidx.compose.ui.Modifier r11 = r3.then(r4)
            androidx.compose.foundation.interaction.MutableInteractionSource r13 = r0.$interactionSource
            androidx.compose.foundation.Indication r14 = r0.$indication
            r3 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.startReplaceableGroup(r3)
            r3 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r3)
            java.lang.Object r3 = r26.rememberedValue()
            java.lang.Object r4 = r5.getEmpty()
            if (r3 != r4) goto L_0x01a3
            hf.h r3 = p355hf.C12085h.f18916b
            yf.l0 r3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r3, r1)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r4 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r4.<init>(r3)
            r1.updateRememberedValue(r4)
            r3 = r4
        L_0x01a3:
            r26.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r3 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r3
            yf.l0 r3 = r3.getCoroutineScope()
            r26.endReplaceableGroup()
            boolean r4 = r0.$enabled
            java.lang.String r5 = r0.$onClickLabel
            androidx.compose.ui.semantics.Role r6 = r0.$role
            r21 = 0
            r22 = 0
            of.a<ef.v> r7 = r0.$onClick
            r12 = r2
            r2 = r15
            r15 = r3
            r16 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r23 = r7
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.m32986genericClickableWithoutGesturebdNGguI(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x01d5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x01d5:
            r26.endReplaceableGroup()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$clickable$4.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
