package p440ud;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import com.rmn.iosadapters.android.content.ContextContainer;

/* renamed from: ud.j */
/* compiled from: ResourceImageWrapper */
public class C13564j {

    /* renamed from: a */
    public final int f21820a;

    public C13564j(int i) {
        this.f21820a = i;
    }

    /* renamed from: a */
    public Drawable mo53216a(ContextContainer contextContainer) {
        return ResourcesCompat.getDrawable(contextContainer.mo47843a().getResources(), this.f21820a, (Resources.Theme) null);
    }
}
