package p123i7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4756h;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6922c;
import p112h7.C8024a;
import p112h7.C8025b;
import p112h7.C8026c;
import p112h7.C8027d;
import p113h8.C8030b;
import p123i7.C8201h;
import p180o4.C8974c;
import p192p6.C9063a;
import p200q4.C9240m;
import p231t4.C9713p;
import p242u4.C9885d;
import p276x5.C10406g;
import p276x5.C10410i;

/* renamed from: i7.g */
/* compiled from: FirebaseDynamicLinksImpl */
public class C8195g extends C8025b {

    /* renamed from: a */
    private final C4730b<C4719a.C4723d.C4726c> f11520a;

    /* renamed from: b */
    private final C8030b<C9063a> f11521b;

    /* renamed from: c */
    private final C6922c f11522c;

    /* renamed from: i7.g$a */
    /* compiled from: FirebaseDynamicLinksImpl */
    static class C8196a extends C8201h.C8202a {
        C8196a() {
        }

        /* renamed from: H0 */
        public void mo42101H0(Status status, @Nullable C8206j jVar) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: U1 */
        public void mo42102U1(Status status, @Nullable C8188a aVar) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i7.g$b */
    /* compiled from: FirebaseDynamicLinksImpl */
    static class C8197b extends C8196a {

        /* renamed from: a */
        private final C10406g<C8027d> f11523a;

        C8197b(C10406g<C8027d> gVar) {
            this.f11523a = gVar;
        }

        /* renamed from: H0 */
        public void mo42101H0(Status status, @Nullable C8206j jVar) {
            C9240m.m18979a(status, jVar, this.f11523a);
        }
    }

    /* renamed from: i7.g$c */
    /* compiled from: FirebaseDynamicLinksImpl */
    static final class C8198c extends C4756h<C8193e, C8027d> {

        /* renamed from: d */
        private final Bundle f11524d;

        C8198c(Bundle bundle) {
            super((C8974c[]) null, false, 13202);
            this.f11524d = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo32475b(C8193e eVar, C10406g<C8027d> gVar) {
            eVar.mo42096o0(new C8197b(gVar), this.f11524d);
        }
    }

    /* renamed from: i7.g$d */
    /* compiled from: FirebaseDynamicLinksImpl */
    static class C8199d extends C8196a {

        /* renamed from: a */
        private final C10406g<C8026c> f11525a;

        /* renamed from: b */
        private final C8030b<C9063a> f11526b;

        public C8199d(C8030b<C9063a> bVar, C10406g<C8026c> gVar) {
            this.f11526b = bVar;
            this.f11525a = gVar;
        }

        /* renamed from: U1 */
        public void mo42102U1(Status status, @Nullable C8188a aVar) {
            C8026c cVar;
            Bundle bundle;
            C9063a aVar2;
            if (aVar == null) {
                cVar = null;
            } else {
                cVar = new C8026c(aVar);
            }
            C9240m.m18979a(status, cVar, this.f11525a);
            if (aVar != null && (bundle = aVar.mo42084H().getBundle("scionData")) != null && bundle.keySet() != null && (aVar2 = this.f11526b.get()) != null) {
                for (String next : bundle.keySet()) {
                    aVar2.mo30047c("fdl", next, bundle.getBundle(next));
                }
            }
        }
    }

    /* renamed from: i7.g$e */
    /* compiled from: FirebaseDynamicLinksImpl */
    static final class C8200e extends C4756h<C8193e, C8026c> {
        @Nullable

        /* renamed from: d */
        private final String f11527d;

        /* renamed from: e */
        private final C8030b<C9063a> f11528e;

        C8200e(C8030b<C9063a> bVar, @Nullable String str) {
            super((C8974c[]) null, false, 13201);
            this.f11527d = str;
            this.f11528e = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo32475b(C8193e eVar, C10406g<C8026c> gVar) {
            eVar.mo42097p0(new C8199d(this.f11528e, gVar), this.f11527d);
        }
    }

    public C8195g(C6922c cVar, C8030b<C9063a> bVar) {
        this(new C8191d(cVar.mo39766h()), cVar, bVar);
    }

    /* renamed from: h */
    public static void m16226h(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (TextUtils.isEmpty(bundle.getString("domainUriPrefix")) && uri == null) {
            throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
        }
    }

    /* renamed from: a */
    public C8024a mo41855a() {
        return new C8024a(this);
    }

    /* renamed from: b */
    public Task<C8026c> mo41856b(@Nullable Intent intent) {
        String str;
        C8026c g;
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        Task<TResult> o = this.f11520a.mo32415o(new C8200e(this.f11521b, str));
        if (intent == null || (g = mo42100g(intent)) == null) {
            return o;
        }
        return C10410i.m21831e(g);
    }

    /* renamed from: e */
    public Task<C8027d> mo42098e(Bundle bundle) {
        m16226h(bundle);
        return this.f11520a.mo32415o(new C8198c(bundle));
    }

    /* renamed from: f */
    public C6922c mo42099f() {
        return this.f11522c;
    }

    @Nullable
    /* renamed from: g */
    public C8026c mo42100g(@NonNull Intent intent) {
        C8188a aVar = (C8188a) C9885d.m20548b(intent, "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA", C8188a.CREATOR);
        if (aVar != null) {
            return new C8026c(aVar);
        }
        return null;
    }

    public C8195g(C4730b<C4719a.C4723d.C4726c> bVar, C6922c cVar, C8030b<C9063a> bVar2) {
        this.f11520a = bVar;
        this.f11522c = (C6922c) C9713p.m20275j(cVar);
        this.f11521b = bVar2;
        if (bVar2.get() == null) {
            Log.w("FDL", "FDL logging failed. Add a dependency for Firebase Analytics to your app to enable logging of Dynamic Link events.");
        }
    }
}
