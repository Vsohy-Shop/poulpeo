package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;
import p336ef.C11915r;

@SourceDebugExtension({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1#2:221\n11335#3:222\n11670#3,3:223\n37#4,2:226\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n*L\n209#1:222\n209#1:223,3\n209#1:226,2\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalNodeKt */
/* compiled from: ModifierLocalNode.kt */
public final class ModifierLocalNodeKt {
    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @ExperimentalComposeUiApi
    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        return new SingleLocalMap(modifierLocal);
    }

    @ExperimentalComposeUiApi
    public static final <T> ModifierLocalMap modifierLocalMapOf(C11906l<? extends ModifierLocal<T>, ? extends T> lVar) {
        C12775o.m28639i(lVar, "entry");
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) lVar.mo49111c());
        singleLocalMap.set$ui_release((ModifierLocal) lVar.mo49111c(), lVar.mo49112d());
        return singleLocalMap;
    }

    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf(C11906l<? extends ModifierLocal<?>, ? extends Object>... lVarArr) {
        C12775o.m28639i(lVarArr, "entries");
        return new MultiLocalMap((C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }

    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?>... modifierLocalArr) {
        C12775o.m28639i(modifierLocalArr, "keys");
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> a : modifierLocalArr) {
            arrayList.add(C11915r.m25707a(a, null));
        }
        C11906l[] lVarArr = (C11906l[]) arrayList.toArray(new C11906l[0]);
        return new MultiLocalMap((C11906l[]) Arrays.copyOf(lVarArr, lVarArr.length));
    }
}
