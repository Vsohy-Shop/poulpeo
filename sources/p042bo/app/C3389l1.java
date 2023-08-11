package p042bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p057d0.C7208a;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.l1 */
public final class C3389l1 {

    /* renamed from: a */
    public static final C3389l1 f2100a = new C3389l1();

    /* renamed from: bo.app.l1$a */
    static final class C3390a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3390a f2101b = new C3390a();

        C3390a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank geofence Json. Not parsing.";
        }
    }

    /* renamed from: bo.app.l1$b */
    static final class C3391b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2102b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3391b(JSONObject jSONObject) {
            super(0);
            this.f2102b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize geofence Json due to JSONException: ", this.f2102b);
        }
    }

    /* renamed from: bo.app.l1$c */
    static final class C3392c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2103b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3392c(JSONObject jSONObject) {
            super(0);
            this.f2103b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize geofence Json:", this.f2103b);
        }
    }

    private C3389l1() {
    }

    /* renamed from: a */
    public static final List<C7208a> m3354a(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "geofenceJson");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                try {
                    C8266c.m16396e(C8266c.f11641a, f2100a, C8266c.C8267a.f11651g, (Throwable) null, false, C3390a.f2101b, 6, (Object) null);
                } catch (JSONException e) {
                    C8266c.m16396e(C8266c.f11641a, f2100a, C8266c.C8267a.f11651g, e, false, new C3391b(optJSONObject), 4, (Object) null);
                } catch (Exception e2) {
                    C8266c.m16396e(C8266c.f11641a, f2100a, C8266c.C8267a.f11649e, e2, false, new C3392c(optJSONObject), 4, (Object) null);
                }
            } else {
                arrayList.add(new C7208a(optJSONObject));
            }
            i = i2;
        }
        return arrayList;
    }
}
