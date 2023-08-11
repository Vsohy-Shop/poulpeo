package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p058d1.C7218e;
import p058d1.C7222g;
import p058d1.C7226k;
import p106h1.C7883b;
import p294z1.C10788g;
import p294z1.C10792k;

/* renamed from: com.bumptech.glide.load.engine.t */
/* compiled from: ResourceCacheKey */
final class C4430t implements C7218e {

    /* renamed from: j */
    private static final C10788g<Class<?>, byte[]> f3967j = new C10788g<>(50);

    /* renamed from: b */
    private final C7883b f3968b;

    /* renamed from: c */
    private final C7218e f3969c;

    /* renamed from: d */
    private final C7218e f3970d;

    /* renamed from: e */
    private final int f3971e;

    /* renamed from: f */
    private final int f3972f;

    /* renamed from: g */
    private final Class<?> f3973g;

    /* renamed from: h */
    private final C7222g f3974h;

    /* renamed from: i */
    private final C7226k<?> f3975i;

    C4430t(C7883b bVar, C7218e eVar, C7218e eVar2, int i, int i2, C7226k<?> kVar, Class<?> cls, C7222g gVar) {
        this.f3968b = bVar;
        this.f3969c = eVar;
        this.f3970d = eVar2;
        this.f3971e = i;
        this.f3972f = i2;
        this.f3975i = kVar;
        this.f3973g = cls;
        this.f3974h = gVar;
    }

    /* renamed from: c */
    private byte[] m5298c() {
        C10788g<Class<?>, byte[]> gVar = f3967j;
        byte[] g = gVar.mo45698g(this.f3973g);
        if (g != null) {
            return g;
        }
        byte[] bytes = this.f3973g.getName().getBytes(C7218e.f9912a);
        gVar.mo45700k(this.f3973g, bytes);
        return bytes;
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3968b.mo41594c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3971e).putInt(this.f3972f).array();
        this.f3970d.mo31272a(messageDigest);
        this.f3969c.mo31272a(messageDigest);
        messageDigest.update(bArr);
        C7226k<?> kVar = this.f3975i;
        if (kVar != null) {
            kVar.mo31272a(messageDigest);
        }
        this.f3974h.mo31272a(messageDigest);
        messageDigest.update(m5298c());
        this.f3968b.put(bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4430t)) {
            return false;
        }
        C4430t tVar = (C4430t) obj;
        if (this.f3972f != tVar.f3972f || this.f3971e != tVar.f3971e || !C10792k.m22952c(this.f3975i, tVar.f3975i) || !this.f3973g.equals(tVar.f3973g) || !this.f3969c.equals(tVar.f3969c) || !this.f3970d.equals(tVar.f3970d) || !this.f3974h.equals(tVar.f3974h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f3969c.hashCode() * 31) + this.f3970d.hashCode()) * 31) + this.f3971e) * 31) + this.f3972f;
        C7226k<?> kVar = this.f3975i;
        if (kVar != null) {
            hashCode = (hashCode * 31) + kVar.hashCode();
        }
        return (((hashCode * 31) + this.f3973g.hashCode()) * 31) + this.f3974h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3969c + ", signature=" + this.f3970d + ", width=" + this.f3971e + ", height=" + this.f3972f + ", decodedResourceClass=" + this.f3973g + ", transformation='" + this.f3975i + '\'' + ", options=" + this.f3974h + '}';
    }
}
