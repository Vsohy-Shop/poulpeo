package p440ud;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.lang.ref.WeakReference;

/* renamed from: ud.l */
/* compiled from: ScreenWrapper */
public class C13566l {

    /* renamed from: a */
    private final WeakReference<Activity> f21822a;
    @NonNull

    /* renamed from: b */
    private ContextContainer f21823b;

    public C13566l(@NonNull Activity activity) {
        this.f21822a = new WeakReference<>(activity);
        this.f21823b = new ContextContainer(activity);
    }

    @Nullable
    /* renamed from: a */
    public Activity mo53218a() {
        return this.f21822a.get();
    }

    @NonNull
    /* renamed from: b */
    public ContextContainer mo53219b() {
        return this.f21823b;
    }
}
