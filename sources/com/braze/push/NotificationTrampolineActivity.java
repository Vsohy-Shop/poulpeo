package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.braze.push.BrazePushReceiver;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p093g0.C7668f;
import p126j0.C8266c;
import p270x.C10345g;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;

/* compiled from: NotificationTrampolineActivity.kt */
public final class NotificationTrampolineActivity extends Activity {

    /* renamed from: com.braze.push.NotificationTrampolineActivity$a */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4274a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4274a f3539g = new C4274a();

        C4274a() {
            super(0);
        }

        public final String invoke() {
            return "NotificationTrampolineActivity created";
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$b */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4275b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4275b f3540g = new C4275b();

        C4275b() {
            super(0);
        }

        public final String invoke() {
            return "Notification trampoline activity paused and finishing";
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$c */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4276c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4276c f3541g = new C4276c();

        C4276c() {
            super(0);
        }

        public final String invoke() {
            return "Notification trampoline activity received null intent. Doing nothing.";
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$d */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4277d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4277d f3542g = new C4277d();

        C4277d() {
            super(0);
        }

        public final String invoke() {
            return "Notification trampoline activity received intent with null action. Doing nothing.";
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$e */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4278e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f3543g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4278e(Intent intent) {
            super(0);
            this.f3543g = intent;
        }

        public final String invoke() {
            return C12775o.m28647q("Notification trampoline activity received intent: ", this.f3543g);
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$f */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4279f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4279f f3544g = new C4279f();

        C4279f() {
            super(0);
        }

        public final String invoke() {
            return "Failed to route intent to notification receiver";
        }
    }

    /* renamed from: com.braze.push.NotificationTrampolineActivity$g */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4280g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4280g f3545g = new C4280g();

        C4280g() {
            super(0);
        }

        public final String invoke() {
            return "Notification trampoline activity finished processing. Delaying before finishing activity.";
        }
    }

    @C12739f(mo50609c = "com.braze.push.NotificationTrampolineActivity$onResume$7", mo50610f = "NotificationTrampolineActivity.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: com.braze.push.NotificationTrampolineActivity$h */
    /* compiled from: NotificationTrampolineActivity.kt */
    static final class C4281h extends C12746l implements Function1<C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f3546h;

        /* renamed from: i */
        final /* synthetic */ NotificationTrampolineActivity f3547i;

        /* renamed from: com.braze.push.NotificationTrampolineActivity$h$a */
        /* compiled from: NotificationTrampolineActivity.kt */
        static final class C4282a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4282a f3548g = new C4282a();

            C4282a() {
                super(0);
            }

            public final String invoke() {
                return "Delay complete. Finishing Notification trampoline activity now";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4281h(NotificationTrampolineActivity notificationTrampolineActivity, C12074d<? super C4281h> dVar) {
            super(1, dVar);
            this.f3547i = notificationTrampolineActivity;
        }

        public final C12074d<C11921v> create(C12074d<?> dVar) {
            return new C4281h(this.f3547i, dVar);
        }

        public final Object invoke(C12074d<? super C11921v> dVar) {
            return ((C4281h) create(dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f3546h == 0) {
                C11910n.m25701b(obj);
                C8266c.m16396e(C8266c.f11641a, this.f3547i, C8266c.C8267a.f11650f, (Throwable) null, false, C4282a.f3548g, 6, (Object) null);
                this.f3547i.finish();
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C4274a.f3539g, 6, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C4275b.f3540g, 6, (Object) null);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            Intent intent = getIntent();
            if (intent == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4276c.f3541g, 7, (Object) null);
                finish();
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4277d.f3542g, 7, (Object) null);
                finish();
                return;
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C4278e(intent), 6, (Object) null);
            Intent intent2 = new Intent(action).setClass(this, C7668f.m15019e());
            C12775o.m28638h(intent2, "Intent(action).setClass(…otificationReceiverClass)");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                intent2.putExtras(extras);
            }
            if (C10345g.m21724a()) {
                BrazePushReceiver.C4249a.m4947i(BrazePushReceiver.f3510a, this, intent2, false, 4, (Object) null);
            } else {
                BrazePushReceiver.f3510a.mo30995h(this, intent2, false);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C4280g.f3545g, 6, (Object) null);
            C10606a.m22557b(C10606a.f16162b, 200, (C12079g) null, new C4281h(this, (C12074d<? super C4281h>) null), 2, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C4279f.f3544g, 4, (Object) null);
        }
    }
}
