package p331dg;

import java.util.ArrayList;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* renamed from: dg.m */
/* compiled from: InlineList.kt */
public final class C11842m<E> {
    /* renamed from: b */
    public static /* synthetic */ Object m25506b(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m25505a(obj);
    }

    /* renamed from: c */
    public static final Object m25507c(Object obj, E e) {
        if (obj == null) {
            return m25505a(e);
        }
        if (obj instanceof ArrayList) {
            C12775o.m28637g(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(e);
            return m25505a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m25505a(arrayList);
    }

    /* renamed from: a */
    public static <E> Object m25505a(Object obj) {
        return obj;
    }
}
