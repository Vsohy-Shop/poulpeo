package p150l4;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import p231t4.C9713p;

/* renamed from: l4.b */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C8675b {
    @NonNull

    /* renamed from: a */
    protected final String f12408a;

    /* renamed from: b */
    private final boolean f12409b;

    /* renamed from: c */
    private boolean f12410c;

    /* renamed from: d */
    private final String f12411d;

    public C8675b(@NonNull String str) {
        this(str, (String) null);
    }

    /* renamed from: a */
    public void mo42754a(@NonNull String str, @NonNull Object... objArr) {
        if (mo42762i()) {
            Log.d(this.f12408a, mo42761h(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo42755b(@NonNull Throwable th, @NonNull String str, @NonNull Object... objArr) {
        if (mo42762i()) {
            Log.d(this.f12408a, mo42761h(str, objArr), th);
        }
    }

    /* renamed from: c */
    public void mo42756c(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f12408a, mo42761h(str, objArr));
    }

    /* renamed from: d */
    public void mo42757d(@NonNull Throwable th, @NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f12408a, mo42761h(str, objArr), th);
    }

    /* renamed from: e */
    public void mo42758e(@NonNull String str, @NonNull Object... objArr) {
        Log.i(this.f12408a, mo42761h(str, objArr));
    }

    /* renamed from: f */
    public void mo42759f(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f12408a, mo42761h(str, objArr));
    }

    /* renamed from: g */
    public void mo42760g(@NonNull Throwable th, @NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f12408a, mo42761h(str, objArr), th);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public final String mo42761h(@NonNull String str, @NonNull Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (!TextUtils.isEmpty(this.f12411d)) {
            return String.valueOf(this.f12411d).concat(String.valueOf(str));
        }
        return str;
    }

    /* renamed from: i */
    public final boolean mo42762i() {
        if (this.f12410c) {
            return true;
        }
        if (!this.f12409b) {
            return false;
        }
        if (Log.isLoggable(this.f12408a, 3)) {
            return true;
        }
        return false;
    }

    protected C8675b(@NonNull String str, @NonNull String str2) {
        C9713p.m20272g(str, "The log tag cannot be null or empty.");
        this.f12408a = str;
        this.f12409b = str.length() <= 23;
        this.f12410c = false;
        this.f12411d = !TextUtils.isEmpty((CharSequence) null) ? String.format("[%s] ", new Object[]{null}) : null;
    }
}
