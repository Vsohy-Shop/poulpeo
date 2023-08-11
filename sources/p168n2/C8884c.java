package p168n2;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: n2.c */
/* compiled from: BoltsExecutors.kt */
public final class C8884c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C8884c f12870d = new C8884c();

    /* renamed from: e */
    public static final C8885a f12871e = new C8885a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f12872a;

    /* renamed from: b */
    private final ScheduledExecutorService f12873b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Executor f12874c;

    /* renamed from: n2.c$a */
    /* compiled from: BoltsExecutors.kt */
    public static final class C8885a {
        private C8885a() {
        }

        public /* synthetic */ C8885a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m17985d() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            C12775o.m28638h(property, "System.getProperty(\"java…me.name\") ?: return false");
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "Locale.US");
            String lowerCase = property.toLowerCase(locale);
            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return C13755w.m31552J(lowerCase, SystemMediaRouteProvider.PACKAGE_NAME, false, 2, (Object) null);
        }

        /* renamed from: b */
        public final ExecutorService mo43006b() {
            return C8884c.f12870d.f12872a;
        }

        /* renamed from: c */
        public final Executor mo43007c() {
            return C8884c.f12870d.f12874c;
        }
    }

    /* renamed from: n2.c$b */
    /* compiled from: BoltsExecutors.kt */
    private static final class C8886b implements Executor {

        /* renamed from: c */
        public static final C8887a f12875c = new C8887a((DefaultConstructorMarker) null);

        /* renamed from: b */
        private final ThreadLocal<Integer> f12876b = new ThreadLocal<>();

        /* renamed from: n2.c$b$a */
        /* compiled from: BoltsExecutors.kt */
        public static final class C8887a {
            private C8887a() {
            }

            public /* synthetic */ C8887a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        private final int m17988a() {
            Integer num = this.f12876b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f12876b.remove();
            } else {
                this.f12876b.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        /* renamed from: b */
        private final int m17989b() {
            Integer num = this.f12876b.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f12876b.set(Integer.valueOf(intValue));
            return intValue;
        }

        public void execute(Runnable runnable) {
            C12775o.m28639i(runnable, "command");
            if (m17989b() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m17988a();
                    throw th;
                }
            } else {
                C8884c.f12871e.mo43006b().execute(runnable);
            }
            m17988a();
        }
    }

    private C8884c() {
        ExecutorService executorService;
        if (!f12871e.m17985d()) {
            executorService = Executors.newCachedThreadPool();
            C12775o.m28638h(executorService, "Executors.newCachedThreadPool()");
        } else {
            executorService = C8879a.f12861f.mo43003a();
        }
        this.f12872a = executorService;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        C12775o.m28638h(newSingleThreadScheduledExecutor, "Executors.newSingleThreadScheduledExecutor()");
        this.f12873b = newSingleThreadScheduledExecutor;
        this.f12874c = new C8886b();
    }
}
