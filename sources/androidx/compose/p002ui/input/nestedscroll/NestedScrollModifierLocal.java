package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.modifier.ProvidableModifierLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nNestedScrollModifierLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,100:1\n76#2:101\n102#2,2:102\n*S KotlinDebug\n*F\n+ 1 NestedScrollModifierLocal.kt\nandroidx/compose/ui/input/nestedscroll/NestedScrollModifierLocal\n*L\n45#1:101\n45#1:102,2\n*E\n"})
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal */
/* compiled from: NestedScrollModifierLocal.kt */
public final class NestedScrollModifierLocal implements ModifierLocalConsumer, ModifierLocalProvider<NestedScrollModifierLocal>, NestedScrollConnection {
    private final NestedScrollConnection connection;
    private final NestedScrollDispatcher dispatcher;
    private final MutableState parent$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((Object) null, (SnapshotMutationPolicy) null, 2, (Object) null);

    public NestedScrollModifierLocal(NestedScrollDispatcher nestedScrollDispatcher, NestedScrollConnection nestedScrollConnection) {
        C12775o.m28639i(nestedScrollDispatcher, "dispatcher");
        C12775o.m28639i(nestedScrollConnection, "connection");
        this.dispatcher = nestedScrollDispatcher;
        this.connection = nestedScrollConnection;
        nestedScrollDispatcher.setCalculateNestedScrollScope$ui_release(new C13074a<C13995l0>(this) {
            final /* synthetic */ NestedScrollModifierLocal this$0;

            {
                this.this$0 = r1;
            }

            public final C13995l0 invoke() {
                return this.this$0.getNestedCoroutineScope();
            }
        });
    }

