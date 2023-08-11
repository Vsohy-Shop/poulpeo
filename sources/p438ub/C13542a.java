package p438ub;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.main.oauth.OAuthErrorCodes;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p428sd.C13397b;
import p428sd.C13398c;
import p428sd.C13399d;
import p428sd.C13400e;

@StabilityInferred(parameters = 0)
/* renamed from: ub.a */
/* compiled from: PLPApiMessageBundlesManager.kt */
public final class C13542a extends C13400e {

    /* renamed from: p */
    public static final C13543a f21790p = new C13543a((DefaultConstructorMarker) null);

    /* renamed from: q */
    public static final int f21791q = 8;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static C13542a f21792r;

    /* renamed from: g */
    private final C13399d f21793g;

    /* renamed from: h */
    private final C13399d f21794h;

    /* renamed from: i */
    private final C13399d f21795i;

    /* renamed from: j */
    private final C13399d f21796j;

    /* renamed from: k */
    private final C13399d f21797k;

    /* renamed from: l */
    private final C13399d f21798l;

    /* renamed from: m */
    private final C13399d f21799m;

    /* renamed from: n */
    private final C13399d f21800n;

    /* renamed from: o */
    private final C13399d f21801o;

    /* renamed from: ub.a$a */
    /* compiled from: PLPApiMessageBundlesManager.kt */
    public static final class C13543a {
        private C13543a() {
        }

        public /* synthetic */ C13543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13542a mo53187a(Context context) {
            C12775o.m28639i(context, "context");
            if (C13542a.f21792r == null) {
                synchronized (C13542a.class) {
                    if (C13542a.f21792r == null) {
                        C13542a.f21792r = new C13542a(context, (DefaultConstructorMarker) null);
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
            C13542a a = C13542a.f21792r;
            C12775o.m28636f(a);
            return a;
        }
    }

    public /* synthetic */ C13542a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    /* renamed from: c */
    public final C13399d mo53178c() {
        return this.f21794h;
    }

    /* renamed from: d */
    public final C13399d mo53179d() {
        return this.f21796j;
    }

    /* renamed from: e */
    public final C13399d mo53180e() {
        return this.f21795i;
    }

    /* renamed from: f */
    public final C13399d mo53181f() {
        return this.f21797k;
    }

    /* renamed from: g */
    public final C13399d mo53182g() {
        return this.f21798l;
    }

    /* renamed from: h */
    public final C13399d mo53183h() {
        return this.f21799m;
    }

    /* renamed from: i */
    public final C13399d mo53184i() {
        return this.f21801o;
    }

    /* renamed from: j */
    public final C13399d mo53185j() {
        return this.f21800n;
    }

    /* renamed from: k */
    public final C13399d mo53186k() {
        return this.f21793g;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C13542a(Context context) {
        super(context);
        C13399d dVar = new C13399d();
        this.f21793g = dVar;
        C13399d dVar2 = new C13399d();
        this.f21794h = dVar2;
        C13399d dVar3 = new C13399d();
        this.f21795i = dVar3;
        C13399d dVar4 = new C13399d();
        this.f21796j = dVar4;
        C13399d dVar5 = new C13399d();
        this.f21797k = dVar5;
        C13399d dVar6 = new C13399d();
        this.f21798l = dVar6;
        C13399d dVar7 = new C13399d();
        this.f21799m = dVar7;
        C13399d dVar8 = new C13399d();
        this.f21800n = dVar8;
        C13399d dVar9 = new C13399d();
        this.f21801o = dVar9;
        Resources resources = context.getResources();
        C13398c cVar = C13398c.DEFAULT_ERROR;
        dVar.mo53010b(new C13397b(cVar), resources.getString(R.string.welcome_loading_get_default_error));
        C13398c cVar2 = C13398c.NETWORK_PROBLEM;
        dVar.mo53010b(new C13397b(cVar2), resources.getString(R.string.welcome_loading_get_network_problem));
        C13398c cVar3 = C13398c.MAINTENANCE;
        dVar.mo53010b(new C13397b(cVar3), resources.getString(R.string.welcome_loading_get_maintenance));
        dVar.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar2.mo53010b(new C13397b(cVar), resources.getString(R.string.comment_send_default_error));
        dVar2.mo53010b(new C13397b(cVar2), resources.getString(R.string.comment_send_network_problem));
        dVar2.mo53010b(new C13397b(cVar3), resources.getString(R.string.comment_send_maintenance));
        dVar2.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar3.mo53010b(new C13397b(cVar), resources.getString(R.string.review_merchant_add_send_default_error));
        dVar3.mo53010b(new C13397b(cVar2), resources.getString(R.string.review_merchant_add_send_network_problem));
        dVar3.mo53010b(new C13397b(cVar3), resources.getString(R.string.review_merchant_add_send_maintenance));
        dVar3.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar4.mo53010b(new C13397b(cVar), resources.getString(R.string.notification_admin_get_preferences_default_error));
        dVar4.mo53010b(new C13397b(cVar2), resources.getString(R.string.notification_admin_get_preferences_network_problem));
        dVar4.mo53010b(new C13397b(cVar3), resources.getString(R.string.notification_admin_get_preferences_maintenance));
        dVar4.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar5.mo53010b(new C13397b(cVar), resources.getString(R.string.sponsorship_code_check_default_error));
        dVar5.mo53010b(new C13397b(cVar2), resources.getString(R.string.sponsorship_code_check_network_problem));
        dVar5.mo53010b(new C13397b(cVar3), resources.getString(R.string.sponsorship_code_check_maintenance));
        dVar5.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar6.mo53010b(new C13397b(cVar), resources.getString(R.string.support_ticket_detail_default_error));
        dVar6.mo53010b(new C13397b(cVar2), resources.getString(R.string.support_ticket_detail_network_problem));
        dVar6.mo53010b(new C13397b(cVar3), resources.getString(R.string.support_ticket_detail_maintenance));
        dVar6.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar7.mo53010b(new C13397b(cVar), resources.getString(R.string.support_ticket_invoice_default_error));
        dVar7.mo53010b(new C13397b(cVar2), resources.getString(R.string.support_ticket_invoice_network_problem));
        dVar7.mo53010b(new C13397b(cVar3), resources.getString(R.string.support_ticket_invoice_maintenance));
        dVar7.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar8.mo53010b(new C13397b(cVar), resources.getString(R.string.update_user_info_default_error));
        dVar8.mo53010b(new C13397b(cVar2), resources.getString(R.string.update_user_info_network_problem));
        dVar8.mo53010b(new C13397b(cVar3), resources.getString(R.string.update_user_info_maintenance));
        dVar8.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar8.mo53010b(new C13397b(824), resources.getString(R.string.update_user_info_invalid_password));
        dVar9.mo53010b(new C13397b(cVar), resources.getString(R.string.unregister_default_error));
        dVar9.mo53010b(new C13397b(cVar2), resources.getString(R.string.unregister_network_problem));
        dVar9.mo53010b(new C13397b(cVar3), resources.getString(R.string.unregister_maintenance));
        dVar9.mo53010b(new C13397b((int) OAuthErrorCodes.ERR_OAUTH_TIMESTAMP), resources.getString(R.string.error_timestamp));
        dVar9.mo53010b(new C13397b(824), resources.getString(R.string.unregister_invalid_password));
    }
}
