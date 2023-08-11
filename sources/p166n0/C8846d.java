package p166n0;

import android.content.Context;
import com.appboy.enums.Channel;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p156m0.C8781a;

/* renamed from: n0.d */
/* compiled from: ContainerStep.kt */
public final class C8846d extends C8842c {

    /* renamed from: b */
    public static final C8846d f12814b = new C8846d();

    /* renamed from: n0.d$a */
    /* compiled from: JsonUtils.kt */
    public static final class C8847a extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: g */
        final /* synthetic */ JSONArray f12815g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8847a(JSONArray jSONArray) {
            super(1);
            this.f12815g = jSONArray;
        }

        public final Boolean invoke(int i) {
            return Boolean.valueOf(this.f12815g.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    /* renamed from: n0.d$b */
    /* compiled from: JsonUtils.kt */
    public static final class C8848b extends C12777p implements Function1<Integer, JSONObject> {

        /* renamed from: g */
        final /* synthetic */ JSONArray f12816g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8848b(JSONArray jSONArray) {
            super(1);
            this.f12816g = jSONArray;
        }

        public final JSONObject invoke(int i) {
            Object obj = this.f12816g.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }
    }

    private C8846d() {
        super((DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo42972a(Context context, C8865o oVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(oVar, "data");
        Iterator c = mo42978c(oVar);
        while (c.hasNext()) {
            C8781a.f12718a.mo42941e(context, C8865o.m17954d(oVar, (JSONObject) c.next(), (Channel) null, 2, (Object) null));
        }
    }

    /* renamed from: b */
    public boolean mo42973b(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        return oVar.mo42993j().has("steps");
    }

    /* renamed from: c */
    public final /* synthetic */ Iterator mo42978c(C8865o oVar) {
        C12775o.m28639i(oVar, "data");
        JSONArray jSONArray = oVar.mo42993j().getJSONArray("steps");
        if (jSONArray == null) {
            return C12726w.m28524k().iterator();
        }
        return C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, jSONArray.length())), new C8847a(jSONArray)), new C8848b(jSONArray)).iterator();
    }
}
