package p440ud;

import androidx.core.content.ContextCompat;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: ud.b */
/* compiled from: ColorWrapper */
public class C13549b {

    /* renamed from: a */
    public final int f21807a;

    private C13549b(ContextContainer contextContainer, int i) {
        this.f21807a = ContextCompat.getColor(contextContainer.mo47843a(), i);
    }

    /* renamed from: a */
    public static C13549b m30936a(ContextContainer contextContainer, int i) {
        return new C13549b(contextContainer, i);
    }
}
