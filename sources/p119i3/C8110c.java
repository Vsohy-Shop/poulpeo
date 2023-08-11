package p119i3;

import androidx.annotation.Nullable;

/* renamed from: i3.c */
/* compiled from: Event */
public abstract class C8110c<T> {
    /* renamed from: d */
    public static <T> C8110c<T> m15972d(int i, T t) {
        return new C8108a(Integer.valueOf(i), t, C8111d.DEFAULT);
    }

    /* renamed from: e */
    public static <T> C8110c<T> m15973e(T t) {
        return new C8108a((Integer) null, t, C8111d.DEFAULT);
    }

    /* renamed from: f */
    public static <T> C8110c<T> m15974f(int i, T t) {
        return new C8108a(Integer.valueOf(i), t, C8111d.VERY_LOW);
    }

    /* renamed from: g */
    public static <T> C8110c<T> m15975g(T t) {
        return new C8108a((Integer) null, t, C8111d.VERY_LOW);
    }

    /* renamed from: h */
    public static <T> C8110c<T> m15976h(T t) {
        return new C8108a((Integer) null, t, C8111d.HIGHEST);
    }

    @Nullable
    /* renamed from: a */
    public abstract Integer mo41957a();

    /* renamed from: b */
    public abstract T mo41958b();

    /* renamed from: c */
    public abstract C8111d mo41959c();
}
