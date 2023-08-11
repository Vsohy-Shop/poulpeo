package com.rmn.utils.share;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.internal.AssetHelper;
import com.poulpeo.R;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.screens.AnimatedActivity;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p334ed.C11884a;
import p334ed.C11888c;
import p336ef.C11921v;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* compiled from: BaseShareManager.kt */
public abstract class BaseShareManager {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String DIALOG_URL_SHORTENING = "DIALOG_URL_SHORTENING";
    private WeakReference<AnimatedActivity> activityRef;
    /* access modifiers changed from: private */
    public String finalUrl;
    private final Lazy urlShortener$delegate = C11901h.m25690b(new C11670b(this));

    /* compiled from: BaseShareManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.rmn.utils.share.BaseShareManager$a */
    /* compiled from: BaseShareManager.kt */
    static final class C11669a extends C12777p implements Function1<String, C11921v> {

        /* renamed from: g */
        final /* synthetic */ BaseShareManager f18170g;

        /* renamed from: h */
        final /* synthetic */ AnimatedActivity f18171h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11669a(BaseShareManager baseShareManager, AnimatedActivity animatedActivity) {
            super(1);
            this.f18170g = baseShareManager;
            this.f18171h = animatedActivity;
        }

        /* renamed from: b */
        public final void mo47966b(String str) {
            this.f18170g.finalUrl = str;
            this.f18170g.showShareDialog(this.f18171h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47966b((String) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: com.rmn.utils.share.BaseShareManager$b */
    /* compiled from: BaseShareManager.kt */
    static final class C11670b extends C12777p implements C13074a<IURLShortener> {

        /* renamed from: g */
        final /* synthetic */ BaseShareManager f18172g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11670b(BaseShareManager baseShareManager) {
            super(0);
            this.f18172g = baseShareManager;
        }

        /* renamed from: b */
        public final IURLShortener invoke() {
            return this.f18172g.newUrlShortener();
        }
    }

    public BaseShareManager(AnimatedActivity animatedActivity) {
        C12775o.m28639i(animatedActivity, "activity");
        this.activityRef = new WeakReference<>(animatedActivity);
    }

    private final void dismissDialogUrlShortening(AnimatedActivity animatedActivity) {
        C11884a.f18565e.mo49089a(animatedActivity, DIALOG_URL_SHORTENING);
    }

    private final IURLShortener getUrlShortener() {
        return (IURLShortener) this.urlShortener$delegate.getValue();
    }

    private final void showDialogUrlShortening(AnimatedActivity animatedActivity) {
        C11884a.f18565e.mo49090c(animatedActivity, DIALOG_URL_SHORTENING, new C11888c().mo49093R0(R.string.email_for_later_get_link));
    }

    /* access modifiers changed from: private */
    public final void showShareDialog(AnimatedActivity animatedActivity) {
        dismissDialogUrlShortening(animatedActivity);
        String longUrl = getLongUrl(animatedActivity);
        if (!TextUtils.isEmpty(this.finalUrl)) {
            longUrl = this.finalUrl;
            C12775o.m28636f(longUrl);
        }
        Resources resources = animatedActivity.getResources();
        Intent intent = new Intent("android.intent.action.SEND");
        C12775o.m28638h(resources, "res");
        intent.putExtra("android.intent.extra.SUBJECT", getEmailSubject(resources));
        intent.putExtra("android.intent.extra.TEXT", getDefaultShareText(resources, longUrl));
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        Intent createChooser = Intent.createChooser(intent, animatedActivity.getString(R.string.share_chooser_title));
        C12775o.m28638h(createChooser, "intentChooser");
        animatedActivity.mo47883t2(createChooser);
    }

    /* access modifiers changed from: protected */
    public abstract String getDefaultShareText(Resources resources, String str);

    /* access modifiers changed from: protected */
    public abstract String getEmailSubject(Resources resources);

    /* access modifiers changed from: protected */
    public abstract String getLongUrl(Context context);

    /* access modifiers changed from: protected */
    public abstract IURLShortener newUrlShortener();

    public final void onShareButtonClicked() {
        AnimatedActivity animatedActivity;
        WeakReference<AnimatedActivity> weakReference = this.activityRef;
        if (weakReference != null && (animatedActivity = weakReference.get()) != null) {
            trackShareClick();
            if (!TextUtils.isEmpty(this.finalUrl)) {
                showShareDialog(animatedActivity);
                return;
            }
            IURLShortener urlShortener = getUrlShortener();
            if (urlShortener != null) {
                showDialogUrlShortening(animatedActivity);
                urlShortener.shortenUrl(new ContextContainer(animatedActivity), getLongUrl(animatedActivity), new C11669a(this, animatedActivity));
                return;
            }
            this.finalUrl = getLongUrl(animatedActivity);
            showShareDialog(animatedActivity);
        }
    }

    /* access modifiers changed from: protected */
    public void trackShareClick() {
    }
}
