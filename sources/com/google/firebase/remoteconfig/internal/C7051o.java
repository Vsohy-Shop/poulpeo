package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p113h8.C8030b;
import p192p6.C9063a;

/* renamed from: com.google.firebase.remoteconfig.internal.o */
/* compiled from: Personalization */
public class C7051o {

    /* renamed from: a */
    private final C8030b<C9063a> f9486a;

    /* renamed from: b */
    private final Map<String, String> f9487b = Collections.synchronizedMap(new HashMap());

    public C7051o(C8030b<C9063a> bVar) {
        this.f9486a = bVar;
    }

    /* renamed from: a */
    public void mo40078a(@NonNull String str, @NonNull C7037e eVar) {
        JSONObject optJSONObject;
        C9063a aVar = this.f9486a.get();
        if (aVar != null) {
            JSONObject f = eVar.mo40047f();
            if (f.length() >= 1) {
                JSONObject d = eVar.mo40044d();
                if (d.length() >= 1 && (optJSONObject = f.optJSONObject(str)) != null) {
                    String optString = optJSONObject.optString("choiceId");
                    if (!optString.isEmpty()) {
                        synchronized (this.f9487b) {
                            if (!optString.equals(this.f9487b.get(str))) {
                                this.f9487b.put(str, optString);
                                Bundle bundle = new Bundle();
                                bundle.putString("arm_key", str);
                                bundle.putString("arm_value", d.optString(str));
                                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                                bundle.putString("group", optJSONObject.optString("group"));
                                aVar.mo30047c("fp", "personalization_assignment", bundle);
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("_fpid", optString);
                                aVar.mo30047c("fp", "_fpc", bundle2);
                            }
                        }
                    }
                }
            }
        }
    }
}
