package p223s7;

import androidx.annotation.NonNull;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import p051c8.C3945i2;
import p051c8.C3961l2;
import p051c8.C3968n;
import p051c8.C3993r2;
import p051c8.C3996s;
import p051c8.C4006t;
import p101g8.C7831o;
import p124i8.C8213d;

/* renamed from: s7.q */
/* compiled from: FirebaseInAppMessaging */
public class C9564q {

    /* renamed from: a */
    private final C3945i2 f14236a;

    /* renamed from: b */
    private final C3968n f14237b;

    /* renamed from: c */
    private final C4006t f14238c;

    /* renamed from: d */
    private final C3996s f14239d;

    /* renamed from: e */
    private final C3993r2 f14240e;

    /* renamed from: f */
    private final C8213d f14241f;

    /* renamed from: g */
    private boolean f14242g = false;

    /* renamed from: h */
    private FirebaseInAppMessagingDisplay f14243h;

    C9564q(C3945i2 i2Var, C3993r2 r2Var, C3968n nVar, C8213d dVar, C4006t tVar, C3996s sVar) {
        this.f14236a = i2Var;
        this.f14240e = r2Var;
        this.f14237b = nVar;
        this.f14241f = dVar;
        this.f14238c = tVar;
        this.f14239d = sVar;
        dVar.getId().mo35456g(new C9562o());
        i2Var.mo29976K().mo49197F(new C9563p(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m19873h(C7831o oVar) {
        FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay = this.f14243h;
        if (firebaseInAppMessagingDisplay != null) {
            firebaseInAppMessagingDisplay.displayMessage(oVar.mo41536a(), this.f14238c.mo30032a(oVar.mo41536a(), oVar.mo41537b()));
        }
    }

    /* renamed from: c */
    public boolean mo44045c() {
        return this.f14242g;
    }

    /* renamed from: d */
    public void mo44046d() {
        C3961l2.m4604c("Removing display event component");
        this.f14243h = null;
    }

    /* renamed from: f */
    public void mo44047f() {
        this.f14239d.mo30024m();
    }

    /* renamed from: g */
    public void mo44048g(@NonNull FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        C3961l2.m4604c("Setting display event component");
        this.f14243h = firebaseInAppMessagingDisplay;
    }
}
