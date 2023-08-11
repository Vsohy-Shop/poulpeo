package p021a3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import p021a3.C2166l;
import p178o2.C8953b;
import p178o2.C8954c;

/* renamed from: a3.n */
/* compiled from: LoginFragment */
public class C2177n extends Fragment {

    /* renamed from: b */
    private String f927b;

    /* renamed from: c */
    private C2166l f928c;

    /* renamed from: d */
    private C2166l.C2170d f929d;

    /* renamed from: a3.n$a */
    /* compiled from: LoginFragment */
    class C2178a implements C2166l.C2169c {
        C2178a() {
        }

        /* renamed from: a */
        public void mo23396a(C2166l.C2172e eVar) {
            C2177n.this.m1667n2(eVar);
        }
    }

    /* renamed from: a3.n$b */
    /* compiled from: LoginFragment */
    class C2179b implements C2166l.C2168b {

        /* renamed from: a */
        final /* synthetic */ View f931a;

        C2179b(View view) {
            this.f931a = view;
        }

        /* renamed from: a */
        public void mo23394a() {
            this.f931a.setVisibility(0);
        }

        /* renamed from: b */
        public void mo23395b() {
            this.f931a.setVisibility(8);
        }
    }

    /* renamed from: m2 */
    private void m1666m2(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f927b = callingActivity.getPackageName();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m1667n2(C2166l.C2172e eVar) {
        int i;
        this.f929d = null;
        if (eVar.f911b == C2166l.C2172e.C2174b.CANCEL) {
            i = 0;
        } else {
            i = -1;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", eVar);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public C2166l mo23435N0() {
        return new C2166l((Fragment) this);
    }

    /* access modifiers changed from: protected */
    @LayoutRes
    /* renamed from: R0 */
    public int mo23436R0() {
        return C8954c.f12997c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public C2166l mo23437l2() {
        return this.f928c;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f928c.mo23366A(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            C2166l lVar = (C2166l) bundle.getParcelable("loginClient");
            this.f928c = lVar;
            lVar.mo23368D(this);
        } else {
            this.f928c = mo23435N0();
        }
        this.f928c.mo23369E(new C2178a());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            m1666m2(activity);
            Intent intent = activity.getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
                this.f929d = (C2166l.C2170d) bundleExtra.getParcelable("request");
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(mo23436R0(), viewGroup, false);
        this.f928c.mo23367C(new C2179b(inflate.findViewById(C8953b.f12992d)));
        return inflate;
    }

    public void onDestroy() {
        this.f928c.mo23375c();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(C8953b.f12992d);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f927b == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.f928c.mo23370F(this.f929d);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f928c);
    }
}
