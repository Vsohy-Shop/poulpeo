package p068e;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: e.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7356a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FragmentStrictMode.Policy f10154b;

    /* renamed from: c */
    public final /* synthetic */ Violation f10155c;

    public /* synthetic */ C7356a(FragmentStrictMode.Policy policy, Violation violation) {
        this.f10154b = policy;
        this.f10155c = violation;
    }

    public final void run() {
        FragmentStrictMode.m38720handlePolicyViolation$lambda0(this.f10154b, this.f10155c);
    }
}
