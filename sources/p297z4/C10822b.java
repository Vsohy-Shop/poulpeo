package p297z4;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p231t4.C9713p;

/* renamed from: z4.b */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10822b implements ThreadFactory {

    /* renamed from: b */
    private final String f16579b;

    /* renamed from: c */
    private final ThreadFactory f16580c = Executors.defaultThreadFactory();

    public C10822b(@NonNull String str) {
        C9713p.m20276k(str, "Name must not be null");
        this.f16579b = str;
    }

    @NonNull
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f16580c.newThread(new C10823c(runnable, 0));
        newThread.setName(this.f16579b);
        return newThread;
    }
}
