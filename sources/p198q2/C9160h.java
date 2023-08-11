package p198q2;

import androidx.autofill.HintConstants;
import com.facebook.C4550k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p336ef.C11915r;

/* renamed from: q2.h */
/* compiled from: FacebookRequestErrorClassification.kt */
public final class C9160h {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static C9160h f13388g;

    /* renamed from: h */
    public static final C9161a f13389h = new C9161a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f13390a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f13391b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f13392c;

    /* renamed from: d */
    private final String f13393d;

    /* renamed from: e */
    private final String f13394e;

    /* renamed from: f */
    private final String f13395f;

    /* renamed from: q2.h$a */
    /* compiled from: FacebookRequestErrorClassification.kt */
    public static final class C9161a {
        private C9161a() {
        }

        public /* synthetic */ C9161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final C9160h m18746c() {
            return new C9160h((Map<Integer, ? extends Set<Integer>>) null, C12716r0.m28418i(C11915r.m25707a(2, null), C11915r.m25707a(4, null), C11915r.m25707a(9, null), C11915r.m25707a(17, null), C11915r.m25707a(341, null)), C12716r0.m28418i(C11915r.m25707a(102, null), C11915r.m25707a(190, null), C11915r.m25707a(412, null)), (String) null, (String) null, (String) null);
        }

        /* renamed from: d */
        private final Map<Integer, Set<Integer>> m18747d(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final C9160h mo43441a(JSONArray jSONArray) {
            String optString;
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            Map<Integer, Set<Integer>> map = null;
            Map<Integer, Set<Integer>> map2 = null;
            Map<Integer, Set<Integer>> map3 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optString = optJSONObject.optString(HintConstants.AUTOFILL_HINT_NAME)) == null)) {
                    if (C13754v.m31530r(optString, "other", true)) {
                        str = optJSONObject.optString("recovery_message", (String) null);
                        map = m18747d(optJSONObject);
                    } else if (C13754v.m31530r(optString, "transient", true)) {
                        str2 = optJSONObject.optString("recovery_message", (String) null);
                        map2 = m18747d(optJSONObject);
                    } else if (C13754v.m31530r(optString, "login_recoverable", true)) {
                        str3 = optJSONObject.optString("recovery_message", (String) null);
                        map3 = m18747d(optJSONObject);
                    }
                }
            }
            return new C9160h(map, map2, map3, str, str2, str3);
        }

        /* renamed from: b */
        public final synchronized C9160h mo43442b() {
            C9160h a;
            if (C9160h.f13388g == null) {
                C9160h.f13388g = C9160h.f13389h.m18746c();
            }
            a = C9160h.f13388g;
            if (a == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return a;
        }
    }

    public C9160h(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.f13390a = map;
        this.f13391b = map2;
        this.f13392c = map3;
        this.f13393d = str;
        this.f13394e = str2;
        this.f13395f = str3;
    }

    /* renamed from: c */
    public final C4550k.C4551a mo43439c(int i, int i2, boolean z) {
        Set set;
        Set set2;
        Set set3;
        if (z) {
            return C4550k.C4551a.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f13390a;
        if (map != null && map.containsKey(Integer.valueOf(i)) && ((set3 = this.f13390a.get(Integer.valueOf(i))) == null || set3.contains(Integer.valueOf(i2)))) {
            return C4550k.C4551a.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.f13392c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i)) && ((set2 = this.f13392c.get(Integer.valueOf(i))) == null || set2.contains(Integer.valueOf(i2)))) {
            return C4550k.C4551a.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.f13391b;
        if (map3 == null || !map3.containsKey(Integer.valueOf(i)) || ((set = this.f13391b.get(Integer.valueOf(i))) != null && !set.contains(Integer.valueOf(i2)))) {
            return C4550k.C4551a.OTHER;
        }
        return C4550k.C4551a.TRANSIENT;
    }

    /* renamed from: d */
    public final String mo43440d(C4550k.C4551a aVar) {
        if (aVar != null) {
            int i = C9162i.f13396a[aVar.ordinal()];
            if (i == 1) {
                return this.f13393d;
            }
            if (i == 2) {
                return this.f13395f;
            }
            if (i == 3) {
                return this.f13394e;
            }
        }
        return null;
    }
}
