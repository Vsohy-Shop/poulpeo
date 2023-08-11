package com.appboy.p054ui.activities;

import android.app.Activity;
import p238u0.C9783d;
import p270x.C10156b;

@Deprecated
/* renamed from: com.appboy.ui.activities.AppboyBaseActivity */
public class AppboyBaseActivity extends Activity {
    public void onPause() {
        super.onPause();
        C9783d.m20394A().mo44307G(this);
    }

    public void onResume() {
        super.onResume();
        C9783d.m20394A().mo44303C(this);
    }

    public void onStart() {
        super.onStart();
        C10156b.m21418Q(this).mo44786c0(this);
    }

    public void onStop() {
        super.onStop();
        C10156b.m21418Q(this).mo44767K(this);
    }
}
