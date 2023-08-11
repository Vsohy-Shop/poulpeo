package p231t4;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import p180o4.C8977f;

/* renamed from: t4.s */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9722s {

    /* renamed from: a */
    private final Resources f14535a;

    /* renamed from: b */
    private final String f14536b;

    public C9722s(@NonNull Context context) {
        C9713p.m20275j(context);
        Resources resources = context.getResources();
        this.f14535a = resources;
        this.f14536b = resources.getResourcePackageName(C8977f.f13065a);
    }

    @Nullable
    /* renamed from: a */
    public String mo44248a(@NonNull String str) {
        int identifier = this.f14535a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f14536b);
        if (identifier == 0) {
            return null;
        }
        return this.f14535a.getString(identifier);
    }
}
