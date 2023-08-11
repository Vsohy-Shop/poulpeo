package androidx.compose.p002ui.draw;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.draw.DrawCacheModifier */
/* compiled from: DrawModifier.kt */
public interface DrawCacheModifier extends DrawModifier {

    /* renamed from: androidx.compose.ui.draw.DrawCacheModifier$DefaultImpls */
    /* compiled from: DrawModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(DrawCacheModifier drawCacheModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return DrawCacheModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(DrawCacheModifier drawCacheModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return DrawCacheModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(DrawCacheModifier drawCacheModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return DrawCacheModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(DrawCacheModifier drawCacheModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return DrawCacheModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(DrawCacheModifier drawCacheModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return DrawCacheModifier.super.then(modifier);
        }
    }

    void onBuildCache(BuildDrawCacheParams buildDrawCacheParams);
}
