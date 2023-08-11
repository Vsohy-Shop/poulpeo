package p066d9;

import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import p339fc.C11937c;
import p339fc.C11940e;
import p339fc.C11942g;
import p451wc.C13691a;

/* renamed from: d9.c */
/* compiled from: PLPDeepLinkHandler */
public class C7311c extends C11937c {
    @NonNull

    /* renamed from: c */
    public static final C7311c f10128c = new C7311c();

    private C7311c() {
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public C11942g[] mo40925f() {
        return C7316g.values();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: g */
    public String mo40926g() {
        return "poulpeo://deeplink";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public String mo40927h() {
        return "www.poulpeo.com";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: i */
    public String mo40928i(@NonNull C11942g gVar, @NonNull C11940e eVar) {
        C7310b bVar = (C7310b) eVar;
        if (gVar == C7316g.MERCHANT) {
            return String.valueOf(bVar.mo40915i());
        }
        if (gVar == C7316g.OFFER) {
            return String.valueOf(bVar.mo40916j());
        }
        if (gVar == C7316g.CONTAINER || gVar == C7316g.CAMPAIGNS) {
            return bVar.mo40919m();
        }
        if (gVar == C7316g.PARTNERSHIP) {
            return bVar.mo40918l();
        }
        if (gVar == C7316g.REDIRECT) {
            return bVar.mo49169e();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k */
    public String mo40929k() {
        return "(.+\\.)?poulpeo\\.com$";
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo40930p(@NonNull C11940e eVar) {
        C13691a.m31351g(eVar.mo49173a("campaign_id"), eVar.mo49173a(Constants.MEDIUM), eVar.mo49173a(APIParams.SOURCE), eVar.mo49173a("campaign_name"), eVar.mo49173a("location"), eVar.mo49173a("location_id"));
    }
}
