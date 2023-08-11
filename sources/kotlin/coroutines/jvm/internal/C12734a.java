package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: kotlin.coroutines.jvm.internal.a */
/* compiled from: ContinuationImpl.kt */
public abstract class C12734a implements C12074d<Object>, C12738e, Serializable {
    private final C12074d<Object> completion;

    public C12734a(C12074d<Object> dVar) {
        this.completion = dVar;
    }

    public C12074d<C11921v> create(C12074d<?> dVar) {
        C12775o.m28639i(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C12738e getCallerFrame() {
        C12074d<Object> dVar = this.completion;
        if (dVar instanceof C12738e) {
            return (C12738e) dVar;
        }
        return null;
    }

    public final C12074d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C12740g.m28570d(this);
    }

    /* access modifiers changed from: protected */
    public abstract Object invokeSuspend(Object obj);

    public final void resumeWith(Object obj) {
        C12074d dVar = this;
        while (true) {
            C12741h.m28572b(dVar);
            C12734a aVar = (C12734a) dVar;
            C12074d dVar2 = aVar.completion;
            C12775o.m28636f(dVar2);
            try {
                Object invokeSuspend = aVar.invokeSuspend(obj);
                if (invokeSuspend != C12150d.m26492c()) {
                    obj = C11907m.m25696a(invokeSuspend);
                    aVar.releaseIntercepted();
                    if (dVar2 instanceof C12734a) {
                        dVar = dVar2;
                    } else {
                        dVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C11907m.C11908a aVar2 = C11907m.f18600b;
                obj = C11907m.m25696a(C11910n.m25700a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        C12775o.m28639i(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* access modifiers changed from: protected */
    public void releaseIntercepted() {
    }
}
