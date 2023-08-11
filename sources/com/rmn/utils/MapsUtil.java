package com.rmn.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.C4784b;
import com.poulpeo.R;
import com.rmn.p324ui.screens.AnimatedActivity;
import kotlin.jvm.internal.C12775o;
import p340fd.C11943a;
import p360id.C12136d;

@StabilityInferred(parameters = 0)
/* compiled from: MapsUtil.kt */
public final class MapsUtil {
    public static final int $stable = 0;
    public static final MapsUtil INSTANCE = new MapsUtil();

    private MapsUtil() {
    }

    /* access modifiers changed from: private */
    public static final void showDialogOpenMap$lambda$0(double d, double d2, String str, String str2, AnimatedActivity animatedActivity, DialogInterface dialogInterface, int i) {
        C12775o.m28639i(str, "$nameElement");
        C12775o.m28639i(str2, "$addressElement");
        C12775o.m28639i(animatedActivity, "$context");
        animatedActivity.mo47883t2(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2 + "(" + str + "+" + str2 + ")")));
    }

    public final boolean checkPlayServicesAvailable(Context context) {
        C12775o.m28639i(context, "context");
        if (C4784b.m6693g(context.getApplicationContext()) == 0) {
            return true;
        }
        return false;
    }

    public final void showDialogOpenMap(AnimatedActivity animatedActivity, double d, double d2, String str, String str2) {
        C12775o.m28639i(animatedActivity, "context");
        String str3 = str;
        C12775o.m28639i(str3, "nameElement");
        String str4 = str2;
        C12775o.m28639i(str4, "addressElement");
        AlertDialog create = new AlertDialog.Builder(animatedActivity).setMessage((int) R.string.open_map_dialog_shop).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C11668d(d, d2, str3, str4, animatedActivity)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
        C12775o.m28638h(create, "Builder(context)\n       …                .create()");
        new C11943a().mo49176a(create);
        create.show();
    }

    public final void startMapsActivity(Context context, double d, double d2) {
        C12775o.m28639i(context, "context");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://maps.google.com/maps?daddr=" + d + "," + d2));
        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            C12136d.m26467i(context, R.string.error_direction);
        }
    }
}
