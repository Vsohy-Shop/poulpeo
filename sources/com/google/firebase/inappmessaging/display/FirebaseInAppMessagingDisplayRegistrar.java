package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.C6922c;
import java.util.Arrays;
import java.util.List;
import p026a8.C2218a;
import p026a8.C2222e;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9294i;
import p202q6.C9307q;
import p214r8.C9401h;
import p223s7.C9564q;
import p256v7.C10031b;
import p256v7.C10041c;
import p300z7.C10829b;
import p300z7.C10839d;

@Keep
public class FirebaseInAppMessagingDisplayRegistrar implements C9294i {
    /* access modifiers changed from: private */
    public C10031b buildFirebaseInAppMessagingUI(C9287e eVar) {
        Application application = (Application) ((C6922c) eVar.mo43559a(C6922c.class)).mo39766h();
        C10031b a = C10829b.m23089b().mo45781c(C10839d.m23107e().mo45796a(new C2218a(application)).mo45797b()).mo45780b(new C2222e((C9564q) eVar.mo43559a(C9564q.class))).mo45779a().mo45778a();
        application.registerActivityLifecycleCallbacks(a);
        return a;
    }

    @Keep
    public List<C9284d<?>> getComponents() {
        return Arrays.asList(new C9284d[]{C9284d.m19065c(C10031b.class).mo43572b(C9307q.m19144j(C6922c.class)).mo43572b(C9307q.m19144j(C9564q.class)).mo43576f(new C10041c(this)).mo43575e().mo43574d(), C9401h.m19452b("fire-fiamd", "20.1.1")});
    }
}
