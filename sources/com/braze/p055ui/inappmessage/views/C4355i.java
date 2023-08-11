package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.appboy.p054ui.C4193R;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2111i;
import p019a1.C2117c;
import p069e0.C7416r;
import p126j0.C8266c;
import p238u0.C9783d;
import p293z0.C10761b;
import p293z0.C10762c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.i */
/* compiled from: InAppMessageImmersiveBaseView.kt */
public abstract class C4355i extends C4339d implements C4337b {

    /* renamed from: com.braze.ui.inappmessage.views.i$a */
    /* compiled from: InAppMessageImmersiveBaseView.kt */
    static final class C4356a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4356a f3643g = new C4356a();

        C4356a() {
            super(0);
        }

        public final String invoke() {
            return "Cannot increase click area for view if view and/or parent are null.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.i$b */
    /* compiled from: InAppMessageImmersiveBaseView.kt */
    static final class C4357b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4357b f3644g = new C4357b();

        C4357b() {
            super(0);
        }

        public final String invoke() {
            return "closeButtonId is null. Cannot continue setting up navigation.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.i$c */
    /* compiled from: InAppMessageImmersiveBaseView.kt */
    static final class C4358c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f3645g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4358c(int i) {
            super(0);
            this.f3645g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Cannot setup directional navigation. Got unsupported number of buttons: ", Integer.valueOf(this.f3645g));
        }
    }

    public C4355i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: setLargerCloseButtonClickArea$lambda-5  reason: not valid java name */
    public static final void m38727setLargerCloseButtonClickArea$lambda5(View view, C4355i iVar, ViewParent viewParent) {
        C12775o.m28639i(iVar, "this$0");
        Rect rect = new Rect();
        view.getHitRect(rect);
        int dimensionPixelSize = iVar.getContext().getResources().getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_close_button_click_area_width);
        int dimensionPixelSize2 = iVar.getContext().getResources().getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_close_button_click_area_height);
        int width = (dimensionPixelSize - rect.width()) / 2;
        int height = (dimensionPixelSize2 - rect.height()) / 2;
        rect.top -= height;
        rect.bottom += height;
        rect.left -= width;
        rect.right += width;
        ((View) viewParent).setTouchDelegate(new TouchDelegate(rect, view));
    }

    /* access modifiers changed from: private */
    /* renamed from: setupDirectionalNavigation$lambda-0  reason: not valid java name */
    public static final void m38728setupDirectionalNavigation$lambda0(View view) {
        view.requestFocus();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C10762c.m22900a();
        return true;
    }

    public abstract View getFrameView();

    public abstract List<View> getMessageButtonViews(int i);

    public abstract /* synthetic */ View getMessageCloseButtonView();

    public abstract TextView getMessageHeaderTextView();

    public abstract TextView getMessageTextView();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            return super.onKeyDown(i, keyEvent);
        }
        C10762c.m22900a();
        return true;
    }

    public void resetMessageMargins(boolean z) {
        CharSequence charSequence;
        super.resetMessageMargins(z);
        TextView messageTextView = getMessageTextView();
        CharSequence charSequence2 = null;
        if (messageTextView == null) {
            charSequence = null;
        } else {
            charSequence = messageTextView.getText();
        }
        if (C13754v.m31532t(String.valueOf(charSequence))) {
            C2117c.m1471j(getMessageTextView());
        }
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            charSequence2 = messageHeaderTextView.getText();
        }
        if (C13754v.m31532t(String.valueOf(charSequence2))) {
            C2117c.m1471j(getMessageHeaderTextView());
        }
        C10762c.m22901b(getMessageTextView(), getMessageHeaderTextView());
    }

    public void setFrameColor(int i) {
        View frameView = getFrameView();
        if (frameView != null) {
            C10762c.m22904e(frameView, Integer.valueOf(i));
        }
    }

    public void setLargerCloseButtonClickArea(View view) {
        if (view == null || view.getParent() == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4356a.f3643g, 6, (Object) null);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            ((View) parent).post(new C4354h(view, this, parent));
        }
    }

    public void setMessageButtons(List<? extends C7416r> list) {
        C12775o.m28639i(list, "messageButtons");
        C10761b.m22899d(getMessageButtonViews(list.size()), list);
    }

    public void setMessageCloseButtonColor(int i) {
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            C10762c.m22910k(messageCloseButtonView, i);
        }
    }

    public void setMessageHeaderText(String str) {
        C12775o.m28639i(str, "text");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            messageHeaderTextView.setText(str);
        }
    }

    public void setMessageHeaderTextAlignment(C2111i iVar) {
        C12775o.m28639i(iVar, "textAlign");
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            C10762c.m22907h(messageHeaderTextView, iVar);
        }
    }

    public void setMessageHeaderTextColor(int i) {
        TextView messageHeaderTextView = getMessageHeaderTextView();
        if (messageHeaderTextView != null) {
            C10762c.m22908i(messageHeaderTextView, i);
        }
    }

    public void setupDirectionalNavigation(int i) {
        Integer num;
        List<View> messageButtonViews = getMessageButtonViews(i);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView == null) {
            num = null;
        } else {
            num = Integer.valueOf(messageCloseButtonView.getId());
        }
        if (num == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4357b.f3644g, 6, (Object) null);
            return;
        }
        if (i == 0) {
            messageCloseButtonView.setNextFocusUpId(num.intValue());
            messageCloseButtonView.setNextFocusDownId(num.intValue());
            messageCloseButtonView.setNextFocusRightId(num.intValue());
            messageCloseButtonView.setNextFocusLeftId(num.intValue());
        } else if (i == 1) {
            View view = messageButtonViews.get(0);
            Integer valueOf = Integer.valueOf(view.getId());
            view.setNextFocusLeftId(num.intValue());
            view.setNextFocusRightId(num.intValue());
            view.setNextFocusUpId(num.intValue());
            view.setNextFocusDownId(num.intValue());
            messageCloseButtonView.setNextFocusUpId(valueOf.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf.intValue());
            messageCloseButtonView = view;
            num = valueOf;
        } else if (i != 2) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C4358c(i), 6, (Object) null);
        } else {
            View view2 = messageButtonViews.get(1);
            View view3 = messageButtonViews.get(0);
            Integer valueOf2 = Integer.valueOf(view2.getId());
            Integer valueOf3 = Integer.valueOf(view3.getId());
            view2.setNextFocusLeftId(valueOf3.intValue());
            view2.setNextFocusRightId(valueOf3.intValue());
            view2.setNextFocusUpId(num.intValue());
            view2.setNextFocusDownId(num.intValue());
            view3.setNextFocusLeftId(valueOf2.intValue());
            view3.setNextFocusRightId(valueOf2.intValue());
            view3.setNextFocusUpId(num.intValue());
            view3.setNextFocusDownId(num.intValue());
            messageCloseButtonView.setNextFocusUpId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusDownId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusRightId(valueOf2.intValue());
            messageCloseButtonView.setNextFocusLeftId(valueOf3.intValue());
            messageCloseButtonView = view2;
            num = valueOf2;
        }
        setNextFocusUpId(num.intValue());
        setNextFocusDownId(num.intValue());
        setNextFocusRightId(num.intValue());
        setNextFocusLeftId(num.intValue());
        if (Build.VERSION.SDK_INT >= 26 && messageCloseButtonView != null) {
            messageCloseButtonView.setFocusedByDefault(true);
        }
        if (messageCloseButtonView != null) {
            messageCloseButtonView.post(new C4353g(messageCloseButtonView));
        }
    }
}
