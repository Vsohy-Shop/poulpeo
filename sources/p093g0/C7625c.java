package p093g0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.push.NotificationTrampolineActivity;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p126j0.C8266c;
import p126j0.C8275f;
import p136k0.C8429a;
import p270x.C10156b;
import p270x.C10347i;
import p404of.C13074a;

/* renamed from: g0.c */
/* compiled from: BrazeNotificationActionUtils.kt */
public final class C7625c {

    /* renamed from: a */
    public static final C7625c f10598a = new C7625c();

    /* renamed from: g0.c$a */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7626a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7626a f10599g = new C7626a();

        C7626a() {
            super(0);
        }

        public final String invoke() {
            return "Cannot add notification action with null context from payload";
        }
    }

    /* renamed from: g0.c$b */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7627b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10600g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7627b(String str) {
            super(0);
            this.f10600g = str;
        }

        public final String invoke() {
            return "Adding notification action with type: " + this.f10600g + "Setting intent class to notification receiver: " + C7668f.m15019e();
        }
    }

    /* renamed from: g0.c$c */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7628c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10601g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7628c(String str) {
            super(0);
            this.f10601g = str;
        }

        public final String invoke() {
            return "Adding notification action with type: " + this.f10601g + " Setting intent class to trampoline activity";
        }
    }

    /* renamed from: g0.c$d */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7629d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Bundle f10602g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7629d(Bundle bundle) {
            super(0);
            this.f10602g = bundle;
        }

        public final String invoke() {
            return C12775o.m28647q("Added action with bundle: ", this.f10602g);
        }
    }

    /* renamed from: g0.c$e */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7630e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7630e f10603g = new C7630e();

        C7630e() {
            super(0);
        }

        public final String invoke() {
            return "Context cannot be null when adding notification buttons.";
        }
    }

    /* renamed from: g0.c$f */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7631f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7631f f10604g = new C7631f();

        C7631f() {
            super(0);
        }

        public final String invoke() {
            return "No action buttons present. Not adding notification actions";
        }
    }

    /* renamed from: g0.c$g */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7632g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ BrazeNotificationPayload.ActionButton f10605g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7632g(BrazeNotificationPayload.ActionButton actionButton) {
            super(0);
            this.f10605g = actionButton;
        }

        public final String invoke() {
            return C12775o.m28647q("Adding action button: ", this.f10605g);
        }
    }

    /* renamed from: g0.c$h */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7633h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7633h f10606g = new C7633h();

        C7633h() {
            super(0);
        }

        public final String invoke() {
            return "Notification action button type was blank or null. Doing nothing.";
        }
    }

    /* renamed from: g0.c$i */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7634i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7634i f10607g = new C7634i();

        C7634i() {
            super(0);
        }

        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    /* renamed from: g0.c$j */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7635j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7635j f10608g = new C7635j();

        C7635j() {
            super(0);
        }

        public final String invoke() {
            return "Unknown notification action button clicked. Doing nothing.";
        }
    }

    /* renamed from: g0.c$k */
    /* compiled from: BrazeNotificationActionUtils.kt */
    static final class C7636k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7636k f10609g = new C7636k();

        C7636k() {
            super(0);
        }

        public final String invoke() {
            return "Caught exception while handling notification action button click.";
        }
    }

    private C7625c() {
    }

    /* renamed from: b */
    public static final void m14979b(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.getContext() == null) {
            C8266c.m16396e(C8266c.f11641a, f10598a, (C8266c.C8267a) null, (Throwable) null, false, C7630e.f10603g, 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = brazeNotificationPayload.getActionButtons();
        if (actionButtons.isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, f10598a, (C8266c.C8267a) null, (Throwable) null, false, C7631f.f10604g, 7, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton next : actionButtons) {
            C8266c cVar = C8266c.f11641a;
            C7625c cVar2 = f10598a;
            C8266c.m16396e(cVar, cVar2, C8266c.C8267a.f11650f, (Throwable) null, false, new C7632g(next), 6, (Object) null);
            cVar2.mo41361a(builder, brazeNotificationPayload, next);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[Catch:{ Exception -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030 A[Catch:{ Exception -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093 A[Catch:{ Exception -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c7 A[Catch:{ Exception -> 0x00e7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cb A[Catch:{ Exception -> 0x00e7 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14980c(android.content.Context r12, android.content.Intent r13) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.C12775o.m28639i(r13, r0)
            java.lang.String r0 = "appboy_action_type"
            java.lang.String r0 = r13.getStringExtra(r0)     // Catch:{ Exception -> 0x00e7 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            boolean r3 = p454wf.C13754v.m31532t(r0)     // Catch:{ Exception -> 0x00e7 }
            if (r3 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r3 = r1
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            if (r3 == 0) goto L_0x0030
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00e7 }
            g0.c r5 = f10598a     // Catch:{ Exception -> 0x00e7 }
            j0.c$a r6 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x00e7 }
            r7 = 0
            r8 = 0
            g0.c$h r9 = p093g0.C7625c.C7633h.f10606g     // Catch:{ Exception -> 0x00e7 }
            r10 = 6
            r11 = 0
            p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00e7 }
            return
        L_0x0030:
            java.lang.String r3 = "nid"
            r4 = -1
            int r3 = r13.getIntExtra(r3, r4)     // Catch:{ Exception -> 0x00e7 }
            g0.c r5 = f10598a     // Catch:{ Exception -> 0x00e7 }
            r5.mo41362d(r12, r13, r0)     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x00d9
            int r4 = r0.hashCode()     // Catch:{ Exception -> 0x00e7 }
            r6 = -1424488370(0xffffffffab18084e, float:-5.4012773E-13)
            java.lang.String r7 = "ab_uri"
            if (r4 == r6) goto L_0x006e
            r6 = -1209677674(0xffffffffb7e5c896, float:-2.7392332E-5)
            if (r4 == r6) goto L_0x005f
            r6 = -1209647192(0xffffffffb7e63fa8, float:-2.7447779E-5)
            if (r4 == r6) goto L_0x0055
            goto L_0x00d9
        L_0x0055:
            java.lang.String r4 = "ab_open"
            boolean r4 = r0.equals(r4)     // Catch:{ Exception -> 0x00e7 }
            if (r4 != 0) goto L_0x0075
            goto L_0x00d9
        L_0x005f:
            java.lang.String r13 = "ab_none"
            boolean r13 = r0.equals(r13)     // Catch:{ Exception -> 0x00e7 }
            if (r13 != 0) goto L_0x0069
            goto L_0x00d9
        L_0x0069:
            p093g0.C7668f.m15015a(r12, r3)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f7
        L_0x006e:
            boolean r4 = r0.equals(r7)     // Catch:{ Exception -> 0x00e7 }
            if (r4 != 0) goto L_0x0075
            goto L_0x00d9
        L_0x0075:
            p093g0.C7668f.m15015a(r12, r3)     // Catch:{ Exception -> 0x00e7 }
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r7)     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = "uri"
            if (r0 == 0) goto L_0x00b6
            android.os.Bundle r0 = r13.getExtras()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r4 = "appboy_action_uri"
            if (r0 != 0) goto L_0x008a
        L_0x0088:
            r0 = r1
            goto L_0x0091
        L_0x008a:
            boolean r0 = r0.containsKey(r4)     // Catch:{ Exception -> 0x00e7 }
            if (r0 != r2) goto L_0x0088
            r0 = r2
        L_0x0091:
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r13.getStringExtra(r4)     // Catch:{ Exception -> 0x00e7 }
            r13.putExtra(r3, r0)     // Catch:{ Exception -> 0x00e7 }
            android.os.Bundle r0 = r13.getExtras()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r3 = "appboy_action_use_webview"
            if (r0 != 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            boolean r0 = r0.containsKey(r3)     // Catch:{ Exception -> 0x00e7 }
            if (r0 != r2) goto L_0x00aa
            r1 = r2
        L_0x00aa:
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "ab_use_webview"
            java.lang.String r1 = r13.getStringExtra(r3)     // Catch:{ Exception -> 0x00e7 }
            r13.putExtra(r0, r1)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00b9
        L_0x00b6:
            r13.removeExtra(r3)     // Catch:{ Exception -> 0x00e7 }
        L_0x00b9:
            p093g0.C7668f.m15035u(r12, r13)     // Catch:{ Exception -> 0x00e7 }
            com.braze.configuration.b r0 = new com.braze.configuration.b     // Catch:{ Exception -> 0x00e7 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x00e7 }
            boolean r0 = r0.getDoesHandlePushDeepLinksAutomatically()     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x00cb
            p093g0.C7668f.m15034t(r12, r13)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f7
        L_0x00cb:
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00e7 }
            j0.c$a r6 = p126j0.C8266c.C8267a.I     // Catch:{ Exception -> 0x00e7 }
            r7 = 0
            r8 = 0
            g0.c$i r9 = p093g0.C7625c.C7634i.f10607g     // Catch:{ Exception -> 0x00e7 }
            r10 = 6
            r11 = 0
            p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f7
        L_0x00d9:
            j0.c r4 = p126j0.C8266c.f11641a     // Catch:{ Exception -> 0x00e7 }
            j0.c$a r6 = p126j0.C8266c.C8267a.f11651g     // Catch:{ Exception -> 0x00e7 }
            r7 = 0
            r8 = 0
            g0.c$j r9 = p093g0.C7625c.C7635j.f10608g     // Catch:{ Exception -> 0x00e7 }
            r10 = 6
            r11 = 0
            p126j0.C8266c.m16396e(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f7
        L_0x00e7:
            r12 = move-exception
            r3 = r12
            j0.c r0 = p126j0.C8266c.f11641a
            g0.c r1 = f10598a
            j0.c$a r2 = p126j0.C8266c.C8267a.f11649e
            r4 = 0
            g0.c$k r5 = p093g0.C7625c.C7636k.f10609g
            r6 = 4
            r7 = 0
            p126j0.C8266c.m16396e(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p093g0.C7625c.m14980c(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: a */
    public final void mo41361a(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent pendingIntent;
        NotificationCompat.Builder builder2 = builder;
        BrazeNotificationPayload.ActionButton actionButton2 = actionButton;
        C12775o.m28639i(builder2, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C12775o.m28639i(actionButton2, "actionButton");
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7626a.f10599g, 7, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(brazeNotificationPayload.getNotificationExtras());
        actionButton2.putIntoBundle(bundle);
        String type = actionButton.getType();
        int b = 134217728 | C8275f.m16441b();
        if (C12775o.m28634d(Constants.APPBOY_PUSH_ACTION_TYPE_NONE, type)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7627b(type), 6, (Object) null);
            Intent intent = new Intent(Constants.APPBOY_ACTION_CLICKED_ACTION).setClass(context, C7668f.m15019e());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            pendingIntent = PendingIntent.getBroadcast(context, C8275f.m16444e(), intent, b);
            C12775o.m28638h(pendingIntent, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7628c(type), 6, (Object) null);
            Intent intent2 = new Intent(Constants.APPBOY_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            C12775o.m28638h(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            pendingIntent = PendingIntent.getActivity(context, C8275f.m16444e(), intent2, b);
            C12775o.m28638h(pendingIntent, "getActivity(\n           …IntentFlags\n            )");
        }
        NotificationCompat.Action.Builder builder3 = new NotificationCompat.Action.Builder(0, (CharSequence) actionButton.getText(), pendingIntent);
        builder3.addExtras(new Bundle(bundle));
        builder2.addAction(builder3.build());
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7629d(bundle), 6, (Object) null);
    }

    /* renamed from: d */
    public final void mo41362d(Context context, Intent intent, String str) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        C10156b.f15345m.mo44811g(context).mo44780Z(intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY), intent.getStringExtra(Constants.APPBOY_ACTION_ID_KEY), str);
    }
}
