package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p058d1.C7214a;
import p058d1.C7218e;

public final class GlideException extends Exception {

    /* renamed from: h */
    private static final StackTraceElement[] f3761h = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final List<Throwable> f3762b;

    /* renamed from: c */
    private C7218e f3763c;

    /* renamed from: d */
    private C7214a f3764d;

    /* renamed from: e */
    private Class<?> f3765e;

    /* renamed from: f */
    private String f3766f;
    @Nullable

    /* renamed from: g */
    private Exception f3767g;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    private void m5125a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo31244e()) {
                m5125a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m5126b(List<Throwable> list, Appendable appendable) {
        try {
            m5127c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m5127c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m5129h(appendable);
            } else {
                m5128d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m5128d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m5129h(Appendable appendable) {
        m5128d(this, appendable);
        m5126b(mo31244e(), new C4383a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo31244e() {
        return this.f3762b;
    }

    /* renamed from: f */
    public List<Throwable> mo31245f() {
        ArrayList arrayList = new ArrayList();
        m5125a(this, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public void mo31247g(String str) {
        List<Throwable> f = mo31245f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3766f);
        String str3 = "";
        if (this.f3765e != null) {
            str = ", " + this.f3765e;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f3764d != null) {
            str2 = ", " + this.f3764d;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f3763c != null) {
            str3 = ", " + this.f3763c;
        }
        sb.append(str3);
        List<Throwable> f = mo31245f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            sb.append(" causes:");
        }
        for (Throwable next : f) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo31249i(C7218e eVar, C7214a aVar) {
        mo31250j(eVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo31250j(C7218e eVar, C7214a aVar, Class<?> cls) {
        this.f3763c = eVar;
        this.f3764d = aVar;
        this.f3765e = cls;
    }

    /* renamed from: k */
    public void mo31251k(@Nullable Exception exc) {
        this.f3767g = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m5129h(printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f3766f = str;
        setStackTrace(f3761h);
        this.f3762b = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m5129h(printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C4383a implements Appendable {

        /* renamed from: b */
        private final Appendable f3768b;

        /* renamed from: c */
        private boolean f3769c = true;

        C4383a(Appendable appendable) {
            this.f3768b = appendable;
        }

        @NonNull
        /* renamed from: a */
        private CharSequence m5136a(@Nullable CharSequence charSequence) {
            if (charSequence == null) {
                return "";
            }
            return charSequence;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f3769c) {
                this.f3769c = false;
                this.f3768b.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f3769c = z;
            this.f3768b.append(c);
            return this;
        }

        public Appendable append(@Nullable CharSequence charSequence) {
            CharSequence a = m5136a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(@Nullable CharSequence charSequence, int i, int i2) {
            CharSequence a = m5136a(charSequence);
            boolean z = false;
            if (this.f3769c) {
                this.f3769c = false;
                this.f3768b.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f3769c = z;
            this.f3768b.append(a, i, i2);
            return this;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }
}
