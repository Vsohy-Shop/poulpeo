package p111h6;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: h6.i */
/* compiled from: Joiner */
public class C8002i {

    /* renamed from: a */
    private final String f11235a;

    private C8002i(String str) {
        this.f11235a = (String) C8012n.m15755n(str);
    }

    /* renamed from: e */
    public static C8002i m15715e(char c) {
        return new C8002i(String.valueOf(c));
    }

    /* renamed from: a */
    public <A extends Appendable> A mo41832a(A a, Iterator<?> it) {
        C8012n.m15755n(a);
        if (it.hasNext()) {
            a.append(mo41836f(it.next()));
            while (it.hasNext()) {
                a.append(this.f11235a);
                a.append(mo41836f(it.next()));
            }
        }
        return a;
    }

    /* renamed from: b */
    public final StringBuilder mo41833b(StringBuilder sb, Iterator<?> it) {
        try {
            mo41832a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final String mo41834c(Iterable<?> iterable) {
        return mo41835d(iterable.iterator());
    }

    /* renamed from: d */
    public final String mo41835d(Iterator<?> it) {
        return mo41833b(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public CharSequence mo41836f(Object obj) {
        C8012n.m15755n(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
