package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.gtm.lb */
final class C5434lb implements C5389ib {
    C5434lb() {
    }

    /* renamed from: a */
    public final C5464nb mo33255a(byte[] bArr) {
        if (bArr == null) {
            throw new zzml("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                C5420kc e = C5298cb.m7832e(new String(bArr));
                if (e != null) {
                    C5426l3.m8133c("The runtime configuration was successfully parsed from the resource");
                }
                return new C5464nb(Status.f4889g, 0, (C5482ob) null, e);
            } catch (JSONException unused) {
                throw new zzml("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
            } catch (zzml unused2) {
                throw new zzml("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
            }
        } else {
            throw new zzml("Cannot parse a 0 length byte[]");
        }
    }
}
