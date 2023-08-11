package androidx.core.text;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.C12775o;

/* compiled from: Html.kt */
public final class HtmlKt {
    public static final Spanned parseAsHtml(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        C12775o.m28639i(str, "<this>");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        C12775o.m28638h(fromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return fromHtml;
    }

    public static /* synthetic */ Spanned parseAsHtml$default(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            imageGetter = null;
        }
        if ((i2 & 4) != 0) {
            tagHandler = null;
        }
        C12775o.m28639i(str, "<this>");
        Spanned fromHtml = HtmlCompat.fromHtml(str, i, imageGetter, tagHandler);
        C12775o.m28638h(fromHtml, "fromHtml(this, flags, imageGetter, tagHandler)");
        return fromHtml;
    }

    public static final String toHtml(Spanned spanned, int i) {
        C12775o.m28639i(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i);
        C12775o.m28638h(html, "toHtml(this, option)");
        return html;
    }

    public static /* synthetic */ String toHtml$default(Spanned spanned, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        C12775o.m28639i(spanned, "<this>");
        String html = HtmlCompat.toHtml(spanned, i);
        C12775o.m28638h(html, "toHtml(this, option)");
        return html;
    }
}
