package abstractclass;

import ObjOrientedProgr.constructormouse.Mouse;

public abstract class AbsClass extends Mouse {

    AbsClass() {
        super("Jerry", 7);
    }


    abstract void doSomething();
    abstract void eat(String food);
}
