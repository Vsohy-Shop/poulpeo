package p198q2;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import p198q2.C9146f0;

/* renamed from: q2.g */
/* compiled from: FacebookDialogFragment */
public class C9157g extends DialogFragment {

    /* renamed from: b */
    private Dialog f13385b;

    /* renamed from: q2.g$a */
    /* compiled from: FacebookDialogFragment */
    class C9158a implements C9146f0.C9154h {
        C9158a() {
        }

        /* renamed from: a */
        public void mo23483a(Bundle bundle, FacebookException facebookException) {
            C9157g.this.m18737R0(bundle, facebookException);
        }
    }

    /* renamed from: q2.g$b */
    /* compiled from: FacebookDialogFragment */
    class C9159b implements C9146f0.C9154h {
        C9159b() {
        }

        /* renamed from: a */
        public void mo23483a(Bundle bundle, FacebookException facebookException) {
            C9157g.this.m18738l2(bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public void m18737R0(Bundle bundle, FacebookException facebookException) {
        int i;
        FragmentActivity activity = getActivity();
        Intent o = C9196w.m18858o(activity.getIntent(), bundle, facebookException);
        if (facebookException == null) {
            i = -1;
        } else {
            i = 0;
        }
        activity.setResult(i, o);
        activity.finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public void m18738l2(Bundle bundle) {
        FragmentActivity activity = getActivity();
        Intent intent = new Intent();
        if (bundle == null) {
            bundle = new Bundle();
        }
        intent.putExtras(bundle);
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: m2 */
    public void mo43438m2(Dialog dialog) {
        this.f13385b = dialog;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f13385b instanceof C9146f0) && isResumed()) {
            ((C9146f0) this.f13385b).mo43414t();
        }
    }

    public void onCreate(Bundle bundle) {
        C9146f0 f0Var;
        super.onCreate(bundle);
        if (this.f13385b == null) {
            FragmentActivity activity = getActivity();
            Bundle w = C9196w.m18866w(activity.getIntent());
            if (!w.getBoolean("is_fallback", false)) {
                String string = w.getString("action");
                Bundle bundle2 = w.getBundle("params");
                if (C9138d0.m18618T(string)) {
                    C9138d0.m18626a0("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
                    activity.finish();
                    return;
                }
                f0Var = new C9146f0.C9152f(activity, string, bundle2).mo43428h(new C9158a()).mo23488a();
            } else {
                String string2 = w.getString("url");
                if (C9138d0.m18618T(string2)) {
                    C9138d0.m18626a0("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
                    activity.finish();
                    return;
                }
                f0Var = C9164k.m18752B(activity, string2, String.format("fb%s://bridge/", new Object[]{FacebookSdk.getApplicationId()}));
                f0Var.mo43418x(new C9159b());
            }
            this.f13385b = f0Var;
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f13385b == null) {
            m18737R0((Bundle) null, (FacebookException) null);
            setShowsDialog(false);
        }
        return this.f13385b;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = this.f13385b;
        if (dialog instanceof C9146f0) {
            ((C9146f0) dialog).mo43414t();
        }
    }
}
