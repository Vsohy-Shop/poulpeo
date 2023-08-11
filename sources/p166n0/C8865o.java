package p166n0;

import androidx.annotation.VisibleForTesting;
import com.appboy.enums.Channel;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p081f0.C7554a;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;
import p436tf.C13528f;

/* renamed from: n0.o */
/* compiled from: StepData.kt */
public final class C8865o {

    /* renamed from: f */
    public static final C8866a f12836f = new C8866a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final JSONObject f12837a;

    /* renamed from: b */
    private final Channel f12838b;

    /* renamed from: c */
    private final Lazy f12839c;

    /* renamed from: d */
    private final Lazy f12840d;

    /* renamed from: e */
    private final Lazy f12841e;

    /* renamed from: n0.o$a */
    /* compiled from: StepData.kt */
    public static final class C8866a {
        private C8866a() {
        }

        public /* synthetic */ C8866a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: n0.o$b */
    /* compiled from: StepData.kt */
    static final class C8867b extends C12777p implements C13074a<List<? extends Object>> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12842g;

        /* renamed from: n0.o$b$a */
        /* compiled from: JsonUtils.kt */
        public static final class C8868a extends C12777p implements Function1<Integer, Boolean> {

            /* renamed from: g */
            final /* synthetic */ JSONArray f12843g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8868a(JSONArray jSONArray) {
                super(1);
                this.f12843g = jSONArray;
            }

            public final Boolean invoke(int i) {
                return Boolean.valueOf(this.f12843g.opt(i) instanceof Object);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }

        /* renamed from: n0.o$b$b */
        /* compiled from: JsonUtils.kt */
        public static final class C8869b extends C12777p implements Function1<Integer, Object> {

            /* renamed from: g */
            final /* synthetic */ JSONArray f12844g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8869b(JSONArray jSONArray) {
                super(1);
                this.f12844g = jSONArray;
            }

            public final Object invoke(int i) {
                Object obj = this.f12844g.get(i);
                if (obj != null) {
                    return obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8867b(C8865o oVar) {
            super(0);
            this.f12842g = oVar;
        }

        public final List<Object> invoke() {
            Iterator it;
            JSONArray optJSONArray = this.f12842g.mo42993j().optJSONArray("args");
            if (optJSONArray == null) {
                it = C12726w.m28524k().iterator();
            } else {
                it = C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, optJSONArray.length())), new C8868a(optJSONArray)), new C8869b(optJSONArray)).iterator();
            }
            return C13662o.m31293z(C13657m.m31269c(it));
        }
    }

    /* renamed from: n0.o$c */
    /* compiled from: StepData.kt */
    static final class C8870c extends C12777p implements C13074a<Object> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12845g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8870c(C8865o oVar) {
            super(0);
            this.f12845g = oVar;
        }

