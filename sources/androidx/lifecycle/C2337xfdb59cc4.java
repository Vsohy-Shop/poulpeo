package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11910n;
import p404of.C13074a;
import p466yf.C14002n;

/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* compiled from: WithLifecycleState.kt */
public final class C2337xfdb59cc4 implements LifecycleEventObserver {
    final /* synthetic */ C13074a<R> $block;
    final /* synthetic */ C14002n<R> $co;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    C2337xfdb59cc4(Lifecycle.State state, Lifecycle lifecycle, C14002n<? super R> nVar, C13074a<? extends R> aVar) {
        this.$state = state;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$co = nVar;
        this.$block = aVar;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Object obj;
        C12775o.m28639i(lifecycleOwner, APIParams.SOURCE);
        C12775o.m28639i(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.Companion.upTo(this.$state)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            C14002n<R> nVar = this.$co;
            C13074a<R> aVar = this.$block;
            try {
                C11907m.C11908a aVar2 = C11907m.f18600b;
                obj = C11907m.m25696a(aVar.invoke());
            } catch (Throwable th) {
                C11907m.C11908a aVar3 = C11907m.f18600b;
                obj = C11907m.m25696a(C11910n.m25700a(th));
            }
            nVar.resumeWith(obj);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this);
            C14002n<R> nVar2 = this.$co;
            C11907m.C11908a aVar4 = C11907m.f18600b;
            nVar2.resumeWith(C11907m.m25696a(C11910n.m25700a(new LifecycleDestroyedException())));
        }
    }
}
