package p066d9;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import p339fc.C11939d;
import p339fc.C11940e;
import p339fc.C11941f;
import p339fc.C11942g;
import p415qc.C13241f;
import p415qc.C13242g;
import p440ud.C13566l;
import p446vd.C13629j;
import p446vd.C13633n;

/* renamed from: d9.g */
/* compiled from: PLPDeepLinkType */
public enum C7316g implements C11942g {
    REDIRECT("redirect", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40910o(lVar, ((C7310b) eVar).mo49169e());
        }

        /* renamed from: b */
        public boolean mo40932b(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            return true;
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/redirect/(.+)$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            try {
                b = URLDecoder.decode(b, Constants.ENCODING);
            } catch (UnsupportedEncodingException e) {
                C13633n.m31165u(this, e);
            }
            return (C7310b) mo40937h().mo49172h(b);
        }
    },
    HOME("home", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40898c(lVar);
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            C7310b g = C7316g.super.mo40933c(str);
            if (g != null) {
                return g;
            }
            if (str.isEmpty() || str.equals("/")) {
                return mo40937h();
            }
            return null;
        }
    },
    PARTNERSHIP(com.appboy.Constants.APPBOY_PUSH_PRIORITY_KEY, (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            if (OAuthAccountManager.getInstance().isConnectedToAccount(PLPApiType.PLP)) {
                C7316g.m14250f().mo40898c(lVar);
            } else {
                C7316g.m14250f().mo40896a(lVar, ((C7310b) eVar).mo40918l());
            }
        }

        /* renamed from: b */
        public boolean mo40932b(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            return true;
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/p/([a-zA-Z0-9]{3,})$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return mo40937h().mo40923q(b);
        }
    },
    EARNINGS("earnings", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40899d(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    MERCHANT("merchant", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            boolean z;
            C7309a e = C7316g.m14250f();
            String i = ((C7310b) eVar).mo40915i();
            if (((C11939d) eVar).mo49168d() == C11941f.REMINDER) {
                z = true;
            } else {
                z = false;
            }
            e.mo40903h(lVar, i, z);
        }

        /* renamed from: d */
        public void mo40934d(@NonNull C13241f fVar, @NonNull C11940e eVar) {
            fVar.mo52890a(C13242g.f21097i, String.valueOf(((C7310b) eVar).mo40915i()));
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/merchant/([0-9]+)$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return mo40937h().mo40920n(b);
        }
    },
    OFFER(APIResourceDescriptors.RESOURCE_TYPE_OFFER, (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7310b bVar = (C7310b) eVar;
            C7316g.m14250f().mo40906k(lVar, bVar.mo40915i(), bVar.mo40916j());
        }

        /* renamed from: d */
        public void mo40934d(@NonNull C13241f fVar, @NonNull C11940e eVar) {
            fVar.mo52890a(C13242g.f21101m, String.valueOf(((C7310b) eVar).mo40916j()));
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String[] e = C13629j.m31135e("^/merchant/([0-9]+)/offer/([0-9]+)$", str);
            if (e == null) {
                return null;
            }
            String str2 = e[0];
            if (str2.isEmpty()) {
                return null;
            }
            String str3 = e[1];
            if (str3.isEmpty()) {
                return null;
            }
            return mo40937h().mo40920n(str2).mo40921o(str3);
        }
    },
    CONTAINER(APIResourceDescriptors.RESOURCE_TYPE_CONTAINER, (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40908m(lVar, ((C7310b) eVar).mo40919m());
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/container/([a-zA-Z0-9_-]+)$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return mo40937h().mo40924r(b);
        }
    },
    CAMPAIGNS("campaigns", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40901f(lVar, ((C7310b) eVar).mo40919m());
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/campaigns/([a-zA-Z0-9_-]+)$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return mo40937h().mo40924r(b);
        }
    },
    PAGE(APIResourceDescriptors.RESOURCE_TYPE_PAGE, (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40913r(lVar, ((C7310b) eVar).mo40917k());
        }

        @Nullable
        /* renamed from: g */
        public C7310b mo40933c(@NonNull String str) {
            String b = C13629j.m31132b("^/page/([0-9]+)$", str);
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return mo40937h().mo40922p(b);
        }
    },
    INSTORE_CASHBACK("instoreCashback", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40904i(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    SPONSORSHIP("sponsorship", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40900e(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    CASHBACK_GUIDE("cashbackGuide", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40902g(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    FAQ("faq", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40905j(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    FAVORITES("favorites", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40912q(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    POULPEO_PLUS("poulpeoPlus", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40911p(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    SUPPORT("support", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40897b(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    HAPPY_HOUR("happyHours", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40907l(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    SUPER_CASHBACK("superCashback", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40909n(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    },
    BOOSTED_CASHBACK("boostedCashback", (int) null) {
        /* renamed from: a */
        public void mo40938a(@NonNull C13566l lVar, @NonNull C11940e eVar) {
            C7316g.m14250f().mo40914s(lVar);
        }

        @Nullable
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C11939d mo40933c(@NonNull String str) {
            return C7316g.super.mo40933c(str);
        }
    };
    
    @NonNull

    /* renamed from: b */
    public final String f10151b;

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: f */
    public static C7309a m14250f() {
        return C7312d.f10129a.mo40931a();
    }

    /* renamed from: b */
    public boolean mo40932b(@NonNull C13566l lVar, @NonNull C11940e eVar) {
        return OAuthAccountManager.getInstance().isConnectedToAccount(PLPApiType.PLP);
    }

    @Nullable
    /* renamed from: g */
    public C7310b mo40933c(@NonNull String str) {
        if (str.equals("/" + this.f10151b)) {
            return mo40937h();
        }
        return null;
    }

    @NonNull
    public String getValue() {
        return this.f10151b;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public C7310b mo40937h() {
        C7310b bVar = new C7310b();
        bVar.mo49175c(JSONAPIResourceIdSerializer.FIELD_TYPE, this.f10151b);
        return bVar;
    }

    private C7316g(@NonNull String str) {
        this.f10151b = str;
    }

    /* renamed from: d */
    public void mo40934d(@NonNull C13241f fVar, @NonNull C11940e eVar) {
    }
}
