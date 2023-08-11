package p093g0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p054ui.C4193R;
import com.braze.configuration.C4218b;
import com.braze.push.NotificationTrampolineActivity;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p105h0.C7880a;
import p126j0.C8242b;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8275f;
import p136k0.C8429a;
import p270x.C10156b;
import p270x.C10347i;
import p292z.C10730a;
import p292z.C10734d;
import p404of.C13074a;

/* renamed from: g0.e */
/* compiled from: BrazeNotificationStyleFactory.kt */
public class C7643e {
    private static final int BIG_PICTURE_STYLE_IMAGE_HEIGHT = 192;
    public static final C7644a Companion = new C7644a((DefaultConstructorMarker) null);
    private static final String STORY_SET_GRAVITY = "setGravity";
    private static final String STORY_SET_VISIBILITY = "setVisibility";

    /* renamed from: g0.e$a */
    /* compiled from: BrazeNotificationStyleFactory.kt */
    public static final class C7644a {

        /* renamed from: g0.e$a$a */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7645a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f10614g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7645a(String str) {
                super(0);
                this.f10614g = str;
            }

            public final String invoke() {
                return C12775o.m28647q("Failed to download image bitmap for big picture notification style. Url: ", this.f10614g);
            }
        }

        /* renamed from: g0.e$a$b */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7646b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7646b f10615g = new C7646b();

            C7646b() {
                super(0);
            }

