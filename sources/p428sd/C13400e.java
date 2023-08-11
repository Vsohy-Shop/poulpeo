package p428sd;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;

@StabilityInferred(parameters = 0)
/* renamed from: sd.e */
/* compiled from: BaseApiMessageBundlesManager.kt */
public abstract class C13400e {

    /* renamed from: a */
    public final C13399d f21468a;

    /* renamed from: b */
    public final C13399d f21469b;

    /* renamed from: c */
    public final C13399d f21470c;

    /* renamed from: d */
    public final C13399d f21471d;

    /* renamed from: e */
    public final C13399d f21472e;

    /* renamed from: f */
    public final C13399d f21473f;

    protected C13400e(Context context) {
        C13399d dVar = new C13399d();
        this.f21468a = dVar;
        C13399d dVar2 = new C13399d();
        this.f21469b = dVar2;
        C13399d dVar3 = new C13399d();
        this.f21470c = dVar3;
        C13399d dVar4 = new C13399d();
        this.f21471d = dVar4;
        C13399d dVar5 = new C13399d();
        this.f21472e = dVar5;
        C13399d dVar6 = new C13399d();
        this.f21473f = dVar6;
        if (context != null) {
            Resources resources = context.getResources();
            C13398c cVar = C13398c.DEFAULT_ERROR;
            dVar.mo53010b(new C13397b(cVar), resources.getString(R.string.account_signin_error_trylater));
            C13398c cVar2 = C13398c.NETWORK_PROBLEM;
            dVar.mo53010b(new C13397b(cVar2), resources.getString(R.string.account_get_unreachable));
            C13398c cVar3 = C13398c.MAINTENANCE;
            dVar.mo53010b(new C13397b(cVar3), resources.getString(R.string.account_get_maintenance));
            dVar.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
            dVar.mo53010b(new C13397b(256), resources.getString(R.string.account_signin_error_tryagain));
            dVar.mo53010b(new C13397b(804), resources.getString(R.string.account_error_email_or_password_invalid));
            dVar2.mo53010b(new C13397b(cVar), resources.getString(R.string.account_signin_error_trylater));
            dVar2.mo53010b(new C13397b(cVar2), resources.getString(R.string.account_get_unreachable_social_login));
            dVar2.mo53010b(new C13397b(cVar3), resources.getString(R.string.account_get_maintenance_social_login));
            dVar2.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
            dVar2.mo53010b(new C13397b(256), resources.getString(R.string.account_signin_error_tryagain));
            dVar2.mo53010b(new C13397b(802), resources.getString(R.string.account_signin_error_fbemail));
            dVar2.mo53010b(new C13397b(803), resources.getString(R.string.account_error_duplicate_fbemail));
            dVar2.mo53010b(new C13397b(822), resources.getString(R.string.account_signin_error_fbinfo));
            dVar2.mo53010b(new C13397b(823), resources.getString(R.string.account_signin_error_fbpermission));
            dVar3.mo53010b(new C13397b(cVar), resources.getString(R.string.account_signin_error_trylater));
            dVar3.mo53010b(new C13397b(cVar2), resources.getString(R.string.account_get_unreachable_social_login));
            dVar3.mo53010b(new C13397b(cVar3), resources.getString(R.string.account_get_maintenance_social_login));
            dVar3.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
            dVar3.mo53010b(new C13397b(256), resources.getString(R.string.account_signin_error_tryagain));
            dVar4.mo53010b(new C13397b(cVar), resources.getString(R.string.account_signin_error_trylater));
            dVar4.mo53010b(new C13397b(cVar2), resources.getString(R.string.account_get_unreachable_social_login));
            dVar4.mo53010b(new C13397b(cVar3), resources.getString(R.string.account_get_maintenance_social_login));
            dVar4.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
            dVar4.mo53010b(new C13397b(256), resources.getString(R.string.account_signin_error_tryagain));
            dVar5.mo53010b(new C13397b(cVar), resources.getString(R.string.account_reset_password_error));
            dVar5.mo53010b(new C13397b(802), resources.getString(R.string.account_error_invalid_email));
            dVar5.mo53010b(new C13397b(813), resources.getString(R.string.account_reset_password_email_error));
            dVar6.mo53010b(new C13397b(cVar), resources.getString(R.string.account_signup_error_trylater));
            dVar6.mo53010b(new C13397b(cVar2), resources.getString(R.string.account_create_unreachable));
            dVar6.mo53010b(new C13397b(cVar3), resources.getString(R.string.account_create_maintenance));
            dVar6.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
            dVar6.mo53010b(new C13397b(256), resources.getString(R.string.account_signup_error_tryagain));
            dVar6.mo53010b(new C13397b(802), resources.getString(R.string.account_error_invalid_email));
            dVar6.mo53010b(new C13397b(803), resources.getString(R.string.account_error_duplicate_email));
            dVar6.mo53010b(new C13397b(809), resources.getString(R.string.account_update_error_short_password));
            dVar6.mo53010b(new C13397b(820), resources.getString(R.string.account_error_invalid_password));
            return;
        }
        throw new IllegalArgumentException();
    }
}
