package p255v6;

import java.io.File;
import java.io.IOException;
import p025a7.C2217f;
import p222s6.C9511f;

/* renamed from: v6.n */
/* compiled from: CrashlyticsFileMarker */
class C10006n {

    /* renamed from: a */
    private final String f15050a;

    /* renamed from: b */
    private final C2217f f15051b;

    public C10006n(String str, C2217f fVar) {
        this.f15050a = str;
        this.f15051b = fVar;
    }

    /* renamed from: b */
    private File m20956b() {
        return this.f15051b.mo23553d(this.f15050a);
    }

    /* renamed from: a */
    public boolean mo44586a() {
        try {
            return m20956b().createNewFile();
        } catch (IOException e) {
            C9511f f = C9511f.m19696f();
            f.mo43968e("Error creating marker: " + this.f15050a, e);
            return false;
        }
    }

    /* renamed from: c */
    public boolean mo44587c() {
        return m20956b().exists();
    }

    /* renamed from: d */
    public boolean mo44588d() {
        return m20956b().delete();
    }
}
