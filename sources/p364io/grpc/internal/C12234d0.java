package p364io.grpc.internal;

import java.net.URI;
import p111h6.C8012n;
import p111h6.C8016p;
import p364io.grpc.C12175i;
import p364io.grpc.C12575p;
import p364io.grpc.C12586q;

/* renamed from: io.grpc.internal.d0 */
/* compiled from: DnsNameResolverProvider */
public final class C12234d0 extends C12586q {
    /* renamed from: a */
    public String mo49791a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo49793d() {
        return true;
    }

    /* renamed from: e */
    public int mo49794e() {
        return 5;
    }

    /* renamed from: f */
    public C12214c0 mo49792b(URI uri, C12575p.C12577b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) C8012n.m15756o(uri.getPath(), "targetPath");
        C8012n.m15752k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C12214c0(uri.getAuthority(), str.substring(1), bVar, C12404r0.f19760s, C8016p.m15771c(), C12175i.m26568a(C12234d0.class.getClassLoader()));
    }
}
