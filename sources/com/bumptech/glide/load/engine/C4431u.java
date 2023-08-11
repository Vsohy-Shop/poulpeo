package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p094g1.C7744c;

/* renamed from: com.bumptech.glide.load.engine.u */
/* compiled from: ResourceRecycler */
class C4431u {

    /* renamed from: a */
    private boolean f3976a;

    /* renamed from: b */
    private final Handler f3977b = new Handler(Looper.getMainLooper(), new C4432a());

    /* renamed from: com.bumptech.glide.load.engine.u$a */
    /* compiled from: ResourceRecycler */
    private static final class C4432a implements Handler.Callback {
        C4432a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C7744c) message.obj).recycle();
            return true;
        }
    }

    C4431u() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo31382a(C7744c<?> cVar, boolean z) {
        if (!this.f3976a) {
            if (!z) {
                this.f3976a = true;
                cVar.recycle();
                this.f3976a = false;
            }
        }
        this.f3977b.obtainMessage(1, cVar).sendToTarget();
    }
}
