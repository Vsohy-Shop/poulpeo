package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2102a;
import p019a1.C2117c;
import p069e0.C7358a;
import p126j0.C8266c;
import p293z0.C10762c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageSlideupView */
/* compiled from: InAppMessageSlideupView.kt */
public class InAppMessageSlideupView extends C4339d {
    private InAppMessageImageView inAppMessageImageView;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageSlideupView$a */
    /* compiled from: InAppMessageSlideupView.kt */
    static final class C4335a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4335a f3627g = new C4335a();

        C4335a() {
            super(0);
        }

        public final String invoke() {
            return "Close button view is null or not of the expected class. Not applying window insets.";
        }
    }

    public InAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final View getMessageChevronView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_chevron);
    }

    public final void applyInAppMessageParameters(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        InAppMessageImageView inAppMessageImageView2 = (InAppMessageImageView) findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_imageview);
        this.inAppMessageImageView = inAppMessageImageView2;
        if (inAppMessageImageView2 != null) {
            inAppMessageImageView2.setInAppMessageImageCropType(aVar.mo40956X());
        }
    }

    public void applyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(windowInsetsCompat, "insets");
        super.applyWindowInsets(windowInsetsCompat);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4335a.f3627g, 7, (Object) null);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(C2117c.m1464c(windowInsetsCompat) + marginLayoutParams.leftMargin, C2117c.m1466e(windowInsetsCompat) + marginLayoutParams.topMargin, C2117c.m1465d(windowInsetsCompat) + marginLayoutParams.rightMargin, C2117c.m1463b(windowInsetsCompat) + marginLayoutParams.bottomMargin);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_icon);
    }

    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_message);
    }

    public void resetMessageMargins(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        CharSequence text;
        boolean z2;
        super.resetMessageMargins(z);
        TextView messageIconView = getMessageIconView();
        boolean z3 = false;
        if (!(messageIconView == null || (text = messageIconView.getText()) == null)) {
            if (text.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = true;
            }
        }
        boolean z4 = !z3;
        if (!z && z4) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                C2117c.m1471j(relativeLayout);
            }
            TextView textView = (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_message);
            if (textView == null) {
                layoutParams = null;
            } else {
                layoutParams = textView.getLayoutParams();
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.leftMargin = getContext().getResources().getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_slideup_left_message_margin_no_image);
            }
            textView.setLayoutParams(layoutParams2);
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
            View messageBackgroundObject2 = getMessageBackgroundObject();
            if (messageBackgroundObject2 != null) {
                C10762c.m22910k(messageBackgroundObject2, i);
                return;
            }
            return;
        }
        super.setMessageBackgroundColor(i);
    }

    public final void setMessageChevron(int i, C2102a aVar) {
        C12775o.m28639i(aVar, "clickAction");
        if (aVar == C2102a.NONE) {
            View messageChevronView = getMessageChevronView();
            if (messageChevronView != null) {
                messageChevronView.setVisibility(8);
                return;
            }
            return;
        }
        View messageChevronView2 = getMessageChevronView();
        if (messageChevronView2 != null) {
            C10762c.m22910k(messageChevronView2, i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_slideup_container);
    }
}