            public final String invoke() {
                return "Failed to scale image bitmap, using original.";
            }
        }

        /* renamed from: g0.e$a$c */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7647c extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7647c f10616g = new C7647c();

            C7647c() {
                super(0);
            }

            public final String invoke() {
                return "Bitmap download failed for push notification. No image will be included with the notification.";
            }
        }

        /* renamed from: g0.e$a$d */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7648d extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7648d f10617g = new C7648d();

            C7648d() {
                super(0);
            }

            public final String invoke() {
                return "Failed to create Big Picture Style.";
            }
        }

        /* renamed from: g0.e$a$e */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7649e extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7649e f10618g = new C7649e();

            C7649e() {
                super(0);
            }

            public final String invoke() {
                return "Reply person does not exist in mapping. Not rendering a style";
            }
        }

        /* renamed from: g0.e$a$f */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7650f extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ BrazeNotificationPayload.ConversationMessage f10619g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7650f(BrazeNotificationPayload.ConversationMessage conversationMessage) {
                super(0);
                this.f10619g = conversationMessage;
            }

            public final String invoke() {
                return C12775o.m28647q("Message person does not exist in mapping. Not rendering a style. ", this.f10619g);
            }
        }

        /* renamed from: g0.e$a$g */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7651g extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7651g f10620g = new C7651g();

            C7651g() {
                super(0);
            }

            public final String invoke() {
                return "Failed to create conversation push style. Returning null.";
            }
        }

        /* renamed from: g0.e$a$h */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7652h extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7652h f10621g = new C7652h();

            C7652h() {
                super(0);
            }

            public final String invoke() {
                return "Inline Image Push cannot render without a context";
            }
        }

        /* renamed from: g0.e$a$i */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7653i extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7653i f10622g = new C7653i();

            C7653i() {
                super(0);
            }

            public final String invoke() {
                return "Inline Image Push image url invalid";
            }
        }

        /* renamed from: g0.e$a$j */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7654j extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7654j f10623g = new C7654j();

            C7654j() {
                super(0);
            }

            public final String invoke() {
                return "Inline Image Push failed to get image bitmap";
            }
        }

        /* renamed from: g0.e$a$k */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7655k extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7655k f10624g = new C7655k();

            C7655k() {
                super(0);
            }

            public final String invoke() {
                return "Inline Image Push application info was null";
            }
        }

        /* renamed from: g0.e$a$l */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7656l extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7656l f10625g = new C7656l();

            C7656l() {
                super(0);
            }

            public final String invoke() {
                return "Rendering push notification with DecoratedCustomViewStyle (Story)";
            }
        }

        /* renamed from: g0.e$a$m */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7657m extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7657m f10626g = new C7657m();

            C7657m() {
                super(0);
            }

            public final String invoke() {
                return "Rendering conversational push";
            }
        }

        /* renamed from: g0.e$a$n */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7658n extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7658n f10627g = new C7658n();

            C7658n() {
                super(0);
            }

            public final String invoke() {
                return "Rendering push notification with custom inline image style";
            }
        }

        /* renamed from: g0.e$a$o */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7659o extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7659o f10628g = new C7659o();

            C7659o() {
                super(0);
            }

            public final String invoke() {
                return "Rendering push notification with BigPictureStyle";
            }
        }

        /* renamed from: g0.e$a$p */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7660p extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7660p f10629g = new C7660p();

            C7660p() {
                super(0);
            }

            public final String invoke() {
                return "Rendering push notification with BigTextStyle";
            }
        }

        /* renamed from: g0.e$a$q */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7661q extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7661q f10630g = new C7661q();

            C7661q() {
                super(0);
            }

            public final String invoke() {
                return "Push story page cannot render without a context";
            }
        }

        /* renamed from: g0.e$a$r */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7662r extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7662r f10631g = new C7662r();

            C7662r() {
                super(0);
            }

            public final String invoke() {
                return "Push story page was not populated correctly. Not using DecoratedCustomViewStyle.";
            }
        }

        /* renamed from: g0.e$a$s */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7663s extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7663s f10632g = new C7663s();

            C7663s() {
                super(0);
            }

            public final String invoke() {
                return "Push story page cannot render without a context";
            }
        }

        /* renamed from: g0.e$a$t */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7664t extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7664t f10633g = new C7664t();

            C7664t() {
                super(0);
            }

            public final String invoke() {
                return "Push story page cannot render without a configuration provider";
            }
        }

        /* renamed from: g0.e$a$u */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7665u extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7665u f10634g = new C7665u();

            C7665u() {
                super(0);
            }

            public final String invoke() {
                return "Push story page image url invalid";
            }
        }

        /* renamed from: g0.e$a$v */
        /* compiled from: BrazeNotificationStyleFactory.kt */
        static final class C7666v extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7666v f10635g = new C7666v();

            C7666v() {
                super(0);
            }

            public final String invoke() {
                return "Setting style for notification";
            }
        }

        private C7644a() {
        }

        public /* synthetic */ C7644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final PendingIntent m14985a(Context context, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent(Constants.APPBOY_STORY_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            intent.setFlags(intent.getFlags() | C8429a.f12015a.mo42456a().mo42451a(C10347i.C10348a.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtra(Constants.APPBOY_ACTION_URI_KEY, pushStoryPage.getDeeplink());
            intent.putExtra(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY, pushStoryPage.getUseWebview());
            intent.putExtra(Constants.APPBOY_STORY_PAGE_ID, pushStoryPage.getStoryPageId());
            intent.putExtra(Constants.APPBOY_CAMPAIGN_ID, pushStoryPage.getCampaignId());
            PendingIntent activity = PendingIntent.getActivity(context, C8275f.m16444e(), intent, C8275f.m16441b());
            C12775o.m28638h(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        /* renamed from: b */
        private final PendingIntent m14986b(Context context, Bundle bundle, int i) {
            Intent intent = new Intent(Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION).setClass(context, C7668f.m15019e());
            C12775o.m28638h(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt(Constants.APPBOY_STORY_INDEX_KEY, i);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, C8275f.m16444e(), intent, 1073741824 | C8275f.m16441b());
            C12775o.m28638h(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        /* renamed from: i */
        private final boolean m14987i(Context context) {
            if (Build.VERSION.SDK_INT < 31 || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 31) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        private final boolean m14988j(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            boolean z;
            boolean z2;
            RemoteViews remoteViews2 = remoteViews;
            Context context = brazeNotificationPayload.getContext();
            boolean z3 = false;
            if (context == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7663s.f10632g, 7, (Object) null);
                return false;
            }
            C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7664t.f10633g, 7, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl == null || C13754v.m31532t(bitmapUrl)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7665u.f10634g, 7, (Object) null);
                return false;
            }
            Bitmap b = C10156b.f15345m.mo44811g(context).mo44772P().mo29853b(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, C10734d.NOTIFICATION_ONE_IMAGE_STORY);
            if (b == null) {
                return false;
            }
            remoteViews2.setImageViewBitmap(C4193R.C4196id.com_braze_story_image_view, b);
            String title = pushStoryPage.getTitle();
            if (title == null || C13754v.m31532t(title)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                remoteViews2.setTextViewText(C4193R.C4196id.com_braze_story_text_view, C7880a.m15418a(title, configurationProvider));
                remoteViews2.setInt(C4193R.C4196id.com_braze_story_text_view_container, C7643e.STORY_SET_GRAVITY, pushStoryPage.getTitleGravity());
            } else {
                remoteViews2.setInt(C4193R.C4196id.com_braze_story_text_view_container, C7643e.STORY_SET_VISIBILITY, 8);
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || C13754v.m31532t(subtitle)) {
                z3 = true;
            }
            if (!z3) {
                remoteViews2.setTextViewText(C4193R.C4196id.com_braze_story_text_view_small, C7880a.m15418a(subtitle, configurationProvider));
                remoteViews2.setInt(C4193R.C4196id.com_braze_story_text_view_small_container, C7643e.STORY_SET_GRAVITY, pushStoryPage.getSubtitleGravity());
            } else {
                remoteViews2.setInt(C4193R.C4196id.com_braze_story_text_view_small_container, C7643e.STORY_SET_VISIBILITY, 8);
            }
            remoteViews2.setOnClickPendingIntent(C4193R.C4196id.com_braze_story_relative_layout, m14985a(context, pushStoryPage));
            return true;
        }

        /* renamed from: c */
        public final NotificationCompat.BigPictureStyle mo41368c(BrazeNotificationPayload brazeNotificationPayload) {
            boolean z;
            C12775o.m28639i(brazeNotificationPayload, "payload");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            if (bigImageUrl == null || C13754v.m31532t(bigImageUrl)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            Bitmap b = C10156b.f15345m.mo44811g(context).mo44772P().mo29853b(context, brazeNotificationPayload.getNotificationExtras(), bigImageUrl, C10734d.NOTIFICATION_EXPANDED_IMAGE);
            if (b == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7645a(bigImageUrl), 7, (Object) null);
                return null;
            }
            try {
                if (b.getWidth() > b.getHeight()) {
                    int k = C8242b.m16363k(C8242b.m16357e(context), C7643e.BIG_PICTURE_STYLE_IMAGE_HEIGHT);
                    int i = k * 2;
                    int h = C8242b.m16360h(context);
                    if (i > h) {
                        i = h;
                    }
                    try {
                        b = Bitmap.createScaledBitmap(b, i, k, true);
                    } catch (Exception e) {
                        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7646b.f10615g, 4, (Object) null);
                    }
                }
                if (b == null) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7647c.f10616g, 6, (Object) null);
                    return null;
                }
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture(b);
                mo41374k(bigPictureStyle, brazeNotificationPayload);
                return bigPictureStyle;
            } catch (Exception e2) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e2, false, C7648d.f10617g, 4, (Object) null);
                return null;
            }
        }

        /* renamed from: d */
        public final NotificationCompat.BigTextStyle mo41369d(BrazeNotificationPayload brazeNotificationPayload) {
            CharSequence a;
            C12775o.m28639i(brazeNotificationPayload, "payload");
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                return bigTextStyle;
            }
            String contentText = brazeNotificationPayload.getContentText();
            if (!(contentText == null || (a = C7880a.m15418a(contentText, configurationProvider)) == null)) {
                bigTextStyle.bigText(a);
            }
            String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
            if (bigSummaryText != null) {
                bigTextStyle.setSummaryText(C7880a.m15418a(bigSummaryText, configurationProvider));
            }
            String bigTitleText = brazeNotificationPayload.getBigTitleText();
            if (bigTitleText != null) {
                bigTextStyle.setBigContentTitle(C7880a.m15418a(bigTitleText, configurationProvider));
            }
            return bigTextStyle;
        }

        /* renamed from: e */
        public final NotificationCompat.MessagingStyle mo41370e(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
            NotificationCompat.Builder builder2 = builder;
            C12775o.m28639i(builder2, "notificationBuilder");
            C12775o.m28639i(brazeNotificationPayload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = brazeNotificationPayload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(brazeNotificationPayload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7649e.f10618g, 7, (Object) null);
                    return null;
                }
                NotificationCompat.MessagingStyle messagingStyle = new NotificationCompat.MessagingStyle(conversationPerson.getPerson());
                for (BrazeNotificationPayload.ConversationMessage next : brazeNotificationPayload.getConversationMessages()) {
                    BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                    if (conversationPerson2 == null) {
                        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7650f(next), 7, (Object) null);
                        return null;
                    }
                    messagingStyle.addMessage((CharSequence) next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                }
                boolean z = true;
                if (conversationPersonMap.size() <= 1) {
                    z = false;
                }
                messagingStyle.setGroupConversation(z);
                builder2.setShortcutId(brazeNotificationPayload.getConversationShortcutId());
                return messagingStyle;
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7651g.f10620g, 4, (Object) null);
                return null;
            }
        }

        @RequiresApi(api = 23)
        /* renamed from: f */
        public final NotificationCompat.Style mo41371f(BrazeNotificationPayload brazeNotificationPayload, NotificationCompat.Builder builder) {
            boolean z;
            int i;
            ApplicationInfo applicationInfo;
            C12775o.m28639i(brazeNotificationPayload, "payload");
            C12775o.m28639i(builder, "notificationBuilder");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7652h.f10621g, 7, (Object) null);
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            if (bigImageUrl == null || C13754v.m31532t(bigImageUrl)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7653i.f10622g, 7, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            Bitmap b = C10156b.f15345m.mo44811g(context).mo44772P().mo29853b(context, notificationExtras, bigImageUrl, C10734d.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (b == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7654j.f10623g, 7, (Object) null);
                return null;
            }
            boolean i2 = m14987i(context);
            String packageName = context.getPackageName();
            if (i2) {
                i = C4193R.C4197layout.com_braze_push_inline_image_constrained;
            } else {
                i = C4193R.C4197layout.com_braze_notification_inline_image;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            C4218b bVar = new C4218b(context);
            Icon createWithResource = Icon.createWithResource(context, bVar.getSmallNotificationIconResourceId());
            C12775o.m28638h(createWithResource, "createWithResource(\n    …nResourceId\n            )");
            Integer accentColor = brazeNotificationPayload.getAccentColor();
            if (accentColor != null) {
                createWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(C4193R.C4196id.com_braze_inline_image_push_app_icon, createWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(0));
                } else {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                }
                C12775o.m28638h(applicationInfo, "{\n                if (Bu…          }\n            }");
                remoteViews.setTextViewText(C4193R.C4196id.com_braze_inline_image_push_app_name_text, C7880a.m15418a((String) packageManager.getApplicationLabel(applicationInfo), bVar));
                remoteViews.setTextViewText(C4193R.C4196id.com_braze_inline_image_push_time_text, C8273e.m16433f(C10730a.CLOCK_12_HOUR));
                String string = notificationExtras.getString(Constants.APPBOY_PUSH_TITLE_KEY);
                if (string != null) {
                    remoteViews.setTextViewText(C4193R.C4196id.com_braze_inline_image_push_title_text, C7880a.m15418a(string, bVar));
                }
                String string2 = notificationExtras.getString(Constants.APPBOY_PUSH_CONTENT_KEY);
                if (string2 != null) {
                    remoteViews.setTextViewText(C4193R.C4196id.com_braze_inline_image_push_content_text, C7880a.m15418a(string2, bVar));
                }
                builder.setCustomContentView(remoteViews);
                if (i2) {
                    builder.setLargeIcon(b);
                    return new NotificationCompat.DecoratedCustomViewStyle();
                }
                remoteViews.setImageViewBitmap(C4193R.C4196id.com_braze_inline_image_push_side_image, b);
                return new C7667b();
            } catch (PackageManager.NameNotFoundException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7655k.f10624g, 4, (Object) null);
                return null;
            }
        }

        /* renamed from: g */
        public final NotificationCompat.Style mo41372g(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
            NotificationCompat.Style style;
            C12775o.m28639i(builder, "notificationBuilder");
            C12775o.m28639i(brazeNotificationPayload, "payload");
            if (brazeNotificationPayload.isPushStory() && brazeNotificationPayload.getContext() != null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7656l.f10625g, 7, (Object) null);
                style = mo41373h(builder, brazeNotificationPayload);
            } else if (brazeNotificationPayload.isConversationalPush() && Build.VERSION.SDK_INT >= 25) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7657m.f10626g, 7, (Object) null);
                style = mo41370e(builder, brazeNotificationPayload);
            } else if (brazeNotificationPayload.getBigImageUrl() == null) {
                style = null;
            } else if (brazeNotificationPayload.isInlineImagePush()) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7658n.f10627g, 7, (Object) null);
                style = mo41371f(brazeNotificationPayload, builder);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7659o.f10628g, 7, (Object) null);
                style = mo41368c(brazeNotificationPayload);
            }
            if (style != null) {
                return style;
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7660p.f10629g, 7, (Object) null);
            return mo41369d(brazeNotificationPayload);
        }

        /* renamed from: h */
        public final NotificationCompat.DecoratedCustomViewStyle mo41373h(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
            C12775o.m28639i(builder, "notificationBuilder");
            C12775o.m28639i(brazeNotificationPayload, "payload");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7661q.f10630g, 7, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
            int pushStoryPageIndex = brazeNotificationPayload.getPushStoryPageIndex();
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C4193R.C4197layout.com_braze_push_story_one_image);
            if (!m14988j(remoteViews, brazeNotificationPayload, pushStoryPages.get(pushStoryPageIndex))) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7662r.f10631g, 6, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            NotificationCompat.DecoratedCustomViewStyle decoratedCustomViewStyle = new NotificationCompat.DecoratedCustomViewStyle();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(C4193R.C4196id.com_braze_story_button_previous, m14986b(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(C4193R.C4196id.com_braze_story_button_next, m14986b(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            builder.setCustomBigContentView(remoteViews);
            builder.setOnlyAlertOnce(true);
            return decoratedCustomViewStyle;
        }

        @VisibleForTesting
        /* renamed from: k */
        public final void mo41374k(NotificationCompat.BigPictureStyle bigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
            String contentText;
            C12775o.m28639i(bigPictureStyle, "bigPictureNotificationStyle");
            C12775o.m28639i(brazeNotificationPayload, "payload");
            C4218b configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider != null) {
                String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
                String bigTitleText = brazeNotificationPayload.getBigTitleText();
                String summaryText = brazeNotificationPayload.getSummaryText();
                if (bigSummaryText != null) {
                    bigPictureStyle.setSummaryText(C7880a.m15418a(bigSummaryText, configurationProvider));
                }
                if (bigTitleText != null) {
                    bigPictureStyle.setBigContentTitle(C7880a.m15418a(bigTitleText, configurationProvider));
                }
                if (summaryText == null && bigSummaryText == null && (contentText = brazeNotificationPayload.getContentText()) != null) {
                    bigPictureStyle.setSummaryText(C7880a.m15418a(contentText, configurationProvider));
                }
            }
        }

        /* renamed from: l */
        public final void mo41375l(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
            C12775o.m28639i(builder, "notificationBuilder");
            C12775o.m28639i(brazeNotificationPayload, "payload");
            NotificationCompat.Style g = mo41372g(builder, brazeNotificationPayload);
            if (!(g instanceof C7667b)) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7666v.f10635g, 7, (Object) null);
                builder.setStyle(g);
            }
        }
    }

    /* renamed from: g0.e$b */
    /* compiled from: BrazeNotificationStyleFactory.kt */
    private static final class C7667b extends NotificationCompat.Style {
    }

    @VisibleForTesting
    public static final void setBigPictureSummaryAndTitle(NotificationCompat.BigPictureStyle bigPictureStyle, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.mo41374k(bigPictureStyle, brazeNotificationPayload);
    }

    public static final void setStyleIfSupported(NotificationCompat.Builder builder, BrazeNotificationPayload brazeNotificationPayload) {
        Companion.mo41375l(builder, brazeNotificationPayload);
    }
}
