package p339fc;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p415qc.C13240e;
import p415qc.C13241f;
import p427sc.C13386c;
import p440ud.C13566l;
import p445vc.C13618g;
import p446vd.C13633n;

/* renamed from: fc.c */
/* compiled from: BaseDeepLinkHandler */
public abstract class C11937c {
    @Nullable

    /* renamed from: a */
    private C11941f f18653a;
    @Nullable

    /* renamed from: b */
    private C11939d f18654b;

    /* renamed from: fc.c$a */
    /* compiled from: BaseDeepLinkHandler */
    class C11938a extends ArrayList<String> {
        C11938a() {
            add("campaign_id");
            add(Constants.MEDIUM);
            add(APIParams.SOURCE);
            add("campaign_name");
            add("location");
            add("location_id");
            add("origin");
            add(APIParams.FINGERPRINT);
        }
    }

    @NonNull
    /* renamed from: c */
    private List<Pair<String, String>> m25772c(@NonNull URL url) {
        ArrayList arrayList = new ArrayList();
        String query = url.getQuery();
        if (query == null) {
            return arrayList;
        }
        Pattern compile = Pattern.compile("^(" + "[a-zA-Z0-9\\.\\+_-]+" + ")=(" + "[a-zA-Z0-9\\.\\+_-]+" + ")$");
        for (String matcher : query.split("&")) {
            Matcher matcher2 = compile.matcher(matcher);
            if (!matcher2.matches() || matcher2.groupCount() != 2) {
                break;
            }
            String group = matcher2.group(1);
            String group2 = matcher2.group(2);
            if (TextUtils.isEmpty(group) || TextUtils.isEmpty(group2)) {
                break;
            }
            arrayList.add(new Pair(group, group2));
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m25773d(@NonNull C11940e eVar, @NonNull String str, @NonNull String str2) {
        if (new C11938a().contains(str)) {
            eVar.mo49175c(str, str2);
        }
    }

    @Nullable
    /* renamed from: e */
    private C11942g m25774e(C11939d dVar) {
        String f = dVar.mo49170f();
        if (f == null) {
            return null;
        }
        for (C11942g gVar : mo40925f()) {
            if (f.equals(gVar.getValue())) {
                return gVar;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: j */
    private String m25775j(@NonNull C11940e eVar) {
        String b = eVar.mo49174b("origin", "");
        String b2 = eVar.mo49174b(APIParams.FINGERPRINT, "");
        if (b.isEmpty() && b2.isEmpty()) {
            return "";
        }
        return "-" + b + "-" + b2;
    }

    @Nullable
    /* renamed from: n */
    private C11939d m25776n(@NonNull URL url) {
        String path = url.getPath();
        if (path == null) {
            return null;
        }
        C11939d dVar = null;
        for (C11942g c : mo40925f()) {
            dVar = c.mo40933c(path);
            if (dVar != null) {
                break;
            }
        }
        if (dVar == null) {
            return null;
        }
        for (Pair next : m25772c(url)) {
            m25773d(dVar, (String) next.first, (String) next.second);
        }
        return dVar;
    }

    /* renamed from: o */
    private C13241f m25777o(@NonNull ContextContainer contextContainer, @NonNull C11940e eVar) {
        return new C13386c(contextContainer, eVar.mo49173a("campaign_id"), eVar.mo49173a(Constants.MEDIUM), eVar.mo49173a(APIParams.SOURCE), eVar.mo49173a("campaign_name"), eVar.mo49173a("location"), eVar.mo49173a("location_id"));
    }

    /* renamed from: q */
    private void m25778q(@NonNull C13566l lVar, @NonNull C11942g gVar, @NonNull C11939d dVar) {
        mo40930p(dVar);
        C13241f o = m25777o(lVar.mo53219b(), dVar);
        gVar.mo40934d(o, dVar);
        new C13240e(lVar.mo53219b()).mo52889g(o);
    }

    /* renamed from: r */
    private void m25779r(@NonNull C11941f fVar, @NonNull C11942g gVar, @NonNull C11939d dVar) {
        C13618g gVar2 = C13618g.f21930b;
        String str = "deeplink-" + fVar.f18664b + m25775j(dVar);
        String str2 = "redirect";
        if (!str2.equals(gVar.getValue())) {
            str2 = "open-" + gVar.getValue();
        }
        gVar2.mo53279c(str, str2, mo40928i(gVar, dVar));
        String a = dVar.mo49173a("campaign_id");
        if (!TextUtils.isEmpty(a)) {
            gVar2.mo53279c("internal-campaign", dVar.mo49173a(APIParams.SOURCE) + "-" + dVar.mo49173a(Constants.MEDIUM), a + "-" + dVar.mo49173a("campaign_name"));
        }
    }

    /* renamed from: a */
    public void mo49164a() {
        this.f18653a = null;
        this.f18654b = null;
    }

    @Nullable
    /* renamed from: b */
    public C11939d mo49165b(@Nullable String str) {
        URL url;
        String protocol;
        String host;
        if (str == null) {
            return null;
        }
        String g = mo40926g();
        if (str.startsWith(g)) {
            String substring = str.substring(g.length());
            if (!substring.startsWith("/")) {
                substring = "/" + substring;
            }
            str = "https://" + mo40927h() + substring;
        }
        try {
            url = new URL(str);
        } catch (Exception e) {
            C13633n.m31147c(this, e);
            url = null;
        }
        if (url == null || (protocol = url.getProtocol()) == null || !protocol.matches("^https?$") || (host = url.getHost()) == null || !host.matches(mo40929k())) {
            return null;
        }
        return m25776n(url);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: f */
    public abstract C11942g[] mo40925f();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: g */
    public abstract String mo40926g();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public abstract String mo40927h();

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: i */
    public abstract String mo40928i(@NonNull C11942g gVar, @NonNull C11940e eVar);

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: k */
    public abstract String mo40929k();

    /* renamed from: l */
    public boolean mo49166l(@NonNull C11941f fVar, @NonNull C13566l lVar, @Nullable C11939d dVar) {
        C11942g e;
        if (dVar == null || (e = m25774e(dVar)) == null) {
            return false;
        }
        if (!e.mo40932b(lVar, dVar)) {
            this.f18653a = fVar;
            this.f18654b = dVar;
            return false;
        }
        dVar.mo49171g(fVar);
        mo49164a();
        m25779r(fVar, e, dVar);
        m25778q(lVar, e, dVar);
        e.mo40938a(lVar, dVar);
        return true;
    }

    /* renamed from: m */
    public boolean mo49167m(@NonNull C13566l lVar) {
        C11941f fVar = this.f18653a;
        if (fVar == null) {
            return false;
        }
        return mo49166l(fVar, lVar, this.f18654b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo40930p(@NonNull C11940e eVar);
}
