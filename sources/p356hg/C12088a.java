package p356hg;

import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: hg.a */
/* compiled from: Mutex.kt */
public interface C12088a {

    /* renamed from: hg.a$a */
    /* compiled from: Mutex.kt */
    public static final class C12089a {
        /* renamed from: a */
        public static /* synthetic */ Object m26271a(C12088a aVar, Object obj, C12074d dVar, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return aVar.mo49516a(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        /* renamed from: b */
        public static /* synthetic */ boolean m26272b(C12088a aVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                return aVar.mo49517d(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        /* renamed from: c */
        public static /* synthetic */ void m26273c(C12088a aVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = null;
                }
                aVar.mo49519f(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    /* renamed from: a */
    Object mo49516a(Object obj, C12074d<? super C11921v> dVar);

    /* renamed from: d */
    boolean mo49517d(Object obj);

    /* renamed from: e */
    boolean mo49518e();

    /* renamed from: f */
    void mo49519f(Object obj);
}
