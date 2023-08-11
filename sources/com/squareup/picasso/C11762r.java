package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C11751p;
import com.squareup.picasso.C11774x;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.r */
/* compiled from: PicassoExecutorService */
class C11762r extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.r$a */
    /* compiled from: PicassoExecutorService */
    private static final class C11763a extends FutureTask<C11723c> implements Comparable<C11763a> {

        /* renamed from: b */
        private final C11723c f18334b;

        C11763a(C11723c cVar) {
            super(cVar, (Object) null);
            this.f18334b = cVar;
        }

        /* renamed from: a */
        public int compareTo(C11763a aVar) {
            C11751p.C11758f r = this.f18334b.mo48674r();
            C11751p.C11758f r2 = aVar.f18334b.mo48674r();
            if (r == r2) {
                return this.f18334b.f18206b - aVar.f18334b.f18206b;
            }
            return r2.ordinal() - r.ordinal();
        }
    }

    C11762r() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C11774x.C11777c());
    }

    /* renamed from: b */
    private void m25245b(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo48757a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m25245b(3);
            return;
        }
        int type = networkInfo.getType();
        if (type == 0) {
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    m25245b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            m25245b(3);
                            return;
                        default:
                            m25245b(3);
                            return;
                    }
            }
            m25245b(2);
        } else if (type == 1 || type == 6 || type == 9) {
            m25245b(4);
        } else {
            m25245b(3);
        }
    }

    public Future<?> submit(Runnable runnable) {
        C11763a aVar = new C11763a((C11723c) runnable);
        execute(aVar);
        return aVar;
    }
}
