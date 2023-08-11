package p093g0;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p270x.C10350k;
import p404of.C13074a;

/* renamed from: g0.d */
/* compiled from: BrazeNotificationFactory.kt */
public class C7637d implements C10350k {
    public static final C7638a Companion = new C7638a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static volatile C7637d internalInstance = new C7637d();

    /* renamed from: g0.d$a */
    /* compiled from: BrazeNotificationFactory.kt */
    public static final class C7638a {

        /* renamed from: g0.d$a$a */
        /* compiled from: BrazeNotificationFactory.kt */
        static final class C7639a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ BrazeNotificationPayload f10610g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7639a(BrazeNotificationPayload brazeNotificationPayload) {
                super(0);
                this.f10610g = brazeNotificationPayload;
            }

            public final String invoke() {
                return C12775o.m28647q("Using BrazeNotificationPayload: ", this.f10610g);
            }
        }

        /* renamed from: g0.d$a$b */
        /* compiled from: BrazeNotificationFactory.kt */
        static final class C7640b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7640b f10611g = new C7640b();

            C7640b() {
                super(0);
            }

            public final String invoke() {
                return "BrazeNotificationPayload has null context. Not creating notification";
            }
        }

        /* renamed from: g0.d$a$c */
        /* compiled from: BrazeNotificationFactory.kt */
        static final class C7641c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7641c f10612g = new C7641c();

            C7641c() {
                super(0);
            }

            public final String invoke() {
                return "BrazeNotificationPayload has null app configuration provider. Not creating notification";
            }
        }

        private C7638a() {
        }

        public /* synthetic */ C7638a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7637d mo41366a() {
            return C7637d.internalInstance;
        }

        /* renamed from: b */
        public final NotificationCompat.Builder mo41367b(BrazeNotificationPayload brazeNotificationPayload) {
            C12775o.m28639i(brazeNotificationPayload, "payload");
            C8266c cVar = C8266c.f11641a;
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7639a(brazeNotificationPayload), 6, (Object) null);
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C7640b.f10611g, 7, (Object) null);
                return null;
            }
            C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C7641c.f10612g, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            C7668f.m15031q(brazeNotificationPayload);
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, C7668f.m15020f(brazeNotificationPayload)).setAutoCancel(true);
            C12775o.m28638h(autoCancel, "Builder(context, notific…     .setAutoCancel(true)");
            C7668f.m15011O(autoCancel, brazeNotificationPayload);
            C7668f.m14998B(autoCancel, brazeNotificationPayload);
            C7668f.m15010N(autoCancel, brazeNotificationPayload);
            C7668f.m15006J(autoCancel, brazeNotificationPayload);
            C7668f.m14999C(context, autoCancel, notificationExtras);
            C7668f.m15000D(context, autoCancel, notificationExtras);
            C7668f.m15007K(configurationProvider, autoCancel);
            C7668f.m15001E(autoCancel, brazeNotificationPayload);
            C7668f.m15008L(autoCancel, brazeNotificationPayload);
            C7668f.m15009M(autoCancel, brazeNotificationPayload);
            C7668f.m15004H(autoCancel, brazeNotificationPayload);
            C7643e.Companion.mo41375l(autoCancel, brazeNotificationPayload);
            C7625c.m14979b(autoCancel, brazeNotificationPayload);
            C7668f.m15040z(autoCancel, brazeNotificationPayload);
            C7668f.m14997A(autoCancel, brazeNotificationPayload);
            C7668f.m15012P(autoCancel, brazeNotificationPayload);
            C7668f.m15005I(autoCancel, brazeNotificationPayload);
            C7668f.m15002F(autoCancel, brazeNotificationPayload);
            return autoCancel;
        }
    }

    /* renamed from: g0.d$b */
    /* compiled from: BrazeNotificationFactory.kt */
    static final class C7642b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7642b f10613g = new C7642b();

        C7642b() {
            super(0);
        }

        public final String invoke() {
            return "Notification could not be built. Returning null as created notification";
        }
    }

    public static final C7637d getInstance() {
        return Companion.mo41366a();
    }

    public static final NotificationCompat.Builder populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
        return Companion.mo41367b(brazeNotificationPayload);
    }

    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(brazeNotificationPayload, "payload");
        NotificationCompat.Builder b = Companion.mo41367b(brazeNotificationPayload);
        if (b != null) {
            return b.build();
        }
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7642b.f10613g, 6, (Object) null);
        return null;
    }

    public final NotificationCompat.Builder populateNotificationBuilder(C4218b bVar, Context context, Bundle bundle, Bundle bundle2) {
        return Companion.mo41367b(new BrazeNotificationPayload(bundle, bundle2, context, bVar));
    }

    public final Notification createNotification(C4218b bVar, Context context, Bundle bundle, Bundle bundle2) {
        return createNotification(new BrazeNotificationPayload(bundle, bundle2, context, bVar));
    }
}
