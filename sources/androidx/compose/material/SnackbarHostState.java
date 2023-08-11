package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p355hf.C12074d;
import p356hg.C12088a;
import p356hg.C12096c;
import p466yf.C14002n;

@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,373:1\n76#2:374\n102#2,2:375\n107#3,8:377\n116#3:396\n115#3:397\n314#4,11:385\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n72#1:374\n72#1:375,2\n102#1:377,8\n102#1:396\n102#1:397\n104#1:385,11\n*E\n"})
@Stable
/* compiled from: SnackbarHost.kt */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final C12088a mutex = C12096c.m26296b(false, 1, (Object) null);

    @Stable
    /* compiled from: SnackbarHost.kt */
    private static final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final C14002n<SnackbarResult> continuation;
        private final SnackbarDuration duration;
        private final String message;

        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, C14002n<? super SnackbarResult> nVar) {
            C12775o.m28639i(str, "message");
            C12775o.m28639i(snackbarDuration, TypedValues.TransitionType.S_DURATION);
            C12775o.m28639i(nVar, "continuation");
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = nVar;
        }

        public void dismiss() {
            if (this.continuation.mo49522a()) {
                C14002n<SnackbarResult> nVar = this.continuation;
                C11907m.C11908a aVar = C11907m.f18600b;
                nVar.resumeWith(C11907m.m25696a(SnackbarResult.Dismissed));
            }
        }

        public String getActionLabel() {
            return this.actionLabel;
        }

        public SnackbarDuration getDuration() {
            return this.duration;
        }

        public String getMessage() {
            return this.message;
        }

        public void performAction() {
            if (this.continuation.mo49522a()) {
                C14002n<SnackbarResult> nVar = this.continuation;
                C11907m.C11908a aVar = C11907m.f18600b;
                nVar.resumeWith(C11907m.m25696a(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, C12074d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, dVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.material.SnackbarDuration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c8=Splitter:B:34:0x00c8, B:28:0x00bf=Splitter:B:28:0x00bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showSnackbar(java.lang.String r9, java.lang.String r10, androidx.compose.material.SnackbarDuration r11, p355hf.C12074d<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x006f
            if (r2 == r4) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            java.lang.Object r9 = r0.L$5
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r9 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r9
            java.lang.Object r9 = r0.L$4
            hg.a r9 = (p356hg.C12088a) r9
            java.lang.Object r10 = r0.L$3
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$0
            androidx.compose.material.SnackbarHostState r10 = (androidx.compose.material.SnackbarHostState) r10
            p336ef.C11910n.m25701b(r12)     // Catch:{ all -> 0x0046 }
            goto L_0x00bf
        L_0x0046:
            r11 = move-exception
            goto L_0x00c8
        L_0x0049:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0051:
            java.lang.Object r9 = r0.L$4
            hg.a r9 = (p356hg.C12088a) r9
            java.lang.Object r10 = r0.L$3
            r11 = r10
            androidx.compose.material.SnackbarDuration r11 = (androidx.compose.material.SnackbarDuration) r11
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.SnackbarHostState r6 = (androidx.compose.material.SnackbarHostState) r6
            p336ef.C11910n.m25701b(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L_0x008a
        L_0x006f:
            p336ef.C11910n.m25701b(r12)
            hg.a r12 = r8.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.label = r4
            java.lang.Object r2 = r12.mo49516a(r5, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r2 = r11
            r11 = r10
            r10 = r8
        L_0x008a:
            r0.L$0 = r10     // Catch:{ all -> 0x00c6 }
            r0.L$1 = r9     // Catch:{ all -> 0x00c6 }
            r0.L$2 = r11     // Catch:{ all -> 0x00c6 }
            r0.L$3 = r2     // Catch:{ all -> 0x00c6 }
            r0.L$4 = r12     // Catch:{ all -> 0x00c6 }
            r0.L$5 = r0     // Catch:{ all -> 0x00c6 }
            r0.label = r3     // Catch:{ all -> 0x00c6 }
            yf.o r3 = new yf.o     // Catch:{ all -> 0x00c6 }
            hf.d r6 = p362if.C12147c.m26491b(r0)     // Catch:{ all -> 0x00c6 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00c6 }
            r3.mo53786B()     // Catch:{ all -> 0x00c6 }
            androidx.compose.material.SnackbarHostState$SnackbarDataImpl r4 = new androidx.compose.material.SnackbarHostState$SnackbarDataImpl     // Catch:{ all -> 0x00c6 }
            r4.<init>(r9, r11, r2, r3)     // Catch:{ all -> 0x00c6 }
            r10.setCurrentSnackbarData(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r3.mo53797y()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r11 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x00c6 }
            if (r9 != r11) goto L_0x00b9
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00b9:
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r7 = r12
            r12 = r9
            r9 = r7
        L_0x00bf:
            r10.setCurrentSnackbarData(r5)     // Catch:{ all -> 0x00cc }
            r9.mo49519f(r5)
            return r12
        L_0x00c6:
            r11 = move-exception
            r9 = r12
        L_0x00c8:
            r10.setCurrentSnackbarData(r5)     // Catch:{ all -> 0x00cc }
            throw r11     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            r9.mo49519f(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, hf.d):java.lang.Object");
    }
}
