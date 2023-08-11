package p360id;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AlertDialog;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p340fd.C11943a;

/* renamed from: id.b */
/* compiled from: KAlertDialogExtensions.kt */
public final class C12134b {
    /* renamed from: b */
    public static final void m26456b(AlertDialog.Builder builder, Activity activity, Function1<? super AlertDialog, C11921v> function1) {
        C12775o.m28639i(builder, "<this>");
        C12775o.m28639i(activity, "activity");
        AlertDialog create = builder.create();
        C12775o.m28638h(create, "create()");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            new Handler(Looper.getMainLooper()).post(new C12133a(activity, create, function1));
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m26457c(AlertDialog.Builder builder, Activity activity, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        m26456b(builder, activity, function1);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m26458d(Activity activity, AlertDialog alertDialog, Function1 function1) {
        C12775o.m28639i(activity, "$activity");
        C12775o.m28639i(alertDialog, "$dialog");
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            new C11943a().mo49176a(alertDialog);
            alertDialog.show();
            if (function1 != null) {
                function1.invoke(alertDialog);
            }
        }
    }
}
