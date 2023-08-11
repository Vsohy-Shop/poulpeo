package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.view.View;
import androidx.compose.animation.core.C0344a;
import androidx.compose.p002ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p466yf.C14004n0;
import p466yf.C14020q1;
import p472zf.C14126f;

@StabilityInferred(parameters = 0)
@InternalComposeUiApi
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy */
/* compiled from: WindowRecomposer.android.kt */
public final class WindowRecomposerPolicy {
    public static final int $stable = 8;
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        C12775o.m28639i(windowRecomposerFactory, "expected");
        C12775o.m28639i(windowRecomposerFactory2, "factory");
        return C0344a.m496a(factory, windowRecomposerFactory, windowRecomposerFactory2);
    }

    public final Recomposer createAndInstallWindowRecomposer$ui_release(View view) {
        C12775o.m28639i(view, "rootView");
        Recomposer createRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, createRecomposer);
        C14020q1 q1Var = C14020q1.f22944b;
        Handler handler = view.getHandler();
        C12775o.m28638h(handler, "rootView.handler");
        view.addOnAttachStateChangeListener(new WindowRecomposerPolicy$createAndInstallWindowRecomposer$1(C13985j.m32422d(q1Var, C14126f.m32793b(handler, "windowRecomposer cleanup").mo53899v0(), (C14004n0) null, new C1105xbfd085b3(createRecomposer, view, (C12074d<? super C1105xbfd085b3>) null), 2, (Object) null)));
        return createRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        C12775o.m28639i(windowRecomposerFactory, "factory");
        WindowRecomposerFactory andSet = factory.getAndSet(windowRecomposerFactory);
        C12775o.m28638h(andSet, "factory.getAndSet(factory)");
        return andSet;
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        C12775o.m28639i(windowRecomposerFactory, "factory");
        factory.set(windowRecomposerFactory);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        kotlin.jvm.internal.C12773m.m28629b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (compareAndSetFactory(r5, r1) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        p336ef.C11894b.m25683a(r6, new java.lang.IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        kotlin.jvm.internal.C12773m.m28628a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R withFactory(androidx.compose.p002ui.platform.WindowRecomposerFactory r5, p404of.C13074a<? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"
            java.lang.String r1 = "factory"
            kotlin.jvm.internal.C12775o.m28639i(r5, r1)
            java.lang.String r1 = "block"
            kotlin.jvm.internal.C12775o.m28639i(r6, r1)
            androidx.compose.ui.platform.WindowRecomposerFactory r1 = r4.getAndSetFactory(r5)
            r2 = 1
            java.lang.Object r6 = r6.invoke()     // Catch:{ all -> 0x0028 }
            kotlin.jvm.internal.C12773m.m28629b(r2)
            boolean r5 = r4.compareAndSetFactory(r5, r1)
            if (r5 == 0) goto L_0x0022
            kotlin.jvm.internal.C12773m.m28628a(r2)
            return r6
        L_0x0022:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L_0x0028:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            kotlin.jvm.internal.C12773m.m28629b(r2)
            boolean r5 = r4.compareAndSetFactory(r5, r1)
            if (r5 != 0) goto L_0x003d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            p336ef.C11894b.m25683a(r6, r5)
            throw r6
        L_0x003d:
            kotlin.jvm.internal.C12773m.m28628a(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.WindowRecomposerPolicy.withFactory(androidx.compose.ui.platform.WindowRecomposerFactory, of.a):java.lang.Object");
    }
}
