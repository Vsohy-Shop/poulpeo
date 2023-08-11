package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.runtime.collection.MutableVector;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11921v;
import p436tf.C13528f;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,137:1\n1182#2:138\n1161#2,2:139\n53#3:141\n523#3:142\n523#3:143\n492#3,11:144\n53#3:155\n523#3:156\n48#3:157\n664#3,2:158\n523#3:160\n13579#4,2:161\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n72#1:141\n73#1:142\n91#1:143\n107#1:144,11\n111#1:155\n112#1:156\n121#1:157\n132#1:158,2\n132#1:160\n132#1:161,2\n*E\n"})
/* compiled from: BringIntoViewRequestPriorityQueue.kt */
public final class BringIntoViewRequestPriorityQueue {
    /* access modifiers changed from: private */
    public final MutableVector<ContentInViewModifier.Request> requests = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        C14002n[] nVarArr = new C14002n[size];
        for (int i = 0; i < size; i++) {
            nVarArr[i] = ((ContentInViewModifier.Request) mutableVector.getContent()[i]).getContinuation();
        }
        for (int i2 = 0; i2 < size; i2++) {
            nVarArr[i2].mo49530j(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(ContentInViewModifier.Request request) {
        C12775o.m28639i(request, "request");
        Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            C14002n<C11921v> continuation = request.getContinuation();
            C11907m.C11908a aVar = C11907m.f18600b;
            continuation.resumeWith(C11907m.m25696a(C11921v.f18618a));
            return false;
        }
        request.getContinuation().mo49526f(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        C13528f fVar = new C13528f(0, this.requests.getSize() - 1);
        int j = fVar.mo53147j();
        int k = fVar.mo53148k();
        if (j <= k) {
            while (true) {
                Rect invoke2 = ((ContentInViewModifier.Request) this.requests.getContent()[k]).getCurrentBounds().invoke();
                if (invoke2 != null) {
                    Rect intersect = invoke.intersect(invoke2);
                    if (C12775o.m28634d(intersect, invoke)) {
                        this.requests.add(k + 1, request);
                        return true;
                    } else if (!C12775o.m28634d(intersect, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= k) {
                            while (true) {
                                ((ContentInViewModifier.Request) this.requests.getContent()[k]).getContinuation().mo49530j(cancellationException);
                                if (size == k) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (k == j) {
                    break;
                }
                k--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(Function1<? super Rect, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        MutableVector access$getRequests$p = this.requests;
        int size = access$getRequests$p.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = access$getRequests$p.getContent();
            do {
                function1.invoke(((ContentInViewModifier.Request) content[i]).getCurrentBounds().invoke());
                i--;
            } while (i >= 0);
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        C13528f fVar = new C13528f(0, this.requests.getSize() - 1);
        int j = fVar.mo53147j();
        int k = fVar.mo53148k();
        if (j <= k) {
            while (true) {
                ((ContentInViewModifier.Request) this.requests.getContent()[j]).getContinuation().resumeWith(C11907m.m25696a(C11921v.f18618a));
                if (j == k) {
                    break;
                }
                j++;
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1<? super Rect, Boolean> function1) {
        C12775o.m28639i(function1, "block");
        while (this.requests.isNotEmpty() && function1.invoke(((ContentInViewModifier.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            ((ContentInViewModifier.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(C11907m.m25696a(C11921v.f18618a));
        }
    }
}
