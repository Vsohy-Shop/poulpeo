package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.intl.LocaleList;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.text.AnnotatedStringKt$capitalize$1 */
/* compiled from: AnnotatedString.kt */
final class AnnotatedStringKt$capitalize$1 extends C12777p implements C13089p<String, Integer, Integer, String> {
    final /* synthetic */ LocaleList $localeList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnnotatedStringKt$capitalize$1(LocaleList localeList) {
        super(3);
        this.$localeList = localeList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final String invoke(String str, int i, int i2) {
        C12775o.m28639i(str, "str");
        if (i == 0) {
            String substring = str.substring(i, i2);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return StringKt.capitalize(substring, this.$localeList);
        }
        String substring2 = str.substring(i, i2);
        C12775o.m28638h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring2;
    }
}
