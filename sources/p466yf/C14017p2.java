package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1451:1\n1#2:1452\n*E\n"})
/* renamed from: yf.p2 */
/* compiled from: JobSupport.kt */
final class C14017p2<T> extends C13950e2 {

    /* renamed from: f */
    private final C14010o<T> f22941f;

    public C14017p2(C14010o<? super T> oVar) {
        this.f22941f = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo53691s((Throwable) obj);
        return C11921v.f18618a;
    }

    /* renamed from: s */
    public void mo53691s(Throwable th) {
        Object T = mo53695t().mo53707T();
        if (T instanceof C13932b0) {
            C14010o<T> oVar = this.f22941f;
            C11907m.C11908a aVar = C11907m.f18600b;
            oVar.resumeWith(C11907m.m25696a(C11910n.m25700a(((C13932b0) T).f22850a)));
            return;
        }
        C14010o<T> oVar2 = this.f22941f;
        C11907m.C11908a aVar2 = C11907m.f18600b;
        oVar2.resumeWith(C11907m.m25696a(C13969g2.m32371h(T)));
    }
}
