package p154l8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p154l8.C8756b;

/* renamed from: l8.f */
/* compiled from: TokenResult */
public abstract class C8764f {

    /* renamed from: l8.f$a */
    /* compiled from: TokenResult */
    public static abstract class C8765a {
        @NonNull
        /* renamed from: a */
        public abstract C8764f mo42914a();

        @NonNull
        /* renamed from: b */
        public abstract C8765a mo42915b(@NonNull C8766b bVar);

        @NonNull
        /* renamed from: c */
        public abstract C8765a mo42916c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C8765a mo42917d(long j);
    }

    /* renamed from: l8.f$b */
    /* compiled from: TokenResult */
    public enum C8766b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* renamed from: a */
    public static C8765a m17762a() {
        return new C8756b.C8758b().mo42917d(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract C8766b mo42908b();

    @Nullable
    /* renamed from: c */
    public abstract String mo42909c();

    @NonNull
    /* renamed from: d */
    public abstract long mo42910d();
}
