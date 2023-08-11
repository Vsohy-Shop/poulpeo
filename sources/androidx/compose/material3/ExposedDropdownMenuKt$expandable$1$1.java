package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", mo50610f = "ExposedDropdownMenu.kt", mo50611l = {530}, mo50612m = "invokeSuspend")
/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuKt$expandable$1$1 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
    final /* synthetic */ C13074a<C11921v> $onExpandedChange;
    private /* synthetic */ Object L$0;
    int label;

    @C12739f(mo50609c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1", mo50610f = "ExposedDropdownMenu.kt", mo50611l = {531}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1$1 */
    /* compiled from: ExposedDropdownMenu.kt */
    static final class C08601 extends C12746l implements C13088o<PointerInputScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C08601 r0 = new C08601(aVar, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
            return ((C08601) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                final C13074a<C11921v> aVar = aVar;
                C08611 r1 = new C13088o<C13995l0, C12074d<? super C11921v>, Object>((C12074d<? super C08611>) null) {
                    int label;

                    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        ExposedDropdownMenuKt$expandable$1$1(C13074a<C11921v> aVar, C12074d<? super ExposedDropdownMenuKt$expandable$1$1> dVar) {
                            super(2, dVar);
                            this.$onExpandedChange = aVar;
                        }

                        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                            ExposedDropdownMenuKt$expandable$1$1 exposedDropdownMenuKt$expandable$1$1 = new ExposedDropdownMenuKt$expandable$1$1(this.$onExpandedChange, dVar);
                            exposedDropdownMenuKt$expandable$1$1.L$0 = obj;
                            return exposedDropdownMenuKt$expandable$1$1;
                        }

                        public final Object invoke(PointerInputScope pointerInputScope, C12074d<? super C11921v> dVar) {
                            return ((ExposedDropdownMenuKt$expandable$1$1) create(pointerInputScope, dVar)).invokeSuspend(C11921v.f18618a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            Object c = C12150d.m26492c();
                            int i = this.label;
                            if (i == 0) {
                                C11910n.m25701b(obj);
                                final C13074a<C11921v> aVar = this.$onExpandedChange;
                                C08601 r1 = new C08601((C12074d<? super C08601>) null);
                                this.label = 1;
                                if (ForEachGestureKt.forEachGesture((PointerInputScope) this.L$0, r1, this) == c) {
                                    return c;
                                }
                            } else if (i == 1) {
                                C11910n.m25701b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return C11921v.f18618a;
                        }
                    }
