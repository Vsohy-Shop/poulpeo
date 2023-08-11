package androidx.compose.runtime;

import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10962f;
import p314bg.C10971h;
import p314bg.C10972h0;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1747#2,3:175\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n173#1:175,3\n*E\n"})
/* compiled from: SnapshotFlow.kt */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    public static final <T> State<T> collectAsState(C10972h0<? extends T> h0Var, C12079g gVar, Composer composer, int i, int i2) {
        C12775o.m28639i(h0Var, "<this>");
        composer.startReplaceableGroup(-1439883919);
        if ((i2 & 1) != 0) {
            gVar = C12085h.f18916b;
        }
        C12079g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(h0Var, h0Var.getValue(), gVar2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    /* access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            if (!set.isEmpty()) {
                for (T contains : set) {
                    if (set2.contains(contains)) {
                        return true;
                    }
                }
            }
        } else if (!set2.isEmpty()) {
            for (T contains2 : set2) {
                if (set.contains(contains2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final <T> C10962f<T> snapshotFlow(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "block");
        return C10971h.m23608o(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, (C12074d<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1>) null));
    }

    @Composable
    public static final <T extends R, R> State<R> collectAsState(C10962f<? extends T> fVar, R r, C12079g gVar, Composer composer, int i, int i2) {
        C12775o.m28639i(fVar, "<this>");
        composer.startReplaceableGroup(-606625098);
        if ((i2 & 2) != 0) {
            gVar = C12085h.f18916b;
        }
        C12079g gVar2 = gVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i3 = i >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r, fVar, gVar2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(gVar2, fVar, (C12074d<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1>) null), composer, (i3 & 8) | 4672 | (i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }
}
