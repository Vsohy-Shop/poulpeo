package p123i7;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;

/* renamed from: i7.c */
/* compiled from: DynamicLinkUTMParams */
public class C8190c {

    /* renamed from: a */
    private final C8188a f11515a;
    @NonNull

    /* renamed from: b */
    private final Bundle f11516b;

    public C8190c(C8188a aVar) {
        this.f11515a = aVar;
        this.f11516b = m16214b(aVar);
    }

    /* renamed from: a */
    private static void m16213a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, @NonNull Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }

    @NonNull
    /* renamed from: b */
    private static Bundle m16214b(C8188a aVar) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (aVar == null || aVar.mo42084H() == null || (bundle = aVar.mo42084H().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        m16213a(Constants.MEDIUM, "utm_medium", bundle2, bundle3);
        m16213a(APIParams.SOURCE, "utm_source", bundle2, bundle3);
        m16213a(APIResourceDescriptors.RESOURCE_TYPE_CAMPAIGN, "utm_campaign", bundle2, bundle3);
        return bundle3;
    }
}
