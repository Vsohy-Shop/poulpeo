package androidx.core.util;

import java.util.Objects;

public interface Predicate<T> {
    static <T> Predicate<T> isEqual(Object obj) {
        if (obj == null) {
            return new C1712e();
        }
        return new C1713f(obj);
    }

    /* access modifiers changed from: private */
    /* synthetic */ boolean lambda$and$0(Predicate predicate, Object obj) {
        if (!test(obj) || !predicate.test(obj)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* synthetic */ boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* access modifiers changed from: private */
    /* synthetic */ boolean lambda$or$2(Predicate predicate, Object obj) {
        if (test(obj) || predicate.test(obj)) {
            return true;
        }
        return false;
    }

    static <T> Predicate<T> not(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    Predicate<T> and(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C1714g(this, predicate);
    }

    Predicate<T> negate() {
        return new C1715h(this);
    }

    /* renamed from: or */
    Predicate<T> mo21511or(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new C1711d(this, predicate);
    }

    boolean test(T t);
}
