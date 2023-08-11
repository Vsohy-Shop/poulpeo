package p466yf;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2,2:128\n13579#3,2:130\n1855#4,2:132\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n42#1:128,2\n54#1:130,2\n66#1:132,2\n*E\n"})
/* renamed from: yf.e */
/* compiled from: Await.kt */
public final class C13946e {

    @C12739f(mo50609c = "kotlinx.coroutines.AwaitKt", mo50610f = "Await.kt", mo50611l = {66}, mo50612m = "joinAll")
    /* renamed from: yf.e$a */
    /* compiled from: Await.kt */
    static final class C13947a extends C12737d {

        /* renamed from: h */
        Object f22861h;

        /* renamed from: i */
        /* synthetic */ Object f22862i;

        /* renamed from: j */
        int f22863j;

        C13947a(C12074d<? super C13947a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f22862i = obj;
            this.f22863j |= Integer.MIN_VALUE;
            return C13946e.m32249a((Collection<? extends C14054y1>) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m32249a(java.util.Collection<? extends p466yf.C14054y1> r4, p355hf.C12074d<? super p336ef.C11921v> r5) {
        /*
            boolean r0 = r5 instanceof p466yf.C13946e.C13947a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            yf.e$a r0 = (p466yf.C13946e.C13947a) r0
            int r1 = r0.f22863j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22863j = r1
            goto L_0x0018
        L_0x0013:
            yf.e$a r0 = new yf.e$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f22862i
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f22863j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f22861h
            java.util.Iterator r4 = (java.util.Iterator) r4
            p336ef.C11910n.m25701b(r5)
            goto L_0x003e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            p336ef.C11910n.m25701b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x003e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r4.next()
            yf.y1 r5 = (p466yf.C14054y1) r5
            r0.f22861h = r4
            r0.f22863j = r3
            java.lang.Object r5 = r5.mo53703G(r0)
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x0055:
            ef.v r4 = p336ef.C11921v.f18618a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C13946e.m32249a(java.util.Collection, hf.d):java.lang.Object");
    }
}
