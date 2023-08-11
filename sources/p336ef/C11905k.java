package p336ef;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef.k */
/* compiled from: Standard.kt */
public final class C11905k extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11905k(String str) {
        super(str);
        C12775o.m28639i(str, "message");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11905k(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }
}
