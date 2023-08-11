package okhttp3;

import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: CookieJar.kt */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    /* compiled from: CookieJar.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: CookieJar.kt */
        private static final class NoCookies implements CookieJar {
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                C12775o.m28639i(httpUrl, "url");
                return C12726w.m28524k();
            }

            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                C12775o.m28639i(httpUrl, "url");
                C12775o.m28639i(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    List<Cookie> loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List<Cookie> list);
}
