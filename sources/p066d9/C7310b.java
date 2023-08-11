package p066d9;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p339fc.C11939d;

/* renamed from: d9.b */
/* compiled from: PLPDeepLinkData */
public class C7310b extends C11939d {
    public C7310b() {
    }

    /* renamed from: i */
    public String mo40915i() {
        return mo49173a("id_merchant");
    }

    /* renamed from: j */
    public String mo40916j() {
        return mo49173a("id_offer");
    }

    @NonNull
    /* renamed from: k */
    public String mo40917k() {
        return mo49174b("page_id", "");
    }

    @NonNull
    /* renamed from: l */
    public String mo40918l() {
        return mo49174b("sponsor_code", "");
    }

    @NonNull
    /* renamed from: m */
    public String mo40919m() {
        return mo49174b("tech_name", "");
    }

    @NonNull
    /* renamed from: n */
    public C7310b mo40920n(@Nullable String str) {
        mo49175c("id_merchant", str);
        return this;
    }

    @NonNull
    /* renamed from: o */
    public C7310b mo40921o(@Nullable String str) {
        mo49175c("id_offer", str);
        return this;
    }

    @NonNull
    /* renamed from: p */
    public C7310b mo40922p(@Nullable String str) {
        mo49175c("page_id", str);
        return this;
    }

    @NonNull
    /* renamed from: q */
    public C7310b mo40923q(@Nullable String str) {
        mo49175c("sponsor_code", str);
        return this;
    }

    @NonNull
    /* renamed from: r */
    public C7310b mo40924r(@Nullable String str) {
        mo49175c("tech_name", str);
        return this;
    }

    public C7310b(@Nullable Bundle bundle) {
        super(bundle);
    }
}
