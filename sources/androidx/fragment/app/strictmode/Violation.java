package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Violation.kt */
public abstract class Violation extends RuntimeException {
    private final Fragment fragment;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Violation(Fragment fragment2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment2, (i & 2) != 0 ? null : str);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment2, String str) {
        super(str);
        C12775o.m28639i(fragment2, "fragment");
        this.fragment = fragment2;
    }
}
