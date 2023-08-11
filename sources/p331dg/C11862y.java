package p331dg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C13986j0;

@SourceDebugExtension({"SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"})
/* renamed from: dg.y */
/* compiled from: OnUndeliveredElement.kt */
public final class C11862y {

    /* renamed from: dg.y$a */
    /* compiled from: OnUndeliveredElement.kt */
    static final class C11863a extends C12777p implements Function1<Throwable, C11921v> {

        /* renamed from: g */
        final /* synthetic */ Function1<E, C11921v> f18529g;

        /* renamed from: h */
        final /* synthetic */ E f18530h;

        /* renamed from: i */
        final /* synthetic */ C12079g f18531i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11863a(Function1<? super E, C11921v> function1, E e, C12079g gVar) {
            super(1);
            this.f18529g = function1;
            this.f18530h = e;
            this.f18531i = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C11921v.f18618a;
        }

        public final void invoke(Throwable th) {
            C11862y.m25586b(this.f18529g, this.f18530h, this.f18531i);
        }
    }

    /* renamed from: a */
    public static final <E> Function1<Throwable, C11921v> m25585a(Function1<? super E, C11921v> function1, E e, C12079g gVar) {
        return new C11863a(function1, e, gVar);
    }

    /* renamed from: b */
    public static final <E> void m25586b(Function1<? super E, C11921v> function1, E e, C12079g gVar) {
        UndeliveredElementException c = m25587c(function1, e, (UndeliveredElementException) null);
        if (c != null) {
            C13986j0.m32424a(gVar, c);
        }
    }

    /* renamed from: c */
    public static final <E> UndeliveredElementException m25587c(Function1<? super E, C11921v> function1, E e, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e, th);
            }
            C11894b.m25683a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    /* renamed from: d */
    public static /* synthetic */ UndeliveredElementException m25588d(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException, int i, Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return m25587c(function1, obj, undeliveredElementException);
    }
}
