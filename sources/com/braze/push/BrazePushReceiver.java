package com.braze.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationManagerCompat;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.configuration.C4218b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p270x.C10156b;
import p270x.C10345g;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* compiled from: BrazePushReceiver.kt */
public class BrazePushReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C4249a f3510a = new C4249a((DefaultConstructorMarker) null);

    /* renamed from: com.braze.push.BrazePushReceiver$a */
    /* compiled from: BrazePushReceiver.kt */
    public static final class C4249a {

        /* renamed from: com.braze.push.BrazePushReceiver$a$a */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4250a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Intent f3511g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4250a(Intent intent) {
                super(0);
                this.f3511g = intent;
            }

            public final String invoke() {
                return C12775o.m28647q("Received ADM registration. Message: ", this.f3511g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$b */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4251b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4251b f3512g = new C4251b();

            C4251b() {
                super(0);
            }

            public final String invoke() {
                return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$c */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4252c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4252c f3513g = new C4252c();

            C4252c() {
                super(0);
            }

            public final String invoke() {
                return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$d */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4253d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3514g;

            /* renamed from: h */
            final /* synthetic */ String f3515h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4253d(String str, String str2) {
                super(0);
                this.f3514g = str;
                this.f3515h = str2;
            }

            public final String invoke() {
                return "Error during ADM registration: " + this.f3514g + " description: " + this.f3515h;
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$e */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4254e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3516g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4254e(String str) {
                super(0);
                this.f3516g = str;
            }

            public final String invoke() {
                return C12775o.m28647q("Registering for ADM messages with registrationId: ", this.f3516g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$f */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4255f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3517g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4255f(String str) {
                super(0);
                this.f3517g = str;
            }

            public final String invoke() {
                return C12775o.m28647q("The device was un-registered from ADM: ", this.f3517g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$g */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4256g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4256g f3518g = new C4256g();

            C4256g() {
                super(0);
            }

            public final String invoke() {
                return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$h */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4257h extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3519g;

            /* renamed from: h */
            final /* synthetic */ Intent f3520h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4257h(String str, Intent intent) {
                super(0);
                this.f3519g = str;
                this.f3520h = intent;
            }

            public final String invoke() {
                return "Caught exception while performing the push notification handling work. Action: " + this.f3519g + " Intent: " + this.f3520h;
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$i */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4258i extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Intent f3521g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4258i(Intent intent) {
                super(0);
                this.f3521g = intent;
            }

            public final String invoke() {
                return C12775o.m28647q("Received broadcast message. Message: ", this.f3521g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$j */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4259j extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Intent f3522g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4259j(Intent intent) {
                super(0);
                this.f3522g = intent;
            }

            public final String invoke() {
                return C12775o.m28647q("Push action is null. Not handling intent: ", this.f3522g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$k */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4260k extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4260k f3523g = new C4260k();

            C4260k() {
                super(0);
            }

            public final String invoke() {
                return "Received a message not sent from Braze. Ignoring the message.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$l */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4261l extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4261l f3524g = new C4261l();

            C4261l() {
                super(0);
            }

            public final String invoke() {
                return "Notification created by notification factory was null. Not displaying notification.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$m */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4262m extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ NotificationManagerCompat f3525g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4262m(NotificationManagerCompat notificationManagerCompat) {
                super(0);
                this.f3525g = notificationManagerCompat;
            }

            public final String invoke() {
                return C12775o.m28647q("Value of notificationManager.areNotificationsEnabled() = ", Boolean.valueOf(this.f3525g.areNotificationsEnabled()));
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$n */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4263n extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4263n f3526g = new C4263n();

            C4263n() {
                super(0);
            }

            public final String invoke() {
                return "Received silent push notification";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$o */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4264o extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4264o f3527g = new C4264o();

            C4264o() {
                super(0);
            }

            public final String invoke() {
                return "Not handling non-Braze push message.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$p */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4265p extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ int f3528g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4265p(int i) {
                super(0);
                this.f3528g = i;
            }

            public final String invoke() {
                return "Firebase messaging 'total_deleted' reports " + this.f3528g + " messages.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$q */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4266q extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ Bundle f3529g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4266q(Bundle bundle) {
                super(0);
                this.f3529g = bundle;
            }

            public final String invoke() {
                return C12775o.m28647q("Push message payload received: ", this.f3529g);
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$r */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4267r extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4267r f3530g = new C4267r();

            C4267r() {
                super(0);
            }

            public final String invoke() {
                return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$s */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4268s extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4268s f3531g = new C4268s();

            C4268s() {
                super(0);
            }

            public final String invoke() {
                return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$t */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4269t extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4269t f3532g = new C4269t();

            C4269t() {
                super(0);
            }

            public final String invoke() {
                return "Received visible push notification";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$u */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4270u extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4270u f3533g = new C4270u();

            C4270u() {
                super(0);
            }

            public final String invoke() {
                return "Push stories not supported on Amazon devices.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$v */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4271v extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4271v f3534g = new C4271v();

            C4271v() {
                super(0);
            }

            public final String invoke() {
                return "Received the initial Push Story notification.";
            }
        }

        /* renamed from: com.braze.push.BrazePushReceiver$a$w */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4272w extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ BrazeNotificationPayload f3535g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4272w(BrazeNotificationPayload brazeNotificationPayload) {
                super(0);
                this.f3535g = brazeNotificationPayload;
            }

            public final String invoke() {
                return C12775o.m28647q("Creating notification with payload:\n", this.f3535g);
            }
        }

        @C12739f(mo50609c = "com.braze.push.BrazePushReceiver$Companion$handleReceivedIntent$1", mo50610f = "BrazePushReceiver.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: com.braze.push.BrazePushReceiver$a$x */
        /* compiled from: BrazePushReceiver.kt */
        static final class C4273x extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f3536h;

            /* renamed from: i */
            final /* synthetic */ Context f3537i;

            /* renamed from: j */
            final /* synthetic */ Intent f3538j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4273x(Context context, Intent intent, C12074d<? super C4273x> dVar) {
                super(2, dVar);
                this.f3537i = context;
                this.f3538j = intent;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                return new C4273x(this.f3537i, this.f3538j, dVar);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C12150d.m26492c();
                if (this.f3536h == 0) {
                    C11910n.m25701b(obj);
                    C4249a aVar = BrazePushReceiver.f3510a;
                    Context applicationContext = this.f3537i.getApplicationContext();
                    C12775o.m28638h(applicationContext, "context.applicationContext");
                    aVar.m4945e(applicationContext, this.f3538j);
                    return C11921v.f18618a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                return ((C4273x) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        private C4249a() {
        }

        public /* synthetic */ C4249a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m4945e(Context context, Intent intent) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            try {
                m4946f(action, applicationContext, intent, context);
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C4257h(action, intent), 4, (Object) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
            if (r10.equals("hms_push_service_routing_action") == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
            if (r10.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
            if (r10.equals(com.appboy.Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
            if (r10.equals("firebase_messaging_service_routing_action") == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bf, code lost:
            r9.mo30994g(r11, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c3, code lost:
            p126j0.C8266c.m16396e(r8, r9, p126j0.C8266c.C8267a.f11651g, (java.lang.Throwable) null, false, com.braze.push.BrazePushReceiver.C4249a.C4260k.f3523g, 6, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static final void m4946f(java.lang.String r10, android.content.Context r11, android.content.Intent r12, android.content.Context r13) {
            /*
                j0.c r8 = p126j0.C8266c.f11641a
                com.braze.push.BrazePushReceiver$a r9 = com.braze.push.BrazePushReceiver.f3510a
                j0.c$a r2 = p126j0.C8266c.C8267a.I
                r3 = 0
                r4 = 0
                com.braze.push.BrazePushReceiver$a$i r5 = new com.braze.push.BrazePushReceiver$a$i
                r5.<init>(r12)
                r6 = 6
                r7 = 0
                r0 = r8
                r1 = r9
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r10 == 0) goto L_0x001f
                int r0 = r10.length()
                if (r0 != 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r0 = 0
                goto L_0x0020
            L_0x001f:
                r0 = 1
            L_0x0020:
                if (r0 == 0) goto L_0x0033
                j0.c$a r2 = p126j0.C8266c.C8267a.f11651g
                r3 = 0
                r4 = 0
                com.braze.push.BrazePushReceiver$a$j r5 = new com.braze.push.BrazePushReceiver$a$j
                r5.<init>(r12)
                r6 = 6
                r7 = 0
                r0 = r8
                r1 = r9
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0033:
                java.lang.String r0 = "applicationContext"
                kotlin.jvm.internal.C12775o.m28638h(r11, r0)
                p270x.C10299e.m21643b(r11)
                int r0 = r10.hashCode()
                switch(r0) {
                    case -1584985748: goto L_0x00b6;
                    case -1189411212: goto L_0x00a9;
                    case -743092218: goto L_0x0097;
                    case -499472794: goto L_0x008a;
                    case -478038018: goto L_0x0081;
                    case 431884654: goto L_0x0074;
                    case 465410320: goto L_0x0067;
                    case 1060266838: goto L_0x005d;
                    case 1740454061: goto L_0x0053;
                    case 1908841035: goto L_0x0044;
                    default: goto L_0x0042;
                }
            L_0x0042:
                goto L_0x00c3
            L_0x0044:
                java.lang.String r11 = "com.appboy.action.APPBOY_STORY_CLICKED"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x004e
                goto L_0x00c3
            L_0x004e:
                p093g0.C7668f.m15027m(r13, r12)
                goto L_0x00d0
            L_0x0053:
                java.lang.String r13 = "hms_push_service_routing_action"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x00bf
                goto L_0x00c3
            L_0x005d:
                java.lang.String r13 = "com.amazon.device.messaging.intent.RECEIVE"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x00bf
                goto L_0x00c3
            L_0x0067:
                java.lang.String r11 = "com.appboy.action.APPBOY_ACTION_CLICKED"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x0070
                goto L_0x00c3
            L_0x0070:
                p093g0.C7625c.m14980c(r13, r12)
                goto L_0x00d0
            L_0x0074:
                java.lang.String r13 = "com.appboy.action.CANCEL_NOTIFICATION"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x007d
                goto L_0x00c3
            L_0x007d:
                p093g0.C7668f.m15023i(r11, r12)
                goto L_0x00d0
            L_0x0081:
                java.lang.String r13 = "com.appboy.action.STORY_TRAVERSE"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x00bf
                goto L_0x00c3
            L_0x008a:
                java.lang.String r13 = "com.appboy.action.APPBOY_PUSH_DELETED"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x0093
                goto L_0x00c3
            L_0x0093:
                p093g0.C7668f.m15025k(r11, r12)
                goto L_0x00d0
            L_0x0097:
                java.lang.String r13 = "com.amazon.device.messaging.intent.REGISTRATION"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x00a0
                goto L_0x00c3
            L_0x00a0:
                com.braze.configuration.b r10 = new com.braze.configuration.b
                r10.<init>(r11)
                r9.mo30992c(r10, r11, r12)
                goto L_0x00d0
            L_0x00a9:
                java.lang.String r11 = "com.appboy.action.APPBOY_PUSH_CLICKED"
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x00b2
                goto L_0x00c3
            L_0x00b2:
                p093g0.C7668f.m15026l(r13, r12)
                goto L_0x00d0
            L_0x00b6:
                java.lang.String r13 = "firebase_messaging_service_routing_action"
                boolean r10 = r10.equals(r13)
                if (r10 != 0) goto L_0x00bf
                goto L_0x00c3
            L_0x00bf:
                r9.mo30994g(r11, r12)
                goto L_0x00d0
            L_0x00c3:
                j0.c$a r2 = p126j0.C8266c.C8267a.f11651g
                r3 = 0
                r4 = 0
                com.braze.push.BrazePushReceiver$a$k r5 = com.braze.push.BrazePushReceiver.C4249a.C4260k.f3523g
                r6 = 6
                r7 = 0
                r0 = r8
                r1 = r9
                p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
            L_0x00d0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.C4249a.m4946f(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        /* renamed from: i */
        public static /* synthetic */ void m4947i(C4249a aVar, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            aVar.mo30995h(context, intent, z);
        }

        @VisibleForTesting
        /* renamed from: b */
        public final BrazeNotificationPayload mo30991b(Context context, C4218b bVar, Bundle bundle, Bundle bundle2) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(bVar, "appConfigurationProvider");
            C12775o.m28639i(bundle, "notificationExtras");
            C12775o.m28639i(bundle2, "brazeExtras");
            if (C10345g.m21724a()) {
                return new BrazeNotificationPayload(bundle, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(bundle), context, bVar);
            }
            return new BrazeNotificationPayload(bundle, bundle2, context, bVar);
        }

        @VisibleForTesting
        /* renamed from: c */
        public final boolean mo30992c(C4218b bVar, Context context, Intent intent) {
            C12775o.m28639i(bVar, "appConfigurationProvider");
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intent, "intent");
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, C8266c.C8267a.I, (Throwable) null, false, new C4250a(intent), 6, (Object) null);
            if (!C10345g.m21724a() || !bVar.isAdmMessagingRegistrationEnabled()) {
                C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4252c.f3513g, 6, (Object) null);
                return false;
            }
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C4251b.f3512g, 7, (Object) null);
            mo30993d(context, intent);
            return true;
        }

        @VisibleForTesting
        /* renamed from: d */
        public final boolean mo30993d(Context context, Intent intent) {
            Context context2 = context;
            Intent intent2 = intent;
            C12775o.m28639i(context2, "context");
            C12775o.m28639i(intent2, "intent");
            String stringExtra = intent2.getStringExtra(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            String stringExtra2 = intent2.getStringExtra("error_description");
            String stringExtra3 = intent2.getStringExtra("registration_id");
            String stringExtra4 = intent2.getStringExtra("unregistered");
            if (stringExtra != null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4253d(stringExtra, stringExtra2), 6, (Object) null);
                return true;
            } else if (stringExtra3 != null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C4254e(stringExtra3), 6, (Object) null);
                C10156b.f15345m.mo44811g(context2).mo44804v0(stringExtra3);
                return true;
            } else if (stringExtra4 != null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4255f(stringExtra4), 6, (Object) null);
                return true;
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4256g.f3518g, 6, (Object) null);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0151  */
        @androidx.annotation.VisibleForTesting
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo30994g(android.content.Context r19, android.content.Intent r20) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                java.lang.String r2 = "context"
                kotlin.jvm.internal.C12775o.m28639i(r0, r2)
                java.lang.String r2 = "intent"
                kotlin.jvm.internal.C12775o.m28639i(r1, r2)
                boolean r2 = p093g0.C7668f.m15028n(r20)
                r3 = 0
                if (r2 != 0) goto L_0x0024
                j0.c r4 = p126j0.C8266c.f11641a
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$o r9 = com.braze.push.BrazePushReceiver.C4249a.C4264o.f3527g
                r10 = 7
                r11 = 0
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            L_0x0024:
                java.lang.String r2 = "message_type"
                java.lang.String r2 = r1.getStringExtra(r2)
                java.lang.String r4 = "deleted_messages"
                boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r4, r2)
                if (r2 == 0) goto L_0x004c
                java.lang.String r0 = "total_deleted"
                r2 = -1
                int r0 = r1.getIntExtra(r0, r2)
                j0.c r4 = p126j0.C8266c.f11641a
                j0.c$a r6 = p126j0.C8266c.C8267a.I
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$p r9 = new com.braze.push.BrazePushReceiver$a$p
                r9.<init>(r0)
                r10 = 6
                r11 = 0
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            L_0x004c:
                android.os.Bundle r2 = r20.getExtras()
                if (r2 != 0) goto L_0x0053
                return r3
            L_0x0053:
                j0.c r12 = p126j0.C8266c.f11641a
                j0.c$a r13 = p126j0.C8266c.C8267a.I
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$q r9 = new com.braze.push.BrazePushReceiver$a$q
                r9.<init>(r2)
                r10 = 6
                r11 = 0
                r4 = r12
                r5 = r18
                r6 = r13
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                com.appboy.models.push.BrazeNotificationPayload$Companion r4 = com.appboy.models.push.BrazeNotificationPayload.Companion
                android.os.Bundle r4 = r4.getAttachedBrazeExtras(r2)
                java.lang.String r5 = "extra"
                r2.putBundle(r5, r4)
                java.lang.String r5 = "appboy_push_received_timestamp"
                boolean r6 = r2.containsKey(r5)
                if (r6 != 0) goto L_0x0081
                long r6 = java.lang.System.currentTimeMillis()
                r2.putLong(r5, r6)
            L_0x0081:
                com.braze.configuration.b r14 = new com.braze.configuration.b
                r14.<init>(r0)
                r15 = r18
                com.appboy.models.push.BrazeNotificationPayload r11 = r15.mo30991b(r0, r14, r2, r4)
                boolean r4 = r11.isUninstallTrackingPush()
                if (r4 == 0) goto L_0x00a0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$r r9 = com.braze.push.BrazePushReceiver.C4249a.C4267r.f3530g
                r10 = 6
                r11 = 0
                r4 = r12
                r5 = r18
                r6 = r13
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            L_0x00a0:
                p093g0.C7668f.m15024j(r11)
                boolean r4 = r11.getShouldFetchTestTriggers()
                if (r4 == 0) goto L_0x00cc
                boolean r4 = r14.isInAppMessageTestPushEagerDisplayEnabled()
                if (r4 == 0) goto L_0x00cc
                u0.d$a r4 = p238u0.C9783d.f14623G
                u0.d r4 = r4.mo44312a()
                android.app.Activity r4 = r4.mo44373a()
                if (r4 == 0) goto L_0x00cc
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$s r9 = com.braze.push.BrazePushReceiver.C4249a.C4268s.f3531g
                r10 = 7
                r11 = 0
                r4 = r12
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                p270x.C10299e.m21645d(r19, r20)
                return r3
            L_0x00cc:
                boolean r1 = p093g0.C7668f.m15029o(r20)
                if (r1 == 0) goto L_0x018a
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$t r9 = com.braze.push.BrazePushReceiver.C4249a.C4269t.f3532g
                r10 = 7
                r1 = 0
                r4 = r12
                r5 = r18
                r13 = r11
                r11 = r1
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                int r1 = p093g0.C7668f.m15017c(r13)
                java.lang.String r4 = "nid"
                r2.putInt(r4, r1)
                boolean r4 = r13.isPushStory()
                r11 = 1
                if (r4 == 0) goto L_0x0126
                boolean r4 = p270x.C10345g.m21724a()
                if (r4 == 0) goto L_0x0105
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$u r9 = com.braze.push.BrazePushReceiver.C4249a.C4270u.f3533g
                r10 = 7
                r11 = 0
                r4 = r12
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
            L_0x0105:
                java.lang.String r10 = "appboy_story_newly_received"
                boolean r4 = r2.containsKey(r10)
                if (r4 != 0) goto L_0x0126
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$v r9 = com.braze.push.BrazePushReceiver.C4249a.C4271v.f3534g
                r16 = 7
                r17 = 0
                r4 = r12
                r5 = r18
                r3 = r10
                r10 = r16
                r15 = r11
                r11 = r17
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                r2.putBoolean(r3, r15)
                goto L_0x0127
            L_0x0126:
                r15 = r11
            L_0x0127:
                j0.c$a r6 = p126j0.C8266c.C8267a.f11650f
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$w r9 = new com.braze.push.BrazePushReceiver$a$w
                r9.<init>(r13)
                r10 = 6
                r11 = 0
                r4 = r12
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                x.k r3 = p093g0.C7668f.m15016b()
                android.app.Notification r3 = r3.createNotification(r13)
                if (r3 != 0) goto L_0x0151
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$l r9 = com.braze.push.BrazePushReceiver.C4249a.C4261l.f3524g
                r10 = 7
                r11 = 0
                r4 = r12
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
            L_0x014f:
                r0 = 0
                return r0
            L_0x0151:
                androidx.core.app.NotificationManagerCompat r11 = androidx.core.app.NotificationManagerCompat.from(r19)
                java.lang.String r4 = "from(context)"
                kotlin.jvm.internal.C12775o.m28638h(r11, r4)
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$m r9 = new com.braze.push.BrazePushReceiver$a$m
                r9.<init>(r11)
                r10 = 7
                r16 = 0
                r4 = r12
                r5 = r18
                r12 = r11
                r11 = r16
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                java.lang.String r4 = "appboy_notification"
                r12.notify(r4, r1, r3)
                p093g0.C7668f.m15039y(r0, r2, r13)
                p093g0.C7668f.m15013Q(r0, r14, r2)
                java.lang.Integer r2 = r13.getPushDuration()
                if (r2 != 0) goto L_0x0180
                goto L_0x0189
            L_0x0180:
                int r2 = r2.intValue()
                java.lang.Class<com.braze.push.BrazePushReceiver> r3 = com.braze.push.BrazePushReceiver.class
                p093g0.C7668f.m15003G(r0, r3, r1, r2)
            L_0x0189:
                return r15
            L_0x018a:
                r13 = r11
                r6 = 0
                r7 = 0
                r8 = 0
                com.braze.push.BrazePushReceiver$a$n r9 = com.braze.push.BrazePushReceiver.C4249a.C4263n.f3526g
                r10 = 7
                r11 = 0
                r4 = r12
                r5 = r18
                p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)
                p093g0.C7668f.m15039y(r0, r2, r13)
                p093g0.C7668f.m15033s(r13)
                p093g0.C7668f.m15032r(r13)
                goto L_0x014f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.C4249a.mo30994g(android.content.Context, android.content.Intent):boolean");
        }

        /* renamed from: h */
        public final void mo30995h(Context context, Intent intent, boolean z) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(intent, "intent");
            if (z) {
                C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C4273x(context, intent, (C12074d<? super C4273x>) null), 3, (Object) null);
            } else {
                m4945e(context, intent);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        C4249a.m4947i(f3510a, context, intent, false, 4, (Object) null);
    }
}
