/*
An unresolved method _might_ be an instance method (and thus likely to have side effects), and
so we do not want to remove it by default.
 */

public class ShouldNotRemoveUnresolvedMethod extends SomeUnresolvedClass {
    public Object something() {
        Object obj = unresolvedMethod(); // Noncompliant
        obj = new Object();
        return obj;
    }
}
