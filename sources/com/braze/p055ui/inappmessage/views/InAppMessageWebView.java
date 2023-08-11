package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;
import p238u0.C9783d;
import p293z0.C10762c;

/* renamed from: com.braze.ui.inappmessage.views.InAppMessageWebView */
/* compiled from: InAppMessageWebView.kt */
public class InAppMessageWebView extends WebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppMessageWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C10762c.m22900a();
        return true;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            return super.onKeyDown(i, keyEvent);
        }
        C10762c.m22900a();
        return true;
    }
}
