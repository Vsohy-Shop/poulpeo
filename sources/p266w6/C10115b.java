package p266w6;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p222s6.C9511f;

/* renamed from: w6.b */
/* compiled from: KeysMap */
class C10115b {

    /* renamed from: a */
    private final Map<String, String> f15281a = new HashMap();

    /* renamed from: b */
    private final int f15282b;

    /* renamed from: c */
    private final int f15283c;

    public C10115b(int i, int i2) {
        this.f15282b = i;
        this.f15283c = i2;
    }

    /* renamed from: b */
    private String m21251b(String str) {
        if (str != null) {
            return m21252c(str, this.f15283c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: c */
    public static String m21252c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > i) {
            return trim.substring(0, i);
        }
        return trim;
    }

    @NonNull
    /* renamed from: a */
    public synchronized Map<String, String> mo44699a() {
        return Collections.unmodifiableMap(new HashMap(this.f15281a));
    }

    /* renamed from: d */
    public synchronized void mo44700d(Map<String, String> map) {
        String str;
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = m21251b((String) next.getKey());
            if (this.f15281a.size() >= this.f15282b) {
                if (!this.f15281a.containsKey(b)) {
                    i++;
                }
            }
            String str2 = (String) next.getValue();
            Map<String, String> map2 = this.f15281a;
            if (str2 == null) {
                str = "";
            } else {
                str = m21252c(str2, this.f15283c);
            }
            map2.put(b, str);
        }
        if (i > 0) {
            C9511f f = C9511f.m19696f();
            f.mo43973k("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f15282b);
        }
    }
}
