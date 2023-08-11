package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11907m;
import p355hf.C12074d;
import p356hg.C12088a;
import p356hg.C12096c;
import p466yf.C14002n;

@Stable
/* compiled from: SnackbarHost.kt */
public final class SnackbarHostState {
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);
    private final C12088a mutex = C12096c.m26296b(false, 1, (Object) null);

    /* compiled from: SnackbarHost.kt */
    private static final class SnackbarDataImpl implements SnackbarData {
        private final C14002n<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, C14002n<? super SnackbarResult> nVar) {
            C12775o.m28639i(snackbarVisuals, "visuals");
            C12775o.m28639i(nVar, "continuation");
            this.visuals = snackbarVisuals;
            this.continuation = nVar;
        }

        public void dismiss() {
            if (this.continuation.mo49522a()) {
                C14002n<SnackbarResult> nVar = this.continuation;
                C11907m.C11908a aVar = C11907m.f18600b;
                nVar.resumeWith(C11907m.m25696a(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C12775o.m28634d(C12764h0.m28586b(SnackbarDataImpl.class), C12764h0.m28586b(obj.getClass()))) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            if (C12775o.m28634d(getVisuals(), snackbarDataImpl.getVisuals()) && C12775o.m28634d(this.continuation, snackbarDataImpl.continuation)) {
                return true;
            }
            return false;
        }

        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }

        public void performAction() {
            if (this.continuation.mo49522a()) {
                C14002n<SnackbarResult> nVar = this.continuation;
                C11907m.C11908a aVar = C11907m.f18600b;
                nVar.resumeWith(C11907m.m25696a(SnackbarResult.ActionPerformed));
            }
        }
    }

    /* compiled from: SnackbarHost.kt */
    private static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            C12775o.m28639i(str, "message");
            C12775o.m28639i(snackbarDuration, TypedValues.TransitionType.S_DURATION);
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C12775o.m28634d(C12764h0.m28586b(SnackbarVisualsImpl.class), C12764h0.m28586b(obj.getClass()))) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            if (C12775o.m28634d(getMessage(), snackbarVisualsImpl.getMessage()) && C12775o.m28634d(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration()) {
                return true;
            }
            return false;
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

        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int i;
            int hashCode = getMessage().hashCode() * 31;
            String actionLabel2 = getActionLabel();
            if (actionLabel2 != null) {
                i = actionLabel2.hashCode();
            } else {
                i = 0;
            }
            return ((((hashCode + i) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, C12074d dVar, int i, Object obj) {
        SnackbarDuration snackbarDuration2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            if (str3 == null) {
                snackbarDuration2 = SnackbarDuration.Short;
            } else {
                snackbarDuration2 = SnackbarDuration.Indefinite;
            }
            snackbarDuration = snackbarDuration2;
        }
        return snackbarHostState.showSnackbar(str, str3, z2, snackbarDuration, dVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, C12074d<? super SnackbarResult> dVar) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[Catch:{ all -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00a1=Splitter:B:28:0x00a1, B:34:0x00ad=Splitter:B:34:0x00ad} */
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r9, p355hf.C12074d<? super androidx.compose.material3.SnackbarResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r9 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r9 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r9
            java.lang.Object r9 = r0.L$2
            hg.a r9 = (p356hg.C12088a) r9
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            p336ef.C11910n.m25701b(r10)     // Catch:{ all -> 0x003d }
            goto L_0x00a1
        L_0x003d:
            r10 = move-exception
            goto L_0x00ad
        L_0x0040:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0048:
            java.lang.Object r9 = r0.L$2
            hg.a r9 = (p356hg.C12088a) r9
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            p336ef.C11910n.m25701b(r10)
            r10 = r9
            r9 = r2
            goto L_0x006f
        L_0x005a:
            p336ef.C11910n.m25701b(r10)
            hg.a r10 = r8.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r10.mo49516a(r5, r0)
            if (r2 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r6 = r8
        L_0x006f:
            r0.L$0 = r6     // Catch:{ all -> 0x00a8 }
            r0.L$1 = r9     // Catch:{ all -> 0x00a8 }
            r0.L$2 = r10     // Catch:{ all -> 0x00a8 }
            r0.L$3 = r0     // Catch:{ all -> 0x00a8 }
            r0.label = r3     // Catch:{ all -> 0x00a8 }
            yf.o r2 = new yf.o     // Catch:{ all -> 0x00a8 }
            hf.d r3 = p362if.C12147c.m26491b(r0)     // Catch:{ all -> 0x00a8 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00a8 }
            r2.mo53786B()     // Catch:{ all -> 0x00a8 }
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch:{ all -> 0x00a8 }
            r3.<init>(r9, r2)     // Catch:{ all -> 0x00a8 }
            r6.setCurrentSnackbarData(r3)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r9 = r2.mo53797y()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r2 = p362if.C12150d.m26492c()     // Catch:{ all -> 0x00a8 }
            if (r9 != r2) goto L_0x009a
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ all -> 0x00a8 }
        L_0x009a:
            if (r9 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00a1:
            r0.setCurrentSnackbarData(r5)     // Catch:{ all -> 0x00b1 }
            r9.mo49519f(r5)
            return r10
        L_0x00a8:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00ad:
            r0.setCurrentSnackbarData(r5)     // Catch:{ all -> 0x00b1 }
            throw r10     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r10 = move-exception
            r9.mo49519f(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, hf.d):java.lang.Object");
    }
}
