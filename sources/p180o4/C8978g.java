package p180o4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import p231t4.C9713p;

/* renamed from: o4.g */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C8978g extends DialogFragment {

    /* renamed from: b */
    private Dialog f13066b;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f13067c;
    @Nullable

    /* renamed from: d */
    private Dialog f13068d;

    @NonNull
    /* renamed from: M0 */
    public static C8978g m18226M0(@NonNull Dialog dialog, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        C8978g gVar = new C8978g();
        Dialog dialog2 = (Dialog) C9713p.m20276k(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        gVar.f13066b = dialog2;
        if (onCancelListener != null) {
            gVar.f13067c = onCancelListener;
        }
        return gVar;
    }

    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f13067c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Dialog dialog = this.f13066b;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f13068d == null) {
            this.f13068d = new AlertDialog.Builder((Context) C9713p.m20275j(getContext())).create();
        }
        return this.f13068d;
    }

    public void show(@NonNull FragmentManager fragmentManager, @Nullable String str) {
        super.show(fragmentManager, str);
    }
}
