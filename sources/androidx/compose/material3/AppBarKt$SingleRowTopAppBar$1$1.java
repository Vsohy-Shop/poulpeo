package androidx.compose.material3;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: AppBar.kt */
final class AppBarKt$SingleRowTopAppBar$1$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ float $heightOffsetLimit;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppBarKt$SingleRowTopAppBar$1$1(TopAppBarScrollBehavior topAppBarScrollBehavior, float f) {
        super(0);
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$heightOffsetLimit = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getState();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r3 = this;
            androidx.compose.material3.TopAppBarScrollBehavior r0 = r3.$scrollBehavior
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
            float r2 = r3.$heightOffsetLimit
            boolean r0 = kotlin.jvm.internal.C12775o.m28632b(r0, r2)
            if (r0 != 0) goto L_0x002d
            androidx.compose.material3.TopAppBarScrollBehavior r0 = r3.$scrollBehavior
            if (r0 == 0) goto L_0x0025
            androidx.compose.material3.TopAppBarState r1 = r0.getState()
        L_0x0025:
            if (r1 != 0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            float r0 = r3.$heightOffsetLimit
            r1.setHeightOffsetLimit(r0)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$1$1.invoke():void");
    }
}
