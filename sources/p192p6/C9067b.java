package p192p6;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.measurement.C6061z2;
import com.google.firebase.C6911a;
import com.google.firebase.C6922c;
import com.google.firebase.analytics.connector.internal.C6914a;
import com.google.firebase.analytics.connector.internal.C6916c;
import com.google.firebase.analytics.connector.internal.C6918e;
import com.google.firebase.analytics.connector.internal.C6920g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p191p5.C9061a;
import p192p6.C9063a;
import p193p7.C9071a;
import p193p7.C9074d;
import p231t4.C9713p;

/* renamed from: p6.b */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
public class C9067b implements C9063a {

    /* renamed from: c */
    private static volatile C9063a f13199c;

    /* renamed from: a */
    final C9061a f13200a;

    /* renamed from: b */
    final Map<String, C6914a> f13201b = new ConcurrentHashMap();

    /* renamed from: p6.b$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
    class C9068a implements C9063a.C9064a {

        /* renamed from: a */
        final /* synthetic */ String f13202a;

        C9068a(String str) {
            this.f13202a = str;
        }

        /* renamed from: a */
        public void mo30053a(Set<String> set) {
            if (C9067b.this.m18417k(this.f13202a) && this.f13202a.equals("fiam") && set != null && !set.isEmpty()) {
                C9067b.this.f13201b.get(this.f13202a).mo39761a(set);
            }
        }
    }

    C9067b(C9061a aVar) {
        C9713p.m20275j(aVar);
        this.f13200a = aVar;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    /* renamed from: h */
    public static C9063a m18414h(@NonNull C6922c cVar, @NonNull Context context, @NonNull C9074d dVar) {
        C9713p.m20275j(cVar);
        C9713p.m20275j(context);
        C9713p.m20275j(dVar);
        C9713p.m20275j(context.getApplicationContext());
        if (f13199c == null) {
            synchronized (C9067b.class) {
                if (f13199c == null) {
                    Bundle bundle = new Bundle(1);
                    if (cVar.mo39772r()) {
                        dVar.mo43283a(C6911a.class, C9070d.f13205b, C9069c.f13204a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", cVar.mo39771q());
                    }
                    f13199c = new C9067b(C6061z2.m10346v(context, (String) null, (String) null, (String) null, bundle).mo34670s());
                }
            }
        }
        return f13199c;
    }

    /* renamed from: i */
    static /* synthetic */ void m18415i(C9071a aVar) {
        boolean z = ((C6911a) aVar.mo43280a()).f9107a;
        synchronized (C9067b.class) {
            ((C9067b) C9713p.m20275j(f13199c)).f13200a.mo43278i(z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final boolean m18417k(@NonNull String str) {
        if (str.isEmpty() || !this.f13201b.containsKey(str) || this.f13201b.get(str) == null) {
            return false;
        }
        return true;
    }

    @WorkerThread
    @NonNull
    /* renamed from: a */
    public Map<String, Object> mo30045a(boolean z) {
        return this.f13200a.mo43273d((String) null, (String) null, z);
    }

    /* renamed from: b */
    public void mo30046b(@NonNull C9063a.C9066c cVar) {
        if (C6916c.m12040i(cVar)) {
            this.f13200a.mo43276g(C6916c.m12032a(cVar));
        }
    }

    /* renamed from: c */
    public void mo30047c(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C6916c.m12043l(str) && C6916c.m12041j(str2, bundle) && C6916c.m12039h(str, str2, bundle)) {
            C6916c.m12036e(str, str2, bundle);
            this.f13200a.mo43274e(str, str2, bundle);
        }
    }

    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        if (str2 == null || C6916c.m12041j(str2, bundle)) {
            this.f13200a.mo43270a(str, str2, bundle);
        }
    }

    @WorkerThread
    /* renamed from: d */
    public int mo30049d(@Size(min = 1) @NonNull String str) {
        return this.f13200a.mo43272c(str);
    }

    @WorkerThread
    @NonNull
    /* renamed from: e */
    public List<C9063a.C9066c> mo30050e(@NonNull String str, @Size(max = 23, min = 1) @NonNull String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle b : this.f13200a.mo43271b(str, str2)) {
            arrayList.add(C6916c.m12033b(b));
        }
        return arrayList;
    }

    @WorkerThread
    @NonNull
    /* renamed from: f */
    public C9063a.C9064a mo30051f(@NonNull String str, @NonNull C9063a.C9065b bVar) {
        Object obj;
        C9713p.m20275j(bVar);
        if (!C6916c.m12043l(str) || m18417k(str)) {
            return null;
        }
        C9061a aVar = this.f13200a;
        if ("fiam".equals(str)) {
            obj = new C6918e(aVar, bVar);
        } else if ("crash".equals(str) || "clx".equals(str)) {
            obj = new C6920g(aVar, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f13201b.put(str, obj);
        return new C9068a(str);
    }

    /* renamed from: g */
    public void mo30052g(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        if (C6916c.m12043l(str) && C6916c.m12044m(str, str2)) {
            this.f13200a.mo43277h(str, str2, obj);
        }
    }
}
