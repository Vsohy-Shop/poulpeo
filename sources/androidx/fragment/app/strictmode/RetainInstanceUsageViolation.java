package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: RetainInstanceUsageViolation.kt */
public abstract class RetainInstanceUsageViolation extends Violation {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RetainInstanceUsageViolation(Fragment fragment, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RetainInstanceUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        C12775o.m28639i(fragment, "fragment");
    }
}
