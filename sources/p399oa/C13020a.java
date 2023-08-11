package p399oa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.List;
import p258v9.C10056a;
import p258v9.C10057b;
import p258v9.C10058c;
import p258v9.C10059d;
import p311bd.C10930a;
import p399oa.C13029h;

/* renamed from: oa.a */
/* compiled from: HomeController */
public class C13020a extends C13029h {

    /* renamed from: g */
    public static boolean f20817g = false;

    /* renamed from: oa.a$a */
    /* compiled from: HomeController */
    public static class C13021a extends C13029h.C13030a {
        public C13021a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str, @NonNull C10058c cVar2) {
            super(contextContainer, logoutListener, aVar, cVar, str, cVar2);
        }
    }

    public C13020a(@NonNull C13031i iVar, @NonNull C13021a aVar) {
        super(iVar, aVar);
    }

    @NonNull
    /* renamed from: I2 */
    public static String m29394I2() {
        if (f20817g) {
            return "6716";
        }
        return "6222";
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public void mo50933E2(@NonNull List<Object> list) {
        list.add(0, new C10059d());
        list.add(1, new C10056a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public void mo50934F2(@NonNull List<Object> list) {
        list.add(0, new C10059d());
        list.add(1, new C10057b());
    }
}
