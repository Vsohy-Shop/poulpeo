package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;

/* compiled from: WrongFragmentContainerViolation.kt */
public final class WrongFragmentContainerViolation extends Violation {
    private final ViewGroup container;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WrongFragmentContainerViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        C12775o.m28639i(fragment, "fragment");
        C12775o.m28639i(viewGroup, APIResourceDescriptors.RESOURCE_TYPE_CONTAINER);
        this.container = viewGroup;
    }

    public final ViewGroup getContainer() {
        return this.container;
    }
}
