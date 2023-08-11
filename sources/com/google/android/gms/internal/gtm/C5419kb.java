package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.gtm.kb */
final class C5419kb implements C5389ib {
    C5419kb() {
    }

    /* renamed from: a */
    public final C5464nb mo33255a(byte[] bArr) {
        if (bArr == null) {
            throw new zzml("Cannot parse a null byte[]");
        } else if (bArr.length != 0) {
            try {
                C5299cc d = C5298cb.m7831d(new String(bArr));
                if (d != null) {
                    C5426l3.m8133c("The container was successfully parsed from the resource");
                }
                return new C5464nb(Status.f4889g, 0, new C5482ob(d), C5404jb.f6068b.mo33255a(bArr).mo33386e());
            } catch (JSONException unused) {
                throw new zzml("The resource data is corrupted. The container cannot be extracted from the JSON data");
            } catch (zzml unused2) {
                throw new zzml("The resource data is invalid. The container cannot be extracted from the JSON data");
            }
        } else {
            throw new zzml("Cannot parse a 0 length byte[]");
        }
    }
}
