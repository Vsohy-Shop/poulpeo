package p137k1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;
import p294z1.C10788g;
import p294z1.C10792k;

/* renamed from: k1.m */
/* compiled from: ModelCache */
public class C8473m<A, B> {

    /* renamed from: a */
    private final C10788g<C8475b<A>, B> f12065a;

    /* renamed from: k1.m$a */
    /* compiled from: ModelCache */
    class C8474a extends C10788g<C8475b<A>, B> {
        C8474a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo41906j(@NonNull C8475b<A> bVar, @Nullable B b) {
            bVar.mo42508c();
        }
    }

    @VisibleForTesting
    /* renamed from: k1.m$b */
    /* compiled from: ModelCache */
    static final class C8475b<A> {

        /* renamed from: d */
        private static final Queue<C8475b<?>> f12067d = C10792k.m22954e(0);

        /* renamed from: a */
        private int f12068a;

        /* renamed from: b */
        private int f12069b;

        /* renamed from: c */
        private A f12070c;

        private C8475b() {
        }

        /* renamed from: a */
        static <A> C8475b<A> m16973a(A a, int i, int i2) {
            C8475b<A> poll;
            Queue<C8475b<?>> queue = f12067d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C8475b<>();
            }
            poll.m16974b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m16974b(A a, int i, int i2) {
            this.f12070c = a;
            this.f12069b = i;
            this.f12068a = i2;
        }

        /* renamed from: c */
        public void mo42508c() {
            Queue<C8475b<?>> queue = f12067d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8475b)) {
                return false;
            }
            C8475b bVar = (C8475b) obj;
            if (this.f12069b == bVar.f12069b && this.f12068a == bVar.f12068a && this.f12070c.equals(bVar.f12070c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f12068a * 31) + this.f12069b) * 31) + this.f12070c.hashCode();
        }
    }

    public C8473m(long j) {
        this.f12065a = new C8474a(j);
    }

    @Nullable
    /* renamed from: a */
    public B mo42505a(A a, int i, int i2) {
        C8475b a2 = C8475b.m16973a(a, i, i2);
        B g = this.f12065a.mo45698g(a2);
        a2.mo42508c();
        return g;
    }

    /* renamed from: b */
    public void mo42506b(A a, int i, int i2, B b) {
        this.f12065a.mo45700k(C8475b.m16973a(a, i, i2), b);
    }
}
