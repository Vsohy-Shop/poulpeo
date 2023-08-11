package p231t4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p200q4.C9226f;

/* renamed from: t4.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C9678e0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C9678e0 m20209b(Activity activity, @Nullable Intent intent, int i) {
        return new C9671c0(intent, activity, i);
    }

    /* renamed from: c */
    public static C9678e0 m20210c(@NonNull C9226f fVar, @Nullable Intent intent, int i) {
        return new C9675d0(intent, fVar, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo44155a();

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo44155a();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
