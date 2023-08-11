package com.google.android.play.core.assetpacks;

import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.f0 */
final class C6713f0 extends C6693b {

    /* renamed from: a */
    private final long f8627a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f8628b;

    C6713f0(long j, Map<String, AssetPackState> map) {
        this.f8627a = j;
        this.f8628b = map;
    }

    /* renamed from: e */
    public final Map<String, AssetPackState> mo39263e() {
        return this.f8628b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6693b) {
            C6693b bVar = (C6693b) obj;
            if (this.f8627a != bVar.mo39264f() || !this.f8628b.equals(bVar.mo39263e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long mo39264f() {
        return this.f8627a;
    }

    public final int hashCode() {
        long j = this.f8627a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f8628b.hashCode();
    }

    public final String toString() {
        long j = this.f8627a;
        String valueOf = String.valueOf(this.f8628b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
