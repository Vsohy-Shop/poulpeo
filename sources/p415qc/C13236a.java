package p415qc;

import android.text.TextUtils;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p446vd.C13630k;

/* renamed from: qc.a */
/* compiled from: CTBundleRequest */
public class C13236a {

    /* renamed from: a */
    private final String f21059a;

    /* renamed from: b */
    private List<C13237b> f21060b = new ArrayList();

    public C13236a(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (!str.contains("?")) {
            this.f21059a = str;
        } else {
            throw new IllegalArgumentException("Wrong url format");
        }
    }

    /* renamed from: a */
    public void mo52877a(String str, String str2) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException();
        } else if (str2 == null || str2.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.f21060b.add(new C13237b(str, str2));
        }
    }

    /* renamed from: b */
    public URL mo52878b() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (C13237b next : this.f21060b) {
            String str = next.f21061a;
            String str2 = next.f21062b;
            if (!TextUtils.isEmpty(str) && str2 != null) {
                if (!z) {
                    z = true;
                } else {
                    sb.append("&");
                }
                sb.append(str);
                sb.append("=");
                sb.append(C13630k.m31139d(str2));
            }
        }
        return new URL(this.f21059a + "?" + sb.toString());
    }
}
