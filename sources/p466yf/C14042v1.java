package p466yf;

import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: yf.v1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C14042v1 extends C13994l {

    /* renamed from: b */
    private final Function1<Throwable, C11921v> f22958b;

    public C14042v1(Function1<? super Throwable, C11921v> function1) {
        this.f22958b = function1;
    }

    /* renamed from: d */
    public void mo49455d(Throwable th) {
        this.f22958b.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo49455d((Throwable) obj);
        return C11921v.f18618a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C14015p0.m32518a(this.f22958b) + '@' + C14015p0.m32519b(this) + ']';
    }
}
