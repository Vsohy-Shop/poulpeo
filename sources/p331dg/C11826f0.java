package p331dg;

import kotlin.coroutines.jvm.internal.C12734a;
import kotlin.jvm.internal.SourceDebugExtension;
import p000a.C0000a;
import p336ef.C11907m;
import p336ef.C11910n;

@SourceDebugExtension({"SMAP\nStackTraceRecovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1735#2,6:215\n12744#2,2:223\n1627#2,6:227\n12744#2,2:233\n1627#2,6:236\n37#3,2:221\n26#4:225\n26#4:226\n1#5:235\n*S KotlinDebug\n*F\n+ 1 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n43#1:215,6\n131#1:223,2\n141#1:227,6\n171#1:233,2\n192#1:236,6\n106#1:221,2\n133#1:225\n135#1:226\n*E\n"})
/* renamed from: dg.f0 */
/* compiled from: StackTraceRecovery.kt */
public final class C11826f0 {

    /* renamed from: a */
    private static final StackTraceElement f18471a = new C0000a().mo1a();

    /* renamed from: b */
    private static final String f18472b;

    /* renamed from: c */
    private static final String f18473c;

    static {
        Object obj;
        Object obj2;
        try {
            C11907m.C11908a aVar = C11907m.f18600b;
            obj = C11907m.m25696a(C12734a.class.getCanonicalName());
        } catch (Throwable th) {
            C11907m.C11908a aVar2 = C11907m.f18600b;
            obj = C11907m.m25696a(C11910n.m25700a(th));
        }
        if (C11907m.m25697b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f18472b = (String) obj;
        try {
            obj2 = C11907m.m25696a(C11826f0.class.getCanonicalName());
        } catch (Throwable th2) {
            C11907m.C11908a aVar3 = C11907m.f18600b;
            obj2 = C11907m.m25696a(C11910n.m25700a(th2));
        }
        if (C11907m.m25697b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f18473c = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m25456a(E e) {
        return e;
    }
}
