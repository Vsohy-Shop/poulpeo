package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.ParentDataModifier */
/* compiled from: ParentDataModifier.kt */
public interface ParentDataModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.ParentDataModifier$DefaultImpls */
    /* compiled from: ParentDataModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ParentDataModifier parentDataModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ParentDataModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(ParentDataModifier parentDataModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ParentDataModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(ParentDataModifier parentDataModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ParentDataModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(ParentDataModifier parentDataModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ParentDataModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(ParentDataModifier parentDataModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return ParentDataModifier.super.then(modifier);
        }
    }

    Object modifyParentData(Density density, Object obj);
}
