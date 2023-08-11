package p451wc;

import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13621b;
import p446vd.C13623d;

/* renamed from: wc.a */
/* compiled from: CloudOpenDataManager */
public abstract class C13691a extends C13693c {

    /* renamed from: c */
    private ContextContainer f22035c;

    public C13691a(ContextContainer contextContainer) {
        if (contextContainer != null) {
            this.f22035c = contextContainer;
            C13693c.m31357c(C13692b.VERSION, "2.0");
            C13693c.m31357c(C13692b.USER_AGENT, C13623d.m31109i(contextContainer));
            C13693c.m31357c(C13692b.DEVICE_ID, C13623d.m31108h(contextContainer));
            C13693c.m31357c(C13692b.VIEWPORT, C13623d.m31110j(contextContainer));
            C13693c.m31357c(C13692b.APPLICATION_VERSION, C13621b.m31090d(contextContainer));
            mo41860i();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static void m31351g(String str, String str2, String str3, String str4, String str5, String str6) {
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_ID, str);
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_MEDIUM, str2);
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_SOURCE, str3);
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_NAME, str4);
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_LOCATION, str5);
        C13693c.m31357c(C13692b.CAMPAIGN_INTERNAL_LOCATION_ID, str6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public ContextContainer mo53354h() {
        return this.f22035c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo41860i();
}
