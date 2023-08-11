package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: GetRetainInstanceUsageViolation.kt */
public final class GetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, C12775o.m28647q("Attempting to get retain instance for fragment ", fragment));
        C12775o.m28639i(fragment, "fragment");
    }
}
