package com.braze.p055ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.appboy.p054ui.C4193R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2105d;
import p019a1.C2117c;
import p069e0.C7360c;
import p126j0.C8266c;
import p249v0.C9913a;
import p293z0.C10762c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView */
/* compiled from: InAppMessageFullView.kt */
public class InAppMessageFullView extends C4355i {
    private InAppMessageImageView inAppMessageImageView;
    private boolean isGraphic;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView$a */
    /* compiled from: InAppMessageFullView.kt */
    static final class C4329a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4329a f3616g = new C4329a();

        C4329a() {
            super(0);
        }

        public final String invoke() {
            return "Close button layout params are null or not of the expected class. Not applying window insets.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView$b */
    /* compiled from: InAppMessageFullView.kt */
    static final class C4330b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4330b f3617g = new C4330b();

        C4330b() {
            super(0);
        }

        public final String invoke() {
            return "Content area layout params are null or not of the expected class. Not applying window insets.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageFullView$c */
    /* compiled from: InAppMessageFullView.kt */
    static final class C4331c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4331c f3618g = new C4331c();

        C4331c() {
            super(0);
        }

        public final String invoke() {
            return "Passing scrollView click event to message clickable view.";
        }
    }

    public InAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void applyDisplayCutoutMarginsToCloseButton(WindowInsetsCompat windowInsetsCompat, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4329a.f3616g, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(C2117c.m1464c(windowInsetsCompat) + marginLayoutParams.leftMargin, C2117c.m1466e(windowInsetsCompat) + marginLayoutParams.topMargin, C2117c.m1465d(windowInsetsCompat) + marginLayoutParams.rightMargin, C2117c.m1463b(windowInsetsCompat) + marginLayoutParams.bottomMargin);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    private final void applyDisplayCutoutMarginsToContentArea(WindowInsetsCompat windowInsetsCompat, View view) {
        if (!(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4330b.f3617g, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(C2117c.m1464c(windowInsetsCompat) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, C2117c.m1465d(windowInsetsCompat) + marginLayoutParams.rightMargin, C2117c.m1463b(windowInsetsCompat) + marginLayoutParams.bottomMargin);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* access modifiers changed from: private */
    /* renamed from: resetMessageMargins$lambda-2$lambda-1  reason: not valid java name */
    public static final void m38724resetMessageMargins$lambda2$lambda1(InAppMessageFullView inAppMessageFullView, View view, View view2) {
        C12775o.m28639i(inAppMessageFullView, "this$0");
        C12775o.m28639i(view, "$msgClickableView");
        C8266c.m16396e(C8266c.f11641a, inAppMessageFullView, (C8266c.C8267a) null, (Throwable) null, false, C4331c.f3618g, 7, (Object) null);
        view.performClick();
    }

    private final void setInAppMessageImageViewAttributes(Activity activity, C7360c cVar, C4336a aVar) {
        aVar.setInAppMessageImageCropType(cVar.mo40956X());
        if (C2117c.m1470i(activity)) {
            float a = (float) C2117c.m1462a(activity, C9913a.m20608a());
            if (cVar.mo40973D() == C2105d.GRAPHIC) {
                aVar.setCornersRadiusPx(a);
            } else {
                aVar.mo31097a(a, a, 0.0f, 0.0f);
            }
        } else {
            aVar.setCornersRadiusPx(0.0f);
        }
    }

    public void applyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        C12775o.m28639i(windowInsetsCompat, "insets");
        super.applyWindowInsets(windowInsetsCompat);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(windowInsetsCompat, messageCloseButtonView);
        }
        if (this.isGraphic) {
            View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_layout_single);
            boolean z2 = true;
            if (findViewById != null && findViewById.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C12775o.m28638h(findViewById, "singleButtonParent");
                applyDisplayCutoutMarginsToContentArea(windowInsetsCompat, findViewById);
                return;
            }
            View findViewById2 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById2 == null || findViewById2.getVisibility() != 0) {
                z2 = false;
            }
            if (z2) {
                C12775o.m28638h(findViewById2, "dualButtonParent");
                applyDisplayCutoutMarginsToContentArea(windowInsetsCompat, findViewById2);
                return;
            }
            return;
        }
        View findViewById3 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(windowInsetsCompat, findViewById3);
        }
    }

    public void createAppropriateViews(Activity activity, C7360c cVar, boolean z) {
        C12775o.m28639i(activity, "activity");
        C12775o.m28639i(cVar, "inAppMessage");
        InAppMessageImageView inAppMessageImageView2 = (InAppMessageImageView) findViewById(C4193R.C4196id.com_braze_inappmessage_full_imageview);
        this.inAppMessageImageView = inAppMessageImageView2;
        if (inAppMessageImageView2 != null) {
            setInAppMessageImageViewAttributes(activity, cVar, inAppMessageImageView2);
        }
        this.isGraphic = z;
    }

    public View getFrameView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full).getLayoutParams().height;
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    public View getMessageClickableView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full);
    }

    public View getMessageCloseButtonView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView() {
        View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_full_header_text);
        C12775o.m28638h(findViewById, "findViewById(R.id.com_br…message_full_header_text)");
        return (TextView) findViewById;
    }

    public TextView getMessageIconView() {
        return null;
    }

    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    public TextView getMessageTextView() {
        View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_full_message);
        C12775o.m28638h(findViewById, "findViewById(R.id.com_br…nappmessage_full_message)");
        return (TextView) findViewById;
    }

    public int getShortEdge() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full).getLayoutParams().width;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            findViewById(C4193R.C4196id.com_braze_inappmessage_full_text_layout).setOnClickListener(new C4342e(this, messageClickableView));
        }
    }

    public void setMessageBackgroundColor(int i) {
        Drawable drawable;
        View messageBackgroundObject = getMessageBackgroundObject();
        if (messageBackgroundObject == null) {
            drawable = null;
        } else {
            drawable = messageBackgroundObject.getBackground();
        }
        if (drawable instanceof GradientDrawable) {
            C10762c.m22910k(messageBackgroundObject, i);
        } else if (this.isGraphic) {
            super.setMessageBackgroundColor(i);
        } else {
            View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_full_all_content_parent);
            C12775o.m28638h(findViewById, "findViewById(R.id.com_br…_full_all_content_parent)");
            C10762c.m22909j(findViewById, i);
            View findViewById2 = findViewById(C4193R.C4196id.com_braze_inappmessage_full_text_and_button_content_parent);
            C12775o.m28638h(findViewById2, "findViewById(R.id.com_br…nd_button_content_parent)");
            C10762c.m22909j(findViewById2, i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_full);
    }
}
