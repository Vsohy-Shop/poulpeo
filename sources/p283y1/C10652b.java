package p283y1;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p058d1.C7218e;
import p294z1.C10791j;

/* renamed from: y1.b */
/* compiled from: ObjectKey */
public final class C10652b implements C7218e {

    /* renamed from: b */
    private final Object f16217b;

    public C10652b(@NonNull Object obj) {
        this.f16217b = C10791j.m22948d(obj);
    }

    /* renamed from: a */
    public void mo31272a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f16217b.toString().getBytes(C7218e.f9912a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10652b) {
            return this.f16217b.equals(((C10652b) obj).f16217b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16217b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f16217b + '}';
    }
}
