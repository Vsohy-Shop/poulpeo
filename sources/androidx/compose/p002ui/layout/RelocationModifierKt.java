package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.layout.RelocationModifierKt */
/* compiled from: RelocationModifier.kt */
public final class RelocationModifierKt {
    @ExperimentalComposeUiApi
    public static final Modifier onRelocationRequest(Modifier modifier, C13088o<? super Rect, ? super LayoutCoordinates, Rect> oVar, C13089p<? super Rect, ? super Rect, ? super C12074d<? super C11921v>, ? extends Object> pVar) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(oVar, "onProvideDestination");
        C12775o.m28639i(pVar, "onPerformRelocation");
        return modifier;
    }
}
