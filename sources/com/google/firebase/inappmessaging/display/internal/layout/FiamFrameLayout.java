package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import p039b8.C2940a;

public class FiamFrameLayout extends FrameLayout {

    /* renamed from: b */
    private C2940a f9174b;

    public FiamFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean a = this.f9174b.mo28479a(keyEvent);
        if (a != null) {
            return a.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f9174b = new C2940a(this, onClickListener);
    }
}
