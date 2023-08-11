package p093g0;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import com.appboy.models.push.BrazeNotificationPayload;
import com.braze.configuration.C4218b;
import com.braze.push.BrazePushReceiver;
import com.braze.push.NotificationTrampolineActivity;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p019a1.C2113b;
import p105h0.C7880a;
import p126j0.C8266c;
import p126j0.C8275f;
import p126j0.C8278g;
import p126j0.C8287i;
import p136k0.C8429a;
import p146l0.C8622c;
import p270x.C10156b;
import p270x.C10299e;
import p270x.C10345g;
import p270x.C10350k;
import p292z.C10731b;
import p292z.C10734d;
import p404of.C13074a;

/* renamed from: g0.f */
/* compiled from: BrazeNotificationUtils.kt */
public final class C7668f {

    /* renamed from: a */
    public static final C7668f f10636a = new C7668f();

    /* renamed from: b */
    private static final String f10637b = C8266c.m16405n(C7668f.class);

    /* renamed from: c */
    private static final String f10638c = ".intent.APPBOY_NOTIFICATION_OPENED";

    /* renamed from: d */
    private static final String f10639d = ".intent.APPBOY_PUSH_RECEIVED";

    /* renamed from: e */
    private static final String f10640e = ".intent.APPBOY_PUSH_DELETED";

    /* renamed from: g0.f$a */
    /* compiled from: BrazeNotificationUtils.kt */
    private enum C7669a {
        OPENED(C10731b.NOTIFICATION_OPENED),
        RECEIVED(C10731b.NOTIFICATION_RECEIVED),
        DELETED(C10731b.NOTIFICATION_DELETED);
        

        /* renamed from: b */
        private final C10731b f10645b;

        private C7669a(C10731b bVar) {
            this.f10645b = bVar;
        }

        /* renamed from: b */
        public final C10731b mo41376b() {
            return this.f10645b;
        }
    }

    /* renamed from: g0.f$a0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7670a0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7670a0 f10646g = new C7670a0();

        C7670a0() {
            super(0);
        }

        public final String invoke() {
            return "Geofence sync key was true. Syncing geofences.";
        }
    }

    /* renamed from: g0.f$a1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7671a1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7671a1 f10647g = new C7671a1();

        C7671a1() {
            super(0);
        }

        public final String invoke() {
            return "Set show when not supported in story push.";
        }
    }

    /* renamed from: g0.f$b */
    /* compiled from: BrazeNotificationUtils.kt */
    public /* synthetic */ class C7672b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10648a;

