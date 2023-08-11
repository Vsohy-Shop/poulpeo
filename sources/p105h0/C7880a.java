package p105h0;

import android.text.Html;
import android.text.Spanned;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: h0.a */
/* compiled from: HtmlUtils.kt */
public final class C7880a {

    /* renamed from: a */
    private static final String f11013a = C8266c.f11641a.mo42215o("HtmlUtils");

    /* renamed from: h0.a$a */
    /* compiled from: HtmlUtils.kt */
    static final class C7881a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7881a f11014g = new C7881a();

        C7881a() {
            super(0);
        }

        public final String invoke() {
            return "Cannot create html spanned text on blank text. Returning blank string.";
        }
    }

    /* renamed from: a */
    public static final CharSequence m15418a(String str, C4218b bVar) {
        C12775o.m28639i(str, "<this>");
        C12775o.m28639i(bVar, "configurationProvider");
        if (C13754v.m31532t(str)) {
            C8266c.m16397f(C8266c.f11641a, f11013a, (C8266c.C8267a) null, (Throwable) null, false, C7881a.f11014g, 14, (Object) null);
            return str;
        } else if (!bVar.isPushNotificationHtmlRenderingEnabled()) {
            return str;
        } else {
            Spanned fromHtml = Html.fromHtml(str, 0);
            C12775o.m28638h(fromHtml, "{\n        if (Build.VERS…tml(this)\n        }\n    }");
            return fromHtml;
        }
    }
}
