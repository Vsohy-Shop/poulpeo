package com.google.android.material.datepicker;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.material.datepicker.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6484c implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ EditText[] f8518b;

    public /* synthetic */ C6484c(EditText[] editTextArr) {
        this.f8518b = editTextArr;
    }

    public final void onFocusChange(View view, boolean z) {
        DateSelector.lambda$showKeyboardWithAutoHideBehavior$0(this.f8518b, view, z);
    }
}
