package p060d3;

import android.os.Bundle;
import com.facebook.FacebookException;
import org.json.JSONException;
import org.json.JSONObject;
import p072e3.C7455a;
import p072e3.C7456b;
import p072e3.C7459c;
import p072e3.C7465f;
import p198q2.C9138d0;

/* renamed from: d3.d */
/* compiled from: WebDialogParameters */
public class C7262d {
    /* renamed from: a */
    public static Bundle m14092a(C7459c cVar) {
        Bundle c = m14094c(cVar);
        C9138d0.m18642i0(c, "href", cVar.mo41132a());
        C9138d0.m18640h0(c, "quote", cVar.mo41147d());
        return c;
    }

    /* renamed from: b */
    public static Bundle m14093b(C7465f fVar) {
        Bundle c = m14094c(fVar);
        C9138d0.m18640h0(c, "action_type", fVar.mo41162d().mo41153e());
        try {
            JSONObject e = C7260c.m14089e(C7260c.m14090f(fVar), false);
            if (e != null) {
                C9138d0.m18640h0(c, "action_properties", e.toString());
            }
            return c;
        } catch (JSONException e2) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", e2);
        }
    }

    /* renamed from: c */
    public static Bundle m14094c(C7455a aVar) {
        Bundle bundle = new Bundle();
        C7456b b = aVar.mo41133b();
        if (b != null) {
            C9138d0.m18640h0(bundle, "hashtag", b.mo41136a());
        }
        return bundle;
    }
}
