package androidx.core.p004os;

import android.os.Handler;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.core.os.HandlerKt */
/* compiled from: Handler.kt */
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j, Object obj, C13074a<C11921v> aVar) {
        C12775o.m28639i(handler, "<this>");
        C12775o.m28639i(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j, Object obj, C13074a aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        C12775o.m28639i(handler, "<this>");
        C12775o.m28639i(aVar, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(aVar);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j, Object obj, C13074a<C11921v> aVar) {
        C12775o.m28639i(handler, "<this>");
        C12775o.m28639i(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j, Object obj, C13074a aVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            obj = null;
        }
        C12775o.m28639i(handler, "<this>");
        C12775o.m28639i(aVar, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(aVar);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j);
        }
        return handlerKt$postDelayed$runnable$1;
    }
}
