package p363ig;

import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util;

/* renamed from: ig.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12151a implements ThreadFactory {

    /* renamed from: b */
    public final /* synthetic */ String f19033b;

    /* renamed from: c */
    public final /* synthetic */ boolean f19034c;

    public /* synthetic */ C12151a(String str, boolean z) {
        this.f19033b = str;
        this.f19034c = z;
    }

    public final Thread newThread(Runnable runnable) {
        return Util.m38876threadFactory$lambda1(this.f19033b, this.f19034c, runnable);
    }
}
