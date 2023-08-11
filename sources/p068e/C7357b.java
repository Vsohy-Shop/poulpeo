package p068e;

import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: e.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C7357b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f10156b;

    /* renamed from: c */
    public final /* synthetic */ Violation f10157c;

    public /* synthetic */ C7357b(String str, Violation violation) {
        this.f10156b = str;
        this.f10157c = violation;
    }

    public final void run() {
        FragmentStrictMode.m38721handlePolicyViolation$lambda1(this.f10156b, this.f10157c);
    }
}
