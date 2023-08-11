package p150l4;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: l4.y */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C8716y extends C8690i0 {

    /* renamed from: d */
    private final List f12530d = Collections.synchronizedList(new ArrayList());

    public C8716y(String str, String str2, @Nullable String str3) {
        super(str, "MediaControlChannel", (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List mo42841f() {
        return this.f12530d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo42842g() {
        synchronized (this.f12530d) {
            for (C8714w c : this.f12530d) {
                c.mo42835c(2002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo42843h(C8714w wVar) {
        this.f12530d.add(wVar);
    }
}
