package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

/* renamed from: androidx.emoji2.text.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C1977a implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f548b;

    public /* synthetic */ C1977a(String str) {
        this.f548b = str;
    }

    public final Thread newThread(Runnable runnable) {
        return ConcurrencyHelpers.lambda$createBackgroundPriorityExecutor$0(this.f548b, runnable);
    }
}
