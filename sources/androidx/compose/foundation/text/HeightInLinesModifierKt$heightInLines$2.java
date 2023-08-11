package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.platform.CompositionLocalsKt;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.TextStyleKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,134:1\n76#2:135\n76#2:136\n76#2:137\n50#3:138\n49#3:139\n50#3:146\n49#3:147\n83#3,3:154\n83#3,3:163\n1114#4,6:140\n1114#4,6:148\n1114#4,6:157\n1114#4,6:166\n76#5:172\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:135\n64#1:136\n65#1:137\n69#1:138\n69#1:139\n72#1:146\n72#1:147\n81#1:154,3\n97#1:163,3\n69#1:140,6\n72#1:148,6\n81#1:157,6\n97#1:166,6\n72#1:172\n*E\n"})
/* compiled from: HeightInLinesModifier.kt */
final class HeightInLinesModifierKt$heightInLines$2 extends C12777p implements C13089p<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ TextStyle $textStyle;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HeightInLinesModifierKt$heightInLines$2(int i, int i2, TextStyle textStyle) {
        super(3);
        this.$minLines = i;
        this.$maxLines = i2;
        this.$textStyle = textStyle;
    }

    private static final Object invoke$lambda$2(State<? extends Object> state) {
        return state.getValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        Composer composer2 = composer;
        C12775o.m28639i(modifier, "$this$composed");
        composer2.startReplaceableGroup(408240218);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:58)");
        }
        HeightInLinesModifierKt.validateMinMaxLines(this.$minLines, this.$maxLines);
        if (this.$minLines == 1 && this.$maxLines == Integer.MAX_VALUE) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return companion;
        }
        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer2.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
        TextStyle textStyle = this.$textStyle;
        composer2.startReplaceableGroup(511388516);
        boolean changed = composer2.changed((Object) textStyle) | composer2.changed((Object) layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
            composer2.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextStyle textStyle2 = (TextStyle) rememberedValue;
        composer2.startReplaceableGroup(511388516);
        boolean changed2 = composer2.changed((Object) resolver) | composer2.changed((Object) textStyle2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            FontFamily fontFamily = textStyle2.getFontFamily();
            FontWeight fontWeight = textStyle2.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            FontStyle r9 = textStyle2.m37997getFontStyle4Lr2A7w();
            int r92 = r9 != null ? r9.m38066unboximpl() : FontStyle.Companion.m38068getNormal_LCdwA();
            FontSynthesis r11 = textStyle2.m37998getFontSynthesisZQGJjVo();
            rememberedValue2 = resolver.m38037resolveDPcqOEQ(fontFamily, fontWeight, r92, r11 != null ? r11.m38077unboximpl() : FontSynthesis.Companion.m38078getAllGVVA2EU());
            composer2.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        State state = (State) rememberedValue2;
        Object[] objArr = {density, resolver, this.$textStyle, layoutDirection, invoke$lambda$2(state)};
        composer2.startReplaceableGroup(-568225417);
        boolean z = false;
        for (int i2 = 0; i2 < 5; i2++) {
            z |= composer2.changed(objArr[i2]);
        }
        Object rememberedValue3 = composer.rememberedValue();
        if (z || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = Integer.valueOf(IntSize.m38627getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
            composer2.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        int intValue = ((Number) rememberedValue3).intValue();
        Object[] objArr2 = {density, resolver, this.$textStyle, layoutDirection, invoke$lambda$2(state)};
        composer2.startReplaceableGroup(-568225417);
        boolean z2 = false;
        for (int i3 = 0; i3 < 5; i3++) {
            z2 |= composer2.changed(objArr2[i3]);
        }
        Object rememberedValue4 = composer.rememberedValue();
        if (z2 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = Integer.valueOf(IntSize.m38627getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + 10 + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
            composer2.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        int intValue2 = ((Number) rememberedValue4).intValue() - intValue;
        int i4 = this.$minLines;
        Integer num = null;
        Integer valueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * intValue2) + intValue);
        int i5 = this.$maxLines;
        if (i5 != Integer.MAX_VALUE) {
            num = Integer.valueOf(intValue + (intValue2 * (i5 - 1)));
        }
        Modifier r2 = SizeKt.m33325heightInVpY3zN4(Modifier.Companion, valueOf != null ? density.m38446toDpu2uoSUM(valueOf.intValue()) : C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM(), num != null ? density.m38446toDpu2uoSUM(num.intValue()) : C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r2;
    }
}
