package p314bg;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p308ag.C10912p;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,354:1\n106#2:355\n106#2:356\n106#2:357\n106#2:358\n106#2:359\n106#2:360\n106#2:361\n106#2:362\n106#2:363\n106#2:364\n106#2:365\n106#2:366\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n68#1:355\n82#1:356\n89#1:357\n98#1:358\n107#1:359\n122#1:360\n131#1:361\n153#1:362\n164#1:363\n175#1:364\n184#1:365\n193#1:366\n*E\n"})
/* renamed from: bg.i */
/* compiled from: Builders.kt */
final /* synthetic */ class C10973i {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,112:1\n136#2,2:113\n*E\n"})
    /* renamed from: bg.i$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C10974a implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ Object f16936b;

        public C10974a(Object obj) {
            this.f16936b = obj;
        }

        public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
            Object emit = gVar.emit(this.f16936b, dVar);
            if (emit == C12150d.m26492c()) {
                return emit;
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: a */
    public static final <T> C10962f<T> m23617a(C13088o<? super C10912p<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        return new C10950b(oVar, (C12079g) null, 0, (C10886a) null, 14, (DefaultConstructorMarker) null);
    }

    /* renamed from: b */
    public static final <T> C10962f<T> m23618b() {
        return C10960e.f16919b;
    }

    /* renamed from: c */
    public static final <T> C10962f<T> m23619c(C13088o<? super C10967g<? super T>, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        return new C11027w(oVar);
    }

    /* renamed from: d */
    public static final <T> C10962f<T> m23620d(T t) {
        return new C10974a(t);
    }
}
