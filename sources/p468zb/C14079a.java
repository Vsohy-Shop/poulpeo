package p468zb;

import java.util.Iterator;

/* renamed from: zb.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C14079a {
    /* renamed from: a */
    public static /* synthetic */ String m32658a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
