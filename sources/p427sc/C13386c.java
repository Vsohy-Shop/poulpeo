package p427sc;

import android.text.TextUtils;
import com.rmn.iosadapters.android.content.ContextContainer;
import p415qc.C13238c;
import p415qc.C13240e;
import p415qc.C13242g;

/* renamed from: sc.c */
/* compiled from: CTTrackingCommandCampaignClick */
public class C13386c extends C13387d {
    public C13386c(ContextContainer contextContainer, String str, String str2, String str3, String str4, String str5, String str6) {
        super("campaign_click", str, str2, str3, str4, str5, str6);
        if (contextContainer != null) {
            C13238c cVar = C13242g.f21113y;
            C13240e.m30077f(contextContainer, cVar);
            C13238c cVar2 = C13242g.f21114z;
            C13240e.m30077f(contextContainer, cVar2);
            C13238c cVar3 = C13242g.f21070A;
            C13240e.m30077f(contextContainer, cVar3);
            C13238c cVar4 = C13242g.f21071B;
            C13240e.m30077f(contextContainer, cVar4);
            C13238c cVar5 = C13242g.f21072C;
            C13240e.m30077f(contextContainer, cVar5);
            C13238c cVar6 = C13242g.f21073D;
            C13240e.m30077f(contextContainer, cVar6);
            if (!TextUtils.isEmpty(str)) {
                C13240e.m30073a(contextContainer, cVar, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                C13240e.m30073a(contextContainer, cVar2, str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                C13240e.m30073a(contextContainer, cVar3, str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                C13240e.m30073a(contextContainer, cVar4, str4);
            }
            if (!TextUtils.isEmpty(str5)) {
                C13240e.m30073a(contextContainer, cVar5, str5);
            }
            if (!TextUtils.isEmpty(str6)) {
                C13240e.m30073a(contextContainer, cVar6, str6);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public String mo52892c() {
        return "campaign click";
    }
}
