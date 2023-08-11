package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import p182o6.C8999a;
import p192p6.C9063a;
import p202q6.C9284d;
import p202q6.C9287e;
import p202q6.C9294i;
import p202q6.C9307q;
import p214r8.C9401h;

@Keep
public class AbtRegistrar implements C9294i {
    /* access modifiers changed from: private */
    public static /* synthetic */ C6912a lambda$getComponents$0(C9287e eVar) {
        return new C6912a((Context) eVar.mo43559a(Context.class), eVar.mo43561b(C9063a.class));
    }

    public List<C9284d<?>> getComponents() {
        return Arrays.asList(new C9284d[]{C9284d.m19065c(C6912a.class).mo43572b(C9307q.m19144j(Context.class)).mo43572b(C9307q.m19143i(C9063a.class)).mo43576f(new C8999a()).mo43574d(), C9401h.m19452b("fire-abt", "21.0.0")});
    }
}
