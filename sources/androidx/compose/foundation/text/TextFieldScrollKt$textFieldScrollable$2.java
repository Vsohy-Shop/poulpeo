package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,369:1\n76#2:370\n36#3:371\n50#3:378\n49#3:379\n1114#4,6:372\n1114#4,6:380\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n68#1:370\n70#1:371\n83#1:378\n83#1:379\n70#1:372,6\n83#1:380,6\n*E\n"})
/* compiled from: TextFieldScroll.kt */
final class TextFieldScrollKt$textFieldScrollable$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf  */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            r12 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            r13 = 805428266(0x3001dc2a, float:4.72428E-10)
            r14.startReplaceableGroup(r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:65)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r13, r15, r0, r1)
        L_0x0017:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r13 = r14.consume(r13)
            androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.p002ui.unit.LayoutDirection.Rtl
            r0 = 1
            r1 = 0
            if (r13 != r15) goto L_0x0027
            r13 = r0
            goto L_0x0028
        L_0x0027:
            r13 = r1
        L_0x0028:
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r15 = r15.getOrientation()
            androidx.compose.foundation.gestures.Orientation r2 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r15 == r2) goto L_0x0037
            if (r13 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r7 = r1
            goto L_0x0038
        L_0x0037:
            r7 = r0
        L_0x0038:
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            r15 = 1157296644(0x44faf204, float:2007.563)
            r14.startReplaceableGroup(r15)
            boolean r15 = r14.changed((java.lang.Object) r13)
            java.lang.Object r2 = r14.rememberedValue()
            if (r15 != 0) goto L_0x0052
            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r15 = r15.getEmpty()
            if (r2 != r15) goto L_0x005a
        L_0x0052:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1 r2 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1
            r2.<init>(r13)
            r14.updateRememberedValue(r2)
        L_0x005a:
            r14.endReplaceableGroup()
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            androidx.compose.foundation.gestures.ScrollableState r13 = androidx.compose.foundation.gestures.ScrollableStateKt.rememberScrollableState(r2, r14, r1)
            androidx.compose.foundation.text.TextFieldScrollerPosition r15 = r12.$scrollerPosition
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r14.startReplaceableGroup(r2)
            boolean r2 = r14.changed((java.lang.Object) r13)
            boolean r3 = r14.changed((java.lang.Object) r15)
            r2 = r2 | r3
            java.lang.Object r3 = r14.rememberedValue()
            if (r2 != 0) goto L_0x0082
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x008a
        L_0x0082:
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r3 = new androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1
            r3.<init>(r13, r15)
            r14.updateRememberedValue(r3)
        L_0x008a:
            r14.endReplaceableGroup()
            r4 = r3
            androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1 r4 = (androidx.compose.foundation.text.C0646x4ee6fee2) r4
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            androidx.compose.foundation.gestures.Orientation r5 = r13.getOrientation()
            boolean r13 = r12.$enabled
            if (r13 == 0) goto L_0x00ae
            androidx.compose.foundation.text.TextFieldScrollerPosition r13 = r12.$scrollerPosition
            float r13 = r13.getMaximum()
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x00a9
            r13 = r0
            goto L_0x00aa
        L_0x00a9:
            r13 = r1
        L_0x00aa:
            if (r13 != 0) goto L_0x00ae
            r6 = r0
            goto L_0x00af
        L_0x00ae:
            r6 = r1
        L_0x00af:
            r8 = 0
            androidx.compose.foundation.interaction.MutableInteractionSource r9 = r12.$interactionSource
            r10 = 16
            r11 = 0
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.gestures.ScrollableKt.scrollable$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r15 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r15 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00c2:
            r14.endReplaceableGroup()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
