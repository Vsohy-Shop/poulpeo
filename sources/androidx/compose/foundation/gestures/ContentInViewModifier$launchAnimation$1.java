package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.p002ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p336ef.C11907m;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13934b2;
import p466yf.C13995l0;
import p466yf.C14054y1;

@C12739f(mo50609c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", mo50610f = "ContentInViewModifier.kt", mo50611l = {193}, mo50612m = "invokeSuspend")
/* compiled from: ContentInViewModifier.kt */
final class ContentInViewModifier$launchAnimation$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    @C12739f(mo50609c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", mo50610f = "ContentInViewModifier.kt", mo50611l = {198}, mo50612m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1 */
    /* compiled from: ContentInViewModifier.kt */
    static final class C03981 extends C12746l implements C13088o<ScrollScope, C12074d<? super C11921v>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C03981 r0 = new C03981(contentInViewModifier, n, dVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(ScrollScope scrollScope, C12074d<? super C11921v> dVar) {
            return ((C03981) create(scrollScope, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.label;
            if (i == 0) {
                C11910n.m25701b(obj);
                final ScrollScope scrollScope = (ScrollScope) this.L$0;
                contentInViewModifier.animationState.setValue(contentInViewModifier.calculateScrollDelta());
                UpdatableAnimationState access$getAnimationState$p = contentInViewModifier.animationState;
                final ContentInViewModifier contentInViewModifier = contentInViewModifier;
                final C14054y1 y1Var = n;
                C03991 r3 = new Function1<Float, C11921v>() {
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke(((Number) obj).floatValue());
                        return C11921v.f18618a;
                    }

                    public final void invoke(float f) {
                        float f2 = contentInViewModifier.reverseDirection ? 1.0f : -1.0f;
                        float scrollBy = f2 * scrollScope.scrollBy(f2 * f);
                        if (scrollBy < f) {
                            C14054y1 y1Var = y1Var;
                            C13944d2.m32239f(y1Var, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f + ')', (Throwable) null, 2, (Object) null);
                        }
                    }
                };
                final ContentInViewModifier contentInViewModifier2 = contentInViewModifier;
                C04002 r7 = new C13074a<C11921v>() {
                    public final void invoke() {
                        boolean z;
                        boolean z2;
                        BringIntoViewRequestPriorityQueue access$getBringIntoViewRequests$p = contentInViewModifier2.bringIntoViewRequests;
                        ContentInViewModifier contentInViewModifier = contentInViewModifier2;
                        while (true) {
                            z = true;
                            if (access$getBringIntoViewRequests$p.requests.isNotEmpty()) {
                                Rect invoke = ((ContentInViewModifier.Request) access$getBringIntoViewRequests$p.requests.last()).getCurrentBounds().invoke();
                                if (invoke == null) {
                                    z2 = true;
                                } else {
                                    z2 = ContentInViewModifier.m33039isMaxVisibleO0kMr_c$default(contentInViewModifier, invoke, 0, 1, (Object) null);
                                }
                                if (!z2) {
                                    break;
                                }
                                ((ContentInViewModifier.Request) access$getBringIntoViewRequests$p.requests.removeAt(access$getBringIntoViewRequests$p.requests.getSize() - 1)).getContinuation().resumeWith(C11907m.m25696a(C11921v.f18618a));
                            } else {
                                break;
                            }
                        }
                        if (contentInViewModifier2.trackingFocusedChild) {
                            Rect access$getFocusedChildBounds = contentInViewModifier2.getFocusedChildBounds();
                            if (access$getFocusedChildBounds == null || !ContentInViewModifier.m33039isMaxVisibleO0kMr_c$default(contentInViewModifier2, access$getFocusedChildBounds, 0, 1, (Object) null)) {
                                z = false;
                            }
                            if (z) {
                                contentInViewModifier2.trackingFocusedChild = false;
                            }
                        }
                        contentInViewModifier2.animationState.setValue(contentInViewModifier2.calculateScrollDelta());
                    }
                };
                this.label = 1;
                if (access$getAnimationState$p.animateToZero(r3, r7, this) == c) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, C12074d<? super ContentInViewModifier$launchAnimation$1> dVar) {
        super(2, dVar);
        this.this$0 = contentInViewModifier;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, dVar);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    public final Object invokeSuspend(Object obj) {
        CancellationException cancellationException;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final C14054y1 n = C13934b2.m32226n(((C13995l0) this.L$0).getCoroutineContext());
            this.this$0.isAnimationRunning = true;
            ScrollableState access$getScrollState$p = this.this$0.scrollState;
            final ContentInViewModifier contentInViewModifier = this.this$0;
            C03981 r7 = new C03981((C12074d<? super C03981>) null);
            this.label = 1;
            if (ScrollableState.scroll$default(access$getScrollState$p, (MutatePriority) null, r7, this, 1, (Object) null) == c) {
                return c;
            }
        } else if (i == 1) {
            try {
                C11910n.m25701b(obj);
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            } catch (Throwable th) {
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
                this.this$0.trackingFocusedChild = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
        this.this$0.isAnimationRunning = false;
        this.this$0.bringIntoViewRequests.cancelAndRemoveAll((Throwable) null);
        this.this$0.trackingFocusedChild = false;
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((ContentInViewModifier$launchAnimation$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
