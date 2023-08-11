package p141k5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: k5.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8580r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8573k f12252a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f12253b;

    /* renamed from: c */
    private final C8577o f12254c;

    private C8580r(C8577o oVar, boolean z, C8573k kVar, int i, byte[] bArr) {
        this.f12254c = oVar;
        this.f12253b = z;
        this.f12252a = kVar;
    }

    /* renamed from: c */
    public static C8580r m17220c(C8573k kVar) {
        return new C8580r(new C8577o(kVar), false, C8572j.f12242b, Integer.MAX_VALUE, (byte[]) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final Iterator<String> m17223h(CharSequence charSequence) {
        return new C8576n(this.f12254c, this, charSequence);
    }

    /* renamed from: b */
    public final C8580r mo42643b() {
        return new C8580r(this.f12254c, true, this.f12252a, Integer.MAX_VALUE, (byte[]) null);
    }

    /* renamed from: d */
    public final Iterable<String> mo42644d(CharSequence charSequence) {
        return new C8578p(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> mo42645f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> h = m17223h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add(h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
