package p201q5;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import p180o4.C8977f;

/* renamed from: q5.k */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C9264k {
    /* renamed from: a */
    public static String m19025a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C8977f.f13065a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* renamed from: b */
    public static final String m19026b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
