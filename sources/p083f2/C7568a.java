package p083f2;

import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONObject;
import p033b2.C2834c;
import p198q2.C9138d0;
import p198q2.C9177p;
import p198q2.C9181q;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: f2.a */
/* compiled from: EventDeactivationManager.kt */
public final class C7568a {

    /* renamed from: a */
    private static boolean f10519a;

    /* renamed from: b */
    private static final List<C7569a> f10520b = new ArrayList();

    /* renamed from: c */
    private static final Set<String> f10521c = new HashSet();

    /* renamed from: d */
    public static final C7568a f10522d = new C7568a();

    /* renamed from: f2.a$a */
    /* compiled from: EventDeactivationManager.kt */
    public static final class C7569a {

        /* renamed from: a */
        private String f10523a;

        /* renamed from: b */
        private List<String> f10524b;

        public C7569a(String str, List<String> list) {
            C12775o.m28639i(str, "eventName");
            C12775o.m28639i(list, "deprecateParams");
            this.f10523a = str;
            this.f10524b = list;
        }

        /* renamed from: a */
        public final List<String> mo41317a() {
            return this.f10524b;
        }

        /* renamed from: b */
        public final String mo41318b() {
            return this.f10523a;
        }

        /* renamed from: c */
        public final void mo41319c(List<String> list) {
            C12775o.m28639i(list, "<set-?>");
            this.f10524b = list;
        }
    }

    private C7568a() {
    }

    /* renamed from: a */
    public static final void m14890a() {
        Class<C7568a> cls = C7568a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f10519a = true;
                f10522d.m14891b();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private final synchronized void m14891b() {
        if (!C9925a.m20734d(this)) {
            try {
                boolean z = false;
                C9177p o = C9181q.m18810o(FacebookSdk.getApplicationId(), false);
                if (o != null) {
                    String g = o.mo43459g();
                    if (g != null) {
                        if (g.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            JSONObject jSONObject = new JSONObject(g);
                            f10520b.clear();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                                if (jSONObject2 != null) {
                                    if (jSONObject2.optBoolean("is_deprecated_event")) {
                                        Set<String> set = f10521c;
                                        C12775o.m28638h(next, "key");
                                        set.add(next);
                                    } else {
                                        JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                        C12775o.m28638h(next, "key");
                                        C7569a aVar = new C7569a(next, new ArrayList());
                                        if (optJSONArray != null) {
                                            aVar.mo41319c(C9138d0.m18643j(optJSONArray));
                                        }
                                        f10520b.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: c */
    public static final void m14892c(Map<String, String> map, String str) {
        Class<C7568a> cls = C7568a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(map, "parameters");
                C12775o.m28639i(str, "eventName");
                if (f10519a) {
                    ArrayList<String> arrayList = new ArrayList<>(map.keySet());
                    for (C7569a aVar : new ArrayList(f10520b)) {
                        if (!(!C12775o.m28634d(aVar.mo41318b(), str))) {
                            for (String str2 : arrayList) {
                                if (aVar.mo41317a().contains(str2)) {
                                    map.remove(str2);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final void m14893d(List<C2834c> list) {
        Class<C7568a> cls = C7568a.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(list, "events");
                if (f10519a) {
                    Iterator<C2834c> it = list.iterator();
                    while (it.hasNext()) {
                        if (f10521c.contains(it.next().mo28333f())) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }
}
