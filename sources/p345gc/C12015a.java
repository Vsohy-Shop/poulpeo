package p345gc;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.p324ui.screens.AnimatedActivity;
import com.rmn.utils.share.BaseShareManager;
import com.rmn.utils.share.IURLShortener;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: gc.a */
/* compiled from: FirebasePushTokensShareManager.kt */
public final class C12015a extends BaseShareManager {

    /* renamed from: a */
    private final String f18779a;

    /* renamed from: b */
    private final String f18780b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12015a(AnimatedActivity animatedActivity, String str, String str2) {
        super(animatedActivity);
        C12775o.m28639i(animatedActivity, "activity");
        C12775o.m28639i(str, "fcmToken");
        C12775o.m28639i(str2, "instanceId");
        this.f18779a = str;
        this.f18780b = str2;
    }

    /* access modifiers changed from: protected */
    public String getDefaultShareText(Resources resources, String str) {
        C12775o.m28639i(resources, "res");
        C12775o.m28639i(str, "url");
        String str2 = this.f18779a;
        String str3 = this.f18780b;
        return C13745o.m31511f("\n            Copier l'un ou l'autre des jetons dans Braze ou Firebase.\n            \n            - Cloud messaging (jeton d'enregistrement FCM) :\n            \n            " + str2 + "\n                        \n            - In-app messaging (ID d'instance) :\n            \n            " + str3 + "\n            ");
    }

    /* access modifiers changed from: protected */
    public String getEmailSubject(Resources resources) {
        C12775o.m28639i(resources, "res");
        return "Jetons pour test notifications Firebase";
    }

    /* access modifiers changed from: protected */
    public String getLongUrl(Context context) {
        C12775o.m28639i(context, "context");
        return "";
    }

    /* access modifiers changed from: protected */
    public IURLShortener newUrlShortener() {
        return null;
    }
}