        static {
            int[] iArr = new int[C7669a.values().length];
            iArr[C7669a.OPENED.ordinal()] = 1;
            iArr[C7669a.RECEIVED.ordinal()] = 2;
            iArr[C7669a.DELETED.ordinal()] = 3;
            f10648a = iArr;
        }
    }

    /* renamed from: g0.f$b0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7673b0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7673b0 f10649g = new C7673b0();

        C7673b0() {
            super(0);
        }

        public final String invoke() {
            return "Geofence sync key not included in push payload or false. Not syncing geofences.";
        }
    }

    /* renamed from: g0.f$b1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7674b1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7674b1 f10650g = new C7674b1();

        C7674b1() {
            super(0);
        }

        public final String invoke() {
            return "Small notification icon resource was not found. Will use the app icon when displaying notifications.";
        }
    }

    /* renamed from: g0.f$c */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7675c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10651g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7675c(int i) {
            super(0);
            this.f10651g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Cancelling notification action with id: ", Integer.valueOf(this.f10651g));
        }
    }

    /* renamed from: g0.f$c0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7676c0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10652g;

        /* renamed from: h */
        final /* synthetic */ boolean f10653h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7676c0(String str, boolean z) {
            super(0);
            this.f10652g = str;
            this.f10653h = z;
        }

        public final String invoke() {
            return "Found a deep link: " + this.f10652g + ". Use webview set to: " + this.f10653h;
        }
    }

    /* renamed from: g0.f$c1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7677c1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7677c1 f10654g = new C7677c1();

        C7677c1() {
            super(0);
        }

        public final String invoke() {
            return "Setting small icon for notification via resource id";
        }
    }

    /* renamed from: g0.f$d */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7678d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7678d f10655g = new C7678d();

        C7678d() {
            super(0);
        }

        public final String invoke() {
            return "Exception occurred attempting to cancel notification.";
        }
    }

    /* renamed from: g0.f$d0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7679d0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f10656g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7679d0(Intent intent) {
            super(0);
            this.f10656g = intent;
        }

        public final String invoke() {
            return C12775o.m28647q("Push notification had no deep link. Opening main activity: ", this.f10656g);
        }
    }

    /* renamed from: g0.f$d1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7680d1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7680d1 f10657g = new C7680d1();

        C7680d1() {
            super(0);
        }

        public final String invoke() {
            return "Setting default sound for notification.";
        }
    }

    /* renamed from: g0.f$e */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7681e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Integer f10658g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7681e(Integer num) {
            super(0);
            this.f10658g = num;
        }

        public final String invoke() {
            return C12775o.m28647q("Using notification id provided in the message's extras bundle: ", this.f10658g);
        }
    }

    /* renamed from: g0.f$e0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7682e0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7682e0 f10659g = new C7682e0();

        C7682e0() {
            super(0);
        }

        public final String invoke() {
            return "Sending notification opened broadcast";
        }
    }

    /* renamed from: g0.f$e1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7683e1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7683e1 f10660g = new C7683e1();

        C7683e1() {
            super(0);
        }

        public final String invoke() {
            return "Setting sound for notification via uri.";
        }
    }

    /* renamed from: g0.f$f */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7684f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10661g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7684f(int i) {
            super(0);
            this.f10661g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Message without notification id provided in the extras bundle received. Using a hash of the message: ", Integer.valueOf(this.f10661g));
        }
    }

    /* renamed from: g0.f$f0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7685f0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7669a f10662g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7685f0(C7669a aVar) {
            super(0);
            this.f10662g = aVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Sending original Appboy broadcast receiver intent for ", this.f10662g);
        }
    }

    /* renamed from: g0.f$f1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7686f1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7686f1 f10663g = new C7686f1();

        C7686f1() {
            super(0);
        }

        public final String invoke() {
            return "Setting summary text for notification";
        }
    }

    /* renamed from: g0.f$g */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7687g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Integer f10664g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7687g(Integer num) {
            super(0);
            this.f10664g = num;
        }

        public final String invoke() {
            return C12775o.m28647q("Received invalid notification priority ", this.f10664g);
        }
    }

    /* renamed from: g0.f$g0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7688g0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C7669a f10665g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7688g0(C7669a aVar) {
            super(0);
            this.f10665g = aVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Sending Braze broadcast receiver intent for ", this.f10665g);
        }
    }

    /* renamed from: g0.f$g1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7689g1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7689g1 f10666g = new C7689g1();

        C7689g1() {
            super(0);
        }

        public final String invoke() {
            return "Summary text not present. Not setting summary text for notification.";
        }
    }

    /* renamed from: g0.f$h */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7690h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10667g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7690h(String str) {
            super(0);
            this.f10667g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Found notification channel in extras with id: ", this.f10667g);
        }
    }

    /* renamed from: g0.f$h0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7691h0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Intent f10668g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7691h0(Intent intent) {
            super(0);
            this.f10668g = intent;
        }

        public final String invoke() {
            return C12775o.m28647q("Sending push action intent: ", this.f10668g);
        }
    }

    /* renamed from: g0.f$h1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7692h1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7692h1 f10669g = new C7692h1();

        C7692h1() {
            super(0);
        }

        public final String invoke() {
            return "Setting ticker for notification";
        }
    }

    /* renamed from: g0.f$i */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7693i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10670g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7693i(String str) {
            super(0);
            this.f10670g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Notification channel from extras is invalid. No channel found with id: ", this.f10670g);
        }
    }

    /* renamed from: g0.f$i0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7694i0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7694i0 f10671g = new C7694i0();

        C7694i0() {
            super(0);
        }

        public final String invoke() {
            return "Sending push message received broadcast";
        }
    }

    /* renamed from: g0.f$i1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7695i1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7695i1 f10672g = new C7695i1();

        C7695i1() {
            super(0);
        }

        public final String invoke() {
            return "Setting title for notification";
        }
    }

    /* renamed from: g0.f$j */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7696j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7696j f10673g = new C7696j();

        C7696j() {
            super(0);
        }

        public final String invoke() {
            return "Braze default notification channel does not exist on device. Creating default channel.";
        }
    }

    /* renamed from: g0.f$j0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7697j0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7697j0 f10674g = new C7697j0();

        C7697j0() {
            super(0);
        }

        public final String invoke() {
            return "Using accent color for notification from extras bundle";
        }
    }

    /* renamed from: g0.f$j1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7698j1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7698j1 f10675g = new C7698j1();

        C7698j1() {
            super(0);
        }

        public final String invoke() {
            return "Setting visibility for notification";
        }
    }

    /* renamed from: g0.f$k */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7699k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7699k f10676g = new C7699k();

        C7699k() {
            super(0);
        }

        public final String invoke() {
            return "Notification extras bundle was null. Could not find a valid notification channel";
        }
    }

    /* renamed from: g0.f$k0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7700k0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7700k0 f10677g = new C7700k0();

        C7700k0() {
            super(0);
        }

        public final String invoke() {
            return "Using default accent color for notification";
        }
    }

    /* renamed from: g0.f$k1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7701k1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Integer f10678g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7701k1(Integer num) {
            super(0);
            this.f10678g = num;
        }

        public final String invoke() {
            return C12775o.m28647q("Received invalid notification visibility ", this.f10678g);
        }
    }

    /* renamed from: g0.f$l */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7702l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10679g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7702l(String str) {
            super(0);
            this.f10679g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Found notification channel in extras with id: ", this.f10679g);
        }
    }

    /* renamed from: g0.f$l0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7703l0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7703l0 f10680g = new C7703l0();

        C7703l0() {
            super(0);
        }

        public final String invoke() {
            return "Setting category for notification";
        }
    }

    /* renamed from: g0.f$l1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7704l1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7704l1 f10681g = new C7704l1();

        C7704l1() {
            super(0);
        }

        public final String invoke() {
            return "Not waking this TV UI mode device";
        }
    }

    /* renamed from: g0.f$m */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7705m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10682g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7705m(String str) {
            super(0);
            this.f10682g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Notification channel from extras is invalid, no channel found with id: ", this.f10682g);
        }
    }

    /* renamed from: g0.f$m0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7706m0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7706m0 f10683g = new C7706m0();

        C7706m0() {
            super(0);
        }

        public final String invoke() {
            return "Category not present in notification extras. Not setting category for notification.";
        }
    }

    /* renamed from: g0.f$m1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7707m1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7707m1 f10684g = new C7707m1();

        C7707m1() {
            super(0);
        }

        public final String invoke() {
            return "Failed to check for TV status during screen wake. Continuing.";
        }
    }

    /* renamed from: g0.f$n */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7708n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7708n f10685g = new C7708n();

        C7708n() {
            super(0);
        }

        public final String invoke() {
            return "Braze default notification channel does not exist on device.";
        }
    }

    /* renamed from: g0.f$n0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7709n0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7709n0 f10686g = new C7709n0();

        C7709n0() {
            super(0);
        }

        public final String invoke() {
            return "Setting content for notification";
        }
    }

    /* renamed from: g0.f$n1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7710n1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7710n1 f10687g = new C7710n1();

        C7710n1() {
            super(0);
        }

        public final String invoke() {
            return "Not waking screen on Android O+ device, could not find notification channel.";
        }
    }

    /* renamed from: g0.f$o */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7711o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10688g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7711o(int i) {
            super(0);
            this.f10688g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Cancelling notification action with id: ", Integer.valueOf(this.f10688g));
        }
    }

    /* renamed from: g0.f$o0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7712o0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7712o0 f10689g = new C7712o0();

        C7712o0() {
            super(0);
        }

        public final String invoke() {
            return "Error setting content intent.";
        }
    }

    /* renamed from: g0.f$o1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7713o1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ NotificationChannel f10690g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7713o1(NotificationChannel notificationChannel) {
            super(0);
            this.f10690g = notificationChannel;
        }

        public final String invoke() {
            return C12775o.m28647q("Not acquiring wake-lock for Android O+ notification with importance: ", Integer.valueOf(this.f10690g.getImportance()));
        }
    }

    /* renamed from: g0.f$p */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7714p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7714p f10691g = new C7714p();

        C7714p() {
            super(0);
        }

        public final String invoke() {
            return "Exception occurred handling cancel notification intent.";
        }
    }

    /* renamed from: g0.f$p0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7715p0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7715p0 f10692g = new C7715p0();

        C7715p0() {
            super(0);
        }

        public final String invoke() {
            return "Error setting delete intent.";
        }
    }

    /* renamed from: g0.f$p1 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7716p1 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7716p1 f10693g = new C7716p1();

        C7716p1() {
            super(0);
        }

        public final String invoke() {
            return "Waking screen for notification";
        }
    }

    /* renamed from: g0.f$q */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7717q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10694g;

        /* renamed from: h */
        final /* synthetic */ String f10695h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7717q(String str, String str2) {
            super(0);
            this.f10694g = str;
            this.f10695h = str2;
        }

        public final String invoke() {
            return "Push contains associated Content Cards card. User id: " + this.f10694g + " Card data: " + this.f10695h;
        }
    }

    /* renamed from: g0.f$q0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7718q0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7718q0 f10696g = new C7718q0();

        C7718q0() {
            super(0);
        }

        public final String invoke() {
            return "Large icon not supported in story push.";
        }
    }

    /* renamed from: g0.f$r */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7719r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7719r f10697g = new C7719r();

        C7719r() {
            super(0);
        }

        public final String invoke() {
            return "Sending notification deleted broadcast";
        }
    }

    /* renamed from: g0.f$r0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7720r0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7720r0 f10698g = new C7720r0();

        C7720r0() {
            super(0);
        }

        public final String invoke() {
            return "Setting large icon for notification";
        }
    }

    /* renamed from: g0.f$s */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7721s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7721s f10699g = new C7721s();

        C7721s() {
            super(0);
        }

        public final String invoke() {
            return "Exception occurred attempting to handle notification delete intent.";
        }
    }

    /* renamed from: g0.f$s0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7722s0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7722s0 f10700g = new C7722s0();

        C7722s0() {
            super(0);
        }

        public final String invoke() {
            return "Large icon bitmap url not present in extras. Attempting to use resource id instead.";
        }
    }

    /* renamed from: g0.f$t */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7723t extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7723t f10701g = new C7723t();

        C7723t() {
            super(0);
        }

        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    /* renamed from: g0.f$t0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7724t0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7724t0 f10702g = new C7724t0();

        C7724t0() {
            super(0);
        }

        public final String invoke() {
            return "Large icon resource id not present for notification";
        }
    }

    /* renamed from: g0.f$u */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7725u extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7725u f10703g = new C7725u();

        C7725u() {
            super(0);
        }

        public final String invoke() {
            return "Exception occurred attempting to handle notification opened intent.";
        }
    }

    /* renamed from: g0.f$u0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7726u0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7726u0 f10704g = new C7726u0();

        C7726u0() {
            super(0);
        }

        public final String invoke() {
            return "Error setting large notification icon";
        }
    }

    /* renamed from: g0.f$v */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7727v extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10705g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7727v(String str) {
            super(0);
            this.f10705g = str;
        }

        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling for '" + this.f10705g + '\'';
        }
    }

    /* renamed from: g0.f$v0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7728v0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7728v0 f10706g = new C7728v0();

        C7728v0() {
            super(0);
        }

        public final String invoke() {
            return "Large icon not set for notification";
        }
    }

    /* renamed from: g0.f$w */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7729w extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7729w f10707g = new C7729w();

        C7729w() {
            super(0);
        }

        public final String invoke() {
            return "Caught exception while handling story click.";
        }
    }

    /* renamed from: g0.f$w0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7730w0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7730w0 f10708g = new C7730w0();

        C7730w0() {
            super(0);
        }

        public final String invoke() {
            return "Notification badge number not supported on this android version. Not setting badge number for notification.";
        }
    }

    /* renamed from: g0.f$x */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7731x extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10709g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7731x(String str) {
            super(0);
            this.f10709g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Pre-fetching bitmap at URL: ", this.f10709g);
        }
    }

    /* renamed from: g0.f$x0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7732x0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10710g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7732x0(int i) {
            super(0);
            this.f10710g = i;
        }

        public final String invoke() {
            return "Setting Notification duration alarm for " + this.f10710g + " ms";
        }
    }

    /* renamed from: g0.f$y */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7733y extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7733y f10711g = new C7733y();

        C7733y() {
            super(0);
        }

        public final String invoke() {
            return "Feature flag refresh key was true. Refreshing feature flags.";
        }
    }

    /* renamed from: g0.f$y0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7734y0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7734y0 f10712g = new C7734y0();

        C7734y0() {
            super(0);
        }

        public final String invoke() {
            return "Setting priority for notification";
        }
    }

    /* renamed from: g0.f$z */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7735z extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7735z f10713g = new C7735z();

        C7735z() {
            super(0);
        }

        public final String invoke() {
            return "Feature flag refresh key not included in push payload or false. Not refreshing feature flags.";
        }
    }

    /* renamed from: g0.f$z0 */
    /* compiled from: BrazeNotificationUtils.kt */
    static final class C7736z0 extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ BrazeNotificationPayload f10714g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7736z0(BrazeNotificationPayload brazeNotificationPayload) {
            super(0);
            this.f10714g = brazeNotificationPayload;
        }

        public final String invoke() {
            return C12775o.m28647q("Setting public version of notification with payload: ", this.f10714g);
        }
    }

    private C7668f() {
    }

    /* renamed from: A */
    public static final void m14997A(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        NotificationCompat.Builder builder2 = builder;
        C12775o.m28639i(builder2, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        String notificationCategory = brazeNotificationPayload.getNotificationCategory();
        if (notificationCategory != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7703l0.f10680g, 7, (Object) null);
            builder2.setCategory(notificationCategory);
            return;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7706m0.f10683g, 7, (Object) null);
    }

    /* renamed from: B */
    public static final void m14998B(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C4218b configurationProvider;
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7709n0.f10686g, 7, (Object) null);
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText != null && (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) != null) {
            builder.setContentText(C7880a.m15418a(contentText, configurationProvider));
        }
    }

    /* renamed from: C */
    public static final void m14999C(Context context, NotificationCompat.Builder builder, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(builder, "notificationBuilder");
        try {
            builder.setContentIntent(f10636a.m15021g(context, Constants.APPBOY_PUSH_CLICKED_ACTION, bundle));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7712o0.f10689g, 4, (Object) null);
        }
    }

    /* renamed from: D */
    public static final void m15000D(Context context, NotificationCompat.Builder builder, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(builder, "notificationBuilder");
        try {
            Intent intent = new Intent(Constants.APPBOY_PUSH_DELETED_ACTION).setClass(context, m15019e());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            builder.setDeleteIntent(PendingIntent.getBroadcast(context, C8275f.m16444e(), intent, C8275f.m16441b() | BasicMeasure.EXACTLY));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7715p0.f10692g, 4, (Object) null);
        }
    }

    /* renamed from: E */
    public static final boolean m15001E(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C4218b configurationProvider;
        NotificationCompat.Builder builder2 = builder;
        C12775o.m28639i(builder2, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.isPushStory()) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7718q0.f10696g, 7, (Object) null);
            return false;
        }
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            C8266c cVar = C8266c.f11641a;
            C7668f fVar = f10636a;
            C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7720r0.f10698g, 7, (Object) null);
            String largeIcon = brazeNotificationPayload.getLargeIcon();
            if (largeIcon == null) {
                C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7722s0.f10700g, 7, (Object) null);
                int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
                if (largeNotificationIconResourceId != 0) {
                    builder2.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
                    return true;
                }
                C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7724t0.f10702g, 7, (Object) null);
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7728v0.f10706g, 7, (Object) null);
                return false;
            }
            builder2.setLargeIcon(C10156b.f15345m.mo44811g(context).mo44772P().mo29853b(context, (Bundle) null, largeIcon, C10734d.NOTIFICATION_LARGE_ICON));
            return true;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7726u0.f10704g, 4, (Object) null);
        }
    }

    /* renamed from: F */
    public static final void m15002F(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        if (Build.VERSION.SDK_INT < 26) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7730w0.f10708g, 7, (Object) null);
            return;
        }
        Integer notificationBadgeNumber = brazeNotificationPayload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            builder.setNumber(notificationBadgeNumber.intValue());
        }
    }

    /* renamed from: G */
    public static final void m15003G(Context context, Class<?> cls, int i, int i2) {
        C12775o.m28639i(context, "context");
        Intent intent = new Intent(context, cls);
        intent.setAction(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | C8275f.m16441b());
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService != null) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            if (i2 >= 1000) {
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7732x0(i2), 7, (Object) null);
                alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i2), broadcast);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
    }

    /* renamed from: H */
    public static final void m15004H(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7734y0.f10712g, 7, (Object) null);
        builder.setPriority(m15018d(brazeNotificationPayload));
    }

    /* renamed from: I */
    public static final void m15005I(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        NotificationCompat.Builder builder2 = builder;
        C12775o.m28639i(builder2, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (context != null && brazeNotificationPayload.getPublicNotificationExtras() != null && configurationProvider != null) {
            String f = m15020f(brazeNotificationPayload);
            Bundle n = C8278g.m16460n(brazeNotificationPayload.getPublicNotificationExtras());
            if (!n.isEmpty()) {
                BrazeNotificationPayload brazeNotificationPayload2 = new BrazeNotificationPayload(n, (Bundle) null, context, configurationProvider, 2, (DefaultConstructorMarker) null);
                NotificationCompat.Builder builder3 = new NotificationCompat.Builder(context, f);
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7736z0(brazeNotificationPayload2), 7, (Object) null);
                m14998B(builder3, brazeNotificationPayload2);
                m15011O(builder3, brazeNotificationPayload2);
                m15009M(builder3, brazeNotificationPayload2);
                m15007K(configurationProvider, builder3);
                m15040z(builder3, brazeNotificationPayload2);
                builder2.setPublicVersion(builder3.build());
            }
        }
    }

    /* renamed from: J */
    public static final void m15006J(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.isPushStory()) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7671a1.f10647g, 7, (Object) null);
            builder.setShowWhen(false);
        }
    }

    /* renamed from: K */
    public static final int m15007K(C4218b bVar, NotificationCompat.Builder builder) {
        C12775o.m28639i(bVar, "appConfigurationProvider");
        C12775o.m28639i(builder, "notificationBuilder");
        int smallNotificationIconResourceId = bVar.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7674b1.f10650g, 7, (Object) null);
            smallNotificationIconResourceId = bVar.getApplicationIconResourceId();
        } else {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7677c1.f10654g, 7, (Object) null);
        }
        builder.setSmallIcon(smallNotificationIconResourceId);
        return smallNotificationIconResourceId;
    }

    /* renamed from: L */
    public static final void m15008L(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        String notificationSound = brazeNotificationPayload.getNotificationSound();
        if (notificationSound != null) {
            if (C12775o.m28634d(notificationSound, Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE)) {
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7680d1.f10657g, 7, (Object) null);
                builder.setDefaults(1);
                return;
            }
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7683e1.f10660g, 7, (Object) null);
            builder.setSound(Uri.parse(notificationSound));
        }
    }

    /* renamed from: M */
    public static final void m15009M(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        NotificationCompat.Builder builder2 = builder;
        C12775o.m28639i(builder2, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        String summaryText = brazeNotificationPayload.getSummaryText();
        if (summaryText != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7686f1.f10663g, 7, (Object) null);
            builder2.setSubText(summaryText);
            return;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7689g1.f10666g, 7, (Object) null);
    }

    /* renamed from: N */
    public static final void m15010N(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7692h1.f10669g, 7, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText != null) {
            builder.setTicker(titleText);
        }
    }

    /* renamed from: O */
    public static final void m15011O(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C4218b configurationProvider;
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7695i1.f10672g, 7, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText != null && (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) != null) {
            builder.setContentTitle(C7880a.m15418a(titleText, configurationProvider));
        }
    }

    /* renamed from: P */
    public static final void m15012P(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Integer notificationVisibility = brazeNotificationPayload.getNotificationVisibility();
        if (notificationVisibility == null) {
            return;
        }
        if (m15030p(notificationVisibility.intValue())) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7698j1.f10675g, 7, (Object) null);
            builder.setVisibility(notificationVisibility.intValue());
            return;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11651g, (Throwable) null, false, new C7701k1(notificationVisibility), 6, (Object) null);
    }

    /* renamed from: Q */
    public static final boolean m15013Q(Context context, C4218b bVar, Bundle bundle) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "configurationProvider");
        return m15014R(new BrazeNotificationPayload(bundle, (Bundle) null, context, bVar, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: R */
    public static final boolean m15014R(BrazeNotificationPayload brazeNotificationPayload) {
        C4218b configurationProvider;
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        if (!C8287i.m16471b(context, "android.permission.WAKE_LOCK") || !configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("uimode");
            if (systemService != null) {
                if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                    C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7704l1.f10681g, 7, (Object) null);
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Object systemService2 = context.getSystemService("notification");
                    if (systemService2 != null) {
                        NotificationChannel h = m15022h((NotificationManager) systemService2, notificationExtras);
                        if (h == null) {
                            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7710n1.f10687g, 7, (Object) null);
                            return false;
                        } else if (h.getImportance() == 1) {
                            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7713o1(h), 7, (Object) null);
                            return false;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                    }
                } else if (m15018d(brazeNotificationPayload) == -2) {
                    return false;
                }
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7716p1.f10693g, 7, (Object) null);
                Object systemService3 = context.getSystemService("power");
                if (systemService3 != null) {
                    PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, f10637b);
                    newWakeLock.acquire();
                    newWakeLock.release();
                    return true;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.os.PowerManager");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.UiModeManager");
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7707m1.f10684g, 4, (Object) null);
        }
    }

    /* renamed from: a */
    public static final void m15015a(Context context, int i) {
        C12775o.m28639i(context, "context");
        try {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7675c(i), 7, (Object) null);
            Intent intent = new Intent(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION).setClass(context, m15019e());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, i);
            C8275f.m16440a(context, intent);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7678d.f10655g, 4, (Object) null);
        }
    }

    /* renamed from: b */
    public static final C10350k m15016b() {
        C10350k f = C10156b.f15345m.mo44810f();
        if (f == null) {
            return C7637d.Companion.mo41366a();
        }
        return f;
    }

    /* renamed from: c */
    public static final int m15017c(BrazeNotificationPayload brazeNotificationPayload) {
        int i;
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Integer customNotificationId = brazeNotificationPayload.getCustomNotificationId();
        if (customNotificationId != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7681e(customNotificationId), 7, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = brazeNotificationPayload.getTitleText();
        String str = "";
        if (titleText != null) {
            str = C12775o.m28647q(str, titleText);
        }
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText != null) {
            str = C12775o.m28647q(str, contentText);
        }
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7684f(i), 7, (Object) null);
        return i;
    }

    /* renamed from: d */
    public static final int m15018d(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Integer notificationPriorityInt = brazeNotificationPayload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = brazeNotificationPayload.getNotificationPriorityInt();
        if (notificationPriorityInt2 != null) {
            int intValue = notificationPriorityInt2.intValue();
            if (-2 > intValue || intValue >= 3) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return intValue;
            }
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11651g, (Throwable) null, false, new C7687g(notificationPriorityInt), 6, (Object) null);
        }
        return 0;
    }

    /* renamed from: e */
    public static final Class<?> m15019e() {
        if (C10345g.m21724a()) {
            return C7619a.class;
        }
        return BrazePushReceiver.class;
    }

    /* renamed from: f */
    public static final String m15020f(BrazeNotificationPayload brazeNotificationPayload) {
        Object obj;
        String str;
        C12775o.m28639i(brazeNotificationPayload, "payload");
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        if (Build.VERSION.SDK_INT < 26) {
            return notificationChannelId == null ? Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID : notificationChannelId;
        }
        Context context = brazeNotificationPayload.getContext();
        C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        String str2 = null;
        if (context == null) {
            obj = null;
        } else {
            obj = context.getSystemService("notification");
        }
        if (obj != null) {
            NotificationManager notificationManager = (NotificationManager) obj;
            if (notificationChannelId != null) {
                if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                    C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7690h(notificationChannelId), 7, (Object) null);
                    return notificationChannelId;
                }
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7693i(notificationChannelId), 7, (Object) null);
            }
            if (notificationManager.getNotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7696j.f10673g, 7, (Object) null);
                if (configurationProvider == null) {
                    str = null;
                } else {
                    str = configurationProvider.getDefaultNotificationChannelName();
                }
                NotificationChannel notificationChannel = new NotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, str, 3);
                if (configurationProvider != null) {
                    str2 = configurationProvider.getDefaultNotificationChannelDescription();
                }
                notificationChannel.setDescription(str2);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    /* renamed from: g */
    private final PendingIntent m15021g(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        C12775o.m28638h(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, C8275f.m16444e(), intent, 1073741824 | C8275f.m16441b());
        C12775o.m28638h(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    /* renamed from: h */
    public static final NotificationChannel m15022h(NotificationManager notificationManager, Bundle bundle) {
        boolean z;
        NotificationManager notificationManager2 = notificationManager;
        Bundle bundle2 = bundle;
        C12775o.m28639i(notificationManager2, "notificationManager");
        if (bundle2 == null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7699k.f10676g, 7, (Object) null);
            return null;
        }
        String string = bundle2.getString(Constants.APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY, (String) null);
        if (string == null || C13754v.m31532t(string)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            NotificationChannel a = notificationManager2.getNotificationChannel(string);
            if (a != null) {
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7702l(string), 7, (Object) null);
                return a;
            }
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7705m(string), 7, (Object) null);
        }
        NotificationChannel a2 = notificationManager2.getNotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (a2 != null) {
            return a2;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7708n.f10685g, 7, (Object) null);
        return null;
    }

    /* renamed from: i */
    public static final void m15023i(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        try {
            if (intent.hasExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID)) {
                int intExtra = intent.getIntExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, -1);
                C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7711o(intExtra), 7, (Object) null);
                Object systemService = context.getSystemService("notification");
                if (systemService != null) {
                    ((NotificationManager) systemService).cancel(Constants.APPBOY_PUSH_NOTIFICATION_TAG, intExtra);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7714p.f10691g, 4, (Object) null);
        }
    }

    /* renamed from: j */
    public static final void m15024j(BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(brazeNotificationPayload, "payload");
        String contentCardSyncData = brazeNotificationPayload.getContentCardSyncData();
        String contentCardSyncUserId = brazeNotificationPayload.getContentCardSyncUserId();
        Context context = brazeNotificationPayload.getContext();
        if (contentCardSyncData != null && context != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7717q(contentCardSyncUserId, contentCardSyncData), 7, (Object) null);
            C10299e.m21642a(context, contentCardSyncData, contentCardSyncUserId);
        }
    }

    /* renamed from: k */
    public static final void m15025k(Context context, Intent intent) {
        Context context2 = context;
        C12775o.m28639i(context2, "context");
        C12775o.m28639i(intent, "intent");
        try {
            C8266c cVar = C8266c.f11641a;
            C7668f fVar = f10636a;
            C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7719r.f10697g, 7, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                fVar.m15037w(context2, C7669a.DELETED, extras, new BrazeNotificationPayload(extras, (Bundle) null, context, (C4218b) null, 10, (DefaultConstructorMarker) null));
                return;
            }
            m15038x(fVar, context, C7669a.DELETED, extras, (BrazeNotificationPayload) null, 8, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7721s.f10699g, 4, (Object) null);
        }
    }

    /* renamed from: l */
    public static final void m15026l(Context context, Intent intent) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        try {
            C10156b.f15345m.mo44811g(context).mo44782a0(intent);
            m15035u(context, intent);
            if (new C4218b(context).getDoesHandlePushDeepLinksAutomatically()) {
                m15034t(context, intent);
            } else {
                C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.I, (Throwable) null, false, C7723t.f10701g, 6, (Object) null);
            }
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7725u.f10703g, 4, (Object) null);
        }
    }

    /* renamed from: m */
    public static final void m15027m(Context context, Intent intent) {
        boolean z;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        try {
            C10156b.f15345m.mo44811g(context).mo44784b0(intent.getStringExtra(Constants.APPBOY_CAMPAIGN_ID), intent.getStringExtra(Constants.APPBOY_STORY_PAGE_ID));
            String stringExtra = intent.getStringExtra(Constants.APPBOY_ACTION_URI_KEY);
            boolean z2 = false;
            if (stringExtra == null || C13754v.m31532t(stringExtra)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                intent.putExtra(Constants.APPBOY_PUSH_DEEP_LINK_KEY, intent.getStringExtra(Constants.APPBOY_ACTION_URI_KEY));
                String stringExtra2 = intent.getStringExtra(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY);
                if (stringExtra2 == null || C13754v.m31532t(stringExtra2)) {
                    z2 = true;
                }
                if (!z2) {
                    intent.putExtra(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra2);
                }
            } else {
                intent.removeExtra(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
            }
            m15035u(context, intent);
            if (new C4218b(context).getDoesHandlePushDeepLinksAutomatically()) {
                m15034t(context, intent);
                return;
            }
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.I, (Throwable) null, false, new C7727v(stringExtra), 6, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11649e, e, false, C7729w.f10707g, 4, (Object) null);
        }
    }

    /* renamed from: n */
    public static final boolean m15028n(Intent intent) {
        C12775o.m28639i(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return C13754v.m31530r("true", extras.getString(Constants.APPBOY_PUSH_APPBOY_KEY), true);
    }

    /* renamed from: o */
    public static final boolean m15029o(Intent intent) {
        C12775o.m28639i(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey(Constants.APPBOY_PUSH_TITLE_KEY) && extras.containsKey(Constants.APPBOY_PUSH_CONTENT_KEY)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static final boolean m15030p(int i) {
        if (i == -1 || i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final void m15031q(BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (context != null && brazeNotificationPayload.isPushStory() && brazeNotificationPayload.isNewlyReceivedPushStory()) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (BrazeNotificationPayload.PushStoryPage bitmapUrl : brazeNotificationPayload.getPushStoryPages()) {
                String bitmapUrl2 = bitmapUrl.getBitmapUrl();
                if (bitmapUrl2 != null) {
                    arrayList.add(bitmapUrl2);
                }
            }
            for (String str : arrayList) {
                C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11650f, (Throwable) null, false, new C7731x(str), 6, (Object) null);
                C10156b.f15345m.mo44811g(context).mo44772P().mo29853b(context, brazeNotificationPayload.getBrazeExtras(), str, C10734d.NOTIFICATION_ONE_IMAGE_STORY);
            }
            brazeNotificationPayload.setNewlyReceivedPushStory(false);
        }
    }

    /* renamed from: r */
    public static final boolean m15032r(BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (!brazeNotificationPayload.getShouldRefreshFeatureFlags() || context == null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, C8266c.C8267a.f11650f, (Throwable) null, false, C7735z.f10713g, 6, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7733y.f10711g, 7, (Object) null);
        C10299e.m21648h(context);
        return true;
    }

    /* renamed from: s */
    public static final boolean m15033s(BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (!brazeNotificationPayload.getShouldSyncGeofences() || context == null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7673b0.f10649g, 7, (Object) null);
            return false;
        }
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7670a0.f10646g, 7, (Object) null);
        C10299e.m21650j(context, true);
        return true;
    }

    /* renamed from: t */
    public static final void m15034t(Context context, Intent intent) {
        boolean z;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra(Constants.APPBOY_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString(APIParams.SOURCE, Constants.APPBOY);
        String stringExtra = intent.getStringExtra(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        if (stringExtra == null || C13754v.m31532t(stringExtra)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            boolean r = C13754v.m31530r("true", intent.getStringExtra(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY), true);
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7676c0(stringExtra, r), 7, (Object) null);
            bundleExtra.putString(Constants.APPBOY_PUSH_DEEP_LINK_KEY, stringExtra);
            bundleExtra.putBoolean(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY, r);
            C8429a.C8430a aVar = C8429a.f12015a;
            C8622c c = aVar.mo42456a().mo42453c(stringExtra, bundleExtra, r, Channel.PUSH);
            if (c != null) {
                aVar.mo42456a().mo42454d(context, c);
                return;
            }
            return;
        }
        Intent a = C2113b.m1459a(context, bundleExtra);
        C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, new C7679d0(a), 7, (Object) null);
        context.startActivity(a);
    }

    /* renamed from: u */
    public static final void m15035u(Context context, Intent intent) {
        Context context2 = context;
        C12775o.m28639i(context2, "context");
        C12775o.m28639i(intent, "intent");
        C8266c cVar = C8266c.f11641a;
        C7668f fVar = f10636a;
        C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7682e0.f10659g, 7, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            fVar.m15037w(context2, C7669a.OPENED, extras, new BrazeNotificationPayload(extras, (Bundle) null, context, (C4218b) null, 10, (DefaultConstructorMarker) null));
            return;
        }
        m15038x(fVar, context, C7669a.OPENED, extras, (BrazeNotificationPayload) null, 8, (Object) null);
    }

    /* renamed from: v */
    private final void m15036v(Context context, Intent intent, Bundle bundle) {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C7691h0(intent), 6, (Object) null);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        C8275f.m16440a(context, intent);
    }

    /* renamed from: w */
    private final void m15037w(Context context, C7669a aVar, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        Intent intent;
        Intent intent2;
        Context context2 = context;
        C7669a aVar2 = aVar;
        Bundle bundle2 = bundle;
        BrazeNotificationPayload brazeNotificationPayload2 = brazeNotificationPayload;
        int i = C7672b.f10648a[aVar.ordinal()];
        if (i == 1) {
            intent2 = new Intent(C12775o.m28647q(context.getPackageName(), f10638c));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_OPENED).setPackage(context.getPackageName());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else if (i == 2) {
            intent2 = new Intent(C12775o.m28647q(context.getPackageName(), f10639d));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED).setPackage(context.getPackageName());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else if (i == 3) {
            intent2 = new Intent(C12775o.m28647q(context.getPackageName(), f10640e));
            intent = new Intent(Constants.BRAZE_PUSH_INTENT_NOTIFICATION_DELETED).setPackage(context.getPackageName());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_P…kage(context.packageName)");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Intent intent3 = intent2;
        Intent intent4 = intent;
        C8266c cVar = C8266c.f11641a;
        C8266c cVar2 = cVar;
        C8266c.C8267a aVar3 = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar2, this, aVar3, (Throwable) null, false, new C7685f0(aVar2), 6, (Object) null);
        m15036v(context2, intent3, bundle2);
        C8266c.m16396e(cVar2, this, aVar3, (Throwable) null, false, new C7688g0(aVar2), 6, (Object) null);
        m15036v(context2, intent4, bundle2);
        if (brazeNotificationPayload2 != null) {
            C10299e.f15555a.mo44960f(context2, aVar.mo41376b(), brazeNotificationPayload2);
        }
    }

    /* renamed from: x */
    static /* synthetic */ void m15038x(C7668f fVar, Context context, C7669a aVar, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 8) != 0) {
            brazeNotificationPayload = null;
        }
        fVar.m15037w(context, aVar, bundle, brazeNotificationPayload);
    }

    /* renamed from: y */
    public static final void m15039y(Context context, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bundle, "notificationExtras");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        C8266c cVar = C8266c.f11641a;
        C7668f fVar = f10636a;
        C8266c.m16396e(cVar, fVar, (C8266c.C8267a) null, (Throwable) null, false, C7694i0.f10671g, 7, (Object) null);
        fVar.m15037w(context, C7669a.RECEIVED, bundle, brazeNotificationPayload);
    }

    /* renamed from: z */
    public static final void m15040z(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        C12775o.m28639i(builder, "notificationBuilder");
        C12775o.m28639i(brazeNotificationPayload, "payload");
        Integer accentColor = brazeNotificationPayload.getAccentColor();
        if (accentColor != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7697j0.f10674g, 7, (Object) null);
            builder.setColor(accentColor.intValue());
            return;
        }
        C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider != null) {
            C8266c.m16396e(C8266c.f11641a, f10636a, (C8266c.C8267a) null, (Throwable) null, false, C7700k0.f10677g, 7, (Object) null);
            builder.setColor(configurationProvider.getDefaultNotificationAccentColor());
        }
    }
}
