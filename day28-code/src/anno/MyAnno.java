package anno;

public @interface MyAnno {
    String show1() default "A";
    String show2() default "B";
    String show3() default "C";
}
