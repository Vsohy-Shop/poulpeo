package p180o4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9713p;

/* renamed from: o4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C8972b extends DialogFragment {

    /* renamed from: b */
    private Dialog f13052b;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f13053c;
    @Nullable

    /* renamed from: d */
    private Dialog f13054d;

    @NonNull
    /* renamed from: a */
    public static C8972b m18211a(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        C8972b bVar = new C8972b();
        Dialog dialog2 = (Dialog) C9713p.m20276k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f13052b = dialog2;
        if (onCancelListener != null) {
            bVar.f13053c = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13053c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f13052b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f13054d == null) {
            this.f13054d = new AlertDialog.Builder((Context) C9713p.m20275j(getActivity())).create();
        }
        return this.f13054d;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}
