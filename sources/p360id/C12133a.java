package p360id;

import android.app.Activity;
import androidx.appcompat.app.AlertDialog;
import kotlin.jvm.functions.Function1;

/* renamed from: id.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C12133a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Activity f19015b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f19016c;

    /* renamed from: d */
    public final /* synthetic */ Function1 f19017d;

    public /* synthetic */ C12133a(Activity activity, AlertDialog alertDialog, Function1 function1) {
        this.f19015b = activity;
        this.f19016c = alertDialog;
        this.f19017d = function1;
    }

    public final void run() {
        C12134b.m26458d(this.f19015b, this.f19016c, this.f19017d);
    }
}
