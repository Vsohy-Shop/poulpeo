package p221s5;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.Scope;
import p232t5.C9744a;

/* renamed from: s5.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9499e {

    /* renamed from: a */
    public static final C4719a.C4729g<C9744a> f14162a;

    /* renamed from: b */
    public static final C4719a.C4729g<C9744a> f14163b;

    /* renamed from: c */
    public static final C4719a.C4720a<C9744a, C9495a> f14164c;

    /* renamed from: d */
    static final C4719a.C4720a<C9744a, C9498d> f14165d;

    /* renamed from: e */
    public static final Scope f14166e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f14167f = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: g */
    public static final C4719a<C9495a> f14168g;

    /* renamed from: h */
    public static final C4719a<C9498d> f14169h;

    static {
        C4719a.C4729g<C9744a> gVar = new C4719a.C4729g<>();
        f14162a = gVar;
        C4719a.C4729g<C9744a> gVar2 = new C4719a.C4729g<>();
        f14163b = gVar2;
        C9496b bVar = new C9496b();
        f14164c = bVar;
        C9497c cVar = new C9497c();
        f14165d = cVar;
        f14168g = new C4719a<>("SignIn.API", bVar, gVar);
        f14169h = new C4719a<>("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
