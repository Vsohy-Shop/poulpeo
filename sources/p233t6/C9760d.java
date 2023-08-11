package p233t6;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p222s6.C9511f;
import p244u6.C9892a;
import p244u6.C9893b;

/* renamed from: t6.d */
/* compiled from: BreadcrumbAnalyticsEventReceiver */
public class C9760d implements C9758b, C9893b {
    @Nullable

    /* renamed from: a */
    private C9892a f14572a;

    @NonNull
    /* renamed from: b */
    private static String m20353b(@NonNull String str, @NonNull Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    /* renamed from: I */
    public void mo44285I(@NonNull String str, @NonNull Bundle bundle) {
        C9892a aVar = this.f14572a;
        if (aVar != null) {
            try {
                aVar.mo44414a("$A$:" + m20353b(str, bundle));
            } catch (JSONException unused) {
                C9511f.m19696f().mo43973k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    /* renamed from: a */
    public void mo43805a(@Nullable C9892a aVar) {
        this.f14572a = aVar;
        C9511f.m19696f().mo43965b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
