package androidx.compose.material;

import androidx.compose.p002ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt$swipeAnchors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,655:1\n1855#2,2:656\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt$swipeAnchors$2\n*L\n113#1:656,2\n*E\n"})
/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$swipeAnchors$2 extends C12777p implements Function1<IntSize, C11921v> {
    final /* synthetic */ AnchorChangeHandler<T> $anchorChangeHandler;
    final /* synthetic */ C13088o<T, IntSize, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleValues;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$swipeAnchors$2(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, C13088o<? super T, ? super IntSize, Float> oVar) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleValues = set;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$calculateAnchor = oVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m34148invokeozmzZPI(((IntSize) obj).m38632unboximpl());
        return C11921v.f18618a;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m34148invokeozmzZPI(long j) {
        AnchorChangeHandler<T> anchorChangeHandler;
        Map<T, Float> anchors$material_release = this.$state.getAnchors$material_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<T> set = this.$possibleValues;
        C13088o<T, IntSize, Float> oVar = this.$calculateAnchor;
        for (T next : set) {
            Float invoke = oVar.invoke(next, IntSize.m38620boximpl(j));
            if (invoke != null) {
                linkedHashMap.put(next, invoke);
            }
        }
        if (!C12775o.m28634d(anchors$material_release, linkedHashMap)) {
            T targetValue = this.$state.getTargetValue();
            if (this.$state.updateAnchors$material_release(linkedHashMap) && (anchorChangeHandler = this.$anchorChangeHandler) != null) {
                anchorChangeHandler.onAnchorsChanged(targetValue, anchors$material_release, linkedHashMap);
            }
        }
    }
}
