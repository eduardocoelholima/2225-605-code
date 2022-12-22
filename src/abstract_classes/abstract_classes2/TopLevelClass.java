package abstract_classes.abstract_classes2;

import abstract_classes.abstract_classes2.OuterClass;

public class TopLevelClass {

    void accessMembers(OuterClass outer) {

        System.out.println(outer.outerField);
        System.out.println(outer.staticOuterField);
        OuterClass.StaticNestedClass x = new OuterClass.StaticNestedClass();
    }  
}
