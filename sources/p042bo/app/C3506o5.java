package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import p126j0.C8266c;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.o5 */
public final class C3506o5 implements C3811y1 {

    /* renamed from: c */
    public static final C3507a f2298c = new C3507a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private boolean f2299a;

    /* renamed from: b */
    private final SharedPreferences f2300b;

    /* renamed from: bo.app.o5$a */
    public static final class C3507a {
        public /* synthetic */ C3507a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3507a() {
        }
    }

    /* renamed from: bo.app.o5$b */
    static final class C3508b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2301b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3508b(C3785x1 x1Var) {
            super(0);
            this.f2301b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Storage provider is closed. Not adding event: ", this.f2301b);
        }
    }

    /* renamed from: bo.app.o5$c */
    static final class C3509c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3785x1 f2302b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3509c(C3785x1 x1Var) {
            super(0);
            this.f2302b = x1Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Adding event to storage with uid ", this.f2302b.mo29055r());
        }
    }

    /* renamed from: bo.app.o5$d */
    static final class C3510d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3510d f2303b = new C3510d();

        C3510d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Storage provider is closed. Not getting all events.";
        }
    }

    /* renamed from: bo.app.o5$e */
    static final class C3511e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef<String> f2304b;

        /* renamed from: c */
        final /* synthetic */ String f2305c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3511e(Ref$ObjectRef<String> ref$ObjectRef, String str) {
            super(0);
            this.f2304b = ref$ObjectRef;
            this.f2305c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not create BrazeEvent from [serialized event string=" + ((String) this.f2304b.f20403b) + ", unique identifier=" + this.f2305c + "] ... Deleting!";
        }
    }

    /* renamed from: bo.app.o5$f */
    static final class C3512f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3512f f2306b = new C3512f();

        C3512f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Setting this provider to closed.";
        }
    }

    /* renamed from: bo.app.o5$g */
    static final class C3513g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ Set<C3785x1> f2307b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3513g(Set<? extends C3785x1> set) {
            super(0);
            this.f2307b = set;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Storage provider is closed. Not deleting events: ", this.f2307b);
        }
    }

    /* renamed from: bo.app.o5$h */
    static final class C3514h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2308b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3514h(String str) {
            super(0);
            this.f2308b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Deleting event from storage with uid ", this.f2308b);
        }
    }

    public C3506o5(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        this.f2300b = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.appboy_event_storage", C8300j.m16489c(context, str, str2)), 0);
    }

    /* renamed from: a */
    public Collection<C3785x1> mo28570a() {
        if (this.f2299a) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3510d.f2303b, 6, (Object) null);
            return C12726w.m28524k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map<String, ?> all = this.f2300b.getAll();
        C12775o.m28638h(all, "prefs.all");
        for (Map.Entry next : all.entrySet()) {
            String str = (String) next.getKey();
            T value = next.getValue();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f20403b = "";
            if (value != null) {
                try {
                    ref$ObjectRef.f20403b = (String) value;
                    C12775o.m28638h(str, "eventId");
                    C3785x1 b = C3240j.f1842h.mo29077b((String) value, str);
                    if (b != null) {
                        linkedHashSet.add(b);
                    }
                } catch (Exception e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3511e(ref$ObjectRef, str), 4, (Object) null);
                    mo29452a(str);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return linkedHashSet;
    }

    public void close() {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3512f.f2306b, 6, (Object) null);
        this.f2299a = true;
    }

    /* renamed from: a */
    public void mo28571a(C3785x1 x1Var) {
        C12775o.m28639i(x1Var, NotificationCompat.CATEGORY_EVENT);
        if (this.f2299a) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3508b(x1Var), 6, (Object) null);
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3509c(x1Var), 3, (Object) null);
        this.f2300b.edit().putString(x1Var.mo29055r(), x1Var.mo29791p()).apply();
    }

    /* renamed from: a */
    public void mo28572a(Set<? extends C3785x1> set) {
        C12775o.m28639i(set, "events");
        if (this.f2299a) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3513g(set), 6, (Object) null);
            return;
        }
        SharedPreferences.Editor edit = this.f2300b.edit();
        for (C3785x1 r : set) {
            String r2 = r.mo29055r();
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3514h(r2), 3, (Object) null);
            edit.remove(r2);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void mo29452a(String str) {
        SharedPreferences.Editor edit = this.f2300b.edit();
        edit.remove(str);
        edit.apply();
    }
}
