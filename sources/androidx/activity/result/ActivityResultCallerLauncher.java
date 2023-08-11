package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: ActivityResultCaller.kt */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<C11921v> {
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final ActivityResultLauncher<I> launcher;
    private final Lazy resultContract$delegate = C11901h.m25690b(new ActivityResultCallerLauncher$resultContract$2(this));

    public ActivityResultCallerLauncher(ActivityResultLauncher<I> activityResultLauncher, ActivityResultContract<I, O> activityResultContract, I i) {
        C12775o.m28639i(activityResultLauncher, "launcher");
        C12775o.m28639i(activityResultContract, "callerContract");
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i;
    }

    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    public ActivityResultContract<C11921v, O> getContract() {
        return getResultContract();
    }

    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final ActivityResultContract<C11921v, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    public void unregister() {
        this.launcher.unregister();
    }

    public void launch(C11921v vVar, ActivityOptionsCompat activityOptionsCompat) {
        C12775o.m28639i(vVar, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
