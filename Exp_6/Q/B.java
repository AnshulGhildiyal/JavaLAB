
package Exp_6.Q;

import Exp_6.p.A;

public class B extends A {

    public void display() {

        // Public method: accessible
        publicMethod();

        // Protected method: accessible through inheritance
        protectedMethod();

        // Default method: not accessible
        // defaultMethod();

        // Private method: not accessible
        // privateMethod();

        // Access private method indirectly
        showPrivate();
    }
}