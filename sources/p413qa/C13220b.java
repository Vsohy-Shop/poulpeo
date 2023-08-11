package p413qa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPUtil;
import com.rmn.iosadapters.android.content.ContextContainer;
import p114h9.C8031a;
import p305ad.C10865d;
import p317cd.C11036a;
import p317cd.C11037b;
import p317cd.C11039c;
import p428sd.C13399d;
import p451wc.C13693c;

/* renamed from: qa.b */
/* compiled from: PLPLoginController */
public class C13220b extends C11037b {

    /* renamed from: q */
    private static final String f21023q;

    /* renamed from: r */
    private static final String f21024r;

    /* renamed from: s */
    private static final String f21025s;
    @Nullable

    /* renamed from: p */
    private String f21026p;

    /* renamed from: qa.b$a */
    /* compiled from: PLPLoginController */
    public static class C13221a extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final boolean f21027d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C11036a f21028e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13399d f21029f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public final C13399d f21030g;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: h */
        public final C13399d f21031h;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: i */
        public final C13399d f21032i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13399d f21033j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13399d f21034k;

        public C13221a(@NonNull ContextContainer contextContainer, boolean z, @NonNull C11036a aVar, @NonNull C13399d dVar, @Nullable C13399d dVar2, @Nullable C13399d dVar3, @Nullable C13399d dVar4, @NonNull C13399d dVar5, @NonNull C13399d dVar6) {
            super(contextContainer, (LogoutListener) null);
            this.f21027d = z;
            this.f21028e = aVar;
            this.f21029f = dVar;
            this.f21030g = dVar2;
            this.f21031h = dVar3;
            this.f21032i = dVar4;
            this.f21033j = dVar5;
            this.f21034k = dVar6;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = PLPUtil.URL_PLP_API;
        sb.append(str);
        sb.append("oauth/requestToken/");
        f21023q = sb.toString();
        f21024r = str + "oauth/accessToken/";
        f21025s = str + "user/login/";
    }

    public C13220b(@NonNull C11039c cVar, @NonNull C13221a aVar) {
        super(cVar, new C11037b.C11038a(aVar.f16658b, PLPApiType.PLP, f21023q, f21024r, f21025s, aVar.f21027d, new C13222c(), aVar.f21028e, aVar.f21029f, aVar.f21030g, aVar.f21031h, aVar.f21032i, aVar.f21033j, aVar.f21034k));
    }

    /* renamed from: i3 */
    private void m30002i3(ProxyBundleInput proxyBundleInput) {
        String str = this.f21026p;
        if (str != null) {
            proxyBundleInput.addParamValue(PLPMethodParameters.SPONSORSHIP_CODE, str);
        }
        proxyBundleInput.addParamValue(PLPMethodParameters.TERMS_ACCEPTED, Boolean.valueOf(this.f17095n));
        Boolean bool = this.f17096o;
        if (bool != null) {
            proxyBundleInput.addParamValue(PLPMethodParameters.NEWSLETTER, bool);
        }
    }

    @Nullable
    /* renamed from: j3 */
    public String mo52864j3() {
        return this.f21026p;
    }

    /* renamed from: k3 */
    public void mo52865k3(@Nullable String str) {
        this.f21026p = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo46089o2(ProxyBundleInput proxyBundleInput) {
        super.mo46089o2(proxyBundleInput);
        m30002i3(proxyBundleInput);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo46094p2(ProxyBundleInput proxyBundleInput) {
        super.mo46094p2(proxyBundleInput);
        m30002i3(proxyBundleInput);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: y2 */
    public C13693c mo46101y2() {
        return new C8031a(mo45820l2());
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: z2 */
    public RMNMethodParam mo46102z2() {
        return PLPMethodParameters.OPEN_DATA;
    }
}
