package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import com.braze.configuration.C4218b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import p018a0.C2106e;
import p031b0.C2814i;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8278g;
import p126j0.C8300j;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;

/* renamed from: bo.app.k6 */
public final class C3320k6 implements C3787x2 {

    /* renamed from: o */
    public static final C3321a f1984o = new C3321a((DefaultConstructorMarker) null);

    /* renamed from: p */
    private static final long f1985p = TimeUnit.SECONDS.toMillis(30);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static final String f1986q = C8266c.m16405n(C3320k6.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1987a;

    /* renamed from: b */
    private final C3023b2 f1988b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C3285j2 f1989c;

    /* renamed from: d */
    private C3285j2 f1990d;

    /* renamed from: e */
    private final long f1991e;

    /* renamed from: f */
    private final SharedPreferences f1992f;

    /* renamed from: g */
    private final C3727u2 f1993g;

    /* renamed from: h */
    private final C2994a3 f1994h;

    /* renamed from: i */
    private final AtomicInteger f1995i;

    /* renamed from: j */
    private final Queue<C3766w2> f1996j;

    /* renamed from: k */
    private final Map<String, C3024b3> f1997k;

    /* renamed from: l */
    private volatile long f1998l;

    /* renamed from: m */
    private final ReentrantLock f1999m = new ReentrantLock();

    /* renamed from: n */
    private final ReentrantLock f2000n = new ReentrantLock();

    /* renamed from: bo.app.k6$a */
    public static final class C3321a {

        /* renamed from: bo.app.k6$a$a */
        static final class C3322a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3322a f2001b = new C3322a();

            C3322a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        /* renamed from: bo.app.k6$a$b */
        static final class C3323b extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ int f2002b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3323b(int i) {
                super(0);
                this.f2002b = i;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Using override minimum display interval: ", Integer.valueOf(this.f2002b));
            }
        }

        /* renamed from: bo.app.k6$a$c */
        static final class C3324c extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ long f2003b;

            /* renamed from: c */
            final /* synthetic */ long f2004c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3324c(long j, long j2) {
                super(0);
                this.f2003b = j;
                this.f2004c = j2;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement met for matched trigger. Action display time: " + this.f2003b + " . Next viable display time: " + this.f2004c;
            }
        }

        /* renamed from: bo.app.k6$a$d */
        static final class C3325d extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ long f2005b;

            /* renamed from: c */
            final /* synthetic */ long f2006c;

