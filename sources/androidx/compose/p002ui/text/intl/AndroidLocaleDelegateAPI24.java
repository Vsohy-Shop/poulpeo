package androidx.compose.p002ui.text.intl;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.text.platform.Synchronization_jvmKt;
import androidx.compose.p002ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;

@RequiresApi(api = 24)
/* renamed from: androidx.compose.ui.text.intl.AndroidLocaleDelegateAPI24 */
/* compiled from: AndroidLocaleDelegate.android.kt */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    private LocaleList lastLocaleList;
    private LocaleList lastPlatformLocaleList;
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();

    public LocaleList getCurrent() {
        LocaleList localeList = LocaleList.getDefault();
        C12775o.m28638h(localeList, "getDefault()");
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 != null && localeList == this.lastPlatformLocaleList) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Locale locale = localeList.get(i);
                C12775o.m28638h(locale, "platformLocaleList[position]");
                arrayList.add(new Locale((PlatformLocale) new AndroidLocale(locale)));
            }
            LocaleList localeList3 = new LocaleList((List<Locale>) arrayList);
            this.lastPlatformLocaleList = localeList;
            this.lastLocaleList = localeList3;
            return localeList3;
        }
    }

    public PlatformLocale parseLanguageTag(String str) {
        C12775o.m28639i(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C12775o.m28638h(forLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(forLanguageTag);
    }
}