        public final Object invoke() {
            return this.f12845g.mo42987e(0);
        }
    }

    /* renamed from: n0.o$d */
    /* compiled from: StepData.kt */
    static final class C8871d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f12846g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12847h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8871d(int i, C8865o oVar) {
            super(0);
            this.f12846g = i;
            this.f12847h = oVar;
        }

        public final String invoke() {
            return "Expected " + this.f12846g + " arguments. Got: " + this.f12847h.m17955f();
        }
    }

    /* renamed from: n0.o$e */
    /* compiled from: StepData.kt */
    static final class C8872e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C13528f f12848g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12849h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8872e(C13528f fVar, C8865o oVar) {
            super(0);
            this.f12848g = fVar;
            this.f12849h = oVar;
        }

        public final String invoke() {
            return "Expected " + this.f12848g + " arguments. Got: " + this.f12849h.m17955f();
        }
    }

    /* renamed from: n0.o$f */
    /* compiled from: StepData.kt */
    static final class C8873f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f12850g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12851h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8873f(int i, C8865o oVar) {
            super(0);
            this.f12850g = i;
            this.f12851h = oVar;
        }

        public final String invoke() {
            return "Argument [" + this.f12850g + "] is not a JSONObject. Source: " + this.f12851h.mo42993j();
        }
    }

    /* renamed from: n0.o$g */
    /* compiled from: StepData.kt */
    static final class C8874g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f12852g;

        /* renamed from: h */
        final /* synthetic */ C8865o f12853h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8874g(int i, C8865o oVar) {
            super(0);
            this.f12852g = i;
            this.f12853h = oVar;
        }

        public final String invoke() {
            return "Argument [" + this.f12852g + "] is not a String. Source: " + this.f12853h.mo42993j();
        }
    }

    /* renamed from: n0.o$h */
    /* compiled from: StepData.kt */
    static final class C8875h extends C12777p implements C13074a<Object> {

        /* renamed from: g */
        final /* synthetic */ C8865o f12854g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8875h(C8865o oVar) {
            super(0);
            this.f12854g = oVar;
        }

        public final Object invoke() {
            return this.f12854g.mo42987e(1);
        }
    }

    public C8865o(JSONObject jSONObject, Channel channel) {
        C12775o.m28639i(jSONObject, "srcJson");
        C12775o.m28639i(channel, "channel");
        this.f12837a = jSONObject;
        this.f12838b = channel;
        this.f12839c = C11901h.m25690b(new C8867b(this));
        this.f12840d = C11901h.m25690b(new C8870c(this));
        this.f12841e = C11901h.m25690b(new C8875h(this));
    }

    /* renamed from: d */
    public static /* synthetic */ C8865o m17954d(C8865o oVar, JSONObject jSONObject, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = oVar.f12837a;
        }
        if ((i & 2) != 0) {
            channel = oVar.f12838b;
        }
        return oVar.mo42986c(jSONObject, channel);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final List<Object> m17955f() {
        return (List) this.f12839c.getValue();
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m17956l(C8865o oVar, int i, C13528f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            fVar = null;
        }
        return oVar.mo42994k(i, fVar);
    }

    /* renamed from: b */
    public final C7554a mo42985b(int i) {
        Object c0 = C12686e0.m28224c0(m17955f(), i);
        if (c0 == null || !(c0 instanceof JSONObject)) {
            return null;
        }
        return new C7554a((JSONObject) c0);
    }

    /* renamed from: c */
    public final C8865o mo42986c(JSONObject jSONObject, Channel channel) {
        C12775o.m28639i(jSONObject, "srcJson");
        C12775o.m28639i(channel, "channel");
        return new C8865o(jSONObject, channel);
    }

    @VisibleForTesting
    /* renamed from: e */
    public final Object mo42987e(int i) {
        return C12686e0.m28224c0(m17955f(), i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8865o)) {
            return false;
        }
        C8865o oVar = (C8865o) obj;
        if (C12775o.m28634d(this.f12837a, oVar.f12837a) && this.f12838b == oVar.f12838b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final Channel mo42989g() {
        return this.f12838b;
    }

    /* renamed from: h */
    public final Object mo42990h() {
        return this.f12840d.getValue();
    }

    public int hashCode() {
        return (this.f12837a.hashCode() * 31) + this.f12838b.hashCode();
    }

    /* renamed from: i */
    public final Object mo42992i() {
        return this.f12841e.getValue();
    }

    /* renamed from: j */
    public final JSONObject mo42993j() {
        return this.f12837a;
    }

    /* renamed from: k */
    public final boolean mo42994k(int i, C13528f fVar) {
        if (i != -1 && m17955f().size() != i) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8871d(i, this), 7, (Object) null);
            return false;
        } else if (fVar == null || fVar.mo53154t(m17955f().size())) {
            return true;
        } else {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8872e(fVar, this), 7, (Object) null);
            return false;
        }
    }

    /* renamed from: m */
    public final boolean mo42995m(int i) {
        Object e = mo42987e(i);
        if (e == null || (e instanceof JSONObject)) {
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8873f(i, this), 7, (Object) null);
        return false;
    }

    /* renamed from: n */
    public final boolean mo42996n(int i) {
        if (mo42987e(i) instanceof String) {
            return true;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C8874g(i, this), 7, (Object) null);
        return false;
    }

    public String toString() {
        return "Channel " + this.f12838b + " and json\n" + C8278g.m16456j(this.f12837a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8865o(JSONObject jSONObject, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
