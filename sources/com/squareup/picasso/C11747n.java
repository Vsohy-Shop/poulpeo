package com.squareup.picasso;

import android.net.NetworkInfo;
import androidx.webkit.ProxyConfig;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11768u;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C13179y0;
import p452wd.C13695b;

/* renamed from: com.squareup.picasso.n */
/* compiled from: NetworkRequestHandler */
class C11747n extends C11768u {

    /* renamed from: a */
    private final C13695b f18280a;

    /* renamed from: b */
    private final C11771w f18281b;

    /* renamed from: com.squareup.picasso.n$a */
    /* compiled from: NetworkRequestHandler */
    static class C11748a extends IOException {
        C11748a(String str) {
            super(str);
        }
    }

    /* renamed from: com.squareup.picasso.n$b */
    /* compiled from: NetworkRequestHandler */
    static final class C11749b extends IOException {

        /* renamed from: b */
        final int f18282b;

        /* renamed from: c */
        final int f18283c;

        C11749b(int i, int i2) {
            super("HTTP " + i);
            this.f18282b = i;
            this.f18283c = i2;
        }
    }

    C11747n(C13695b bVar, C11771w wVar) {
        this.f18280a = bVar;
        this.f18281b = wVar;
    }

    /* renamed from: j */
    private static Request m25217j(C11764s sVar, int i) {
        CacheControl cacheControl;
        if (i == 0) {
            cacheControl = null;
        } else if (NetworkPolicy.m25118a(i)) {
            cacheControl = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if (!NetworkPolicy.m25119b(i)) {
                builder.noCache();
            }
            if (!NetworkPolicy.m25120c(i)) {
                builder.noStore();
            }
            cacheControl = builder.build();
        }
        Request.Builder url = new Request.Builder().url(sVar.f18339d.toString());
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        return url.build();
    }

    /* renamed from: c */
    public boolean mo48661c(C11764s sVar) {
        String scheme = sVar.f18339d.getScheme();
        if (ProxyConfig.MATCH_HTTP.equals(scheme) || "https".equals(scheme)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo48732e() {
        return 2;
    }

    /* renamed from: f */
    public C11768u.C11769a mo48662f(C11764s sVar, int i) {
        C11751p.C11757e eVar;
        Response a = this.f18280a.mo48735a(m25217j(sVar, i));
        ResponseBody body = a.body();
        if (a.isSuccessful()) {
            if (a.cacheResponse() == null) {
                eVar = C11751p.C11757e.NETWORK;
            } else {
                eVar = C11751p.C11757e.DISK;
            }
            if (eVar == C11751p.C11757e.DISK && body.contentLength() == 0) {
                body.close();
                throw new C11748a("Received response with 0 content-length header.");
            }
            if (eVar == C11751p.C11757e.NETWORK && body.contentLength() > 0) {
                this.f18281b.mo48787f(body.contentLength());
            }
            return new C11768u.C11769a((C13179y0) body.source(), eVar);
        }
        body.close();
        throw new C11749b(a.code(), sVar.f18338c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo48733h(boolean z, NetworkInfo networkInfo) {
        if (networkInfo == null || networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo48734i() {
        return true;
    }
}
