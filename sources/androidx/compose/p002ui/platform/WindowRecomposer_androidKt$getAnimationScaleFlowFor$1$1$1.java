package androidx.compose.p002ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p308ag.C10894d;
import p314bg.C10967g;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@C12739f(mo50609c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", mo50610f = "WindowRecomposer.android.kt", mo50611l = {115, 121}, mo50612m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 */
/* compiled from: WindowRecomposer.android.kt */
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends C12746l implements C13088o<C10967g<? super Float>, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ C10894d<C11921v> $channel;
    final /* synthetic */ C1111x23580bd9 $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(ContentResolver contentResolver, Uri uri, C1111x23580bd9 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1, C10894d<C11921v> dVar, Context context, C12074d<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> dVar2) {
        super(2, dVar2);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1;
        this.$channel = dVar;
        this.$applicationContext = context;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, dVar);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = obj;
        return windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }

    public final Object invoke(C10967g<? super Float> gVar, C12074d<? super C11921v> dVar) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1) create(gVar, dVar)).invokeSuspend(C11921v.f18618a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A[Catch:{ all -> 0x008f }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[Catch:{ all -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r9.L$1
            ag.f r1 = (p308ag.C10897f) r1
            java.lang.Object r4 = r9.L$0
            bg.g r4 = (p314bg.C10967g) r4
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x0091 }
            r10 = r4
            goto L_0x0048
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0023:
            java.lang.Object r1 = r9.L$1
            ag.f r1 = (p308ag.C10897f) r1
            java.lang.Object r4 = r9.L$0
            bg.g r4 = (p314bg.C10967g) r4
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x0091 }
            r5 = r4
            r4 = r9
            goto L_0x0059
        L_0x0031:
            p336ef.C11910n.m25701b(r10)
            java.lang.Object r10 = r9.L$0
            bg.g r10 = (p314bg.C10967g) r10
            android.content.ContentResolver r1 = r9.$resolver
            android.net.Uri r4 = r9.$animationScaleUri
            r5 = 0
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r6 = r9.$contentObserver
            r1.registerContentObserver(r4, r5, r6)
            ag.d<ef.v> r1 = r9.$channel     // Catch:{ all -> 0x0091 }
            ag.f r1 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x0048:
            r4 = r9
        L_0x0049:
            r4.L$0 = r10     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r3     // Catch:{ all -> 0x008f }
            java.lang.Object r5 = r1.mo45899a(r4)     // Catch:{ all -> 0x008f }
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r8 = r5
            r5 = r10
            r10 = r8
        L_0x0059:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x008f }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x008f }
            if (r10 == 0) goto L_0x0085
            r1.next()     // Catch:{ all -> 0x008f }
            android.content.Context r10 = r4.$applicationContext     // Catch:{ all -> 0x008f }
            android.content.ContentResolver r10 = r10.getContentResolver()     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "animator_duration_scale"
            r7 = 1065353216(0x3f800000, float:1.0)
            float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.C12735b.m28559b(r10)     // Catch:{ all -> 0x008f }
            r4.L$0 = r5     // Catch:{ all -> 0x008f }
            r4.L$1 = r1     // Catch:{ all -> 0x008f }
            r4.label = r2     // Catch:{ all -> 0x008f }
            java.lang.Object r10 = r5.emit(r10, r4)     // Catch:{ all -> 0x008f }
            if (r10 != r0) goto L_0x0083
            return r0
        L_0x0083:
            r10 = r5
            goto L_0x0049
        L_0x0085:
            android.content.ContentResolver r10 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r0 = r4.$contentObserver
            r10.unregisterContentObserver(r0)
            ef.v r10 = p336ef.C11921v.f18618a
            return r10
        L_0x008f:
            r10 = move-exception
            goto L_0x0093
        L_0x0091:
            r10 = move-exception
            r4 = r9
        L_0x0093:
            android.content.ContentResolver r0 = r4.$resolver
            androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 r1 = r4.$contentObserver
            r0.unregisterContentObserver(r1)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
