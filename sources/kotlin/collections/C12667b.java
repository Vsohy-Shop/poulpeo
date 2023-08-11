package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p412pf.C13212a;

/* renamed from: kotlin.collections.b */
/* compiled from: AbstractIterator.kt */
public abstract class C12667b<T> implements Iterator<T>, C13212a {

    /* renamed from: b */
    private C12670b1 f20345b = C12670b1.NotReady;

    /* renamed from: c */
    private T f20346c;

    /* renamed from: kotlin.collections.b$a */
    /* compiled from: AbstractIterator.kt */
    public /* synthetic */ class C12668a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20347a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                kotlin.collections.b1[] r0 = kotlin.collections.C12670b1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.collections.b1 r1 = kotlin.collections.C12670b1.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.collections.b1 r1 = kotlin.collections.C12670b1.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f20347a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C12667b.C12668a.<clinit>():void");
        }
    }

    /* renamed from: f */
    private final boolean m28174f() {
        this.f20345b = C12670b1.Failed;
        mo50413a();
        if (this.f20345b == C12670b1.Ready) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50413a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo50414c() {
        this.f20345b = C12670b1.Done;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo50415e(T t) {
        this.f20346c = t;
        this.f20345b = C12670b1.Ready;
    }

    public boolean hasNext() {
        boolean z;
        C12670b1 b1Var = this.f20345b;
        if (b1Var != C12670b1.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C12668a.f20347a[b1Var.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m28174f();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public T next() {
        if (hasNext()) {
            this.f20345b = C12670b1.NotReady;
            return this.f20346c;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
