package p137k1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k1.j */
/* compiled from: LazyHeaders */
public final class C8466j implements C8463h {

    /* renamed from: c */
    private final Map<String, List<C8465i>> f12052c;

    /* renamed from: d */
    private volatile Map<String, String> f12053d;

    /* renamed from: k1.j$a */
    /* compiled from: LazyHeaders */
    public static final class C8467a {

        /* renamed from: d */
        private static final String f12054d;

        /* renamed from: e */
        private static final Map<String, List<C8465i>> f12055e;

        /* renamed from: a */
        private boolean f12056a = true;

        /* renamed from: b */
        private Map<String, List<C8465i>> f12057b = f12055e;

        /* renamed from: c */
        private boolean f12058c = true;

        static {
            String g = m16953g();
            f12054d = g;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g)) {
                hashMap.put("User-Agent", Collections.singletonList(new C8468b(g)));
            }
            f12055e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: d */
        private Map<String, List<C8465i>> m16950d() {
            HashMap hashMap = new HashMap(this.f12057b.size());
            for (Map.Entry next : this.f12057b.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        /* renamed from: e */
        private void m16951e() {
            if (this.f12056a) {
                this.f12056a = false;
                this.f12057b = m16950d();
            }
        }

        /* renamed from: f */
        private List<C8465i> m16952f(String str) {
            List<C8465i> list = this.f12057b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f12057b.put(str, arrayList);
            return arrayList;
        }

        @VisibleForTesting
        /* renamed from: g */
        static String m16953g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C8467a mo42495a(@NonNull String str, @NonNull String str2) {
            return mo42496b(str, new C8468b(str2));
        }

        /* renamed from: b */
        public C8467a mo42496b(@NonNull String str, @NonNull C8465i iVar) {
            if (this.f12058c && "User-Agent".equalsIgnoreCase(str)) {
                return mo42498h(str, iVar);
            }
            m16951e();
            m16952f(str).add(iVar);
            return this;
        }

        /* renamed from: c */
        public C8466j mo42497c() {
            this.f12056a = true;
            return new C8466j(this.f12057b);
        }

        /* renamed from: h */
        public C8467a mo42498h(@NonNull String str, @Nullable C8465i iVar) {
            m16951e();
            if (iVar == null) {
                this.f12057b.remove(str);
            } else {
                List<C8465i> f = m16952f(str);
                f.clear();
                f.add(iVar);
            }
            if (this.f12058c && "User-Agent".equalsIgnoreCase(str)) {
                this.f12058c = false;
            }
            return this;
        }
    }

    /* renamed from: k1.j$b */
    /* compiled from: LazyHeaders */
    static final class C8468b implements C8465i {
        @NonNull

        /* renamed from: a */
        private final String f12059a;

        C8468b(@NonNull String str) {
            this.f12059a = str;
        }

        /* renamed from: a */
        public String mo42491a() {
            return this.f12059a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8468b) {
                return this.f12059a.equals(((C8468b) obj).f12059a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12059a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f12059a + '\'' + '}';
        }
    }

    C8466j(Map<String, List<C8465i>> map) {
        this.f12052c = Collections.unmodifiableMap(map);
    }

    @NonNull
    /* renamed from: b */
    private String m16947b(@NonNull List<C8465i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo42491a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m16948c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f12052c.entrySet()) {
            String b = m16947b((List) next.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(next.getKey(), b);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo42490a() {
        if (this.f12053d == null) {
            synchronized (this) {
                if (this.f12053d == null) {
                    this.f12053d = Collections.unmodifiableMap(m16948c());
                }
            }
        }
        return this.f12053d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8466j) {
            return this.f12052c.equals(((C8466j) obj).f12052c);
        }
        return false;
    }

    public int hashCode() {
        return this.f12052c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f12052c + '}';
    }
}
