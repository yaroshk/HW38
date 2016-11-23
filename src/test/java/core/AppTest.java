package core;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass

	public static void beforeClass() throws Exception {
	       System.out.println("BeforeClass method will be executed before first test method starts");}

	@AfterClass

	 public static void afterClass() throws Exception {
	       System.out.println("AfterClass method will be executed after last test method completed");}


	@Before

	 public void beforeMethod() throws Exception {
	       System.out.println("Before method will execute before every test method");}

	@After

	 public void afterMethod() throws Exception {
	       System.out.println("After method will execute after every test method");}

	@Test  //@Ignore

	 public void test_01_AssertEquals_Positive() {
	       System.out.println("Test_01_assertEquals_Positive");}

	@Test // @Ignore

	 public void test_02_AssertEquals_Negative() {
	       System.out.println("Test_02_assertEquals_Negative");}

	@Test @Ignore

	 public void test_03_AssertEquals_Ignored() {
	       System.out.println("Test_03_assertEquals_Ignored");}


	@Test // @Ignore

     public void test_04_AssertSame_Positive() {
	       System.out.println("Test_04_AssertSame_Positive");}

	@Test // @Ignore

	 public void test_05_AssertSame_Negative() {
	       System.out.println("Test_05_AssertSame_Negative");}

	@Test  @Ignore

	 public void test_06_AssertSame_Ignored() {
	       System.out.println("Test_06_AssertSame_Ignored");}

	@Test // @Ignore
	
	 public void test_07_AssertFalse_Positive() {
	       System.out.println("Test_07_assertFalse_Positive");}

	@Test // @Ignore

     public void test_08_AssertFalse_Negative() {
	       System.out.println("Test_08_assertFalse_Negative");}


	@Test // @Ignore
	
	 public void test_09_AssertTrue_Positive() {
	       System.out.println("Test_09_assertTrue_Positive");}

	@Test // @Ignore

	 public void test_10_AssertTrue_Negative() {
	       System.out.println("Test_10_assertTrue_Negative");}
	}