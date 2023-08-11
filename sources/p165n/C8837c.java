package p165n;

import android.net.Uri;
import kotlin.jvm.internal.C12775o;
import p205r.C9345k;
import p259w.C10070i;

/* renamed from: n.c */
/* compiled from: UriKeyer.kt */
public final class C8837c implements C8836b<Uri> {
    /* renamed from: b */
    public String mo42969a(Uri uri, C9345k kVar) {
        if (!C12775o.m28634d(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        sb.append(C10070i.m21151k(kVar.mo43742g().getResources().getConfiguration()));
        return sb.toString();
    }
}
