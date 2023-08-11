package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.draw.DrawModifier */
/* compiled from: DrawModifier.kt */
public interface DrawModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.draw.DrawModifier$DefaultImpls */
    /* compiled from: DrawModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawModifier drawModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return DrawModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(DrawModifier drawModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return DrawModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(DrawModifier drawModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return DrawModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawModifier drawModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return DrawModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(DrawModifier drawModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return DrawModifier.super.then(modifier);
        }
    }

    void draw(ContentDrawScope contentDrawScope);
}
