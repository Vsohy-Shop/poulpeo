package p296z3;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.internal.gtm.C5502q1;
import p231t4.C9713p;

/* renamed from: z3.a */
public class C10796a extends BroadcastReceiver {

    /* renamed from: a */
    private static Boolean f16516a;

    /* renamed from: a */
    public static boolean m22973a(Context context) {
        C9713p.m20275j(context);
        Boolean bool = f16516a;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean f = C5502q1.m8399f(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        f16516a = Boolean.valueOf(f);
        return f;
    }
}
