package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.material.textfield.k */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6611k implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ DropdownMenuEndIconDelegate f8536b;

    public /* synthetic */ C6611k(DropdownMenuEndIconDelegate dropdownMenuEndIconDelegate) {
        this.f8536b = dropdownMenuEndIconDelegate;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f8536b.lambda$setUpDropdownShowHideBehavior$4(view, motionEvent);
    }
}
