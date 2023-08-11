package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6311u9 {

    /* renamed from: a */
    private final C6251p4 f8300a;

    public C6311u9(C6251p4 p4Var) {
        this.f8300a = p4Var;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public final void mo35379a(String str, Bundle bundle) {
        String str2;
        this.f8300a.mo34919a().mo34778h();
        if (!this.f8300a.mo35204o()) {
            if (bundle.isEmpty()) {
                str2 = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String next : bundle.keySet()) {
                    builder.appendQueryParameter(next, bundle.getString(next));
                }
                str2 = builder.build().toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f8300a.mo35184F().f8451u.mo35401b(str2);
                this.f8300a.mo35184F().f8452v.mo35385b(this.f8300a.mo34922c().mo33547a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: b */
    public final void mo35380b() {
        String str;
        this.f8300a.mo34919a().mo34778h();
        if (mo35382d()) {
            if (mo35383e()) {
                this.f8300a.mo35184F().f8451u.mo35401b((String) null);
                Bundle bundle = new Bundle();
                bundle.putString(APIParams.SOURCE, "(not set)");
                bundle.putString(Constants.MEDIUM, "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1);
                this.f8300a.mo35186I().mo35257u("auto", "_cmpx", bundle);
            } else {
                String a = this.f8300a.mo35184F().f8451u.mo35400a();
                if (TextUtils.isEmpty(a)) {
                    this.f8300a.mo34920b().mo35077t().mo35037a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((this.f8300a.mo35184F().f8452v.mo35384a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String next : parse.getQueryParameterNames()) {
                        bundle2.putString(next, parse.getQueryParameter(next));
                    }
                    ((Bundle) pair.second).putLong("_cc", a2);
                    Object obj = pair.first;
                    if (obj == null) {
                        str = "app";
                    } else {
                        str = (String) obj;
                    }
                    this.f8300a.mo35186I().mo35257u(str, "_cmp", (Bundle) pair.second);
                }
                this.f8300a.mo35184F().f8451u.mo35401b((String) null);
            }
            this.f8300a.mo35184F().f8452v.mo35385b(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35381c() {
        if (mo35382d() && mo35383e()) {
            this.f8300a.mo35184F().f8451u.mo35401b((String) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo35382d() {
        if (this.f8300a.mo35184F().f8452v.mo35384a() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo35383e() {
        if (mo35382d() && this.f8300a.mo34922c().mo33547a() - this.f8300a.mo35184F().f8452v.mo35384a() > this.f8300a.mo35211z().mo34887r((String) null, C6084a3.f7560S)) {
            return true;
        }
        return false;
    }
}
