package p348gf;

import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C12775o;

/* renamed from: gf.f */
/* compiled from: Comparisons.kt */
final class C12024f implements Comparator<Comparable<? super Object>> {

    /* renamed from: b */
    public static final C12024f f18786b = new C12024f();

    private C12024f() {
    }

    /* renamed from: a */
    public int compare(Comparable<Object> comparable, Comparable<Object> comparable2) {
        C12775o.m28639i(comparable, Constants.APPBOY_PUSH_CONTENT_KEY);
        C12775o.m28639i(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return C12023e.f18785b;
    }
}
