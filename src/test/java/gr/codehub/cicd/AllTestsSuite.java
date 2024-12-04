package gr.codehub.cicd;


import gr.codehub.cicd.bootstrap.SampleLoadTest;
import gr.codehub.cicd.model.EmployeeTest;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({
//        SampleLoadTest.class,
//        EmployeeTest.class,
//
//})
@SelectPackages("gr.codehub.cicd")
@IncludeClassNamePatterns(".*Test")
public class AllTestsSuite {
}