    /* access modifiers changed from: private */
    public final C13995l0 getNestedCoroutineScope() {
        C13995l0 l0Var;
        NestedScrollModifierLocal parent = getParent();
        if ((parent != null && (l0Var = parent.getNestedCoroutineScope()) != null) || (l0Var = this.dispatcher.getOriginNestedScrollScope$ui_release()) != null) {
            return l0Var;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollModifierLocal getParent() {
        return (NestedScrollModifierLocal) this.parent$delegate.getValue();
    }

    private final void setParent(NestedScrollModifierLocal nestedScrollModifierLocal) {
        this.parent$delegate.setValue(nestedScrollModifierLocal);
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public ProvidableModifierLocal<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.getModifierLocalNestedScroll();
    }

    public NestedScrollModifierLocal getValue() {
        return this;
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        setParent((NestedScrollModifierLocal) modifierLocalReadScope.getCurrent(NestedScrollModifierLocalKt.getModifierLocalNestedScroll()));
        this.dispatcher.setParent$ui_release(getParent());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m37056onPostFlingRZ2iAVY(long r16, long r18, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r9 = p362if.C12150d.m26492c()
            int r3 = r2.label
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 == r4) goto L_0x0039
            if (r3 != r10) goto L_0x0031
            long r2 = r2.J$0
            p336ef.C11910n.m25701b(r1)
            goto L_0x008c
        L_0x0031:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0039:
            long r3 = r2.J$1
            long r5 = r2.J$0
            java.lang.Object r7 = r2.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r7 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal) r7
            p336ef.C11910n.m25701b(r1)
            r13 = r3
            r11 = r5
            goto L_0x0065
        L_0x0047:
            p336ef.C11910n.m25701b(r1)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r3 = r0.connection
            r2.L$0 = r0
            r11 = r16
            r2.J$0 = r11
            r13 = r18
            r2.J$1 = r13
            r2.label = r4
            r4 = r16
            r6 = r18
            r8 = r2
            java.lang.Object r1 = r3.m37044onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L_0x0064
            return r9
        L_0x0064:
            r7 = r0
        L_0x0065:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.p002ui.unit.Velocity) r1
            long r4 = r1.m38702unboximpl()
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r3 = r7.getParent()
            if (r3 == 0) goto L_0x0094
            long r6 = androidx.compose.p002ui.unit.Velocity.m38697plusAH228Gc(r11, r4)
            long r11 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r13, r4)
            r1 = 0
            r2.L$0 = r1
            r2.J$0 = r4
            r2.label = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.m37056onPostFlingRZ2iAVY(r4, r6, r8)
            if (r1 != r9) goto L_0x008b
            return r9
        L_0x008b:
            r2 = r13
        L_0x008c:
            androidx.compose.ui.unit.Velocity r1 = (androidx.compose.p002ui.unit.Velocity) r1
            long r4 = r1.m38702unboximpl()
            r13 = r2
            goto L_0x009b
        L_0x0094:
            r13 = r4
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.p002ui.unit.Velocity.Companion
            long r4 = r1.m38704getZero9UxMQ8M()
        L_0x009b:
            long r1 = androidx.compose.p002ui.unit.Velocity.m38697plusAH228Gc(r13, r4)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal.m37056onPostFlingRZ2iAVY(long, long, hf.d):java.lang.Object");
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long m37057onPostScrollDzOQY0M(long j, long j2, int i) {
        long j3;
        long r0 = this.connection.m37045onPostScrollDzOQY0M(j, j2, i);
        NestedScrollModifierLocal parent = getParent();
        if (parent != null) {
            j3 = parent.m37057onPostScrollDzOQY0M(Offset.m35427plusMKHz9U(j, r0), Offset.m35426minusMKHz9U(j2, r0), i);
        } else {
            j3 = Offset.Companion.m35438getZeroF1C5BW0();
        }
        return Offset.m35427plusMKHz9U(r0, j3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m37058onPreFlingQWom1Mo(long r9, p355hf.C12074d<? super androidx.compose.p002ui.unit.Velocity> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPreFling$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            long r9 = r0.J$0
            p336ef.C11910n.m25701b(r11)
            goto L_0x007c
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            long r9 = r0.J$0
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r2 = (androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal) r2
            p336ef.C11910n.m25701b(r11)
            goto L_0x0057
        L_0x0040:
            p336ef.C11910n.m25701b(r11)
            androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal r11 = r8.getParent()
            if (r11 == 0) goto L_0x005e
            r0.L$0 = r8
            r0.J$0 = r9
            r0.label = r4
            java.lang.Object r11 = r11.m37058onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L_0x0056
            return r1
        L_0x0056:
            r2 = r8
        L_0x0057:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p002ui.unit.Velocity) r11
            long r4 = r11.m38702unboximpl()
            goto L_0x0065
        L_0x005e:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.p002ui.unit.Velocity.Companion
            long r4 = r11.m38704getZero9UxMQ8M()
            r2 = r8
        L_0x0065:
            r6 = r9
            r9 = r4
            r4 = r6
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r2.connection
            long r4 = androidx.compose.p002ui.unit.Velocity.m38696minusAH228Gc(r4, r9)
            r2 = 0
            r0.L$0 = r2
            r0.J$0 = r9
            r0.label = r3
            java.lang.Object r11 = r11.m37046onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L_0x007c
            return r1
        L_0x007c:
            androidx.compose.ui.unit.Velocity r11 = (androidx.compose.p002ui.unit.Velocity) r11
            long r0 = r11.m38702unboximpl()
            long r9 = androidx.compose.p002ui.unit.Velocity.m38697plusAH228Gc(r9, r0)
            androidx.compose.ui.unit.Velocity r9 = androidx.compose.p002ui.unit.Velocity.m38684boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.nestedscroll.NestedScrollModifierLocal.m37058onPreFlingQWom1Mo(long, hf.d):java.lang.Object");
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long m37059onPreScrollOzD1aCk(long j, int i) {
        long j2;
        NestedScrollModifierLocal parent = getParent();
        if (parent != null) {
            j2 = parent.m37059onPreScrollOzD1aCk(j, i);
        } else {
            j2 = Offset.Companion.m35438getZeroF1C5BW0();
        }
        return Offset.m35427plusMKHz9U(j2, this.connection.m37047onPreScrollOzD1aCk(Offset.m35426minusMKHz9U(j, j2), i));
    }
}
