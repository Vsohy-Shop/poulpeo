package p117i1;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p294z1.C10791j;

/* renamed from: i1.c */
/* compiled from: DiskCacheWriteLocker */
final class C8068c {

    /* renamed from: a */
    private final Map<String, C8069a> f11321a = new HashMap();

    /* renamed from: b */
    private final C8070b f11322b = new C8070b();

    /* renamed from: i1.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C8069a {

        /* renamed from: a */
        final Lock f11323a = new ReentrantLock();

        /* renamed from: b */
        int f11324b;

        C8069a() {
        }
    }

    /* renamed from: i1.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C8070b {

        /* renamed from: a */
        private final Queue<C8069a> f11325a = new ArrayDeque();

        C8070b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C8069a mo41898a() {
            C8069a poll;
            synchronized (this.f11325a) {
                poll = this.f11325a.poll();
            }
            if (poll == null) {
                return new C8069a();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo41899b(C8069a aVar) {
            synchronized (this.f11325a) {
                if (this.f11325a.size() < 10) {
                    this.f11325a.offer(aVar);
                }
            }
        }
    }

    C8068c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41896a(String str) {
        C8069a aVar;
        synchronized (this) {
            aVar = this.f11321a.get(str);
            if (aVar == null) {
                aVar = this.f11322b.mo41898a();
                this.f11321a.put(str, aVar);
            }
            aVar.f11324b++;
        }
        aVar.f11323a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41897b(String str) {
        C8069a aVar;
        synchronized (this) {
            aVar = (C8069a) C10791j.m22948d(this.f11321a.get(str));
            int i = aVar.f11324b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f11324b = i2;
                if (i2 == 0) {
                    C8069a remove = this.f11321a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f11322b.mo41899b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f11324b);
            }
        }
        aVar.f11323a.unlock();
    }
}
