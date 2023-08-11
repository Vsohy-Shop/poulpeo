package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: SetRetainInstanceUsageViolation.kt */
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetRetainInstanceUsageViolation(Fragment fragment) {
        super(fragment, C12775o.m28647q("Attempting to set retain instance for fragment ", fragment));
        C12775o.m28639i(fragment, "fragment");
    }
}
