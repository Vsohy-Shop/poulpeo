package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.SaversKt$LocaleSaver$2 */
/* compiled from: Savers.kt */
final class SaversKt$LocaleSaver$2 extends C12777p implements Function1<Object, Locale> {
    public static final SaversKt$LocaleSaver$2 INSTANCE = new SaversKt$LocaleSaver$2();

    SaversKt$LocaleSaver$2() {
        super(1);
    }

    public final Locale invoke(Object obj) {
        C12775o.m28639i(obj, "it");
        return new Locale((String) obj);
    }
}
