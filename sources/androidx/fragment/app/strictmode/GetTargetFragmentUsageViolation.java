package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: GetTargetFragmentUsageViolation.kt */
public final class GetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentUsageViolation(Fragment fragment) {
        super(fragment, C12775o.m28647q("Attempting to get target fragment from fragment ", fragment));
        C12775o.m28639i(fragment, "fragment");
    }
}
