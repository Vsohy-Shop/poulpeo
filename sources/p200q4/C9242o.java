package p200q4;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: q4.o */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class C9242o implements Executor {

    /* renamed from: b */
    public final /* synthetic */ Handler f13586b;

    public /* synthetic */ C9242o(Handler handler) {
        this.f13586b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f13586b.post(runnable);
    }
}
