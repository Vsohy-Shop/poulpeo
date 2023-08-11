package p436tf;

import java.lang.Comparable;
import kotlin.jvm.internal.C12775o;

/* renamed from: tf.c */
/* compiled from: Range.kt */
public interface C13523c<T extends Comparable<? super T>> {

    /* renamed from: tf.c$a */
    /* compiled from: Range.kt */
    public static final class C13524a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m30837a(C13523c<T> cVar, T t) {
            C12775o.m28639i(t, "value");
            if (t.compareTo(cVar.getStart()) < 0 || t.compareTo(cVar.getEndInclusive()) > 0) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public static <T extends Comparable<? super T>> boolean m30838b(C13523c<T> cVar) {
            if (cVar.getStart().compareTo(cVar.getEndInclusive()) > 0) {
                return true;
            }
            return false;
        }
    }

    T getEndInclusive();

    T getStart();

    boolean isEmpty();
}
