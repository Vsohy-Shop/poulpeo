package p212r6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import java.util.Locale;
import p192p6.C9063a;
import p222s6.C9511f;
import p233t6.C9758b;

/* renamed from: r6.e */
/* compiled from: CrashlyticsAnalyticsListener */
class C9390e implements C9063a.C9065b {

    /* renamed from: a */
    private C9758b f13970a;

    /* renamed from: b */
    private C9758b f13971b;

    C9390e() {
    }

    /* renamed from: b */
    private static void m19426b(@Nullable C9758b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar != null) {
            bVar.mo44285I(str, bundle);
        }
    }

    /* renamed from: c */
    private void m19427c(@NonNull String str, @NonNull Bundle bundle) {
        C9758b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f13970a;
        } else {
            bVar = this.f13971b;
        }
        m19426b(bVar, str, bundle);
    }

    /* renamed from: a */
    public void mo29975a(int i, @Nullable Bundle bundle) {
        String string;
        C9511f.m19696f().mo43971i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i), bundle}));
        if (bundle != null && (string = bundle.getString(HintConstants.AUTOFILL_HINT_NAME)) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m19427c(string, bundle2);
        }
    }

    /* renamed from: d */
    public void mo43809d(@Nullable C9758b bVar) {
        this.f13971b = bVar;
    }

    /* renamed from: e */
    public void mo43810e(@Nullable C9758b bVar) {
        this.f13970a = bVar;
    }
}
