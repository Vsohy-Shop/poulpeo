package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C6922c;
import com.google.firebase.abt.component.C6912a;
import java.util.Arrays;
import java.util.List;
import p124i8.C8213d;
import p192p6.C9063a;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9294i;
import p202q6.C9307q;
import p214r8.C9401h;
import p224s8.C9582f;

@Keep
public class RemoteConfigRegistrar implements C9294i {
    /* access modifiers changed from: private */
    public static /* synthetic */ C7030c lambda$getComponents$0(C9287e eVar) {
        return new C7030c((Context) eVar.mo43559a(Context.class), (C6922c) eVar.mo43559a(C6922c.class), (C8213d) eVar.mo43559a(C8213d.class), ((C6912a) eVar.mo43559a(C6912a.class)).mo39754b("frc"), eVar.mo43561b(C9063a.class));
    }

    public List<C9284d<?>> getComponents() {
        return Arrays.asList(new C9284d[]{C9284d.m19065c(C7030c.class).mo43572b(C9307q.m19144j(Context.class)).mo43572b(C9307q.m19144j(C6922c.class)).mo43572b(C9307q.m19144j(C8213d.class)).mo43572b(C9307q.m19144j(C6912a.class)).mo43572b(C9307q.m19143i(C9063a.class)).mo43576f(new C9582f()).mo43575e().mo43574d(), C9401h.m19452b("fire-rc", "21.0.1")});
    }
}
