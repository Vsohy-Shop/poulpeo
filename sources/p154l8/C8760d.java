package p154l8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p154l8.C8753a;

/* renamed from: l8.d */
/* compiled from: InstallationResponse */
public abstract class C8760d {

    /* renamed from: l8.d$a */
    /* compiled from: InstallationResponse */
    public static abstract class C8761a {
        @NonNull
        /* renamed from: a */
        public abstract C8760d mo42902a();

        @NonNull
        /* renamed from: b */
        public abstract C8761a mo42903b(@NonNull C8764f fVar);

        @NonNull
        /* renamed from: c */
        public abstract C8761a mo42904c(@NonNull String str);

        @NonNull
        /* renamed from: d */
        public abstract C8761a mo42905d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C8761a mo42906e(@NonNull C8762b bVar);

        @NonNull
        /* renamed from: f */
        public abstract C8761a mo42907f(@NonNull String str);
    }

    /* renamed from: l8.d$b */
    /* compiled from: InstallationResponse */
    public enum C8762b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    /* renamed from: a */
    public static C8761a m17744a() {
        return new C8753a.C8755b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C8764f mo42894b();

    @Nullable
    /* renamed from: c */
    public abstract String mo42895c();

    @Nullable
    /* renamed from: d */
    public abstract String mo42896d();

    @Nullable
    /* renamed from: e */
    public abstract C8762b mo42897e();

    @Nullable
    /* renamed from: f */
    public abstract String mo42899f();
}
