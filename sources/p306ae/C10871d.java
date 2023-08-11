package p306ae;

import okhttp3.internal.http2.Header;
import okio.C13133f;

/* renamed from: ae.d */
/* compiled from: Header */
public final class C10871d {

    /* renamed from: d */
    public static final C13133f f16682d = C13133f.m29652e(Header.RESPONSE_STATUS_UTF8);

    /* renamed from: e */
    public static final C13133f f16683e = C13133f.m29652e(Header.TARGET_METHOD_UTF8);

    /* renamed from: f */
    public static final C13133f f16684f = C13133f.m29652e(Header.TARGET_PATH_UTF8);

    /* renamed from: g */
    public static final C13133f f16685g = C13133f.m29652e(Header.TARGET_SCHEME_UTF8);

    /* renamed from: h */
    public static final C13133f f16686h = C13133f.m29652e(Header.TARGET_AUTHORITY_UTF8);

    /* renamed from: i */
    public static final C13133f f16687i = C13133f.m29652e(":host");

    /* renamed from: j */
    public static final C13133f f16688j = C13133f.m29652e(":version");

    /* renamed from: a */
    public final C13133f f16689a;

    /* renamed from: b */
    public final C13133f f16690b;

    /* renamed from: c */
    final int f16691c;

    public C10871d(String str, String str2) {
        this(C13133f.m29652e(str), C13133f.m29652e(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10871d)) {
            return false;
        }
        C10871d dVar = (C10871d) obj;
        if (!this.f16689a.equals(dVar.f16689a) || !this.f16690b.equals(dVar.f16690b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f16689a.hashCode()) * 31) + this.f16690b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f16689a.mo52595N(), this.f16690b.mo52595N()});
    }

    public C10871d(C13133f fVar, String str) {
        this(fVar, C13133f.m29652e(str));
    }

    public C10871d(C13133f fVar, C13133f fVar2) {
        this.f16689a = fVar;
        this.f16690b = fVar2;
        this.f16691c = fVar.mo52590H() + 32 + fVar2.mo52590H();
    }
}
