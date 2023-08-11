package p466yf;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: yf.x1 */
/* compiled from: JobSupport.kt */
final class C14050x1 extends C13950e2 {

    /* renamed from: f */
    private final Function1<Throwable, C11921v> f22964f;

    public C14050x1(Function1<? super Throwable, C11921v> function1) {
        this.f22964f = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo53691s((Throwable) obj);
        return C11921v.f18618a;
    }

    /* renamed from: s */
    public void mo53691s(Throwable th) {
        this.f22964f.invoke(th);
    }
}
