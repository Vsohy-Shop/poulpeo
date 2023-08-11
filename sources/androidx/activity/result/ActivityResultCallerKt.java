package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: ActivityResultCaller.kt */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<C11921v> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, ActivityResultRegistry activityResultRegistry, Function1<? super O, C11921v> function1) {
        C12775o.m28639i(activityResultCaller, "<this>");
        C12775o.m28639i(activityResultContract, "contract");
        C12775o.m28639i(activityResultRegistry, "registry");
        C12775o.m28639i(function1, "callback");
        ActivityResultLauncher<I> registerForActivityResult = activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new C0126b(function1));
        C12775o.m28638h(registerForActivityResult, "registerForActivityResul…egistry) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, activityResultContract, i);
    }

    /* access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$0(Function1 function1, Object obj) {
        C12775o.m28639i(function1, "$callback");
        function1.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void registerForActivityResult$lambda$1(Function1 function1, Object obj) {
        C12775o.m28639i(function1, "$callback");
        function1.invoke(obj);
    }

    public static final <I, O> ActivityResultLauncher<C11921v> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, Function1<? super O, C11921v> function1) {
        C12775o.m28639i(activityResultCaller, "<this>");
        C12775o.m28639i(activityResultContract, "contract");
        C12775o.m28639i(function1, "callback");
        ActivityResultLauncher<I> registerForActivityResult = activityResultCaller.registerForActivityResult(activityResultContract, new C0125a(function1));
        C12775o.m28638h(registerForActivityResult, "registerForActivityResul…ontract) { callback(it) }");
        return new ActivityResultCallerLauncher(registerForActivityResult, activityResultContract, i);
    }
}
