package p042bo.app;

import android.content.Context;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.x5 */
public final class C3790x5 extends C3589q6 {

    /* renamed from: m */
    public static final C3792b f2768m = new C3792b((DefaultConstructorMarker) null);

    /* renamed from: i */
    private C3023b2 f2769i;

    /* renamed from: j */
    private String f2770j;

    /* renamed from: k */
    private final List<C3505o4> f2771k = new ArrayList();

    /* renamed from: l */
    private long f2772l = -1;

    /* renamed from: bo.app.x5$a */
    static final class C3791a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2773b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3791a(JSONObject jSONObject) {
            super(0);
            this.f2773b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Parsing templated triggered action with JSON: ", C8278g.m16456j(this.f2773b));
        }
    }

    /* renamed from: bo.app.x5$b */
    public static final class C3792b {
        public /* synthetic */ C3792b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3792b() {
        }
    }

    /* renamed from: bo.app.x5$c */
    public /* synthetic */ class C3793c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2774a;

        static {
            int[] iArr = new int[C3557p4.values().length];
            iArr[C3557p4.IMAGE.ordinal()] = 1;
            iArr[C3557p4.ZIP.ordinal()] = 2;
            iArr[C3557p4.FILE.ordinal()] = 3;
            f2774a = iArr;
        }
    }

    /* renamed from: bo.app.x5$d */
    public static final class C3794d extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f2775b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3794d(JSONArray jSONArray) {
            super(1);
            this.f2775b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo29801a(int i) {
            return Boolean.valueOf(this.f2775b.opt(i) instanceof String);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo29801a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.x5$e */
    public static final class C3795e extends C12777p implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f2776b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3795e(JSONArray jSONArray) {
            super(1);
            this.f2776b = jSONArray;
        }

        /* renamed from: a */
        public final String mo29802a(int i) {
            Object obj = this.f2776b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo29802a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.x5$f */
    static final class C3796f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3796f f2777b = new C3796f();

        C3796f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert TemplatedTriggeredAction to JSON";
        }
    }

    /* renamed from: bo.app.x5$g */
    static final class C3797g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3790x5 f2778b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3797g(C3790x5 x5Var) {
            super(0);
            this.f2778b = x5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Posting templating request after delay of " + this.f2778b.mo28657f().mo29596g() + " seconds.";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3790x5(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject);
        C12775o.m28639i(jSONObject, "json");
        C12775o.m28639i(b2Var, "brazeManager");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3791a(jSONObject), 7, (Object) null);
        this.f2769i = b2Var;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString("trigger_id");
        C12775o.m28638h(string, "dataObject.getString(TRIGGER_ID)");
        this.f2770j = string;
        JSONArray optJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            m4099a(optJSONArray, C3557p4.IMAGE);
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            m4099a(optJSONArray2, C3557p4.ZIP);
        }
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("prefetch_file_urls");
        if (optJSONArray3 != null) {
            m4099a(optJSONArray3, C3557p4.FILE);
        }
    }

    /* renamed from: A */
    public final long mo29798A() {
        return this.f2772l;
    }

    /* renamed from: a */
    public void mo28652a(Context context, C3285j2 j2Var, C3766w2 w2Var, long j) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(j2Var, "internalEventPublisher");
        C12775o.m28639i(w2Var, "triggerEvent");
        this.f2772l = j;
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3797g(this), 7, (Object) null);
        this.f2769i.mo28637a(this, w2Var);
    }

    /* renamed from: b */
    public List<C3505o4> mo28655b() {
        return new ArrayList(this.f2771k);
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e = super.mo29027e();
            if (e == null) {
                return null;
            }
            e.put(JSONAPIResourceIdSerializer.FIELD_TYPE, "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.f2770j);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            JSONArray jSONArray3 = new JSONArray();
            for (C3505o4 next : this.f2771k) {
                int i = C3793c.f2774a[next.mo29447a().ordinal()];
                if (i == 1) {
                    jSONArray.put(next.mo29448b());
                } else if (i == 2) {
                    jSONArray2.put(next.mo29448b());
                } else if (i == 3) {
                    jSONArray3.put(next.mo29448b());
                }
            }
            jSONObject.put("prefetch_image_urls", jSONArray);
            jSONObject.put("prefetch_zip_urls", jSONArray2);
            jSONObject.put("prefetch_file_urls", jSONArray3);
            e.put("data", jSONObject);
            return e;
        } catch (JSONException e2) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e2, false, C3796f.f2777b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: z */
    public final String mo29799z() {
        return this.f2770j;
    }

    /* renamed from: a */
    private final void m4099a(JSONArray jSONArray, C3557p4 p4Var) {
        Iterator it;
        if (jSONArray == null) {
            it = C12726w.m28524k().iterator();
        } else {
            it = C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, jSONArray.length())), new C3794d(jSONArray)), new C3795e(jSONArray)).iterator();
        }
        while (it.hasNext()) {
            this.f2771k.add(new C3505o4(p4Var, (String) it.next()));
        }
    }
}
