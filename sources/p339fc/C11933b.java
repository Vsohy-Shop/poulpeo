package p339fc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appboy.Constants;
import com.google.android.gms.tasks.Task;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.screens.AnimatedActivity;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p112h7.C8025b;
import p112h7.C8026c;
import p336ef.C11921v;
import p404of.C13074a;
import p409pc.C13200d;
import p440ud.C13566l;
import p446vd.C13633n;

@StabilityInferred(parameters = 0)
/* renamed from: fc.b */
/* compiled from: AppOpeningHandler.kt */
public final class C11933b {

    /* renamed from: a */
    private final AnimatedActivity f18644a;

    /* renamed from: b */
    private final C11937c f18645b;

    /* renamed from: c */
    private final Function1<Bundle, C11939d> f18646c;

    /* renamed from: d */
    private final Lazy f18647d = C11901h.m25690b(new C11934a(this));

    /* renamed from: e */
    private final Lazy f18648e = C11901h.m25690b(new C11935b(this));

    /* renamed from: f */
    private final Lazy f18649f = C11901h.m25690b(new C11936c(this));

    /* renamed from: fc.b$a */
    /* compiled from: AppOpeningHandler.kt */
    static final class C11934a extends C12777p implements C13074a<ContextContainer> {

        /* renamed from: g */
        final /* synthetic */ C11933b f18650g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11934a(C11933b bVar) {
            super(0);
            this.f18650g = bVar;
        }

        /* renamed from: b */
        public final ContextContainer invoke() {
            return new ContextContainer(this.f18650g.mo49155b());
        }
    }

    /* renamed from: fc.b$b */
    /* compiled from: AppOpeningHandler.kt */
    static final class C11935b extends C12777p implements C13074a<Intent> {

        /* renamed from: g */
        final /* synthetic */ C11933b f18651g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11935b(C11933b bVar) {
            super(0);
            this.f18651g = bVar;
        }

        /* renamed from: b */
        public final Intent invoke() {
            return this.f18651g.mo49155b().getIntent();
        }
    }

    /* renamed from: fc.b$c */
    /* compiled from: AppOpeningHandler.kt */
    static final class C11936c extends C12777p implements C13074a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C11933b f18652g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11936c(C11933b bVar) {
            super(0);
            this.f18652g = bVar;
        }

        public final Boolean invoke() {
            boolean z = false;
            if (this.f18652g.mo49156c() != null) {
                Intent c = this.f18652g.mo49156c();
                C12775o.m28636f(c);
                if ((c.getFlags() & 1048576) != 0) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public C11933b(AnimatedActivity animatedActivity, C11937c cVar, Function1<? super Bundle, ? extends C11939d> function1) {
        C12775o.m28639i(animatedActivity, "activity");
        C12775o.m28639i(cVar, "deepLinkHandler");
        C12775o.m28639i(function1, "deepLinkDataCreator");
        this.f18644a = animatedActivity;
        this.f18645b = cVar;
        this.f18646c = function1;
    }

    /* renamed from: e */
    private final void m25761e(C11941f fVar, String str, C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        if (this.f18645b.mo49166l(fVar, new C13566l(this.f18644a), this.f18645b.mo49165b(str))) {
            this.f18644a.mo47877n2();
            aVar.invoke();
            return;
        }
        aVar2.invoke();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m25762i(C13074a aVar, C11933b bVar, C13074a aVar2, Task task) {
        String str;
        Uri a;
        C12775o.m28639i(aVar, "$onError");
        C12775o.m28639i(bVar, "this$0");
        C12775o.m28639i(aVar2, "$onSuccess");
        C12775o.m28639i(task, "task");
        if (!task.mo35465p()) {
            Exception k = task.mo35460k();
            if (k != null) {
                C13633n.m31147c(bVar, k);
            }
            aVar.invoke();
            return;
        }
        C11941f fVar = C11941f.DYNAMIC_LINK;
        C8026c cVar = (C8026c) task.mo35461l();
        if (cVar == null || (a = cVar.mo41857a()) == null) {
            str = null;
        } else {
            str = a.toString();
        }
        bVar.m25761e(fVar, str, aVar2, aVar);
    }

    /* renamed from: b */
    public final AnimatedActivity mo49155b() {
        return this.f18644a;
    }

    /* renamed from: c */
    public final Intent mo49156c() {
        return (Intent) this.f18648e.getValue();
    }

    /* renamed from: d */
    public final boolean mo49157d() {
        return ((Boolean) this.f18649f.getValue()).booleanValue();
    }

    /* renamed from: f */
    public final void mo49158f(C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        C12775o.m28639i(aVar, "onSuccess");
        C12775o.m28639i(aVar2, "onError");
        m25761e(C11941f.ADJUST_LINK, C13200d.f21007a.mo52827c(this.f18644a), aVar, aVar2);
    }

    /* renamed from: g */
    public final void mo49159g(C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        String str;
        Uri data;
        C12775o.m28639i(aVar, "onSuccess");
        C12775o.m28639i(aVar2, "onError");
        Intent c = mo49156c();
        if (c == null || (data = c.getData()) == null) {
            str = null;
        } else {
            str = data.toString();
        }
        if (str == null) {
            aVar2.invoke();
            return;
        }
        String g = this.f18645b.mo40926g();
        C12775o.m28638h(g, "deepLinkHandler.alternativeScheme");
        if (!C13754v.m31525E(str, g, false, 2, (Object) null)) {
            aVar2.invoke();
        } else {
            m25761e(C11941f.BRAZE_IN_APP_MESSAGE, str, aVar, aVar2);
        }
    }

    /* renamed from: h */
    public final void mo49160h(C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        C12775o.m28639i(aVar, "onSuccess");
        C12775o.m28639i(aVar2, "onError");
        if (mo49156c() == null) {
            aVar2.invoke();
            return;
        }
        C8025b c = C8025b.m15793c();
        Intent c2 = mo49156c();
        C12775o.m28636f(c2);
        c.mo41856b(c2).mo35452c(new C11932a(aVar2, this, aVar));
    }

    /* renamed from: j */
    public final void mo49161j(C13074a<C11921v> aVar, C13074a<C11921v> aVar2) {
        Bundle extras;
        boolean z;
        C12775o.m28639i(aVar, "onSuccess");
        C12775o.m28639i(aVar2, "onError");
        if (mo49157d()) {
            aVar2.invoke();
            return;
        }
        Intent c = mo49156c();
        if (!(c == null || (extras = c.getExtras()) == null)) {
            String string = extras.getString("deep_link");
            boolean z2 = false;
            if (string == null || string.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                string = extras.getString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            }
            if (string == null || string.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                m25761e(C11941f.PUSH_NOTIFICATION, string, aVar, aVar2);
                return;
            } else if (this.f18645b.mo49166l(C11941f.PUSH_NOTIFICATION, new C13566l(this.f18644a), this.f18646c.invoke(extras))) {
                aVar.invoke();
                return;
            }
        }
        aVar2.invoke();
    }
}
