package p144k8;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p144k8.C8585a;
import p144k8.C8589c;

/* renamed from: k8.d */
/* compiled from: PersistedInstallationEntry */
public abstract class C8591d {
    @NonNull

    /* renamed from: a */
    public static C8591d f12280a = m17257a().mo42657a();

    /* renamed from: k8.d$a */
    /* compiled from: PersistedInstallationEntry */
    public static abstract class C8592a {
        @NonNull
        /* renamed from: a */
        public abstract C8591d mo42657a();

        @NonNull
        /* renamed from: b */
        public abstract C8592a mo42658b(@Nullable String str);

        @NonNull
        /* renamed from: c */
        public abstract C8592a mo42659c(long j);

        @NonNull
        /* renamed from: d */
        public abstract C8592a mo42660d(@NonNull String str);

        @NonNull
        /* renamed from: e */
        public abstract C8592a mo42661e(@Nullable String str);

        @NonNull
        /* renamed from: f */
        public abstract C8592a mo42662f(@Nullable String str);

        @NonNull
        /* renamed from: g */
        public abstract C8592a mo42663g(@NonNull C8589c.C8590a aVar);

        @NonNull
        /* renamed from: h */
        public abstract C8592a mo42664h(long j);
    }

    @NonNull
    /* renamed from: a */
    public static C8592a m17257a() {
        return new C8585a.C8587b().mo42664h(0).mo42663g(C8589c.C8590a.ATTEMPT_MIGRATION).mo42659c(0);
    }

    @Nullable
    /* renamed from: b */
    public abstract String mo42646b();

    /* renamed from: c */
    public abstract long mo42647c();

    @Nullable
    /* renamed from: d */
    public abstract String mo42648d();

    @Nullable
    /* renamed from: e */
    public abstract String mo42649e();

    @Nullable
    /* renamed from: f */
    public abstract String mo42651f();

    @NonNull
    /* renamed from: g */
    public abstract C8589c.C8590a mo42652g();

    /* renamed from: h */
    public abstract long mo42653h();

    /* renamed from: i */
    public boolean mo42669i() {
        if (mo42652g() == C8589c.C8590a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo42670j() {
        if (mo42652g() == C8589c.C8590a.NOT_GENERATED || mo42652g() == C8589c.C8590a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo42671k() {
        if (mo42652g() == C8589c.C8590a.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo42672l() {
        if (mo42652g() == C8589c.C8590a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo42673m() {
        if (mo42652g() == C8589c.C8590a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: n */
    public abstract C8592a mo42655n();

    @NonNull
    /* renamed from: o */
    public C8591d mo42674o(@NonNull String str, long j, long j2) {
        return mo42655n().mo42658b(str).mo42659c(j).mo42664h(j2).mo42657a();
    }

    @NonNull
    /* renamed from: p */
    public C8591d mo42675p() {
        return mo42655n().mo42658b((String) null).mo42657a();
    }

    @NonNull
    /* renamed from: q */
    public C8591d mo42676q(@NonNull String str) {
        return mo42655n().mo42661e(str).mo42663g(C8589c.C8590a.REGISTER_ERROR).mo42657a();
    }

    @NonNull
    /* renamed from: r */
    public C8591d mo42677r() {
        return mo42655n().mo42663g(C8589c.C8590a.NOT_GENERATED).mo42657a();
    }

    @NonNull
    /* renamed from: s */
    public C8591d mo42678s(@NonNull String str, @NonNull String str2, long j, @Nullable String str3, long j2) {
        return mo42655n().mo42660d(str).mo42663g(C8589c.C8590a.REGISTERED).mo42658b(str3).mo42662f(str2).mo42659c(j2).mo42664h(j).mo42657a();
    }

    @NonNull
    /* renamed from: t */
    public C8591d mo42679t(@NonNull String str) {
        return mo42655n().mo42660d(str).mo42663g(C8589c.C8590a.UNREGISTERED).mo42657a();
    }
}
