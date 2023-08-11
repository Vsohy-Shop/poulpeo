package p270x;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.braze.push.NotificationTrampolineActivity;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p238u0.C9783d;
import p270x.C10156b;
import p404of.C13074a;

/* renamed from: x.c */
/* compiled from: BrazeActivityLifecycleCallbackListener.kt */
public class C10285c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final boolean f15540b;

    /* renamed from: c */
    private final boolean f15541c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set<? extends Class<?>> f15542d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Set<? extends Class<?>> f15543e;

    /* renamed from: x.c$a */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10286a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C10285c f15544g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10286a(C10285c cVar) {
            super(0);
            this.f15544g = cVar;
        }

        public final String invoke() {
            return C12775o.m28647q("BrazeActivityLifecycleCallbackListener using in-app messaging blocklist: ", this.f15544g.f15542d);
        }
    }

    /* renamed from: x.c$b */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10287b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C10285c f15545g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10287b(C10285c cVar) {
            super(0);
            this.f15545g = cVar;
        }

        public final String invoke() {
            return C12775o.m28647q("BrazeActivityLifecycleCallbackListener using session handling blocklist: ", this.f15545g.f15543e);
        }
    }

    /* renamed from: x.c$c */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10288c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f15546g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10288c(Activity activity) {
            super(0);
            this.f15546g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Automatically calling lifecycle method: ensureSubscribedToInAppMessageEvents for class: ", this.f15546g.getClass());
        }
    }

    /* renamed from: x.c$d */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10289d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f15547g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10289d(Activity activity) {
            super(0);
            this.f15547g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Automatically calling lifecycle method: unregisterInAppMessageManager for class: ", this.f15547g.getClass());
        }
    }

    /* renamed from: x.c$e */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10290e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f15548g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10290e(Activity activity) {
            super(0);
            this.f15548g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Automatically calling lifecycle method: registerInAppMessageManager for class: ", this.f15548g.getClass());
        }
    }

    /* renamed from: x.c$f */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10291f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f15549g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10291f(Activity activity) {
            super(0);
            this.f15549g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Automatically calling lifecycle method: openSession for class: ", this.f15549g.getClass());
        }
    }

    /* renamed from: x.c$g */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10292g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Activity f15550g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10292g(Activity activity) {
            super(0);
            this.f15550g = activity;
        }

        public final String invoke() {
            return C12775o.m28647q("Automatically calling lifecycle method: closeSession for class: ", this.f15550g.getClass());
        }
    }

    /* renamed from: x.c$h */
    /* compiled from: BrazeActivityLifecycleCallbackListener.kt */
    static final class C10293h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10293h f15551g = new C10293h();

        C10293h() {
            super(0);
        }

        public final String invoke() {
            return "Skipping automatic registration for notification trampoline activity class.";
        }
    }

    public C10285c(boolean z, boolean z2, Set<? extends Class<?>> set, Set<? extends Class<?>> set2) {
        this.f15540b = z;
        this.f15541c = z2;
        this.f15542d = set == null ? C12731y0.m28551e() : set;
        this.f15543e = set2 == null ? C12731y0.m28551e() : set2;
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C10286a(this), 6, (Object) null);
        C8266c.m16396e(cVar, this, aVar, (Throwable) null, false, new C10287b(this), 6, (Object) null);
    }

    @VisibleForTesting
    /* renamed from: c */
    public final boolean mo44947c(Activity activity, boolean z) {
        C12775o.m28639i(activity, "activity");
        Class<?> cls = activity.getClass();
        if (C12775o.m28634d(cls, NotificationTrampolineActivity.class)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C10293h.f15551g, 6, (Object) null);
            return false;
        }
        if (z) {
            if (this.f15543e.contains(cls)) {
                return false;
            }
        } else if (this.f15542d.contains(cls)) {
            return false;
        }
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
        if (this.f15541c && mo44947c(activity, false)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10288c(activity), 6, (Object) null);
            C9783d a = C9783d.f14623G.mo44312a();
            Context applicationContext = activity.getApplicationContext();
            C12775o.m28638h(applicationContext, "activity.applicationContext");
            a.mo44311y(applicationContext);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C12775o.m28639i(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f15541c && mo44947c(activity, false)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10289d(activity), 6, (Object) null);
            C9783d.f14623G.mo44312a().mo44307G(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f15541c && mo44947c(activity, false)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10290e(activity), 6, (Object) null);
            C9783d.f14623G.mo44312a().mo44303C(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(bundle, "bundle");
    }

    public void onActivityStarted(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f15540b && mo44947c(activity, true)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10291f(activity), 6, (Object) null);
            C10156b.C10157a aVar = C10156b.f15345m;
            Context applicationContext = activity.getApplicationContext();
            C12775o.m28638h(applicationContext, "activity.applicationContext");
            aVar.mo44811g(applicationContext).mo44786c0(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        C12775o.m28639i(activity, "activity");
        if (this.f15540b && mo44947c(activity, true)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10292g(activity), 6, (Object) null);
            C10156b.C10157a aVar = C10156b.f15345m;
            Context applicationContext = activity.getApplicationContext();
            C12775o.m28638h(applicationContext, "activity.applicationContext");
            aVar.mo44811g(applicationContext).mo44767K(activity);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10285c(boolean z, boolean z2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? C12731y0.m28551e() : set, (i & 8) != 0 ? C12731y0.m28551e() : set2);
    }
}
