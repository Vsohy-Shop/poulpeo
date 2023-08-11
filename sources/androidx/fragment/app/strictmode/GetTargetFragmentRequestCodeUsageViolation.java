package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: GetTargetFragmentRequestCodeUsageViolation.kt */
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentRequestCodeUsageViolation(Fragment fragment) {
        super(fragment, C12775o.m28647q("Attempting to get target request code from fragment ", fragment));
        C12775o.m28639i(fragment, "fragment");
    }
}
