package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.C4603a;
import com.google.android.gms.common.api.internal.C4756h;
import java.util.Locale;
import java.util.UUID;
import org.checkerframework.dataflow.qual.Pure;
import p109h4.C7958q;
import p119i3.C8109b;
import p119i3.C8110c;
import p119i3.C8113f;
import p120i4.C8125d;
import p120i4.C8158p;
import p139k3.C8555t;
import p150l4.C8686g0;
import p150l4.C8717z;
import p231t4.C9713p;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.i1 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C4952i1 {

    /* renamed from: a */
    private final Context f5250a;

    /* renamed from: b */
    private final C8686g0 f5251b;

    /* renamed from: c */
    private final C8158p f5252c;
    @Nullable

    /* renamed from: d */
    private final C4900f0 f5253d;

    /* renamed from: e */
    private final C4864d f5254e;

    /* renamed from: f */
    private final String f5255f = UUID.randomUUID().toString();
    @Nullable

    /* renamed from: g */
    C8113f f5256g;

    /* renamed from: h */
    private int f5257h = 1;

    private C4952i1(Context context, C8686g0 g0Var, C8158p pVar, @Nullable C4900f0 f0Var, C4864d dVar) {
        this.f5250a = context;
        this.f5251b = g0Var;
        this.f5252c = pVar;
        this.f5253d = f0Var;
        this.f5254e = dVar;
    }

    /* renamed from: a */
    public static C4952i1 m7064a(Context context, C8686g0 g0Var, C8158p pVar, @Nullable C4900f0 f0Var, C4864d dVar) {
        return new C4952i1(context, g0Var, pVar, f0Var, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo32839b(String str, SharedPreferences sharedPreferences, Bundle bundle) {
        C9713p.m20275j(this.f5252c);
        C8158p pVar = this.f5252c;
        C4900f0 f0Var = this.f5253d;
        C5042n6 n6Var = new C5042n6(sharedPreferences, this, bundle, str);
        this.f5254e.mo32716G(n6Var.mo32902c());
        pVar.mo42055a(new C5006l4(n6Var), C8125d.class);
        if (f0Var != null) {
            f0Var.mo32784g(new C5024m5(n6Var));
        }
    }

    /* renamed from: c */
    public final void mo32840c(Bundle bundle) {
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
        boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
        if (z || z2) {
            String packageName = this.f5250a.getPackageName();
            int i = 2;
            String format = String.format(Locale.ROOT, "%s.%s", new Object[]{packageName, "client_cast_analytics_data"});
            if (bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0) {
                i = 1;
            }
            this.f5257h = i;
            C8555t.m17186f(this.f5250a);
            this.f5256g = C8555t.m17184c().mo42617g(C4603a.f4399g).mo41969a("CAST_SENDER_SDK", C5095q8.class, C8109b.m15970b("proto"), C4985k0.f5273a);
            SharedPreferences sharedPreferences = this.f5250a.getApplicationContext().getSharedPreferences(format, 0);
            if (z) {
                C8686g0 g0Var = this.f5251b;
                g0Var.mo32411k(C4756h.m6576a().mo32518b(new C8717z(g0Var, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"})).mo32520d(C7958q.f11189g).mo32519c(false).mo32521e(8426).mo32517a()).mo35456g(new C4934h0(this, packageName, sharedPreferences));
            }
            if (z2) {
                C9713p.m20275j(sharedPreferences);
                C5066od.m7336a(sharedPreferences, this, packageName).mo32945e();
                C5066od.m7339d(C5009l7.CAST_CONTEXT);
            }
            C5115rb.m7432a(this, packageName);
        }
    }

    @Pure
    /* renamed from: d */
    public final void mo32841d(C5095q8 q8Var, int i) {
        C5061o8 A = C5095q8.m7373A(q8Var);
        A.mo32924w(this.f5255f);
        A.mo32920s(this.f5255f);
        C5095q8 q8Var2 = (C5095q8) A.mo32643e();
        int i2 = this.f5257h;
        int i3 = i2 - 1;
        C8110c cVar = null;
        if (i2 != 0) {
            if (i3 == 0) {
                cVar = C8110c.m15974f(i - 1, q8Var2);
            } else if (i3 == 1) {
                cVar = C8110c.m15972d(i - 1, q8Var2);
            }
            C9713p.m20275j(cVar);
            C8113f fVar = this.f5256g;
            if (fVar != null) {
                fVar.mo41967a(cVar);
                return;
            }
            return;
        }
        throw null;
    }
}
