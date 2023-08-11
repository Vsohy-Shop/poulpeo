package androidx.lifecycle;

import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: Lifecycle.kt */
public abstract class LifecycleCoroutineScope implements C13995l0 {
    public abstract /* synthetic */ C12079g getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final C14054y1 launchWhenCreated(C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(oVar, "block");
        return C13985j.m32422d(this, (C12079g) null, (C14004n0) null, new LifecycleCoroutineScope$launchWhenCreated$1(this, oVar, (C12074d<? super LifecycleCoroutineScope$launchWhenCreated$1>) null), 3, (Object) null);
    }

    public final C14054y1 launchWhenResumed(C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(oVar, "block");
        return C13985j.m32422d(this, (C12079g) null, (C14004n0) null, new LifecycleCoroutineScope$launchWhenResumed$1(this, oVar, (C12074d<? super LifecycleCoroutineScope$launchWhenResumed$1>) null), 3, (Object) null);
    }

    public final C14054y1 launchWhenStarted(C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        C12775o.m28639i(oVar, "block");
        return C13985j.m32422d(this, (C12079g) null, (C14004n0) null, new LifecycleCoroutineScope$launchWhenStarted$1(this, oVar, (C12074d<? super LifecycleCoroutineScope$launchWhenStarted$1>) null), 3, (Object) null);
    }
}
