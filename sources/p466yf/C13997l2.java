package p466yf;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12067a;
import p355hf.C12074d;
import p448vf.C13650g;

/* renamed from: yf.l2 */
/* compiled from: NonCancellable.kt */
public final class C13997l2 extends C12067a implements C14054y1 {

    /* renamed from: b */
    public static final C13997l2 f22924b = new C13997l2();

    private C13997l2() {
        super(C14054y1.f22970b0);
    }

    /* renamed from: A */
    public CancellationException mo53700A() {
        throw new IllegalStateException("This job is always active");
    }

    /* renamed from: G */
    public Object mo53703G(C12074d<? super C11921v> dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    /* renamed from: O */
    public C13943d1 mo53704O(Function1<? super Throwable, C11921v> function1) {
        return C14001m2.f22925b;
    }

    /* renamed from: a */
    public boolean mo45937a() {
        return true;
    }

    public C13650g<C14054y1> getChildren() {
        return C13657m.m31271e();
    }

    public C14054y1 getParent() {
        return null;
    }

    /* renamed from: j0 */
    public boolean mo53716j0() {
        return false;
    }

    /* renamed from: k */
    public C13943d1 mo53717k(boolean z, boolean z2, Function1<? super Throwable, C11921v> function1) {
        return C14001m2.f22925b;
    }

    /* renamed from: p0 */
    public C14030t mo53718p0(C14040v vVar) {
        return C14001m2.f22925b;
    }

    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    public void cancel(CancellationException cancellationException) {
    }
}
