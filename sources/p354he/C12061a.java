package p354he;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p341fe.C11962r;
import p347ge.C12017a;

/* renamed from: he.a */
/* compiled from: AndroidSchedulers */
public final class C12061a {

    /* renamed from: a */
    private static final C11962r f18896a = C12017a.m26097d(new C12062a());

    /* renamed from: he.a$a */
    /* compiled from: AndroidSchedulers */
    static class C12062a implements Callable<C11962r> {
        C12062a() {
        }

        /* renamed from: a */
        public C11962r call() {
            return C12063b.f18897a;
        }
    }

    /* renamed from: he.a$b */
    /* compiled from: AndroidSchedulers */
    private static final class C12063b {

        /* renamed from: a */
        static final C11962r f18897a = new C12064b(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static C11962r m26244a() {
        return C12017a.m26098e(f18896a);
    }
}
