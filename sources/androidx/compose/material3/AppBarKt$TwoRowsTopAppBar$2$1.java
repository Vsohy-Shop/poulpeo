package androidx.compose.material3;

import kotlin.jvm.internal.C12757e0;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: AppBar.kt */
final class AppBarKt$TwoRowsTopAppBar$2$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ C12757e0 $maxHeightPx;
    final /* synthetic */ C12757e0 $pinnedHeightPx;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$TwoRowsTopAppBar$2$1(TopAppBarScrollBehavior topAppBarScrollBehavior, C12757e0 e0Var, C12757e0 e0Var2) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$pinnedHeightPx = e0Var;
        this.$maxHeightPx = e0Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getState();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r4 = this;
            androidx.compose.material3.TopAppBarScrollBehavior r0 = r4.$scrollBehavior
            r1 = 0
            if (r0 == 0) goto L_0x0014
            androidx.compose.material3.TopAppBarState r0 = r0.getState()
            if (r0 == 0) goto L_0x0014
            float r0 = r0.getHeightOffsetLimit()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            kotlin.jvm.internal.e0 r2 = r4.$pinnedHeightPx
            float r2 = r2.f20408b
            kotlin.jvm.internal.e0 r3 = r4.$maxHeightPx
            float r3 = r3.f20408b
            float r2 = r2 - r3
            boolean r0 = kotlin.jvm.internal.C12775o.m28632b(r0, r2)
            if (r0 != 0) goto L_0x003b
            androidx.compose.material3.TopAppBarScrollBehavior r0 = r4.$scrollBehavior
            if (r0 == 0) goto L_0x002c
            androidx.compose.material3.TopAppBarState r1 = r0.getState()
        L_0x002c:
            if (r1 != 0) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            kotlin.jvm.internal.e0 r0 = r4.$pinnedHeightPx
            float r0 = r0.f20408b
            kotlin.jvm.internal.e0 r2 = r4.$maxHeightPx
            float r2 = r2.f20408b
            float r0 = r0 - r2
            r1.setHeightOffsetLimit(r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$2$1.invoke():void");
    }
}
