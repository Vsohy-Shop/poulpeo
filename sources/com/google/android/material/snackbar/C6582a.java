package com.google.android.material.snackbar;

import android.view.View;

/* renamed from: com.google.android.material.snackbar.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6582a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ Snackbar f8523b;

    /* renamed from: c */
    public final /* synthetic */ View.OnClickListener f8524c;

    public /* synthetic */ C6582a(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f8523b = snackbar;
        this.f8524c = onClickListener;
    }

    public final void onClick(View view) {
        this.f8523b.lambda$setAction$0(this.f8524c, view);
    }
}
