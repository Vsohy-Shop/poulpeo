package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C6922c;
import com.google.firebase.abt.component.C6912a;
import java.util.Arrays;
import java.util.List;
import p051c8.C3903b;
import p051c8.C3993r2;
import p065d8.C7286b;
import p065d8.C7305c;
import p065d8.C7308d;
import p077e8.C7482a;
import p077e8.C7483a0;
import p077e8.C7488d;
import p077e8.C7502k;
import p077e8.C7508n;
import p077e8.C7522v;
import p119i3.C8114g;
import p124i8.C8213d;
import p192p6.C9063a;
import p193p7.C9074d;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9294i;
import p202q6.C9307q;
import p214r8.C9401h;
import p223s7.C9564q;
import p223s7.C9572w;

@Keep
public class FirebaseInAppMessagingRegistrar implements C9294i {
    /* access modifiers changed from: private */
    public C9564q providesFirebaseInAppMessaging(C9287e eVar) {
        C6922c cVar = (C6922c) eVar.mo43559a(C6922c.class);
        C7308d d = C7305c.m14153q().mo40893c(new C7508n((Application) cVar.mo39766h())).mo40892b(new C7502k(eVar.mo43563e(C9063a.class), (C9074d) eVar.mo43559a(C9074d.class))).mo40891a(new C7482a()).mo40895e(new C7483a0(new C3993r2())).mo40894d();
        return C7286b.m14124b().mo40849b(new C3903b(((C6912a) eVar.mo43559a(C6912a.class)).mo39754b("fiam"))).mo40851c(new C7488d(cVar, (C8213d) eVar.mo43559a(C8213d.class), d.mo40887m())).mo40853e(new C7522v(cVar)).mo40852d(d).mo40848a((C8114g) eVar.mo43559a(C8114g.class)).build().mo40847a();
    }

    @Keep
    public List<C9284d<?>> getComponents() {
        return Arrays.asList(new C9284d[]{C9284d.m19065c(C9564q.class).mo43572b(C9307q.m19144j(Context.class)).mo43572b(C9307q.m19144j(C8213d.class)).mo43572b(C9307q.m19144j(C6922c.class)).mo43572b(C9307q.m19144j(C6912a.class)).mo43572b(C9307q.m19140a(C9063a.class)).mo43572b(C9307q.m19144j(C8114g.class)).mo43572b(C9307q.m19144j(C9074d.class)).mo43576f(new C9572w(this)).mo43575e().mo43574d(), C9401h.m19452b("fire-fiam", "20.1.1")});
    }
}
