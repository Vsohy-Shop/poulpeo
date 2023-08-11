package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p058d1.C7218e;

/* renamed from: com.bumptech.glide.load.engine.d */
/* compiled from: DataCacheKey */
final class C4391d implements C7218e {

    /* renamed from: b */
    private final C7218e f3791b;

    /* renamed from: c */
    private final C7218e f3792c;

    C4391d(C7218e eVar, C7218e eVar2) {
        this.f3791b = eVar;
        this.f3792c = eVar2;
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        this.f3791b.mo31272a(messageDigest);
        this.f3792c.mo31272a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4391d)) {
            return false;
        }
        C4391d dVar = (C4391d) obj;
        if (!this.f3791b.equals(dVar.f3791b) || !this.f3792c.equals(dVar.f3792c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f3791b.hashCode() * 31) + this.f3792c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f3791b + ", signature=" + this.f3792c + '}';
    }
}
