package p129j3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p129j3.C8368e;

/* renamed from: j3.k */
/* compiled from: ClientInfo */
public abstract class C8382k {

    /* renamed from: j3.k$a */
    /* compiled from: ClientInfo */
    public static abstract class C8383a {
        @NonNull
        /* renamed from: a */
        public abstract C8382k mo42359a();

        @NonNull
        /* renamed from: b */
        public abstract C8383a mo42360b(@Nullable C8355a aVar);

        @NonNull
        /* renamed from: c */
        public abstract C8383a mo42361c(@Nullable C8384b bVar);
    }

    /* renamed from: j3.k$b */
    /* compiled from: ClientInfo */
    public enum C8384b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: b */
        private final int f11890b;

        private C8384b(int i) {
            this.f11890b = i;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C8383a m16722a() {
        return new C8368e.C8370b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C8355a mo42354b();

    @Nullable
    /* renamed from: c */
    public abstract C8384b mo42355c();
}
