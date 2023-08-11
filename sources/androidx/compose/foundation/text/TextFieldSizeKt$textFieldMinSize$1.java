package androidx.compose.foundation.text;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nTextFieldSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n76#2:117\n76#2:118\n76#2:119\n50#3:120\n49#3:121\n50#3:128\n49#3:129\n25#3:136\n1114#4,6:122\n1114#4,6:130\n1114#4,6:137\n76#5:143\n*S KotlinDebug\n*F\n+ 1 TextFieldSize.kt\nandroidx/compose/foundation/text/TextFieldSizeKt$textFieldMinSize$1\n*L\n40#1:117\n41#1:118\n42#1:119\n44#1:120\n44#1:121\n47#1:128\n47#1:129\n56#1:136\n44#1:122,6\n47#1:130,6\n56#1:137,6\n47#1:143\n*E\n"})
/* compiled from: TextFieldSize.kt */
final class TextFieldSizeKt$textFieldMinSize$1 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextStyle $style;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldSizeKt$textFieldMinSize$1(TextStyle textStyle) {
        super(3);
        this.$style = textStyle;
    }

    /* access modifiers changed from: private */
    public static final Object invoke$lambda$2(State<? extends Object> state) {
        return state.getValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: androidx.compose.ui.text.TextStyle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.compose.runtime.State} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: androidx.compose.foundation.text.TextFieldSize} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.Modifier invoke(androidx.compose.p002ui.Modifier r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "$this$composed"
            kotlin.jvm.internal.C12775o.m28639i(r11, r0)
            r11 = 1582736677(0x5e56a525, float:3.86670229E18)
            r12.startReplaceableGroup(r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L_0x0017
            r0 = -1
            java.lang.String r1 = "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:38)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r11, r13, r0, r1)
        L_0x0017:
            androidx.compose.runtime.ProvidableCompositionLocal r11 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalDensity()
            java.lang.Object r11 = r12.consume(r11)
            androidx.compose.ui.unit.Density r11 = (androidx.compose.p002ui.unit.Density) r11
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalFontFamilyResolver()
            java.lang.Object r13 = r12.consume(r13)
            androidx.compose.ui.text.font.FontFamily$Resolver r13 = (androidx.compose.p002ui.text.font.FontFamily.Resolver) r13
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.CompositionLocalsKt.getLocalLayoutDirection()
            java.lang.Object r0 = r12.consume(r0)
            r6 = r0
            androidx.compose.ui.unit.LayoutDirection r6 = (androidx.compose.p002ui.unit.LayoutDirection) r6
            androidx.compose.ui.text.TextStyle r0 = r10.$style
            r1 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.startReplaceableGroup(r1)
            boolean r2 = r12.changed((java.lang.Object) r0)
            boolean r3 = r12.changed((java.lang.Object) r6)
            r2 = r2 | r3
            java.lang.Object r3 = r12.rememberedValue()
            if (r2 != 0) goto L_0x0055
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r2 = r2.getEmpty()
            if (r3 != r2) goto L_0x005c
        L_0x0055:
            androidx.compose.ui.text.TextStyle r3 = androidx.compose.p002ui.text.TextStyleKt.resolveDefaults(r0, r6)
            r12.updateRememberedValue(r3)
        L_0x005c:
            r12.endReplaceableGroup()
            r7 = r3
            androidx.compose.ui.text.TextStyle r7 = (androidx.compose.p002ui.text.TextStyle) r7
            r12.startReplaceableGroup(r1)
            boolean r0 = r12.changed((java.lang.Object) r13)
            boolean r1 = r12.changed((java.lang.Object) r7)
            r0 = r0 | r1
            java.lang.Object r1 = r12.rememberedValue()
            if (r0 != 0) goto L_0x007c
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L_0x00b5
        L_0x007c:
            androidx.compose.ui.text.font.FontFamily r0 = r7.getFontFamily()
            androidx.compose.ui.text.font.FontWeight r1 = r7.getFontWeight()
            if (r1 != 0) goto L_0x008c
            androidx.compose.ui.text.font.FontWeight$Companion r1 = androidx.compose.p002ui.text.font.FontWeight.Companion
            androidx.compose.ui.text.font.FontWeight r1 = r1.getNormal()
        L_0x008c:
            androidx.compose.ui.text.font.FontStyle r2 = r7.m37997getFontStyle4Lr2A7w()
            if (r2 == 0) goto L_0x0097
            int r2 = r2.m38066unboximpl()
            goto L_0x009d
        L_0x0097:
            androidx.compose.ui.text.font.FontStyle$Companion r2 = androidx.compose.p002ui.text.font.FontStyle.Companion
            int r2 = r2.m38068getNormal_LCdwA()
        L_0x009d:
            androidx.compose.ui.text.font.FontSynthesis r3 = r7.m37998getFontSynthesisZQGJjVo()
            if (r3 == 0) goto L_0x00a8
            int r3 = r3.m38077unboximpl()
            goto L_0x00ae
        L_0x00a8:
            androidx.compose.ui.text.font.FontSynthesis$Companion r3 = androidx.compose.p002ui.text.font.FontSynthesis.Companion
            int r3 = r3.m38078getAllGVVA2EU()
        L_0x00ae:
            androidx.compose.runtime.State r1 = r13.m38037resolveDPcqOEQ(r0, r1, r2, r3)
            r12.updateRememberedValue(r1)
        L_0x00b5:
            r12.endReplaceableGroup()
            r8 = r1
            androidx.compose.runtime.State r8 = (androidx.compose.runtime.State) r8
            androidx.compose.ui.text.TextStyle r4 = r10.$style
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r12.startReplaceableGroup(r0)
            java.lang.Object r0 = r12.rememberedValue()
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r1 = r1.getEmpty()
            if (r0 != r1) goto L_0x00df
            androidx.compose.foundation.text.TextFieldSize r9 = new androidx.compose.foundation.text.TextFieldSize
            java.lang.Object r5 = invoke$lambda$2(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.updateRememberedValue(r9)
        L_0x00df:
            r12.endReplaceableGroup()
            r9 = r0
            androidx.compose.foundation.text.TextFieldSize r9 = (androidx.compose.foundation.text.TextFieldSize) r9
            java.lang.Object r5 = invoke$lambda$2(r8)
            r0 = r9
            r1 = r6
            r2 = r11
            r3 = r13
            r4 = r7
            r0.update(r1, r2, r3, r4, r5)
            androidx.compose.ui.Modifier$Companion r11 = androidx.compose.p002ui.Modifier.Companion
            androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1 r13 = new androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1$1
            r13.<init>(r9)
            androidx.compose.ui.Modifier r11 = androidx.compose.p002ui.layout.LayoutModifierKt.layout(r11, r13)
            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r13 == 0) goto L_0x0105
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x0105:
            r12.endReplaceableGroup()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldSizeKt$textFieldMinSize$1.invoke(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }
}
