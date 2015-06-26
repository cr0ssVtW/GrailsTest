import grails.test.AbstractCliTestCase

class DashboardTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testDashboard() {

        execute(["dashboard"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
