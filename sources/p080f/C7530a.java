package p080f;

import android.content.Context;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* renamed from: f.a */
/* compiled from: Coil.kt */
public final class C7530a {

    /* renamed from: a */
    public static final C7530a f10429a = new C7530a();

    /* renamed from: b */
    private static C7539e f10430b;

    /* renamed from: c */
    private static C7544f f10431c;

    private C7530a() {
    }

    /* renamed from: a */
    public static final C7539e m14789a(Context context) {
        C7539e eVar = f10430b;
        if (eVar == null) {
            return f10429a.m14790b(context);
        }
        return eVar;
    }

    /* renamed from: b */
    private final synchronized C7539e m14790b(Context context) {
        C7539e eVar;
        C7544f fVar;
        C7539e eVar2 = f10430b;
        if (eVar2 != null) {
            return eVar2;
        }
        C7544f fVar2 = f10431c;
        if (fVar2 == null || (eVar = fVar2.mo41292a()) == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof C7544f) {
                fVar = (C7544f) applicationContext;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                eVar = fVar.mo41292a();
            } else {
                eVar = C7545g.m14840a(context);
            }
        }
        f10431c = null;
        f10430b = eVar;
        return eVar;
    }
}
