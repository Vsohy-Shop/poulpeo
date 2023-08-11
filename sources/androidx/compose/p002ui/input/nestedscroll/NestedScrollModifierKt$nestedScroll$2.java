package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nNestedScrollModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,344:1\n474#2,4:345\n478#2,2:353\n482#2:359\n25#3:349\n25#3:360\n67#3,3:367\n66#3:370\n1114#4,3:350\n1117#4,3:356\n1114#4,6:361\n1114#4,6:371\n474#5:355\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifier.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt$nestedScroll$2\n*L\n337#1:345,4\n337#1:353,2\n337#1:359\n337#1:349\n339#1:360\n340#1:367,3\n340#1:370\n337#1:350,3\n337#1:356,3\n339#1:361,6\n340#1:371,6\n337#1:355\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2 */
/* compiled from: NestedScrollModifier.kt */
final class NestedScrollModifierKt$nestedScroll$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ NestedScrollConnection $connection;
    final /* synthetic */ NestedScrollDispatcher $dispatcher;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NestedScrollModifierKt$nestedScroll$2(NestedScrollDispatcher nestedScrollDispatcher, NestedScrollConnection nestedScrollConnection) {
        super(3);
        this.$dispatcher = nestedScrollDispatcher;
        this.$connection = nestedScrollConnection;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            r5 = 410346167(0x187562b7, float:3.1715346E-24)
            r6.startReplaceableGroup(r5)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.input.nestedscroll.nestedScroll.<anonymous> (NestedScrollModifier.kt:335)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r5, r7, r0, r1)
        L_0x0017:
            r5 = 773894976(0x2e20b340, float:3.6538994E-11)
            r6.startReplaceableGroup(r5)
            r5 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r6.startReplaceableGroup(r5)
            java.lang.Object r7 = r6.rememberedValue()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r0.getEmpty()
            if (r7 != r1) goto L_0x003e
            hf.h r7 = p355hf.C12085h.f18916b
            yf.l0 r7 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(r7, r6)
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r1 = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller
            r1.<init>(r7)
            r6.updateRememberedValue(r1)
            r7 = r1
        L_0x003e:
            r6.endReplaceableGroup()
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller r7 = (androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) r7
            yf.l0 r7 = r7.getCoroutineScope()
            r6.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = r4.$dispatcher
            r2 = 100475956(0x5fd2434, float:2.3805305E-35)
            r6.startReplaceableGroup(r2)
            if (r1 != 0) goto L_0x006f
            r6.startReplaceableGroup(r5)
            java.lang.Object r5 = r6.rememberedValue()
            java.lang.Object r1 = r0.getEmpty()
            if (r5 != r1) goto L_0x0069
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r5 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r5.<init>()
            r6.updateRememberedValue(r5)
        L_0x0069:
            r6.endReplaceableGroup()
            r1 = r5
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollDispatcher) r1
        L_0x006f:
            r6.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r4.$connection
            r2 = 1618982084(0x607fb4c4, float:7.370227E19)
            r6.startReplaceableGroup(r2)
            boolean r2 = r6.changed((java.lang.Object) r5)
            boolean r3 = r6.changed((java.lang.Object) r1)
            r2 = r2 | r3
            boolean r3 = r6.changed((java.lang.Object) r7)
            r2 = r2 | r3
            java.lang.Object r3 = r6.rememberedValue()
            if (r2 != 0) goto L_0x0094
            java.lang.Object r0 = r0.getEmpty()
            if (r3 != r0) goto L_0x009f
        L_0x0094:
            r1.setOriginNestedScrollScope$ui_release(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal
            r3.<init>(r1, r5)
            r6.updateRememberedValue(r3)
        L_0x009f:
            r6.endReplaceableGroup()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal) r3
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L_0x00ad
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00ad:
            r6.endReplaceableGroup()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierKt$nestedScroll$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
