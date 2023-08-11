package com.google.firebase.messaging;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.C6922c;
import java.util.Arrays;
import java.util.List;
import p119i3.C8114g;
import p124i8.C8213d;
import p193p7.C9074d;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9294i;
import p202q6.C9307q;
import p203q7.C9322f;
import p213r7.C9392a;
import p214r8.C9401h;
import p214r8.C9403i;

@Keep
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class FirebaseMessagingRegistrar implements C9294i {
    static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C9287e eVar) {
        return new FirebaseMessaging((C6922c) eVar.mo43559a(C6922c.class), (C9392a) eVar.mo43559a(C9392a.class), eVar.mo43561b(C9403i.class), eVar.mo43561b(C9322f.class), (C8213d) eVar.mo43559a(C8213d.class), (C8114g) eVar.mo43559a(C8114g.class), (C9074d) eVar.mo43559a(C9074d.class));
    }

    @NonNull
    @Keep
    public List<C9284d<?>> getComponents() {
        return Arrays.asList(new C9284d[]{C9284d.m19065c(FirebaseMessaging.class).mo43572b(C9307q.m19144j(C6922c.class)).mo43572b(C9307q.m19142h(C9392a.class)).mo43572b(C9307q.m19143i(C9403i.class)).mo43572b(C9307q.m19143i(C9322f.class)).mo43572b(C9307q.m19142h(C8114g.class)).mo43572b(C9307q.m19144j(C8213d.class)).mo43572b(C9307q.m19144j(C9074d.class)).mo43576f(C6964c0.f9254a).mo43573c().mo43574d(), C9401h.m19452b("fire-fcm", "23.0.0")});
    }
}
