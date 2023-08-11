package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt$basicMarquee$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,417:1\n76#2:418\n76#2:419\n83#3,3:420\n36#3:430\n1114#4,3:423\n1117#4,3:427\n1114#4,6:431\n88#5:426\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt$basicMarquee$2\n*L\n152#1:418\n153#1:419\n154#1:420,3\n173#1:430\n154#1:423,3\n154#1:427,3\n173#1:431,6\n166#1:426\n*E\n"})
/* compiled from: BasicMarquee.kt */
final class BasicMarqueeKt$basicMarquee$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $animationMode;
    final /* synthetic */ int $delayMillis;
    final /* synthetic */ int $initialDelayMillis;
    final /* synthetic */ int $iterations;
    final /* synthetic */ MarqueeSpacing $spacing;
    final /* synthetic */ float $velocity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicMarqueeKt$basicMarquee$2(int i, int i2, int i3, float f, MarqueeSpacing marqueeSpacing, int i4) {
        super(3);
        this.$iterations = i;
        this.$delayMillis = i2;
        this.$initialDelayMillis = i3;
        this.$velocity = f;
        this.$spacing = marqueeSpacing;
        this.$animationMode = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: androidx.compose.foundation.MarqueeModifier} */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0080, code lost:
        if (r12 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L_0x0082;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)
            r10 = -562302205(0xffffffffde7bf303, float:-4.53871446E18)
            r11.startReplaceableGroup(r10)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.basicMarquee.<anonymous> (BasicMarquee.kt:150)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r10, r12, r0, r1)
        L_0x0017:
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r10 = r11.consume(r10)
            r5 = r10
            androidx.compose.ui.unit.Density r5 = (androidx.compose.p002ui.unit.Density) r5
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r10 = r11.consume(r10)
            androidx.compose.ui.unit.LayoutDirection r10 = (androidx.compose.p002ui.unit.LayoutDirection) r10
            r12 = 6
            java.lang.Object[] r0 = new java.lang.Object[r12]
            int r1 = r9.$iterations
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r9.$delayMillis
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 1
            r0[r3] = r1
            int r1 = r9.$initialDelayMillis
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r0[r3] = r1
            float r1 = r9.$velocity
            androidx.compose.ui.unit.Dp r1 = androidx.compose.p002ui.unit.C1232Dp.m38466boximpl(r1)
            r3 = 3
            r0[r3] = r1
            r1 = 4
            r0[r1] = r5
            r1 = 5
            r0[r1] = r10
            int r1 = r9.$iterations
            int r3 = r9.$delayMillis
            int r4 = r9.$initialDelayMillis
            float r6 = r9.$velocity
            r7 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r11.startReplaceableGroup(r7)
            r7 = r2
        L_0x0068:
            if (r2 >= r12) goto L_0x0074
            r8 = r0[r2]
            boolean r8 = r11.changed((java.lang.Object) r8)
            r7 = r7 | r8
            int r2 = r2 + 1
            goto L_0x0068
        L_0x0074:
            java.lang.Object r12 = r11.rememberedValue()
            if (r7 != 0) goto L_0x0082
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r12 != r0) goto L_0x009d
        L_0x0082:
            androidx.compose.foundation.MarqueeModifier r12 = new androidx.compose.foundation.MarqueeModifier
            androidx.compose.ui.unit.LayoutDirection r0 = androidx.compose.p002ui.unit.LayoutDirection.Ltr
            if (r10 != r0) goto L_0x008b
            r10 = 1065353216(0x3f800000, float:1.0)
            goto L_0x008d
        L_0x008b:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x008d:
            float r6 = r6 * r10
            float r10 = androidx.compose.p002ui.unit.C1232Dp.m38468constructorimpl(r6)
            r6 = 0
            r0 = r12
            r2 = r3
            r3 = r4
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.updateRememberedValue(r12)
        L_0x009d:
            r11.endReplaceableGroup()
            androidx.compose.foundation.MarqueeModifier r12 = (androidx.compose.foundation.MarqueeModifier) r12
            androidx.compose.foundation.MarqueeSpacing r10 = r9.$spacing
            r12.setSpacing(r10)
            int r10 = r9.$animationMode
            r12.m33022setAnimationMode97h66l8(r10)
            r10 = 1157296644(0x44faf204, float:2007.563)
            r11.startReplaceableGroup(r10)
            boolean r10 = r11.changed((java.lang.Object) r12)
            java.lang.Object r0 = r11.rememberedValue()
            if (r10 != 0) goto L_0x00c4
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r10 = r10.getEmpty()
            if (r0 != r10) goto L_0x00cd
        L_0x00c4:
            androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1 r0 = new androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2$1$1
            r10 = 0
            r0.<init>(r12, r10)
            r11.updateRememberedValue(r0)
        L_0x00cd:
            r11.endReplaceableGroup()
            of.o r0 = (p404of.C13088o) r0
            r10 = 64
            androidx.compose.runtime.EffectsKt.LaunchedEffect((java.lang.Object) r12, (p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super p336ef.C11921v>, ? extends java.lang.Object>) r0, (androidx.compose.runtime.Composer) r11, (int) r10)
            boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r10 == 0) goto L_0x00e0
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00e0:
            r11.endReplaceableGroup()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicMarqueeKt$basicMarquee$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
