package p137k1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p058d1.C7218e;
import p294z1.C10791j;

/* renamed from: k1.g */
/* compiled from: GlideUrl */
public class C8462g implements C7218e {

    /* renamed from: b */
    private final C8463h f12043b;
    @Nullable

    /* renamed from: c */
    private final URL f12044c;
    @Nullable

    /* renamed from: d */
    private final String f12045d;
    @Nullable

    /* renamed from: e */
    private String f12046e;
    @Nullable

    /* renamed from: f */
    private URL f12047f;
    @Nullable

    /* renamed from: g */
    private volatile byte[] f12048g;

    /* renamed from: h */
    private int f12049h;

    public C8462g(URL url) {
        this(url, C8463h.f12051b);
    }

    /* renamed from: d */
    private byte[] m16937d() {
        if (this.f12048g == null) {
            this.f12048g = mo42486c().getBytes(C7218e.f9912a);
        }
        return this.f12048g;
    }

    /* renamed from: f */
    private String m16938f() {
        if (TextUtils.isEmpty(this.f12046e)) {
            String str = this.f12045d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) C10791j.m22948d(this.f12044c)).toString();
            }
            this.f12046e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f12046e;
    }

    /* renamed from: g */
    private URL m16939g() {
        if (this.f12047f == null) {
            this.f12047f = new URL(m16938f());
        }
        return this.f12047f;
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m16937d());
    }

    /* renamed from: c */
    public String mo42486c() {
        String str = this.f12045d;
        if (str != null) {
            return str;
        }
        return ((URL) C10791j.m22948d(this.f12044c)).toString();
    }

    /* renamed from: e */
    public Map<String, String> mo42487e() {
        return this.f12043b.mo42490a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8462g)) {
            return false;
        }
        C8462g gVar = (C8462g) obj;
        if (!mo42486c().equals(gVar.mo42486c()) || !this.f12043b.equals(gVar.f12043b)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public URL mo42488h() {
        return m16939g();
    }

    public int hashCode() {
        if (this.f12049h == 0) {
            int hashCode = mo42486c().hashCode();
            this.f12049h = hashCode;
            this.f12049h = (hashCode * 31) + this.f12043b.hashCode();
        }
        return this.f12049h;
    }

    public String toString() {
        return mo42486c();
    }

    public C8462g(String str) {
        this(str, C8463h.f12051b);
    }

    public C8462g(URL url, C8463h hVar) {
        this.f12044c = (URL) C10791j.m22948d(url);
        this.f12045d = null;
        this.f12043b = (C8463h) C10791j.m22948d(hVar);
    }

    public C8462g(String str, C8463h hVar) {
        this.f12044c = null;
        this.f12045d = C10791j.m22946b(str);
        this.f12043b = (C8463h) C10791j.m22948d(hVar);
    }
}
