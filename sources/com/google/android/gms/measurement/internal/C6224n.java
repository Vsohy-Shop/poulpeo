package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.n */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6224n extends C6197k5 {

    /* renamed from: c */
    private long f7990c;

    /* renamed from: d */
    private String f7991d;

    /* renamed from: e */
    private AccountManager f7992e;

    /* renamed from: f */
    private Boolean f7993f;

    /* renamed from: g */
    private long f7994g;

    C6224n(C6251p4 p4Var) {
        super(p4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo35061j() {
        Calendar instance = Calendar.getInstance();
        this.f7990c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f7991d = sb.toString();
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final long mo35099o() {
        mo34778h();
        return this.f7994g;
    }

    /* renamed from: p */
    public final long mo35100p() {
        mo35062k();
        return this.f7990c;
    }

    /* renamed from: q */
    public final String mo35101q() {
        mo35062k();
        return this.f7991d;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo35102r() {
        mo34778h();
        this.f7993f = null;
        this.f7994g = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final boolean mo35103s() {
        mo34778h();
        long a = this.f7899a.mo34922c().mo33547a();
        if (a - this.f7994g > 86400000) {
            this.f7993f = null;
        }
        Boolean bool = this.f7993f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.f7899a.mo34927f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f7899a.mo34920b().mo35082y().mo35037a("Permission error checking for dasher/unicorn accounts");
            this.f7994g = a;
            this.f7993f = Boolean.FALSE;
            return false;
        }
        if (this.f7992e == null) {
            this.f7992e = AccountManager.get(this.f7899a.mo34927f());
        }
        try {
            Account[] result = this.f7992e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f7992e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f7993f = Boolean.TRUE;
                    this.f7994g = a;
                    return true;
                }
                this.f7994g = a;
                this.f7993f = Boolean.FALSE;
                return false;
            }
            this.f7993f = Boolean.TRUE;
            this.f7994g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f7899a.mo34920b().mo35077t().mo35038b("Exception checking account types", e);
        }
    }
}
