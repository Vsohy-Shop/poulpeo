package androidx.webkit;

import androidx.annotation.NonNull;

public abstract class JavaScriptReplyProxy {
    public abstract void postMessage(@NonNull String str);
}
