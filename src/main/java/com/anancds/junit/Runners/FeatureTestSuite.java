package com.anancds.junit.Runners;

import com.anancds.junit.Assert.AssertTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
//        TestFeatureLogin.class,
//        TestFeatureLogout.class,
//        TestFeatureNavigate.class,
//        TestFeatureUpdate.class
        AssertTests.class
})
public class FeatureTestSuite {
}
