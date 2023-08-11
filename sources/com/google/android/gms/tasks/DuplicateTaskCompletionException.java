package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    /* renamed from: a */
    public static IllegalStateException m11270a(@NonNull Task<?> task) {
        String str;
        String str2;
        if (!task.mo35464o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k = task.mo35460k();
        if (k != null) {
            str = "failure";
        } else if (task.mo35465p()) {
            str = "result ".concat(String.valueOf(task.mo35461l()));
        } else if (task.mo35463n()) {
            str = "cancellation";
        } else {
            str = "unknown issue";
        }
        if (str.length() != 0) {
            str2 = "Complete with: ".concat(str);
        } else {
            str2 = new String("Complete with: ");
        }
        return new DuplicateTaskCompletionException(str2, k);
    }
}
