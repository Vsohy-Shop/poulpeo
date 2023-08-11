package p042bo.app;

import android.content.Context;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2108f;
import p069e0.C7358a;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.i3 */
public final class C3224i3 extends C3589q6 {

    /* renamed from: l */
    public static final C3227c f1825l = new C3227c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7358a f1826i;

    /* renamed from: j */
    private final JSONObject f1827j;

    /* renamed from: k */
    private final C3023b2 f1828k;

    /* renamed from: bo.app.i3$a */
    static final class C3225a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1829b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3225a(JSONObject jSONObject) {
            super(0);
            this.f1829b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Attempting to parse in-app message triggered action with JSON: ", C8278g.m16456j(this.f1829b));
        }
    }

    /* renamed from: bo.app.i3$b */
    static final class C3226b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3226b f1830b = new C3226b();

        C3226b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to parse in-app message triggered action.";
        }
    }

    /* renamed from: bo.app.i3$c */
    public static final class C3227c {
        public /* synthetic */ C3227c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3227c() {
        }
    }

    /* renamed from: bo.app.i3$d */
    public /* synthetic */ class C3228d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1831a;

        static {
            int[] iArr = new int[C2108f.values().length];
            iArr[C2108f.HTML_FULL.ordinal()] = 1;
            iArr[C2108f.FULL.ordinal()] = 2;
            iArr[C2108f.MODAL.ordinal()] = 3;
            iArr[C2108f.SLIDEUP.ordinal()] = 4;
            iArr[C2108f.HTML.ordinal()] = 5;
            f1831a = iArr;
        }
    }

    /* renamed from: bo.app.i3$e */
    static final class C3229e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3224i3 f1832b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3229e(C3224i3 i3Var) {
            super(0);
            this.f1832b = i3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Attempting to publish in-app message after delay of " + this.f1832b.mo28657f().mo29596g() + " seconds.";
        }
    }

    /* renamed from: bo.app.i3$f */
    static final class C3230f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f1833b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3230f(C3766w2 w2Var) {
            super(0);
            this.f1833b = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f1833b + " due to in-app message json being null";
        }
    }

    /* renamed from: bo.app.i3$g */
    static final class C3231g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3766w2 f1834b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3231g(C3766w2 w2Var) {
            super(0);
            this.f1834b = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot perform triggered action for " + this.f1834b + " due to deserialized in-app message being null";
        }
    }

    /* renamed from: bo.app.i3$h */
    static final class C3232h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3232h f1835b = new C3232h();

        C3232h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception while performing triggered action.";
        }
    }

    /* renamed from: bo.app.i3$i */
    static final class C3233i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3233i f1836b = new C3233i();

        C3233i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In-app message has no remote assets for prefetch. Returning empty list.";
        }
    }

    /* renamed from: bo.app.i3$j */
    static final class C3234j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3224i3 f1837b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3234j(C3224i3 i3Var) {
            super(0);
            this.f1837b = i3Var;
        }

        /* renamed from: a */
        public final String invoke() {
            C2108f fVar;
            C7358a a = this.f1837b.f1826i;
            if (a == null) {
                fVar = null;
            } else {
                fVar = a.mo40944I();
            }
            return C12775o.m28647q("Failed to return remote paths to assets for type: ", fVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3224i3(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject);
        C12775o.m28639i(jSONObject, "json");
        C12775o.m28639i(b2Var, "brazeManager");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C3225a(jSONObject), 6, (Object) null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.f1828k = b2Var;
        this.f1827j = jSONObject2;
        C12775o.m28638h(jSONObject2, "inAppMessageObject");
        C7358a a = C3142f3.m2915a(jSONObject2, b2Var);
        this.f1826i = a;
        if (a == null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3226b.f1830b, 6, (Object) null);
            throw new IllegalArgumentException(C12775o.m28647q("Failed to parse in-app message triggered action with JSON: ", C8278g.m16456j(jSONObject)));
        }
    }

    /* renamed from: b */
    public List<C3505o4> mo28655b() {
        List<String> list;
        boolean z;
        int i;
        ArrayList arrayList = new ArrayList();
        C7358a aVar = this.f1826i;
        C2108f fVar = null;
        if (aVar == null) {
            list = null;
        } else {
            list = aVar.mo40955W();
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3233i.f1836b, 7, (Object) null);
            return arrayList;
        }
        C7358a aVar2 = this.f1826i;
        if (aVar2 != null) {
            fVar = aVar2.mo40944I();
        }
        if (fVar == null) {
            i = -1;
        } else {
            i = C3228d.f1831a[fVar.ordinal()];
        }
        if (i == 1) {
            arrayList.add(new C3505o4(C3557p4.ZIP, list.get(0)));
        } else if (i == 2 || i == 3 || i == 4) {
            arrayList.add(new C3505o4(C3557p4.IMAGE, list.get(0)));
        } else if (i != 5) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3234j(this), 6, (Object) null);
        } else {
            for (String o4Var : list) {
                arrayList.add(new C3505o4(C3557p4.FILE, o4Var));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject;
        try {
            JSONObject e = super.mo29027e();
            if (e == null) {
                return null;
            }
            C7358a aVar = this.f1826i;
            if (aVar == null) {
                jSONObject = null;
            } else {
                jSONObject = (JSONObject) aVar.forJsonPut();
            }
            e.put("data", jSONObject);
            e.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "inapp");
            return e;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo28652a(Context context, C3285j2 j2Var, C3766w2 w2Var, long j) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(w2Var, "triggerEvent");
        try {
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C3229e(this), 7, (Object) null);
            JSONObject jSONObject = this.f1827j;
            if (jSONObject == null) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3230f(w2Var), 6, (Object) null);
                return;
            }
            C7358a a = C3142f3.m2915a(jSONObject, this.f1828k);
            if (a == null) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3231g(w2Var), 6, (Object) null);
                return;
            }
            a.mo40947L(mo29545y());
            a.mo40948M(j);
            j2Var.mo29152a(new C3163g3(w2Var, this, a, this.f1828k.mo28631a()), C3163g3.class);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C3232h.f1835b, 4, (Object) null);
        }
    }
}
