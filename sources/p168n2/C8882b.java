package p168n2;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: n2.b */
/* compiled from: AppLink.kt */
public final class C8882b {

    /* renamed from: a */
    private final List<C8883a> f12863a;

    /* renamed from: b */
    private final Uri f12864b;

    /* renamed from: c */
    private final Uri f12865c;

    /* renamed from: n2.b$a */
    /* compiled from: AppLink.kt */
    public static final class C8883a {

        /* renamed from: a */
        private final String f12866a;

        /* renamed from: b */
        private final String f12867b;

        /* renamed from: c */
        private final Uri f12868c;

        /* renamed from: d */
        private final String f12869d;

        public C8883a(String str, String str2, Uri uri, String str3) {
            C12775o.m28639i(str, "packageName");
            C12775o.m28639i(str2, "className");
            C12775o.m28639i(uri, "url");
            C12775o.m28639i(str3, "appName");
            this.f12866a = str;
            this.f12867b = str2;
            this.f12868c = uri;
            this.f12869d = str3;
        }
    }

    public C8882b(Uri uri, List<C8883a> list, Uri uri2) {
        C12775o.m28639i(uri, "sourceUrl");
        C12775o.m28639i(uri2, "webUrl");
        this.f12864b = uri;
        this.f12865c = uri2;
        this.f12863a = list == null ? C12726w.m28524k() : list;
    }
}
