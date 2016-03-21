
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str3 = bcApplication0.greaterThan(str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str2 = bcApplication0.lessThan(str_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str3 = bcApplication0.or(str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str3 = bcApplication0.lessThan(str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str3 = bcApplication0.or(str_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    java.lang.String[] str_array4 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str5 = bcApplication0.multiply(str_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "" };
    java.lang.String str7 = bcApplication4.bracket(str_array6);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str8 = bcApplication0.greaterThanOrEqual(str_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortCapitalNumbers(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    java.lang.String str23 = bcApplication15.bracket(str_array21);
    java.util.List list24 = sortApplication4.sortSimpleNumbersSpecialChars(str_array21);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str25 = bcApplication0.add(str_array21);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortCapitalNumbers(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    java.lang.String str23 = bcApplication15.bracket(str_array21);
    java.util.List list24 = sortApplication4.sortSimpleNumbersSpecialChars(str_array21);
    java.io.InputStream inputStream25 = null;
    java.io.OutputStream outputStream26 = null;
    // The following exception was thrown during execution in test generation
    try {
      bcApplication0.run(str_array21, inputStream25, outputStream26);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException");
    } catch (sg.edu.nus.comp.cs4218.exception.BcException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.BcException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.io.InputStream inputStream6 = null;
    java.io.OutputStream outputStream7 = null;
    // The following exception was thrown during execution in test generation
    try {
      bcApplication0.run(str_array5, inputStream6, outputStream7);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException");
    } catch (sg.edu.nus.comp.cs4218.exception.BcException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.BcException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    java.io.InputStream inputStream12 = null;
    java.io.OutputStream outputStream13 = null;
    // The following exception was thrown during execution in test generation
    try {
      sortApplication0.run(str_array8, inputStream12, outputStream13);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException");
    } catch (sg.edu.nus.comp.cs4218.exception.SortException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.SortException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.io.InputStream inputStream17 = null;
    java.io.OutputStream outputStream18 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array14, inputStream17, outputStream18);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    java.lang.String str0 = sg.edu.nus.comp.cs4218.impl.app.CommApplication.EXP_FNF_EXCEPTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "File not found"+ "'", str0.equals("File not found"));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication17 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication17.sortCapitalNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication17.sortSimpleNumbersSpecialChars(str_array34);
    java.util.List list38 = sortApplication6.numericalSortNumbers(str_array34);
    java.lang.String str39 = bcApplication0.not(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortStringsSimple(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication51 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication51.sortCapitalNumbers(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!" };
    java.lang.String str69 = bcApplication66.negate(str_array68);
    java.lang.String str70 = bcApplication62.bracket(str_array68);
    java.util.List list71 = sortApplication51.sortSimpleNumbersSpecialChars(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication72 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication72.sortStringsSimple(str_array79);
    java.util.List list83 = sortApplication51.numericalSortSimpleCapitalSpecialChars(str_array79);
    java.util.List list84 = sortApplication40.numericalSortCapitalSpecialChars(str_array79);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str85 = bcApplication0.multiply(str_array79);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "0"+ "'", str39.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "-hi!"+ "'", str69.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list84);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    java.lang.String str0 = sg.edu.nus.comp.cs4218.impl.app.CommApplication.DOUBLE_TAB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\t\t"+ "'", str0.equals("\t\t"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    java.io.InputStream inputStream29 = null;
    java.io.OutputStream outputStream30 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array25, inputStream29, outputStream30);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    boolean b2 = bcApplication0.isValidBracketMatching("0");
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str4 = bcApplication0.getPostfixExpression("File not found");
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException");
    } catch (sg.edu.nus.comp.cs4218.exception.BcException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.BcException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    java.lang.String str12 = bcApplication0.calculate("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortStringsSimple(str_array19);
    java.util.List list23 = sortApplication1.sortSimpleCapital(str_array19);
    java.io.InputStream inputStream24 = null;
    java.io.OutputStream outputStream25 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array19, inputStream24, outputStream25);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.lang.String str14 = bcApplication11.bracket(str_array13);
    java.util.List list15 = sortApplication0.numericalSortNumbers(str_array13);
    java.lang.String[] str_array16 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List list17 = sortApplication0.sortSimpleCapitalSpecialChars(str_array16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    java.lang.String str0 = sg.edu.nus.comp.cs4218.impl.app.CommApplication.SINGLE_TAB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\t"+ "'", str0.equals("\t"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    java.lang.String str4 = bcApplication1.bracket(str_array3);
    java.lang.String str6 = bcApplication1.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication18 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    java.lang.String str27 = bcApplication19.bracket(str_array25);
    java.util.List list28 = sortApplication18.sortCapitalNumbers(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.util.List list38 = sortApplication18.sortSimpleNumbersSpecialChars(str_array35);
    java.util.List list39 = sortApplication7.numericalSortNumbers(str_array35);
    java.lang.String str40 = bcApplication1.not(str_array35);
    java.io.InputStream inputStream41 = null;
    java.io.OutputStream outputStream42 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array35, inputStream41, outputStream42);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "0"+ "'", str40.equals("0"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = bcApplication0.greaterThan(str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str5 = bcApplication0.subtract(str_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    sg.edu.nus.comp.cs4218.impl.app.CatApplication catApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CatApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortCapitalNumbers(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.lang.String str16 = bcApplication13.bracket(str_array15);
    java.util.List list17 = sortApplication2.numericalSortNumbers(str_array15);
    java.util.List list18 = sortApplication1.sortAll(str_array15);
    java.io.InputStream inputStream19 = null;
    java.io.OutputStream outputStream20 = null;
    // The following exception was thrown during execution in test generation
    try {
      catApplication0.run(str_array15, inputStream19, outputStream20);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CatException");
    } catch (sg.edu.nus.comp.cs4218.exception.CatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.CatException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication19 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "" };
    java.lang.String str23 = bcApplication20.bracket(str_array22);
    java.util.List list24 = sortApplication19.sortStringsCapital(str_array22);
    java.lang.String str25 = bcApplication18.not(str_array22);
    java.util.List list26 = sortApplication0.sortNumbersSpecialChars(str_array22);
    java.lang.String[] str_array27 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List list28 = sortApplication0.sortCapitalSpecialChars(str_array27);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0"+ "'", str25.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.lang.String str20 = bcApplication17.bracket(str_array19);
    java.util.List list21 = sortApplication6.numericalSortNumbers(str_array19);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = bcApplication0.notEqual(str_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    java.lang.String str4 = bcApplication1.bracket(str_array3);
    java.lang.String str6 = bcApplication1.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication18 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    java.lang.String str27 = bcApplication19.bracket(str_array25);
    java.util.List list28 = sortApplication18.sortCapitalNumbers(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.util.List list38 = sortApplication18.sortSimpleNumbersSpecialChars(str_array35);
    java.util.List list39 = sortApplication7.numericalSortNumbers(str_array35);
    java.lang.String str40 = bcApplication1.not(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    java.lang.String str50 = bcApplication42.bracket(str_array48);
    java.util.List list51 = sortApplication41.sortCapitalNumbers(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication41.sortSimpleNumbersSpecialChars(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication62 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.lang.String str66 = bcApplication63.negate(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    java.lang.String str71 = bcApplication63.bracket(str_array69);
    java.util.List list72 = sortApplication62.sortCapitalNumbers(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication62.sortSimpleNumbersSpecialChars(str_array79);
    java.util.List list83 = sortApplication41.sortSimpleCapitalNumber(str_array79);
    java.lang.String str84 = bcApplication1.bracket(str_array79);
    java.io.InputStream inputStream85 = null;
    java.io.OutputStream outputStream86 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array79, inputStream85, outputStream86);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "0"+ "'", str40.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-hi!"+ "'", str66.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!"+ "'", str71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!"+ "'", str84.equals("hi!"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication5 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    java.lang.String str14 = bcApplication6.bracket(str_array12);
    java.util.List list15 = sortApplication5.sortStringsSimple(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication16 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.util.List list26 = sortApplication16.sortCapitalNumbers(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    java.lang.String str35 = bcApplication27.bracket(str_array33);
    java.util.List list36 = sortApplication16.sortSimpleNumbersSpecialChars(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication37 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.util.List list47 = sortApplication37.sortStringsSimple(str_array44);
    java.util.List list48 = sortApplication16.numericalSortSimpleCapitalSpecialChars(str_array44);
    java.util.List list49 = sortApplication5.numericalSortCapitalSpecialChars(str_array44);
    java.lang.String str50 = bcApplication1.not(str_array44);
    java.io.InputStream inputStream51 = null;
    java.io.OutputStream outputStream52 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array44, inputStream51, outputStream52);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "0"+ "'", str50.equals("0"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.lang.String str20 = bcApplication0.not(str_array17);
    java.lang.String[] str_array21 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = bcApplication0.divide(str_array21);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0"+ "'", str20.equals("0"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication19 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "" };
    java.lang.String str23 = bcApplication20.bracket(str_array22);
    java.util.List list24 = sortApplication19.sortStringsCapital(str_array22);
    java.lang.String str25 = bcApplication18.not(str_array22);
    java.util.List list26 = sortApplication0.sortNumbersSpecialChars(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication27 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "" };
    java.lang.String str31 = bcApplication28.bracket(str_array30);
    java.util.List list32 = sortApplication27.sortStringsCapital(str_array30);
    java.util.List list33 = sortApplication0.sortCapitalNumbers(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0"+ "'", str25.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    java.lang.String str5 = bcApplication2.bracket(str_array4);
    java.util.List list6 = sortApplication1.sortStringsCapital(str_array4);
    java.io.InputStream inputStream7 = null;
    java.io.OutputStream outputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array4, inputStream7, outputStream8);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication9 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    java.lang.String str18 = bcApplication10.bracket(str_array16);
    java.util.List list19 = sortApplication9.sortCapitalNumbers(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    java.lang.String str28 = bcApplication20.bracket(str_array26);
    java.util.List list29 = sortApplication9.sortSimpleNumbersSpecialChars(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication30 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    java.lang.String str39 = bcApplication31.bracket(str_array37);
    java.util.List list40 = sortApplication30.sortCapitalNumbers(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication30.sortSimpleNumbersSpecialChars(str_array47);
    java.util.List list51 = sortApplication9.sortSimpleCapitalNumber(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication52 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    java.lang.String str61 = bcApplication53.bracket(str_array59);
    java.util.List list62 = sortApplication52.sortCapitalNumbers(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "" };
    java.lang.String str66 = bcApplication63.bracket(str_array65);
    java.util.List list67 = sortApplication52.numericalSortNumbers(str_array65);
    java.util.List list68 = sortApplication9.sortCapitalNumbers(str_array65);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str69 = bcApplication0.or(str_array65);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ""+ "'", str66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    sg.edu.nus.comp.cs4218.impl.app.CatApplication catApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CatApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication12.sortSimpleNumbersSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication33 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    java.lang.String str42 = bcApplication34.bracket(str_array40);
    java.util.List list43 = sortApplication33.sortStringsSimple(str_array40);
    java.util.List list44 = sortApplication12.numericalSortSimpleCapitalSpecialChars(str_array40);
    java.util.List list45 = sortApplication1.numericalSortCapitalSpecialChars(str_array40);
    java.io.InputStream inputStream46 = null;
    java.io.OutputStream outputStream47 = null;
    // The following exception was thrown during execution in test generation
    try {
      catApplication0.run(str_array40, inputStream46, outputStream47);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CatException");
    } catch (sg.edu.nus.comp.cs4218.exception.CatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.CatException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortStringsSimple(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication15 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    java.lang.String str24 = bcApplication16.bracket(str_array22);
    java.util.List list25 = sortApplication15.sortCapitalNumbers(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication15.sortSimpleNumbersSpecialChars(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortStringsSimple(str_array43);
    java.util.List list47 = sortApplication15.numericalSortSimpleCapitalSpecialChars(str_array43);
    java.util.List list48 = sortApplication4.numericalSortCapitalSpecialChars(str_array43);
    java.lang.String str49 = bcApplication0.not(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication54 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    java.lang.String str57 = bcApplication54.negate(str_array56);
    java.lang.String str58 = bcApplication50.bracket(str_array56);
    java.lang.String str60 = bcApplication50.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "" };
    java.lang.String str64 = bcApplication61.bracket(str_array63);
    java.lang.String str65 = bcApplication50.bracket(str_array63);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str66 = bcApplication0.greaterThanOrEqual(str_array63);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "0"+ "'", str49.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "-hi!"+ "'", str57.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + ""+ "'", str64.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortStringsSimple(str_array29);
    java.util.List list33 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.util.List list38 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "" };
    java.lang.String str42 = bcApplication39.bracket(str_array41);
    java.lang.String str44 = bcApplication39.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication45 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    java.lang.String str54 = bcApplication46.bracket(str_array52);
    java.util.List list55 = sortApplication45.sortCapitalNumbers(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication56 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    java.lang.String str65 = bcApplication57.bracket(str_array63);
    java.util.List list66 = sortApplication56.sortCapitalNumbers(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication71 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!" };
    java.lang.String str74 = bcApplication71.negate(str_array73);
    java.lang.String str75 = bcApplication67.bracket(str_array73);
    java.util.List list76 = sortApplication56.sortSimpleNumbersSpecialChars(str_array73);
    java.util.List list77 = sortApplication45.numericalSortNumbers(str_array73);
    java.lang.String str78 = bcApplication39.not(str_array73);
    java.util.List list79 = sortApplication1.numericalSortSimpleNumbers(str_array73);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication80 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication81 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array83 = new java.lang.String[] { "" };
    java.lang.String str84 = bcApplication81.bracket(str_array83);
    java.util.List list85 = sortApplication80.sortStringsCapital(str_array83);
    java.util.List list86 = sortApplication1.numericalSortNumbers(str_array83);
    java.io.InputStream inputStream87 = null;
    java.io.OutputStream outputStream88 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array83, inputStream87, outputStream88);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!"+ "'", str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "-hi!"+ "'", str74.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!"+ "'", str75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "0"+ "'", str78.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + ""+ "'", str84.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list86);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication29 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.util.List list39 = sortApplication29.sortStringsSimple(str_array36);
    java.util.List list40 = sortApplication1.numericalSortNumbersSpecialChars(str_array36);
    java.io.InputStream inputStream41 = null;
    java.io.OutputStream outputStream42 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array36, inputStream41, outputStream42);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortStringsSimple(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication15 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    java.lang.String str24 = bcApplication16.bracket(str_array22);
    java.util.List list25 = sortApplication15.sortStringsSimple(str_array22);
    java.util.List list26 = sortApplication4.sortSimpleCapital(str_array22);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = bcApplication0.and(str_array22);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication0.sortSimpleNumbersSpecialChars(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication21 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication21.sortCapitalNumbers(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    java.lang.String str40 = bcApplication32.bracket(str_array38);
    java.util.List list41 = sortApplication21.sortSimpleNumbersSpecialChars(str_array38);
    java.util.List list42 = sortApplication0.sortSimpleCapital(str_array38);
    java.lang.String[] str_array43 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List list44 = sortApplication0.sortCapitalNumbers(str_array43);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortStringsSimple(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortStringsSimple(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication22.sortSimpleNumbersSpecialChars(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication43 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication44 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!" };
    java.lang.String str47 = bcApplication44.negate(str_array46);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    java.lang.String str52 = bcApplication44.bracket(str_array50);
    java.util.List list53 = sortApplication43.sortStringsSimple(str_array50);
    java.util.List list54 = sortApplication22.numericalSortSimpleCapitalSpecialChars(str_array50);
    java.util.List list55 = sortApplication11.numericalSortCapitalSpecialChars(str_array50);
    java.util.List list56 = sortApplication0.numericalSortSimpleCapitalNumber(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "-hi!"+ "'", str47.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication17 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication17.sortCapitalNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication17.sortSimpleNumbersSpecialChars(str_array34);
    java.util.List list38 = sortApplication6.numericalSortNumbers(str_array34);
    java.lang.String str39 = bcApplication0.not(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortCapitalNumbers(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.lang.String str58 = bcApplication55.negate(str_array57);
    java.lang.String str59 = bcApplication51.bracket(str_array57);
    java.util.List list60 = sortApplication40.sortSimpleNumbersSpecialChars(str_array57);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication61 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!" };
    java.lang.String str69 = bcApplication66.negate(str_array68);
    java.lang.String str70 = bcApplication62.bracket(str_array68);
    java.util.List list71 = sortApplication61.sortCapitalNumbers(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!" };
    java.lang.String str79 = bcApplication76.negate(str_array78);
    java.lang.String str80 = bcApplication72.bracket(str_array78);
    java.util.List list81 = sortApplication61.sortSimpleNumbersSpecialChars(str_array78);
    java.util.List list82 = sortApplication40.sortSimpleCapitalNumber(str_array78);
    java.lang.String str83 = bcApplication0.bracket(str_array78);
    java.lang.String[] str_array84 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str85 = bcApplication0.or(str_array84);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "0"+ "'", str39.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "-hi!"+ "'", str58.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "-hi!"+ "'", str69.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "-hi!"+ "'", str79.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!"+ "'", str83.equals("hi!"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortCapitalNumbers(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication15 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    java.lang.String str24 = bcApplication16.bracket(str_array22);
    java.util.List list25 = sortApplication15.sortCapitalNumbers(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.lang.String str29 = bcApplication26.bracket(str_array28);
    java.util.List list30 = sortApplication15.numericalSortNumbers(str_array28);
    java.util.List list31 = sortApplication4.sortSimpleSpecialChars(str_array28);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str32 = bcApplication0.greaterThan(str_array28);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication0.sortSimpleNumbersSpecialChars(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortStringsSimple(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication36.numericalSortSimpleCapitalSpecialChars(str_array64);
    java.util.List list69 = sortApplication25.numericalSortCapitalSpecialChars(str_array64);
    java.lang.String str70 = bcApplication21.not(str_array64);
    java.util.List list71 = sortApplication0.sortCapitalNumbers(str_array64);
    java.lang.String[] str_array72 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.util.List list73 = sortApplication0.sortSpecialChars(str_array72);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0"+ "'", str70.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication12.sortSimpleNumbersSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication33 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    java.lang.String str42 = bcApplication34.bracket(str_array40);
    java.util.List list43 = sortApplication33.sortStringsSimple(str_array40);
    java.util.List list44 = sortApplication12.numericalSortSimpleCapitalSpecialChars(str_array40);
    java.util.List list45 = sortApplication1.numericalSortCapitalSpecialChars(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication46.sortCapitalNumbers(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    java.lang.String str65 = bcApplication57.bracket(str_array63);
    java.util.List list66 = sortApplication46.sortSimpleNumbersSpecialChars(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication67 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication68 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array70 = new java.lang.String[] { "hi!" };
    java.lang.String str71 = bcApplication68.negate(str_array70);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    java.lang.String str76 = bcApplication68.bracket(str_array74);
    java.util.List list77 = sortApplication67.sortStringsSimple(str_array74);
    java.util.List list78 = sortApplication46.numericalSortSimpleCapitalSpecialChars(str_array74);
    java.util.List list79 = sortApplication1.sortCapitalSpecialChars(str_array74);
    java.io.InputStream inputStream80 = null;
    java.io.OutputStream outputStream81 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array74, inputStream80, outputStream81);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "-hi!"+ "'", str71.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!"+ "'", str76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    boolean b5 = bcApplication0.isValidBracketMatching("hi!");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    java.lang.String str17 = bcApplication0.bracket(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.sortSimpleSpecialChars(str_array25);
    java.io.InputStream inputStream29 = null;
    java.io.OutputStream outputStream30 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array25, inputStream29, outputStream30);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortStringsSimple(str_array29);
    java.util.List list33 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.util.List list38 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array36);
    java.io.InputStream inputStream39 = null;
    java.io.OutputStream outputStream40 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array36, inputStream39, outputStream40);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication0.sortNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication28 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.util.List list38 = sortApplication28.sortCapitalNumbers(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication43 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!" };
    java.lang.String str46 = bcApplication43.negate(str_array45);
    java.lang.String str47 = bcApplication39.bracket(str_array45);
    java.util.List list48 = sortApplication28.sortSimpleNumbersSpecialChars(str_array45);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication49 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication54 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    java.lang.String str57 = bcApplication54.negate(str_array56);
    java.lang.String str58 = bcApplication50.bracket(str_array56);
    java.util.List list59 = sortApplication49.sortCapitalNumbers(str_array56);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication64 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!" };
    java.lang.String str67 = bcApplication64.negate(str_array66);
    java.lang.String str68 = bcApplication60.bracket(str_array66);
    java.util.List list69 = sortApplication49.sortSimpleNumbersSpecialChars(str_array66);
    java.util.List list70 = sortApplication28.sortSimpleCapitalNumber(str_array66);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication71 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!" };
    java.lang.String str79 = bcApplication76.negate(str_array78);
    java.lang.String str80 = bcApplication72.bracket(str_array78);
    java.util.List list81 = sortApplication71.sortCapitalNumbers(str_array78);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication82 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array84 = new java.lang.String[] { "" };
    java.lang.String str85 = bcApplication82.bracket(str_array84);
    java.util.List list86 = sortApplication71.numericalSortNumbers(str_array84);
    java.util.List list87 = sortApplication28.sortCapitalNumbers(str_array84);
    java.util.List list88 = sortApplication0.numericalSortCapitalSpecialChars(str_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "-hi!"+ "'", str46.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "-hi!"+ "'", str57.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "-hi!"+ "'", str67.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!"+ "'", str68.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "-hi!"+ "'", str79.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + ""+ "'", str85.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list88);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortCapitalNumbers(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.lang.String str16 = bcApplication13.bracket(str_array15);
    java.util.List list17 = sortApplication2.numericalSortNumbers(str_array15);
    java.util.List list18 = sortApplication1.sortAll(str_array15);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str19 = bcApplication0.lessThanOrEqual(str_array15);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.sortSimpleSpecialChars(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication29 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.util.List list39 = sortApplication29.sortCapitalNumbers(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortCapitalNumbers(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.lang.String str58 = bcApplication55.negate(str_array57);
    java.lang.String str59 = bcApplication51.bracket(str_array57);
    java.util.List list60 = sortApplication40.sortSimpleNumbersSpecialChars(str_array57);
    java.util.List list61 = sortApplication29.numericalSortNumbers(str_array57);
    java.util.List list62 = sortApplication1.numericalSortSimpleNumbersSpecialChars(str_array57);
    java.io.InputStream inputStream63 = null;
    java.io.OutputStream outputStream64 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array57, inputStream63, outputStream64);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "-hi!"+ "'", str58.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.util.List list26 = sortApplication6.sortSimpleNumbersSpecialChars(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication27 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication27.sortCapitalNumbers(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.util.List list47 = sortApplication27.sortSimpleNumbersSpecialChars(str_array44);
    java.util.List list48 = sortApplication6.sortSimpleCapital(str_array44);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str49 = bcApplication0.add(str_array44);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortStringsSimple(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication15 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    java.lang.String str24 = bcApplication16.bracket(str_array22);
    java.util.List list25 = sortApplication15.sortCapitalNumbers(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication15.sortSimpleNumbersSpecialChars(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortStringsSimple(str_array43);
    java.util.List list47 = sortApplication15.numericalSortSimpleCapitalSpecialChars(str_array43);
    java.util.List list48 = sortApplication4.numericalSortCapitalSpecialChars(str_array43);
    java.lang.String str49 = bcApplication0.not(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication50 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.lang.String str58 = bcApplication55.negate(str_array57);
    java.lang.String str59 = bcApplication51.bracket(str_array57);
    java.util.List list60 = sortApplication50.sortCapitalNumbers(str_array57);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication65 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!" };
    java.lang.String str68 = bcApplication65.negate(str_array67);
    java.lang.String str69 = bcApplication61.bracket(str_array67);
    java.util.List list70 = sortApplication50.sortSimpleNumbersSpecialChars(str_array67);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication71 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!" };
    java.lang.String str79 = bcApplication76.negate(str_array78);
    java.lang.String str80 = bcApplication72.bracket(str_array78);
    java.util.List list81 = sortApplication71.sortCapitalNumbers(str_array78);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication82 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array84 = new java.lang.String[] { "hi!" };
    java.lang.String str85 = bcApplication82.negate(str_array84);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication86 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array88 = new java.lang.String[] { "hi!" };
    java.lang.String str89 = bcApplication86.negate(str_array88);
    java.lang.String str90 = bcApplication82.bracket(str_array88);
    java.util.List list91 = sortApplication71.sortSimpleNumbersSpecialChars(str_array88);
    java.util.List list92 = sortApplication50.sortSimpleCapital(str_array88);
    java.lang.String str93 = bcApplication0.negate(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "0"+ "'", str49.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "-hi!"+ "'", str58.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "-hi!"+ "'", str68.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!"+ "'", str69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "-hi!"+ "'", str79.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "-hi!"+ "'", str85.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "-hi!"+ "'", str89.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!"+ "'", str90.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "-hi!"+ "'", str93.equals("-hi!"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.lang.String str21 = bcApplication18.bracket(str_array20);
    java.util.List list22 = sortApplication7.numericalSortNumbers(str_array20);
    java.util.List list23 = sortApplication6.sortAll(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.lang.String str34 = bcApplication24.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.lang.String str44 = bcApplication24.not(str_array41);
    java.util.List list45 = sortApplication6.numericalSortSimpleNumbersSpecialChars(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication46.sortStringsSimple(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication46.sortSimpleCapital(str_array64);
    java.util.List list69 = sortApplication6.numericalSortSimpleCapitalSpecialChars(str_array64);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str70 = bcApplication0.divide(str_array64);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "0"+ "'", str44.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortStringsSimple(str_array29);
    java.util.List list33 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array29);
    java.util.List list34 = sortApplication0.sortCapitalSpecialChars(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    java.lang.String str0 = sg.edu.nus.comp.cs4218.impl.app.CommApplication.EXP_NULL_POINTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Output stream is null"+ "'", str0.equals("Output stream is null"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    boolean b5 = bcApplication0.isValidBracketMatching("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    java.lang.String str14 = bcApplication6.bracket(str_array12);
    java.lang.String str16 = bcApplication6.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.lang.String str26 = bcApplication6.not(str_array23);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str27 = bcApplication0.lessThanOrEqual(str_array23);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "0"+ "'", str26.equals("0"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.lang.String str20 = bcApplication0.not(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication21 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication21.sortStringsSimple(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication32 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication32.sortCapitalNumbers(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication43 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!" };
    java.lang.String str46 = bcApplication43.negate(str_array45);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    java.lang.String str51 = bcApplication43.bracket(str_array49);
    java.util.List list52 = sortApplication32.sortSimpleNumbersSpecialChars(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication53 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication54 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    java.lang.String str57 = bcApplication54.negate(str_array56);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    java.lang.String str62 = bcApplication54.bracket(str_array60);
    java.util.List list63 = sortApplication53.sortStringsSimple(str_array60);
    java.util.List list64 = sortApplication32.numericalSortSimpleCapitalSpecialChars(str_array60);
    java.util.List list65 = sortApplication21.numericalSortCapitalSpecialChars(str_array60);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str66 = bcApplication0.and(str_array60);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0"+ "'", str20.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "-hi!"+ "'", str46.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "-hi!"+ "'", str57.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list65);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortStringsSimple(str_array29);
    java.util.List list33 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array29);
    java.io.InputStream inputStream34 = null;
    java.io.OutputStream outputStream35 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array29, inputStream34, outputStream35);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String[] str_array4 = null;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str5 = bcApplication0.and(str_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication11.sortAll(str_array25);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str29 = bcApplication0.lessThan(str_array25);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "" };
    java.lang.String str14 = bcApplication11.bracket(str_array13);
    java.lang.String str15 = bcApplication0.bracket(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication16 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.util.List list26 = sortApplication16.sortCapitalNumbers(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication27 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication27.sortCapitalNumbers(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "" };
    java.lang.String str41 = bcApplication38.bracket(str_array40);
    java.util.List list42 = sortApplication27.numericalSortNumbers(str_array40);
    java.util.List list43 = sortApplication16.numericalSortSimpleNumbers(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    java.util.List list55 = sortApplication16.sortSimpleCapital(str_array51);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str56 = bcApplication0.or(str_array51);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication1 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortStringsSimple(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication13 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    java.lang.String str22 = bcApplication14.bracket(str_array20);
    java.util.List list23 = sortApplication13.sortStringsSimple(str_array20);
    java.util.List list24 = sortApplication2.sortSimpleCapital(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortCapitalNumbers(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    java.lang.String str44 = bcApplication36.bracket(str_array42);
    java.util.List list45 = sortApplication25.sortSimpleNumbersSpecialChars(str_array42);
    java.util.List list46 = sortApplication2.numericalSortSimpleCapital(str_array42);
    java.lang.String str47 = commApplication1.commOnlyFirst(str_array42);
    java.io.InputStream inputStream48 = null;
    java.io.OutputStream outputStream49 = null;
    // The following exception was thrown during execution in test generation
    try {
      calApplication0.run(str_array42, inputStream48, outputStream49);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException");
    } catch (sg.edu.nus.comp.cs4218.exception.CalException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.CalException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str47.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.lang.String str20 = bcApplication17.bracket(str_array19);
    java.util.List list21 = sortApplication6.numericalSortNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.lang.String str36 = bcApplication33.bracket(str_array35);
    java.util.List list37 = sortApplication22.numericalSortNumbers(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "" };
    java.lang.String str41 = bcApplication38.bracket(str_array40);
    java.lang.String str43 = bcApplication38.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication55 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.util.List list65 = sortApplication55.sortCapitalNumbers(str_array62);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!" };
    java.lang.String str69 = bcApplication66.negate(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication70 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!" };
    java.lang.String str73 = bcApplication70.negate(str_array72);
    java.lang.String str74 = bcApplication66.bracket(str_array72);
    java.util.List list75 = sortApplication55.sortSimpleNumbersSpecialChars(str_array72);
    java.util.List list76 = sortApplication44.numericalSortNumbers(str_array72);
    java.lang.String str77 = bcApplication38.not(str_array72);
    java.util.List list78 = sortApplication22.numericalSortSimpleNumbers(str_array72);
    java.util.List list79 = sortApplication6.sortSimpleNumbersSpecialChars(str_array72);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str80 = bcApplication0.pow(str_array72);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "-hi!"+ "'", str69.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "-hi!"+ "'", str73.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!"+ "'", str74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "0"+ "'", str77.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    java.lang.String str5 = bcApplication2.bracket(str_array4);
    java.util.List list6 = sortApplication1.sortStringsCapital(str_array4);
    java.lang.String str7 = bcApplication0.not(str_array4);
    boolean b9 = bcApplication0.isValidBracketMatching("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str12 = calApplication0.printCalForMonthYear(str_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    java.lang.String str13 = bcApplication5.bracket(str_array11);
    java.util.List list14 = sortApplication4.sortCapitalNumbers(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication15 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    java.lang.String str24 = bcApplication16.bracket(str_array22);
    java.util.List list25 = sortApplication15.sortCapitalNumbers(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.lang.String str29 = bcApplication26.bracket(str_array28);
    java.util.List list30 = sortApplication15.numericalSortNumbers(str_array28);
    java.util.List list31 = sortApplication4.numericalSortSimpleNumbers(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication32 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication32.sortCapitalNumbers(str_array39);
    java.util.List list43 = sortApplication4.sortSimpleCapital(str_array39);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str44 = bcApplication0.equalEqual(str_array39);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication1 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortStringsSimple(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication13 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    java.lang.String str22 = bcApplication14.bracket(str_array20);
    java.util.List list23 = sortApplication13.sortStringsSimple(str_array20);
    java.util.List list24 = sortApplication2.sortSimpleCapital(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortCapitalNumbers(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    java.lang.String str44 = bcApplication36.bracket(str_array42);
    java.util.List list45 = sortApplication25.sortSimpleNumbersSpecialChars(str_array42);
    java.util.List list46 = sortApplication2.numericalSortSimpleCapital(str_array42);
    java.lang.String str47 = commApplication1.commOnlyFirst(str_array42);
    java.io.InputStream inputStream48 = null;
    java.io.OutputStream outputStream49 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array42, inputStream48, outputStream49);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str47.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication9 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication10 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication10.sortStringsSimple(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication21 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication21.sortStringsSimple(str_array28);
    java.util.List list32 = sortApplication10.sortSimpleCapital(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication33 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    java.lang.String str42 = bcApplication34.bracket(str_array40);
    java.util.List list43 = sortApplication33.sortCapitalNumbers(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication44 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!" };
    java.lang.String str47 = bcApplication44.negate(str_array46);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    java.lang.String str52 = bcApplication44.bracket(str_array50);
    java.util.List list53 = sortApplication33.sortSimpleNumbersSpecialChars(str_array50);
    java.util.List list54 = sortApplication10.numericalSortSimpleCapital(str_array50);
    java.lang.String str55 = commApplication9.commOnlyFirst(str_array50);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str56 = bcApplication0.multiply(str_array50);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "-hi!"+ "'", str47.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str55.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication0.sortSimpleNumbersSpecialChars(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortStringsSimple(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication36.numericalSortSimpleCapitalSpecialChars(str_array64);
    java.util.List list69 = sortApplication25.numericalSortCapitalSpecialChars(str_array64);
    java.lang.String str70 = bcApplication21.not(str_array64);
    java.util.List list71 = sortApplication0.sortCapitalNumbers(str_array64);
    java.lang.String[] str_array72 = null;
    java.io.InputStream inputStream73 = null;
    java.io.OutputStream outputStream74 = null;
    // The following exception was thrown during execution in test generation
    try {
      sortApplication0.run(str_array72, inputStream73, outputStream74);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException");
    } catch (sg.edu.nus.comp.cs4218.exception.SortException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.SortException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0"+ "'", str70.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication11.sortAll(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.lang.String str39 = bcApplication29.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication44 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!" };
    java.lang.String str47 = bcApplication44.negate(str_array46);
    java.lang.String str48 = bcApplication40.bracket(str_array46);
    java.lang.String str49 = bcApplication29.not(str_array46);
    java.util.List list50 = sortApplication11.numericalSortSimpleNumbersSpecialChars(str_array46);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication51 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication51.sortStringsSimple(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication62 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.lang.String str66 = bcApplication63.negate(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    java.lang.String str71 = bcApplication63.bracket(str_array69);
    java.util.List list72 = sortApplication62.sortStringsSimple(str_array69);
    java.util.List list73 = sortApplication51.sortSimpleCapital(str_array69);
    java.util.List list74 = sortApplication11.numericalSortSimpleCapitalSpecialChars(str_array69);
    java.util.List list75 = sortApplication0.numericalSortStringsSimple(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication76 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication77 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication78 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array80 = new java.lang.String[] { "hi!" };
    java.lang.String str81 = bcApplication78.negate(str_array80);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication82 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array84 = new java.lang.String[] { "hi!" };
    java.lang.String str85 = bcApplication82.negate(str_array84);
    java.lang.String str86 = bcApplication78.bracket(str_array84);
    java.util.List list87 = sortApplication77.sortCapitalNumbers(str_array84);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication88 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array90 = new java.lang.String[] { "" };
    java.lang.String str91 = bcApplication88.bracket(str_array90);
    java.util.List list92 = sortApplication77.numericalSortNumbers(str_array90);
    java.util.List list93 = sortApplication76.sortAll(str_array90);
    java.util.List list94 = sortApplication0.sortSimpleNumbersSpecialChars(str_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "-hi!"+ "'", str47.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "0"+ "'", str49.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-hi!"+ "'", str66.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!"+ "'", str71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "-hi!"+ "'", str81.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "-hi!"+ "'", str85.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "hi!"+ "'", str86.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + ""+ "'", str91.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list94);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    boolean b2 = bcApplication0.isValidBracketMatching("0");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication3 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    java.lang.String str12 = bcApplication4.bracket(str_array10);
    java.util.List list13 = sortApplication3.sortCapitalNumbers(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    java.lang.String str22 = bcApplication14.bracket(str_array20);
    java.util.List list23 = sortApplication3.sortSimpleNumbersSpecialChars(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortCapitalNumbers(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.util.List list44 = sortApplication24.sortSimpleNumbersSpecialChars(str_array41);
    java.util.List list45 = sortApplication3.sortSimpleCapitalNumber(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication46.sortCapitalNumbers(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "" };
    java.lang.String str60 = bcApplication57.bracket(str_array59);
    java.util.List list61 = sortApplication46.numericalSortNumbers(str_array59);
    java.util.List list62 = sortApplication3.sortCapitalNumbers(str_array59);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str63 = bcApplication0.divide(str_array59);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication19 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "" };
    java.lang.String str23 = bcApplication20.bracket(str_array22);
    java.util.List list24 = sortApplication19.sortStringsCapital(str_array22);
    java.lang.String str25 = bcApplication18.not(str_array22);
    java.util.List list26 = sortApplication0.sortNumbersSpecialChars(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication27 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array28 = null;
    java.lang.String str29 = commApplication27.commNoMatches(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "" };
    java.lang.String str33 = bcApplication30.bracket(str_array32);
    java.lang.String str35 = bcApplication30.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication47 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    java.lang.String str56 = bcApplication48.bracket(str_array54);
    java.util.List list57 = sortApplication47.sortCapitalNumbers(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication47.sortSimpleNumbersSpecialChars(str_array64);
    java.util.List list68 = sortApplication36.numericalSortNumbers(str_array64);
    java.lang.String str69 = bcApplication30.not(str_array64);
    java.lang.String str70 = commApplication27.commOnlySecond(str_array64);
    java.util.List list71 = sortApplication0.sortCapitalSpecialChars(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0"+ "'", str25.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str29.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "0"+ "'", str69.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str70.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortCapitalNumbers(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication17 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication17.sortCapitalNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication17.sortSimpleNumbersSpecialChars(str_array34);
    java.util.List list38 = sortApplication6.numericalSortNumbers(str_array34);
    java.lang.String str39 = bcApplication0.not(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortStringsSimple(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication51 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication51.sortStringsSimple(str_array58);
    java.util.List list62 = sortApplication40.sortSimpleCapital(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication63 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication64 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!" };
    java.lang.String str67 = bcApplication64.negate(str_array66);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication68 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array70 = new java.lang.String[] { "hi!" };
    java.lang.String str71 = bcApplication68.negate(str_array70);
    java.lang.String str72 = bcApplication64.bracket(str_array70);
    java.util.List list73 = sortApplication63.sortCapitalNumbers(str_array70);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "hi!" };
    java.lang.String str77 = bcApplication74.negate(str_array76);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication78 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array80 = new java.lang.String[] { "hi!" };
    java.lang.String str81 = bcApplication78.negate(str_array80);
    java.lang.String str82 = bcApplication74.bracket(str_array80);
    java.util.List list83 = sortApplication63.sortSimpleNumbersSpecialChars(str_array80);
    java.util.List list84 = sortApplication40.numericalSortSimpleCapital(str_array80);
    java.io.InputStream inputStream85 = null;
    java.io.OutputStream outputStream86 = null;
    // The following exception was thrown during execution in test generation
    try {
      bcApplication0.run(str_array80, inputStream85, outputStream86);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException");
    } catch (sg.edu.nus.comp.cs4218.exception.BcException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.BcException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.BcException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "0"+ "'", str39.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "-hi!"+ "'", str67.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "-hi!"+ "'", str71.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "-hi!"+ "'", str77.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "-hi!"+ "'", str81.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!"+ "'", str82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list84);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    sg.edu.nus.comp.cs4218.impl.app.DateApplication dateApplication0 = new sg.edu.nus.comp.cs4218.impl.app.DateApplication();

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    java.lang.String str4 = bcApplication1.bracket(str_array3);
    java.util.List list5 = sortApplication0.sortStringsCapital(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.lang.String str21 = bcApplication18.bracket(str_array20);
    java.util.List list22 = sortApplication7.numericalSortNumbers(str_array20);
    java.util.List list23 = sortApplication6.sortAll(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.util.List list33 = sortApplication6.sortNumbers(str_array30);
    java.io.InputStream inputStream34 = null;
    java.io.OutputStream outputStream35 = null;
    // The following exception was thrown during execution in test generation
    try {
      sortApplication0.run(str_array30, inputStream34, outputStream35);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException");
    } catch (sg.edu.nus.comp.cs4218.exception.SortException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.SortException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication29 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.util.List list39 = sortApplication29.sortStringsSimple(str_array36);
    java.util.List list40 = sortApplication1.numericalSortNumbersSpecialChars(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "" };
    java.lang.String str45 = bcApplication42.bracket(str_array44);
    java.util.List list46 = sortApplication41.sortStringsCapital(str_array44);
    java.util.List list47 = sortApplication1.numericalSortSimpleNumbers(str_array44);
    java.io.InputStream inputStream48 = null;
    java.io.OutputStream outputStream49 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array44, inputStream48, outputStream49);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    java.lang.String str29 = calApplication0.printCalWithMondayFirst(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication30 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    java.lang.String str39 = bcApplication31.bracket(str_array37);
    java.util.List list40 = sortApplication30.sortCapitalNumbers(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication30.sortSimpleNumbersSpecialChars(str_array47);
    java.io.InputStream inputStream51 = null;
    java.io.OutputStream outputStream52 = null;
    // The following exception was thrown during execution in test generation
    try {
      calApplication0.run(str_array47, inputStream51, outputStream52);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException");
    } catch (sg.edu.nus.comp.cs4218.exception.CalException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.CalException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"+ "'", str29.equals("     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "" };
    java.lang.String str36 = bcApplication33.bracket(str_array35);
    java.util.List list37 = sortApplication22.numericalSortNumbers(str_array35);
    java.util.List list38 = sortApplication11.numericalSortSimpleNumbers(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication39 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication44 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array46 = new java.lang.String[] { "hi!" };
    java.lang.String str47 = bcApplication44.negate(str_array46);
    java.lang.String str48 = bcApplication40.bracket(str_array46);
    java.util.List list49 = sortApplication39.sortStringsSimple(str_array46);
    java.util.List list50 = sortApplication11.numericalSortNumbersSpecialChars(str_array46);
    java.util.List list51 = sortApplication0.sortSimpleCapitalSpecialChars(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "-hi!"+ "'", str47.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    java.lang.String str5 = bcApplication0.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.lang.String str21 = bcApplication18.bracket(str_array20);
    java.util.List list22 = sortApplication7.numericalSortNumbers(str_array20);
    java.util.List list23 = sortApplication6.sortAll(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "" };
    java.lang.String str29 = bcApplication26.bracket(str_array28);
    java.util.List list30 = sortApplication25.sortStringsCapital(str_array28);
    java.lang.String str31 = bcApplication24.not(str_array28);
    java.util.List list32 = sortApplication6.sortNumbersSpecialChars(str_array28);
    java.lang.String str33 = bcApplication0.bracket(str_array28);
    java.lang.String[] str_array35 = new java.lang.String[] { "comm: terminated with error message comm: File not found" };
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str36 = bcApplication0.lessThan(str_array35);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "0"+ "'", str31.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    boolean b5 = bcApplication0.isValidBracketMatching("hi!");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication8 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array10 = new java.lang.String[] { "hi!" };
    java.lang.String str11 = bcApplication8.negate(str_array10);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    java.lang.String str16 = bcApplication8.bracket(str_array14);
    java.util.List list17 = sortApplication7.sortCapitalNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "" };
    java.lang.String str21 = bcApplication18.bracket(str_array20);
    java.util.List list22 = sortApplication7.numericalSortNumbers(str_array20);
    java.util.List list23 = sortApplication6.sortAll(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.lang.String str34 = bcApplication24.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.lang.String str44 = bcApplication24.not(str_array41);
    java.util.List list45 = sortApplication6.numericalSortSimpleNumbersSpecialChars(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication46.sortStringsSimple(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication46.sortSimpleCapital(str_array64);
    java.util.List list69 = sortApplication6.numericalSortSimpleCapitalSpecialChars(str_array64);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str70 = bcApplication0.pow(str_array64);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "-hi!"+ "'", str11.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "0"+ "'", str44.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array1 = null;
    java.lang.String str2 = commApplication0.commNoMatches(str_array1);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.lang.String str6 = bcApplication3.bracket(str_array5);
    java.lang.String str8 = bcApplication3.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication9 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    java.lang.String str18 = bcApplication10.bracket(str_array16);
    java.util.List list19 = sortApplication9.sortCapitalNumbers(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication20 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    java.lang.String str29 = bcApplication21.bracket(str_array27);
    java.util.List list30 = sortApplication20.sortCapitalNumbers(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    java.lang.String str39 = bcApplication31.bracket(str_array37);
    java.util.List list40 = sortApplication20.sortSimpleNumbersSpecialChars(str_array37);
    java.util.List list41 = sortApplication9.numericalSortNumbers(str_array37);
    java.lang.String str42 = bcApplication3.not(str_array37);
    java.lang.String str43 = commApplication0.commOnlySecond(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication55 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.util.List list65 = sortApplication55.sortCapitalNumbers(str_array62);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "" };
    java.lang.String str69 = bcApplication66.bracket(str_array68);
    java.util.List list70 = sortApplication55.numericalSortNumbers(str_array68);
    java.util.List list71 = sortApplication44.numericalSortSimpleNumbers(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication72 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication72.sortStringsSimple(str_array79);
    java.util.List list83 = sortApplication44.numericalSortNumbersSpecialChars(str_array79);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication84 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication85 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array87 = new java.lang.String[] { "" };
    java.lang.String str88 = bcApplication85.bracket(str_array87);
    java.util.List list89 = sortApplication84.sortStringsCapital(str_array87);
    java.util.List list90 = sortApplication44.numericalSortSimpleNumbers(str_array87);
    java.lang.String str91 = commApplication0.commOnlyFirst(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str2.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0"+ "'", str42.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str43.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + ""+ "'", str88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str91.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortStringsSimple(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortStringsSimple(str_array18);
    java.util.List list22 = sortApplication0.sortSimpleCapital(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortCapitalNumbers(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "" };
    java.lang.String str38 = bcApplication35.bracket(str_array37);
    java.util.List list39 = sortApplication24.numericalSortNumbers(str_array37);
    java.util.List list40 = sortApplication23.sortAll(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication23.sortNumbers(str_array47);
    java.util.List list51 = sortApplication0.sortSimpleNumbers(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication4 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication5 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    java.lang.String str14 = bcApplication6.bracket(str_array12);
    java.util.List list15 = sortApplication5.sortStringsSimple(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication16 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.util.List list26 = sortApplication16.sortCapitalNumbers(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    java.lang.String str35 = bcApplication27.bracket(str_array33);
    java.util.List list36 = sortApplication16.sortSimpleNumbersSpecialChars(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication37 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.util.List list47 = sortApplication37.sortStringsSimple(str_array44);
    java.util.List list48 = sortApplication16.numericalSortSimpleCapitalSpecialChars(str_array44);
    java.util.List list49 = sortApplication5.numericalSortCapitalSpecialChars(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication50 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "hi!" };
    java.lang.String str58 = bcApplication55.negate(str_array57);
    java.lang.String str59 = bcApplication51.bracket(str_array57);
    java.util.List list60 = sortApplication50.sortCapitalNumbers(str_array57);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication65 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!" };
    java.lang.String str68 = bcApplication65.negate(str_array67);
    java.lang.String str69 = bcApplication61.bracket(str_array67);
    java.util.List list70 = sortApplication50.sortSimpleNumbersSpecialChars(str_array67);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication71 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!" };
    java.lang.String str79 = bcApplication76.negate(str_array78);
    java.lang.String str80 = bcApplication72.bracket(str_array78);
    java.util.List list81 = sortApplication71.sortStringsSimple(str_array78);
    java.util.List list82 = sortApplication50.numericalSortSimpleCapitalSpecialChars(str_array78);
    java.util.List list83 = sortApplication5.sortCapitalSpecialChars(str_array78);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication84 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication85 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array87 = new java.lang.String[] { "" };
    java.lang.String str88 = bcApplication85.bracket(str_array87);
    java.util.List list89 = sortApplication84.sortStringsCapital(str_array87);
    java.util.List list90 = sortApplication5.sortSimpleCapitalNumber(str_array87);
    java.lang.String str91 = calApplication4.printCal(str_array87);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str92 = bcApplication0.greaterThanOrEqual(str_array87);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "-hi!"+ "'", str58.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!"+ "'", str59.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "-hi!"+ "'", str68.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!"+ "'", str69.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "-hi!"+ "'", str79.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + ""+ "'", str88.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "     March 2016\nSu Mo Tu We Th Fr Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31\n"+ "'", str91.equals("     March 2016\nSu Mo Tu We Th Fr Sa\n       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication4 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array6 = new java.lang.String[] { "hi!" };
    java.lang.String str7 = bcApplication4.negate(str_array6);
    java.lang.String str8 = bcApplication0.bracket(str_array6);
    java.lang.String str10 = bcApplication0.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication11.sortSimpleNumbersSpecialChars(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication32 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication32.sortCapitalNumbers(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication43 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!" };
    java.lang.String str46 = bcApplication43.negate(str_array45);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    java.lang.String str51 = bcApplication43.bracket(str_array49);
    java.util.List list52 = sortApplication32.sortSimpleNumbersSpecialChars(str_array49);
    java.util.List list53 = sortApplication11.sortSimpleCapitalNumber(str_array49);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str54 = bcApplication0.divide(str_array49);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "-hi!"+ "'", str7.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "-hi!"+ "'", str46.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list53);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortStringsSimple(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication13 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    java.lang.String str22 = bcApplication14.bracket(str_array20);
    java.util.List list23 = sortApplication13.sortStringsSimple(str_array20);
    java.util.List list24 = sortApplication2.sortSimpleCapital(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortStringsSimple(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    java.lang.String str65 = bcApplication57.bracket(str_array63);
    java.lang.String str67 = bcApplication57.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication68 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array70 = new java.lang.String[] { "hi!" };
    java.lang.String str71 = bcApplication68.negate(str_array70);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array74 = new java.lang.String[] { "hi!" };
    java.lang.String str75 = bcApplication72.negate(str_array74);
    java.lang.String str76 = bcApplication68.bracket(str_array74);
    java.lang.String str77 = bcApplication57.not(str_array74);
    java.util.List list78 = sortApplication36.numericalSortStringsSimple(str_array74);
    java.util.List list79 = sortApplication25.numericalSortSimpleNumbers(str_array74);
    java.util.List list80 = sortApplication2.sortStringsCapital(str_array74);
    java.lang.String str81 = bcApplication1.number(str_array74);
    java.io.InputStream inputStream82 = null;
    java.io.OutputStream outputStream83 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array74, inputStream82, outputStream83);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!"+ "'", str67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "-hi!"+ "'", str71.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "-hi!"+ "'", str75.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!"+ "'", str76.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "0"+ "'", str77.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    sg.edu.nus.comp.cs4218.impl.app.FmtApplication fmtApplication0 = new sg.edu.nus.comp.cs4218.impl.app.FmtApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.io.InputStream inputStream10 = null;
    java.io.OutputStream outputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
      fmtApplication0.run(str_array7, inputStream10, outputStream11);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException");
    } catch (sg.edu.nus.comp.cs4218.exception.FmtException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.FmtException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.FmtException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication12.sortSimpleNumbersSpecialChars(str_array29);
    java.util.List list33 = sortApplication11.sortSimpleNumbers(str_array29);
    java.util.List list34 = sortApplication0.numericalSortSimpleSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication35 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    java.util.List list57 = sortApplication35.sortSimpleNumbers(str_array53);
    java.util.List list58 = sortApplication0.numericalSortSpecialChars(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list58);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortStringsSimple(str_array29);
    java.util.List list33 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.util.List list38 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "" };
    java.lang.String str42 = bcApplication39.bracket(str_array41);
    java.lang.String str44 = bcApplication39.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication45 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    java.lang.String str54 = bcApplication46.bracket(str_array52);
    java.util.List list55 = sortApplication45.sortCapitalNumbers(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication56 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    java.lang.String str65 = bcApplication57.bracket(str_array63);
    java.util.List list66 = sortApplication56.sortCapitalNumbers(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication71 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!" };
    java.lang.String str74 = bcApplication71.negate(str_array73);
    java.lang.String str75 = bcApplication67.bracket(str_array73);
    java.util.List list76 = sortApplication56.sortSimpleNumbersSpecialChars(str_array73);
    java.util.List list77 = sortApplication45.numericalSortNumbers(str_array73);
    java.lang.String str78 = bcApplication39.not(str_array73);
    java.util.List list79 = sortApplication1.numericalSortSimpleNumbers(str_array73);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str80 = bcApplication0.multiply(str_array73);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + ""+ "'", str42.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + ""+ "'", str44.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!"+ "'", str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "-hi!"+ "'", str74.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!"+ "'", str75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "0"+ "'", str78.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication0.sortSimpleNumbersSpecialChars(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortStringsSimple(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication36.numericalSortSimpleCapitalSpecialChars(str_array64);
    java.util.List list69 = sortApplication25.numericalSortCapitalSpecialChars(str_array64);
    java.lang.String str70 = bcApplication21.not(str_array64);
    java.util.List list71 = sortApplication0.sortCapitalNumbers(str_array64);
    java.lang.String[] str_array73 = new java.lang.String[] { "comm: terminated with error message comm: File not found" };
    java.util.List list74 = sortApplication0.numericalSortCapitalNumbers(str_array73);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication75 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "" };
    java.lang.String str79 = bcApplication76.bracket(str_array78);
    java.util.List list80 = sortApplication75.sortStringsCapital(str_array78);
    java.util.List list81 = sortApplication0.sortNumbersSpecialChars(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0"+ "'", str70.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + ""+ "'", str79.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list81);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication22.sortSimpleNumbersSpecialChars(str_array39);
    java.util.List list43 = sortApplication1.sortSimpleCapitalNumber(str_array39);
    java.io.InputStream inputStream44 = null;
    java.io.OutputStream outputStream45 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array39, inputStream44, outputStream45);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortStringsSimple(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortStringsSimple(str_array18);
    java.util.List list22 = sortApplication0.sortSimpleCapital(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortCapitalNumbers(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.util.List list44 = sortApplication24.sortSimpleNumbersSpecialChars(str_array41);
    java.util.List list45 = sortApplication23.sortSimpleNumbers(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "" };
    java.lang.String str50 = bcApplication47.bracket(str_array49);
    java.util.List list51 = sortApplication46.sortStringsCapital(str_array49);
    java.util.List list52 = sortApplication23.sortSpecialChars(str_array49);
    java.io.InputStream inputStream53 = null;
    java.io.OutputStream outputStream54 = null;
    // The following exception was thrown during execution in test generation
    try {
      sortApplication0.run(str_array49, inputStream53, outputStream54);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException");
    } catch (sg.edu.nus.comp.cs4218.exception.SortException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.SortException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.SortException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + ""+ "'", str50.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list52);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortStringsSimple(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.util.List list33 = sortApplication23.sortCapitalNumbers(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    java.lang.String str42 = bcApplication34.bracket(str_array40);
    java.util.List list43 = sortApplication23.sortSimpleNumbersSpecialChars(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortStringsSimple(str_array51);
    java.util.List list55 = sortApplication23.numericalSortSimpleCapitalSpecialChars(str_array51);
    java.util.List list56 = sortApplication12.numericalSortCapitalSpecialChars(str_array51);
    java.util.List list57 = sortApplication1.numericalSortSimpleCapitalSpecialChars(str_array51);
    java.io.InputStream inputStream58 = null;
    java.io.OutputStream outputStream59 = null;
    // The following exception was thrown during execution in test generation
    try {
      calApplication0.run(str_array51, inputStream58, outputStream59);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException");
    } catch (sg.edu.nus.comp.cs4218.exception.CalException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.CalException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.CalException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array1 = null;
    java.lang.String str2 = commApplication0.commNoMatches(str_array1);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.lang.String str6 = bcApplication3.bracket(str_array5);
    java.lang.String str8 = bcApplication3.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication9 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    java.lang.String str18 = bcApplication10.bracket(str_array16);
    java.util.List list19 = sortApplication9.sortCapitalNumbers(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication20 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    java.lang.String str29 = bcApplication21.bracket(str_array27);
    java.util.List list30 = sortApplication20.sortCapitalNumbers(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    java.lang.String str39 = bcApplication31.bracket(str_array37);
    java.util.List list40 = sortApplication20.sortSimpleNumbersSpecialChars(str_array37);
    java.util.List list41 = sortApplication9.numericalSortNumbers(str_array37);
    java.lang.String str42 = bcApplication3.not(str_array37);
    java.lang.String str43 = commApplication0.commOnlySecond(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication55 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.util.List list65 = sortApplication55.sortCapitalNumbers(str_array62);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "" };
    java.lang.String str69 = bcApplication66.bracket(str_array68);
    java.util.List list70 = sortApplication55.numericalSortNumbers(str_array68);
    java.util.List list71 = sortApplication44.numericalSortSimpleNumbers(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication72 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication72.sortCapitalNumbers(str_array79);
    java.util.List list83 = sortApplication44.sortSimpleCapital(str_array79);
    java.lang.String str84 = commApplication0.commBothMathches(str_array79);
    java.io.InputStream inputStream85 = null;
    java.io.InputStream inputStream86 = null;
    java.io.OutputStream outputStream87 = null;
    // The following exception was thrown during execution in test generation
    try {
      commApplication0.comm(inputStream85, inputStream86, outputStream87);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str2.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0"+ "'", str42.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str43.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str84.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.lang.String str20 = bcApplication17.bracket(str_array19);
    java.lang.String str22 = bcApplication17.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.util.List list33 = sortApplication23.sortCapitalNumbers(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication34 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.util.List list44 = sortApplication34.sortCapitalNumbers(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication34.sortSimpleNumbersSpecialChars(str_array51);
    java.util.List list55 = sortApplication23.numericalSortNumbers(str_array51);
    java.lang.String str56 = bcApplication17.not(str_array51);
    java.util.List list57 = sortApplication1.numericalSortSimpleNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication58 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication59 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array61 = new java.lang.String[] { "hi!" };
    java.lang.String str62 = bcApplication59.negate(str_array61);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.lang.String str66 = bcApplication63.negate(str_array65);
    java.lang.String str67 = bcApplication59.bracket(str_array65);
    java.util.List list68 = sortApplication58.sortCapitalNumbers(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array71 = new java.lang.String[] { "hi!" };
    java.lang.String str72 = bcApplication69.negate(str_array71);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    java.lang.String str77 = bcApplication69.bracket(str_array75);
    java.util.List list78 = sortApplication58.sortSimpleNumbersSpecialChars(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication79 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication80 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.lang.String str83 = bcApplication80.negate(str_array82);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication84 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array86 = new java.lang.String[] { "hi!" };
    java.lang.String str87 = bcApplication84.negate(str_array86);
    java.lang.String str88 = bcApplication80.bracket(str_array86);
    java.util.List list89 = sortApplication79.sortStringsSimple(str_array86);
    java.util.List list90 = sortApplication58.numericalSortSimpleCapitalSpecialChars(str_array86);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication91 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array93 = new java.lang.String[] { "hi!" };
    java.lang.String str94 = bcApplication91.negate(str_array93);
    java.util.List list95 = sortApplication58.numericalSortSimpleCapitalSpecialChars(str_array93);
    java.util.List list96 = sortApplication1.numericalSortCapitalSpecialChars(str_array93);
    java.io.InputStream inputStream97 = null;
    java.io.OutputStream outputStream98 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array93, inputStream97, outputStream98);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "0"+ "'", str56.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "-hi!"+ "'", str62.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-hi!"+ "'", str66.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!"+ "'", str67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "-hi!"+ "'", str72.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!"+ "'", str77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "-hi!"+ "'", str83.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "-hi!"+ "'", str87.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!"+ "'", str88.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + "-hi!"+ "'", str94.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list96);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortStringsSimple(str_array19);
    java.util.List list23 = sortApplication1.sortSimpleCapital(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortStringsSimple(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication35 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    java.lang.String str44 = bcApplication36.bracket(str_array42);
    java.util.List list45 = sortApplication35.sortCapitalNumbers(str_array42);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    java.lang.String str54 = bcApplication46.bracket(str_array52);
    java.util.List list55 = sortApplication35.sortSimpleNumbersSpecialChars(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.lang.String str66 = bcApplication56.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication71 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!" };
    java.lang.String str74 = bcApplication71.negate(str_array73);
    java.lang.String str75 = bcApplication67.bracket(str_array73);
    java.lang.String str76 = bcApplication56.not(str_array73);
    java.util.List list77 = sortApplication35.numericalSortStringsSimple(str_array73);
    java.util.List list78 = sortApplication24.numericalSortSimpleNumbers(str_array73);
    java.util.List list79 = sortApplication1.sortStringsCapital(str_array73);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str80 = calApplication0.printCalForYearMondayFirst(str_array73);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!"+ "'", str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "-hi!"+ "'", str74.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!"+ "'", str75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "0"+ "'", str76.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    java.lang.String str0 = sg.edu.nus.comp.cs4218.impl.app.CommApplication.EXP_INVALID_ARGS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Invalid args"+ "'", str0.equals("Invalid args"));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array1 = null;
    java.lang.String str2 = commApplication0.commNoMatches(str_array1);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.lang.String str13 = bcApplication3.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    java.lang.String str22 = bcApplication14.bracket(str_array20);
    java.lang.String str23 = bcApplication3.not(str_array20);
    java.lang.String str24 = commApplication0.commOnlyFirst(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str2.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "0"+ "'", str23.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str24.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "" };
    java.lang.String str25 = bcApplication22.bracket(str_array24);
    java.util.List list26 = sortApplication11.numericalSortNumbers(str_array24);
    java.util.List list27 = sortApplication0.numericalSortSimpleNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication28 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.util.List list38 = sortApplication28.sortStringsSimple(str_array35);
    java.util.List list39 = sortApplication0.numericalSortNumbersSpecialChars(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortCapitalNumbers(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "" };
    java.lang.String str54 = bcApplication51.bracket(str_array53);
    java.util.List list55 = sortApplication40.sortCapitalNumbers(str_array53);
    java.util.List list56 = sortApplication0.sortCapitalNumbers(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortCapitalNumbers(str_array64);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication68 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication69 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication70 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!" };
    java.lang.String str73 = bcApplication70.negate(str_array72);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "hi!" };
    java.lang.String str77 = bcApplication74.negate(str_array76);
    java.lang.String str78 = bcApplication70.bracket(str_array76);
    java.util.List list79 = sortApplication69.sortCapitalNumbers(str_array76);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication80 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.lang.String str83 = bcApplication80.negate(str_array82);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication84 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array86 = new java.lang.String[] { "hi!" };
    java.lang.String str87 = bcApplication84.negate(str_array86);
    java.lang.String str88 = bcApplication80.bracket(str_array86);
    java.util.List list89 = sortApplication69.sortSimpleNumbersSpecialChars(str_array86);
    java.util.List list90 = sortApplication68.sortSimpleNumbers(str_array86);
    java.util.List list91 = sortApplication57.numericalSortSimpleSpecialChars(str_array86);
    java.util.List list92 = sortApplication0.numericalSortSpecialChars(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "-hi!"+ "'", str73.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "-hi!"+ "'", str77.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!"+ "'", str78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "-hi!"+ "'", str83.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "-hi!"+ "'", str87.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!"+ "'", str88.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list92);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.lang.String str28 = bcApplication18.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.lang.String str38 = bcApplication18.not(str_array35);
    java.util.List list39 = sortApplication0.numericalSortSimpleNumbersSpecialChars(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication40 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    java.lang.String str49 = bcApplication41.bracket(str_array47);
    java.util.List list50 = sortApplication40.sortStringsSimple(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication51 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication51.sortStringsSimple(str_array58);
    java.util.List list62 = sortApplication40.sortSimpleCapital(str_array58);
    java.util.List list63 = sortApplication0.numericalSortSimpleCapitalSpecialChars(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication64 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication65 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!" };
    java.lang.String str68 = bcApplication65.negate(str_array67);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array71 = new java.lang.String[] { "hi!" };
    java.lang.String str72 = bcApplication69.negate(str_array71);
    java.lang.String str73 = bcApplication65.bracket(str_array71);
    java.util.List list74 = sortApplication64.sortCapitalNumbers(str_array71);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication75 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication76 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array78 = new java.lang.String[] { "hi!" };
    java.lang.String str79 = bcApplication76.negate(str_array78);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication80 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.lang.String str83 = bcApplication80.negate(str_array82);
    java.lang.String str84 = bcApplication76.bracket(str_array82);
    java.util.List list85 = sortApplication75.sortCapitalNumbers(str_array82);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication86 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array88 = new java.lang.String[] { "" };
    java.lang.String str89 = bcApplication86.bracket(str_array88);
    java.util.List list90 = sortApplication75.numericalSortNumbers(str_array88);
    java.util.List list91 = sortApplication64.numericalSortSimpleNumbers(str_array88);
    java.util.List list92 = sortApplication0.sortAll(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "0"+ "'", str38.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "-hi!"+ "'", str68.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "-hi!"+ "'", str72.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!"+ "'", str73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "-hi!"+ "'", str79.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "-hi!"+ "'", str83.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!"+ "'", str84.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + ""+ "'", str89.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list92);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    boolean b5 = bcApplication0.isValidBracketMatching("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    java.lang.String str14 = bcApplication6.bracket(str_array12);
    java.lang.String str16 = bcApplication6.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "" };
    java.lang.String str20 = bcApplication17.bracket(str_array19);
    java.lang.String str21 = bcApplication6.bracket(str_array19);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str22 = bcApplication0.and(str_array19);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    sg.edu.nus.comp.cs4218.impl.app.EchoApplication echoApplication0 = new sg.edu.nus.comp.cs4218.impl.app.EchoApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication22.sortSimpleNumbersSpecialChars(str_array39);
    java.util.List list43 = sortApplication1.sortSimpleCapitalNumber(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "" };
    java.lang.String str58 = bcApplication55.bracket(str_array57);
    java.util.List list59 = sortApplication44.numericalSortNumbers(str_array57);
    java.util.List list60 = sortApplication1.sortCapitalNumbers(str_array57);
    java.io.InputStream inputStream61 = null;
    java.io.OutputStream outputStream62 = null;
    // The following exception was thrown during execution in test generation
    try {
      echoApplication0.run(str_array57, inputStream61, outputStream62);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException");
    } catch (sg.edu.nus.comp.cs4218.exception.EchoException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.EchoException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.EchoException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "" };
    java.lang.String str5 = bcApplication2.bracket(str_array4);
    java.util.List list6 = sortApplication1.sortStringsCapital(str_array4);
    java.lang.String str7 = bcApplication0.not(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication8 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    java.lang.String str17 = bcApplication9.bracket(str_array15);
    java.util.List list18 = sortApplication8.sortStringsSimple(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication19 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "hi!" };
    java.lang.String str23 = bcApplication20.negate(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    java.lang.String str28 = bcApplication20.bracket(str_array26);
    java.util.List list29 = sortApplication19.sortStringsSimple(str_array26);
    java.util.List list30 = sortApplication8.sortSimpleCapital(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication31 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    java.lang.String str40 = bcApplication32.bracket(str_array38);
    java.util.List list41 = sortApplication31.sortCapitalNumbers(str_array38);
    java.util.List list42 = sortApplication8.numericalSortStringsCapital(str_array38);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str43 = bcApplication0.pow(str_array38);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0"+ "'", str7.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "-hi!"+ "'", str23.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortCapitalNumbers(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication15 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array17 = new java.lang.String[] { "hi!" };
    java.lang.String str18 = bcApplication15.negate(str_array17);
    java.lang.String str19 = bcApplication11.bracket(str_array17);
    java.util.List list20 = sortApplication0.sortSimpleNumbersSpecialChars(str_array17);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication25 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    java.lang.String str34 = bcApplication26.bracket(str_array32);
    java.util.List list35 = sortApplication25.sortStringsSimple(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication36.sortSimpleNumbersSpecialChars(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication57 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication57.sortStringsSimple(str_array64);
    java.util.List list68 = sortApplication36.numericalSortSimpleCapitalSpecialChars(str_array64);
    java.util.List list69 = sortApplication25.numericalSortCapitalSpecialChars(str_array64);
    java.lang.String str70 = bcApplication21.not(str_array64);
    java.util.List list71 = sortApplication0.sortCapitalNumbers(str_array64);
    java.lang.String[] str_array73 = new java.lang.String[] { "comm: terminated with error message comm: File not found" };
    java.util.List list74 = sortApplication0.numericalSortCapitalNumbers(str_array73);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication75 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication76 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication81 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array83 = new java.lang.String[] { "hi!" };
    java.lang.String str84 = bcApplication81.negate(str_array83);
    java.lang.String str85 = bcApplication77.bracket(str_array83);
    java.util.List list86 = sortApplication76.sortCapitalNumbers(str_array83);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication87 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array89 = new java.lang.String[] { "hi!" };
    java.lang.String str90 = bcApplication87.negate(str_array89);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication91 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array93 = new java.lang.String[] { "hi!" };
    java.lang.String str94 = bcApplication91.negate(str_array93);
    java.lang.String str95 = bcApplication87.bracket(str_array93);
    java.util.List list96 = sortApplication76.sortSimpleNumbersSpecialChars(str_array93);
    java.util.List list97 = sortApplication75.sortSimpleNumbers(str_array93);
    java.util.List list98 = sortApplication0.numericalSortStringsCapital(str_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "-hi!"+ "'", str18.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "0"+ "'", str70.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str84 + "' != '" + "-hi!"+ "'", str84.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!"+ "'", str85.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "-hi!"+ "'", str90.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str94 + "' != '" + "-hi!"+ "'", str94.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!"+ "'", str95.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list98);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication2 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "hi!" };
    java.lang.String str6 = bcApplication3.negate(str_array5);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    java.lang.String str11 = bcApplication3.bracket(str_array9);
    java.util.List list12 = sortApplication2.sortCapitalNumbers(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "" };
    java.lang.String str16 = bcApplication13.bracket(str_array15);
    java.util.List list17 = sortApplication2.numericalSortNumbers(str_array15);
    java.util.List list18 = sortApplication1.sortAll(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    java.lang.String str27 = bcApplication19.bracket(str_array25);
    java.lang.String str29 = bcApplication19.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.lang.String str39 = bcApplication19.not(str_array36);
    java.util.List list40 = sortApplication1.numericalSortSimpleNumbersSpecialChars(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    java.lang.String str50 = bcApplication42.bracket(str_array48);
    java.util.List list51 = sortApplication41.sortCapitalNumbers(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    java.lang.String str60 = bcApplication52.bracket(str_array58);
    java.util.List list61 = sortApplication41.sortSimpleNumbersSpecialChars(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication62 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.lang.String str66 = bcApplication63.negate(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    java.lang.String str71 = bcApplication63.bracket(str_array69);
    java.util.List list72 = sortApplication62.sortCapitalNumbers(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication62.sortSimpleNumbersSpecialChars(str_array79);
    java.util.List list83 = sortApplication41.sortSimpleCapitalNumber(str_array79);
    java.util.List list84 = sortApplication1.sortStringsCapital(str_array79);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication85 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array87 = new java.lang.String[] { "hi!" };
    java.lang.String str88 = bcApplication85.negate(str_array87);
    java.util.List list89 = sortApplication1.sortSimpleCapital(str_array87);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str90 = calApplication0.printCalForMonthYear(str_array87);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "-hi!"+ "'", str6.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "0"+ "'", str39.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!"+ "'", str60.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-hi!"+ "'", str66.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!"+ "'", str71.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "-hi!"+ "'", str88.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication19 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication20 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array22 = new java.lang.String[] { "" };
    java.lang.String str23 = bcApplication20.bracket(str_array22);
    java.util.List list24 = sortApplication19.sortStringsCapital(str_array22);
    java.lang.String str25 = bcApplication18.not(str_array22);
    java.util.List list26 = sortApplication0.sortNumbersSpecialChars(str_array22);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication27 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication27.sortCapitalNumbers(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.util.List list47 = sortApplication27.sortSimpleNumbersSpecialChars(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication52 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    java.lang.String str61 = bcApplication53.bracket(str_array59);
    java.util.List list62 = sortApplication52.sortStringsSimple(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication63 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication64 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!" };
    java.lang.String str67 = bcApplication64.negate(str_array66);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication68 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array70 = new java.lang.String[] { "hi!" };
    java.lang.String str71 = bcApplication68.negate(str_array70);
    java.lang.String str72 = bcApplication64.bracket(str_array70);
    java.util.List list73 = sortApplication63.sortCapitalNumbers(str_array70);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "hi!" };
    java.lang.String str77 = bcApplication74.negate(str_array76);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication78 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array80 = new java.lang.String[] { "hi!" };
    java.lang.String str81 = bcApplication78.negate(str_array80);
    java.lang.String str82 = bcApplication74.bracket(str_array80);
    java.util.List list83 = sortApplication63.sortSimpleNumbersSpecialChars(str_array80);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication84 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication85 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array87 = new java.lang.String[] { "hi!" };
    java.lang.String str88 = bcApplication85.negate(str_array87);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication89 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array91 = new java.lang.String[] { "hi!" };
    java.lang.String str92 = bcApplication89.negate(str_array91);
    java.lang.String str93 = bcApplication85.bracket(str_array91);
    java.util.List list94 = sortApplication84.sortStringsSimple(str_array91);
    java.util.List list95 = sortApplication63.numericalSortSimpleCapitalSpecialChars(str_array91);
    java.util.List list96 = sortApplication52.numericalSortCapitalSpecialChars(str_array91);
    java.lang.String str97 = bcApplication48.not(str_array91);
    java.util.List list98 = sortApplication27.sortCapitalNumbers(str_array91);
    java.util.List list99 = sortApplication0.numericalSortCapitalNumbersSpecialChars(str_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0"+ "'", str25.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "-hi!"+ "'", str67.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "-hi!"+ "'", str71.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "-hi!"+ "'", str77.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "-hi!"+ "'", str81.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!"+ "'", str82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "-hi!"+ "'", str88.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "-hi!"+ "'", str92.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str93 + "' != '" + "hi!"+ "'", str93.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str97 + "' != '" + "0"+ "'", str97.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list99);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "hi!" };
    java.lang.String str3 = bcApplication0.negate(str_array2);
    boolean b5 = bcApplication0.isValidBracketMatching("hi!");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication6 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication7 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array9 = new java.lang.String[] { "hi!" };
    java.lang.String str10 = bcApplication7.negate(str_array9);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication11 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array13 = new java.lang.String[] { "hi!" };
    java.lang.String str14 = bcApplication11.negate(str_array13);
    java.lang.String str15 = bcApplication7.bracket(str_array13);
    java.util.List list16 = sortApplication6.sortStringsSimple(str_array13);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication17 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication17.sortCapitalNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    java.lang.String str36 = bcApplication28.bracket(str_array34);
    java.util.List list37 = sortApplication17.sortSimpleNumbersSpecialChars(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.lang.String str48 = bcApplication38.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    java.lang.String str57 = bcApplication49.bracket(str_array55);
    java.lang.String str58 = bcApplication38.not(str_array55);
    java.util.List list59 = sortApplication17.numericalSortStringsSimple(str_array55);
    java.util.List list60 = sortApplication6.numericalSortSimpleNumbers(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication61 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "hi!" };
    java.lang.String str69 = bcApplication66.negate(str_array68);
    java.lang.String str70 = bcApplication62.bracket(str_array68);
    java.util.List list71 = sortApplication61.sortCapitalNumbers(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication72 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication77 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array79 = new java.lang.String[] { "hi!" };
    java.lang.String str80 = bcApplication77.negate(str_array79);
    java.lang.String str81 = bcApplication73.bracket(str_array79);
    java.util.List list82 = sortApplication72.sortCapitalNumbers(str_array79);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication83 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array85 = new java.lang.String[] { "" };
    java.lang.String str86 = bcApplication83.bracket(str_array85);
    java.util.List list87 = sortApplication72.numericalSortNumbers(str_array85);
    java.util.List list88 = sortApplication61.numericalSortSimpleNumbers(str_array85);
    java.util.List list89 = sortApplication6.sortCapitalNumbers(str_array85);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str90 = bcApplication0.lessThan(str_array85);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "-hi!"+ "'", str3.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-hi!"+ "'", str10.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "-hi!"+ "'", str14.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!"+ "'", str48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "0"+ "'", str58.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "-hi!"+ "'", str69.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!"+ "'", str70.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "-hi!"+ "'", str80.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!"+ "'", str81.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + ""+ "'", str86.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list87);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array1 = null;
    java.lang.String str2 = commApplication0.commNoMatches(str_array1);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication3 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array5 = new java.lang.String[] { "" };
    java.lang.String str6 = bcApplication3.bracket(str_array5);
    java.lang.String str8 = bcApplication3.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication9 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication14 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array16 = new java.lang.String[] { "hi!" };
    java.lang.String str17 = bcApplication14.negate(str_array16);
    java.lang.String str18 = bcApplication10.bracket(str_array16);
    java.util.List list19 = sortApplication9.sortCapitalNumbers(str_array16);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication20 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    java.lang.String str29 = bcApplication21.bracket(str_array27);
    java.util.List list30 = sortApplication20.sortCapitalNumbers(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    java.lang.String str39 = bcApplication31.bracket(str_array37);
    java.util.List list40 = sortApplication20.sortSimpleNumbersSpecialChars(str_array37);
    java.util.List list41 = sortApplication9.numericalSortNumbers(str_array37);
    java.lang.String str42 = bcApplication3.not(str_array37);
    java.lang.String str43 = commApplication0.commOnlySecond(str_array37);
    java.io.InputStream inputStream44 = null;
    java.io.InputStream inputStream45 = null;
    java.io.OutputStream outputStream46 = null;
    // The following exception was thrown during execution in test generation
    try {
      commApplication0.comm(inputStream44, inputStream45, outputStream46);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str2.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "-hi!"+ "'", str17.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0"+ "'", str42.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str43.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    sg.edu.nus.comp.cs4218.impl.app.HeadApplication headApplication0 = new sg.edu.nus.comp.cs4218.impl.app.HeadApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication29 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.util.List list39 = sortApplication29.sortStringsSimple(str_array36);
    java.util.List list40 = sortApplication1.numericalSortNumbersSpecialChars(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "" };
    java.lang.String str45 = bcApplication42.bracket(str_array44);
    java.util.List list46 = sortApplication41.sortStringsCapital(str_array44);
    java.util.List list47 = sortApplication1.numericalSortSimpleNumbers(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "" };
    java.lang.String str51 = bcApplication48.bracket(str_array50);
    java.lang.String str53 = bcApplication48.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication54 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication55 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.util.List list65 = sortApplication55.sortCapitalNumbers(str_array62);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication66 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array68 = new java.lang.String[] { "" };
    java.lang.String str69 = bcApplication66.bracket(str_array68);
    java.util.List list70 = sortApplication55.numericalSortNumbers(str_array68);
    java.util.List list71 = sortApplication54.sortAll(str_array68);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication72 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication73 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "" };
    java.lang.String str77 = bcApplication74.bracket(str_array76);
    java.util.List list78 = sortApplication73.sortStringsCapital(str_array76);
    java.lang.String str79 = bcApplication72.not(str_array76);
    java.util.List list80 = sortApplication54.sortNumbersSpecialChars(str_array76);
    java.lang.String str81 = bcApplication48.bracket(str_array76);
    java.util.List list82 = sortApplication1.numericalSortSimpleNumbers(str_array76);
    java.io.InputStream inputStream83 = null;
    java.io.OutputStream outputStream84 = null;
    // The following exception was thrown during execution in test generation
    try {
      headApplication0.run(str_array76, inputStream83, outputStream84);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.HeadException");
    } catch (sg.edu.nus.comp.cs4218.exception.HeadException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.HeadException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.HeadException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + ""+ "'", str77.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str79 + "' != '" + "0"+ "'", str79.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + ""+ "'", str81.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list82);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortStringsSimple(str_array19);
    java.util.List list23 = sortApplication1.sortSimpleCapital(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortStringsSimple(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication35 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    java.lang.String str44 = bcApplication36.bracket(str_array42);
    java.util.List list45 = sortApplication35.sortCapitalNumbers(str_array42);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    java.lang.String str54 = bcApplication46.bracket(str_array52);
    java.util.List list55 = sortApplication35.sortSimpleNumbersSpecialChars(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication56 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array58 = new java.lang.String[] { "hi!" };
    java.lang.String str59 = bcApplication56.negate(str_array58);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication60 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array62 = new java.lang.String[] { "hi!" };
    java.lang.String str63 = bcApplication60.negate(str_array62);
    java.lang.String str64 = bcApplication56.bracket(str_array62);
    java.lang.String str66 = bcApplication56.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication67 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array69 = new java.lang.String[] { "hi!" };
    java.lang.String str70 = bcApplication67.negate(str_array69);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication71 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array73 = new java.lang.String[] { "hi!" };
    java.lang.String str74 = bcApplication71.negate(str_array73);
    java.lang.String str75 = bcApplication67.bracket(str_array73);
    java.lang.String str76 = bcApplication56.not(str_array73);
    java.util.List list77 = sortApplication35.numericalSortStringsSimple(str_array73);
    java.util.List list78 = sortApplication24.numericalSortSimpleNumbers(str_array73);
    java.util.List list79 = sortApplication1.sortStringsCapital(str_array73);
    java.lang.String str80 = bcApplication0.number(str_array73);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication81 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication82 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array84 = new java.lang.String[] { "hi!" };
    java.lang.String str85 = bcApplication82.negate(str_array84);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication86 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array88 = new java.lang.String[] { "hi!" };
    java.lang.String str89 = bcApplication86.negate(str_array88);
    java.lang.String str90 = bcApplication82.bracket(str_array88);
    java.util.List list91 = sortApplication81.sortCapitalNumbers(str_array88);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication92 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array94 = new java.lang.String[] { "" };
    java.lang.String str95 = bcApplication92.bracket(str_array94);
    java.util.List list96 = sortApplication81.sortCapitalNumbers(str_array94);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str97 = bcApplication0.subtract(str_array94);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!"+ "'", str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "-hi!"+ "'", str59.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "-hi!"+ "'", str63.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "-hi!"+ "'", str70.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "-hi!"+ "'", str74.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!"+ "'", str75.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "0"+ "'", str76.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!"+ "'", str80.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "-hi!"+ "'", str85.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str89 + "' != '" + "-hi!"+ "'", str89.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!"+ "'", str90.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + ""+ "'", str95.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list96);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.lang.String str32 = bcApplication22.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.lang.String str42 = bcApplication22.not(str_array39);
    java.util.List list43 = sortApplication1.numericalSortStringsSimple(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "" };
    java.lang.String str58 = bcApplication55.bracket(str_array57);
    java.util.List list59 = sortApplication44.numericalSortNumbers(str_array57);
    java.util.List list60 = sortApplication1.numericalSortCapitalSpecialChars(str_array57);
    java.lang.String str61 = commApplication0.commOnlySecond(str_array57);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication62 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication63 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication64 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array66 = new java.lang.String[] { "hi!" };
    java.lang.String str67 = bcApplication64.negate(str_array66);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication68 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array70 = new java.lang.String[] { "hi!" };
    java.lang.String str71 = bcApplication68.negate(str_array70);
    java.lang.String str72 = bcApplication64.bracket(str_array70);
    java.util.List list73 = sortApplication63.sortCapitalNumbers(str_array70);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "hi!" };
    java.lang.String str77 = bcApplication74.negate(str_array76);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication78 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array80 = new java.lang.String[] { "hi!" };
    java.lang.String str81 = bcApplication78.negate(str_array80);
    java.lang.String str82 = bcApplication74.bracket(str_array80);
    java.util.List list83 = sortApplication63.sortSimpleNumbersSpecialChars(str_array80);
    java.util.List list84 = sortApplication62.sortSimpleNumbers(str_array80);
    java.lang.String str85 = commApplication0.commBothMathches(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0"+ "'", str42.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str61.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "-hi!"+ "'", str67.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "-hi!"+ "'", str71.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!"+ "'", str72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "-hi!"+ "'", str77.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "-hi!"+ "'", str81.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!"+ "'", str82.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str85 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str85.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortCapitalNumbers(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "" };
    java.lang.String str26 = bcApplication23.bracket(str_array25);
    java.util.List list27 = sortApplication12.numericalSortNumbers(str_array25);
    java.util.List list28 = sortApplication1.numericalSortSimpleNumbers(str_array25);
    java.lang.String str29 = calApplication0.printCalWithMondayFirst(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication30 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication31 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication32 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array34 = new java.lang.String[] { "hi!" };
    java.lang.String str35 = bcApplication32.negate(str_array34);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    java.lang.String str40 = bcApplication32.bracket(str_array38);
    java.util.List list41 = sortApplication31.sortCapitalNumbers(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "" };
    java.lang.String str45 = bcApplication42.bracket(str_array44);
    java.util.List list46 = sortApplication31.numericalSortNumbers(str_array44);
    java.util.List list47 = sortApplication30.sortAll(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    java.lang.String str56 = bcApplication48.bracket(str_array54);
    java.util.List list57 = sortApplication30.sortNumbers(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication58 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication59 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array61 = new java.lang.String[] { "hi!" };
    java.lang.String str62 = bcApplication59.negate(str_array61);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "hi!" };
    java.lang.String str66 = bcApplication63.negate(str_array65);
    java.lang.String str67 = bcApplication59.bracket(str_array65);
    java.util.List list68 = sortApplication58.sortCapitalNumbers(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array71 = new java.lang.String[] { "hi!" };
    java.lang.String str72 = bcApplication69.negate(str_array71);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication73 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array75 = new java.lang.String[] { "hi!" };
    java.lang.String str76 = bcApplication73.negate(str_array75);
    java.lang.String str77 = bcApplication69.bracket(str_array75);
    java.util.List list78 = sortApplication58.sortSimpleNumbersSpecialChars(str_array75);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication79 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication80 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.lang.String str83 = bcApplication80.negate(str_array82);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication84 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array86 = new java.lang.String[] { "hi!" };
    java.lang.String str87 = bcApplication84.negate(str_array86);
    java.lang.String str88 = bcApplication80.bracket(str_array86);
    java.util.List list89 = sortApplication79.sortStringsSimple(str_array86);
    java.util.List list90 = sortApplication58.numericalSortSimpleCapitalSpecialChars(str_array86);
    java.util.List list91 = sortApplication30.sortNumbers(str_array86);
    java.lang.String str92 = calApplication0.printCalWithMondayFirst(str_array86);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication93 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array95 = new java.lang.String[] { "hi!" };
    java.lang.String str96 = bcApplication93.negate(str_array95);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str97 = calApplication0.printCalForMonthYear(str_array95);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"+ "'", str29.equals("     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "-hi!"+ "'", str35.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + ""+ "'", str45.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "-hi!"+ "'", str62.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "-hi!"+ "'", str66.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!"+ "'", str67.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "-hi!"+ "'", str72.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "-hi!"+ "'", str76.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!"+ "'", str77.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "-hi!"+ "'", str83.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "-hi!"+ "'", str87.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!"+ "'", str88.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str92 + "' != '" + "     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"+ "'", str92.equals("     March 2016\nMo Tu We Th Fr Sa Su\n    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array95);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "-hi!"+ "'", str96.equals("-hi!"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array2 = new java.lang.String[] { "" };
    java.lang.String str3 = bcApplication0.bracket(str_array2);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication4 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    java.lang.String str8 = bcApplication5.bracket(str_array7);
    java.util.List list9 = sortApplication4.sortStringsCapital(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication10 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication11.sortSimpleNumbersSpecialChars(str_array28);
    java.util.List list32 = sortApplication10.sortSimpleNumbers(str_array28);
    java.util.List list33 = sortApplication4.numericalSortCapitalNumbersSpecialChars(str_array28);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str34 = bcApplication0.lessThan(str_array28);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortStringsSimple(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication12 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    java.lang.String str21 = bcApplication13.bracket(str_array19);
    java.util.List list22 = sortApplication12.sortStringsSimple(str_array19);
    java.util.List list23 = sortApplication1.sortSimpleCapital(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortCapitalNumbers(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication35 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array37 = new java.lang.String[] { "hi!" };
    java.lang.String str38 = bcApplication35.negate(str_array37);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    java.lang.String str43 = bcApplication35.bracket(str_array41);
    java.util.List list44 = sortApplication24.sortSimpleNumbersSpecialChars(str_array41);
    java.util.List list45 = sortApplication1.numericalSortSimpleCapital(str_array41);
    java.lang.String str46 = commApplication0.commOnlyFirst(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication47 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication48 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    java.lang.String str57 = bcApplication49.bracket(str_array55);
    java.util.List list58 = sortApplication48.sortCapitalNumbers(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication59 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array61 = new java.lang.String[] { "" };
    java.lang.String str62 = bcApplication59.bracket(str_array61);
    java.util.List list63 = sortApplication48.numericalSortNumbers(str_array61);
    java.util.List list64 = sortApplication47.sortAll(str_array61);
    java.lang.String str65 = commApplication0.commBothMathches(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "-hi!"+ "'", str38.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str46.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + ""+ "'", str62.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str65.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.lang.String str32 = bcApplication22.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.lang.String str42 = bcApplication22.not(str_array39);
    java.util.List list43 = sortApplication1.numericalSortStringsSimple(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication44 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication45 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array47 = new java.lang.String[] { "hi!" };
    java.lang.String str48 = bcApplication45.negate(str_array47);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication49 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array51 = new java.lang.String[] { "hi!" };
    java.lang.String str52 = bcApplication49.negate(str_array51);
    java.lang.String str53 = bcApplication45.bracket(str_array51);
    java.util.List list54 = sortApplication44.sortCapitalNumbers(str_array51);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication55 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array57 = new java.lang.String[] { "" };
    java.lang.String str58 = bcApplication55.bracket(str_array57);
    java.util.List list59 = sortApplication44.numericalSortNumbers(str_array57);
    java.util.List list60 = sortApplication1.numericalSortCapitalSpecialChars(str_array57);
    java.lang.String str61 = commApplication0.commOnlySecond(str_array57);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = commApplication0.commOnlyFirst(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "0"+ "'", str42.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "-hi!"+ "'", str48.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "-hi!"+ "'", str52.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str61.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str66.equals("comm: terminated with error message comm: File not found"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortStringsSimple(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortStringsSimple(str_array18);
    java.util.List list22 = sortApplication0.sortSimpleCapital(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "hi!" };
    java.lang.String str27 = bcApplication24.negate(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication28 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array30 = new java.lang.String[] { "hi!" };
    java.lang.String str31 = bcApplication28.negate(str_array30);
    java.lang.String str32 = bcApplication24.bracket(str_array30);
    java.util.List list33 = sortApplication23.sortStringsSimple(str_array30);
    java.util.List list34 = sortApplication0.numericalSortCapitalSpecialChars(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "-hi!"+ "'", str27.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "-hi!"+ "'", str31.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication0 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication5 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication10 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array12 = new java.lang.String[] { "hi!" };
    java.lang.String str13 = bcApplication10.negate(str_array12);
    java.lang.String str14 = bcApplication6.bracket(str_array12);
    java.util.List list15 = sortApplication5.sortStringsSimple(str_array12);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication16 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication17 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array19 = new java.lang.String[] { "hi!" };
    java.lang.String str20 = bcApplication17.negate(str_array19);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication21 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array23 = new java.lang.String[] { "hi!" };
    java.lang.String str24 = bcApplication21.negate(str_array23);
    java.lang.String str25 = bcApplication17.bracket(str_array23);
    java.util.List list26 = sortApplication16.sortCapitalNumbers(str_array23);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication31 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array33 = new java.lang.String[] { "hi!" };
    java.lang.String str34 = bcApplication31.negate(str_array33);
    java.lang.String str35 = bcApplication27.bracket(str_array33);
    java.util.List list36 = sortApplication16.sortSimpleNumbersSpecialChars(str_array33);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication37 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication38 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array40 = new java.lang.String[] { "hi!" };
    java.lang.String str41 = bcApplication38.negate(str_array40);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    java.lang.String str46 = bcApplication38.bracket(str_array44);
    java.util.List list47 = sortApplication37.sortStringsSimple(str_array44);
    java.util.List list48 = sortApplication16.numericalSortSimpleCapitalSpecialChars(str_array44);
    java.util.List list49 = sortApplication5.numericalSortCapitalSpecialChars(str_array44);
    java.lang.String str50 = bcApplication1.not(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication51 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication52 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    java.lang.String str61 = bcApplication53.bracket(str_array59);
    java.util.List list62 = sortApplication52.sortCapitalNumbers(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "" };
    java.lang.String str66 = bcApplication63.bracket(str_array65);
    java.util.List list67 = sortApplication52.numericalSortNumbers(str_array65);
    java.util.List list68 = sortApplication51.sortAll(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication70 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication71 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array73 = new java.lang.String[] { "" };
    java.lang.String str74 = bcApplication71.bracket(str_array73);
    java.util.List list75 = sortApplication70.sortStringsCapital(str_array73);
    java.lang.String str76 = bcApplication69.not(str_array73);
    java.util.List list77 = sortApplication51.sortNumbersSpecialChars(str_array73);
    java.lang.String str78 = bcApplication1.number(str_array73);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str79 = bcApplication0.multiply(str_array73);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "-hi!"+ "'", str13.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "-hi!"+ "'", str20.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "-hi!"+ "'", str24.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "-hi!"+ "'", str34.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "-hi!"+ "'", str41.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "0"+ "'", str50.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ""+ "'", str66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + ""+ "'", str74.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "0"+ "'", str76.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + ""+ "'", str78.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    java.io.InputStream inputStream22 = null;
    java.io.OutputStream outputStream23 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array18, inputStream22, outputStream23);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.lang.String str28 = bcApplication18.calculate("hi!");
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.lang.String str38 = bcApplication18.not(str_array35);
    java.util.List list39 = sortApplication0.numericalSortSimpleNumbersSpecialChars(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication40 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    java.lang.String str50 = bcApplication42.bracket(str_array48);
    java.util.List list51 = sortApplication41.sortStringsSimple(str_array48);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication52 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication53 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array55 = new java.lang.String[] { "hi!" };
    java.lang.String str56 = bcApplication53.negate(str_array55);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    java.lang.String str61 = bcApplication53.bracket(str_array59);
    java.util.List list62 = sortApplication52.sortStringsSimple(str_array59);
    java.util.List list63 = sortApplication41.sortSimpleCapital(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication64 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication65 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array67 = new java.lang.String[] { "hi!" };
    java.lang.String str68 = bcApplication65.negate(str_array67);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array71 = new java.lang.String[] { "hi!" };
    java.lang.String str72 = bcApplication69.negate(str_array71);
    java.lang.String str73 = bcApplication65.bracket(str_array71);
    java.util.List list74 = sortApplication64.sortCapitalNumbers(str_array71);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication75 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array77 = new java.lang.String[] { "hi!" };
    java.lang.String str78 = bcApplication75.negate(str_array77);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication79 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array81 = new java.lang.String[] { "hi!" };
    java.lang.String str82 = bcApplication79.negate(str_array81);
    java.lang.String str83 = bcApplication75.bracket(str_array81);
    java.util.List list84 = sortApplication64.sortSimpleNumbersSpecialChars(str_array81);
    java.util.List list85 = sortApplication41.numericalSortSimpleCapital(str_array81);
    java.lang.String str86 = commApplication40.commOnlyFirst(str_array81);
    java.util.List list87 = sortApplication0.numericalSortSimpleNumbers(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "0"+ "'", str38.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "-hi!"+ "'", str56.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "-hi!"+ "'", str68.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "-hi!"+ "'", str72.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!"+ "'", str73.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "-hi!"+ "'", str78.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + "-hi!"+ "'", str82.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "hi!"+ "'", str83.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str86 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str86.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list87);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    sg.edu.nus.comp.cs4218.impl.app.CalApplication calApplication0 = new sg.edu.nus.comp.cs4218.impl.app.CalApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "" };
    java.lang.String str4 = bcApplication1.bracket(str_array3);
    java.lang.String str6 = bcApplication1.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication7 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication8 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication9 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array11 = new java.lang.String[] { "hi!" };
    java.lang.String str12 = bcApplication9.negate(str_array11);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication13 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array15 = new java.lang.String[] { "hi!" };
    java.lang.String str16 = bcApplication13.negate(str_array15);
    java.lang.String str17 = bcApplication9.bracket(str_array15);
    java.util.List list18 = sortApplication8.sortCapitalNumbers(str_array15);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "" };
    java.lang.String str22 = bcApplication19.bracket(str_array21);
    java.util.List list23 = sortApplication8.numericalSortNumbers(str_array21);
    java.util.List list24 = sortApplication7.sortAll(str_array21);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication26 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "" };
    java.lang.String str30 = bcApplication27.bracket(str_array29);
    java.util.List list31 = sortApplication26.sortStringsCapital(str_array29);
    java.lang.String str32 = bcApplication25.not(str_array29);
    java.util.List list33 = sortApplication7.sortNumbersSpecialChars(str_array29);
    java.lang.String str34 = bcApplication1.bracket(str_array29);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.String str35 = calApplication0.printCalForMonthYear(str_array29);
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NumberFormatException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "-hi!"+ "'", str12.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "-hi!"+ "'", str16.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "0"+ "'", str32.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication18 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication19 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array21 = new java.lang.String[] { "hi!" };
    java.lang.String str22 = bcApplication19.negate(str_array21);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    java.lang.String str27 = bcApplication19.bracket(str_array25);
    java.util.List list28 = sortApplication18.sortStringsSimple(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication29 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "hi!" };
    java.lang.String str33 = bcApplication30.negate(str_array32);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication34 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array36 = new java.lang.String[] { "hi!" };
    java.lang.String str37 = bcApplication34.negate(str_array36);
    java.lang.String str38 = bcApplication30.bracket(str_array36);
    java.util.List list39 = sortApplication29.sortStringsSimple(str_array36);
    java.util.List list40 = sortApplication18.sortSimpleCapital(str_array36);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication41 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication42 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array44 = new java.lang.String[] { "hi!" };
    java.lang.String str45 = bcApplication42.negate(str_array44);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication46 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array48 = new java.lang.String[] { "hi!" };
    java.lang.String str49 = bcApplication46.negate(str_array48);
    java.lang.String str50 = bcApplication42.bracket(str_array48);
    java.util.List list51 = sortApplication41.sortCapitalNumbers(str_array48);
    java.util.List list52 = sortApplication18.numericalSortStringsCapital(str_array48);
    java.util.List list53 = sortApplication0.numericalSortNumbers(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "-hi!"+ "'", str22.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "-hi!"+ "'", str33.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "-hi!"+ "'", str37.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "-hi!"+ "'", str45.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "-hi!"+ "'", str49.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list53);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "" };
    java.lang.String str15 = bcApplication12.bracket(str_array14);
    java.util.List list16 = sortApplication1.numericalSortNumbers(str_array14);
    java.util.List list17 = sortApplication0.sortAll(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication18 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array20 = new java.lang.String[] { "hi!" };
    java.lang.String str21 = bcApplication18.negate(str_array20);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    java.lang.String str26 = bcApplication18.bracket(str_array24);
    java.util.List list27 = sortApplication0.sortNumbers(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication28 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    java.lang.String str37 = bcApplication29.bracket(str_array35);
    java.util.List list38 = sortApplication28.sortCapitalNumbers(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication39 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array41 = new java.lang.String[] { "hi!" };
    java.lang.String str42 = bcApplication39.negate(str_array41);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication43 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array45 = new java.lang.String[] { "hi!" };
    java.lang.String str46 = bcApplication43.negate(str_array45);
    java.lang.String str47 = bcApplication39.bracket(str_array45);
    java.util.List list48 = sortApplication28.sortSimpleNumbersSpecialChars(str_array45);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication49 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication50 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array52 = new java.lang.String[] { "hi!" };
    java.lang.String str53 = bcApplication50.negate(str_array52);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication54 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array56 = new java.lang.String[] { "hi!" };
    java.lang.String str57 = bcApplication54.negate(str_array56);
    java.lang.String str58 = bcApplication50.bracket(str_array56);
    java.util.List list59 = sortApplication49.sortStringsSimple(str_array56);
    java.util.List list60 = sortApplication28.numericalSortSimpleCapitalSpecialChars(str_array56);
    java.util.List list61 = sortApplication0.sortNumbers(str_array56);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication62 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication63 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array65 = new java.lang.String[] { "" };
    java.lang.String str66 = bcApplication63.bracket(str_array65);
    java.util.List list67 = sortApplication62.sortStringsCapital(str_array65);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication68 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication69 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication70 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array72 = new java.lang.String[] { "hi!" };
    java.lang.String str73 = bcApplication70.negate(str_array72);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication74 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array76 = new java.lang.String[] { "hi!" };
    java.lang.String str77 = bcApplication74.negate(str_array76);
    java.lang.String str78 = bcApplication70.bracket(str_array76);
    java.util.List list79 = sortApplication69.sortCapitalNumbers(str_array76);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication80 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array82 = new java.lang.String[] { "hi!" };
    java.lang.String str83 = bcApplication80.negate(str_array82);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication84 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array86 = new java.lang.String[] { "hi!" };
    java.lang.String str87 = bcApplication84.negate(str_array86);
    java.lang.String str88 = bcApplication80.bracket(str_array86);
    java.util.List list89 = sortApplication69.sortSimpleNumbersSpecialChars(str_array86);
    java.util.List list90 = sortApplication68.sortSimpleNumbers(str_array86);
    java.util.List list91 = sortApplication62.numericalSortCapitalNumbersSpecialChars(str_array86);
    java.util.List list92 = sortApplication0.sortCapitalNumbers(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "-hi!"+ "'", str21.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "-hi!"+ "'", str42.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "-hi!"+ "'", str46.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "-hi!"+ "'", str53.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "-hi!"+ "'", str57.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!"+ "'", str58.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ""+ "'", str66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + "-hi!"+ "'", str73.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "-hi!"+ "'", str77.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!"+ "'", str78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "-hi!"+ "'", str83.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str87 + "' != '" + "-hi!"+ "'", str87.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!"+ "'", str88.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list92);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    sg.edu.nus.comp.cs4218.impl.app.TailApplication tailApplication0 = new sg.edu.nus.comp.cs4218.impl.app.TailApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication2 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    java.lang.String[] str_array3 = null;
    java.lang.String str4 = commApplication2.commNoMatches(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "" };
    java.lang.String str8 = bcApplication5.bracket(str_array7);
    java.lang.String str10 = bcApplication5.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication22 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication23 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array25 = new java.lang.String[] { "hi!" };
    java.lang.String str26 = bcApplication23.negate(str_array25);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication27 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array29 = new java.lang.String[] { "hi!" };
    java.lang.String str30 = bcApplication27.negate(str_array29);
    java.lang.String str31 = bcApplication23.bracket(str_array29);
    java.util.List list32 = sortApplication22.sortCapitalNumbers(str_array29);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication22.sortSimpleNumbersSpecialChars(str_array39);
    java.util.List list43 = sortApplication11.numericalSortNumbers(str_array39);
    java.lang.String str44 = bcApplication5.not(str_array39);
    java.lang.String str45 = commApplication2.commOnlySecond(str_array39);
    java.lang.String str46 = bcApplication1.bracket(str_array39);
    java.io.InputStream inputStream47 = null;
    java.io.OutputStream outputStream48 = null;
    // The following exception was thrown during execution in test generation
    try {
      tailApplication0.run(str_array39, inputStream47, outputStream48);
      org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException");
    } catch (sg.edu.nus.comp.cs4218.exception.TailException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("sg.edu.nus.comp.cs4218.exception.TailException")) {
        org.junit.Assert.fail("Expected exception of type sg.edu.nus.comp.cs4218.exception.TailException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "comm: terminated with error message comm: Invalid args"+ "'", str4.equals("comm: terminated with error message comm: Invalid args"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "-hi!"+ "'", str26.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "-hi!"+ "'", str30.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "0"+ "'", str44.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str45.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!"+ "'", str46.equals("hi!"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication1 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array3 = new java.lang.String[] { "hi!" };
    java.lang.String str4 = bcApplication1.negate(str_array3);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication5 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array7 = new java.lang.String[] { "hi!" };
    java.lang.String str8 = bcApplication5.negate(str_array7);
    java.lang.String str9 = bcApplication1.bracket(str_array7);
    java.util.List list10 = sortApplication0.sortStringsSimple(str_array7);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication11 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication11.sortCapitalNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication22 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array24 = new java.lang.String[] { "hi!" };
    java.lang.String str25 = bcApplication22.negate(str_array24);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication26 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array28 = new java.lang.String[] { "hi!" };
    java.lang.String str29 = bcApplication26.negate(str_array28);
    java.lang.String str30 = bcApplication22.bracket(str_array28);
    java.util.List list31 = sortApplication11.sortSimpleNumbersSpecialChars(str_array28);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication32 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication33 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array35 = new java.lang.String[] { "hi!" };
    java.lang.String str36 = bcApplication33.negate(str_array35);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    java.lang.String str41 = bcApplication33.bracket(str_array39);
    java.util.List list42 = sortApplication32.sortStringsSimple(str_array39);
    java.util.List list43 = sortApplication11.numericalSortSimpleCapitalSpecialChars(str_array39);
    java.util.List list44 = sortApplication0.numericalSortCapitalSpecialChars(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication45 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication46 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication47 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array49 = new java.lang.String[] { "hi!" };
    java.lang.String str50 = bcApplication47.negate(str_array49);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication51 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array53 = new java.lang.String[] { "hi!" };
    java.lang.String str54 = bcApplication51.negate(str_array53);
    java.lang.String str55 = bcApplication47.bracket(str_array53);
    java.util.List list56 = sortApplication46.sortCapitalNumbers(str_array53);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication57 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array59 = new java.lang.String[] { "hi!" };
    java.lang.String str60 = bcApplication57.negate(str_array59);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication61 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array63 = new java.lang.String[] { "hi!" };
    java.lang.String str64 = bcApplication61.negate(str_array63);
    java.lang.String str65 = bcApplication57.bracket(str_array63);
    java.util.List list66 = sortApplication46.sortSimpleNumbersSpecialChars(str_array63);
    java.util.List list67 = sortApplication45.sortSimpleNumbers(str_array63);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication68 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication69 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array71 = new java.lang.String[] { "" };
    java.lang.String str72 = bcApplication69.bracket(str_array71);
    java.util.List list73 = sortApplication68.sortStringsCapital(str_array71);
    java.util.List list74 = sortApplication45.sortSpecialChars(str_array71);
    java.util.List list75 = sortApplication0.sortAll(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "-hi!"+ "'", str4.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-hi!"+ "'", str8.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "-hi!"+ "'", str25.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "-hi!"+ "'", str29.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "-hi!"+ "'", str36.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "-hi!"+ "'", str50.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "-hi!"+ "'", str54.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "-hi!"+ "'", str60.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "-hi!"+ "'", str64.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "hi!"+ "'", str65.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + ""+ "'", str72.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list75);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    java.util.List list22 = sortApplication0.sortSimpleNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.CommApplication commApplication23 = new sg.edu.nus.comp.cs4218.impl.app.CommApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication24 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication25 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array27 = new java.lang.String[] { "hi!" };
    java.lang.String str28 = bcApplication25.negate(str_array27);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication29 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array31 = new java.lang.String[] { "hi!" };
    java.lang.String str32 = bcApplication29.negate(str_array31);
    java.lang.String str33 = bcApplication25.bracket(str_array31);
    java.util.List list34 = sortApplication24.sortStringsSimple(str_array31);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication35 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication36 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array38 = new java.lang.String[] { "hi!" };
    java.lang.String str39 = bcApplication36.negate(str_array38);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication40 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array42 = new java.lang.String[] { "hi!" };
    java.lang.String str43 = bcApplication40.negate(str_array42);
    java.lang.String str44 = bcApplication36.bracket(str_array42);
    java.util.List list45 = sortApplication35.sortStringsSimple(str_array42);
    java.util.List list46 = sortApplication24.sortSimpleCapital(str_array42);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication47 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    java.lang.String str56 = bcApplication48.bracket(str_array54);
    java.util.List list57 = sortApplication47.sortCapitalNumbers(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication47.sortSimpleNumbersSpecialChars(str_array64);
    java.util.List list68 = sortApplication24.numericalSortSimpleCapital(str_array64);
    java.lang.String str69 = commApplication23.commOnlyFirst(str_array64);
    java.util.List list70 = sortApplication0.numericalSortStringsSimple(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "-hi!"+ "'", str28.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "-hi!"+ "'", str32.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "-hi!"+ "'", str39.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "-hi!"+ "'", str43.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "comm: terminated with error message comm: File not found"+ "'", str69.equals("comm: terminated with error message comm: File not found"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication0 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication1 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication2 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array4 = new java.lang.String[] { "hi!" };
    java.lang.String str5 = bcApplication2.negate(str_array4);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication6 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array8 = new java.lang.String[] { "hi!" };
    java.lang.String str9 = bcApplication6.negate(str_array8);
    java.lang.String str10 = bcApplication2.bracket(str_array8);
    java.util.List list11 = sortApplication1.sortCapitalNumbers(str_array8);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication12 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array14 = new java.lang.String[] { "hi!" };
    java.lang.String str15 = bcApplication12.negate(str_array14);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication16 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array18 = new java.lang.String[] { "hi!" };
    java.lang.String str19 = bcApplication16.negate(str_array18);
    java.lang.String str20 = bcApplication12.bracket(str_array18);
    java.util.List list21 = sortApplication1.sortSimpleNumbersSpecialChars(str_array18);
    java.util.List list22 = sortApplication0.sortSimpleNumbers(str_array18);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication23 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication24 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array26 = new java.lang.String[] { "" };
    java.lang.String str27 = bcApplication24.bracket(str_array26);
    java.util.List list28 = sortApplication23.sortStringsCapital(str_array26);
    java.util.List list29 = sortApplication0.sortSpecialChars(str_array26);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication30 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array32 = new java.lang.String[] { "" };
    java.lang.String str33 = bcApplication30.bracket(str_array32);
    java.lang.String str35 = bcApplication30.calculate("");
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication36 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication37 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array39 = new java.lang.String[] { "hi!" };
    java.lang.String str40 = bcApplication37.negate(str_array39);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication41 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array43 = new java.lang.String[] { "hi!" };
    java.lang.String str44 = bcApplication41.negate(str_array43);
    java.lang.String str45 = bcApplication37.bracket(str_array43);
    java.util.List list46 = sortApplication36.sortCapitalNumbers(str_array43);
    sg.edu.nus.comp.cs4218.impl.app.SortApplication sortApplication47 = new sg.edu.nus.comp.cs4218.impl.app.SortApplication();
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication48 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array50 = new java.lang.String[] { "hi!" };
    java.lang.String str51 = bcApplication48.negate(str_array50);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication52 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array54 = new java.lang.String[] { "hi!" };
    java.lang.String str55 = bcApplication52.negate(str_array54);
    java.lang.String str56 = bcApplication48.bracket(str_array54);
    java.util.List list57 = sortApplication47.sortCapitalNumbers(str_array54);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication58 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array60 = new java.lang.String[] { "hi!" };
    java.lang.String str61 = bcApplication58.negate(str_array60);
    sg.edu.nus.comp.cs4218.impl.app.BcApplication bcApplication62 = new sg.edu.nus.comp.cs4218.impl.app.BcApplication();
    java.lang.String[] str_array64 = new java.lang.String[] { "hi!" };
    java.lang.String str65 = bcApplication62.negate(str_array64);
    java.lang.String str66 = bcApplication58.bracket(str_array64);
    java.util.List list67 = sortApplication47.sortSimpleNumbersSpecialChars(str_array64);
    java.util.List list68 = sortApplication36.numericalSortNumbers(str_array64);
    java.lang.String str69 = bcApplication30.not(str_array64);
    java.util.List list70 = sortApplication0.numericalSortStringsSimple(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "-hi!"+ "'", str5.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "-hi!"+ "'", str9.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "-hi!"+ "'", str15.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "-hi!"+ "'", str19.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "-hi!"+ "'", str40.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "-hi!"+ "'", str44.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "-hi!"+ "'", str51.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "-hi!"+ "'", str55.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "-hi!"+ "'", str61.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + "-hi!"+ "'", str65.equals("-hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!"+ "'", str66.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + "0"+ "'", str69.equals("0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list70);

  }

}
