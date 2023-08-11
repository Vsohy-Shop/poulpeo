package p103ga;

import androidx.appcompat.app.AppCompatActivity;
import com.rmn.api.p322v2.common.model.NewFeature;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p334ed.C11884a;
import p346gd.C12016a;

/* renamed from: ga.d */
/* compiled from: PLPNewFeatureDialogWrapper */
public class C7839d extends C12016a {

    /* renamed from: b */
    private static C7837c f10915b;

    /* renamed from: e */
    public static void m15329e() {
        C7837c cVar = f10915b;
        if (cVar != null && cVar.isVisible()) {
            f10915b.dismiss();
        }
    }

    /* renamed from: f */
    public static void m15330f(AppCompatActivity appCompatActivity) {
        try {
            JSONArray jSONArray = C12016a.m26092c().getJSONArray("features");
            if (jSONArray.length() != 0) {
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new NewFeature((String) jSONObject.opt("title"), (String) jSONObject.opt("description"), (String) jSONObject.opt("image_name")));
                }
                if (!arrayList.isEmpty()) {
                    f10915b = C7837c.f10911i.mo41546a(arrayList);
                    C11884a.f18565e.mo49090c(appCompatActivity, "new_features_dialog", f10915b);
                    C12016a.m26091b(appCompatActivity);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
