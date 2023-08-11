package p058d1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import java.security.MessageDigest;
import p294z1.C10781b;

/* renamed from: d1.g */
/* compiled from: Options */
public final class C7222g implements C7218e {

    /* renamed from: b */
    private final ArrayMap<C7219f<?>, Object> f9918b = new C10781b();

    /* renamed from: f */
    private static <T> void m13993f(@NonNull C7219f<T> fVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        fVar.mo40776g(obj, messageDigest);
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        for (int i = 0; i < this.f9918b.size(); i++) {
            m13993f(this.f9918b.keyAt(i), this.f9918b.valueAt(i), messageDigest);
        }
    }

    @Nullable
    /* renamed from: c */
    public <T> T mo40779c(@NonNull C7219f<T> fVar) {
        if (this.f9918b.containsKey(fVar)) {
            return this.f9918b.get(fVar);
        }
        return fVar.mo40774c();
    }

    /* renamed from: d */
    public void mo40780d(@NonNull C7222g gVar) {
        this.f9918b.putAll(gVar.f9918b);
    }

    @NonNull
    /* renamed from: e */
    public <T> C7222g mo40781e(@NonNull C7219f<T> fVar, @NonNull T t) {
        this.f9918b.put(fVar, t);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7222g) {
            return this.f9918b.equals(((C7222g) obj).f9918b);
        }
        return false;
    }

    public int hashCode() {
        return this.f9918b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f9918b + '}';
    }
}
