package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Effects.kt */
public final class LaunchedEffectImpl implements RememberObserver {
    private C14054y1 job;
    private final C13995l0 scope;
    private final C13088o<C13995l0, C12074d<? super C11921v>, Object> task;

    public LaunchedEffectImpl(C12079g gVar, C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(gVar, "parentCoroutineContext");
        C12775o.m28639i(oVar, "task");
        this.task = oVar;
        this.scope = C13999m0.m32447a(gVar);
    }

    public void onAbandoned() {
        C14054y1 y1Var = this.job;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    public void onForgotten() {
        C14054y1 y1Var = this.job;
        if (y1Var != null) {
            C14054y1.C14055a.m32600a(y1Var, (CancellationException) null, 1, (Object) null);
        }
        this.job = null;
    }

    public void onRemembered() {
        C14054y1 y1Var = this.job;
        if (y1Var != null) {
            C13944d2.m32239f(y1Var, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.job = C13985j.m32422d(this.scope, (C12079g) null, (C14004n0) null, this.task, 3, (Object) null);
    }
}
