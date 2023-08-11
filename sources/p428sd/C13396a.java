package p428sd;

import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import p446vd.C13632m;

/* renamed from: sd.a */
/* compiled from: ApiMessageHelper */
public class C13396a {
    /* renamed from: a */
    public static String m30473a(ProxyBundleOutput proxyBundleOutput, C13399d dVar, String str) {
        C13398c cVar;
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        Integer num = null;
        if (status == ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED) {
            if (C13632m.m31144a(proxyBundleOutput.getHttpStatusCode())) {
                cVar = C13398c.MAINTENANCE;
            } else {
                cVar = C13398c.NETWORK_PROBLEM;
            }
        } else if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
            num = Integer.valueOf(proxyBundleOutput.getErrorCode());
            cVar = C13398c.SERVER_ERROR;
        } else {
            cVar = C13398c.DEFAULT_ERROR;
        }
        return dVar.mo53009a(new C13397b(cVar, num), str);
    }
}
