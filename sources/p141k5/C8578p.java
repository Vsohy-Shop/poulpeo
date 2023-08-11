package p141k5;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: k5.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C8578p implements Iterable<String> {

    /* renamed from: b */
    final /* synthetic */ CharSequence f12245b;

    /* renamed from: c */
    final /* synthetic */ C8580r f12246c;

    C8578p(C8580r rVar, CharSequence charSequence) {
        this.f12246c = rVar;
        this.f12245b = charSequence;
    }

    public final Iterator<String> iterator() {
        return this.f12246c.m17223h(this.f12245b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(C8574l.m17211a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(C8574l.m17211a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
