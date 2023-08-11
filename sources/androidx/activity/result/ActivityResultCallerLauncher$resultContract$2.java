package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: ActivityResultCaller.kt */
final class ActivityResultCallerLauncher$resultContract$2 extends C12777p implements C13074a<C01211> {
    final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ActivityResultCallerLauncher$resultContract$2(ActivityResultCallerLauncher<I, O> activityResultCallerLauncher) {
        super(0);
        this.this$0 = activityResultCallerLauncher;
    }

    public final C01211 invoke() {
        final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
        return new ActivityResultContract<C11921v, O>() {
            public O parseResult(int i, Intent intent) {
                return activityResultCallerLauncher.getCallerContract().parseResult(i, intent);
            }

            public Intent createIntent(Context context, C11921v vVar) {
                C12775o.m28639i(context, "context");
                C12775o.m28639i(vVar, "input");
                return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
            }
        };
    }
}
