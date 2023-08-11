package androidx.core.p004os;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

@RequiresApi(24)
/* renamed from: androidx.core.os.LocaleListPlatformWrapper */
final class LocaleListPlatformWrapper implements LocaleListInterface {
    private final LocaleList mLocaleList;

    LocaleListPlatformWrapper(Object obj) {
        this.mLocaleList = (LocaleList) obj;
    }

    public boolean equals(Object obj) {
        return this.mLocaleList.equals(((LocaleListInterface) obj).getLocaleList());
    }

    public Locale get(int i) {
        return this.mLocaleList.get(i);
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return this.mLocaleList.getFirstMatch(strArr);
    }

    public Object getLocaleList() {
        return this.mLocaleList;
    }

    public int hashCode() {
        return this.mLocaleList.hashCode();
    }

    public int indexOf(Locale locale) {
        return this.mLocaleList.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.mLocaleList.isEmpty();
    }

    public int size() {
        return this.mLocaleList.size();
    }

    public String toLanguageTags() {
        return this.mLocaleList.toLanguageTags();
    }

    public String toString() {
        return this.mLocaleList.toString();
    }
}
