package androidx.compose.p002ui.text.platform.extensions;

import android.text.style.LocaleSpan;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.intl.Locale;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(24)
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:57\n1620#2,3:58\n37#3,2:55\n37#3,2:61\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:51\n40#1:52,3\n47#1:57\n47#1:58,3\n40#1:55,2\n47#1:61,2\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.extensions.LocaleListHelperMethods */
/* compiled from: LocaleExtensions.android.kt */
public final class LocaleListHelperMethods {
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    @RequiresApi(24)
    @DoNotInline
    public final Object localeSpan(LocaleList localeList) {
        C12775o.m28639i(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(localeList, 10));
        Iterator it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale((Locale) it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleSpan(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @RequiresApi(24)
    @DoNotInline
    public final void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        C12775o.m28639i(androidTextPaint, "textPaint");
        C12775o.m28639i(localeList, "localeList");
        ArrayList arrayList = new ArrayList(C12728x.m28544v(localeList, 10));
        Iterator it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale((Locale) it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(new android.os.LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
