package androidx.activity.contextaware;

import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
/* compiled from: ContextAware.kt */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ C14002n<R> $co;
    final /* synthetic */ Function1<Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(C14002n<R> nVar, Function1<Context, R> function1) {
        this.$co = nVar;
        this.$onContextAvailable = function1;
    }

    public void onContextAvailable(Context context) {
        Object obj;
        C12775o.m28639i(context, "context");
        C14002n<R> nVar = this.$co;
        Function1<Context, R> function1 = this.$onContextAvailable;
        try {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11907m.m25696a(function1.invoke(context));
        } catch (Throwable th) {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = C11907m.m25696a(C11910n.m25700a(th));
        }
        nVar.resumeWith(obj);
    }
}
