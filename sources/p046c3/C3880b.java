package p046c3;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: c3.b */
/* compiled from: ReferralFragment */
public class C3880b extends Fragment {

    /* renamed from: b */
    private C3879a f2965b;

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f2965b.mo29924f(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2965b = new C3879a(this);
    }

    public void onResume() {
        super.onResume();
        this.f2965b.mo29925g();
    }
}
