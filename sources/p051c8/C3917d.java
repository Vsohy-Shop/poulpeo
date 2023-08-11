package p051c8;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.C6922c;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p089f8.C7611a;
import p162m6.C8829b;
import p234t7.C9763a;
import p268w8.C10137b;
import p268w8.C10140c;
import p268w8.C10143d;
import p268w8.C10146e;

/* renamed from: c8.d */
/* compiled from: ApiClient */
public class C3917d {

    /* renamed from: a */
    private final C9763a<C3959l0> f3010a;

    /* renamed from: b */
    private final C6922c f3011b;

    /* renamed from: c */
    private final Application f3012c;

    /* renamed from: d */
    private final C7611a f3013d;

    /* renamed from: e */
    private final C4017v2 f3014e;

    public C3917d(C9763a<C3959l0> aVar, C6922c cVar, Application application, C7611a aVar2, C4017v2 v2Var) {
        this.f3010a = aVar;
        this.f3011b = cVar;
        this.f3012c = application;
        this.f3013d = aVar2;
        this.f3014e = v2Var;
    }

    /* renamed from: a */
    private C10140c m4456a(C3956k2 k2Var) {
        return (C10140c) C10140c.m21352M().mo44736C(this.f3011b.mo39769k().mo39785c()).mo44737z(k2Var.mo29964b()).mo44735B(k2Var.mo29965c().mo39821b()).build();
    }

    /* renamed from: b */
    private C8829b m4457b() {
        C8829b.C8830a D = C8829b.m17896N().mo42965C(String.valueOf(Build.VERSION.SDK_INT)).mo42964B(Locale.getDefault().toString()).mo42966D(TimeZone.getDefault().getID());
        String d = m4458d();
        if (!TextUtils.isEmpty(d)) {
            D.mo42967z(d);
        }
        return (C8829b) D.build();
    }

    /* renamed from: d */
    private String m4458d() {
        try {
            return this.f3012c.getPackageManager().getPackageInfo(this.f3012c.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C3961l2.m4603b("Error finding versionName : " + e.getMessage());
            return null;
        }
    }

    /* renamed from: e */
    private C10146e m4459e(C10146e eVar) {
        if (eVar.mo44742L() < this.f3013d.mo41355a() + TimeUnit.MINUTES.toMillis(1) || eVar.mo44742L() > this.f3013d.mo41355a() + TimeUnit.DAYS.toMillis(3)) {
            return (C10146e) ((C10146e.C10148b) eVar.mo40625b()).mo44744z(this.f3013d.mo41355a() + TimeUnit.DAYS.toMillis(1)).build();
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C10146e mo29963c(C3956k2 k2Var, C10137b bVar) {
        C3961l2.m4604c("Fetching campaigns from service.");
        this.f3014e.mo30037a();
        return m4459e(this.f3010a.get().mo29990a((C10143d) C10143d.m21368S().mo44739C(this.f3011b.mo39769k().mo39786d()).mo44741z(bVar.mo44733M()).mo44738B(m4457b()).mo44740D(m4456a(k2Var)).build()));
    }
}
