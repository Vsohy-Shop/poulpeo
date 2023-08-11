package p203q7;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p113h8.C8030b;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9307q;
import p202q6.C9310t;
import p203q7.C9322f;

/* renamed from: q7.d */
/* compiled from: DefaultHeartBeatInfo */
public class C9320d implements C9322f {

    /* renamed from: d */
    private static final ThreadFactory f13686d = new C9317a();

    /* renamed from: a */
    private C8030b<C9324g> f13687a;

    /* renamed from: b */
    private final Set<C9321e> f13688b;

    /* renamed from: c */
    private final Executor f13689c;

    private C9320d(Context context, Set<C9321e> set) {
        this(new C9310t(new C9319c(context)), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f13686d));
    }

    @NonNull
    /* renamed from: e */
    public static C9284d<C9322f> m19183e() {
        return C9284d.m19065c(C9322f.class).mo43572b(C9307q.m19144j(Context.class)).mo43572b(C9307q.m19145k(C9321e.class)).mo43576f(new C9318b()).mo43574d();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ C9322f m19184f(C9287e eVar) {
        return new C9320d((Context) eVar.mo43559a(Context.class), eVar.mo43560d(C9321e.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ Thread m19186h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @NonNull
    /* renamed from: a */
    public C9322f.C9323a mo43611a(@NonNull String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean d = this.f13687a.get().mo43614d(str, currentTimeMillis);
        boolean c = this.f13687a.get().mo43613c(currentTimeMillis);
        if (d && c) {
            return C9322f.C9323a.COMBINED;
        }
        if (c) {
            return C9322f.C9323a.GLOBAL;
        }
        if (d) {
            return C9322f.C9323a.SDK;
        }
        return C9322f.C9323a.NONE;
    }

    @VisibleForTesting
    C9320d(C8030b<C9324g> bVar, Set<C9321e> set, Executor executor) {
        this.f13687a = bVar;
        this.f13688b = set;
        this.f13689c = executor;
    }
}
