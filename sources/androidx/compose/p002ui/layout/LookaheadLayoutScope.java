package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntSize;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.layout.LookaheadLayoutScope */
/* compiled from: LookaheadLayout.kt */
public interface LookaheadLayoutScope {
    Modifier intermediateLayout(Modifier modifier, C13090q<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> qVar);

    Modifier onPlaced(Modifier modifier, C13088o<? super LookaheadLayoutCoordinates, ? super LookaheadLayoutCoordinates, C11921v> oVar);
}
