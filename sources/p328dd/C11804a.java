package p328dd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;
import p434td.C13491b;

/* renamed from: dd.a */
/* compiled from: BaseWebController */
public class C11804a extends C10865d {
    public C11804a(@NonNull C11806b bVar, @NonNull C11805a aVar) {
        super(bVar, aVar);
        if (aVar.f18439e) {
            aVar.f18438d.mo53102D2(aVar.f18440f, aVar.f18441g, aVar.f18442h);
        } else {
            aVar.f18438d.mo53101C2(aVar.f18443i);
        }
    }

    @NonNull
    /* renamed from: u2 */
    private C11805a m25377u2() {
        return (C11805a) this.f16656c;
    }

    /* renamed from: n2 */
    public boolean mo48950n2() {
        return mo48951o2().mo53106v2();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: o2 */
    public C13491b mo48951o2() {
        return m25377u2().f18438d;
    }

    /* renamed from: p2 */
    public void mo48952p2() {
        mo48951o2().mo53107x2();
    }

    /* renamed from: q2 */
    public void mo48953q2() {
        if (m25377u2().f18444j) {
            m25377u2().f18438d.mo53109z2();
        }
    }

    /* renamed from: t2 */
    public void mo48956t2() {
        if (m25377u2().f18438d.mo53108y2()) {
            m25377u2().f18438d.mo53109z2();
        }
    }

    /* renamed from: v2 */
    public void mo48957v2(String[] strArr) {
        mo48951o2().mo53100B2(strArr);
    }

    /* renamed from: w2 */
    public void mo48958w2(String[] strArr) {
        mo48951o2().mo53103E2(strArr);
    }

    /* renamed from: dd.a$a */
    /* compiled from: BaseWebController */
    public static class C11805a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13491b f18438d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final boolean f18439e;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: f */
        public final String f18440f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public final String f18441g;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: h */
        public final HttpMethod f18442h;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: i */
        public final String f18443i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final boolean f18444j;

        public C11805a(@NonNull ContextContainer contextContainer, @Nullable LogoutListener logoutListener, @NonNull C13491b bVar, @NonNull String str, @Nullable String str2, @NonNull HttpMethod httpMethod, boolean z) {
            super(contextContainer, logoutListener);
            this.f18438d = bVar;
            this.f18439e = true;
            this.f18440f = str;
            this.f18441g = str2;
            this.f18442h = httpMethod;
            this.f18443i = null;
            this.f18444j = z;
        }

        public C11805a(@NonNull ContextContainer contextContainer, @Nullable LogoutListener logoutListener, @NonNull C13491b bVar, @NonNull String str, boolean z) {
            super(contextContainer, logoutListener);
            this.f18438d = bVar;
            this.f18439e = false;
            this.f18440f = null;
            this.f18441g = null;
            this.f18442h = null;
            this.f18443i = str;
            this.f18444j = z;
        }
    }

    /* renamed from: r2 */
    public void mo48954r2() {
    }

    /* renamed from: s2 */
    public void mo48955s2() {
    }
}
