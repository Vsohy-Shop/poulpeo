package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RelativeLayout;
import p039b8.C2940a;

public class FiamRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    private C2940a f9175b;

    public FiamRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Boolean a = this.f9175b.mo28479a(keyEvent);
        if (a != null) {
            return a.booleanValue();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setDismissListener(View.OnClickListener onClickListener) {
        this.f9175b = new C2940a(this, onClickListener);
    }
}
