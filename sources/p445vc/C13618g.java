package p445vc;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.Map;
import p446vd.C13633n;

/* renamed from: vc.g */
/* compiled from: GTMTracker */
public final class C13618g {
    @NonNull

    /* renamed from: b */
    public static final C13618g f21930b = new C13618g();
    @Nullable

    /* renamed from: a */
    private FirebaseAnalytics f21931a;

    private C13618g() {
    }

    /* renamed from: d */
    private void m31075d(@NonNull String str, @NonNull Map<String, String> map) {
        if (this.f21931a == null) {
            C13633n.m31166v("GA tracker not initialized");
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry next : map.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        this.f21931a.mo39755a(str, bundle);
    }

    /* renamed from: a */
    public void mo53277a(@NonNull Context context) {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        this.f21931a = instance;
        instance.mo39756b(true);
    }

    /* renamed from: b */
    public void mo53278b(@NonNull String str, @NonNull String str2) {
        mo53279c(str, str2, (String) null);
    }

    /* renamed from: c */
    public void mo53279c(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("eventcategory", str);
        hashMap.put("eventaction", str2);
        if (str3 != null) {
            hashMap.put("eventlabel", str3);
        }
        m31075d("uaevent", hashMap);
    }

    /* renamed from: e */
    public void mo53280e(@NonNull C13615d dVar) {
        m31075d("openscreen", dVar.mo53272c());
    }
}
