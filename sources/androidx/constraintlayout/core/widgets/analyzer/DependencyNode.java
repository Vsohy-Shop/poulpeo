package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements Dependency {
    public boolean delegateToWidgetRun = false;
    List<Dependency> dependencies = new ArrayList();
    int margin;
    DimensionDependency marginDependency = null;
    int marginFactor = 1;
    public boolean readyToSolve = false;
    public boolean resolved = false;
    WidgetRun run;
    List<DependencyNode> targets = new ArrayList();
    Type type = Type.UNKNOWN;
    public Dependency updateDelegate = null;
    public int value;

    enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.run = widgetRun;
    }

    public void addDependency(Dependency dependency) {
        this.dependencies.add(dependency);
        if (this.resolved) {
            dependency.update(dependency);
        }
    }

    public void clear() {
        this.targets.clear();
        this.dependencies.clear();
        this.resolved = false;
        this.value = 0;
        this.readyToSolve = false;
        this.delegateToWidgetRun = false;
    }

    public String name() {
        String str;
        String debugName = this.run.widget.getDebugName();
        Type type2 = this.type;
        if (type2 == Type.LEFT || type2 == Type.RIGHT) {
            str = debugName + "_HORIZONTAL";
        } else {
            str = debugName + "_VERTICAL";
        }
        return str + ":" + this.type.name();
    }

    public void resolve(int i) {
        if (!this.resolved) {
            this.resolved = true;
            this.value = i;
            for (Dependency next : this.dependencies) {
                next.update(next);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.run.widget.getDebugName());
        sb.append(":");
        sb.append(this.type);
        sb.append("(");
        if (this.resolved) {
            obj = Integer.valueOf(this.value);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.targets.size());
        sb.append(":d=");
        sb.append(this.dependencies.size());
        sb.append(">");
        return sb.toString();
    }

    public void update(Dependency dependency) {
        for (DependencyNode dependencyNode : this.targets) {
            if (!dependencyNode.resolved) {
                return;
            }
        }
        this.readyToSolve = true;
        Dependency dependency2 = this.updateDelegate;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.delegateToWidgetRun) {
            this.run.update(this);
            return;
        }
        DependencyNode dependencyNode2 = null;
        int i = 0;
        for (DependencyNode next : this.targets) {
            if (!(next instanceof DimensionDependency)) {
                i++;
                dependencyNode2 = next;
            }
        }
        if (dependencyNode2 != null && i == 1 && dependencyNode2.resolved) {
            DimensionDependency dimensionDependency = this.marginDependency;
            if (dimensionDependency != null) {
                if (dimensionDependency.resolved) {
                    this.margin = this.marginFactor * dimensionDependency.value;
                } else {
                    return;
                }
            }
            resolve(dependencyNode2.value + this.margin);
        }
        Dependency dependency3 = this.updateDelegate;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }
}
