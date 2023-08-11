package p151l5;

import com.google.firebase.encoders.EncodingException;
import p153l7.C8749c;
import p153l7.C8750d;

/* renamed from: l5.v */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final /* synthetic */ class C8739v implements C8749c {

    /* renamed from: a */
    public static final /* synthetic */ C8739v f12580a = new C8739v();

    private /* synthetic */ C8739v() {
    }

    /* renamed from: a */
    public final void mo42340a(Object obj, Object obj2) {
        String str;
        C8750d dVar = (C8750d) obj2;
        int i = C8740w.f12582e;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        if (valueOf.length() != 0) {
            str = "Couldn't find encoder for type ".concat(valueOf);
        } else {
            str = new String("Couldn't find encoder for type ");
        }
        throw new EncodingException(str);
    }
}
