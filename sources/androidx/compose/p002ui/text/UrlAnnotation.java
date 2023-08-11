package androidx.compose.p002ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
@ExperimentalTextApi
/* renamed from: androidx.compose.ui.text.UrlAnnotation */
/* compiled from: UrlAnnotation.kt */
public final class UrlAnnotation {
    public static final int $stable = 0;
    private final String url;

    public UrlAnnotation(String str) {
        C12775o.m28639i(str, "url");
        this.url = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UrlAnnotation) && C12775o.m28634d(this.url, ((UrlAnnotation) obj).url)) {
            return true;
        }
        return false;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.url + ')';
    }
}
