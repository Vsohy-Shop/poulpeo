package p409pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustEvent;

/* renamed from: pc.a */
/* compiled from: AdjustEventWrapper */
public class C13197a {

    /* renamed from: a */
    private AdjustEvent f21006a;

    public C13197a(@NonNull String str) {
        m29949c(str);
    }

    /* renamed from: c */
    private void m29949c(@NonNull String str) {
        this.f21006a = new AdjustEvent(str);
    }

    /* renamed from: d */
    public static void m29950d(@NonNull C13197a aVar) {
        Adjust.trackEvent(aVar.f21006a);
    }

    /* renamed from: a */
    public void mo52825a(@NonNull String str, @Nullable String str2) {
        this.f21006a.addCallbackParameter(str, str2);
    }

    /* renamed from: b */
    public void mo52826b(@NonNull String str, @Nullable String str2) {
        this.f21006a.addPartnerParameter(str, str2);
    }
}
