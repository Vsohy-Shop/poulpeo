package p069e0;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2103b;
import p018a0.C2108f;
import p042bo.app.C3023b2;
import p042bo.app.C3724u0;

/* renamed from: e0.i */
public class C7389i extends C7399m {
    public C7389i() {
        mo40992i0(C2103b.CENTER_CROP);
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.forJsonPut();
            try {
                c0.put(JSONAPIResourceIdSerializer.FIELD_TYPE, mo40944I().name());
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: I */
    public C2108f mo40944I() {
        return C2108f.FULL;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7389i(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
        C2103b bVar = C2103b.CENTER_CROP;
        try {
            C3724u0 u0Var = C3724u0.f2650a;
            String string = jSONObject.getString("crop_type");
            C12775o.m28638h(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String upperCase = string.toUpperCase(locale);
            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            C2103b[] values = C2103b.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C2103b bVar2 = values[i];
                i++;
                if (C12775o.m28634d(bVar2.name(), upperCase)) {
                    bVar = bVar2;
                    mo40992i0(bVar);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused) {
        }
    }
}
