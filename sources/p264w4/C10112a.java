package p264w4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import p231t4.C9689i;

/* renamed from: w4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10112a {

    /* renamed from: a */
    private final String f15274a;

    /* renamed from: b */
    private final String f15275b;

    /* renamed from: c */
    private final C9689i f15276c;

    /* renamed from: d */
    private final int f15277d;

    public C10112a(@NonNull String str, @NonNull String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f15275b = str2;
        this.f15274a = str;
        this.f15276c = new C9689i(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f15274a, i)) {
            i++;
        }
        this.f15277d = i;
    }

    /* renamed from: a */
    public void mo44690a(@NonNull String str, @Nullable Object... objArr) {
        if (mo44693d(3)) {
            Log.d(this.f15274a, mo44692c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo44691b(@NonNull String str, @Nullable Object... objArr) {
        Log.e(this.f15274a, mo44692c(str, objArr));
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: c */
    public String mo44692c(@NonNull String str, @Nullable Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f15275b.concat(str);
    }

    /* renamed from: d */
    public boolean mo44693d(int i) {
        if (this.f15277d <= i) {
            return true;
        }
        return false;
    }
}
