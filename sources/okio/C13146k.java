package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
/* renamed from: okio.k */
/* compiled from: ForwardingFileSystem.kt */
public abstract class C13146k extends C13143j {

    /* renamed from: e */
    private final C13143j f20930e;

    public C13146k(C13143j jVar) {
        C12775o.m28639i(jVar, "delegate");
        this.f20930e = jVar;
    }

    /* renamed from: b */
    public C13175w0 mo50367b(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        return this.f20930e.mo50367b(mo52651r(p0Var, "appendingSink", "file"), z);
    }

    /* renamed from: c */
    public void mo50368c(C13158p0 p0Var, C13158p0 p0Var2) {
        C12775o.m28639i(p0Var, APIParams.SOURCE);
        C12775o.m28639i(p0Var2, TypedValues.AttributesType.S_TARGET);
        this.f20930e.mo50368c(mo52651r(p0Var, "atomicMove", APIParams.SOURCE), mo52651r(p0Var2, "atomicMove", TypedValues.AttributesType.S_TARGET));
    }

    /* renamed from: g */
    public void mo50369g(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "dir");
        this.f20930e.mo50369g(mo52651r(p0Var, "createDirectory", "dir"), z);
    }

    /* renamed from: i */
    public void mo50370i(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "path");
        this.f20930e.mo50370i(mo52651r(p0Var, "delete", "path"), z);
    }

    /* renamed from: k */
    public List<C13158p0> mo50371k(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "dir");
        C13158p0 r = mo52651r(p0Var, "list", "dir");
        ArrayList arrayList = new ArrayList();
        for (C13158p0 s : this.f20930e.mo50371k(r)) {
            arrayList.add(mo52652s(s, "list"));
        }
        C12664a0.m28171z(arrayList);
        return arrayList;
    }

    /* renamed from: m */
    public C13141i mo50372m(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "path");
        C13141i m = this.f20930e.mo50372m(mo52651r(p0Var, "metadataOrNull", "path"));
        if (m == null) {
            return null;
        }
        if (m.mo52638e() == null) {
            return m;
        }
        return C13141i.m29709b(m, false, false, mo52652s(m.mo52638e(), "metadataOrNull"), (Long) null, (Long) null, (Long) null, (Long) null, (Map) null, 251, (Object) null);
    }

    /* renamed from: n */
    public C13138h mo50373n(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return this.f20930e.mo50373n(mo52651r(p0Var, "openReadOnly", "file"));
    }

    /* renamed from: p */
    public C13175w0 mo42170p(C13158p0 p0Var, boolean z) {
        C12775o.m28639i(p0Var, "file");
        return this.f20930e.mo42170p(mo52651r(p0Var, "sink", "file"), z);
    }

    /* renamed from: q */
    public C13179y0 mo50374q(C13158p0 p0Var) {
        C12775o.m28639i(p0Var, "file");
        return this.f20930e.mo50374q(mo52651r(p0Var, APIParams.SOURCE, "file"));
    }

    /* renamed from: r */
    public C13158p0 mo52651r(C13158p0 p0Var, String str, String str2) {
        C12775o.m28639i(p0Var, "path");
        C12775o.m28639i(str, "functionName");
        C12775o.m28639i(str2, "parameterName");
        return p0Var;
    }

    /* renamed from: s */
    public C13158p0 mo52652s(C13158p0 p0Var, String str) {
        C12775o.m28639i(p0Var, "path");
        C12775o.m28639i(str, "functionName");
        return p0Var;
    }

    public String toString() {
        return C12764h0.m28586b(getClass()).mo50651a() + '(' + this.f20930e + ')';
    }
}
