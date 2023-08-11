package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: FragmentReuseViolation.kt */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        C12775o.m28639i(fragment, "fragment");
        C12775o.m28639i(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
