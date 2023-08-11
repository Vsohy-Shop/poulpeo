package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import p314bg.C10962f;

/* compiled from: Recomposer.kt */
public interface RecomposerInfo {
    long getChangeCount();

    boolean getHasPendingWork();

    C10962f<Recomposer.State> getState();
}
