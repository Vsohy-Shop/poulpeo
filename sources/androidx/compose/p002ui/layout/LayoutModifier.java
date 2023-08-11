package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.LayoutModifier */
/* compiled from: LayoutModifier.kt */
public interface LayoutModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.LayoutModifier$DefaultImpls */
    /* compiled from: LayoutModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return LayoutModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return LayoutModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return LayoutModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return LayoutModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(intrinsicMeasurable, "measurable");
            return LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(intrinsicMeasurable, "measurable");
            return LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(intrinsicMeasurable, "measurable");
            return LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "$receiver");
            C12775o.m28639i(intrinsicMeasurable, "measurable");
            return LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return LayoutModifier.super.then(modifier);
        }
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    MeasureResult m37349measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
