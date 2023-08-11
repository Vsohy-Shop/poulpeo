package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.Locale;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.text.SaversKt$LocaleSaver$1 */
/* compiled from: Savers.kt */
final class SaversKt$LocaleSaver$1 extends C12777p implements C13088o<SaverScope, Locale, Object> {
    public static final SaversKt$LocaleSaver$1 INSTANCE = new SaversKt$LocaleSaver$1();

    SaversKt$LocaleSaver$1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope, Locale locale) {
        C12775o.m28639i(saverScope, "$this$Saver");
        C12775o.m28639i(locale, "it");
        return locale.toLanguageTag();
    }
}
