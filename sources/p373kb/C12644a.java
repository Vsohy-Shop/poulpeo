package p373kb;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.p324ui.screens.AnimatedActivity;
import com.rmn.utils.share.BaseShareManager;
import com.rmn.utils.share.IURLShortener;
import kotlin.jvm.internal.C12775o;
import p445vc.C13618g;

@StabilityInferred(parameters = 0)
/* renamed from: kb.a */
/* compiled from: SponsorCodeShareManager.kt */
public final class C12644a extends BaseShareManager {

    /* renamed from: a */
    private final String f20314a;

    /* renamed from: b */
    private final String f20315b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12644a(AnimatedActivity animatedActivity, String str, String str2) {
        super(animatedActivity);
        boolean z;
        C12775o.m28639i(animatedActivity, "activity");
        C12775o.m28639i(str, "sponsorCode");
        C12775o.m28639i(str2, "sponsorUrl");
        this.f20314a = str;
        this.f20315b = str2;
        int length = str.length();
        boolean z2 = true;
        if (length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (!(str2.length() != 0 ? false : z2)) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public String getDefaultShareText(Resources resources, String str) {
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(str, "url");
        String string = resources.getString(R.string.sponsorship_share_default_text, new Object[]{this.f20314a, str});
        C12775o.m28638h(string, "res.getString(R.string.s…t_text, sponsorCode, url)");
        return string;
    }

    /* access modifiers changed from: protected */
    public String getEmailSubject(Resources resources) {
        C12775o.m28639i(resources, "res");
        String string = resources.getString(R.string.sponsorship_share_email_subject);
        C12775o.m28638h(string, "res.getString(R.string.s…ship_share_email_subject)");
        return string;
    }

    /* access modifiers changed from: protected */
    public String getLongUrl(Context context) {
        C12775o.m28639i(context, "context");
        return this.f20315b;
    }

    /* access modifiers changed from: protected */
    public IURLShortener newUrlShortener() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void trackShareClick() {
        C13618g.f21930b.mo53278b("sponsor-code", "share");
    }
}
