package p136k0;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.appboy.Constants;
import com.appboy.enums.Channel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p126j0.C8266c;
import p146l0.C8620b;
import p146l0.C8622c;
import p270x.C10347i;
import p404of.C13074a;

/* renamed from: k0.a */
/* compiled from: BrazeDeeplinkHandler.kt */
public class C8429a implements C10347i {

    /* renamed from: a */
    public static final C8430a f12015a = new C8430a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C10347i f12016b = new C8429a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile C10347i f12017c;

    /* renamed from: k0.a$a */
    /* compiled from: BrazeDeeplinkHandler.kt */
    public static final class C8430a {
        private C8430a() {
        }

        public /* synthetic */ C8430a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C10347i mo42456a() {
            C10347i f = C8429a.f12017c;
            if (f == null) {
                return C8429a.f12016b;
            }
            return f;
        }
    }

    /* renamed from: k0.a$b */
    /* compiled from: BrazeDeeplinkHandler.kt */
    public /* synthetic */ class C8431b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12018a;

        static {
            int[] iArr = new int[C10347i.C10348a.values().length];
            iArr[C10347i.C10348a.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            iArr[C10347i.C10348a.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            iArr[C10347i.C10348a.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            iArr[C10347i.C10348a.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            iArr[C10347i.C10348a.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            iArr[C10347i.C10348a.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            iArr[C10347i.C10348a.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            f12018a = iArr;
        }
    }

    /* renamed from: k0.a$c */
    /* compiled from: BrazeDeeplinkHandler.kt */
    static final class C8432c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8432c f12019g = new C8432c();

        C8432c() {
            super(0);
        }

        public final String invoke() {
            return "createUriActionFromUrlString url was null. Returning null.";
        }
    }

    /* renamed from: k0.a$d */
    /* compiled from: BrazeDeeplinkHandler.kt */
    static final class C8433d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8433d f12020g = new C8433d();

        C8433d() {
            super(0);
        }

        public final String invoke() {
            return "createUriActionFromUrlString failed. Returning null.";
        }
    }

    /* renamed from: a */
    public int mo42451a(C10347i.C10348a aVar) {
        C12775o.m28639i(aVar, "intentFlagPurpose");
        switch (C8431b.f12018a[aVar.ordinal()]) {
            case 1:
            case 2:
                return BasicMeasure.EXACTLY;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public void mo42452b(Context context, C8620b bVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(bVar, "newsfeedAction");
        bVar.mo42702a(context);
    }

    /* renamed from: c */
    public C8622c mo42453c(String str, Bundle bundle, boolean z, Channel channel) {
        C12775o.m28639i(str, "url");
        C12775o.m28639i(channel, "channel");
        try {
            if (!C13754v.m31532t(str)) {
                Uri parse = Uri.parse(str);
                C12775o.m28638h(parse, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                return mo42455e(parse, bundle, z, channel);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, (Throwable) null, false, C8432c.f12019g, 6, (Object) null);
            return null;
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C8433d.f12020g, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: d */
    public void mo42454d(Context context, C8622c cVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(cVar, "uriAction");
        cVar.mo42702a(context);
    }

    /* renamed from: e */
    public C8622c mo42455e(Uri uri, Bundle bundle, boolean z, Channel channel) {
        C12775o.m28639i(uri, Constants.APPBOY_PUSH_DEEP_LINK_KEY);
        C12775o.m28639i(channel, "channel");
        return new C8622c(uri, bundle, z, channel);
    }
}