            /* renamed from: d */
            final /* synthetic */ long f2007d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3325d(long j, long j2, long j3) {
                super(0);
                this.f2005b = j;
                this.f2006c = j2;
                this.f2007d = j3;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement and triggered action override time interval requirement of " + this.f2005b + " not met for matched trigger. Returning null. Next viable display time: " + this.f2006c + ". Action display time: " + this.f2007d;
            }
        }

        /* renamed from: bo.app.k6$a$e */
        static final class C3326e extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C2106e f2008b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3326e(C2106e eVar) {
                super(0);
                this.f2008b = eVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Trigger internal timeout exceeded. Attempting to log trigger failure: ", this.f2008b);
            }
        }

        /* renamed from: bo.app.k6$a$f */
        static final class C3327f extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ C2106e f2009b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3327f(C2106e eVar) {
                super(0);
                this.f2009b = eVar;
            }

            /* renamed from: a */
            public final String invoke() {
                return C12775o.m28647q("Trigger ID is blank. Not logging trigger failure: ", this.f2009b);
            }
        }

        public /* synthetic */ C3321a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo29219a(C3766w2 w2Var, C3024b3 b3Var, long j, long j2) {
            long j3;
            C3766w2 w2Var2 = w2Var;
            C12775o.m28639i(w2Var2, "triggerEvent");
            C12775o.m28639i(b3Var, "action");
            if (w2Var2 instanceof C3837z5) {
                C8266c.m16397f(C8266c.f11641a, C3320k6.f1986q, (C8266c.C8267a) null, (Throwable) null, false, C3322a.f2001b, 14, (Object) null);
                return true;
            }
            long i = C8273e.m16436i() + ((long) b3Var.mo28657f().mo29596g());
            int l = b3Var.mo28657f().mo29598l();
            if (l != -1) {
                C8266c.m16397f(C8266c.f11641a, C3320k6.f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3323b(l), 14, (Object) null);
                j3 = j + ((long) l);
            } else {
                j3 = j + j2;
            }
            long j4 = j3;
            if (i >= j4) {
                C8266c.m16397f(C8266c.f11641a, C3320k6.f1986q, C8266c.C8267a.I, (Throwable) null, false, new C3324c(i, j4), 12, (Object) null);
                return true;
            }
            C8266c.m16397f(C8266c.f11641a, C3320k6.f1986q, C8266c.C8267a.I, (Throwable) null, false, new C3325d(j2, j4, i), 12, (Object) null);
            return false;
        }

        private C3321a() {
        }

        /* renamed from: a */
        public final void mo29218a(C3023b2 b2Var, String str, C2106e eVar) {
            C12775o.m28639i(b2Var, "brazeManager");
            C12775o.m28639i(str, "triggerAnalyticsId");
            C12775o.m28639i(eVar, "inAppMessageFailureType");
            C8266c cVar = C8266c.f11641a;
            C8266c.m16397f(cVar, C3320k6.f1986q, C8266c.C8267a.I, (Throwable) null, false, new C3326e(eVar), 12, (Object) null);
            if (C13754v.m31532t(str)) {
                C8266c.m16397f(cVar, C3320k6.f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3327f(eVar), 14, (Object) null);
                return;
            }
            C3785x1 a = C3240j.f1842h.mo29066a(str, eVar);
            if (a != null) {
                b2Var.mo28641a(a);
            }
        }
    }

    /* renamed from: bo.app.k6$b */
    static final class C3328b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3328b f2010b = new C3328b();

        C3328b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    /* renamed from: bo.app.k6$c */
    static final class C3329c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f2011b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3329c(C3766w2 w2Var) {
            super(0);
            this.f2011b = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "New incoming <" + this.f2011b.mo28842d() + ">. Searching for matching triggers.";
        }
    }

    /* renamed from: bo.app.k6$d */
    static final class C3330d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f2012b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3330d(C3766w2 w2Var) {
            super(0);
            this.f2012b = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "No action found for " + this.f2012b.mo28842d() + " event, publishing NoMatchingTriggerEvent";
        }
    }

    /* renamed from: bo.app.k6$e */
    static final class C3331e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2013b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3331e(C3024b3 b3Var) {
            super(0);
            this.f2013b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Found potential triggered action for incoming trigger event. Action id " + this.f2013b.getId() + '.';
        }
    }

    /* renamed from: bo.app.k6$f */
    static final class C3332f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f2014b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3332f(C3766w2 w2Var) {
            super(0);
            this.f2014b = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to match triggered action for incoming <" + this.f2014b.mo28842d() + ">.";
        }
    }

    /* renamed from: bo.app.k6$g */
    static final class C3333g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f2015b;

        /* renamed from: c */
        final /* synthetic */ Ref$ObjectRef<C3024b3> f2016c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3333g(C3766w2 w2Var, Ref$ObjectRef<C3024b3> ref$ObjectRef) {
            super(0);
            this.f2015b = w2Var;
            this.f2016c = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("\n     Found best triggered action for incoming trigger event ");
            if (this.f2015b.mo29015a() != null) {
                str = C8278g.m16456j((JSONObject) this.f2015b.mo29015a().forJsonPut());
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(".\n     Matched Action id: ");
            sb.append(((C3024b3) this.f2016c.f20403b).getId());
            sb.append(".\n                ");
            return C13745o.m31511f(sb.toString());
        }
    }

    @C12739f(mo50609c = "com.braze.triggers.managers.TriggerManager$performTriggeredAction$1", mo50610f = "TriggerManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.k6$h */
    static final class C3334h extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2017b;

        /* renamed from: c */
        final /* synthetic */ C3024b3 f2018c;

        /* renamed from: d */
        final /* synthetic */ C3320k6 f2019d;

        /* renamed from: e */
        final /* synthetic */ C3766w2 f2020e;

        /* renamed from: f */
        final /* synthetic */ long f2021f;

        /* renamed from: g */
        final /* synthetic */ long f2022g;

        /* renamed from: bo.app.k6$h$a */
        static final class C3335a extends C12777p implements C13074a<String> {

            /* renamed from: b */
            final /* synthetic */ long f2023b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3335a(long j) {
                super(0);
                this.f2023b = j;
            }

            /* renamed from: a */
            public final String invoke() {
                return "Performing triggered action after a delay of " + this.f2023b + " ms.";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3334h(C3024b3 b3Var, C3320k6 k6Var, C3766w2 w2Var, long j, long j2, C12074d<? super C3334h> dVar) {
            super(1, dVar);
            this.f2018c = b3Var;
            this.f2019d = k6Var;
            this.f2020e = w2Var;
            this.f2021f = j;
            this.f2022g = j2;
        }

        /* renamed from: a */
        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C3334h) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C3334h(this.f2018c, this.f2019d, this.f2020e, this.f2021f, this.f2022g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2017b == 0) {
                C11910n.m25701b(obj);
                C8266c.m16397f(C8266c.f11641a, C3320k6.f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3335a(this.f2022g), 14, (Object) null);
                this.f2018c.mo28652a(this.f2019d.f1987a, this.f2019d.f1989c, this.f2020e, this.f2021f);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.k6$i */
    static final class C3336i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ List<C3024b3> f2024b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3336i(List<? extends C3024b3> list) {
            super(0);
            this.f2024b = list;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Registering " + this.f2024b.size() + " new triggered actions.";
        }
    }

    /* renamed from: bo.app.k6$j */
    static final class C3337j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2025b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3337j(C3024b3 b3Var) {
            super(0);
            this.f2025b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Registering triggered action id " + this.f2025b.getId() + ' ';
        }
    }

    /* renamed from: bo.app.k6$k */
    static final class C3338k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3338k f2026b = new C3338k();

        C3338k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    /* renamed from: bo.app.k6$l */
    static final class C3339l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3339l f2027b = new C3339l();

        C3339l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    /* renamed from: bo.app.k6$m */
    static final class C3340m extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2028b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3340m(String str) {
            super(0);
            this.f2028b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank serialized triggered action string for action id " + this.f2028b + " from shared preferences. Not parsing.";
        }
    }

    /* renamed from: bo.app.k6$n */
    static final class C3341n extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2029b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3341n(C3024b3 b3Var) {
            super(0);
            this.f2029b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Retrieving templated triggered action id " + this.f2029b.getId() + " from local storage.";
        }
    }

    /* renamed from: bo.app.k6$o */
    static final class C3342o extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3342o f2030b = new C3342o();

        C3342o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    /* renamed from: bo.app.k6$p */
    static final class C3343p extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2031b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3343p(C3024b3 b3Var) {
            super(0);
            this.f2031b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger manager received failed triggered action with id: <" + this.f2031b.getId() + ">. Will attempt to perform fallback triggered actions, if present.";
        }
    }

    /* renamed from: bo.app.k6$q */
    static final class C3344q extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3344q f2032b = new C3344q();

        C3344q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
        }
    }

    /* renamed from: bo.app.k6$r */
    static final class C3345r extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3345r f2033b = new C3345r();

        C3345r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    /* renamed from: bo.app.k6$s */
    static final class C3346s extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2034b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3346s(C3024b3 b3Var) {
            super(0);
            this.f2034b = b3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Fallback trigger has expired. Trigger id: ", this.f2034b.getId());
        }
    }

    /* renamed from: bo.app.k6$t */
    static final class C3347t extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3024b3 f2035b;

        /* renamed from: c */
        final /* synthetic */ long f2036c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3347t(C3024b3 b3Var, long j) {
            super(0);
            this.f2035b = b3Var;
            this.f2036c = j;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Performing fallback triggered action with id: <" + this.f2035b.getId() + "> with a delay: " + this.f2036c + " ms";
        }
    }

    @C12739f(mo50609c = "com.braze.triggers.managers.TriggerManager$retryTriggeredAction$6", mo50610f = "TriggerManager.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: bo.app.k6$u */
    static final class C3348u extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: b */
        int f2037b;

        /* renamed from: c */
        final /* synthetic */ C3024b3 f2038c;

        /* renamed from: d */
        final /* synthetic */ C3320k6 f2039d;

        /* renamed from: e */
        final /* synthetic */ C3766w2 f2040e;

        /* renamed from: f */
        final /* synthetic */ long f2041f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3348u(C3024b3 b3Var, C3320k6 k6Var, C3766w2 w2Var, long j, C12074d<? super C3348u> dVar) {
            super(1, dVar);
            this.f2038c = b3Var;
            this.f2039d = k6Var;
            this.f2040e = w2Var;
            this.f2041f = j;
        }

        /* renamed from: a */
        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C3348u) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C3348u(this.f2038c, this.f2039d, this.f2040e, this.f2041f, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f2037b == 0) {
                C11910n.m25701b(obj);
                this.f2038c.mo28652a(this.f2039d.f1987a, this.f2039d.f1989c, this.f2040e, this.f2041f);
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: bo.app.k6$v */
    static final class C3349v extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3349v f2042b = new C3349v();

        C3349v() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public C3320k6(Context context, C3023b2 b2Var, C3285j2 j2Var, C3285j2 j2Var2, C4218b bVar, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(b2Var, "brazeManager");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(j2Var2, "externalEventPublisher");
        C12775o.m28639i(bVar, "configurationProvider");
        C12775o.m28639i(str2, "apiKey");
        Context applicationContext = context.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        this.f1987a = applicationContext;
        this.f1988b = b2Var;
        this.f1989c = j2Var;
        this.f1990d = j2Var2;
        this.f1991e = bVar.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.triggers.actions", C8300j.m16489c(context, str, str2)), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f1992f = sharedPreferences;
        this.f1993g = new C3055c6(context, str2);
        this.f1994h = new C3468n6(context, str, str2);
        this.f1997k = mo29217h();
        this.f1995i = new AtomicInteger(0);
        this.f1996j = new ArrayDeque();
        m3239i();
    }

    /* renamed from: i */
    private final void m3239i() {
        C8266c.m16397f(C8266c.f11641a, f1986q, C8266c.C8267a.f11650f, (Throwable) null, false, C3349v.f2042b, 12, (Object) null);
        this.f1989c.mo29153a(new C3101d7(this), C3153f6.class);
        this.f1989c.mo29153a(new C3131e7(this), C3130e6.class);
    }

    /* renamed from: d */
    public long mo29213d() {
        return this.f1998l;
    }

    /* renamed from: e */
    public final Queue<C3766w2> mo29214e() {
        return this.f1996j;
    }

    /* renamed from: f */
    public C2994a3 mo29215f() {
        return this.f1994h;
    }

    /* renamed from: g */
    public final SharedPreferences mo29216g() {
        return this.f1992f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049 A[Catch:{ Exception -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d A[Catch:{ Exception -> 0x0087 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, p042bo.app.C3024b3> mo29217h() {
        /*
            r15 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r15.f1992f
            java.util.Map r1 = r1.getAll()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0018
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            if (r4 == 0) goto L_0x001c
            return r0
        L_0x001c:
            java.util.Set r1 = r1.keySet()
            java.util.Set r1 = kotlin.collections.C12686e0.m28209F0(r1)
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0087 }
        L_0x0028:
            boolean r4 = r1.hasNext()     // Catch:{ Exception -> 0x0087 }
            if (r4 == 0) goto L_0x0098
            java.lang.Object r4 = r1.next()     // Catch:{ Exception -> 0x0087 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0087 }
            android.content.SharedPreferences r5 = r15.f1992f     // Catch:{ Exception -> 0x0087 }
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch:{ Exception -> 0x0087 }
            if (r5 == 0) goto L_0x0046
            boolean r6 = p454wf.C13754v.m31532t(r5)     // Catch:{ Exception -> 0x0087 }
            if (r6 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r6 = r2
            goto L_0x0047
        L_0x0046:
            r6 = r3
        L_0x0047:
            if (r6 == 0) goto L_0x005d
            j0.c r7 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0087 }
            java.lang.String r8 = f1986q     // Catch:{ Exception -> 0x0087 }
            j0.c$a r9 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x0087 }
            r10 = 0
            r11 = 0
            bo.app.k6$m r12 = new bo.app.k6$m     // Catch:{ Exception -> 0x0087 }
            r12.<init>(r4)     // Catch:{ Exception -> 0x0087 }
            r13 = 12
            r14 = 0
            p126j0.C8266c.m16397f(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0028
        L_0x005d:
            bo.app.m6 r4 = p042bo.app.C3440m6.f2184a     // Catch:{ Exception -> 0x0087 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x0087 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0087 }
            bo.app.b2 r5 = r15.f1988b     // Catch:{ Exception -> 0x0087 }
            bo.app.b3 r4 = r4.mo29358b(r6, r5)     // Catch:{ Exception -> 0x0087 }
            if (r4 != 0) goto L_0x006d
            goto L_0x0028
        L_0x006d:
            j0.c r5 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x0087 }
            java.lang.String r6 = f1986q     // Catch:{ Exception -> 0x0087 }
            r7 = 0
            r8 = 0
            r9 = 0
            bo.app.k6$n r10 = new bo.app.k6$n     // Catch:{ Exception -> 0x0087 }
            r10.<init>(r4)     // Catch:{ Exception -> 0x0087 }
            r11 = 14
            r12 = 0
            p126j0.C8266c.m16397f(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0087 }
            java.lang.String r5 = r4.getId()     // Catch:{ Exception -> 0x0087 }
            r0.put(r5, r4)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0028
        L_0x0087:
            r1 = move-exception
            r5 = r1
            j0.c r2 = p126j0.C8266c.f11641a
            java.lang.String r3 = f1986q
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            bo.app.k6$o r7 = p042bo.app.C3320k6.C3342o.f2030b
            r6 = 0
            r8 = 8
            r9 = 0
            p126j0.C8266c.m16397f(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0098:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3320k6.mo29217h():java.util.Map");
    }

    /* renamed from: c */
    public final AtomicInteger mo29212c() {
        return this.f1995i;
    }

    /* renamed from: a */
    public void mo29205a(long j) {
        this.f1998l = j;
    }

    /* renamed from: b */
    public final void mo29209b(C3766w2 w2Var) {
        C12775o.m28639i(w2Var, "triggerEvent");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16397f(cVar, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3329c(w2Var), 14, (Object) null);
        C3024b3 c = mo29211c(w2Var);
        if (c != null) {
            mo29210b(w2Var, c);
            return;
        }
        String d = w2Var.mo28842d();
        if (d != null) {
            int hashCode = d.hashCode();
            if (hashCode != 3417674) {
                if (hashCode != 717572172) {
                    if (hashCode != 1743324417 || !d.equals("purchase")) {
                        return;
                    }
                } else if (!d.equals("custom_event")) {
                    return;
                }
            } else if (!d.equals("open")) {
                return;
            }
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3330d(w2Var), 7, (Object) null);
            C3285j2 j2Var = this.f1990d;
            String d2 = w2Var.mo28842d();
            C12775o.m28638h(d2, "triggerEvent.triggerEventType");
            j2Var.mo29152a(new C2814i(d2), C2814i.class);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final C3024b3 mo29211c(C3766w2 w2Var) {
        C3766w2 w2Var2 = w2Var;
        C12775o.m28639i(w2Var2, NotificationCompat.CATEGORY_EVENT);
        ReentrantLock reentrantLock = this.f1999m;
        reentrantLock.lock();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator<C3024b3> it = this.f1997k.values().iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                T t = (C3024b3) it.next();
                if (t.mo28656b(w2Var2) && mo29215f().mo28585b(t)) {
                    if (f1984o.mo29219a(w2Var, t, mo29213d(), this.f1991e)) {
                        C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3331e(t), 14, (Object) null);
                        int u = t.mo28657f().mo29600u();
                        if (u > i) {
                            ref$ObjectRef.f20403b = t;
                            i = u;
                        }
                        arrayList.add(t);
                    }
                }
            }
            T t2 = ref$ObjectRef.f20403b;
            if (t2 == null) {
                C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3332f(w2Var2), 14, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(t2);
            ((C3024b3) ref$ObjectRef.f20403b).mo28653a(new C3401l6(arrayList));
            C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3333g(w2Var2, ref$ObjectRef), 14, (Object) null);
            C3024b3 b3Var = (C3024b3) ref$ObjectRef.f20403b;
            reentrantLock.unlock();
            return b3Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo28762a(List<? extends C3024b3> list) {
        List<? extends C3024b3> list2 = list;
        C12775o.m28639i(list2, "triggeredActions");
        C3837z5 z5Var = new C3837z5();
        ReentrantLock reentrantLock = this.f1999m;
        reentrantLock.lock();
        try {
            this.f1997k.clear();
            SharedPreferences.Editor clear = mo29216g().edit().clear();
            C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3336i(list2), 14, (Object) null);
            boolean z = false;
            for (C3024b3 b3Var : list) {
                C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, new C3337j(b3Var), 14, (Object) null);
                this.f1997k.put(b3Var.getId(), b3Var);
                clear.putString(b3Var.getId(), String.valueOf(b3Var.forJsonPut()));
                if (b3Var.mo28656b(z5Var)) {
                    z = true;
                }
            }
            clear.apply();
            C11921v vVar = C11921v.f18618a;
            reentrantLock.unlock();
            mo29215f().mo28762a(list2);
            this.f1993g.mo28762a(list2);
            if (z) {
                C8266c.m16397f(C8266c.f11641a, f1986q, C8266c.C8267a.I, (Throwable) null, false, C3338k.f2026b, 12, (Object) null);
                mo29206a((C3766w2) z5Var);
                return;
            }
            C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, C3339l.f2027b, 14, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo29208b() {
        ReentrantLock reentrantLock = this.f2000n;
        reentrantLock.lock();
        try {
            if (mo29212c().get() <= 0) {
                C8266c.m16397f(C8266c.f11641a, f1986q, (C8266c.C8267a) null, (Throwable) null, false, C3328b.f2010b, 14, (Object) null);
                while (!mo29214e().isEmpty()) {
                    C3766w2 poll = mo29214e().poll();
                    if (poll != null) {
                        mo29209b(poll);
                    }
                }
                C11921v vVar = C11921v.f18618a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final void mo29210b(C3766w2 w2Var, C3024b3 b3Var) {
        C12775o.m28639i(w2Var, NotificationCompat.CATEGORY_EVENT);
        C12775o.m28639i(b3Var, "action");
        b3Var.mo28654a(this.f1993g.mo28761a(b3Var));
        C3632r2 f = b3Var.mo28657f();
        long e = f.mo29594a() != -1 ? w2Var.mo29018e() + ((long) f.mo29594a()) : -1;
        long millis = TimeUnit.SECONDS.toMillis((long) f.mo29596g());
        C10606a.m22557b(C10606a.f16162b, Long.valueOf(millis), (C12079g) null, new C3334h(b3Var, this, w2Var, e, millis, (C12074d<? super C3334h>) null), 2, (Object) null);
    }

    /* renamed from: a */
    public void mo29206a(C3766w2 w2Var) {
        C12775o.m28639i(w2Var, "triggerEvent");
        ReentrantLock reentrantLock = this.f2000n;
        reentrantLock.lock();
        try {
            mo29214e().add(w2Var);
            if (mo29212c().get() == 0) {
                mo29208b();
            }
            C11921v vVar = C11921v.f18618a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: a */
    public void mo29207a(C3766w2 w2Var, C3024b3 b3Var) {
        long j;
        C3766w2 w2Var2 = w2Var;
        C3024b3 b3Var2 = b3Var;
        C12775o.m28639i(w2Var2, "triggerEvent");
        C12775o.m28639i(b3Var2, "failedAction");
        C8266c cVar = C8266c.f11641a;
        String str = f1986q;
        C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, new C3343p(b3Var2), 14, (Object) null);
        C3401l6 i = b3Var.mo28659i();
        if (i == null) {
            C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, C3344q.f2032b, 14, (Object) null);
            return;
        }
        C3024b3 a = i.mo29316a();
        if (a == null) {
            C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, C3345r.f2033b, 14, (Object) null);
            return;
        }
        a.mo28653a(i);
        a.mo28654a(this.f1993g.mo28761a(a));
        long e = w2Var.mo29018e();
        C3632r2 f = a.mo28657f();
        long a2 = (long) f.mo29594a();
        long millis = TimeUnit.SECONDS.toMillis((long) f.mo29596g());
        if (a2 != -1) {
            j = a2 + e;
        } else {
            j = e + millis + f1985p;
        }
        long j2 = j;
        if (j2 < C8273e.m16435h()) {
            C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, new C3346s(a), 14, (Object) null);
            f1984o.mo29218a(this.f1988b, a.getId(), C2106e.INTERNAL_TIMEOUT_EXCEEDED);
            mo29207a(w2Var2, a);
            return;
        }
        long max = Math.max(0, (millis + e) - C8273e.m16435h());
        C8266c.m16397f(cVar, str, (C8266c.C8267a) null, (Throwable) null, false, new C3347t(a, max), 14, (Object) null);
        C10606a.m22557b(C10606a.f16162b, Long.valueOf(max), (C12079g) null, new C3348u(a, this, w2Var, j2, (C12074d<? super C3348u>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3235a(C3320k6 k6Var, C3153f6 f6Var) {
        C12775o.m28639i(k6Var, "this$0");
        C12775o.m28639i(f6Var, "$noName_0");
        k6Var.f1995i.incrementAndGet();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m3234a(C3320k6 k6Var, C3130e6 e6Var) {
        C12775o.m28639i(k6Var, "this$0");
        C12775o.m28639i(e6Var, "$noName_0");
        k6Var.f1995i.decrementAndGet();
        k6Var.mo29208b();
    }
}
