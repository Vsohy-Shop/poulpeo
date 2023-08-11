package p360id;

import android.text.Html;
import android.text.Spanned;
import kotlin.jvm.internal.C12775o;

/* renamed from: id.e */
/* compiled from: KStringExtensions.kt */
public final class C12137e {
    /* renamed from: a */
    public static final Spanned m26470a(String str) {
        C12775o.m28639i(str, "<this>");
        Spanned fromHtml = Html.fromHtml(str, 0);
        C12775o.m28638h(fromHtml, "fromHtml(this, Html.FROM_HTML_MODE_LEGACY)");
        return fromHtml;
    }
}
