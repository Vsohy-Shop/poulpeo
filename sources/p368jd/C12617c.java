package p368jd;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.rmn.p324ui.screens.AnimatedActivity;
import kotlin.jvm.internal.C12775o;

/* renamed from: jd.c */
/* compiled from: RetainedFragment.kt */
public abstract class C12617c extends Fragment {

    /* renamed from: b */
    private AnimatedActivity f20266b;

    /* renamed from: M0 */
    public final AnimatedActivity mo50355M0() {
        AnimatedActivity animatedActivity = this.f20266b;
        if (animatedActivity != null) {
            return animatedActivity;
        }
        C12775o.m28656z("retainedActivity");
        return null;
    }

    public void onAttach(Activity activity) {
        C12775o.m28639i(activity, "activity");
        super.onAttach(activity);
        if (activity instanceof AnimatedActivity) {
            this.f20266b = (AnimatedActivity) activity;
            return;
        }
        throw new IllegalStateException("This fragment must be created in an AppCompatActivity");
    }
}
