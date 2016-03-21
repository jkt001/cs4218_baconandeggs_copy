package sg.edu.nus.comp.cs4218.impl.app;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalApplicationTest.class,
	CatApplicationTest.class,
	CommApplicationTest.class,
	DateApplicationTest.class,
	EchoApplicationTest.class,
	FmtApplicationTest.class,
	GivenBcApplicationTest.class,
	GivenCommApplicationTest.class,
	HeadApplicationTest.class,
	SortApplicationTest.class,
	TailApplicationTest.class,
})
public class ApplicationTestSuite {
}
