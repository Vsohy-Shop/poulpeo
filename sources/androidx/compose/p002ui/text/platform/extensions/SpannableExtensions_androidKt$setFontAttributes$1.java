package androidx.compose.p002ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.android.style.TypefaceSpan;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13089p;
import p404of.C13090q;

/* renamed from: androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt$setFontAttributes$1 */
/* compiled from: SpannableExtensions.android.kt */
final class SpannableExtensions_androidKt$setFontAttributes$1 extends C12777p implements C13089p<SpanStyle, Integer, Integer, C11921v> {
    final /* synthetic */ C13090q<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> $resolveTypeface;
    final /* synthetic */ Spannable $this_setFontAttributes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SpannableExtensions_androidKt$setFontAttributes$1(Spannable spannable, C13090q<? super FontFamily, ? super FontWeight, ? super FontStyle, ? super FontSynthesis, ? extends Typeface> qVar) {
        super(3);
        this.$this_setFontAttributes = spannable;
        this.$resolveTypeface = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((SpanStyle) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(SpanStyle spanStyle, int i, int i2) {
        C12775o.m28639i(spanStyle, "spanStyle");
        Spannable spannable = this.$this_setFontAttributes;
        C13090q<FontFamily, FontWeight, FontStyle, FontSynthesis, Typeface> qVar = this.$resolveTypeface;
        FontFamily fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        FontStyle r5 = spanStyle.m37937getFontStyle4Lr2A7w();
        FontStyle r52 = FontStyle.m38060boximpl(r5 != null ? r5.m38066unboximpl() : FontStyle.Companion.m38068getNormal_LCdwA());
        FontSynthesis r7 = spanStyle.m37938getFontSynthesisZQGJjVo();
        spannable.setSpan(new TypefaceSpan(qVar.invoke(fontFamily, fontWeight, r52, FontSynthesis.m38069boximpl(r7 != null ? r7.m38077unboximpl() : FontSynthesis.Companion.m38078getAllGVVA2EU()))), i, i2, 33);
    }
}
