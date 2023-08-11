package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import p201q5.C9258e;
import p201q5.C9267n;
import p201q5.C9268o;
import p201q5.C9269p;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.g3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6151g3 {

    /* renamed from: b */
    protected static final AtomicReference<String[]> f7788b = new AtomicReference<>();

    /* renamed from: c */
    protected static final AtomicReference<String[]> f7789c = new AtomicReference<>();

    /* renamed from: d */
    protected static final AtomicReference<String[]> f7790d = new AtomicReference<>();

    /* renamed from: a */
    private final C9258e f7791a;

    public C6151g3(C9258e eVar) {
        this.f7791a = eVar;
    }

    /* renamed from: g */
    private static final String m10615g(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        C9713p.m20275j(strArr);
        C9713p.m20275j(strArr2);
        C9713p.m20275j(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        for (int i = 0; i < strArr.length; i++) {
            if (C6234n9.m10925Z(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo34896a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = mo34897b(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo34897b(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!this.f7791a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo34900e(next));
            sb.append("=");
            Object obj = bundle.get(next);
            if (obj instanceof Bundle) {
                str = mo34896a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = mo34896a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = mo34896a(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo34898c(C6290t tVar) {
        String str;
        if (!this.f7791a.zza()) {
            return tVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(tVar.f8231d);
        sb.append(",name=");
        sb.append(mo34899d(tVar.f8229b));
        sb.append(",params=");
        C6268r rVar = tVar.f8230c;
        if (rVar == null) {
            str = null;
        } else if (!this.f7791a.zza()) {
            str = rVar.toString();
        } else {
            str = mo34897b(rVar.mo35270G());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo34899d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f7791a.zza()) {
            return str;
        }
        return m10615g(str, C9267n.f13609c, C9267n.f13607a, f7788b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo34900e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f7791a.zza()) {
            return str;
        }
        return m10615g(str, C9268o.f13612b, C9268o.f13611a, f7789c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo34901f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f7791a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m10615g(str, C9269p.f13616b, C9269p.f13615a, f7790d);
        }
        return "experiment_id(" + str + ")";
    }
}
