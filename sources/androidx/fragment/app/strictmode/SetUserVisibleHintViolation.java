package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12775o;

/* compiled from: SetUserVisibleHintViolation.kt */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        C12775o.m28639i(fragment, "fragment");
        this.isVisibleToUser = z;
    }

    public final boolean isVisibleToUser() {
        return this.isVisibleToUser;
    }
}
