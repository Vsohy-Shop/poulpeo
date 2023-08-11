package p021a3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient;
import com.facebook.C4509a;
import com.facebook.C4538f;
import com.facebook.C4546i;
import com.facebook.C4549j;
import com.facebook.C4580s;
import com.facebook.FacebookActivity;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p021a3.C2166l;
import p198q2.C9134d;
import p198q2.C9144e0;
import p198q2.C9145f;

/* renamed from: a3.p */
/* compiled from: LoginManager */
public class C2182p {

    /* renamed from: j */
    private static final Set<String> f939j = m1688f();

    /* renamed from: k */
    private static volatile C2182p f940k;

    /* renamed from: a */
    private C2165k f941a = C2165k.NATIVE_WITH_FALLBACK;

    /* renamed from: b */
    private C2140c f942b = C2140c.FRIENDS;

    /* renamed from: c */
    private final SharedPreferences f943c;

    /* renamed from: d */
    private String f944d = "rerequest";
    @Nullable

    /* renamed from: e */
    private String f945e;

    /* renamed from: f */
    private boolean f946f;

    /* renamed from: g */
    private C2190s f947g = C2190s.FACEBOOK;

    /* renamed from: h */
    private boolean f948h = false;

    /* renamed from: i */
    private boolean f949i = false;

    /* renamed from: a3.p$a */
    /* compiled from: LoginManager */
    class C2183a implements C9134d.C9135a {

        /* renamed from: a */
        final /* synthetic */ C4549j f950a;

        C2183a(C4549j jVar) {
            this.f950a = jVar;
        }

        /* renamed from: a */
        public boolean mo23460a(int i, Intent intent) {
            return C2182p.this.mo23458n(i, intent, this.f950a);
        }
    }

    /* renamed from: a3.p$b */
    /* compiled from: LoginManager */
    static class C2184b extends HashSet<String> {
        C2184b() {
            add("ads_management");
            add("create_event");
            add("rsvp_event");
        }
    }

    /* renamed from: a3.p$c */
    /* compiled from: LoginManager */
    class C2185c implements C9134d.C9135a {
        C2185c() {
        }

        /* renamed from: a */
        public boolean mo23460a(int i, Intent intent) {
            return C2182p.this.mo23457m(i, intent);
        }
    }

    /* renamed from: a3.p$d */
    /* compiled from: LoginManager */
    private static class C2186d implements C2194v {

        /* renamed from: a */
        private final Activity f953a;

        C2186d(Activity activity) {
            C9144e0.m18691j(activity, "activity");
            this.f953a = activity;
        }

        /* renamed from: a */
        public Activity mo23461a() {
            return this.f953a;
        }

