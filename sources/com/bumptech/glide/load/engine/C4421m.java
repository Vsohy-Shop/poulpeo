package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;
import p058d1.C7218e;
import p058d1.C7222g;
import p058d1.C7226k;
import p294z1.C10791j;

/* renamed from: com.bumptech.glide.load.engine.m */
/* compiled from: EngineKey */
class C4421m implements C7218e {

    /* renamed from: b */
    private final Object f3930b;

    /* renamed from: c */
    private final int f3931c;

    /* renamed from: d */
    private final int f3932d;

    /* renamed from: e */
    private final Class<?> f3933e;

    /* renamed from: f */
    private final Class<?> f3934f;

    /* renamed from: g */
    private final C7218e f3935g;

    /* renamed from: h */
    private final Map<Class<?>, C7226k<?>> f3936h;

    /* renamed from: i */
    private final C7222g f3937i;

    /* renamed from: j */
    private int f3938j;

    C4421m(Object obj, C7218e eVar, int i, int i2, Map<Class<?>, C7226k<?>> map, Class<?> cls, Class<?> cls2, C7222g gVar) {
        this.f3930b = C10791j.m22948d(obj);
        this.f3935g = (C7218e) C10791j.m22949e(eVar, "Signature must not be null");
        this.f3931c = i;
        this.f3932d = i2;
        this.f3936h = (Map) C10791j.m22948d(map);
        this.f3933e = (Class) C10791j.m22949e(cls, "Resource class must not be null");
        this.f3934f = (Class) C10791j.m22949e(cls2, "Transcode class must not be null");
        this.f3937i = (C7222g) C10791j.m22948d(gVar);
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4421m)) {
            return false;
        }
        C4421m mVar = (C4421m) obj;
        if (!this.f3930b.equals(mVar.f3930b) || !this.f3935g.equals(mVar.f3935g) || this.f3932d != mVar.f3932d || this.f3931c != mVar.f3931c || !this.f3936h.equals(mVar.f3936h) || !this.f3933e.equals(mVar.f3933e) || !this.f3934f.equals(mVar.f3934f) || !this.f3937i.equals(mVar.f3937i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f3938j == 0) {
            int hashCode = this.f3930b.hashCode();
            this.f3938j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f3935g.hashCode()) * 31) + this.f3931c) * 31) + this.f3932d;
            this.f3938j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f3936h.hashCode();
            this.f3938j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f3933e.hashCode();
            this.f3938j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f3934f.hashCode();
            this.f3938j = hashCode5;
            this.f3938j = (hashCode5 * 31) + this.f3937i.hashCode();
        }
        return this.f3938j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f3930b + ", width=" + this.f3931c + ", height=" + this.f3932d + ", resourceClass=" + this.f3933e + ", transcodeClass=" + this.f3934f + ", signature=" + this.f3935g + ", hashCode=" + this.f3938j + ", transformations=" + this.f3936h + ", options=" + this.f3937i + '}';
    }
}
