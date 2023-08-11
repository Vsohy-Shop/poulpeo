package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p466yf.C14010o;

@SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,90:1\n70#2:91\n70#2:92\n70#2:93\n70#2:103\n314#3,9:94\n323#3,2:104\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:91\n51#1:92\n57#1:93\n79#1:103\n78#1:94,9\n78#1:104,2\n*E\n"})
/* compiled from: Latch.kt */
public final class Latch {
    private boolean _isOpen = true;
    /* access modifiers changed from: private */
    public List<C12074d<C11921v>> awaiters = new ArrayList();
    /* access modifiers changed from: private */
    public final Object lock = new Object();
    private List<C12074d<C11921v>> spareList = new ArrayList();

    public final Object await(C12074d<? super C11921v> dVar) {
        if (isOpen()) {
            return C11921v.f18618a;
        }
        C14010o oVar = new C14010o(C12147c.m26491b(dVar), 1);
        oVar.mo53786B();
        synchronized (this.lock) {
            this.awaiters.add(oVar);
        }
        oVar.mo49526f(new Latch$await$2$2(this, oVar));
        Object y = oVar.mo53797y();
        if (y == C12150d.m26492c()) {
            C12741h.m28573c(dVar);
        }
        if (y == C12150d.m26492c()) {
            return y;
        }
        return C11921v.f18618a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            C11921v vVar = C11921v.f18618a;
        }
    }

    public final boolean isOpen() {
        boolean z;
        synchronized (this.lock) {
            z = this._isOpen;
        }
        return z;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            if (!isOpen()) {
                List<C12074d<C11921v>> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    C11907m.C11908a aVar = C11907m.f18600b;
                    list.get(i).resumeWith(C11907m.m25696a(C11921v.f18618a));
                }
                list.clear();
                C11921v vVar = C11921v.f18618a;
            }
        }
    }

    public final <R> R withClosed(C13074a<? extends R> aVar) {
        C12775o.m28639i(aVar, "block");
        closeLatch();
        try {
            return aVar.invoke();
        } finally {
            C12773m.m28629b(1);
            openLatch();
            C12773m.m28628a(1);
        }
    }
}
