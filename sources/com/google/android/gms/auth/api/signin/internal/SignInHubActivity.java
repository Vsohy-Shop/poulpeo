package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C4733c;
import com.google.android.gms.common.api.Status;
import p085f4.C7576f;
import p085f4.C7587q;
import p110h5.C7978a;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: g */
    private static boolean f4486g = false;

    /* renamed from: b */
    private boolean f4487b = false;

    /* renamed from: c */
    private SignInConfiguration f4488c;

    /* renamed from: d */
    private boolean f4489d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f4490e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Intent f4491f;

    /* renamed from: n2 */
    private final void m5959n2(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f4486g = false;
    }

    /* renamed from: p2 */
    private final void m5961p2() {
        getSupportLoaderManager().initLoader(0, (Bundle) null, new C4621a());
        f4486g = false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (!this.f4487b) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.mo31882k() != null) {
                        GoogleSignInAccount k = signInAccount.mo31882k();
                        C7587q.m14936c(this).mo41342b(this.f4488c.mo31891A(), (GoogleSignInAccount) C7978a.m15680a(k));
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", k);
                        this.f4489d = true;
                        this.f4490e = i2;
                        this.f4491f = intent;
                        m5961p2();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        m5959n2(intExtra);
                        return;
                    }
                }
                m5959n2(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str2 = (String) C7978a.m15680a(intent.getAction());
        if ("com.google.android.gms.auth.NO_IMPL".equals(str2)) {
            m5959n2(12500);
        } else if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || str2.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) ((Bundle) C7978a.m15680a(intent.getBundleExtra("config"))).getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f4488c = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.f4489d = z;
                if (z) {
                    this.f4490e = bundle.getInt("signInResultCode");
                    this.f4491f = (Intent) C7978a.m15680a((Intent) bundle.getParcelable("signInResultData"));
                    m5961p2();
                }
            } else if (f4486g) {
                setResult(0);
                m5959n2(12502);
            } else {
                f4486g = true;
                Intent intent2 = new Intent(str2);
                if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f4488c);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.f4487b = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    m5959n2(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                str = "Unknown action: ".concat(valueOf);
            } else {
                str = new String("Unknown action: ");
            }
            Log.e("AuthSignInClient", str);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f4489d);
        if (this.f4489d) {
            bundle.putInt("signInResultCode", this.f4490e);
            bundle.putParcelable("signInResultData", this.f4491f);
        }
    }

    /* renamed from: com.google.android.gms.auth.api.signin.internal.SignInHubActivity$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    private class C4621a implements LoaderManager.LoaderCallbacks<Void> {
        private C4621a() {
        }

        public final Loader<Void> onCreateLoader(int i, Bundle bundle) {
            return new C7576f(SignInHubActivity.this, C4733c.m6458b());
        }

        public final /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
            Void voidR = (Void) obj;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.f4490e, SignInHubActivity.this.f4491f);
            SignInHubActivity.this.finish();
        }

        public final void onLoaderReset(Loader<Void> loader) {
        }
    }
}
