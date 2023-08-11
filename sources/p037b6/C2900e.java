package p037b6;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: b6.e */
public final class C2900e {

    /* renamed from: a */
    private final String f1303a;

    public C2900e(String str) {
        String str2;
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        if (valueOf2.length() != 0) {
            str2 = valueOf.concat(valueOf2);
        } else {
            str2 = new String(valueOf);
        }
        this.f1303a = str2;
    }

    /* renamed from: a */
    private final int m2309a(int i, String str, @Nullable Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m2310b(this.f1303a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    private static String m2310b(String str, String str2, @Nullable Object... objArr) {
        String str3;
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str3 = "Unable to format ".concat(valueOf);
                } else {
                    str3 = new String("Unable to format ");
                }
                Log.e("PlayCore", str3, e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: c */
    public final void mo28421c(String str, @Nullable Object... objArr) {
        m2309a(3, str, objArr);
    }

    /* renamed from: d */
    public final void mo28422d(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m2310b(this.f1303a, str, objArr), th);
        }
    }

    /* renamed from: e */
    public final void mo28423e(String str, @Nullable Object... objArr) {
        m2309a(6, str, objArr);
    }

    /* renamed from: f */
    public final void mo28424f(String str, @Nullable Object... objArr) {
        m2309a(4, str, objArr);
    }

    /* renamed from: g */
    public final void mo28425g(String str, @Nullable Object... objArr) {
        m2309a(5, str, objArr);
    }
}
