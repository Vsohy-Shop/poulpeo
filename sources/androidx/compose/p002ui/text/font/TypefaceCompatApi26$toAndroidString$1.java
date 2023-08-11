package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.font.TypefaceCompatApi26$toAndroidString$1 */
/* compiled from: PlatformTypefaces.kt */
final class TypefaceCompatApi26$toAndroidString$1 extends C12777p implements Function1<FontVariation.Setting, CharSequence> {
    final /* synthetic */ Density $density;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TypefaceCompatApi26$toAndroidString$1(Density density) {
        super(1);
        this.$density = density;
    }

    public final CharSequence invoke(FontVariation.Setting setting) {
        C12775o.m28639i(setting, "setting");
        return '\'' + setting.getAxisName() + "' " + setting.toVariationValue(this.$density);
    }
}
