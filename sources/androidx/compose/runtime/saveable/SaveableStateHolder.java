package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: SaveableStateHolder.kt */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i);

    void removeState(Object obj);
}
