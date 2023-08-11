package p259w;

import android.content.Context;
import kotlin.jvm.internal.SourceDebugExtension;
import p125j.C8216a;

@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/SingletonDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
/* renamed from: w.r */
/* compiled from: Utils.kt */
public final class C10081r {

    /* renamed from: a */
    public static final C10081r f15235a = new C10081r();

    /* renamed from: b */
    private static C8216a f15236b;

    private C10081r() {
    }

    /* renamed from: a */
    public final synchronized C8216a mo44658a(Context context) {
        C8216a aVar;
        aVar = f15236b;
        if (aVar == null) {
            aVar = new C8216a.C8217a().mo42131b(C12956j.m29273h(C10070i.m21153m(context), "image_cache")).mo42130a();
            f15236b = aVar;
        }
        return aVar;
    }
}
