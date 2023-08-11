package p465ye;

import androidx.compose.animation.core.C0344a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p307af.C10885a;
import p364io.reactivex.exceptions.ProtocolViolationException;
import p386lg.C12861c;
import p397ne.C13016b;
import p471ze.C14109d;

/* renamed from: ye.g */
/* compiled from: SubscriptionHelper */
public enum C13925g implements C12861c {
    CANCELLED;

    /* renamed from: a */
    public static boolean m32182a(AtomicReference<C12861c> atomicReference) {
        C12861c andSet;
        C12861c cVar = atomicReference.get();
        C13925g gVar = CANCELLED;
        if (cVar == gVar || (andSet = atomicReference.getAndSet(gVar)) == gVar) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    /* renamed from: b */
    public static void m32183b(AtomicReference<C12861c> atomicReference, AtomicLong atomicLong, long j) {
        C12861c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.mo50776h(j);
        } else if (m32188g(j)) {
            C14109d.m32751a(atomicLong, j);
            C12861c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    cVar2.mo50776h(andSet);
                }
            }
        }
    }

    /* renamed from: c */
    public static boolean m32184c(AtomicReference<C12861c> atomicReference, AtomicLong atomicLong, C12861c cVar) {
        if (!m32187f(atomicReference, cVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet == 0) {
            return true;
        }
        cVar.mo50776h(andSet);
        return true;
    }

    /* renamed from: d */
    public static void m32185d(long j) {
        C10885a.m23270q(new ProtocolViolationException("More produced than requested: " + j));
    }

    /* renamed from: e */
    public static void m32186e() {
        C10885a.m23270q(new ProtocolViolationException("Subscription already set!"));
    }

    /* renamed from: f */
    public static boolean m32187f(AtomicReference<C12861c> atomicReference, C12861c cVar) {
        C13016b.m29390d(cVar, "s is null");
        if (C0344a.m496a(atomicReference, (Object) null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        m32186e();
        return false;
    }

    /* renamed from: g */
    public static boolean m32188g(long j) {
        if (j > 0) {
            return true;
        }
        C10885a.m23270q(new IllegalArgumentException("n > 0 required but it was " + j));
        return false;
    }

    /* renamed from: i */
    public static boolean m32189i(C12861c cVar, C12861c cVar2) {
        if (cVar2 == null) {
            C10885a.m23270q(new NullPointerException("next is null"));
            return false;
        } else if (cVar == null) {
            return true;
        } else {
            cVar2.cancel();
            m32186e();
            return false;
        }
    }

    public void cancel() {
    }

    /* renamed from: h */
    public void mo50776h(long j) {
    }
}
