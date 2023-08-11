package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@SourceDebugExtension({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n25#2:225\n25#2:232\n25#2:239\n25#2:246\n25#2:253\n1114#3,6:226\n1114#3,6:233\n1114#3,6:240\n1114#3,6:247\n1114#3,6:254\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/SnapshotStateKt__ProduceStateKt\n*L\n82#1:225\n115#1:232\n149#1:239\n184#1:246\n217#1:253\n82#1:226,6\n115#1:233,6\n149#1:240,6\n184#1:247,6\n217#1:254,6\n*E\n"})
/* compiled from: ProduceState.kt */
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    @Composable
    public static final <T> State<T> produceState(T t, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "producer");
        composer.startReplaceableGroup(10454275);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect((Object) C11921v.f18618a, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnapshotStateKt__ProduceStateKt$produceState$1(oVar, mutableState, (C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$1>) null), composer, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "producer");
        composer.startReplaceableGroup(-1928268701);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:109)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnapshotStateKt__ProduceStateKt$produceState$2(oVar, mutableState, (C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$2>) null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "producer");
        composer.startReplaceableGroup(-1703169085);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:142)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, new SnapshotStateKt__ProduceStateKt$produceState$3(oVar, mutableState, (C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$3>) null), composer, 584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(oVar, "producer");
        composer.startReplaceableGroup(1807205155);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:176)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(obj, obj2, obj3, new SnapshotStateKt__ProduceStateKt$produceState$4(oVar, mutableState, (C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$4>) null), composer, 4680);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    @Composable
    public static final <T> State<T> produceState(T t, Object[] objArr, C13088o<? super ProduceStateScope<T>, ? super C12074d<? super C11921v>, ? extends Object> oVar, Composer composer, int i) {
        C12775o.m28639i(objArr, "keys");
        C12775o.m28639i(oVar, "producer");
        composer.startReplaceableGroup(490154582);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:211)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, (SnapshotMutationPolicy) null, 2, (Object) null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        EffectsKt.LaunchedEffect(Arrays.copyOf(objArr, objArr.length), (C13088o<? super C13995l0, ? super C12074d<? super C11921v>, ? extends Object>) new SnapshotStateKt__ProduceStateKt$produceState$5(oVar, mutableState, (C12074d<? super SnapshotStateKt__ProduceStateKt$produceState$5>) null), composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
