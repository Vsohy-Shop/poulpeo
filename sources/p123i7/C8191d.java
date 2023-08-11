package p123i7;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4730b;
import com.google.android.gms.common.api.C4733c;
import p231t4.C9673d;

/* renamed from: i7.d */
/* compiled from: DynamicLinksApi */
public class C8191d extends C4730b<C4719a.C4723d.C4726c> {

    /* renamed from: k */
    private static final C4719a.C4729g<C8193e> f11517k;

    /* renamed from: l */
    private static final C4719a.C4720a<C8193e, C4719a.C4723d.C4726c> f11518l;

    /* renamed from: m */
    static final C4719a<C4719a.C4723d.C4726c> f11519m;

    /* renamed from: i7.d$a */
    /* compiled from: DynamicLinksApi */
    class C8192a extends C4719a.C4720a<C8193e, C4719a.C4723d.C4726c> {
        C8192a() {
        }

        /* renamed from: c */
        public C8193e mo28416a(Context context, Looper looper, C9673d dVar, C4719a.C4723d.C4726c cVar, C4733c.C4734a aVar, C4733c.C4735b bVar) {
            return new C8193e(context, looper, dVar, aVar, bVar);
        }
    }

    static {
        C4719a.C4729g<C8193e> gVar = new C4719a.C4729g<>();
        f11517k = gVar;
        C8192a aVar = new C8192a();
        f11518l = aVar;
        f11519m = new C4719a<>("DynamicLinks.API", aVar, gVar);
    }

    public C8191d(@NonNull Context context) {
        super(context, f11519m, C4719a.C4723d.f4905N, C4730b.C4731a.f4916c);
    }
}
