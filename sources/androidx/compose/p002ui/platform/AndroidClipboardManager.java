package androidx.compose.p002ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import androidx.compose.p002ui.text.AnnotatedString;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.AndroidClipboardManager */
/* compiled from: AndroidClipboardManager.android.kt */
public final class AndroidClipboardManager implements ClipboardManager {
    private final ClipboardManager clipboardManager;

    public AndroidClipboardManager(ClipboardManager clipboardManager2) {
        C12775o.m28639i(clipboardManager2, "clipboardManager");
        this.clipboardManager = clipboardManager2;
    }

    public AnnotatedString getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        CharSequence charSequence = null;
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt != null) {
            charSequence = itemAt.getText();
        }
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(charSequence);
    }

    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void setText(AnnotatedString annotatedString) {
        C12775o.m28639i(annotatedString, "annotatedString");
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(annotatedString)));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidClipboardManager(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            kotlin.jvm.internal.C12775o.m28637g(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>((android.content.ClipboardManager) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.AndroidClipboardManager.<init>(android.content.Context):void");
    }
}
