package p129j3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import p129j3.C8374g;

/* renamed from: j3.m */
/* compiled from: LogRequest */
public abstract class C8387m {

    /* renamed from: j3.m$a */
    /* compiled from: LogRequest */
    public static abstract class C8388a {
        @NonNull
        /* renamed from: a */
        public abstract C8387m mo42390a();

        @NonNull
        /* renamed from: b */
        public abstract C8388a mo42391b(@Nullable C8382k kVar);

        @NonNull
        /* renamed from: c */
        public abstract C8388a mo42392c(@Nullable List<C8385l> list);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: d */
        public abstract C8388a mo42393d(@Nullable Integer num);

        /* access modifiers changed from: package-private */
        @NonNull
        /* renamed from: e */
        public abstract C8388a mo42394e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C8388a mo42395f(@Nullable C8394p pVar);

        @NonNull
        /* renamed from: g */
        public abstract C8388a mo42396g(long j);

        @NonNull
        /* renamed from: h */
        public abstract C8388a mo42397h(long j);

        @NonNull
        /* renamed from: i */
        public C8388a mo42410i(int i) {
            return mo42393d(Integer.valueOf(i));
        }

        @NonNull
        /* renamed from: j */
        public C8388a mo42411j(@NonNull String str) {
            return mo42394e(str);
        }
    }

    @NonNull
    /* renamed from: a */
    public static C8388a m16746a() {
        return new C8374g.C8376b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C8382k mo42380b();

    @Nullable
    /* renamed from: c */
    public abstract List<C8385l> mo42381c();

    @Nullable
    /* renamed from: d */
    public abstract Integer mo42382d();

    @Nullable
    /* renamed from: e */
    public abstract String mo42383e();

    @Nullable
    /* renamed from: f */
    public abstract C8394p mo42385f();

    /* renamed from: g */
    public abstract long mo42386g();

    /* renamed from: h */
    public abstract long mo42387h();
}
