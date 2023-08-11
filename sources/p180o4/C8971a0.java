package p180o4;

import java.util.concurrent.Callable;

/* renamed from: o4.a0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C8971a0 extends C8973b0 {

    /* renamed from: e */
    private final Callable<String> f13051e;

    /* synthetic */ C8971a0(Callable callable, C8997z zVar) {
        super(false, (String) null, (Throwable) null);
        this.f13051e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43141a() {
        try {
            return this.f13051e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
