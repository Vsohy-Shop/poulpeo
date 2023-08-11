package com.appboy.p054ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.models.cards.Card;
import com.appboy.p054ui.C4193R;
import com.appboy.p054ui.feed.AppboyImageSwitcher;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p043c0.C3864b;
import p126j0.C8266c;
import p136k0.C8429a;
import p146l0.C8619a;
import p146l0.C8622c;
import p270x.C10156b;
import p292z.C10734d;

/* renamed from: com.appboy.ui.widget.BaseCardView */
/* compiled from: BaseCardView.kt */
public abstract class BaseCardView<T extends Card> extends RelativeLayout {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String ICON_READ_TAG = "icon_read";
    private static final String ICON_UNREAD_TAG = "icon_unread";
    protected final Context applicationContext;
    protected T card;
    private final String classLogTag = C8266c.m16405n(getClass());
    protected C4218b configurationProvider;
    public AppboyImageSwitcher imageSwitcher;
    private boolean isUnreadCardVisualIndicatorEnabled;

    /* renamed from: com.appboy.ui.widget.BaseCardView$Companion */
    /* compiled from: BaseCardView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: protected */
        public final C8622c getUriActionForCard(Card card) {
            C12775o.m28639i(card, "card");
            Bundle bundle = new Bundle();
            for (String next : card.getExtras().keySet()) {
                bundle.putString(next, card.getExtras().get(next));
            }
            String url = card.getUrl();
            if (url != null) {
                return C8429a.f12015a.mo42456a().mo42453c(url, bundle, card.getOpenUriInWebView(), card.getChannel());
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, BaseCardView$Companion$getUriActionForCard$1.INSTANCE, 6, (Object) null);
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCardView(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        Context applicationContext2 = context.getApplicationContext();
        C12775o.m28638h(applicationContext2, "context.applicationContext");
        this.applicationContext = applicationContext2;
        C4218b bVar = new C4218b(context);
        this.configurationProvider = bVar;
        this.isUnreadCardVisualIndicatorEnabled = bVar.isNewsfeedVisualIndicatorOn();
    }

    protected static final C8622c getUriActionForCard(Card card2) {
        return Companion.getUriActionForCard(card2);
    }

    public final String getClassLogTag() {
        return this.classLogTag;
    }

    /* access modifiers changed from: protected */
    public final void handleCardClick(Context context, Card card2, C8619a aVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(card2, "card");
        C8266c cVar = C8266c.f11641a;
        C8266c.C8267a aVar2 = C8266c.C8267a.f11650f;
        C8266c.m16396e(cVar, this, aVar2, (Throwable) null, false, new BaseCardView$handleCardClick$1(card2), 6, (Object) null);
        card2.setIndicatorHighlighted(true);
        if (isClickHandled(context, card2, aVar)) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new BaseCardView$handleCardClick$5(card2), 7, (Object) null);
            card2.logClick();
        } else if (aVar != null) {
            card2.logClick();
            C8266c.m16396e(cVar, this, aVar2, (Throwable) null, false, new BaseCardView$handleCardClick$2(card2), 6, (Object) null);
            if (aVar instanceof C8622c) {
                C8429a.f12015a.mo42456a().mo42454d(context, (C8622c) aVar);
                return;
            }
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new BaseCardView$handleCardClick$3(card2), 7, (Object) null);
            aVar.mo42702a(context);
        } else {
            C8266c.m16396e(cVar, this, aVar2, (Throwable) null, false, new BaseCardView$handleCardClick$4(card2), 6, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean isClickHandled(Context context, Card card2, C8619a aVar);

    public final boolean isUnreadIndicatorEnabled() {
        return this.isUnreadCardVisualIndicatorEnabled;
    }

    public final void setCardViewedIndicator(AppboyImageSwitcher appboyImageSwitcher, Card card2) {
        C12775o.m28639i(card2, "card");
        if (appboyImageSwitcher == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, BaseCardView$setCardViewedIndicator$1.INSTANCE, 6, (Object) null);
            return;
        }
        int i = C4193R.string.com_braze_image_is_read_tag_key;
        Object tag = appboyImageSwitcher.getTag(i);
        if (tag == null) {
            tag = "";
        }
        if (card2.isIndicatorHighlighted()) {
            if (!C12775o.m28634d(tag, ICON_READ_TAG)) {
                if (appboyImageSwitcher.getReadIcon() != null) {
                    appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getReadIcon());
                } else {
                    appboyImageSwitcher.setImageResource(C4193R.C4195drawable.com_braze_content_card_icon_read);
                }
                appboyImageSwitcher.setTag(i, ICON_READ_TAG);
            }
        } else if (!C12775o.m28634d(tag, ICON_UNREAD_TAG)) {
            if (appboyImageSwitcher.getUnReadIcon() != null) {
                appboyImageSwitcher.setImageDrawable(appboyImageSwitcher.getUnReadIcon());
            } else {
                appboyImageSwitcher.setImageResource(C4193R.C4195drawable.com_braze_content_card_icon_unread);
            }
            appboyImageSwitcher.setTag(i, ICON_UNREAD_TAG);
        }
    }

    public final void setImageViewToUrl(ImageView imageView, String str, float f, Card card2) {
        boolean z;
        C12775o.m28639i(imageView, "imageView");
        C12775o.m28639i(str, "imageUrl");
        C12775o.m28639i(card2, "card");
        int i = C4193R.string.com_braze_image_resize_tag_key;
        if (!C12775o.m28634d(str, imageView.getTag(i))) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(new BaseCardView$setImageViewToUrl$1(imageView, f));
                }
            }
            imageView.setImageResource(17170445);
            C10156b.C10157a aVar = C10156b.f15345m;
            Context context = getContext();
            C12775o.m28638h(context, "context");
            C3864b P = aVar.mo44811g(context).mo44772P();
            Context context2 = getContext();
            C12775o.m28638h(context2, "context");
            P.mo29852a(context2, card2, str, imageView, C10734d.BASE_CARD_VIEW);
            imageView.setTag(i, str);
        }
    }

    public final void setOptionalTextView(TextView textView, String str) {
        boolean z;
        C12775o.m28639i(textView, "view");
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setText("");
        textView.setVisibility(8);
    }
}