        public void startActivityForResult(Intent intent, int i) {
            this.f953a.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a3.p$e */
    /* compiled from: LoginManager */
    private static class C2187e {

        /* renamed from: a */
        private static C2180o f954a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static synchronized C2180o m1709b(Context context) {
            synchronized (C2187e.class) {
                if (context == null) {
                    context = FacebookSdk.getApplicationContext();
                }
                if (context == null) {
                    return null;
                }
                if (f954a == null) {
                    f954a = new C2180o(context, FacebookSdk.getApplicationId());
                }
                C2180o oVar = f954a;
                return oVar;
            }
        }
    }

    C2182p() {
        C9144e0.m18693l();
        this.f943c = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.loginManager", 0);
        if (FacebookSdk.hasCustomTabsPrefetching && C9145f.m18694a() != null) {
            CustomTabsClient.bindCustomTabsService(FacebookSdk.getApplicationContext(), "com.android.chrome", new C2139b());
            CustomTabsClient.connectAndInitialize(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationContext().getPackageName());
        }
    }

    /* renamed from: a */
    static C2189r m1685a(C2166l.C2170d dVar, C4509a aVar, @Nullable C4538f fVar) {
        Set<String> l = dVar.mo23409l();
        HashSet hashSet = new HashSet(aVar.mo31498l());
        if (dVar.mo23414q()) {
            hashSet.retainAll(l);
        }
        HashSet hashSet2 = new HashSet(l);
        hashSet2.removeAll(hashSet);
        return new C2189r(aVar, fVar, hashSet, hashSet2);
    }

    /* renamed from: c */
    private void m1686c(C4509a aVar, @Nullable C4538f fVar, C2166l.C2170d dVar, FacebookException facebookException, boolean z, C4549j<C2189r> jVar) {
        C2189r rVar;
        if (aVar != null) {
            C4509a.m5517s(aVar);
            C4580s.m5761b();
        }
        if (jVar != null) {
            if (aVar != null) {
                rVar = m1685a(dVar, aVar, fVar);
            } else {
                rVar = null;
            }
            if (z || (rVar != null && rVar.mo23469b().size() == 0)) {
                jVar.onCancel();
            } else if (facebookException != null) {
                jVar.mo31595t0(facebookException);
            } else if (aVar != null) {
                m1693q(true);
                jVar.mo31593a(rVar);
            }
        }
    }

    /* renamed from: e */
    public static C2182p m1687e() {
        if (f940k == null) {
            synchronized (C2182p.class) {
                if (f940k == null) {
                    f940k = new C2182p();
                }
            }
        }
        return f940k;
    }

    /* renamed from: f */
    private static Set<String> m1688f() {
        return Collections.unmodifiableSet(new C2184b());
    }

    /* renamed from: g */
    static boolean m1689g(String str) {
        if (str == null || (!str.startsWith("publish") && !str.startsWith("manage") && !f939j.contains(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m1690h(Context context, C2166l.C2172e.C2174b bVar, Map<String, String> map, Exception exc, boolean z, C2166l.C2170d dVar) {
        String str;
        C2180o a = C2187e.m1709b(context);
        if (a != null) {
            String str2 = "fb_mobile_login_complete";
            if (dVar == null) {
                a.mo23449i(str2, "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("try_login_activity", str);
            String b = dVar.mo23399b();
            if (dVar.mo23412o()) {
                str2 = "foa_mobile_login_complete";
            }
            a.mo23447f(b, hashMap, bVar, map, exc, str2);
        }
    }

    /* renamed from: l */
    private void m1691l(Context context, C2166l.C2170d dVar) {
        String str;
        C2180o a = C2187e.m1709b(context);
        if (a != null && dVar != null) {
            if (dVar.mo23412o()) {
                str = "foa_mobile_login_start";
            } else {
                str = "fb_mobile_login_start";
            }
            a.mo23448h(dVar, str);
        }
    }

    /* renamed from: p */
    private boolean m1692p(Intent intent) {
        if (FacebookSdk.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private void m1693q(boolean z) {
        SharedPreferences.Editor edit = this.f943c.edit();
        edit.putBoolean("express_login_allowed", z);
        edit.apply();
    }

    /* renamed from: r */
    private void m1694r(C2194v vVar, C2166l.C2170d dVar) {
        m1691l(vVar.mo23461a(), dVar);
        C9134d.m18590d(C9134d.C9137c.Login.mo43395a(), new C2185c());
        if (!m1695s(vVar, dVar)) {
            FacebookException facebookException = new FacebookException("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
            m1690h(vVar.mo23461a(), C2166l.C2172e.C2174b.ERROR, (Map<String, String>) null, facebookException, false, dVar);
            throw facebookException;
        }
    }

    /* renamed from: s */
    private boolean m1695s(C2194v vVar, C2166l.C2170d dVar) {
        Intent d = mo23453d(dVar);
        if (!m1692p(d)) {
            return false;
        }
        try {
            vVar.startActivityForResult(d, C2166l.m1599q());
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private void m1696t(Collection<String> collection) {
        if (collection != null) {
            for (String next : collection) {
                if (m1689g(next)) {
                    throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[]{next}));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2166l.C2170d mo23452b(C2175m mVar) {
        HashSet hashSet;
        C2165k kVar = this.f941a;
        if (mVar.mo23434b() != null) {
            hashSet = new HashSet(mVar.mo23434b());
        } else {
            hashSet = new HashSet();
        }
        C2166l.C2170d dVar = new C2166l.C2170d(kVar, Collections.unmodifiableSet(hashSet), this.f942b, this.f944d, FacebookSdk.getApplicationId(), mVar.mo23433a(), this.f947g, mVar.mo23433a());
        dVar.mo23419x(C4509a.m5516p());
        dVar.mo23416v(this.f945e);
        dVar.mo23420y(this.f946f);
        dVar.mo23415s(this.f948h);
        dVar.mo23421z(this.f949i);
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Intent mo23453d(C2166l.C2170d dVar) {
        Intent intent = new Intent();
        intent.setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
        intent.setAction(dVar.mo23405g().toString());
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", dVar);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        return intent;
    }

    /* renamed from: i */
    public void mo23454i(Activity activity, @NonNull C2175m mVar) {
        m1694r(new C2186d(activity), mo23452b(mVar));
    }

    /* renamed from: j */
    public void mo23455j(Activity activity, Collection<String> collection) {
        m1696t(collection);
        mo23454i(activity, new C2175m(collection));
    }

    /* renamed from: k */
    public void mo23456k() {
        C4509a.m5517s((C4509a) null);
        C4580s.m5762d((C4580s) null);
        m1693q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo23457m(int i, Intent intent) {
        return mo23458n(i, intent, (C4549j<C2189r>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo23458n(int i, Intent intent, C4549j<C2189r> jVar) {
        boolean z;
        Map<String, String> map;
        C2166l.C2172e.C2174b bVar;
        C2166l.C2170d dVar;
        C4538f fVar;
        C4509a aVar;
        C4538f fVar2;
        boolean z2;
        C2166l.C2170d dVar2;
        Map<String, String> map2;
        int i2 = i;
        Intent intent2 = intent;
        C2166l.C2172e.C2174b bVar2 = C2166l.C2172e.C2174b.ERROR;
        FacebookException facebookException = null;
        boolean z3 = false;
        if (intent2 != null) {
            C2166l.C2172e eVar = (C2166l.C2172e) intent2.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                C2166l.C2170d dVar3 = eVar.f916g;
                C2166l.C2172e.C2174b bVar3 = eVar.f911b;
                if (i2 != -1) {
                    if (i2 == 0) {
                        z3 = true;
                    }
                    aVar = null;
                    fVar2 = null;
                } else if (bVar3 == C2166l.C2172e.C2174b.SUCCESS) {
                    aVar = eVar.f912c;
                    fVar2 = eVar.f913d;
                } else {
                    fVar2 = null;
                    facebookException = new FacebookAuthorizationException(eVar.f914e);
                    aVar = null;
                }
                map2 = eVar.f917h;
                boolean z4 = z3;
                dVar2 = dVar3;
                bVar2 = bVar3;
                z2 = z4;
            } else {
                aVar = null;
                map2 = null;
                fVar2 = null;
                z2 = false;
                dVar2 = null;
            }
            map = map2;
            z = z2;
            fVar = fVar2;
            bVar = bVar2;
            dVar = dVar2;
        } else if (i2 == 0) {
            bVar = C2166l.C2172e.C2174b.CANCEL;
            z = true;
            aVar = null;
            fVar = null;
            dVar = null;
            map = null;
        } else {
            bVar = bVar2;
            aVar = null;
            fVar = null;
            dVar = null;
            map = null;
            z = false;
        }
        if (facebookException == null && aVar == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        FacebookException facebookException2 = facebookException;
        C2166l.C2170d dVar4 = dVar;
        m1690h((Context) null, bVar, map, facebookException2, true, dVar4);
        m1686c(aVar, fVar, dVar4, facebookException2, z, jVar);
        return true;
    }

    /* renamed from: o */
    public void mo23459o(C4546i iVar, C4549j<C2189r> jVar) {
        if (iVar instanceof C9134d) {
            ((C9134d) iVar).mo43393c(C9134d.C9137c.Login.mo43395a(), new C2183a(jVar));
            return;
        }
        throw new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
    }
}
