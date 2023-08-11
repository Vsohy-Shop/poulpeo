package p042bo.app;

import kotlin.jvm.internal.C12775o;

/* renamed from: bo.app.r3 */
public final class C3633r3 extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3633r3(String str, Throwable th) {
        super(str, th);
        C12775o.m28639i(str, "message");
        C12775o.m28639i(th, "innerException");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3633r3(String str) {
        super(str);
        C12775o.m28639i(str, "message");
    }
}
