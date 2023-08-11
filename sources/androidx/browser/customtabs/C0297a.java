package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;

/* renamed from: androidx.browser.customtabs.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C0297a implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final /* synthetic */ CustomTabsService.C02931 f202a;

    /* renamed from: b */
    public final /* synthetic */ CustomTabsSessionToken f203b;

    public /* synthetic */ C0297a(CustomTabsService.C02931 r1, CustomTabsSessionToken customTabsSessionToken) {
        this.f202a = r1;
        this.f203b = customTabsSessionToken;
    }

    public final void binderDied() {
        this.f202a.lambda$newSessionInternal$0(this.f203b);
    }
}
