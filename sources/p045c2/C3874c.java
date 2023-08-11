package p045c2;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: c2.c */
/* compiled from: MetadataRule.kt */
public final class C3874c {

    /* renamed from: d */
    private static final Set<C3874c> f2949d = new CopyOnWriteArraySet();

    /* renamed from: e */
    public static final C3875a f2950e = new C3875a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final List<String> f2951a;

    /* renamed from: b */
    private final String f2952b;

    /* renamed from: c */
    private final String f2953c;

    /* renamed from: c2.c$a */
    /* compiled from: MetadataRule.kt */
    public static final class C3875a {
        private C3875a() {
        }

        public /* synthetic */ C3875a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m4345a(JSONObject jSONObject) {
            boolean z;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    C12775o.m28638h(optString, "k");
                    if (optString.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Set a = C3874c.m4341a();
                        C12775o.m28638h(next, "key");
                        List t0 = C13755w.m31594t0(optString, new String[]{","}, false, 0, 6, (Object) null);
                        C12775o.m28638h(optString2, "v");
                        a.add(new C3874c(next, t0, optString2, (DefaultConstructorMarker) null));
                    }
                }
            }
        }

        /* renamed from: b */
        public final Set<String> mo29918b() {
            HashSet hashSet = new HashSet();
            for (C3874c c : C3874c.m4341a()) {
                hashSet.add(c.mo29916c());
            }
            return hashSet;
        }

        /* renamed from: c */
        public final Set<C3874c> mo29919c() {
            return new HashSet(C3874c.m4341a());
        }

        /* renamed from: d */
        public final void mo29920d(String str) {
            C12775o.m28639i(str, "rulesFromServer");
            try {
                C3874c.m4341a().clear();
                m4345a(new JSONObject(str));
            } catch (JSONException unused) {
            }
        }
    }

    public /* synthetic */ C3874c(String str, List list, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    /* renamed from: a */
    public static final /* synthetic */ Set m4341a() {
        Class<C3874c> cls = C3874c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f2949d;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public final List<String> mo29915b() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f2951a);
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final String mo29916c() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return this.f2952b;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final String mo29917d() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            return this.f2953c;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    private C3874c(String str, List<String> list, String str2) {
        this.f2952b = str;
        this.f2953c = str2;
        this.f2951a = list;
    }
}
