package com.rmn.utils;

import android.content.DialogInterface;
import com.rmn.p324ui.screens.AnimatedActivity;

/* renamed from: com.rmn.utils.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11668d implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ double f18165b;

    /* renamed from: c */
    public final /* synthetic */ double f18166c;

    /* renamed from: d */
    public final /* synthetic */ String f18167d;

    /* renamed from: e */
    public final /* synthetic */ String f18168e;

    /* renamed from: f */
    public final /* synthetic */ AnimatedActivity f18169f;

    public /* synthetic */ C11668d(double d, double d2, String str, String str2, AnimatedActivity animatedActivity) {
        this.f18165b = d;
        this.f18166c = d2;
        this.f18167d = str;
        this.f18168e = str2;
        this.f18169f = animatedActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MapsUtil.showDialogOpenMap$lambda$0(this.f18165b, this.f18166c, this.f18167d, this.f18168e, this.f18169f, dialogInterface, i);
    }
}
