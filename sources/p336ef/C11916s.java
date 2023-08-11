package p336ef;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.s */
/* compiled from: ULong.kt */
public final class C11916s implements Comparable<C11916s> {

    /* renamed from: c */
    public static final C11917a f18613c = new C11917a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f18614b;

    /* renamed from: ef.s$a */
    /* compiled from: ULong.kt */
    public static final class C11917a {
        private C11917a() {
        }

        public /* synthetic */ C11917a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ C11916s(long j) {
        this.f18614b = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11916s m25708a(long j) {
        return new C11916s(j);
    }

    /* renamed from: c */
    public static boolean m25710c(long j, Object obj) {
        if ((obj instanceof C11916s) && j == ((C11916s) obj).mo49131f()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m25711d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: e */
    public static String m25712e(long j) {
        return C11923x.m25723c(j);
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C11923x.m25721a(mo49131f(), ((C11916s) obj).mo49131f());
    }

    public boolean equals(Object obj) {
        return m25710c(this.f18614b, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ long mo49131f() {
        return this.f18614b;
    }

    public int hashCode() {
        return m25711d(this.f18614b);
    }

    public String toString() {
        return m25712e(this.f18614b);
    }

    /* renamed from: b */
    public static long m25709b(long j) {
        return j;
    }
}
