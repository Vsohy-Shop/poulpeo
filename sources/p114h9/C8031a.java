package p114h9;

import android.text.TextUtils;
import com.rmn.iosadapters.android.content.ContextContainer;
import p446vd.C13633n;
import p446vd.C13636q;
import p451wc.C13691a;
import p451wc.C13692b;
import p451wc.C13693c;

/* renamed from: h9.a */
/* compiled from: PLPOpenDataManager */
public class C8031a extends C13691a {
    public C8031a(ContextContainer contextContainer) {
        super(contextContainer);
    }

    /* renamed from: k */
    public static void m15801k(ContextContainer contextContainer, String str) {
        if (TextUtils.isEmpty(str)) {
            C13636q.m31181b(contextContainer).mo53293d("PLPOpenDataManager_user_id");
            C13693c.m31358f(C13692b.USER_ID);
            return;
        }
        C13636q.m31181b(contextContainer).mo53303n("PLPOpenDataManager_user_id", str);
        C13693c.m31357c(C13692b.USER_ID, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo41860i() {
        String i = C13636q.m31181b(mo53354h()).mo53298i("PLPOpenDataManager_user_id", (String) null);
        if (i != null) {
            C13693c.m31357c(C13692b.USER_ID, i);
        }
    }

    /* renamed from: j */
    public String mo41861j(Class cls) {
        if (cls != null) {
            try {
                mo53358b(C13692b.CLICK_PAGE, cls.getSimpleName());
            } catch (Exception e) {
                C13633n.m31165u(C8031a.class, e);
            }
        }
        return mo53359d();
    }
}
