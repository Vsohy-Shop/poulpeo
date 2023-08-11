package p448vf;

import java.util.Iterator;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* renamed from: vf.k */
/* compiled from: SequenceBuilder.kt */
class C13654k {

    /* renamed from: vf.k$a */
    /* compiled from: Sequences.kt */
    public static final class C13655a implements C13650g<T> {

        /* renamed from: a */
        final /* synthetic */ C13088o f21999a;

        public C13655a(C13088o oVar) {
            this.f21999a = oVar;
        }

        public Iterator<T> iterator() {
            return C13654k.m31267a(this.f21999a);
        }
    }

    /* renamed from: a */
    public static <T> Iterator<T> m31267a(C13088o<? super C13652i<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(oVar, "block");
        C13651h hVar = new C13651h();
        hVar.mo53330n(C12147c.m26490a(oVar, hVar, hVar));
        return hVar;
    }

    /* renamed from: b */
    public static <T> C13650g<T> m31268b(C13088o<? super C13652i<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(oVar, "block");
        return new C13655a(oVar);
    }
}
