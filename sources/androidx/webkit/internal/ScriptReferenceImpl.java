package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptReferenceCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptReferenceBoundaryInterface;
import p378kg.C12660a;

public class ScriptReferenceImpl extends ScriptReferenceCompat {
    private ScriptReferenceBoundaryInterface mBoundaryInterface;

    private ScriptReferenceImpl(@NonNull ScriptReferenceBoundaryInterface scriptReferenceBoundaryInterface) {
        this.mBoundaryInterface = scriptReferenceBoundaryInterface;
    }

    @NonNull
    public static ScriptReferenceImpl toScriptReferenceCompat(@NonNull InvocationHandler invocationHandler) {
        return new ScriptReferenceImpl((ScriptReferenceBoundaryInterface) C12660a.m28162a(ScriptReferenceBoundaryInterface.class, invocationHandler));
    }

    public void remove() {
        this.mBoundaryInterface.remove();
    }
}
