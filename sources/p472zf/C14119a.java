package p472zf;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p331dg.C11858u;
import p466yf.C13988j2;

/* renamed from: zf.a */
/* compiled from: HandlerDispatcher.kt */
public final class C14119a implements C11858u {
    /* renamed from: a */
    public String mo49056a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: b */
    public C13988j2 mo49057b(List<? extends C11858u> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C14122d(C14126f.m32792a(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    /* renamed from: c */
    public int mo49058c() {
        return 1073741823;
    }
}
