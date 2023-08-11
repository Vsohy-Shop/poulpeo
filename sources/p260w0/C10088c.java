package p260w0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.appboy.p054ui.C4193R;
import com.braze.p055ui.inappmessage.views.C4339d;
import com.braze.p055ui.inappmessage.views.InAppMessageFullView;
import com.braze.p055ui.inappmessage.views.InAppMessageImageView;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018a0.C2105d;
import p018a0.C2109g;
import p019a1.C2117c;
import p043c0.C3864b;
import p069e0.C7358a;
import p069e0.C7389i;
import p238u0.C9859m;
import p270x.C10156b;
import p292z.C10734d;

/* renamed from: w0.c */
/* compiled from: DefaultInAppMessageFullViewFactory.kt */
public class C10088c implements C9859m {

    /* renamed from: a */
    public static final C10089a f15252a = new C10089a((DefaultConstructorMarker) null);

    /* renamed from: w0.c$a */
    /* compiled from: DefaultInAppMessageFullViewFactory.kt */
    public static final class C10089a {
        private C10089a() {
        }

        public /* synthetic */ C10089a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m21196d(View view, InAppMessageFullView inAppMessageFullView, C7389i iVar, Context context, View view2) {
        C12775o.m28639i(inAppMessageFullView, "$view");
        C12775o.m28639i(iVar, "$inAppMessageFull");
        int height = view.getHeight() / 2;
        ViewGroup.LayoutParams layoutParams = inAppMessageFullView.findViewById(C4193R.C4196id.com_braze_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
            if (!iVar.mo40975R().isEmpty()) {
                C12775o.m28638h(context, "applicationContext");
                i += (int) C2117c.m1462a(context, 64.0d);
            }
            int min = Math.min(view2.getHeight(), height - i);
            C12775o.m28638h(view2, "scrollView");
            C2117c.m1474m(view2, min);
            view2.requestLayout();
            ImageView messageImageView = inAppMessageFullView.getMessageImageView();
            if (messageImageView != null) {
                messageImageView.requestLayout();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: f */
    private final boolean m21197f(Activity activity, C7358a aVar, InAppMessageFullView inAppMessageFullView) {
        RelativeLayout.LayoutParams layoutParams;
        if (!C2117c.m1470i(activity) || aVar.getOrientation() == C2109g.ANY) {
            return false;
        }
        int longEdge = inAppMessageFullView.getLongEdge();
        int shortEdge = inAppMessageFullView.getShortEdge();
        if (longEdge <= 0 || shortEdge <= 0) {
            return false;
        }
        if (aVar.getOrientation() == C2109g.LANDSCAPE) {
            layoutParams = new RelativeLayout.LayoutParams(longEdge, shortEdge);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(shortEdge, longEdge);
        }
        layoutParams.addRule(13, -1);
        View messageBackgroundObject = inAppMessageFullView.getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            return true;
        }
        messageBackgroundObject.setLayoutParams(layoutParams);
        return true;
    }

    /* renamed from: c */
    public InAppMessageFullView mo44369a(Activity activity, C7358a aVar) {
        boolean z;
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(aVar, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        C7389i iVar = (C7389i) aVar;
        boolean z2 = false;
        if (iVar.mo40973D() == C2105d.GRAPHIC) {
            z = true;
        } else {
            z = false;
        }
        InAppMessageFullView e = mo44669e(activity, z);
        e.createAppropriateViews(activity, iVar, z);
        String a = C4339d.Companion.mo31129a(iVar);
        if (a == null || a.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            C10156b.C10157a aVar2 = C10156b.f15345m;
            C12775o.m28638h(applicationContext, "applicationContext");
            C3864b P = aVar2.mo44811g(applicationContext).mo44772P();
            ImageView messageImageView = e.getMessageImageView();
            if (messageImageView != null) {
                P.mo29854c(applicationContext, aVar, a, messageImageView, C10734d.NO_BOUNDS);
            }
        }
        View frameView = e.getFrameView();
        if (frameView != null) {
            frameView.setOnClickListener((View.OnClickListener) null);
        }
        e.setMessageBackgroundColor(iVar.mo40961e0());
        Integer x0 = iVar.mo41040x0();
        if (x0 != null) {
            e.setFrameColor(x0.intValue());
        }
        e.setMessageButtons(iVar.mo40975R());
        e.setMessageCloseButtonColor(iVar.mo41039w0());
        if (!z) {
            String message = iVar.getMessage();
            if (message != null) {
                e.setMessage(message);
            }
            e.setMessageTextColor(iVar.mo40957a0());
            String Y = iVar.mo40976Y();
            if (Y != null) {
                e.setMessageHeaderText(Y);
            }
            e.setMessageHeaderTextColor(iVar.mo41042z0());
            e.setMessageHeaderTextAlignment(iVar.mo41041y0());
            e.setMessageTextAlign(iVar.mo40989f0());
            e.resetMessageMargins(iVar.mo41053u0());
            ImageView messageImageView2 = e.getMessageImageView();
            if (messageImageView2 != null) {
                ((InAppMessageImageView) messageImageView2).setToHalfParentHeight(true);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageImageView");
            }
        }
        e.setLargerCloseButtonClickArea(e.getMessageCloseButtonView());
        m21197f(activity, iVar, e);
        e.setupDirectionalNavigation(iVar.mo40975R().size());
        View findViewById = e.findViewById(C4193R.C4196id.com_braze_inappmessage_full_scrollview);
        if (findViewById != null) {
            findViewById.post(new C10087b(e.findViewById(C4193R.C4196id.com_braze_inappmessage_full_all_content_parent), e, iVar, applicationContext, findViewById));
        }
        return e;
    }

    /* renamed from: e */
    public final InAppMessageFullView mo44669e(Activity activity, boolean z) {
        C12775o.m28639i(activity, "activity");
        if (z) {
            View inflate = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_full_graphic, (ViewGroup) null);
            if (inflate != null) {
                return (InAppMessageFullView) inflate;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
        }
        View inflate2 = activity.getLayoutInflater().inflate(C4193R.C4197layout.com_braze_inappmessage_full, (ViewGroup) null);
        if (inflate2 != null) {
            return (InAppMessageFullView) inflate2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageFullView");
    }
}
