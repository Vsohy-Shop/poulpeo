package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.semantics.SemanticsModifier */
/* compiled from: SemanticsModifier.kt */
public interface SemanticsModifier extends Modifier.Element {
    int getId() {
        return -1;
    }

    SemanticsConfiguration getSemanticsConfiguration();

    /* renamed from: androidx.compose.ui.semantics.SemanticsModifier$DefaultImpls */
    /* compiled from: SemanticsModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return SemanticsModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return SemanticsModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return SemanticsModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return SemanticsModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return SemanticsModifier.super.then(modifier);
        }

        public static /* synthetic */ void getId$annotations() {
        }
    }
}
