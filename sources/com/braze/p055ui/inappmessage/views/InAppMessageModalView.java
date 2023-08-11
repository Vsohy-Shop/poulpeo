package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.p054ui.C4193R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2105d;
import p019a1.C2117c;
import p069e0.C7360c;
import p069e0.C7407n;
import p126j0.C8266c;
import p249v0.C9913a;
import p293z0.C10762c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageModalView */
/* compiled from: InAppMessageModalView.kt */
public class InAppMessageModalView extends C4355i {
    private C7407n inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    /* renamed from: com.braze.ui.inappmessage.views.InAppMessageModalView$a */
    /* compiled from: InAppMessageModalView.kt */
    static final class C4334a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4334a f3626g = new C4334a();

        C4334a() {
            super(0);
        }

        public final String invoke() {
            return "Passing scrollView click event to message clickable view.";
        }
    }

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: resetMessageMargins$lambda-0  reason: not valid java name */
    public static final void m38725resetMessageMargins$lambda0(InAppMessageModalView inAppMessageModalView, View view) {
        C12775o.m28639i(inAppMessageModalView, "this$0");
        C8266c.m16396e(C8266c.f11641a, inAppMessageModalView, (C8266c.C8267a) null, (Throwable) null, false, C4334a.f3626g, 7, (Object) null);
        View messageClickableView = inAppMessageModalView.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: resizeGraphicFrameIfAppropriate$lambda-2  reason: not valid java name */
    public static final void m38726resizeGraphicFrameIfAppropriate$lambda2(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        C12775o.m28639i(inAppMessageModalView, "this$0");
        double min = (double) Math.min(inAppMessageModalView.getMeasuredWidth() - i, i2);
        double min2 = (double) Math.min(inAppMessageModalView.getMeasuredHeight() - i, i3);
        double d2 = min / min2;
        View findViewById = inAppMessageModalView.findViewById(C4193R.C4196id.com_braze_inappmessage_modal_graphic_bound);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (d >= d2) {
                    layoutParams2.width = (int) min;
                    layoutParams2.height = (int) (min / d);
                } else {
                    layoutParams2.width = (int) (d * min2);
                    layoutParams2.height = (int) min2;
                }
                findViewById.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public void applyInAppMessageParameters(Context context, C7407n nVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(nVar, "inAppMessage");
        this.inAppMessage = nVar;
        InAppMessageImageView inAppMessageImageView2 = (InAppMessageImageView) findViewById(C4193R.C4196id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView2;
        if (inAppMessageImageView2 != null) {
            setInAppMessageImageViewAttributes(context, nVar, inAppMessageImageView2);
        }
        resizeGraphicFrameIfAppropriate(context, nVar);
    }

    public View getFrameView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_modal_frame);
    }

    /* access modifiers changed from: protected */
    public final C7407n getInAppMessage() {
        return this.inAppMessage;
    }

    /* access modifiers changed from: protected */
    public final InAppMessageImageView getInAppMessageImageView() {
        return this.inAppMessageImageView;
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_button_dual_two);
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
        return findViewById(C4193R.C4196id.com_braze_inappmessage_modal);
    }

    public View getMessageCloseButtonView() {
        return findViewById(C4193R.C4196id.com_braze_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(C4193R.C4196id.com_braze_inappmessage_modal_message);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Context context = getContext();
        C12775o.m28638h(context, "this.context");
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C4193R.C4196id.com_braze_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_modal_text_layout);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C4360k(this));
        }
    }

    /* access modifiers changed from: protected */
    public void resizeGraphicFrameIfAppropriate(Context context, C7407n nVar) {
        Bitmap bitmap;
        C12775o.m28639i(context, "context");
        if (nVar == null) {
            bitmap = null;
        } else {
            bitmap = nVar.mo40980w();
        }
        if (bitmap != null && nVar.mo40973D() == C2105d.GRAPHIC) {
            Resources resources = context.getResources();
            post(new C4359j(this, resources.getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_modal_margin), resources.getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_modal_max_width), resources.getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_modal_max_height), ((double) bitmap.getWidth()) / ((double) bitmap.getHeight())));
        }
    }

    /* access modifiers changed from: protected */
    public final void setInAppMessage(C7407n nVar) {
        this.inAppMessage = nVar;
    }

    /* access modifiers changed from: protected */
    public final void setInAppMessageImageView(InAppMessageImageView inAppMessageImageView2) {
        this.inAppMessageImageView = inAppMessageImageView2;
    }

    /* access modifiers changed from: protected */
    public void setInAppMessageImageViewAttributes(Context context, C7360c cVar, C4336a aVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(cVar, "inAppMessage");
        C12775o.m28639i(aVar, "inAppMessageImageView");
        float a = (float) C2117c.m1462a(context, C9913a.m20608a());
        if (cVar.mo40973D() == C2105d.GRAPHIC) {
            aVar.setCornersRadiusPx(a);
        } else {
            aVar.mo31097a(a, a, 0.0f, 0.0f);
        }
        aVar.setInAppMessageImageCropType(cVar.mo40956X());
    }

    public void setMessageBackgroundColor(int i) {
        View findViewById = findViewById(C4193R.C4196id.com_braze_inappmessage_modal);
        C12775o.m28638h(findViewById, "findViewById(R.id.com_braze_inappmessage_modal)");
        C10762c.m22910k(findViewById, i);
    }

    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView == null) {
            return null;
        }
        return messageClickableView.getBackground();
    }
}
