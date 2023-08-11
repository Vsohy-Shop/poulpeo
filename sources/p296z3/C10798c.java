package p296z3;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.C5333f1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p022a4.C2200a;
import p022a4.C2201b;
import p022a4.C2202c;
import p296z3.C10798c;

/* renamed from: z3.c */
public class C10798c<T extends C10798c> {

    /* renamed from: a */
    private Map<String, String> f16523a = new HashMap();

    /* renamed from: b */
    private C2201b f16524b;

    /* renamed from: c */
    private Map<String, List<C2200a>> f16525c = new HashMap();

    /* renamed from: d */
    private List<C2202c> f16526d = new ArrayList();

    /* renamed from: e */
    private List<C2200a> f16527e = new ArrayList();

    protected C10798c() {
    }

    /* renamed from: a */
    public T mo45720a(C2200a aVar, String str) {
        if (aVar == null) {
            C5333f1.m7924c("product should be non-null");
            return this;
        }
        if (str == null) {
            str = "";
        }
        if (!this.f16525c.containsKey(str)) {
            this.f16525c.put(str, new ArrayList());
        }
        this.f16525c.get(str).add(aVar);
        return this;
    }

    /* renamed from: b */
    public T mo45721b(C2200a aVar) {
        if (aVar == null) {
            C5333f1.m7924c("product should be non-null");
            return this;
        }
        this.f16527e.add(aVar);
        return this;
    }

    /* renamed from: c */
    public T mo45722c(C2202c cVar) {
        if (cVar == null) {
            C5333f1.m7924c("promotion should be non-null");
            return this;
        }
        this.f16526d.add(cVar);
        return this;
    }

    /* renamed from: d */
    public Map<String, String> mo45723d() {
        String str;
        String str2;
        HashMap hashMap = new HashMap(this.f16523a);
        C2201b bVar = this.f16524b;
        if (bVar != null) {
            hashMap.putAll(bVar.mo23509a());
        }
        int i = 1;
        for (C2202c f : this.f16526d) {
            hashMap.putAll(f.mo23524f(C10805i.m23030f(i)));
            i++;
        }
        int i2 = 1;
        for (C2200a m : this.f16527e) {
            hashMap.putAll(m.mo23507m(C10805i.m23028d(i2)));
            i2++;
        }
        int i3 = 1;
        for (Map.Entry next : this.f16525c.entrySet()) {
            String i4 = C10805i.m23033i(i3);
            int i5 = 1;
            for (C2200a aVar : (List) next.getValue()) {
                String valueOf = String.valueOf(i4);
                String valueOf2 = String.valueOf(C10805i.m23032h(i5));
                if (valueOf2.length() != 0) {
                    str2 = valueOf.concat(valueOf2);
                } else {
                    str2 = new String(valueOf);
                }
                hashMap.putAll(aVar.mo23507m(str2));
                i5++;
            }
            if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                String valueOf3 = String.valueOf(i4);
                if ("nm".length() != 0) {
                    str = valueOf3.concat("nm");
                } else {
                    str = new String(valueOf3);
                }
                hashMap.put(str, (String) next.getKey());
            }
            i3++;
        }
        return hashMap;
    }

    /* renamed from: e */
    public final T mo45724e(String str, String str2) {
        if (str != null) {
            this.f16523a.put(str, str2);
        } else {
            C5333f1.m7924c("HitBuilder.set() called with a null paramName.");
        }
        return this;
    }

    /* renamed from: f */
    public final T mo45725f(Map<String, String> map) {
        if (map == null) {
            return this;
        }
        this.f16523a.putAll(new HashMap(map));
        return this;
    }

    /* renamed from: g */
    public T mo45726g(C2201b bVar) {
        this.f16524b = bVar;
        return this;
    }
}
