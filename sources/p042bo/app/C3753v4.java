package p042bo.app;

import android.net.Uri;
import com.appboy.Constants;
import java.net.URL;
import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.v4 */
public final class C3753v4 {

    /* renamed from: a */
    private final String f2710a;

    /* renamed from: b */
    private final Uri f2711b;

    /* renamed from: c */
    private final URL f2712c;

    public C3753v4(Uri uri) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        this.f2711b = uri;
        String uri2 = uri.toString();
        C12775o.m28638h(uri2, "uri.toString()");
        this.f2710a = uri2;
        this.f2712c = new URL(uri2);
    }

    /* renamed from: a */
    public final Uri mo29750a() {
        return this.f2711b;
    }

    /* renamed from: b */
    public final URL mo29751b() {
        return this.f2712c;
    }

    public String toString() {
        return this.f2710a;
    }

    public C3753v4(String str) {
        C12775o.m28639i(str, "urlString");
        Uri parse = Uri.parse(str);
        C12775o.m28638h(parse, "parse(urlString)");
        this.f2711b = parse;
        this.f2710a = str;
        this.f2712c = new URL(str);
    }
}
