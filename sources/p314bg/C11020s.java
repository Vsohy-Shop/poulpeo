package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,136:1\n21#1:143\n23#1:147\n21#1:148\n23#1:152\n50#2:137\n55#2:139\n50#2:140\n55#2:142\n50#2:144\n55#2:146\n50#2:149\n55#2:151\n50#2:153\n55#2:155\n50#2:156\n55#2:158\n50#2:159\n55#2:161\n50#2:163\n55#2:165\n106#3:138\n106#3:141\n106#3:145\n106#3:150\n106#3:154\n106#3:157\n106#3:160\n106#3:162\n106#3:164\n106#3:166\n106#3:167\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n36#1:143\n36#1:147\n41#1:148\n41#1:152\n21#1:137\n21#1:139\n28#1:140\n28#1:142\n36#1:144\n36#1:146\n41#1:149\n41#1:151\n46#1:153\n46#1:155\n53#1:156\n53#1:158\n60#1:159\n60#1:161\n78#1:163\n78#1:165\n21#1:138\n28#1:141\n36#1:145\n41#1:150\n46#1:154\n53#1:157\n60#1:160\n68#1:162\n78#1:164\n105#1:166\n125#1:167\n*E\n"})
/* renamed from: bg.s */
/* compiled from: Transform.kt */
final /* synthetic */ class C11020s {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    /* renamed from: bg.s$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C11021a implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ C10962f f17051b;

        /* renamed from: c */
        final /* synthetic */ C13088o f17052c;

        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,222:1\n79#2,2:223\n*E\n"})
        /* renamed from: bg.s$a$a */
        /* compiled from: Emitters.kt */
        public static final class C11022a<T> implements C10967g {

            /* renamed from: b */
            final /* synthetic */ C10967g f17053b;

            /* renamed from: c */
            final /* synthetic */ C13088o f17054c;

            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", mo50610f = "Transform.kt", mo50611l = {223, 224}, mo50612m = "emit")
            /* renamed from: bg.s$a$a$a */
            /* compiled from: Emitters.kt */
            public static final class C11023a extends C12737d {

                /* renamed from: h */
                /* synthetic */ Object f17055h;

                /* renamed from: i */
                int f17056i;

                /* renamed from: j */
                final /* synthetic */ C11022a f17057j;

                /* renamed from: k */
                Object f17058k;

                /* renamed from: l */
                Object f17059l;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C11023a(C11022a aVar, C12074d dVar) {
                    super(dVar);
                    this.f17057j = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f17055h = obj;
                    this.f17056i |= Integer.MIN_VALUE;
                    return this.f17057j.emit(null, this);
                }
            }

            public C11022a(C10967g gVar, C13088o oVar) {
                this.f17053b = gVar;
                this.f17054c = oVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof p314bg.C11020s.C11021a.C11022a.C11023a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    bg.s$a$a$a r0 = (p314bg.C11020s.C11021a.C11022a.C11023a) r0
                    int r1 = r0.f17056i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f17056i = r1
                    goto L_0x0018
                L_0x0013:
                    bg.s$a$a$a r0 = new bg.s$a$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f17055h
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.f17056i
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    p336ef.C11910n.m25701b(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.f17059l
                    bg.g r6 = (p314bg.C10967g) r6
                    java.lang.Object r2 = r0.f17058k
                    p336ef.C11910n.m25701b(r7)
                    goto L_0x005c
                L_0x003e:
                    p336ef.C11910n.m25701b(r7)
                    bg.g r7 = r5.f17053b
                    of.o r2 = r5.f17054c
                    r0.f17058k = r6
                    r0.f17059l = r7
                    r0.f17056i = r4
                    r4 = 6
                    kotlin.jvm.internal.C12773m.m28630c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.C12773m.m28630c(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.f17058k = r7
                    r0.f17059l = r7
                    r0.f17056i = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    ef.v r6 = p336ef.C11921v.f18618a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: p314bg.C11020s.C11021a.C11022a.emit(java.lang.Object, hf.d):java.lang.Object");
            }
        }

        public C11021a(C10962f fVar, C13088o oVar) {
            this.f17051b = fVar;
            this.f17052c = oVar;
        }

        public Object collect(C10967g gVar, C12074d dVar) {
            Object collect = this.f17051b.collect(new C11022a(gVar, this.f17052c), dVar);
            if (collect == C12150d.m26492c()) {
                return collect;
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: a */
    public static final <T> C10962f<T> m23672a(C10962f<? extends T> fVar, C13088o<? super T, ? super C12074d<? super C11921v>, ? extends Object> oVar) {
        return new C11021a(fVar, oVar);
    }
}
