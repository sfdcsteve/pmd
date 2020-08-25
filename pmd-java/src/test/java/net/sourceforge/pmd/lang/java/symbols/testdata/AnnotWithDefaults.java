/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.symbols.testdata;

/**
 *
 */
public @interface AnnotWithDefaults {



    String valueNoDefault();
    String valueWithDefault() default "ddd";
    String[] stringArrayDefault() default {"ddd"};
    String[] stringArrayEmptyDefault() default {};

}
