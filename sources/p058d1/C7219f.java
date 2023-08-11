package p058d1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import p294z1.C10791j;

/* renamed from: d1.f */
/* compiled from: Option */
public final class C7219f<T> {

    /* renamed from: e */
    private static final C7221b<Object> f9913e = new C7220a();

    /* renamed from: a */
    private final T f9914a;

    /* renamed from: b */
    private final C7221b<T> f9915b;

    /* renamed from: c */
    private final String f9916c;

    /* renamed from: d */
    private volatile byte[] f9917d;

    /* renamed from: d1.f$b */
    /* compiled from: Option */
    public interface C7221b<T> {
        /* renamed from: a */
        void mo31400a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private C7219f(@NonNull String str, @Nullable T t, @NonNull C7221b<T> bVar) {
        this.f9916c = C10791j.m22946b(str);
        this.f9914a = t;
        this.f9915b = (C7221b) C10791j.m22948d(bVar);
    }

    @NonNull
    /* renamed from: a */
    public static <T> C7219f<T> m13984a(@NonNull String str, @Nullable T t, @NonNull C7221b<T> bVar) {
        return new C7219f<>(str, t, bVar);
    }

    @NonNull
    /* renamed from: b */
    private static <T> C7221b<T> m13985b() {
        return f9913e;
    }

    @NonNull
    /* renamed from: d */
    private byte[] m13986d() {
        if (this.f9917d == null) {
            this.f9917d = this.f9916c.getBytes(C7218e.f9912a);
        }
        return this.f9917d;
    }

    @NonNull
    /* renamed from: e */
    public static <T> C7219f<T> m13987e(@NonNull String str) {
        return new C7219f<>(str, (Object) null, m13985b());
    }

    @NonNull
    /* renamed from: f */
    public static <T> C7219f<T> m13988f(@NonNull String str, @NonNull T t) {
        return new C7219f<>(str, t, m13985b());
    }

    @Nullable
    /* renamed from: c */
    public T mo40774c() {
        return this.f9914a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7219f) {
            return this.f9916c.equals(((C7219f) obj).f9916c);
        }
        return false;
    }

    /* renamed from: g */
    public void mo40776g(@NonNull T t, @NonNull MessageDigest messageDigest) {
        this.f9915b.mo31400a(m13986d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f9916c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f9916c + '\'' + '}';
    }

    /* renamed from: d1.f$a */
    /* compiled from: Option */
    class C7220a implements C7221b<Object> {
        C7220a() {
        }

        /* renamed from: a */
        public void mo31400a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
