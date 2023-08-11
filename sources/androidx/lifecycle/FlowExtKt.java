package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.C12775o;
import p314bg.C10962f;
import p314bg.C10971h;
import p355hf.C12074d;

/* compiled from: FlowExt.kt */
public final class FlowExtKt {
    public static final <T> C10962f<T> flowWithLifecycle(C10962f<? extends T> fVar, Lifecycle lifecycle, Lifecycle.State state) {
        C12775o.m28639i(fVar, "<this>");
        C12775o.m28639i(lifecycle, "lifecycle");
        C12775o.m28639i(state, "minActiveState");
        return C10971h.m23597d(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, fVar, (C12074d<? super FlowExtKt$flowWithLifecycle$1>) null));
    }

    public static /* synthetic */ C10962f flowWithLifecycle$default(C10962f fVar, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(fVar, lifecycle, state);
    }
}
