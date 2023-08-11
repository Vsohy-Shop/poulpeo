package p195q;

import androidx.webkit.ProxyConfig;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import p259w.C10070i;
import p259w.C10084t;

/* renamed from: q.b */
/* compiled from: CacheStrategy.kt */
public final class C9079b {

    /* renamed from: c */
    public static final C9080a f13216c = new C9080a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Request f13217a;

    /* renamed from: b */
    private final C9076a f13218b;

    /* renamed from: q.b$a */
    /* compiled from: CacheStrategy.kt */
    public static final class C9080a {
        private C9080a() {
        }

        public /* synthetic */ C9080a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        private final boolean m18445d(String str) {
            if (C13754v.m31530r("Content-Length", str, true) || C13754v.m31530r("Content-Encoding", str, true) || C13754v.m31530r("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        private final boolean m18446e(String str) {
            if (C13754v.m31530r("Connection", str, true) || C13754v.m31530r("Keep-Alive", str, true) || C13754v.m31530r("Proxy-Authenticate", str, true) || C13754v.m31530r("Proxy-Authorization", str, true) || C13754v.m31530r("TE", str, true) || C13754v.m31530r("Trailers", str, true) || C13754v.m31530r("Transfer-Encoding", str, true) || C13754v.m31530r("Upgrade", str, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final Headers mo43297a(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!C13754v.m31530r("Warning", name, true) || !C13754v.m31525E(value, "1", false, 2, (Object) null)) && (m18445d(name) || !m18446e(name) || headers2.get(name) == null)) {
                    builder.add(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!m18445d(name2) && m18446e(name2)) {
                    builder.add(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        /* renamed from: b */
        public final boolean mo43298b(Request request, Response response) {
            if (request.cacheControl().noStore() || response.cacheControl().noStore() || C12775o.m28634d(response.headers().get("Vary"), ProxyConfig.MATCH_ALL_SCHEMES)) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean mo43299c(Request request, C9076a aVar) {
            if (request.cacheControl().noStore() || aVar.mo43286a().noStore() || C12775o.m28634d(aVar.mo43289d().get("Vary"), ProxyConfig.MATCH_ALL_SCHEMES)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: q.b$b */
    /* compiled from: CacheStrategy.kt */
    public static final class C9081b {

        /* renamed from: a */
        private final Request f13219a;

        /* renamed from: b */
        private final C9076a f13220b;

        /* renamed from: c */
        private Date f13221c;

        /* renamed from: d */
        private String f13222d;

        /* renamed from: e */
        private Date f13223e;

        /* renamed from: f */
        private String f13224f;

        /* renamed from: g */
        private Date f13225g;

        /* renamed from: h */
        private long f13226h;

        /* renamed from: i */
        private long f13227i;

        /* renamed from: j */
        private String f13228j;

        /* renamed from: k */
        private int f13229k = -1;

        public C9081b(Request request, C9076a aVar) {
            this.f13219a = request;
            this.f13220b = aVar;
            if (aVar != null) {
                this.f13226h = aVar.mo43290e();
                this.f13227i = aVar.mo43288c();
                Headers d = aVar.mo43289d();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    String name = d.name(i);
                    if (C13754v.m31530r(name, "Date", true)) {
                        this.f13221c = d.getDate("Date");
                        this.f13222d = d.value(i);
                    } else if (C13754v.m31530r(name, "Expires", true)) {
                        this.f13225g = d.getDate("Expires");
                    } else if (C13754v.m31530r(name, "Last-Modified", true)) {
                        this.f13223e = d.getDate("Last-Modified");
                        this.f13224f = d.value(i);
                    } else if (C13754v.m31530r(name, "ETag", true)) {
                        this.f13228j = d.value(i);
                    } else if (C13754v.m31530r(name, "Age", true)) {
                        this.f13229k = C10070i.m21166z(d.value(i), -1);
                    }
                }
            }
        }

        /* renamed from: a */
        private final long m18450a() {
            Date date = this.f13221c;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f13227i - date.getTime());
            }
            int i = this.f13229k;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            return j + (this.f13227i - this.f13226h) + (C10084t.f15243a.mo44665a() - this.f13227i);
        }

        /* renamed from: c */
        private final long m18451c() {
            long j;
            long j2;
            C9076a aVar = this.f13220b;
            C12775o.m28636f(aVar);
            CacheControl a = aVar.mo43286a();
            if (a.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis((long) a.maxAgeSeconds());
            }
            Date date = this.f13225g;
            if (date != null) {
                Date date2 = this.f13221c;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.f13227i;
                }
                long time = date.getTime() - j2;
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f13223e == null || this.f13219a.url().query() != null) {
                return 0;
            } else {
                Date date3 = this.f13221c;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.f13226h;
                }
                Date date4 = this.f13223e;
                C12775o.m28636f(date4);
                long time2 = j - date4.getTime();
                if (time2 > 0) {
                    return time2 / ((long) 10);
                }
                return 0;
            }
        }

        /* renamed from: d */
        private final boolean m18452d(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final C9079b mo43300b() {
            long j;
            String str;
            if (this.f13220b == null) {
                return new C9079b(this.f13219a, (C9076a) null, (DefaultConstructorMarker) null);
            }
            if (this.f13219a.isHttps() && !this.f13220b.mo43291f()) {
                return new C9079b(this.f13219a, (C9076a) null, (DefaultConstructorMarker) null);
            }
            CacheControl a = this.f13220b.mo43286a();
            if (!C9079b.f13216c.mo43299c(this.f13219a, this.f13220b)) {
                return new C9079b(this.f13219a, (C9076a) null, (DefaultConstructorMarker) null);
            }
            CacheControl cacheControl = this.f13219a.cacheControl();
            if (cacheControl.noCache() || m18452d(this.f13219a)) {
                return new C9079b(this.f13219a, (C9076a) null, (DefaultConstructorMarker) null);
            }
            long a2 = m18450a();
            long c = m18451c();
            if (cacheControl.maxAgeSeconds() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis((long) cacheControl.maxAgeSeconds()));
            }
            long j2 = 0;
            if (cacheControl.minFreshSeconds() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) cacheControl.minFreshSeconds());
            } else {
                j = 0;
            }
            if (!a.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                j2 = TimeUnit.SECONDS.toMillis((long) cacheControl.maxStaleSeconds());
            }
            if (!a.noCache() && a2 + j < c + j2) {
                return new C9079b((Request) null, this.f13220b, (DefaultConstructorMarker) null);
            }
            String str2 = this.f13228j;
            if (str2 != null) {
                C12775o.m28636f(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f13223e != null) {
                    str2 = this.f13224f;
                    C12775o.m28636f(str2);
                } else if (this.f13221c == null) {
                    return new C9079b(this.f13219a, (C9076a) null, (DefaultConstructorMarker) null);
                } else {
                    str2 = this.f13222d;
                    C12775o.m28636f(str2);
                }
            }
            return new C9079b(this.f13219a.newBuilder().addHeader(str, str2).build(), this.f13220b, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C9079b(Request request, C9076a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, aVar);
    }

    /* renamed from: a */
    public final C9076a mo43295a() {
        return this.f13218b;
    }

    /* renamed from: b */
    public final Request mo43296b() {
        return this.f13217a;
    }

    private C9079b(Request request, C9076a aVar) {
        this.f13217a = request;
        this.f13218b = aVar;
    }
}
