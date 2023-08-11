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

@SourceDebugExtension({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,565:1\n25#2:566\n25#2:573\n50#2:580\n49#2:581\n25#2:588\n50#2:595\n49#2:596\n25#2:603\n83#2,3:610\n25#2:619\n25#2:630\n1114#3,6:567\n1114#3,6:574\n1114#3,6:582\n1114#3,6:589\n1114#3,6:597\n1114#3,6:604\n1114#3,6:613\n1114#3,6:620\n1114#3,3:631\n1117#3,3:637\n474#4,4:626\n478#4,2:634\n482#4:640\n474#5:636\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt$combinedClickable$4\n*L\n313#1:566\n314#1:573\n318#1:580\n318#1:581\n334#1:588\n335#1:595\n335#1:596\n338#1:603\n341#1:610,3\n369#1:619\n384#1:630\n313#1:567,6\n314#1:574,6\n318#1:582,6\n334#1:589,6\n335#1:597,6\n338#1:604,6\n341#1:613,6\n369#1:620,6\n384#1:631,3\n384#1:637,3\n384#1:626,4\n384#1:634,2\n384#1:640\n384#1:636\n*E\n"})
/* compiled from: Clickable.kt */
final class ClickableKt$combinedClickable$4 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Indication $indication;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ C13074a<C11921v> $onClick;
    final /* synthetic */ String $onClickLabel;
    final /* synthetic */ C13074a<C11921v> $onDoubleClick;
    final /* synthetic */ C13074a<C11921v> $onLongClick;
    final /* synthetic */ String $onLongClickLabel;
    final /* synthetic */ Role $role;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$combinedClickable$4(C13074a<C11921v> aVar, C13074a<C11921v> aVar2, C13074a<C11921v> aVar3, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, String str, Role role, String str2) {
        super(3);
        this.$onClick = aVar;
        this.$onLongClick = aVar2;
        this.$onDoubleClick = aVar3;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$indication = indication;
        this.$onClickLabel = str;
        this.$role = role;
        this.$onLongClickLabel = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1} */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r31, androidx.compose.runtime.Composer r32, int r33) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            java.lang.String r2 = "$this$composed"
            r3 = r31
            kotlin.jvm.internal.C12775o.m28639i(r3, r2)
            r2 = 1841718000(0x6dc662f0, float:7.674705E27)
            r1.startReplaceableGroup(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)"
            r5 = r33
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r3, r4)
        L_0x001f:
            of.a<ef.v> r2 = r0.$onClick
            r3 = 0
            androidx.compose.runtime.State r14 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r1, r3)
            of.a<ef.v> r2 = r0.$onLongClick
            androidx.compose.runtime.State r10 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r1, r3)
            of.a<ef.v> r2 = r0.$onDoubleClick
            androidx.compose.runtime.State r9 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r2, r1, r3)
            of.a<ef.v> r2 = r0.$onLongClick
            if (r2 == 0) goto L_0x0038
            r8 = 1
            goto L_0x0039
        L_0x0038:
            r8 = r3
        L_0x0039:
            of.a<ef.v> r2 = r0.$onDoubleClick
            if (r2 == 0) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = r3
        L_0x0040:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r2)
            java.lang.Object r5 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r11 = r7.getEmpty()
            r12 = 2
            r13 = 0
            if (r5 != r11) goto L_0x005b
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r13, r13, r12, r13)
            r1.updateRememberedValue(r5)
        L_0x005b:
            r32.endReplaceableGroup()
            r15 = r5
            androidx.compose.runtime.MutableState r15 = (androidx.compose.runtime.MutableState) r15
            r1.startReplaceableGroup(r2)
            java.lang.Object r5 = r32.rememberedValue()
            java.lang.Object r11 = r7.getEmpty()
            if (r5 != r11) goto L_0x0076
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            r1.updateRememberedValue(r5)
        L_0x0076:
            r32.endReplaceableGroup()
            r11 = r5
            java.util.Map r11 = (java.util.Map) r11
            r5 = 1321107720(0x4ebe8108, float:1.59806362E9)
            r1.startReplaceableGroup(r5)
            boolean r5 = r0.$enabled
            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            if (r5 == 0) goto L_0x00bf
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = r0.$interactionSource
            r1.startReplaceableGroup(r4)
            boolean r16 = r1.changed((java.lang.Object) r15)
            boolean r17 = r1.changed((java.lang.Object) r12)
            r16 = r16 | r17
            java.lang.Object r4 = r32.rememberedValue()
            if (r16 != 0) goto L_0x00a8
            java.lang.Object r13 = r7.getEmpty()
            if (r4 != r13) goto L_0x00b0
        L_0x00a8:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1 r4 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$1$1
            r4.<init>(r15, r12)
            r1.updateRememberedValue(r4)
        L_0x00b0:
            r32.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.runtime.EffectsKt.DisposableEffect((java.lang.Object) r5, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) r4, (androidx.compose.runtime.Composer) r1, (int) r3)
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r0.$interactionSource
            r5 = 560(0x230, float:7.85E-43)
            androidx.compose.foundation.ClickableKt.PressedInteractionSourceDisposableEffect(r4, r15, r11, r1, r5)
        L_0x00bf:
            r32.endReplaceableGroup()
            of.a r4 = androidx.compose.foundation.Clickable_androidKt.isComposeRootInScrollableContainer(r1, r3)
            r1.startReplaceableGroup(r2)
            java.lang.Object r5 = r32.rememberedValue()
            java.lang.Object r12 = r7.getEmpty()
            if (r5 != r12) goto L_0x00de
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r12 = 2
            r13 = 0
            androidx.compose.runtime.MutableState r5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r5, r13, r12, r13)
            r1.updateRememberedValue(r5)
        L_0x00de:
            r32.endReplaceableGroup()
            r13 = r5
            androidx.compose.runtime.MutableState r13 = (androidx.compose.runtime.MutableState) r13
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r1.startReplaceableGroup(r5)
            boolean r5 = r1.changed((java.lang.Object) r13)
            boolean r12 = r1.changed((java.lang.Object) r4)
            r5 = r5 | r12
            java.lang.Object r12 = r32.rememberedValue()
            if (r5 != 0) goto L_0x00ff
            java.lang.Object r5 = r7.getEmpty()
            if (r12 != r5) goto L_0x0107
        L_0x00ff:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1 r12 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$delayPressInteraction$1$1
            r12.<init>(r13, r4)
            r1.updateRememberedValue(r12)
        L_0x0107:
            r32.endReplaceableGroup()
            androidx.compose.runtime.State r17 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r12, r1, r3)
            r1.startReplaceableGroup(r2)
            java.lang.Object r4 = r32.rememberedValue()
            java.lang.Object r5 = r7.getEmpty()
            if (r4 != r5) goto L_0x012e
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.p002ui.geometry.Offset.Companion
            long r4 = r4.m35438getZeroF1C5BW0()
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p002ui.geometry.Offset.m35411boximpl(r4)
            r5 = 2
            r7 = 0
            androidx.compose.runtime.MutableState r4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r4, r7, r5, r7)
            r1.updateRememberedValue(r4)
        L_0x012e:
            r32.endReplaceableGroup()
            r22 = r4
            androidx.compose.runtime.MutableState r22 = (androidx.compose.runtime.MutableState) r22
            androidx.compose.ui.Modifier$Companion r12 = androidx.compose.p002ui.Modifier.Companion
            r4 = 4
            java.lang.Object[] r7 = new java.lang.Object[r4]
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r0.$interactionSource
            r7[r3] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
            r16 = 1
            r7[r16] = r5
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            r18 = 2
            r7[r18] = r5
            boolean r5 = r0.$enabled
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r18 = 3
            r7[r18] = r5
            r5 = 10
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r22
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r6)
            r2[r16] = r19
            boolean r3 = r0.$enabled
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r19 = 2
            r2[r19] = r3
            r2[r18] = r9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r2[r4] = r3
            r3 = 5
            r2[r3] = r10
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.$interactionSource
            r4 = 6
            r2[r4] = r3
            r4 = 7
            r2[r4] = r15
            r4 = 8
            r2[r4] = r17
            r4 = 9
            r2[r4] = r14
            boolean r4 = r0.$enabled
            r5 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r1.startReplaceableGroup(r5)
            r18 = r4
            r4 = 10
            r5 = 0
            r16 = 0
        L_0x0198:
            if (r5 >= r4) goto L_0x01a7
            r4 = r2[r5]
            boolean r4 = r1.changed((java.lang.Object) r4)
            r16 = r16 | r4
            int r5 = r5 + 1
            r4 = 10
            goto L_0x0198
        L_0x01a7:
            java.lang.Object r2 = r32.rememberedValue()
            if (r16 != 0) goto L_0x01bd
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r4.getEmpty()
            if (r2 != r4) goto L_0x01b6
            goto L_0x01bd
        L_0x01b6:
            r0 = r7
            r21 = r11
            r3 = r12
            r29 = r13
            goto L_0x01d9
        L_0x01bd:
            androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1 r2 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$gesture$1$1
            r16 = 0
            r4 = r2
            r5 = r22
            r0 = r7
            r7 = r18
            r21 = r11
            r11 = r3
            r3 = r12
            r12 = r15
            r15 = r13
            r13 = r17
            r29 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.updateRememberedValue(r2)
        L_0x01d9:
            r32.endReplaceableGroup()
            of.o r2 = (p404of.C13088o) r2
            androidx.compose.ui.Modifier r17 = androidx.compose.p002ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput((androidx.compose.p002ui.Modifier) r3, (java.lang.Object[]) r0, (p404of.C13088o<? super androidx.compose.p002ui.input.pointer.PointerInputScope, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r2)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r2)
            java.lang.Object r2 = r32.rememberedValue()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r4 = r3.getEmpty()
            if (r2 != r4) goto L_0x0200
            androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1 r2 = new androidx.compose.foundation.ClickableKt$combinedClickable$4$2$1
            r5 = r29
            r2.<init>(r5)
            r1.updateRememberedValue(r2)
        L_0x0200:
            r32.endReplaceableGroup()
            androidx.compose.ui.Modifier r2 = (androidx.compose.p002ui.Modifier) r2
            androidx.compose.ui.Modifier r16 = r0.then(r2)
            r0 = r30
            androidx.compose.foundation.interaction.MutableInteractionSource r2 = r0.$interactionSource
            androidx.compose.foundation.Indication r4 = r0.$indication
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r1.startReplaceableGroup(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.startReplaceableGroup(r5)
            java.lang.Object r5 = r32.rememberedValue()
            java.lang.Object r3 = r3.getEmpty()
            if (r5 != r3) goto L_0x0233
            hf.h r3 = p355hf.C12085h.f18916b
            yf.l0 r3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r3, r1)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r5.<init>(r3)
            r1.updateRememberedValue(r5)
        L_0x0233:
            r32.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r5 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r5
            yf.l0 r20 = r5.getCoroutineScope()
            r32.endReplaceableGroup()
            boolean r3 = r0.$enabled
            java.lang.String r5 = r0.$onClickLabel
            androidx.compose.ui.semantics.Role r6 = r0.$role
            java.lang.String r7 = r0.$onLongClickLabel
            of.a<ef.v> r8 = r0.$onLongClick
            of.a<ef.v> r9 = r0.$onClick
            r18 = r2
            r19 = r4
            r23 = r3
            r24 = r5
            r25 = r6
            r26 = r7
            r27 = r8
            r28 = r9
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.ClickableKt.m32986genericClickableWithoutGesturebdNGguI(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L_0x0268
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0268:
            r32.endReplaceableGroup()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$combinedClickable$4.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
