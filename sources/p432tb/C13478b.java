package p432tb;

import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.p324ui.views.listview.C11659h;
import p311bd.C10930a;
import p311bd.C10932b;
import p446vd.C13632m;

/* renamed from: tb.b */
/* compiled from: PLPListViewHelper */
public class C13478b {
    /* renamed from: a */
    public static void m30706a(C10930a aVar, ProxyBundleOutput proxyBundleOutput, C11659h hVar) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        } else if (proxyBundleOutput == null) {
            throw new IllegalArgumentException();
        } else if (hVar != null) {
            ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
            if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
                aVar.mo45950G2(C10932b.f16860b);
                if (status == ProxyBundleOutput.ProxyOutputStatus.REQUEST_FAILED) {
                    if (C13632m.m31144a(proxyBundleOutput.getHttpStatusCode())) {
                        aVar.mo45950G2(C13481d.f21651h);
                    } else {
                        aVar.mo45950G2(C13481d.f21649f);
                    }
                } else if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
                    int errorCode = proxyBundleOutput.getErrorCode();
                    if (errorCode == 222) {
                        aVar.mo45950G2(C13481d.f21650g);
                    } else if (!hVar.mo47905a(errorCode)) {
                        aVar.mo45950G2(C10932b.f16861c);
                    }
                } else if (status == ProxyBundleOutput.ProxyOutputStatus.REQUEST_ABORTED || status == ProxyBundleOutput.ProxyOutputStatus.CACHE_PROBLEM || status == ProxyBundleOutput.ProxyOutputStatus.PARSING_FAILED) {
                    aVar.mo45950G2(C10932b.f16861c);
                } else if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
                    if (!hVar.mo47906b()) {
                        aVar.mo45950G2(C10932b.f16861c);
                    } else {
                        return;
                    }
                }
                aVar.mo45970r2(0);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
